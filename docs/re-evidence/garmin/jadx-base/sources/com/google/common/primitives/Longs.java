package com.google.common.primitives;

import am.j;
import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Converter;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.InlineMe;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;
import vb.h;

/* JADX INFO: loaded from: classes14.dex */
@ElementTypesAreNonnullByDefault
@GwtCompatible
public final class Longs {
    public static final int BYTES = 8;
    public static final long MAX_POWER_OF_TWO = 4611686018427387904L;

    public static final class AsciiDigits {
        private static final byte[] asciiDigits;

        static {
            byte[] bArr = new byte[128];
            Arrays.fill(bArr, (byte) -1);
            for (int i14 = 0; i14 < 10; i14++) {
                bArr[i14 + 48] = (byte) i14;
            }
            for (int i15 = 0; i15 < 26; i15++) {
                byte b14 = (byte) (i15 + 10);
                bArr[i15 + 65] = b14;
                bArr[i15 + 97] = b14;
            }
            asciiDigits = bArr;
        }

        private AsciiDigits() {
        }

        public static int digit(char c14) {
            if (c14 < 128) {
                return asciiDigits[c14];
            }
            return -1;
        }
    }

    public enum LexicographicalComparator implements Comparator<long[]> {
        INSTANCE;

        @Override // java.util.Comparator
        public int compare(long[] jArr, long[] jArr2) {
            int iMin = Math.min(jArr.length, jArr2.length);
            for (int i14 = 0; i14 < iMin; i14++) {
                int iCompare = Long.compare(jArr[i14], jArr2[i14]);
                if (iCompare != 0) {
                    return iCompare;
                }
            }
            return jArr.length - jArr2.length;
        }

        @Override // java.lang.Enum
        public String toString() {
            return "Longs.lexicographicalComparator()";
        }
    }

    private Longs() {
    }

    public static List<Long> asList(long... jArr) {
        return jArr.length == 0 ? Collections.EMPTY_LIST : new LongArrayAsList(jArr);
    }

    private static int checkNoOverflow(long j8) {
        int i14 = (int) j8;
        Preconditions.checkArgument(j8 == ((long) i14), "the total number of elements (%s) in the arrays must fit in an int", j8);
        return i14;
    }

    @InlineMe(replacement = "Long.compare(a, b)")
    public static int compare(long j8, long j14) {
        return Long.compare(j8, j14);
    }

    public static long[] concat(long[]... jArr) {
        long length = 0;
        for (long[] jArr2 : jArr) {
            length += (long) jArr2.length;
        }
        long[] jArr3 = new long[checkNoOverflow(length)];
        int length2 = 0;
        for (long[] jArr4 : jArr) {
            System.arraycopy(jArr4, 0, jArr3, length2, jArr4.length);
            length2 += jArr4.length;
        }
        return jArr3;
    }

    public static long constrainToRange(long j8, long j14, long j15) {
        Preconditions.checkArgument(j14 <= j15, "min (%s) must be less than or equal to max (%s)", j14, j15);
        return Math.min(Math.max(j8, j14), j15);
    }

    public static boolean contains(long[] jArr, long j8) {
        for (long j14 : jArr) {
            if (j14 == j8) {
                return true;
            }
        }
        return false;
    }

    public static long[] ensureCapacity(long[] jArr, int i14, int i15) {
        Preconditions.checkArgument(i14 >= 0, "Invalid minLength: %s", i14);
        Preconditions.checkArgument(i15 >= 0, "Invalid padding: %s", i15);
        return jArr.length < i14 ? Arrays.copyOf(jArr, i14 + i15) : jArr;
    }

    public static long fromByteArray(byte[] bArr) {
        Preconditions.checkArgument(bArr.length >= 8, "array too small: %s < %s", bArr.length, 8);
        return fromBytes(bArr[0], bArr[1], bArr[2], bArr[3], bArr[4], bArr[5], bArr[6], bArr[7]);
    }

    public static long fromBytes(byte b14, byte b15, byte b16, byte b17, byte b18, byte b19, byte b24, byte b25) {
        return ((((long) b15) & 255) << 48) | ((((long) b14) & 255) << 56) | ((((long) b16) & 255) << 40) | ((((long) b17) & 255) << 32) | ((((long) b18) & 255) << 24) | ((((long) b19) & 255) << 16) | ((((long) b24) & 255) << 8) | (((long) b25) & 255);
    }

    public static int hashCode(long j8) {
        return (int) (j8 ^ (j8 >>> 32));
    }

    public static int indexOf(long[] jArr, long[] jArr2) {
        Preconditions.checkNotNull(jArr, "array");
        Preconditions.checkNotNull(jArr2, "target");
        if (jArr2.length == 0) {
            return 0;
        }
        for (int i14 = 0; i14 < (jArr.length - jArr2.length) + 1; i14++) {
            for (int i15 = 0; i15 < jArr2.length; i15++) {
                if (jArr[i14 + i15] != jArr2[i15]) {
                }
            }
            return i14;
        }
        return -1;
    }

    public static String join(String str, long... jArr) {
        Preconditions.checkNotNull(str);
        if (jArr.length == 0) {
            return "";
        }
        StringBuilder sb3 = new StringBuilder(jArr.length * 10);
        sb3.append(jArr[0]);
        for (int i14 = 1; i14 < jArr.length; i14++) {
            sb3.append(str);
            sb3.append(jArr[i14]);
        }
        return sb3.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int lastIndexOf(long[] jArr, long j8, int i14, int i15) {
        for (int i16 = i15 - 1; i16 >= i14; i16--) {
            if (jArr[i16] == j8) {
                return i16;
            }
        }
        return -1;
    }

    public static Comparator<long[]> lexicographicalComparator() {
        return LexicographicalComparator.INSTANCE;
    }

    public static long max(long... jArr) {
        Preconditions.checkArgument(jArr.length > 0);
        long j8 = jArr[0];
        for (int i14 = 1; i14 < jArr.length; i14++) {
            long j14 = jArr[i14];
            if (j14 > j8) {
                j8 = j14;
            }
        }
        return j8;
    }

    public static long min(long... jArr) {
        Preconditions.checkArgument(jArr.length > 0);
        long j8 = jArr[0];
        for (int i14 = 1; i14 < jArr.length; i14++) {
            long j14 = jArr[i14];
            if (j14 < j8) {
                j8 = j14;
            }
        }
        return j8;
    }

    public static void reverse(long[] jArr, int i14, int i15) {
        Preconditions.checkNotNull(jArr);
        Preconditions.checkPositionIndexes(i14, i15, jArr.length);
        for (int i16 = i15 - 1; i14 < i16; i16--) {
            long j8 = jArr[i14];
            jArr[i14] = jArr[i16];
            jArr[i16] = j8;
            i14++;
        }
    }

    public static void rotate(long[] jArr, int i14, int i15, int i16) {
        Preconditions.checkNotNull(jArr);
        Preconditions.checkPositionIndexes(i15, i16, jArr.length);
        if (jArr.length <= 1) {
            return;
        }
        int i17 = i16 - i15;
        int i18 = (-i14) % i17;
        if (i18 < 0) {
            i18 += i17;
        }
        int i19 = i18 + i15;
        if (i19 == i15) {
            return;
        }
        reverse(jArr, i15, i19);
        reverse(jArr, i19, i16);
        reverse(jArr, i15, i16);
    }

    public static void sortDescending(long[] jArr, int i14, int i15) {
        Preconditions.checkNotNull(jArr);
        Preconditions.checkPositionIndexes(i14, i15, jArr.length);
        Arrays.sort(jArr, i14, i15);
        reverse(jArr, i14, i15);
    }

    public static Converter<String, Long> stringConverter() {
        return LongConverter.INSTANCE;
    }

    public static long[] toArray(Collection<? extends Number> collection) {
        if (collection instanceof LongArrayAsList) {
            return ((LongArrayAsList) collection).toLongArray();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        long[] jArr = new long[length];
        for (int i14 = 0; i14 < length; i14++) {
            jArr[i14] = ((Number) Preconditions.checkNotNull(array[i14])).longValue();
        }
        return jArr;
    }

    public static byte[] toByteArray(long j8) {
        byte[] bArr = new byte[8];
        for (int i14 = 7; i14 >= 0; i14--) {
            bArr[i14] = (byte) (255 & j8);
            j8 >>= 8;
        }
        return bArr;
    }

    public static Long tryParse(String str, int i14) {
        if (((String) Preconditions.checkNotNull(str)).isEmpty()) {
            return null;
        }
        if (i14 < 2 || i14 > 36) {
            h.s(j.h(i14, "radix must be between MIN_RADIX and MAX_RADIX but was "));
            return null;
        }
        int i15 = str.charAt(0) == '-' ? 1 : 0;
        if (i15 == str.length()) {
            return null;
        }
        int i16 = i15 + 1;
        int iDigit = AsciiDigits.digit(str.charAt(i15));
        if (iDigit < 0 || iDigit >= i14) {
            return null;
        }
        long j8 = -iDigit;
        long j14 = i14;
        long j15 = Long.MIN_VALUE / j14;
        while (i16 < str.length()) {
            int i17 = i16 + 1;
            int iDigit2 = AsciiDigits.digit(str.charAt(i16));
            if (iDigit2 < 0 || iDigit2 >= i14 || j8 < j15) {
                return null;
            }
            long j16 = j8 * j14;
            long j17 = iDigit2;
            if (j16 < j17 - Long.MIN_VALUE) {
                return null;
            }
            j8 = j16 - j17;
            i16 = i17;
        }
        if (i15 != 0) {
            return Long.valueOf(j8);
        }
        if (j8 == Long.MIN_VALUE) {
            return null;
        }
        return Long.valueOf(-j8);
    }

    public static final class LongConverter extends Converter<String, Long> implements Serializable {
        static final Converter<String, Long> INSTANCE = new LongConverter();
        private static final long serialVersionUID = 1;

        private LongConverter() {
        }

        private Object readResolve() {
            return INSTANCE;
        }

        public String toString() {
            return "Longs.stringConverter()";
        }

        @Override // com.google.common.base.Converter
        public String doBackward(Long l14) {
            return l14.toString();
        }

        @Override // com.google.common.base.Converter
        public Long doForward(String str) {
            return Long.decode(str);
        }
    }

    @GwtCompatible
    public static class LongArrayAsList extends AbstractList<Long> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;
        final long[] array;
        final int end;
        final int start;

        public LongArrayAsList(long[] jArr, int i14, int i15) {
            this.array = jArr;
            this.start = i14;
            this.end = i15;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            return (obj instanceof Long) && Longs.indexOf(this.array, ((Long) obj).longValue(), this.start, this.end) != -1;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof LongArrayAsList)) {
                return super.equals(obj);
            }
            LongArrayAsList longArrayAsList = (LongArrayAsList) obj;
            int size = size();
            if (longArrayAsList.size() != size) {
                return false;
            }
            for (int i14 = 0; i14 < size; i14++) {
                if (this.array[this.start + i14] != longArrayAsList.array[longArrayAsList.start + i14]) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.List
        public Long get(int i14) {
            Preconditions.checkElementIndex(i14, size());
            return Long.valueOf(this.array[this.start + i14]);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int iHashCode = 1;
            for (int i14 = this.start; i14 < this.end; i14++) {
                iHashCode = (iHashCode * 31) + Longs.hashCode(this.array[i14]);
            }
            return iHashCode;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            int iIndexOf;
            if (!(obj instanceof Long) || (iIndexOf = Longs.indexOf(this.array, ((Long) obj).longValue(), this.start, this.end)) < 0) {
                return -1;
            }
            return iIndexOf - this.start;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
            int iLastIndexOf;
            if (!(obj instanceof Long) || (iLastIndexOf = Longs.lastIndexOf(this.array, ((Long) obj).longValue(), this.start, this.end)) < 0) {
                return -1;
            }
            return iLastIndexOf - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public Long set(int i14, Long l14) {
            Preconditions.checkElementIndex(i14, size());
            long[] jArr = this.array;
            int i15 = this.start;
            long j8 = jArr[i15 + i14];
            jArr[i15 + i14] = ((Long) Preconditions.checkNotNull(l14)).longValue();
            return Long.valueOf(j8);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.end - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Long> subList(int i14, int i15) {
            Preconditions.checkPositionIndexes(i14, i15, size());
            if (i14 == i15) {
                return Collections.EMPTY_LIST;
            }
            long[] jArr = this.array;
            int i16 = this.start;
            return new LongArrayAsList(jArr, i14 + i16, i16 + i15);
        }

        public long[] toLongArray() {
            return Arrays.copyOfRange(this.array, this.start, this.end);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb3 = new StringBuilder(size() * 10);
            sb3.append('[');
            sb3.append(this.array[this.start]);
            int i14 = this.start;
            while (true) {
                i14++;
                if (i14 >= this.end) {
                    sb3.append(']');
                    return sb3.toString();
                }
                sb3.append(", ");
                sb3.append(this.array[i14]);
            }
        }

        public LongArrayAsList(long[] jArr) {
            this(jArr, 0, jArr.length);
        }
    }

    public static void sortDescending(long[] jArr) {
        Preconditions.checkNotNull(jArr);
        sortDescending(jArr, 0, jArr.length);
    }

    public static int lastIndexOf(long[] jArr, long j8) {
        return lastIndexOf(jArr, j8, 0, jArr.length);
    }

    public static void reverse(long[] jArr) {
        Preconditions.checkNotNull(jArr);
        reverse(jArr, 0, jArr.length);
    }

    public static void rotate(long[] jArr, int i14) {
        rotate(jArr, i14, 0, jArr.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int indexOf(long[] jArr, long j8, int i14, int i15) {
        while (i14 < i15) {
            if (jArr[i14] == j8) {
                return i14;
            }
            i14++;
        }
        return -1;
    }

    public static int indexOf(long[] jArr, long j8) {
        return indexOf(jArr, j8, 0, jArr.length);
    }

    public static Long tryParse(String str) {
        return tryParse(str, 10);
    }
}
