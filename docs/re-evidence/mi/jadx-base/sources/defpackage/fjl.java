package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class fjl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f17853a = {-21389, -2, -1, -1, -1};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f17854b = {457489321, 42778, 1, 0, 0, -42778, -3, -1, -1, -1};
    public static final int[] c = {-457489321, -42779, -2, -1, -1, 42777, 2};

    public static void a(int[] iArr, int[] iArr2, int[] iArr3) {
        if (tgg.a(iArr, iArr2, iArr3) != 0 || (iArr3[4] == -1 && tgg.h(iArr3, f17853a))) {
            xgg.b(5, 21389, iArr3);
        }
    }

    public static void b(int[] iArr, int[] iArr2) {
        if (xgg.r(5, iArr, iArr2) != 0 || (iArr2[4] == -1 && tgg.h(iArr2, f17853a))) {
            xgg.b(5, 21389, iArr2);
        }
    }

    public static int[] c(BigInteger bigInteger) {
        int[] iArrF = tgg.f(bigInteger);
        if (iArrF[4] == -1) {
            int[] iArr = f17853a;
            if (tgg.h(iArrF, iArr)) {
                tgg.s(iArr, iArrF);
            }
        }
        return iArrF;
    }

    public static void d(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArrD = tgg.d();
        tgg.k(iArr, iArr2, iArrD);
        g(iArrD, iArr3);
    }

    public static void e(int[] iArr, int[] iArr2, int[] iArr3) {
        if (tgg.o(iArr, iArr2, iArr3) != 0 || (iArr3[9] == -1 && xgg.p(10, iArr3, f17854b))) {
            int[] iArr4 = c;
            if (xgg.e(iArr4.length, iArr4, iArr3) != 0) {
                xgg.s(10, iArr3, iArr4.length);
            }
        }
    }

    public static void f(int[] iArr, int[] iArr2) {
        if (tgg.j(iArr)) {
            tgg.u(iArr2);
        } else {
            tgg.r(f17853a, iArr, iArr2);
        }
    }

    public static void g(int[] iArr, int[] iArr2) {
        if (tgg.m(21389, tgg.l(21389, iArr, 5, iArr, 0, iArr2, 0), iArr2, 0) != 0 || (iArr2[4] == -1 && tgg.h(iArr2, f17853a))) {
            xgg.b(5, 21389, iArr2);
        }
    }

    public static void h(int i, int[] iArr) {
        if ((i == 0 || tgg.n(21389, i, iArr, 0) == 0) && !(iArr[4] == -1 && tgg.h(iArr, f17853a))) {
            return;
        }
        xgg.b(5, 21389, iArr);
    }

    public static void i(int[] iArr, int[] iArr2) {
        int[] iArrD = tgg.d();
        tgg.q(iArr, iArrD);
        g(iArrD, iArr2);
    }

    public static void j(int[] iArr, int i, int[] iArr2) {
        int[] iArrD = tgg.d();
        tgg.q(iArr, iArrD);
        g(iArrD, iArr2);
        while (true) {
            i--;
            if (i <= 0) {
                return;
            }
            tgg.q(iArr2, iArrD);
            g(iArrD, iArr2);
        }
    }

    public static void k(int[] iArr, int[] iArr2, int[] iArr3) {
        if (tgg.r(iArr, iArr2, iArr3) != 0) {
            xgg.K(5, 21389, iArr3);
        }
    }

    public static void l(int[] iArr, int[] iArr2) {
        if (xgg.D(5, iArr, 0, iArr2) != 0 || (iArr2[4] == -1 && tgg.h(iArr2, f17853a))) {
            xgg.b(5, 21389, iArr2);
        }
    }
}
