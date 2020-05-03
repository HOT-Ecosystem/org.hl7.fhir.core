package org.hl7.fhir.core.generator.analysis;

import java.util.ArrayList;
import java.util.List;

import org.hl7.fhir.core.generator.codegen.Configuration;
import org.hl7.fhir.core.generator.engine.Definitions;
import org.hl7.fhir.r5.conformance.ProfileUtilities;
import org.hl7.fhir.r5.model.CodeType;
import org.hl7.fhir.r5.model.ElementDefinition;
import org.hl7.fhir.r5.model.SearchParameter;
import org.hl7.fhir.r5.model.StructureDefinition;
import org.hl7.fhir.r5.model.ValueSet;
import org.hl7.fhir.r5.model.ElementDefinition.ElementDefinitionBindingComponent;
import org.hl7.fhir.r5.model.ElementDefinition.TypeRefComponent;
import org.hl7.fhir.r5.model.Enumeration;
import org.hl7.fhir.r5.model.Enumerations.BindingStrength;
import org.hl7.fhir.r5.model.Enumerations.ResourceTypeEnum;
import org.hl7.fhir.r5.model.StructureDefinition.StructureDefinitionKind;
import org.hl7.fhir.r5.model.ValueSet.ConceptSetComponent;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.utilities.i18n.I18nConstants;

public class Analyser {

  private Definitions definitions;
  private Configuration config;

  public Analyser(Definitions definitions, Configuration config) {
    this.definitions = definitions;
    this.config = config;
  }

  public Analysis analyse(StructureDefinition sd) throws Exception {
    Analysis res = new Analysis(definitions, sd);

    res.setAncestor(definitions.getStructures().get(sd.getBaseDefinition()));
    res.setAbstract(sd.getAbstract());
    res.setInterface(sd.hasExtension("http://hl7.org/fhir/StructureDefinition/structuredefinition-interface"));
    res.setClassName(sd.getName().equals("List") ? "ListResource" : sd.getName());
    
    TypeInfo type = new TypeInfo();
    type.setName(res.getClassName());
    type.setAncestorName(res.getAncestor().getName());
    res.getTypes().put(type.getName(), type);
    res.setRootType(type);
    sd.setUserData("java.type.info", type);
    
    type.setDefn(sd.getSnapshot().getElementFirstRep());
    type.setChildren(filterChildren(this.getChildList(sd, type.getDefn())));
    type.setInheritedChildren(getAbstractChildren(res.getAncestor()));
    
    for (ElementDefinition e : type.getChildren()) {
      scanNestedTypes(res, type, type.getName(), e);
    }
    
    if (sd.getKind() == StructureDefinitionKind.RESOURCE) {
      res.setSearchParams(getSearchParams(sd.getName()));
    }

    for (ElementDefinition e : type.getChildren()) {
      String nn = e.getUserString("java.type");
      if (nn.startsWith("@")) {
        ElementDefinition er = getElementForPath(sd, nn.substring(1));
        if (!er.hasUserData("java.type")) {
          throw new Exception("not found: "+er); 
        }
        String nnn = er.getUserString("java.type");
        e.setUserData("java.type", nnn);
        e.setUserData("java.type.info", er.getUserData("java.type.info"));
      }
    }
    return res;
  }
  
  protected List<ElementDefinition> filterChildren(List<ElementDefinition> childList) {
    List<ElementDefinition> res = new ArrayList<>();
    res.addAll(childList);
    List<ElementDefinition> r = new ArrayList<>();
    for (ElementDefinition t : childList) {
      if (!t.getPath().equals(t.getBase().getPath())) {
        r.add(t);
      }
    }
    res.removeAll(r);
    return res;
  }

  private List<ElementDefinition> getAbstractChildren(StructureDefinition structure) {
    if (!structure.hasExtension("http://hl7.org/fhir/StructureDefinition/structuredefinition-interface")) {
      return new ArrayList<>();
    }
    List<ElementDefinition> res = new ArrayList<>();
    StructureDefinition sdb = definitions.getStructures().get(structure.getBaseDefinition());
    res.addAll(getAbstractChildren(sdb));
    res.addAll(filterChildren(this.getChildList(structure, structure.getSnapshot().getElementFirstRep())));
    return res;
  }

  public List<ElementDefinition> getChildList(StructureDefinition structure, ElementDefinition element) {
    return getChildList(structure, element.getPath(), element.getId(), false);
  }

  public List<ElementDefinition> getChildList(StructureDefinition profile, String path, String id, boolean diff) {
    List<ElementDefinition> res = new ArrayList<ElementDefinition>();

    boolean capturing = id==null;
    if (id==null && !path.contains("."))
      capturing = true;

    List<ElementDefinition> list = diff ? profile.getDifferential().getElement() : profile.getSnapshot().getElement();
    for (ElementDefinition e : list) {
      if (e == null)
        //throw new Exception(I18nConstants.ELEMENT__NULL_ + profile.getUrl());
        System.err.println(I18nConstants.ELEMENT__NULL_ + profile.getUrl());
      if (e.getId() == null)
        //throw new Error(context.formatMessage(I18nConstants.ELEMENT_ID__NULL__ON_, e.toString(), profile.getUrl()));
        System.err.println(I18nConstants.ELEMENT_ID__NULL__ON_ + e.toString() + profile.getUrl());
      if (!capturing && id!=null && e.getId().equals(id)) {
        capturing = true;
      }

      // If our element is a slice, stop capturing children as soon as we see the next slice
      if (capturing && e.hasId() && id!= null && !e.getId().equals(id) && e.getPath().equals(path))
        break;

      if (capturing) {
        String p = e.getPath();

        if (!Utilities.noString(e.getContentReference()) && path.startsWith(p)) {
          if (path.length() > p.length())
            return getChildList(profile, e.getContentReference()+"."+path.substring(p.length()+1), null, diff);
          else
            return getChildList(profile, e.getContentReference(), null, diff);

        } else if (p.startsWith(path+".") && !p.equals(path)) {
          String tail = p.substring(path.length()+1);
          if (!tail.contains(".")) {
            res.add(e);
          }
        }
      }
    }

    return res;
  }

  private void scanNestedTypes(Analysis analysis, TypeInfo type, String path, ElementDefinition e) throws Exception {
    String tn = null;
    if (e.typeSummary().equals("code") && e.hasBinding()) {
      ElementDefinitionBindingComponent cd = e.getBinding();
      if (isEnum(cd)) {
        ValueSet vs = definitions.getValuesets().get(cd.getValueSet());   
        if (vs != null) {
          tn = getCodeListType(vs.getName());
          EnumInfo ei = analysis.getEnums().get(tn);
          if (ei == null) {
            ei = new EnumInfo(tn);
            analysis.getEnums().put(tn,  ei);
            ei.setValueSet(vs);
          }
          e.setUserData("java.type", "Enumeration<"+tn+">");
          e.setUserData("java.enum", ei);
        }
      }
    }
    
    if (tn == null) {
      if (e.getType().size() > 0 && !e.hasContentReference() && (!Utilities.existsInList(e.getType().get(0).getCode(), "Element", "BackboneElement"))) {
        tn = getTypeName(e);
        if (e.typeSummary().equals("xml:lang"))
          tn = "CodeType";
        if (e.typeSummary().equals("xhtml")) 
          tn = "XhtmlNode";
        else if (e.getType().size() > 1)
          tn ="DataType";
        else if (definitions.hasPrimitiveType(tn))
          tn = upFirst(tn)+"Type";
        e.setUserData("java.type", tn);
      } else {
        if (e.hasContentReference()) {
          ElementDefinition er = getElementForPath(analysis.getStructure(), e.getContentReference().substring(1));
          tn = er.getUserString("java.type");
          if (Utilities.noString(tn)) {
            e.setUserData("java.type", "@"+er.getPath()); // have to resolve this later
          } else {
            e.setUserData("java.type", tn);
          }
        } else {
          String cpath;
          if (e.hasExtension("http://hl7.org/fhir/StructureDefinition/structuredefinition-explicit-type-name")) { 
            tn = upFirst(e.getExtensionString("http://hl7.org/fhir/StructureDefinition/structuredefinition-explicit-type-name"))+"Component";
            cpath = e.getExtensionString("http://hl7.org/fhir/StructureDefinition/structuredefinition-explicit-type-name");
          } else if (config.getIni().hasProperty("typenames", e.getPath())) {
            tn = upFirst(config.getIni().getStringProperty("typenames", e.getPath()))+"Component";
            cpath = config.getIni().getStringProperty("typenames", e.getPath());
          } else {
            tn = path+upFirst(getTitle(e.getName()))+"Component";
            cpath = path+getTitle(e.getName());
          }
          if (tn.equals("Element"))
            tn = "Element_";
          if (analysis.getTypes().containsKey(tn)) {
            char i = 'A';
            while (analysis.getTypes().containsKey(tn+i)) {
              i++;
            }
            tn = tn + i;
          }
          e.setUserData("java.type", tn);

          tn = upFirst(tn);
          
          TypeInfo ctype = new TypeInfo();
          ctype.setName(tn);
          analysis.getTypes().put(ctype.getName(), ctype);
          analysis.getTypeList().add(ctype);          
          ctype.setDefn(e);
          ctype.setAncestorName(e.typeSummary());
          ctype.setChildren(filterChildren(this.getChildList(analysis.getStructure(), ctype.getDefn())));
          
          for (ElementDefinition c : ctype.getChildren()) {
            scanNestedTypes(analysis, ctype, cpath, c);
          }
        }
      }
    }
  }

  protected boolean isEnum(ElementDefinitionBindingComponent cd) {
    boolean ok = cd != null && cd.getStrength() == BindingStrength.REQUIRED;
    if (ok) {
      if (cd.getValueSet() != null) {
        ValueSet vs = definitions.getValuesets().get(cd.getValueSet()); 
        if (vs != null && vs.hasCompose() && vs.getCompose().getInclude().size() == 1) {
          ConceptSetComponent inc = vs.getCompose().getIncludeFirstRep();
          if (inc.hasSystem() && !inc.hasFilter() && !inc.hasConcept() && !(inc.getSystem().startsWith("http://hl7.org/fhir") || inc.getSystem().startsWith("http://terminology.hl7.org")))
            ok = false;
        }
        if (config.getIni().getBooleanProperty("no-enum", vs.getUrl())) {
          ok = false;
        }
      }
    }
    return ok;
  }
  
  protected String getCodeListType(String binding) {
    StringBuilder b = new StringBuilder();
    boolean up = true;
    for (char ch: binding.toCharArray()) {
      if (ch == '-' || ch == ' ' || ch == '.')
        up = true;
      else if (up) {
        b.append(Character.toUpperCase(ch));
        up = false;
      }
      else        
        b.append(ch);
    }
    return "ResourceType".equals(b.toString()) ? "ResourceTypeEnum" : b.toString();
  }
  
  protected String getTypeName(ElementDefinition e) throws Exception {
    if (e.getType().size() > 1) {
      return "DataType";
    } else if (e.getType().size() == 0) {
      throw new Exception("not supported");
    } else {
      return getTypename(e.getType().get(0));
    }
  }

  protected String getTypename(TypeRefComponent type) throws Exception {
    if (type.hasExtension("http://hl7.org/fhir/StructureDefinition/structuredefinition-fhir-type")) {
      return type.getExtensionString("http://hl7.org/fhir/StructureDefinition/structuredefinition-fhir-type");
    } else {
      return getTypeName(type.getCode());
    }
  }

  protected String getTypeName(String tn) {
    if (tn.equals("string")) {
      return "StringType";
    } else if (tn.equals("Any")) {
      return "Reference";
    } else if (tn.equals("SimpleQuantity")) {
      return "Quantity";
    } else if (isPrimitive(tn)) {
      return getTitle(tn)+"Type";
    } else {
      return getTitle(tn);
    }
  }
  
  protected String getTitle(String name) {
    return Utilities.noString(name) ? "Value" : name.substring(0, 1).toUpperCase()+ name.substring(1);
  }

  protected boolean isPrimitive(String name) {
    return definitions.getStructures().has(typeNs(name)) && definitions.getStructures().get(typeNs(name)).getKind() == StructureDefinitionKind.PRIMITIVETYPE;
  }

  private String upFirst(String name) {
    return name.substring(0,1).toUpperCase()+name.substring(1);
  }
  private String typeNs(String name) {
    return "http://hl7.org/fhir/StructureDefinition/"+name;
  }
  private ElementDefinition getElementForPath(StructureDefinition structure, String pathname) throws Exception {
    String[] path = pathname.split("\\.");
    if (!path[0].equals(structure.getName()))
      throw new Exception("Element Path '"+pathname+"' is not legal in this context");
    ElementDefinition res = null;
    for (ElementDefinition t : structure.getSnapshot().getElement()) {
      if (t.getPath().equals(pathname)) {
        res = t;
      }
    }
    if (res == null) {
      throw new Exception("unable to resolve "+pathname);
    }

    return res;

  }


  private List<SearchParameter> getSearchParams(String name) {
    List<SearchParameter> res = new ArrayList<>();
    if (!Utilities.existsInList(name, "Resource")) {
      for (SearchParameter sp : definitions.getSearchParams().getList()) {
        boolean relevant = false;
        for (CodeType c : sp.getBase()) {
          if (c.getValue().equals(name)) {
            relevant = true;
            break;
          }
        }
        if (relevant) {
          res.add(sp);
        }
      }
    }
    return res;
  }


}