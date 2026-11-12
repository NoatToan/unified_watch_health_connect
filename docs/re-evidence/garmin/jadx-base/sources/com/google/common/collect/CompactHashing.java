package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Objects;
import com.google.common.primitives.UnsignedBytes;
import java.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
@GwtIncompatible
@ElementTypesAreNonnullByDefault
final class CompactHashing {
    private static final int BYTE_MASK = 255;
    private static final int BYTE_MAX_SIZE = 256;
    static final int DEFAULT_SIZE = 3;
    static final int HASH_TABLE_BITS_MASK = 31;
    private static final int HASH_TABLE_BITS_MAX_BITS = 5;
    static final int MAX_SIZE = 1073741823;
    private static final int MIN_HASH_TABLE_SIZE = 4;
    static final int MODIFICATION_COUNT_INCREMENT = 32;
    private static final int SHORT_MASK = 65535;
    private static final int SHORT_MAX_SIZE = 65536;
    static final byte UNSET = 0;

    private CompactHashing() {
    }

    public static Object createTable(int i14) {
        if (i14 < 2 || i14 > 1073741824 || Integer.highestOneBit(i14) != i14) {
            vb.h.s(am.j.h(i14, "must be power of 2 between 2^1 and 2^30: "));
            return null;
        }
        if (i14 <= 256) {
            return new byte[i14];
        }
        return i14 <= 65536 ? new short[i14] : new int[i14];
    }

    public static int getHashPrefix(int i14, int i15) {
        return i14 & (~i15);
    }

    public static int getNext(int i14, int i15) {
        return i14 & i15;
    }

    public static int maskCombine(int i14, int i15, int i16) {
        return (i14 & (~i16)) | (i15 & i16);
    }

    public static int newCapacity(int i14) {
        return (i14 + 1) * (i14 < 32 ? 4 : 2);
    }

    public static int remove(Object obj, Object obj2, int i14, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int iSmearedHash = Hashing.smearedHash(obj);
        int i15 = iSmearedHash & i14;
        int iTableGet = tableGet(obj3, i15);
        if (iTableGet == 0) {
            return -1;
        }
        int hashPrefix = getHashPrefix(iSmearedHash, i14);
        int i16 = -1;
        while (true) {
            int i17 = iTableGet - 1;
            int i18 = iArr[i17];
            if (getHashPrefix(i18, i14) == hashPrefix && Objects.equal(obj, objArr[i17]) && (objArr2 == null || Objects.equal(obj2, objArr2[i17]))) {
                int next = getNext(i18, i14);
                if (i16 == -1) {
                    tableSet(obj3, i15, next);
                    return i17;
                }
                iArr[i16] = maskCombine(iArr[i16], next, i14);
                return i17;
            }
            int next2 = getNext(i18, i14);
            if (next2 == 0) {
                return -1;
            }
            i16 = i17;
            iTableGet = next2;
        }
    }

    public static void tableClear(Object obj) {
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
    }

    public static int tableGet(Object obj, int i14) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i14] & UnsignedBytes.MAX_VALUE;
        }
        return obj instanceof short[] ? ((short[]) obj)[i14] & 65535 : ((int[]) obj)[i14];
    }

    public static void tableSet(Object obj, int i14, int i15) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i14] = (byte) i15;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i14] = (short) i15;
        } else {
            ((int[]) obj)[i14] = i15;
        }
    }

    public static int tableSize(int i14) {
        return Math.max(4, Hashing.closedTableSize(i14 + 1, 1.0d));
    }
}
