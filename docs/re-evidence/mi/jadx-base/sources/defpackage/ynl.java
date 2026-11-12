package defpackage;

import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class ynl {
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
        jArr3[6] = jArr[6] ^ jArr2[6];
        jArr3[7] = jArr2[7] ^ jArr[7];
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
        jArr[0] = j ^ (j2 << 59);
        jArr[1] = (j2 >>> 5) ^ (j3 << 54);
        jArr[2] = (j3 >>> 10) ^ (j4 << 49);
        jArr[3] = (j4 >>> 15) ^ (j5 << 44);
        jArr[4] = (j5 >>> 20) ^ (j6 << 39);
        jArr[5] = (j6 >>> 25) ^ (j7 << 34);
        jArr[6] = (j7 >>> 30) ^ (j8 << 29);
        jArr[7] = j8 >>> 35;
    }

    public static void f(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        jArr2[0] = j & 576460752303423487L;
        jArr2[1] = ((j >>> 59) ^ (j2 << 5)) & 576460752303423487L;
        jArr2[2] = ((j2 >>> 54) ^ (j3 << 10)) & 576460752303423487L;
        jArr2[3] = (j3 >>> 49) ^ (j4 << 15);
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
        int i3 = 54;
        do {
            int i4 = (int) (j >>> i3);
            long j9 = jArr2[i4 & 7] ^ (jArr2[(i4 >>> 3) & 7] << 3);
            j7 ^= j9 << i3;
            j8 ^= j9 >>> (-i3);
            i3 -= 6;
        } while (i3 > 0);
        jArr[i] = jArr[i] ^ (576460752303423487L & j7);
        int i5 = i + 1;
        jArr[i5] = jArr[i5] ^ ((j7 >>> 59) ^ (j8 << 5));
    }

    public static void i(long[] jArr, long[] jArr2) {
        ved.c(jArr[0], jArr2, 0);
        ved.c(jArr[1], jArr2, 2);
        ved.c(jArr[2], jArr2, 4);
        long j = jArr[3];
        jArr2[6] = ved.b((int) j);
        jArr2[7] = ((long) ved.a((int) (j >>> 32))) & 4294967295L;
    }

    public static void j(long[] jArr, long[] jArr2) {
        if (bhg.u(jArr)) {
            throw new IllegalStateException();
        }
        long[] jArrG = bhg.g();
        long[] jArrG2 = bhg.g();
        p(jArr, jArrG);
        k(jArrG, jArr, jArrG);
        p(jArrG, jArrG);
        k(jArrG, jArr, jArrG);
        r(jArrG, 3, jArrG2);
        k(jArrG2, jArrG, jArrG2);
        p(jArrG2, jArrG2);
        k(jArrG2, jArr, jArrG2);
        r(jArrG2, 7, jArrG);
        k(jArrG, jArrG2, jArrG);
        r(jArrG, 14, jArrG2);
        k(jArrG2, jArrG, jArrG2);
        p(jArrG2, jArrG2);
        k(jArrG2, jArr, jArrG2);
        r(jArrG2, 29, jArrG);
        k(jArrG, jArrG2, jArrG);
        r(jArrG, 58, jArrG2);
        k(jArrG2, jArrG, jArrG2);
        r(jArrG2, 116, jArrG);
        k(jArrG, jArrG2, jArrG);
        p(jArrG, jArr2);
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
        long j8 = jArr[7];
        long j9 = j6 ^ (j8 >>> 31);
        long j10 = (j5 ^ ((j8 >>> 41) ^ (j8 << 33))) ^ (j7 >>> 31);
        long j11 = ((j4 ^ (j8 << 23)) ^ ((j7 >>> 41) ^ (j7 << 33))) ^ (j9 >>> 31);
        long j12 = j ^ (j10 << 23);
        long j13 = (j2 ^ (j9 << 23)) ^ ((j10 >>> 41) ^ (j10 << 33));
        long j14 = ((j3 ^ (j7 << 23)) ^ ((j9 >>> 41) ^ (j9 << 33))) ^ (j10 >>> 31);
        long j15 = j11 >>> 41;
        jArr2[0] = j12 ^ j15;
        jArr2[1] = (j15 << 10) ^ j13;
        jArr2[2] = j14;
        jArr2[3] = 2199023255551L & j11;
    }

    public static void n(long[] jArr, int i) {
        int i2 = i + 3;
        long j = jArr[i2];
        long j2 = j >>> 41;
        jArr[i] = jArr[i] ^ j2;
        int i3 = i + 1;
        jArr[i3] = (j2 << 10) ^ jArr[i3];
        jArr[i2] = j & 2199023255551L;
    }

    public static void o(long[] jArr, long[] jArr2) {
        long jF = ved.f(jArr[0]);
        long jF2 = ved.f(jArr[1]);
        long j = (jF & 4294967295L) | (jF2 << 32);
        long j2 = (jF >>> 32) | (jF2 & (-4294967296L));
        long jF3 = ved.f(jArr[2]);
        long jF4 = ved.f(jArr[3]);
        long j3 = (4294967295L & jF3) | (jF4 << 32);
        long j4 = (jF3 >>> 32) | ((-4294967296L) & jF4);
        long j5 = j4 >>> 27;
        long j6 = j4 ^ ((j2 >>> 27) | (j4 << 37));
        long j7 = j2 ^ (j2 << 37);
        long[] jArrI = bhg.i();
        int[] iArr = {32, 117, SportReportBaseParser.ReportType.minWaterTemperature};
        for (int i = 0; i < 3; i++) {
            int i2 = iArr[i];
            int i3 = i2 >>> 6;
            int i4 = i2 & 63;
            jArrI[i3] = jArrI[i3] ^ (j7 << i4);
            int i5 = i3 + 1;
            int i6 = -i4;
            jArrI[i5] = jArrI[i5] ^ ((j6 << i4) | (j7 >>> i6));
            int i7 = i3 + 2;
            jArrI[i7] = jArrI[i7] ^ ((j5 << i4) | (j6 >>> i6));
            int i8 = i3 + 3;
            jArrI[i8] = jArrI[i8] ^ (j5 >>> i6);
        }
        m(jArrI, jArr2);
        jArr2[0] = jArr2[0] ^ j;
        jArr2[1] = jArr2[1] ^ j3;
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
