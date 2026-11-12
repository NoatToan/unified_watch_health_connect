package com.google.common.primitives;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Ascii;
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

/* JADX INFO: loaded from: classes14.dex */
@ElementTypesAreNonnullByDefault
@GwtCompatible(emulated = true)
public final class Ints extends IntsMethodsForWeb {
    public static final int BYTES = 4;
    public static final int MAX_POWER_OF_TWO = 1073741824;

    public enum LexicographicalComparator implements Comparator<int[]> {
        INSTANCE;

        @Override // java.util.Comparator
        public int compare(int[] iArr, int[] iArr2) {
            int iMin = Math.min(iArr.length, iArr2.length);
            for (int i14 = 0; i14 < iMin; i14++) {
                int iCompare = Integer.compare(iArr[i14], iArr2[i14]);
                if (iCompare != 0) {
                    return iCompare;
                }
            }
            return iArr.length - iArr2.length;
        }

        @Override // java.lang.Enum
        public String toString() {
            return "Ints.lexicographicalComparator()";
        }
    }

    private Ints() {
    }

    public static List<Integer> asList(int... iArr) {
        return iArr.length == 0 ? Collections.EMPTY_LIST : new IntArrayAsList(iArr);
    }

    private static int checkNoOverflow(long j8) {
        int i14 = (int) j8;
        Preconditions.checkArgument(j8 == ((long) i14), "the total number of elements (%s) in the arrays must fit in an int", j8);
        return i14;
    }

    public static int checkedCast(long j8) {
        int i14 = (int) j8;
        Preconditions.checkArgument(((long) i14) == j8, "Out of range: %s", j8);
        return i14;
    }

    @InlineMe(replacement = "Integer.compare(a, b)")
    public static int compare(int i14, int i15) {
        return Integer.compare(i14, i15);
    }

    public static int[] concat(int[]... iArr) {
        long length = 0;
        for (int[] iArr2 : iArr) {
            length += (long) iArr2.length;
        }
        int[] iArr3 = new int[checkNoOverflow(length)];
        int length2 = 0;
        for (int[] iArr4 : iArr) {
            System.arraycopy(iArr4, 0, iArr3, length2, iArr4.length);
            length2 += iArr4.length;
        }
        return iArr3;
    }

    public static int constrainToRange(int i14, int i15, int i16) {
        Preconditions.checkArgument(i15 <= i16, "min (%s) must be less than or equal to max (%s)", i15, i16);
        return Math.min(Math.max(i14, i15), i16);
    }

    public static boolean contains(int[] iArr, int i14) {
        for (int i15 : iArr) {
            if (i15 == i14) {
                return true;
            }
        }
        return false;
    }

    public static int[] ensureCapacity(int[] iArr, int i14, int i15) {
        Preconditions.checkArgument(i14 >= 0, "Invalid minLength: %s", i14);
        Preconditions.checkArgument(i15 >= 0, "Invalid padding: %s", i15);
        return iArr.length < i14 ? Arrays.copyOf(iArr, i14 + i15) : iArr;
    }

    public static int fromByteArray(byte[] bArr) {
        Preconditions.checkArgument(bArr.length >= 4, "array too small: %s < %s", bArr.length, 4);
        return fromBytes(bArr[0], bArr[1], bArr[2], bArr[3]);
    }

    public static int fromBytes(byte b14, byte b15, byte b16, byte b17) {
        return (b14 << Ascii.CAN) | ((b15 & UnsignedBytes.MAX_VALUE) << 16) | ((b16 & UnsignedBytes.MAX_VALUE) << 8) | (b17 & UnsignedBytes.MAX_VALUE);
    }

    public static int hashCode(int i14) {
        return i14;
    }

    public static int indexOf(int[] iArr, int[] iArr2) {
        Preconditions.checkNotNull(iArr, "array");
        Preconditions.checkNotNull(iArr2, "target");
        if (iArr2.length == 0) {
            return 0;
        }
        for (int i14 = 0; i14 < (iArr.length - iArr2.length) + 1; i14++) {
            for (int i15 = 0; i15 < iArr2.length; i15++) {
                if (iArr[i14 + i15] != iArr2[i15]) {
                }
            }
            return i14;
        }
        return -1;
    }

    public static String join(String str, int... iArr) {
        Preconditions.checkNotNull(str);
        if (iArr.length == 0) {
            return "";
        }
        StringBuilder sb3 = new StringBuilder(iArr.length * 5);
        sb3.append(iArr[0]);
        for (int i14 = 1; i14 < iArr.length; i14++) {
            sb3.append(str);
            sb3.append(iArr[i14]);
        }
        return sb3.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int lastIndexOf(int[] iArr, int i14, int i15, int i16) {
        for (int i17 = i16 - 1; i17 >= i15; i17--) {
            if (iArr[i17] == i14) {
                return i17;
            }
        }
        return -1;
    }

    public static Comparator<int[]> lexicographicalComparator() {
        return LexicographicalComparator.INSTANCE;
    }

    @GwtIncompatible("Available in GWT! Annotation is to avoid conflict with GWT specialization of base class.")
    public static int max(int... iArr) {
        Preconditions.checkArgument(iArr.length > 0);
        int i14 = iArr[0];
        for (int i15 = 1; i15 < iArr.length; i15++) {
            int i16 = iArr[i15];
            if (i16 > i14) {
                i14 = i16;
            }
        }
        return i14;
    }

    @GwtIncompatible("Available in GWT! Annotation is to avoid conflict with GWT specialization of base class.")
    public static int min(int... iArr) {
        Preconditions.checkArgument(iArr.length > 0);
        int i14 = iArr[0];
        for (int i15 = 1; i15 < iArr.length; i15++) {
            int i16 = iArr[i15];
            if (i16 < i14) {
                i14 = i16;
            }
        }
        return i14;
    }

    public static void reverse(int[] iArr, int i14, int i15) {
        Preconditions.checkNotNull(iArr);
        Preconditions.checkPositionIndexes(i14, i15, iArr.length);
        for (int i16 = i15 - 1; i14 < i16; i16--) {
            int i17 = iArr[i14];
            iArr[i14] = iArr[i16];
            iArr[i16] = i17;
            i14++;
        }
    }

    public static void rotate(int[] iArr, int i14, int i15, int i16) {
        Preconditions.checkNotNull(iArr);
        Preconditions.checkPositionIndexes(i15, i16, iArr.length);
        if (iArr.length <= 1) {
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
        reverse(iArr, i15, i19);
        reverse(iArr, i19, i16);
        reverse(iArr, i15, i16);
    }

    public static int saturatedCast(long j8) {
        if (j8 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j8 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j8;
    }

    public static void sortDescending(int[] iArr, int i14, int i15) {
        Preconditions.checkNotNull(iArr);
        Preconditions.checkPositionIndexes(i14, i15, iArr.length);
        Arrays.sort(iArr, i14, i15);
        reverse(iArr, i14, i15);
    }

    public static Converter<String, Integer> stringConverter() {
        return IntConverter.INSTANCE;
    }

    public static int[] toArray(Collection<? extends Number> collection) {
        if (collection instanceof IntArrayAsList) {
            return ((IntArrayAsList) collection).toIntArray();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i14 = 0; i14 < length; i14++) {
            iArr[i14] = ((Number) Preconditions.checkNotNull(array[i14])).intValue();
        }
        return iArr;
    }

    public static byte[] toByteArray(int i14) {
        return new byte[]{(byte) (i14 >> 24), (byte) (i14 >> 16), (byte) (i14 >> 8), (byte) i14};
    }

    public static Integer tryParse(String str, int i14) {
        Long lTryParse = Longs.tryParse(str, i14);
        if (lTryParse == null || lTryParse.longValue() != lTryParse.intValue()) {
            return null;
        }
        return Integer.valueOf(lTryParse.intValue());
    }

    public static final class IntConverter extends Converter<String, Integer> implements Serializable {
        static final Converter<String, Integer> INSTANCE = new IntConverter();
        private static final long serialVersionUID = 1;

        private IntConverter() {
        }

        private Object readResolve() {
            return INSTANCE;
        }

        public String toString() {
            return "Ints.stringConverter()";
        }

        @Override // com.google.common.base.Converter
        public String doBackward(Integer num) {
            return num.toString();
        }

        @Override // com.google.common.base.Converter
        public Integer doForward(String str) {
            return Integer.decode(str);
        }
    }

    @GwtCompatible
    public static class IntArrayAsList extends AbstractList<Integer> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;
        final int[] array;
        final int end;
        final int start;

        public IntArrayAsList(int[] iArr, int i14, int i15) {
            this.array = iArr;
            this.start = i14;
            this.end = i15;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            return (obj instanceof Integer) && Ints.indexOf(this.array, ((Integer) obj).intValue(), this.start, this.end) != -1;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof IntArrayAsList)) {
                return super.equals(obj);
            }
            IntArrayAsList intArrayAsList = (IntArrayAsList) obj;
            int size = size();
            if (intArrayAsList.size() != size) {
                return false;
            }
            for (int i14 = 0; i14 < size; i14++) {
                if (this.array[this.start + i14] != intArrayAsList.array[intArrayAsList.start + i14]) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.List
        public Integer get(int i14) {
            Preconditions.checkElementIndex(i14, size());
            return Integer.valueOf(this.array[this.start + i14]);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int iHashCode = 1;
            for (int i14 = this.start; i14 < this.end; i14++) {
                iHashCode = (iHashCode * 31) + Ints.hashCode(this.array[i14]);
            }
            return iHashCode;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            int iIndexOf;
            if (!(obj instanceof Integer) || (iIndexOf = Ints.indexOf(this.array, ((Integer) obj).intValue(), this.start, this.end)) < 0) {
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
            if (!(obj instanceof Integer) || (iLastIndexOf = Ints.lastIndexOf(this.array, ((Integer) obj).intValue(), this.start, this.end)) < 0) {
                return -1;
            }
            return iLastIndexOf - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public Integer set(int i14, Integer num) {
            Preconditions.checkElementIndex(i14, size());
            int[] iArr = this.array;
            int i15 = this.start;
            int i16 = iArr[i15 + i14];
            iArr[i15 + i14] = ((Integer) Preconditions.checkNotNull(num)).intValue();
            return Integer.valueOf(i16);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.end - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Integer> subList(int i14, int i15) {
            Preconditions.checkPositionIndexes(i14, i15, size());
            if (i14 == i15) {
                return Collections.EMPTY_LIST;
            }
            int[] iArr = this.array;
            int i16 = this.start;
            return new IntArrayAsList(iArr, i14 + i16, i16 + i15);
        }

        public int[] toIntArray() {
            return Arrays.copyOfRange(this.array, this.start, this.end);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb3 = new StringBuilder(size() * 5);
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

        public IntArrayAsList(int[] iArr) {
            this(iArr, 0, iArr.length);
        }
    }

    public static int lastIndexOf(int[] iArr, int i14) {
        return lastIndexOf(iArr, i14, 0, iArr.length);
    }

    public static void sortDescending(int[] iArr) {
        Preconditions.checkNotNull(iArr);
        sortDescending(iArr, 0, iArr.length);
    }

    public static void reverse(int[] iArr) {
        Preconditions.checkNotNull(iArr);
        reverse(iArr, 0, iArr.length);
    }

    public static Integer tryParse(String str) {
        return tryParse(str, 10);
    }

    public static void rotate(int[] iArr, int i14) {
        rotate(iArr, i14, 0, iArr.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int indexOf(int[] iArr, int i14, int i15, int i16) {
        while (i15 < i16) {
            if (iArr[i15] == i14) {
                return i15;
            }
            i15++;
        }
        return -1;
    }

    public static int indexOf(int[] iArr, int i14) {
        return indexOf(iArr, i14, 0, iArr.length);
    }
}
