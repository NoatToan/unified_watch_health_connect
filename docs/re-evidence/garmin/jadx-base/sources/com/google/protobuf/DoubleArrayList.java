package com.google.protobuf;

import androidx.core.view.j;
import b71.i;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import org.apache.commons.lang3.e;
import vb.h;

/* JADX INFO: loaded from: classes2.dex */
final class DoubleArrayList extends AbstractProtobufList<Double> implements Internal.DoubleList, RandomAccess, PrimitiveNonBoxingCollection {
    private static final DoubleArrayList EMPTY_LIST = new DoubleArrayList(new double[0], 0, false);
    private double[] array;
    private int size;

    public DoubleArrayList() {
        this(new double[10], 0, true);
    }

    private void addDouble(int i14, double d14) {
        int i15;
        ensureIsMutable();
        if (i14 < 0 || i14 > (i15 = this.size)) {
            e.v(makeOutOfBoundsExceptionMessage(i14));
            return;
        }
        double[] dArr = this.array;
        if (i15 < dArr.length) {
            System.arraycopy(dArr, i14, dArr, i14 + 1, i15 - i14);
        } else {
            double[] dArr2 = new double[j.a(i15, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i14);
            System.arraycopy(this.array, i14, dArr2, i14 + 1, this.size - i14);
            this.array = dArr2;
        }
        this.array[i14] = d14;
        this.size++;
        ((AbstractList) this).modCount++;
    }

    public static DoubleArrayList emptyList() {
        return EMPTY_LIST;
    }

    private void ensureIndexInRange(int i14) {
        if (i14 < 0 || i14 >= this.size) {
            e.v(makeOutOfBoundsExceptionMessage(i14));
        }
    }

    private String makeOutOfBoundsExceptionMessage(int i14) {
        StringBuilder sbI = i.i(i14, "Index:", ", Size:");
        sbI.append(this.size);
        return sbI.toString();
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Double d14) {
        addDouble(d14.doubleValue());
        return true;
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Double> collection) {
        ensureIsMutable();
        Internal.checkNotNull(collection);
        if (!(collection instanceof DoubleArrayList)) {
            return super.addAll(collection);
        }
        DoubleArrayList doubleArrayList = (DoubleArrayList) collection;
        int i14 = doubleArrayList.size;
        if (i14 == 0) {
            return false;
        }
        int i15 = this.size;
        if (Integer.MAX_VALUE - i15 < i14) {
            a.b();
            return false;
        }
        int i16 = i15 + i14;
        double[] dArr = this.array;
        if (i16 > dArr.length) {
            this.array = Arrays.copyOf(dArr, i16);
        }
        System.arraycopy(doubleArrayList.array, 0, this.array, this.size, doubleArrayList.size);
        this.size = i16;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DoubleArrayList)) {
            return super.equals(obj);
        }
        DoubleArrayList doubleArrayList = (DoubleArrayList) obj;
        if (this.size != doubleArrayList.size) {
            return false;
        }
        double[] dArr = doubleArrayList.array;
        for (int i14 = 0; i14 < this.size; i14++) {
            if (Double.doubleToLongBits(this.array[i14]) != Double.doubleToLongBits(dArr[i14])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public Double get(int i14) {
        return Double.valueOf(getDouble(i14));
    }

    @Override // com.google.protobuf.Internal.DoubleList
    public double getDouble(int i14) {
        ensureIndexInRange(i14);
        return this.array[i14];
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iHashLong = 1;
        for (int i14 = 0; i14 < this.size; i14++) {
            iHashLong = (iHashLong * 31) + Internal.hashLong(Double.doubleToLongBits(this.array[i14]));
        }
        return iHashLong;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        int size = size();
        for (int i14 = 0; i14 < size; i14++) {
            if (this.array[i14] == dDoubleValue) {
                return i14;
            }
        }
        return -1;
    }

    @Override // com.google.protobuf.Internal.ProtobufList, com.google.protobuf.Internal.BooleanList
    /* JADX INFO: renamed from: mutableCopyWithCapacity */
    public Internal.ProtobufList<Double> mutableCopyWithCapacity2(int i14) {
        if (i14 >= this.size) {
            return new DoubleArrayList(Arrays.copyOf(this.array, i14), this.size, true);
        }
        h.w();
        return null;
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public Double remove(int i14) {
        ensureIsMutable();
        ensureIndexInRange(i14);
        double[] dArr = this.array;
        double d14 = dArr[i14];
        int i15 = this.size;
        if (i14 < i15 - 1) {
            System.arraycopy(dArr, i14 + 1, dArr, i14, (i15 - i14) - 1);
        }
        this.size--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d14);
    }

    @Override // java.util.AbstractList
    public void removeRange(int i14, int i15) {
        ensureIsMutable();
        if (i15 < i14) {
            e.v("toIndex < fromIndex");
            return;
        }
        double[] dArr = this.array;
        System.arraycopy(dArr, i15, dArr, i14, this.size - i15);
        this.size -= i15 - i14;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public Double set(int i14, Double d14) {
        return Double.valueOf(setDouble(i14, d14.doubleValue()));
    }

    @Override // com.google.protobuf.Internal.DoubleList
    public double setDouble(int i14, double d14) {
        ensureIsMutable();
        ensureIndexInRange(i14);
        double[] dArr = this.array;
        double d15 = dArr[i14];
        dArr[i14] = d14;
        return d15;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.size;
    }

    private DoubleArrayList(double[] dArr, int i14, boolean z14) {
        super(z14);
        this.array = dArr;
        this.size = i14;
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public void add(int i14, Double d14) {
        addDouble(i14, d14.doubleValue());
    }

    @Override // com.google.protobuf.Internal.DoubleList
    public void addDouble(double d14) {
        ensureIsMutable();
        int i14 = this.size;
        double[] dArr = this.array;
        if (i14 == dArr.length) {
            double[] dArr2 = new double[j.a(i14, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i14);
            this.array = dArr2;
        }
        double[] dArr3 = this.array;
        int i15 = this.size;
        this.size = i15 + 1;
        dArr3[i15] = d14;
    }
}
