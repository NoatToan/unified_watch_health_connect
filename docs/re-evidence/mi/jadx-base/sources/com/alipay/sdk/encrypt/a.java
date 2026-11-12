package com.alipay.sdk.encrypt;

import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f5845a = new byte[128];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final char[] f5846b = new char[64];

    static {
        int i = 0;
        for (int i2 = 0; i2 < 128; i2++) {
            f5845a[i2] = -1;
        }
        for (int i3 = 90; i3 >= 65; i3--) {
            f5845a[i3] = (byte) (i3 - 65);
        }
        for (int i4 = 122; i4 >= 97; i4--) {
            f5845a[i4] = (byte) (i4 - 71);
        }
        for (int i5 = 57; i5 >= 48; i5--) {
            f5845a[i5] = (byte) (i5 + 4);
        }
        byte[] bArr = f5845a;
        bArr[43] = HMProSyncDataBaseProfile.DATA_TYPE_SLEEPING_BLOOD_PRESSURE_RESULT;
        bArr[47] = 63;
        for (int i6 = 0; i6 <= 25; i6++) {
            f5846b[i6] = (char) (i6 + 65);
        }
        int i7 = 26;
        int i8 = 0;
        while (i7 <= 51) {
            f5846b[i7] = (char) (i8 + 97);
            i7++;
            i8++;
        }
        int i9 = 52;
        while (i9 <= 61) {
            f5846b[i9] = (char) (i + 48);
            i9++;
            i++;
        }
        char[] cArr = f5846b;
        cArr[62] = '+';
        cArr[63] = '/';
    }

    public static int a(char[] cArr) {
        if (cArr == null) {
            return 0;
        }
        int length = cArr.length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (!c(cArr[i2])) {
                cArr[i] = cArr[i2];
                i++;
            }
        }
        return i;
    }

    public static String b(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        int length = bArr.length * 8;
        if (length == 0) {
            return "";
        }
        int i = length % 24;
        int i2 = length / 24;
        char[] cArr = new char[(i != 0 ? i2 + 1 : i2) * 4];
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            byte b2 = bArr[i3];
            int i6 = i3 + 2;
            byte b3 = bArr[i3 + 1];
            i3 += 3;
            byte b4 = bArr[i6];
            byte b5 = (byte) (b3 & 15);
            byte b6 = (byte) (b2 & 3);
            int i7 = b2 & (-128);
            int i8 = b2 >> 2;
            if (i7 != 0) {
                i8 ^= 192;
            }
            byte b7 = (byte) i8;
            int i9 = b3 & (-128);
            int i10 = b3 >> 4;
            if (i9 != 0) {
                i10 ^= 240;
            }
            byte b8 = (byte) i10;
            byte b9 = (byte) ((b4 & (-128)) == 0 ? b4 >> 6 : (b4 >> 6) ^ 252);
            char[] cArr2 = f5846b;
            cArr[i4] = cArr2[b7];
            cArr[i4 + 1] = cArr2[b8 | (b6 << 4)];
            int i11 = i4 + 3;
            cArr[i4 + 2] = cArr2[(b5 << 2) | b9];
            i4 += 4;
            cArr[i11] = cArr2[b4 & 63];
        }
        if (i == 8) {
            byte b10 = bArr[i3];
            byte b11 = (byte) (b10 & 3);
            int i12 = b10 & (-128);
            int i13 = b10 >> 2;
            if (i12 != 0) {
                i13 ^= 192;
            }
            byte b12 = (byte) i13;
            char[] cArr3 = f5846b;
            cArr[i4] = cArr3[b12];
            cArr[i4 + 1] = cArr3[b11 << 4];
            cArr[i4 + 2] = '=';
            cArr[i4 + 3] = '=';
        } else if (i == 16) {
            byte b13 = bArr[i3];
            byte b14 = bArr[i3 + 1];
            byte b15 = (byte) (b14 & 15);
            byte b16 = (byte) (b13 & 3);
            int i14 = b13 & (-128);
            int i15 = b13 >> 2;
            if (i14 != 0) {
                i15 ^= 192;
            }
            byte b17 = (byte) i15;
            int i16 = b14 & (-128);
            int i17 = b14 >> 4;
            if (i16 != 0) {
                i17 ^= 240;
            }
            byte b18 = (byte) i17;
            char[] cArr4 = f5846b;
            cArr[i4] = cArr4[b17];
            cArr[i4 + 1] = cArr4[b18 | (b16 << 4)];
            cArr[i4 + 2] = cArr4[b15 << 2];
            cArr[i4 + 3] = '=';
        }
        return new String(cArr);
    }

    public static boolean c(char c) {
        return c == ' ' || c == '\r' || c == '\n' || c == '\t';
    }

    public static byte[] d(String str) {
        if (str == null) {
            return null;
        }
        char[] charArray = str.toCharArray();
        int iA = a(charArray);
        if (iA % 4 != 0) {
            return null;
        }
        int i = iA / 4;
        if (i == 0) {
            return new byte[0];
        }
        byte[] bArr = new byte[i * 3];
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i2 < i - 1) {
            int i5 = i3 + 1;
            char c = charArray[i3];
            if (f(c)) {
                int i6 = i3 + 2;
                char c2 = charArray[i5];
                if (f(c2)) {
                    int i7 = i3 + 3;
                    char c3 = charArray[i6];
                    if (f(c3)) {
                        i3 += 4;
                        char c4 = charArray[i7];
                        if (f(c4)) {
                            byte[] bArr2 = f5845a;
                            byte b2 = bArr2[c];
                            byte b3 = bArr2[c2];
                            byte b4 = bArr2[c3];
                            byte b5 = bArr2[c4];
                            bArr[i4] = (byte) ((b2 << 2) | (b3 >> 4));
                            int i8 = i4 + 2;
                            bArr[i4 + 1] = (byte) (((b3 & 15) << 4) | ((b4 >> 2) & 15));
                            i4 += 3;
                            bArr[i8] = (byte) ((b4 << 6) | b5);
                            i2++;
                        }
                    }
                }
            }
            return null;
        }
        int i9 = i3 + 1;
        char c5 = charArray[i3];
        if (!f(c5)) {
            return null;
        }
        int i10 = i3 + 2;
        char c6 = charArray[i9];
        if (!f(c6)) {
            return null;
        }
        byte[] bArr3 = f5845a;
        byte b6 = bArr3[c5];
        byte b7 = bArr3[c6];
        char c7 = charArray[i10];
        char c8 = charArray[i3 + 3];
        if (f(c7) && f(c8)) {
            byte b8 = bArr3[c7];
            byte b9 = bArr3[c8];
            bArr[i4] = (byte) ((b6 << 2) | (b7 >> 4));
            bArr[i4 + 1] = (byte) (((b7 & 15) << 4) | ((b8 >> 2) & 15));
            bArr[i4 + 2] = (byte) (b9 | (b8 << 6));
            return bArr;
        }
        if (e(c7) && e(c8)) {
            if ((b7 & 15) != 0) {
                return null;
            }
            int i11 = i2 * 3;
            byte[] bArr4 = new byte[i11 + 1];
            System.arraycopy(bArr, 0, bArr4, 0, i11);
            bArr4[i4] = (byte) ((b6 << 2) | (b7 >> 4));
            return bArr4;
        }
        if (e(c7) || !e(c8)) {
            return null;
        }
        byte b10 = bArr3[c7];
        if ((b10 & 3) != 0) {
            return null;
        }
        int i12 = i2 * 3;
        byte[] bArr5 = new byte[i12 + 2];
        System.arraycopy(bArr, 0, bArr5, 0, i12);
        bArr5[i4] = (byte) ((b6 << 2) | (b7 >> 4));
        bArr5[i4 + 1] = (byte) (((b10 >> 2) & 15) | ((b7 & 15) << 4));
        return bArr5;
    }

    public static boolean e(char c) {
        return c == '=';
    }

    public static boolean f(char c) {
        return c < 128 && f5845a[c] != -1;
    }
}
