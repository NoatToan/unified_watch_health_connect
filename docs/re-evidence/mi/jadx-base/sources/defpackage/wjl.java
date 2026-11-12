package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class wjl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f38034a = {-1, -1, -2, -1, -1, -1};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f38035b = {1, 0, 2, 0, 1, 0, -2, -1, -3, -1, -1, -1};
    public static final int[] c = {-1, -1, -3, -1, -2, -1, 1, 0, 2};

    public static void a(int[] iArr, int[] iArr2, int[] iArr3) {
        if (wgg.a(iArr, iArr2, iArr3) != 0 || (iArr3[5] == -1 && wgg.p(iArr3, f38034a))) {
            c(iArr3);
        }
    }

    public static void b(int[] iArr, int[] iArr2) {
        if (mhg.r(6, iArr, iArr2) != 0 || (iArr2[5] == -1 && wgg.p(iArr2, f38034a))) {
            c(iArr2);
        }
    }

    public static void c(int[] iArr) {
        long j = (((long) iArr[0]) & 4294967295L) + 1;
        iArr[0] = (int) j;
        long j2 = j >> 32;
        if (j2 != 0) {
            long j3 = j2 + (((long) iArr[1]) & 4294967295L);
            iArr[1] = (int) j3;
            j2 = j3 >> 32;
        }
        long j4 = j2 + (4294967295L & ((long) iArr[2])) + 1;
        iArr[2] = (int) j4;
        if ((j4 >> 32) != 0) {
            mhg.s(6, iArr, 3);
        }
    }

    public static int[] d(BigInteger bigInteger) {
        int[] iArrL = wgg.l(bigInteger);
        if (iArrL[5] == -1) {
            int[] iArr = f38034a;
            if (wgg.p(iArrL, iArr)) {
                wgg.E(iArr, iArrL);
            }
        }
        return iArrL;
    }

    public static void e(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArrG = wgg.g();
        wgg.v(iArr, iArr2, iArrG);
        h(iArrG, iArr3);
    }

    public static void f(int[] iArr, int[] iArr2, int[] iArr3) {
        if (wgg.z(iArr, iArr2, iArr3) != 0 || (iArr3[11] == -1 && mhg.p(12, iArr3, f38035b))) {
            int[] iArr4 = c;
            if (mhg.e(iArr4.length, iArr4, iArr3) != 0) {
                mhg.s(12, iArr3, iArr4.length);
            }
        }
    }

    public static void g(int[] iArr, int[] iArr2) {
        if (wgg.s(iArr)) {
            wgg.H(iArr2);
        } else {
            wgg.D(f38034a, iArr, iArr2);
        }
    }

    public static void h(int[] iArr, int[] iArr2) {
        long j = ((long) iArr[6]) & 4294967295L;
        long j2 = ((long) iArr[7]) & 4294967295L;
        long j3 = ((long) iArr[8]) & 4294967295L;
        long j4 = ((long) iArr[9]) & 4294967295L;
        long j5 = (((long) iArr[10]) & 4294967295L) + j;
        long j6 = (((long) iArr[11]) & 4294967295L) + j2;
        long j7 = (((long) iArr[0]) & 4294967295L) + j5;
        int i = (int) j7;
        long j8 = (j7 >> 32) + (((long) iArr[1]) & 4294967295L) + j6;
        int i2 = (int) j8;
        iArr2[1] = i2;
        long j9 = j5 + j3;
        long j10 = j6 + j4;
        long j11 = (j8 >> 32) + (((long) iArr[2]) & 4294967295L) + j9;
        long j12 = j11 & 4294967295L;
        long j13 = (j11 >> 32) + (((long) iArr[3]) & 4294967295L) + j10;
        iArr2[3] = (int) j13;
        long j14 = j10 - j2;
        long j15 = (j13 >> 32) + (((long) iArr[4]) & 4294967295L) + (j9 - j);
        iArr2[4] = (int) j15;
        long j16 = (j15 >> 32) + (((long) iArr[5]) & 4294967295L) + j14;
        iArr2[5] = (int) j16;
        long j17 = j16 >> 32;
        long j18 = j12 + j17;
        long j19 = j17 + (((long) i) & 4294967295L);
        iArr2[0] = (int) j19;
        long j20 = j19 >> 32;
        if (j20 != 0) {
            long j21 = j20 + (4294967295L & ((long) i2));
            iArr2[1] = (int) j21;
            j18 += j21 >> 32;
        }
        iArr2[2] = (int) j18;
        if (((j18 >> 32) == 0 || mhg.s(6, iArr2, 3) == 0) && !(iArr2[5] == -1 && wgg.p(iArr2, f38034a))) {
            return;
        }
        c(iArr2);
    }

    public static void i(int i, int[] iArr) {
        long j;
        if (i != 0) {
            long j2 = ((long) i) & 4294967295L;
            long j3 = (((long) iArr[0]) & 4294967295L) + j2;
            iArr[0] = (int) j3;
            long j4 = j3 >> 32;
            if (j4 != 0) {
                long j5 = j4 + (((long) iArr[1]) & 4294967295L);
                iArr[1] = (int) j5;
                j4 = j5 >> 32;
            }
            long j6 = j4 + (4294967295L & ((long) iArr[2])) + j2;
            iArr[2] = (int) j6;
            j = j6 >> 32;
        } else {
            j = 0;
        }
        if ((j == 0 || mhg.s(6, iArr, 3) == 0) && !(iArr[5] == -1 && wgg.p(iArr, f38034a))) {
            return;
        }
        c(iArr);
    }

    public static void j(int[] iArr, int[] iArr2) {
        int[] iArrG = wgg.g();
        wgg.B(iArr, iArrG);
        h(iArrG, iArr2);
    }

    public static void k(int[] iArr, int i, int[] iArr2) {
        int[] iArrG = wgg.g();
        wgg.B(iArr, iArrG);
        while (true) {
            h(iArrG, iArr2);
            i--;
            if (i <= 0) {
                return;
            } else {
                wgg.B(iArr2, iArrG);
            }
        }
    }

    public static void l(int[] iArr) {
        long j = (((long) iArr[0]) & 4294967295L) - 1;
        iArr[0] = (int) j;
        long j2 = j >> 32;
        if (j2 != 0) {
            long j3 = j2 + (((long) iArr[1]) & 4294967295L);
            iArr[1] = (int) j3;
            j2 = j3 >> 32;
        }
        long j4 = j2 + ((4294967295L & ((long) iArr[2])) - 1);
        iArr[2] = (int) j4;
        if ((j4 >> 32) != 0) {
            mhg.l(6, iArr, 3);
        }
    }

    public static void m(int[] iArr, int[] iArr2, int[] iArr3) {
        if (wgg.D(iArr, iArr2, iArr3) != 0) {
            l(iArr3);
        }
    }

    public static void n(int[] iArr, int[] iArr2) {
        if (mhg.D(6, iArr, 0, iArr2) != 0 || (iArr2[5] == -1 && wgg.p(iArr2, f38034a))) {
            c(iArr2);
        }
    }
}
