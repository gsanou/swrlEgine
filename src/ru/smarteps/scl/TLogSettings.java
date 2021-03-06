//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.05.15 at 12:03:20 PM MSK 
//


package ru.smarteps.scl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tLogSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tLogSettings">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iec.ch/61850/2006/SCL}tServiceSettings">
 *       &lt;attribute name="logEna" type="{http://www.iec.ch/61850/2006/SCL}tServiceSettingsEnum" default="Fix" />
 *       &lt;attribute name="trgOps" type="{http://www.iec.ch/61850/2006/SCL}tServiceSettingsEnum" default="Fix" />
 *       &lt;attribute name="intgPd" type="{http://www.iec.ch/61850/2006/SCL}tServiceSettingsEnum" default="Fix" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tLogSettings")
public class TLogSettings
    extends TServiceSettings
{

    @XmlAttribute(name = "logEna")
    protected TServiceSettingsEnum logEna;
    @XmlAttribute(name = "trgOps")
    protected TServiceSettingsEnum trgOps;
    @XmlAttribute(name = "intgPd")
    protected TServiceSettingsEnum intgPd;

    /**
     * Gets the value of the logEna property.
     * 
     * @return
     *     possible object is
     *     {@link TServiceSettingsEnum }
     *     
     */
    public TServiceSettingsEnum getLogEna() {
        if (logEna == null) {
            return TServiceSettingsEnum.FIX;
        } else {
            return logEna;
        }
    }

    /**
     * Sets the value of the logEna property.
     * 
     * @param value
     *     allowed object is
     *     {@link TServiceSettingsEnum }
     *     
     */
    public void setLogEna(TServiceSettingsEnum value) {
        this.logEna = value;
    }

    /**
     * Gets the value of the trgOps property.
     * 
     * @return
     *     possible object is
     *     {@link TServiceSettingsEnum }
     *     
     */
    public TServiceSettingsEnum getTrgOps() {
        if (trgOps == null) {
            return TServiceSettingsEnum.FIX;
        } else {
            return trgOps;
        }
    }

    /**
     * Sets the value of the trgOps property.
     * 
     * @param value
     *     allowed object is
     *     {@link TServiceSettingsEnum }
     *     
     */
    public void setTrgOps(TServiceSettingsEnum value) {
        this.trgOps = value;
    }

    /**
     * Gets the value of the intgPd property.
     * 
     * @return
     *     possible object is
     *     {@link TServiceSettingsEnum }
     *     
     */
    public TServiceSettingsEnum getIntgPd() {
        if (intgPd == null) {
            return TServiceSettingsEnum.FIX;
        } else {
            return intgPd;
        }
    }

    /**
     * Sets the value of the intgPd property.
     * 
     * @param value
     *     allowed object is
     *     {@link TServiceSettingsEnum }
     *     
     */
    public void setIntgPd(TServiceSettingsEnum value) {
        this.intgPd = value;
    }

}
