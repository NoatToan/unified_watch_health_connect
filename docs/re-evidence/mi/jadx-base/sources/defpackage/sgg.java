package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public abstract class sgg {
    public static int a(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = (((long) iArr[0]) & 4294967295L) + (((long) iArr2[0]) & 4294967295L);
        iArr3[0] = (int) j;
        long j2 = (j >>> 32) + (((long) iArr[1]) & 4294967295L) + (((long) iArr2[1]) & 4294967295L);
        iArr3[1] = (int) j2;
        long j3 = (j2 >>> 32) + (((long) iArr[2]) & 4294967295L) + (((long) iArr2[2]) & 4294967295L);
        iArr3[2] = (int) j3;
        long j4 = (j3 >>> 32) + (((long) iArr[3]) & 4294967295L) + (((long) iArr2[3]) & 4294967295L);
        iArr3[3] = (int) j4;
        return (int) (j4 >>> 32);
    }

    public static int b(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = (((long) iArr[0]) & 4294967295L) + (((long) iArr2[0]) & 4294967295L) + (((long) iArr3[0]) & 4294967295L);
        iArr3[0] = (int) j;
        long j2 = (j >>> 32) + (((long) iArr[1]) & 4294967295L) + (((long) iArr2[1]) & 4294967295L) + (((long) iArr3[1]) & 4294967295L);
        iArr3[1] = (int) j2;
        long j3 = (j2 >>> 32) + (((long) iArr[2]) & 4294967295L) + (((long) iArr2[2]) & 4294967295L) + (((long) iArr3[2]) & 4294967295L);
        iArr3[2] = (int) j3;
        long j4 = (j3 >>> 32) + (((long) iArr[3]) & 4294967295L) + (((long) iArr2[3]) & 4294967295L) + (((long) iArr3[3]) & 4294967295L);
        iArr3[3] = (int) j4;
        return (int) (j4 >>> 32);
    }

    public static int[] c() {
        return new int[4];
    }

    public static long[] d() {
        return new long[2];
    }

    public static int[] e() {
        return new int[8];
    }

    public static long[] f() {
        return new long[4];
    }

    public static boolean g(int[] iArr, int[] iArr2) {
        for (int i = 3; i >= 0; i--) {
            if (iArr[i] != iArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean h(long[] jArr, long[] jArr2) {
        for (int i = 1; i >= 0; i--) {
            if (jArr[i] != jArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static int[] i(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 128) {
            throw new IllegalArgumentException();
        }
        int[] iArrC = c();
        int i = 0;
        while (bigInteger.signum() != 0) {
            iArrC[i] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
            i++;
        }
        return iArrC;
    }

    public static long[] j(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 128) {
            throw new IllegalArgumentException();
        }
        long[] jArrD = d();
        int i = 0;
        while (bigInteger.signum() != 0) {
            jArrD[i] = bigInteger.longValue();
            bigInteger = bigInteger.shiftRight(64);
            i++;
        }
        return jArrD;
    }

    public static int k(int[] iArr, int i) {
        int i2;
        if (i == 0) {
            i2 = iArr[0];
        } else {
            int i3 = i >> 5;
            if (i3 < 0 || i3 >= 4) {
                return 0;
            }
            i2 = iArr[i3] >>> (i & 31);
        }
        return i2 & 1;
    }

    public static boolean l(int[] iArr, int[] iArr2) {
        for (int i = 3; i >= 0; i--) {
            int i2 = iArr[i] ^ Integer.MIN_VALUE;
            int i3 = Integer.MIN_VALUE ^ iArr2[i];
            if (i2 < i3) {
                return false;
            }
            if (i2 > i3) {
                return true;
            }
        }
        return true;
    }

    public static boolean m(int[] iArr) {
        if (iArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < 4; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean n(long[] jArr) {
        return jArr[0] == 1 && jArr[1] == 0;
    }

    public static boolean o(int[] iArr) {
        for (int i = 0; i < 4; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean p(long[] jArr) {
        for (int i = 0; i < 2; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void q(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = ((long) iArr2[0]) & 4294967295L;
        int i = 1;
        long j2 = ((long) iArr2[1]) & 4294967295L;
        long j3 = ((long) iArr2[2]) & 4294967295L;
        long j4 = ((long) iArr2[3]) & 4294967295L;
        long j5 = ((long) iArr[0]) & 4294967295L;
        long j6 = j5 * j;
        iArr3[0] = (int) j6;
        long j7 = (j6 >>> 32) + (j5 * j2);
        iArr3[1] = (int) j7;
        long j8 = (j7 >>> 32) + (j5 * j3);
        iArr3[2] = (int) j8;
        long j9 = (j8 >>> 32) + (j5 * j4);
        iArr3[3] = (int) j9;
        iArr3[4] = (int) (j9 >>> 32);
        for (int i2 = 4; i < i2; i2 = 4) {
            long j10 = ((long) iArr[i]) & 4294967295L;
            long j11 = (j10 * j) + (((long) iArr3[i]) & 4294967295L);
            iArr3[i] = (int) j11;
            int i3 = i + 1;
            int i4 = i;
            long j12 = (j11 >>> 32) + (j10 * j2) + (((long) iArr3[i3]) & 4294967295L);
            iArr3[i3] = (int) j12;
            int i5 = i4 + 2;
            long j13 = (j12 >>> 32) + (j10 * j3) + (((long) iArr3[i5]) & 4294967295L);
            iArr3[i5] = (int) j13;
            int i6 = i4 + 3;
            long j14 = (j13 >>> 32) + (j10 * j4) + (((long) iArr3[i6]) & 4294967295L);
            iArr3[i6] = (int) j14;
            iArr3[i4 + 4] = (int) (j14 >>> 32);
            i = i3;
            j = j;
        }
    }

    public static int r(int[] iArr, int[] iArr2, int[] iArr3) {
        int i = 0;
        long j = ((long) iArr2[0]) & 4294967295L;
        long j2 = ((long) iArr2[1]) & 4294967295L;
        long j3 = ((long) iArr2[2]) & 4294967295L;
        long j4 = ((long) iArr2[3]) & 4294967295L;
        long j5 = 0;
        while (i < 4) {
            long j6 = ((long) iArr[i]) & 4294967295L;
            long j7 = j;
            long j8 = (((long) iArr3[i]) & 4294967295L) + (j6 * j);
            iArr3[i] = (int) j8;
            int i2 = i + 1;
            long j9 = (j8 >>> 32) + (j6 * j2) + (((long) iArr3[i2]) & 4294967295L);
            iArr3[i2] = (int) j9;
            int i3 = i + 2;
            long j10 = (j9 >>> 32) + (j6 * j3) + (((long) iArr3[i3]) & 4294967295L);
            iArr3[i3] = (int) j10;
            int i4 = i + 3;
            long j11 = (j10 >>> 32) + (j6 * j4) + (((long) iArr3[i4]) & 4294967295L);
            iArr3[i4] = (int) j11;
            int i5 = i + 4;
            long j12 = (j11 >>> 32) + j5 + (((long) iArr3[i5]) & 4294967295L);
            iArr3[i5] = (int) j12;
            j5 = j12 >>> 32;
            i = i2;
            j = j7;
            j2 = j2;
        }
        return (int) j5;
    }

    public static void s(int[] iArr, int[] iArr2) {
        long j = ((long) iArr[0]) & 4294967295L;
        int i = 8;
        int i2 = 0;
        int i3 = 3;
        while (true) {
            int i4 = i3 - 1;
            long j2 = ((long) iArr[i3]) & 4294967295L;
            long j3 = j2 * j2;
            iArr2[i - 1] = (i2 << 31) | ((int) (j3 >>> 33));
            i -= 2;
            iArr2[i] = (int) (j3 >>> 1);
            i2 = (int) j3;
            if (i4 <= 0) {
                long j4 = j * j;
                long j5 = (j4 >>> 33) | (((long) (i2 << 31)) & 4294967295L);
                iArr2[0] = (int) j4;
                long j6 = ((long) iArr[1]) & 4294967295L;
                long j7 = ((long) iArr2[2]) & 4294967295L;
                long j8 = j5 + (j6 * j);
                int i5 = (int) j8;
                iArr2[1] = (i5 << 1) | (((int) (j4 >>> 32)) & 1);
                int i6 = i5 >>> 31;
                long j9 = j7 + (j8 >>> 32);
                long j10 = ((long) iArr[2]) & 4294967295L;
                long j11 = ((long) iArr2[3]) & 4294967295L;
                long j12 = ((long) iArr2[4]) & 4294967295L;
                long j13 = j9 + (j10 * j);
                int i7 = (int) j13;
                iArr2[2] = (i7 << 1) | i6;
                long j14 = j11 + (j13 >>> 32) + (j10 * j6);
                long j15 = j12 + (j14 >>> 32);
                long j16 = ((long) iArr[3]) & 4294967295L;
                long j17 = (((long) iArr2[5]) & 4294967295L) + (j15 >>> 32);
                long j18 = (((long) iArr2[6]) & 4294967295L) + (j17 >>> 32);
                long j19 = (j14 & 4294967295L) + (j * j16);
                int i8 = (int) j19;
                iArr2[3] = (i8 << 1) | (i7 >>> 31);
                long j20 = (j15 & 4294967295L) + (j19 >>> 32) + (j6 * j16);
                long j21 = (j17 & 4294967295L) + (j20 >>> 32) + (j16 * j10);
                long j22 = j18 + (j21 >>> 32);
                int i9 = (int) j20;
                iArr2[4] = (i8 >>> 31) | (i9 << 1);
                int i10 = (int) (j21 & 4294967295L);
                iArr2[5] = (i9 >>> 31) | (i10 << 1);
                int i11 = i10 >>> 31;
                int i12 = (int) j22;
                iArr2[6] = i11 | (i12 << 1);
                iArr2[7] = ((iArr2[7] + ((int) (j22 >>> 32))) << 1) | (i12 >>> 31);
                return;
            }
            i3 = i4;
        }
    }

    public static int t(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = (((long) iArr[0]) & 4294967295L) - (((long) iArr2[0]) & 4294967295L);
        iArr3[0] = (int) j;
        long j2 = (j >> 32) + ((((long) iArr[1]) & 4294967295L) - (((long) iArr2[1]) & 4294967295L));
        iArr3[1] = (int) j2;
        long j3 = (j2 >> 32) + ((((long) iArr[2]) & 4294967295L) - (((long) iArr2[2]) & 4294967295L));
        iArr3[2] = (int) j3;
        long j4 = (j3 >> 32) + ((((long) iArr[3]) & 4294967295L) - (((long) iArr2[3]) & 4294967295L));
        iArr3[3] = (int) j4;
        return (int) (j4 >> 32);
    }

    public static int u(int[] iArr, int[] iArr2) {
        long j = (((long) iArr2[0]) & 4294967295L) - (((long) iArr[0]) & 4294967295L);
        iArr2[0] = (int) j;
        long j2 = (j >> 32) + ((((long) iArr2[1]) & 4294967295L) - (((long) iArr[1]) & 4294967295L));
        iArr2[1] = (int) j2;
        long j3 = (j2 >> 32) + ((((long) iArr2[2]) & 4294967295L) - (((long) iArr[2]) & 4294967295L));
        iArr2[2] = (int) j3;
        long j4 = (j3 >> 32) + ((((long) iArr2[3]) & 4294967295L) - (4294967295L & ((long) iArr[3])));
        iArr2[3] = (int) j4;
        return (int) (j4 >> 32);
    }

    public static BigInteger v(int[] iArr) {
        byte[] bArr = new byte[16];
        for (int i = 0; i < 4; i++) {
            int i2 = iArr[i];
            if (i2 != 0) {
                zgh.d(i2, bArr, (3 - i) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static BigInteger w(long[] jArr) {
        byte[] bArr = new byte[16];
        for (int i = 0; i < 2; i++) {
            long j = jArr[i];
            if (j != 0) {
                zgh.j(j, bArr, (1 - i) << 3);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static void x(int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        iArr[3] = 0;
    }
}
