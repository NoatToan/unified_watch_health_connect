package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class ojl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f29226a = {-4553, -2, -1, -1, -1, -1};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f29227b = {20729809, 9106, 1, 0, 0, 0, -9106, -3, -1, -1, -1, -1};
    public static final int[] c = {-20729809, -9107, -2, -1, -1, -1, 9105, 2};

    public static void a(int[] iArr, int[] iArr2, int[] iArr3) {
        if (wgg.a(iArr, iArr2, iArr3) != 0 || (iArr3[5] == -1 && wgg.p(iArr3, f29226a))) {
            mhg.b(6, 4553, iArr3);
        }
    }

    public static void b(int[] iArr, int[] iArr2) {
        if (mhg.r(6, iArr, iArr2) != 0 || (iArr2[5] == -1 && wgg.p(iArr2, f29226a))) {
            mhg.b(6, 4553, iArr2);
        }
    }

    public static int[] c(BigInteger bigInteger) {
        int[] iArrL = wgg.l(bigInteger);
        if (iArrL[5] == -1) {
            int[] iArr = f29226a;
            if (wgg.p(iArrL, iArr)) {
                wgg.E(iArr, iArrL);
            }
        }
        return iArrL;
    }

    public static void d(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArrG = wgg.g();
        wgg.v(iArr, iArr2, iArrG);
        g(iArrG, iArr3);
    }

    public static void e(int[] iArr, int[] iArr2, int[] iArr3) {
        if (wgg.z(iArr, iArr2, iArr3) != 0 || (iArr3[11] == -1 && mhg.p(12, iArr3, f29227b))) {
            int[] iArr4 = c;
            if (mhg.e(iArr4.length, iArr4, iArr3) != 0) {
                mhg.s(12, iArr3, iArr4.length);
            }
        }
    }

    public static void f(int[] iArr, int[] iArr2) {
        if (wgg.s(iArr)) {
            wgg.H(iArr2);
        } else {
            wgg.D(f29226a, iArr, iArr2);
        }
    }

    public static void g(int[] iArr, int[] iArr2) {
        if (wgg.x(4553, wgg.w(4553, iArr, 6, iArr, 0, iArr2, 0), iArr2, 0) != 0 || (iArr2[5] == -1 && wgg.p(iArr2, f29226a))) {
            mhg.b(6, 4553, iArr2);
        }
    }

    public static void h(int i, int[] iArr) {
        if ((i == 0 || wgg.y(4553, i, iArr, 0) == 0) && !(iArr[5] == -1 && wgg.p(iArr, f29226a))) {
            return;
        }
        mhg.b(6, 4553, iArr);
    }

    public static void i(int[] iArr, int[] iArr2) {
        int[] iArrG = wgg.g();
        wgg.B(iArr, iArrG);
        g(iArrG, iArr2);
    }

    public static void j(int[] iArr, int i, int[] iArr2) {
        int[] iArrG = wgg.g();
        wgg.B(iArr, iArrG);
        while (true) {
            g(iArrG, iArr2);
            i--;
            if (i <= 0) {
                return;
            } else {
                wgg.B(iArr2, iArrG);
            }
        }
    }

    public static void k(int[] iArr, int[] iArr2, int[] iArr3) {
        if (wgg.D(iArr, iArr2, iArr3) != 0) {
            mhg.K(6, 4553, iArr3);
        }
    }

    public static void l(int[] iArr, int[] iArr2) {
        if (mhg.D(6, iArr, 0, iArr2) != 0 || (iArr2[5] == -1 && wgg.p(iArr2, f29226a))) {
            mhg.b(6, 4553, iArr2);
        }
    }
}
