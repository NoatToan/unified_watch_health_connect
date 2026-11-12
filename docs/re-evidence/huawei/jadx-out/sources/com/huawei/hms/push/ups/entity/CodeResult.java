package com.huawei.hms.push.ups.entity;

/* JADX INFO: loaded from: classes34.dex */
public class CodeResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f15892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f15893b;

    public CodeResult() {
    }

    public String getReason() {
        return this.f15893b;
    }

    public int getReturnCode() {
        return this.f15892a;
    }

    public void setReason(String str) {
        this.f15893b = str;
    }

    public void setReturnCode(int i) {
        this.f15892a = i;
    }

    public CodeResult(int i) {
        this.f15892a = i;
    }

    public CodeResult(int i, String str) {
        this.f15892a = i;
        this.f15893b = str;
    }
}
