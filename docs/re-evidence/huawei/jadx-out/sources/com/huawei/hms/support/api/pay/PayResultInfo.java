package com.huawei.hms.support.api.pay;

/* JADX INFO: loaded from: classes10.dex */
public class PayResultInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f16516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f16517b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f16518c;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;
    private String j;
    private String k;
    private String l;
    private String m;

    public void setWithholdID(String str) {
        this.h = str;
    }

    public void setUserName(String str) {
        this.j = str;
    }

    public void setTime(String str) {
        this.g = str;
    }

    public void setSignatureAlgorithm(String str) {
        this.m = str;
    }

    public void setSign(String str) {
        this.k = str;
    }

    public void setReturnCode(int i) {
        this.f16516a = i;
    }

    public void setRequestId(String str) {
        this.i = str;
    }

    public void setOrderID(String str) {
        this.f16518c = str;
    }

    public void setNewSign(String str) {
        this.l = str;
    }

    public void setErrMsg(String str) {
        this.f16517b = str;
    }

    public void setCurrency(String str) {
        this.e = str;
    }

    public void setCountry(String str) {
        this.f = str;
    }

    public void setAmount(String str) {
        this.d = str;
    }

    public String getWithholdID() {
        return this.h;
    }

    public String getUserName() {
        return this.j;
    }

    public String getTime() {
        return this.g;
    }

    public String getSignatureAlgorithm() {
        return this.m;
    }

    public String getSign() {
        return this.k;
    }

    public int getReturnCode() {
        return this.f16516a;
    }

    public String getRequestId() {
        return this.i;
    }

    public String getOrderID() {
        return this.f16518c;
    }

    public String getNewSign() {
        return this.l;
    }

    public String getErrMsg() {
        return this.f16517b;
    }

    public String getCurrency() {
        return this.e;
    }

    public String getCountry() {
        return this.f;
    }

    public String getAmount() {
        return this.d;
    }
}
