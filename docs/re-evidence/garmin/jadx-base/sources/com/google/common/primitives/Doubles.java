package com.google.common.primitives;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Converter;
import com.google.common.base.Preconditions;
import com.google.common.base.Strings;
import com.google.errorprone.annotations.InlineMe;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;
import java.util.regex.Pattern;
import org.slf4j.Marker;
import vb.h;

/* JADX INFO: loaded from: classes14.dex */
@ElementTypesAreNonnullByDefault
@GwtCompatible(emulated = true)
public final class Doubles extends DoublesMethodsForWeb {
    public static final int BYTES = 8;

    @GwtIncompatible
    static final Pattern FLOATING_POINT_PATTERN = fpPattern();

    public enum LexicographicalComparator implements Comparator<double[]> {
        INSTANCE;

        @Override // java.util.Comparator
        public int compare(double[] dArr, double[] dArr2) {
            int iMin = Math.min(dArr.length, dArr2.length);
            for (int i14 = 0; i14 < iMin; i14++) {
                int iCompare = Double.compare(dArr[i14], dArr2[i14]);
                if (iCompare != 0) {
                    return iCompare;
                }
            }
            return dArr.length - dArr2.length;
        }

        @Override // java.lang.Enum
        public String toString() {
            return "Doubles.lexicographicalComparator()";
        }
    }

    private Doubles() {
    }

    public static List<Double> asList(double... dArr) {
        return dArr.length == 0 ? Collections.EMPTY_LIST : new DoubleArrayAsList(dArr);
    }

    private static int checkNoOverflow(long j8) {
        int i14 = (int) j8;
        Preconditions.checkArgument(j8 == ((long) i14), "the total number of elements (%s) in the arrays must fit in an int", j8);
        return i14;
    }

    @InlineMe(replacement = "Double.compare(a, b)")
    public static int compare(double d14, double d15) {
        return Double.compare(d14, d15);
    }

    public static double[] concat(double[]... dArr) {
        long length = 0;
        for (double[] dArr2 : dArr) {
            length += (long) dArr2.length;
        }
        double[] dArr3 = new double[checkNoOverflow(length)];
        int length2 = 0;
        for (double[] dArr4 : dArr) {
            System.arraycopy(dArr4, 0, dArr3, length2, dArr4.length);
            length2 += dArr4.length;
        }
        return dArr3;
    }

    public static double constrainToRange(double d14, double d15, double d16) {
        if (d15 <= d16) {
            return Math.min(Math.max(d14, d15), d16);
        }
        h.s(Strings.lenientFormat("min (%s) must be less than or equal to max (%s)", Double.valueOf(d15), Double.valueOf(d16)));
        return 0.0d;
    }

    public static boolean contains(double[] dArr, double d14) {
        for (double d15 : dArr) {
            if (d15 == d14) {
                return true;
            }
        }
        return false;
    }

    public static double[] ensureCapacity(double[] dArr, int i14, int i15) {
        Preconditions.checkArgument(i14 >= 0, "Invalid minLength: %s", i14);
        Preconditions.checkArgument(i15 >= 0, "Invalid padding: %s", i15);
        return dArr.length < i14 ? Arrays.copyOf(dArr, i14 + i15) : dArr;
    }

    @GwtIncompatible
    private static Pattern fpPattern() {
        return Pattern.compile("[+-]?(?:NaN|Infinity|(?:\\d+#(?:\\.\\d*#)?|\\.\\d+#)(?:[eE][+-]?\\d+#)?[fFdD]?|0[xX](?:[0-9a-fA-F]+#(?:\\.[0-9a-fA-F]*#)?|\\.[0-9a-fA-F]+#)[pP][+-]?\\d+#[fFdD]?)".replace("#", Marker.ANY_NON_NULL_MARKER));
    }

    public static int hashCode(double d14) {
        return Double.valueOf(d14).hashCode();
    }

    public static int indexOf(double[] dArr, double[] dArr2) {
        Preconditions.checkNotNull(dArr, "array");
        Preconditions.checkNotNull(dArr2, "target");
        if (dArr2.length == 0) {
            return 0;
        }
        for (int i14 = 0; i14 < (dArr.length - dArr2.length) + 1; i14++) {
            for (int i15 = 0; i15 < dArr2.length; i15++) {
                if (dArr[i14 + i15] != dArr2[i15]) {
                }
            }
            return i14;
        }
        return -1;
    }

    public static boolean isFinite(double d14) {
        return Double.NEGATIVE_INFINITY < d14 && d14 < Double.POSITIVE_INFINITY;
    }

    public static String join(String str, double... dArr) {
        Preconditions.checkNotNull(str);
        if (dArr.length == 0) {
            return "";
        }
        StringBuilder sb3 = new StringBuilder(dArr.length * 12);
        sb3.append(dArr[0]);
        for (int i14 = 1; i14 < dArr.length; i14++) {
            sb3.append(str);
            sb3.append(dArr[i14]);
        }
        return sb3.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int lastIndexOf(double[] dArr, double d14, int i14, int i15) {
        for (int i16 = i15 - 1; i16 >= i14; i16--) {
            if (dArr[i16] == d14) {
                return i16;
            }
        }
        return -1;
    }

    public static Comparator<double[]> lexicographicalComparator() {
        return LexicographicalComparator.INSTANCE;
    }

    @GwtIncompatible("Available in GWT! Annotation is to avoid conflict with GWT specialization of base class.")
    public static double max(double... dArr) {
        Preconditions.checkArgument(dArr.length > 0);
        double dMax = dArr[0];
        for (int i14 = 1; i14 < dArr.length; i14++) {
            dMax = Math.max(dMax, dArr[i14]);
        }
        return dMax;
    }

    @GwtIncompatible("Available in GWT! Annotation is to avoid conflict with GWT specialization of base class.")
    public static double min(double... dArr) {
        Preconditions.checkArgument(dArr.length > 0);
        double dMin = dArr[0];
        for (int i14 = 1; i14 < dArr.length; i14++) {
            dMin = Math.min(dMin, dArr[i14]);
        }
        return dMin;
    }

    public static void reverse(double[] dArr, int i14, int i15) {
        Preconditions.checkNotNull(dArr);
        Preconditions.checkPositionIndexes(i14, i15, dArr.length);
        for (int i16 = i15 - 1; i14 < i16; i16--) {
            double d14 = dArr[i14];
            dArr[i14] = dArr[i16];
            dArr[i16] = d14;
            i14++;
        }
    }

    public static void rotate(double[] dArr, int i14, int i15, int i16) {
        Preconditions.checkNotNull(dArr);
        Preconditions.checkPositionIndexes(i15, i16, dArr.length);
        if (dArr.length <= 1) {
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
        reverse(dArr, i15, i19);
        reverse(dArr, i19, i16);
        reverse(dArr, i15, i16);
    }

    public static void sortDescending(double[] dArr, int i14, int i15) {
        Preconditions.checkNotNull(dArr);
        Preconditions.checkPositionIndexes(i14, i15, dArr.length);
        Arrays.sort(dArr, i14, i15);
        reverse(dArr, i14, i15);
    }

    public static Converter<String, Double> stringConverter() {
        return DoubleConverter.INSTANCE;
    }

    public static double[] toArray(Collection<? extends Number> collection) {
        if (collection instanceof DoubleArrayAsList) {
            return ((DoubleArrayAsList) collection).toDoubleArray();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        double[] dArr = new double[length];
        for (int i14 = 0; i14 < length; i14++) {
            dArr[i14] = ((Number) Preconditions.checkNotNull(array[i14])).doubleValue();
        }
        return dArr;
    }

    @GwtIncompatible
    public static Double tryParse(String str) {
        if (!FLOATING_POINT_PATTERN.matcher(str).matches()) {
            return null;
        }
        try {
            return Double.valueOf(Double.parseDouble(str));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static final class DoubleConverter extends Converter<String, Double> implements Serializable {
        static final Converter<String, Double> INSTANCE = new DoubleConverter();
        private static final long serialVersionUID = 1;

        private DoubleConverter() {
        }

        private Object readResolve() {
            return INSTANCE;
        }

        public String toString() {
            return "Doubles.stringConverter()";
        }

        @Override // com.google.common.base.Converter
        public String doBackward(Double d14) {
            return d14.toString();
        }

        @Override // com.google.common.base.Converter
        public Double doForward(String str) {
            return Double.valueOf(str);
        }
    }

    @GwtCompatible
    public static class DoubleArrayAsList extends AbstractList<Double> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;
        final double[] array;
        final int end;
        final int start;

        public DoubleArrayAsList(double[] dArr, int i14, int i15) {
            this.array = dArr;
            this.start = i14;
            this.end = i15;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            return (obj instanceof Double) && Doubles.indexOf(this.array, ((Double) obj).doubleValue(), this.start, this.end) != -1;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DoubleArrayAsList)) {
                return super.equals(obj);
            }
            DoubleArrayAsList doubleArrayAsList = (DoubleArrayAsList) obj;
            int size = size();
            if (doubleArrayAsList.size() != size) {
                return false;
            }
            for (int i14 = 0; i14 < size; i14++) {
                if (this.array[this.start + i14] != doubleArrayAsList.array[doubleArrayAsList.start + i14]) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.List
        public Double get(int i14) {
            Preconditions.checkElementIndex(i14, size());
            return Double.valueOf(this.array[this.start + i14]);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int iHashCode = 1;
            for (int i14 = this.start; i14 < this.end; i14++) {
                iHashCode = (iHashCode * 31) + Doubles.hashCode(this.array[i14]);
            }
            return iHashCode;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            int iIndexOf;
            if (!(obj instanceof Double) || (iIndexOf = Doubles.indexOf(this.array, ((Double) obj).doubleValue(), this.start, this.end)) < 0) {
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
            if (!(obj instanceof Double) || (iLastIndexOf = Doubles.lastIndexOf(this.array, ((Double) obj).doubleValue(), this.start, this.end)) < 0) {
                return -1;
            }
            return iLastIndexOf - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public Double set(int i14, Double d14) {
            Preconditions.checkElementIndex(i14, size());
            double[] dArr = this.array;
            int i15 = this.start;
            double d15 = dArr[i15 + i14];
            dArr[i15 + i14] = ((Double) Preconditions.checkNotNull(d14)).doubleValue();
            return Double.valueOf(d15);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.end - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Double> subList(int i14, int i15) {
            Preconditions.checkPositionIndexes(i14, i15, size());
            if (i14 == i15) {
                return Collections.EMPTY_LIST;
            }
            double[] dArr = this.array;
            int i16 = this.start;
            return new DoubleArrayAsList(dArr, i14 + i16, i16 + i15);
        }

        public double[] toDoubleArray() {
            return Arrays.copyOfRange(this.array, this.start, this.end);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb3 = new StringBuilder(size() * 12);
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

        public DoubleArrayAsList(double[] dArr) {
            this(dArr, 0, dArr.length);
        }
    }

    public static void sortDescending(double[] dArr) {
        Preconditions.checkNotNull(dArr);
        sortDescending(dArr, 0, dArr.length);
    }

    public static int lastIndexOf(double[] dArr, double d14) {
        return lastIndexOf(dArr, d14, 0, dArr.length);
    }

    public static void reverse(double[] dArr) {
        Preconditions.checkNotNull(dArr);
        reverse(dArr, 0, dArr.length);
    }

    public static void rotate(double[] dArr, int i14) {
        rotate(dArr, i14, 0, dArr.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int indexOf(double[] dArr, double d14, int i14, int i15) {
        while (i14 < i15) {
            if (dArr[i14] == d14) {
                return i14;
            }
            i14++;
        }
        return -1;
    }

    public static int indexOf(double[] dArr, double d14) {
        return indexOf(dArr, d14, 0, dArr.length);
    }
}
