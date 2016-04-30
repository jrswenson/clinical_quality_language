//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.04.12 at 08:52:42 PM MDT 
//


package org.cqframework.cql.elm.execution;

import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * The PositionOf operator returns the 0-based index of the given pattern in the given string.
 * 			
 * If the pattern is not found, the result is -1.
 * 
 * If either argument is null, the result is null.
 * 
 * <p>Java class for PositionOf complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PositionOf"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:hl7-org:elm:r1}Expression"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pattern" type="{urn:hl7-org:elm:r1}Expression"/&gt;
 *         &lt;element name="string" type="{urn:hl7-org:elm:r1}Expression"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PositionOf", namespace = "urn:hl7-org:elm:r1", propOrder = {
    "pattern",
    "string"
})
public class PositionOf
    extends Expression
    implements Equals, HashCode, ToString
{

    @XmlElement(namespace = "urn:hl7-org:elm:r1", required = true)
    protected Expression pattern;
    @XmlElement(namespace = "urn:hl7-org:elm:r1", required = true)
    protected Expression string;

    /**
     * Gets the value of the pattern property.
     * 
     * @return
     *     possible object is
     *     {@link Expression }
     *     
     */
    public Expression getPattern() {
        return pattern;
    }

    /**
     * Sets the value of the pattern property.
     * 
     * @param value
     *     allowed object is
     *     {@link Expression }
     *     
     */
    public void setPattern(Expression value) {
        this.pattern = value;
    }

    /**
     * Gets the value of the string property.
     * 
     * @return
     *     possible object is
     *     {@link Expression }
     *     
     */
    public Expression getString() {
        return string;
    }

    /**
     * Sets the value of the string property.
     * 
     * @param value
     *     allowed object is
     *     {@link Expression }
     *     
     */
    public void setString(Expression value) {
        this.string = value;
    }

    public PositionOf withPattern(Expression value) {
        setPattern(value);
        return this;
    }

    public PositionOf withString(Expression value) {
        setString(value);
        return this;
    }

    @Override
    public PositionOf withAnnotation(Object... values) {
        if (values!= null) {
            for (Object value: values) {
                getAnnotation().add(value);
            }
        }
        return this;
    }

    @Override
    public PositionOf withAnnotation(Collection<Object> values) {
        if (values!= null) {
            getAnnotation().addAll(values);
        }
        return this;
    }

    @Override
    public PositionOf withLocalId(String value) {
        setLocalId(value);
        return this;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof PositionOf)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final PositionOf that = ((PositionOf) object);
        {
            Expression lhsPattern;
            lhsPattern = this.getPattern();
            Expression rhsPattern;
            rhsPattern = that.getPattern();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pattern", lhsPattern), LocatorUtils.property(thatLocator, "pattern", rhsPattern), lhsPattern, rhsPattern)) {
                return false;
            }
        }
        {
            Expression lhsString;
            lhsString = this.getString();
            Expression rhsString;
            rhsString = that.getString();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "string", lhsString), LocatorUtils.property(thatLocator, "string", rhsString), lhsString, rhsString)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = super.hashCode(locator, strategy);
        {
            Expression thePattern;
            thePattern = this.getPattern();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "pattern", thePattern), currentHashCode, thePattern);
        }
        {
            Expression theString;
            theString = this.getString();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "string", theString), currentHashCode, theString);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public String toString() {
        final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            Expression thePattern;
            thePattern = this.getPattern();
            strategy.appendField(locator, this, "pattern", buffer, thePattern);
        }
        {
            Expression theString;
            theString = this.getString();
            strategy.appendField(locator, this, "string", buffer, theString);
        }
        return buffer;
    }

}