package com.alipay.sdk.m.l0;

/* JADX INFO: loaded from: classes2.dex */
public class c {
    public static byte[] a(int i) {
        byte[] bArr = {(byte) ((i >> 8) % 256), (byte) (i % 256), (byte) (i % 256), (byte) (i % 256)};
        int i2 = i >> 8;
        int i3 = i2 >> 8;
        return bArr;
    }
}
