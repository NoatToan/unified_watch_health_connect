package com.google.common.collect;

import defpackage.c6i;
import defpackage.cpd;
import defpackage.epd;
import defpackage.ich;
import defpackage.n4n;
import defpackage.o4n;
import defpackage.t3h;
import defpackage.uaq;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes5.dex */
public abstract class ImmutableSortedSet<E> extends r<E> implements NavigableSet<E>, n4n<E> {
    final transient Comparator<? super E> comparator;
    transient ImmutableSortedSet<E> descendingSet;

    public static final class a<E> extends ImmutableSet.a<E> {
        public final Comparator<? super E> f;

        public a(Comparator<? super E> comparator) {
            this.f = (Comparator) c6i.o(comparator);
        }

        @Override // com.google.common.collect.ImmutableSet.a
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public a<E> a(E e) {
            super.a(e);
            return this;
        }

        public a<E> o(E... eArr) {
            super.j(eArr);
            return this;
        }

        @Override // com.google.common.collect.ImmutableSet.a
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public a<E> k(Iterator<? extends E> it) {
            super.k(it);
            return this;
        }

        @Override // com.google.common.collect.ImmutableSet.a
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public ImmutableSortedSet<E> m() {
            ImmutableSortedSet<E> immutableSortedSetConstruct = ImmutableSortedSet.construct(this.f, this.f9022b, this.f9021a);
            this.f9022b = immutableSortedSetConstruct.size();
            this.c = true;
            return immutableSortedSetConstruct;
        }
    }

    public static class b<E> implements Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Comparator<? super E> f9080a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object[] f9081b;

        public b(Comparator<? super E> comparator, Object[] objArr) {
            this.f9080a = comparator;
            this.f9081b = objArr;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Object readResolve() {
            return new a(this.f9080a).o(this.f9081b).m();
        }
    }

    public ImmutableSortedSet(Comparator<? super E> comparator) {
        this.comparator = comparator;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <E> ImmutableSortedSet<E> construct(Comparator<? super E> comparator, int i, E... eArr) {
        if (i == 0) {
            return emptySet(comparator);
        }
        t3h.c(eArr, i);
        Arrays.sort(eArr, 0, i, comparator);
        int i2 = 1;
        for (int i3 = 1; i3 < i; i3++) {
            a0.a aVar = (Object) eArr[i3];
            if (comparator.compare(aVar, (Object) eArr[i2 - 1]) != 0) {
                eArr[i2] = aVar;
                i2++;
            }
        }
        Arrays.fill(eArr, i2, i, (Object) null);
        if (i2 < eArr.length / 2) {
            eArr = (E[]) Arrays.copyOf(eArr, i2);
        }
        return new e0(ImmutableList.asImmutableList(eArr, i2), comparator);
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>([TE;)Lcom/google/common/collect/ImmutableSortedSet<TE;>; */
    public static ImmutableSortedSet copyOf(Comparable[] comparableArr) {
        return construct(ich.e(), comparableArr.length, (Comparable[]) comparableArr.clone());
    }

    public static <E> ImmutableSortedSet<E> copyOfSorted(SortedSet<E> sortedSet) {
        Comparator comparatorA = o4n.a(sortedSet);
        ImmutableList immutableListCopyOf = ImmutableList.copyOf((Collection) sortedSet);
        return immutableListCopyOf.isEmpty() ? emptySet(comparatorA) : new e0(immutableListCopyOf, comparatorA);
    }

    public static <E> e0<E> emptySet(Comparator<? super E> comparator) {
        return ich.e().equals(comparator) ? (e0<E>) e0.f9174b : new e0<>(ImmutableList.of(), comparator);
    }

    public static <E extends Comparable<?>> a<E> naturalOrder() {
        return new a<>(ich.e());
    }

    public static <E> ImmutableSortedSet<E> of() {
        return e0.f9174b;
    }

    public static <E> a<E> orderedBy(Comparator<E> comparator) {
        return new a<>(comparator);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static <E extends Comparable<?>> a<E> reverseOrder() {
        return new a<>(Collections.reverseOrder());
    }

    @Override // java.util.NavigableSet
    public E ceiling(E e) {
        return (E) cpd.e(tailSet((Object) e, true), null);
    }

    @Override // java.util.SortedSet, defpackage.n4n
    public Comparator<? super E> comparator() {
        return this.comparator;
    }

    public abstract ImmutableSortedSet<E> createDescendingSet();

    @Override // java.util.NavigableSet
    public abstract uaq<E> descendingIterator();

    @Override // java.util.SortedSet
    public E first() {
        return iterator().next();
    }

    @Override // java.util.NavigableSet
    public E floor(E e) {
        return (E) epd.m(headSet((Object) e, true).descendingIterator(), null);
    }

    public abstract ImmutableSortedSet<E> headSetImpl(E e, boolean z);

    @Override // java.util.NavigableSet
    public E higher(E e) {
        return (E) cpd.e(tailSet((Object) e, false), null);
    }

    public abstract int indexOf(Object obj);

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public abstract uaq<E> iterator();

    @Override // java.util.SortedSet
    public E last() {
        return descendingIterator().next();
    }

    @Override // java.util.NavigableSet
    public E lower(E e) {
        return (E) epd.m(headSet((Object) e, false).descendingIterator(), null);
    }

    @Override // java.util.NavigableSet
    @Deprecated
    public final E pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    @Deprecated
    public final E pollLast() {
        throw new UnsupportedOperationException();
    }

    public abstract ImmutableSortedSet<E> subSetImpl(E e, boolean z, E e2, boolean z2);

    public abstract ImmutableSortedSet<E> tailSetImpl(E e, boolean z);

    public int unsafeCompare(Object obj, Object obj2) {
        return unsafeCompare(this.comparator, obj, obj2);
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return new b(this.comparator, toArray());
    }

    public static <E> ImmutableSortedSet<E> copyOf(Iterable<? extends E> iterable) {
        return copyOf(ich.e(), iterable);
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;)Lcom/google/common/collect/ImmutableSortedSet<TE;>; */
    public static ImmutableSortedSet of(Comparable comparable) {
        return new e0(ImmutableList.of(comparable), ich.e());
    }

    public static int unsafeCompare(Comparator<?> comparator, Object obj, Object obj2) {
        return comparator.compare(obj, obj2);
    }

    @Override // java.util.NavigableSet
    public ImmutableSortedSet<E> descendingSet() {
        ImmutableSortedSet<E> immutableSortedSet = this.descendingSet;
        if (immutableSortedSet != null) {
            return immutableSortedSet;
        }
        ImmutableSortedSet<E> immutableSortedSetCreateDescendingSet = createDescendingSet();
        this.descendingSet = immutableSortedSetCreateDescendingSet;
        immutableSortedSetCreateDescendingSet.descendingSet = this;
        return immutableSortedSetCreateDescendingSet;
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;)Lcom/google/common/collect/ImmutableSortedSet<TE;>; */
    public static ImmutableSortedSet of(Comparable comparable, Comparable comparable2) {
        return construct(ich.e(), 2, comparable, comparable2);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public ImmutableSortedSet<E> headSet(E e) {
        return headSet((Object) e, false);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public ImmutableSortedSet<E> subSet(E e, E e2) {
        return subSet((Object) e, true, (Object) e2, false);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public ImmutableSortedSet<E> tailSet(E e) {
        return tailSet((Object) e, true);
    }

    public static <E> ImmutableSortedSet<E> copyOf(Collection<? extends E> collection) {
        return copyOf((Comparator) ich.e(), (Collection) collection);
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;TE;)Lcom/google/common/collect/ImmutableSortedSet<TE;>; */
    public static ImmutableSortedSet of(Comparable comparable, Comparable comparable2, Comparable comparable3) {
        return construct(ich.e(), 3, comparable, comparable2, comparable3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.NavigableSet
    public ImmutableSortedSet<E> headSet(E e, boolean z) {
        return headSetImpl(c6i.o(e), z);
    }

    @Override // java.util.NavigableSet
    public ImmutableSortedSet<E> subSet(E e, boolean z, E e2, boolean z2) {
        c6i.o(e);
        c6i.o(e2);
        c6i.d(this.comparator.compare(e, e2) <= 0);
        return subSetImpl(e, z, e2, z2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.NavigableSet
    public ImmutableSortedSet<E> tailSet(E e, boolean z) {
        return tailSetImpl(c6i.o(e), z);
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;TE;TE;)Lcom/google/common/collect/ImmutableSortedSet<TE;>; */
    public static ImmutableSortedSet of(Comparable comparable, Comparable comparable2, Comparable comparable3, Comparable comparable4) {
        return construct(ich.e(), 4, comparable, comparable2, comparable3, comparable4);
    }

    public static <E> ImmutableSortedSet<E> copyOf(Iterator<? extends E> it) {
        return copyOf(ich.e(), it);
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;TE;TE;TE;)Lcom/google/common/collect/ImmutableSortedSet<TE;>; */
    public static ImmutableSortedSet of(Comparable comparable, Comparable comparable2, Comparable comparable3, Comparable comparable4, Comparable comparable5) {
        return construct(ich.e(), 5, comparable, comparable2, comparable3, comparable4, comparable5);
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;TE;TE;TE;TE;[TE;)Lcom/google/common/collect/ImmutableSortedSet<TE;>; */
    public static ImmutableSortedSet of(Comparable comparable, Comparable comparable2, Comparable comparable3, Comparable comparable4, Comparable comparable5, Comparable comparable6, Comparable... comparableArr) {
        int length = comparableArr.length + 6;
        Comparable[] comparableArr2 = new Comparable[length];
        comparableArr2[0] = comparable;
        comparableArr2[1] = comparable2;
        comparableArr2[2] = comparable3;
        comparableArr2[3] = comparable4;
        comparableArr2[4] = comparable5;
        comparableArr2[5] = comparable6;
        System.arraycopy(comparableArr, 0, comparableArr2, 6, comparableArr.length);
        return construct(ich.e(), length, comparableArr2);
    }

    public static <E> ImmutableSortedSet<E> copyOf(Comparator<? super E> comparator, Iterator<? extends E> it) {
        return new a(comparator).k(it).m();
    }

    public static <E> ImmutableSortedSet<E> copyOf(Comparator<? super E> comparator, Iterable<? extends E> iterable) {
        c6i.o(comparator);
        if (o4n.b(comparator, iterable) && (iterable instanceof ImmutableSortedSet)) {
            ImmutableSortedSet<E> immutableSortedSet = (ImmutableSortedSet) iterable;
            if (!immutableSortedSet.isPartialView()) {
                return immutableSortedSet;
            }
        }
        Object[] objArrK = cpd.k(iterable);
        return construct(comparator, objArrK.length, objArrK);
    }

    public static <E> ImmutableSortedSet<E> copyOf(Comparator<? super E> comparator, Collection<? extends E> collection) {
        return copyOf((Comparator) comparator, (Iterable) collection);
    }
}
