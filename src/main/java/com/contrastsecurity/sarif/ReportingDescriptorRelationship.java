
package com.contrastsecurity.sarif;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


/**
 * Information about the relation of one reporting descriptor to another.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "target",
    "kinds",
    "description",
    "properties"
})
public class ReportingDescriptorRelationship {

    /**
     * Information about how to locate a relevant reporting descriptor.
     * (Required)
     * 
     */
    @JsonProperty("target")
    @JsonPropertyDescription("Information about how to locate a relevant reporting descriptor.")
    private ReportingDescriptorReference target;
    /**
     * A set of distinct strings that categorize the relationship. Well-known kinds include 'canPrecede', 'canFollow', 'willPrecede', 'willFollow', 'superset', 'subset', 'equal', 'disjoint', 'relevant', and 'incomparable'.
     * 
     */
    @JsonProperty("kinds")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("A set of distinct strings that categorize the relationship. Well-known kinds include 'canPrecede', 'canFollow', 'willPrecede', 'willFollow', 'superset', 'subset', 'equal', 'disjoint', 'relevant', and 'incomparable'.")
    private Set<String> kinds = new LinkedHashSet<String>(Arrays.asList("relevant"));
    /**
     * Encapsulates a message intended to be read by the end user.
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("Encapsulates a message intended to be read by the end user.")
    private Message description;
    /**
     * Key/value pairs that provide additional information about the object.
     * 
     */
    @JsonProperty("properties")
    @JsonPropertyDescription("Key/value pairs that provide additional information about the object.")
    private PropertyBag properties;

    /**
     * Information about how to locate a relevant reporting descriptor.
     * (Required)
     * 
     */
    @JsonProperty("target")
    public ReportingDescriptorReference getTarget() {
        return target;
    }

    /**
     * Information about how to locate a relevant reporting descriptor.
     * (Required)
     * 
     */
    @JsonProperty("target")
    public void setTarget(ReportingDescriptorReference target) {
        this.target = target;
    }

    public ReportingDescriptorRelationship withTarget(ReportingDescriptorReference target) {
        this.target = target;
        return this;
    }

    /**
     * A set of distinct strings that categorize the relationship. Well-known kinds include 'canPrecede', 'canFollow', 'willPrecede', 'willFollow', 'superset', 'subset', 'equal', 'disjoint', 'relevant', and 'incomparable'.
     * 
     */
    @JsonProperty("kinds")
    public Set<String> getKinds() {
        return kinds;
    }

    /**
     * A set of distinct strings that categorize the relationship. Well-known kinds include 'canPrecede', 'canFollow', 'willPrecede', 'willFollow', 'superset', 'subset', 'equal', 'disjoint', 'relevant', and 'incomparable'.
     * 
     */
    @JsonProperty("kinds")
    public void setKinds(Set<String> kinds) {
        this.kinds = kinds;
    }

    public ReportingDescriptorRelationship withKinds(Set<String> kinds) {
        this.kinds = kinds;
        return this;
    }

    /**
     * Encapsulates a message intended to be read by the end user.
     * 
     */
    @JsonProperty("description")
    public Message getDescription() {
        return description;
    }

    /**
     * Encapsulates a message intended to be read by the end user.
     * 
     */
    @JsonProperty("description")
    public void setDescription(Message description) {
        this.description = description;
    }

    public ReportingDescriptorRelationship withDescription(Message description) {
        this.description = description;
        return this;
    }

    /**
     * Key/value pairs that provide additional information about the object.
     * 
     */
    @JsonProperty("properties")
    public PropertyBag getProperties() {
        return properties;
    }

    /**
     * Key/value pairs that provide additional information about the object.
     * 
     */
    @JsonProperty("properties")
    public void setProperties(PropertyBag properties) {
        this.properties = properties;
    }

    public ReportingDescriptorRelationship withProperties(PropertyBag properties) {
        this.properties = properties;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ReportingDescriptorRelationship.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("target");
        sb.append('=');
        sb.append(((this.target == null)?"<null>":this.target));
        sb.append(',');
        sb.append("kinds");
        sb.append('=');
        sb.append(((this.kinds == null)?"<null>":this.kinds));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("properties");
        sb.append('=');
        sb.append(((this.properties == null)?"<null>":this.properties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.kinds == null)? 0 :this.kinds.hashCode()));
        result = ((result* 31)+((this.properties == null)? 0 :this.properties.hashCode()));
        result = ((result* 31)+((this.target == null)? 0 :this.target.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ReportingDescriptorRelationship) == false) {
            return false;
        }
        ReportingDescriptorRelationship rhs = ((ReportingDescriptorRelationship) other);
        return (((((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description)))&&((this.kinds == rhs.kinds)||((this.kinds!= null)&&this.kinds.equals(rhs.kinds))))&&((this.properties == rhs.properties)||((this.properties!= null)&&this.properties.equals(rhs.properties))))&&((this.target == rhs.target)||((this.target!= null)&&this.target.equals(rhs.target))));
    }

}
