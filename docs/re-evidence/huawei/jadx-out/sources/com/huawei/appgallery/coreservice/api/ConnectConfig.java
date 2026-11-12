package com.huawei.appgallery.coreservice.api;

import defpackage.bhn;
import java.io.Serializable;

/* JADX INFO: loaded from: classes23.dex */
public class ConnectConfig implements Cloneable, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f5202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f5203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f5204c;
    private String d;
    private String e;

    public void setInstallAppName(String str) {
        this.f5202a = str;
    }

    public void setConnectServiceAction(String str) {
        this.f5203b = str;
    }

    public void setConnectAppPkg(String str) {
        this.d = str;
    }

    public void setAppSignCertchain(String str) {
        this.e = str;
    }

    public void setAppFingerprintSignature(String str) {
        this.f5204c = str;
    }

    public String getInstallAppName() {
        return this.f5202a;
    }

    public String getConnectServiceAction() {
        return this.f5203b;
    }

    public String getConnectAppPkg() {
        return this.d;
    }

    public String getAppSignCertchain() {
        return this.e;
    }

    public String getAppFingerprintSignature() {
        return this.f5204c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public ConnectConfig m812clone() {
        try {
            return (ConnectConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            bhn.a("ConnectConfig", "ConnectConfig Clone error:" + e.getMessage());
            return null;
        }
    }
}
