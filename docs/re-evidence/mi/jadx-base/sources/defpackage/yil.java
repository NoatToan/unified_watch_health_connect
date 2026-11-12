package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class yil {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f40219a = {Integer.MAX_VALUE, -1, -1, -1, -1};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f40220b = {1, 1073741825, 0, 0, 0, -2, -2, -1, -1, -1};
    public static final int[] c = {-1, -1073741826, -1, -1, -1, 1, 1};

    public static void a(int[] iArr, int[] iArr2, int[] iArr3) {
        if (ugg.a(iArr, iArr2, iArr3) != 0 || (iArr3[4] == -1 && ugg.h(iArr3, f40219a))) {
            mhg.g(5, -2147483647, iArr3);
        }
    }

    public static void b(int[] iArr, int[] iArr2) {
        if (mhg.r(5, iArr, iArr2) != 0 || (iArr2[4] == -1 && ugg.h(iArr2, f40219a))) {
            mhg.g(5, -2147483647, iArr2);
        }
    }

    public static int[] c(BigInteger bigInteger) {
        int[] iArrF = ugg.f(bigInteger);
        if (iArrF[4] == -1) {
            int[] iArr = f40219a;
            if (ugg.h(iArrF, iArr)) {
                ugg.s(iArr, iArrF);
            }
        }
        return iArrF;
    }

    public static void d(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArrD = ugg.d();
        ugg.k(iArr, iArr2, iArrD);
        g(iArrD, iArr3);
    }

    public static void e(int[] iArr, int[] iArr2, int[] iArr3) {
        if (ugg.o(iArr, iArr2, iArr3) != 0 || (iArr3[9] == -1 && mhg.p(10, iArr3, f40220b))) {
            int[] iArr4 = c;
            if (mhg.e(iArr4.length, iArr4, iArr3) != 0) {
                mhg.s(10, iArr3, iArr4.length);
            }
        }
    }

    public static void f(int[] iArr, int[] iArr2) {
        if (ugg.j(iArr)) {
            ugg.u(iArr2);
        } else {
            ugg.r(f40219a, iArr, iArr2);
        }
    }

    public static void g(int[] iArr, int[] iArr2) {
        long j = ((long) iArr[5]) & 4294967295L;
        long j2 = ((long) iArr[6]) & 4294967295L;
        long j3 = ((long) iArr[7]) & 4294967295L;
        long j4 = ((long) iArr[8]) & 4294967295L;
        long j5 = ((long) iArr[9]) & 4294967295L;
        long j6 = (((long) iArr[0]) & 4294967295L) + j + (j << 31);
        iArr2[0] = (int) j6;
        long j7 = (j6 >>> 32) + (((long) iArr[1]) & 4294967295L) + j2 + (j2 << 31);
        iArr2[1] = (int) j7;
        long j8 = (j7 >>> 32) + (((long) iArr[2]) & 4294967295L) + j3 + (j3 << 31);
        iArr2[2] = (int) j8;
        long j9 = (j8 >>> 32) + (((long) iArr[3]) & 4294967295L) + j4 + (j4 << 31);
        iArr2[3] = (int) j9;
        long j10 = (j9 >>> 32) + (4294967295L & ((long) iArr[4])) + j5 + (j5 << 31);
        iArr2[4] = (int) j10;
        h((int) (j10 >>> 32), iArr2);
    }

    public static void h(int i, int[] iArr) {
        if ((i == 0 || ugg.p(-2147483647, i, iArr, 0) == 0) && !(iArr[4] == -1 && ugg.h(iArr, f40219a))) {
            return;
        }
        mhg.g(5, -2147483647, iArr);
    }

    public static void i(int[] iArr, int[] iArr2) {
        int[] iArrD = ugg.d();
        ugg.q(iArr, iArrD);
        g(iArrD, iArr2);
    }

    public static void j(int[] iArr, int i, int[] iArr2) {
        int[] iArrD = ugg.d();
        ugg.q(iArr, iArrD);
        while (true) {
            g(iArrD, iArr2);
            i--;
            if (i <= 0) {
                return;
            } else {
                ugg.q(iArr2, iArrD);
            }
        }
    }

    public static void k(int[] iArr, int[] iArr2, int[] iArr3) {
        if (ugg.r(iArr, iArr2, iArr3) != 0) {
            mhg.N(5, -2147483647, iArr3);
        }
    }

    public static void l(int[] iArr, int[] iArr2) {
        if (mhg.D(5, iArr, 0, iArr2) != 0 || (iArr2[4] == -1 && ugg.h(iArr2, f40219a))) {
            mhg.g(5, -2147483647, iArr2);
        }
    }
}
