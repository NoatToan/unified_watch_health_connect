package com.xiaomi.hm.health.bt.profile.auth;

import com.xiaomi.hm.health.bt.gatt.GattUtils;

/* JADX INFO: loaded from: classes11.dex */
public class AuthProfileInfo {
    public static final int ALGO_SHA1 = 0;
    private int a;
    private int b;
    private byte[] c;

    public int getAlgorithm() {
        return this.b;
    }

    public byte[] getPublicKeyHash() {
        return this.c;
    }

    public int getVersion() {
        return this.a;
    }

    public void setAlgorithm(int algorithm) {
        this.b = algorithm;
    }

    public void setPublicKeyHash(byte[] publicKeyHash) {
        this.c = publicKeyHash;
    }

    public void setVersion(int version) {
        this.a = version;
    }

    public String toString() {
        return "{version=" + this.a + ", algorithm=" + this.b + ", publicKeyHash=" + GattUtils.bytesToHexString(this.c) + '}';
    }
}
