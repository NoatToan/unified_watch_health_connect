package com.service.mi.entity;

/* JADX INFO: loaded from: classes6.dex */
public class SdkInfo {
    private int versionCode;
    private String versionName;

    public SdkInfo(String str, int i) {
        this.versionName = str;
        this.versionCode = i;
    }

    public int getVersionCode() {
        return this.versionCode;
    }

    public String getVersionName() {
        return this.versionName;
    }

    public void setVersionCode(int i) {
        this.versionCode = i;
    }

    public void setVersionName(String str) {
        this.versionName = str;
    }
}
