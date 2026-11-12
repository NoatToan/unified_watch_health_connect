package com.google.common.primitives;

import java.util.Comparator;

/* JADX INFO: loaded from: classes21.dex */
@ElementTypesAreNonnullByDefault
public final class UnsignedLongs {
    private static long a(long j) {
        return j ^ Long.MIN_VALUE;
    }

    public static int c(long j, long j2) {
        return Longs.e(a(j), a(j2));
    }

    enum LexicographicalComparator implements Comparator<long[]> {
        INSTANCE;

        @Override // java.util.Comparator
        public int compare(long[] jArr, long[] jArr2) {
            int iMin = Math.min(jArr.length, jArr2.length);
            for (int i = 0; i < iMin; i++) {
                long j = jArr[i];
                long j2 = jArr2[i];
                if (j != j2) {
                    return UnsignedLongs.c(j, j2);
                }
            }
            return jArr.length - jArr2.length;
        }

        @Override // java.lang.Enum
        public String toString() {
            return "UnsignedLongs.lexicographicalComparator()";
        }
    }

    public static long a(long j, long j2) {
        if (j2 < 0) {
            return c(j, j2) < 0 ? j : j - j2;
        }
        if (j >= 0) {
            return j % j2;
        }
        long j3 = j - ((((j >>> 1) / j2) << 1) * j2);
        if (c(j3, j2) < 0) {
            j2 = 0;
        }
        return j3 - j2;
    }
}
