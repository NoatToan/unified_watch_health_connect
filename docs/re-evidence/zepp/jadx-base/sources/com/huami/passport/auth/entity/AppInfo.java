package com.huami.passport.auth.entity;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.hm.health.device.webapi.device.HMDeviceWebAPI;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class AppInfo extends Entity {

    @SerializedName("appId")
    private String appId;

    @SerializedName("appType")
    private String appType;

    @SerializedName("codeSignature")
    private String codeSignature;

    @SerializedName("description")
    private String description;

    @SerializedName(HMDeviceWebAPI.PARAM_UPDATE_DEVICE_INFO_DISPLAY_NAME)
    private String displayName;

    @SerializedName("icon")
    private String icon;

    @SerializedName("packageId")
    private String packageId;

    @SerializedName("redirectURIs")
    private String redirectURIs;

    @SerializedName("scopes")
    private List<Scopes> scopes;

    public static class Scopes {

        @SerializedName("id")
        private String id;

        @SerializedName("name")
        private String name;

        public String getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }

        public void setId(String str) {
            this.id = str;
        }

        public void setName(String str) {
            this.name = str;
        }

        public String toString() {
            return "{id='" + this.id + "', name='" + this.name + "'}";
        }
    }

    public String getAppId() {
        return this.appId;
    }

    public String getAppType() {
        return this.appType;
    }

    public String getCodeSignature() {
        return this.codeSignature;
    }

    public String getDescription() {
        return this.description;
    }

    public String getDisplayName() {
        return this.displayName;
    }

    public String getIcon() {
        return this.icon;
    }

    public String getPackageId() {
        return this.packageId;
    }

    public String getRedirectURIs() {
        return this.redirectURIs;
    }

    public List<Scopes> getScopes() {
        return this.scopes;
    }

    public void setAppId(String str) {
        this.appId = str;
    }

    public void setAppType(String str) {
        this.appType = str;
    }

    public void setCodeSignature(String str) {
        this.codeSignature = str;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setDisplayName(String str) {
        this.displayName = str;
    }

    public void setIcon(String str) {
        this.icon = str;
    }

    public void setPackageId(String str) {
        this.packageId = str;
    }

    public void setRedirectURIs(String str) {
        this.redirectURIs = str;
    }

    public void setScopes(List<Scopes> list) {
        this.scopes = list;
    }

    public String toString() {
        return "AppInfo{appId='" + this.appId + "', appType='" + this.appType + "', displayName='" + this.displayName + "', packageId='" + this.packageId + "', codeSignature='" + this.codeSignature + "', description='" + this.description + "', icon='" + this.icon + "', redirectURIs='" + this.redirectURIs + "'}";
    }
}
