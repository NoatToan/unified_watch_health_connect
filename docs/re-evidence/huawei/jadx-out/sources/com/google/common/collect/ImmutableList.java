package com.google.common.collect;

import com.google.common.base.Preconditions;
import defpackage.ajz;
import defpackage.ale;
import defpackage.aml;
import defpackage.amn;
import defpackage.amu;
import defpackage.anc;
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
import java.util.stream.Collector;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public abstract class ImmutableList<E> extends ImmutableCollection<E> implements List<E>, RandomAccess {
    private static final UnmodifiableListIterator<Object> EMPTY_ITR = new b(anc.e, 0);
    private static final long serialVersionUID = -889275714;

    @Override // com.google.common.collect.ImmutableCollection
    @Deprecated
    public final ImmutableList<E> asList() {
        return this;
    }

    static <E> Collector<E, ?, ImmutableList<E>> toImmutableList() {
        return ajz.e();
    }

    public static <E> ImmutableList<E> of() {
        return (ImmutableList<E>) anc.e;
    }

    public static <E> ImmutableList<E> of(E e2) {
        return construct(e2);
    }

    public static <E> ImmutableList<E> of(E e2, E e3) {
        return construct(e2, e3);
    }

    public static <E> ImmutableList<E> of(E e2, E e3, E e4) {
        return construct(e2, e3, e4);
    }

    public static <E> ImmutableList<E> of(E e2, E e3, E e4, E e5) {
        return construct(e2, e3, e4, e5);
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
        Preconditions.checkArgument(eArr.length <= 2147483635, "the total number of elements must fit in an int");
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

    public static <E> ImmutableList<E> copyOf(Iterable<? extends E> iterable) {
        Preconditions.checkNotNull(iterable);
        if (iterable instanceof Collection) {
            return copyOf((Collection) iterable);
        }
        return copyOf(iterable.iterator());
    }

    public static <E> ImmutableList<E> copyOf(Collection<? extends E> collection) {
        if (collection instanceof ImmutableCollection) {
            ImmutableList<E> immutableListAsList = ((ImmutableCollection) collection).asList();
            return immutableListAsList.isPartialView() ? asImmutableList(immutableListAsList.toArray()) : immutableListAsList;
        }
        return construct(collection.toArray());
    }

    public static <E> ImmutableList<E> copyOf(Iterator<? extends E> it) {
        if (!it.hasNext()) {
            return of();
        }
        E next = it.next();
        if (!it.hasNext()) {
            return of((Object) next);
        }
        return new c().add(next).addAll(it).build();
    }

    public static <E> ImmutableList<E> copyOf(E[] eArr) {
        if (eArr.length == 0) {
            return of();
        }
        return construct((Object[]) eArr.clone());
    }

    public static <E extends Comparable<? super E>> ImmutableList<E> sortedCopyOf(Iterable<? extends E> iterable) {
        Comparable[] comparableArr = (Comparable[]) amn.a((Iterable) iterable, (Object[]) new Comparable[0]);
        amu.e(comparableArr);
        Arrays.sort(comparableArr);
        return asImmutableList(comparableArr);
    }

    public static <E> ImmutableList<E> sortedCopyOf(Comparator<? super E> comparator, Iterable<? extends E> iterable) {
        Preconditions.checkNotNull(comparator);
        Object[] objArrE = amn.e(iterable);
        amu.e(objArrE);
        Arrays.sort(objArrE, comparator);
        return asImmutableList(objArrE);
    }

    private static <E> ImmutableList<E> construct(Object... objArr) {
        return asImmutableList(amu.e(objArr));
    }

    public static <E> ImmutableList<E> asImmutableList(Object[] objArr) {
        return asImmutableList(objArr, objArr.length);
    }

    public static <E> ImmutableList<E> asImmutableList(Object[] objArr, int i) {
        if (i == 0) {
            return of();
        }
        return new anc(objArr, i);
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
    public UnmodifiableIterator<E> iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public UnmodifiableListIterator<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public UnmodifiableListIterator<E> listIterator(int i) {
        Preconditions.checkPositionIndex(i, size());
        if (isEmpty()) {
            return (UnmodifiableListIterator<E>) EMPTY_ITR;
        }
        return new b(this, i);
    }

    static class b<E> extends AbstractIndexedListIterator<E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ImmutableList<E> f4355a;

        b(ImmutableList<E> immutableList, int i) {
            super(immutableList.size(), i);
            this.f4355a = immutableList;
        }

        @Override // com.google.common.collect.AbstractIndexedListIterator
        protected E get(int i) {
            return this.f4355a.get(i);
        }
    }

    @Override // java.util.List
    public int indexOf(@CheckForNull Object obj) {
        if (obj == null) {
            return -1;
        }
        return aml.e(this, obj);
    }

    @Override // java.util.List
    public int lastIndexOf(@CheckForNull Object obj) {
        if (obj == null) {
            return -1;
        }
        return aml.c(this, obj);
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@CheckForNull Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.List
    public ImmutableList<E> subList(int i, int i2) {
        Preconditions.checkPositionIndexes(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 == 0) {
            return of();
        }
        return subListUnchecked(i, i2);
    }

    ImmutableList<E> subListUnchecked(int i, int i2) {
        return new e(i, i2 - i);
    }

    class e extends ImmutableList<E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final transient int f4356a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final transient int f4357b;

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.ImmutableCollection
        public boolean isPartialView() {
            return true;
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return super.listIterator();
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
            return super.listIterator(i);
        }

        e(int i, int i2) {
            this.f4357b = i;
            this.f4356a = i2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f4356a;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.ImmutableCollection
        @CheckForNull
        public Object[] internalArray() {
            return ImmutableList.this.internalArray();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.ImmutableCollection
        public int internalArrayStart() {
            return ImmutableList.this.internalArrayStart() + this.f4357b;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.ImmutableCollection
        public int internalArrayEnd() {
            return ImmutableList.this.internalArrayStart() + this.f4357b + this.f4356a;
        }

        @Override // java.util.List
        public E get(int i) {
            Preconditions.checkElementIndex(i, this.f4356a);
            return ImmutableList.this.get(i + this.f4357b);
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public ImmutableList<E> subList(int i, int i2) {
            Preconditions.checkPositionIndexes(i, i2, this.f4356a);
            ImmutableList immutableList = ImmutableList.this;
            int i3 = this.f4357b;
            return immutableList.subList(i + i3, i2 + i3);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final E set(int i, E e2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i, E e2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final E remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ImmutableCollection
    public int copyIntoArray(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    public ImmutableList<E> reverse() {
        return size() <= 1 ? this : new a(this);
    }

    /* JADX INFO: loaded from: classes21.dex */
    static class a<E> extends ImmutableList<E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final transient ImmutableList<E> f4354a;

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return super.listIterator();
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
            return super.listIterator(i);
        }

        a(ImmutableList<E> immutableList) {
            this.f4354a = immutableList;
        }

        private int d(int i) {
            return (size() - 1) - i;
        }

        private int c(int i) {
            return size() - i;
        }

        @Override // com.google.common.collect.ImmutableList
        public ImmutableList<E> reverse() {
            return this.f4354a;
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object obj) {
            return this.f4354a.contains(obj);
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public int indexOf(@CheckForNull Object obj) {
            int iLastIndexOf = this.f4354a.lastIndexOf(obj);
            if (iLastIndexOf >= 0) {
                return d(iLastIndexOf);
            }
            return -1;
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public int lastIndexOf(@CheckForNull Object obj) {
            int iIndexOf = this.f4354a.indexOf(obj);
            if (iIndexOf >= 0) {
                return d(iIndexOf);
            }
            return -1;
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public ImmutableList<E> subList(int i, int i2) {
            Preconditions.checkPositionIndexes(i, i2, size());
            return this.f4354a.subList(c(i2), c(i)).reverse();
        }

        @Override // java.util.List
        public E get(int i) {
            Preconditions.checkElementIndex(i, size());
            return this.f4354a.get(d(i));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f4354a.size();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.ImmutableCollection
        public boolean isPartialView() {
            return this.f4354a.isPartialView();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(@CheckForNull Object obj) {
        return aml.a(this, obj);
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

    /* JADX INFO: loaded from: classes21.dex */
    static class d implements Serializable {
        private static final long serialVersionUID = 0;
        final Object[] e;

        d(Object[] objArr) {
            this.e = objArr;
        }

        Object readResolve() {
            return ImmutableList.copyOf(this.e);
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return new d(toArray());
    }

    public static <E> c<E> builder() {
        return new c<>();
    }

    public static <E> c<E> builderWithExpectedSize(int i) {
        ale.b(i, "expectedSize");
        return new c<>(i);
    }

    public static final class c<E> extends ImmutableCollection.ArrayBasedBuilder<E> {
        public c() {
            this(4);
        }

        public c(int i) {
            super(i);
        }

        @Override // com.google.common.collect.ImmutableCollection.ArrayBasedBuilder, com.google.common.collect.ImmutableCollection.Builder
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public c<E> add(E e) {
            super.add((Object) e);
            return this;
        }

        @Override // com.google.common.collect.ImmutableCollection.ArrayBasedBuilder, com.google.common.collect.ImmutableCollection.Builder
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public c<E> add(E... eArr) {
            super.add((Object[]) eArr);
            return this;
        }

        @Override // com.google.common.collect.ImmutableCollection.ArrayBasedBuilder, com.google.common.collect.ImmutableCollection.Builder
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public c<E> addAll(Iterable<? extends E> iterable) {
            super.addAll(iterable);
            return this;
        }

        @Override // com.google.common.collect.ImmutableCollection.Builder
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public c<E> addAll(Iterator<? extends E> it) {
            super.addAll(it);
            return this;
        }

        public c<E> d(c<E> cVar) {
            addAll(cVar.contents, cVar.size);
            return this;
        }

        @Override // com.google.common.collect.ImmutableCollection.Builder
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public ImmutableList<E> build() {
            this.forceCopy = true;
            return ImmutableList.asImmutableList(this.contents, this.size);
        }
    }
}
