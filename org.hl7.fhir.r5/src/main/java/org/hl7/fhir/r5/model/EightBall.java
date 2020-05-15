package org.hl7.fhir.r5.model;


/*
 * #%L
 * org.hl7.fhir.r5
 * %%
 * Copyright (C) 2014 - 2019 Health Level 7
 * %%
 * Licensed under the Apache License, Version 2.0 (the \"License\");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an \"AS IS\" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

/*
  Copyright (c) 2011+, HL7, Inc.
  All rights reserved.
  
  Redistribution and use in source and binary forms, with or without modification, \
  are permitted provided that the following conditions are met:
  
   * Redistributions of source code must retain the above copyright notice, this \
     list of conditions and the following disclaimer.
   * Redistributions in binary form must reproduce the above copyright notice, \
     this list of conditions and the following disclaimer in the documentation \
     and/or other materials provided with the distribution.
   * Neither the name of HL7 nor the names of its contributors may be used to 
     endorse or promote products derived from this software without specific 
     prior written permission.
  
  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS \"AS IS\" AND \
  ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED \
  WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. \
  IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, \
  INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT \
  NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR \
  PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, \
  WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) \
  ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE \
  POSSIBILITY OF SUCH DAMAGE.
  */

// Generated on Thu, May 14, 2020 20:27-0400 for FHIR vcurrent

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.r5.model.Enumerations.*;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.instance.model.api.ICompositeType;
import ca.uhn.fhir.model.api.annotation.ResourceDef;
import ca.uhn.fhir.model.api.annotation.SearchParamDefinition;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import ca.uhn.fhir.model.api.annotation.Child;
import ca.uhn.fhir.model.api.annotation.ChildOrder;
import ca.uhn.fhir.model.api.annotation.Description;
import ca.uhn.fhir.model.api.annotation.Block;

/**
 * The answer to a question in EightBall.
 */
@ResourceDef(name="EightBall", profile="http://hl7.org/fhir/StructureDefinition/EightBall")
public class EightBall extends DomainResource {

    /**
     * The question that was posed.
     */
    @Child(name = "question", type = {StringType.class}, order=0, min=1, max=1, modifier=false, summary=true)
    @Description(shortDefinition="The question", formalDefinition="The question that was posed." )
    protected StringType question;

    /**
     * Indicates whether the account is presently used/usable or not.
     */
    @Child(name = "answer", type = {CodeableConcept.class}, order=1, min=1, max=1, modifier=false, summary=true)
    @Description(shortDefinition="Y | P1 | P2 | P3 | P4 | P5 | P6 | P7 | P8 | P9 | P10 | N | N1 | N2 | N3 | N4 | N5 | U | U1 | U2 | U3 | U4 | U5", formalDefinition="Indicates whether the account is presently used/usable or not." )
    @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/eightball")
    protected CodeableConcept answer;

    private static final long serialVersionUID = -926539942L;

  /**
   * Constructor
   */
    public EightBall() {
      super();
    }

  /**
   * Constructor
   */
    public EightBall(String question, CodeableConcept answer) {
      super();
      this.setQuestion(question);
      this.setAnswer(answer);
    }

    /**
     * @return {@link #question} (The question that was posed.). This is the underlying object with id, value and extensions. The accessor "getQuestion" gives direct access to the value
     */
    public StringType getQuestionElement() { 
      if (this.question == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create EightBall.question");
        else if (Configuration.doAutoCreate())
          this.question = new StringType(); // bb
      return this.question;
    }

    public boolean hasQuestionElement() { 
      return this.question != null && !this.question.isEmpty();
    }

    public boolean hasQuestion() { 
      return this.question != null && !this.question.isEmpty();
    }

    /**
     * @param value {@link #question} (The question that was posed.). This is the underlying object with id, value and extensions. The accessor "getQuestion" gives direct access to the value
     */
    public EightBall setQuestionElement(StringType value) { 
      this.question = value;
      return this;
    }

    /**
     * @return The question that was posed.
     */
    public String getQuestion() { 
      return this.question == null ? null : this.question.getValue();
    }

    /**
     * @param value The question that was posed.
     */
    public EightBall setQuestion(String value) { 
        if (this.question == null)
          this.question = new StringType();
        this.question.setValue(value);
      return this;
    }

    /**
     * @return {@link #answer} (Indicates whether the account is presently used/usable or not.)
     */
    public CodeableConcept getAnswer() { 
      if (this.answer == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create EightBall.answer");
        else if (Configuration.doAutoCreate())
          this.answer = new CodeableConcept(); // cc
      return this.answer;
    }

    public boolean hasAnswer() { 
      return this.answer != null && !this.answer.isEmpty();
    }

    /**
     * @param value {@link #answer} (Indicates whether the account is presently used/usable or not.)
     */
    public EightBall setAnswer(CodeableConcept value) { 
      this.answer = value;
      return this;
    }

      protected void listChildren(List<Property> children) {
        super.listChildren(children);
        children.add(new Property("question", "string", "The question that was posed.", 0, 1, question));
        children.add(new Property("answer", "CodeableConcept", "Indicates whether the account is presently used/usable or not.", 0, 1, answer));
      }

      @Override
      public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
        switch (_hash) {
        case -1165870106: /*question*/  return new Property("question", "string", "The question that was posed.", 0, 1, question);
        case -1412808770: /*answer*/  return new Property("answer", "CodeableConcept", "Indicates whether the account is presently used/usable or not.", 0, 1, answer);
        default: return super.getNamedProperty(_hash, _name, _checkValid);
        }

      }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case -1165870106: /*question*/ return this.question == null ? new Base[0] : new Base[] {this.question}; // StringType
        case -1412808770: /*answer*/ return this.answer == null ? new Base[0] : new Base[] {this.answer}; // CodeableConcept
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public Base setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case -1165870106: // question
          this.question = TypeConvertor.castToString(value); // StringType
          return value;
        case -1412808770: // answer
          this.answer = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
          return value;
        default: return super.setProperty(hash, name, value);
        }

      }

      @Override
      public Base setProperty(String name, Base value) throws FHIRException {
        if (name.equals("question")) {
          this.question = TypeConvertor.castToString(value); // StringType
        } else if (name.equals("answer")) {
          this.answer = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
        } else
          return super.setProperty(name, value);
        return value;
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case -1165870106:  return getQuestionElement();
        case -1412808770:  return getAnswer();
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case -1165870106: /*question*/ return new String[] {"string"};
        case -1412808770: /*answer*/ return new String[] {"CodeableConcept"};
        default: return super.getTypesForProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("question")) {
          throw new FHIRException("Cannot call addChild on a primitive type EightBall.question");
        }
        else if (name.equals("answer")) {
          this.answer = new CodeableConcept();
          return this.answer;
        }
        else
          return super.addChild(name);
      }

  public String fhirType() {
    return "EightBall";

  }

      public EightBall copy() {
        EightBall dst = new EightBall();
        copyValues(dst);
        return dst;
      }

      public void copyValues(EightBall dst) {
        super.copyValues(dst);
        dst.question = question == null ? null : question.copy();
        dst.answer = answer == null ? null : answer.copy();
      }

      protected EightBall typedCopy() {
        return copy();
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof EightBall))
          return false;
        EightBall o = (EightBall) other_;
        return compareDeep(question, o.question, true) && compareDeep(answer, o.answer, true);
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof EightBall))
          return false;
        EightBall o = (EightBall) other_;
        return compareValues(question, o.question, true);
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(question, answer);
      }

  @Override
  public ResourceType getResourceType() {
    return ResourceType.EightBall;
   }

 /**
   * Search parameter: <b>answer</b>
   * <p>
   * Description: <b>Y | P1 | P2 | P3 | P4 | P5 | P6 | P7 | P8 | P9 | P10 | N | N1 | N2 | N3 | N4 | N5 | U | U1 | U2 | U3 | U4 | U5</b><br>
   * Type: <b>token</b><br>
   * Path: <b>EightBall.answer</b><br>
   * </p>
   */
  @SearchParamDefinition(name="answer", path="EightBall.answer", description="Y | P1 | P2 | P3 | P4 | P5 | P6 | P7 | P8 | P9 | P10 | N | N1 | N2 | N3 | N4 | N5 | U | U1 | U2 | U3 | U4 | U5", type="token" )
  public static final String SP_ANSWER = "answer";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>answer</b>
   * <p>
   * Description: <b>Y | P1 | P2 | P3 | P4 | P5 | P6 | P7 | P8 | P9 | P10 | N | N1 | N2 | N3 | N4 | N5 | U | U1 | U2 | U3 | U4 | U5</b><br>
   * Type: <b>token</b><br>
   * Path: <b>EightBall.answer</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam ANSWER = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_ANSWER);

 /**
   * Search parameter: <b>question</b>
   * <p>
   * Description: <b>The question</b><br>
   * Type: <b>string</b><br>
   * Path: <b>EightBall.question</b><br>
   * </p>
   */
  @SearchParamDefinition(name="question", path="EightBall.question", description="The question", type="string" )
  public static final String SP_QUESTION = "question";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>question</b>
   * <p>
   * Description: <b>The question</b><br>
   * Type: <b>string</b><br>
   * Path: <b>EightBall.question</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.StringClientParam QUESTION = new ca.uhn.fhir.rest.gclient.StringClientParam(SP_QUESTION);


}

