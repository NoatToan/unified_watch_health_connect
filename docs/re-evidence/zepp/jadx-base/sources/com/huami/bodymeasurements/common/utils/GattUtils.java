package com.huami.bodymeasurements.common.utils;

/* JADX INFO: loaded from: classes6.dex */
public class GattUtils {
    public static int bytesToInt(byte[] bArr, int i, int i2) {
        return (int) bytesToLong(bArr, i, i2);
    }

    public static long bytesToLong(byte[] bArr, int i, int i2) {
        long j = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            j |= (((long) bArr[i + i3]) & 255) << (i3 * 8);
        }
        return j;
    }

    public static byte[] numberToBytes(long j, int i) {
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) ((j >> (i2 * 8)) & 255);
        }
        return bArr;
    }

    public static byte[] shortToBytes(short s) {
        return numberToBytes(s, 2);
    }
}
