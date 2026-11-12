package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import java.io.Serializable;
import java.lang.Comparable;
import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible
public final class Range<C extends Comparable> extends x1 implements Predicate<C>, Serializable {
    private static final Range<Comparable> c = new Range<>(d0.c(), d0.a());
    private static final long serialVersionUID = 0;
    public final d0<C> a;
    public final d0<C> b;

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[BoundType.values().length];
            a = iArr;
            try {
                iArr[BoundType.OPEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[BoundType.CLOSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static class b implements Function<Range, d0> {
        public static final b a = new b();

        @Override // com.google.common.base.Function
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public d0 apply(Range range) {
            return range.a;
        }
    }

    public static class c extends Ordering<Range<?>> implements Serializable {
        public static final Ordering<Range<?>> c = new c();
        private static final long serialVersionUID = 0;

        private c() {
        }

        @Override // com.google.common.collect.Ordering, java.util.Comparator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compare(Range<?> range, Range<?> range2) {
            return ComparisonChain.start().compare(range.a, range2.a).compare(range.b, range2.b).result();
        }
    }

    public static class d implements Function<Range, d0> {
        public static final d a = new d();

        @Override // com.google.common.base.Function
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public d0 apply(Range range) {
            return range.b;
        }
    }

    private Range(d0<C> d0Var, d0<C> d0Var2) {
        this.a = (d0) Preconditions.checkNotNull(d0Var);
        this.b = (d0) Preconditions.checkNotNull(d0Var2);
        if (d0Var.compareTo(d0Var2) > 0 || d0Var == d0.a() || d0Var2 == d0.c()) {
            throw new IllegalArgumentException("Invalid range: " + g(d0Var, d0Var2));
        }
    }

    private static <T> SortedSet<T> a(Iterable<T> iterable) {
        return (SortedSet) iterable;
    }

    public static <C extends Comparable<?>> Range<C> all() {
        return (Range<C>) c;
    }

    public static <C extends Comparable<?>> Range<C> atLeast(C c2) {
        return c(d0.e(c2), d0.a());
    }

    public static <C extends Comparable<?>> Range<C> atMost(C c2) {
        return c(d0.c(), d0.b(c2));
    }

    public static int b(Comparable comparable, Comparable comparable2) {
        return comparable.compareTo(comparable2);
    }

    public static <C extends Comparable<?>> Range<C> c(d0<C> d0Var, d0<C> d0Var2) {
        return new Range<>(d0Var, d0Var2);
    }

    public static <C extends Comparable<?>> Range<C> closed(C c2, C c3) {
        return c(d0.e(c2), d0.b(c3));
    }

    public static <C extends Comparable<?>> Range<C> closedOpen(C c2, C c3) {
        return c(d0.e(c2), d0.e(c3));
    }

    public static <C extends Comparable<?>> Range<C> downTo(C c2, BoundType boundType) {
        int i = a.a[boundType.ordinal()];
        if (i == 1) {
            return greaterThan(c2);
        }
        if (i == 2) {
            return atLeast(c2);
        }
        throw new AssertionError();
    }

    public static <C extends Comparable<?>> Function<Range<C>, d0<C>> e() {
        return b.a;
    }

    public static <C extends Comparable<?>> Range<C> encloseAll(Iterable<C> iterable) {
        Preconditions.checkNotNull(iterable);
        if (iterable instanceof SortedSet) {
            SortedSet sortedSetA = a(iterable);
            Comparator comparator = sortedSetA.comparator();
            if (Ordering.natural().equals(comparator) || comparator == null) {
                return closed((Comparable) sortedSetA.first(), (Comparable) sortedSetA.last());
            }
        }
        Iterator<C> it2 = iterable.iterator();
        Comparable comparable = (Comparable) Preconditions.checkNotNull(it2.next());
        Comparable comparable2 = comparable;
        while (it2.hasNext()) {
            Comparable comparable3 = (Comparable) Preconditions.checkNotNull(it2.next());
            comparable = (Comparable) Ordering.natural().min(comparable, comparable3);
            comparable2 = (Comparable) Ordering.natural().max(comparable2, comparable3);
        }
        return closed(comparable, comparable2);
    }

    public static <C extends Comparable<?>> Ordering<Range<C>> f() {
        return (Ordering<Range<C>>) c.c;
    }

    private static String g(d0<?> d0Var, d0<?> d0Var2) {
        StringBuilder sb = new StringBuilder(16);
        d0Var.h(sb);
        sb.append("..");
        d0Var2.i(sb);
        return sb.toString();
    }

    public static <C extends Comparable<?>> Range<C> greaterThan(C c2) {
        return c(d0.b(c2), d0.a());
    }

    public static <C extends Comparable<?>> Function<Range<C>, d0<C>> h() {
        return d.a;
    }

    public static <C extends Comparable<?>> Range<C> lessThan(C c2) {
        return c(d0.c(), d0.e(c2));
    }

    public static <C extends Comparable<?>> Range<C> open(C c2, C c3) {
        return c(d0.b(c2), d0.e(c3));
    }

    public static <C extends Comparable<?>> Range<C> openClosed(C c2, C c3) {
        return c(d0.b(c2), d0.b(c3));
    }

    public static <C extends Comparable<?>> Range<C> range(C c2, BoundType boundType, C c3, BoundType boundType2) {
        Preconditions.checkNotNull(boundType);
        Preconditions.checkNotNull(boundType2);
        BoundType boundType3 = BoundType.OPEN;
        return c(boundType == boundType3 ? d0.b(c2) : d0.e(c2), boundType2 == boundType3 ? d0.e(c3) : d0.b(c3));
    }

    public static <C extends Comparable<?>> Range<C> singleton(C c2) {
        return closed(c2, c2);
    }

    public static <C extends Comparable<?>> Range<C> upTo(C c2, BoundType boundType) {
        int i = a.a[boundType.ordinal()];
        if (i == 1) {
            return lessThan(c2);
        }
        if (i == 2) {
            return atMost(c2);
        }
        throw new AssertionError();
    }

    public Range<C> canonical(DiscreteDomain<C> discreteDomain) {
        Preconditions.checkNotNull(discreteDomain);
        d0<C> d0VarF = this.a.f(discreteDomain);
        d0<C> d0VarF2 = this.b.f(discreteDomain);
        return (d0VarF == this.a && d0VarF2 == this.b) ? this : c(d0VarF, d0VarF2);
    }

    public boolean contains(C c2) {
        Preconditions.checkNotNull(c2);
        return this.a.m(c2) && !this.b.m(c2);
    }

    public boolean containsAll(Iterable<? extends C> iterable) {
        if (Iterables.isEmpty(iterable)) {
            return true;
        }
        if (iterable instanceof SortedSet) {
            SortedSet sortedSetA = a(iterable);
            Comparator comparator = sortedSetA.comparator();
            if (Ordering.natural().equals(comparator) || comparator == null) {
                return contains((Comparable) sortedSetA.first()) && contains((Comparable) sortedSetA.last());
            }
        }
        Iterator<? extends C> it2 = iterable.iterator();
        while (it2.hasNext()) {
            if (!contains(it2.next())) {
                return false;
            }
        }
        return true;
    }

    public boolean encloses(Range<C> range) {
        return this.a.compareTo(range.a) <= 0 && this.b.compareTo(range.b) >= 0;
    }

    @Override // com.google.common.base.Predicate
    public boolean equals(@NullableDecl Object obj) {
        if (!(obj instanceof Range)) {
            return false;
        }
        Range range = (Range) obj;
        return this.a.equals(range.a) && this.b.equals(range.b);
    }

    public Range<C> gap(Range<C> range) {
        boolean z = this.a.compareTo(range.a) < 0;
        Range<C> range2 = z ? this : range;
        if (!z) {
            range = this;
        }
        return c(range2.b, range.a);
    }

    public boolean hasLowerBound() {
        return this.a != d0.c();
    }

    public boolean hasUpperBound() {
        return this.b != d0.a();
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public Range<C> intersection(Range<C> range) {
        int iG = this.a.compareTo(range.a);
        int iG2 = this.b.compareTo(range.b);
        if (iG >= 0 && iG2 <= 0) {
            return this;
        }
        if (iG > 0 || iG2 < 0) {
            return c(iG >= 0 ? this.a : range.a, iG2 <= 0 ? this.b : range.b);
        }
        return range;
    }

    public boolean isConnected(Range<C> range) {
        return this.a.compareTo(range.b) <= 0 && range.a.compareTo(this.b) <= 0;
    }

    public boolean isEmpty() {
        return this.a.equals(this.b);
    }

    public BoundType lowerBoundType() {
        return this.a.o();
    }

    public C lowerEndpoint() {
        return (C) this.a.j();
    }

    public Object readResolve() {
        return equals(c) ? all() : this;
    }

    public Range<C> span(Range<C> range) {
        int iG = this.a.compareTo(range.a);
        int iG2 = this.b.compareTo(range.b);
        if (iG <= 0 && iG2 >= 0) {
            return this;
        }
        if (iG < 0 || iG2 > 0) {
            return c(iG <= 0 ? this.a : range.a, iG2 >= 0 ? this.b : range.b);
        }
        return range;
    }

    public String toString() {
        return g(this.a, this.b);
    }

    public BoundType upperBoundType() {
        return this.b.p();
    }

    public C upperEndpoint() {
        return (C) this.b.j();
    }

    @Override // com.google.common.base.Predicate
    @Deprecated
    public boolean apply(C c2) {
        return contains(c2);
    }
}
