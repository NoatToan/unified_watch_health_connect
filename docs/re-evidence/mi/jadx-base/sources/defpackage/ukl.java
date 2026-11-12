package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class ukl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f35887a = {-977, -2, -1, -1, -1, -1, -1, -1};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f35888b = {954529, 1954, 1, 0, 0, 0, 0, 0, -1954, -3, -1, -1, -1, -1, -1, -1};
    public static final int[] c = {-954529, -1955, -2, -1, -1, -1, -1, -1, 1953, 2};

    public static void a(int[] iArr, int[] iArr2, int[] iArr3) {
        if (bhg.a(iArr, iArr2, iArr3) != 0 || (iArr3[7] == -1 && bhg.q(iArr3, f35887a))) {
            mhg.b(8, 977, iArr3);
        }
    }

    public static void b(int[] iArr, int[] iArr2) {
        if (mhg.r(8, iArr, iArr2) != 0 || (iArr2[7] == -1 && bhg.q(iArr2, f35887a))) {
            mhg.b(8, 977, iArr2);
        }
    }

    public static int[] c(BigInteger bigInteger) {
        int[] iArrM = bhg.m(bigInteger);
        if (iArrM[7] == -1) {
            int[] iArr = f35887a;
            if (bhg.q(iArrM, iArr)) {
                bhg.G(iArr, iArrM);
            }
        }
        return iArrM;
    }

    public static void d(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArrH = bhg.h();
        bhg.w(iArr, iArr2, iArrH);
        g(iArrH, iArr3);
    }

    public static void e(int[] iArr, int[] iArr2, int[] iArr3) {
        if (bhg.A(iArr, iArr2, iArr3) != 0 || (iArr3[15] == -1 && mhg.p(16, iArr3, f35888b))) {
            int[] iArr4 = c;
            if (mhg.e(iArr4.length, iArr4, iArr3) != 0) {
                mhg.s(16, iArr3, iArr4.length);
            }
        }
    }

    public static void f(int[] iArr, int[] iArr2) {
        if (bhg.t(iArr)) {
            bhg.J(iArr2);
        } else {
            bhg.F(f35887a, iArr, iArr2);
        }
    }

    public static void g(int[] iArr, int[] iArr2) {
        if (bhg.y(977, bhg.x(977, iArr, 8, iArr, 0, iArr2, 0), iArr2, 0) != 0 || (iArr2[7] == -1 && bhg.q(iArr2, f35887a))) {
            mhg.b(8, 977, iArr2);
        }
    }

    public static void h(int i, int[] iArr) {
        if ((i == 0 || bhg.z(977, i, iArr, 0) == 0) && !(iArr[7] == -1 && bhg.q(iArr, f35887a))) {
            return;
        }
        mhg.b(8, 977, iArr);
    }

    public static void i(int[] iArr, int[] iArr2) {
        int[] iArrH = bhg.h();
        bhg.D(iArr, iArrH);
        g(iArrH, iArr2);
    }

    public static void j(int[] iArr, int i, int[] iArr2) {
        int[] iArrH = bhg.h();
        bhg.D(iArr, iArrH);
        while (true) {
            g(iArrH, iArr2);
            i--;
            if (i <= 0) {
                return;
            } else {
                bhg.D(iArr2, iArrH);
            }
        }
    }

    public static void k(int[] iArr, int[] iArr2, int[] iArr3) {
        if (bhg.F(iArr, iArr2, iArr3) != 0) {
            mhg.K(8, 977, iArr3);
        }
    }

    public static void l(int[] iArr, int[] iArr2) {
        if (mhg.D(8, iArr, 0, iArr2) != 0 || (iArr2[7] == -1 && bhg.q(iArr2, f35887a))) {
            mhg.b(8, 977, iArr2);
        }
    }
}
