package com.xiaomi.ai.domain.phonecall.common;

/* JADX INFO: loaded from: classes7.dex */
public class DeviceApp {
    private static DeviceApp defaultDevice = new DeviceApp("2882303761517406062", "MIAI", "Device/Phone");
    private String appId;
    private String appName;
    private String category;

    public DeviceApp(String str, String str2, String str3) {
        this.appName = "";
        this.appId = "";
        this.category = "";
        this.appId = str == null ? "" : str;
        this.appName = str2 == null ? "" : str2;
        this.category = str3 == null ? "" : str3;
    }

    public static DeviceApp Default() {
        return defaultDevice;
    }

    public String getAppId() {
        return this.appId;
    }

    public String getAppName() {
        return this.appName;
    }

    public String getCategory() {
        return this.category;
    }

    public void setAppId(String str) {
        this.appId = str;
    }

    public void setAppName(String str) {
        this.appName = str;
    }

    public void setCategory(String str) {
        this.category = str;
    }
}
