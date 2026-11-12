package com.google.common.collect;

import com.fasterxml.jackson.core.base.ParserMinimalBase;
import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Ints;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.io.Serializable;
import java.lang.Comparable;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes3.dex */
@Beta
@GwtIncompatible
public final class ImmutableRangeSet<C extends Comparable> extends j<C> implements Serializable {
    private static final ImmutableRangeSet<Comparable<?>> c = new ImmutableRangeSet<>(ImmutableList.of());
    private static final ImmutableRangeSet<Comparable<?>> d = new ImmutableRangeSet<>(ImmutableList.of(Range.all()));
    private final transient ImmutableList<Range<C>> a;

    @LazyInit
    private transient ImmutableRangeSet<C> b;

    public static class Builder<C extends Comparable<?>> {
        private final List<Range<C>> a = Lists.newArrayList();

        @CanIgnoreReturnValue
        public Builder<C> add(Range<C> range) {
            Preconditions.checkArgument(!range.isEmpty(), "range must not be empty, but was %s", range);
            this.a.add(range);
            return this;
        }

        @CanIgnoreReturnValue
        public Builder<C> addAll(RangeSet<C> rangeSet) {
            return addAll(rangeSet.asRanges());
        }

        public ImmutableRangeSet<C> build() {
            ImmutableList.Builder builder = new ImmutableList.Builder(this.a.size());
            Collections.sort(this.a, Range.f());
            PeekingIterator peekingIterator = Iterators.peekingIterator(this.a.iterator());
            while (peekingIterator.hasNext()) {
                Range rangeSpan = (Range) peekingIterator.next();
                while (peekingIterator.hasNext()) {
                    Range<C> range = (Range) peekingIterator.peek();
                    if (!rangeSpan.isConnected(range)) {
                        break;
                    }
                    Preconditions.checkArgument(rangeSpan.intersection(range).isEmpty(), "Overlapping ranges not permitted but found %s overlapping %s", rangeSpan, range);
                    rangeSpan = rangeSpan.span((Range) peekingIterator.next());
                }
                builder.add(rangeSpan);
            }
            ImmutableList immutableListBuild = builder.build();
            if (immutableListBuild.isEmpty()) {
                return ImmutableRangeSet.of();
            }
            return (immutableListBuild.size() == 1 && ((Range) Iterables.getOnlyElement(immutableListBuild)).equals(Range.all())) ? ImmutableRangeSet.b() : new ImmutableRangeSet<>(immutableListBuild);
        }

        @CanIgnoreReturnValue
        public Builder<C> addAll(Iterable<Range<C>> iterable) {
            Iterator<Range<C>> it2 = iterable.iterator();
            while (it2.hasNext()) {
                add(it2.next());
            }
            return this;
        }
    }

    public class a extends ImmutableList<Range<C>> {
        public final /* synthetic */ int c;
        public final /* synthetic */ int d;
        public final /* synthetic */ Range e;

        public a(int i, int i2, Range range) {
            this.c = i;
            this.d = i2;
            this.e = range;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public boolean f() {
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.List
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Range<C> get(int i) {
            Preconditions.checkElementIndex(i, this.c);
            return (i == 0 || i == this.c + (-1)) ? ((Range) ImmutableRangeSet.this.a.get(i + this.d)).intersection(this.e) : (Range) ImmutableRangeSet.this.a.get(i + this.d);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.c;
        }
    }

    public final class b extends ImmutableSortedSet<C> {
        private final DiscreteDomain<C> h;

        @MonotonicNonNullDecl
        private transient Integer i;

        public class a extends AbstractIterator<C> {
            public final Iterator<Range<C>> c;
            public Iterator<C> d = Iterators.f();

            public a() {
                this.c = ImmutableRangeSet.this.a.iterator();
            }

            @Override // com.google.common.collect.AbstractIterator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public C computeNext() {
                while (!this.d.hasNext()) {
                    if (!this.c.hasNext()) {
                        return (C) endOfData();
                    }
                    this.d = ContiguousSet.create(this.c.next(), b.this.h).iterator();
                }
                return this.d.next();
            }
        }

        /* JADX INFO: renamed from: com.google.common.collect.ImmutableRangeSet$b$b, reason: collision with other inner class name */
        public class C0178b extends AbstractIterator<C> {
            public final Iterator<Range<C>> c;
            public Iterator<C> d = Iterators.f();

            public C0178b() {
                this.c = ImmutableRangeSet.this.a.reverse().iterator();
            }

            @Override // com.google.common.collect.AbstractIterator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public C computeNext() {
                while (!this.d.hasNext()) {
                    if (!this.c.hasNext()) {
                        return (C) endOfData();
                    }
                    this.d = ContiguousSet.create(this.c.next(), b.this.h).descendingIterator();
                }
                return this.d.next();
            }
        }

        public b(DiscreteDomain<C> discreteDomain) {
            super(Ordering.natural());
            this.h = discreteDomain;
        }

        @Override // com.google.common.collect.ImmutableSortedSet
        /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
        public ImmutableSortedSet<C> t(C c, boolean z) {
            return y(Range.downTo(c, BoundType.b(z)));
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
        public boolean contains(@NullableDecl Object obj) {
            if (obj == null) {
                return false;
            }
            try {
                return ImmutableRangeSet.this.contains((Comparable) obj);
            } catch (ClassCastException unused) {
                return false;
            }
        }

        @Override // com.google.common.collect.ImmutableCollection
        public boolean f() {
            return ImmutableRangeSet.this.a.f();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.ImmutableSortedSet
        public int indexOf(Object obj) {
            if (!contains(obj)) {
                return -1;
            }
            Comparable comparable = (Comparable) obj;
            long size = 0;
            UnmodifiableIterator it2 = ImmutableRangeSet.this.a.iterator();
            while (it2.hasNext()) {
                Range range = (Range) it2.next();
                if (range.contains(comparable)) {
                    return Ints.saturatedCast(size + ((long) ContiguousSet.create(range, this.h).indexOf(comparable)));
                }
                size += (long) ContiguousSet.create(range, this.h).size();
            }
            throw new AssertionError("impossible");
        }

        @Override // com.google.common.collect.ImmutableSortedSet
        public ImmutableSortedSet<C> p() {
            return new g0(this);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            Integer numValueOf = this.i;
            if (numValueOf == null) {
                long size = 0;
                UnmodifiableIterator it2 = ImmutableRangeSet.this.a.iterator();
                while (it2.hasNext()) {
                    size += (long) ContiguousSet.create((Range) it2.next(), this.h).size();
                    if (size >= ParserMinimalBase.MAX_INT_L) {
                        break;
                    }
                }
                numValueOf = Integer.valueOf(Ints.saturatedCast(size));
                this.i = numValueOf;
            }
            return numValueOf.intValue();
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            return ImmutableRangeSet.this.a.toString();
        }

        @Override // com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        public Object writeReplace() {
            return new c(ImmutableRangeSet.this.a, this.h);
        }

        @Override // com.google.common.collect.ImmutableSortedSet
        /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
        public ImmutableSortedSet<C> r(C c, boolean z) {
            return y(Range.upTo(c, BoundType.b(z)));
        }

        public ImmutableSortedSet<C> y(Range<C> range) {
            return ImmutableRangeSet.this.subRangeSet((Range) range).asSet(this.h);
        }

        @Override // com.google.common.collect.ImmutableSortedSet
        /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
        public ImmutableSortedSet<C> s(C c, boolean z, C c2, boolean z2) {
            return (z || z2 || Range.b(c, c2) != 0) ? y(Range.range(c, BoundType.b(z), c2, BoundType.b(z2))) : ImmutableSortedSet.of();
        }

        @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
        @GwtIncompatible("NavigableSet")
        public UnmodifiableIterator<C> descendingIterator() {
            return new C0178b();
        }

        @Override // com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public UnmodifiableIterator<C> iterator() {
            return new a();
        }
    }

    public static class c<C extends Comparable> implements Serializable {
        private final ImmutableList<Range<C>> a;
        private final DiscreteDomain<C> b;

        public c(ImmutableList<Range<C>> immutableList, DiscreteDomain<C> discreteDomain) {
            this.a = immutableList;
            this.b = discreteDomain;
        }

        public Object readResolve() {
            return new ImmutableRangeSet(this.a).asSet(this.b);
        }
    }

    public final class d extends ImmutableList<Range<C>> {
        private final boolean c;
        private final boolean d;
        private final int e;

        /* JADX WARN: Multi-variable type inference failed */
        public d() {
            boolean zHasLowerBound = ((Range) ImmutableRangeSet.this.a.get(0)).hasLowerBound();
            this.c = zHasLowerBound;
            boolean zHasUpperBound = ((Range) Iterables.getLast(ImmutableRangeSet.this.a)).hasUpperBound();
            this.d = zHasUpperBound;
            int size = ImmutableRangeSet.this.a.size() - 1;
            size = zHasLowerBound ? size + 1 : size;
            this.e = zHasUpperBound ? size + 1 : size;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public boolean f() {
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.List
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Range<C> get(int i) {
            d0<C> d0VarC;
            Preconditions.checkElementIndex(i, this.e);
            if (this.c) {
                d0VarC = i == 0 ? d0.c() : ((Range) ImmutableRangeSet.this.a.get(i - 1)).b;
            } else {
                d0VarC = ((Range) ImmutableRangeSet.this.a.get(i)).b;
            }
            return Range.c(d0VarC, (this.d && i == this.e + (-1)) ? d0.a() : ((Range) ImmutableRangeSet.this.a.get(i + (!this.c ? 1 : 0))).a);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.e;
        }
    }

    public static final class e<C extends Comparable> implements Serializable {
        private final ImmutableList<Range<C>> a;

        public e(ImmutableList<Range<C>> immutableList) {
            this.a = immutableList;
        }

        public Object readResolve() {
            if (this.a.isEmpty()) {
                return ImmutableRangeSet.of();
            }
            return this.a.equals(ImmutableList.of(Range.all())) ? ImmutableRangeSet.b() : new ImmutableRangeSet(this.a);
        }
    }

    public ImmutableRangeSet(ImmutableList<Range<C>> immutableList) {
        this.a = immutableList;
    }

    public static <C extends Comparable> ImmutableRangeSet<C> b() {
        return d;
    }

    public static <C extends Comparable<?>> Builder<C> builder() {
        return new Builder<>();
    }

    private ImmutableList<Range<C>> c(Range<C> range) {
        if (this.a.isEmpty() || range.isEmpty()) {
            return ImmutableList.of();
        }
        if (range.encloses(span())) {
            return this.a;
        }
        int iA = range.hasLowerBound() ? p2.a(this.a, Range.h(), range.a, p2.c.FIRST_AFTER, p2.b.NEXT_HIGHER) : 0;
        int iA2 = (range.hasUpperBound() ? p2.a(this.a, Range.e(), range.b, p2.c.FIRST_PRESENT, p2.b.NEXT_HIGHER) : this.a.size()) - iA;
        return iA2 == 0 ? ImmutableList.of() : new a(iA2, iA, range);
    }

    public static <C extends Comparable> ImmutableRangeSet<C> copyOf(RangeSet<C> rangeSet) {
        Preconditions.checkNotNull(rangeSet);
        if (rangeSet.isEmpty()) {
            return of();
        }
        if (rangeSet.encloses(Range.all())) {
            return b();
        }
        if (rangeSet instanceof ImmutableRangeSet) {
            ImmutableRangeSet<C> immutableRangeSet = (ImmutableRangeSet) rangeSet;
            if (!immutableRangeSet.e()) {
                return immutableRangeSet;
            }
        }
        return new ImmutableRangeSet<>(ImmutableList.copyOf((Collection) rangeSet.asRanges()));
    }

    public static <C extends Comparable> ImmutableRangeSet<C> of() {
        return c;
    }

    public static <C extends Comparable<?>> ImmutableRangeSet<C> unionOf(Iterable<Range<C>> iterable) {
        return copyOf(TreeRangeSet.create(iterable));
    }

    @Override // com.google.common.collect.j, com.google.common.collect.RangeSet
    @Deprecated
    public void add(Range<C> range) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.j, com.google.common.collect.RangeSet
    @Deprecated
    public void addAll(RangeSet<C> rangeSet) {
        throw new UnsupportedOperationException();
    }

    public ImmutableSortedSet<C> asSet(DiscreteDomain<C> discreteDomain) {
        Preconditions.checkNotNull(discreteDomain);
        if (isEmpty()) {
            return ImmutableSortedSet.of();
        }
        Range<C> rangeCanonical = span().canonical(discreteDomain);
        if (!rangeCanonical.hasLowerBound()) {
            throw new IllegalArgumentException("Neither the DiscreteDomain nor this range set are bounded below");
        }
        if (!rangeCanonical.hasUpperBound()) {
            try {
                discreteDomain.maxValue();
            } catch (NoSuchElementException unused) {
                throw new IllegalArgumentException("Neither the DiscreteDomain nor this range set are bounded above");
            }
        }
        return new b(discreteDomain);
    }

    @Override // com.google.common.collect.j, com.google.common.collect.RangeSet
    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    @Override // com.google.common.collect.j, com.google.common.collect.RangeSet
    public /* bridge */ /* synthetic */ boolean contains(Comparable comparable) {
        return super.contains(comparable);
    }

    public ImmutableRangeSet<C> difference(RangeSet<C> rangeSet) {
        TreeRangeSet treeRangeSetCreate = TreeRangeSet.create(this);
        treeRangeSetCreate.removeAll(rangeSet);
        return copyOf(treeRangeSetCreate);
    }

    public boolean e() {
        return this.a.f();
    }

    @Override // com.google.common.collect.j, com.google.common.collect.RangeSet
    public boolean encloses(Range<C> range) {
        int iB = p2.b(this.a, Range.e(), range.a, Ordering.natural(), p2.c.ANY_PRESENT, p2.b.NEXT_LOWER);
        return iB != -1 && this.a.get(iB).encloses(range);
    }

    @Override // com.google.common.collect.j, com.google.common.collect.RangeSet
    public /* bridge */ /* synthetic */ boolean enclosesAll(RangeSet rangeSet) {
        return super.enclosesAll(rangeSet);
    }

    @Override // com.google.common.collect.j, com.google.common.collect.RangeSet
    public /* bridge */ /* synthetic */ boolean equals(@NullableDecl Object obj) {
        return super.equals(obj);
    }

    public ImmutableRangeSet<C> intersection(RangeSet<C> rangeSet) {
        TreeRangeSet treeRangeSetCreate = TreeRangeSet.create(this);
        treeRangeSetCreate.removeAll(rangeSet.complement());
        return copyOf(treeRangeSetCreate);
    }

    @Override // com.google.common.collect.j, com.google.common.collect.RangeSet
    public boolean intersects(Range<C> range) {
        int iB = p2.b(this.a, Range.e(), range.a, Ordering.natural(), p2.c.ANY_PRESENT, p2.b.NEXT_HIGHER);
        if (iB < this.a.size() && this.a.get(iB).isConnected(range) && !this.a.get(iB).intersection(range).isEmpty()) {
            return true;
        }
        if (iB > 0) {
            int i = iB - 1;
            if (this.a.get(i).isConnected(range) && !this.a.get(i).intersection(range).isEmpty()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.common.collect.j, com.google.common.collect.RangeSet
    public boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // com.google.common.collect.j, com.google.common.collect.RangeSet
    public Range<C> rangeContaining(C c2) {
        int iB = p2.b(this.a, Range.e(), d0.e(c2), Ordering.natural(), p2.c.ANY_PRESENT, p2.b.NEXT_LOWER);
        if (iB == -1) {
            return null;
        }
        Range<C> range = this.a.get(iB);
        if (range.contains(c2)) {
            return range;
        }
        return null;
    }

    @Override // com.google.common.collect.j, com.google.common.collect.RangeSet
    @Deprecated
    public void remove(Range<C> range) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.j, com.google.common.collect.RangeSet
    @Deprecated
    public void removeAll(RangeSet<C> rangeSet) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.RangeSet
    public Range<C> span() {
        if (this.a.isEmpty()) {
            throw new NoSuchElementException();
        }
        d0<C> d0Var = this.a.get(0).a;
        ImmutableList<Range<C>> immutableList = this.a;
        return Range.c(d0Var, immutableList.get(immutableList.size() - 1).b);
    }

    public ImmutableRangeSet<C> union(RangeSet<C> rangeSet) {
        return unionOf(Iterables.concat(asRanges(), rangeSet.asRanges()));
    }

    public Object writeReplace() {
        return new e(this.a);
    }

    public static <C extends Comparable> ImmutableRangeSet<C> of(Range<C> range) {
        Preconditions.checkNotNull(range);
        if (range.isEmpty()) {
            return of();
        }
        return range.equals(Range.all()) ? b() : new ImmutableRangeSet<>(ImmutableList.of(range));
    }

    @Override // com.google.common.collect.j, com.google.common.collect.RangeSet
    @Deprecated
    public void addAll(Iterable<Range<C>> iterable) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.RangeSet
    public ImmutableSet<Range<C>> asDescendingSetOfRanges() {
        return this.a.isEmpty() ? ImmutableSet.of() : new g2(this.a.reverse(), Range.f().reverse());
    }

    @Override // com.google.common.collect.RangeSet
    public ImmutableSet<Range<C>> asRanges() {
        return this.a.isEmpty() ? ImmutableSet.of() : new g2(this.a, Range.f());
    }

    @Override // com.google.common.collect.RangeSet
    public ImmutableRangeSet<C> complement() {
        ImmutableRangeSet<C> immutableRangeSet = this.b;
        if (immutableRangeSet != null) {
            return immutableRangeSet;
        }
        if (this.a.isEmpty()) {
            ImmutableRangeSet<C> immutableRangeSetB = b();
            this.b = immutableRangeSetB;
            return immutableRangeSetB;
        }
        if (this.a.size() == 1 && this.a.get(0).equals(Range.all())) {
            ImmutableRangeSet<C> immutableRangeSetOf = of();
            this.b = immutableRangeSetOf;
            return immutableRangeSetOf;
        }
        ImmutableRangeSet<C> immutableRangeSet2 = new ImmutableRangeSet<>(new d(), this);
        this.b = immutableRangeSet2;
        return immutableRangeSet2;
    }

    @Override // com.google.common.collect.j, com.google.common.collect.RangeSet
    public /* bridge */ /* synthetic */ boolean enclosesAll(Iterable iterable) {
        return super.enclosesAll(iterable);
    }

    @Override // com.google.common.collect.j, com.google.common.collect.RangeSet
    @Deprecated
    public void removeAll(Iterable<Range<C>> iterable) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.RangeSet
    public ImmutableRangeSet<C> subRangeSet(Range<C> range) {
        if (!isEmpty()) {
            Range<C> rangeSpan = span();
            if (range.encloses(rangeSpan)) {
                return this;
            }
            if (range.isConnected(rangeSpan)) {
                return new ImmutableRangeSet<>(c(range));
            }
        }
        return of();
    }

    private ImmutableRangeSet(ImmutableList<Range<C>> immutableList, ImmutableRangeSet<C> immutableRangeSet) {
        this.a = immutableList;
        this.b = immutableRangeSet;
    }

    public static <C extends Comparable<?>> ImmutableRangeSet<C> copyOf(Iterable<Range<C>> iterable) {
        return new Builder().addAll(iterable).build();
    }
}
