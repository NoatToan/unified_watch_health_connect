package kotlin.collections.builders;

import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.collections.AbstractList;
import kotlin.collections.AbstractMutableList;
import kotlin.collections.ArrayDeque;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableList;
import kotlin.jvm.internal.markers.KMutableListIterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
public final class ListBuilder<E> extends AbstractMutableList<E> implements List<E>, RandomAccess, Serializable, KMutableList {

    @NotNull
    private E[] a;
    private int b;
    private int c;
    private boolean d;

    @Nullable
    private final ListBuilder<E> e;

    @Nullable
    private final ListBuilder<E> f;

    public static final class a<E> implements ListIterator<E>, KMutableListIterator {

        @NotNull
        private final ListBuilder<E> a;
        private int b;
        private int c = -1;

        public a(@NotNull ListBuilder<E> listBuilder, int i) {
            this.a = listBuilder;
            this.b = i;
        }

        @Override // java.util.ListIterator
        public void add(E e) {
            ListBuilder<E> listBuilder = this.a;
            int i = this.b;
            this.b = i + 1;
            listBuilder.add(i, e);
            this.c = -1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.b < ((ListBuilder) this.a).c;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.b > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public E next() {
            if (this.b >= ((ListBuilder) this.a).c) {
                throw new NoSuchElementException();
            }
            int i = this.b;
            this.b = i + 1;
            this.c = i;
            return (E) ((ListBuilder) this.a).a[((ListBuilder) this.a).b + this.c];
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.b;
        }

        @Override // java.util.ListIterator
        public E previous() {
            int i = this.b;
            if (i <= 0) {
                throw new NoSuchElementException();
            }
            int i2 = i - 1;
            this.b = i2;
            this.c = i2;
            return (E) ((ListBuilder) this.a).a[((ListBuilder) this.a).b + this.c];
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.b - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            int i = this.c;
            if (!(i != -1)) {
                throw new IllegalStateException("Call next() or previous() before removing element from the iterator.".toString());
            }
            this.a.remove(i);
            this.b = this.c;
            this.c = -1;
        }

        @Override // java.util.ListIterator
        public void set(E e) {
            int i = this.c;
            if (!(i != -1)) {
                throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.".toString());
            }
            this.a.set(i, e);
        }
    }

    private ListBuilder(E[] eArr, int i, int i2, boolean z, ListBuilder<E> listBuilder, ListBuilder<E> listBuilder2) {
        this.a = eArr;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = listBuilder;
        this.f = listBuilder2;
    }

    private final void a(int i, Collection<? extends E> collection, int i2) {
        ListBuilder<E> listBuilder = this.e;
        if (listBuilder != null) {
            listBuilder.a(i, collection, i2);
            this.a = this.e.a;
            this.c += i2;
        } else {
            i(i, i2);
            Iterator<? extends E> it2 = collection.iterator();
            for (int i3 = 0; i3 < i2; i3++) {
                this.a[i + i3] = it2.next();
            }
        }
    }

    private final void c(int i, E e) {
        ListBuilder<E> listBuilder = this.e;
        if (listBuilder == null) {
            i(i, 1);
            this.a[i] = e;
        } else {
            listBuilder.c(i, e);
            this.a = this.e.a;
            this.c++;
        }
    }

    private final void e() {
        if (j()) {
            throw new UnsupportedOperationException();
        }
    }

    private final boolean f(List<?> list) {
        return ListBuilderKt.a(this.a, this.b, this.c, list);
    }

    private final void g(int i) {
        if (this.e != null) {
            throw new IllegalStateException();
        }
        if (i < 0) {
            throw new OutOfMemoryError();
        }
        E[] eArr = this.a;
        if (i > eArr.length) {
            this.a = (E[]) ListBuilderKt.copyOfUninitializedElements(this.a, ArrayDeque.Companion.newCapacity$kotlin_stdlib(eArr.length, i));
        }
    }

    private final void h(int i) {
        g(this.c + i);
    }

    private final void i(int i, int i2) {
        h(i2);
        E[] eArr = this.a;
        ArraysKt.copyInto(eArr, eArr, i + i2, i, this.b + this.c);
        this.c += i2;
    }

    private final boolean j() {
        ListBuilder<E> listBuilder;
        return this.d || ((listBuilder = this.f) != null && listBuilder.d);
    }

    private final E k(int i) {
        ListBuilder<E> listBuilder = this.e;
        if (listBuilder != null) {
            E eK = listBuilder.k(i);
            this.c--;
            return eK;
        }
        E[] eArr = this.a;
        E e = eArr[i];
        ArraysKt.copyInto(eArr, eArr, i, i + 1, this.b + this.c);
        ListBuilderKt.resetAt(this.a, (this.b + this.c) - 1);
        this.c--;
        return e;
    }

    private final void m(int i, int i2) {
        ListBuilder<E> listBuilder = this.e;
        if (listBuilder != null) {
            listBuilder.m(i, i2);
        } else {
            E[] eArr = this.a;
            ArraysKt.copyInto(eArr, eArr, i, i + i2, this.c);
            E[] eArr2 = this.a;
            int i3 = this.c;
            ListBuilderKt.resetRange(eArr2, i3 - i2, i3);
        }
        this.c -= i2;
    }

    private final int n(int i, int i2, Collection<? extends E> collection, boolean z) {
        ListBuilder<E> listBuilder = this.e;
        if (listBuilder != null) {
            int iN = listBuilder.n(i, i2, collection, z);
            this.c -= iN;
            return iN;
        }
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            int i5 = i + i3;
            if (collection.contains(this.a[i5]) == z) {
                E[] eArr = this.a;
                i3++;
                eArr[i4 + i] = eArr[i5];
                i4++;
            } else {
                i3++;
            }
        }
        int i6 = i2 - i4;
        E[] eArr2 = this.a;
        ArraysKt.copyInto(eArr2, eArr2, i + i4, i2 + i, this.c);
        E[] eArr3 = this.a;
        int i7 = this.c;
        ListBuilderKt.resetRange(eArr3, i7 - i6, i7);
        this.c -= i6;
        return i6;
    }

    private final Object writeReplace() throws NotSerializableException {
        if (j()) {
            return new SerializedCollection(this, 0);
        }
        throw new NotSerializableException("The list cannot be serialized while it is being built.");
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e) {
        e();
        c(this.b + this.c, e);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(@NotNull Collection<? extends E> collection) {
        e();
        int size = collection.size();
        a(this.b + this.c, collection, size);
        return size > 0;
    }

    @NotNull
    public final List<E> build() {
        if (this.e != null) {
            throw new IllegalStateException();
        }
        e();
        this.d = true;
        return this;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        e();
        m(this.b, this.c);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(@Nullable Object obj) {
        return obj == this || ((obj instanceof List) && f((List) obj));
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i) {
        AbstractList.Companion.checkElementIndex$kotlin_stdlib(i, this.c);
        return this.a[this.b + i];
    }

    @Override // kotlin.collections.AbstractMutableList
    public int getSize() {
        return this.c;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        return ListBuilderKt.b(this.a, this.b, this.c);
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        for (int i = 0; i < this.c; i++) {
            if (Intrinsics.areEqual(this.a[this.b + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return this.c == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    @NotNull
    public Iterator<E> iterator() {
        return new a(this, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        for (int i = this.c - 1; i >= 0; i--) {
            if (Intrinsics.areEqual(this.a[this.b + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    @NotNull
    public ListIterator<E> listIterator() {
        return new a(this, 0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        e();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            remove(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(@NotNull Collection<? extends Object> collection) {
        e();
        return n(this.b, this.c, collection, false) > 0;
    }

    @Override // kotlin.collections.AbstractMutableList
    public E removeAt(int i) {
        e();
        AbstractList.Companion.checkElementIndex$kotlin_stdlib(i, this.c);
        return k(this.b + i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(@NotNull Collection<? extends Object> collection) {
        e();
        return n(this.b, this.c, collection, true) > 0;
    }

    @Override // kotlin.collections.AbstractMutableList, java.util.AbstractList, java.util.List
    public E set(int i, E e) {
        e();
        AbstractList.Companion.checkElementIndex$kotlin_stdlib(i, this.c);
        E[] eArr = this.a;
        int i2 = this.b;
        E e2 = eArr[i2 + i];
        eArr[i2 + i] = e;
        return e2;
    }

    @Override // java.util.AbstractList, java.util.List
    @NotNull
    public List<E> subList(int i, int i2) {
        AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(i, i2, this.c);
        E[] eArr = this.a;
        int i3 = this.b + i;
        int i4 = i2 - i;
        boolean z = this.d;
        ListBuilder<E> listBuilder = this.f;
        return new ListBuilder(eArr, i3, i4, z, this, listBuilder == null ? this : listBuilder);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @NotNull
    public <T> T[] toArray(@NotNull T[] tArr) {
        int length = tArr.length;
        int i = this.c;
        if (length < i) {
            E[] eArr = this.a;
            int i2 = this.b;
            return (T[]) Arrays.copyOfRange(eArr, i2, i + i2, tArr.getClass());
        }
        E[] eArr2 = this.a;
        int i3 = this.b;
        ArraysKt.copyInto(eArr2, tArr, 0, i3, i + i3);
        int length2 = tArr.length;
        int i4 = this.c;
        if (length2 > i4) {
            tArr[i4] = null;
        }
        return tArr;
    }

    @Override // java.util.AbstractCollection
    @NotNull
    public String toString() {
        return ListBuilderKt.c(this.a, this.b, this.c);
    }

    @Override // java.util.AbstractList, java.util.List
    @NotNull
    public ListIterator<E> listIterator(int i) {
        AbstractList.Companion.checkPositionIndex$kotlin_stdlib(i, this.c);
        return new a(this, i);
    }

    @Override // kotlin.collections.AbstractMutableList, java.util.AbstractList, java.util.List
    public void add(int i, E e) {
        e();
        AbstractList.Companion.checkPositionIndex$kotlin_stdlib(i, this.c);
        c(this.b + i, e);
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i, @NotNull Collection<? extends E> collection) {
        e();
        AbstractList.Companion.checkPositionIndex$kotlin_stdlib(i, this.c);
        int size = collection.size();
        a(this.b + i, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @NotNull
    public Object[] toArray() {
        E[] eArr = this.a;
        int i = this.b;
        return ArraysKt.copyOfRange(eArr, i, this.c + i);
    }

    public ListBuilder() {
        this(10);
    }

    public ListBuilder(int i) {
        this(ListBuilderKt.arrayOfUninitializedElements(i), 0, 0, false, null, null);
    }
}
