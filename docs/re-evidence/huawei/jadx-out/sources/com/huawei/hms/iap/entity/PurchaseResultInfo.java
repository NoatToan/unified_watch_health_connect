package com.huawei.hms.iap.entity;

/* JADX INFO: loaded from: classes10.dex */
public class PurchaseResultInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f13581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f13582b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f13583c;
    private String d;
    private String e;

    public void setSignatureAlgorithm(String str) {
        this.e = str;
    }

    public void setReturnCode(int i) {
        this.f13581a = i;
    }

    public void setInAppPurchaseData(String str) {
        this.f13582b = str;
    }

    public void setInAppDataSignature(String str) {
        this.f13583c = str;
    }

    public void setErrMsg(String str) {
        this.d = str;
    }

    public String getSignatureAlgorithm() {
        return this.e;
    }

    public int getReturnCode() {
        return this.f13581a;
    }

    public String getInAppPurchaseData() {
        return this.f13582b;
    }

    public String getInAppDataSignature() {
        return this.f13583c;
    }

    public String getErrMsg() {
        return this.d;
    }
}
