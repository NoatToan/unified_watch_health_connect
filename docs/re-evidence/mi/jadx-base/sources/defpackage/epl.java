package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class epl {
    public static void a(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr[4] ^ jArr2[4];
        jArr3[5] = jArr[5] ^ jArr2[5];
        jArr3[6] = jArr2[6] ^ jArr[6];
    }

    public static void b(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i = 0; i < 13; i++) {
            jArr3[i] = jArr[i] ^ jArr2[i];
        }
    }

    public static void c(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0] ^ 1;
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
        jArr2[3] = jArr[3];
        jArr2[4] = jArr[4];
        jArr2[5] = jArr[5];
        jArr2[6] = jArr[6];
    }

    public static long[] d(BigInteger bigInteger) {
        long[] jArrD = hhg.d(bigInteger);
        n(jArrD, 0);
        return jArrD;
    }

    public static void e(long[] jArr) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = jArr[5];
        long j7 = jArr[6];
        long j8 = jArr[7];
        long j9 = jArr[8];
        long j10 = jArr[9];
        long j11 = jArr[10];
        long j12 = jArr[11];
        long j13 = jArr[12];
        long j14 = jArr[13];
        jArr[0] = j ^ (j2 << 59);
        jArr[1] = (j2 >>> 5) ^ (j3 << 54);
        jArr[2] = (j3 >>> 10) ^ (j4 << 49);
        jArr[3] = (j4 >>> 15) ^ (j5 << 44);
        jArr[4] = (j5 >>> 20) ^ (j6 << 39);
        jArr[5] = (j6 >>> 25) ^ (j7 << 34);
        jArr[6] = (j7 >>> 30) ^ (j8 << 29);
        jArr[7] = (j8 >>> 35) ^ (j9 << 24);
        jArr[8] = (j9 >>> 40) ^ (j10 << 19);
        jArr[9] = (j10 >>> 45) ^ (j11 << 14);
        jArr[10] = (j11 >>> 50) ^ (j12 << 9);
        jArr[11] = ((j12 >>> 55) ^ (j13 << 4)) ^ (j14 << 63);
        jArr[12] = (j13 >>> 60) ^ (j14 >>> 1);
        jArr[13] = 0;
    }

    public static void f(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = jArr[5];
        long j7 = jArr[6];
        jArr2[0] = j & 576460752303423487L;
        jArr2[1] = ((j >>> 59) ^ (j2 << 5)) & 576460752303423487L;
        jArr2[2] = ((j2 >>> 54) ^ (j3 << 10)) & 576460752303423487L;
        jArr2[3] = ((j3 >>> 49) ^ (j4 << 15)) & 576460752303423487L;
        jArr2[4] = ((j4 >>> 44) ^ (j5 << 20)) & 576460752303423487L;
        jArr2[5] = ((j5 >>> 39) ^ (j6 << 25)) & 576460752303423487L;
        jArr2[6] = (j6 >>> 34) ^ (j7 << 30);
    }

    public static void g(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[7];
        long[] jArr5 = new long[7];
        f(jArr, jArr4);
        f(jArr2, jArr5);
        for (int i = 0; i < 7; i++) {
            h(jArr4, jArr5[i], jArr3, i);
        }
        e(jArr3);
    }

    public static void h(long[] jArr, long j, long[] jArr2, int i) {
        long j2 = j << 1;
        long j3 = j2 ^ j;
        long j4 = j << 2;
        long j5 = j3 << 1;
        long[] jArr3 = {0, j, j2, j3, j4, j4 ^ j, j5, j5 ^ j};
        for (int i2 = 0; i2 < 7; i2++) {
            long j6 = jArr[i2];
            int i3 = (int) j6;
            long j7 = jArr3[i3 & 7] ^ (jArr3[(i3 >>> 3) & 7] << 3);
            long j8 = 0;
            int i4 = 54;
            do {
                int i5 = (int) (j6 >>> i4);
                long j9 = jArr3[i5 & 7] ^ (jArr3[(i5 >>> 3) & 7] << 3);
                j7 ^= j9 << i4;
                j8 ^= j9 >>> (-i4);
                i4 -= 6;
            } while (i4 > 0);
            int i6 = i + i2;
            jArr2[i6] = jArr2[i6] ^ (576460752303423487L & j7);
            int i7 = i6 + 1;
            jArr2[i7] = jArr2[i7] ^ ((j7 >>> 59) ^ (j8 << 5));
        }
    }

    public static void i(long[] jArr, long[] jArr2) {
        for (int i = 0; i < 6; i++) {
            ved.c(jArr[i], jArr2, i << 1);
        }
        jArr2[12] = ved.b((int) jArr[6]);
    }

    public static void j(long[] jArr, long[] jArr2) {
        if (hhg.f(jArr)) {
            throw new IllegalStateException();
        }
        long[] jArrA = hhg.a();
        long[] jArrA2 = hhg.a();
        long[] jArrA3 = hhg.a();
        p(jArr, jArrA);
        r(jArrA, 1, jArrA2);
        k(jArrA, jArrA2, jArrA);
        r(jArrA2, 1, jArrA2);
        k(jArrA, jArrA2, jArrA);
        r(jArrA, 3, jArrA2);
        k(jArrA, jArrA2, jArrA);
        r(jArrA, 6, jArrA2);
        k(jArrA, jArrA2, jArrA);
        r(jArrA, 12, jArrA2);
        k(jArrA, jArrA2, jArrA3);
        r(jArrA3, 24, jArrA);
        r(jArrA, 24, jArrA2);
        k(jArrA, jArrA2, jArrA);
        r(jArrA, 48, jArrA2);
        k(jArrA, jArrA2, jArrA);
        r(jArrA, 96, jArrA2);
        k(jArrA, jArrA2, jArrA);
        r(jArrA, 192, jArrA2);
        k(jArrA, jArrA2, jArrA);
        k(jArrA, jArrA3, jArr2);
    }

    public static void k(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArrB = hhg.b();
        g(jArr, jArr2, jArrB);
        m(jArrB, jArr3);
    }

    public static void l(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArrB = hhg.b();
        g(jArr, jArr2, jArrB);
        b(jArr3, jArrB, jArr3);
    }

    public static void m(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = jArr[5];
        long j7 = jArr[6];
        long j8 = jArr[7];
        long j9 = jArr[12];
        long j10 = j6 ^ (j9 << 39);
        long j11 = j7 ^ ((j9 >>> 25) ^ (j9 << 62));
        long j12 = j8 ^ (j9 >>> 2);
        long j13 = jArr[11];
        long j14 = j5 ^ (j13 << 39);
        long j15 = j10 ^ ((j13 >>> 25) ^ (j13 << 62));
        long j16 = j11 ^ (j13 >>> 2);
        long j17 = jArr[10];
        long j18 = j4 ^ (j17 << 39);
        long j19 = j14 ^ ((j17 >>> 25) ^ (j17 << 62));
        long j20 = j15 ^ (j17 >>> 2);
        long j21 = jArr[9];
        long j22 = j3 ^ (j21 << 39);
        long j23 = j18 ^ ((j21 >>> 25) ^ (j21 << 62));
        long j24 = j19 ^ (j21 >>> 2);
        long j25 = jArr[8];
        long j26 = j ^ (j12 << 39);
        long j27 = (j2 ^ (j25 << 39)) ^ ((j12 >>> 25) ^ (j12 << 62));
        long j28 = (j22 ^ ((j25 >>> 25) ^ (j25 << 62))) ^ (j12 >>> 2);
        long j29 = j16 >>> 25;
        jArr2[0] = j26 ^ j29;
        jArr2[1] = (j29 << 23) ^ j27;
        jArr2[2] = j28;
        jArr2[3] = j23 ^ (j25 >>> 2);
        jArr2[4] = j24;
        jArr2[5] = j20;
        jArr2[6] = j16 & 33554431;
    }

    public static void n(long[] jArr, int i) {
        int i2 = i + 6;
        long j = jArr[i2];
        long j2 = j >>> 25;
        jArr[i] = jArr[i] ^ j2;
        int i3 = i + 1;
        jArr[i3] = (j2 << 23) ^ jArr[i3];
        jArr[i2] = j & 33554431;
    }

    public static void o(long[] jArr, long[] jArr2) {
        long jF = ved.f(jArr[0]);
        long jF2 = ved.f(jArr[1]);
        long j = (jF & 4294967295L) | (jF2 << 32);
        long j2 = (jF >>> 32) | (jF2 & (-4294967296L));
        long jF3 = ved.f(jArr[2]);
        long jF4 = ved.f(jArr[3]);
        long j3 = (jF3 & 4294967295L) | (jF4 << 32);
        long j4 = (jF3 >>> 32) | (jF4 & (-4294967296L));
        long jF5 = ved.f(jArr[4]);
        long jF6 = ved.f(jArr[5]);
        long j5 = (jF5 >>> 32) | (jF6 & (-4294967296L));
        long jF7 = ved.f(jArr[6]);
        long j6 = jF7 >>> 32;
        jArr2[0] = j ^ (j2 << 44);
        jArr2[1] = (j3 ^ (j4 << 44)) ^ (j2 >>> 20);
        jArr2[2] = (((jF5 & 4294967295L) | (jF6 << 32)) ^ (j5 << 44)) ^ (j4 >>> 20);
        jArr2[3] = (((j6 << 44) ^ (jF7 & 4294967295L)) ^ (j5 >>> 20)) ^ (j2 << 13);
        jArr2[4] = (j2 >>> 51) ^ ((jF7 >>> 52) ^ (j4 << 13));
        jArr2[5] = (j5 << 13) ^ (j4 >>> 51);
        jArr2[6] = (j6 << 13) ^ (j5 >>> 51);
    }

    public static void p(long[] jArr, long[] jArr2) {
        long[] jArrJ = mhg.j(13);
        i(jArr, jArrJ);
        m(jArrJ, jArr2);
    }

    public static void q(long[] jArr, long[] jArr2) {
        long[] jArrJ = mhg.j(13);
        i(jArr, jArrJ);
        b(jArr2, jArrJ, jArr2);
    }

    public static void r(long[] jArr, int i, long[] jArr2) {
        long[] jArrJ = mhg.j(13);
        i(jArr, jArrJ);
        while (true) {
            m(jArrJ, jArr2);
            i--;
            if (i <= 0) {
                return;
            } else {
                i(jArr2, jArrJ);
            }
        }
    }
}
