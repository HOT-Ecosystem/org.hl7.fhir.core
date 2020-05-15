package org.hl7.fhir.r5.model;




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

// Generated on Mon, May 11, 2020 09:58+1000 for FHIR vcurrent

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
 * A set of healthcare-related information that is assembled together into a single logical package that provides a single coherent statement of meaning, establishes its own context and that has clinical attestation with regard to who is making the statement. A Composition defines the structure and narrative content necessary for a document. However, a Composition alone does not constitute a document. Rather, the Composition must be the first entry in a Bundle where Bundle.type=document, and any other resources referenced from Composition must be included as subsequent entries in the Bundle (for example Patient, Practitioner, Encounter, etc.).
 */
@ResourceDef(name="Composition", profile="http://hl7.org/fhir/StructureDefinition/Composition")
public class Composition extends DomainResource {

    public enum CompositionAttestationMode {
        /**
         * The person authenticated the content in their personal capacity.
         */
        PERSONAL, 
        /**
         * The person authenticated the content in their professional capacity.
         */
        PROFESSIONAL, 
        /**
         * The person authenticated the content and accepted legal responsibility for its content.
         */
        LEGAL, 
        /**
         * The organization authenticated the content as consistent with their policies and procedures.
         */
        OFFICIAL, 
        /**
         * added to help the parsers with the generic types
         */
        NULL;
        public static CompositionAttestationMode fromCode(String codeString) throws FHIRException {
            if (codeString == null || "".equals(codeString))
                return null;
        if ("personal".equals(codeString))
          return PERSONAL;
        if ("professional".equals(codeString))
          return PROFESSIONAL;
        if ("legal".equals(codeString))
          return LEGAL;
        if ("official".equals(codeString))
          return OFFICIAL;
        if (Configuration.isAcceptInvalidEnums())
          return null;
        else
          throw new FHIRException("Unknown CompositionAttestationMode code '"+codeString+"'");
        }
        public String toCode() {
          switch (this) {
            case PERSONAL: return "personal";
            case PROFESSIONAL: return "professional";
            case LEGAL: return "legal";
            case OFFICIAL: return "official";
            default: return "?";
          }
        }
        public String getSystem() {
          switch (this) {
            case PERSONAL: return "http://hl7.org/fhir/composition-attestation-mode";
            case PROFESSIONAL: return "http://hl7.org/fhir/composition-attestation-mode";
            case LEGAL: return "http://hl7.org/fhir/composition-attestation-mode";
            case OFFICIAL: return "http://hl7.org/fhir/composition-attestation-mode";
            default: return "?";
          }
        }
        public String getDefinition() {
          switch (this) {
            case PERSONAL: return "The person authenticated the content in their personal capacity.";
            case PROFESSIONAL: return "The person authenticated the content in their professional capacity.";
            case LEGAL: return "The person authenticated the content and accepted legal responsibility for its content.";
            case OFFICIAL: return "The organization authenticated the content as consistent with their policies and procedures.";
            default: return "?";
          }
        }
        public String getDisplay() {
          switch (this) {
            case PERSONAL: return "Personal";
            case PROFESSIONAL: return "Professional";
            case LEGAL: return "Legal";
            case OFFICIAL: return "Official";
            default: return "?";
          }
        }
    }

  public static class CompositionAttestationModeEnumFactory implements EnumFactory<CompositionAttestationMode> {
    public CompositionAttestationMode fromCode(String codeString) throws IllegalArgumentException {
      if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("personal".equals(codeString))
          return CompositionAttestationMode.PERSONAL;
        if ("professional".equals(codeString))
          return CompositionAttestationMode.PROFESSIONAL;
        if ("legal".equals(codeString))
          return CompositionAttestationMode.LEGAL;
        if ("official".equals(codeString))
          return CompositionAttestationMode.OFFICIAL;
        throw new IllegalArgumentException("Unknown CompositionAttestationMode code '"+codeString+"'");
        }
        public Enumeration<CompositionAttestationMode> fromType(Base code) throws FHIRException {
          if (code == null)
            return null;
          if (code.isEmpty())
            return new Enumeration<CompositionAttestationMode>(this);
          String codeString = ((PrimitiveType) code).asStringValue();
          if (codeString == null || "".equals(codeString))
            return null;
        if ("personal".equals(codeString))
          return new Enumeration<CompositionAttestationMode>(this, CompositionAttestationMode.PERSONAL);
        if ("professional".equals(codeString))
          return new Enumeration<CompositionAttestationMode>(this, CompositionAttestationMode.PROFESSIONAL);
        if ("legal".equals(codeString))
          return new Enumeration<CompositionAttestationMode>(this, CompositionAttestationMode.LEGAL);
        if ("official".equals(codeString))
          return new Enumeration<CompositionAttestationMode>(this, CompositionAttestationMode.OFFICIAL);
        throw new FHIRException("Unknown CompositionAttestationMode code '"+codeString+"'");
        }
    public String toCode(CompositionAttestationMode code) {
      if (code == CompositionAttestationMode.PERSONAL)
        return "personal";
      if (code == CompositionAttestationMode.PROFESSIONAL)
        return "professional";
      if (code == CompositionAttestationMode.LEGAL)
        return "legal";
      if (code == CompositionAttestationMode.OFFICIAL)
        return "official";
      return "?";
      }
    public String toSystem(CompositionAttestationMode code) {
      return code.getSystem();
      }
    }

    public enum V3ConfidentialityClassification {
        /**
         * Privacy metadata indicating that no level of protection is required to safeguard personal and healthcare information that has been disclosed by an authorized individual without restrictions on its use.\r\n\n                        \n                           Examples: Includes publicly available information e.g., business name, phone, email and physical address.\r\n\n                        \n                           Usage Note: The authorization to collect, access, use, and disclose this information may be stipulated in a contract of adhesion by a data user (e.g., via terms of service or data user privacy policies) in exchange for the data subject's use of a service.\r\n\n                        This metadata indicates that the receiver has no obligation to consider privacy policies other than its own when making access control decisions.\r\n\n                        This metadata indicates that the receiver has no obligation to consider privacy policies other than its own when making access control decisions.\r\n\n                        Confidentiality code total order hierarchy: Unrestricted (U) is less protective than V, R, N, M, and L, and is the lowest protection levels.
         */
        U, 
        /**
         * Privacy metadata indicating that a low level of protection is required to safeguard personal and healthcare information, which has been altered in such a way as to minimize the need for confidentiality protections with some residual risks associated with re-linking. The risk of harm to an individual's reputation and sense of privacy if disclosed without authorization is considered negligible, and mitigations are in place to address reidentification risk.\r\n\n                        \n                           Usage Note: \n                        \r\nThe level of protection afforded anonymized and pseudonymized, and non-personally identifiable information (e.g., a limited data set) is dictated by privacy policies and data use agreements intended to engender trust that health information can be used and disclosed with little or no risk of re-identification.\n                           Example: Personal and healthcare information, which excludes 16 designated categories of direct identifiers in a HIPAA Limited Data Set. This information may be disclosed by HIPAA Covered Entities without patient authorization for a research, public health, and operations purposes if conditions are met, which includes obtaining a signed data use agreement from the recipient. See 45 CFR Section 164.514.\r\n\n                        This metadata indicates that the receiver may have an obligation to comply with a data use agreement with the discloser. The discloser may have obligations to comply with policies dictating the methods for de-identification.\r\n\n                        Confidentiality code total order hierarchy: Low (L) is less protective than V, R, N, and M, and subsumes U.
         */
        L, 
        /**
         * Privacy metadata indicating the level of protection required to safeguard personal and healthcare information, which if disclosed without authorization, would present a moderate risk of harm to an individual's reputation and sense of privacy.\r\n\n                        \n                           Usage Note: The level of protection afforded moderately confidential information is dictated by privacy policies intended to engender trust in a service provider. May include publicly available information in jurisdictions that restrict uses of that information without the consent of the data subject.\r\n\n                        Privacy policies mandating moderate levels of protection, which preempt less protective privacy policies. \"Moderate\" confidentiality policies differ from and would be preempted by the prevailing privacy policies mandating the normative level of protection for information used in the delivery and management of healthcare.\r\n\n                        Confidentiality code total order hierarchy: Moderate (M) is less protective than V, R, and N, and subsumes all other protection levels (i.e., L and U).\r\n\n                        \n                           Examples: Includes personal and health information that an individual authorizes to be collected, accessed, used or disclosed to a bank for a health credit card or savings account; to health oversight authorities; to a hospital patient directory; to worker compensation, disability, property and casualty or life insurers; and to personal health record systems, consumer-controlled devices, social media accounts and online Apps; or for marketing purposes
         */
        M, 
        /**
         * Privacy metadata indicating the level of protection required to safeguard personal and healthcare information, which if disclosed without authorization, would present a considerable risk of harm to an individual's reputation and sense of privacy.\r\n\n                        \n                           Usage Note: The level of protection afforded normatively confidential information is dictated by the prevailing normative privacy policies, which are intended to engender patient trust in their healthcare providers.\r\n\n                        Privacy policies mandating normative levels of protection, which preempt less protective privacy policies when the information is used in the delivery and management of healthcare. May be pre-empted by jurisdictional law (e.g., for public health reporting or emergency treatment).\r\n\n                        Confidentiality code total order hierarchy: Normal (N) is less protective than V and R, and subsumes all other protection levels (i.e., M, L, and U).\r\n\n                        \n                           Map:Partial Map to ISO 13606-4 Sensitivity Level (3) Clinical Care when purpose of use is treatment: Default for normal clinical care access (i.e., most clinical staff directly caring for the patient should be able to access nearly all of the EHR). Maps to normal confidentiality for treatment information but not to ancillary care, payment and operations. \r\n\n                        \n                           Examples: \n                        \r\nn the US, this includes what HIPAA identifies as protected health information (PHI) under 45 CFR Section 160.103.
         */
        N, 
        /**
         * Privacy metadata indicating the level of protection required to safeguard potentially stigmatizing information, which if disclosed without authorization, would present a high risk of harm to an individual's reputation and sense of privacy.\r\n\n                        \n                           Usage Note: The level of protection afforded restricted confidential information is dictated by specially protective organizational or jurisdictional privacy policies, including at an authorized individualâ€™s request, intended to engender patient trust in providers of sensitive services.\r\n\n                        Privacy policies mandating additional levels of protection by restricting information access preempt less protective privacy policies when the information is used in the delivery and management of healthcare. May be pre-empted by jurisdictional law (e.g., for public health reporting or emergency treatment).\r\n\n                        Confidentiality code total order hierarchy: Restricted (R) is less protective than V, and subsumes all other protection levels (i.e., N, M, L, and U).\r\n\n                        \n                           Examples: \n                        \r\nIncludes information that is additionally protected such as sensitive conditions mental health, HIV, substance abuse, domestic violence, child abuse, genetic disease, and reproductive health; or sensitive demographic information such as a patientâ€™s standing as an employee or a celebrity. May be used to indicate proprietary or classified information that is not related to an individual (e.g., secret ingredients in a therapeutic substance; or the name of a manufacturer).
         */
        R, 
        /**
         * Privacy metadata indicating the level of protection required under atypical cicumstances to safeguard potentially damaging or harmful information, which if disclosed without authorization, would (1) present an extremely high risk of harm to an individual's reputation, sense of privacy, and possibly safety; or (2) impact an individual's or organization's legal matters.\r\n\n                        \n                           Usage Note: The level of protection afforded very restricted confidential information is dictated by specially protective privacy or legal policies intended to ensure that under atypical circumstances additional protections limit access to only those with a high 'need to know' and the information is kept in highest confidence..\r\n\n                        Privacy and legal policies mandating the highest level of protection by stringently restricting information access, preempt less protective privacy policies when the information is used in the delivery and management of healthcare including legal proceedings related to healthcare. May be pre-empted by jurisdictional law (e.g., for public health reporting or emergency treatment but only under limited circumstances).\r\n\n                        Confidentiality code total order hierarchy: Very Restricted (V) is the highest protection level and subsumes all other protection levels s (i.e., R, N, M, L, and UI).\r\n\n                        \n                           Examples: \n                        \r\nIncludes information about a victim of abuse, patient requested information sensitivity, and taboo subjects relating to health status that must be discussed with the patient by an attending provider before sharing with the patient. May also include information held under a legal hold or attorney-client privilege.
         */
        V, 
        /**
         * added to help the parsers with the generic types
         */
        NULL;
        public static V3ConfidentialityClassification fromCode(String codeString) throws FHIRException {
            if (codeString == null || "".equals(codeString))
                return null;
        if ("U".equals(codeString))
          return U;
        if ("L".equals(codeString))
          return L;
        if ("M".equals(codeString))
          return M;
        if ("N".equals(codeString))
          return N;
        if ("R".equals(codeString))
          return R;
        if ("V".equals(codeString))
          return V;
        if (Configuration.isAcceptInvalidEnums())
          return null;
        else
          throw new FHIRException("Unknown V3ConfidentialityClassification code '"+codeString+"'");
        }
        public String toCode() {
          switch (this) {
            case U: return "U";
            case L: return "L";
            case M: return "M";
            case N: return "N";
            case R: return "R";
            case V: return "V";
            default: return "?";
          }
        }
        public String getSystem() {
          switch (this) {
            case U: return "http://terminology.hl7.org/CodeSystem/v3-Confidentiality";
            case L: return "http://terminology.hl7.org/CodeSystem/v3-Confidentiality";
            case M: return "http://terminology.hl7.org/CodeSystem/v3-Confidentiality";
            case N: return "http://terminology.hl7.org/CodeSystem/v3-Confidentiality";
            case R: return "http://terminology.hl7.org/CodeSystem/v3-Confidentiality";
            case V: return "http://terminology.hl7.org/CodeSystem/v3-Confidentiality";
            default: return "?";
          }
        }
        public String getDefinition() {
          switch (this) {
            case U: return "Privacy metadata indicating that no level of protection is required to safeguard personal and healthcare information that has been disclosed by an authorized individual without restrictions on its use.\r\n\n                        \n                           Examples: Includes publicly available information e.g., business name, phone, email and physical address.\r\n\n                        \n                           Usage Note: The authorization to collect, access, use, and disclose this information may be stipulated in a contract of adhesion by a data user (e.g., via terms of service or data user privacy policies) in exchange for the data subject's use of a service.\r\n\n                        This metadata indicates that the receiver has no obligation to consider privacy policies other than its own when making access control decisions.\r\n\n                        This metadata indicates that the receiver has no obligation to consider privacy policies other than its own when making access control decisions.\r\n\n                        Confidentiality code total order hierarchy: Unrestricted (U) is less protective than V, R, N, M, and L, and is the lowest protection levels.";
            case L: return "Privacy metadata indicating that a low level of protection is required to safeguard personal and healthcare information, which has been altered in such a way as to minimize the need for confidentiality protections with some residual risks associated with re-linking. The risk of harm to an individual's reputation and sense of privacy if disclosed without authorization is considered negligible, and mitigations are in place to address reidentification risk.\r\n\n                        \n                           Usage Note: \n                        \r\nThe level of protection afforded anonymized and pseudonymized, and non-personally identifiable information (e.g., a limited data set) is dictated by privacy policies and data use agreements intended to engender trust that health information can be used and disclosed with little or no risk of re-identification.\n                           Example: Personal and healthcare information, which excludes 16 designated categories of direct identifiers in a HIPAA Limited Data Set. This information may be disclosed by HIPAA Covered Entities without patient authorization for a research, public health, and operations purposes if conditions are met, which includes obtaining a signed data use agreement from the recipient. See 45 CFR Section 164.514.\r\n\n                        This metadata indicates that the receiver may have an obligation to comply with a data use agreement with the discloser. The discloser may have obligations to comply with policies dictating the methods for de-identification.\r\n\n                        Confidentiality code total order hierarchy: Low (L) is less protective than V, R, N, and M, and subsumes U.";
            case M: return "Privacy metadata indicating the level of protection required to safeguard personal and healthcare information, which if disclosed without authorization, would present a moderate risk of harm to an individual's reputation and sense of privacy.\r\n\n                        \n                           Usage Note: The level of protection afforded moderately confidential information is dictated by privacy policies intended to engender trust in a service provider. May include publicly available information in jurisdictions that restrict uses of that information without the consent of the data subject.\r\n\n                        Privacy policies mandating moderate levels of protection, which preempt less protective privacy policies. \"Moderate\" confidentiality policies differ from and would be preempted by the prevailing privacy policies mandating the normative level of protection for information used in the delivery and management of healthcare.\r\n\n                        Confidentiality code total order hierarchy: Moderate (M) is less protective than V, R, and N, and subsumes all other protection levels (i.e., L and U).\r\n\n                        \n                           Examples: Includes personal and health information that an individual authorizes to be collected, accessed, used or disclosed to a bank for a health credit card or savings account; to health oversight authorities; to a hospital patient directory; to worker compensation, disability, property and casualty or life insurers; and to personal health record systems, consumer-controlled devices, social media accounts and online Apps; or for marketing purposes";
            case N: return "Privacy metadata indicating the level of protection required to safeguard personal and healthcare information, which if disclosed without authorization, would present a considerable risk of harm to an individual's reputation and sense of privacy.\r\n\n                        \n                           Usage Note: The level of protection afforded normatively confidential information is dictated by the prevailing normative privacy policies, which are intended to engender patient trust in their healthcare providers.\r\n\n                        Privacy policies mandating normative levels of protection, which preempt less protective privacy policies when the information is used in the delivery and management of healthcare. May be pre-empted by jurisdictional law (e.g., for public health reporting or emergency treatment).\r\n\n                        Confidentiality code total order hierarchy: Normal (N) is less protective than V and R, and subsumes all other protection levels (i.e., M, L, and U).\r\n\n                        \n                           Map:Partial Map to ISO 13606-4 Sensitivity Level (3) Clinical Care when purpose of use is treatment: Default for normal clinical care access (i.e., most clinical staff directly caring for the patient should be able to access nearly all of the EHR). Maps to normal confidentiality for treatment information but not to ancillary care, payment and operations. \r\n\n                        \n                           Examples: \n                        \r\nn the US, this includes what HIPAA identifies as protected health information (PHI) under 45 CFR Section 160.103.";
            case R: return "Privacy metadata indicating the level of protection required to safeguard potentially stigmatizing information, which if disclosed without authorization, would present a high risk of harm to an individual's reputation and sense of privacy.\r\n\n                        \n                           Usage Note: The level of protection afforded restricted confidential information is dictated by specially protective organizational or jurisdictional privacy policies, including at an authorized individualâ€™s request, intended to engender patient trust in providers of sensitive services.\r\n\n                        Privacy policies mandating additional levels of protection by restricting information access preempt less protective privacy policies when the information is used in the delivery and management of healthcare. May be pre-empted by jurisdictional law (e.g., for public health reporting or emergency treatment).\r\n\n                        Confidentiality code total order hierarchy: Restricted (R) is less protective than V, and subsumes all other protection levels (i.e., N, M, L, and U).\r\n\n                        \n                           Examples: \n                        \r\nIncludes information that is additionally protected such as sensitive conditions mental health, HIV, substance abuse, domestic violence, child abuse, genetic disease, and reproductive health; or sensitive demographic information such as a patientâ€™s standing as an employee or a celebrity. May be used to indicate proprietary or classified information that is not related to an individual (e.g., secret ingredients in a therapeutic substance; or the name of a manufacturer).";
            case V: return "Privacy metadata indicating the level of protection required under atypical cicumstances to safeguard potentially damaging or harmful information, which if disclosed without authorization, would (1) present an extremely high risk of harm to an individual's reputation, sense of privacy, and possibly safety; or (2) impact an individual's or organization's legal matters.\r\n\n                        \n                           Usage Note: The level of protection afforded very restricted confidential information is dictated by specially protective privacy or legal policies intended to ensure that under atypical circumstances additional protections limit access to only those with a high 'need to know' and the information is kept in highest confidence..\r\n\n                        Privacy and legal policies mandating the highest level of protection by stringently restricting information access, preempt less protective privacy policies when the information is used in the delivery and management of healthcare including legal proceedings related to healthcare. May be pre-empted by jurisdictional law (e.g., for public health reporting or emergency treatment but only under limited circumstances).\r\n\n                        Confidentiality code total order hierarchy: Very Restricted (V) is the highest protection level and subsumes all other protection levels s (i.e., R, N, M, L, and UI).\r\n\n                        \n                           Examples: \n                        \r\nIncludes information about a victim of abuse, patient requested information sensitivity, and taboo subjects relating to health status that must be discussed with the patient by an attending provider before sharing with the patient. May also include information held under a legal hold or attorney-client privilege.";
            default: return "?";
          }
        }
        public String getDisplay() {
          switch (this) {
            case U: return "unrestricted";
            case L: return "low";
            case M: return "moderate";
            case N: return "normal";
            case R: return "restricted";
            case V: return "very restricted";
            default: return "?";
          }
        }
    }

  public static class V3ConfidentialityClassificationEnumFactory implements EnumFactory<V3ConfidentialityClassification> {
    public V3ConfidentialityClassification fromCode(String codeString) throws IllegalArgumentException {
      if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("U".equals(codeString))
          return V3ConfidentialityClassification.U;
        if ("L".equals(codeString))
          return V3ConfidentialityClassification.L;
        if ("M".equals(codeString))
          return V3ConfidentialityClassification.M;
        if ("N".equals(codeString))
          return V3ConfidentialityClassification.N;
        if ("R".equals(codeString))
          return V3ConfidentialityClassification.R;
        if ("V".equals(codeString))
          return V3ConfidentialityClassification.V;
        throw new IllegalArgumentException("Unknown V3ConfidentialityClassification code '"+codeString+"'");
        }
        public Enumeration<V3ConfidentialityClassification> fromType(Base code) throws FHIRException {
          if (code == null)
            return null;
          if (code.isEmpty())
            return new Enumeration<V3ConfidentialityClassification>(this);
          String codeString = ((PrimitiveType) code).asStringValue();
          if (codeString == null || "".equals(codeString))
            return null;
        if ("U".equals(codeString))
          return new Enumeration<V3ConfidentialityClassification>(this, V3ConfidentialityClassification.U);
        if ("L".equals(codeString))
          return new Enumeration<V3ConfidentialityClassification>(this, V3ConfidentialityClassification.L);
        if ("M".equals(codeString))
          return new Enumeration<V3ConfidentialityClassification>(this, V3ConfidentialityClassification.M);
        if ("N".equals(codeString))
          return new Enumeration<V3ConfidentialityClassification>(this, V3ConfidentialityClassification.N);
        if ("R".equals(codeString))
          return new Enumeration<V3ConfidentialityClassification>(this, V3ConfidentialityClassification.R);
        if ("V".equals(codeString))
          return new Enumeration<V3ConfidentialityClassification>(this, V3ConfidentialityClassification.V);
        throw new FHIRException("Unknown V3ConfidentialityClassification code '"+codeString+"'");
        }
    public String toCode(V3ConfidentialityClassification code) {
      if (code == V3ConfidentialityClassification.U)
        return "U";
      if (code == V3ConfidentialityClassification.L)
        return "L";
      if (code == V3ConfidentialityClassification.M)
        return "M";
      if (code == V3ConfidentialityClassification.N)
        return "N";
      if (code == V3ConfidentialityClassification.R)
        return "R";
      if (code == V3ConfidentialityClassification.V)
        return "V";
      return "?";
      }
    public String toSystem(V3ConfidentialityClassification code) {
      return code.getSystem();
      }
    }

    @Block()
    public static class CompositionAttesterComponent extends BackboneElement implements IBaseBackboneElement {
        /**
         * The type of attestation the authenticator offers.
         */
        @Child(name = "mode", type = {CodeType.class}, order=1, min=1, max=1, modifier=false, summary=false)
        @Description(shortDefinition="personal | professional | legal | official", formalDefinition="The type of attestation the authenticator offers." )
        @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/composition-attestation-mode")
        protected Enumeration<CompositionAttestationMode> mode;

        /**
         * When the composition was attested by the party.
         */
        @Child(name = "time", type = {DateTimeType.class}, order=2, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="When the composition was attested", formalDefinition="When the composition was attested by the party." )
        protected DateTimeType time;

        /**
         * Who attested the composition in the specified way.
         */
        @Child(name = "party", type = {Patient.class, RelatedPerson.class, Practitioner.class, PractitionerRole.class, Organization.class}, order=3, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Who attested the composition", formalDefinition="Who attested the composition in the specified way." )
        protected Reference party;

        private static final long serialVersionUID = 1917167918L;

    /**
     * Constructor
     */
      public CompositionAttesterComponent() {
        super();
      }

    /**
     * Constructor
     */
      public CompositionAttesterComponent(CompositionAttestationMode mode) {
        super();
        this.setMode(mode);
      }

        /**
         * @return {@link #mode} (The type of attestation the authenticator offers.). This is the underlying object with id, value and extensions. The accessor "getMode" gives direct access to the value
         */
        public Enumeration<CompositionAttestationMode> getModeElement() { 
          if (this.mode == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create CompositionAttesterComponent.mode");
            else if (Configuration.doAutoCreate())
              this.mode = new Enumeration<CompositionAttestationMode>(new CompositionAttestationModeEnumFactory()); // bb
          return this.mode;
        }

        public boolean hasModeElement() { 
          return this.mode != null && !this.mode.isEmpty();
        }

        public boolean hasMode() { 
          return this.mode != null && !this.mode.isEmpty();
        }

        /**
         * @param value {@link #mode} (The type of attestation the authenticator offers.). This is the underlying object with id, value and extensions. The accessor "getMode" gives direct access to the value
         */
        public CompositionAttesterComponent setModeElement(Enumeration<CompositionAttestationMode> value) { 
          this.mode = value;
          return this;
        }

        /**
         * @return The type of attestation the authenticator offers.
         */
        public CompositionAttestationMode getMode() { 
          return this.mode == null ? null : this.mode.getValue();
        }

        /**
         * @param value The type of attestation the authenticator offers.
         */
        public CompositionAttesterComponent setMode(CompositionAttestationMode value) { 
            if (this.mode == null)
              this.mode = new Enumeration<CompositionAttestationMode>(new CompositionAttestationModeEnumFactory());
            this.mode.setValue(value);
          return this;
        }

        /**
         * @return {@link #time} (When the composition was attested by the party.). This is the underlying object with id, value and extensions. The accessor "getTime" gives direct access to the value
         */
        public DateTimeType getTimeElement() { 
          if (this.time == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create CompositionAttesterComponent.time");
            else if (Configuration.doAutoCreate())
              this.time = new DateTimeType(); // bb
          return this.time;
        }

        public boolean hasTimeElement() { 
          return this.time != null && !this.time.isEmpty();
        }

        public boolean hasTime() { 
          return this.time != null && !this.time.isEmpty();
        }

        /**
         * @param value {@link #time} (When the composition was attested by the party.). This is the underlying object with id, value and extensions. The accessor "getTime" gives direct access to the value
         */
        public CompositionAttesterComponent setTimeElement(DateTimeType value) { 
          this.time = value;
          return this;
        }

        /**
         * @return When the composition was attested by the party.
         */
        public Date getTime() { 
          return this.time == null ? null : this.time.getValue();
        }

        /**
         * @param value When the composition was attested by the party.
         */
        public CompositionAttesterComponent setTime(Date value) { 
          if (value == null)
            this.time = null;
          else {
            if (this.time == null)
              this.time = new DateTimeType();
            this.time.setValue(value);
          }
          return this;
        }

        /**
         * @return {@link #party} (Who attested the composition in the specified way.)
         */
        public Reference getParty() { 
          if (this.party == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create CompositionAttesterComponent.party");
            else if (Configuration.doAutoCreate())
              this.party = new Reference(); // cc
          return this.party;
        }

        public boolean hasParty() { 
          return this.party != null && !this.party.isEmpty();
        }

        /**
         * @param value {@link #party} (Who attested the composition in the specified way.)
         */
        public CompositionAttesterComponent setParty(Reference value) { 
          this.party = value;
          return this;
        }

        protected void listChildren(List<Property> children) {
          super.listChildren(children);
          children.add(new Property("mode", "code", "The type of attestation the authenticator offers.", 0, 1, mode));
          children.add(new Property("time", "dateTime", "When the composition was attested by the party.", 0, 1, time));
          children.add(new Property("party", "Reference(Patient|RelatedPerson|Practitioner|PractitionerRole|Organization)", "Who attested the composition in the specified way.", 0, 1, party));
        }

        @Override
        public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
          switch (_hash) {
          case 3357091: /*mode*/  return new Property("mode", "code", "The type of attestation the authenticator offers.", 0, 1, mode);
          case 3560141: /*time*/  return new Property("time", "dateTime", "When the composition was attested by the party.", 0, 1, time);
          case 106437350: /*party*/  return new Property("party", "Reference(Patient|RelatedPerson|Practitioner|PractitionerRole|Organization)", "Who attested the composition in the specified way.", 0, 1, party);
          default: return super.getNamedProperty(_hash, _name, _checkValid);
          }

        }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case 3357091: /*mode*/ return this.mode == null ? new Base[0] : new Base[] {this.mode}; // Enumeration<CompositionAttestationMode>
        case 3560141: /*time*/ return this.time == null ? new Base[0] : new Base[] {this.time}; // DateTimeType
        case 106437350: /*party*/ return this.party == null ? new Base[0] : new Base[] {this.party}; // Reference
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public Base setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case 3357091: // mode
          value = new CompositionAttestationModeEnumFactory().fromType(TypeConvertor.castToCode(value));
          this.mode = (Enumeration) value; // Enumeration<CompositionAttestationMode>
          return value;
        case 3560141: // time
          this.time = TypeConvertor.castToDateTime(value); // DateTimeType
          return value;
        case 106437350: // party
          this.party = TypeConvertor.castToReference(value); // Reference
          return value;
        default: return super.setProperty(hash, name, value);
        }

      }

      @Override
      public Base setProperty(String name, Base value) throws FHIRException {
        if (name.equals("mode")) {
          value = new CompositionAttestationModeEnumFactory().fromType(TypeConvertor.castToCode(value));
          this.mode = (Enumeration) value; // Enumeration<CompositionAttestationMode>
        } else if (name.equals("time")) {
          this.time = TypeConvertor.castToDateTime(value); // DateTimeType
        } else if (name.equals("party")) {
          this.party = TypeConvertor.castToReference(value); // Reference
        } else
          return super.setProperty(name, value);
        return value;
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 3357091:  return getModeElement();
        case 3560141:  return getTimeElement();
        case 106437350:  return getParty();
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 3357091: /*mode*/ return new String[] {"code"};
        case 3560141: /*time*/ return new String[] {"dateTime"};
        case 106437350: /*party*/ return new String[] {"Reference"};
        default: return super.getTypesForProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("mode")) {
          throw new FHIRException("Cannot call addChild on a primitive type Composition.attester.mode");
        }
        else if (name.equals("time")) {
          throw new FHIRException("Cannot call addChild on a primitive type Composition.attester.time");
        }
        else if (name.equals("party")) {
          this.party = new Reference();
          return this.party;
        }
        else
          return super.addChild(name);
      }

      public CompositionAttesterComponent copy() {
        CompositionAttesterComponent dst = new CompositionAttesterComponent();
        copyValues(dst);
        return dst;
      }

      public void copyValues(CompositionAttesterComponent dst) {
        super.copyValues(dst);
        dst.mode = mode == null ? null : mode.copy();
        dst.time = time == null ? null : time.copy();
        dst.party = party == null ? null : party.copy();
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof CompositionAttesterComponent))
          return false;
        CompositionAttesterComponent o = (CompositionAttesterComponent) other_;
        return compareDeep(mode, o.mode, true) && compareDeep(time, o.time, true) && compareDeep(party, o.party, true)
          ;
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof CompositionAttesterComponent))
          return false;
        CompositionAttesterComponent o = (CompositionAttesterComponent) other_;
        return compareValues(mode, o.mode, true) && compareValues(time, o.time, true);
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(mode, time, party);
      }

  public String fhirType() {
    return "Composition.attester";

  }

  }

    @Block()
    public static class CompositionRelatesToComponent extends BackboneElement implements IBaseBackboneElement {
        /**
         * The type of relationship that this composition has with anther composition or document.
         */
        @Child(name = "code", type = {CodeType.class}, order=1, min=1, max=1, modifier=false, summary=false)
        @Description(shortDefinition="replaces | transforms | signs | appends", formalDefinition="The type of relationship that this composition has with anther composition or document." )
        @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/document-relationship-type")
        protected Enumeration<DocumentRelationshipType> code;

        /**
         * The target composition/document of this relationship.
         */
        @Child(name = "target", type = {Identifier.class, Composition.class}, order=2, min=1, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Target of the relationship", formalDefinition="The target composition/document of this relationship." )
        protected DataType target;

        private static final long serialVersionUID = -897077070L;

    /**
     * Constructor
     */
      public CompositionRelatesToComponent() {
        super();
      }

    /**
     * Constructor
     */
      public CompositionRelatesToComponent(DocumentRelationshipType code, DataType target) {
        super();
        this.setCode(code);
        this.setTarget(target);
      }

        /**
         * @return {@link #code} (The type of relationship that this composition has with anther composition or document.). This is the underlying object with id, value and extensions. The accessor "getCode" gives direct access to the value
         */
        public Enumeration<DocumentRelationshipType> getCodeElement() { 
          if (this.code == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create CompositionRelatesToComponent.code");
            else if (Configuration.doAutoCreate())
              this.code = new Enumeration<DocumentRelationshipType>(new DocumentRelationshipTypeEnumFactory()); // bb
          return this.code;
        }

        public boolean hasCodeElement() { 
          return this.code != null && !this.code.isEmpty();
        }

        public boolean hasCode() { 
          return this.code != null && !this.code.isEmpty();
        }

        /**
         * @param value {@link #code} (The type of relationship that this composition has with anther composition or document.). This is the underlying object with id, value and extensions. The accessor "getCode" gives direct access to the value
         */
        public CompositionRelatesToComponent setCodeElement(Enumeration<DocumentRelationshipType> value) { 
          this.code = value;
          return this;
        }

        /**
         * @return The type of relationship that this composition has with anther composition or document.
         */
        public DocumentRelationshipType getCode() { 
          return this.code == null ? null : this.code.getValue();
        }

        /**
         * @param value The type of relationship that this composition has with anther composition or document.
         */
        public CompositionRelatesToComponent setCode(DocumentRelationshipType value) { 
            if (this.code == null)
              this.code = new Enumeration<DocumentRelationshipType>(new DocumentRelationshipTypeEnumFactory());
            this.code.setValue(value);
          return this;
        }

        /**
         * @return {@link #target} (The target composition/document of this relationship.)
         */
        public DataType getTarget() { 
          return this.target;
        }

        /**
         * @return {@link #target} (The target composition/document of this relationship.)
         */
        public Identifier getTargetIdentifier() throws FHIRException { 
          if (this.target == null)
            this.target = new Identifier();
          if (!(this.target instanceof Identifier))
            throw new FHIRException("Type mismatch: the type Identifier was expected, but "+this.target.getClass().getName()+" was encountered");
          return (Identifier) this.target;
        }

        public boolean hasTargetIdentifier() { 
          return this != null && this.target instanceof Identifier;
        }

        /**
         * @return {@link #target} (The target composition/document of this relationship.)
         */
        public Reference getTargetReference() throws FHIRException { 
          if (this.target == null)
            this.target = new Reference();
          if (!(this.target instanceof Reference))
            throw new FHIRException("Type mismatch: the type Reference was expected, but "+this.target.getClass().getName()+" was encountered");
          return (Reference) this.target;
        }

        public boolean hasTargetReference() { 
          return this != null && this.target instanceof Reference;
        }

        public boolean hasTarget() { 
          return this.target != null && !this.target.isEmpty();
        }

        /**
         * @param value {@link #target} (The target composition/document of this relationship.)
         */
        public CompositionRelatesToComponent setTarget(DataType value) { 
          if (value != null && !(value instanceof Identifier || value instanceof Reference))
            throw new Error("Not the right type for Composition.relatesTo.target[x]: "+value.fhirType());
          this.target = value;
          return this;
        }

        protected void listChildren(List<Property> children) {
          super.listChildren(children);
          children.add(new Property("code", "code", "The type of relationship that this composition has with anther composition or document.", 0, 1, code));
          children.add(new Property("target[x]", "Identifier|Reference(Composition)", "The target composition/document of this relationship.", 0, 1, target));
        }

        @Override
        public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
          switch (_hash) {
          case 3059181: /*code*/  return new Property("code", "code", "The type of relationship that this composition has with anther composition or document.", 0, 1, code);
          case -815579825: /*target[x]*/  return new Property("target[x]", "Identifier|Reference(Composition)", "The target composition/document of this relationship.", 0, 1, target);
          case -880905839: /*target*/  return new Property("target[x]", "Identifier|Reference(Composition)", "The target composition/document of this relationship.", 0, 1, target);
          case 1690892570: /*targetIdentifier*/  return new Property("target[x]", "Identifier", "The target composition/document of this relationship.", 0, 1, target);
          case 1259806906: /*targetReference*/  return new Property("target[x]", "Reference(Composition)", "The target composition/document of this relationship.", 0, 1, target);
          default: return super.getNamedProperty(_hash, _name, _checkValid);
          }

        }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case 3059181: /*code*/ return this.code == null ? new Base[0] : new Base[] {this.code}; // Enumeration<DocumentRelationshipType>
        case -880905839: /*target*/ return this.target == null ? new Base[0] : new Base[] {this.target}; // DataType
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public Base setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case 3059181: // code
          value = new DocumentRelationshipTypeEnumFactory().fromType(TypeConvertor.castToCode(value));
          this.code = (Enumeration) value; // Enumeration<DocumentRelationshipType>
          return value;
        case -880905839: // target
          this.target = TypeConvertor.castToType(value); // DataType
          return value;
        default: return super.setProperty(hash, name, value);
        }

      }

      @Override
      public Base setProperty(String name, Base value) throws FHIRException {
        if (name.equals("code")) {
          value = new DocumentRelationshipTypeEnumFactory().fromType(TypeConvertor.castToCode(value));
          this.code = (Enumeration) value; // Enumeration<DocumentRelationshipType>
        } else if (name.equals("target[x]")) {
          this.target = TypeConvertor.castToType(value); // DataType
        } else
          return super.setProperty(name, value);
        return value;
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 3059181:  return getCodeElement();
        case -815579825:  return getTarget();
        case -880905839:  return getTarget();
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 3059181: /*code*/ return new String[] {"code"};
        case -880905839: /*target*/ return new String[] {"Identifier", "Reference"};
        default: return super.getTypesForProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("code")) {
          throw new FHIRException("Cannot call addChild on a primitive type Composition.relatesTo.code");
        }
        else if (name.equals("targetIdentifier")) {
          this.target = new Identifier();
          return this.target;
        }
        else if (name.equals("targetReference")) {
          this.target = new Reference();
          return this.target;
        }
        else
          return super.addChild(name);
      }

      public CompositionRelatesToComponent copy() {
        CompositionRelatesToComponent dst = new CompositionRelatesToComponent();
        copyValues(dst);
        return dst;
      }

      public void copyValues(CompositionRelatesToComponent dst) {
        super.copyValues(dst);
        dst.code = code == null ? null : code.copy();
        dst.target = target == null ? null : target.copy();
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof CompositionRelatesToComponent))
          return false;
        CompositionRelatesToComponent o = (CompositionRelatesToComponent) other_;
        return compareDeep(code, o.code, true) && compareDeep(target, o.target, true);
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof CompositionRelatesToComponent))
          return false;
        CompositionRelatesToComponent o = (CompositionRelatesToComponent) other_;
        return compareValues(code, o.code, true);
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(code, target);
      }

  public String fhirType() {
    return "Composition.relatesTo";

  }

  }

    @Block()
    public static class CompositionEventComponent extends BackboneElement implements IBaseBackboneElement {
        /**
         * This list of codes represents the main clinical acts, such as a colonoscopy or an appendectomy, being documented. In some cases, the event is inherent in the typeCode, such as a "History and Physical Report" in which the procedure being documented is necessarily a "History and Physical" act.
         */
        @Child(name = "code", type = {CodeableConcept.class}, order=1, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=true)
        @Description(shortDefinition="Code(s) that apply to the event being documented", formalDefinition="This list of codes represents the main clinical acts, such as a colonoscopy or an appendectomy, being documented. In some cases, the event is inherent in the typeCode, such as a \"History and Physical Report\" in which the procedure being documented is necessarily a \"History and Physical\" act." )
        @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://terminology.hl7.org/ValueSet/v3-ActCode")
        protected List<CodeableConcept> code;

        /**
         * The period of time covered by the documentation. There is no assertion that the documentation is a complete representation for this period, only that it documents events during this time.
         */
        @Child(name = "period", type = {Period.class}, order=2, min=0, max=1, modifier=false, summary=true)
        @Description(shortDefinition="The period covered by the documentation", formalDefinition="The period of time covered by the documentation. There is no assertion that the documentation is a complete representation for this period, only that it documents events during this time." )
        protected Period period;

        /**
         * The description and/or reference of the event(s) being documented. For example, this could be used to document such a colonoscopy or an appendectomy.
         */
        @Child(name = "detail", type = {Reference.class}, order=3, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=true)
        @Description(shortDefinition="The event(s) being documented", formalDefinition="The description and/or reference of the event(s) being documented. For example, this could be used to document such a colonoscopy or an appendectomy." )
        protected List<Reference> detail;

        private static final long serialVersionUID = 1593079240L;

    /**
     * Constructor
     */
      public CompositionEventComponent() {
        super();
      }

        /**
         * @return {@link #code} (This list of codes represents the main clinical acts, such as a colonoscopy or an appendectomy, being documented. In some cases, the event is inherent in the typeCode, such as a "History and Physical Report" in which the procedure being documented is necessarily a "History and Physical" act.)
         */
        public List<CodeableConcept> getCode() { 
          if (this.code == null)
            this.code = new ArrayList<CodeableConcept>();
          return this.code;
        }

        /**
         * @return Returns a reference to <code>this</code> for easy method chaining
         */
        public CompositionEventComponent setCode(List<CodeableConcept> theCode) { 
          this.code = theCode;
          return this;
        }

        public boolean hasCode() { 
          if (this.code == null)
            return false;
          for (CodeableConcept item : this.code)
            if (!item.isEmpty())
              return true;
          return false;
        }

        public CodeableConcept addCode() { //3
          CodeableConcept t = new CodeableConcept();
          if (this.code == null)
            this.code = new ArrayList<CodeableConcept>();
          this.code.add(t);
          return t;
        }

        public CompositionEventComponent addCode(CodeableConcept t) { //3
          if (t == null)
            return this;
          if (this.code == null)
            this.code = new ArrayList<CodeableConcept>();
          this.code.add(t);
          return this;
        }

        /**
         * @return The first repetition of repeating field {@link #code}, creating it if it does not already exist {3}
         */
        public CodeableConcept getCodeFirstRep() { 
          if (getCode().isEmpty()) {
            addCode();
          }
          return getCode().get(0);
        }

        /**
         * @return {@link #period} (The period of time covered by the documentation. There is no assertion that the documentation is a complete representation for this period, only that it documents events during this time.)
         */
        public Period getPeriod() { 
          if (this.period == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create CompositionEventComponent.period");
            else if (Configuration.doAutoCreate())
              this.period = new Period(); // cc
          return this.period;
        }

        public boolean hasPeriod() { 
          return this.period != null && !this.period.isEmpty();
        }

        /**
         * @param value {@link #period} (The period of time covered by the documentation. There is no assertion that the documentation is a complete representation for this period, only that it documents events during this time.)
         */
        public CompositionEventComponent setPeriod(Period value) { 
          this.period = value;
          return this;
        }

        /**
         * @return {@link #detail} (The description and/or reference of the event(s) being documented. For example, this could be used to document such a colonoscopy or an appendectomy.)
         */
        public List<Reference> getDetail() { 
          if (this.detail == null)
            this.detail = new ArrayList<Reference>();
          return this.detail;
        }

        /**
         * @return Returns a reference to <code>this</code> for easy method chaining
         */
        public CompositionEventComponent setDetail(List<Reference> theDetail) { 
          this.detail = theDetail;
          return this;
        }

        public boolean hasDetail() { 
          if (this.detail == null)
            return false;
          for (Reference item : this.detail)
            if (!item.isEmpty())
              return true;
          return false;
        }

        public Reference addDetail() { //3
          Reference t = new Reference();
          if (this.detail == null)
            this.detail = new ArrayList<Reference>();
          this.detail.add(t);
          return t;
        }

        public CompositionEventComponent addDetail(Reference t) { //3
          if (t == null)
            return this;
          if (this.detail == null)
            this.detail = new ArrayList<Reference>();
          this.detail.add(t);
          return this;
        }

        /**
         * @return The first repetition of repeating field {@link #detail}, creating it if it does not already exist {3}
         */
        public Reference getDetailFirstRep() { 
          if (getDetail().isEmpty()) {
            addDetail();
          }
          return getDetail().get(0);
        }

        protected void listChildren(List<Property> children) {
          super.listChildren(children);
          children.add(new Property("code", "CodeableConcept", "This list of codes represents the main clinical acts, such as a colonoscopy or an appendectomy, being documented. In some cases, the event is inherent in the typeCode, such as a \"History and Physical Report\" in which the procedure being documented is necessarily a \"History and Physical\" act.", 0, java.lang.Integer.MAX_VALUE, code));
          children.add(new Property("period", "Period", "The period of time covered by the documentation. There is no assertion that the documentation is a complete representation for this period, only that it documents events during this time.", 0, 1, period));
          children.add(new Property("detail", "Reference(Any)", "The description and/or reference of the event(s) being documented. For example, this could be used to document such a colonoscopy or an appendectomy.", 0, java.lang.Integer.MAX_VALUE, detail));
        }

        @Override
        public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
          switch (_hash) {
          case 3059181: /*code*/  return new Property("code", "CodeableConcept", "This list of codes represents the main clinical acts, such as a colonoscopy or an appendectomy, being documented. In some cases, the event is inherent in the typeCode, such as a \"History and Physical Report\" in which the procedure being documented is necessarily a \"History and Physical\" act.", 0, java.lang.Integer.MAX_VALUE, code);
          case -991726143: /*period*/  return new Property("period", "Period", "The period of time covered by the documentation. There is no assertion that the documentation is a complete representation for this period, only that it documents events during this time.", 0, 1, period);
          case -1335224239: /*detail*/  return new Property("detail", "Reference(Any)", "The description and/or reference of the event(s) being documented. For example, this could be used to document such a colonoscopy or an appendectomy.", 0, java.lang.Integer.MAX_VALUE, detail);
          default: return super.getNamedProperty(_hash, _name, _checkValid);
          }

        }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case 3059181: /*code*/ return this.code == null ? new Base[0] : this.code.toArray(new Base[this.code.size()]); // CodeableConcept
        case -991726143: /*period*/ return this.period == null ? new Base[0] : new Base[] {this.period}; // Period
        case -1335224239: /*detail*/ return this.detail == null ? new Base[0] : this.detail.toArray(new Base[this.detail.size()]); // Reference
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public Base setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case 3059181: // code
          this.getCode().add(TypeConvertor.castToCodeableConcept(value)); // CodeableConcept
          return value;
        case -991726143: // period
          this.period = TypeConvertor.castToPeriod(value); // Period
          return value;
        case -1335224239: // detail
          this.getDetail().add(TypeConvertor.castToReference(value)); // Reference
          return value;
        default: return super.setProperty(hash, name, value);
        }

      }

      @Override
      public Base setProperty(String name, Base value) throws FHIRException {
        if (name.equals("code")) {
          this.getCode().add(TypeConvertor.castToCodeableConcept(value));
        } else if (name.equals("period")) {
          this.period = TypeConvertor.castToPeriod(value); // Period
        } else if (name.equals("detail")) {
          this.getDetail().add(TypeConvertor.castToReference(value));
        } else
          return super.setProperty(name, value);
        return value;
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 3059181:  return addCode(); 
        case -991726143:  return getPeriod();
        case -1335224239:  return addDetail(); 
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 3059181: /*code*/ return new String[] {"CodeableConcept"};
        case -991726143: /*period*/ return new String[] {"Period"};
        case -1335224239: /*detail*/ return new String[] {"Reference"};
        default: return super.getTypesForProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("code")) {
          return addCode();
        }
        else if (name.equals("period")) {
          this.period = new Period();
          return this.period;
        }
        else if (name.equals("detail")) {
          return addDetail();
        }
        else
          return super.addChild(name);
      }

      public CompositionEventComponent copy() {
        CompositionEventComponent dst = new CompositionEventComponent();
        copyValues(dst);
        return dst;
      }

      public void copyValues(CompositionEventComponent dst) {
        super.copyValues(dst);
        if (code != null) {
          dst.code = new ArrayList<CodeableConcept>();
          for (CodeableConcept i : code)
            dst.code.add(i.copy());
        };
        dst.period = period == null ? null : period.copy();
        if (detail != null) {
          dst.detail = new ArrayList<Reference>();
          for (Reference i : detail)
            dst.detail.add(i.copy());
        };
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof CompositionEventComponent))
          return false;
        CompositionEventComponent o = (CompositionEventComponent) other_;
        return compareDeep(code, o.code, true) && compareDeep(period, o.period, true) && compareDeep(detail, o.detail, true)
          ;
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof CompositionEventComponent))
          return false;
        CompositionEventComponent o = (CompositionEventComponent) other_;
        return true;
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(code, period, detail);
      }

  public String fhirType() {
    return "Composition.event";

  }

  }

    @Block()
    public static class SectionComponent extends BackboneElement implements IBaseBackboneElement {
        /**
         * The label for this particular section.  This will be part of the rendered content for the document, and is often used to build a table of contents.
         */
        @Child(name = "title", type = {StringType.class}, order=1, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Label for section (e.g. for ToC)", formalDefinition="The label for this particular section.  This will be part of the rendered content for the document, and is often used to build a table of contents." )
        protected StringType title;

        /**
         * A code identifying the kind of content contained within the section. This must be consistent with the section title.
         */
        @Child(name = "code", type = {CodeableConcept.class}, order=2, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Classification of section (recommended)", formalDefinition="A code identifying the kind of content contained within the section. This must be consistent with the section title." )
        @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/doc-section-codes")
        protected CodeableConcept code;

        /**
         * Identifies who is responsible for the information in this section, not necessarily who typed it in.
         */
        @Child(name = "author", type = {Practitioner.class, PractitionerRole.class, Device.class, Patient.class, RelatedPerson.class, Organization.class}, order=3, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
        @Description(shortDefinition="Who and/or what authored the section", formalDefinition="Identifies who is responsible for the information in this section, not necessarily who typed it in." )
        protected List<Reference> author;

        /**
         * The actual focus of the section when it is not the subject of the composition, but instead represents something or someone associated with the subject such as (for a patient subject) a spouse, parent, fetus, or donor. If not focus is specified, the focus is assumed to be focus of the parent section, or, for a section in the Composition itself, the subject of the composition. Sections with a focus SHALL only include resources where the logical subject (patient, subject, focus, etc.) matches the section focus, or the resources have no logical subject (few resources).
         */
        @Child(name = "focus", type = {Reference.class}, order=4, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Who/what the section is about, when it is not about the subject of composition", formalDefinition="The actual focus of the section when it is not the subject of the composition, but instead represents something or someone associated with the subject such as (for a patient subject) a spouse, parent, fetus, or donor. If not focus is specified, the focus is assumed to be focus of the parent section, or, for a section in the Composition itself, the subject of the composition. Sections with a focus SHALL only include resources where the logical subject (patient, subject, focus, etc.) matches the section focus, or the resources have no logical subject (few resources)." )
        protected Reference focus;

        /**
         * A human-readable narrative that contains the attested content of the section, used to represent the content of the resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to make it "clinically safe" for a human to just read the narrative.
         */
        @Child(name = "text", type = {Narrative.class}, order=5, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Text summary of the section, for human interpretation", formalDefinition="A human-readable narrative that contains the attested content of the section, used to represent the content of the resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to make it \"clinically safe\" for a human to just read the narrative." )
        protected Narrative text;

        /**
         * How the entry list was prepared - whether it is a working list that is suitable for being maintained on an ongoing basis, or if it represents a snapshot of a list of items from another source, or whether it is a prepared list where items may be marked as added, modified or deleted.
         */
        @Child(name = "mode", type = {CodeType.class}, order=6, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="working | snapshot | changes", formalDefinition="How the entry list was prepared - whether it is a working list that is suitable for being maintained on an ongoing basis, or if it represents a snapshot of a list of items from another source, or whether it is a prepared list where items may be marked as added, modified or deleted." )
        @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/list-mode")
        protected Enumeration<ListMode> mode;

        /**
         * Specifies the order applied to the items in the section entries.
         */
        @Child(name = "orderedBy", type = {CodeableConcept.class}, order=7, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Order of section entries", formalDefinition="Specifies the order applied to the items in the section entries." )
        @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/list-order")
        protected CodeableConcept orderedBy;

        /**
         * A reference to the actual resource from which the narrative in the section is derived.
         */
        @Child(name = "entry", type = {Reference.class}, order=8, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
        @Description(shortDefinition="A reference to data that supports this section", formalDefinition="A reference to the actual resource from which the narrative in the section is derived." )
        protected List<Reference> entry;

        /**
         * If the section is empty, why the list is empty. An empty section typically has some text explaining the empty reason.
         */
        @Child(name = "emptyReason", type = {CodeableConcept.class}, order=9, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Why the section is empty", formalDefinition="If the section is empty, why the list is empty. An empty section typically has some text explaining the empty reason." )
        @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/list-empty-reason")
        protected CodeableConcept emptyReason;

        /**
         * A nested sub-section within this section.
         */
        @Child(name = "section", type = {SectionComponent.class}, order=10, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
        @Description(shortDefinition="Nested Section", formalDefinition="A nested sub-section within this section." )
        protected List<SectionComponent> section;

        private static final long serialVersionUID = 911563193L;

    /**
     * Constructor
     */
      public SectionComponent() {
        super();
      }

        /**
         * @return {@link #title} (The label for this particular section.  This will be part of the rendered content for the document, and is often used to build a table of contents.). This is the underlying object with id, value and extensions. The accessor "getTitle" gives direct access to the value
         */
        public StringType getTitleElement() { 
          if (this.title == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create SectionComponent.title");
            else if (Configuration.doAutoCreate())
              this.title = new StringType(); // bb
          return this.title;
        }

        public boolean hasTitleElement() { 
          return this.title != null && !this.title.isEmpty();
        }

        public boolean hasTitle() { 
          return this.title != null && !this.title.isEmpty();
        }

        /**
         * @param value {@link #title} (The label for this particular section.  This will be part of the rendered content for the document, and is often used to build a table of contents.). This is the underlying object with id, value and extensions. The accessor "getTitle" gives direct access to the value
         */
        public SectionComponent setTitleElement(StringType value) { 
          this.title = value;
          return this;
        }

        /**
         * @return The label for this particular section.  This will be part of the rendered content for the document, and is often used to build a table of contents.
         */
        public String getTitle() { 
          return this.title == null ? null : this.title.getValue();
        }

        /**
         * @param value The label for this particular section.  This will be part of the rendered content for the document, and is often used to build a table of contents.
         */
        public SectionComponent setTitle(String value) { 
          if (Utilities.noString(value))
            this.title = null;
          else {
            if (this.title == null)
              this.title = new StringType();
            this.title.setValue(value);
          }
          return this;
        }

        /**
         * @return {@link #code} (A code identifying the kind of content contained within the section. This must be consistent with the section title.)
         */
        public CodeableConcept getCode() { 
          if (this.code == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create SectionComponent.code");
            else if (Configuration.doAutoCreate())
              this.code = new CodeableConcept(); // cc
          return this.code;
        }

        public boolean hasCode() { 
          return this.code != null && !this.code.isEmpty();
        }

        /**
         * @param value {@link #code} (A code identifying the kind of content contained within the section. This must be consistent with the section title.)
         */
        public SectionComponent setCode(CodeableConcept value) { 
          this.code = value;
          return this;
        }

        /**
         * @return {@link #author} (Identifies who is responsible for the information in this section, not necessarily who typed it in.)
         */
        public List<Reference> getAuthor() { 
          if (this.author == null)
            this.author = new ArrayList<Reference>();
          return this.author;
        }

        /**
         * @return Returns a reference to <code>this</code> for easy method chaining
         */
        public SectionComponent setAuthor(List<Reference> theAuthor) { 
          this.author = theAuthor;
          return this;
        }

        public boolean hasAuthor() { 
          if (this.author == null)
            return false;
          for (Reference item : this.author)
            if (!item.isEmpty())
              return true;
          return false;
        }

        public Reference addAuthor() { //3
          Reference t = new Reference();
          if (this.author == null)
            this.author = new ArrayList<Reference>();
          this.author.add(t);
          return t;
        }

        public SectionComponent addAuthor(Reference t) { //3
          if (t == null)
            return this;
          if (this.author == null)
            this.author = new ArrayList<Reference>();
          this.author.add(t);
          return this;
        }

        /**
         * @return The first repetition of repeating field {@link #author}, creating it if it does not already exist {3}
         */
        public Reference getAuthorFirstRep() { 
          if (getAuthor().isEmpty()) {
            addAuthor();
          }
          return getAuthor().get(0);
        }

        /**
         * @return {@link #focus} (The actual focus of the section when it is not the subject of the composition, but instead represents something or someone associated with the subject such as (for a patient subject) a spouse, parent, fetus, or donor. If not focus is specified, the focus is assumed to be focus of the parent section, or, for a section in the Composition itself, the subject of the composition. Sections with a focus SHALL only include resources where the logical subject (patient, subject, focus, etc.) matches the section focus, or the resources have no logical subject (few resources).)
         */
        public Reference getFocus() { 
          if (this.focus == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create SectionComponent.focus");
            else if (Configuration.doAutoCreate())
              this.focus = new Reference(); // cc
          return this.focus;
        }

        public boolean hasFocus() { 
          return this.focus != null && !this.focus.isEmpty();
        }

        /**
         * @param value {@link #focus} (The actual focus of the section when it is not the subject of the composition, but instead represents something or someone associated with the subject such as (for a patient subject) a spouse, parent, fetus, or donor. If not focus is specified, the focus is assumed to be focus of the parent section, or, for a section in the Composition itself, the subject of the composition. Sections with a focus SHALL only include resources where the logical subject (patient, subject, focus, etc.) matches the section focus, or the resources have no logical subject (few resources).)
         */
        public SectionComponent setFocus(Reference value) { 
          this.focus = value;
          return this;
        }

        /**
         * @return {@link #text} (A human-readable narrative that contains the attested content of the section, used to represent the content of the resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to make it "clinically safe" for a human to just read the narrative.)
         */
        public Narrative getText() { 
          if (this.text == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create SectionComponent.text");
            else if (Configuration.doAutoCreate())
              this.text = new Narrative(); // cc
          return this.text;
        }

        public boolean hasText() { 
          return this.text != null && !this.text.isEmpty();
        }

        /**
         * @param value {@link #text} (A human-readable narrative that contains the attested content of the section, used to represent the content of the resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to make it "clinically safe" for a human to just read the narrative.)
         */
        public SectionComponent setText(Narrative value) { 
          this.text = value;
          return this;
        }

        /**
         * @return {@link #mode} (How the entry list was prepared - whether it is a working list that is suitable for being maintained on an ongoing basis, or if it represents a snapshot of a list of items from another source, or whether it is a prepared list where items may be marked as added, modified or deleted.). This is the underlying object with id, value and extensions. The accessor "getMode" gives direct access to the value
         */
        public Enumeration<ListMode> getModeElement() { 
          if (this.mode == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create SectionComponent.mode");
            else if (Configuration.doAutoCreate())
              this.mode = new Enumeration<ListMode>(new ListModeEnumFactory()); // bb
          return this.mode;
        }

        public boolean hasModeElement() { 
          return this.mode != null && !this.mode.isEmpty();
        }

        public boolean hasMode() { 
          return this.mode != null && !this.mode.isEmpty();
        }

        /**
         * @param value {@link #mode} (How the entry list was prepared - whether it is a working list that is suitable for being maintained on an ongoing basis, or if it represents a snapshot of a list of items from another source, or whether it is a prepared list where items may be marked as added, modified or deleted.). This is the underlying object with id, value and extensions. The accessor "getMode" gives direct access to the value
         */
        public SectionComponent setModeElement(Enumeration<ListMode> value) { 
          this.mode = value;
          return this;
        }

        /**
         * @return How the entry list was prepared - whether it is a working list that is suitable for being maintained on an ongoing basis, or if it represents a snapshot of a list of items from another source, or whether it is a prepared list where items may be marked as added, modified or deleted.
         */
        public ListMode getMode() { 
          return this.mode == null ? null : this.mode.getValue();
        }

        /**
         * @param value How the entry list was prepared - whether it is a working list that is suitable for being maintained on an ongoing basis, or if it represents a snapshot of a list of items from another source, or whether it is a prepared list where items may be marked as added, modified or deleted.
         */
        public SectionComponent setMode(ListMode value) { 
          if (value == null)
            this.mode = null;
          else {
            if (this.mode == null)
              this.mode = new Enumeration<ListMode>(new ListModeEnumFactory());
            this.mode.setValue(value);
          }
          return this;
        }

        /**
         * @return {@link #orderedBy} (Specifies the order applied to the items in the section entries.)
         */
        public CodeableConcept getOrderedBy() { 
          if (this.orderedBy == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create SectionComponent.orderedBy");
            else if (Configuration.doAutoCreate())
              this.orderedBy = new CodeableConcept(); // cc
          return this.orderedBy;
        }

        public boolean hasOrderedBy() { 
          return this.orderedBy != null && !this.orderedBy.isEmpty();
        }

        /**
         * @param value {@link #orderedBy} (Specifies the order applied to the items in the section entries.)
         */
        public SectionComponent setOrderedBy(CodeableConcept value) { 
          this.orderedBy = value;
          return this;
        }

        /**
         * @return {@link #entry} (A reference to the actual resource from which the narrative in the section is derived.)
         */
        public List<Reference> getEntry() { 
          if (this.entry == null)
            this.entry = new ArrayList<Reference>();
          return this.entry;
        }

        /**
         * @return Returns a reference to <code>this</code> for easy method chaining
         */
        public SectionComponent setEntry(List<Reference> theEntry) { 
          this.entry = theEntry;
          return this;
        }

        public boolean hasEntry() { 
          if (this.entry == null)
            return false;
          for (Reference item : this.entry)
            if (!item.isEmpty())
              return true;
          return false;
        }

        public Reference addEntry() { //3
          Reference t = new Reference();
          if (this.entry == null)
            this.entry = new ArrayList<Reference>();
          this.entry.add(t);
          return t;
        }

        public SectionComponent addEntry(Reference t) { //3
          if (t == null)
            return this;
          if (this.entry == null)
            this.entry = new ArrayList<Reference>();
          this.entry.add(t);
          return this;
        }

        /**
         * @return The first repetition of repeating field {@link #entry}, creating it if it does not already exist {3}
         */
        public Reference getEntryFirstRep() { 
          if (getEntry().isEmpty()) {
            addEntry();
          }
          return getEntry().get(0);
        }

        /**
         * @return {@link #emptyReason} (If the section is empty, why the list is empty. An empty section typically has some text explaining the empty reason.)
         */
        public CodeableConcept getEmptyReason() { 
          if (this.emptyReason == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create SectionComponent.emptyReason");
            else if (Configuration.doAutoCreate())
              this.emptyReason = new CodeableConcept(); // cc
          return this.emptyReason;
        }

        public boolean hasEmptyReason() { 
          return this.emptyReason != null && !this.emptyReason.isEmpty();
        }

        /**
         * @param value {@link #emptyReason} (If the section is empty, why the list is empty. An empty section typically has some text explaining the empty reason.)
         */
        public SectionComponent setEmptyReason(CodeableConcept value) { 
          this.emptyReason = value;
          return this;
        }

        /**
         * @return {@link #section} (A nested sub-section within this section.)
         */
        public List<SectionComponent> getSection() { 
          if (this.section == null)
            this.section = new ArrayList<SectionComponent>();
          return this.section;
        }

        /**
         * @return Returns a reference to <code>this</code> for easy method chaining
         */
        public SectionComponent setSection(List<SectionComponent> theSection) { 
          this.section = theSection;
          return this;
        }

        public boolean hasSection() { 
          if (this.section == null)
            return false;
          for (SectionComponent item : this.section)
            if (!item.isEmpty())
              return true;
          return false;
        }

        public SectionComponent addSection() { //3
          SectionComponent t = new SectionComponent();
          if (this.section == null)
            this.section = new ArrayList<SectionComponent>();
          this.section.add(t);
          return t;
        }

        public SectionComponent addSection(SectionComponent t) { //3
          if (t == null)
            return this;
          if (this.section == null)
            this.section = new ArrayList<SectionComponent>();
          this.section.add(t);
          return this;
        }

        /**
         * @return The first repetition of repeating field {@link #section}, creating it if it does not already exist {3}
         */
        public SectionComponent getSectionFirstRep() { 
          if (getSection().isEmpty()) {
            addSection();
          }
          return getSection().get(0);
        }

        protected void listChildren(List<Property> children) {
          super.listChildren(children);
          children.add(new Property("title", "string", "The label for this particular section.  This will be part of the rendered content for the document, and is often used to build a table of contents.", 0, 1, title));
          children.add(new Property("code", "CodeableConcept", "A code identifying the kind of content contained within the section. This must be consistent with the section title.", 0, 1, code));
          children.add(new Property("author", "Reference(Practitioner|PractitionerRole|Device|Patient|RelatedPerson|Organization)", "Identifies who is responsible for the information in this section, not necessarily who typed it in.", 0, java.lang.Integer.MAX_VALUE, author));
          children.add(new Property("focus", "Reference(Any)", "The actual focus of the section when it is not the subject of the composition, but instead represents something or someone associated with the subject such as (for a patient subject) a spouse, parent, fetus, or donor. If not focus is specified, the focus is assumed to be focus of the parent section, or, for a section in the Composition itself, the subject of the composition. Sections with a focus SHALL only include resources where the logical subject (patient, subject, focus, etc.) matches the section focus, or the resources have no logical subject (few resources).", 0, 1, focus));
          children.add(new Property("text", "Narrative", "A human-readable narrative that contains the attested content of the section, used to represent the content of the resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to make it \"clinically safe\" for a human to just read the narrative.", 0, 1, text));
          children.add(new Property("mode", "code", "How the entry list was prepared - whether it is a working list that is suitable for being maintained on an ongoing basis, or if it represents a snapshot of a list of items from another source, or whether it is a prepared list where items may be marked as added, modified or deleted.", 0, 1, mode));
          children.add(new Property("orderedBy", "CodeableConcept", "Specifies the order applied to the items in the section entries.", 0, 1, orderedBy));
          children.add(new Property("entry", "Reference(Any)", "A reference to the actual resource from which the narrative in the section is derived.", 0, java.lang.Integer.MAX_VALUE, entry));
          children.add(new Property("emptyReason", "CodeableConcept", "If the section is empty, why the list is empty. An empty section typically has some text explaining the empty reason.", 0, 1, emptyReason));
          children.add(new Property("section", "@Composition.section", "A nested sub-section within this section.", 0, java.lang.Integer.MAX_VALUE, section));
        }

        @Override
        public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
          switch (_hash) {
          case 110371416: /*title*/  return new Property("title", "string", "The label for this particular section.  This will be part of the rendered content for the document, and is often used to build a table of contents.", 0, 1, title);
          case 3059181: /*code*/  return new Property("code", "CodeableConcept", "A code identifying the kind of content contained within the section. This must be consistent with the section title.", 0, 1, code);
          case -1406328437: /*author*/  return new Property("author", "Reference(Practitioner|PractitionerRole|Device|Patient|RelatedPerson|Organization)", "Identifies who is responsible for the information in this section, not necessarily who typed it in.", 0, java.lang.Integer.MAX_VALUE, author);
          case 97604824: /*focus*/  return new Property("focus", "Reference(Any)", "The actual focus of the section when it is not the subject of the composition, but instead represents something or someone associated with the subject such as (for a patient subject) a spouse, parent, fetus, or donor. If not focus is specified, the focus is assumed to be focus of the parent section, or, for a section in the Composition itself, the subject of the composition. Sections with a focus SHALL only include resources where the logical subject (patient, subject, focus, etc.) matches the section focus, or the resources have no logical subject (few resources).", 0, 1, focus);
          case 3556653: /*text*/  return new Property("text", "Narrative", "A human-readable narrative that contains the attested content of the section, used to represent the content of the resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to make it \"clinically safe\" for a human to just read the narrative.", 0, 1, text);
          case 3357091: /*mode*/  return new Property("mode", "code", "How the entry list was prepared - whether it is a working list that is suitable for being maintained on an ongoing basis, or if it represents a snapshot of a list of items from another source, or whether it is a prepared list where items may be marked as added, modified or deleted.", 0, 1, mode);
          case -391079516: /*orderedBy*/  return new Property("orderedBy", "CodeableConcept", "Specifies the order applied to the items in the section entries.", 0, 1, orderedBy);
          case 96667762: /*entry*/  return new Property("entry", "Reference(Any)", "A reference to the actual resource from which the narrative in the section is derived.", 0, java.lang.Integer.MAX_VALUE, entry);
          case 1140135409: /*emptyReason*/  return new Property("emptyReason", "CodeableConcept", "If the section is empty, why the list is empty. An empty section typically has some text explaining the empty reason.", 0, 1, emptyReason);
          case 1970241253: /*section*/  return new Property("section", "@Composition.section", "A nested sub-section within this section.", 0, java.lang.Integer.MAX_VALUE, section);
          default: return super.getNamedProperty(_hash, _name, _checkValid);
          }

        }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case 110371416: /*title*/ return this.title == null ? new Base[0] : new Base[] {this.title}; // StringType
        case 3059181: /*code*/ return this.code == null ? new Base[0] : new Base[] {this.code}; // CodeableConcept
        case -1406328437: /*author*/ return this.author == null ? new Base[0] : this.author.toArray(new Base[this.author.size()]); // Reference
        case 97604824: /*focus*/ return this.focus == null ? new Base[0] : new Base[] {this.focus}; // Reference
        case 3556653: /*text*/ return this.text == null ? new Base[0] : new Base[] {this.text}; // Narrative
        case 3357091: /*mode*/ return this.mode == null ? new Base[0] : new Base[] {this.mode}; // Enumeration<ListMode>
        case -391079516: /*orderedBy*/ return this.orderedBy == null ? new Base[0] : new Base[] {this.orderedBy}; // CodeableConcept
        case 96667762: /*entry*/ return this.entry == null ? new Base[0] : this.entry.toArray(new Base[this.entry.size()]); // Reference
        case 1140135409: /*emptyReason*/ return this.emptyReason == null ? new Base[0] : new Base[] {this.emptyReason}; // CodeableConcept
        case 1970241253: /*section*/ return this.section == null ? new Base[0] : this.section.toArray(new Base[this.section.size()]); // SectionComponent
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public Base setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case 110371416: // title
          this.title = TypeConvertor.castToString(value); // StringType
          return value;
        case 3059181: // code
          this.code = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
          return value;
        case -1406328437: // author
          this.getAuthor().add(TypeConvertor.castToReference(value)); // Reference
          return value;
        case 97604824: // focus
          this.focus = TypeConvertor.castToReference(value); // Reference
          return value;
        case 3556653: // text
          this.text = TypeConvertor.castToNarrative(value); // Narrative
          return value;
        case 3357091: // mode
          value = new ListModeEnumFactory().fromType(TypeConvertor.castToCode(value));
          this.mode = (Enumeration) value; // Enumeration<ListMode>
          return value;
        case -391079516: // orderedBy
          this.orderedBy = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
          return value;
        case 96667762: // entry
          this.getEntry().add(TypeConvertor.castToReference(value)); // Reference
          return value;
        case 1140135409: // emptyReason
          this.emptyReason = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
          return value;
        case 1970241253: // section
          this.getSection().add((SectionComponent) value); // SectionComponent
          return value;
        default: return super.setProperty(hash, name, value);
        }

      }

      @Override
      public Base setProperty(String name, Base value) throws FHIRException {
        if (name.equals("title")) {
          this.title = TypeConvertor.castToString(value); // StringType
        } else if (name.equals("code")) {
          this.code = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
        } else if (name.equals("author")) {
          this.getAuthor().add(TypeConvertor.castToReference(value));
        } else if (name.equals("focus")) {
          this.focus = TypeConvertor.castToReference(value); // Reference
        } else if (name.equals("text")) {
          this.text = TypeConvertor.castToNarrative(value); // Narrative
        } else if (name.equals("mode")) {
          value = new ListModeEnumFactory().fromType(TypeConvertor.castToCode(value));
          this.mode = (Enumeration) value; // Enumeration<ListMode>
        } else if (name.equals("orderedBy")) {
          this.orderedBy = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
        } else if (name.equals("entry")) {
          this.getEntry().add(TypeConvertor.castToReference(value));
        } else if (name.equals("emptyReason")) {
          this.emptyReason = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
        } else if (name.equals("section")) {
          this.getSection().add((SectionComponent) value);
        } else
          return super.setProperty(name, value);
        return value;
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 110371416:  return getTitleElement();
        case 3059181:  return getCode();
        case -1406328437:  return addAuthor(); 
        case 97604824:  return getFocus();
        case 3556653:  return getText();
        case 3357091:  return getModeElement();
        case -391079516:  return getOrderedBy();
        case 96667762:  return addEntry(); 
        case 1140135409:  return getEmptyReason();
        case 1970241253:  return addSection(); 
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 110371416: /*title*/ return new String[] {"string"};
        case 3059181: /*code*/ return new String[] {"CodeableConcept"};
        case -1406328437: /*author*/ return new String[] {"Reference"};
        case 97604824: /*focus*/ return new String[] {"Reference"};
        case 3556653: /*text*/ return new String[] {"Narrative"};
        case 3357091: /*mode*/ return new String[] {"code"};
        case -391079516: /*orderedBy*/ return new String[] {"CodeableConcept"};
        case 96667762: /*entry*/ return new String[] {"Reference"};
        case 1140135409: /*emptyReason*/ return new String[] {"CodeableConcept"};
        case 1970241253: /*section*/ return new String[] {"@Composition.section"};
        default: return super.getTypesForProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("title")) {
          throw new FHIRException("Cannot call addChild on a primitive type Composition.section.title");
        }
        else if (name.equals("code")) {
          this.code = new CodeableConcept();
          return this.code;
        }
        else if (name.equals("author")) {
          return addAuthor();
        }
        else if (name.equals("focus")) {
          this.focus = new Reference();
          return this.focus;
        }
        else if (name.equals("text")) {
          this.text = new Narrative();
          return this.text;
        }
        else if (name.equals("mode")) {
          throw new FHIRException("Cannot call addChild on a primitive type Composition.section.mode");
        }
        else if (name.equals("orderedBy")) {
          this.orderedBy = new CodeableConcept();
          return this.orderedBy;
        }
        else if (name.equals("entry")) {
          return addEntry();
        }
        else if (name.equals("emptyReason")) {
          this.emptyReason = new CodeableConcept();
          return this.emptyReason;
        }
        else if (name.equals("section")) {
          return addSection();
        }
        else
          return super.addChild(name);
      }

      public SectionComponent copy() {
        SectionComponent dst = new SectionComponent();
        copyValues(dst);
        return dst;
      }

      public void copyValues(SectionComponent dst) {
        super.copyValues(dst);
        dst.title = title == null ? null : title.copy();
        dst.code = code == null ? null : code.copy();
        if (author != null) {
          dst.author = new ArrayList<Reference>();
          for (Reference i : author)
            dst.author.add(i.copy());
        };
        dst.focus = focus == null ? null : focus.copy();
        dst.text = text == null ? null : text.copy();
        dst.mode = mode == null ? null : mode.copy();
        dst.orderedBy = orderedBy == null ? null : orderedBy.copy();
        if (entry != null) {
          dst.entry = new ArrayList<Reference>();
          for (Reference i : entry)
            dst.entry.add(i.copy());
        };
        dst.emptyReason = emptyReason == null ? null : emptyReason.copy();
        if (section != null) {
          dst.section = new ArrayList<SectionComponent>();
          for (SectionComponent i : section)
            dst.section.add(i.copy());
        };
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof SectionComponent))
          return false;
        SectionComponent o = (SectionComponent) other_;
        return compareDeep(title, o.title, true) && compareDeep(code, o.code, true) && compareDeep(author, o.author, true)
           && compareDeep(focus, o.focus, true) && compareDeep(text, o.text, true) && compareDeep(mode, o.mode, true)
           && compareDeep(orderedBy, o.orderedBy, true) && compareDeep(entry, o.entry, true) && compareDeep(emptyReason, o.emptyReason, true)
           && compareDeep(section, o.section, true);
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof SectionComponent))
          return false;
        SectionComponent o = (SectionComponent) other_;
        return compareValues(title, o.title, true) && compareValues(mode, o.mode, true);
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(title, code, author, focus
          , text, mode, orderedBy, entry, emptyReason, section);
      }

  public String fhirType() {
    return "Composition.section";

  }

  }

    /**
     * A version-independent identifier for the Composition. This identifier stays constant as the composition is changed over time.
     */
    @Child(name = "identifier", type = {Identifier.class}, order=0, min=0, max=1, modifier=false, summary=true)
    @Description(shortDefinition="Version-independent identifier for the Composition", formalDefinition="A version-independent identifier for the Composition. This identifier stays constant as the composition is changed over time." )
    protected Identifier identifier;

    /**
     * The workflow/clinical status of this composition. The status is a marker for the clinical standing of the document.
     */
    @Child(name = "status", type = {CodeType.class}, order=1, min=1, max=1, modifier=true, summary=true)
    @Description(shortDefinition="preliminary | final | amended | entered-in-error", formalDefinition="The workflow/clinical status of this composition. The status is a marker for the clinical standing of the document." )
    @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/composition-status")
    protected Enumeration<CompositionStatus> status;

    /**
     * Specifies the particular kind of composition (e.g. History and Physical, Discharge Summary, Progress Note). This usually equates to the purpose of making the composition.
     */
    @Child(name = "type", type = {CodeableConcept.class}, order=2, min=1, max=1, modifier=false, summary=true)
    @Description(shortDefinition="Kind of composition (LOINC if possible)", formalDefinition="Specifies the particular kind of composition (e.g. History and Physical, Discharge Summary, Progress Note). This usually equates to the purpose of making the composition." )
    @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/doc-typecodes")
    protected CodeableConcept type;

    /**
     * A categorization for the type of the composition - helps for indexing and searching. This may be implied by or derived from the code specified in the Composition Type.
     */
    @Child(name = "category", type = {CodeableConcept.class}, order=3, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=true)
    @Description(shortDefinition="Categorization of Composition", formalDefinition="A categorization for the type of the composition - helps for indexing and searching. This may be implied by or derived from the code specified in the Composition Type." )
    @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/document-classcodes")
    protected List<CodeableConcept> category;

    /**
     * Who or what the composition is about. The composition can be about a person, (patient or healthcare practitioner), a device (e.g. a machine) or even a group of subjects (such as a document about a herd of livestock, or a set of patients that share a common exposure).
     */
    @Child(name = "subject", type = {Reference.class}, order=4, min=0, max=1, modifier=false, summary=true)
    @Description(shortDefinition="Who and/or what the composition is about", formalDefinition="Who or what the composition is about. The composition can be about a person, (patient or healthcare practitioner), a device (e.g. a machine) or even a group of subjects (such as a document about a herd of livestock, or a set of patients that share a common exposure)." )
    protected Reference subject;

    /**
     * Describes the clinical encounter or type of care this documentation is associated with.
     */
    @Child(name = "encounter", type = {Encounter.class}, order=5, min=0, max=1, modifier=false, summary=true)
    @Description(shortDefinition="Context of the Composition", formalDefinition="Describes the clinical encounter or type of care this documentation is associated with." )
    protected Reference encounter;

    /**
     * The composition editing time, when the composition was last logically changed by the author.
     */
    @Child(name = "date", type = {DateTimeType.class}, order=6, min=1, max=1, modifier=false, summary=true)
    @Description(shortDefinition="Composition editing time", formalDefinition="The composition editing time, when the composition was last logically changed by the author." )
    protected DateTimeType date;

    /**
     * Identifies who is responsible for the information in the composition, not necessarily who typed it in.
     */
    @Child(name = "author", type = {Practitioner.class, PractitionerRole.class, Device.class, Patient.class, RelatedPerson.class, Organization.class}, order=7, min=1, max=Child.MAX_UNLIMITED, modifier=false, summary=true)
    @Description(shortDefinition="Who and/or what authored the composition", formalDefinition="Identifies who is responsible for the information in the composition, not necessarily who typed it in." )
    protected List<Reference> author;

    /**
     * Official human-readable label for the composition.
     */
    @Child(name = "title", type = {StringType.class}, order=8, min=1, max=1, modifier=false, summary=true)
    @Description(shortDefinition="Human Readable name/title", formalDefinition="Official human-readable label for the composition." )
    protected StringType title;

    /**
     * The code specifying the level of confidentiality of the Composition.
     */
    @Child(name = "confidentiality", type = {CodeType.class}, order=9, min=0, max=1, modifier=false, summary=true)
    @Description(shortDefinition="As defined by affinity domain", formalDefinition="The code specifying the level of confidentiality of the Composition." )
    @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://terminology.hl7.org/ValueSet/v3-ConfidentialityClassification")
    protected Enumeration<V3ConfidentialityClassification> confidentiality;

    /**
     * A participant who has attested to the accuracy of the composition/document.
     */
    @Child(name = "attester", type = {}, order=10, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
    @Description(shortDefinition="Attests to accuracy of composition", formalDefinition="A participant who has attested to the accuracy of the composition/document." )
    protected List<CompositionAttesterComponent> attester;

    /**
     * Identifies the organization or group who is responsible for ongoing maintenance of and access to the composition/document information.
     */
    @Child(name = "custodian", type = {Organization.class}, order=11, min=0, max=1, modifier=false, summary=true)
    @Description(shortDefinition="Organization which maintains the composition", formalDefinition="Identifies the organization or group who is responsible for ongoing maintenance of and access to the composition/document information." )
    protected Reference custodian;

    /**
     * Relationships that this composition has with other compositions or documents that already exist.
     */
    @Child(name = "relatesTo", type = {}, order=12, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
    @Description(shortDefinition="Relationships to other compositions/documents", formalDefinition="Relationships that this composition has with other compositions or documents that already exist." )
    protected List<CompositionRelatesToComponent> relatesTo;

    /**
     * The clinical service, such as a colonoscopy or an appendectomy, being documented.
     */
    @Child(name = "event", type = {}, order=13, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=true)
    @Description(shortDefinition="The clinical service(s) being documented", formalDefinition="The clinical service, such as a colonoscopy or an appendectomy, being documented." )
    protected List<CompositionEventComponent> event;

    /**
     * The root of the sections that make up the composition.
     */
    @Child(name = "section", type = {}, order=14, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
    @Description(shortDefinition="Composition is broken into sections", formalDefinition="The root of the sections that make up the composition." )
    protected List<SectionComponent> section;

    private static final long serialVersionUID = 432957183L;

  /**
   * Constructor
   */
    public Composition() {
      super();
    }

  /**
   * Constructor
   */
    public Composition(CompositionStatus status, CodeableConcept type, Date date, Reference author, String title) {
      super();
      this.setStatus(status);
      this.setType(type);
      this.setDate(date);
      this.addAuthor(author);
      this.setTitle(title);
    }

    /**
     * @return {@link #identifier} (A version-independent identifier for the Composition. This identifier stays constant as the composition is changed over time.)
     */
    public Identifier getIdentifier() { 
      if (this.identifier == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Composition.identifier");
        else if (Configuration.doAutoCreate())
          this.identifier = new Identifier(); // cc
      return this.identifier;
    }

    public boolean hasIdentifier() { 
      return this.identifier != null && !this.identifier.isEmpty();
    }

    /**
     * @param value {@link #identifier} (A version-independent identifier for the Composition. This identifier stays constant as the composition is changed over time.)
     */
    public Composition setIdentifier(Identifier value) { 
      this.identifier = value;
      return this;
    }

    /**
     * @return {@link #status} (The workflow/clinical status of this composition. The status is a marker for the clinical standing of the document.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public Enumeration<CompositionStatus> getStatusElement() { 
      if (this.status == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Composition.status");
        else if (Configuration.doAutoCreate())
          this.status = new Enumeration<CompositionStatus>(new CompositionStatusEnumFactory()); // bb
      return this.status;
    }

    public boolean hasStatusElement() { 
      return this.status != null && !this.status.isEmpty();
    }

    public boolean hasStatus() { 
      return this.status != null && !this.status.isEmpty();
    }

    /**
     * @param value {@link #status} (The workflow/clinical status of this composition. The status is a marker for the clinical standing of the document.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public Composition setStatusElement(Enumeration<CompositionStatus> value) { 
      this.status = value;
      return this;
    }

    /**
     * @return The workflow/clinical status of this composition. The status is a marker for the clinical standing of the document.
     */
    public CompositionStatus getStatus() { 
      return this.status == null ? null : this.status.getValue();
    }

    /**
     * @param value The workflow/clinical status of this composition. The status is a marker for the clinical standing of the document.
     */
    public Composition setStatus(CompositionStatus value) { 
        if (this.status == null)
          this.status = new Enumeration<CompositionStatus>(new CompositionStatusEnumFactory());
        this.status.setValue(value);
      return this;
    }

    /**
     * @return {@link #type} (Specifies the particular kind of composition (e.g. History and Physical, Discharge Summary, Progress Note). This usually equates to the purpose of making the composition.)
     */
    public CodeableConcept getType() { 
      if (this.type == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Composition.type");
        else if (Configuration.doAutoCreate())
          this.type = new CodeableConcept(); // cc
      return this.type;
    }

    public boolean hasType() { 
      return this.type != null && !this.type.isEmpty();
    }

    /**
     * @param value {@link #type} (Specifies the particular kind of composition (e.g. History and Physical, Discharge Summary, Progress Note). This usually equates to the purpose of making the composition.)
     */
    public Composition setType(CodeableConcept value) { 
      this.type = value;
      return this;
    }

    /**
     * @return {@link #category} (A categorization for the type of the composition - helps for indexing and searching. This may be implied by or derived from the code specified in the Composition Type.)
     */
    public List<CodeableConcept> getCategory() { 
      if (this.category == null)
        this.category = new ArrayList<CodeableConcept>();
      return this.category;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public Composition setCategory(List<CodeableConcept> theCategory) { 
      this.category = theCategory;
      return this;
    }

    public boolean hasCategory() { 
      if (this.category == null)
        return false;
      for (CodeableConcept item : this.category)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public CodeableConcept addCategory() { //3
      CodeableConcept t = new CodeableConcept();
      if (this.category == null)
        this.category = new ArrayList<CodeableConcept>();
      this.category.add(t);
      return t;
    }

    public Composition addCategory(CodeableConcept t) { //3
      if (t == null)
        return this;
      if (this.category == null)
        this.category = new ArrayList<CodeableConcept>();
      this.category.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #category}, creating it if it does not already exist {3}
     */
    public CodeableConcept getCategoryFirstRep() { 
      if (getCategory().isEmpty()) {
        addCategory();
      }
      return getCategory().get(0);
    }

    /**
     * @return {@link #subject} (Who or what the composition is about. The composition can be about a person, (patient or healthcare practitioner), a device (e.g. a machine) or even a group of subjects (such as a document about a herd of livestock, or a set of patients that share a common exposure).)
     */
    public Reference getSubject() { 
      if (this.subject == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Composition.subject");
        else if (Configuration.doAutoCreate())
          this.subject = new Reference(); // cc
      return this.subject;
    }

    public boolean hasSubject() { 
      return this.subject != null && !this.subject.isEmpty();
    }

    /**
     * @param value {@link #subject} (Who or what the composition is about. The composition can be about a person, (patient or healthcare practitioner), a device (e.g. a machine) or even a group of subjects (such as a document about a herd of livestock, or a set of patients that share a common exposure).)
     */
    public Composition setSubject(Reference value) { 
      this.subject = value;
      return this;
    }

    /**
     * @return {@link #encounter} (Describes the clinical encounter or type of care this documentation is associated with.)
     */
    public Reference getEncounter() { 
      if (this.encounter == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Composition.encounter");
        else if (Configuration.doAutoCreate())
          this.encounter = new Reference(); // cc
      return this.encounter;
    }

    public boolean hasEncounter() { 
      return this.encounter != null && !this.encounter.isEmpty();
    }

    /**
     * @param value {@link #encounter} (Describes the clinical encounter or type of care this documentation is associated with.)
     */
    public Composition setEncounter(Reference value) { 
      this.encounter = value;
      return this;
    }

    /**
     * @return {@link #date} (The composition editing time, when the composition was last logically changed by the author.). This is the underlying object with id, value and extensions. The accessor "getDate" gives direct access to the value
     */
    public DateTimeType getDateElement() { 
      if (this.date == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Composition.date");
        else if (Configuration.doAutoCreate())
          this.date = new DateTimeType(); // bb
      return this.date;
    }

    public boolean hasDateElement() { 
      return this.date != null && !this.date.isEmpty();
    }

    public boolean hasDate() { 
      return this.date != null && !this.date.isEmpty();
    }

    /**
     * @param value {@link #date} (The composition editing time, when the composition was last logically changed by the author.). This is the underlying object with id, value and extensions. The accessor "getDate" gives direct access to the value
     */
    public Composition setDateElement(DateTimeType value) { 
      this.date = value;
      return this;
    }

    /**
     * @return The composition editing time, when the composition was last logically changed by the author.
     */
    public Date getDate() { 
      return this.date == null ? null : this.date.getValue();
    }

    /**
     * @param value The composition editing time, when the composition was last logically changed by the author.
     */
    public Composition setDate(Date value) { 
        if (this.date == null)
          this.date = new DateTimeType();
        this.date.setValue(value);
      return this;
    }

    /**
     * @return {@link #author} (Identifies who is responsible for the information in the composition, not necessarily who typed it in.)
     */
    public List<Reference> getAuthor() { 
      if (this.author == null)
        this.author = new ArrayList<Reference>();
      return this.author;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public Composition setAuthor(List<Reference> theAuthor) { 
      this.author = theAuthor;
      return this;
    }

    public boolean hasAuthor() { 
      if (this.author == null)
        return false;
      for (Reference item : this.author)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public Reference addAuthor() { //3
      Reference t = new Reference();
      if (this.author == null)
        this.author = new ArrayList<Reference>();
      this.author.add(t);
      return t;
    }

    public Composition addAuthor(Reference t) { //3
      if (t == null)
        return this;
      if (this.author == null)
        this.author = new ArrayList<Reference>();
      this.author.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #author}, creating it if it does not already exist {3}
     */
    public Reference getAuthorFirstRep() { 
      if (getAuthor().isEmpty()) {
        addAuthor();
      }
      return getAuthor().get(0);
    }

    /**
     * @return {@link #title} (Official human-readable label for the composition.). This is the underlying object with id, value and extensions. The accessor "getTitle" gives direct access to the value
     */
    public StringType getTitleElement() { 
      if (this.title == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Composition.title");
        else if (Configuration.doAutoCreate())
          this.title = new StringType(); // bb
      return this.title;
    }

    public boolean hasTitleElement() { 
      return this.title != null && !this.title.isEmpty();
    }

    public boolean hasTitle() { 
      return this.title != null && !this.title.isEmpty();
    }

    /**
     * @param value {@link #title} (Official human-readable label for the composition.). This is the underlying object with id, value and extensions. The accessor "getTitle" gives direct access to the value
     */
    public Composition setTitleElement(StringType value) { 
      this.title = value;
      return this;
    }

    /**
     * @return Official human-readable label for the composition.
     */
    public String getTitle() { 
      return this.title == null ? null : this.title.getValue();
    }

    /**
     * @param value Official human-readable label for the composition.
     */
    public Composition setTitle(String value) { 
        if (this.title == null)
          this.title = new StringType();
        this.title.setValue(value);
      return this;
    }

    /**
     * @return {@link #confidentiality} (The code specifying the level of confidentiality of the Composition.). This is the underlying object with id, value and extensions. The accessor "getConfidentiality" gives direct access to the value
     */
    public Enumeration<V3ConfidentialityClassification> getConfidentialityElement() { 
      if (this.confidentiality == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Composition.confidentiality");
        else if (Configuration.doAutoCreate())
          this.confidentiality = new Enumeration<V3ConfidentialityClassification>(new V3ConfidentialityClassificationEnumFactory()); // bb
      return this.confidentiality;
    }

    public boolean hasConfidentialityElement() { 
      return this.confidentiality != null && !this.confidentiality.isEmpty();
    }

    public boolean hasConfidentiality() { 
      return this.confidentiality != null && !this.confidentiality.isEmpty();
    }

    /**
     * @param value {@link #confidentiality} (The code specifying the level of confidentiality of the Composition.). This is the underlying object with id, value and extensions. The accessor "getConfidentiality" gives direct access to the value
     */
    public Composition setConfidentialityElement(Enumeration<V3ConfidentialityClassification> value) { 
      this.confidentiality = value;
      return this;
    }

    /**
     * @return The code specifying the level of confidentiality of the Composition.
     */
    public V3ConfidentialityClassification getConfidentiality() { 
      return this.confidentiality == null ? null : this.confidentiality.getValue();
    }

    /**
     * @param value The code specifying the level of confidentiality of the Composition.
     */
    public Composition setConfidentiality(V3ConfidentialityClassification value) { 
      if (value == null)
        this.confidentiality = null;
      else {
        if (this.confidentiality == null)
          this.confidentiality = new Enumeration<V3ConfidentialityClassification>(new V3ConfidentialityClassificationEnumFactory());
        this.confidentiality.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #attester} (A participant who has attested to the accuracy of the composition/document.)
     */
    public List<CompositionAttesterComponent> getAttester() { 
      if (this.attester == null)
        this.attester = new ArrayList<CompositionAttesterComponent>();
      return this.attester;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public Composition setAttester(List<CompositionAttesterComponent> theAttester) { 
      this.attester = theAttester;
      return this;
    }

    public boolean hasAttester() { 
      if (this.attester == null)
        return false;
      for (CompositionAttesterComponent item : this.attester)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public CompositionAttesterComponent addAttester() { //3
      CompositionAttesterComponent t = new CompositionAttesterComponent();
      if (this.attester == null)
        this.attester = new ArrayList<CompositionAttesterComponent>();
      this.attester.add(t);
      return t;
    }

    public Composition addAttester(CompositionAttesterComponent t) { //3
      if (t == null)
        return this;
      if (this.attester == null)
        this.attester = new ArrayList<CompositionAttesterComponent>();
      this.attester.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #attester}, creating it if it does not already exist {3}
     */
    public CompositionAttesterComponent getAttesterFirstRep() { 
      if (getAttester().isEmpty()) {
        addAttester();
      }
      return getAttester().get(0);
    }

    /**
     * @return {@link #custodian} (Identifies the organization or group who is responsible for ongoing maintenance of and access to the composition/document information.)
     */
    public Reference getCustodian() { 
      if (this.custodian == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Composition.custodian");
        else if (Configuration.doAutoCreate())
          this.custodian = new Reference(); // cc
      return this.custodian;
    }

    public boolean hasCustodian() { 
      return this.custodian != null && !this.custodian.isEmpty();
    }

    /**
     * @param value {@link #custodian} (Identifies the organization or group who is responsible for ongoing maintenance of and access to the composition/document information.)
     */
    public Composition setCustodian(Reference value) { 
      this.custodian = value;
      return this;
    }

    /**
     * @return {@link #relatesTo} (Relationships that this composition has with other compositions or documents that already exist.)
     */
    public List<CompositionRelatesToComponent> getRelatesTo() { 
      if (this.relatesTo == null)
        this.relatesTo = new ArrayList<CompositionRelatesToComponent>();
      return this.relatesTo;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public Composition setRelatesTo(List<CompositionRelatesToComponent> theRelatesTo) { 
      this.relatesTo = theRelatesTo;
      return this;
    }

    public boolean hasRelatesTo() { 
      if (this.relatesTo == null)
        return false;
      for (CompositionRelatesToComponent item : this.relatesTo)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public CompositionRelatesToComponent addRelatesTo() { //3
      CompositionRelatesToComponent t = new CompositionRelatesToComponent();
      if (this.relatesTo == null)
        this.relatesTo = new ArrayList<CompositionRelatesToComponent>();
      this.relatesTo.add(t);
      return t;
    }

    public Composition addRelatesTo(CompositionRelatesToComponent t) { //3
      if (t == null)
        return this;
      if (this.relatesTo == null)
        this.relatesTo = new ArrayList<CompositionRelatesToComponent>();
      this.relatesTo.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #relatesTo}, creating it if it does not already exist {3}
     */
    public CompositionRelatesToComponent getRelatesToFirstRep() { 
      if (getRelatesTo().isEmpty()) {
        addRelatesTo();
      }
      return getRelatesTo().get(0);
    }

    /**
     * @return {@link #event} (The clinical service, such as a colonoscopy or an appendectomy, being documented.)
     */
    public List<CompositionEventComponent> getEvent() { 
      if (this.event == null)
        this.event = new ArrayList<CompositionEventComponent>();
      return this.event;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public Composition setEvent(List<CompositionEventComponent> theEvent) { 
      this.event = theEvent;
      return this;
    }

    public boolean hasEvent() { 
      if (this.event == null)
        return false;
      for (CompositionEventComponent item : this.event)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public CompositionEventComponent addEvent() { //3
      CompositionEventComponent t = new CompositionEventComponent();
      if (this.event == null)
        this.event = new ArrayList<CompositionEventComponent>();
      this.event.add(t);
      return t;
    }

    public Composition addEvent(CompositionEventComponent t) { //3
      if (t == null)
        return this;
      if (this.event == null)
        this.event = new ArrayList<CompositionEventComponent>();
      this.event.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #event}, creating it if it does not already exist {3}
     */
    public CompositionEventComponent getEventFirstRep() { 
      if (getEvent().isEmpty()) {
        addEvent();
      }
      return getEvent().get(0);
    }

    /**
     * @return {@link #section} (The root of the sections that make up the composition.)
     */
    public List<SectionComponent> getSection() { 
      if (this.section == null)
        this.section = new ArrayList<SectionComponent>();
      return this.section;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public Composition setSection(List<SectionComponent> theSection) { 
      this.section = theSection;
      return this;
    }

    public boolean hasSection() { 
      if (this.section == null)
        return false;
      for (SectionComponent item : this.section)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public SectionComponent addSection() { //3
      SectionComponent t = new SectionComponent();
      if (this.section == null)
        this.section = new ArrayList<SectionComponent>();
      this.section.add(t);
      return t;
    }

    public Composition addSection(SectionComponent t) { //3
      if (t == null)
        return this;
      if (this.section == null)
        this.section = new ArrayList<SectionComponent>();
      this.section.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #section}, creating it if it does not already exist {3}
     */
    public SectionComponent getSectionFirstRep() { 
      if (getSection().isEmpty()) {
        addSection();
      }
      return getSection().get(0);
    }

      protected void listChildren(List<Property> children) {
        super.listChildren(children);
        children.add(new Property("identifier", "Identifier", "A version-independent identifier for the Composition. This identifier stays constant as the composition is changed over time.", 0, 1, identifier));
        children.add(new Property("status", "code", "The workflow/clinical status of this composition. The status is a marker for the clinical standing of the document.", 0, 1, status));
        children.add(new Property("type", "CodeableConcept", "Specifies the particular kind of composition (e.g. History and Physical, Discharge Summary, Progress Note). This usually equates to the purpose of making the composition.", 0, 1, type));
        children.add(new Property("category", "CodeableConcept", "A categorization for the type of the composition - helps for indexing and searching. This may be implied by or derived from the code specified in the Composition Type.", 0, java.lang.Integer.MAX_VALUE, category));
        children.add(new Property("subject", "Reference(Any)", "Who or what the composition is about. The composition can be about a person, (patient or healthcare practitioner), a device (e.g. a machine) or even a group of subjects (such as a document about a herd of livestock, or a set of patients that share a common exposure).", 0, 1, subject));
        children.add(new Property("encounter", "Reference(Encounter)", "Describes the clinical encounter or type of care this documentation is associated with.", 0, 1, encounter));
        children.add(new Property("date", "dateTime", "The composition editing time, when the composition was last logically changed by the author.", 0, 1, date));
        children.add(new Property("author", "Reference(Practitioner|PractitionerRole|Device|Patient|RelatedPerson|Organization)", "Identifies who is responsible for the information in the composition, not necessarily who typed it in.", 0, java.lang.Integer.MAX_VALUE, author));
        children.add(new Property("title", "string", "Official human-readable label for the composition.", 0, 1, title));
        children.add(new Property("confidentiality", "code", "The code specifying the level of confidentiality of the Composition.", 0, 1, confidentiality));
        children.add(new Property("attester", "", "A participant who has attested to the accuracy of the composition/document.", 0, java.lang.Integer.MAX_VALUE, attester));
        children.add(new Property("custodian", "Reference(Organization)", "Identifies the organization or group who is responsible for ongoing maintenance of and access to the composition/document information.", 0, 1, custodian));
        children.add(new Property("relatesTo", "", "Relationships that this composition has with other compositions or documents that already exist.", 0, java.lang.Integer.MAX_VALUE, relatesTo));
        children.add(new Property("event", "", "The clinical service, such as a colonoscopy or an appendectomy, being documented.", 0, java.lang.Integer.MAX_VALUE, event));
        children.add(new Property("section", "", "The root of the sections that make up the composition.", 0, java.lang.Integer.MAX_VALUE, section));
      }

      @Override
      public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
        switch (_hash) {
        case -1618432855: /*identifier*/  return new Property("identifier", "Identifier", "A version-independent identifier for the Composition. This identifier stays constant as the composition is changed over time.", 0, 1, identifier);
        case -892481550: /*status*/  return new Property("status", "code", "The workflow/clinical status of this composition. The status is a marker for the clinical standing of the document.", 0, 1, status);
        case 3575610: /*type*/  return new Property("type", "CodeableConcept", "Specifies the particular kind of composition (e.g. History and Physical, Discharge Summary, Progress Note). This usually equates to the purpose of making the composition.", 0, 1, type);
        case 50511102: /*category*/  return new Property("category", "CodeableConcept", "A categorization for the type of the composition - helps for indexing and searching. This may be implied by or derived from the code specified in the Composition Type.", 0, java.lang.Integer.MAX_VALUE, category);
        case -1867885268: /*subject*/  return new Property("subject", "Reference(Any)", "Who or what the composition is about. The composition can be about a person, (patient or healthcare practitioner), a device (e.g. a machine) or even a group of subjects (such as a document about a herd of livestock, or a set of patients that share a common exposure).", 0, 1, subject);
        case 1524132147: /*encounter*/  return new Property("encounter", "Reference(Encounter)", "Describes the clinical encounter or type of care this documentation is associated with.", 0, 1, encounter);
        case 3076014: /*date*/  return new Property("date", "dateTime", "The composition editing time, when the composition was last logically changed by the author.", 0, 1, date);
        case -1406328437: /*author*/  return new Property("author", "Reference(Practitioner|PractitionerRole|Device|Patient|RelatedPerson|Organization)", "Identifies who is responsible for the information in the composition, not necessarily who typed it in.", 0, java.lang.Integer.MAX_VALUE, author);
        case 110371416: /*title*/  return new Property("title", "string", "Official human-readable label for the composition.", 0, 1, title);
        case -1923018202: /*confidentiality*/  return new Property("confidentiality", "code", "The code specifying the level of confidentiality of the Composition.", 0, 1, confidentiality);
        case 542920370: /*attester*/  return new Property("attester", "", "A participant who has attested to the accuracy of the composition/document.", 0, java.lang.Integer.MAX_VALUE, attester);
        case 1611297262: /*custodian*/  return new Property("custodian", "Reference(Organization)", "Identifies the organization or group who is responsible for ongoing maintenance of and access to the composition/document information.", 0, 1, custodian);
        case -7765931: /*relatesTo*/  return new Property("relatesTo", "", "Relationships that this composition has with other compositions or documents that already exist.", 0, java.lang.Integer.MAX_VALUE, relatesTo);
        case 96891546: /*event*/  return new Property("event", "", "The clinical service, such as a colonoscopy or an appendectomy, being documented.", 0, java.lang.Integer.MAX_VALUE, event);
        case 1970241253: /*section*/  return new Property("section", "", "The root of the sections that make up the composition.", 0, java.lang.Integer.MAX_VALUE, section);
        default: return super.getNamedProperty(_hash, _name, _checkValid);
        }

      }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case -1618432855: /*identifier*/ return this.identifier == null ? new Base[0] : new Base[] {this.identifier}; // Identifier
        case -892481550: /*status*/ return this.status == null ? new Base[0] : new Base[] {this.status}; // Enumeration<CompositionStatus>
        case 3575610: /*type*/ return this.type == null ? new Base[0] : new Base[] {this.type}; // CodeableConcept
        case 50511102: /*category*/ return this.category == null ? new Base[0] : this.category.toArray(new Base[this.category.size()]); // CodeableConcept
        case -1867885268: /*subject*/ return this.subject == null ? new Base[0] : new Base[] {this.subject}; // Reference
        case 1524132147: /*encounter*/ return this.encounter == null ? new Base[0] : new Base[] {this.encounter}; // Reference
        case 3076014: /*date*/ return this.date == null ? new Base[0] : new Base[] {this.date}; // DateTimeType
        case -1406328437: /*author*/ return this.author == null ? new Base[0] : this.author.toArray(new Base[this.author.size()]); // Reference
        case 110371416: /*title*/ return this.title == null ? new Base[0] : new Base[] {this.title}; // StringType
        case -1923018202: /*confidentiality*/ return this.confidentiality == null ? new Base[0] : new Base[] {this.confidentiality}; // Enumeration<V3ConfidentialityClassification>
        case 542920370: /*attester*/ return this.attester == null ? new Base[0] : this.attester.toArray(new Base[this.attester.size()]); // CompositionAttesterComponent
        case 1611297262: /*custodian*/ return this.custodian == null ? new Base[0] : new Base[] {this.custodian}; // Reference
        case -7765931: /*relatesTo*/ return this.relatesTo == null ? new Base[0] : this.relatesTo.toArray(new Base[this.relatesTo.size()]); // CompositionRelatesToComponent
        case 96891546: /*event*/ return this.event == null ? new Base[0] : this.event.toArray(new Base[this.event.size()]); // CompositionEventComponent
        case 1970241253: /*section*/ return this.section == null ? new Base[0] : this.section.toArray(new Base[this.section.size()]); // SectionComponent
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public Base setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case -1618432855: // identifier
          this.identifier = TypeConvertor.castToIdentifier(value); // Identifier
          return value;
        case -892481550: // status
          value = new CompositionStatusEnumFactory().fromType(TypeConvertor.castToCode(value));
          this.status = (Enumeration) value; // Enumeration<CompositionStatus>
          return value;
        case 3575610: // type
          this.type = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
          return value;
        case 50511102: // category
          this.getCategory().add(TypeConvertor.castToCodeableConcept(value)); // CodeableConcept
          return value;
        case -1867885268: // subject
          this.subject = TypeConvertor.castToReference(value); // Reference
          return value;
        case 1524132147: // encounter
          this.encounter = TypeConvertor.castToReference(value); // Reference
          return value;
        case 3076014: // date
          this.date = TypeConvertor.castToDateTime(value); // DateTimeType
          return value;
        case -1406328437: // author
          this.getAuthor().add(TypeConvertor.castToReference(value)); // Reference
          return value;
        case 110371416: // title
          this.title = TypeConvertor.castToString(value); // StringType
          return value;
        case -1923018202: // confidentiality
          value = new V3ConfidentialityClassificationEnumFactory().fromType(TypeConvertor.castToCode(value));
          this.confidentiality = (Enumeration) value; // Enumeration<V3ConfidentialityClassification>
          return value;
        case 542920370: // attester
          this.getAttester().add((CompositionAttesterComponent) value); // CompositionAttesterComponent
          return value;
        case 1611297262: // custodian
          this.custodian = TypeConvertor.castToReference(value); // Reference
          return value;
        case -7765931: // relatesTo
          this.getRelatesTo().add((CompositionRelatesToComponent) value); // CompositionRelatesToComponent
          return value;
        case 96891546: // event
          this.getEvent().add((CompositionEventComponent) value); // CompositionEventComponent
          return value;
        case 1970241253: // section
          this.getSection().add((SectionComponent) value); // SectionComponent
          return value;
        default: return super.setProperty(hash, name, value);
        }

      }

      @Override
      public Base setProperty(String name, Base value) throws FHIRException {
        if (name.equals("identifier")) {
          this.identifier = TypeConvertor.castToIdentifier(value); // Identifier
        } else if (name.equals("status")) {
          value = new CompositionStatusEnumFactory().fromType(TypeConvertor.castToCode(value));
          this.status = (Enumeration) value; // Enumeration<CompositionStatus>
        } else if (name.equals("type")) {
          this.type = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
        } else if (name.equals("category")) {
          this.getCategory().add(TypeConvertor.castToCodeableConcept(value));
        } else if (name.equals("subject")) {
          this.subject = TypeConvertor.castToReference(value); // Reference
        } else if (name.equals("encounter")) {
          this.encounter = TypeConvertor.castToReference(value); // Reference
        } else if (name.equals("date")) {
          this.date = TypeConvertor.castToDateTime(value); // DateTimeType
        } else if (name.equals("author")) {
          this.getAuthor().add(TypeConvertor.castToReference(value));
        } else if (name.equals("title")) {
          this.title = TypeConvertor.castToString(value); // StringType
        } else if (name.equals("confidentiality")) {
          value = new V3ConfidentialityClassificationEnumFactory().fromType(TypeConvertor.castToCode(value));
          this.confidentiality = (Enumeration) value; // Enumeration<V3ConfidentialityClassification>
        } else if (name.equals("attester")) {
          this.getAttester().add((CompositionAttesterComponent) value);
        } else if (name.equals("custodian")) {
          this.custodian = TypeConvertor.castToReference(value); // Reference
        } else if (name.equals("relatesTo")) {
          this.getRelatesTo().add((CompositionRelatesToComponent) value);
        } else if (name.equals("event")) {
          this.getEvent().add((CompositionEventComponent) value);
        } else if (name.equals("section")) {
          this.getSection().add((SectionComponent) value);
        } else
          return super.setProperty(name, value);
        return value;
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case -1618432855:  return getIdentifier();
        case -892481550:  return getStatusElement();
        case 3575610:  return getType();
        case 50511102:  return addCategory(); 
        case -1867885268:  return getSubject();
        case 1524132147:  return getEncounter();
        case 3076014:  return getDateElement();
        case -1406328437:  return addAuthor(); 
        case 110371416:  return getTitleElement();
        case -1923018202:  return getConfidentialityElement();
        case 542920370:  return addAttester(); 
        case 1611297262:  return getCustodian();
        case -7765931:  return addRelatesTo(); 
        case 96891546:  return addEvent(); 
        case 1970241253:  return addSection(); 
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case -1618432855: /*identifier*/ return new String[] {"Identifier"};
        case -892481550: /*status*/ return new String[] {"code"};
        case 3575610: /*type*/ return new String[] {"CodeableConcept"};
        case 50511102: /*category*/ return new String[] {"CodeableConcept"};
        case -1867885268: /*subject*/ return new String[] {"Reference"};
        case 1524132147: /*encounter*/ return new String[] {"Reference"};
        case 3076014: /*date*/ return new String[] {"dateTime"};
        case -1406328437: /*author*/ return new String[] {"Reference"};
        case 110371416: /*title*/ return new String[] {"string"};
        case -1923018202: /*confidentiality*/ return new String[] {"code"};
        case 542920370: /*attester*/ return new String[] {};
        case 1611297262: /*custodian*/ return new String[] {"Reference"};
        case -7765931: /*relatesTo*/ return new String[] {};
        case 96891546: /*event*/ return new String[] {};
        case 1970241253: /*section*/ return new String[] {};
        default: return super.getTypesForProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("identifier")) {
          this.identifier = new Identifier();
          return this.identifier;
        }
        else if (name.equals("status")) {
          throw new FHIRException("Cannot call addChild on a primitive type Composition.status");
        }
        else if (name.equals("type")) {
          this.type = new CodeableConcept();
          return this.type;
        }
        else if (name.equals("category")) {
          return addCategory();
        }
        else if (name.equals("subject")) {
          this.subject = new Reference();
          return this.subject;
        }
        else if (name.equals("encounter")) {
          this.encounter = new Reference();
          return this.encounter;
        }
        else if (name.equals("date")) {
          throw new FHIRException("Cannot call addChild on a primitive type Composition.date");
        }
        else if (name.equals("author")) {
          return addAuthor();
        }
        else if (name.equals("title")) {
          throw new FHIRException("Cannot call addChild on a primitive type Composition.title");
        }
        else if (name.equals("confidentiality")) {
          throw new FHIRException("Cannot call addChild on a primitive type Composition.confidentiality");
        }
        else if (name.equals("attester")) {
          return addAttester();
        }
        else if (name.equals("custodian")) {
          this.custodian = new Reference();
          return this.custodian;
        }
        else if (name.equals("relatesTo")) {
          return addRelatesTo();
        }
        else if (name.equals("event")) {
          return addEvent();
        }
        else if (name.equals("section")) {
          return addSection();
        }
        else
          return super.addChild(name);
      }

  public String fhirType() {
    return "Composition";

  }

      public Composition copy() {
        Composition dst = new Composition();
        copyValues(dst);
        return dst;
      }

      public void copyValues(Composition dst) {
        super.copyValues(dst);
        dst.identifier = identifier == null ? null : identifier.copy();
        dst.status = status == null ? null : status.copy();
        dst.type = type == null ? null : type.copy();
        if (category != null) {
          dst.category = new ArrayList<CodeableConcept>();
          for (CodeableConcept i : category)
            dst.category.add(i.copy());
        };
        dst.subject = subject == null ? null : subject.copy();
        dst.encounter = encounter == null ? null : encounter.copy();
        dst.date = date == null ? null : date.copy();
        if (author != null) {
          dst.author = new ArrayList<Reference>();
          for (Reference i : author)
            dst.author.add(i.copy());
        };
        dst.title = title == null ? null : title.copy();
        dst.confidentiality = confidentiality == null ? null : confidentiality.copy();
        if (attester != null) {
          dst.attester = new ArrayList<CompositionAttesterComponent>();
          for (CompositionAttesterComponent i : attester)
            dst.attester.add(i.copy());
        };
        dst.custodian = custodian == null ? null : custodian.copy();
        if (relatesTo != null) {
          dst.relatesTo = new ArrayList<CompositionRelatesToComponent>();
          for (CompositionRelatesToComponent i : relatesTo)
            dst.relatesTo.add(i.copy());
        };
        if (event != null) {
          dst.event = new ArrayList<CompositionEventComponent>();
          for (CompositionEventComponent i : event)
            dst.event.add(i.copy());
        };
        if (section != null) {
          dst.section = new ArrayList<SectionComponent>();
          for (SectionComponent i : section)
            dst.section.add(i.copy());
        };
      }

      protected Composition typedCopy() {
        return copy();
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof Composition))
          return false;
        Composition o = (Composition) other_;
        return compareDeep(identifier, o.identifier, true) && compareDeep(status, o.status, true) && compareDeep(type, o.type, true)
           && compareDeep(category, o.category, true) && compareDeep(subject, o.subject, true) && compareDeep(encounter, o.encounter, true)
           && compareDeep(date, o.date, true) && compareDeep(author, o.author, true) && compareDeep(title, o.title, true)
           && compareDeep(confidentiality, o.confidentiality, true) && compareDeep(attester, o.attester, true)
           && compareDeep(custodian, o.custodian, true) && compareDeep(relatesTo, o.relatesTo, true) && compareDeep(event, o.event, true)
           && compareDeep(section, o.section, true);
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof Composition))
          return false;
        Composition o = (Composition) other_;
        return compareValues(status, o.status, true) && compareValues(date, o.date, true) && compareValues(title, o.title, true)
           && compareValues(confidentiality, o.confidentiality, true);
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(identifier, status, type
          , category, subject, encounter, date, author, title, confidentiality, attester
          , custodian, relatesTo, event, section);
      }

  @Override
  public ResourceType getResourceType() {
    return ResourceType.Composition;
   }

 /**
   * Search parameter: <b>attester</b>
   * <p>
   * Description: <b>Who attested the composition</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>Composition.attester.party</b><br>
   * </p>
   */
  @SearchParamDefinition(name="attester", path="Composition.attester.party", description="Who attested the composition", type="reference", providesMembershipIn={ @ca.uhn.fhir.model.api.annotation.Compartment(name="Base FHIR compartment definition for Patient"), @ca.uhn.fhir.model.api.annotation.Compartment(name="Base FHIR compartment definition for Practitioner") }, target={Organization.class, Patient.class, Practitioner.class, PractitionerRole.class, RelatedPerson.class } )
  public static final String SP_ATTESTER = "attester";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>attester</b>
   * <p>
   * Description: <b>Who attested the composition</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>Composition.attester.party</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam ATTESTER = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(SP_ATTESTER);

/**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>Composition:attester</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_ATTESTER = new ca.uhn.fhir.model.api.Include("Composition:attester").toLocked();

 /**
   * Search parameter: <b>author</b>
   * <p>
   * Description: <b>Who and/or what authored the composition</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>Composition.author</b><br>
   * </p>
   */
  @SearchParamDefinition(name="author", path="Composition.author", description="Who and/or what authored the composition", type="reference", providesMembershipIn={ @ca.uhn.fhir.model.api.annotation.Compartment(name="Base FHIR compartment definition for Device"), @ca.uhn.fhir.model.api.annotation.Compartment(name="Base FHIR compartment definition for Patient"), @ca.uhn.fhir.model.api.annotation.Compartment(name="Base FHIR compartment definition for Practitioner"), @ca.uhn.fhir.model.api.annotation.Compartment(name="Base FHIR compartment definition for RelatedPerson") }, target={Device.class, Organization.class, Patient.class, Practitioner.class, PractitionerRole.class, RelatedPerson.class } )
  public static final String SP_AUTHOR = "author";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>author</b>
   * <p>
   * Description: <b>Who and/or what authored the composition</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>Composition.author</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam AUTHOR = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(SP_AUTHOR);

/**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>Composition:author</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_AUTHOR = new ca.uhn.fhir.model.api.Include("Composition:author").toLocked();

 /**
   * Search parameter: <b>category</b>
   * <p>
   * Description: <b>Categorization of Composition</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Composition.category</b><br>
   * </p>
   */
  @SearchParamDefinition(name="category", path="Composition.category", description="Categorization of Composition", type="token" )
  public static final String SP_CATEGORY = "category";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>category</b>
   * <p>
   * Description: <b>Categorization of Composition</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Composition.category</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam CATEGORY = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_CATEGORY);

 /**
   * Search parameter: <b>confidentiality</b>
   * <p>
   * Description: <b>As defined by affinity domain</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Composition.confidentiality</b><br>
   * </p>
   */
  @SearchParamDefinition(name="confidentiality", path="Composition.confidentiality", description="As defined by affinity domain", type="token" )
  public static final String SP_CONFIDENTIALITY = "confidentiality";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>confidentiality</b>
   * <p>
   * Description: <b>As defined by affinity domain</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Composition.confidentiality</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam CONFIDENTIALITY = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_CONFIDENTIALITY);

 /**
   * Search parameter: <b>context</b>
   * <p>
   * Description: <b>Code(s) that apply to the event being documented</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Composition.event.code</b><br>
   * </p>
   */
  @SearchParamDefinition(name="context", path="Composition.event.code", description="Code(s) that apply to the event being documented", type="token" )
  public static final String SP_CONTEXT = "context";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>context</b>
   * <p>
   * Description: <b>Code(s) that apply to the event being documented</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Composition.event.code</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam CONTEXT = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_CONTEXT);

 /**
   * Search parameter: <b>entry</b>
   * <p>
   * Description: <b>A reference to data that supports this section</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>Composition.section.entry</b><br>
   * </p>
   */
  @SearchParamDefinition(name="entry", path="Composition.section.entry", description="A reference to data that supports this section", type="reference", target={Account.class, ActivityDefinition.class, AdministrableProductDefinition.class, AdverseEvent.class, AllergyIntolerance.class, Appointment.class, AppointmentResponse.class, AuditEvent.class, Basic.class, Binary.class, BiologicallyDerivedProduct.class, BodyStructure.class, Bundle.class, CapabilityStatement.class, CapabilityStatement2.class, CarePlan.class, CareTeam.class, CatalogEntry.class, ChargeItem.class, ChargeItemDefinition.class, Citation.class, Claim.class, ClaimResponse.class, ClinicalImpression.class, ClinicalUseIssue.class, CodeSystem.class, Communication.class, CommunicationRequest.class, CompartmentDefinition.class, Composition.class, ConceptMap.class, Condition.class, ConditionDefinition.class, Consent.class, Contract.class, Coverage.class, CoverageEligibilityRequest.class, CoverageEligibilityResponse.class, DetectedIssue.class, Device.class, DeviceDefinition.class, DeviceMetric.class, DeviceRequest.class, DeviceUseStatement.class, DiagnosticReport.class, DocumentManifest.class, DocumentReference.class, EightBall.class, Encounter.class, Endpoint.class, EnrollmentRequest.class, EnrollmentResponse.class, EpisodeOfCare.class, EventDefinition.class, Evidence.class, EvidenceFocus.class, EvidenceVariable.class, ExampleScenario.class, ExplanationOfBenefit.class, FamilyMemberHistory.class, Flag.class, Goal.class, GraphDefinition.class, Group.class, GuidanceResponse.class, HealthcareService.class, ImagingStudy.class, Immunization.class, ImmunizationEvaluation.class, ImmunizationRecommendation.class, ImplementationGuide.class, Ingredient.class, InsurancePlan.class, Invoice.class, Library.class, Linkage.class, ListResource.class, Location.class, ManufacturedItemDefinition.class, Measure.class, MeasureReport.class, Medication.class, MedicationAdministration.class, MedicationDispense.class, MedicationKnowledge.class, MedicationRequest.class, MedicationUsage.class, MedicinalProductDefinition.class, MessageDefinition.class, MessageHeader.class, MolecularSequence.class, NamingSystem.class, NutritionIntake.class, NutritionOrder.class, NutritionProduct.class, Observation.class, ObservationDefinition.class, OperationDefinition.class, OperationOutcome.class, Organization.class, OrganizationAffiliation.class, PackagedProductDefinition.class, Patient.class, PaymentNotice.class, PaymentReconciliation.class, Permission.class, Person.class, PlanDefinition.class, Practitioner.class, PractitionerRole.class, Procedure.class, Provenance.class, Questionnaire.class, QuestionnaireResponse.class, RegulatedAuthorization.class, RelatedPerson.class, RequestGroup.class, ResearchStudy.class, ResearchSubject.class, RiskAssessment.class, Schedule.class, SearchParameter.class, ServiceRequest.class, Slot.class, Specimen.class, SpecimenDefinition.class, StructureDefinition.class, StructureMap.class, Subscription.class, SubscriptionStatus.class, SubscriptionTopic.class, Substance.class, SubstanceDefinition.class, SubstanceNucleicAcid.class, SubstancePolymer.class, SubstanceProtein.class, SubstanceReferenceInformation.class, SubstanceSourceMaterial.class, SupplyDelivery.class, SupplyRequest.class, Task.class, TerminologyCapabilities.class, TestReport.class, TestScript.class, ValueSet.class, VerificationResult.class, VisionPrescription.class } )
  public static final String SP_ENTRY = "entry";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>entry</b>
   * <p>
   * Description: <b>A reference to data that supports this section</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>Composition.section.entry</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam ENTRY = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(SP_ENTRY);

/**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>Composition:entry</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_ENTRY = new ca.uhn.fhir.model.api.Include("Composition:entry").toLocked();

 /**
   * Search parameter: <b>period</b>
   * <p>
   * Description: <b>The period covered by the documentation</b><br>
   * Type: <b>date</b><br>
   * Path: <b>Composition.event.period</b><br>
   * </p>
   */
  @SearchParamDefinition(name="period", path="Composition.event.period", description="The period covered by the documentation", type="date" )
  public static final String SP_PERIOD = "period";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>period</b>
   * <p>
   * Description: <b>The period covered by the documentation</b><br>
   * Type: <b>date</b><br>
   * Path: <b>Composition.event.period</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.DateClientParam PERIOD = new ca.uhn.fhir.rest.gclient.DateClientParam(SP_PERIOD);

 /**
   * Search parameter: <b>related-id</b>
   * <p>
   * Description: <b>Target of the relationship</b><br>
   * Type: <b>token</b><br>
   * Path: <b>(Composition.relatesTo.target as Identifier)</b><br>
   * </p>
   */
  @SearchParamDefinition(name="related-id", path="(Composition.relatesTo.target as Identifier)", description="Target of the relationship", type="token" )
  public static final String SP_RELATED_ID = "related-id";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>related-id</b>
   * <p>
   * Description: <b>Target of the relationship</b><br>
   * Type: <b>token</b><br>
   * Path: <b>(Composition.relatesTo.target as Identifier)</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam RELATED_ID = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_RELATED_ID);

 /**
   * Search parameter: <b>related-ref</b>
   * <p>
   * Description: <b>Target of the relationship</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>(Composition.relatesTo.target as Reference)</b><br>
   * </p>
   */
  @SearchParamDefinition(name="related-ref", path="(Composition.relatesTo.target as Reference)", description="Target of the relationship", type="reference", target={Composition.class } )
  public static final String SP_RELATED_REF = "related-ref";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>related-ref</b>
   * <p>
   * Description: <b>Target of the relationship</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>(Composition.relatesTo.target as Reference)</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam RELATED_REF = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(SP_RELATED_REF);

/**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>Composition:related-ref</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_RELATED_REF = new ca.uhn.fhir.model.api.Include("Composition:related-ref").toLocked();

 /**
   * Search parameter: <b>section</b>
   * <p>
   * Description: <b>Classification of section (recommended)</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Composition.section.code</b><br>
   * </p>
   */
  @SearchParamDefinition(name="section", path="Composition.section.code", description="Classification of section (recommended)", type="token" )
  public static final String SP_SECTION = "section";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>section</b>
   * <p>
   * Description: <b>Classification of section (recommended)</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Composition.section.code</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam SECTION = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_SECTION);

 /**
   * Search parameter: <b>status</b>
   * <p>
   * Description: <b>preliminary | final | amended | entered-in-error</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Composition.status</b><br>
   * </p>
   */
  @SearchParamDefinition(name="status", path="Composition.status", description="preliminary | final | amended | entered-in-error", type="token" )
  public static final String SP_STATUS = "status";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>status</b>
   * <p>
   * Description: <b>preliminary | final | amended | entered-in-error</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Composition.status</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam STATUS = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_STATUS);

 /**
   * Search parameter: <b>subject</b>
   * <p>
   * Description: <b>Who and/or what the composition is about</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>Composition.subject</b><br>
   * </p>
   */
  @SearchParamDefinition(name="subject", path="Composition.subject", description="Who and/or what the composition is about", type="reference", providesMembershipIn={ @ca.uhn.fhir.model.api.annotation.Compartment(name="Base FHIR compartment definition for Patient"), @ca.uhn.fhir.model.api.annotation.Compartment(name="Base FHIR compartment definition for Practitioner") }, target={Account.class, ActivityDefinition.class, AdministrableProductDefinition.class, AdverseEvent.class, AllergyIntolerance.class, Appointment.class, AppointmentResponse.class, AuditEvent.class, Basic.class, Binary.class, BiologicallyDerivedProduct.class, BodyStructure.class, Bundle.class, CapabilityStatement.class, CapabilityStatement2.class, CarePlan.class, CareTeam.class, CatalogEntry.class, ChargeItem.class, ChargeItemDefinition.class, Citation.class, Claim.class, ClaimResponse.class, ClinicalImpression.class, ClinicalUseIssue.class, CodeSystem.class, Communication.class, CommunicationRequest.class, CompartmentDefinition.class, Composition.class, ConceptMap.class, Condition.class, ConditionDefinition.class, Consent.class, Contract.class, Coverage.class, CoverageEligibilityRequest.class, CoverageEligibilityResponse.class, DetectedIssue.class, Device.class, DeviceDefinition.class, DeviceMetric.class, DeviceRequest.class, DeviceUseStatement.class, DiagnosticReport.class, DocumentManifest.class, DocumentReference.class, EightBall.class, Encounter.class, Endpoint.class, EnrollmentRequest.class, EnrollmentResponse.class, EpisodeOfCare.class, EventDefinition.class, Evidence.class, EvidenceFocus.class, EvidenceVariable.class, ExampleScenario.class, ExplanationOfBenefit.class, FamilyMemberHistory.class, Flag.class, Goal.class, GraphDefinition.class, Group.class, GuidanceResponse.class, HealthcareService.class, ImagingStudy.class, Immunization.class, ImmunizationEvaluation.class, ImmunizationRecommendation.class, ImplementationGuide.class, Ingredient.class, InsurancePlan.class, Invoice.class, Library.class, Linkage.class, ListResource.class, Location.class, ManufacturedItemDefinition.class, Measure.class, MeasureReport.class, Medication.class, MedicationAdministration.class, MedicationDispense.class, MedicationKnowledge.class, MedicationRequest.class, MedicationUsage.class, MedicinalProductDefinition.class, MessageDefinition.class, MessageHeader.class, MolecularSequence.class, NamingSystem.class, NutritionIntake.class, NutritionOrder.class, NutritionProduct.class, Observation.class, ObservationDefinition.class, OperationDefinition.class, OperationOutcome.class, Organization.class, OrganizationAffiliation.class, PackagedProductDefinition.class, Patient.class, PaymentNotice.class, PaymentReconciliation.class, Permission.class, Person.class, PlanDefinition.class, Practitioner.class, PractitionerRole.class, Procedure.class, Provenance.class, Questionnaire.class, QuestionnaireResponse.class, RegulatedAuthorization.class, RelatedPerson.class, RequestGroup.class, ResearchStudy.class, ResearchSubject.class, RiskAssessment.class, Schedule.class, SearchParameter.class, ServiceRequest.class, Slot.class, Specimen.class, SpecimenDefinition.class, StructureDefinition.class, StructureMap.class, Subscription.class, SubscriptionStatus.class, SubscriptionTopic.class, Substance.class, SubstanceDefinition.class, SubstanceNucleicAcid.class, SubstancePolymer.class, SubstanceProtein.class, SubstanceReferenceInformation.class, SubstanceSourceMaterial.class, SupplyDelivery.class, SupplyRequest.class, Task.class, TerminologyCapabilities.class, TestReport.class, TestScript.class, ValueSet.class, VerificationResult.class, VisionPrescription.class } )
  public static final String SP_SUBJECT = "subject";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>subject</b>
   * <p>
   * Description: <b>Who and/or what the composition is about</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>Composition.subject</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam SUBJECT = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(SP_SUBJECT);

/**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>Composition:subject</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_SUBJECT = new ca.uhn.fhir.model.api.Include("Composition:subject").toLocked();

 /**
   * Search parameter: <b>title</b>
   * <p>
   * Description: <b>Human Readable name/title</b><br>
   * Type: <b>string</b><br>
   * Path: <b>Composition.title</b><br>
   * </p>
   */
  @SearchParamDefinition(name="title", path="Composition.title", description="Human Readable name/title", type="string" )
  public static final String SP_TITLE = "title";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>title</b>
   * <p>
   * Description: <b>Human Readable name/title</b><br>
   * Type: <b>string</b><br>
   * Path: <b>Composition.title</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.StringClientParam TITLE = new ca.uhn.fhir.rest.gclient.StringClientParam(SP_TITLE);

 /**
   * Search parameter: <b>date</b>
   * <p>
   * Description: <b>Multiple Resources: 

* [AllergyIntolerance](allergyintolerance.html): Date first version of the resource instance was recorded
* [CarePlan](careplan.html): Time period plan covers
* [CareTeam](careteam.html): A date within the coverage time period.
* [ClinicalImpression](clinicalimpression.html): When the assessment was documented
* [Composition](composition.html): Composition editing time
* [Consent](consent.html): When consent was agreed to
* [DiagnosticReport](diagnosticreport.html): The clinically relevant time of the report
* [Encounter](encounter.html): A date within the period the Encounter lasted
* [EpisodeOfCare](episodeofcare.html): The provided date search value falls within the episode of care's period
* [FamilyMemberHistory](familymemberhistory.html): When history was recorded or last updated
* [Flag](flag.html): Time period when flag is active
* [Immunization](immunization.html): Vaccination  (non)-Administration Date
* [List](list.html): When the list was prepared
* [Observation](observation.html): Obtained date/time. If the obtained element is a period, a date that falls in the period
* [Procedure](procedure.html): When the procedure occurred or is occurring
* [RiskAssessment](riskassessment.html): When was assessment made?
* [SupplyRequest](supplyrequest.html): When the request was made
</b><br>
   * Type: <b>date</b><br>
   * Path: <b>AllergyIntolerance.recordedDate | CarePlan.period | ClinicalImpression.date | Composition.date | Consent.dateTime | DiagnosticReport.effective | Encounter.period | EpisodeOfCare.period | FamilyMemberHistory.date | Flag.period | (Immunization.occurrence as dateTime) | List.date | Observation.effective | Procedure.occurrence | (RiskAssessment.occurrence as dateTime) | SupplyRequest.authoredOn</b><br>
   * </p>
   */
  @SearchParamDefinition(name="date", path="AllergyIntolerance.recordedDate | CarePlan.period | ClinicalImpression.date | Composition.date | Consent.dateTime | DiagnosticReport.effective | Encounter.period | EpisodeOfCare.period | FamilyMemberHistory.date | Flag.period | (Immunization.occurrence as dateTime) | List.date | Observation.effective | Procedure.occurrence | (RiskAssessment.occurrence as dateTime) | SupplyRequest.authoredOn", description="Multiple Resources: \r\n\r\n* [AllergyIntolerance](allergyintolerance.html): Date first version of the resource instance was recorded\r\n* [CarePlan](careplan.html): Time period plan covers\r\n* [CareTeam](careteam.html): A date within the coverage time period.\r\n* [ClinicalImpression](clinicalimpression.html): When the assessment was documented\r\n* [Composition](composition.html): Composition editing time\r\n* [Consent](consent.html): When consent was agreed to\r\n* [DiagnosticReport](diagnosticreport.html): The clinically relevant time of the report\r\n* [Encounter](encounter.html): A date within the period the Encounter lasted\r\n* [EpisodeOfCare](episodeofcare.html): The provided date search value falls within the episode of care's period\r\n* [FamilyMemberHistory](familymemberhistory.html): When history was recorded or last updated\r\n* [Flag](flag.html): Time period when flag is active\r\n* [Immunization](immunization.html): Vaccination  (non)-Administration Date\r\n* [List](list.html): When the list was prepared\r\n* [Observation](observation.html): Obtained date/time. If the obtained element is a period, a date that falls in the period\r\n* [Procedure](procedure.html): When the procedure occurred or is occurring\r\n* [RiskAssessment](riskassessment.html): When was assessment made?\r\n* [SupplyRequest](supplyrequest.html): When the request was made\r\n", type="date" )
  public static final String SP_DATE = "date";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>date</b>
   * <p>
   * Description: <b>Multiple Resources: 

* [AllergyIntolerance](allergyintolerance.html): Date first version of the resource instance was recorded
* [CarePlan](careplan.html): Time period plan covers
* [CareTeam](careteam.html): A date within the coverage time period.
* [ClinicalImpression](clinicalimpression.html): When the assessment was documented
* [Composition](composition.html): Composition editing time
* [Consent](consent.html): When consent was agreed to
* [DiagnosticReport](diagnosticreport.html): The clinically relevant time of the report
* [Encounter](encounter.html): A date within the period the Encounter lasted
* [EpisodeOfCare](episodeofcare.html): The provided date search value falls within the episode of care's period
* [FamilyMemberHistory](familymemberhistory.html): When history was recorded or last updated
* [Flag](flag.html): Time period when flag is active
* [Immunization](immunization.html): Vaccination  (non)-Administration Date
* [List](list.html): When the list was prepared
* [Observation](observation.html): Obtained date/time. If the obtained element is a period, a date that falls in the period
* [Procedure](procedure.html): When the procedure occurred or is occurring
* [RiskAssessment](riskassessment.html): When was assessment made?
* [SupplyRequest](supplyrequest.html): When the request was made
</b><br>
   * Type: <b>date</b><br>
   * Path: <b>AllergyIntolerance.recordedDate | CarePlan.period | ClinicalImpression.date | Composition.date | Consent.dateTime | DiagnosticReport.effective | Encounter.period | EpisodeOfCare.period | FamilyMemberHistory.date | Flag.period | (Immunization.occurrence as dateTime) | List.date | Observation.effective | Procedure.occurrence | (RiskAssessment.occurrence as dateTime) | SupplyRequest.authoredOn</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.DateClientParam DATE = new ca.uhn.fhir.rest.gclient.DateClientParam(SP_DATE);

 /**
   * Search parameter: <b>encounter</b>
   * <p>
   * Description: <b>Multiple Resources: 

* [Composition](composition.html): Context of the Composition
* [DeviceRequest](devicerequest.html): Encounter during which request was created
* [DiagnosticReport](diagnosticreport.html): The Encounter when the order was made
* [DocumentReference](documentreference.html): Context of the document  content
* [Flag](flag.html): Alert relevant during encounter
* [List](list.html): Context in which list created
* [NutritionOrder](nutritionorder.html): Return nutrition orders with this encounter identifier
* [Observation](observation.html): Encounter related to the observation
* [Procedure](procedure.html): The Encounter during which this Procedure was created
* [RiskAssessment](riskassessment.html): Where was assessment performed?
* [ServiceRequest](servicerequest.html): An encounter in which this request is made
* [VisionPrescription](visionprescription.html): Return prescriptions with this encounter identifier
</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>Composition.encounter | DeviceRequest.encounter | DiagnosticReport.encounter | DocumentReference.context.encounter | Flag.encounter | List.encounter | NutritionOrder.encounter | Observation.encounter | Procedure.encounter | RiskAssessment.encounter | ServiceRequest.encounter | VisionPrescription.encounter</b><br>
   * </p>
   */
  @SearchParamDefinition(name="encounter", path="Composition.encounter | DeviceRequest.encounter | DiagnosticReport.encounter | DocumentReference.context.encounter | Flag.encounter | List.encounter | NutritionOrder.encounter | Observation.encounter | Procedure.encounter | RiskAssessment.encounter | ServiceRequest.encounter | VisionPrescription.encounter", description="Multiple Resources: \r\n\r\n* [Composition](composition.html): Context of the Composition\r\n* [DeviceRequest](devicerequest.html): Encounter during which request was created\r\n* [DiagnosticReport](diagnosticreport.html): The Encounter when the order was made\r\n* [DocumentReference](documentreference.html): Context of the document  content\r\n* [Flag](flag.html): Alert relevant during encounter\r\n* [List](list.html): Context in which list created\r\n* [NutritionOrder](nutritionorder.html): Return nutrition orders with this encounter identifier\r\n* [Observation](observation.html): Encounter related to the observation\r\n* [Procedure](procedure.html): The Encounter during which this Procedure was created\r\n* [RiskAssessment](riskassessment.html): Where was assessment performed?\r\n* [ServiceRequest](servicerequest.html): An encounter in which this request is made\r\n* [VisionPrescription](visionprescription.html): Return prescriptions with this encounter identifier\r\n", type="reference", providesMembershipIn={ @ca.uhn.fhir.model.api.annotation.Compartment(name="Base FHIR compartment definition for Encounter") }, target={Encounter.class } )
  public static final String SP_ENCOUNTER = "encounter";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>encounter</b>
   * <p>
   * Description: <b>Multiple Resources: 

* [Composition](composition.html): Context of the Composition
* [DeviceRequest](devicerequest.html): Encounter during which request was created
* [DiagnosticReport](diagnosticreport.html): The Encounter when the order was made
* [DocumentReference](documentreference.html): Context of the document  content
* [Flag](flag.html): Alert relevant during encounter
* [List](list.html): Context in which list created
* [NutritionOrder](nutritionorder.html): Return nutrition orders with this encounter identifier
* [Observation](observation.html): Encounter related to the observation
* [Procedure](procedure.html): The Encounter during which this Procedure was created
* [RiskAssessment](riskassessment.html): Where was assessment performed?
* [ServiceRequest](servicerequest.html): An encounter in which this request is made
* [VisionPrescription](visionprescription.html): Return prescriptions with this encounter identifier
</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>Composition.encounter | DeviceRequest.encounter | DiagnosticReport.encounter | DocumentReference.context.encounter | Flag.encounter | List.encounter | NutritionOrder.encounter | Observation.encounter | Procedure.encounter | RiskAssessment.encounter | ServiceRequest.encounter | VisionPrescription.encounter</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam ENCOUNTER = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(SP_ENCOUNTER);

/**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>Composition:encounter</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_ENCOUNTER = new ca.uhn.fhir.model.api.Include("Composition:encounter").toLocked();

 /**
   * Search parameter: <b>identifier</b>
   * <p>
   * Description: <b>Multiple Resources: 

* [AllergyIntolerance](allergyintolerance.html): External ids for this item
* [CarePlan](careplan.html): External Ids for this plan
* [CareTeam](careteam.html): External Ids for this team
* [Composition](composition.html): Version-independent identifier for the Composition
* [Condition](condition.html): A unique identifier of the condition record
* [Consent](consent.html): Identifier for this record (external references)
* [DetectedIssue](detectedissue.html): Unique id for the detected issue
* [DeviceRequest](devicerequest.html): Business identifier for request/order
* [DiagnosticReport](diagnosticreport.html): An identifier for the report
* [DocumentManifest](documentmanifest.html): Unique Identifier for the set of documents
* [DocumentReference](documentreference.html): Master Version Specific Identifier
* [Encounter](encounter.html): Identifier(s) by which this encounter is known
* [EpisodeOfCare](episodeofcare.html): Business Identifier(s) relevant for this EpisodeOfCare
* [FamilyMemberHistory](familymemberhistory.html): A search by a record identifier
* [Goal](goal.html): External Ids for this goal
* [ImagingStudy](imagingstudy.html): Identifiers for the Study, such as DICOM Study Instance UID and Accession number
* [Immunization](immunization.html): Business identifier
* [List](list.html): Business identifier
* [MedicationAdministration](medicationadministration.html): Return administrations with this external identifier
* [MedicationDispense](medicationdispense.html): Returns dispenses with this external identifier
* [MedicationRequest](medicationrequest.html): Return prescriptions with this external identifier
* [MedicationUsage](medicationusage.html): Return statements with this external identifier
* [NutritionOrder](nutritionorder.html): Return nutrition orders with this external identifier
* [Observation](observation.html): The unique id for a particular observation
* [Procedure](procedure.html): A unique identifier for a procedure
* [RiskAssessment](riskassessment.html): Unique identifier for the assessment
* [ServiceRequest](servicerequest.html): Identifiers assigned to this order
* [SupplyDelivery](supplydelivery.html): External identifier
* [SupplyRequest](supplyrequest.html): Business Identifier for SupplyRequest
* [VisionPrescription](visionprescription.html): Return prescriptions with this external identifier
</b><br>
   * Type: <b>token</b><br>
   * Path: <b>AllergyIntolerance.identifier | CarePlan.identifier | CareTeam.identifier | Composition.identifier | Condition.identifier | Consent.identifier | DetectedIssue.identifier | DeviceRequest.identifier | DiagnosticReport.identifier | DocumentManifest.masterIdentifier | DocumentManifest.identifier | DocumentReference.masterIdentifier | DocumentReference.identifier | Encounter.identifier | EpisodeOfCare.identifier | FamilyMemberHistory.identifier | Goal.identifier | ImagingStudy.identifier | Immunization.identifier | List.identifier | MedicationAdministration.identifier | MedicationDispense.identifier | MedicationRequest.identifier | MedicationUsage.identifier | NutritionOrder.identifier | Observation.identifier | Procedure.identifier | RiskAssessment.identifier | ServiceRequest.identifier | SupplyDelivery.identifier | SupplyRequest.identifier | VisionPrescription.identifier</b><br>
   * </p>
   */
  @SearchParamDefinition(name="identifier", path="AllergyIntolerance.identifier | CarePlan.identifier | CareTeam.identifier | Composition.identifier | Condition.identifier | Consent.identifier | DetectedIssue.identifier | DeviceRequest.identifier | DiagnosticReport.identifier | DocumentManifest.masterIdentifier | DocumentManifest.identifier | DocumentReference.masterIdentifier | DocumentReference.identifier | Encounter.identifier | EpisodeOfCare.identifier | FamilyMemberHistory.identifier | Goal.identifier | ImagingStudy.identifier | Immunization.identifier | List.identifier | MedicationAdministration.identifier | MedicationDispense.identifier | MedicationRequest.identifier | MedicationUsage.identifier | NutritionOrder.identifier | Observation.identifier | Procedure.identifier | RiskAssessment.identifier | ServiceRequest.identifier | SupplyDelivery.identifier | SupplyRequest.identifier | VisionPrescription.identifier", description="Multiple Resources: \r\n\r\n* [AllergyIntolerance](allergyintolerance.html): External ids for this item\r\n* [CarePlan](careplan.html): External Ids for this plan\r\n* [CareTeam](careteam.html): External Ids for this team\r\n* [Composition](composition.html): Version-independent identifier for the Composition\r\n* [Condition](condition.html): A unique identifier of the condition record\r\n* [Consent](consent.html): Identifier for this record (external references)\r\n* [DetectedIssue](detectedissue.html): Unique id for the detected issue\r\n* [DeviceRequest](devicerequest.html): Business identifier for request/order\r\n* [DiagnosticReport](diagnosticreport.html): An identifier for the report\r\n* [DocumentManifest](documentmanifest.html): Unique Identifier for the set of documents\r\n* [DocumentReference](documentreference.html): Master Version Specific Identifier\r\n* [Encounter](encounter.html): Identifier(s) by which this encounter is known\r\n* [EpisodeOfCare](episodeofcare.html): Business Identifier(s) relevant for this EpisodeOfCare\r\n* [FamilyMemberHistory](familymemberhistory.html): A search by a record identifier\r\n* [Goal](goal.html): External Ids for this goal\r\n* [ImagingStudy](imagingstudy.html): Identifiers for the Study, such as DICOM Study Instance UID and Accession number\r\n* [Immunization](immunization.html): Business identifier\r\n* [List](list.html): Business identifier\r\n* [MedicationAdministration](medicationadministration.html): Return administrations with this external identifier\r\n* [MedicationDispense](medicationdispense.html): Returns dispenses with this external identifier\r\n* [MedicationRequest](medicationrequest.html): Return prescriptions with this external identifier\r\n* [MedicationUsage](medicationusage.html): Return statements with this external identifier\r\n* [NutritionOrder](nutritionorder.html): Return nutrition orders with this external identifier\r\n* [Observation](observation.html): The unique id for a particular observation\r\n* [Procedure](procedure.html): A unique identifier for a procedure\r\n* [RiskAssessment](riskassessment.html): Unique identifier for the assessment\r\n* [ServiceRequest](servicerequest.html): Identifiers assigned to this order\r\n* [SupplyDelivery](supplydelivery.html): External identifier\r\n* [SupplyRequest](supplyrequest.html): Business Identifier for SupplyRequest\r\n* [VisionPrescription](visionprescription.html): Return prescriptions with this external identifier\r\n", type="token" )
  public static final String SP_IDENTIFIER = "identifier";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>identifier</b>
   * <p>
   * Description: <b>Multiple Resources: 

* [AllergyIntolerance](allergyintolerance.html): External ids for this item
* [CarePlan](careplan.html): External Ids for this plan
* [CareTeam](careteam.html): External Ids for this team
* [Composition](composition.html): Version-independent identifier for the Composition
* [Condition](condition.html): A unique identifier of the condition record
* [Consent](consent.html): Identifier for this record (external references)
* [DetectedIssue](detectedissue.html): Unique id for the detected issue
* [DeviceRequest](devicerequest.html): Business identifier for request/order
* [DiagnosticReport](diagnosticreport.html): An identifier for the report
* [DocumentManifest](documentmanifest.html): Unique Identifier for the set of documents
* [DocumentReference](documentreference.html): Master Version Specific Identifier
* [Encounter](encounter.html): Identifier(s) by which this encounter is known
* [EpisodeOfCare](episodeofcare.html): Business Identifier(s) relevant for this EpisodeOfCare
* [FamilyMemberHistory](familymemberhistory.html): A search by a record identifier
* [Goal](goal.html): External Ids for this goal
* [ImagingStudy](imagingstudy.html): Identifiers for the Study, such as DICOM Study Instance UID and Accession number
* [Immunization](immunization.html): Business identifier
* [List](list.html): Business identifier
* [MedicationAdministration](medicationadministration.html): Return administrations with this external identifier
* [MedicationDispense](medicationdispense.html): Returns dispenses with this external identifier
* [MedicationRequest](medicationrequest.html): Return prescriptions with this external identifier
* [MedicationUsage](medicationusage.html): Return statements with this external identifier
* [NutritionOrder](nutritionorder.html): Return nutrition orders with this external identifier
* [Observation](observation.html): The unique id for a particular observation
* [Procedure](procedure.html): A unique identifier for a procedure
* [RiskAssessment](riskassessment.html): Unique identifier for the assessment
* [ServiceRequest](servicerequest.html): Identifiers assigned to this order
* [SupplyDelivery](supplydelivery.html): External identifier
* [SupplyRequest](supplyrequest.html): Business Identifier for SupplyRequest
* [VisionPrescription](visionprescription.html): Return prescriptions with this external identifier
</b><br>
   * Type: <b>token</b><br>
   * Path: <b>AllergyIntolerance.identifier | CarePlan.identifier | CareTeam.identifier | Composition.identifier | Condition.identifier | Consent.identifier | DetectedIssue.identifier | DeviceRequest.identifier | DiagnosticReport.identifier | DocumentManifest.masterIdentifier | DocumentManifest.identifier | DocumentReference.masterIdentifier | DocumentReference.identifier | Encounter.identifier | EpisodeOfCare.identifier | FamilyMemberHistory.identifier | Goal.identifier | ImagingStudy.identifier | Immunization.identifier | List.identifier | MedicationAdministration.identifier | MedicationDispense.identifier | MedicationRequest.identifier | MedicationUsage.identifier | NutritionOrder.identifier | Observation.identifier | Procedure.identifier | RiskAssessment.identifier | ServiceRequest.identifier | SupplyDelivery.identifier | SupplyRequest.identifier | VisionPrescription.identifier</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam IDENTIFIER = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_IDENTIFIER);

 /**
   * Search parameter: <b>patient</b>
   * <p>
   * Description: <b>Multiple Resources: 

* [AllergyIntolerance](allergyintolerance.html): Who the sensitivity is for
* [CarePlan](careplan.html): Who the care plan is for
* [CareTeam](careteam.html): Who care team is for
* [ClinicalImpression](clinicalimpression.html): Patient or group assessed
* [Composition](composition.html): Who and/or what the composition is about
* [Condition](condition.html): Who has the condition?
* [Consent](consent.html): Who the consent applies to
* [DetectedIssue](detectedissue.html): Associated patient
* [DeviceRequest](devicerequest.html): Individual the service is ordered for
* [DeviceUseStatement](deviceusestatement.html): Search by subject - a patient
* [DiagnosticReport](diagnosticreport.html): The subject of the report if a patient
* [DocumentManifest](documentmanifest.html): The subject of the set of documents
* [DocumentReference](documentreference.html): Who/what is the subject of the document
* [Encounter](encounter.html): The patient or group present at the encounter
* [EpisodeOfCare](episodeofcare.html): The patient who is the focus of this episode of care
* [FamilyMemberHistory](familymemberhistory.html): The identity of a subject to list family member history items for
* [Flag](flag.html): The identity of a subject to list flags for
* [Goal](goal.html): Who this goal is intended for
* [ImagingStudy](imagingstudy.html): Who the study is about
* [Immunization](immunization.html): The patient for the vaccination record
* [List](list.html): If all resources have the same subject
* [MedicationAdministration](medicationadministration.html): The identity of a patient to list administrations  for
* [MedicationDispense](medicationdispense.html): The identity of a patient to list dispenses  for
* [MedicationRequest](medicationrequest.html): Returns prescriptions for a specific patient
* [MedicationUsage](medicationusage.html): Returns statements for a specific patient.
* [NutritionOrder](nutritionorder.html): The identity of the person who requires the diet, formula or nutritional supplement
* [Observation](observation.html): The subject that the observation is about (if patient)
* [Procedure](procedure.html): Search by subject - a patient
* [RiskAssessment](riskassessment.html): Who/what does assessment apply to?
* [ServiceRequest](servicerequest.html): Search by subject - a patient
* [SupplyDelivery](supplydelivery.html): Patient for whom the item is supplied
* [VisionPrescription](visionprescription.html): The identity of a patient to list dispenses for
</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>AllergyIntolerance.patient | CarePlan.subject.where(resolve() is Patient) | CareTeam.subject.where(resolve() is Patient) | ClinicalImpression.subject.where(resolve() is Patient) | Composition.subject.where(resolve() is Patient) | Condition.subject.where(resolve() is Patient) | Consent.subject.where(resolve() is Patient) | DetectedIssue.patient | DeviceRequest.subject.where(resolve() is Patient) | DeviceUseStatement.subject | DiagnosticReport.subject.where(resolve() is Patient) | DocumentManifest.subject.where(resolve() is Patient) | DocumentReference.subject.where(resolve() is Patient) | Encounter.subject.where(resolve() is Patient) | EpisodeOfCare.patient | FamilyMemberHistory.patient | Flag.subject.where(resolve() is Patient) | Goal.subject.where(resolve() is Patient) | ImagingStudy.subject.where(resolve() is Patient) | Immunization.patient | List.subject.where(resolve() is Patient) | MedicationAdministration.subject.where(resolve() is Patient) | MedicationDispense.subject.where(resolve() is Patient) | MedicationRequest.subject.where(resolve() is Patient) | MedicationUsage.subject.where(resolve() is Patient) | NutritionOrder.patient | Observation.subject.where(resolve() is Patient) | Procedure.subject.where(resolve() is Patient) | RiskAssessment.subject.where(resolve() is Patient) | ServiceRequest.subject.where(resolve() is Patient) | SupplyDelivery.patient | VisionPrescription.patient</b><br>
   * </p>
   */
  @SearchParamDefinition(name="patient", path="AllergyIntolerance.patient | CarePlan.subject.where(resolve() is Patient) | CareTeam.subject.where(resolve() is Patient) | ClinicalImpression.subject.where(resolve() is Patient) | Composition.subject.where(resolve() is Patient) | Condition.subject.where(resolve() is Patient) | Consent.subject.where(resolve() is Patient) | DetectedIssue.patient | DeviceRequest.subject.where(resolve() is Patient) | DeviceUseStatement.subject | DiagnosticReport.subject.where(resolve() is Patient) | DocumentManifest.subject.where(resolve() is Patient) | DocumentReference.subject.where(resolve() is Patient) | Encounter.subject.where(resolve() is Patient) | EpisodeOfCare.patient | FamilyMemberHistory.patient | Flag.subject.where(resolve() is Patient) | Goal.subject.where(resolve() is Patient) | ImagingStudy.subject.where(resolve() is Patient) | Immunization.patient | List.subject.where(resolve() is Patient) | MedicationAdministration.subject.where(resolve() is Patient) | MedicationDispense.subject.where(resolve() is Patient) | MedicationRequest.subject.where(resolve() is Patient) | MedicationUsage.subject.where(resolve() is Patient) | NutritionOrder.patient | Observation.subject.where(resolve() is Patient) | Procedure.subject.where(resolve() is Patient) | RiskAssessment.subject.where(resolve() is Patient) | ServiceRequest.subject.where(resolve() is Patient) | SupplyDelivery.patient | VisionPrescription.patient", description="Multiple Resources: \r\n\r\n* [AllergyIntolerance](allergyintolerance.html): Who the sensitivity is for\r\n* [CarePlan](careplan.html): Who the care plan is for\r\n* [CareTeam](careteam.html): Who care team is for\r\n* [ClinicalImpression](clinicalimpression.html): Patient or group assessed\r\n* [Composition](composition.html): Who and/or what the composition is about\r\n* [Condition](condition.html): Who has the condition?\r\n* [Consent](consent.html): Who the consent applies to\r\n* [DetectedIssue](detectedissue.html): Associated patient\r\n* [DeviceRequest](devicerequest.html): Individual the service is ordered for\r\n* [DeviceUseStatement](deviceusestatement.html): Search by subject - a patient\r\n* [DiagnosticReport](diagnosticreport.html): The subject of the report if a patient\r\n* [DocumentManifest](documentmanifest.html): The subject of the set of documents\r\n* [DocumentReference](documentreference.html): Who/what is the subject of the document\r\n* [Encounter](encounter.html): The patient or group present at the encounter\r\n* [EpisodeOfCare](episodeofcare.html): The patient who is the focus of this episode of care\r\n* [FamilyMemberHistory](familymemberhistory.html): The identity of a subject to list family member history items for\r\n* [Flag](flag.html): The identity of a subject to list flags for\r\n* [Goal](goal.html): Who this goal is intended for\r\n* [ImagingStudy](imagingstudy.html): Who the study is about\r\n* [Immunization](immunization.html): The patient for the vaccination record\r\n* [List](list.html): If all resources have the same subject\r\n* [MedicationAdministration](medicationadministration.html): The identity of a patient to list administrations  for\r\n* [MedicationDispense](medicationdispense.html): The identity of a patient to list dispenses  for\r\n* [MedicationRequest](medicationrequest.html): Returns prescriptions for a specific patient\r\n* [MedicationUsage](medicationusage.html): Returns statements for a specific patient.\r\n* [NutritionOrder](nutritionorder.html): The identity of the person who requires the diet, formula or nutritional supplement\r\n* [Observation](observation.html): The subject that the observation is about (if patient)\r\n* [Procedure](procedure.html): Search by subject - a patient\r\n* [RiskAssessment](riskassessment.html): Who/what does assessment apply to?\r\n* [ServiceRequest](servicerequest.html): Search by subject - a patient\r\n* [SupplyDelivery](supplydelivery.html): Patient for whom the item is supplied\r\n* [VisionPrescription](visionprescription.html): The identity of a patient to list dispenses for\r\n", type="reference", target={Group.class, Patient.class } )
  public static final String SP_PATIENT = "patient";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>patient</b>
   * <p>
   * Description: <b>Multiple Resources: 

* [AllergyIntolerance](allergyintolerance.html): Who the sensitivity is for
* [CarePlan](careplan.html): Who the care plan is for
* [CareTeam](careteam.html): Who care team is for
* [ClinicalImpression](clinicalimpression.html): Patient or group assessed
* [Composition](composition.html): Who and/or what the composition is about
* [Condition](condition.html): Who has the condition?
* [Consent](consent.html): Who the consent applies to
* [DetectedIssue](detectedissue.html): Associated patient
* [DeviceRequest](devicerequest.html): Individual the service is ordered for
* [DeviceUseStatement](deviceusestatement.html): Search by subject - a patient
* [DiagnosticReport](diagnosticreport.html): The subject of the report if a patient
* [DocumentManifest](documentmanifest.html): The subject of the set of documents
* [DocumentReference](documentreference.html): Who/what is the subject of the document
* [Encounter](encounter.html): The patient or group present at the encounter
* [EpisodeOfCare](episodeofcare.html): The patient who is the focus of this episode of care
* [FamilyMemberHistory](familymemberhistory.html): The identity of a subject to list family member history items for
* [Flag](flag.html): The identity of a subject to list flags for
* [Goal](goal.html): Who this goal is intended for
* [ImagingStudy](imagingstudy.html): Who the study is about
* [Immunization](immunization.html): The patient for the vaccination record
* [List](list.html): If all resources have the same subject
* [MedicationAdministration](medicationadministration.html): The identity of a patient to list administrations  for
* [MedicationDispense](medicationdispense.html): The identity of a patient to list dispenses  for
* [MedicationRequest](medicationrequest.html): Returns prescriptions for a specific patient
* [MedicationUsage](medicationusage.html): Returns statements for a specific patient.
* [NutritionOrder](nutritionorder.html): The identity of the person who requires the diet, formula or nutritional supplement
* [Observation](observation.html): The subject that the observation is about (if patient)
* [Procedure](procedure.html): Search by subject - a patient
* [RiskAssessment](riskassessment.html): Who/what does assessment apply to?
* [ServiceRequest](servicerequest.html): Search by subject - a patient
* [SupplyDelivery](supplydelivery.html): Patient for whom the item is supplied
* [VisionPrescription](visionprescription.html): The identity of a patient to list dispenses for
</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>AllergyIntolerance.patient | CarePlan.subject.where(resolve() is Patient) | CareTeam.subject.where(resolve() is Patient) | ClinicalImpression.subject.where(resolve() is Patient) | Composition.subject.where(resolve() is Patient) | Condition.subject.where(resolve() is Patient) | Consent.subject.where(resolve() is Patient) | DetectedIssue.patient | DeviceRequest.subject.where(resolve() is Patient) | DeviceUseStatement.subject | DiagnosticReport.subject.where(resolve() is Patient) | DocumentManifest.subject.where(resolve() is Patient) | DocumentReference.subject.where(resolve() is Patient) | Encounter.subject.where(resolve() is Patient) | EpisodeOfCare.patient | FamilyMemberHistory.patient | Flag.subject.where(resolve() is Patient) | Goal.subject.where(resolve() is Patient) | ImagingStudy.subject.where(resolve() is Patient) | Immunization.patient | List.subject.where(resolve() is Patient) | MedicationAdministration.subject.where(resolve() is Patient) | MedicationDispense.subject.where(resolve() is Patient) | MedicationRequest.subject.where(resolve() is Patient) | MedicationUsage.subject.where(resolve() is Patient) | NutritionOrder.patient | Observation.subject.where(resolve() is Patient) | Procedure.subject.where(resolve() is Patient) | RiskAssessment.subject.where(resolve() is Patient) | ServiceRequest.subject.where(resolve() is Patient) | SupplyDelivery.patient | VisionPrescription.patient</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam PATIENT = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(SP_PATIENT);

/**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>Composition:patient</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_PATIENT = new ca.uhn.fhir.model.api.Include("Composition:patient").toLocked();

 /**
   * Search parameter: <b>type</b>
   * <p>
   * Description: <b>Multiple Resources: 

* [AllergyIntolerance](allergyintolerance.html): allergy | intolerance - Underlying mechanism (if known)
* [Composition](composition.html): Kind of composition (LOINC if possible)
* [DocumentManifest](documentmanifest.html): Kind of document set
* [DocumentReference](documentreference.html): Kind of document (LOINC if possible)
* [Encounter](encounter.html): Specific type of encounter
* [EpisodeOfCare](episodeofcare.html): Type/class  - e.g. specialist referral, disease management
</b><br>
   * Type: <b>token</b><br>
   * Path: <b>AllergyIntolerance.type | Composition.type | DocumentManifest.type | DocumentReference.type | Encounter.type | EpisodeOfCare.type</b><br>
   * </p>
   */
  @SearchParamDefinition(name="type", path="AllergyIntolerance.type | Composition.type | DocumentManifest.type | DocumentReference.type | Encounter.type | EpisodeOfCare.type", description="Multiple Resources: \r\n\r\n* [AllergyIntolerance](allergyintolerance.html): allergy | intolerance - Underlying mechanism (if known)\r\n* [Composition](composition.html): Kind of composition (LOINC if possible)\r\n* [DocumentManifest](documentmanifest.html): Kind of document set\r\n* [DocumentReference](documentreference.html): Kind of document (LOINC if possible)\r\n* [Encounter](encounter.html): Specific type of encounter\r\n* [EpisodeOfCare](episodeofcare.html): Type/class  - e.g. specialist referral, disease management\r\n", type="token" )
  public static final String SP_TYPE = "type";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>type</b>
   * <p>
   * Description: <b>Multiple Resources: 

* [AllergyIntolerance](allergyintolerance.html): allergy | intolerance - Underlying mechanism (if known)
* [Composition](composition.html): Kind of composition (LOINC if possible)
* [DocumentManifest](documentmanifest.html): Kind of document set
* [DocumentReference](documentreference.html): Kind of document (LOINC if possible)
* [Encounter](encounter.html): Specific type of encounter
* [EpisodeOfCare](episodeofcare.html): Type/class  - e.g. specialist referral, disease management
</b><br>
   * Type: <b>token</b><br>
   * Path: <b>AllergyIntolerance.type | Composition.type | DocumentManifest.type | DocumentReference.type | Encounter.type | EpisodeOfCare.type</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam TYPE = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_TYPE);


}