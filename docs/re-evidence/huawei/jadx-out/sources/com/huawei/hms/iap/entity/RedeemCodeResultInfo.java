package com.huawei.hms.iap.entity;

/* JADX INFO: loaded from: classes10.dex */
public class RedeemCodeResultInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f13584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f13585b = 1;

    public void setReturnCode(int i) {
        this.f13585b = i;
    }

    public void setRedeemCode(String str) {
        this.f13584a = str;
    }

    public int getReturnCode() {
        return this.f13585b;
    }

    public String getRedeemCode() {
        return this.f13584a;
    }
}
