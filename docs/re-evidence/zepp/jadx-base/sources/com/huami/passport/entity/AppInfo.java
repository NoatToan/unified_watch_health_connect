package com.huami.passport.entity;

import com.huami.passport.IAccount;
import java.io.Serializable;

/* JADX INFO: loaded from: classes12.dex */
public class AppInfo implements Serializable {
    private int versionCode;
    private String packageName = IAccount.PROVIDER_UNKOWN;
    private String versionName = IAccount.PROVIDER_UNKOWN;
    private String appId = IAccount.PROVIDER_UNKOWN;

    public String buildParams() {
        return this.packageName + ":" + this.versionName + ":" + this.versionCode;
    }

    public String getAppId() {
        return this.appId;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public int getVersionCode() {
        return this.versionCode;
    }

    public String getVersionName() {
        return this.versionName;
    }

    public void setAppId(String str) {
        this.appId = str;
    }

    public void setPackageName(String str) {
        this.packageName = str;
    }

    public void setVersionCode(int i) {
        this.versionCode = i;
    }

    public void setVersionName(String str) {
        this.versionName = str;
    }
}
