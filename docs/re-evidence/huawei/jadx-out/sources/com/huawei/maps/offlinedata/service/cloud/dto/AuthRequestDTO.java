package com.huawei.maps.offlinedata.service.cloud.dto;

/* JADX INFO: loaded from: classes12.dex */
public class AuthRequestDTO extends BaseRequestDTO {
    private String appId;
    private String certificateFingerprint;
    private String deviceModel;
    private String localeCountry;
    private String networkCountry;
    private String packageName;
    private String simCardCountry;
    private String vendorCountry;

    public String getAppId() {
        return this.appId;
    }

    public String getCertificateFingerprint() {
        return this.certificateFingerprint;
    }

    public String getDeviceLocaleCountry() {
        return this.localeCountry;
    }

    public String getDeviceModel() {
        return this.deviceModel;
    }

    public String getNetworkCountry() {
        return this.networkCountry;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public String getSimCardCountry() {
        return this.simCardCountry;
    }

    public String getVendorCountry() {
        return this.vendorCountry;
    }

    public void setAppId(String str) {
        this.appId = str;
    }

    public void setCertificateFingerprint(String str) {
        this.certificateFingerprint = str;
    }

    public void setDeviceLocaleCountry(String str) {
        this.localeCountry = str;
    }

    public void setDeviceModel(String str) {
        this.deviceModel = str;
    }

    public void setNetworkCountry(String str) {
        this.networkCountry = str;
    }

    public void setPackageName(String str) {
        this.packageName = str;
    }

    public void setSimCardCountry(String str) {
        this.simCardCountry = str;
    }

    public void setVendorCountry(String str) {
        this.vendorCountry = str;
    }

    public String toString() {
        return "AuthRequestDTO{appId='" + this.appId + "', packageName='" + this.packageName + "', deviceModel='" + this.deviceModel + "', networkCountry='" + this.networkCountry + "', simCardCountry='" + this.simCardCountry + "', vendorCountry='" + this.vendorCountry + "', localeCountry='" + this.localeCountry + "', requestId='" + getRequestId() + "'}";
    }
}
