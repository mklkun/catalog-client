/*
 * CatalogObjectEntity Catalog API
 * The purpose of the catalog is to store ProActive objects.  A catalog is subdivided into buckets.   Each bucket manages zero, one or more versioned ProActive objects.
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.ow2.proactive.catalog.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.ow2.proactive.catalog.client.model.Link;
import org.ow2.proactive.catalog.client.model.Metadata;

/**
 * CatalogObjectMetadata
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-07-04T11:48:46.837+02:00")
public class CatalogObjectMetadata {
  @JsonProperty("bucket_name")
  private String bucketName = null;

  @JsonProperty("commit_message")
  private String commitMessage = null;

  @JsonProperty("commit_time")
  private String commitTime = null;

  @JsonProperty("commit_time_raw")
  private String commitTimeRaw = null;

  @JsonProperty("content_type")
  private String contentType = null;

  @JsonProperty("kind")
  private String kind = null;

  @JsonProperty("links")
  private List<Link> links = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("object_key_values")
  private List<Metadata> objectKeyValues = null;

  public CatalogObjectMetadata bucketName(String bucketName) {
    this.bucketName = bucketName;
    return this;
  }

   /**
   * Get bucketName
   * @return bucketName
  **/
  @ApiModelProperty(value = "")
  public String getBucketName() {
    return bucketName;
  }

  public void setBucketName(String bucketName) {
    this.bucketName = bucketName;
  }

  public CatalogObjectMetadata commitMessage(String commitMessage) {
    this.commitMessage = commitMessage;
    return this;
  }

   /**
   * Get commitMessage
   * @return commitMessage
  **/
  @ApiModelProperty(value = "")
  public String getCommitMessage() {
    return commitMessage;
  }

  public void setCommitMessage(String commitMessage) {
    this.commitMessage = commitMessage;
  }

  public CatalogObjectMetadata commitTime(String commitTime) {
    this.commitTime = commitTime;
    return this;
  }

   /**
   * Get commitTime
   * @return commitTime
  **/
  @ApiModelProperty(value = "")
  public String getCommitTime() {
    return commitTime;
  }

  public void setCommitTime(String commitTime) {
    this.commitTime = commitTime;
  }

  public CatalogObjectMetadata commitTimeRaw(String commitTimeRaw) {
    this.commitTimeRaw = commitTimeRaw;
    return this;
  }

   /**
   * Get commitTimeRaw
   * @return commitTimeRaw
  **/
  @ApiModelProperty(value = "")
  public String getCommitTimeRaw() {
    return commitTimeRaw;
  }

  public void setCommitTimeRaw(String commitTimeRaw) {
    this.commitTimeRaw = commitTimeRaw;
  }

  public CatalogObjectMetadata contentType(String contentType) {
    this.contentType = contentType;
    return this;
  }

   /**
   * Get contentType
   * @return contentType
  **/
  @ApiModelProperty(value = "")
  public String getContentType() {
    return contentType;
  }

  public void setContentType(String contentType) {
    this.contentType = contentType;
  }

  public CatalogObjectMetadata kind(String kind) {
    this.kind = kind;
    return this;
  }

   /**
   * Get kind
   * @return kind
  **/
  @ApiModelProperty(value = "")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public CatalogObjectMetadata links(List<Link> links) {
    this.links = links;
    return this;
  }

  public CatalogObjectMetadata addLinksItem(Link linksItem) {
    if (this.links == null) {
      this.links = new ArrayList<>();
    }
    this.links.add(linksItem);
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(value = "")
  public List<Link> getLinks() {
    return links;
  }

  public void setLinks(List<Link> links) {
    this.links = links;
  }

  public CatalogObjectMetadata name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CatalogObjectMetadata objectKeyValues(List<Metadata> objectKeyValues) {
    this.objectKeyValues = objectKeyValues;
    return this;
  }

  public CatalogObjectMetadata addObjectKeyValuesItem(Metadata objectKeyValuesItem) {
    if (this.objectKeyValues == null) {
      this.objectKeyValues = new ArrayList<>();
    }
    this.objectKeyValues.add(objectKeyValuesItem);
    return this;
  }

   /**
   * Get objectKeyValues
   * @return objectKeyValues
  **/
  @ApiModelProperty(value = "")
  public List<Metadata> getObjectKeyValues() {
    return objectKeyValues;
  }

  public void setObjectKeyValues(List<Metadata> objectKeyValues) {
    this.objectKeyValues = objectKeyValues;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogObjectMetadata catalogObjectMetadata = (CatalogObjectMetadata) o;
    return Objects.equals(this.bucketName, catalogObjectMetadata.bucketName) &&
        Objects.equals(this.commitMessage, catalogObjectMetadata.commitMessage) &&
        Objects.equals(this.commitTime, catalogObjectMetadata.commitTime) &&
        Objects.equals(this.commitTimeRaw, catalogObjectMetadata.commitTimeRaw) &&
        Objects.equals(this.contentType, catalogObjectMetadata.contentType) &&
        Objects.equals(this.kind, catalogObjectMetadata.kind) &&
        Objects.equals(this.links, catalogObjectMetadata.links) &&
        Objects.equals(this.name, catalogObjectMetadata.name) &&
        Objects.equals(this.objectKeyValues, catalogObjectMetadata.objectKeyValues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bucketName, commitMessage, commitTime, commitTimeRaw, contentType, kind, links, name, objectKeyValues);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogObjectMetadata {\n");
    
    sb.append("    bucketName: ").append(toIndentedString(bucketName)).append("\n");
    sb.append("    commitMessage: ").append(toIndentedString(commitMessage)).append("\n");
    sb.append("    commitTime: ").append(toIndentedString(commitTime)).append("\n");
    sb.append("    commitTimeRaw: ").append(toIndentedString(commitTimeRaw)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    objectKeyValues: ").append(toIndentedString(objectKeyValues)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

