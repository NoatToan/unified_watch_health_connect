package com.google.common.collect;

import defpackage.c6i;
import defpackage.cpd;
import defpackage.d44;
import defpackage.t3h;
import defpackage.uaq;
import defpackage.x00;
import defpackage.xhe;
import defpackage.zaq;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes5.dex */
public abstract class ImmutableList<E> extends ImmutableCollection<E> implements List<E>, RandomAccess {
    private static final zaq<Object> EMPTY_ITR = new b(z.c, 0);

    public static final class a<E> extends ImmutableCollection.a<E> {
        public a() {
            this(4);
        }

        @Override // com.google.common.collect.ImmutableCollection.b
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public a<E> a(E e) {
            super.f(e);
            return this;
        }

        public a<E> j(Iterator<? extends E> it) {
            super.d(it);
            return this;
        }

        public ImmutableList<E> k() {
            this.c = true;
            return ImmutableList.asImmutableList(this.f9021a, this.f9022b);
        }

        public a(int i) {
            super(i);
        }
    }

    public static class b<E> extends x00<E> {
        public final ImmutableList<E> c;

        public b(ImmutableList<E> immutableList, int i) {
            super(immutableList.size(), i);
            this.c = immutableList;
        }

        @Override // defpackage.x00
        public E a(int i) {
            return this.c.get(i);
        }
    }

    public static class c<E> extends ImmutableList<E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final transient ImmutableList<E> f9023a;

        public c(ImmutableList<E> immutableList) {
            this.f9023a = immutableList;
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return this.f9023a.contains(obj);
        }

        public final int e(int i) {
            return (size() - 1) - i;
        }

        public final int f(int i) {
            return size() - i;
        }

        @Override // java.util.List
        public E get(int i) {
            c6i.m(i, size());
            return this.f9023a.get(e(i));
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public int indexOf(Object obj) {
            int iLastIndexOf = this.f9023a.lastIndexOf(obj);
            if (iLastIndexOf >= 0) {
                return e(iLastIndexOf);
            }
            return -1;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public boolean isPartialView() {
            return this.f9023a.isPartialView();
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public int lastIndexOf(Object obj) {
            int iIndexOf = this.f9023a.indexOf(obj);
            if (iIndexOf >= 0) {
                return e(iIndexOf);
            }
            return -1;
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return super.listIterator();
        }

        @Override // com.google.common.collect.ImmutableList
        public ImmutableList<E> reverse() {
            return this.f9023a;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f9023a.size();
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
            return super.listIterator(i);
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public ImmutableList<E> subList(int i, int i2) {
            c6i.s(i, i2, size());
            return this.f9023a.subList(f(i2), f(i)).reverse();
        }
    }

    public static class d implements Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object[] f9024a;

        public d(Object[] objArr) {
            this.f9024a = objArr;
        }

        public Object readResolve() {
            return ImmutableList.copyOf(this.f9024a);
        }
    }

    public class e extends ImmutableList<E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final transient int f9025a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final transient int f9026b;

        public e(int i, int i2) {
            this.f9025a = i;
            this.f9026b = i2;
        }

        @Override // java.util.List
        public E get(int i) {
            c6i.m(i, this.f9026b);
            return ImmutableList.this.get(i + this.f9025a);
        }

        @Override // com.google.common.collect.ImmutableCollection
        public Object[] internalArray() {
            return ImmutableList.this.internalArray();
        }

        @Override // com.google.common.collect.ImmutableCollection
        public int internalArrayEnd() {
            return ImmutableList.this.internalArrayStart() + this.f9025a + this.f9026b;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public int internalArrayStart() {
            return ImmutableList.this.internalArrayStart() + this.f9025a;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public boolean isPartialView() {
            return true;
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return super.listIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f9026b;
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
            return super.listIterator(i);
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public ImmutableList<E> subList(int i, int i2) {
            c6i.s(i, i2, this.f9026b);
            ImmutableList immutableList = ImmutableList.this;
            int i3 = this.f9025a;
            return immutableList.subList(i + i3, i2 + i3);
        }
    }

    public static <E> ImmutableList<E> asImmutableList(Object[] objArr) {
        return asImmutableList(objArr, objArr.length);
    }

    public static <E> a<E> builder() {
        return new a<>();
    }

    public static <E> a<E> builderWithExpectedSize(int i) {
        d44.b(i, "expectedSize");
        return new a<>(i);
    }

    private static <E> ImmutableList<E> construct(Object... objArr) {
        return asImmutableList(t3h.b(objArr));
    }

    public static <E> ImmutableList<E> copyOf(Iterable<? extends E> iterable) {
        c6i.o(iterable);
        return iterable instanceof Collection ? copyOf((Collection) iterable) : copyOf(iterable.iterator());
    }

    public static <E> ImmutableList<E> of() {
        return (ImmutableList<E>) z.c;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static <E extends Comparable<? super E>> ImmutableList<E> sortedCopyOf(Iterable<? extends E> iterable) {
        Comparable[] comparableArr = (Comparable[]) cpd.l(iterable, new Comparable[0]);
        t3h.b(comparableArr);
        Arrays.sort(comparableArr);
        return asImmutableList(comparableArr);
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i, E e2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ImmutableCollection
    @Deprecated
    public final ImmutableList<E> asList() {
        return this;
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public int copyIntoArray(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        return xhe.b(this, obj);
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = ~(~((i * 31) + get(i2).hashCode()));
        }
        return i;
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return xhe.c(this, obj);
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return xhe.e(this, obj);
    }

    @Override // java.util.List
    public zaq<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    @Deprecated
    public final E remove(int i) {
        throw new UnsupportedOperationException();
    }

    public ImmutableList<E> reverse() {
        return size() <= 1 ? this : new c(this);
    }

    @Override // java.util.List
    @Deprecated
    public final E set(int i, E e2) {
        throw new UnsupportedOperationException();
    }

    public ImmutableList<E> subListUnchecked(int i, int i2) {
        return new e(i, i2 - i);
    }

    @Override // com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return new d(toArray());
    }

    public static <E> ImmutableList<E> asImmutableList(Object[] objArr, int i) {
        return i == 0 ? of() : new z(objArr, i);
    }

    public static <E> ImmutableList<E> of(E e2) {
        return construct(e2);
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public uaq<E> iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public ImmutableList<E> subList(int i, int i2) {
        c6i.s(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        return i3 == 0 ? of() : subListUnchecked(i, i2);
    }

    public static <E> ImmutableList<E> of(E e2, E e3) {
        return construct(e2, e3);
    }

    public static <E> ImmutableList<E> of(E e2, E e3, E e4) {
        return construct(e2, e3, e4);
    }

    public static <E> ImmutableList<E> copyOf(Collection<? extends E> collection) {
        if (collection instanceof ImmutableCollection) {
            ImmutableList<E> immutableListAsList = ((ImmutableCollection) collection).asList();
            return immutableListAsList.isPartialView() ? asImmutableList(immutableListAsList.toArray()) : immutableListAsList;
        }
        return construct(collection.toArray());
    }

    public static <E> ImmutableList<E> of(E e2, E e3, E e4, E e5) {
        return construct(e2, e3, e4, e5);
    }

    public static <E> ImmutableList<E> sortedCopyOf(Comparator<? super E> comparator, Iterable<? extends E> iterable) {
        c6i.o(comparator);
        Object[] objArrK = cpd.k(iterable);
        t3h.b(objArrK);
        Arrays.sort(objArrK, comparator);
        return asImmutableList(objArrK);
    }

    @Override // java.util.List
    public zaq<E> listIterator(int i) {
        c6i.q(i, size());
        if (isEmpty()) {
            return (zaq<E>) EMPTY_ITR;
        }
        return new b(this, i);
    }

    public static <E> ImmutableList<E> of(E e2, E e3, E e4, E e5, E e6) {
        return construct(e2, e3, e4, e5, e6);
    }

    public static <E> ImmutableList<E> of(E e2, E e3, E e4, E e5, E e6, E e7) {
        return construct(e2, e3, e4, e5, e6, e7);
    }

    public static <E> ImmutableList<E> of(E e2, E e3, E e4, E e5, E e6, E e7, E e8) {
        return construct(e2, e3, e4, e5, e6, e7, e8);
    }

    public static <E> ImmutableList<E> copyOf(Iterator<? extends E> it) {
        if (!it.hasNext()) {
            return of();
        }
        E next = it.next();
        if (!it.hasNext()) {
            return of((Object) next);
        }
        return new a().a(next).j(it).k();
    }

    public static <E> ImmutableList<E> of(E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9) {
        return construct(e2, e3, e4, e5, e6, e7, e8, e9);
    }

    public static <E> ImmutableList<E> of(E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9, E e10) {
        return construct(e2, e3, e4, e5, e6, e7, e8, e9, e10);
    }

    public static <E> ImmutableList<E> of(E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9, E e10, E e11) {
        return construct(e2, e3, e4, e5, e6, e7, e8, e9, e10, e11);
    }

    public static <E> ImmutableList<E> of(E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9, E e10, E e11, E e12) {
        return construct(e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12);
    }

    @SafeVarargs
    public static <E> ImmutableList<E> of(E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9, E e10, E e11, E e12, E e13, E... eArr) {
        c6i.e(eArr.length <= 2147483635, "the total number of elements must fit in an int");
        Object[] objArr = new Object[eArr.length + 12];
        objArr[0] = e2;
        objArr[1] = e3;
        objArr[2] = e4;
        objArr[3] = e5;
        objArr[4] = e6;
        objArr[5] = e7;
        objArr[6] = e8;
        objArr[7] = e9;
        objArr[8] = e10;
        objArr[9] = e11;
        objArr[10] = e12;
        objArr[11] = e13;
        System.arraycopy(eArr, 0, objArr, 12, eArr.length);
        return construct(objArr);
    }

    public static <E> ImmutableList<E> copyOf(E[] eArr) {
        if (eArr.length == 0) {
            return of();
        }
        return construct((Object[]) eArr.clone());
    }
}
