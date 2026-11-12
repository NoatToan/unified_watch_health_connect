package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class sol {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long[] f33843a = {878416384462358536L, 3513665537849438403L, -9076969306111048948L, 585610922974906400L, 34087042};

    public static void a(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr2[4] ^ jArr[4];
    }

    public static void b(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr[4] ^ jArr2[4];
        jArr3[5] = jArr[5] ^ jArr2[5];
        jArr3[6] = jArr[6] ^ jArr2[6];
        jArr3[7] = jArr[7] ^ jArr2[7];
        jArr3[8] = jArr2[8] ^ jArr[8];
    }

    public static void c(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0] ^ 1;
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
        jArr2[3] = jArr[3];
        jArr2[4] = jArr[4];
    }

    public static long[] d(BigInteger bigInteger) {
        long[] jArrD = dhg.d(bigInteger);
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
        jArr[0] = j ^ (j2 << 57);
        jArr[1] = (j2 >>> 7) ^ (j3 << 50);
        jArr[2] = (j3 >>> 14) ^ (j4 << 43);
        jArr[3] = (j4 >>> 21) ^ (j5 << 36);
        jArr[4] = (j5 >>> 28) ^ (j6 << 29);
        jArr[5] = (j6 >>> 35) ^ (j7 << 22);
        jArr[6] = (j7 >>> 42) ^ (j8 << 15);
        jArr[7] = (j8 >>> 49) ^ (j9 << 8);
        jArr[8] = (j9 >>> 56) ^ (j10 << 1);
        jArr[9] = j10 >>> 63;
    }

    public static void f(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        jArr2[0] = j & 144115188075855871L;
        jArr2[1] = ((j >>> 57) ^ (j2 << 7)) & 144115188075855871L;
        jArr2[2] = ((j2 >>> 50) ^ (j3 << 14)) & 144115188075855871L;
        jArr2[3] = ((j3 >>> 43) ^ (j4 << 21)) & 144115188075855871L;
        jArr2[4] = (j4 >>> 36) ^ (j5 << 28);
    }

    public static void g(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[5];
        long[] jArr5 = new long[5];
        f(jArr, jArr4);
        f(jArr2, jArr5);
        long[] jArr6 = new long[26];
        h(jArr4[0], jArr5[0], jArr6, 0);
        h(jArr4[1], jArr5[1], jArr6, 2);
        h(jArr4[2], jArr5[2], jArr6, 4);
        h(jArr4[3], jArr5[3], jArr6, 6);
        h(jArr4[4], jArr5[4], jArr6, 8);
        long j = jArr4[0];
        long j2 = j ^ jArr4[1];
        long j3 = jArr5[0];
        long j4 = j3 ^ jArr5[1];
        long j5 = jArr4[2];
        long j6 = j ^ j5;
        long j7 = jArr5[2];
        long j8 = j3 ^ j7;
        long j9 = jArr4[4];
        long j10 = j5 ^ j9;
        long j11 = jArr5[4];
        long j12 = j7 ^ j11;
        long j13 = jArr4[3];
        long j14 = j13 ^ j9;
        long j15 = jArr5[3];
        long j16 = j15 ^ j11;
        h(j6 ^ j13, j8 ^ j15, jArr6, 18);
        h(j10 ^ jArr4[1], j12 ^ jArr5[1], jArr6, 20);
        long j17 = j2 ^ j14;
        long j18 = j4 ^ j16;
        long j19 = j17 ^ jArr4[2];
        long j20 = jArr5[2] ^ j18;
        h(j17, j18, jArr6, 22);
        h(j19, j20, jArr6, 24);
        h(j2, j4, jArr6, 10);
        h(j6, j8, jArr6, 12);
        h(j10, j12, jArr6, 14);
        h(j14, j16, jArr6, 16);
        jArr3[0] = jArr6[0];
        jArr3[9] = jArr6[9];
        long j21 = jArr6[0];
        long j22 = jArr6[1] ^ j21;
        long j23 = jArr6[2] ^ j22;
        long j24 = jArr6[10] ^ j23;
        jArr3[1] = j24;
        long j25 = jArr6[3] ^ jArr6[4];
        long j26 = j23 ^ (j25 ^ (jArr6[11] ^ jArr6[12]));
        jArr3[2] = j26;
        long j27 = j22 ^ j25;
        long j28 = jArr6[5] ^ jArr6[6];
        long j29 = jArr6[8];
        long j30 = (j27 ^ j28) ^ j29;
        long j31 = jArr6[13] ^ jArr6[14];
        long j32 = jArr6[18];
        long j33 = jArr6[22];
        long j34 = jArr6[24];
        jArr3[3] = (j30 ^ j31) ^ ((j32 ^ j33) ^ j34);
        long j35 = jArr6[7] ^ j29;
        long j36 = jArr6[9];
        long j37 = j35 ^ j36;
        long j38 = j37 ^ jArr6[17];
        jArr3[8] = j38;
        long j39 = (j37 ^ j28) ^ (jArr6[15] ^ jArr6[16]);
        jArr3[7] = j39;
        long j40 = j39 ^ j24;
        long j41 = jArr6[19] ^ jArr6[20];
        long j42 = jArr6[25];
        long j43 = j42 ^ j34;
        long j44 = jArr6[23];
        long j45 = j41 ^ j43;
        jArr3[4] = (j45 ^ (j32 ^ j44)) ^ j40;
        long j46 = jArr6[21];
        jArr3[5] = ((j26 ^ j38) ^ j45) ^ (j46 ^ j33);
        jArr3[6] = (((((j30 ^ j21) ^ j36) ^ j31) ^ j46) ^ j44) ^ j42;
        e(jArr3);
    }

    public static void h(long j, long j2, long[] jArr, int i) {
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

    public static void i(long[] jArr, long[] jArr2) {
        for (int i = 0; i < 4; i++) {
            ved.c(jArr[i], jArr2, i << 1);
        }
        jArr2[8] = ved.b((int) jArr[4]);
    }

    public static void j(long[] jArr, long[] jArr2) {
        if (dhg.f(jArr)) {
            throw new IllegalStateException();
        }
        long[] jArrA = dhg.a();
        long[] jArrA2 = dhg.a();
        p(jArr, jArrA);
        k(jArrA, jArr, jArrA);
        r(jArrA, 2, jArrA2);
        k(jArrA2, jArrA, jArrA2);
        r(jArrA2, 4, jArrA);
        k(jArrA, jArrA2, jArrA);
        r(jArrA, 8, jArrA2);
        k(jArrA2, jArrA, jArrA2);
        p(jArrA2, jArrA2);
        k(jArrA2, jArr, jArrA2);
        r(jArrA2, 17, jArrA);
        k(jArrA, jArrA2, jArrA);
        p(jArrA, jArrA);
        k(jArrA, jArr, jArrA);
        r(jArrA, 35, jArrA2);
        k(jArrA2, jArrA, jArrA2);
        r(jArrA2, 70, jArrA);
        k(jArrA, jArrA2, jArrA);
        p(jArrA, jArrA);
        k(jArrA, jArr, jArrA);
        r(jArrA, 141, jArrA2);
        k(jArrA2, jArrA, jArrA2);
        p(jArrA2, jArr2);
    }

    public static void k(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArrB = dhg.b();
        g(jArr, jArr2, jArrB);
        m(jArrB, jArr3);
    }

    public static void l(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArrB = dhg.b();
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
        long j9 = jArr[8];
        long j10 = j5 ^ ((((j9 >>> 27) ^ (j9 >>> 22)) ^ (j9 >>> 20)) ^ (j9 >>> 15));
        long j11 = j ^ ((((j6 << 37) ^ (j6 << 42)) ^ (j6 << 44)) ^ (j6 << 49));
        long j12 = (j2 ^ ((((j7 << 37) ^ (j7 << 42)) ^ (j7 << 44)) ^ (j7 << 49))) ^ ((((j6 >>> 27) ^ (j6 >>> 22)) ^ (j6 >>> 20)) ^ (j6 >>> 15));
        long j13 = j10 >>> 27;
        jArr2[0] = (((j11 ^ j13) ^ (j13 << 5)) ^ (j13 << 7)) ^ (j13 << 12);
        jArr2[1] = j12;
        jArr2[2] = (j3 ^ ((((j8 << 37) ^ (j8 << 42)) ^ (j8 << 44)) ^ (j8 << 49))) ^ ((((j7 >>> 27) ^ (j7 >>> 22)) ^ (j7 >>> 20)) ^ (j7 >>> 15));
        jArr2[3] = (j4 ^ ((((j9 << 37) ^ (j9 << 42)) ^ (j9 << 44)) ^ (j9 << 49))) ^ ((((j8 >>> 27) ^ (j8 >>> 22)) ^ (j8 >>> 20)) ^ (j8 >>> 15));
        jArr2[4] = 134217727 & j10;
    }

    public static void n(long[] jArr, int i) {
        int i2 = i + 4;
        long j = jArr[i2];
        long j2 = j >>> 27;
        jArr[i] = ((j2 << 12) ^ (((j2 << 5) ^ j2) ^ (j2 << 7))) ^ jArr[i];
        jArr[i2] = j & 134217727;
    }

    public static void o(long[] jArr, long[] jArr2) {
        long[] jArrA = dhg.a();
        long jF = ved.f(jArr[0]);
        long jF2 = ved.f(jArr[1]);
        long j = (jF & 4294967295L) | (jF2 << 32);
        jArrA[0] = (jF >>> 32) | (jF2 & (-4294967296L));
        long jF3 = ved.f(jArr[2]);
        long jF4 = ved.f(jArr[3]);
        long j2 = (jF3 & 4294967295L) | (jF4 << 32);
        jArrA[1] = (jF3 >>> 32) | ((-4294967296L) & jF4);
        long jF5 = ved.f(jArr[4]);
        jArrA[2] = jF5 >>> 32;
        k(jArrA, f33843a, jArr2);
        jArr2[0] = jArr2[0] ^ j;
        jArr2[1] = jArr2[1] ^ j2;
        jArr2[2] = jArr2[2] ^ (4294967295L & jF5);
    }

    public static void p(long[] jArr, long[] jArr2) {
        long[] jArrJ = mhg.j(9);
        i(jArr, jArrJ);
        m(jArrJ, jArr2);
    }

    public static void q(long[] jArr, long[] jArr2) {
        long[] jArrJ = mhg.j(9);
        i(jArr, jArrJ);
        b(jArr2, jArrJ, jArr2);
    }

    public static void r(long[] jArr, int i, long[] jArr2) {
        long[] jArrJ = mhg.j(9);
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
