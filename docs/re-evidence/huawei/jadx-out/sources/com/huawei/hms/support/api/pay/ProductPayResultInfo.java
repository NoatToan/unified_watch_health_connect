package com.huawei.hms.support.api.pay;

/* JADX INFO: loaded from: classes34.dex */
public class ProductPayResultInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f16519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f16520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f16521c;
    private String d;
    private long e;
    private String f;
    private String g;
    private String h;
    private String i;
    private String j;
    private String k;
    private String l;
    private String m;

    public void setTime(String str) {
        this.h = str;
    }

    public void setSignatureAlgorithm(String str) {
        this.m = str;
    }

    public void setSign(String str) {
        this.k = str;
    }

    public void setReturnCode(int i) {
        this.f16519a = i;
    }

    public void setRequestId(String str) {
        this.i = str;
    }

    public void setProductNo(String str) {
        this.j = str;
    }

    public void setOrderID(String str) {
        this.d = str;
    }

    public void setNewSign(String str) {
        this.l = str;
    }

    public void setMicrosAmount(long j) {
        this.e = j;
    }

    public void setMerchantId(String str) {
        this.f16521c = str;
    }

    public void setErrMsg(String str) {
        this.f16520b = str;
    }

    public void setCurrency(String str) {
        this.f = str;
    }

    public void setCountry(String str) {
        this.g = str;
    }

    public String getTime() {
        return this.h;
    }

    public String getSignatureAlgorithm() {
        return this.m;
    }

    public String getSign() {
        return this.k;
    }

    public int getReturnCode() {
        return this.f16519a;
    }

    public String getRequestId() {
        return this.i;
    }

    public String getProductNo() {
        return this.j;
    }

    public String getOrderID() {
        return this.d;
    }

    public String getNewSign() {
        return this.l;
    }

    public long getMicrosAmount() {
        return this.e;
    }

    public String getMerchantId() {
        return this.f16521c;
    }

    public String getErrMsg() {
        return this.f16520b;
    }

    public String getCurrency() {
        return this.f;
    }

    public String getCountry() {
        return this.g;
    }
}
