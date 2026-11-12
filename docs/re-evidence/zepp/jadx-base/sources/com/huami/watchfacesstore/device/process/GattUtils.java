package com.huami.watchfacesstore.device.process;

/* JADX INFO: loaded from: classes17.dex */
public final class GattUtils {
    public static int bytesToInt(byte[] bytes, int offset, int len) {
        return (int) bytesToLong(bytes, offset, len);
    }

    public static long bytesToLong(byte[] bytes, int offset, int len) {
        long j = 0;
        for (int i = 0; i < len; i++) {
            j |= (((long) bytes[offset + i]) & 255) << (i * 8);
        }
        return j;
    }

    public static byte[] intToBytes(int i) {
        return numberToBytes(i, 4);
    }

    public static byte[] longToBytes(long i) {
        return numberToBytes(i, 8);
    }

    public static byte[] numberToBytes(long num, int bits) {
        byte[] bArr = new byte[bits];
        for (int i = 0; i < bits; i++) {
            bArr[i] = (byte) ((num >> (i * 8)) & 255);
        }
        return bArr;
    }
}
