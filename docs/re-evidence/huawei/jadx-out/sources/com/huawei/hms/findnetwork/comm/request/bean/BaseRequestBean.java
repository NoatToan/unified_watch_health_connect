package com.huawei.hms.findnetwork.comm.request.bean;

/* JADX INFO: loaded from: classes10.dex */
public class BaseRequestBean {
    protected String appId;
    protected String cpAppVersion;
    protected String mSrcTranId;
    protected String pkgName;
    protected String region;
    protected int uid;

    public void setUid(int i) {
        this.uid = i;
    }

    public void setSrcTranId(String str) {
        this.mSrcTranId = str;
    }

    public void setRegion(String str) {
        this.region = str;
    }

    public void setPkgName(String str) {
        this.pkgName = str;
    }

    public void setCpAppVersion(String str) {
        this.cpAppVersion = str;
    }

    public void setAppId(String str) {
        this.appId = str;
    }

    public int getUid() {
        return this.uid;
    }

    public String getSrcTranId() {
        return this.mSrcTranId;
    }

    public String getRegion() {
        return this.region;
    }

    public String getPkgName() {
        return this.pkgName;
    }

    public String getCpAppVersion() {
        return this.cpAppVersion;
    }

    public String getAppId() {
        return this.appId;
    }
}
