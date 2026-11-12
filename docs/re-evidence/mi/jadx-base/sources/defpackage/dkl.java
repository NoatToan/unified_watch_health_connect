package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class dkl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f15630a = {-6803, -2, -1, -1, -1, -1, -1};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f15631b = {46280809, 13606, 1, 0, 0, 0, 0, -13606, -3, -1, -1, -1, -1, -1};
    public static final int[] c = {-46280809, -13607, -2, -1, -1, -1, -1, 13605, 2};

    public static void a(int[] iArr, int[] iArr2, int[] iArr3) {
        if (ygg.a(iArr, iArr2, iArr3) != 0 || (iArr3[6] == -1 && ygg.i(iArr3, f15630a))) {
            xgg.b(7, 6803, iArr3);
        }
    }

    public static void b(int[] iArr, int[] iArr2) {
        if (xgg.r(7, iArr, iArr2) != 0 || (iArr2[6] == -1 && ygg.i(iArr2, f15630a))) {
            xgg.b(7, 6803, iArr2);
        }
    }

    public static int[] c(BigInteger bigInteger) {
        int[] iArrG = ygg.g(bigInteger);
        if (iArrG[6] == -1 && ygg.i(iArrG, f15630a)) {
            xgg.b(7, 6803, iArrG);
        }
        return iArrG;
    }

    public static void d(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArrE = ygg.e();
        ygg.l(iArr, iArr2, iArrE);
        g(iArrE, iArr3);
    }

    public static void e(int[] iArr, int[] iArr2, int[] iArr3) {
        if (ygg.p(iArr, iArr2, iArr3) != 0 || (iArr3[13] == -1 && xgg.p(14, iArr3, f15631b))) {
            int[] iArr4 = c;
            if (xgg.e(iArr4.length, iArr4, iArr3) != 0) {
                xgg.s(14, iArr3, iArr4.length);
            }
        }
    }

    public static void f(int[] iArr, int[] iArr2) {
        if (ygg.k(iArr)) {
            ygg.u(iArr2);
        } else {
            ygg.r(f15630a, iArr, iArr2);
        }
    }

    public static void g(int[] iArr, int[] iArr2) {
        if (ygg.n(6803, ygg.m(6803, iArr, 7, iArr, 0, iArr2, 0), iArr2, 0) != 0 || (iArr2[6] == -1 && ygg.i(iArr2, f15630a))) {
            xgg.b(7, 6803, iArr2);
        }
    }

    public static void h(int i, int[] iArr) {
        if ((i == 0 || ygg.o(6803, i, iArr, 0) == 0) && !(iArr[6] == -1 && ygg.i(iArr, f15630a))) {
            return;
        }
        xgg.b(7, 6803, iArr);
    }

    public static void i(int[] iArr, int[] iArr2) {
        int[] iArrE = ygg.e();
        ygg.q(iArr, iArrE);
        g(iArrE, iArr2);
    }

    public static void j(int[] iArr, int i, int[] iArr2) {
        int[] iArrE = ygg.e();
        ygg.q(iArr, iArrE);
        g(iArrE, iArr2);
        while (true) {
            i--;
            if (i <= 0) {
                return;
            }
            ygg.q(iArr2, iArrE);
            g(iArrE, iArr2);
        }
    }

    public static void k(int[] iArr, int[] iArr2, int[] iArr3) {
        if (ygg.r(iArr, iArr2, iArr3) != 0) {
            xgg.K(7, 6803, iArr3);
        }
    }

    public static void l(int[] iArr, int[] iArr2) {
        if (xgg.D(7, iArr, 0, iArr2) != 0 || (iArr2[6] == -1 && ygg.i(iArr2, f15630a))) {
            xgg.b(7, 6803, iArr2);
        }
    }
}
