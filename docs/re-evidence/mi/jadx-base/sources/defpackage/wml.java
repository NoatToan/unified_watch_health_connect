package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class wml {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long[] f38134a = {-5270498306774157648L, 5270498306774195053L, 19634136210L};

    public static void a(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr2[2] ^ jArr[2];
    }

    public static void b(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr[4] ^ jArr2[4];
        jArr3[5] = jArr2[5] ^ jArr[5];
    }

    public static void c(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0] ^ 1;
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
    }

    public static long[] d(BigInteger bigInteger) {
        long[] jArrM = wgg.m(bigInteger);
        m(jArrM, 0);
        return jArrM;
    }

    public static void e(long[] jArr) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = jArr[5];
        jArr[0] = j ^ (j2 << 55);
        jArr[1] = (j2 >>> 9) ^ (j3 << 46);
        jArr[2] = (j3 >>> 18) ^ (j4 << 37);
        jArr[3] = (j4 >>> 27) ^ (j5 << 28);
        jArr[4] = (j5 >>> 36) ^ (j6 << 19);
        jArr[5] = j6 >>> 45;
    }

    public static void f(long[] jArr, long[] jArr2, long[] jArr3) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = (jArr[2] << 18) ^ (j2 >>> 46);
        long j4 = ((j2 << 9) ^ (j >>> 55)) & 36028797018963967L;
        long j5 = j & 36028797018963967L;
        long j6 = jArr2[0];
        long j7 = jArr2[1];
        long j8 = (j7 >>> 46) ^ (jArr2[2] << 18);
        long j9 = ((j6 >>> 55) ^ (j7 << 9)) & 36028797018963967L;
        long j10 = j6 & 36028797018963967L;
        long[] jArr4 = new long[10];
        g(j5, j10, jArr4, 0);
        g(j3, j8, jArr4, 2);
        long j11 = (j5 ^ j4) ^ j3;
        long j12 = (j10 ^ j9) ^ j8;
        g(j11, j12, jArr4, 4);
        long j13 = (j4 << 1) ^ (j3 << 2);
        long j14 = (j9 << 1) ^ (j8 << 2);
        g(j5 ^ j13, j10 ^ j14, jArr4, 6);
        g(j11 ^ j13, j12 ^ j14, jArr4, 8);
        long j15 = jArr4[6];
        long j16 = jArr4[8] ^ j15;
        long j17 = jArr4[7];
        long j18 = jArr4[9] ^ j17;
        long j19 = (j16 << 1) ^ j15;
        long j20 = jArr4[0];
        long j21 = jArr4[1];
        long j22 = (j21 ^ j20) ^ jArr4[4];
        long j23 = j21 ^ jArr4[5];
        long j24 = jArr4[2];
        long j25 = ((j19 ^ j20) ^ (j24 << 4)) ^ (j24 << 1);
        long j26 = jArr4[3];
        long j27 = (((j22 ^ ((j16 ^ (j18 << 1)) ^ j17)) ^ (j26 << 4)) ^ (j26 << 1)) ^ (j25 >>> 55);
        long j28 = (j23 ^ j18) ^ (j27 >>> 55);
        long j29 = ((j25 & 36028797018963967L) >>> 1) ^ ((j27 & 1) << 54);
        long j30 = j29 ^ (j29 << 1);
        long j31 = j30 ^ (j30 << 2);
        long j32 = j31 ^ (j31 << 4);
        long j33 = j32 ^ (j32 << 8);
        long j34 = j33 ^ (j33 << 16);
        long j35 = (j34 ^ (j34 << 32)) & 36028797018963967L;
        long j36 = (((j27 & 36028797018963967L) >>> 1) ^ ((j28 & 1) << 54)) ^ (j35 >>> 54);
        long j37 = j36 ^ (j36 << 1);
        long j38 = j37 ^ (j37 << 2);
        long j39 = j38 ^ (j38 << 4);
        long j40 = j39 ^ (j39 << 8);
        long j41 = j40 ^ (j40 << 16);
        long j42 = (j41 ^ (j41 << 32)) & 36028797018963967L;
        long j43 = (j28 >>> 1) ^ (j42 >>> 54);
        long j44 = j43 ^ (j43 << 1);
        long j45 = j44 ^ (j44 << 2);
        long j46 = j45 ^ (j45 << 4);
        long j47 = j46 ^ (j46 << 8);
        long j48 = j47 ^ (j47 << 16);
        long j49 = j48 ^ (j48 << 32);
        jArr3[0] = j20;
        jArr3[1] = (j22 ^ j35) ^ j24;
        jArr3[2] = ((j23 ^ j42) ^ j35) ^ j26;
        jArr3[3] = j49 ^ j42;
        jArr3[4] = jArr4[2] ^ j49;
        jArr3[5] = jArr4[3];
        e(jArr3);
    }

    public static void g(long j, long j2, long[] jArr, int i) {
        long j3 = j2 << 1;
        long j4 = j3 ^ j2;
        long j5 = j2 << 2;
        long j6 = j4 << 1;
        long[] jArr2 = {0, j2, j3, j4, j5, j5 ^ j2, j6, j6 ^ j2};
        long j7 = jArr2[((int) j) & 3];
        long j8 = 0;
        int i2 = 47;
        do {
            int i3 = (int) (j >>> i2);
            long j9 = (jArr2[i3 & 7] ^ (jArr2[(i3 >>> 3) & 7] << 3)) ^ (jArr2[(i3 >>> 6) & 7] << 6);
            j7 ^= j9 << i2;
            j8 ^= j9 >>> (-i2);
            i2 -= 9;
        } while (i2 > 0);
        jArr[i] = 36028797018963967L & j7;
        jArr[i + 1] = (j7 >>> 55) ^ (j8 << 9);
    }

    public static void h(long[] jArr, long[] jArr2) {
        ved.c(jArr[0], jArr2, 0);
        ved.c(jArr[1], jArr2, 2);
        long j = jArr[2];
        jArr2[4] = ved.b((int) j);
        jArr2[5] = ((long) ved.e((int) (j >>> 32))) & 4294967295L;
    }

    public static void i(long[] jArr, long[] jArr2) {
        if (wgg.t(jArr)) {
            throw new IllegalStateException();
        }
        long[] jArrF = wgg.f();
        long[] jArrF2 = wgg.f();
        o(jArr, jArrF);
        q(jArrF, 1, jArrF2);
        j(jArrF, jArrF2, jArrF);
        q(jArrF2, 1, jArrF2);
        j(jArrF, jArrF2, jArrF);
        q(jArrF, 3, jArrF2);
        j(jArrF, jArrF2, jArrF);
        q(jArrF2, 3, jArrF2);
        j(jArrF, jArrF2, jArrF);
        q(jArrF, 9, jArrF2);
        j(jArrF, jArrF2, jArrF);
        q(jArrF2, 9, jArrF2);
        j(jArrF, jArrF2, jArrF);
        q(jArrF, 27, jArrF2);
        j(jArrF, jArrF2, jArrF);
        q(jArrF2, 27, jArrF2);
        j(jArrF, jArrF2, jArrF);
        q(jArrF, 81, jArrF2);
        j(jArrF, jArrF2, jArr2);
    }

    public static void j(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArrH = wgg.h();
        f(jArr, jArr2, jArrH);
        l(jArrH, jArr3);
    }

    public static void k(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArrH = wgg.h();
        f(jArr, jArr2, jArrH);
        b(jArr3, jArrH, jArr3);
    }

    public static void l(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = jArr[5];
        long j7 = j4 ^ ((((j6 >>> 35) ^ (j6 >>> 32)) ^ (j6 >>> 29)) ^ (j6 >>> 28));
        long j8 = (j3 ^ ((((j6 << 29) ^ (j6 << 32)) ^ (j6 << 35)) ^ (j6 << 36))) ^ ((j5 >>> 28) ^ (((j5 >>> 35) ^ (j5 >>> 32)) ^ (j5 >>> 29)));
        long j9 = j ^ ((((j7 << 29) ^ (j7 << 32)) ^ (j7 << 35)) ^ (j7 << 36));
        long j10 = (j2 ^ ((((j5 << 29) ^ (j5 << 32)) ^ (j5 << 35)) ^ (j5 << 36))) ^ ((j7 >>> 28) ^ (((j7 >>> 35) ^ (j7 >>> 32)) ^ (j7 >>> 29)));
        long j11 = j8 >>> 35;
        jArr2[0] = (((j9 ^ j11) ^ (j11 << 3)) ^ (j11 << 6)) ^ (j11 << 7);
        jArr2[1] = j10;
        jArr2[2] = 34359738367L & j8;
    }

    public static void m(long[] jArr, int i) {
        int i2 = i + 2;
        long j = jArr[i2];
        long j2 = j >>> 35;
        jArr[i] = ((j2 << 7) ^ (((j2 << 3) ^ j2) ^ (j2 << 6))) ^ jArr[i];
        jArr[i2] = j & 34359738367L;
    }

    public static void n(long[] jArr, long[] jArr2) {
        long[] jArrF = wgg.f();
        long jF = ved.f(jArr[0]);
        long jF2 = ved.f(jArr[1]);
        long j = (jF & 4294967295L) | (jF2 << 32);
        jArrF[0] = (jF >>> 32) | (jF2 & (-4294967296L));
        long jF3 = ved.f(jArr[2]);
        jArrF[1] = jF3 >>> 32;
        j(jArrF, f38134a, jArr2);
        jArr2[0] = jArr2[0] ^ j;
        jArr2[1] = jArr2[1] ^ (jF3 & 4294967295L);
    }

    public static void o(long[] jArr, long[] jArr2) {
        long[] jArrH = wgg.h();
        h(jArr, jArrH);
        l(jArrH, jArr2);
    }

    public static void p(long[] jArr, long[] jArr2) {
        long[] jArrH = wgg.h();
        h(jArr, jArrH);
        b(jArr2, jArrH, jArr2);
    }

    public static void q(long[] jArr, int i, long[] jArr2) {
        long[] jArrH = wgg.h();
        h(jArr, jArrH);
        while (true) {
            l(jArrH, jArr2);
            i--;
            if (i <= 0) {
                return;
            } else {
                h(jArr2, jArrH);
            }
        }
    }
}
