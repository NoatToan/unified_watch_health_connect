package com.xiaomi.ai.utils;

/* JADX INFO: loaded from: classes18.dex */
public class e {
    private static final String a = "MemoryUtils";

    public static byte[] a(short[] sArr, int i) {
        byte[] bArr = new byte[i * 2];
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = i2 * 2;
            bArr[i3 + 1] = (byte) (sArr[i2] >> 8);
            bArr[i3] = (byte) (sArr[i2] >> 0);
        }
        return bArr;
    }

    public static short[] a(byte[] bArr, int i) {
        if (i % 2 != 0) {
            Log.e("MemoryUtils", "toShortArray error ,len % 2 != 0 !!!");
            return null;
        }
        int i2 = i / 2;
        short[] sArr = new short[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = i3 * 2;
            sArr[i3] = (short) (bArr[i4] + (bArr[i4 + 1] << 8));
        }
        return sArr;
    }
}
