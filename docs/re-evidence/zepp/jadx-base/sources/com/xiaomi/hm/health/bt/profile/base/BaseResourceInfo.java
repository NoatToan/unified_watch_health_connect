package com.xiaomi.hm.health.bt.profile.base;

/* JADX INFO: loaded from: classes11.dex */
public class BaseResourceInfo {
    private int a;
    private int b;
    private int c;
    private int d;

    public BaseResourceInfo() {
        this.a = -1;
        this.b = -1;
        this.c = -1;
        this.d = -1;
    }

    public int getFlag() {
        return this.b;
    }

    public int getResFlag() {
        return this.c;
    }

    public int getResVersion() {
        return this.d;
    }

    public int getVersion() {
        return this.a;
    }

    public void setFlag(int flag) {
        this.b = flag;
    }

    public void setResFlag(int resFlag) {
        this.c = resFlag;
    }

    public void setResVersion(int resVersion) {
        this.d = resVersion;
    }

    public void setVersion(int version) {
        this.a = version;
    }

    public String toString() {
        return "BaseResourceInfo{version=" + this.a + ", flag=" + this.b + ", resFlag=" + this.c + ", resVersion=" + this.d + '}';
    }

    public BaseResourceInfo(int version, int flag, int resFlag, int resVersion) {
        this.a = -1;
        this.b = -1;
        this.c = -1;
        this.d = -1;
        this.a = version;
        this.b = flag;
        this.c = resFlag;
        this.d = resVersion;
    }
}
