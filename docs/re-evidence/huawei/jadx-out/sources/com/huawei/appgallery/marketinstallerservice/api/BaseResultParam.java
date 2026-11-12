package com.huawei.appgallery.marketinstallerservice.api;

/* JADX INFO: loaded from: classes23.dex */
public class BaseResultParam {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f5226a = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f5228c = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f5227b = 0;
    private int e = 0;

    public void setRtnCode(int i) {
        this.e = i;
    }

    public void setResult(int i) {
        this.f5226a = i;
    }

    public void setResponseCode(int i) {
        this.f5227b = i;
    }

    public void setReason(int i) {
        this.f5228c = i;
    }

    public int getRtnCode() {
        return this.e;
    }

    public int getResult() {
        return this.f5226a;
    }

    public int getResponseCode() {
        return this.f5227b;
    }

    public int getReason() {
        return this.f5228c;
    }
}
