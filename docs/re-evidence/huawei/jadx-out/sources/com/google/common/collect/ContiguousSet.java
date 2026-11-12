package com.google.common.collect;

import com.google.common.base.Preconditions;
import defpackage.alo;
import defpackage.alq;
import defpackage.amv;
import defpackage.amx;
import java.lang.Comparable;
import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: loaded from: classes21.dex */
@ElementTypesAreNonnullByDefault
public abstract class ContiguousSet<C extends Comparable> extends ImmutableSortedSet<C> {
    public final DiscreteDomain<C> domain;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.ImmutableSortedSet
    public abstract ContiguousSet<C> headSetImpl(C c2, boolean z);

    public abstract ContiguousSet<C> intersection(ContiguousSet<C> contiguousSet);

    public abstract amv<C> range();

    public abstract amv<C> range(BoundType boundType, BoundType boundType2);

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.ImmutableSortedSet
    public abstract ContiguousSet<C> subSetImpl(C c2, boolean z, C c3, boolean z2);

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.ImmutableSortedSet
    public abstract ContiguousSet<C> tailSetImpl(C c2, boolean z);

    public static <C extends Comparable> ContiguousSet<C> create(amv<C> amvVar, DiscreteDomain<C> discreteDomain) {
        Preconditions.checkNotNull(amvVar);
        Preconditions.checkNotNull(discreteDomain);
        try {
            amv<C> amvVarC = !amvVar.a() ? amvVar.c(amv.c(discreteDomain.minValue())) : amvVar;
            if (!amvVar.j()) {
                amvVarC = amvVarC.c(amv.b(discreteDomain.maxValue()));
            }
            if (amvVarC.f() || amv.b((Comparable) Objects.requireNonNull(amvVar.f568c.leastValueAbove(discreteDomain)), (Comparable) Objects.requireNonNull(amvVar.f567b.greatestValueBelow(discreteDomain))) > 0) {
                return new alq(discreteDomain);
            }
            return new amx(amvVarC, discreteDomain);
        } catch (NoSuchElementException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static ContiguousSet<Integer> closed(int i, int i2) {
        return create(amv.d(Integer.valueOf(i), Integer.valueOf(i2)), DiscreteDomain.integers());
    }

    public static ContiguousSet<Long> closed(long j, long j2) {
        return create(amv.d(Long.valueOf(j), Long.valueOf(j2)), DiscreteDomain.longs());
    }

    public static ContiguousSet<Integer> closedOpen(int i, int i2) {
        return create(amv.e(Integer.valueOf(i), Integer.valueOf(i2)), DiscreteDomain.integers());
    }

    public static ContiguousSet<Long> closedOpen(long j, long j2) {
        return create(amv.e(Long.valueOf(j), Long.valueOf(j2)), DiscreteDomain.longs());
    }

    public ContiguousSet(DiscreteDomain<C> discreteDomain) {
        super(Ordering.natural());
        this.domain = discreteDomain;
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet, java.util.SortedSet
    public ContiguousSet<C> headSet(C c2) {
        return headSetImpl((Comparable) Preconditions.checkNotNull(c2), false);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public ContiguousSet<C> headSet(C c2, boolean z) {
        return headSetImpl((Comparable) Preconditions.checkNotNull(c2), z);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet, java.util.SortedSet
    public ContiguousSet<C> subSet(C c2, C c3) {
        Preconditions.checkNotNull(c2);
        Preconditions.checkNotNull(c3);
        Preconditions.checkArgument(comparator().compare(c2, c3) <= 0);
        return subSetImpl((Comparable) c2, true, (Comparable) c3, false);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public ContiguousSet<C> subSet(C c2, boolean z, C c3, boolean z2) {
        Preconditions.checkNotNull(c2);
        Preconditions.checkNotNull(c3);
        Preconditions.checkArgument(comparator().compare(c2, c3) <= 0);
        return subSetImpl((Comparable) c2, z, (Comparable) c3, z2);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet, java.util.SortedSet
    public ContiguousSet<C> tailSet(C c2) {
        return tailSetImpl((Comparable) Preconditions.checkNotNull(c2), true);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public ContiguousSet<C> tailSet(C c2, boolean z) {
        return tailSetImpl((Comparable) Preconditions.checkNotNull(c2), z);
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    protected ImmutableSortedSet<C> createDescendingSet() {
        return new alo(this);
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return range().toString();
    }

    @Deprecated
    public static <E> ImmutableSortedSet.e<E> builder() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return super.writeReplace();
    }
}
