package com.google.common.primitives;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.Immutable;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import okhttp3.HttpUrl;
import vb.h;

/* JADX INFO: loaded from: classes14.dex */
@ElementTypesAreNonnullByDefault
@Immutable
@GwtCompatible
public final class ImmutableDoubleArray implements Serializable {
    private static final ImmutableDoubleArray EMPTY = new ImmutableDoubleArray(new double[0]);
    private final double[] array;
    private final int end;
    private final transient int start;

    public static class AsList extends AbstractList<Double> implements RandomAccess, Serializable {
        private final ImmutableDoubleArray parent;

        private AsList(ImmutableDoubleArray immutableDoubleArray) {
            this.parent = immutableDoubleArray;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            return indexOf(obj) >= 0;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(Object obj) {
            if (obj instanceof AsList) {
                return this.parent.equals(((AsList) obj).parent);
            }
            if (!(obj instanceof List)) {
                return false;
            }
            List list = (List) obj;
            if (size() != list.size()) {
                return false;
            }
            int i14 = this.parent.start;
            for (Object obj2 : list) {
                if (obj2 instanceof Double) {
                    int i15 = i14 + 1;
                    if (ImmutableDoubleArray.areEqual(this.parent.array[i14], ((Double) obj2).doubleValue())) {
                        i14 = i15;
                    }
                }
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.List
        public Double get(int i14) {
            return Double.valueOf(this.parent.get(i14));
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            return this.parent.hashCode();
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            if (obj instanceof Double) {
                return this.parent.indexOf(((Double) obj).doubleValue());
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
            if (obj instanceof Double) {
                return this.parent.lastIndexOf(((Double) obj).doubleValue());
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.parent.length();
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Double> subList(int i14, int i15) {
            return this.parent.subArray(i14, i15).asList();
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            return this.parent.toString();
        }
    }

    private ImmutableDoubleArray(double[] dArr, int i14, int i15) {
        this.array = dArr;
        this.start = i14;
        this.end = i15;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean areEqual(double d14, double d15) {
        return Double.doubleToLongBits(d14) == Double.doubleToLongBits(d15);
    }

    public static Builder builder(int i14) {
        Preconditions.checkArgument(i14 >= 0, "Invalid initialCapacity: %s", i14);
        return new Builder(i14);
    }

    public static ImmutableDoubleArray copyOf(Iterable<Double> iterable) {
        return iterable instanceof Collection ? copyOf((Collection<Double>) iterable) : builder().addAll(iterable).build();
    }

    private boolean isPartialView() {
        return this.start > 0 || this.end < this.array.length;
    }

    public static ImmutableDoubleArray of(double d14, double... dArr) {
        Preconditions.checkArgument(dArr.length <= 2147483646, "the total number of elements must fit in an int");
        double[] dArr2 = new double[dArr.length + 1];
        dArr2[0] = d14;
        System.arraycopy(dArr, 0, dArr2, 1, dArr.length);
        return new ImmutableDoubleArray(dArr2);
    }

    public List<Double> asList() {
        return new AsList();
    }

    public boolean contains(double d14) {
        return indexOf(d14) >= 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ImmutableDoubleArray)) {
            return false;
        }
        ImmutableDoubleArray immutableDoubleArray = (ImmutableDoubleArray) obj;
        if (length() != immutableDoubleArray.length()) {
            return false;
        }
        for (int i14 = 0; i14 < length(); i14++) {
            if (!areEqual(get(i14), immutableDoubleArray.get(i14))) {
                return false;
            }
        }
        return true;
    }

    public double get(int i14) {
        Preconditions.checkElementIndex(i14, length());
        return this.array[this.start + i14];
    }

    public int hashCode() {
        int iHashCode = 1;
        for (int i14 = this.start; i14 < this.end; i14++) {
            iHashCode = (iHashCode * 31) + Doubles.hashCode(this.array[i14]);
        }
        return iHashCode;
    }

    public int indexOf(double d14) {
        for (int i14 = this.start; i14 < this.end; i14++) {
            if (areEqual(this.array[i14], d14)) {
                return i14 - this.start;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return this.end == this.start;
    }

    public int lastIndexOf(double d14) {
        int i14 = this.end;
        do {
            i14--;
            if (i14 < this.start) {
                return -1;
            }
        } while (!areEqual(this.array[i14], d14));
        return i14 - this.start;
    }

    public int length() {
        return this.end - this.start;
    }

    public Object readResolve() {
        return isEmpty() ? EMPTY : this;
    }

    public ImmutableDoubleArray subArray(int i14, int i15) {
        Preconditions.checkPositionIndexes(i14, i15, length());
        if (i14 == i15) {
            return EMPTY;
        }
        double[] dArr = this.array;
        int i16 = this.start;
        return new ImmutableDoubleArray(dArr, i14 + i16, i16 + i15);
    }

    public double[] toArray() {
        return Arrays.copyOfRange(this.array, this.start, this.end);
    }

    public String toString() {
        if (isEmpty()) {
            return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
        StringBuilder sb3 = new StringBuilder(length() * 5);
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

    public ImmutableDoubleArray trimmed() {
        return isPartialView() ? new ImmutableDoubleArray(toArray()) : this;
    }

    public Object writeReplace() {
        return trimmed();
    }

    private ImmutableDoubleArray(double[] dArr) {
        this(dArr, 0, dArr.length);
    }

    public static Builder builder() {
        return new Builder(10);
    }

    public static ImmutableDoubleArray copyOf(Collection<Double> collection) {
        return collection.isEmpty() ? EMPTY : new ImmutableDoubleArray(Doubles.toArray(collection));
    }

    public static ImmutableDoubleArray copyOf(double[] dArr) {
        if (dArr.length == 0) {
            return EMPTY;
        }
        return new ImmutableDoubleArray(Arrays.copyOf(dArr, dArr.length));
    }

    public static ImmutableDoubleArray of(double d14) {
        return new ImmutableDoubleArray(new double[]{d14});
    }

    public static ImmutableDoubleArray of(double d14, double d15) {
        return new ImmutableDoubleArray(new double[]{d14, d15});
    }

    public static ImmutableDoubleArray of(double d14, double d15, double d16) {
        return new ImmutableDoubleArray(new double[]{d14, d15, d16});
    }

    public static ImmutableDoubleArray of(double d14, double d15, double d16, double d17) {
        return new ImmutableDoubleArray(new double[]{d14, d15, d16, d17});
    }

    public static ImmutableDoubleArray of(double d14, double d15, double d16, double d17, double d18) {
        return new ImmutableDoubleArray(new double[]{d14, d15, d16, d17, d18});
    }

    public static ImmutableDoubleArray of(double d14, double d15, double d16, double d17, double d18, double d19) {
        return new ImmutableDoubleArray(new double[]{d14, d15, d16, d17, d18, d19});
    }

    public static final class Builder {
        private double[] array;
        private int count = 0;

        public Builder(int i14) {
            this.array = new double[i14];
        }

        private void ensureRoomFor(int i14) {
            int i15 = this.count + i14;
            double[] dArr = this.array;
            if (i15 > dArr.length) {
                this.array = Arrays.copyOf(dArr, expandedCapacity(dArr.length, i15));
            }
        }

        private static int expandedCapacity(int i14, int i15) {
            if (i15 < 0) {
                h.q("cannot store more than MAX_VALUE elements");
                return 0;
            }
            int iHighestOneBit = i14 + (i14 >> 1) + 1;
            if (iHighestOneBit < i15) {
                iHighestOneBit = Integer.highestOneBit(i15 - 1) << 1;
            }
            if (iHighestOneBit < 0) {
                return Integer.MAX_VALUE;
            }
            return iHighestOneBit;
        }

        @CanIgnoreReturnValue
        public Builder add(double d14) {
            ensureRoomFor(1);
            double[] dArr = this.array;
            int i14 = this.count;
            dArr[i14] = d14;
            this.count = i14 + 1;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder addAll(Collection<Double> collection) {
            ensureRoomFor(collection.size());
            for (Double d14 : collection) {
                double[] dArr = this.array;
                int i14 = this.count;
                this.count = i14 + 1;
                dArr[i14] = d14.doubleValue();
            }
            return this;
        }

        public ImmutableDoubleArray build() {
            if (this.count == 0) {
                return ImmutableDoubleArray.EMPTY;
            }
            return new ImmutableDoubleArray(this.array, 0, this.count);
        }

        @CanIgnoreReturnValue
        public Builder addAll(Iterable<Double> iterable) {
            if (iterable instanceof Collection) {
                return addAll((Collection<Double>) iterable);
            }
            Iterator<Double> it = iterable.iterator();
            while (it.hasNext()) {
                add(it.next().doubleValue());
            }
            return this;
        }

        @CanIgnoreReturnValue
        public Builder addAll(double[] dArr) {
            ensureRoomFor(dArr.length);
            System.arraycopy(dArr, 0, this.array, this.count, dArr.length);
            this.count += dArr.length;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder addAll(ImmutableDoubleArray immutableDoubleArray) {
            ensureRoomFor(immutableDoubleArray.length());
            System.arraycopy(immutableDoubleArray.array, immutableDoubleArray.start, this.array, this.count, immutableDoubleArray.length());
            this.count = immutableDoubleArray.length() + this.count;
            return this;
        }
    }

    public static ImmutableDoubleArray of() {
        return EMPTY;
    }
}
