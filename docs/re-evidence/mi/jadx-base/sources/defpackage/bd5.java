package defpackage;

import java.math.BigInteger;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* JADX INFO: loaded from: classes3.dex */
public class bd5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f4077a = {-19, -1, -1, -1, -1, -1, -1, Integer.MAX_VALUE};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f4078b = {361, 0, 0, 0, 0, 0, 0, 0, -19, -1, -1, -1, -1, -1, -1, LockFreeTaskQueueCore.MAX_CAPACITY_MASK};

    public static void a(int[] iArr, int[] iArr2, int[] iArr3) {
        ahg.a(iArr, iArr2, iArr3);
        if (ahg.q(iArr3, f4077a)) {
            m(iArr3);
        }
    }

    public static void b(int[] iArr, int[] iArr2) {
        xgg.r(8, iArr, iArr2);
        if (ahg.q(iArr2, f4077a)) {
            m(iArr2);
        }
    }

    public static int c(int[] iArr) {
        long j = (((long) iArr[0]) & 4294967295L) - 19;
        iArr[0] = (int) j;
        long jL = j >> 32;
        if (jL != 0) {
            jL = xgg.l(7, iArr, 1);
        }
        long j2 = jL + (4294967295L & ((long) iArr[7])) + 2147483648L;
        iArr[7] = (int) j2;
        return (int) (j2 >> 32);
    }

    public static int[] d(BigInteger bigInteger) {
        int[] iArrM = ahg.m(bigInteger);
        while (true) {
            int[] iArr = f4077a;
            if (!ahg.q(iArrM, iArr)) {
                return iArrM;
            }
            ahg.G(iArr, iArrM);
        }
    }

    public static void e(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArrH = ahg.h();
        ahg.w(iArr, iArr2, iArrH);
        h(iArrH, iArr3);
    }

    public static void f(int[] iArr, int[] iArr2, int[] iArr3) {
        ahg.A(iArr, iArr2, iArr3);
        if (xgg.p(16, iArr3, f4078b)) {
            l(iArr3);
        }
    }

    public static void g(int[] iArr, int[] iArr2) {
        if (ahg.t(iArr)) {
            ahg.J(iArr2);
        } else {
            ahg.F(f4077a, iArr, iArr2);
        }
    }

    public static void h(int[] iArr, int[] iArr2) {
        int i = iArr[7];
        xgg.C(8, iArr, 8, i, iArr2, 0);
        int iB = ahg.B(19, iArr, iArr2) << 1;
        int i2 = iArr2[7];
        iArr2[7] = (i2 & Integer.MAX_VALUE) + xgg.g(7, (iB + ((i2 >>> 31) - (i >>> 31))) * 19, iArr2);
        if (ahg.q(iArr2, f4077a)) {
            m(iArr2);
        }
    }

    public static void i(int i, int[] iArr) {
        int i2 = iArr[7];
        iArr[7] = (i2 & Integer.MAX_VALUE) + xgg.g(7, ((i << 1) | (i2 >>> 31)) * 19, iArr);
        if (ahg.q(iArr, f4077a)) {
            m(iArr);
        }
    }

    public static void j(int[] iArr, int[] iArr2) {
        int[] iArrH = ahg.h();
        ahg.D(iArr, iArrH);
        h(iArrH, iArr2);
    }

    public static void k(int[] iArr, int i, int[] iArr2) {
        int[] iArrH = ahg.h();
        ahg.D(iArr, iArrH);
        h(iArrH, iArr2);
        while (true) {
            i--;
            if (i <= 0) {
                return;
            }
            ahg.D(iArr2, iArrH);
            h(iArrH, iArr2);
        }
    }

    public static int l(int[] iArr) {
        long j = ((long) iArr[0]) & 4294967295L;
        int[] iArr2 = f4078b;
        long j2 = j - (((long) iArr2[0]) & 4294967295L);
        iArr[0] = (int) j2;
        long jL = j2 >> 32;
        if (jL != 0) {
            jL = xgg.l(8, iArr, 1);
        }
        long j3 = jL + (((long) iArr[8]) & 4294967295L) + 19;
        iArr[8] = (int) j3;
        long jS = j3 >> 32;
        if (jS != 0) {
            jS = xgg.s(15, iArr, 9);
        }
        long j4 = jS + ((((long) iArr[15]) & 4294967295L) - (4294967295L & ((long) (iArr2[15] + 1))));
        iArr[15] = (int) j4;
        return (int) (j4 >> 32);
    }

    public static int m(int[] iArr) {
        long j = (((long) iArr[0]) & 4294967295L) + 19;
        iArr[0] = (int) j;
        long jS = j >> 32;
        if (jS != 0) {
            jS = xgg.s(7, iArr, 1);
        }
        long j2 = jS + ((4294967295L & ((long) iArr[7])) - 2147483648L);
        iArr[7] = (int) j2;
        return (int) (j2 >> 32);
    }

    public static void n(int[] iArr, int[] iArr2, int[] iArr3) {
        if (ahg.F(iArr, iArr2, iArr3) != 0) {
            c(iArr3);
        }
    }

    public static void o(int[] iArr, int[] iArr2) {
        xgg.D(8, iArr, 0, iArr2);
        if (ahg.q(iArr2, f4077a)) {
            m(iArr2);
        }
    }
}
