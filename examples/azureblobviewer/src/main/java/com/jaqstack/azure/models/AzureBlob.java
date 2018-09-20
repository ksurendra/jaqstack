package com.jaqstack.azure.models;

/**
 *
 */
public class AzureBlob {

    private String blobName;
    private String blobURL;
    private String blboMimeType;

    public AzureBlob(String blobName, String blobURL, String blboMimeType) {
        this.blobName = blobName;
        this.blobURL = blobURL;
        this.blboMimeType = blboMimeType;
    }

    public String getBlobName() {
        return blobName;
    }

    public void setBlobName(String blobName) {
        this.blobName = blobName;
    }

    public String getBlobURL() {
        return blobURL;
    }

    public void setBlobURL(String blobURL) {
        this.blobURL = blobURL;
    }

    public String getBlboMimeType() {
        return blboMimeType;
    }

    public void setBlboMimeType(String blboMimeType) {
        this.blboMimeType = blboMimeType;
    }
}
