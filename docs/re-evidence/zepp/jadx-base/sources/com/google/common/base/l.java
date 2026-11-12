package com.google.common.base;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import java.util.BitSet;

/* JADX INFO: loaded from: classes3.dex */
@GwtIncompatible
final class l extends CharMatcher.v {
    public static final int f = 1023;
    private static final int g = -862048943;
    private static final int h = 461845907;
    private static final double i = 0.5d;
    private final char[] c;
    private final boolean d;
    private final long e;

    private l(char[] cArr, long j, boolean z, String str) {
        super(str);
        this.c = cArr;
        this.e = j;
        this.d = z;
    }

    private boolean i(int i2) {
        return 1 == ((this.e >> i2) & 1);
    }

    @VisibleForTesting
    public static int j(int i2) {
        if (i2 == 1) {
            return 2;
        }
        int iHighestOneBit = Integer.highestOneBit(i2 - 1) << 1;
        while (((double) iHighestOneBit) * 0.5d < i2) {
            iHighestOneBit <<= 1;
        }
        return iHighestOneBit;
    }

    public static CharMatcher k(BitSet bitSet, String str) {
        int i2;
        int iCardinality = bitSet.cardinality();
        boolean z = bitSet.get(0);
        int iJ = j(iCardinality);
        char[] cArr = new char[iJ];
        int i3 = iJ - 1;
        int iNextSetBit = bitSet.nextSetBit(0);
        long j = 0;
        while (iNextSetBit != -1) {
            long j2 = (1 << iNextSetBit) | j;
            int iL = l(iNextSetBit);
            while (true) {
                i2 = iL & i3;
                if (cArr[i2] == 0) {
                    break;
                }
                iL = i2 + 1;
            }
            cArr[i2] = (char) iNextSetBit;
            iNextSetBit = bitSet.nextSetBit(iNextSetBit + 1);
            j = j2;
        }
        return new l(cArr, j, z, str);
    }

    public static int l(int i2) {
        return Integer.rotateLeft(i2 * (-862048943), 15) * 461845907;
    }

    @Override // com.google.common.base.CharMatcher
    public void g(BitSet bitSet) {
        if (this.d) {
            bitSet.set(0);
        }
        for (char c : this.c) {
            if (c != 0) {
                bitSet.set(c);
            }
        }
    }

    @Override // com.google.common.base.CharMatcher
    public boolean matches(char c) {
        if (c == 0) {
            return this.d;
        }
        if (!i(c)) {
            return false;
        }
        int length = this.c.length - 1;
        int iL = l(c) & length;
        int i2 = iL;
        do {
            char[] cArr = this.c;
            if (cArr[i2] == 0) {
                return false;
            }
            if (cArr[i2] == c) {
                return true;
            }
            i2 = (i2 + 1) & length;
        } while (i2 != iL);
        return false;
    }
}
