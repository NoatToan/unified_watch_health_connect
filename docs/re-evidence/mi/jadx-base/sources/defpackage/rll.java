package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class rll {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f32682a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 511};

    public static void a(int[] iArr, int[] iArr2, int[] iArr3) {
        int iA = xgg.a(16, iArr, iArr2, iArr3) + iArr[16] + iArr2[16];
        if (iA > 511 || (iA == 511 && xgg.m(16, iArr3, f32682a))) {
            iA = (iA + xgg.q(16, iArr3)) & 511;
        }
        iArr3[16] = iA;
    }

    public static void b(int[] iArr, int[] iArr2) {
        int iR = xgg.r(16, iArr, iArr2) + iArr[16];
        if (iR > 511 || (iR == 511 && xgg.m(16, iArr2, f32682a))) {
            iR = (iR + xgg.q(16, iArr2)) & 511;
        }
        iArr2[16] = iR;
    }

    public static int[] c(BigInteger bigInteger) {
        int[] iArrN = xgg.n(521, bigInteger);
        if (xgg.m(17, iArrN, f32682a)) {
            xgg.P(17, iArrN);
        }
        return iArrN;
    }

    public static void d(int[] iArr, int[] iArr2, int[] iArr3) {
        ihg.a(iArr, iArr2, iArr3);
        int i = iArr[16];
        int i2 = iArr2[16];
        iArr3[32] = xgg.w(16, i, iArr2, i2, iArr, iArr3, 16) + (i * i2);
    }

    public static void e(int[] iArr, int[] iArr2) {
        ihg.b(iArr, iArr2);
        int i = iArr[16];
        iArr2[32] = xgg.x(16, i << 1, iArr, 0, iArr2, 16) + (i * i);
    }

    public static void f(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArrI = xgg.i(33);
        d(iArr, iArr2, iArrI);
        h(iArrI, iArr3);
    }

    public static void g(int[] iArr, int[] iArr2) {
        if (xgg.v(17, iArr)) {
            xgg.P(17, iArr2);
        } else {
            xgg.J(17, f32682a, iArr, iArr2);
        }
    }

    public static void h(int[] iArr, int[] iArr2) {
        int i = iArr[32];
        int iA = (xgg.A(16, iArr, 16, 9, i, iArr2, 0) >>> 23) + (i >>> 9) + xgg.e(16, iArr, iArr2);
        if (iA > 511 || (iA == 511 && xgg.m(16, iArr2, f32682a))) {
            iA = (iA + xgg.q(16, iArr2)) & 511;
        }
        iArr2[16] = iA;
    }

    public static void i(int[] iArr) {
        int i = iArr[16];
        int iG = xgg.g(16, i >>> 9, iArr) + (i & 511);
        if (iG > 511 || (iG == 511 && xgg.m(16, iArr, f32682a))) {
            iG = (iG + xgg.q(16, iArr)) & 511;
        }
        iArr[16] = iG;
    }

    public static void j(int[] iArr, int[] iArr2) {
        int[] iArrI = xgg.i(33);
        e(iArr, iArrI);
        h(iArrI, iArr2);
    }

    public static void k(int[] iArr, int i, int[] iArr2) {
        int[] iArrI = xgg.i(33);
        e(iArr, iArrI);
        h(iArrI, iArr2);
        while (true) {
            i--;
            if (i <= 0) {
                return;
            }
            e(iArr2, iArrI);
            h(iArrI, iArr2);
        }
    }

    public static void l(int[] iArr, int[] iArr2, int[] iArr3) {
        int iJ = (xgg.J(16, iArr, iArr2, iArr3) + iArr[16]) - iArr2[16];
        if (iJ < 0) {
            iJ = (iJ + xgg.k(16, iArr3)) & 511;
        }
        iArr3[16] = iJ;
    }

    public static void m(int[] iArr, int[] iArr2) {
        int i = iArr[16];
        iArr2[16] = (xgg.D(16, iArr, i << 23, iArr2) | (i << 1)) & 511;
    }
}
