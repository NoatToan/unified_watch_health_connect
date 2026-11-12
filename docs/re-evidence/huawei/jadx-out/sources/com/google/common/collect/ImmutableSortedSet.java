package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.concurrent.LazyInit;
import defpackage.aaab;
import defpackage.ajz;
import defpackage.amn;
import defpackage.amu;
import defpackage.ani;
import defpackage.ano;
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
import java.util.stream.Collector;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes21.dex */
@ElementTypesAreNonnullByDefault
public abstract class ImmutableSortedSet<E> extends ImmutableSet<E> implements NavigableSet<E>, SortedIterable<E> {
    private static final long serialVersionUID = 912559;
    protected final transient Comparator<? super E> comparator;

    @CheckForNull
    @LazyInit
    transient ImmutableSortedSet<E> descendingSet;

    protected abstract ImmutableSortedSet<E> createDescendingSet();

    @Override // java.util.NavigableSet
    public abstract UnmodifiableIterator<E> descendingIterator();

    public abstract ImmutableSortedSet<E> headSetImpl(E e2, boolean z);

    public abstract int indexOf(@CheckForNull Object obj);

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
    public abstract UnmodifiableIterator<E> iterator();

    protected abstract ImmutableSortedSet<E> subSetImpl(E e2, boolean z, E e3, boolean z2);

    protected abstract ImmutableSortedSet<E> tailSetImpl(E e2, boolean z);

    static <E> Collector<E, ?, ImmutableSortedSet<E>> toImmutableSortedSet(Comparator<? super E> comparator) {
        return ajz.e(comparator);
    }

    public static <E> ani<E> emptySet(Comparator<? super E> comparator) {
        if (Ordering.natural().equals(comparator)) {
            return (ani<E>) ani.e;
        }
        return new ani<>(ImmutableList.of(), comparator);
    }

    public static <E> ImmutableSortedSet<E> of() {
        return ani.e;
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;)Lcom/google/common/collect/ImmutableSortedSet<TE;>; */
    public static ImmutableSortedSet of(Comparable comparable) {
        return new ani(ImmutableList.of(comparable), Ordering.natural());
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;)Lcom/google/common/collect/ImmutableSortedSet<TE;>; */
    public static ImmutableSortedSet of(Comparable comparable, Comparable comparable2) {
        return construct(Ordering.natural(), 2, comparable, comparable2);
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;TE;)Lcom/google/common/collect/ImmutableSortedSet<TE;>; */
    public static ImmutableSortedSet of(Comparable comparable, Comparable comparable2, Comparable comparable3) {
        return construct(Ordering.natural(), 3, comparable, comparable2, comparable3);
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;TE;TE;)Lcom/google/common/collect/ImmutableSortedSet<TE;>; */
    public static ImmutableSortedSet of(Comparable comparable, Comparable comparable2, Comparable comparable3, Comparable comparable4) {
        return construct(Ordering.natural(), 4, comparable, comparable2, comparable3, comparable4);
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;TE;TE;TE;)Lcom/google/common/collect/ImmutableSortedSet<TE;>; */
    public static ImmutableSortedSet of(Comparable comparable, Comparable comparable2, Comparable comparable3, Comparable comparable4, Comparable comparable5) {
        return construct(Ordering.natural(), 5, comparable, comparable2, comparable3, comparable4, comparable5);
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
        return construct(Ordering.natural(), length, comparableArr2);
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>([TE;)Lcom/google/common/collect/ImmutableSortedSet<TE;>; */
    public static ImmutableSortedSet copyOf(Comparable[] comparableArr) {
        return construct(Ordering.natural(), comparableArr.length, (Comparable[]) comparableArr.clone());
    }

    public static <E> ImmutableSortedSet<E> copyOf(Iterable<? extends E> iterable) {
        return copyOf(Ordering.natural(), iterable);
    }

    public static <E> ImmutableSortedSet<E> copyOf(Collection<? extends E> collection) {
        return copyOf((Comparator) Ordering.natural(), (Collection) collection);
    }

    public static <E> ImmutableSortedSet<E> copyOf(Iterator<? extends E> it) {
        return copyOf(Ordering.natural(), it);
    }

    public static <E> ImmutableSortedSet<E> copyOf(Comparator<? super E> comparator, Iterator<? extends E> it) {
        return new e(comparator).addAll((Iterator) it).build();
    }

    public static <E> ImmutableSortedSet<E> copyOf(Comparator<? super E> comparator, Iterable<? extends E> iterable) {
        Preconditions.checkNotNull(comparator);
        if (ano.c(comparator, iterable) && (iterable instanceof ImmutableSortedSet)) {
            ImmutableSortedSet<E> immutableSortedSet = (ImmutableSortedSet) iterable;
            if (!immutableSortedSet.isPartialView()) {
                return immutableSortedSet;
            }
        }
        Object[] objArrE = amn.e(iterable);
        return construct(comparator, objArrE.length, objArrE);
    }

    public static <E> ImmutableSortedSet<E> copyOf(Comparator<? super E> comparator, Collection<? extends E> collection) {
        return copyOf((Comparator) comparator, (Iterable) collection);
    }

    public static <E> ImmutableSortedSet<E> copyOfSorted(SortedSet<E> sortedSet) {
        Comparator comparatorA = ano.a(sortedSet);
        ImmutableList immutableListCopyOf = ImmutableList.copyOf((Collection) sortedSet);
        if (immutableListCopyOf.isEmpty()) {
            return emptySet(comparatorA);
        }
        return new ani(immutableListCopyOf, comparatorA);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static <E> ImmutableSortedSet<E> construct(Comparator<? super E> comparator, int i, E... eArr) {
        if (i == 0) {
            return emptySet(comparator);
        }
        amu.a((Object[]) eArr, i);
        Arrays.sort(eArr, 0, i, comparator);
        int i2 = 1;
        for (int i3 = 1; i3 < i; i3++) {
            aaab aaabVar = (Object) eArr[i3];
            if (comparator.compare(aaabVar, (Object) eArr[i2 - 1]) != 0) {
                eArr[i2] = aaabVar;
                i2++;
            }
        }
        Arrays.fill(eArr, i2, i, (Object) null);
        if (i2 < eArr.length / 2) {
            eArr = (E[]) Arrays.copyOf(eArr, i2);
        }
        return new ani(ImmutableList.asImmutableList(eArr, i2), comparator);
    }

    public static <E> e<E> orderedBy(Comparator<E> comparator) {
        return new e<>(comparator);
    }

    public static <E extends Comparable<?>> e<E> reverseOrder() {
        return new e<>(Collections.reverseOrder());
    }

    public static <E extends Comparable<?>> e<E> naturalOrder() {
        return new e<>(Ordering.natural());
    }

    public static final class e<E> extends ImmutableSet.b<E> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Comparator<? super E> f4389b;

        public e(Comparator<? super E> comparator) {
            this.f4389b = (Comparator) Preconditions.checkNotNull(comparator);
        }

        @Override // com.google.common.collect.ImmutableSet.b
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public e<E> add(E e) {
            super.add(e);
            return this;
        }

        @Override // com.google.common.collect.ImmutableSet.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e<E> add(E... eArr) {
            super.add((Object[]) eArr);
            return this;
        }

        @Override // com.google.common.collect.ImmutableSet.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public e<E> addAll(Iterable<? extends E> iterable) {
            super.addAll((Iterable) iterable);
            return this;
        }

        @Override // com.google.common.collect.ImmutableSet.b
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public e<E> addAll(Iterator<? extends E> it) {
            super.addAll((Iterator) it);
            return this;
        }

        @Override // com.google.common.collect.ImmutableSet.b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public e<E> d(ImmutableSet.b<E> bVar) {
            super.d((ImmutableSet.b) bVar);
            return this;
        }

        @Override // com.google.common.collect.ImmutableSet.b, com.google.common.collect.ImmutableCollection.Builder
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ImmutableSortedSet<E> build() {
            ImmutableSortedSet<E> immutableSortedSetConstruct = ImmutableSortedSet.construct(this.f4389b, this.size, this.contents);
            this.size = immutableSortedSetConstruct.size();
            this.forceCopy = true;
            return immutableSortedSetConstruct;
        }
    }

    protected int unsafeCompare(Object obj, @CheckForNull Object obj2) {
        return unsafeCompare(this.comparator, obj, obj2);
    }

    static int unsafeCompare(Comparator<?> comparator, Object obj, @CheckForNull Object obj2) {
        return comparator.compare(obj, obj2);
    }

    public ImmutableSortedSet(Comparator<? super E> comparator) {
        this.comparator = comparator;
    }

    @Override // java.util.SortedSet, com.google.common.collect.SortedIterable
    public Comparator<? super E> comparator() {
        return this.comparator;
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public ImmutableSortedSet<E> headSet(E e2) {
        return headSet((Object) e2, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.NavigableSet
    public ImmutableSortedSet<E> headSet(E e2, boolean z) {
        return headSetImpl(Preconditions.checkNotNull(e2), z);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public ImmutableSortedSet<E> subSet(E e2, E e3) {
        return subSet((Object) e2, true, (Object) e3, false);
    }

    @Override // java.util.NavigableSet
    public ImmutableSortedSet<E> subSet(E e2, boolean z, E e3, boolean z2) {
        Preconditions.checkNotNull(e2);
        Preconditions.checkNotNull(e3);
        Preconditions.checkArgument(this.comparator.compare(e2, e3) <= 0);
        return subSetImpl(e2, z, e3, z2);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public ImmutableSortedSet<E> tailSet(E e2) {
        return tailSet((Object) e2, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.NavigableSet
    public ImmutableSortedSet<E> tailSet(E e2, boolean z) {
        return tailSetImpl(Preconditions.checkNotNull(e2), z);
    }

    @CheckForNull
    public E lower(E e2) {
        return (E) Iterators.e(headSet((Object) e2, false).descendingIterator(), (Object) null);
    }

    @CheckForNull
    public E floor(E e2) {
        return (E) Iterators.e(headSet((Object) e2, true).descendingIterator(), (Object) null);
    }

    @CheckForNull
    public E ceiling(E e2) {
        return (E) amn.a(tailSet((Object) e2, true), (Object) null);
    }

    @CheckForNull
    public E higher(E e2) {
        return (E) amn.a(tailSet((Object) e2, false), (Object) null);
    }

    public E first() {
        return iterator().next();
    }

    public E last() {
        return descendingIterator().next();
    }

    @Override // java.util.NavigableSet
    @CheckForNull
    @Deprecated
    public final E pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    @CheckForNull
    @Deprecated
    public final E pollLast() {
        throw new UnsupportedOperationException();
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

    static class d<E> implements Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Comparator<? super E> f4387b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final Object[] f4388c;

        public d(Comparator<? super E> comparator, Object[] objArr) {
            this.f4387b = comparator;
            this.f4388c = objArr;
        }

        /* JADX WARN: Multi-variable type inference failed */
        Object readResolve() {
            return new e(this.f4387b).add(this.f4388c).build();
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return new d(this.comparator, toArray());
    }

    @Deprecated
    static <E> Collector<E, ?, ImmutableSet<E>> toImmutableSet() {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public static <E> e<E> builder() {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public static <E> e<E> builderWithExpectedSize(int i) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public static <E> ImmutableSortedSet<E> of(E e2) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public static <E> ImmutableSortedSet<E> of(E e2, E e3) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public static <E> ImmutableSortedSet<E> of(E e2, E e3, E e4) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public static <E> ImmutableSortedSet<E> of(E e2, E e3, E e4, E e5) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public static <E> ImmutableSortedSet<E> of(E e2, E e3, E e4, E e5, E e6) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public static <E> ImmutableSortedSet<E> of(E e2, E e3, E e4, E e5, E e6, E e7, E... eArr) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public static <Z> ImmutableSortedSet<Z> copyOf(Z[] zArr) {
        throw new UnsupportedOperationException();
    }
}
