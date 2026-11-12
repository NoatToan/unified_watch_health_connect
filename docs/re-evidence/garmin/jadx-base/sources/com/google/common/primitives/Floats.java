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
import vb.h;

/* JADX INFO: loaded from: classes14.dex */
@ElementTypesAreNonnullByDefault
@GwtCompatible(emulated = true)
public final class Floats extends FloatsMethodsForWeb {
    public static final int BYTES = 4;

    public enum LexicographicalComparator implements Comparator<float[]> {
        INSTANCE;

        @Override // java.util.Comparator
        public int compare(float[] fArr, float[] fArr2) {
            int iMin = Math.min(fArr.length, fArr2.length);
            for (int i14 = 0; i14 < iMin; i14++) {
                int iCompare = Float.compare(fArr[i14], fArr2[i14]);
                if (iCompare != 0) {
                    return iCompare;
                }
            }
            return fArr.length - fArr2.length;
        }

        @Override // java.lang.Enum
        public String toString() {
            return "Floats.lexicographicalComparator()";
        }
    }

    private Floats() {
    }

    public static List<Float> asList(float... fArr) {
        return fArr.length == 0 ? Collections.EMPTY_LIST : new FloatArrayAsList(fArr);
    }

    private static int checkNoOverflow(long j8) {
        int i14 = (int) j8;
        Preconditions.checkArgument(j8 == ((long) i14), "the total number of elements (%s) in the arrays must fit in an int", j8);
        return i14;
    }

    @InlineMe(replacement = "Float.compare(a, b)")
    public static int compare(float f14, float f15) {
        return Float.compare(f14, f15);
    }

    public static float[] concat(float[]... fArr) {
        long length = 0;
        for (float[] fArr2 : fArr) {
            length += (long) fArr2.length;
        }
        float[] fArr3 = new float[checkNoOverflow(length)];
        int length2 = 0;
        for (float[] fArr4 : fArr) {
            System.arraycopy(fArr4, 0, fArr3, length2, fArr4.length);
            length2 += fArr4.length;
        }
        return fArr3;
    }

    public static float constrainToRange(float f14, float f15, float f16) {
        if (f15 <= f16) {
            return Math.min(Math.max(f14, f15), f16);
        }
        h.s(Strings.lenientFormat("min (%s) must be less than or equal to max (%s)", Float.valueOf(f15), Float.valueOf(f16)));
        return 0.0f;
    }

    public static boolean contains(float[] fArr, float f14) {
        for (float f15 : fArr) {
            if (f15 == f14) {
                return true;
            }
        }
        return false;
    }

    public static float[] ensureCapacity(float[] fArr, int i14, int i15) {
        Preconditions.checkArgument(i14 >= 0, "Invalid minLength: %s", i14);
        Preconditions.checkArgument(i15 >= 0, "Invalid padding: %s", i15);
        return fArr.length < i14 ? Arrays.copyOf(fArr, i14 + i15) : fArr;
    }

    public static int hashCode(float f14) {
        return Float.valueOf(f14).hashCode();
    }

    public static int indexOf(float[] fArr, float[] fArr2) {
        Preconditions.checkNotNull(fArr, "array");
        Preconditions.checkNotNull(fArr2, "target");
        if (fArr2.length == 0) {
            return 0;
        }
        for (int i14 = 0; i14 < (fArr.length - fArr2.length) + 1; i14++) {
            for (int i15 = 0; i15 < fArr2.length; i15++) {
                if (fArr[i14 + i15] != fArr2[i15]) {
                }
            }
            return i14;
        }
        return -1;
    }

    public static boolean isFinite(float f14) {
        return Float.NEGATIVE_INFINITY < f14 && f14 < Float.POSITIVE_INFINITY;
    }

    public static String join(String str, float... fArr) {
        Preconditions.checkNotNull(str);
        if (fArr.length == 0) {
            return "";
        }
        StringBuilder sb3 = new StringBuilder(fArr.length * 12);
        sb3.append(fArr[0]);
        for (int i14 = 1; i14 < fArr.length; i14++) {
            sb3.append(str);
            sb3.append(fArr[i14]);
        }
        return sb3.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int lastIndexOf(float[] fArr, float f14, int i14, int i15) {
        for (int i16 = i15 - 1; i16 >= i14; i16--) {
            if (fArr[i16] == f14) {
                return i16;
            }
        }
        return -1;
    }

    public static Comparator<float[]> lexicographicalComparator() {
        return LexicographicalComparator.INSTANCE;
    }

    @GwtIncompatible("Available in GWT! Annotation is to avoid conflict with GWT specialization of base class.")
    public static float max(float... fArr) {
        Preconditions.checkArgument(fArr.length > 0);
        float fMax = fArr[0];
        for (int i14 = 1; i14 < fArr.length; i14++) {
            fMax = Math.max(fMax, fArr[i14]);
        }
        return fMax;
    }

    @GwtIncompatible("Available in GWT! Annotation is to avoid conflict with GWT specialization of base class.")
    public static float min(float... fArr) {
        Preconditions.checkArgument(fArr.length > 0);
        float fMin = fArr[0];
        for (int i14 = 1; i14 < fArr.length; i14++) {
            fMin = Math.min(fMin, fArr[i14]);
        }
        return fMin;
    }

    public static void reverse(float[] fArr, int i14, int i15) {
        Preconditions.checkNotNull(fArr);
        Preconditions.checkPositionIndexes(i14, i15, fArr.length);
        for (int i16 = i15 - 1; i14 < i16; i16--) {
            float f14 = fArr[i14];
            fArr[i14] = fArr[i16];
            fArr[i16] = f14;
            i14++;
        }
    }

    public static void rotate(float[] fArr, int i14, int i15, int i16) {
        Preconditions.checkNotNull(fArr);
        Preconditions.checkPositionIndexes(i15, i16, fArr.length);
        if (fArr.length <= 1) {
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
        reverse(fArr, i15, i19);
        reverse(fArr, i19, i16);
        reverse(fArr, i15, i16);
    }

    public static void sortDescending(float[] fArr, int i14, int i15) {
        Preconditions.checkNotNull(fArr);
        Preconditions.checkPositionIndexes(i14, i15, fArr.length);
        Arrays.sort(fArr, i14, i15);
        reverse(fArr, i14, i15);
    }

    public static Converter<String, Float> stringConverter() {
        return FloatConverter.INSTANCE;
    }

    public static float[] toArray(Collection<? extends Number> collection) {
        if (collection instanceof FloatArrayAsList) {
            return ((FloatArrayAsList) collection).toFloatArray();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        float[] fArr = new float[length];
        for (int i14 = 0; i14 < length; i14++) {
            fArr[i14] = ((Number) Preconditions.checkNotNull(array[i14])).floatValue();
        }
        return fArr;
    }

    @GwtIncompatible
    public static Float tryParse(String str) {
        if (!Doubles.FLOATING_POINT_PATTERN.matcher(str).matches()) {
            return null;
        }
        try {
            return Float.valueOf(Float.parseFloat(str));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static final class FloatConverter extends Converter<String, Float> implements Serializable {
        static final Converter<String, Float> INSTANCE = new FloatConverter();
        private static final long serialVersionUID = 1;

        private FloatConverter() {
        }

        private Object readResolve() {
            return INSTANCE;
        }

        public String toString() {
            return "Floats.stringConverter()";
        }

        @Override // com.google.common.base.Converter
        public String doBackward(Float f14) {
            return f14.toString();
        }

        @Override // com.google.common.base.Converter
        public Float doForward(String str) {
            return Float.valueOf(str);
        }
    }

    @GwtCompatible
    public static class FloatArrayAsList extends AbstractList<Float> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;
        final float[] array;
        final int end;
        final int start;

        public FloatArrayAsList(float[] fArr, int i14, int i15) {
            this.array = fArr;
            this.start = i14;
            this.end = i15;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            return (obj instanceof Float) && Floats.indexOf(this.array, ((Float) obj).floatValue(), this.start, this.end) != -1;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof FloatArrayAsList)) {
                return super.equals(obj);
            }
            FloatArrayAsList floatArrayAsList = (FloatArrayAsList) obj;
            int size = size();
            if (floatArrayAsList.size() != size) {
                return false;
            }
            for (int i14 = 0; i14 < size; i14++) {
                if (this.array[this.start + i14] != floatArrayAsList.array[floatArrayAsList.start + i14]) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.List
        public Float get(int i14) {
            Preconditions.checkElementIndex(i14, size());
            return Float.valueOf(this.array[this.start + i14]);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int iHashCode = 1;
            for (int i14 = this.start; i14 < this.end; i14++) {
                iHashCode = (iHashCode * 31) + Floats.hashCode(this.array[i14]);
            }
            return iHashCode;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            int iIndexOf;
            if (!(obj instanceof Float) || (iIndexOf = Floats.indexOf(this.array, ((Float) obj).floatValue(), this.start, this.end)) < 0) {
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
            if (!(obj instanceof Float) || (iLastIndexOf = Floats.lastIndexOf(this.array, ((Float) obj).floatValue(), this.start, this.end)) < 0) {
                return -1;
            }
            return iLastIndexOf - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public Float set(int i14, Float f14) {
            Preconditions.checkElementIndex(i14, size());
            float[] fArr = this.array;
            int i15 = this.start;
            float f15 = fArr[i15 + i14];
            fArr[i15 + i14] = ((Float) Preconditions.checkNotNull(f14)).floatValue();
            return Float.valueOf(f15);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.end - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Float> subList(int i14, int i15) {
            Preconditions.checkPositionIndexes(i14, i15, size());
            if (i14 == i15) {
                return Collections.EMPTY_LIST;
            }
            float[] fArr = this.array;
            int i16 = this.start;
            return new FloatArrayAsList(fArr, i14 + i16, i16 + i15);
        }

        public float[] toFloatArray() {
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

        public FloatArrayAsList(float[] fArr) {
            this(fArr, 0, fArr.length);
        }
    }

    public static void sortDescending(float[] fArr) {
        Preconditions.checkNotNull(fArr);
        sortDescending(fArr, 0, fArr.length);
    }

    public static int lastIndexOf(float[] fArr, float f14) {
        return lastIndexOf(fArr, f14, 0, fArr.length);
    }

    public static void reverse(float[] fArr) {
        Preconditions.checkNotNull(fArr);
        reverse(fArr, 0, fArr.length);
    }

    public static void rotate(float[] fArr, int i14) {
        rotate(fArr, i14, 0, fArr.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int indexOf(float[] fArr, float f14, int i14, int i15) {
        while (i14 < i15) {
            if (fArr[i14] == f14) {
                return i14;
            }
            i14++;
        }
        return -1;
    }

    public static int indexOf(float[] fArr, float f14) {
        return indexOf(fArr, f14, 0, fArr.length);
    }
}
