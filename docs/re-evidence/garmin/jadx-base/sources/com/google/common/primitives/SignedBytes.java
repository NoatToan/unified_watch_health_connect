package com.google.common.primitives;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Ascii;
import com.google.common.base.Preconditions;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: loaded from: classes14.dex */
@ElementTypesAreNonnullByDefault
@GwtCompatible
public final class SignedBytes {
    public static final byte MAX_POWER_OF_TWO = 64;

    public enum LexicographicalComparator implements Comparator<byte[]> {
        INSTANCE;

        @Override // java.util.Comparator
        public int compare(byte[] bArr, byte[] bArr2) {
            int iMin = Math.min(bArr.length, bArr2.length);
            for (int i14 = 0; i14 < iMin; i14++) {
                int iCompare = Byte.compare(bArr[i14], bArr2[i14]);
                if (iCompare != 0) {
                    return iCompare;
                }
            }
            return bArr.length - bArr2.length;
        }

        @Override // java.lang.Enum
        public String toString() {
            return "SignedBytes.lexicographicalComparator()";
        }
    }

    private SignedBytes() {
    }

    public static byte checkedCast(long j8) {
        byte b14 = (byte) j8;
        Preconditions.checkArgument(((long) b14) == j8, "Out of range: %s", j8);
        return b14;
    }

    public static int compare(byte b14, byte b15) {
        return Byte.compare(b14, b15);
    }

    public static String join(String str, byte... bArr) {
        Preconditions.checkNotNull(str);
        if (bArr.length == 0) {
            return "";
        }
        StringBuilder sb3 = new StringBuilder(bArr.length * 5);
        sb3.append((int) bArr[0]);
        for (int i14 = 1; i14 < bArr.length; i14++) {
            sb3.append(str);
            sb3.append((int) bArr[i14]);
        }
        return sb3.toString();
    }

    public static Comparator<byte[]> lexicographicalComparator() {
        return LexicographicalComparator.INSTANCE;
    }

    public static byte max(byte... bArr) {
        Preconditions.checkArgument(bArr.length > 0);
        byte b14 = bArr[0];
        for (int i14 = 1; i14 < bArr.length; i14++) {
            byte b15 = bArr[i14];
            if (b15 > b14) {
                b14 = b15;
            }
        }
        return b14;
    }

    public static byte min(byte... bArr) {
        Preconditions.checkArgument(bArr.length > 0);
        byte b14 = bArr[0];
        for (int i14 = 1; i14 < bArr.length; i14++) {
            byte b15 = bArr[i14];
            if (b15 < b14) {
                b14 = b15;
            }
        }
        return b14;
    }

    public static byte saturatedCast(long j8) {
        if (j8 > 127) {
            return Ascii.DEL;
        }
        return j8 < -128 ? UnsignedBytes.MAX_POWER_OF_TWO : (byte) j8;
    }

    public static void sortDescending(byte[] bArr, int i14, int i15) {
        Preconditions.checkNotNull(bArr);
        Preconditions.checkPositionIndexes(i14, i15, bArr.length);
        Arrays.sort(bArr, i14, i15);
        Bytes.reverse(bArr, i14, i15);
    }

    public static void sortDescending(byte[] bArr) {
        Preconditions.checkNotNull(bArr);
        sortDescending(bArr, 0, bArr.length);
    }
}
