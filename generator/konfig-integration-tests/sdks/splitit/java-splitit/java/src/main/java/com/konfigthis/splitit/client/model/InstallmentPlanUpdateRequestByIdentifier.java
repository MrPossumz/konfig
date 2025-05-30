/*
 * splitit-web-api-v3
 * Splitit's Web API
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.splitit.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.konfigthis.splitit.client.model.IdentifierContract;
import com.konfigthis.splitit.client.model.ShippingStatus2;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.konfigthis.splitit.client.JSON;

/**
 * InstallmentPlanUpdateRequestByIdentifier
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class InstallmentPlanUpdateRequestByIdentifier {
  public static final String SERIALIZED_NAME_REF_ORDER_NUMBER = "RefOrderNumber";
  @SerializedName(SERIALIZED_NAME_REF_ORDER_NUMBER)
  private String refOrderNumber;

  public static final String SERIALIZED_NAME_TRACKING_NUMBER = "TrackingNumber";
  @SerializedName(SERIALIZED_NAME_TRACKING_NUMBER)
  private String trackingNumber;

  public static final String SERIALIZED_NAME_CAPTURE = "Capture";
  @SerializedName(SERIALIZED_NAME_CAPTURE)
  private Boolean capture;

  public static final String SERIALIZED_NAME_SHIPPING_STATUS = "ShippingStatus";
  @SerializedName(SERIALIZED_NAME_SHIPPING_STATUS)
  private ShippingStatus2 shippingStatus;

  public static final String SERIALIZED_NAME_IDENTIFIER = "Identifier";
  @SerializedName(SERIALIZED_NAME_IDENTIFIER)
  private IdentifierContract identifier;

  public InstallmentPlanUpdateRequestByIdentifier() {
  }

  public InstallmentPlanUpdateRequestByIdentifier refOrderNumber(String refOrderNumber) {
    
    
    
    
    this.refOrderNumber = refOrderNumber;
    return this;
  }

   /**
   * Get refOrderNumber
   * @return refOrderNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRefOrderNumber() {
    return refOrderNumber;
  }


  public void setRefOrderNumber(String refOrderNumber) {
    
    
    
    this.refOrderNumber = refOrderNumber;
  }


  public InstallmentPlanUpdateRequestByIdentifier trackingNumber(String trackingNumber) {
    
    
    
    
    this.trackingNumber = trackingNumber;
    return this;
  }

   /**
   * Get trackingNumber
   * @return trackingNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTrackingNumber() {
    return trackingNumber;
  }


  public void setTrackingNumber(String trackingNumber) {
    
    
    
    this.trackingNumber = trackingNumber;
  }


  public InstallmentPlanUpdateRequestByIdentifier capture(Boolean capture) {
    
    
    
    
    this.capture = capture;
    return this;
  }

   /**
   * Get capture
   * @return capture
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getCapture() {
    return capture;
  }


  public void setCapture(Boolean capture) {
    
    
    
    this.capture = capture;
  }


  public InstallmentPlanUpdateRequestByIdentifier shippingStatus(ShippingStatus2 shippingStatus) {
    
    
    
    
    this.shippingStatus = shippingStatus;
    return this;
  }

   /**
   * Get shippingStatus
   * @return shippingStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ShippingStatus2 getShippingStatus() {
    return shippingStatus;
  }


  public void setShippingStatus(ShippingStatus2 shippingStatus) {
    
    
    
    this.shippingStatus = shippingStatus;
  }


  public InstallmentPlanUpdateRequestByIdentifier identifier(IdentifierContract identifier) {
    
    
    
    
    this.identifier = identifier;
    return this;
  }

   /**
   * Get identifier
   * @return identifier
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IdentifierContract getIdentifier() {
    return identifier;
  }


  public void setIdentifier(IdentifierContract identifier) {
    
    
    
    this.identifier = identifier;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the InstallmentPlanUpdateRequestByIdentifier instance itself
   */
  public InstallmentPlanUpdateRequestByIdentifier putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstallmentPlanUpdateRequestByIdentifier installmentPlanUpdateRequestByIdentifier = (InstallmentPlanUpdateRequestByIdentifier) o;
    return Objects.equals(this.refOrderNumber, installmentPlanUpdateRequestByIdentifier.refOrderNumber) &&
        Objects.equals(this.trackingNumber, installmentPlanUpdateRequestByIdentifier.trackingNumber) &&
        Objects.equals(this.capture, installmentPlanUpdateRequestByIdentifier.capture) &&
        Objects.equals(this.shippingStatus, installmentPlanUpdateRequestByIdentifier.shippingStatus) &&
        Objects.equals(this.identifier, installmentPlanUpdateRequestByIdentifier.identifier)&&
        Objects.equals(this.additionalProperties, installmentPlanUpdateRequestByIdentifier.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(refOrderNumber, trackingNumber, capture, shippingStatus, identifier, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstallmentPlanUpdateRequestByIdentifier {\n");
    sb.append("    refOrderNumber: ").append(toIndentedString(refOrderNumber)).append("\n");
    sb.append("    trackingNumber: ").append(toIndentedString(trackingNumber)).append("\n");
    sb.append("    capture: ").append(toIndentedString(capture)).append("\n");
    sb.append("    shippingStatus: ").append(toIndentedString(shippingStatus)).append("\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("RefOrderNumber");
    openapiFields.add("TrackingNumber");
    openapiFields.add("Capture");
    openapiFields.add("ShippingStatus");
    openapiFields.add("Identifier");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to InstallmentPlanUpdateRequestByIdentifier
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!InstallmentPlanUpdateRequestByIdentifier.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in InstallmentPlanUpdateRequestByIdentifier is not found in the empty JSON string", InstallmentPlanUpdateRequestByIdentifier.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("RefOrderNumber") != null && !jsonObj.get("RefOrderNumber").isJsonNull()) && !jsonObj.get("RefOrderNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `RefOrderNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("RefOrderNumber").toString()));
      }
      if ((jsonObj.get("TrackingNumber") != null && !jsonObj.get("TrackingNumber").isJsonNull()) && !jsonObj.get("TrackingNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `TrackingNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("TrackingNumber").toString()));
      }
      // validate the optional field `Identifier`
      if (jsonObj.get("Identifier") != null && !jsonObj.get("Identifier").isJsonNull()) {
        IdentifierContract.validateJsonObject(jsonObj.getAsJsonObject("Identifier"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InstallmentPlanUpdateRequestByIdentifier.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InstallmentPlanUpdateRequestByIdentifier' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InstallmentPlanUpdateRequestByIdentifier> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InstallmentPlanUpdateRequestByIdentifier.class));

       return (TypeAdapter<T>) new TypeAdapter<InstallmentPlanUpdateRequestByIdentifier>() {
           @Override
           public void write(JsonWriter out, InstallmentPlanUpdateRequestByIdentifier value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else if (entry.getValue() == null) {
                   obj.addProperty(entry.getKey(), (String) null);
                 } else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public InstallmentPlanUpdateRequestByIdentifier read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             InstallmentPlanUpdateRequestByIdentifier instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of InstallmentPlanUpdateRequestByIdentifier given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of InstallmentPlanUpdateRequestByIdentifier
  * @throws IOException if the JSON string is invalid with respect to InstallmentPlanUpdateRequestByIdentifier
  */
  public static InstallmentPlanUpdateRequestByIdentifier fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InstallmentPlanUpdateRequestByIdentifier.class);
  }

 /**
  * Convert an instance of InstallmentPlanUpdateRequestByIdentifier to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

