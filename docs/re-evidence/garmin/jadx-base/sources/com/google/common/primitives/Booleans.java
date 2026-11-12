package com.google.common.primitives;

import com.google.common.annotations.GwtCompatible;
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
@GwtCompatible
public final class Booleans {

    public enum BooleanComparator implements Comparator<Boolean> {
        TRUE_FIRST(1, "Booleans.trueFirst()"),
        FALSE_FIRST(-1, "Booleans.falseFirst()");

        private final String toString;
        private final int trueValue;

        BooleanComparator(int i14, String str) {
            this.trueValue = i14;
            this.toString = str;
        }

        @Override // java.util.Comparator
        public int compare(Boolean bool, Boolean bool2) {
            return (bool2.booleanValue() ? this.trueValue : 0) - (bool.booleanValue() ? this.trueValue : 0);
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.toString;
        }
    }

    public enum LexicographicalComparator implements Comparator<boolean[]> {
        INSTANCE;

        @Override // java.util.Comparator
        public int compare(boolean[] zArr, boolean[] zArr2) {
            int iMin = Math.min(zArr.length, zArr2.length);
            for (int i14 = 0; i14 < iMin; i14++) {
                int iCompare = Boolean.compare(zArr[i14], zArr2[i14]);
                if (iCompare != 0) {
                    return iCompare;
                }
            }
            return zArr.length - zArr2.length;
        }

        @Override // java.lang.Enum
        public String toString() {
            return "Booleans.lexicographicalComparator()";
        }
    }

    private Booleans() {
    }

    public static List<Boolean> asList(boolean... zArr) {
        return zArr.length == 0 ? Collections.EMPTY_LIST : new BooleanArrayAsList(zArr);
    }

    private static int checkNoOverflow(long j8) {
        int i14 = (int) j8;
        Preconditions.checkArgument(j8 == ((long) i14), "the total number of elements (%s) in the arrays must fit in an int", j8);
        return i14;
    }

    @InlineMe(replacement = "Boolean.compare(a, b)")
    public static int compare(boolean z14, boolean z15) {
        return Boolean.compare(z14, z15);
    }

    public static boolean[] concat(boolean[]... zArr) {
        long length = 0;
        for (boolean[] zArr2 : zArr) {
            length += (long) zArr2.length;
        }
        boolean[] zArr3 = new boolean[checkNoOverflow(length)];
        int length2 = 0;
        for (boolean[] zArr4 : zArr) {
            System.arraycopy(zArr4, 0, zArr3, length2, zArr4.length);
            length2 += zArr4.length;
        }
        return zArr3;
    }

    public static boolean contains(boolean[] zArr, boolean z14) {
        for (boolean z15 : zArr) {
            if (z15 == z14) {
                return true;
            }
        }
        return false;
    }

    public static int countTrue(boolean... zArr) {
        int i14 = 0;
        for (boolean z14 : zArr) {
            if (z14) {
                i14++;
            }
        }
        return i14;
    }

    public static boolean[] ensureCapacity(boolean[] zArr, int i14, int i15) {
        Preconditions.checkArgument(i14 >= 0, "Invalid minLength: %s", i14);
        Preconditions.checkArgument(i15 >= 0, "Invalid padding: %s", i15);
        return zArr.length < i14 ? Arrays.copyOf(zArr, i14 + i15) : zArr;
    }

    public static Comparator<Boolean> falseFirst() {
        return BooleanComparator.FALSE_FIRST;
    }

    public static int hashCode(boolean z14) {
        return z14 ? 1231 : 1237;
    }

    public static int indexOf(boolean[] zArr, boolean[] zArr2) {
        Preconditions.checkNotNull(zArr, "array");
        Preconditions.checkNotNull(zArr2, "target");
        if (zArr2.length == 0) {
            return 0;
        }
        for (int i14 = 0; i14 < (zArr.length - zArr2.length) + 1; i14++) {
            for (int i15 = 0; i15 < zArr2.length; i15++) {
                if (zArr[i14 + i15] != zArr2[i15]) {
                }
            }
            return i14;
        }
        return -1;
    }

    public static String join(String str, boolean... zArr) {
        Preconditions.checkNotNull(str);
        if (zArr.length == 0) {
            return "";
        }
        StringBuilder sb3 = new StringBuilder(zArr.length * 7);
        sb3.append(zArr[0]);
        for (int i14 = 1; i14 < zArr.length; i14++) {
            sb3.append(str);
            sb3.append(zArr[i14]);
        }
        return sb3.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int lastIndexOf(boolean[] zArr, boolean z14, int i14, int i15) {
        for (int i16 = i15 - 1; i16 >= i14; i16--) {
            if (zArr[i16] == z14) {
                return i16;
            }
        }
        return -1;
    }

    public static Comparator<boolean[]> lexicographicalComparator() {
        return LexicographicalComparator.INSTANCE;
    }

    public static void reverse(boolean[] zArr, int i14, int i15) {
        Preconditions.checkNotNull(zArr);
        Preconditions.checkPositionIndexes(i14, i15, zArr.length);
        for (int i16 = i15 - 1; i14 < i16; i16--) {
            boolean z14 = zArr[i14];
            zArr[i14] = zArr[i16];
            zArr[i16] = z14;
            i14++;
        }
    }

    public static void rotate(boolean[] zArr, int i14, int i15, int i16) {
        Preconditions.checkNotNull(zArr);
        Preconditions.checkPositionIndexes(i15, i16, zArr.length);
        if (zArr.length <= 1) {
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
        reverse(zArr, i15, i19);
        reverse(zArr, i19, i16);
        reverse(zArr, i15, i16);
    }

    public static boolean[] toArray(Collection<Boolean> collection) {
        if (collection instanceof BooleanArrayAsList) {
            return ((BooleanArrayAsList) collection).toBooleanArray();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        boolean[] zArr = new boolean[length];
        for (int i14 = 0; i14 < length; i14++) {
            zArr[i14] = ((Boolean) Preconditions.checkNotNull(array[i14])).booleanValue();
        }
        return zArr;
    }

    public static Comparator<Boolean> trueFirst() {
        return BooleanComparator.TRUE_FIRST;
    }

    @GwtCompatible
    public static class BooleanArrayAsList extends AbstractList<Boolean> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;
        final boolean[] array;
        final int end;
        final int start;

        public BooleanArrayAsList(boolean[] zArr, int i14, int i15) {
            this.array = zArr;
            this.start = i14;
            this.end = i15;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            return (obj instanceof Boolean) && Booleans.indexOf(this.array, ((Boolean) obj).booleanValue(), this.start, this.end) != -1;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BooleanArrayAsList)) {
                return super.equals(obj);
            }
            BooleanArrayAsList booleanArrayAsList = (BooleanArrayAsList) obj;
            int size = size();
            if (booleanArrayAsList.size() != size) {
                return false;
            }
            for (int i14 = 0; i14 < size; i14++) {
                if (this.array[this.start + i14] != booleanArrayAsList.array[booleanArrayAsList.start + i14]) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.List
        public Boolean get(int i14) {
            Preconditions.checkElementIndex(i14, size());
            return Boolean.valueOf(this.array[this.start + i14]);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int iHashCode = 1;
            for (int i14 = this.start; i14 < this.end; i14++) {
                iHashCode = (iHashCode * 31) + Booleans.hashCode(this.array[i14]);
            }
            return iHashCode;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            int iIndexOf;
            if (!(obj instanceof Boolean) || (iIndexOf = Booleans.indexOf(this.array, ((Boolean) obj).booleanValue(), this.start, this.end)) < 0) {
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
            if (!(obj instanceof Boolean) || (iLastIndexOf = Booleans.lastIndexOf(this.array, ((Boolean) obj).booleanValue(), this.start, this.end)) < 0) {
                return -1;
            }
            return iLastIndexOf - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public Boolean set(int i14, Boolean bool) {
            Preconditions.checkElementIndex(i14, size());
            boolean[] zArr = this.array;
            int i15 = this.start;
            boolean z14 = zArr[i15 + i14];
            zArr[i15 + i14] = ((Boolean) Preconditions.checkNotNull(bool)).booleanValue();
            return Boolean.valueOf(z14);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.end - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Boolean> subList(int i14, int i15) {
            Preconditions.checkPositionIndexes(i14, i15, size());
            if (i14 == i15) {
                return Collections.EMPTY_LIST;
            }
            boolean[] zArr = this.array;
            int i16 = this.start;
            return new BooleanArrayAsList(zArr, i14 + i16, i16 + i15);
        }

        public boolean[] toBooleanArray() {
            return Arrays.copyOfRange(this.array, this.start, this.end);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb3 = new StringBuilder(size() * 7);
            sb3.append(this.array[this.start] ? "[true" : "[false");
            int i14 = this.start;
            while (true) {
                i14++;
                if (i14 >= this.end) {
                    sb3.append(']');
                    return sb3.toString();
                }
                sb3.append(this.array[i14] ? ", true" : ", false");
            }
        }

        public BooleanArrayAsList(boolean[] zArr) {
            this(zArr, 0, zArr.length);
        }
    }

    public static int lastIndexOf(boolean[] zArr, boolean z14) {
        return lastIndexOf(zArr, z14, 0, zArr.length);
    }

    public static void reverse(boolean[] zArr) {
        Preconditions.checkNotNull(zArr);
        reverse(zArr, 0, zArr.length);
    }

    public static void rotate(boolean[] zArr, int i14) {
        rotate(zArr, i14, 0, zArr.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int indexOf(boolean[] zArr, boolean z14, int i14, int i15) {
        while (i14 < i15) {
            if (zArr[i14] == z14) {
                return i14;
            }
            i14++;
        }
        return -1;
    }

    public static int indexOf(boolean[] zArr, boolean z14) {
        return indexOf(zArr, z14, 0, zArr.length);
    }
}
