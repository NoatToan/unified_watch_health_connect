package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class lil {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f25105a = {-1, -1, -1, -3};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f25106b = {1, 0, 0, 4, -2, -1, 3, -4};
    public static final int[] c = {-1, -1, -1, -5, 1, 0, -4, 3};

    public static void a(int[] iArr, int[] iArr2, int[] iArr3) {
        if (rgg.a(iArr, iArr2, iArr3) != 0 || (iArr3[3] == -3 && rgg.l(iArr3, f25105a))) {
            c(iArr3);
        }
    }

    public static void b(int[] iArr, int[] iArr2) {
        if (xgg.r(4, iArr, iArr2) != 0 || (iArr2[3] == -3 && rgg.l(iArr2, f25105a))) {
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
        iArr[3] = (int) (j2 + (4294967295L & ((long) iArr[3])) + 2);
    }

    public static int[] d(BigInteger bigInteger) {
        int[] iArrI = rgg.i(bigInteger);
        if (iArrI[3] == -3) {
            int[] iArr = f25105a;
            if (rgg.l(iArrI, iArr)) {
                rgg.u(iArr, iArrI);
            }
        }
        return iArrI;
    }

    public static void e(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArrE = rgg.e();
        rgg.q(iArr, iArr2, iArrE);
        h(iArrE, iArr3);
    }

    public static void f(int[] iArr, int[] iArr2, int[] iArr3) {
        if (rgg.r(iArr, iArr2, iArr3) != 0 || (iArr3[7] == -4 && ahg.q(iArr3, f25106b))) {
            int[] iArr4 = c;
            xgg.e(iArr4.length, iArr4, iArr3);
        }
    }

    public static void g(int[] iArr, int[] iArr2) {
        if (rgg.o(iArr)) {
            rgg.x(iArr2);
        } else {
            rgg.t(f25105a, iArr, iArr2);
        }
    }

    public static void h(int[] iArr, int[] iArr2) {
        long j = ((long) iArr[0]) & 4294967295L;
        long j2 = ((long) iArr[1]) & 4294967295L;
        long j3 = ((long) iArr[2]) & 4294967295L;
        long j4 = ((long) iArr[3]) & 4294967295L;
        long j5 = ((long) iArr[4]) & 4294967295L;
        long j6 = ((long) iArr[5]) & 4294967295L;
        long j7 = ((long) iArr[6]) & 4294967295L;
        long j8 = ((long) iArr[7]) & 4294967295L;
        long j9 = j4 + j8;
        long j10 = j7 + (j8 << 1);
        long j11 = j3 + j10;
        long j12 = j6 + (j10 << 1);
        long j13 = j2 + j12;
        long j14 = j5 + (j12 << 1);
        long j15 = j + j14;
        iArr2[0] = (int) j15;
        long j16 = j13 + (j15 >>> 32);
        iArr2[1] = (int) j16;
        long j17 = j11 + (j16 >>> 32);
        iArr2[2] = (int) j17;
        long j18 = j9 + (j14 << 1) + (j17 >>> 32);
        iArr2[3] = (int) j18;
        i((int) (j18 >>> 32), iArr2);
    }

    public static void i(int i, int[] iArr) {
        while (i != 0) {
            long j = ((long) i) & 4294967295L;
            long j2 = (((long) iArr[0]) & 4294967295L) + j;
            iArr[0] = (int) j2;
            long j3 = j2 >> 32;
            if (j3 != 0) {
                long j4 = j3 + (((long) iArr[1]) & 4294967295L);
                iArr[1] = (int) j4;
                long j5 = (j4 >> 32) + (((long) iArr[2]) & 4294967295L);
                iArr[2] = (int) j5;
                j3 = j5 >> 32;
            }
            long j6 = j3 + (4294967295L & ((long) iArr[3])) + (j << 1);
            iArr[3] = (int) j6;
            i = (int) (j6 >> 32);
        }
    }

    public static void j(int[] iArr, int[] iArr2) {
        int[] iArrE = rgg.e();
        rgg.s(iArr, iArrE);
        h(iArrE, iArr2);
    }

    public static void k(int[] iArr, int i, int[] iArr2) {
        int[] iArrE = rgg.e();
        rgg.s(iArr, iArrE);
        h(iArrE, iArr2);
        while (true) {
            i--;
            if (i <= 0) {
                return;
            }
            rgg.s(iArr2, iArrE);
            h(iArrE, iArr2);
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
        iArr[3] = (int) (j2 + ((4294967295L & ((long) iArr[3])) - 2));
    }

    public static void m(int[] iArr, int[] iArr2, int[] iArr3) {
        if (rgg.t(iArr, iArr2, iArr3) != 0) {
            l(iArr3);
        }
    }

    public static void n(int[] iArr, int[] iArr2) {
        if (xgg.D(4, iArr, 0, iArr2) != 0 || (iArr2[3] == -3 && rgg.l(iArr2, f25105a))) {
            c(iArr2);
        }
    }
}
