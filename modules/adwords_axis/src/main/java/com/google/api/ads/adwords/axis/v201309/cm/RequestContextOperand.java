/**
 * RequestContextOperand.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201309.cm;


/**
 * An operand in a function referring to a value in the request context.
 */
public class RequestContextOperand  extends com.google.api.ads.adwords.axis.v201309.cm.FunctionArgumentOperand  implements java.io.Serializable {
    /* Type of value to be referred in the request context.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span> */
    private com.google.api.ads.adwords.axis.v201309.cm.RequestContextOperandContextType contextType;

    public RequestContextOperand() {
    }

    public RequestContextOperand(
           java.lang.String functionArgumentOperandType,
           com.google.api.ads.adwords.axis.v201309.cm.RequestContextOperandContextType contextType) {
        super(
            functionArgumentOperandType);
        this.contextType = contextType;
    }


    /**
     * Gets the contextType value for this RequestContextOperand.
     * 
     * @return contextType   * Type of value to be referred in the request context.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span>
     */
    public com.google.api.ads.adwords.axis.v201309.cm.RequestContextOperandContextType getContextType() {
        return contextType;
    }


    /**
     * Sets the contextType value for this RequestContextOperand.
     * 
     * @param contextType   * Type of value to be referred in the request context.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span>
     */
    public void setContextType(com.google.api.ads.adwords.axis.v201309.cm.RequestContextOperandContextType contextType) {
        this.contextType = contextType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RequestContextOperand)) return false;
        RequestContextOperand other = (RequestContextOperand) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.contextType==null && other.getContextType()==null) || 
             (this.contextType!=null &&
              this.contextType.equals(other.getContextType())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getContextType() != null) {
            _hashCode += getContextType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RequestContextOperand.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "RequestContextOperand"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contextType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "contextType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "RequestContextOperand.ContextType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
