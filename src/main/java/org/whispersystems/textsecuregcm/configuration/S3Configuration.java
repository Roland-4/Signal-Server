package org.whispersystems.textsecuregcm.configuration;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by james on 10/05/18.
 */
public class S3Configuration {

    @JsonProperty
    private String endpointOverride;

    public String getEndpointOverride() {
        return endpointOverride;
    }
}
