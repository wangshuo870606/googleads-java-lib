/**
 * ProductScope.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201402.cm;


/**
 * Scope of products in a shopping campaign. Contains a set of product
 * dimensions, all of which
 *             a product has to match to be included in the campaign.
 * A campaign can contain multiple
 *             ProductScope criterion and that products are included
 * as long as they match at least one
 *             ProductScope. Non-existence of ProductScope means all
 * products are included in the campaign.
 *             <span class="constraint AdxEnabled">This is disabled for
 * AdX when it is contained within Operators: ADD, SET.</span>
 */
public class ProductScope  extends com.google.api.ads.adwords.axis.v201402.cm.Criterion  implements java.io.Serializable {
    /* <span class="constraint Selectable">This field can be selected
     * using the value "Dimensions".</span>
     *                     <span class="constraint NotEmpty">This field must
     * contain at least one element.</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span> */
    private com.google.api.ads.adwords.axis.v201402.cm.ProductDimension[] dimensions;

    public ProductScope() {
    }

    public ProductScope(
           java.lang.Long id,
           com.google.api.ads.adwords.axis.v201402.cm.CriterionType type,
           java.lang.String criterionType,
           com.google.api.ads.adwords.axis.v201402.cm.ProductDimension[] dimensions) {
        super(
            id,
            type,
            criterionType);
        this.dimensions = dimensions;
    }


    /**
     * Gets the dimensions value for this ProductScope.
     * 
     * @return dimensions   * <span class="constraint Selectable">This field can be selected
     * using the value "Dimensions".</span>
     *                     <span class="constraint NotEmpty">This field must
     * contain at least one element.</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span>
     */
    public com.google.api.ads.adwords.axis.v201402.cm.ProductDimension[] getDimensions() {
        return dimensions;
    }


    /**
     * Sets the dimensions value for this ProductScope.
     * 
     * @param dimensions   * <span class="constraint Selectable">This field can be selected
     * using the value "Dimensions".</span>
     *                     <span class="constraint NotEmpty">This field must
     * contain at least one element.</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span>
     */
    public void setDimensions(com.google.api.ads.adwords.axis.v201402.cm.ProductDimension[] dimensions) {
        this.dimensions = dimensions;
    }

    public com.google.api.ads.adwords.axis.v201402.cm.ProductDimension getDimensions(int i) {
        return this.dimensions[i];
    }

    public void setDimensions(int i, com.google.api.ads.adwords.axis.v201402.cm.ProductDimension _value) {
        this.dimensions[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProductScope)) return false;
        ProductScope other = (ProductScope) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.dimensions==null && other.getDimensions()==null) || 
             (this.dimensions!=null &&
              java.util.Arrays.equals(this.dimensions, other.getDimensions())));
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
        if (getDimensions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDimensions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDimensions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProductScope.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201402", "ProductScope"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dimensions");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201402", "dimensions"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201402", "ProductDimension"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
