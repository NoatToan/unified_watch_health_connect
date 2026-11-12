package com.google.common.collect;

import defpackage.c6i;
import defpackage.ey6;
import defpackage.ich;
import defpackage.kz5;
import java.lang.Comparable;
import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
public abstract class ContiguousSet<C extends Comparable> extends ImmutableSortedSet<C> {
    final ey6<C> domain;

    public ContiguousSet(ey6<C> ey6Var) {
        super(ich.e());
        this.domain = ey6Var;
    }

    @Deprecated
    public static <E> ImmutableSortedSet.a<E> builder() {
        throw new UnsupportedOperationException();
    }

    public static ContiguousSet<Integer> closed(int i, int i2) {
        return create(Range.closed(Integer.valueOf(i), Integer.valueOf(i2)), ey6.b());
    }

    public static ContiguousSet<Integer> closedOpen(int i, int i2) {
        return create(Range.closedOpen(Integer.valueOf(i), Integer.valueOf(i2)), ey6.b());
    }

    public static <C extends Comparable> ContiguousSet<C> create(Range<C> range, ey6<C> ey6Var) {
        c6i.o(range);
        c6i.o(ey6Var);
        try {
            Range<C> rangeIntersection = !range.hasLowerBound() ? range.intersection(Range.atLeast(ey6Var.e())) : range;
            if (!range.hasUpperBound()) {
                rangeIntersection = rangeIntersection.intersection(Range.atMost(ey6Var.d()));
            }
            if (!rangeIntersection.isEmpty()) {
                Comparable comparableP = range.lowerBound.p(ey6Var);
                Objects.requireNonNull(comparableP);
                Comparable comparableN = range.upperBound.n(ey6Var);
                Objects.requireNonNull(comparableN);
                if (Range.compareOrThrow(comparableP, comparableN) <= 0) {
                    return new x(rangeIntersection, ey6Var);
                }
            }
            return new n(ey6Var);
        } catch (NoSuchElementException e) {
            throw new IllegalArgumentException(e);
        }
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    public ImmutableSortedSet<C> createDescendingSet() {
        return new kz5(this);
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    public abstract ContiguousSet<C> headSetImpl(C c, boolean z);

    public abstract ContiguousSet<C> intersection(ContiguousSet<C> contiguousSet);

    public abstract Range<C> range();

    public abstract Range<C> range(BoundType boundType, BoundType boundType2);

    @Override // com.google.common.collect.ImmutableSortedSet
    public abstract ContiguousSet<C> subSetImpl(C c, boolean z, C c2, boolean z2);

    @Override // com.google.common.collect.ImmutableSortedSet
    public abstract ContiguousSet<C> tailSetImpl(C c, boolean z);

    @Override // java.util.AbstractCollection
    public String toString() {
        return range().toString();
    }

    public static ContiguousSet<Long> closed(long j, long j2) {
        return create(Range.closed(Long.valueOf(j), Long.valueOf(j2)), ey6.c());
    }

    public static ContiguousSet<Long> closedOpen(long j, long j2) {
        return create(Range.closedOpen(Long.valueOf(j), Long.valueOf(j2)), ey6.c());
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet, java.util.SortedSet
    public ContiguousSet<C> headSet(C c) {
        return headSetImpl((Comparable) c6i.o(c), false);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet, java.util.SortedSet
    public ContiguousSet<C> subSet(C c, C c2) {
        c6i.o(c);
        c6i.o(c2);
        c6i.d(comparator().compare(c, c2) <= 0);
        return subSetImpl((Comparable) c, true, (Comparable) c2, false);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet, java.util.SortedSet
    public ContiguousSet<C> tailSet(C c) {
        return tailSetImpl((Comparable) c6i.o(c), true);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public ContiguousSet<C> headSet(C c, boolean z) {
        return headSetImpl((Comparable) c6i.o(c), z);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public ContiguousSet<C> tailSet(C c, boolean z) {
        return tailSetImpl((Comparable) c6i.o(c), z);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public ContiguousSet<C> subSet(C c, boolean z, C c2, boolean z2) {
        c6i.o(c);
        c6i.o(c2);
        c6i.d(comparator().compare(c, c2) <= 0);
        return subSetImpl((Comparable) c, z, (Comparable) c2, z2);
    }
}
