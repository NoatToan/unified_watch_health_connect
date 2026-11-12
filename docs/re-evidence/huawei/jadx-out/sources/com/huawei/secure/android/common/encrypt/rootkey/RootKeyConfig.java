package com.huawei.secure.android.common.encrypt.rootkey;

/* JADX INFO: loaded from: classes42.dex */
public class RootKeyConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f22815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f22816b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f22817c;
    private byte[] d;
    private int e;
    private int f;
    private boolean g;

    public RootKeyConfig(String str, String str2, String str3, byte[] bArr, int i, int i2, boolean z) {
        this.f22815a = str;
        this.f22816b = str2;
        this.f22817c = str3;
        this.d = bArr;
        this.e = i;
        this.f = i2;
        this.g = z;
    }

    public int getExportLen() {
        return this.f;
    }

    public String getFirst() {
        return this.f22815a;
    }

    public int getIteration() {
        return this.e;
    }

    public byte[] getSalt() {
        return this.d;
    }

    public String getSecond() {
        return this.f22816b;
    }

    public String getThird() {
        return this.f22817c;
    }

    public boolean isSha256() {
        return this.g;
    }

    public void setExportLen(int i) {
        this.f = i;
    }

    public void setFirst(String str) {
        this.f22815a = str;
    }

    public void setIteration(int i) {
        this.e = i;
    }

    public void setSalt(byte[] bArr) {
        this.d = bArr;
    }

    public void setSecond(String str) {
        this.f22816b = str;
    }

    public void setSha256(boolean z) {
        this.g = z;
    }

    public void setThird(String str) {
        this.f22817c = str;
    }
}
