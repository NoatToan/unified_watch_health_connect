package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class bll {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f4343a = {-1, -1, -1, 0, 0, 0, 1, -1};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f4344b = {1, 0, 0, -2, -1, -1, -2, 1, -2, 1, -2, 1, 1, -2, 2, -2};

    public static void a(int[] iArr, int[] iArr2, int[] iArr3) {
        if (ahg.a(iArr, iArr2, iArr3) != 0 || (iArr3[7] == -1 && ahg.q(iArr3, f4343a))) {
            c(iArr3);
        }
    }

    public static void b(int[] iArr, int[] iArr2) {
        if (xgg.r(8, iArr, iArr2) != 0 || (iArr2[7] == -1 && ahg.q(iArr2, f4343a))) {
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
            long j4 = (j3 >> 32) + (((long) iArr[2]) & 4294967295L);
            iArr[2] = (int) j4;
            j2 = j4 >> 32;
        }
        long j5 = j2 + ((((long) iArr[3]) & 4294967295L) - 1);
        iArr[3] = (int) j5;
        long j6 = j5 >> 32;
        if (j6 != 0) {
            long j7 = j6 + (((long) iArr[4]) & 4294967295L);
            iArr[4] = (int) j7;
            long j8 = (j7 >> 32) + (((long) iArr[5]) & 4294967295L);
            iArr[5] = (int) j8;
            j6 = j8 >> 32;
        }
        long j9 = j6 + ((((long) iArr[6]) & 4294967295L) - 1);
        iArr[6] = (int) j9;
        iArr[7] = (int) ((j9 >> 32) + (4294967295L & ((long) iArr[7])) + 1);
    }

    public static int[] d(BigInteger bigInteger) {
        int[] iArrM = ahg.m(bigInteger);
        if (iArrM[7] == -1) {
            int[] iArr = f4343a;
            if (ahg.q(iArrM, iArr)) {
                ahg.G(iArr, iArrM);
            }
        }
        return iArrM;
    }

    public static void e(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArrH = ahg.h();
        ahg.w(iArr, iArr2, iArrH);
        h(iArrH, iArr3);
    }

    public static void f(int[] iArr, int[] iArr2, int[] iArr3) {
        if (ahg.A(iArr, iArr2, iArr3) != 0 || (iArr3[15] == -1 && xgg.p(16, iArr3, f4344b))) {
            xgg.M(16, f4344b, iArr3);
        }
    }

    public static void g(int[] iArr, int[] iArr2) {
        if (ahg.t(iArr)) {
            ahg.J(iArr2);
        } else {
            ahg.F(f4343a, iArr, iArr2);
        }
    }

    public static void h(int[] iArr, int[] iArr2) {
        long j = ((long) iArr[8]) & 4294967295L;
        long j2 = ((long) iArr[9]) & 4294967295L;
        long j3 = ((long) iArr[10]) & 4294967295L;
        long j4 = ((long) iArr[11]) & 4294967295L;
        long j5 = ((long) iArr[12]) & 4294967295L;
        long j6 = ((long) iArr[13]) & 4294967295L;
        long j7 = ((long) iArr[14]) & 4294967295L;
        long j8 = ((long) iArr[15]) & 4294967295L;
        long j9 = j - 6;
        long j10 = j9 + j2;
        long j11 = j2 + j3;
        long j12 = (j3 + j4) - j8;
        long j13 = j4 + j5;
        long j14 = j5 + j6;
        long j15 = j6 + j7;
        long j16 = j7 + j8;
        long j17 = (((((long) iArr[0]) & 4294967295L) + j10) - j13) - j15;
        iArr2[0] = (int) j17;
        long j18 = (j17 >> 32) + ((((((long) iArr[1]) & 4294967295L) + j11) - j14) - j16);
        iArr2[1] = (int) j18;
        long j19 = (j18 >> 32) + (((((long) iArr[2]) & 4294967295L) + j12) - j15);
        iArr2[2] = (int) j19;
        long j20 = (j19 >> 32) + (((((((long) iArr[3]) & 4294967295L) + (j13 << 1)) + j6) - j8) - j10);
        iArr2[3] = (int) j20;
        long j21 = (j20 >> 32) + ((((((long) iArr[4]) & 4294967295L) + (j14 << 1)) + j7) - j11);
        iArr2[4] = (int) j21;
        long j22 = (j21 >> 32) + (((((long) iArr[5]) & 4294967295L) + (j15 << 1)) - j12);
        iArr2[5] = (int) j22;
        long j23 = (j22 >> 32) + ((((((long) iArr[6]) & 4294967295L) + (j16 << 1)) + j15) - j10);
        iArr2[6] = (int) j23;
        long j24 = (j23 >> 32) + (((((((long) iArr[7]) & 4294967295L) + (j8 << 1)) + j9) - j12) - j14);
        iArr2[7] = (int) j24;
        i((int) ((j24 >> 32) + 6), iArr2);
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
                long j6 = (j5 >> 32) + (((long) iArr[2]) & 4294967295L);
                iArr[2] = (int) j6;
                j4 = j6 >> 32;
            }
            long j7 = j4 + ((((long) iArr[3]) & 4294967295L) - j2);
            iArr[3] = (int) j7;
            long j8 = j7 >> 32;
            if (j8 != 0) {
                long j9 = j8 + (((long) iArr[4]) & 4294967295L);
                iArr[4] = (int) j9;
                long j10 = (j9 >> 32) + (((long) iArr[5]) & 4294967295L);
                iArr[5] = (int) j10;
                j8 = j10 >> 32;
            }
            long j11 = j8 + ((((long) iArr[6]) & 4294967295L) - j2);
            iArr[6] = (int) j11;
            long j12 = (j11 >> 32) + (4294967295L & ((long) iArr[7])) + j2;
            iArr[7] = (int) j12;
            j = j12 >> 32;
        } else {
            j = 0;
        }
        if (j != 0 || (iArr[7] == -1 && ahg.q(iArr, f4343a))) {
            c(iArr);
        }
    }

    public static void j(int[] iArr, int[] iArr2) {
        int[] iArrH = ahg.h();
        ahg.D(iArr, iArrH);
        h(iArrH, iArr2);
    }

    public static void k(int[] iArr, int i, int[] iArr2) {
        int[] iArrH = ahg.h();
        ahg.D(iArr, iArrH);
        h(iArrH, iArr2);
        while (true) {
            i--;
            if (i <= 0) {
                return;
            }
            ahg.D(iArr2, iArrH);
            h(iArrH, iArr2);
        }
    }

    public static void l(int[] iArr) {
        long j = (((long) iArr[0]) & 4294967295L) - 1;
        iArr[0] = (int) j;
        long j2 = j >> 32;
        if (j2 != 0) {
            long j3 = j2 + (((long) iArr[1]) & 4294967295L);
            iArr[1] = (int) j3;
            long j4 = (j3 >> 32) + (((long) iArr[2]) & 4294967295L);
            iArr[2] = (int) j4;
            j2 = j4 >> 32;
        }
        long j5 = j2 + (((long) iArr[3]) & 4294967295L) + 1;
        iArr[3] = (int) j5;
        long j6 = j5 >> 32;
        if (j6 != 0) {
            long j7 = j6 + (((long) iArr[4]) & 4294967295L);
            iArr[4] = (int) j7;
            long j8 = (j7 >> 32) + (((long) iArr[5]) & 4294967295L);
            iArr[5] = (int) j8;
            j6 = j8 >> 32;
        }
        long j9 = j6 + (((long) iArr[6]) & 4294967295L) + 1;
        iArr[6] = (int) j9;
        iArr[7] = (int) ((j9 >> 32) + ((4294967295L & ((long) iArr[7])) - 1));
    }

    public static void m(int[] iArr, int[] iArr2, int[] iArr3) {
        if (ahg.F(iArr, iArr2, iArr3) != 0) {
            l(iArr3);
        }
    }

    public static void n(int[] iArr, int[] iArr2) {
        if (xgg.D(8, iArr, 0, iArr2) != 0 || (iArr2[7] == -1 && ahg.q(iArr2, f4343a))) {
            c(iArr2);
        }
    }
}
