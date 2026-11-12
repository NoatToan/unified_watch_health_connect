package com.huawei.watchface.mvp.model.datatype;

/* JADX INFO: loaded from: classes45.dex */
public class ConsentRecord {
    private String appVersion;
    private String consentType;
    private String countryCode;
    private String personalSwitch;
    private String recordTime;
    private String userId;

    public String getAppVersion() {
        return this.appVersion;
    }

    public String getConsentType() {
        return this.consentType;
    }

    public String getCountryCode() {
        return this.countryCode;
    }

    public String getPersonalSwitch() {
        return this.personalSwitch;
    }

    public String getRecordTime() {
        return this.recordTime;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setAppVersion(String str) {
        this.appVersion = str;
    }

    public void setConsentType(String str) {
        this.consentType = str;
    }

    public void setCountryCode(String str) {
        this.countryCode = str;
    }

    public void setPersonalSwitch(String str) {
        this.personalSwitch = str;
    }

    public void setRecordTime(String str) {
        this.recordTime = str;
    }

    public void setUserId(String str) {
        this.userId = str;
    }
}
