package com.google.common.primitives;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
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
public final class Shorts extends ShortsMethodsForWeb {
    public static final int BYTES = 2;
    public static final short MAX_POWER_OF_TWO = 16384;

    public enum LexicographicalComparator implements Comparator<short[]> {
        INSTANCE;

        @Override // java.util.Comparator
        public int compare(short[] sArr, short[] sArr2) {
            int iMin = Math.min(sArr.length, sArr2.length);
            for (int i14 = 0; i14 < iMin; i14++) {
                int iCompare = Short.compare(sArr[i14], sArr2[i14]);
                if (iCompare != 0) {
                    return iCompare;
                }
            }
            return sArr.length - sArr2.length;
        }

        @Override // java.lang.Enum
        public String toString() {
            return "Shorts.lexicographicalComparator()";
        }
    }

    private Shorts() {
    }

    public static List<Short> asList(short... sArr) {
        return sArr.length == 0 ? Collections.EMPTY_LIST : new ShortArrayAsList(sArr);
    }

    private static int checkNoOverflow(long j8) {
        int i14 = (int) j8;
        Preconditions.checkArgument(j8 == ((long) i14), "the total number of elements (%s) in the arrays must fit in an int", j8);
        return i14;
    }

    public static short checkedCast(long j8) {
        short s8 = (short) j8;
        Preconditions.checkArgument(((long) s8) == j8, "Out of range: %s", j8);
        return s8;
    }

    @InlineMe(replacement = "Short.compare(a, b)")
    public static int compare(short s8, short s14) {
        return Short.compare(s8, s14);
    }

    public static short[] concat(short[]... sArr) {
        long length = 0;
        for (short[] sArr2 : sArr) {
            length += (long) sArr2.length;
        }
        short[] sArr3 = new short[checkNoOverflow(length)];
        int length2 = 0;
        for (short[] sArr4 : sArr) {
            System.arraycopy(sArr4, 0, sArr3, length2, sArr4.length);
            length2 += sArr4.length;
        }
        return sArr3;
    }

    public static short constrainToRange(short s8, short s14, short s15) {
        Preconditions.checkArgument(s14 <= s15, "min (%s) must be less than or equal to max (%s)", (int) s14, (int) s15);
        if (s8 < s14) {
            return s14;
        }
        return s8 < s15 ? s8 : s15;
    }

    public static boolean contains(short[] sArr, short s8) {
        for (short s14 : sArr) {
            if (s14 == s8) {
                return true;
            }
        }
        return false;
    }

    public static short[] ensureCapacity(short[] sArr, int i14, int i15) {
        Preconditions.checkArgument(i14 >= 0, "Invalid minLength: %s", i14);
        Preconditions.checkArgument(i15 >= 0, "Invalid padding: %s", i15);
        return sArr.length < i14 ? Arrays.copyOf(sArr, i14 + i15) : sArr;
    }

    @GwtIncompatible
    public static short fromByteArray(byte[] bArr) {
        Preconditions.checkArgument(bArr.length >= 2, "array too small: %s < %s", bArr.length, 2);
        return fromBytes(bArr[0], bArr[1]);
    }

    @GwtIncompatible
    public static short fromBytes(byte b14, byte b15) {
        return (short) ((b14 << 8) | (b15 & UnsignedBytes.MAX_VALUE));
    }

    public static int hashCode(short s8) {
        return s8;
    }

    public static int indexOf(short[] sArr, short[] sArr2) {
        Preconditions.checkNotNull(sArr, "array");
        Preconditions.checkNotNull(sArr2, "target");
        if (sArr2.length == 0) {
            return 0;
        }
        for (int i14 = 0; i14 < (sArr.length - sArr2.length) + 1; i14++) {
            for (int i15 = 0; i15 < sArr2.length; i15++) {
                if (sArr[i14 + i15] != sArr2[i15]) {
                }
            }
            return i14;
        }
        return -1;
    }

    public static String join(String str, short... sArr) {
        Preconditions.checkNotNull(str);
        if (sArr.length == 0) {
            return "";
        }
        StringBuilder sb3 = new StringBuilder(sArr.length * 6);
        sb3.append((int) sArr[0]);
        for (int i14 = 1; i14 < sArr.length; i14++) {
            sb3.append(str);
            sb3.append((int) sArr[i14]);
        }
        return sb3.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int lastIndexOf(short[] sArr, short s8, int i14, int i15) {
        for (int i16 = i15 - 1; i16 >= i14; i16--) {
            if (sArr[i16] == s8) {
                return i16;
            }
        }
        return -1;
    }

    public static Comparator<short[]> lexicographicalComparator() {
        return LexicographicalComparator.INSTANCE;
    }

    @GwtIncompatible("Available in GWT! Annotation is to avoid conflict with GWT specialization of base class.")
    public static short max(short... sArr) {
        Preconditions.checkArgument(sArr.length > 0);
        short s8 = sArr[0];
        for (int i14 = 1; i14 < sArr.length; i14++) {
            short s14 = sArr[i14];
            if (s14 > s8) {
                s8 = s14;
            }
        }
        return s8;
    }

    @GwtIncompatible("Available in GWT! Annotation is to avoid conflict with GWT specialization of base class.")
    public static short min(short... sArr) {
        Preconditions.checkArgument(sArr.length > 0);
        short s8 = sArr[0];
        for (int i14 = 1; i14 < sArr.length; i14++) {
            short s14 = sArr[i14];
            if (s14 < s8) {
                s8 = s14;
            }
        }
        return s8;
    }

    public static void reverse(short[] sArr, int i14, int i15) {
        Preconditions.checkNotNull(sArr);
        Preconditions.checkPositionIndexes(i14, i15, sArr.length);
        for (int i16 = i15 - 1; i14 < i16; i16--) {
            short s8 = sArr[i14];
            sArr[i14] = sArr[i16];
            sArr[i16] = s8;
            i14++;
        }
    }

    public static void rotate(short[] sArr, int i14, int i15, int i16) {
        Preconditions.checkNotNull(sArr);
        Preconditions.checkPositionIndexes(i15, i16, sArr.length);
        if (sArr.length <= 1) {
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
        reverse(sArr, i15, i19);
        reverse(sArr, i19, i16);
        reverse(sArr, i15, i16);
    }

    public static short saturatedCast(long j8) {
        if (j8 > 32767) {
            return Short.MAX_VALUE;
        }
        if (j8 < -32768) {
            return Short.MIN_VALUE;
        }
        return (short) j8;
    }

    public static void sortDescending(short[] sArr, int i14, int i15) {
        Preconditions.checkNotNull(sArr);
        Preconditions.checkPositionIndexes(i14, i15, sArr.length);
        Arrays.sort(sArr, i14, i15);
        reverse(sArr, i14, i15);
    }

    public static Converter<String, Short> stringConverter() {
        return ShortConverter.INSTANCE;
    }

    public static short[] toArray(Collection<? extends Number> collection) {
        if (collection instanceof ShortArrayAsList) {
            return ((ShortArrayAsList) collection).toShortArray();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        short[] sArr = new short[length];
        for (int i14 = 0; i14 < length; i14++) {
            sArr[i14] = ((Number) Preconditions.checkNotNull(array[i14])).shortValue();
        }
        return sArr;
    }

    @GwtIncompatible
    public static byte[] toByteArray(short s8) {
        return new byte[]{(byte) (s8 >> 8), (byte) s8};
    }

    public static final class ShortConverter extends Converter<String, Short> implements Serializable {
        static final Converter<String, Short> INSTANCE = new ShortConverter();
        private static final long serialVersionUID = 1;

        private ShortConverter() {
        }

        private Object readResolve() {
            return INSTANCE;
        }

        public String toString() {
            return "Shorts.stringConverter()";
        }

        @Override // com.google.common.base.Converter
        public String doBackward(Short sh3) {
            return sh3.toString();
        }

        @Override // com.google.common.base.Converter
        public Short doForward(String str) {
            return Short.decode(str);
        }
    }

    @GwtCompatible
    public static class ShortArrayAsList extends AbstractList<Short> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;
        final short[] array;
        final int end;
        final int start;

        public ShortArrayAsList(short[] sArr, int i14, int i15) {
            this.array = sArr;
            this.start = i14;
            this.end = i15;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            return (obj instanceof Short) && Shorts.indexOf(this.array, ((Short) obj).shortValue(), this.start, this.end) != -1;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ShortArrayAsList)) {
                return super.equals(obj);
            }
            ShortArrayAsList shortArrayAsList = (ShortArrayAsList) obj;
            int size = size();
            if (shortArrayAsList.size() != size) {
                return false;
            }
            for (int i14 = 0; i14 < size; i14++) {
                if (this.array[this.start + i14] != shortArrayAsList.array[shortArrayAsList.start + i14]) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.List
        public Short get(int i14) {
            Preconditions.checkElementIndex(i14, size());
            return Short.valueOf(this.array[this.start + i14]);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int iHashCode = 1;
            for (int i14 = this.start; i14 < this.end; i14++) {
                iHashCode = (iHashCode * 31) + Shorts.hashCode(this.array[i14]);
            }
            return iHashCode;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            int iIndexOf;
            if (!(obj instanceof Short) || (iIndexOf = Shorts.indexOf(this.array, ((Short) obj).shortValue(), this.start, this.end)) < 0) {
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
            if (!(obj instanceof Short) || (iLastIndexOf = Shorts.lastIndexOf(this.array, ((Short) obj).shortValue(), this.start, this.end)) < 0) {
                return -1;
            }
            return iLastIndexOf - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public Short set(int i14, Short sh3) {
            Preconditions.checkElementIndex(i14, size());
            short[] sArr = this.array;
            int i15 = this.start;
            short s8 = sArr[i15 + i14];
            sArr[i15 + i14] = ((Short) Preconditions.checkNotNull(sh3)).shortValue();
            return Short.valueOf(s8);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.end - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Short> subList(int i14, int i15) {
            Preconditions.checkPositionIndexes(i14, i15, size());
            if (i14 == i15) {
                return Collections.EMPTY_LIST;
            }
            short[] sArr = this.array;
            int i16 = this.start;
            return new ShortArrayAsList(sArr, i14 + i16, i16 + i15);
        }

        public short[] toShortArray() {
            return Arrays.copyOfRange(this.array, this.start, this.end);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb3 = new StringBuilder(size() * 6);
            sb3.append('[');
            sb3.append((int) this.array[this.start]);
            int i14 = this.start;
            while (true) {
                i14++;
                if (i14 >= this.end) {
                    sb3.append(']');
                    return sb3.toString();
                }
                sb3.append(", ");
                sb3.append((int) this.array[i14]);
            }
        }

        public ShortArrayAsList(short[] sArr) {
            this(sArr, 0, sArr.length);
        }
    }

    public static int lastIndexOf(short[] sArr, short s8) {
        return lastIndexOf(sArr, s8, 0, sArr.length);
    }

    public static void sortDescending(short[] sArr) {
        Preconditions.checkNotNull(sArr);
        sortDescending(sArr, 0, sArr.length);
    }

    public static void reverse(short[] sArr) {
        Preconditions.checkNotNull(sArr);
        reverse(sArr, 0, sArr.length);
    }

    public static void rotate(short[] sArr, int i14) {
        rotate(sArr, i14, 0, sArr.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int indexOf(short[] sArr, short s8, int i14, int i15) {
        while (i14 < i15) {
            if (sArr[i14] == s8) {
                return i14;
            }
            i14++;
        }
        return -1;
    }

    public static int indexOf(short[] sArr, short s8) {
        return indexOf(sArr, s8, 0, sArr.length);
    }
}
