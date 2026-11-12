package com.google.crypto.tink.shaded.protobuf;

import androidx.core.view.j;
import b71.i;
import com.google.protobuf.a;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import org.apache.commons.lang3.e;
import vb.h;

/* JADX INFO: loaded from: classes2.dex */
final class IntArrayList extends AbstractProtobufList<Integer> implements Internal.IntList, RandomAccess, PrimitiveNonBoxingCollection {
    private static final IntArrayList EMPTY_LIST;
    private int[] array;
    private int size;

    static {
        IntArrayList intArrayList = new IntArrayList(new int[0], 0);
        EMPTY_LIST = intArrayList;
        intArrayList.makeImmutable();
    }

    public IntArrayList() {
        this(new int[10], 0);
    }

    private void addInt(int i14, int i15) {
        int i16;
        ensureIsMutable();
        if (i14 < 0 || i14 > (i16 = this.size)) {
            e.v(makeOutOfBoundsExceptionMessage(i14));
            return;
        }
        int[] iArr = this.array;
        if (i16 < iArr.length) {
            System.arraycopy(iArr, i14, iArr, i14 + 1, i16 - i14);
        } else {
            int[] iArr2 = new int[j.a(i16, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i14);
            System.arraycopy(this.array, i14, iArr2, i14 + 1, this.size - i14);
            this.array = iArr2;
        }
        this.array[i14] = i15;
        this.size++;
        ((AbstractList) this).modCount++;
    }

    public static IntArrayList emptyList() {
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

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Integer num) {
        addInt(num.intValue());
        return true;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Integer> collection) {
        ensureIsMutable();
        Internal.checkNotNull(collection);
        if (!(collection instanceof IntArrayList)) {
            return super.addAll(collection);
        }
        IntArrayList intArrayList = (IntArrayList) collection;
        int i14 = intArrayList.size;
        if (i14 == 0) {
            return false;
        }
        int i15 = this.size;
        if (Integer.MAX_VALUE - i15 < i14) {
            a.b();
            return false;
        }
        int i16 = i15 + i14;
        int[] iArr = this.array;
        if (i16 > iArr.length) {
            this.array = Arrays.copyOf(iArr, i16);
        }
        System.arraycopy(intArrayList.array, 0, this.array, this.size, intArrayList.size);
        this.size = i16;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IntArrayList)) {
            return super.equals(obj);
        }
        IntArrayList intArrayList = (IntArrayList) obj;
        if (this.size != intArrayList.size) {
            return false;
        }
        int[] iArr = intArrayList.array;
        for (int i14 = 0; i14 < this.size; i14++) {
            if (this.array[i14] != iArr[i14]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public Integer get(int i14) {
        return Integer.valueOf(getInt(i14));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Internal.IntList
    public int getInt(int i14) {
        ensureIndexInRange(i14);
        return this.array[i14];
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i14 = 1;
        for (int i15 = 0; i15 < this.size; i15++) {
            i14 = (i14 * 31) + this.array[i15];
        }
        return i14;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList, com.google.crypto.tink.shaded.protobuf.Internal.BooleanList
    /* JADX INFO: renamed from: mutableCopyWithCapacity */
    public Internal.ProtobufList<Integer> mutableCopyWithCapacity2(int i14) {
        if (i14 >= this.size) {
            return new IntArrayList(Arrays.copyOf(this.array, i14), this.size);
        }
        h.w();
        return null;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        ensureIsMutable();
        for (int i14 = 0; i14 < this.size; i14++) {
            if (obj.equals(Integer.valueOf(this.array[i14]))) {
                int[] iArr = this.array;
                System.arraycopy(iArr, i14 + 1, iArr, i14, (this.size - i14) - 1);
                this.size--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList
    public void removeRange(int i14, int i15) {
        ensureIsMutable();
        if (i15 < i14) {
            e.v("toIndex < fromIndex");
            return;
        }
        int[] iArr = this.array;
        System.arraycopy(iArr, i15, iArr, i14, this.size - i15);
        this.size -= i15 - i14;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public Integer set(int i14, Integer num) {
        return Integer.valueOf(setInt(i14, num.intValue()));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Internal.IntList
    public int setInt(int i14, int i15) {
        ensureIsMutable();
        ensureIndexInRange(i14);
        int[] iArr = this.array;
        int i16 = iArr[i14];
        iArr[i14] = i15;
        return i16;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.size;
    }

    private IntArrayList(int[] iArr, int i14) {
        this.array = iArr;
        this.size = i14;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public void add(int i14, Integer num) {
        addInt(i14, num.intValue());
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public Integer remove(int i14) {
        ensureIsMutable();
        ensureIndexInRange(i14);
        int[] iArr = this.array;
        int i15 = iArr[i14];
        int i16 = this.size;
        if (i14 < i16 - 1) {
            System.arraycopy(iArr, i14 + 1, iArr, i14, (i16 - i14) - 1);
        }
        this.size--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i15);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Internal.IntList
    public void addInt(int i14) {
        ensureIsMutable();
        int i15 = this.size;
        int[] iArr = this.array;
        if (i15 == iArr.length) {
            int[] iArr2 = new int[j.a(i15, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i15);
            this.array = iArr2;
        }
        int[] iArr3 = this.array;
        int i16 = this.size;
        this.size = i16 + 1;
        iArr3[i16] = i14;
    }
}
