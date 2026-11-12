package d63;

import org.apache.commons.lang3.e;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f58079a = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000};

    public static final int a(long j8) {
        if (j8 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j8 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j8;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001e  */
    public static final b b(long j8, long j14, long j15) {
        long j16;
        if (j8 == 0 || j14 == 0) {
            return new b(0L, 0L);
        }
        if (j14 == -1) {
            if (j8 == Long.MIN_VALUE) {
                j16 = 0;
            } else {
                j16 = -j8;
            }
        } else if (j14 == 1) {
            j16 = j8;
        } else {
            j16 = j8 * j14;
            if (j16 / j14 != j8) {
                j16 = 0;
            }
        }
        if (j16 != 0) {
            return new b(j16 / j15, j16 % j15);
        }
        if (j14 == j15) {
            return new b(j8, 0L);
        }
        if (j8 == j15) {
            return new b(j14, 0L);
        }
        long j17 = j8 >= 0 ? 0L : -1L;
        long j18 = j14 >= 0 ? 0L : -1L;
        long j19 = j8 & 4294967295L;
        long j24 = (j8 >> 32) & 4294967295L;
        long j25 = j14 & 4294967295L;
        long j26 = (j14 >> 32) & 4294967295L;
        long j27 = (j24 * j18) + (j17 * j26);
        long j28 = (j18 * j19) + (j24 * j26) + (j17 * j25);
        long j29 = j24 * j25;
        long j34 = j26 * j19;
        long j35 = j19 * j25;
        long j36 = j35 & 4294967295L;
        long j37 = (j29 & 4294967295L) + (j34 & 4294967295L) + ((j35 >> 32) & 4294967295L);
        long j38 = j37 & 4294967295L;
        long j39 = ((j37 >> 32) & 4294967295L) + (j28 & 4294967295L) + ((j29 >> 32) & 4294967295L) + ((j34 >> 32) & 4294967295L);
        long j44 = (j38 << 32) | j36;
        long j45 = (j39 & 4294967295L) | (((((j39 >> 32) & 4294967295L) + ((j28 >> 32) & 4294967295L)) + (j27 & 4294967295L)) << 32);
        int i14 = ((j45 >> 63) & 1) == 1 ? -1 : 1;
        if (i14 == -1) {
            j44 = (~j44) + 1;
            j45 = ~j45;
            if (j44 == 0) {
                j45++;
            }
        }
        int i15 = 127;
        long j46 = 0;
        long j47 = 0;
        while (-1 < i15) {
            j47 = (j47 << 1) | ((i15 < 64 ? j44 >> i15 : j45 >> (i15 - 64)) & 1);
            if (j47 >= j15 || j47 < 0) {
                j47 -= j15;
                if (i15 >= 63) {
                    e.u("The result of a multiplication followed by division overflows a long");
                    return null;
                }
                j46 |= 1 << i15;
            }
            i15--;
        }
        long j48 = i14;
        return new b(j46 * j48, j48 * j47);
    }
}
