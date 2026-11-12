package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class mnl {
    public static void a(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr2[3] ^ jArr[3];
    }

    public static void b(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr[4] ^ jArr2[4];
        jArr3[5] = jArr[5] ^ jArr2[5];
        jArr3[6] = jArr2[6] ^ jArr[6];
    }

    public static void c(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0] ^ 1;
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
        jArr2[3] = jArr[3];
    }

    public static long[] d(BigInteger bigInteger) {
        long[] jArrN = bhg.n(bigInteger);
        n(jArrN, 0);
        return jArrN;
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
        jArr[0] = j ^ (j2 << 49);
        jArr[1] = (j2 >>> 15) ^ (j3 << 34);
        jArr[2] = (j3 >>> 30) ^ (j4 << 19);
        jArr[3] = ((j4 >>> 45) ^ (j5 << 4)) ^ (j6 << 53);
        jArr[4] = ((j5 >>> 60) ^ (j7 << 38)) ^ (j6 >>> 11);
        jArr[5] = (j7 >>> 26) ^ (j8 << 23);
        jArr[6] = j8 >>> 41;
        jArr[7] = 0;
    }

    public static void f(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        jArr2[0] = j & 562949953421311L;
        jArr2[1] = ((j >>> 49) ^ (j2 << 15)) & 562949953421311L;
        jArr2[2] = ((j2 >>> 34) ^ (j3 << 30)) & 562949953421311L;
        jArr2[3] = (j3 >>> 19) ^ (j4 << 45);
    }

    public static void g(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[4];
        long[] jArr5 = new long[4];
        f(jArr, jArr4);
        f(jArr2, jArr5);
        h(jArr4[0], jArr5[0], jArr3, 0);
        h(jArr4[1], jArr5[1], jArr3, 1);
        h(jArr4[2], jArr5[2], jArr3, 2);
        h(jArr4[3], jArr5[3], jArr3, 3);
        for (int i = 5; i > 0; i--) {
            jArr3[i] = jArr3[i] ^ jArr3[i - 1];
        }
        h(jArr4[0] ^ jArr4[1], jArr5[0] ^ jArr5[1], jArr3, 1);
        h(jArr4[2] ^ jArr4[3], jArr5[2] ^ jArr5[3], jArr3, 3);
        for (int i2 = 7; i2 > 1; i2--) {
            jArr3[i2] = jArr3[i2] ^ jArr3[i2 - 2];
        }
        long j = jArr4[0] ^ jArr4[2];
        long j2 = jArr4[1] ^ jArr4[3];
        long j3 = jArr5[0] ^ jArr5[2];
        long j4 = jArr5[1] ^ jArr5[3];
        h(j ^ j2, j3 ^ j4, jArr3, 3);
        long[] jArr6 = new long[3];
        h(j, j3, jArr6, 0);
        h(j2, j4, jArr6, 1);
        long j5 = jArr6[0];
        long j6 = jArr6[1];
        long j7 = jArr6[2];
        jArr3[2] = jArr3[2] ^ j5;
        jArr3[3] = (j5 ^ j6) ^ jArr3[3];
        jArr3[4] = jArr3[4] ^ (j7 ^ j6);
        jArr3[5] = jArr3[5] ^ j7;
        e(jArr3);
    }

    public static void h(long j, long j2, long[] jArr, int i) {
        long j3 = j2 << 1;
        long j4 = j3 ^ j2;
        long j5 = j2 << 2;
        long j6 = j4 << 1;
        long[] jArr2 = {0, j2, j3, j4, j5, j5 ^ j2, j6, j6 ^ j2};
        int i2 = (int) j;
        long j7 = (jArr2[(i2 >>> 3) & 7] << 3) ^ jArr2[i2 & 7];
        long j8 = 0;
        int i3 = 36;
        do {
            int i4 = (int) (j >>> i3);
            long j9 = (((jArr2[i4 & 7] ^ (jArr2[(i4 >>> 3) & 7] << 3)) ^ (jArr2[(i4 >>> 6) & 7] << 6)) ^ (jArr2[(i4 >>> 9) & 7] << 9)) ^ (jArr2[(i4 >>> 12) & 7] << 12);
            j7 ^= j9 << i3;
            j8 ^= j9 >>> (-i3);
            i3 -= 15;
        } while (i3 > 0);
        jArr[i] = jArr[i] ^ (562949953421311L & j7);
        int i5 = i + 1;
        jArr[i5] = jArr[i5] ^ ((j7 >>> 49) ^ (j8 << 15));
    }

    public static void i(long[] jArr, long[] jArr2) {
        ved.c(jArr[0], jArr2, 0);
        ved.c(jArr[1], jArr2, 2);
        ved.c(jArr[2], jArr2, 4);
        jArr2[6] = jArr[3] & 1;
    }

    public static void j(long[] jArr, long[] jArr2) {
        if (bhg.u(jArr)) {
            throw new IllegalStateException();
        }
        long[] jArrG = bhg.g();
        long[] jArrG2 = bhg.g();
        p(jArr, jArrG);
        r(jArrG, 1, jArrG2);
        k(jArrG, jArrG2, jArrG);
        r(jArrG2, 1, jArrG2);
        k(jArrG, jArrG2, jArrG);
        r(jArrG, 3, jArrG2);
        k(jArrG, jArrG2, jArrG);
        r(jArrG, 6, jArrG2);
        k(jArrG, jArrG2, jArrG);
        r(jArrG, 12, jArrG2);
        k(jArrG, jArrG2, jArrG);
        r(jArrG, 24, jArrG2);
        k(jArrG, jArrG2, jArrG);
        r(jArrG, 48, jArrG2);
        k(jArrG, jArrG2, jArrG);
        r(jArrG, 96, jArrG2);
        k(jArrG, jArrG2, jArr2);
    }

    public static void k(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArrI = bhg.i();
        g(jArr, jArr2, jArrI);
        m(jArrI, jArr3);
    }

    public static void l(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArrI = bhg.i();
        g(jArr, jArr2, jArrI);
        b(jArr3, jArrI, jArr3);
    }

    public static void m(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = jArr[5];
        long j7 = jArr[6];
        long j8 = j5 ^ (j7 >>> 50);
        long j9 = (j4 ^ ((j7 >>> 1) ^ (j7 << 14))) ^ (j6 >>> 50);
        long j10 = j ^ (j8 << 63);
        long j11 = (j2 ^ (j6 << 63)) ^ ((j8 >>> 1) ^ (j8 << 14));
        long j12 = ((j3 ^ (j7 << 63)) ^ ((j6 >>> 1) ^ (j6 << 14))) ^ (j8 >>> 50);
        long j13 = j9 >>> 1;
        jArr2[0] = (j10 ^ j13) ^ (j13 << 15);
        jArr2[1] = (j9 >>> 50) ^ j11;
        jArr2[2] = j12;
        jArr2[3] = 1 & j9;
    }

    public static void n(long[] jArr, int i) {
        int i2 = i + 3;
        long j = jArr[i2];
        long j2 = j >>> 1;
        jArr[i] = (j2 ^ (j2 << 15)) ^ jArr[i];
        int i3 = i + 1;
        jArr[i3] = jArr[i3] ^ (j >>> 50);
        jArr[i2] = j & 1;
    }

    public static void o(long[] jArr, long[] jArr2) {
        long jF = ved.f(jArr[0]);
        long jF2 = ved.f(jArr[1]);
        long j = (jF & 4294967295L) | (jF2 << 32);
        long j2 = (jF >>> 32) | (jF2 & (-4294967296L));
        long jF3 = ved.f(jArr[2]);
        long j3 = (jF3 & 4294967295L) ^ (jArr[3] << 32);
        long j4 = jF3 >>> 32;
        jArr2[0] = j ^ (j2 << 8);
        jArr2[1] = ((j3 ^ (j4 << 8)) ^ (j2 >>> 56)) ^ (j2 << 33);
        jArr2[2] = (j2 >>> 31) ^ ((jF3 >>> 88) ^ (j4 << 33));
        jArr2[3] = jF3 >>> 63;
    }

    public static void p(long[] jArr, long[] jArr2) {
        long[] jArrI = bhg.i();
        i(jArr, jArrI);
        m(jArrI, jArr2);
    }

    public static void q(long[] jArr, long[] jArr2) {
        long[] jArrI = bhg.i();
        i(jArr, jArrI);
        b(jArr2, jArrI, jArr2);
    }

    public static void r(long[] jArr, int i, long[] jArr2) {
        long[] jArrI = bhg.i();
        i(jArr, jArrI);
        while (true) {
            m(jArrI, jArr2);
            i--;
            if (i <= 0) {
                return;
            } else {
                i(jArr2, jArrI);
            }
        }
    }
}
