package com.google.common.base;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import java.util.BitSet;

/* JADX INFO: loaded from: classes14.dex */
@GwtIncompatible
@ElementTypesAreNonnullByDefault
final class SmallCharMatcher extends CharMatcher.NamedFastMatcher {
    private static final int C1 = -862048943;
    private static final int C2 = 461845907;
    private static final double DESIRED_LOAD_FACTOR = 0.5d;
    static final int MAX_SIZE = 1023;
    private final boolean containsZero;
    private final long filter;
    private final char[] table;

    private SmallCharMatcher(char[] cArr, long j8, boolean z14, String str) {
        super(str);
        this.table = cArr;
        this.filter = j8;
        this.containsZero = z14;
    }

    private boolean checkFilter(int i14) {
        return 1 == ((this.filter >> i14) & 1);
    }

    @VisibleForTesting
    public static int chooseTableSize(int i14) {
        if (i14 == 1) {
            return 2;
        }
        int iHighestOneBit = Integer.highestOneBit(i14 - 1) << 1;
        while (((double) iHighestOneBit) * DESIRED_LOAD_FACTOR < i14) {
            iHighestOneBit <<= 1;
        }
        return iHighestOneBit;
    }

    public static CharMatcher from(BitSet bitSet, String str) {
        int i14;
        int iCardinality = bitSet.cardinality();
        boolean z14 = bitSet.get(0);
        int iChooseTableSize = chooseTableSize(iCardinality);
        char[] cArr = new char[iChooseTableSize];
        int i15 = iChooseTableSize - 1;
        int iNextSetBit = bitSet.nextSetBit(0);
        long j8 = 0;
        while (iNextSetBit != -1) {
            long j14 = (1 << iNextSetBit) | j8;
            int iSmear = smear(iNextSetBit);
            while (true) {
                i14 = iSmear & i15;
                if (cArr[i14] == 0) {
                    break;
                }
                iSmear = i14 + 1;
            }
            cArr[i14] = (char) iNextSetBit;
            iNextSetBit = bitSet.nextSetBit(iNextSetBit + 1);
            j8 = j14;
        }
        return new SmallCharMatcher(cArr, j8, z14, str);
    }

    public static int smear(int i14) {
        return Integer.rotateLeft(i14 * C1, 15) * C2;
    }

    @Override // com.google.common.base.CharMatcher
    public boolean matches(char c14) {
        if (c14 == 0) {
            return this.containsZero;
        }
        if (!checkFilter(c14)) {
            return false;
        }
        int length = this.table.length - 1;
        int iSmear = smear(c14) & length;
        int i14 = iSmear;
        do {
            char c15 = this.table[i14];
            if (c15 == 0) {
                return false;
            }
            if (c15 == c14) {
                return true;
            }
            i14 = (i14 + 1) & length;
        } while (i14 != iSmear);
        return false;
    }

    @Override // com.google.common.base.CharMatcher
    public void setBits(BitSet bitSet) {
        if (this.containsZero) {
            bitSet.set(0);
        }
        for (char c14 : this.table) {
            if (c14 != 0) {
                bitSet.set(c14);
            }
        }
    }
}
