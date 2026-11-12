package com.xiaomi.smarthome.core.server.internal.bluetooth.security.rc4auth.rc4;

/* JADX INFO: loaded from: classes10.dex */
public class CryptoUtils {
    public static void copyBlock(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            bArr2[i2 + i4] = bArr[i + i4];
        }
    }

    public static boolean equalsBlock(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            if (bArr[i + i4] != bArr2[i2 + i4]) {
                return false;
            }
        }
        return true;
    }

    public static void fillBlock(byte[] bArr, int i, byte b2, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            bArr[i3] = b2;
        }
    }

    public static void randomBlock(byte[] bArr, int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            bArr[i3] = (byte) (Math.random() * 256.0d);
        }
    }

    public static void spreadIntsToBytes(int[] iArr, int i, byte[] bArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = (i4 * 4) + i2;
            int i6 = iArr[i + i4];
            bArr[i5] = (byte) (i6 >>> 24);
            bArr[i5 + 1] = (byte) (i6 >>> 16);
            bArr[i5 + 2] = (byte) (i6 >>> 8);
            bArr[i5 + 3] = (byte) i6;
        }
    }

    public static void spreadShortsToBytes(int[] iArr, int i, byte[] bArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = (i4 * 2) + i2;
            int i6 = iArr[i + i4];
            bArr[i5] = (byte) (i6 >>> 8);
            bArr[i5 + 1] = (byte) i6;
        }
    }

    public static void squashBytesToInts(byte[] bArr, int i, int[] iArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = (i4 * 4) + i;
            iArr[i2 + i4] = (bArr[i5 + 3] & 255) | ((bArr[i5] & 255) << 24) | ((bArr[i5 + 1] & 255) << 16) | ((bArr[i5 + 2] & 255) << 8);
        }
    }

    public static void squashBytesToShorts(byte[] bArr, int i, int[] iArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = (i4 * 2) + i;
            iArr[i2 + i4] = (bArr[i5 + 1] & 255) | ((bArr[i5] & 255) << 8);
        }
    }

    public static String toStringBlock(byte[] bArr, int i, int i2) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i3 = i; i3 < i + i2; i3++) {
            stringBuffer.append("0123456789abcdef".charAt((bArr[i3] >>> 4) & 15));
            stringBuffer.append("0123456789abcdef".charAt(bArr[i3] & 15));
        }
        return "[" + ((Object) stringBuffer) + "]";
    }

    public static void xorBlock(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, int i3, int i4) {
        for (int i5 = 0; i5 < i4; i5++) {
            bArr3[i3 + i5] = (byte) (bArr[i + i5] ^ bArr2[i2 + i5]);
        }
    }

    public static void zeroBlock(byte[] bArr, int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            bArr[i3] = 0;
        }
    }

    public static void copyBlock(byte[] bArr, byte[] bArr2) {
        copyBlock(bArr, 0, bArr2, 0, bArr.length);
    }

    public static boolean equalsBlock(byte[] bArr, byte[] bArr2) {
        return equalsBlock(bArr, 0, bArr2, 0, bArr.length);
    }

    public static void fillBlock(byte[] bArr, byte b2) {
        fillBlock(bArr, 0, b2, bArr.length);
    }

    public static void randomBlock(byte[] bArr) {
        randomBlock(bArr, 0, bArr.length);
    }

    public static void xorBlock(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        xorBlock(bArr, 0, bArr2, 0, bArr3, 0, bArr.length);
    }

    public static void zeroBlock(byte[] bArr) {
        zeroBlock(bArr, 0, bArr.length);
    }

    public static String toStringBlock(byte[] bArr) {
        return toStringBlock(bArr, 0, bArr.length);
    }
}
