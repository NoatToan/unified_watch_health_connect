package com.huawei.appgallery.marketinstallerservice.api;

/* JADX INFO: loaded from: classes23.dex */
public class BaseParamSpec {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f5225b = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f5224a = null;
    private String e = null;
    private boolean d = false;

    public void setUpdate(boolean z) {
        this.d = z;
    }

    public void setSubsystem(String str) {
        this.f5224a = str;
    }

    public void setServerUrl(String str) {
        this.f5225b = str;
    }

    public void setMarketPkg(String str) {
        this.e = str;
    }

    public boolean isUpdate() {
        return this.d;
    }

    public String getSubsystem() {
        return this.f5224a;
    }

    public String getServerUrl() {
        return this.f5225b;
    }

    public String getMarketPkg() {
        return this.e;
    }
}
