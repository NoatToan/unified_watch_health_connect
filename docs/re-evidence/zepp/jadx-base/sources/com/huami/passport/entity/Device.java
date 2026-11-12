package com.huami.passport.entity;

import java.io.Serializable;

/* JADX INFO: loaded from: classes12.dex */
public class Device implements Serializable {
    public static final String ANDROID_PAD_MODEL = "android_pad";
    public static final String ANDROID_PHONE_MODEL = "android_phone";
    public static final String ANDROID_TV_MODEL = "android_tv";
    public static final String ANDROID_WATCH_MODEL = "android_watch";
    private String deviceModel = "android_phone";
    private String deviceid;
    private String deviceidType;

    public String getDeviceModel() {
        return this.deviceModel;
    }

    public String getDeviceid() {
        return this.deviceid;
    }

    public String getDeviceidType() {
        return this.deviceidType;
    }

    public void setDeviceModel(String str) {
        this.deviceModel = str;
    }

    public void setDeviceid(String str) {
        this.deviceid = str;
    }

    public void setDeviceidType(String str) {
        this.deviceidType = str;
    }
}
