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
final class BooleanArrayList extends AbstractProtobufList<Boolean> implements Internal.BooleanList, RandomAccess, PrimitiveNonBoxingCollection {
    private static final BooleanArrayList EMPTY_LIST = new BooleanArrayList(new boolean[0], 0, false);
    private boolean[] array;
    private int size;

    public BooleanArrayList() {
        this(new boolean[10], 0, true);
    }

    private void addBoolean(int i14, boolean z14) {
        int i15;
        ensureIsMutable();
        if (i14 < 0 || i14 > (i15 = this.size)) {
            e.v(makeOutOfBoundsExceptionMessage(i14));
            return;
        }
        boolean[] zArr = this.array;
        if (i15 < zArr.length) {
            System.arraycopy(zArr, i14, zArr, i14 + 1, i15 - i14);
        } else {
            boolean[] zArr2 = new boolean[j.a(i15, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i14);
            System.arraycopy(this.array, i14, zArr2, i14 + 1, this.size - i14);
            this.array = zArr2;
        }
        this.array[i14] = z14;
        this.size++;
        ((AbstractList) this).modCount++;
    }

    public static BooleanArrayList emptyList() {
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
    public boolean add(Boolean bool) {
        addBoolean(bool.booleanValue());
        return true;
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Boolean> collection) {
        ensureIsMutable();
        Internal.checkNotNull(collection);
        if (!(collection instanceof BooleanArrayList)) {
            return super.addAll(collection);
        }
        BooleanArrayList booleanArrayList = (BooleanArrayList) collection;
        int i14 = booleanArrayList.size;
        if (i14 == 0) {
            return false;
        }
        int i15 = this.size;
        if (Integer.MAX_VALUE - i15 < i14) {
            a.b();
            return false;
        }
        int i16 = i15 + i14;
        boolean[] zArr = this.array;
        if (i16 > zArr.length) {
            this.array = Arrays.copyOf(zArr, i16);
        }
        System.arraycopy(booleanArrayList.array, 0, this.array, this.size, booleanArrayList.size);
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
        if (!(obj instanceof BooleanArrayList)) {
            return super.equals(obj);
        }
        BooleanArrayList booleanArrayList = (BooleanArrayList) obj;
        if (this.size != booleanArrayList.size) {
            return false;
        }
        boolean[] zArr = booleanArrayList.array;
        for (int i14 = 0; i14 < this.size; i14++) {
            if (this.array[i14] != zArr[i14]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public Boolean get(int i14) {
        return Boolean.valueOf(getBoolean(i14));
    }

    @Override // com.google.protobuf.Internal.BooleanList
    public boolean getBoolean(int i14) {
        ensureIndexInRange(i14);
        return this.array[i14];
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iHashBoolean = 1;
        for (int i14 = 0; i14 < this.size; i14++) {
            iHashBoolean = (iHashBoolean * 31) + Internal.hashBoolean(this.array[i14]);
        }
        return iHashBoolean;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int size = size();
        for (int i14 = 0; i14 < size; i14++) {
            if (this.array[i14] == zBooleanValue) {
                return i14;
            }
        }
        return -1;
    }

    @Override // com.google.protobuf.Internal.ProtobufList, com.google.protobuf.Internal.BooleanList
    /* JADX INFO: renamed from: mutableCopyWithCapacity */
    public Internal.ProtobufList<Boolean> mutableCopyWithCapacity2(int i14) {
        if (i14 >= this.size) {
            return new BooleanArrayList(Arrays.copyOf(this.array, i14), this.size, true);
        }
        h.w();
        return null;
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public Boolean remove(int i14) {
        ensureIsMutable();
        ensureIndexInRange(i14);
        boolean[] zArr = this.array;
        boolean z14 = zArr[i14];
        int i15 = this.size;
        if (i14 < i15 - 1) {
            System.arraycopy(zArr, i14 + 1, zArr, i14, (i15 - i14) - 1);
        }
        this.size--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z14);
    }

    @Override // java.util.AbstractList
    public void removeRange(int i14, int i15) {
        ensureIsMutable();
        if (i15 < i14) {
            e.v("toIndex < fromIndex");
            return;
        }
        boolean[] zArr = this.array;
        System.arraycopy(zArr, i15, zArr, i14, this.size - i15);
        this.size -= i15 - i14;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public Boolean set(int i14, Boolean bool) {
        return Boolean.valueOf(setBoolean(i14, bool.booleanValue()));
    }

    @Override // com.google.protobuf.Internal.BooleanList
    public boolean setBoolean(int i14, boolean z14) {
        ensureIsMutable();
        ensureIndexInRange(i14);
        boolean[] zArr = this.array;
        boolean z15 = zArr[i14];
        zArr[i14] = z14;
        return z15;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.size;
    }

    private BooleanArrayList(boolean[] zArr, int i14, boolean z14) {
        super(z14);
        this.array = zArr;
        this.size = i14;
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public void add(int i14, Boolean bool) {
        addBoolean(i14, bool.booleanValue());
    }

    @Override // com.google.protobuf.Internal.BooleanList
    public void addBoolean(boolean z14) {
        ensureIsMutable();
        int i14 = this.size;
        boolean[] zArr = this.array;
        if (i14 == zArr.length) {
            boolean[] zArr2 = new boolean[j.a(i14, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i14);
            this.array = zArr2;
        }
        boolean[] zArr3 = this.array;
        int i15 = this.size;
        this.size = i15 + 1;
        zArr3[i15] = z14;
    }
}
