package com.google.common.hash;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;

/* JADX INFO: loaded from: classes3.dex */
final class j extends e {
    public static final HashFunction a = new j();
    private static final long b = -4348849565147123417L;
    private static final long c = -5435081209227447693L;
    private static final long d = -7286425919675154353L;

    @VisibleForTesting
    public static long a(byte[] bArr, int i, int i2) {
        if (i2 <= 32) {
            return i2 <= 16 ? b(bArr, i, i2) : e(bArr, i, i2);
        }
        return i2 <= 64 ? f(bArr, i, i2) : g(bArr, i, i2);
    }

    private static long b(byte[] bArr, int i, int i2) {
        if (i2 >= 8) {
            long j = ((long) (i2 * 2)) + d;
            long jB = l.b(bArr, i) + d;
            long jB2 = l.b(bArr, (i + i2) - 8);
            return c((Long.rotateRight(jB2, 37) * j) + jB, (Long.rotateRight(jB, 25) + jB2) * j, j);
        }
        if (i2 >= 4) {
            return c(((long) i2) + ((((long) l.a(bArr, i)) & 4294967295L) << 3), ((long) l.a(bArr, (i + i2) - 4)) & 4294967295L, ((long) (i2 * 2)) + d);
        }
        if (i2 <= 0) {
            return d;
        }
        return h((((long) ((bArr[i] & 255) + ((bArr[(i2 >> 1) + i] & 255) << 8))) * d) ^ (((long) (i2 + ((bArr[i + (i2 - 1)] & 255) << 2))) * b)) * d;
    }

    private static long c(long j, long j2, long j3) {
        long j4 = (j ^ j2) * j3;
        long j5 = ((j4 ^ (j4 >>> 47)) ^ j2) * j3;
        return (j5 ^ (j5 >>> 47)) * j3;
    }

    private static long e(byte[] bArr, int i, int i2) {
        long j = ((long) (i2 * 2)) + d;
        long jB = l.b(bArr, i) * c;
        long jB2 = l.b(bArr, i + 8);
        int i3 = i + i2;
        long jB3 = l.b(bArr, i3 - 8) * j;
        return c((l.b(bArr, i3 - 16) * d) + Long.rotateRight(jB + jB2, 43) + Long.rotateRight(jB3, 30), jB + Long.rotateRight(jB2 + d, 18) + jB3, j);
    }

    private static long f(byte[] bArr, int i, int i2) {
        long j = ((long) (i2 * 2)) + d;
        long jB = l.b(bArr, i) * d;
        long jB2 = l.b(bArr, i + 8);
        int i3 = i + i2;
        long jB3 = l.b(bArr, i3 - 8) * j;
        long jRotateRight = Long.rotateRight(jB + jB2, 43) + Long.rotateRight(jB3, 30) + (l.b(bArr, i3 - 16) * d);
        long jC = c(jRotateRight, jB3 + Long.rotateRight(jB2 + d, 18) + jB, j);
        long jB4 = l.b(bArr, i + 16) * j;
        long jB5 = l.b(bArr, i + 24);
        long jB6 = (jRotateRight + l.b(bArr, i3 - 32)) * j;
        return c(((jC + l.b(bArr, i3 - 24)) * j) + Long.rotateRight(jB4 + jB5, 43) + Long.rotateRight(jB6, 30), jB4 + Long.rotateRight(jB5 + jB, 18) + jB6, j);
    }

    private static long g(byte[] bArr, int i, int i2) {
        long jH = h(-7956866745689871395L) * d;
        long[] jArr = new long[2];
        long[] jArr2 = new long[2];
        long jB = 95310865018149119L + l.b(bArr, i);
        int i3 = i2 - 1;
        int i4 = i + ((i3 / 64) * 64);
        int i5 = i3 & 63;
        int i6 = (i4 + i5) - 63;
        long j = 2480279821605975764L;
        int i7 = i;
        while (true) {
            long jRotateRight = Long.rotateRight(jB + j + jArr[0] + l.b(bArr, i7 + 8), 37) * c;
            long jRotateRight2 = Long.rotateRight(j + jArr[1] + l.b(bArr, i7 + 48), 42) * c;
            long j2 = jRotateRight ^ jArr2[1];
            long jB2 = jRotateRight2 + jArr[0] + l.b(bArr, i7 + 40);
            long jRotateRight3 = Long.rotateRight(jH + jArr2[0], 33) * c;
            i(bArr, i7, jArr[1] * c, j2 + jArr2[0], jArr);
            i(bArr, i7 + 32, jRotateRight3 + jArr2[1], jB2 + l.b(bArr, i7 + 16), jArr2);
            i7 += 64;
            if (i7 == i4) {
                long j3 = ((j2 & 255) << 1) + c;
                jArr2[0] = jArr2[0] + ((long) i5);
                jArr[0] = jArr[0] + jArr2[0];
                jArr2[0] = jArr2[0] + jArr[0];
                long jRotateRight4 = Long.rotateRight(jRotateRight3 + jB2 + jArr[0] + l.b(bArr, i6 + 8), 37) * j3;
                long jRotateRight5 = Long.rotateRight(jB2 + jArr[1] + l.b(bArr, i6 + 48), 42) * j3;
                long j4 = jRotateRight4 ^ (jArr2[1] * 9);
                long jB3 = jRotateRight5 + (jArr[0] * 9) + l.b(bArr, i6 + 40);
                long jRotateRight6 = Long.rotateRight(j2 + jArr2[0], 33) * j3;
                i(bArr, i6, jArr[1] * j3, j4 + jArr2[0], jArr);
                i(bArr, i6 + 32, jRotateRight6 + jArr2[1], l.b(bArr, i6 + 16) + jB3, jArr2);
                return c(c(jArr[0], jArr2[0], j3) + (h(jB3) * b) + j4, c(jArr[1], jArr2[1], j3) + jRotateRight6, j3);
            }
            jH = j2;
            j = jB2;
            jB = jRotateRight3;
        }
    }

    private static long h(long j) {
        return j ^ (j >>> 47);
    }

    private static void i(byte[] bArr, int i, long j, long j2, long[] jArr) {
        long jB = l.b(bArr, i);
        long jB2 = l.b(bArr, i + 8);
        long jB3 = l.b(bArr, i + 16);
        long jB4 = l.b(bArr, i + 24);
        long j3 = j + jB;
        long j4 = jB2 + j3 + jB3;
        long jRotateRight = Long.rotateRight(j2 + j3 + jB4, 21) + Long.rotateRight(j4, 44);
        jArr[0] = j4 + jB4;
        jArr[1] = jRotateRight + j3;
    }

    @Override // com.google.common.hash.HashFunction
    public int bits() {
        return 64;
    }

    @Override // com.google.common.hash.e, com.google.common.hash.c, com.google.common.hash.HashFunction
    public HashCode hashBytes(byte[] bArr, int i, int i2) {
        Preconditions.checkPositionIndexes(i, i + i2, bArr.length);
        return HashCode.fromLong(a(bArr, i, i2));
    }

    public String toString() {
        return "Hashing.farmHashFingerprint64()";
    }
}
