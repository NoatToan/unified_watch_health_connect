package com.google.crypto.tink.shaded.protobuf;

import androidx.core.view.j;
import b71.i;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;
import org.apache.commons.lang3.e;
import vb.h;

/* JADX INFO: loaded from: classes2.dex */
final class ProtobufArrayList<E> extends AbstractProtobufList<E> implements RandomAccess {
    private static final ProtobufArrayList<Object> EMPTY_LIST;
    private E[] array;
    private int size;

    static {
        ProtobufArrayList<Object> protobufArrayList = new ProtobufArrayList<>(new Object[0], 0);
        EMPTY_LIST = protobufArrayList;
        protobufArrayList.makeImmutable();
    }

    public ProtobufArrayList() {
        this(new Object[10], 0);
    }

    private static <E> E[] createArray(int i14) {
        return (E[]) new Object[i14];
    }

    public static <E> ProtobufArrayList<E> emptyList() {
        return (ProtobufArrayList<E>) EMPTY_LIST;
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

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public void add(int i14, E e4) {
        int i15;
        ensureIsMutable();
        if (i14 < 0 || i14 > (i15 = this.size)) {
            e.v(makeOutOfBoundsExceptionMessage(i14));
            return;
        }
        E[] eArr = this.array;
        if (i15 < eArr.length) {
            System.arraycopy(eArr, i14, eArr, i14 + 1, i15 - i14);
        } else {
            E[] eArr2 = (E[]) createArray(j.a(i15, 3, 2, 1));
            System.arraycopy(this.array, 0, eArr2, 0, i14);
            System.arraycopy(this.array, i14, eArr2, i14 + 1, this.size - i14);
            this.array = eArr2;
        }
        this.array[i14] = e4;
        this.size++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i14) {
        ensureIndexInRange(i14);
        return this.array[i14];
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList, com.google.crypto.tink.shaded.protobuf.Internal.BooleanList
    public ProtobufArrayList<E> mutableCopyWithCapacity(int i14) {
        if (i14 >= this.size) {
            return new ProtobufArrayList<>(Arrays.copyOf(this.array, i14), this.size);
        }
        h.w();
        return null;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public E remove(int i14) {
        ensureIsMutable();
        ensureIndexInRange(i14);
        E[] eArr = this.array;
        E e4 = eArr[i14];
        int i15 = this.size;
        if (i14 < i15 - 1) {
            System.arraycopy(eArr, i14 + 1, eArr, i14, (i15 - i14) - 1);
        }
        this.size--;
        ((AbstractList) this).modCount++;
        return e4;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public E set(int i14, E e4) {
        ensureIsMutable();
        ensureIndexInRange(i14);
        E[] eArr = this.array;
        E e14 = eArr[i14];
        eArr[i14] = e4;
        ((AbstractList) this).modCount++;
        return e14;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.size;
    }

    private ProtobufArrayList(E[] eArr, int i14) {
        this.array = eArr;
        this.size = i14;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e4) {
        ensureIsMutable();
        int i14 = this.size;
        E[] eArr = this.array;
        if (i14 == eArr.length) {
            this.array = (E[]) Arrays.copyOf(eArr, ((i14 * 3) / 2) + 1);
        }
        E[] eArr2 = this.array;
        int i15 = this.size;
        this.size = i15 + 1;
        eArr2[i15] = e4;
        ((AbstractList) this).modCount++;
        return true;
    }
}
