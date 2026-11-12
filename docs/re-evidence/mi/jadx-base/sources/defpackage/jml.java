package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class jml {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long[] f22930a = {2791191049453778211L, 2791191049453778402L, 6};

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
        jArr3[4] = jArr2[4] ^ jArr[4];
    }

    public static void c(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0] ^ 1;
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
    }

    public static long[] d(BigInteger bigInteger) {
        long[] jArrM = vgg.m(bigInteger);
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
        jArr[0] = j ^ (j2 << 44);
        jArr[1] = (j2 >>> 20) ^ (j3 << 24);
        jArr[2] = ((j3 >>> 40) ^ (j4 << 4)) ^ (j5 << 48);
        jArr[3] = ((j4 >>> 60) ^ (j6 << 28)) ^ (j5 >>> 16);
        jArr[4] = j6 >>> 36;
        jArr[5] = 0;
    }

    public static void f(long[] jArr, long[] jArr2, long[] jArr3) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = ((jArr[2] << 40) ^ (j2 >>> 24)) & 17592186044415L;
        long j4 = ((j2 << 20) ^ (j >>> 44)) & 17592186044415L;
        long j5 = j & 17592186044415L;
        long j6 = jArr2[0];
        long j7 = jArr2[1];
        long j8 = ((j7 >>> 24) ^ (jArr2[2] << 40)) & 17592186044415L;
        long j9 = ((j6 >>> 44) ^ (j7 << 20)) & 17592186044415L;
        long j10 = j6 & 17592186044415L;
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
        long j20 = (j16 ^ (j18 << 1)) ^ j17;
        long j21 = jArr4[0];
        long j22 = jArr4[1];
        long j23 = (j22 ^ j21) ^ jArr4[4];
        long j24 = j22 ^ jArr4[5];
        long j25 = jArr4[2];
        long j26 = ((j19 ^ j21) ^ (j25 << 4)) ^ (j25 << 1);
        long j27 = jArr4[3];
        long j28 = (((j23 ^ j20) ^ (j27 << 4)) ^ (j27 << 1)) ^ (j26 >>> 44);
        long j29 = (j24 ^ j18) ^ (j28 >>> 44);
        long j30 = ((j26 & 17592186044415L) >>> 1) ^ ((j28 & 1) << 43);
        long j31 = j30 ^ (j30 << 1);
        long j32 = j31 ^ (j31 << 2);
        long j33 = j32 ^ (j32 << 4);
        long j34 = j33 ^ (j33 << 8);
        long j35 = j34 ^ (j34 << 16);
        long j36 = (j35 ^ (j35 << 32)) & 17592186044415L;
        long j37 = (((j28 & 17592186044415L) >>> 1) ^ ((j29 & 1) << 43)) ^ (j36 >>> 43);
        long j38 = j37 ^ (j37 << 1);
        long j39 = j38 ^ (j38 << 2);
        long j40 = j39 ^ (j39 << 4);
        long j41 = j40 ^ (j40 << 8);
        long j42 = j41 ^ (j41 << 16);
        long j43 = (j42 ^ (j42 << 32)) & 17592186044415L;
        long j44 = (j43 >>> 43) ^ (j29 >>> 1);
        long j45 = j44 ^ (j44 << 1);
        long j46 = j45 ^ (j45 << 2);
        long j47 = j46 ^ (j46 << 4);
        long j48 = j47 ^ (j47 << 8);
        long j49 = j48 ^ (j48 << 16);
        long j50 = j49 ^ (j49 << 32);
        jArr3[0] = j21;
        jArr3[1] = (j23 ^ j36) ^ j25;
        jArr3[2] = ((j24 ^ j43) ^ j36) ^ j27;
        jArr3[3] = j50 ^ j43;
        jArr3[4] = jArr4[2] ^ j50;
        jArr3[5] = jArr4[3];
        e(jArr3);
    }

    public static void g(long j, long j2, long[] jArr, int i) {
        long j3 = j2 << 1;
        long j4 = j3 ^ j2;
        long j5 = j2 << 2;
        long j6 = j4 << 1;
        long[] jArr2 = {0, j2, j3, j4, j5, j5 ^ j2, j6, j6 ^ j2};
        int i2 = (int) j;
        long j7 = (jArr2[(i2 >>> 6) & 7] << 6) ^ (jArr2[i2 & 7] ^ (jArr2[(i2 >>> 3) & 7] << 3));
        long j8 = 0;
        int i3 = 33;
        do {
            int i4 = (int) (j >>> i3);
            long j9 = ((jArr2[i4 & 7] ^ (jArr2[(i4 >>> 3) & 7] << 3)) ^ (jArr2[(i4 >>> 6) & 7] << 6)) ^ (jArr2[(i4 >>> 9) & 7] << 9);
            j7 ^= j9 << i3;
            j8 ^= j9 >>> (-i3);
            i3 -= 12;
        } while (i3 > 0);
        jArr[i] = 17592186044415L & j7;
        jArr[i + 1] = (j7 >>> 44) ^ (j8 << 20);
    }

    public static void h(long[] jArr, long[] jArr2) {
        ued.c(jArr[0], jArr2, 0);
        ued.c(jArr[1], jArr2, 2);
        jArr2[4] = ((long) ued.d((int) jArr[2])) & 4294967295L;
    }

    public static void i(long[] jArr, long[] jArr2) {
        if (vgg.t(jArr)) {
            throw new IllegalStateException();
        }
        long[] jArrF = vgg.f();
        long[] jArrF2 = vgg.f();
        o(jArr, jArrF);
        j(jArrF, jArr, jArrF);
        q(jArrF, 2, jArrF2);
        j(jArrF2, jArrF, jArrF2);
        q(jArrF2, 4, jArrF);
        j(jArrF, jArrF2, jArrF);
        q(jArrF, 8, jArrF2);
        j(jArrF2, jArrF, jArrF2);
        q(jArrF2, 16, jArrF);
        j(jArrF, jArrF2, jArrF);
        q(jArrF, 32, jArrF2);
        j(jArrF2, jArrF, jArrF2);
        o(jArrF2, jArrF2);
        j(jArrF2, jArr, jArrF2);
        q(jArrF2, 65, jArrF);
        j(jArrF, jArrF2, jArrF);
        o(jArrF, jArr2);
    }

    public static void j(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArrH = vgg.h();
        f(jArr, jArr2, jArrH);
        l(jArrH, jArr3);
    }

    public static void k(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArrH = vgg.h();
        f(jArr, jArr2, jArrH);
        b(jArr3, jArrH, jArr3);
    }

    public static void l(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = j4 ^ (j5 >>> 59);
        long j7 = j ^ ((j6 << 61) ^ (j6 << 63));
        long j8 = (j2 ^ ((j5 << 61) ^ (j5 << 63))) ^ ((((j6 >>> 3) ^ (j6 >>> 1)) ^ j6) ^ (j6 << 5));
        long j9 = (j3 ^ ((((j5 >>> 3) ^ (j5 >>> 1)) ^ j5) ^ (j5 << 5))) ^ (j6 >>> 59);
        long j10 = j9 >>> 3;
        jArr2[0] = (((j7 ^ j10) ^ (j10 << 2)) ^ (j10 << 3)) ^ (j10 << 8);
        jArr2[1] = (j9 >>> 59) ^ j8;
        jArr2[2] = 7 & j9;
    }

    public static void m(long[] jArr, int i) {
        int i2 = i + 2;
        long j = jArr[i2];
        long j2 = j >>> 3;
        jArr[i] = ((j2 << 8) ^ (((j2 << 2) ^ j2) ^ (j2 << 3))) ^ jArr[i];
        int i3 = i + 1;
        jArr[i3] = jArr[i3] ^ (j >>> 59);
        jArr[i2] = j & 7;
    }

    public static void n(long[] jArr, long[] jArr2) {
        long[] jArrF = vgg.f();
        long jE = ued.e(jArr[0]);
        long jE2 = ued.e(jArr[1]);
        long j = (jE & 4294967295L) | (jE2 << 32);
        jArrF[0] = (jE >>> 32) | (jE2 & (-4294967296L));
        long jE3 = ued.e(jArr[2]);
        jArrF[1] = jE3 >>> 32;
        j(jArrF, f22930a, jArr2);
        jArr2[0] = jArr2[0] ^ j;
        jArr2[1] = jArr2[1] ^ (jE3 & 4294967295L);
    }

    public static void o(long[] jArr, long[] jArr2) {
        long[] jArrJ = xgg.j(5);
        h(jArr, jArrJ);
        l(jArrJ, jArr2);
    }

    public static void p(long[] jArr, long[] jArr2) {
        long[] jArrJ = xgg.j(5);
        h(jArr, jArrJ);
        b(jArr2, jArrJ, jArr2);
    }

    public static void q(long[] jArr, int i, long[] jArr2) {
        long[] jArrJ = xgg.j(5);
        h(jArr, jArrJ);
        l(jArrJ, jArr2);
        while (true) {
            i--;
            if (i <= 0) {
                return;
            }
            h(jArr2, jArrJ);
            l(jArrJ, jArr2);
        }
    }
}
