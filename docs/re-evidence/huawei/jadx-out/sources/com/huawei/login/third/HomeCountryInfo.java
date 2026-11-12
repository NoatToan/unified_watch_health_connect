package com.huawei.login.third;

/* JADX INFO: loaded from: classes2.dex */
public class HomeCountryInfo {
    private int currentSiteId;
    private String homeCountryCode;
    private String nationalCode;
    private int resultCode;
    private String resultDesc;
    private int siteId;
    private int srvFlag;
    private String srvNationalCode;
    private boolean useSrvNationalCode;

    public int getResultCode() {
        return this.resultCode;
    }

    public void setResultCode(int i) {
        this.resultCode = i;
    }

    public String getResultDesc() {
        return this.resultDesc;
    }

    public void setResultDesc(String str) {
        this.resultDesc = str;
    }

    public int getSiteId() {
        return this.siteId;
    }

    public void setSiteId(int i) {
        this.siteId = i;
    }

    public String getSrvNationalCode() {
        return this.srvNationalCode;
    }

    public void setSrvNationalCode(String str) {
        this.srvNationalCode = str;
    }

    public String getNationalCode() {
        return this.nationalCode;
    }

    public void setNationalCode(String str) {
        this.nationalCode = str;
    }

    public int getSrvFlag() {
        return this.srvFlag;
    }

    public void setSrvFlag(int i) {
        this.srvFlag = i;
    }

    public boolean isUseSrvNationalCode() {
        return this.useSrvNationalCode;
    }

    public void setUseSrvNationalCode(boolean z) {
        this.useSrvNationalCode = z;
    }

    public String getHomeCountryCode() {
        return this.homeCountryCode;
    }

    public void setHomeCountryCode(String str) {
        this.homeCountryCode = str;
    }

    public int getCurrentSiteId() {
        return this.currentSiteId;
    }

    public void setCurrentSiteId(int i) {
        this.currentSiteId = i;
    }

    public String toString() {
        return "HC{resultCode=" + this.resultCode + ", resultDesc='" + this.resultDesc + "', sd=" + this.siteId + ", sC='" + this.srvNationalCode + "', nC='" + this.nationalCode + "', hC='" + this.homeCountryCode + "', srvFlag=" + this.srvFlag + ", useSrv=" + this.useSrvNationalCode + '}';
    }
}
