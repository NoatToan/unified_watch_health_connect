package com.google.common.collect;

import defpackage.c6i;
import defpackage.ey6;
import defpackage.ich;
import defpackage.m44;
import defpackage.s6d;
import defpackage.t10;
import defpackage.uaq;
import java.io.Serializable;
import java.lang.Comparable;
import java.util.Collection;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
public final class x<C extends Comparable> extends ContiguousSet<C> {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Range<C> f9259a;

    public class a extends t10<C> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final C f9260b;

        public a(Comparable comparable) {
            super(comparable);
            this.f9260b = (C) x.this.last();
        }

        @Override // defpackage.t10
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C a(C c) {
            if (x.f(c, this.f9260b)) {
                return null;
            }
            return (C) x.this.domain.f(c);
        }
    }

    public class b extends t10<C> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final C f9261b;

        public b(Comparable comparable) {
            super(comparable);
            this.f9261b = (C) x.this.first();
        }

        @Override // defpackage.t10
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C a(C c) {
            if (x.f(c, this.f9261b)) {
                return null;
            }
            return (C) x.this.domain.h(c);
        }
    }

    public class c extends s6d<C> {
        public c() {
        }

        @Override // defpackage.s6d
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public ImmutableSortedSet<C> e() {
            return x.this;
        }

        @Override // java.util.List
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public C get(int i) {
            c6i.m(i, size());
            x xVar = x.this;
            return (C) xVar.domain.g(xVar.first(), i);
        }
    }

    public static final class d<C extends Comparable> implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Range<C> f9263a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ey6<C> f9264b;

        public /* synthetic */ d(Range range, ey6 ey6Var, a aVar) {
            this(range, ey6Var);
        }

        private Object readResolve() {
            return new x(this.f9263a, this.f9264b);
        }

        public d(Range<C> range, ey6<C> ey6Var) {
            this.f9263a = range;
            this.f9264b = ey6Var;
        }
    }

    public x(Range<C> range, ey6<C> ey6Var) {
        super(ey6Var);
        this.f9259a = range;
    }

    public static boolean f(Comparable<?> comparable, Comparable<?> comparable2) {
        return comparable2 != null && Range.compareOrThrow(comparable, comparable2) == 0;
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return this.f9259a.contains((Comparable) obj);
        } catch (ClassCastException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        return m44.a(this, collection);
    }

    @Override // com.google.common.collect.ImmutableSet
    public ImmutableList<C> createAsList() {
        return this.domain.f17185a ? new c() : super.createAsList();
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof x) {
            x xVar = (x) obj;
            if (this.domain.equals(xVar.domain)) {
                return first().equals(xVar.first()) && last().equals(xVar.last());
            }
        }
        return super.equals(obj);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.SortedSet
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public C first() {
        Comparable comparableP = this.f9259a.lowerBound.p(this.domain);
        Objects.requireNonNull(comparableP);
        return (C) comparableP;
    }

    public final ContiguousSet<C> h(Range<C> range) {
        return this.f9259a.isConnected(range) ? ContiguousSet.create(this.f9259a.intersection(range), this.domain) : new n(this.domain);
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public int hashCode() {
        return i0.b(this);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.SortedSet
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public C last() {
        Comparable comparableN = this.f9259a.upperBound.n(this.domain);
        Objects.requireNonNull(comparableN);
        return (C) comparableN;
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    public int indexOf(Object obj) {
        if (!contains(obj)) {
            return -1;
        }
        ey6<C> ey6Var = this.domain;
        Comparable comparableFirst = first();
        Objects.requireNonNull(obj);
        return (int) ey6Var.a(comparableFirst, (Comparable) obj);
    }

    @Override // com.google.common.collect.ContiguousSet
    public ContiguousSet<C> intersection(ContiguousSet<C> contiguousSet) {
        c6i.o(contiguousSet);
        c6i.d(this.domain.equals(contiguousSet.domain));
        if (contiguousSet.isEmpty()) {
            return contiguousSet;
        }
        Comparable comparable = (Comparable) ich.e().c(first(), contiguousSet.first());
        Comparable comparable2 = (Comparable) ich.e().d(last(), contiguousSet.last());
        return comparable.compareTo(comparable2) <= 0 ? ContiguousSet.create(Range.closed(comparable, comparable2), this.domain) : new n(this.domain);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return false;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public boolean isPartialView() {
        return false;
    }

    @Override // com.google.common.collect.ContiguousSet
    public Range<C> range() {
        BoundType boundType = BoundType.CLOSED;
        return range(boundType, boundType);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        long jA = this.domain.a(first(), last());
        if (jA >= 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return ((int) jA) + 1;
    }

    @Override // com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return new d(this.f9259a, this.domain, null);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public uaq<C> descendingIterator() {
        return new b(last());
    }

    @Override // com.google.common.collect.ContiguousSet, com.google.common.collect.ImmutableSortedSet
    public ContiguousSet<C> headSetImpl(C c2, boolean z) {
        return h(Range.upTo(c2, BoundType.forBoolean(z)));
    }

    @Override // com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public uaq<C> iterator() {
        return new a(first());
    }

    @Override // com.google.common.collect.ContiguousSet
    public Range<C> range(BoundType boundType, BoundType boundType2) {
        return Range.create(this.f9259a.lowerBound.u(boundType, this.domain), this.f9259a.upperBound.w(boundType2, this.domain));
    }

    @Override // com.google.common.collect.ContiguousSet, com.google.common.collect.ImmutableSortedSet
    public ContiguousSet<C> subSetImpl(C c2, boolean z, C c3, boolean z2) {
        return (c2.compareTo(c3) != 0 || z || z2) ? h(Range.range(c2, BoundType.forBoolean(z), c3, BoundType.forBoolean(z2))) : new n(this.domain);
    }

    @Override // com.google.common.collect.ContiguousSet, com.google.common.collect.ImmutableSortedSet
    public ContiguousSet<C> tailSetImpl(C c2, boolean z) {
        return h(Range.downTo(c2, BoundType.forBoolean(z)));
    }
}
