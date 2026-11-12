package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;

/* JADX INFO: loaded from: classes14.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
final class Hashing {
    private static final long C1 = -862048943;
    private static final long C2 = 461845907;
    private static final int MAX_TABLE_SIZE = 1073741824;

    private Hashing() {
    }

    public static int closedTableSize(int i14, double d14) {
        int iMax = Math.max(i14, 2);
        int iHighestOneBit = Integer.highestOneBit(iMax);
        if (iMax <= ((int) (d14 * ((double) iHighestOneBit)))) {
            return iHighestOneBit;
        }
        int i15 = iHighestOneBit << 1;
        if (i15 > 0) {
            return i15;
        }
        return 1073741824;
    }

    public static boolean needsResizing(int i14, int i15, double d14) {
        return ((double) i14) > d14 * ((double) i15) && i15 < 1073741824;
    }

    public static int smear(int i14) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i14) * C1), 15)) * C2);
    }

    public static int smearedHash(Object obj) {
        return smear(obj == null ? 0 : obj.hashCode());
    }
}
