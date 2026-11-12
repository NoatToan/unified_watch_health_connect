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
final class LongArrayList extends AbstractProtobufList<Long> implements Internal.LongList, RandomAccess, PrimitiveNonBoxingCollection {
    private static final LongArrayList EMPTY_LIST;
    private long[] array;
    private int size;

    static {
        LongArrayList longArrayList = new LongArrayList(new long[0], 0);
        EMPTY_LIST = longArrayList;
        longArrayList.makeImmutable();
    }

    public LongArrayList() {
        this(new long[10], 0);
    }

    private void addLong(int i14, long j8) {
        int i15;
        ensureIsMutable();
        if (i14 < 0 || i14 > (i15 = this.size)) {
            e.v(makeOutOfBoundsExceptionMessage(i14));
            return;
        }
        long[] jArr = this.array;
        if (i15 < jArr.length) {
            System.arraycopy(jArr, i14, jArr, i14 + 1, i15 - i14);
        } else {
            long[] jArr2 = new long[j.a(i15, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i14);
            System.arraycopy(this.array, i14, jArr2, i14 + 1, this.size - i14);
            this.array = jArr2;
        }
        this.array[i14] = j8;
        this.size++;
        ((AbstractList) this).modCount++;
    }

    public static LongArrayList emptyList() {
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
    public boolean add(Long l14) {
        addLong(l14.longValue());
        return true;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Long> collection) {
        ensureIsMutable();
        Internal.checkNotNull(collection);
        if (!(collection instanceof LongArrayList)) {
            return super.addAll(collection);
        }
        LongArrayList longArrayList = (LongArrayList) collection;
        int i14 = longArrayList.size;
        if (i14 == 0) {
            return false;
        }
        int i15 = this.size;
        if (Integer.MAX_VALUE - i15 < i14) {
            a.b();
            return false;
        }
        int i16 = i15 + i14;
        long[] jArr = this.array;
        if (i16 > jArr.length) {
            this.array = Arrays.copyOf(jArr, i16);
        }
        System.arraycopy(longArrayList.array, 0, this.array, this.size, longArrayList.size);
        this.size = i16;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LongArrayList)) {
            return super.equals(obj);
        }
        LongArrayList longArrayList = (LongArrayList) obj;
        if (this.size != longArrayList.size) {
            return false;
        }
        long[] jArr = longArrayList.array;
        for (int i14 = 0; i14 < this.size; i14++) {
            if (this.array[i14] != jArr[i14]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public Long get(int i14) {
        return Long.valueOf(getLong(i14));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Internal.LongList
    public long getLong(int i14) {
        ensureIndexInRange(i14);
        return this.array[i14];
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iHashLong = 1;
        for (int i14 = 0; i14 < this.size; i14++) {
            iHashLong = (iHashLong * 31) + Internal.hashLong(this.array[i14]);
        }
        return iHashLong;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList, com.google.crypto.tink.shaded.protobuf.Internal.BooleanList
    /* JADX INFO: renamed from: mutableCopyWithCapacity */
    public Internal.ProtobufList<Long> mutableCopyWithCapacity2(int i14) {
        if (i14 >= this.size) {
            return new LongArrayList(Arrays.copyOf(this.array, i14), this.size);
        }
        h.w();
        return null;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        ensureIsMutable();
        for (int i14 = 0; i14 < this.size; i14++) {
            if (obj.equals(Long.valueOf(this.array[i14]))) {
                long[] jArr = this.array;
                System.arraycopy(jArr, i14 + 1, jArr, i14, (this.size - i14) - 1);
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
        long[] jArr = this.array;
        System.arraycopy(jArr, i15, jArr, i14, this.size - i15);
        this.size -= i15 - i14;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public Long set(int i14, Long l14) {
        return Long.valueOf(setLong(i14, l14.longValue()));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Internal.LongList
    public long setLong(int i14, long j8) {
        ensureIsMutable();
        ensureIndexInRange(i14);
        long[] jArr = this.array;
        long j14 = jArr[i14];
        jArr[i14] = j8;
        return j14;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.size;
    }

    private LongArrayList(long[] jArr, int i14) {
        this.array = jArr;
        this.size = i14;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public void add(int i14, Long l14) {
        addLong(i14, l14.longValue());
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public Long remove(int i14) {
        ensureIsMutable();
        ensureIndexInRange(i14);
        long[] jArr = this.array;
        long j8 = jArr[i14];
        int i15 = this.size;
        if (i14 < i15 - 1) {
            System.arraycopy(jArr, i14 + 1, jArr, i14, (i15 - i14) - 1);
        }
        this.size--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j8);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Internal.LongList
    public void addLong(long j8) {
        ensureIsMutable();
        int i14 = this.size;
        long[] jArr = this.array;
        if (i14 == jArr.length) {
            long[] jArr2 = new long[j.a(i14, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i14);
            this.array = jArr2;
        }
        long[] jArr3 = this.array;
        int i15 = this.size;
        this.size = i15 + 1;
        jArr3[i15] = j8;
    }
}
