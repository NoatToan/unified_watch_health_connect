package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NoSuchElementException;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes3.dex */
@Beta
@GwtIncompatible
public final class TreeRangeMap<K extends Comparable, V> implements RangeMap<K, V> {
    private static final RangeMap b = new a();
    private final NavigableMap<d0<K>, c<K, V>> a = Maps.newTreeMap();

    public static class a implements RangeMap {
        @Override // com.google.common.collect.RangeMap
        public Map<Range, Object> asDescendingMapOfRanges() {
            return Collections.emptyMap();
        }

        @Override // com.google.common.collect.RangeMap
        public Map<Range, Object> asMapOfRanges() {
            return Collections.emptyMap();
        }

        @Override // com.google.common.collect.RangeMap
        public void clear() {
        }

        @Override // com.google.common.collect.RangeMap
        @NullableDecl
        public Object get(Comparable comparable) {
            return null;
        }

        @Override // com.google.common.collect.RangeMap
        @NullableDecl
        public Map.Entry<Range, Object> getEntry(Comparable comparable) {
            return null;
        }

        @Override // com.google.common.collect.RangeMap
        public void put(Range range, Object obj) {
            Preconditions.checkNotNull(range);
            throw new IllegalArgumentException("Cannot insert range " + range + " into an empty subRangeMap");
        }

        @Override // com.google.common.collect.RangeMap
        public void putAll(RangeMap rangeMap) {
            if (!rangeMap.asMapOfRanges().isEmpty()) {
                throw new IllegalArgumentException("Cannot putAll(nonEmptyRangeMap) into an empty subRangeMap");
            }
        }

        @Override // com.google.common.collect.RangeMap
        public void putCoalescing(Range range, Object obj) {
            Preconditions.checkNotNull(range);
            throw new IllegalArgumentException("Cannot insert range " + range + " into an empty subRangeMap");
        }

        @Override // com.google.common.collect.RangeMap
        public void remove(Range range) {
            Preconditions.checkNotNull(range);
        }

        @Override // com.google.common.collect.RangeMap
        public Range span() {
            throw new NoSuchElementException();
        }

        @Override // com.google.common.collect.RangeMap
        public RangeMap subRangeMap(Range range) {
            Preconditions.checkNotNull(range);
            return this;
        }
    }

    public final class b extends Maps.z<Range<K>, V> {
        public final Iterable<Map.Entry<Range<K>, V>> a;

        public b(Iterable<c<K, V>> iterable) {
            this.a = iterable;
        }

        @Override // com.google.common.collect.Maps.z
        public Iterator<Map.Entry<Range<K>, V>> a() {
            return this.a.iterator();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@NullableDecl Object obj) {
            return get(obj) != null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V get(@NullableDecl Object obj) {
            if (!(obj instanceof Range)) {
                return null;
            }
            Range range = (Range) obj;
            c cVar = (c) TreeRangeMap.this.a.get(range.a);
            if (cVar == null || !cVar.getKey().equals(range)) {
                return null;
            }
            return (V) cVar.getValue();
        }

        @Override // com.google.common.collect.Maps.z, java.util.AbstractMap, java.util.Map
        public int size() {
            return TreeRangeMap.this.a.size();
        }
    }

    public static final class c<K extends Comparable, V> extends f<Range<K>, V> {
        private final Range<K> a;
        private final V b;

        public c(d0<K> d0Var, d0<K> d0Var2, V v) {
            this(Range.c(d0Var, d0Var2), v);
        }

        public boolean f(K k) {
            return this.a.contains(k);
        }

        @Override // com.google.common.collect.f, java.util.Map.Entry
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public Range<K> getKey() {
            return this.a;
        }

        @Override // com.google.common.collect.f, java.util.Map.Entry
        public V getValue() {
            return this.b;
        }

        public d0<K> h() {
            return (d0<K>) this.a.a;
        }

        public d0<K> i() {
            return (d0<K>) this.a.b;
        }

        public c(Range<K> range, V v) {
            this.a = range;
            this.b = v;
        }
    }

    public class d implements RangeMap<K, V> {
        private final Range<K> a;

        public class a extends TreeRangeMap<K, V>.d.b {

            /* JADX INFO: renamed from: com.google.common.collect.TreeRangeMap$d$a$a, reason: collision with other inner class name */
            public class C0189a extends AbstractIterator<Map.Entry<Range<K>, V>> {
                public final /* synthetic */ Iterator c;

                public C0189a(Iterator it2) {
                    this.c = it2;
                }

                @Override // com.google.common.collect.AbstractIterator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public Map.Entry<Range<K>, V> computeNext() {
                    if (!this.c.hasNext()) {
                        return (Map.Entry) endOfData();
                    }
                    c cVar = (c) this.c.next();
                    return cVar.i().compareTo(d.this.a.a) <= 0 ? (Map.Entry) endOfData() : Maps.immutableEntry(cVar.getKey().intersection(d.this.a), cVar.getValue());
                }
            }

            public a() {
                super();
            }

            @Override // com.google.common.collect.TreeRangeMap.d.b
            public Iterator<Map.Entry<Range<K>, V>> c() {
                return d.this.a.isEmpty() ? Iterators.f() : new C0189a(TreeRangeMap.this.a.headMap(d.this.a.b, false).descendingMap().values().iterator());
            }
        }

        public class b extends AbstractMap<Range<K>, V> {

            public class a extends Maps.a0<Range<K>, V> {
                public a(Map map) {
                    super(map);
                }

                @Override // com.google.common.collect.Maps.a0, java.util.AbstractCollection, java.util.Collection, java.util.Set
                public boolean remove(@NullableDecl Object obj) {
                    return b.this.remove(obj) != null;
                }

                @Override // com.google.common.collect.Sets.k, java.util.AbstractCollection, java.util.Collection, java.util.Set
                public boolean retainAll(Collection<?> collection) {
                    return b.this.d(Predicates.compose(Predicates.not(Predicates.in(collection)), Maps.v()));
                }
            }

            /* JADX INFO: renamed from: com.google.common.collect.TreeRangeMap$d$b$b, reason: collision with other inner class name */
            public class C0190b extends Maps.s<Range<K>, V> {
                public C0190b() {
                }

                @Override // com.google.common.collect.Maps.s
                public Map<Range<K>, V> d() {
                    return b.this;
                }

                @Override // com.google.common.collect.Maps.s, java.util.AbstractCollection, java.util.Collection, java.util.Set
                public boolean isEmpty() {
                    return !iterator().hasNext();
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
                public Iterator<Map.Entry<Range<K>, V>> iterator() {
                    return b.this.c();
                }

                @Override // com.google.common.collect.Maps.s, com.google.common.collect.Sets.k, java.util.AbstractCollection, java.util.Collection, java.util.Set
                public boolean retainAll(Collection<?> collection) {
                    return b.this.d(Predicates.not(Predicates.in(collection)));
                }

                @Override // com.google.common.collect.Maps.s, java.util.AbstractCollection, java.util.Collection, java.util.Set
                public int size() {
                    return Iterators.size(iterator());
                }
            }

            public class c extends AbstractIterator<Map.Entry<Range<K>, V>> {
                public final /* synthetic */ Iterator c;

                public c(Iterator it2) {
                    this.c = it2;
                }

                @Override // com.google.common.collect.AbstractIterator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public Map.Entry<Range<K>, V> computeNext() {
                    while (this.c.hasNext()) {
                        c cVar = (c) this.c.next();
                        if (cVar.h().compareTo(d.this.a.b) >= 0) {
                            return (Map.Entry) endOfData();
                        }
                        if (cVar.i().compareTo(d.this.a.a) > 0) {
                            return Maps.immutableEntry(cVar.getKey().intersection(d.this.a), cVar.getValue());
                        }
                    }
                    return (Map.Entry) endOfData();
                }
            }

            /* JADX INFO: renamed from: com.google.common.collect.TreeRangeMap$d$b$d, reason: collision with other inner class name */
            public class C0191d extends Maps.p0<Range<K>, V> {
                public C0191d(Map map) {
                    super(map);
                }

                @Override // com.google.common.collect.Maps.p0, java.util.AbstractCollection, java.util.Collection
                public boolean removeAll(Collection<?> collection) {
                    return b.this.d(Predicates.compose(Predicates.in(collection), Maps.P()));
                }

                @Override // com.google.common.collect.Maps.p0, java.util.AbstractCollection, java.util.Collection
                public boolean retainAll(Collection<?> collection) {
                    return b.this.d(Predicates.compose(Predicates.not(Predicates.in(collection)), Maps.P()));
                }
            }

            public b() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public boolean d(Predicate<? super Map.Entry<Range<K>, V>> predicate) {
                ArrayList arrayListNewArrayList = Lists.newArrayList();
                for (Map.Entry<Range<K>, V> entry : entrySet()) {
                    if (predicate.apply(entry)) {
                        arrayListNewArrayList.add(entry.getKey());
                    }
                }
                Iterator it2 = arrayListNewArrayList.iterator();
                while (it2.hasNext()) {
                    TreeRangeMap.this.remove((Range) it2.next());
                }
                return !arrayListNewArrayList.isEmpty();
            }

            public Iterator<Map.Entry<Range<K>, V>> c() {
                if (d.this.a.isEmpty()) {
                    return Iterators.f();
                }
                return new c(TreeRangeMap.this.a.tailMap((d0) MoreObjects.firstNonNull(TreeRangeMap.this.a.floorKey(d.this.a.a), d.this.a.a), true).values().iterator());
            }

            @Override // java.util.AbstractMap, java.util.Map
            public void clear() {
                d.this.clear();
            }

            @Override // java.util.AbstractMap, java.util.Map
            public boolean containsKey(Object obj) {
                return get(obj) != null;
            }

            @Override // java.util.AbstractMap, java.util.Map
            public Set<Map.Entry<Range<K>, V>> entrySet() {
                return new C0190b();
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
            @Override // java.util.AbstractMap, java.util.Map
            public V get(Object obj) {
                c cVar;
                try {
                    if (obj instanceof Range) {
                        Range range = (Range) obj;
                        if (d.this.a.encloses(range) && !range.isEmpty()) {
                            if (range.a.compareTo(d.this.a.a) == 0) {
                                Map.Entry entryFloorEntry = TreeRangeMap.this.a.floorEntry(range.a);
                                cVar = entryFloorEntry != null ? (c) entryFloorEntry.getValue() : null;
                            } else {
                                cVar = (c) TreeRangeMap.this.a.get(range.a);
                            }
                            if (cVar != null && cVar.getKey().isConnected(d.this.a) && cVar.getKey().intersection(d.this.a).equals(range)) {
                                return (V) cVar.getValue();
                            }
                        }
                    }
                } catch (ClassCastException unused) {
                }
                return null;
            }

            @Override // java.util.AbstractMap, java.util.Map
            public Set<Range<K>> keySet() {
                return new a(this);
            }

            @Override // java.util.AbstractMap, java.util.Map
            public V remove(Object obj) {
                V v = (V) get(obj);
                if (v == null) {
                    return null;
                }
                TreeRangeMap.this.remove((Range) obj);
                return v;
            }

            @Override // java.util.AbstractMap, java.util.Map
            public Collection<V> values() {
                return new C0191d(this);
            }
        }

        public d(Range<K> range) {
            this.a = range;
        }

        @Override // com.google.common.collect.RangeMap
        public Map<Range<K>, V> asDescendingMapOfRanges() {
            return new a();
        }

        @Override // com.google.common.collect.RangeMap
        public Map<Range<K>, V> asMapOfRanges() {
            return new b();
        }

        @Override // com.google.common.collect.RangeMap
        public void clear() {
            TreeRangeMap.this.remove(this.a);
        }

        @Override // com.google.common.collect.RangeMap
        public boolean equals(@NullableDecl Object obj) {
            if (obj instanceof RangeMap) {
                return asMapOfRanges().equals(((RangeMap) obj).asMapOfRanges());
            }
            return false;
        }

        @Override // com.google.common.collect.RangeMap
        @NullableDecl
        public V get(K k) {
            if (this.a.contains(k)) {
                return (V) TreeRangeMap.this.get(k);
            }
            return null;
        }

        @Override // com.google.common.collect.RangeMap
        @NullableDecl
        public Map.Entry<Range<K>, V> getEntry(K k) {
            Map.Entry<Range<K>, V> entry;
            if (!this.a.contains(k) || (entry = TreeRangeMap.this.getEntry(k)) == null) {
                return null;
            }
            return Maps.immutableEntry(entry.getKey().intersection(this.a), entry.getValue());
        }

        @Override // com.google.common.collect.RangeMap
        public int hashCode() {
            return asMapOfRanges().hashCode();
        }

        @Override // com.google.common.collect.RangeMap
        public void put(Range<K> range, V v) {
            Preconditions.checkArgument(this.a.encloses(range), "Cannot put range %s into a subRangeMap(%s)", range, this.a);
            TreeRangeMap.this.put(range, v);
        }

        @Override // com.google.common.collect.RangeMap
        public void putAll(RangeMap<K, V> rangeMap) {
            if (rangeMap.asMapOfRanges().isEmpty()) {
                return;
            }
            Range<K> rangeSpan = rangeMap.span();
            Preconditions.checkArgument(this.a.encloses(rangeSpan), "Cannot putAll rangeMap with span %s into a subRangeMap(%s)", rangeSpan, this.a);
            TreeRangeMap.this.putAll(rangeMap);
        }

        @Override // com.google.common.collect.RangeMap
        public void putCoalescing(Range<K> range, V v) {
            if (TreeRangeMap.this.a.isEmpty() || range.isEmpty() || !this.a.encloses(range)) {
                put(range, v);
            } else {
                put(TreeRangeMap.this.e(range, Preconditions.checkNotNull(v)).intersection(this.a), v);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
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
        @Override // com.google.common.collect.RangeMap
        public void remove(Range<K> range) {
            if (range.isConnected(this.a)) {
                TreeRangeMap.this.remove(range.intersection(this.a));
            }
        }

        @Override // com.google.common.collect.RangeMap
        public Range<K> span() {
            d0 d0Var;
            Map.Entry entryFloorEntry = TreeRangeMap.this.a.floorEntry(this.a.a);
            if (entryFloorEntry == null || ((c) entryFloorEntry.getValue()).i().compareTo(this.a.a) <= 0) {
                d0Var = (d0) TreeRangeMap.this.a.ceilingKey(this.a.a);
                if (d0Var == null || d0Var.compareTo(this.a.b) >= 0) {
                    throw new NoSuchElementException();
                }
            } else {
                d0Var = this.a.a;
            }
            Map.Entry entryLowerEntry = TreeRangeMap.this.a.lowerEntry(this.a.b);
            if (entryLowerEntry != null) {
                return Range.c(d0Var, ((c) entryLowerEntry.getValue()).i().compareTo(this.a.b) >= 0 ? this.a.b : ((c) entryLowerEntry.getValue()).i());
            }
            throw new NoSuchElementException();
        }

        /* JADX WARN: Multi-variable type inference failed */
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
        @Override // com.google.common.collect.RangeMap
        public RangeMap<K, V> subRangeMap(Range<K> range) {
            return !range.isConnected(this.a) ? TreeRangeMap.this.f() : TreeRangeMap.this.subRangeMap(range.intersection(this.a));
        }

        @Override // com.google.common.collect.RangeMap
        public String toString() {
            return asMapOfRanges().toString();
        }
    }

    private TreeRangeMap() {
    }

    public static <K extends Comparable, V> TreeRangeMap<K, V> create() {
        return new TreeRangeMap<>();
    }

    private static <K extends Comparable, V> Range<K> d(Range<K> range, V v, @NullableDecl Map.Entry<d0<K>, c<K, V>> entry) {
        return (entry != null && entry.getValue().getKey().isConnected(range) && entry.getValue().getValue().equals(v)) ? (Range<K>) range.span(entry.getValue().getKey()) : range;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public Range<K> e(Range<K> range, V v) {
        return d(d(range, v, this.a.lowerEntry((d0<K>) range.a)), v, this.a.floorEntry((d0<K>) range.b));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public RangeMap<K, V> f() {
        return b;
    }

    private void g(d0<K> d0Var, d0<K> d0Var2, V v) {
        this.a.put(d0Var, new c(d0Var, d0Var2, v));
    }

    @Override // com.google.common.collect.RangeMap
    public Map<Range<K>, V> asDescendingMapOfRanges() {
        return new b(this.a.descendingMap().values());
    }

    @Override // com.google.common.collect.RangeMap
    public Map<Range<K>, V> asMapOfRanges() {
        return new b(this.a.values());
    }

    @Override // com.google.common.collect.RangeMap
    public void clear() {
        this.a.clear();
    }

    @Override // com.google.common.collect.RangeMap
    public boolean equals(@NullableDecl Object obj) {
        if (obj instanceof RangeMap) {
            return asMapOfRanges().equals(((RangeMap) obj).asMapOfRanges());
        }
        return false;
    }

    @Override // com.google.common.collect.RangeMap
    @NullableDecl
    public V get(K k) {
        Map.Entry<Range<K>, V> entry = getEntry(k);
        if (entry == null) {
            return null;
        }
        return entry.getValue();
    }

    @Override // com.google.common.collect.RangeMap
    @NullableDecl
    public Map.Entry<Range<K>, V> getEntry(K k) {
        Map.Entry<d0<K>, c<K, V>> entryFloorEntry = this.a.floorEntry(d0.e(k));
        if (entryFloorEntry == null || !entryFloorEntry.getValue().f(k)) {
            return null;
        }
        return entryFloorEntry.getValue();
    }

    @Override // com.google.common.collect.RangeMap
    public int hashCode() {
        return asMapOfRanges().hashCode();
    }

    @Override // com.google.common.collect.RangeMap
    public void put(Range<K> range, V v) {
        if (range.isEmpty()) {
            return;
        }
        Preconditions.checkNotNull(v);
        remove(range);
        this.a.put(range.a, new c(range, v));
    }

    @Override // com.google.common.collect.RangeMap
    public void putAll(RangeMap<K, V> rangeMap) {
        for (Map.Entry<Range<K>, V> entry : rangeMap.asMapOfRanges().entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.RangeMap
    public void putCoalescing(Range<K> range, V v) {
        if (this.a.isEmpty()) {
            put(range, v);
        } else {
            put(e(range, Preconditions.checkNotNull(v)), v);
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.google.common.collect.RangeMap
    public void remove(Range<K> range) {
        if (range.isEmpty()) {
            return;
        }
        Map.Entry<d0<K>, c<K, V>> entryLowerEntry = this.a.lowerEntry((d0<K>) range.a);
        if (entryLowerEntry != null) {
            c<K, V> value = entryLowerEntry.getValue();
            if (value.i().compareTo(range.a) > 0) {
                if (value.i().compareTo(range.b) > 0) {
                    g(range.b, value.i(), entryLowerEntry.getValue().getValue());
                }
                g(value.h(), range.a, entryLowerEntry.getValue().getValue());
            }
        }
        Map.Entry<d0<K>, c<K, V>> entryLowerEntry2 = this.a.lowerEntry((d0<K>) range.b);
        if (entryLowerEntry2 != null) {
            c<K, V> value2 = entryLowerEntry2.getValue();
            if (value2.i().compareTo(range.b) > 0) {
                g(range.b, value2.i(), entryLowerEntry2.getValue().getValue());
            }
        }
        this.a.subMap((d0<K>) range.a, (d0<K>) range.b).clear();
    }

    @Override // com.google.common.collect.RangeMap
    public Range<K> span() {
        Map.Entry<d0<K>, c<K, V>> entryFirstEntry = this.a.firstEntry();
        Map.Entry<d0<K>, c<K, V>> entryLastEntry = this.a.lastEntry();
        if (entryFirstEntry != null) {
            return Range.c(entryFirstEntry.getValue().getKey().a, entryLastEntry.getValue().getKey().b);
        }
        throw new NoSuchElementException();
    }

    @Override // com.google.common.collect.RangeMap
    public RangeMap<K, V> subRangeMap(Range<K> range) {
        return range.equals(Range.all()) ? this : new d(range);
    }

    @Override // com.google.common.collect.RangeMap
    public String toString() {
        return this.a.values().toString();
    }
}
