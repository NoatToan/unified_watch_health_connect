package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class kll {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f23964a = {-1, 0, 0, -1, -2, -1, -1, -1, -1, -1, -1, -1};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f23965b = {1, -2, 0, 2, 0, -2, 0, 2, 1, 0, 0, 0, -2, 1, 0, -2, -3, -1, -1, -1, -1, -1, -1, -1};
    public static final int[] c = {-1, 1, -1, -3, -1, 1, -1, -3, -2, -1, -1, -1, 1, -2, -1, 1, 2};

    public static void a(int[] iArr, int[] iArr2, int[] iArr3) {
        if (mhg.a(12, iArr, iArr2, iArr3) != 0 || (iArr3[11] == -1 && mhg.p(12, iArr3, f23964a))) {
            d(iArr3);
        }
    }

    public static void b(int[] iArr, int[] iArr2, int[] iArr3) {
        if (mhg.a(24, iArr, iArr2, iArr3) != 0 || (iArr3[23] == -1 && mhg.p(24, iArr3, f23965b))) {
            int[] iArr4 = c;
            if (mhg.e(iArr4.length, iArr4, iArr3) != 0) {
                mhg.s(24, iArr3, iArr4.length);
            }
        }
    }

    public static void c(int[] iArr, int[] iArr2) {
        if (mhg.r(12, iArr, iArr2) != 0 || (iArr2[11] == -1 && mhg.p(12, iArr2, f23964a))) {
            d(iArr2);
        }
    }

    public static void d(int[] iArr) {
        long j = (((long) iArr[0]) & 4294967295L) + 1;
        iArr[0] = (int) j;
        long j2 = (j >> 32) + ((((long) iArr[1]) & 4294967295L) - 1);
        iArr[1] = (int) j2;
        long j3 = j2 >> 32;
        if (j3 != 0) {
            long j4 = j3 + (((long) iArr[2]) & 4294967295L);
            iArr[2] = (int) j4;
            j3 = j4 >> 32;
        }
        long j5 = j3 + (((long) iArr[3]) & 4294967295L) + 1;
        iArr[3] = (int) j5;
        long j6 = (j5 >> 32) + (4294967295L & ((long) iArr[4])) + 1;
        iArr[4] = (int) j6;
        if ((j6 >> 32) != 0) {
            mhg.s(12, iArr, 5);
        }
    }

    public static int[] e(BigInteger bigInteger) {
        int[] iArrN = mhg.n(384, bigInteger);
        if (iArrN[11] == -1) {
            int[] iArr = f23964a;
            if (mhg.p(12, iArrN, iArr)) {
                mhg.M(12, iArr, iArrN);
            }
        }
        return iArrN;
    }

    public static void f(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArrI = mhg.i(24);
        fhg.a(iArr, iArr2, iArrI);
        h(iArrI, iArr3);
    }

    public static void g(int[] iArr, int[] iArr2) {
        if (mhg.v(12, iArr)) {
            mhg.P(12, iArr2);
        } else {
            mhg.J(12, f23964a, iArr, iArr2);
        }
    }

    public static void h(int[] iArr, int[] iArr2) {
        long j = ((long) iArr[16]) & 4294967295L;
        long j2 = ((long) iArr[17]) & 4294967295L;
        long j3 = ((long) iArr[18]) & 4294967295L;
        long j4 = ((long) iArr[19]) & 4294967295L;
        long j5 = ((long) iArr[20]) & 4294967295L;
        long j6 = ((long) iArr[21]) & 4294967295L;
        long j7 = ((long) iArr[22]) & 4294967295L;
        long j8 = ((long) iArr[23]) & 4294967295L;
        long j9 = ((((long) iArr[12]) & 4294967295L) + j5) - 1;
        long j10 = (((long) iArr[13]) & 4294967295L) + j7;
        long j11 = (((long) iArr[14]) & 4294967295L) + j7 + j8;
        long j12 = (((long) iArr[15]) & 4294967295L) + j8;
        long j13 = j2 + j6;
        long j14 = j6 - j8;
        long j15 = j7 - j8;
        long j16 = j9 + j14;
        long j17 = (((long) iArr[0]) & 4294967295L) + j16;
        iArr2[0] = (int) j17;
        long j18 = (j17 >> 32) + (((((long) iArr[1]) & 4294967295L) + j8) - j9) + j10;
        iArr2[1] = (int) j18;
        long j19 = (j18 >> 32) + (((((long) iArr[2]) & 4294967295L) - j6) - j10) + j11;
        iArr2[2] = (int) j19;
        long j20 = (j19 >> 32) + ((((long) iArr[3]) & 4294967295L) - j11) + j12 + j16;
        iArr2[3] = (int) j20;
        long j21 = (j20 >> 32) + (((((((long) iArr[4]) & 4294967295L) + j) + j6) + j10) - j12) + j16;
        iArr2[4] = (int) j21;
        long j22 = (j21 >> 32) + ((((long) iArr[5]) & 4294967295L) - j) + j10 + j11 + j13;
        iArr2[5] = (int) j22;
        long j23 = (j22 >> 32) + (((((long) iArr[6]) & 4294967295L) + j3) - j2) + j11 + j12;
        iArr2[6] = (int) j23;
        long j24 = (j23 >> 32) + ((((((long) iArr[7]) & 4294967295L) + j) + j4) - j3) + j12;
        iArr2[7] = (int) j24;
        long j25 = (j24 >> 32) + (((((((long) iArr[8]) & 4294967295L) + j) + j2) + j5) - j4);
        iArr2[8] = (int) j25;
        long j26 = (j25 >> 32) + (((((long) iArr[9]) & 4294967295L) + j3) - j5) + j13;
        iArr2[9] = (int) j26;
        long j27 = (j26 >> 32) + ((((((long) iArr[10]) & 4294967295L) + j3) + j4) - j14) + j15;
        iArr2[10] = (int) j27;
        long j28 = (j27 >> 32) + ((((((long) iArr[11]) & 4294967295L) + j4) + j5) - j15);
        iArr2[11] = (int) j28;
        i((int) ((j28 >> 32) + 1), iArr2);
    }

    public static void i(int i, int[] iArr) {
        long j;
        if (i != 0) {
            long j2 = ((long) i) & 4294967295L;
            long j3 = (((long) iArr[0]) & 4294967295L) + j2;
            iArr[0] = (int) j3;
            long j4 = (j3 >> 32) + ((((long) iArr[1]) & 4294967295L) - j2);
            iArr[1] = (int) j4;
            long j5 = j4 >> 32;
            if (j5 != 0) {
                long j6 = j5 + (((long) iArr[2]) & 4294967295L);
                iArr[2] = (int) j6;
                j5 = j6 >> 32;
            }
            long j7 = j5 + (((long) iArr[3]) & 4294967295L) + j2;
            iArr[3] = (int) j7;
            long j8 = (j7 >> 32) + (4294967295L & ((long) iArr[4])) + j2;
            iArr[4] = (int) j8;
            j = j8 >> 32;
        } else {
            j = 0;
        }
        if ((j == 0 || mhg.s(12, iArr, 5) == 0) && !(iArr[11] == -1 && mhg.p(12, iArr, f23964a))) {
            return;
        }
        d(iArr);
    }

    public static void j(int[] iArr, int[] iArr2) {
        int[] iArrI = mhg.i(24);
        fhg.b(iArr, iArrI);
        h(iArrI, iArr2);
    }

    public static void k(int[] iArr, int i, int[] iArr2) {
        int[] iArrI = mhg.i(24);
        fhg.b(iArr, iArrI);
        while (true) {
            h(iArrI, iArr2);
            i--;
            if (i <= 0) {
                return;
            } else {
                fhg.b(iArr2, iArrI);
            }
        }
    }

    public static void l(int[] iArr) {
        long j = (((long) iArr[0]) & 4294967295L) - 1;
        iArr[0] = (int) j;
        long j2 = (j >> 32) + (((long) iArr[1]) & 4294967295L) + 1;
        iArr[1] = (int) j2;
        long j3 = j2 >> 32;
        if (j3 != 0) {
            long j4 = j3 + (((long) iArr[2]) & 4294967295L);
            iArr[2] = (int) j4;
            j3 = j4 >> 32;
        }
        long j5 = j3 + ((((long) iArr[3]) & 4294967295L) - 1);
        iArr[3] = (int) j5;
        long j6 = (j5 >> 32) + ((4294967295L & ((long) iArr[4])) - 1);
        iArr[4] = (int) j6;
        if ((j6 >> 32) != 0) {
            mhg.l(12, iArr, 5);
        }
    }

    public static void m(int[] iArr, int[] iArr2, int[] iArr3) {
        if (mhg.J(12, iArr, iArr2, iArr3) != 0) {
            l(iArr3);
        }
    }

    public static void n(int[] iArr, int[] iArr2) {
        if (mhg.D(12, iArr, 0, iArr2) != 0 || (iArr2[11] == -1 && mhg.p(12, iArr2, f23964a))) {
            d(iArr2);
        }
    }
}
