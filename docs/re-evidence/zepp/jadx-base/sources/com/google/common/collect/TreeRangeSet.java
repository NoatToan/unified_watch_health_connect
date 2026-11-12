package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.lang.Comparable;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.TreeMap;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes3.dex */
@Beta
@GwtIncompatible
public class TreeRangeSet<C extends Comparable<?>> extends j<C> implements Serializable {

    @VisibleForTesting
    public final NavigableMap<d0<C>, Range<C>> a;

    @MonotonicNonNullDecl
    private transient Set<Range<C>> b;

    @MonotonicNonNullDecl
    private transient Set<Range<C>> c;

    @MonotonicNonNullDecl
    private transient RangeSet<C> d;

    public final class b extends ForwardingCollection<Range<C>> implements Set<Range<C>> {
        public final Collection<Range<C>> a;

        public b(Collection<Range<C>> collection) {
            this.a = collection;
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(@NullableDecl Object obj) {
            return Sets.a(this, obj);
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            return Sets.b(this);
        }

        @Override // com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public Collection<Range<C>> delegate() {
            return this.a;
        }
    }

    public final class c extends TreeRangeSet<C> {
        public c() {
            super(new d(TreeRangeSet.this.a));
        }

        @Override // com.google.common.collect.TreeRangeSet, com.google.common.collect.j, com.google.common.collect.RangeSet
        public void add(Range<C> range) {
            TreeRangeSet.this.remove(range);
        }

        @Override // com.google.common.collect.TreeRangeSet, com.google.common.collect.RangeSet
        public RangeSet<C> complement() {
            return TreeRangeSet.this;
        }

        @Override // com.google.common.collect.TreeRangeSet, com.google.common.collect.j, com.google.common.collect.RangeSet
        public boolean contains(C c) {
            return !TreeRangeSet.this.contains(c);
        }

        @Override // com.google.common.collect.TreeRangeSet, com.google.common.collect.j, com.google.common.collect.RangeSet
        public void remove(Range<C> range) {
            TreeRangeSet.this.add(range);
        }
    }

    public static final class d<C extends Comparable<?>> extends i<d0<C>, Range<C>> {
        private final NavigableMap<d0<C>, Range<C>> a;
        private final NavigableMap<d0<C>, Range<C>> b;
        private final Range<d0<C>> c;

        public class a extends AbstractIterator<Map.Entry<d0<C>, Range<C>>> {
            public d0<C> c;
            public final /* synthetic */ d0 d;
            public final /* synthetic */ PeekingIterator e;

            public a(d0 d0Var, PeekingIterator peekingIterator) {
                this.d = d0Var;
                this.e = peekingIterator;
                this.c = d0Var;
            }

            @Override // com.google.common.collect.AbstractIterator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Map.Entry<d0<C>, Range<C>> computeNext() {
                Range rangeC;
                if (d.this.c.b.m(this.c) || this.c == d0.a()) {
                    return (Map.Entry) endOfData();
                }
                if (this.e.hasNext()) {
                    Range range = (Range) this.e.next();
                    rangeC = Range.c(this.c, range.a);
                    this.c = range.b;
                } else {
                    rangeC = Range.c(this.c, d0.a());
                    this.c = d0.a();
                }
                return Maps.immutableEntry(rangeC.a, rangeC);
            }
        }

        public class b extends AbstractIterator<Map.Entry<d0<C>, Range<C>>> {
            public d0<C> c;
            public final /* synthetic */ d0 d;
            public final /* synthetic */ PeekingIterator e;

            public b(d0 d0Var, PeekingIterator peekingIterator) {
                this.d = d0Var;
                this.e = peekingIterator;
                this.c = d0Var;
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // com.google.common.collect.AbstractIterator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Map.Entry<d0<C>, Range<C>> computeNext() {
                if (this.c == d0.c()) {
                    return (Map.Entry) endOfData();
                }
                if (this.e.hasNext()) {
                    Range range = (Range) this.e.next();
                    Range rangeC = Range.c(range.b, this.c);
                    this.c = range.a;
                    if (d.this.c.a.m(rangeC.a)) {
                        return Maps.immutableEntry(rangeC.a, rangeC);
                    }
                } else if (d.this.c.a.m(d0.c())) {
                    Range rangeC2 = Range.c(d0.c(), this.c);
                    this.c = d0.c();
                    return Maps.immutableEntry(d0.c(), rangeC2);
                }
                return (Map.Entry) endOfData();
            }
        }

        public d(NavigableMap<d0<C>, Range<C>> navigableMap) {
            this(navigableMap, Range.all());
        }

        private NavigableMap<d0<C>, Range<C>> h(Range<d0<C>> range) {
            if (!this.c.isConnected(range)) {
                return ImmutableSortedMap.of();
            }
            return new d(this.a, range.intersection(this.c));
        }

        @Override // com.google.common.collect.Maps.z
        public Iterator<Map.Entry<d0<C>, Range<C>>> a() {
            Collection<Range<C>> collectionValues;
            d0 d0VarC;
            if (this.c.hasLowerBound()) {
                collectionValues = this.b.tailMap((d0<C>) this.c.lowerEndpoint(), this.c.lowerBoundType() == BoundType.CLOSED).values();
            } else {
                collectionValues = this.b.values();
            }
            PeekingIterator peekingIterator = Iterators.peekingIterator(collectionValues.iterator());
            if (this.c.contains(d0.c()) && (!peekingIterator.hasNext() || ((Range) peekingIterator.peek()).a != d0.c())) {
                d0VarC = d0.c();
            } else {
                if (!peekingIterator.hasNext()) {
                    return Iterators.f();
                }
                d0VarC = ((Range) peekingIterator.next()).b;
            }
            return new a(d0VarC, peekingIterator);
        }

        @Override // com.google.common.collect.i
        public Iterator<Map.Entry<d0<C>, Range<C>>> c() {
            d0<C> d0VarHigherKey;
            PeekingIterator peekingIterator = Iterators.peekingIterator(this.b.headMap(this.c.hasUpperBound() ? (d0) this.c.upperEndpoint() : d0.a(), this.c.hasUpperBound() && this.c.upperBoundType() == BoundType.CLOSED).descendingMap().values().iterator());
            if (peekingIterator.hasNext()) {
                d0VarHigherKey = ((Range) peekingIterator.peek()).b == d0.a() ? ((Range) peekingIterator.next()).a : this.a.higherKey(((Range) peekingIterator.peek()).b);
            } else {
                if (!this.c.contains(d0.c()) || this.a.containsKey(d0.c())) {
                    return Iterators.f();
                }
                d0VarHigherKey = this.a.higherKey(d0.c());
            }
            return new b((d0) MoreObjects.firstNonNull(d0VarHigherKey, d0.a()), peekingIterator);
        }

        @Override // java.util.SortedMap
        public Comparator<? super d0<C>> comparator() {
            return Ordering.natural();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return get(obj) != null;
        }

        @Override // com.google.common.collect.i, java.util.AbstractMap, java.util.Map
        @NullableDecl
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Range<C> get(Object obj) {
            if (obj instanceof d0) {
                try {
                    d0<C> d0Var = (d0) obj;
                    Map.Entry<d0<C>, Range<C>> entryFirstEntry = tailMap(d0Var, true).firstEntry();
                    if (entryFirstEntry != null && entryFirstEntry.getKey().equals(d0Var)) {
                        return entryFirstEntry.getValue();
                    }
                } catch (ClassCastException unused) {
                }
            }
            return null;
        }

        @Override // java.util.NavigableMap
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public NavigableMap<d0<C>, Range<C>> headMap(d0<C> d0Var, boolean z) {
            return h(Range.upTo(d0Var, BoundType.b(z)));
        }

        @Override // java.util.NavigableMap
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public NavigableMap<d0<C>, Range<C>> subMap(d0<C> d0Var, boolean z, d0<C> d0Var2, boolean z2) {
            return h(Range.range(d0Var, BoundType.b(z), d0Var2, BoundType.b(z2)));
        }

        @Override // java.util.NavigableMap
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public NavigableMap<d0<C>, Range<C>> tailMap(d0<C> d0Var, boolean z) {
            return h(Range.downTo(d0Var, BoundType.b(z)));
        }

        @Override // com.google.common.collect.Maps.z, java.util.AbstractMap, java.util.Map
        public int size() {
            return Iterators.size(a());
        }

        private d(NavigableMap<d0<C>, Range<C>> navigableMap, Range<d0<C>> range) {
            this.a = navigableMap;
            this.b = new e(navigableMap);
            this.c = range;
        }
    }

    public final class f extends TreeRangeSet<C> {
        private final Range<C> e;

        /* JADX WARN: Illegal instructions before constructor call */
        public f(Range<C> range) {
            super(new g(Range.all(), range, TreeRangeSet.this.a));
            this.e = range;
        }

        @Override // com.google.common.collect.TreeRangeSet, com.google.common.collect.j, com.google.common.collect.RangeSet
        public void add(Range<C> range) {
            Preconditions.checkArgument(this.e.encloses(range), "Cannot add range %s to subRangeSet(%s)", range, this.e);
            super.add(range);
        }

        @Override // com.google.common.collect.TreeRangeSet, com.google.common.collect.j, com.google.common.collect.RangeSet
        public void clear() {
            TreeRangeSet.this.remove(this.e);
        }

        @Override // com.google.common.collect.TreeRangeSet, com.google.common.collect.j, com.google.common.collect.RangeSet
        public boolean contains(C c) {
            return this.e.contains(c) && TreeRangeSet.this.contains(c);
        }

        @Override // com.google.common.collect.TreeRangeSet, com.google.common.collect.j, com.google.common.collect.RangeSet
        public boolean encloses(Range<C> range) {
            Range rangeB;
            return (this.e.isEmpty() || !this.e.encloses(range) || (rangeB = TreeRangeSet.this.b(range)) == null || rangeB.intersection(this.e).isEmpty()) ? false : true;
        }

        @Override // com.google.common.collect.TreeRangeSet, com.google.common.collect.j, com.google.common.collect.RangeSet
        @NullableDecl
        public Range<C> rangeContaining(C c) {
            Range<C> rangeRangeContaining;
            if (this.e.contains(c) && (rangeRangeContaining = TreeRangeSet.this.rangeContaining(c)) != null) {
                return rangeRangeContaining.intersection(this.e);
            }
            return null;
        }

        @Override // com.google.common.collect.TreeRangeSet, com.google.common.collect.j, com.google.common.collect.RangeSet
        public void remove(Range<C> range) {
            if (range.isConnected(this.e)) {
                TreeRangeSet.this.remove(range.intersection(this.e));
            }
        }

        @Override // com.google.common.collect.TreeRangeSet, com.google.common.collect.RangeSet
        public RangeSet<C> subRangeSet(Range<C> range) {
            if (range.encloses(this.e)) {
                return this;
            }
            return range.isConnected(this.e) ? new f(this.e.intersection(range)) : ImmutableRangeSet.of();
        }
    }

    public static final class g<C extends Comparable<?>> extends i<d0<C>, Range<C>> {
        private final Range<d0<C>> a;
        private final Range<C> b;
        private final NavigableMap<d0<C>, Range<C>> c;
        private final NavigableMap<d0<C>, Range<C>> d;

        public class a extends AbstractIterator<Map.Entry<d0<C>, Range<C>>> {
            public final /* synthetic */ Iterator c;
            public final /* synthetic */ d0 d;

            public a(Iterator it2, d0 d0Var) {
                this.c = it2;
                this.d = d0Var;
            }

            @Override // com.google.common.collect.AbstractIterator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Map.Entry<d0<C>, Range<C>> computeNext() {
                if (!this.c.hasNext()) {
                    return (Map.Entry) endOfData();
                }
                Range range = (Range) this.c.next();
                if (this.d.m(range.a)) {
                    return (Map.Entry) endOfData();
                }
                Range rangeIntersection = range.intersection(g.this.b);
                return Maps.immutableEntry(rangeIntersection.a, rangeIntersection);
            }
        }

        public class b extends AbstractIterator<Map.Entry<d0<C>, Range<C>>> {
            public final /* synthetic */ Iterator c;

            public b(Iterator it2) {
                this.c = it2;
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // com.google.common.collect.AbstractIterator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Map.Entry<d0<C>, Range<C>> computeNext() {
                if (!this.c.hasNext()) {
                    return (Map.Entry) endOfData();
                }
                Range range = (Range) this.c.next();
                if (g.this.b.a.compareTo(range.b) >= 0) {
                    return (Map.Entry) endOfData();
                }
                Range rangeIntersection = range.intersection(g.this.b);
                return g.this.a.contains(rangeIntersection.a) ? Maps.immutableEntry(rangeIntersection.a, rangeIntersection) : (Map.Entry) endOfData();
            }
        }

        private NavigableMap<d0<C>, Range<C>> i(Range<d0<C>> range) {
            return !range.isConnected(this.a) ? ImmutableSortedMap.of() : new g(this.a.intersection(range), this.b, this.c);
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // com.google.common.collect.Maps.z
        public Iterator<Map.Entry<d0<C>, Range<C>>> a() {
            Iterator<Range<C>> it2;
            if (this.b.isEmpty()) {
                return Iterators.f();
            }
            if (this.a.b.m(this.b.a)) {
                return Iterators.f();
            }
            if (this.a.a.m(this.b.a)) {
                it2 = this.d.tailMap(this.b.a, false).values().iterator();
            } else {
                it2 = this.c.tailMap(this.a.a.j(), this.a.lowerBoundType() == BoundType.CLOSED).values().iterator();
            }
            return new a(it2, (d0) Ordering.natural().min(this.a.b, d0.e(this.b.b)));
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // com.google.common.collect.i
        public Iterator<Map.Entry<d0<C>, Range<C>>> c() {
            if (this.b.isEmpty()) {
                return Iterators.f();
            }
            d0 d0Var = (d0) Ordering.natural().min(this.a.b, d0.e(this.b.b));
            return new b(this.c.headMap((d0<C>) d0Var.j(), d0Var.p() == BoundType.CLOSED).descendingMap().values().iterator());
        }

        @Override // java.util.SortedMap
        public Comparator<? super d0<C>> comparator() {
            return Ordering.natural();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@NullableDecl Object obj) {
            return get(obj) != null;
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // com.google.common.collect.i, java.util.AbstractMap, java.util.Map
        @NullableDecl
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Range<C> get(@NullableDecl Object obj) {
            if (obj instanceof d0) {
                try {
                    d0<C> d0Var = (d0) obj;
                    if (this.a.contains(d0Var) && d0Var.compareTo(this.b.a) >= 0 && d0Var.compareTo(this.b.b) < 0) {
                        if (d0Var.equals(this.b.a)) {
                            Range range = (Range) Maps.R(this.c.floorEntry(d0Var));
                            if (range != null && range.b.compareTo(this.b.a) > 0) {
                                return range.intersection(this.b);
                            }
                        } else {
                            Range range2 = (Range) this.c.get(d0Var);
                            if (range2 != null) {
                                return range2.intersection(this.b);
                            }
                        }
                    }
                } catch (ClassCastException unused) {
                }
            }
            return null;
        }

        @Override // java.util.NavigableMap
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public NavigableMap<d0<C>, Range<C>> headMap(d0<C> d0Var, boolean z) {
            return i(Range.upTo(d0Var, BoundType.b(z)));
        }

        @Override // java.util.NavigableMap
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public NavigableMap<d0<C>, Range<C>> subMap(d0<C> d0Var, boolean z, d0<C> d0Var2, boolean z2) {
            return i(Range.range(d0Var, BoundType.b(z), d0Var2, BoundType.b(z2)));
        }

        @Override // java.util.NavigableMap
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public NavigableMap<d0<C>, Range<C>> tailMap(d0<C> d0Var, boolean z) {
            return i(Range.downTo(d0Var, BoundType.b(z)));
        }

        @Override // com.google.common.collect.Maps.z, java.util.AbstractMap, java.util.Map
        public int size() {
            return Iterators.size(a());
        }

        private g(Range<d0<C>> range, Range<C> range2, NavigableMap<d0<C>, Range<C>> navigableMap) {
            this.a = (Range) Preconditions.checkNotNull(range);
            this.b = (Range) Preconditions.checkNotNull(range2);
            this.c = (NavigableMap) Preconditions.checkNotNull(navigableMap);
            this.d = new e(navigableMap);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NullableDecl
    public Range<C> b(Range<C> range) {
        Preconditions.checkNotNull(range);
        Map.Entry<d0<C>, Range<C>> entryFloorEntry = this.a.floorEntry(range.a);
        if (entryFloorEntry == null || !entryFloorEntry.getValue().encloses(range)) {
            return null;
        }
        return entryFloorEntry.getValue();
    }

    private void c(Range<C> range) {
        if (range.isEmpty()) {
            this.a.remove(range.a);
        } else {
            this.a.put(range.a, range);
        }
    }

    public static <C extends Comparable<?>> TreeRangeSet<C> create() {
        return new TreeRangeSet<>(new TreeMap());
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.google.common.collect.j, com.google.common.collect.RangeSet
    public void add(Range<C> range) {
        Preconditions.checkNotNull(range);
        if (range.isEmpty()) {
            return;
        }
        d0<C> d0Var = range.a;
        d0<C> d0Var2 = range.b;
        Map.Entry<d0<C>, Range<C>> entryLowerEntry = this.a.lowerEntry(d0Var);
        if (entryLowerEntry != null) {
            Range<C> value = entryLowerEntry.getValue();
            if (value.b.compareTo(d0Var) >= 0) {
                if (value.b.compareTo(d0Var2) >= 0) {
                    d0Var2 = value.b;
                }
                d0Var = value.a;
            }
        }
        Map.Entry<d0<C>, Range<C>> entryFloorEntry = this.a.floorEntry(d0Var2);
        if (entryFloorEntry != null) {
            Range<C> value2 = entryFloorEntry.getValue();
            if (value2.b.compareTo(d0Var2) >= 0) {
                d0Var2 = value2.b;
            }
        }
        this.a.subMap(d0Var, d0Var2).clear();
        c(Range.c(d0Var, d0Var2));
    }

    @Override // com.google.common.collect.j, com.google.common.collect.RangeSet
    public /* bridge */ /* synthetic */ void addAll(RangeSet rangeSet) {
        super.addAll(rangeSet);
    }

    @Override // com.google.common.collect.RangeSet
    public Set<Range<C>> asDescendingSetOfRanges() {
        Set<Range<C>> set = this.c;
        if (set != null) {
            return set;
        }
        b bVar = new b(this.a.descendingMap().values());
        this.c = bVar;
        return bVar;
    }

    @Override // com.google.common.collect.RangeSet
    public Set<Range<C>> asRanges() {
        Set<Range<C>> set = this.b;
        if (set != null) {
            return set;
        }
        b bVar = new b(this.a.values());
        this.b = bVar;
        return bVar;
    }

    @Override // com.google.common.collect.j, com.google.common.collect.RangeSet
    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    @Override // com.google.common.collect.RangeSet
    public RangeSet<C> complement() {
        RangeSet<C> rangeSet = this.d;
        if (rangeSet != null) {
            return rangeSet;
        }
        c cVar = new c();
        this.d = cVar;
        return cVar;
    }

    @Override // com.google.common.collect.j, com.google.common.collect.RangeSet
    public /* bridge */ /* synthetic */ boolean contains(Comparable comparable) {
        return super.contains(comparable);
    }

    @Override // com.google.common.collect.j, com.google.common.collect.RangeSet
    public boolean encloses(Range<C> range) {
        Preconditions.checkNotNull(range);
        Map.Entry<d0<C>, Range<C>> entryFloorEntry = this.a.floorEntry(range.a);
        return entryFloorEntry != null && entryFloorEntry.getValue().encloses(range);
    }

    @Override // com.google.common.collect.j, com.google.common.collect.RangeSet
    public /* bridge */ /* synthetic */ boolean enclosesAll(RangeSet rangeSet) {
        return super.enclosesAll(rangeSet);
    }

    @Override // com.google.common.collect.j, com.google.common.collect.RangeSet
    public /* bridge */ /* synthetic */ boolean equals(@NullableDecl Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.common.collect.j, com.google.common.collect.RangeSet
    public boolean intersects(Range<C> range) {
        Preconditions.checkNotNull(range);
        Map.Entry<d0<C>, Range<C>> entryCeilingEntry = this.a.ceilingEntry(range.a);
        if (entryCeilingEntry != null && entryCeilingEntry.getValue().isConnected(range) && !entryCeilingEntry.getValue().intersection(range).isEmpty()) {
            return true;
        }
        Map.Entry<d0<C>, Range<C>> entryLowerEntry = this.a.lowerEntry(range.a);
        return (entryLowerEntry == null || !entryLowerEntry.getValue().isConnected(range) || entryLowerEntry.getValue().intersection(range).isEmpty()) ? false : true;
    }

    @Override // com.google.common.collect.j, com.google.common.collect.RangeSet
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Override // com.google.common.collect.j, com.google.common.collect.RangeSet
    @NullableDecl
    public Range<C> rangeContaining(C c2) {
        Preconditions.checkNotNull(c2);
        Map.Entry<d0<C>, Range<C>> entryFloorEntry = this.a.floorEntry(d0.e(c2));
        if (entryFloorEntry == null || !entryFloorEntry.getValue().contains(c2)) {
            return null;
        }
        return entryFloorEntry.getValue();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.common.collect.j, com.google.common.collect.RangeSet
    public void remove(Range<C> range) {
        Preconditions.checkNotNull(range);
        if (range.isEmpty()) {
            return;
        }
        Map.Entry<d0<C>, Range<C>> entryLowerEntry = this.a.lowerEntry(range.a);
        if (entryLowerEntry != null) {
            Range<C> value = entryLowerEntry.getValue();
            if (value.b.compareTo(range.a) >= 0) {
                if (range.hasUpperBound() && value.b.compareTo(range.b) >= 0) {
                    c(Range.c(range.b, value.b));
                }
                c(Range.c(value.a, range.a));
            }
        }
        Map.Entry<d0<C>, Range<C>> entryFloorEntry = this.a.floorEntry(range.b);
        if (entryFloorEntry != null) {
            Range<C> value2 = entryFloorEntry.getValue();
            if (range.hasUpperBound() && value2.b.compareTo(range.b) >= 0) {
                c(Range.c(range.b, value2.b));
            }
        }
        this.a.subMap(range.a, range.b).clear();
    }

    @Override // com.google.common.collect.j, com.google.common.collect.RangeSet
    public /* bridge */ /* synthetic */ void removeAll(RangeSet rangeSet) {
        super.removeAll(rangeSet);
    }

    @Override // com.google.common.collect.RangeSet
    public Range<C> span() {
        Map.Entry<d0<C>, Range<C>> entryFirstEntry = this.a.firstEntry();
        Map.Entry<d0<C>, Range<C>> entryLastEntry = this.a.lastEntry();
        if (entryFirstEntry != null) {
            return Range.c(entryFirstEntry.getValue().a, entryLastEntry.getValue().b);
        }
        throw new NoSuchElementException();
    }

    @Override // com.google.common.collect.RangeSet
    public RangeSet<C> subRangeSet(Range<C> range) {
        return range.equals(Range.all()) ? this : new f(range);
    }

    private TreeRangeSet(NavigableMap<d0<C>, Range<C>> navigableMap) {
        this.a = navigableMap;
    }

    public static <C extends Comparable<?>> TreeRangeSet<C> create(RangeSet<C> rangeSet) {
        TreeRangeSet<C> treeRangeSetCreate = create();
        treeRangeSetCreate.addAll(rangeSet);
        return treeRangeSetCreate;
    }

    @Override // com.google.common.collect.j, com.google.common.collect.RangeSet
    public /* bridge */ /* synthetic */ void addAll(Iterable iterable) {
        super.addAll(iterable);
    }

    @Override // com.google.common.collect.j, com.google.common.collect.RangeSet
    public /* bridge */ /* synthetic */ boolean enclosesAll(Iterable iterable) {
        return super.enclosesAll(iterable);
    }

    @Override // com.google.common.collect.j, com.google.common.collect.RangeSet
    public /* bridge */ /* synthetic */ void removeAll(Iterable iterable) {
        super.removeAll(iterable);
    }

    @VisibleForTesting
    public static final class e<C extends Comparable<?>> extends i<d0<C>, Range<C>> {
        private final NavigableMap<d0<C>, Range<C>> a;
        private final Range<d0<C>> b;

        public class a extends AbstractIterator<Map.Entry<d0<C>, Range<C>>> {
            public final /* synthetic */ Iterator c;

            public a(Iterator it2) {
                this.c = it2;
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // com.google.common.collect.AbstractIterator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Map.Entry<d0<C>, Range<C>> computeNext() {
                if (!this.c.hasNext()) {
                    return (Map.Entry) endOfData();
                }
                Range range = (Range) this.c.next();
                return e.this.b.b.m(range.b) ? (Map.Entry) endOfData() : Maps.immutableEntry(range.b, range);
            }
        }

        public class b extends AbstractIterator<Map.Entry<d0<C>, Range<C>>> {
            public final /* synthetic */ PeekingIterator c;

            public b(PeekingIterator peekingIterator) {
                this.c = peekingIterator;
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // com.google.common.collect.AbstractIterator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Map.Entry<d0<C>, Range<C>> computeNext() {
                if (!this.c.hasNext()) {
                    return (Map.Entry) endOfData();
                }
                Range range = (Range) this.c.next();
                return e.this.b.a.m(range.b) ? Maps.immutableEntry(range.b, range) : (Map.Entry) endOfData();
            }
        }

        public e(NavigableMap<d0<C>, Range<C>> navigableMap) {
            this.a = navigableMap;
            this.b = Range.all();
        }

        private NavigableMap<d0<C>, Range<C>> h(Range<d0<C>> range) {
            return range.isConnected(this.b) ? new e(this.a, range.intersection(this.b)) : ImmutableSortedMap.of();
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // com.google.common.collect.Maps.z
        public Iterator<Map.Entry<d0<C>, Range<C>>> a() {
            Map.Entry entryLowerEntry;
            Iterator<Range<C>> it2;
            if (this.b.hasLowerBound() && (entryLowerEntry = this.a.lowerEntry((d0<C>) this.b.lowerEndpoint())) != null) {
                it2 = this.b.a.m(((Range) entryLowerEntry.getValue()).b) ? this.a.tailMap(entryLowerEntry.getKey(), true).values().iterator() : this.a.tailMap(this.b.lowerEndpoint(), true).values().iterator();
            } else {
                it2 = this.a.values().iterator();
            }
            return new a(it2);
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // com.google.common.collect.i
        public Iterator<Map.Entry<d0<C>, Range<C>>> c() {
            PeekingIterator peekingIterator = Iterators.peekingIterator((this.b.hasUpperBound() ? this.a.headMap(this.b.upperEndpoint(), false).descendingMap().values() : this.a.descendingMap().values()).iterator());
            if (peekingIterator.hasNext() && this.b.b.m(((Range) peekingIterator.peek()).b)) {
                peekingIterator.next();
            }
            return new b(peekingIterator);
        }

        @Override // java.util.SortedMap
        public Comparator<? super d0<C>> comparator() {
            return Ordering.natural();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@NullableDecl Object obj) {
            return get(obj) != null;
        }

        @Override // com.google.common.collect.i, java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Range<C> get(@NullableDecl Object obj) {
            Map.Entry<d0<C>, Range<C>> entryLowerEntry;
            if (obj instanceof d0) {
                try {
                    d0<C> d0Var = (d0) obj;
                    if (this.b.contains(d0Var) && (entryLowerEntry = this.a.lowerEntry(d0Var)) != null && entryLowerEntry.getValue().b.equals(d0Var)) {
                        return entryLowerEntry.getValue();
                    }
                } catch (ClassCastException unused) {
                }
            }
            return null;
        }

        @Override // java.util.NavigableMap
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public NavigableMap<d0<C>, Range<C>> headMap(d0<C> d0Var, boolean z) {
            return h(Range.upTo(d0Var, BoundType.b(z)));
        }

        @Override // java.util.NavigableMap
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public NavigableMap<d0<C>, Range<C>> subMap(d0<C> d0Var, boolean z, d0<C> d0Var2, boolean z2) {
            return h(Range.range(d0Var, BoundType.b(z), d0Var2, BoundType.b(z2)));
        }

        @Override // java.util.NavigableMap
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public NavigableMap<d0<C>, Range<C>> tailMap(d0<C> d0Var, boolean z) {
            return h(Range.downTo(d0Var, BoundType.b(z)));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean isEmpty() {
            if (this.b.equals(Range.all())) {
                return this.a.isEmpty();
            }
            return !a().hasNext();
        }

        @Override // com.google.common.collect.Maps.z, java.util.AbstractMap, java.util.Map
        public int size() {
            return this.b.equals(Range.all()) ? this.a.size() : Iterators.size(a());
        }

        private e(NavigableMap<d0<C>, Range<C>> navigableMap, Range<d0<C>> range) {
            this.a = navigableMap;
            this.b = range;
        }
    }

    public static <C extends Comparable<?>> TreeRangeSet<C> create(Iterable<Range<C>> iterable) {
        TreeRangeSet<C> treeRangeSetCreate = create();
        treeRangeSetCreate.addAll(iterable);
        return treeRangeSetCreate;
    }
}
