/*
 * ProActive Parallel Suite(TM):
 * The Open Source library for parallel and distributed
 * Workflows & Scheduling, Orchestration, Cloud Automation
 * and Big Data Analysis on Enterprise Grids & Clouds.
 *
 * Copyright (c) 2007 - 2017 ActiveEon
 * Contact: contact@activeeon.com
 *
 * This library is free software: you can redistribute it and/or
 * modify it under the terms of the GNU Affero General Public License
 * as published by the Free Software Foundation: version 3 of
 * the License.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 *
 * If needed, contact us to obtain a release under GPL Version 2 or 3
 * or a different license than the AGPL.
 */
package io.swagger.client.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * URL
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-01-05T11:32:29.758+01:00")
public class URL {
    @JsonProperty("authority")
    private String authority = null;

    @JsonProperty("content")
    private Object content = null;

    @JsonProperty("defaultPort")
    private Integer defaultPort = null;

    @JsonProperty("file")
    private String file = null;

    @JsonProperty("host")
    private String host = null;

    @JsonProperty("path")
    private String path = null;

    @JsonProperty("port")
    private Integer port = null;

    @JsonProperty("protocol")
    private String protocol = null;

    @JsonProperty("query")
    private String query = null;

    @JsonProperty("ref")
    private String ref = null;

    @JsonProperty("userInfo")
    private String userInfo = null;

    public URL authority(String authority) {
        this.authority = authority;
        return this;
    }

    /**
    * Get authority
    * @return authority
    **/
    @ApiModelProperty(value = "")
    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    public URL content(Object content) {
        this.content = content;
        return this;
    }

    /**
    * Get content
    * @return content
    **/
    @ApiModelProperty(value = "")
    public Object getContent() {
        return content;
    }

    public void setContent(Object content) {
        this.content = content;
    }

    public URL defaultPort(Integer defaultPort) {
        this.defaultPort = defaultPort;
        return this;
    }

    /**
    * Get defaultPort
    * @return defaultPort
    **/
    @ApiModelProperty(value = "")
    public Integer getDefaultPort() {
        return defaultPort;
    }

    public void setDefaultPort(Integer defaultPort) {
        this.defaultPort = defaultPort;
    }

    public URL file(String file) {
        this.file = file;
        return this;
    }

    /**
    * Get file
    * @return file
    **/
    @ApiModelProperty(value = "")
    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public URL host(String host) {
        this.host = host;
        return this;
    }

    /**
    * Get host
    * @return host
    **/
    @ApiModelProperty(value = "")
    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public URL path(String path) {
        this.path = path;
        return this;
    }

    /**
    * Get path
    * @return path
    **/
    @ApiModelProperty(value = "")
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public URL port(Integer port) {
        this.port = port;
        return this;
    }

    /**
    * Get port
    * @return port
    **/
    @ApiModelProperty(value = "")
    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public URL protocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
    * Get protocol
    * @return protocol
    **/
    @ApiModelProperty(value = "")
    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public URL query(String query) {
        this.query = query;
        return this;
    }

    /**
    * Get query
    * @return query
    **/
    @ApiModelProperty(value = "")
    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public URL ref(String ref) {
        this.ref = ref;
        return this;
    }

    /**
    * Get ref
    * @return ref
    **/
    @ApiModelProperty(value = "")
    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public URL userInfo(String userInfo) {
        this.userInfo = userInfo;
        return this;
    }

    /**
    * Get userInfo
    * @return userInfo
    **/
    @ApiModelProperty(value = "")
    public String getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(String userInfo) {
        this.userInfo = userInfo;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        URL URL = (URL) o;
        return Objects.equals(this.authority, URL.authority) && Objects.equals(this.content, URL.content) &&
               Objects.equals(this.defaultPort, URL.defaultPort) && Objects.equals(this.file, URL.file) &&
               Objects.equals(this.host, URL.host) && Objects.equals(this.path, URL.path) &&
               Objects.equals(this.port, URL.port) && Objects.equals(this.protocol, URL.protocol) &&
               Objects.equals(this.query, URL.query) && Objects.equals(this.ref, URL.ref) &&
               Objects.equals(this.userInfo, URL.userInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authority, content, defaultPort, file, host, path, port, protocol, query, ref, userInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class URL {\n");

        sb.append("    authority: ").append(toIndentedString(authority)).append("\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
        sb.append("    defaultPort: ").append(toIndentedString(defaultPort)).append("\n");
        sb.append("    file: ").append(toIndentedString(file)).append("\n");
        sb.append("    host: ").append(toIndentedString(host)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
        sb.append("    query: ").append(toIndentedString(query)).append("\n");
        sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
        sb.append("    userInfo: ").append(toIndentedString(userInfo)).append("\n");
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
