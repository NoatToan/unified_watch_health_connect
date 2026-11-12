package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class sll {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f33766a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 511};

    public static void a(int[] iArr, int[] iArr2, int[] iArr3) {
        int iA = mhg.a(16, iArr, iArr2, iArr3) + iArr[16] + iArr2[16];
        if (iA > 511 || (iA == 511 && mhg.m(16, iArr3, f33766a))) {
            iA = (iA + mhg.q(16, iArr3)) & 511;
        }
        iArr3[16] = iA;
    }

    public static void b(int[] iArr, int[] iArr2) {
        int iR = mhg.r(16, iArr, iArr2) + iArr[16];
        if (iR > 511 || (iR == 511 && mhg.m(16, iArr2, f33766a))) {
            iR = (iR + mhg.q(16, iArr2)) & 511;
        }
        iArr2[16] = iR;
    }

    public static int[] c(BigInteger bigInteger) {
        int[] iArrN = mhg.n(521, bigInteger);
        if (mhg.m(17, iArrN, f33766a)) {
            mhg.P(17, iArrN);
        }
        return iArrN;
    }

    public static void d(int[] iArr, int[] iArr2, int[] iArr3) {
        jhg.a(iArr, iArr2, iArr3);
        int i = iArr[16];
        int i2 = iArr2[16];
        iArr3[32] = mhg.w(16, i, iArr2, i2, iArr, iArr3, 16) + (i * i2);
    }

    public static void e(int[] iArr, int[] iArr2) {
        jhg.b(iArr, iArr2);
        int i = iArr[16];
        iArr2[32] = mhg.x(16, i << 1, iArr, 0, iArr2, 16) + (i * i);
    }

    public static void f(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArrI = mhg.i(33);
        d(iArr, iArr2, iArrI);
        h(iArrI, iArr3);
    }

    public static void g(int[] iArr, int[] iArr2) {
        if (mhg.v(17, iArr)) {
            mhg.P(17, iArr2);
        } else {
            mhg.J(17, f33766a, iArr, iArr2);
        }
    }

    public static void h(int[] iArr, int[] iArr2) {
        int i = iArr[32];
        int iA = (mhg.A(16, iArr, 16, 9, i, iArr2, 0) >>> 23) + (i >>> 9) + mhg.e(16, iArr, iArr2);
        if (iA > 511 || (iA == 511 && mhg.m(16, iArr2, f33766a))) {
            iA = (iA + mhg.q(16, iArr2)) & 511;
        }
        iArr2[16] = iA;
    }

    public static void i(int[] iArr) {
        int i = iArr[16];
        int iG = mhg.g(16, i >>> 9, iArr) + (i & 511);
        if (iG > 511 || (iG == 511 && mhg.m(16, iArr, f33766a))) {
            iG = (iG + mhg.q(16, iArr)) & 511;
        }
        iArr[16] = iG;
    }

    public static void j(int[] iArr, int[] iArr2) {
        int[] iArrI = mhg.i(33);
        e(iArr, iArrI);
        h(iArrI, iArr2);
    }

    public static void k(int[] iArr, int i, int[] iArr2) {
        int[] iArrI = mhg.i(33);
        e(iArr, iArrI);
        while (true) {
            h(iArrI, iArr2);
            i--;
            if (i <= 0) {
                return;
            } else {
                e(iArr2, iArrI);
            }
        }
    }

    public static void l(int[] iArr, int[] iArr2, int[] iArr3) {
        int iJ = (mhg.J(16, iArr, iArr2, iArr3) + iArr[16]) - iArr2[16];
        if (iJ < 0) {
            iJ = (iJ + mhg.k(16, iArr3)) & 511;
        }
        iArr3[16] = iJ;
    }

    public static void m(int[] iArr, int[] iArr2) {
        int i = iArr[16];
        iArr2[16] = (mhg.D(16, iArr, i << 23, iArr2) | (i << 1)) & 511;
    }
}
