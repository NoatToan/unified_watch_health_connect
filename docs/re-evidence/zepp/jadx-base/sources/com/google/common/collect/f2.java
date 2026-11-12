package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Ints;
import java.util.Comparator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes3.dex */
@GwtIncompatible
final class f2<E> extends ImmutableSortedMultiset<E> {
    private static final long[] i = {0};
    public static final ImmutableSortedMultiset<Comparable> j = new f2(Ordering.natural());

    @VisibleForTesting
    public final transient g2<E> e;
    private final transient long[] f;
    private final transient int g;
    private final transient int h;

    public f2(Comparator<? super E> comparator) {
        this.e = ImmutableSortedSet.q(comparator);
        this.f = i;
        this.g = 0;
        this.h = 0;
    }

    private int n(int i2) {
        long[] jArr = this.f;
        int i3 = this.g;
        return (int) (jArr[(i3 + i2) + 1] - jArr[i3 + i2]);
    }

    @Override // com.google.common.collect.Multiset
    public int count(@NullableDecl Object obj) {
        int iIndexOf = this.e.indexOf(obj);
        if (iIndexOf >= 0) {
            return n(iIndexOf);
        }
        return 0;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public boolean f() {
        return this.g > 0 || this.h < this.f.length - 1;
    }

    @Override // com.google.common.collect.SortedMultiset
    public Multiset.Entry<E> firstEntry() {
        if (isEmpty()) {
            return null;
        }
        return j(0);
    }

    @Override // com.google.common.collect.ImmutableMultiset
    public Multiset.Entry<E> j(int i2) {
        return Multisets.immutableEntry(this.e.asList().get(i2), n(i2));
    }

    @Override // com.google.common.collect.SortedMultiset
    public Multiset.Entry<E> lastEntry() {
        if (isEmpty()) {
            return null;
        }
        return j(this.h - 1);
    }

    public ImmutableSortedMultiset<E> o(int i2, int i3) {
        Preconditions.checkPositionIndexes(i2, i3, this.h);
        if (i2 == i3) {
            return ImmutableSortedMultiset.m(comparator());
        }
        return (i2 == 0 && i3 == this.h) ? this : new f2(this.e.w(i2, i3), this.f, this.g + i2, i3 - i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public int size() {
        long[] jArr = this.f;
        int i2 = this.g;
        return Ints.saturatedCast(jArr[this.h + i2] - jArr[i2]);
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.SortedMultiset
    public ImmutableSortedMultiset<E> headMultiset(E e, BoundType boundType) {
        return o(0, this.e.x(e, Preconditions.checkNotNull(boundType) == BoundType.CLOSED));
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.SortedMultiset
    public ImmutableSortedMultiset<E> tailMultiset(E e, BoundType boundType) {
        return o(this.e.y(e, Preconditions.checkNotNull(boundType) == BoundType.CLOSED), this.h);
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.ImmutableMultiset, com.google.common.collect.Multiset
    public ImmutableSortedSet<E> elementSet() {
        return this.e;
    }

    public f2(g2<E> g2Var, long[] jArr, int i2, int i3) {
        this.e = g2Var;
        this.f = jArr;
        this.g = i2;
        this.h = i3;
    }
}
