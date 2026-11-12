package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class ekl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f16742a = {-6803, -2, -1, -1, -1, -1, -1};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f16743b = {46280809, 13606, 1, 0, 0, 0, 0, -13606, -3, -1, -1, -1, -1, -1};
    public static final int[] c = {-46280809, -13607, -2, -1, -1, -1, -1, 13605, 2};

    public static void a(int[] iArr, int[] iArr2, int[] iArr3) {
        if (zgg.a(iArr, iArr2, iArr3) != 0 || (iArr3[6] == -1 && zgg.i(iArr3, f16742a))) {
            mhg.b(7, 6803, iArr3);
        }
    }

    public static void b(int[] iArr, int[] iArr2) {
        if (mhg.r(7, iArr, iArr2) != 0 || (iArr2[6] == -1 && zgg.i(iArr2, f16742a))) {
            mhg.b(7, 6803, iArr2);
        }
    }

    public static int[] c(BigInteger bigInteger) {
        int[] iArrG = zgg.g(bigInteger);
        if (iArrG[6] == -1 && zgg.i(iArrG, f16742a)) {
            mhg.b(7, 6803, iArrG);
        }
        return iArrG;
    }

    public static void d(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArrE = zgg.e();
        zgg.l(iArr, iArr2, iArrE);
        g(iArrE, iArr3);
    }

    public static void e(int[] iArr, int[] iArr2, int[] iArr3) {
        if (zgg.p(iArr, iArr2, iArr3) != 0 || (iArr3[13] == -1 && mhg.p(14, iArr3, f16743b))) {
            int[] iArr4 = c;
            if (mhg.e(iArr4.length, iArr4, iArr3) != 0) {
                mhg.s(14, iArr3, iArr4.length);
            }
        }
    }

    public static void f(int[] iArr, int[] iArr2) {
        if (zgg.k(iArr)) {
            zgg.u(iArr2);
        } else {
            zgg.r(f16742a, iArr, iArr2);
        }
    }

    public static void g(int[] iArr, int[] iArr2) {
        if (zgg.n(6803, zgg.m(6803, iArr, 7, iArr, 0, iArr2, 0), iArr2, 0) != 0 || (iArr2[6] == -1 && zgg.i(iArr2, f16742a))) {
            mhg.b(7, 6803, iArr2);
        }
    }

    public static void h(int i, int[] iArr) {
        if ((i == 0 || zgg.o(6803, i, iArr, 0) == 0) && !(iArr[6] == -1 && zgg.i(iArr, f16742a))) {
            return;
        }
        mhg.b(7, 6803, iArr);
    }

    public static void i(int[] iArr, int[] iArr2) {
        int[] iArrE = zgg.e();
        zgg.q(iArr, iArrE);
        g(iArrE, iArr2);
    }

    public static void j(int[] iArr, int i, int[] iArr2) {
        int[] iArrE = zgg.e();
        zgg.q(iArr, iArrE);
        while (true) {
            g(iArrE, iArr2);
            i--;
            if (i <= 0) {
                return;
            } else {
                zgg.q(iArr2, iArrE);
            }
        }
    }

    public static void k(int[] iArr, int[] iArr2, int[] iArr3) {
        if (zgg.r(iArr, iArr2, iArr3) != 0) {
            mhg.K(7, 6803, iArr3);
        }
    }

    public static void l(int[] iArr, int[] iArr2) {
        if (mhg.D(7, iArr, 0, iArr2) != 0 || (iArr2[6] == -1 && zgg.i(iArr2, f16742a))) {
            mhg.b(7, 6803, iArr2);
        }
    }
}
