package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class ppl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long[] f30620a = {3161836309350906777L, -7642453882179322845L, -3821226941089661423L, 7312758566309945096L, -556661012383879292L, 8945041530681231562L, -4750851271514160027L, 6847946401097695794L, 541669439031730457L};

    public static void a(long[] jArr, int i, long[] jArr2, int i2, long[] jArr3, int i3) {
        for (int i4 = 0; i4 < 9; i4++) {
            jArr3[i3 + i4] = jArr[i + i4] ^ jArr2[i2 + i4];
        }
    }

    public static void b(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i = 0; i < 9; i++) {
            jArr3[i] = jArr[i] ^ jArr2[i];
        }
    }

    public static void c(long[] jArr, int i, long[] jArr2, int i2, long[] jArr3, int i3) {
        for (int i4 = 0; i4 < 9; i4++) {
            int i5 = i3 + i4;
            jArr3[i5] = jArr3[i5] ^ (jArr[i + i4] ^ jArr2[i2 + i4]);
        }
    }

    public static void d(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i = 0; i < 18; i++) {
            jArr3[i] = jArr[i] ^ jArr2[i];
        }
    }

    public static void e(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0] ^ 1;
        for (int i = 1; i < 9; i++) {
            jArr2[i] = jArr[i];
        }
    }

    public static long[] f(BigInteger bigInteger) {
        long[] jArrD = khg.d(bigInteger);
        m(jArrD, 0);
        return jArrD;
    }

    public static void g(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[144];
        System.arraycopy(jArr2, 0, jArr4, 9, 9);
        int i = 7;
        int i2 = 0;
        while (i > 0) {
            int i3 = i2 + 18;
            xgg.E(9, jArr4, i3 >>> 1, 0L, jArr4, i3);
            m(jArr4, i3);
            a(jArr4, 9, jArr4, i3, jArr4, i2 + 27);
            i--;
            i2 = i3;
        }
        long[] jArr5 = new long[144];
        xgg.I(144, jArr4, 0, 4, 0L, jArr5, 0);
        for (int i4 = 56; i4 >= 0; i4 -= 8) {
            for (int i5 = 1; i5 < 9; i5 += 2) {
                int i6 = (int) (jArr[i5] >>> i4);
                c(jArr4, (i6 & 15) * 9, jArr5, ((i6 >>> 4) & 15) * 9, jArr3, i5 - 1);
            }
            xgg.H(16, jArr3, 0, 8, 0L);
        }
        for (int i7 = 56; i7 >= 0; i7 -= 8) {
            for (int i8 = 0; i8 < 9; i8 += 2) {
                int i9 = (int) (jArr[i8] >>> i7);
                c(jArr4, (i9 & 15) * 9, jArr5, ((i9 >>> 4) & 15) * 9, jArr3, i8);
            }
            if (i7 > 0) {
                xgg.H(18, jArr3, 0, 8, 0L);
            }
        }
    }

    public static void h(long[] jArr, long[] jArr2) {
        for (int i = 0; i < 9; i++) {
            ued.c(jArr[i], jArr2, i << 1);
        }
    }

    public static void i(long[] jArr, long[] jArr2) {
        if (khg.f(jArr)) {
            throw new IllegalStateException();
        }
        long[] jArrA = khg.a();
        long[] jArrA2 = khg.a();
        long[] jArrA3 = khg.a();
        o(jArr, jArrA3);
        o(jArrA3, jArrA);
        o(jArrA, jArrA2);
        j(jArrA, jArrA2, jArrA);
        q(jArrA, 2, jArrA2);
        j(jArrA, jArrA2, jArrA);
        j(jArrA, jArrA3, jArrA);
        q(jArrA, 5, jArrA2);
        j(jArrA, jArrA2, jArrA);
        q(jArrA2, 5, jArrA2);
        j(jArrA, jArrA2, jArrA);
        q(jArrA, 15, jArrA2);
        j(jArrA, jArrA2, jArrA3);
        q(jArrA3, 30, jArrA);
        q(jArrA, 30, jArrA2);
        j(jArrA, jArrA2, jArrA);
        q(jArrA, 60, jArrA2);
        j(jArrA, jArrA2, jArrA);
        q(jArrA2, 60, jArrA2);
        j(jArrA, jArrA2, jArrA);
        q(jArrA, 180, jArrA2);
        j(jArrA, jArrA2, jArrA);
        q(jArrA2, 180, jArrA2);
        j(jArrA, jArrA2, jArrA);
        j(jArrA, jArrA3, jArr2);
    }

    public static void j(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArrB = khg.b();
        g(jArr, jArr2, jArrB);
        l(jArrB, jArr3);
    }

    public static void k(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArrB = khg.b();
        g(jArr, jArr2, jArrB);
        d(jArr3, jArrB, jArr3);
    }

    public static void l(long[] jArr, long[] jArr2) {
        long j = jArr[9];
        long j2 = jArr[17];
        long j3 = (((j ^ (j2 >>> 59)) ^ (j2 >>> 57)) ^ (j2 >>> 54)) ^ (j2 >>> 49);
        long j4 = (j2 << 15) ^ (((jArr[8] ^ (j2 << 5)) ^ (j2 << 7)) ^ (j2 << 10));
        for (int i = 16; i >= 10; i--) {
            long j5 = jArr[i];
            jArr2[i - 8] = (((j4 ^ (j5 >>> 59)) ^ (j5 >>> 57)) ^ (j5 >>> 54)) ^ (j5 >>> 49);
            j4 = (((jArr[i - 9] ^ (j5 << 5)) ^ (j5 << 7)) ^ (j5 << 10)) ^ (j5 << 15);
        }
        jArr2[1] = (((j4 ^ (j3 >>> 59)) ^ (j3 >>> 57)) ^ (j3 >>> 54)) ^ (j3 >>> 49);
        long j6 = (j3 << 15) ^ (((jArr[0] ^ (j3 << 5)) ^ (j3 << 7)) ^ (j3 << 10));
        long j7 = jArr2[8];
        long j8 = j7 >>> 59;
        jArr2[0] = (((j6 ^ j8) ^ (j8 << 2)) ^ (j8 << 5)) ^ (j8 << 10);
        jArr2[8] = 576460752303423487L & j7;
    }

    public static void m(long[] jArr, int i) {
        int i2 = i + 8;
        long j = jArr[i2];
        long j2 = j >>> 59;
        jArr[i] = ((j2 << 10) ^ (((j2 << 2) ^ j2) ^ (j2 << 5))) ^ jArr[i];
        jArr[i2] = j & 576460752303423487L;
    }

    public static void n(long[] jArr, long[] jArr2) {
        long[] jArrA = khg.a();
        long[] jArrA2 = khg.a();
        int i = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            int i3 = i + 1;
            long jE = ued.e(jArr[i]);
            i += 2;
            long jE2 = ued.e(jArr[i3]);
            jArrA[i2] = (4294967295L & jE) | (jE2 << 32);
            jArrA2[i2] = (jE >>> 32) | ((-4294967296L) & jE2);
        }
        long jE3 = ued.e(jArr[i]);
        jArrA[4] = 4294967295L & jE3;
        jArrA2[4] = jE3 >>> 32;
        j(jArrA2, f30620a, jArr2);
        b(jArr2, jArrA, jArr2);
    }

    public static void o(long[] jArr, long[] jArr2) {
        long[] jArrB = khg.b();
        h(jArr, jArrB);
        l(jArrB, jArr2);
    }

    public static void p(long[] jArr, long[] jArr2) {
        long[] jArrB = khg.b();
        h(jArr, jArrB);
        d(jArr2, jArrB, jArr2);
    }

    public static void q(long[] jArr, int i, long[] jArr2) {
        long[] jArrB = khg.b();
        h(jArr, jArrB);
        l(jArrB, jArr2);
        while (true) {
            i--;
            if (i <= 0) {
                return;
            }
            h(jArr2, jArrB);
            l(jArrB, jArr2);
        }
    }
}
