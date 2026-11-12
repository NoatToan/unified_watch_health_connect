package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class gjl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f19061a = {-21389, -2, -1, -1, -1};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f19062b = {457489321, 42778, 1, 0, 0, -42778, -3, -1, -1, -1};
    public static final int[] c = {-457489321, -42779, -2, -1, -1, 42777, 2};

    public static void a(int[] iArr, int[] iArr2, int[] iArr3) {
        if (ugg.a(iArr, iArr2, iArr3) != 0 || (iArr3[4] == -1 && ugg.h(iArr3, f19061a))) {
            mhg.b(5, 21389, iArr3);
        }
    }

    public static void b(int[] iArr, int[] iArr2) {
        if (mhg.r(5, iArr, iArr2) != 0 || (iArr2[4] == -1 && ugg.h(iArr2, f19061a))) {
            mhg.b(5, 21389, iArr2);
        }
    }

    public static int[] c(BigInteger bigInteger) {
        int[] iArrF = ugg.f(bigInteger);
        if (iArrF[4] == -1) {
            int[] iArr = f19061a;
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
        if (ugg.o(iArr, iArr2, iArr3) != 0 || (iArr3[9] == -1 && mhg.p(10, iArr3, f19062b))) {
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
            ugg.r(f19061a, iArr, iArr2);
        }
    }

    public static void g(int[] iArr, int[] iArr2) {
        if (ugg.m(21389, ugg.l(21389, iArr, 5, iArr, 0, iArr2, 0), iArr2, 0) != 0 || (iArr2[4] == -1 && ugg.h(iArr2, f19061a))) {
            mhg.b(5, 21389, iArr2);
        }
    }

    public static void h(int i, int[] iArr) {
        if ((i == 0 || ugg.n(21389, i, iArr, 0) == 0) && !(iArr[4] == -1 && ugg.h(iArr, f19061a))) {
            return;
        }
        mhg.b(5, 21389, iArr);
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
            mhg.K(5, 21389, iArr3);
        }
    }

    public static void l(int[] iArr, int[] iArr2) {
        if (mhg.D(5, iArr, 0, iArr2) != 0 || (iArr2[4] == -1 && ugg.h(iArr2, f19061a))) {
            mhg.b(5, 21389, iArr2);
        }
    }
}
