package com.google.common.collect;

import com.fasterxml.jackson.core.base.ParserMinimalBase;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.lang.Comparable;
import java.util.Collection;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible(emulated = true)
final class y1<C extends Comparable> extends ContiguousSet<C> {
    private static final long serialVersionUID = 0;
    private final Range<C> i;

    public class a extends AbstractSequentialIterator<C> {
        public final C b;

        public a(Comparable comparable) {
            super(comparable);
            this.b = (C) y1.this.last();
        }

        @Override // com.google.common.collect.AbstractSequentialIterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C computeNext(C c) {
            if (y1.A(c, this.b)) {
                return null;
            }
            return (C) y1.this.h.next(c);
        }
    }

    public class b extends AbstractSequentialIterator<C> {
        public final C b;

        public b(Comparable comparable) {
            super(comparable);
            this.b = (C) y1.this.first();
        }

        @Override // com.google.common.collect.AbstractSequentialIterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C computeNext(C c) {
            if (y1.A(c, this.b)) {
                return null;
            }
            return (C) y1.this.h.previous(c);
        }
    }

    public class c extends c1<C> {
        public c() {
        }

        @Override // com.google.common.collect.c1
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public ImmutableSortedSet<C> k() {
            return y1.this;
        }

        @Override // java.util.List
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public C get(int i) {
            Preconditions.checkElementIndex(i, size());
            y1 y1Var = y1.this;
            return (C) y1Var.h.a(y1Var.first(), i);
        }
    }

    @GwtIncompatible
    public static final class d<C extends Comparable> implements Serializable {
        public final Range<C> a;
        public final DiscreteDomain<C> b;

        public /* synthetic */ d(Range range, DiscreteDomain discreteDomain, a aVar) {
            this(range, discreteDomain);
        }

        private Object readResolve() {
            return new y1(this.a, this.b);
        }

        private d(Range<C> range, DiscreteDomain<C> discreteDomain) {
            this.a = range;
            this.b = discreteDomain;
        }
    }

    public y1(Range<C> range, DiscreteDomain<C> discreteDomain) {
        super(discreteDomain);
        this.i = range;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean A(Comparable<?> comparable, @NullableDecl Comparable<?> comparable2) {
        return comparable2 != null && Range.b(comparable, comparable2) == 0;
    }

    private ContiguousSet<C> C(Range<C> range) {
        return this.i.isConnected(range) ? ContiguousSet.create(this.i.intersection(range), this.h) : new i0(this.h);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.SortedSet
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public C first() {
        return (C) this.i.a.n(this.h);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.SortedSet
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public C last() {
        return (C) this.i.b.k(this.h);
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
    public boolean contains(@NullableDecl Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return this.i.contains((Comparable) obj);
        } catch (ClassCastException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        return Collections2.c(this, collection);
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof y1) {
            y1 y1Var = (y1) obj;
            if (this.h.equals(y1Var.h)) {
                return first().equals(y1Var.first()) && last().equals(y1Var.last());
            }
        }
        return super.equals(obj);
    }

    @Override // com.google.common.collect.ImmutableCollection
    public boolean f() {
        return false;
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public int hashCode() {
        return Sets.b(this);
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    @GwtIncompatible
    public int indexOf(Object obj) {
        if (contains(obj)) {
            return (int) this.h.distance(first(), (Comparable) obj);
        }
        return -1;
    }

    @Override // com.google.common.collect.ContiguousSet
    public ContiguousSet<C> intersection(ContiguousSet<C> contiguousSet) {
        Preconditions.checkNotNull(contiguousSet);
        Preconditions.checkArgument(this.h.equals(contiguousSet.h));
        if (contiguousSet.isEmpty()) {
            return contiguousSet;
        }
        Comparable comparable = (Comparable) Ordering.natural().max(first(), contiguousSet.first());
        Comparable comparable2 = (Comparable) Ordering.natural().min(last(), contiguousSet.last());
        return comparable.compareTo(comparable2) <= 0 ? ContiguousSet.create(Range.closed(comparable, comparable2), this.h) : new i0(this.h);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return false;
    }

    @Override // com.google.common.collect.ImmutableSet
    public ImmutableList<C> k() {
        return this.h.a ? new c() : super.k();
    }

    @Override // com.google.common.collect.ContiguousSet
    public Range<C> range() {
        BoundType boundType = BoundType.CLOSED;
        return range(boundType, boundType);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        long jDistance = this.h.distance(first(), last());
        if (jDistance >= ParserMinimalBase.MAX_INT_L) {
            return Integer.MAX_VALUE;
        }
        return ((int) jDistance) + 1;
    }

    @Override // com.google.common.collect.ContiguousSet, com.google.common.collect.ImmutableSortedSet
    /* JADX INFO: renamed from: w */
    public ContiguousSet<C> r(C c2, boolean z) {
        return C(Range.upTo(c2, BoundType.b(z)));
    }

    @Override // com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    @GwtIncompatible
    public Object writeReplace() {
        return new d(this.i, this.h, null);
    }

    @Override // com.google.common.collect.ContiguousSet, com.google.common.collect.ImmutableSortedSet
    /* JADX INFO: renamed from: x */
    public ContiguousSet<C> s(C c2, boolean z, C c3, boolean z2) {
        return (c2.compareTo(c3) != 0 || z || z2) ? C(Range.range(c2, BoundType.b(z), c3, BoundType.b(z2))) : new i0(this.h);
    }

    @Override // com.google.common.collect.ContiguousSet, com.google.common.collect.ImmutableSortedSet
    /* JADX INFO: renamed from: y */
    public ContiguousSet<C> t(C c2, boolean z) {
        return C(Range.downTo(c2, BoundType.b(z)));
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    @GwtIncompatible
    public UnmodifiableIterator<C> descendingIterator() {
        return new b(last());
    }

    @Override // com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public UnmodifiableIterator<C> iterator() {
        return new a(first());
    }

    @Override // com.google.common.collect.ContiguousSet
    public Range<C> range(BoundType boundType, BoundType boundType2) {
        return Range.c(this.i.a.q(boundType, this.h), this.i.b.r(boundType2, this.h));
    }
}
