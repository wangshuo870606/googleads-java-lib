
package com.google.api.ads.adwords.jaxws.v201402.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Manual click based bids.
 *           
 * 
 * <p>Java class for CpcBid complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CpcBid">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201402}Bids">
 *       &lt;sequence>
 *         &lt;element name="bid" type="{https://adwords.google.com/api/adwords/cm/v201402}Money" minOccurs="0"/>
 *         &lt;element name="contentBid" type="{https://adwords.google.com/api/adwords/cm/v201402}Money" minOccurs="0"/>
 *         &lt;element name="cpcBidSource" type="{https://adwords.google.com/api/adwords/cm/v201402}BidSource" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CpcBid", propOrder = {
    "bid",
    "contentBid",
    "cpcBidSource"
})
public class CpcBid
    extends Bids
{

    protected Money bid;
    protected Money contentBid;
    protected BidSource cpcBidSource;

    /**
     * Gets the value of the bid property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getBid() {
        return bid;
    }

    /**
     * Sets the value of the bid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setBid(Money value) {
        this.bid = value;
    }

    /**
     * Gets the value of the contentBid property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getContentBid() {
        return contentBid;
    }

    /**
     * Sets the value of the contentBid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setContentBid(Money value) {
        this.contentBid = value;
    }

    /**
     * Gets the value of the cpcBidSource property.
     * 
     * @return
     *     possible object is
     *     {@link BidSource }
     *     
     */
    public BidSource getCpcBidSource() {
        return cpcBidSource;
    }

    /**
     * Sets the value of the cpcBidSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link BidSource }
     *     
     */
    public void setCpcBidSource(BidSource value) {
        this.cpcBidSource = value;
    }

}
