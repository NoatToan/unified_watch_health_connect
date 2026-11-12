package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class xll {
    public static void a(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr2[1] ^ jArr[1];
    }

    public static void b(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr2[3] ^ jArr[3];
    }

    public static void c(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0] ^ 1;
        jArr2[1] = jArr[1];
    }

    public static long[] d(BigInteger bigInteger) {
        long[] jArrJ = rgg.j(bigInteger);
        l(jArrJ, 0);
        return jArrJ;
    }

    public static void e(long[] jArr, long[] jArr2, long[] jArr3) {
        long j = jArr[0];
        long j2 = ((jArr[1] << 7) ^ (j >>> 57)) & 144115188075855871L;
        long j3 = j & 144115188075855871L;
        long j4 = jArr2[0];
        long j5 = ((jArr2[1] << 7) ^ (j4 >>> 57)) & 144115188075855871L;
        long j6 = 144115188075855871L & j4;
        long[] jArr4 = new long[6];
        f(j3, j6, jArr4, 0);
        f(j2, j5, jArr4, 2);
        f(j3 ^ j2, j6 ^ j5, jArr4, 4);
        long j7 = jArr4[1] ^ jArr4[2];
        long j8 = jArr4[0];
        long j9 = jArr4[3];
        long j10 = (jArr4[4] ^ j8) ^ j7;
        long j11 = j7 ^ (jArr4[5] ^ j9);
        jArr3[0] = j8 ^ (j10 << 57);
        jArr3[1] = (j10 >>> 7) ^ (j11 << 50);
        jArr3[2] = (j11 >>> 14) ^ (j9 << 43);
        jArr3[3] = j9 >>> 21;
    }

    public static void f(long j, long j2, long[] jArr, int i) {
        long j3 = j2 << 1;
        long j4 = j3 ^ j2;
        long j5 = j2 << 2;
        long j6 = j4 << 1;
        long[] jArr2 = {0, j2, j3, j4, j5, j5 ^ j2, j6, j6 ^ j2};
        long j7 = jArr2[((int) j) & 7];
        long j8 = 0;
        int i2 = 48;
        do {
            int i3 = (int) (j >>> i2);
            long j9 = (jArr2[i3 & 7] ^ (jArr2[(i3 >>> 3) & 7] << 3)) ^ (jArr2[(i3 >>> 6) & 7] << 6);
            j7 ^= j9 << i2;
            j8 ^= j9 >>> (-i2);
            i2 -= 9;
        } while (i2 > 0);
        jArr[i] = 144115188075855871L & j7;
        jArr[i + 1] = (((((j & 72198606942111744L) & ((j2 << 7) >> 63)) >>> 8) ^ j8) << 7) ^ (j7 >>> 57);
    }

    public static void g(long[] jArr, long[] jArr2) {
        ued.c(jArr[0], jArr2, 0);
        ued.c(jArr[1], jArr2, 2);
    }

    public static void h(long[] jArr, long[] jArr2) {
        if (rgg.p(jArr)) {
            throw new IllegalStateException();
        }
        long[] jArrD = rgg.d();
        long[] jArrD2 = rgg.d();
        n(jArr, jArrD);
        i(jArrD, jArr, jArrD);
        n(jArrD, jArrD);
        i(jArrD, jArr, jArrD);
        p(jArrD, 3, jArrD2);
        i(jArrD2, jArrD, jArrD2);
        n(jArrD2, jArrD2);
        i(jArrD2, jArr, jArrD2);
        p(jArrD2, 7, jArrD);
        i(jArrD, jArrD2, jArrD);
        p(jArrD, 14, jArrD2);
        i(jArrD2, jArrD, jArrD2);
        p(jArrD2, 28, jArrD);
        i(jArrD, jArrD2, jArrD);
        p(jArrD, 56, jArrD2);
        i(jArrD2, jArrD, jArrD2);
        n(jArrD2, jArr2);
    }

    public static void i(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArrF = rgg.f();
        e(jArr, jArr2, jArrF);
        k(jArrF, jArr3);
    }

    public static void j(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArrF = rgg.f();
        e(jArr, jArr2, jArrF);
        b(jArr3, jArrF, jArr3);
    }

    public static void k(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = j3 ^ ((j4 >>> 40) ^ (j4 >>> 49));
        long j6 = j ^ ((j5 << 15) ^ (j5 << 24));
        long j7 = (j2 ^ ((j4 << 15) ^ (j4 << 24))) ^ ((j5 >>> 40) ^ (j5 >>> 49));
        long j8 = j7 >>> 49;
        jArr2[0] = (j6 ^ j8) ^ (j8 << 9);
        jArr2[1] = 562949953421311L & j7;
    }

    public static void l(long[] jArr, int i) {
        int i2 = i + 1;
        long j = jArr[i2];
        long j2 = j >>> 49;
        jArr[i] = (j2 ^ (j2 << 9)) ^ jArr[i];
        jArr[i2] = j & 562949953421311L;
    }

    public static void m(long[] jArr, long[] jArr2) {
        long jE = ued.e(jArr[0]);
        long jE2 = ued.e(jArr[1]);
        long j = (4294967295L & jE) | (jE2 << 32);
        long j2 = (jE >>> 32) | (jE2 & (-4294967296L));
        jArr2[0] = ((j2 << 57) ^ j) ^ (j2 << 5);
        jArr2[1] = (j2 >>> 59) ^ (j2 >>> 7);
    }

    public static void n(long[] jArr, long[] jArr2) {
        long[] jArrF = rgg.f();
        g(jArr, jArrF);
        k(jArrF, jArr2);
    }

    public static void o(long[] jArr, long[] jArr2) {
        long[] jArrF = rgg.f();
        g(jArr, jArrF);
        b(jArr2, jArrF, jArr2);
    }

    public static void p(long[] jArr, int i, long[] jArr2) {
        long[] jArrF = rgg.f();
        g(jArr, jArrF);
        k(jArrF, jArr2);
        while (true) {
            i--;
            if (i <= 0) {
                return;
            }
            g(jArr2, jArrF);
            k(jArrF, jArr2);
        }
    }
}
