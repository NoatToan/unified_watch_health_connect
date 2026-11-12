package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class tkl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f34795a = {-977, -2, -1, -1, -1, -1, -1, -1};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f34796b = {954529, 1954, 1, 0, 0, 0, 0, 0, -1954, -3, -1, -1, -1, -1, -1, -1};
    public static final int[] c = {-954529, -1955, -2, -1, -1, -1, -1, -1, 1953, 2};

    public static void a(int[] iArr, int[] iArr2, int[] iArr3) {
        if (ahg.a(iArr, iArr2, iArr3) != 0 || (iArr3[7] == -1 && ahg.q(iArr3, f34795a))) {
            xgg.b(8, 977, iArr3);
        }
    }

    public static void b(int[] iArr, int[] iArr2) {
        if (xgg.r(8, iArr, iArr2) != 0 || (iArr2[7] == -1 && ahg.q(iArr2, f34795a))) {
            xgg.b(8, 977, iArr2);
        }
    }

    public static int[] c(BigInteger bigInteger) {
        int[] iArrM = ahg.m(bigInteger);
        if (iArrM[7] == -1) {
            int[] iArr = f34795a;
            if (ahg.q(iArrM, iArr)) {
                ahg.G(iArr, iArrM);
            }
        }
        return iArrM;
    }

    public static void d(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArrH = ahg.h();
        ahg.w(iArr, iArr2, iArrH);
        g(iArrH, iArr3);
    }

    public static void e(int[] iArr, int[] iArr2, int[] iArr3) {
        if (ahg.A(iArr, iArr2, iArr3) != 0 || (iArr3[15] == -1 && xgg.p(16, iArr3, f34796b))) {
            int[] iArr4 = c;
            if (xgg.e(iArr4.length, iArr4, iArr3) != 0) {
                xgg.s(16, iArr3, iArr4.length);
            }
        }
    }

    public static void f(int[] iArr, int[] iArr2) {
        if (ahg.t(iArr)) {
            ahg.J(iArr2);
        } else {
            ahg.F(f34795a, iArr, iArr2);
        }
    }

    public static void g(int[] iArr, int[] iArr2) {
        if (ahg.y(977, ahg.x(977, iArr, 8, iArr, 0, iArr2, 0), iArr2, 0) != 0 || (iArr2[7] == -1 && ahg.q(iArr2, f34795a))) {
            xgg.b(8, 977, iArr2);
        }
    }

    public static void h(int i, int[] iArr) {
        if ((i == 0 || ahg.z(977, i, iArr, 0) == 0) && !(iArr[7] == -1 && ahg.q(iArr, f34795a))) {
            return;
        }
        xgg.b(8, 977, iArr);
    }

    public static void i(int[] iArr, int[] iArr2) {
        int[] iArrH = ahg.h();
        ahg.D(iArr, iArrH);
        g(iArrH, iArr2);
    }

    public static void j(int[] iArr, int i, int[] iArr2) {
        int[] iArrH = ahg.h();
        ahg.D(iArr, iArrH);
        g(iArrH, iArr2);
        while (true) {
            i--;
            if (i <= 0) {
                return;
            }
            ahg.D(iArr2, iArrH);
            g(iArrH, iArr2);
        }
    }

    public static void k(int[] iArr, int[] iArr2, int[] iArr3) {
        if (ahg.F(iArr, iArr2, iArr3) != 0) {
            xgg.K(8, 977, iArr3);
        }
    }

    public static void l(int[] iArr, int[] iArr2) {
        if (xgg.D(8, iArr, 0, iArr2) != 0 || (iArr2[7] == -1 && ahg.q(iArr2, f34795a))) {
            xgg.b(8, 977, iArr2);
        }
    }
}
