package com.huami.watch.companion.xiaomiai;

/* JADX INFO: loaded from: classes16.dex */
public class MemoryUtils {
    public static final String TAG = "MemoryUtils";

    private MemoryUtils() {
    }

    public static byte[] toByteArray(short[] sArr, int i) {
        if (i <= 0) {
            return null;
        }
        byte[] bArr = new byte[i * 2];
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = i2 * 2;
            bArr[i3 + 1] = (byte) (sArr[i2] >> 8);
            bArr[i3] = (byte) (sArr[i2] >> 0);
        }
        return bArr;
    }

    public static short[] toShortArray(byte[] bArr, int i, int i2) {
        if (i2 < 0 || i % 2 != 0 || i2 % 2 != 0) {
            return null;
        }
        int i3 = i2 / 2;
        short[] sArr = new short[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = (i4 * 2) + i;
            sArr[i4] = (short) ((bArr[i5 + 1] & 255) << 8);
            sArr[i4] = (short) ((bArr[i5] & 255) | sArr[i4]);
        }
        return sArr;
    }
}
