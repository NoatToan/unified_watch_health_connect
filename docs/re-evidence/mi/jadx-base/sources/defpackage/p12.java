package defpackage;

import java.util.Arrays;
import kotlin.io.encoding.Base64;

/* JADX INFO: loaded from: classes6.dex */
public final class p12 {
    public static int a(long j) {
        int i = (int) j;
        if (i == j) {
            return i;
        }
        throw new IllegalArgumentException(j + " cannot be cast to int without changing its value.");
    }

    public static int b(int i, boolean z) {
        if (i == 0) {
            return 0;
        }
        if (!z) {
            return (((i - 1) / 3) + 1) << 2;
        }
        int i2 = (i / 3) << 2;
        int i3 = i % 3;
        return i3 == 0 ? i2 : i2 + i3 + 1;
    }

    public static byte[] c(String str) {
        if (str == null || str.isEmpty()) {
            return new byte[0];
        }
        byte[] bytes = str.getBytes(mbo.f25981a);
        int length = bytes.length;
        byte[] bArr = new byte[a((((long) length) * 6) >> 3)];
        int i = 0;
        int i2 = 0;
        while (i < bytes.length) {
            int i3 = 0;
            int i4 = 0;
            while (i3 < 4 && i < length) {
                int i5 = i + 1;
                int iD = d(bytes[i]);
                if (iD >= 0) {
                    i4 |= iD << (18 - (i3 * 6));
                    i3++;
                }
                i = i5;
            }
            if (i3 >= 2) {
                int i6 = i2 + 1;
                bArr[i2] = (byte) (i4 >> 16);
                if (i3 >= 3) {
                    int i7 = i2 + 2;
                    bArr[i6] = (byte) (i4 >> 8);
                    if (i3 >= 4) {
                        i2 += 3;
                        bArr[i7] = (byte) i4;
                    } else {
                        i2 = i7;
                    }
                } else {
                    i2 = i6;
                }
            }
        }
        return Arrays.copyOf(bArr, i2);
    }

    public static int d(byte b2) {
        int i = i(b2, 64) & j(b2, 91);
        int i2 = i(b2, 96) & j(b2, 123);
        int i3 = i(b2, 47) & j(b2, 58);
        int iH = h(b2, 45) | h(b2, 43);
        int iH2 = h(b2, 47) | h(b2, 95);
        return k(i3, b2 + 4, 0) | k(i, b2 - 65, 0) | k(i2, b2 - 71, 0) | k(iH, 62, 0) | k(iH2, 63, 0) | k(i | i2 | i3 | iH | iH2, 0, -1);
    }

    public static byte e(int i) {
        int iJ = j(i, 26);
        int i2 = i(i, 25) & j(i, 52);
        return (byte) (k(i(i, 51) & j(i, 62), i - 4, 0) | k(iJ, i + 65, 0) | k(i2, i + 71, 0) | k(h(i, 62), 43, 0) | k(h(i, 63), 47, 0));
    }

    public static byte f(int i) {
        int iJ = j(i, 26);
        int i2 = i(i, 25) & j(i, 52);
        return (byte) (k(i(i, 51) & j(i, 62), i - 4, 0) | k(iJ, i + 65, 0) | k(i2, i + 71, 0) | k(h(i, 62), 45, 0) | k(h(i, 63), 95, 0));
    }

    public static String g(byte[] bArr, boolean z) {
        int length = bArr != null ? bArr.length : 0;
        if (length == 0) {
            return "";
        }
        int i = (length / 3) * 3;
        int iB = b(length, z);
        byte[] bArr2 = new byte[iB];
        int i2 = 0;
        int i3 = 0;
        while (i2 < i) {
            int i4 = i2 + 2;
            int i5 = ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2] & 255) << 16);
            i2 += 3;
            int i6 = i5 | (bArr[i4] & 255);
            if (z) {
                bArr2[i3] = f((i6 >>> 18) & 63);
                bArr2[i3 + 1] = f((i6 >>> 12) & 63);
                int i7 = i3 + 3;
                bArr2[i3 + 2] = f((i6 >>> 6) & 63);
                i3 += 4;
                bArr2[i7] = f(i6 & 63);
            } else {
                bArr2[i3] = e((i6 >>> 18) & 63);
                bArr2[i3 + 1] = e((i6 >>> 12) & 63);
                int i8 = i3 + 3;
                bArr2[i3 + 2] = e((i6 >>> 6) & 63);
                i3 += 4;
                bArr2[i8] = e(i6 & 63);
            }
        }
        int i9 = length - i;
        if (i9 > 0) {
            int i10 = ((bArr[i] & 255) << 10) | (i9 == 2 ? (bArr[length - 1] & 255) << 2 : 0);
            if (!z) {
                bArr2[iB - 4] = e(i10 >> 12);
                bArr2[iB - 3] = e((i10 >>> 6) & 63);
                bArr2[iB - 2] = i9 == 2 ? e(i10 & 63) : (byte) 61;
                bArr2[iB - 1] = Base64.padSymbol;
            } else if (i9 == 2) {
                bArr2[iB - 3] = f(i10 >> 12);
                bArr2[iB - 2] = f((i10 >>> 6) & 63);
                bArr2[iB - 1] = f(i10 & 63);
            } else {
                bArr2[iB - 2] = f(i10 >> 12);
                bArr2[iB - 1] = f((i10 >>> 6) & 63);
            }
        }
        return new String(bArr2, mbo.f25981a);
    }

    public static int h(int i, int i2) {
        int i3 = i ^ i2;
        return ((~i3) & (i3 - 1)) >>> 63;
    }

    public static int i(int i, int i2) {
        return (int) ((((long) i2) - ((long) i)) >>> 63);
    }

    public static int j(int i, int i2) {
        return (int) ((((long) i) - ((long) i2)) >>> 63);
    }

    public static int k(int i, int i2, int i3) {
        return ((i - 1) & (i3 ^ i2)) ^ i2;
    }
}
