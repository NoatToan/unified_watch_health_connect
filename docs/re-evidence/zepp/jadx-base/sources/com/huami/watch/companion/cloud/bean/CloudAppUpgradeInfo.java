package com.huami.watch.companion.cloud.bean;

/* JADX INFO: loaded from: classes16.dex */
public class CloudAppUpgradeInfo {
    private String appChannel;
    private String appName;
    private String appType;
    private String changeLog;
    private String channelUrl;
    private int forceUpgrade;
    private int versionCode;
    private String versionName;

    public String getAppChannel() {
        return this.appChannel;
    }

    public String getAppName() {
        return this.appName;
    }

    public String getAppType() {
        return this.appType;
    }

    public String getChangeLog() {
        return this.changeLog;
    }

    public String getChannelUrl() {
        return this.channelUrl;
    }

    public int getForceUpgrade() {
        return this.forceUpgrade;
    }

    public int getVersionCode() {
        return this.versionCode;
    }

    public String getVersionName() {
        return this.versionName;
    }

    public void setAppChannel(String str) {
        this.appChannel = str;
    }

    public void setAppName(String str) {
        this.appName = str;
    }

    public void setAppType(String str) {
        this.appType = str;
    }

    public void setChangeLog(String str) {
        this.changeLog = str;
    }

    public void setChannelUrl(String str) {
        this.channelUrl = str;
    }

    public void setForceUpgrade(int i) {
        this.forceUpgrade = i;
    }

    public void setVersionCode(int i) {
        this.versionCode = i;
    }

    public void setVersionName(String str) {
        this.versionName = str;
    }
}
