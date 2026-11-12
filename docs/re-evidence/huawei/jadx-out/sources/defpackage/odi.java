package defpackage;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes12.dex */
public class odi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f44195a = -1732584194;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f44196b = 271733878;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f44197c = "MultiSimEncode";
    private static int d = 1732584193;
    private static int e = -271733879;
    private static int h = -1009589776;

    private static int a(int i, int i2, int i3) {
        return (i ^ i2) ^ i3;
    }

    private static int c(int i, int i2, int i3) {
        return (i & (i2 ^ i3)) ^ i3;
    }

    private static int d(int i, int i2, int i3) {
        return ((i | i2) & i3) | (i & i2);
    }

    private static int e(int i, int i2) {
        return (i2 << i) | (i2 >>> (32 - i));
    }

    private static void c() {
        d = 1732584193;
        e = -271733879;
        f44195a = -1732584194;
        f44196b = 271733878;
        h = -1009589776;
    }

    private static int[] d(int[] iArr) {
        int i;
        c();
        int[] iArr2 = new int[81];
        int i2 = 0;
        while (true) {
            if (i2 >= 16) {
                break;
            }
            if (i2 < iArr.length) {
                iArr2[i2] = iArr[i2];
            } else {
                iArr2[i2] = 0;
            }
            i2++;
        }
        for (i = 16; i < 80; i++) {
            iArr2[i] = e(1, ((iArr2[i - 3] ^ iArr2[i - 8]) ^ iArr2[i - 14]) ^ iArr2[i - 16]);
        }
        return b(iArr2, 1518500249, 1859775393, -1894007588, -899497514);
    }

    private static int[] b(int[] iArr, int i, int i2, int i3, int i4) {
        int iA = d;
        int iA2 = e;
        int i5 = f44195a;
        int i6 = f44196b;
        int i7 = h;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (i9 < 4) {
            int iC = i7 + ((iA << 5) | (iA >>> 27)) + c(iA2, i5, i6) + iArr[i10] + i;
            int i11 = (iA2 << 30) | (iA2 >>> 2);
            int iC2 = i6 + ((iC << 5) | (iC >>> 27)) + c(iA, i11, i5) + iArr[i10 + 1] + i;
            int i12 = (iA << 30) | (iA >>> 2);
            int iC3 = i5 + ((iC2 << 5) | (iC2 >>> 27)) + c(iC, i12, i11) + iArr[i10 + 2] + i;
            i7 = (iC << 30) | (iC >>> 2);
            iA2 = i11 + ((iC3 << 5) | (iC3 >>> 27)) + c(iC2, i7, i12) + iArr[i10 + 3] + i;
            i6 = (iC2 << 30) | (iC2 >>> 2);
            iA = i12 + ((iA2 << 5) | (iA2 >>> 27)) + c(iC3, i6, i7) + iArr[i10 + 4] + i;
            i5 = (iC3 << 30) | (iC3 >>> 2);
            i9++;
            i10 += 5;
        }
        int i13 = 0;
        while (i13 < 4) {
            int iA3 = i7 + ((iA << 5) | (iA >>> 27)) + a(iA2, i5, i6) + iArr[i10] + i2;
            int i14 = (iA2 << 30) | (iA2 >>> 2);
            int iA4 = i6 + ((iA3 << 5) | (iA3 >>> 27)) + a(iA, i14, i5) + iArr[i10 + 1] + i2;
            int i15 = (iA << 30) | (iA >>> 2);
            int iA5 = i5 + ((iA4 << 5) | (iA4 >>> 27)) + a(iA3, i15, i14) + iArr[i10 + 2] + i2;
            i7 = (iA3 << 30) | (iA3 >>> 2);
            iA2 = i14 + ((iA5 << 5) | (iA5 >>> 27)) + a(iA4, i7, i15) + iArr[i10 + 3] + i2;
            i6 = (iA4 << 30) | (iA4 >>> 2);
            iA = i15 + ((iA2 << 5) | (iA2 >>> 27)) + a(iA5, i6, i7) + iArr[i10 + 4] + i2;
            i5 = (iA5 << 30) | (iA5 >>> 2);
            i13++;
            i10 += 5;
        }
        int i16 = 0;
        while (i16 < 4) {
            int iD = i7 + ((iA << 5) | (iA >>> 27)) + d(iA2, i5, i6) + iArr[i10] + i3;
            int i17 = (iA2 >>> 2) | (iA2 << 30);
            int iD2 = i6 + ((iD << 5) | (iD >>> 27)) + d(iA, i17, i5) + iArr[i10 + 1] + i3;
            int i18 = (iA << 30) | (iA >>> 2);
            int iD3 = i5 + ((iD2 << 5) | (iD2 >>> 27)) + d(iD, i18, i17) + iArr[i10 + 2] + i3;
            i7 = (iD << 30) | (iD >>> 2);
            iA2 = i17 + ((iD3 << 5) | (iD3 >>> 27)) + d(iD2, i7, i18) + iArr[i10 + 3] + i3;
            i6 = (iD2 << 30) | (iD2 >>> 2);
            iA = i18 + ((iA2 << 5) | (iA2 >>> 27)) + d(iD3, i6, i7) + iArr[i10 + 4] + i3;
            i5 = (iD3 << 30) | (iD3 >>> 2);
            i16++;
            i10 += 5;
        }
        while (i8 <= 3) {
            int iA6 = i7 + ((iA << 5) | (iA >>> 27)) + a(iA2, i5, i6) + iArr[i10] + i4;
            int i19 = (iA2 >>> 2) | (iA2 << 30);
            int iA7 = i6 + ((iA6 << 5) | (iA6 >>> 27)) + a(iA, i19, i5) + iArr[i10 + 1] + i4;
            int i20 = (iA >>> 2) | (iA << 30);
            int iA8 = i5 + ((iA7 << 5) | (iA7 >>> 27)) + a(iA6, i20, i19) + iArr[i10 + 2] + i4;
            i7 = (iA6 >>> 2) | (iA6 << 30);
            iA2 = i19 + ((iA8 << 5) | (iA8 >>> 27)) + a(iA7, i7, i20) + iArr[i10 + 3] + i4;
            i6 = (iA7 >>> 2) | (iA7 << 30);
            iA = i20 + ((iA2 << 5) | (iA2 >>> 27)) + a(iA8, i6, i7) + iArr[i10 + 4] + i4;
            i5 = (iA8 >>> 2) | (iA8 << 30);
            i8++;
            i10 += 5;
        }
        return new int[]{d + iA, e + iA2, f44195a + i5, f44196b + i6, h + i7};
    }

    public static byte[] e(int[] iArr, int i) {
        int i2 = i / 40;
        byte[] bArr = new byte[64];
        byte[] bArrA = a(iArr);
        System.arraycopy(bArrA, 0, bArr, 0, bArrA.length);
        byte[] bArrE = null;
        for (int i3 = 0; i3 < i2; i3++) {
            for (int i4 = 0; i4 < 2; i4++) {
                byte[] bArrA2 = a(d(d(bArr)));
                bArrE = e(bArrE, bArrA2);
                int i5 = 1;
                for (int i6 = 19; i6 >= 0; i6--) {
                    int i7 = i5 + (bArr[i6] & 255) + (bArrA2[i6] & 255);
                    bArr[i6] = (byte) (i7 & 255);
                    i5 = i7 >>> 8;
                }
            }
        }
        return bArrE;
    }

    private static byte[] a(int[] iArr) {
        byte[] bArrE = null;
        for (int i : iArr) {
            bArrE = e(bArrE, c(i));
        }
        return bArrE;
    }

    public static int[] d(byte[] bArr) {
        int[] iArr = new int[bArr.length / 4];
        for (int i = 0; i < bArr.length / 4; i++) {
            int i2 = i * 4;
            iArr[i] = b(Arrays.copyOfRange(bArr, i2, i2 + 4), 0);
        }
        return iArr;
    }

    public static byte[] c(int i) {
        return new byte[]{(byte) ((i >> 24) & 255), (byte) ((i >> 16) & 255), (byte) ((i >> 8) & 255), (byte) (i & 255)};
    }

    private static int b(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    public static byte[] e(byte[] bArr, byte[] bArr2) {
        int length;
        int i;
        if (bArr != null && bArr2 != null) {
            length = bArr.length + bArr2.length;
        } else if (bArr != null) {
            length = bArr.length;
        } else if (bArr2 != null) {
            length = bArr2.length;
        } else {
            return new byte[0];
        }
        byte[] bArr3 = new byte[length];
        if (bArr == null || bArr.length == 0) {
            i = 0;
        } else {
            i = 0;
            for (byte b2 : bArr) {
                bArr3[i] = b2;
                i++;
            }
        }
        if (bArr2 != null && bArr2.length != 0) {
            for (byte b3 : bArr2) {
                bArr3[i] = b3;
                i++;
            }
        }
        return bArr3;
    }

    public static byte[] a(byte[] bArr) {
        byte[] bArr2 = {0};
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
            messageDigest.update(bArr);
            return messageDigest.digest();
        } catch (NoSuchAlgorithmException unused) {
            ocq.c(f44197c, "encodeBySha1 no such algorithm error");
            return bArr2;
        }
    }
}
