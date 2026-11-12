package com.huawei.wearengine.auth;

/* JADX INFO: loaded from: classes20.dex */
public class AuthInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f30745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f30746b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f30747c;
    private int d;
    private int e;
    private String h;

    public int getOpenStatus() {
        return this.d;
    }

    public void setOpenStatus(int i) {
        this.d = i;
    }

    public String getKey() {
        return this.f30745a;
    }

    public void setKey(String str) {
        this.f30745a = str;
    }

    public String getUserId() {
        return this.h;
    }

    public void setUserId(String str) {
        this.h = str;
    }

    public int getAppId() {
        return this.f30746b;
    }

    public void setAppId(int i) {
        this.f30746b = i;
    }

    public String getPermission() {
        return this.f30747c;
    }

    public void setPermission(String str) {
        this.f30747c = str;
    }

    public int getAppUid() {
        return this.e;
    }

    public void setAppUid(int i) {
        this.e = i;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("AuthInfo:{key=");
        stringBuffer.append(this.f30745a);
        stringBuffer.append(", appUid=").append(this.e);
        stringBuffer.append(", appId=").append(this.f30746b);
        stringBuffer.append(", userId=").append(this.h);
        stringBuffer.append(", permission=").append(this.f30747c);
        stringBuffer.append(", openStatus=").append(this.d);
        stringBuffer.append('}');
        return stringBuffer.toString();
    }
}
