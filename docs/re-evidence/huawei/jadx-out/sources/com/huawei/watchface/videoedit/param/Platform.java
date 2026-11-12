package com.huawei.watchface.videoedit.param;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes45.dex */
public class Platform {

    @SerializedName("app_version")
    @Expose
    private String appVersion;

    @SerializedName("os")
    @Expose
    private String os;

    @SerializedName("os_version")
    @Expose
    private String osVersion;

    public String getAppVersion() {
        return this.appVersion;
    }

    public String getOs() {
        return this.os;
    }

    public String getOsVersion() {
        return this.osVersion;
    }

    public void setAppVersion(String str) {
        this.appVersion = str;
    }

    public void setOs(String str) {
        this.os = str;
    }

    public void setOsVersion(String str) {
        this.osVersion = str;
    }

    public Platform withAppVersion(String str) {
        this.appVersion = str;
        return this;
    }

    public Platform withOs(String str) {
        this.os = str;
        return this;
    }

    public Platform withOsVersion(String str) {
        this.osVersion = str;
        return this;
    }
}
