package com.google.common.collect;

import defpackage.c6i;
import defpackage.cpd;
import defpackage.df5;
import defpackage.dua;
import defpackage.ey6;
import defpackage.h6i;
import defpackage.ich;
import defpackage.qbj;
import defpackage.u94;
import java.io.Serializable;
import java.lang.Comparable;
import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes5.dex */
public final class Range<C extends Comparable> extends qbj implements h6i<C>, Serializable {
    private static final Range<Comparable> ALL = new Range<>(df5.c(), df5.a());
    private static final long serialVersionUID = 0;
    final df5<C> lowerBound;
    final df5<C> upperBound;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9111a;

        static {
            int[] iArr = new int[BoundType.values().length];
            f9111a = iArr;
            try {
                iArr[BoundType.OPEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9111a[BoundType.CLOSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static class b implements dua<Range, df5> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f9112a = new b();

        @Override // defpackage.dua
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public df5 apply(Range range) {
            return range.lowerBound;
        }
    }

    public static class c extends ich<Range<?>> implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ich<Range<?>> f9113a = new c();
        private static final long serialVersionUID = 0;

        @Override // defpackage.ich, java.util.Comparator
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public int compare(Range<?> range, Range<?> range2) {
            return u94.k().f(range.lowerBound, range2.lowerBound).f(range.upperBound, range2.upperBound).j();
        }
    }

    public static class d implements dua<Range, df5> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f9114a = new d();

        @Override // defpackage.dua
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public df5 apply(Range range) {
            return range.upperBound;
        }
    }

    private Range(df5<C> df5Var, df5<C> df5Var2) {
        this.lowerBound = (df5) c6i.o(df5Var);
        this.upperBound = (df5) c6i.o(df5Var2);
        if (df5Var.compareTo(df5Var2) > 0 || df5Var == df5.a() || df5Var2 == df5.c()) {
            String strValueOf = String.valueOf(toString(df5Var, df5Var2));
            throw new IllegalArgumentException(strValueOf.length() != 0 ? "Invalid range: ".concat(strValueOf) : new String("Invalid range: "));
        }
    }

    public static <C extends Comparable<?>> Range<C> all() {
        return (Range<C>) ALL;
    }

    public static <C extends Comparable<?>> Range<C> atLeast(C c2) {
        return create(df5.d(c2), df5.a());
    }

    public static <C extends Comparable<?>> Range<C> atMost(C c2) {
        return create(df5.c(), df5.b(c2));
    }

    public static <C extends Comparable<?>> Range<C> closed(C c2, C c3) {
        return create(df5.d(c2), df5.b(c3));
    }

    public static <C extends Comparable<?>> Range<C> closedOpen(C c2, C c3) {
        return create(df5.d(c2), df5.d(c3));
    }

    public static int compareOrThrow(Comparable comparable, Comparable comparable2) {
        return comparable.compareTo(comparable2);
    }

    public static <C extends Comparable<?>> Range<C> create(df5<C> df5Var, df5<C> df5Var2) {
        return new Range<>(df5Var, df5Var2);
    }

    public static <C extends Comparable<?>> Range<C> downTo(C c2, BoundType boundType) {
        int i = a.f9111a[boundType.ordinal()];
        if (i == 1) {
            return greaterThan(c2);
        }
        if (i == 2) {
            return atLeast(c2);
        }
        throw new AssertionError();
    }

    public static <C extends Comparable<?>> Range<C> encloseAll(Iterable<C> iterable) {
        c6i.o(iterable);
        if (iterable instanceof SortedSet) {
            SortedSet sortedSet = (SortedSet) iterable;
            Comparator comparator = sortedSet.comparator();
            if (ich.e().equals(comparator) || comparator == null) {
                return closed((Comparable) sortedSet.first(), (Comparable) sortedSet.last());
            }
        }
        Iterator<C> it = iterable.iterator();
        Comparable comparable = (Comparable) c6i.o(it.next());
        Comparable comparable2 = comparable;
        while (it.hasNext()) {
            Comparable comparable3 = (Comparable) c6i.o(it.next());
            comparable = (Comparable) ich.e().d(comparable, comparable3);
            comparable2 = (Comparable) ich.e().c(comparable2, comparable3);
        }
        return closed(comparable, comparable2);
    }

    public static <C extends Comparable<?>> Range<C> greaterThan(C c2) {
        return create(df5.b(c2), df5.a());
    }

    public static <C extends Comparable<?>> Range<C> lessThan(C c2) {
        return create(df5.c(), df5.d(c2));
    }

    public static <C extends Comparable<?>> dua<Range<C>, df5<C>> lowerBoundFn() {
        return b.f9112a;
    }

    public static <C extends Comparable<?>> Range<C> open(C c2, C c3) {
        return create(df5.b(c2), df5.d(c3));
    }

    public static <C extends Comparable<?>> Range<C> openClosed(C c2, C c3) {
        return create(df5.b(c2), df5.b(c3));
    }

    public static <C extends Comparable<?>> Range<C> range(C c2, BoundType boundType, C c3, BoundType boundType2) {
        c6i.o(boundType);
        c6i.o(boundType2);
        BoundType boundType3 = BoundType.OPEN;
        return create(boundType == boundType3 ? df5.b(c2) : df5.d(c2), boundType2 == boundType3 ? df5.d(c3) : df5.b(c3));
    }

    public static <C extends Comparable<?>> ich<Range<C>> rangeLexOrdering() {
        return (ich<Range<C>>) c.f9113a;
    }

    public static <C extends Comparable<?>> Range<C> singleton(C c2) {
        return closed(c2, c2);
    }

    public static <C extends Comparable<?>> Range<C> upTo(C c2, BoundType boundType) {
        int i = a.f9111a[boundType.ordinal()];
        if (i == 1) {
            return lessThan(c2);
        }
        if (i == 2) {
            return atMost(c2);
        }
        throw new AssertionError();
    }

    public static <C extends Comparable<?>> dua<Range<C>, df5<C>> upperBoundFn() {
        return d.f9114a;
    }

    public Range<C> canonical(ey6<C> ey6Var) {
        c6i.o(ey6Var);
        df5<C> df5VarE = this.lowerBound.e(ey6Var);
        df5<C> df5VarE2 = this.upperBound.e(ey6Var);
        return (df5VarE == this.lowerBound && df5VarE2 == this.upperBound) ? this : create(df5VarE, df5VarE2);
    }

    public boolean contains(C c2) {
        c6i.o(c2);
        return this.lowerBound.o(c2) && !this.upperBound.o(c2);
    }

    public boolean containsAll(Iterable<? extends C> iterable) {
        if (cpd.i(iterable)) {
            return true;
        }
        if (iterable instanceof SortedSet) {
            SortedSet sortedSet = (SortedSet) iterable;
            Comparator comparator = sortedSet.comparator();
            if (ich.e().equals(comparator) || comparator == null) {
                return contains((Comparable) sortedSet.first()) && contains((Comparable) sortedSet.last());
            }
        }
        Iterator<? extends C> it = iterable.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public boolean encloses(Range<C> range) {
        return this.lowerBound.compareTo(range.lowerBound) <= 0 && this.upperBound.compareTo(range.upperBound) >= 0;
    }

    @Override // defpackage.h6i
    public boolean equals(Object obj) {
        if (!(obj instanceof Range)) {
            return false;
        }
        Range range = (Range) obj;
        return this.lowerBound.equals(range.lowerBound) && this.upperBound.equals(range.upperBound);
    }

    public Range<C> gap(Range<C> range) {
        if (this.lowerBound.compareTo(range.upperBound) >= 0 || range.lowerBound.compareTo(this.upperBound) >= 0) {
            boolean z = this.lowerBound.compareTo(range.lowerBound) < 0;
            Range<C> range2 = z ? this : range;
            if (!z) {
                range = this;
            }
            return create(range2.upperBound, range.lowerBound);
        }
        String strValueOf = String.valueOf(this);
        String strValueOf2 = String.valueOf(range);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 39 + strValueOf2.length());
        sb.append("Ranges have a nonempty intersection: ");
        sb.append(strValueOf);
        sb.append(", ");
        sb.append(strValueOf2);
        throw new IllegalArgumentException(sb.toString());
    }

    public boolean hasLowerBound() {
        return this.lowerBound != df5.c();
    }

    public boolean hasUpperBound() {
        return this.upperBound != df5.a();
    }

    public int hashCode() {
        return (this.lowerBound.hashCode() * 31) + this.upperBound.hashCode();
    }

    public Range<C> intersection(Range<C> range) {
        int iH = this.lowerBound.compareTo(range.lowerBound);
        int iH2 = this.upperBound.compareTo(range.upperBound);
        if (iH >= 0 && iH2 <= 0) {
            return this;
        }
        if (iH <= 0 && iH2 >= 0) {
            return range;
        }
        df5<C> df5Var = iH >= 0 ? this.lowerBound : range.lowerBound;
        df5<C> df5Var2 = iH2 <= 0 ? this.upperBound : range.upperBound;
        c6i.k(df5Var.compareTo(df5Var2) <= 0, "intersection is undefined for disconnected ranges %s and %s", this, range);
        return create(df5Var, df5Var2);
    }

    public boolean isConnected(Range<C> range) {
        return this.lowerBound.compareTo(range.upperBound) <= 0 && range.lowerBound.compareTo(this.upperBound) <= 0;
    }

    public boolean isEmpty() {
        return this.lowerBound.equals(this.upperBound);
    }

    public BoundType lowerBoundType() {
        return this.lowerBound.r();
    }

    public C lowerEndpoint() {
        return (C) this.lowerBound.m();
    }

    public Object readResolve() {
        return equals(ALL) ? all() : this;
    }

    public Range<C> span(Range<C> range) {
        int iH = this.lowerBound.compareTo(range.lowerBound);
        int iH2 = this.upperBound.compareTo(range.upperBound);
        if (iH <= 0 && iH2 >= 0) {
            return this;
        }
        if (iH < 0 || iH2 > 0) {
            return create(iH <= 0 ? this.lowerBound : range.lowerBound, iH2 >= 0 ? this.upperBound : range.upperBound);
        }
        return range;
    }

    public String toString() {
        return toString(this.lowerBound, this.upperBound);
    }

    public BoundType upperBoundType() {
        return this.upperBound.s();
    }

    public C upperEndpoint() {
        return (C) this.upperBound.m();
    }

    private static String toString(df5<?> df5Var, df5<?> df5Var2) {
        StringBuilder sb = new StringBuilder(16);
        df5Var.i(sb);
        sb.append("..");
        df5Var2.k(sb);
        return sb.toString();
    }

    @Override // defpackage.h6i
    @Deprecated
    public boolean apply(C c2) {
        return contains(c2);
    }
}
