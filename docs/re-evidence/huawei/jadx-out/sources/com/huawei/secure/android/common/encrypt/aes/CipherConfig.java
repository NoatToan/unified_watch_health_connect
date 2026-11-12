package com.huawei.secure.android.common.encrypt.aes;

import javax.crypto.Cipher;

/* JADX INFO: loaded from: classes42.dex */
public class CipherConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Cipher f22780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private byte[] f22781b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f22782c;
    private int d;
    private byte[] e;
    private int f;

    public CipherConfig(Cipher cipher, byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        this.f22780a = cipher;
        this.f22781b = bArr;
        this.f22782c = i;
        this.d = i2;
        this.e = bArr2;
        this.f = i3;
    }

    public Cipher getCipher() {
        return this.f22780a;
    }

    public byte[] getInput() {
        return this.f22781b;
    }

    public int getInputLen() {
        return this.d;
    }

    public int getInputOffset() {
        return this.f22782c;
    }

    public byte[] getOutput() {
        return this.e;
    }

    public int getOutputOffset() {
        return this.f;
    }

    public void setCipher(Cipher cipher) {
        this.f22780a = cipher;
    }

    public void setInput(byte[] bArr) {
        this.f22781b = bArr;
    }

    public void setInputLen(int i) {
        this.d = i;
    }

    public void setInputOffset(int i) {
        this.f22782c = i;
    }

    public void setOutput(byte[] bArr) {
        this.e = bArr;
    }

    public void setOutputOffset(int i) {
        this.f = i;
    }
}
