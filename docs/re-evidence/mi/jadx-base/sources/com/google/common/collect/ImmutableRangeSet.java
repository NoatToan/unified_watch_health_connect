package com.google.common.collect;

import defpackage.ahd;
import defpackage.b10;
import defpackage.c6i;
import defpackage.cpd;
import defpackage.df5;
import defpackage.dqh;
import defpackage.epd;
import defpackage.ey6;
import defpackage.ich;
import defpackage.kz5;
import defpackage.o10;
import defpackage.sbj;
import defpackage.uaq;
import defpackage.xhe;
import java.io.Serializable;
import java.lang.Comparable;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
public final class ImmutableRangeSet<C extends Comparable> extends o10<C> implements Serializable {
    private transient ImmutableRangeSet<C> complement;
    private final transient ImmutableList<Range<C>> ranges;
    private static final ImmutableRangeSet<Comparable<?>> EMPTY = new ImmutableRangeSet<>(ImmutableList.of());
    private static final ImmutableRangeSet<Comparable<?>> ALL = new ImmutableRangeSet<>(ImmutableList.of(Range.all()));

    public class a extends ImmutableList<Range<C>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f9062a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f9063b;
        public final /* synthetic */ Range c;

        public a(int i, int i2, Range range) {
            this.f9062a = i;
            this.f9063b = i2;
            this.c = range;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.List
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Range<C> get(int i) {
            c6i.m(i, this.f9062a);
            return (i == 0 || i == this.f9062a + (-1)) ? ((Range) ImmutableRangeSet.this.ranges.get(i + this.f9063b)).intersection(this.c) : (Range) ImmutableRangeSet.this.ranges.get(i + this.f9063b);
        }

        @Override // com.google.common.collect.ImmutableCollection
        public boolean isPartialView() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f9062a;
        }
    }

    public final class b extends ImmutableSortedSet<C> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ey6<C> f9064a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public transient Integer f9065b;

        public class a extends b10<C> {
            public final Iterator<Range<C>> c;
            public Iterator<C> d = epd.h();

            public a() {
                this.c = ImmutableRangeSet.this.ranges.iterator();
            }

            @Override // defpackage.b10
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public C a() {
                while (!this.d.hasNext()) {
                    if (!this.c.hasNext()) {
                        return (C) b();
                    }
                    this.d = ContiguousSet.create(this.c.next(), b.this.f9064a).iterator();
                }
                return this.d.next();
            }
        }

        /* JADX INFO: renamed from: com.google.common.collect.ImmutableRangeSet$b$b, reason: collision with other inner class name */
        public class C0229b extends b10<C> {
            public final Iterator<Range<C>> c;
            public Iterator<C> d = epd.h();

            public C0229b() {
                this.c = ImmutableRangeSet.this.ranges.reverse().iterator();
            }

            @Override // defpackage.b10
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public C a() {
                while (!this.d.hasNext()) {
                    if (!this.c.hasNext()) {
                        return (C) b();
                    }
                    this.d = ContiguousSet.create(this.c.next(), b.this.f9064a).descendingIterator();
                }
                return this.d.next();
            }
        }

        public b(ey6<C> ey6Var) {
            super(ich.e());
            this.f9064a = ey6Var;
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            if (obj == null) {
                return false;
            }
            try {
                return ImmutableRangeSet.this.contains((Comparable) obj);
            } catch (ClassCastException unused) {
                return false;
            }
        }

        @Override // com.google.common.collect.ImmutableSortedSet
        public ImmutableSortedSet<C> createDescendingSet() {
            return new kz5(this);
        }

        @Override // com.google.common.collect.ImmutableSortedSet
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public ImmutableSortedSet<C> headSetImpl(C c, boolean z) {
            return g(Range.upTo(c, BoundType.forBoolean(z)));
        }

        public ImmutableSortedSet<C> g(Range<C> range) {
            return ImmutableRangeSet.this.subRangeSet((Range) range).asSet(this.f9064a);
        }

        @Override // com.google.common.collect.ImmutableSortedSet
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public ImmutableSortedSet<C> subSetImpl(C c, boolean z, C c2, boolean z2) {
            return (z || z2 || Range.compareOrThrow(c, c2) != 0) ? g(Range.range(c, BoundType.forBoolean(z), c2, BoundType.forBoolean(z2))) : ImmutableSortedSet.of();
        }

        @Override // com.google.common.collect.ImmutableSortedSet
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public ImmutableSortedSet<C> tailSetImpl(C c, boolean z) {
            return g(Range.downTo(c, BoundType.forBoolean(z)));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.ImmutableSortedSet
        public int indexOf(Object obj) {
            if (!contains(obj)) {
                return -1;
            }
            Objects.requireNonNull(obj);
            Comparable comparable = (Comparable) obj;
            uaq it = ImmutableRangeSet.this.ranges.iterator();
            long size = 0;
            while (it.hasNext()) {
                Range range = (Range) it.next();
                if (range.contains(comparable)) {
                    return ahd.j(size + ((long) ContiguousSet.create(range, this.f9064a).indexOf(comparable)));
                }
                size += (long) ContiguousSet.create(range, this.f9064a).size();
            }
            throw new AssertionError("impossible");
        }

        @Override // com.google.common.collect.ImmutableCollection
        public boolean isPartialView() {
            return ImmutableRangeSet.this.ranges.isPartialView();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            Integer numValueOf = this.f9065b;
            if (numValueOf == null) {
                uaq it = ImmutableRangeSet.this.ranges.iterator();
                long size = 0;
                while (it.hasNext()) {
                    size += (long) ContiguousSet.create((Range) it.next(), this.f9064a).size();
                    if (size >= 2147483647L) {
                        break;
                    }
                }
                numValueOf = Integer.valueOf(ahd.j(size));
                this.f9065b = numValueOf;
            }
            return numValueOf.intValue();
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            return ImmutableRangeSet.this.ranges.toString();
        }

        @Override // com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        public Object writeReplace() {
            return new c(ImmutableRangeSet.this.ranges, this.f9064a);
        }

        @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
        public uaq<C> descendingIterator() {
            return new C0229b();
        }

        @Override // com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public uaq<C> iterator() {
            return new a();
        }
    }

    public static class c<C extends Comparable> implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ImmutableList<Range<C>> f9066a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ey6<C> f9067b;

        public c(ImmutableList<Range<C>> immutableList, ey6<C> ey6Var) {
            this.f9066a = immutableList;
            this.f9067b = ey6Var;
        }

        public Object readResolve() {
            return new ImmutableRangeSet(this.f9066a).asSet(this.f9067b);
        }
    }

    public static class d<C extends Comparable<?>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<Range<C>> f9068a = xhe.g();

        public d<C> a(Range<C> range) {
            c6i.j(!range.isEmpty(), "range must not be empty, but was %s", range);
            this.f9068a.add(range);
            return this;
        }

        public d<C> b(Iterable<Range<C>> iterable) {
            Iterator<Range<C>> it = iterable.iterator();
            while (it.hasNext()) {
                a(it.next());
            }
            return this;
        }

        public ImmutableRangeSet<C> c() {
            ImmutableList.a aVar = new ImmutableList.a(this.f9068a.size());
            Collections.sort(this.f9068a, Range.rangeLexOrdering());
            dqh dqhVarP = epd.p(this.f9068a.iterator());
            while (dqhVarP.hasNext()) {
                Range rangeSpan = (Range) dqhVarP.next();
                while (dqhVarP.hasNext()) {
                    Range<C> range = (Range) dqhVarP.peek();
                    if (!rangeSpan.isConnected(range)) {
                        break;
                    }
                    c6i.k(rangeSpan.intersection(range).isEmpty(), "Overlapping ranges not permitted but found %s overlapping %s", rangeSpan, range);
                    rangeSpan = rangeSpan.span((Range) dqhVarP.next());
                }
                aVar.a(rangeSpan);
            }
            ImmutableList immutableListK = aVar.k();
            if (immutableListK.isEmpty()) {
                return ImmutableRangeSet.of();
            }
            return (immutableListK.size() == 1 && ((Range) cpd.h(immutableListK)).equals(Range.all())) ? ImmutableRangeSet.all() : new ImmutableRangeSet<>(immutableListK);
        }
    }

    public final class e extends ImmutableList<Range<C>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f9069a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f9070b;
        public final int c;

        /* JADX WARN: Multi-variable type inference failed */
        public e() {
            boolean zHasLowerBound = ((Range) ImmutableRangeSet.this.ranges.get(0)).hasLowerBound();
            this.f9069a = zHasLowerBound;
            boolean zHasUpperBound = ((Range) cpd.f(ImmutableRangeSet.this.ranges)).hasUpperBound();
            this.f9070b = zHasUpperBound;
            int size = ImmutableRangeSet.this.ranges.size();
            size = zHasLowerBound ? size : size - 1;
            this.c = zHasUpperBound ? size + 1 : size;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.List
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Range<C> get(int i) {
            df5<C> df5VarC;
            c6i.m(i, this.c);
            if (this.f9069a) {
                df5VarC = i == 0 ? df5.c() : ((Range) ImmutableRangeSet.this.ranges.get(i - 1)).upperBound;
            } else {
                df5VarC = ((Range) ImmutableRangeSet.this.ranges.get(i)).upperBound;
            }
            return Range.create(df5VarC, (this.f9070b && i == this.c + (-1)) ? df5.a() : ((Range) ImmutableRangeSet.this.ranges.get(i + (!this.f9069a ? 1 : 0))).lowerBound);
        }

        @Override // com.google.common.collect.ImmutableCollection
        public boolean isPartialView() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.c;
        }
    }

    public static final class f<C extends Comparable> implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ImmutableList<Range<C>> f9071a;

        public f(ImmutableList<Range<C>> immutableList) {
            this.f9071a = immutableList;
        }

        public Object readResolve() {
            if (this.f9071a.isEmpty()) {
                return ImmutableRangeSet.of();
            }
            return this.f9071a.equals(ImmutableList.of(Range.all())) ? ImmutableRangeSet.all() : new ImmutableRangeSet(this.f9071a);
        }
    }

    public ImmutableRangeSet(ImmutableList<Range<C>> immutableList) {
        this.ranges = immutableList;
    }

    public static <C extends Comparable> ImmutableRangeSet<C> all() {
        return ALL;
    }

    public static <C extends Comparable<?>> d<C> builder() {
        return new d<>();
    }

    public static <C extends Comparable> ImmutableRangeSet<C> copyOf(sbj<C> sbjVar) {
        c6i.o(sbjVar);
        if (sbjVar.isEmpty()) {
            return of();
        }
        if (sbjVar.encloses(Range.all())) {
            return all();
        }
        if (sbjVar instanceof ImmutableRangeSet) {
            ImmutableRangeSet<C> immutableRangeSet = (ImmutableRangeSet) sbjVar;
            if (!immutableRangeSet.isPartialView()) {
                return immutableRangeSet;
            }
        }
        return new ImmutableRangeSet<>(ImmutableList.copyOf((Collection) sbjVar.asRanges()));
    }

    private ImmutableList<Range<C>> intersectRanges(Range<C> range) {
        if (this.ranges.isEmpty() || range.isEmpty()) {
            return ImmutableList.of();
        }
        if (range.encloses(span())) {
            return this.ranges;
        }
        int iA = range.hasLowerBound() ? k0.a(this.ranges, Range.upperBoundFn(), range.lowerBound, k0.c.d, k0.b.f9195b) : 0;
        int iA2 = (range.hasUpperBound() ? k0.a(this.ranges, Range.lowerBoundFn(), range.upperBound, k0.c.c, k0.b.f9195b) : this.ranges.size()) - iA;
        return iA2 == 0 ? ImmutableList.of() : new a(iA2, iA, range);
    }

    public static <C extends Comparable> ImmutableRangeSet<C> of() {
        return EMPTY;
    }

    public static <C extends Comparable<?>> ImmutableRangeSet<C> unionOf(Iterable<Range<C>> iterable) {
        return copyOf(TreeRangeSet.create(iterable));
    }

    @Override // defpackage.o10
    @Deprecated
    public void add(Range<C> range) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.o10
    @Deprecated
    public void addAll(sbj<C> sbjVar) {
        throw new UnsupportedOperationException();
    }

    public ImmutableSortedSet<C> asSet(ey6<C> ey6Var) {
        c6i.o(ey6Var);
        if (isEmpty()) {
            return ImmutableSortedSet.of();
        }
        Range<C> rangeCanonical = span().canonical(ey6Var);
        if (!rangeCanonical.hasLowerBound()) {
            throw new IllegalArgumentException("Neither the DiscreteDomain nor this range set are bounded below");
        }
        if (!rangeCanonical.hasUpperBound()) {
            try {
                ey6Var.d();
            } catch (NoSuchElementException unused) {
                throw new IllegalArgumentException("Neither the DiscreteDomain nor this range set are bounded above");
            }
        }
        return new b(ey6Var);
    }

    @Override // defpackage.o10
    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    @Override // defpackage.o10
    public /* bridge */ /* synthetic */ boolean contains(Comparable comparable) {
        return super.contains(comparable);
    }

    public ImmutableRangeSet<C> difference(sbj<C> sbjVar) {
        TreeRangeSet treeRangeSetCreate = TreeRangeSet.create(this);
        treeRangeSetCreate.removeAll(sbjVar);
        return copyOf(treeRangeSetCreate);
    }

    @Override // defpackage.o10, defpackage.sbj
    public boolean encloses(Range<C> range) {
        int iB = k0.b(this.ranges, Range.lowerBoundFn(), range.lowerBound, ich.e(), k0.c.f9196a, k0.b.f9194a);
        return iB != -1 && this.ranges.get(iB).encloses(range);
    }

    @Override // defpackage.o10
    public /* bridge */ /* synthetic */ boolean enclosesAll(sbj sbjVar) {
        return super.enclosesAll(sbjVar);
    }

    @Override // defpackage.o10
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    public ImmutableRangeSet<C> intersection(sbj<C> sbjVar) {
        TreeRangeSet treeRangeSetCreate = TreeRangeSet.create(this);
        treeRangeSetCreate.removeAll(sbjVar.complement());
        return copyOf(treeRangeSetCreate);
    }

    @Override // defpackage.o10
    public boolean intersects(Range<C> range) {
        int iB = k0.b(this.ranges, Range.lowerBoundFn(), range.lowerBound, ich.e(), k0.c.f9196a, k0.b.f9195b);
        if (iB < this.ranges.size() && this.ranges.get(iB).isConnected(range) && !this.ranges.get(iB).intersection(range).isEmpty()) {
            return true;
        }
        if (iB > 0) {
            int i = iB - 1;
            if (this.ranges.get(i).isConnected(range) && !this.ranges.get(i).intersection(range).isEmpty()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.o10, defpackage.sbj
    public boolean isEmpty() {
        return this.ranges.isEmpty();
    }

    public boolean isPartialView() {
        return this.ranges.isPartialView();
    }

    @Override // defpackage.o10
    public Range<C> rangeContaining(C c2) {
        int iB = k0.b(this.ranges, Range.lowerBoundFn(), df5.d(c2), ich.e(), k0.c.f9196a, k0.b.f9194a);
        if (iB == -1) {
            return null;
        }
        Range<C> range = this.ranges.get(iB);
        if (range.contains(c2)) {
            return range;
        }
        return null;
    }

    @Override // defpackage.o10
    @Deprecated
    public void remove(Range<C> range) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.o10, defpackage.sbj
    @Deprecated
    public void removeAll(sbj<C> sbjVar) {
        throw new UnsupportedOperationException();
    }

    public Range<C> span() {
        if (this.ranges.isEmpty()) {
            throw new NoSuchElementException();
        }
        df5<C> df5Var = this.ranges.get(0).lowerBound;
        ImmutableList<Range<C>> immutableList = this.ranges;
        return Range.create(df5Var, immutableList.get(immutableList.size() - 1).upperBound);
    }

    public ImmutableRangeSet<C> union(sbj<C> sbjVar) {
        return unionOf(cpd.c(asRanges(), sbjVar.asRanges()));
    }

    public Object writeReplace() {
        return new f(this.ranges);
    }

    public static <C extends Comparable> ImmutableRangeSet<C> of(Range<C> range) {
        c6i.o(range);
        if (range.isEmpty()) {
            return of();
        }
        return range.equals(Range.all()) ? all() : new ImmutableRangeSet<>(ImmutableList.of(range));
    }

    @Override // defpackage.o10
    @Deprecated
    public void addAll(Iterable<Range<C>> iterable) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: asDescendingSetOfRanges, reason: merged with bridge method [inline-methods] */
    public ImmutableSet<Range<C>> m138asDescendingSetOfRanges() {
        return this.ranges.isEmpty() ? ImmutableSet.of() : new e0(this.ranges.reverse(), Range.rangeLexOrdering().h());
    }

    @Override // defpackage.sbj
    public ImmutableSet<Range<C>> asRanges() {
        return this.ranges.isEmpty() ? ImmutableSet.of() : new e0(this.ranges, Range.rangeLexOrdering());
    }

    @Override // defpackage.sbj
    public ImmutableRangeSet<C> complement() {
        ImmutableRangeSet<C> immutableRangeSet = this.complement;
        if (immutableRangeSet != null) {
            return immutableRangeSet;
        }
        if (this.ranges.isEmpty()) {
            ImmutableRangeSet<C> immutableRangeSetAll = all();
            this.complement = immutableRangeSetAll;
            return immutableRangeSetAll;
        }
        if (this.ranges.size() == 1 && this.ranges.get(0).equals(Range.all())) {
            ImmutableRangeSet<C> immutableRangeSetOf = of();
            this.complement = immutableRangeSetOf;
            return immutableRangeSetOf;
        }
        ImmutableRangeSet<C> immutableRangeSet2 = new ImmutableRangeSet<>(new e(), this);
        this.complement = immutableRangeSet2;
        return immutableRangeSet2;
    }

    @Override // defpackage.o10
    public /* bridge */ /* synthetic */ boolean enclosesAll(Iterable iterable) {
        return super.enclosesAll(iterable);
    }

    @Override // defpackage.o10
    @Deprecated
    public void removeAll(Iterable<Range<C>> iterable) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.sbj
    public ImmutableRangeSet<C> subRangeSet(Range<C> range) {
        if (!isEmpty()) {
            Range<C> rangeSpan = span();
            if (range.encloses(rangeSpan)) {
                return this;
            }
            if (range.isConnected(rangeSpan)) {
                return new ImmutableRangeSet<>(intersectRanges(range));
            }
        }
        return of();
    }

    private ImmutableRangeSet(ImmutableList<Range<C>> immutableList, ImmutableRangeSet<C> immutableRangeSet) {
        this.ranges = immutableList;
        this.complement = immutableRangeSet;
    }

    public static <C extends Comparable<?>> ImmutableRangeSet<C> copyOf(Iterable<Range<C>> iterable) {
        return new d().b(iterable).c();
    }
}
