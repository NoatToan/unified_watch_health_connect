package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ygg {
    public static int a(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = (((long) iArr[0]) & 4294967295L) + (((long) iArr2[0]) & 4294967295L);
        iArr3[0] = (int) j;
        long j2 = (j >>> 32) + (((long) iArr[1]) & 4294967295L) + (((long) iArr2[1]) & 4294967295L);
        iArr3[1] = (int) j2;
        long j3 = (j2 >>> 32) + (((long) iArr[2]) & 4294967295L) + (((long) iArr2[2]) & 4294967295L);
        iArr3[2] = (int) j3;
        long j4 = (j3 >>> 32) + (((long) iArr[3]) & 4294967295L) + (((long) iArr2[3]) & 4294967295L);
        iArr3[3] = (int) j4;
        long j5 = (j4 >>> 32) + (((long) iArr[4]) & 4294967295L) + (((long) iArr2[4]) & 4294967295L);
        iArr3[4] = (int) j5;
        long j6 = (j5 >>> 32) + (((long) iArr[5]) & 4294967295L) + (((long) iArr2[5]) & 4294967295L);
        iArr3[5] = (int) j6;
        long j7 = (j6 >>> 32) + (((long) iArr[6]) & 4294967295L) + (((long) iArr2[6]) & 4294967295L);
        iArr3[6] = (int) j7;
        return (int) (j7 >>> 32);
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
        long j5 = (j4 >>> 32) + (((long) iArr[4]) & 4294967295L) + (((long) iArr2[4]) & 4294967295L) + (((long) iArr3[4]) & 4294967295L);
        iArr3[4] = (int) j5;
        long j6 = (j5 >>> 32) + (((long) iArr[5]) & 4294967295L) + (((long) iArr2[5]) & 4294967295L) + (((long) iArr3[5]) & 4294967295L);
        iArr3[5] = (int) j6;
        long j7 = (j6 >>> 32) + (((long) iArr[6]) & 4294967295L) + (((long) iArr2[6]) & 4294967295L) + (((long) iArr3[6]) & 4294967295L);
        iArr3[6] = (int) j7;
        return (int) (j7 >>> 32);
    }

    public static void c(int[] iArr, int[] iArr2) {
        iArr2[0] = iArr[0];
        iArr2[1] = iArr[1];
        iArr2[2] = iArr[2];
        iArr2[3] = iArr[3];
        iArr2[4] = iArr[4];
        iArr2[5] = iArr[5];
        iArr2[6] = iArr[6];
    }

    public static int[] d() {
        return new int[7];
    }

    public static int[] e() {
        return new int[14];
    }

    public static boolean f(int[] iArr, int[] iArr2) {
        for (int i = 6; i >= 0; i--) {
            if (iArr[i] != iArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static int[] g(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 224) {
            throw new IllegalArgumentException();
        }
        int[] iArrD = d();
        int i = 0;
        while (bigInteger.signum() != 0) {
            iArrD[i] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
            i++;
        }
        return iArrD;
    }

    public static int h(int[] iArr, int i) {
        int i2;
        if (i == 0) {
            i2 = iArr[0];
        } else {
            int i3 = i >> 5;
            if (i3 < 0 || i3 >= 7) {
                return 0;
            }
            i2 = iArr[i3] >>> (i & 31);
        }
        return i2 & 1;
    }

    public static boolean i(int[] iArr, int[] iArr2) {
        for (int i = 6; i >= 0; i--) {
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

    public static boolean j(int[] iArr) {
        if (iArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < 7; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean k(int[] iArr) {
        for (int i = 0; i < 7; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void l(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = ((long) iArr2[0]) & 4294967295L;
        long j2 = ((long) iArr2[1]) & 4294967295L;
        long j3 = ((long) iArr2[2]) & 4294967295L;
        long j4 = ((long) iArr2[3]) & 4294967295L;
        long j5 = ((long) iArr2[4]) & 4294967295L;
        long j6 = ((long) iArr2[5]) & 4294967295L;
        long j7 = ((long) iArr2[6]) & 4294967295L;
        long j8 = ((long) iArr[0]) & 4294967295L;
        long j9 = j8 * j;
        iArr3[0] = (int) j9;
        long j10 = (j9 >>> 32) + (j8 * j2);
        iArr3[1] = (int) j10;
        long j11 = (j10 >>> 32) + (j8 * j3);
        iArr3[2] = (int) j11;
        long j12 = (j11 >>> 32) + (j8 * j4);
        iArr3[3] = (int) j12;
        long j13 = (j12 >>> 32) + (j8 * j5);
        iArr3[4] = (int) j13;
        long j14 = (j13 >>> 32) + (j8 * j6);
        iArr3[5] = (int) j14;
        long j15 = (j14 >>> 32) + (j8 * j7);
        iArr3[6] = (int) j15;
        iArr3[7] = (int) (j15 >>> 32);
        int i = 1;
        for (int i2 = 7; i < i2; i2 = 7) {
            long j16 = ((long) iArr[i]) & 4294967295L;
            long j17 = (j16 * j) + (((long) iArr3[i]) & 4294967295L);
            iArr3[i] = (int) j17;
            int i3 = i + 1;
            long j18 = (j17 >>> 32) + (j16 * j2) + (((long) iArr3[i3]) & 4294967295L);
            iArr3[i3] = (int) j18;
            int i4 = i + 2;
            long j19 = j2;
            long j20 = (j18 >>> 32) + (j16 * j3) + (((long) iArr3[i4]) & 4294967295L);
            iArr3[i4] = (int) j20;
            int i5 = i + 3;
            long j21 = (j20 >>> 32) + (j16 * j4) + (((long) iArr3[i5]) & 4294967295L);
            iArr3[i5] = (int) j21;
            int i6 = i + 4;
            long j22 = (j21 >>> 32) + (j16 * j5) + (((long) iArr3[i6]) & 4294967295L);
            iArr3[i6] = (int) j22;
            int i7 = i + 5;
            long j23 = (j22 >>> 32) + (j16 * j6) + (((long) iArr3[i7]) & 4294967295L);
            iArr3[i7] = (int) j23;
            int i8 = i + 6;
            long j24 = (j23 >>> 32) + (j16 * j7) + (((long) iArr3[i8]) & 4294967295L);
            iArr3[i8] = (int) j24;
            iArr3[i + 7] = (int) (j24 >>> 32);
            j4 = j4;
            j = j;
            i = i3;
            j2 = j19;
        }
    }

    public static long m(int i, int[] iArr, int i2, int[] iArr2, int i3, int[] iArr3, int i4) {
        long j = ((long) i) & 4294967295L;
        long j2 = ((long) iArr[i2]) & 4294967295L;
        long j3 = (j * j2) + (((long) iArr2[i3]) & 4294967295L);
        iArr3[i4] = (int) j3;
        long j4 = ((long) iArr[i2 + 1]) & 4294967295L;
        long j5 = (j3 >>> 32) + (j * j4) + j2 + (((long) iArr2[i3 + 1]) & 4294967295L);
        iArr3[i4 + 1] = (int) j5;
        long j6 = j5 >>> 32;
        long j7 = ((long) iArr[i2 + 2]) & 4294967295L;
        long j8 = j6 + (j * j7) + j4 + (((long) iArr2[i3 + 2]) & 4294967295L);
        iArr3[i4 + 2] = (int) j8;
        long j9 = ((long) iArr[i2 + 3]) & 4294967295L;
        long j10 = (j8 >>> 32) + (j * j9) + j7 + (((long) iArr2[i3 + 3]) & 4294967295L);
        iArr3[i4 + 3] = (int) j10;
        long j11 = ((long) iArr[i2 + 4]) & 4294967295L;
        long j12 = (j10 >>> 32) + (j * j11) + j9 + (((long) iArr2[i3 + 4]) & 4294967295L);
        iArr3[i4 + 4] = (int) j12;
        long j13 = ((long) iArr[i2 + 5]) & 4294967295L;
        long j14 = (j12 >>> 32) + (j * j13) + j11 + (((long) iArr2[i3 + 5]) & 4294967295L);
        iArr3[i4 + 5] = (int) j14;
        long j15 = ((long) iArr[i2 + 6]) & 4294967295L;
        long j16 = (j14 >>> 32) + (j * j15) + j13 + (4294967295L & ((long) iArr2[i3 + 6]));
        iArr3[i4 + 6] = (int) j16;
        return (j16 >>> 32) + j15;
    }

    public static int n(int i, long j, int[] iArr, int i2) {
        long j2 = ((long) i) & 4294967295L;
        long j3 = j & 4294967295L;
        long j4 = (j2 * j3) + (((long) iArr[i2]) & 4294967295L);
        iArr[i2] = (int) j4;
        long j5 = j >>> 32;
        long j6 = (j2 * j5) + j3;
        int i3 = i2 + 1;
        long j7 = (j4 >>> 32) + j6 + (((long) iArr[i3]) & 4294967295L);
        iArr[i3] = (int) j7;
        int i4 = i2 + 2;
        long j8 = (j7 >>> 32) + j5 + (((long) iArr[i4]) & 4294967295L);
        iArr[i4] = (int) j8;
        long j9 = j8 >>> 32;
        int i5 = i2 + 3;
        long j10 = j9 + (((long) iArr[i5]) & 4294967295L);
        iArr[i5] = (int) j10;
        if ((j10 >>> 32) == 0) {
            return 0;
        }
        return xgg.t(7, iArr, i2, 4);
    }

    public static int o(int i, int i2, int[] iArr, int i3) {
        long j = ((long) i) & 4294967295L;
        long j2 = ((long) i2) & 4294967295L;
        long j3 = (j * j2) + (((long) iArr[i3]) & 4294967295L);
        iArr[i3] = (int) j3;
        int i4 = i3 + 1;
        long j4 = (j3 >>> 32) + j2 + (((long) iArr[i4]) & 4294967295L);
        iArr[i4] = (int) j4;
        long j5 = j4 >>> 32;
        int i5 = i3 + 2;
        long j6 = j5 + (((long) iArr[i5]) & 4294967295L);
        iArr[i5] = (int) j6;
        if ((j6 >>> 32) == 0) {
            return 0;
        }
        return xgg.t(7, iArr, i3, 3);
    }

    public static int p(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = 4294967295L;
        long j2 = ((long) iArr2[0]) & 4294967295L;
        long j3 = ((long) iArr2[1]) & 4294967295L;
        long j4 = ((long) iArr2[2]) & 4294967295L;
        long j5 = ((long) iArr2[3]) & 4294967295L;
        long j6 = ((long) iArr2[4]) & 4294967295L;
        long j7 = ((long) iArr2[5]) & 4294967295L;
        long j8 = ((long) iArr2[6]) & 4294967295L;
        long j9 = 0;
        int i = 0;
        while (i < 7) {
            long j10 = j8;
            long j11 = ((long) iArr[i]) & j;
            long j12 = j7;
            long j13 = (((long) iArr3[i]) & j) + (j11 * j2);
            iArr3[i] = (int) j13;
            int i2 = i + 1;
            long j14 = j3;
            long j15 = (j13 >>> 32) + (j11 * j3) + (((long) iArr3[i2]) & j);
            iArr3[i2] = (int) j15;
            int i3 = i + 2;
            long j16 = (j15 >>> 32) + (j11 * j4) + (((long) iArr3[i3]) & j);
            iArr3[i3] = (int) j16;
            int i4 = i + 3;
            long j17 = (j16 >>> 32) + (j11 * j5) + (((long) iArr3[i4]) & j);
            iArr3[i4] = (int) j17;
            int i5 = i + 4;
            long j18 = (j17 >>> 32) + (j11 * j6) + (((long) iArr3[i5]) & j);
            iArr3[i5] = (int) j18;
            int i6 = i + 5;
            long j19 = (j18 >>> 32) + (j11 * j12) + (((long) iArr3[i6]) & j);
            iArr3[i6] = (int) j19;
            int i7 = i + 6;
            long j20 = (j19 >>> 32) + (j11 * j10) + (((long) iArr3[i7]) & j);
            iArr3[i7] = (int) j20;
            int i8 = i + 7;
            long j21 = (j20 >>> 32) + j9 + (((long) iArr3[i8]) & j);
            iArr3[i8] = (int) j21;
            j9 = j21 >>> 32;
            i = i2;
            j8 = j10;
            j7 = j12;
            j3 = j14;
            j = 4294967295L;
        }
        return (int) j9;
    }

    public static void q(int[] iArr, int[] iArr2) {
        long j = ((long) iArr[0]) & 4294967295L;
        int i = 14;
        int i2 = 0;
        int i3 = 6;
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
                long j17 = ((long) iArr2[5]) & 4294967295L;
                long j18 = ((long) iArr2[6]) & 4294967295L;
                long j19 = (j14 & 4294967295L) + (j16 * j);
                int i8 = (int) j19;
                iArr2[3] = (i8 << 1) | (i7 >>> 31);
                int i9 = i8 >>> 31;
                long j20 = j15 + (j19 >>> 32) + (j16 * j6);
                long j21 = j17 + (j20 >>> 32) + (j16 * j10);
                long j22 = j18 + (j21 >>> 32);
                long j23 = ((long) iArr[4]) & 4294967295L;
                long j24 = ((long) iArr2[7]) & 4294967295L;
                long j25 = ((long) iArr2[8]) & 4294967295L;
                long j26 = (j20 & 4294967295L) + (j23 * j);
                int i10 = (int) j26;
                iArr2[4] = (i10 << 1) | i9;
                int i11 = i10 >>> 31;
                long j27 = (j21 & 4294967295L) + (j26 >>> 32) + (j23 * j6);
                long j28 = j22 + (j27 >>> 32) + (j23 * j10);
                long j29 = j24 + (j28 >>> 32) + (j23 * j16);
                long j30 = j25 + (j29 >>> 32);
                long j31 = ((long) iArr[5]) & 4294967295L;
                long j32 = ((long) iArr2[9]) & 4294967295L;
                long j33 = ((long) iArr2[10]) & 4294967295L;
                long j34 = (j27 & 4294967295L) + (j31 * j);
                int i12 = (int) j34;
                iArr2[5] = (i12 << 1) | i11;
                int i13 = i12 >>> 31;
                long j35 = (j28 & 4294967295L) + (j34 >>> 32) + (j31 * j6);
                long j36 = (j29 & 4294967295L) + (j35 >>> 32) + (j31 * j10);
                long j37 = j30 + (j36 >>> 32) + (j31 * j16);
                long j38 = j32 + (j37 >>> 32) + (j31 * j23);
                long j39 = j33 + (j38 >>> 32);
                long j40 = ((long) iArr[6]) & 4294967295L;
                long j41 = ((long) iArr2[11]) & 4294967295L;
                long j42 = 4294967295L & ((long) iArr2[12]);
                long j43 = (j35 & 4294967295L) + (j40 * j);
                int i14 = (int) j43;
                iArr2[6] = (i14 << 1) | i13;
                long j44 = (j36 & 4294967295L) + (j43 >>> 32) + (j40 * j6);
                long j45 = (j37 & 4294967295L) + (j44 >>> 32) + (j10 * j40);
                long j46 = (j38 & 4294967295L) + (j45 >>> 32) + (j40 * j16);
                long j47 = j39 + (j46 >>> 32) + (j40 * j23);
                long j48 = j41 + (j47 >>> 32) + (j40 * j31);
                long j49 = j42 + (j48 >>> 32);
                int i15 = (int) j44;
                iArr2[7] = (i15 << 1) | (i14 >>> 31);
                int i16 = (int) j45;
                iArr2[8] = (i16 << 1) | (i15 >>> 31);
                int i17 = (int) j46;
                iArr2[9] = (i17 << 1) | (i16 >>> 31);
                int i18 = (int) j47;
                iArr2[10] = (i17 >>> 31) | (i18 << 1);
                int i19 = i18 >>> 31;
                int i20 = (int) j48;
                iArr2[11] = i19 | (i20 << 1);
                int i21 = i20 >>> 31;
                int i22 = (int) j49;
                iArr2[12] = i21 | (i22 << 1);
                iArr2[13] = (i22 >>> 31) | ((iArr2[13] + ((int) (j49 >> 32))) << 1);
                return;
            }
            i3 = i4;
        }
    }

    public static int r(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = (((long) iArr[0]) & 4294967295L) - (((long) iArr2[0]) & 4294967295L);
        iArr3[0] = (int) j;
        long j2 = (j >> 32) + ((((long) iArr[1]) & 4294967295L) - (((long) iArr2[1]) & 4294967295L));
        iArr3[1] = (int) j2;
        long j3 = (j2 >> 32) + ((((long) iArr[2]) & 4294967295L) - (((long) iArr2[2]) & 4294967295L));
        iArr3[2] = (int) j3;
        long j4 = (j3 >> 32) + ((((long) iArr[3]) & 4294967295L) - (((long) iArr2[3]) & 4294967295L));
        iArr3[3] = (int) j4;
        long j5 = (j4 >> 32) + ((((long) iArr[4]) & 4294967295L) - (((long) iArr2[4]) & 4294967295L));
        iArr3[4] = (int) j5;
        long j6 = (j5 >> 32) + ((((long) iArr[5]) & 4294967295L) - (((long) iArr2[5]) & 4294967295L));
        iArr3[5] = (int) j6;
        long j7 = (j6 >> 32) + ((((long) iArr[6]) & 4294967295L) - (((long) iArr2[6]) & 4294967295L));
        iArr3[6] = (int) j7;
        return (int) (j7 >> 32);
    }

    public static int s(int[] iArr, int[] iArr2) {
        long j = (((long) iArr2[0]) & 4294967295L) - (((long) iArr[0]) & 4294967295L);
        iArr2[0] = (int) j;
        long j2 = (j >> 32) + ((((long) iArr2[1]) & 4294967295L) - (((long) iArr[1]) & 4294967295L));
        iArr2[1] = (int) j2;
        long j3 = (j2 >> 32) + ((((long) iArr2[2]) & 4294967295L) - (((long) iArr[2]) & 4294967295L));
        iArr2[2] = (int) j3;
        long j4 = (j3 >> 32) + ((((long) iArr2[3]) & 4294967295L) - (((long) iArr[3]) & 4294967295L));
        iArr2[3] = (int) j4;
        long j5 = (j4 >> 32) + ((((long) iArr2[4]) & 4294967295L) - (((long) iArr[4]) & 4294967295L));
        iArr2[4] = (int) j5;
        long j6 = (j5 >> 32) + ((((long) iArr2[5]) & 4294967295L) - (((long) iArr[5]) & 4294967295L));
        iArr2[5] = (int) j6;
        long j7 = (j6 >> 32) + ((((long) iArr2[6]) & 4294967295L) - (4294967295L & ((long) iArr[6])));
        iArr2[6] = (int) j7;
        return (int) (j7 >> 32);
    }

    public static BigInteger t(int[] iArr) {
        byte[] bArr = new byte[28];
        for (int i = 0; i < 7; i++) {
            int i2 = iArr[i];
            if (i2 != 0) {
                ahh.a(i2, bArr, (6 - i) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static void u(int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        iArr[3] = 0;
        iArr[4] = 0;
        iArr[5] = 0;
        iArr[6] = 0;
    }
}
