package com.huawei.openalliance.ad.utils;

import okio.Utf8;

/* JADX INFO: loaded from: classes12.dex */
public abstract class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final char[] f20677a = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/=".toCharArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static byte[] f20678b = new byte[256];

    public static String a(byte[] bArr, int i) {
        boolean z;
        char[] cArr = new char[((i + 2) / 3) * 4];
        int i2 = 0;
        int i3 = 0;
        while (i2 < i) {
            int i4 = (bArr[i2] & 255) << 8;
            int i5 = i2 + 1;
            boolean z2 = true;
            if (i5 < i) {
                i4 |= bArr[i5] & 255;
                z = true;
            } else {
                z = false;
            }
            int i6 = i4 << 8;
            int i7 = i2 + 2;
            if (i7 < i) {
                i6 |= bArr[i7] & 255;
            } else {
                z2 = false;
            }
            char[] cArr2 = f20677a;
            int i8 = 64;
            cArr[i3 + 3] = cArr2[z2 ? i6 & 63 : 64];
            if (z) {
                i8 = (i6 >> 6) & 63;
            }
            cArr[i3 + 2] = cArr2[i8];
            cArr[i3 + 1] = cArr2[(i6 >> 12) & 63];
            cArr[i3] = cArr2[(i6 >> 18) & 63];
            i2 += 3;
            i3 += 4;
        }
        return new String(cArr);
    }

    public static String a(byte[] bArr) {
        return a(bArr, bArr.length);
    }

    static {
        for (int i = 0; i < 256; i++) {
            f20678b[i] = -1;
        }
        for (int i2 = 65; i2 <= 90; i2++) {
            f20678b[i2] = (byte) (i2 - 65);
        }
        for (int i3 = 97; i3 <= 122; i3++) {
            f20678b[i3] = (byte) (i3 - 71);
        }
        for (int i4 = 48; i4 <= 57; i4++) {
            f20678b[i4] = (byte) (i4 + 4);
        }
        byte[] bArr = f20678b;
        bArr[43] = 62;
        bArr[45] = Utf8.REPLACEMENT_BYTE;
    }
}
