package com.huawei.maps.offlinedata.handler.dto;

import com.google.gson.annotations.SerializedName;
import com.huawei.hms.kit.awareness.b.a.a;
import java.util.Set;

/* JADX INFO: loaded from: classes40.dex */
public class ConfigParams {

    @SerializedName(a.g)
    private String apiKey;

    @SerializedName("autoDownload")
    private boolean autoDownload;

    @SerializedName("cloudServiceUrl")
    private String cloudServiceUrl;

    @SerializedName("dataTypes")
    private Set<String> dataTypes;

    @SerializedName("deviceName")
    private String deviceName;

    @SerializedName("deviceType")
    private String deviceType;

    @SerializedName("mapSki")
    private boolean mapSki;

    @SerializedName("newDevice")
    private boolean newDevice;

    @SerializedName("political")
    private String political;

    @SerializedName("recommendCityIds")
    private String[] recommendCityIds;

    @SerializedName("smartModeType")
    private int smartModeType;

    @SerializedName("versionCode")
    private String versionCode;

    public String getApiKey() {
        return this.apiKey;
    }

    public boolean getAutoDownload() {
        return this.autoDownload;
    }

    public String getCloudServiceUrl() {
        return this.cloudServiceUrl;
    }

    public Set<String> getDataTypes() {
        return this.dataTypes;
    }

    public String getDeviceName() {
        return this.deviceName;
    }

    public String getDeviceType() {
        return this.deviceType;
    }

    public boolean getMapSki() {
        return this.mapSki;
    }

    public boolean getNewDevice() {
        return this.newDevice;
    }

    public String getPolitical() {
        return this.political;
    }

    public String[] getRecommendCityIds() {
        return this.recommendCityIds;
    }

    public int getSmartModeType() {
        return this.smartModeType;
    }

    public String isVersionCode() {
        return this.versionCode;
    }

    public void setApiKey(String str) {
        this.apiKey = str;
    }

    public void setAutoDownload(boolean z) {
        this.autoDownload = z;
    }

    public void setCloudServiceUrl(String str) {
        this.cloudServiceUrl = str;
    }

    public void setDataTypes(Set<String> set) {
        this.dataTypes = set;
    }

    public void setDeviceName(String str) {
        this.deviceName = str;
    }

    public void setDeviceType(String str) {
        this.deviceType = str;
    }

    public void setMapSki(boolean z) {
        this.mapSki = z;
    }

    public void setNewDevice(boolean z) {
        this.newDevice = z;
    }

    public void setPolitical(String str) {
        this.political = str;
    }

    public void setRecommendCityIds(String[] strArr) {
        this.recommendCityIds = strArr;
    }

    public void setSmartModeType(int i) {
        this.smartModeType = i;
    }

    public void setVersionCode(String str) {
        this.versionCode = str;
    }
}
