package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Converter;
import com.google.common.base.Equivalence;
import com.google.common.base.Function;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.j2objc.annotations.RetainedWith;
import com.google.j2objc.annotations.Weak;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Properties;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible(emulated = true)
public final class Maps {

    public interface EntryTransformer<K, V1, V2> {
        V2 transformEntry(@NullableDecl K k, @NullableDecl V1 v1);
    }

    /* JADX INFO: Add missing generic type declarations: [V1, V2] */
    public static class a<V1, V2> implements Function<V1, V2> {
        public final /* synthetic */ EntryTransformer a;
        public final /* synthetic */ Object b;

        public a(EntryTransformer entryTransformer, Object obj) {
            this.a = entryTransformer;
            this.b = obj;
        }

        @Override // com.google.common.base.Function
        public V2 apply(@NullableDecl V1 v1) {
            return (V2) this.a.transformEntry(this.b, v1);
        }
    }

    public static class a0<K, V> extends Sets.k<K> {

        @Weak
        public final Map<K, V> a;

        public a0(Map<K, V> map) {
            this.a = (Map) Preconditions.checkNotNull(map);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            f().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return f().containsKey(obj);
        }

        /* JADX INFO: renamed from: d */
        public Map<K, V> f() {
            return this.a;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return f().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return Maps.w(f().entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (!contains(obj)) {
                return false;
            }
            f().remove(obj);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return f().size();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [K, V1, V2] */
    public static class b<K, V1, V2> implements Function<Map.Entry<K, V1>, V2> {
        public final /* synthetic */ EntryTransformer a;

        public b(EntryTransformer entryTransformer) {
            this.a = entryTransformer;
        }

        @Override // com.google.common.base.Function
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public V2 apply(Map.Entry<K, V1> entry) {
            return (V2) this.a.transformEntry(entry.getKey(), entry.getValue());
        }
    }

    public static class b0<K, V> implements MapDifference<K, V> {
        public final Map<K, V> a;
        public final Map<K, V> b;
        public final Map<K, V> c;
        public final Map<K, MapDifference.ValueDifference<V>> d;

        public b0(Map<K, V> map, Map<K, V> map2, Map<K, V> map3, Map<K, MapDifference.ValueDifference<V>> map4) {
            this.a = Maps.N(map);
            this.b = Maps.N(map2);
            this.c = Maps.N(map3);
            this.d = Maps.N(map4);
        }

        @Override // com.google.common.collect.MapDifference
        public boolean areEqual() {
            return this.a.isEmpty() && this.b.isEmpty() && this.d.isEmpty();
        }

        @Override // com.google.common.collect.MapDifference
        public Map<K, MapDifference.ValueDifference<V>> entriesDiffering() {
            return this.d;
        }

        @Override // com.google.common.collect.MapDifference
        public Map<K, V> entriesInCommon() {
            return this.c;
        }

        @Override // com.google.common.collect.MapDifference
        public Map<K, V> entriesOnlyOnLeft() {
            return this.a;
        }

        @Override // com.google.common.collect.MapDifference
        public Map<K, V> entriesOnlyOnRight() {
            return this.b;
        }

        @Override // com.google.common.collect.MapDifference
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof MapDifference)) {
                return false;
            }
            MapDifference mapDifference = (MapDifference) obj;
            return entriesOnlyOnLeft().equals(mapDifference.entriesOnlyOnLeft()) && entriesOnlyOnRight().equals(mapDifference.entriesOnlyOnRight()) && entriesInCommon().equals(mapDifference.entriesInCommon()) && entriesDiffering().equals(mapDifference.entriesDiffering());
        }

        @Override // com.google.common.collect.MapDifference
        public int hashCode() {
            return Objects.hashCode(entriesOnlyOnLeft(), entriesOnlyOnRight(), entriesInCommon(), entriesDiffering());
        }

        public String toString() {
            if (areEqual()) {
                return "equal";
            }
            StringBuilder sb = new StringBuilder("not equal");
            if (!this.a.isEmpty()) {
                sb.append(": only on left=");
                sb.append(this.a);
            }
            if (!this.b.isEmpty()) {
                sb.append(": only on right=");
                sb.append(this.b);
            }
            if (!this.d.isEmpty()) {
                sb.append(": value differences=");
                sb.append(this.d);
            }
            return sb.toString();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [K, V2] */
    public static class c<K, V2> extends com.google.common.collect.f<K, V2> {
        public final /* synthetic */ Map.Entry a;
        public final /* synthetic */ EntryTransformer b;

        public c(Map.Entry entry, EntryTransformer entryTransformer) {
            this.a = entry;
            this.b = entryTransformer;
        }

        @Override // com.google.common.collect.f, java.util.Map.Entry
        public K getKey() {
            return (K) this.a.getKey();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.f, java.util.Map.Entry
        public V2 getValue() {
            return (V2) this.b.transformEntry(this.a.getKey(), this.a.getValue());
        }
    }

    @GwtIncompatible
    public static final class c0<K, V> extends com.google.common.collect.i<K, V> {
        private final NavigableSet<K> a;
        private final Function<? super K, V> b;

        public c0(NavigableSet<K> navigableSet, Function<? super K, V> function) {
            this.a = (NavigableSet) Preconditions.checkNotNull(navigableSet);
            this.b = (Function) Preconditions.checkNotNull(function);
        }

        @Override // com.google.common.collect.Maps.z
        public Iterator<Map.Entry<K, V>> a() {
            return Maps.i(this.a, this.b);
        }

        @Override // com.google.common.collect.i
        public Iterator<Map.Entry<K, V>> c() {
            return descendingMap().entrySet().iterator();
        }

        @Override // com.google.common.collect.Maps.z, java.util.AbstractMap, java.util.Map
        public void clear() {
            this.a.clear();
        }

        @Override // java.util.SortedMap
        public Comparator<? super K> comparator() {
            return this.a.comparator();
        }

        @Override // com.google.common.collect.i, java.util.NavigableMap
        public NavigableMap<K, V> descendingMap() {
            return Maps.asMap((NavigableSet) this.a.descendingSet(), (Function) this.b);
        }

        @Override // com.google.common.collect.i, java.util.AbstractMap, java.util.Map
        @NullableDecl
        public V get(@NullableDecl Object obj) {
            if (Collections2.g(this.a, obj)) {
                return this.b.apply(obj);
            }
            return null;
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> headMap(K k, boolean z) {
            return Maps.asMap((NavigableSet) this.a.headSet(k, z), (Function) this.b);
        }

        @Override // com.google.common.collect.i, java.util.NavigableMap
        public NavigableSet<K> navigableKeySet() {
            return Maps.C(this.a);
        }

        @Override // com.google.common.collect.Maps.z, java.util.AbstractMap, java.util.Map
        public int size() {
            return this.a.size();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> subMap(K k, boolean z, K k2, boolean z2) {
            return Maps.asMap((NavigableSet) this.a.subSet(k, z, k2, z2), (Function) this.b);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> tailMap(K k, boolean z) {
            return Maps.asMap((NavigableSet) this.a.tailSet(k, z), (Function) this.b);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [K, V1, V2] */
    public static class d<K, V1, V2> implements Function<Map.Entry<K, V1>, Map.Entry<K, V2>> {
        public final /* synthetic */ EntryTransformer a;

        public d(EntryTransformer entryTransformer) {
            this.a = entryTransformer;
        }

        @Override // com.google.common.base.Function
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V2> apply(Map.Entry<K, V1> entry) {
            return Maps.J(this.a, entry);
        }
    }

    @GwtIncompatible
    public static class d0<K, V> extends f0<K, V> implements NavigableSet<K> {
        public d0(NavigableMap<K, V> navigableMap) {
            super(navigableMap);
        }

        @Override // java.util.NavigableSet
        public K ceiling(K k) {
            return d().ceilingKey(k);
        }

        @Override // java.util.NavigableSet
        public Iterator<K> descendingIterator() {
            return descendingSet().iterator();
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> descendingSet() {
            return d().descendingKeySet();
        }

        @Override // java.util.NavigableSet
        public K floor(K k) {
            return d().floorKey(k);
        }

        @Override // com.google.common.collect.Maps.f0
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public NavigableMap<K, V> f() {
            return (NavigableMap) this.a;
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> headSet(K k, boolean z) {
            return d().headMap(k, z).navigableKeySet();
        }

        @Override // java.util.NavigableSet
        public K higher(K k) {
            return d().higherKey(k);
        }

        @Override // java.util.NavigableSet
        public K lower(K k) {
            return d().lowerKey(k);
        }

        @Override // java.util.NavigableSet
        public K pollFirst() {
            return (K) Maps.x(d().pollFirstEntry());
        }

        @Override // java.util.NavigableSet
        public K pollLast() {
            return (K) Maps.x(d().pollLastEntry());
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> subSet(K k, boolean z, K k2, boolean z2) {
            return d().subMap(k, z, k2, z2).navigableKeySet();
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> tailSet(K k, boolean z) {
            return d().tailMap(k, z).navigableKeySet();
        }

        @Override // com.google.common.collect.Maps.f0, java.util.SortedSet, java.util.NavigableSet
        public SortedSet<K> headSet(K k) {
            return headSet(k, false);
        }

        @Override // com.google.common.collect.Maps.f0, java.util.SortedSet, java.util.NavigableSet
        public SortedSet<K> subSet(K k, K k2) {
            return subSet(k, true, k2, false);
        }

        @Override // com.google.common.collect.Maps.f0, java.util.SortedSet, java.util.NavigableSet
        public SortedSet<K> tailSet(K k) {
            return tailSet(k, true);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [V, K] */
    public static class e<K, V> extends x2<Map.Entry<K, V>, K> {
        public e(Iterator it2) {
            super(it2);
        }

        @Override // com.google.common.collect.x2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public K a(Map.Entry<K, V> entry) {
            return entry.getKey();
        }
    }

    public static class e0<K, V> extends o<K, V> implements SortedMap<K, V> {
        public e0(SortedSet<K> sortedSet, Function<? super K, V> function) {
            super(sortedSet, function);
        }

        @Override // java.util.SortedMap
        public Comparator<? super K> comparator() {
            return e().comparator();
        }

        @Override // com.google.common.collect.Maps.o
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public SortedSet<K> e() {
            return (SortedSet) super.e();
        }

        @Override // java.util.SortedMap
        public K firstKey() {
            return e().first();
        }

        @Override // java.util.SortedMap
        public SortedMap<K, V> headMap(K k) {
            return Maps.asMap((SortedSet) e().headSet(k), (Function) this.e);
        }

        @Override // com.google.common.collect.Maps.q0, java.util.AbstractMap, java.util.Map, java.util.SortedMap
        public Set<K> keySet() {
            return Maps.E(e());
        }

        @Override // java.util.SortedMap
        public K lastKey() {
            return e().last();
        }

        @Override // java.util.SortedMap
        public SortedMap<K, V> subMap(K k, K k2) {
            return Maps.asMap((SortedSet) e().subSet(k, k2), (Function) this.e);
        }

        @Override // java.util.SortedMap
        public SortedMap<K, V> tailMap(K k) {
            return Maps.asMap((SortedSet) e().tailSet(k), (Function) this.e);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [V, K] */
    public static class f<K, V> extends x2<Map.Entry<K, V>, V> {
        public f(Iterator it2) {
            super(it2);
        }

        @Override // com.google.common.collect.x2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public V a(Map.Entry<K, V> entry) {
            return entry.getValue();
        }
    }

    public static class f0<K, V> extends a0<K, V> implements SortedSet<K> {
        public f0(SortedMap<K, V> sortedMap) {
            super(sortedMap);
        }

        @Override // java.util.SortedSet
        public Comparator<? super K> comparator() {
            return f().comparator();
        }

        @Override // com.google.common.collect.Maps.a0
        public SortedMap<K, V> f() {
            return (SortedMap) super.f();
        }

        @Override // java.util.SortedSet
        public K first() {
            return f().firstKey();
        }

        public SortedSet<K> headSet(K k) {
            return new f0(f().headMap(k));
        }

        @Override // java.util.SortedSet
        public K last() {
            return f().lastKey();
        }

        public SortedSet<K> subSet(K k, K k2) {
            return new f0(f().subMap(k, k2));
        }

        public SortedSet<K> tailSet(K k) {
            return new f0(f().tailMap(k));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [V, K] */
    public static class g<K, V> extends x2<K, Map.Entry<K, V>> {
        public final /* synthetic */ Function b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Iterator it2, Function function) {
            super(it2);
            this.b = function;
        }

        @Override // com.google.common.collect.x2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> a(K k) {
            return Maps.immutableEntry(k, this.b.apply(k));
        }
    }

    public static class g0<K, V> extends b0<K, V> implements SortedMapDifference<K, V> {
        public g0(SortedMap<K, V> sortedMap, SortedMap<K, V> sortedMap2, SortedMap<K, V> sortedMap3, SortedMap<K, MapDifference.ValueDifference<V>> sortedMap4) {
            super(sortedMap, sortedMap2, sortedMap3, sortedMap4);
        }

        @Override // com.google.common.collect.Maps.b0, com.google.common.collect.MapDifference
        public SortedMap<K, MapDifference.ValueDifference<V>> entriesDiffering() {
            return (SortedMap) super.entriesDiffering();
        }

        @Override // com.google.common.collect.Maps.b0, com.google.common.collect.MapDifference
        public SortedMap<K, V> entriesInCommon() {
            return (SortedMap) super.entriesInCommon();
        }

        @Override // com.google.common.collect.Maps.b0, com.google.common.collect.MapDifference
        public SortedMap<K, V> entriesOnlyOnLeft() {
            return (SortedMap) super.entriesOnlyOnLeft();
        }

        @Override // com.google.common.collect.Maps.b0, com.google.common.collect.MapDifference
        public SortedMap<K, V> entriesOnlyOnRight() {
            return (SortedMap) super.entriesOnlyOnRight();
        }
    }

    public static class h0<K, V1, V2> extends z<K, V2> {
        public final Map<K, V1> a;
        public final EntryTransformer<? super K, ? super V1, V2> b;

        public h0(Map<K, V1> map, EntryTransformer<? super K, ? super V1, V2> entryTransformer) {
            this.a = (Map) Preconditions.checkNotNull(map);
            this.b = (EntryTransformer) Preconditions.checkNotNull(entryTransformer);
        }

        @Override // com.google.common.collect.Maps.z
        public Iterator<Map.Entry<K, V2>> a() {
            return Iterators.transform(this.a.entrySet().iterator(), Maps.f(this.b));
        }

        @Override // com.google.common.collect.Maps.z, java.util.AbstractMap, java.util.Map
        public void clear() {
            this.a.clear();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return this.a.containsKey(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V2 get(Object obj) {
            V1 v1 = this.a.get(obj);
            if (v1 != null || this.a.containsKey(obj)) {
                return this.b.transformEntry(obj, v1);
            }
            return null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<K> keySet() {
            return this.a.keySet();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V2 remove(Object obj) {
            if (this.a.containsKey(obj)) {
                return this.b.transformEntry(obj, this.a.remove(obj));
            }
            return null;
        }

        @Override // com.google.common.collect.Maps.z, java.util.AbstractMap, java.util.Map
        public int size() {
            return this.a.size();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Collection<V2> values() {
            return new p0(this);
        }
    }

    @GwtIncompatible
    public static class i0<K, V1, V2> extends j0<K, V1, V2> implements NavigableMap<K, V2> {
        public i0(NavigableMap<K, V1> navigableMap, EntryTransformer<? super K, ? super V1, V2> entryTransformer) {
            super(navigableMap, entryTransformer);
        }

        @NullableDecl
        private Map.Entry<K, V2> h(@NullableDecl Map.Entry<K, V1> entry) {
            if (entry == null) {
                return null;
            }
            return Maps.J(this.b, entry);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V2> ceilingEntry(K k) {
            return h(c().ceilingEntry(k));
        }

        @Override // java.util.NavigableMap
        public K ceilingKey(K k) {
            return c().ceilingKey(k);
        }

        @Override // com.google.common.collect.Maps.j0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, V1> c() {
            return (NavigableMap) super.c();
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> descendingKeySet() {
            return c().descendingKeySet();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V2> descendingMap() {
            return Maps.transformEntries((NavigableMap) c().descendingMap(), (EntryTransformer) this.b);
        }

        @Override // com.google.common.collect.Maps.j0, java.util.SortedMap, java.util.NavigableMap
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, V2> headMap(K k) {
            return headMap(k, false);
        }

        @Override // com.google.common.collect.Maps.j0, java.util.SortedMap, java.util.NavigableMap
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, V2> subMap(K k, K k2) {
            return subMap(k, true, k2, false);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V2> firstEntry() {
            return h(c().firstEntry());
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V2> floorEntry(K k) {
            return h(c().floorEntry(k));
        }

        @Override // java.util.NavigableMap
        public K floorKey(K k) {
            return c().floorKey(k);
        }

        @Override // com.google.common.collect.Maps.j0, java.util.SortedMap, java.util.NavigableMap
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, V2> tailMap(K k) {
            return tailMap(k, true);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V2> higherEntry(K k) {
            return h(c().higherEntry(k));
        }

        @Override // java.util.NavigableMap
        public K higherKey(K k) {
            return c().higherKey(k);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V2> lastEntry() {
            return h(c().lastEntry());
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V2> lowerEntry(K k) {
            return h(c().lowerEntry(k));
        }

        @Override // java.util.NavigableMap
        public K lowerKey(K k) {
            return c().lowerKey(k);
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> navigableKeySet() {
            return c().navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V2> pollFirstEntry() {
            return h(c().pollFirstEntry());
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V2> pollLastEntry() {
            return h(c().pollLastEntry());
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V2> headMap(K k, boolean z) {
            return Maps.transformEntries((NavigableMap) c().headMap(k, z), (EntryTransformer) this.b);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V2> subMap(K k, boolean z, K k2, boolean z2) {
            return Maps.transformEntries((NavigableMap) c().subMap(k, z, k2, z2), (EntryTransformer) this.b);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V2> tailMap(K k, boolean z) {
            return Maps.transformEntries((NavigableMap) c().tailMap(k, z), (EntryTransformer) this.b);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    public static class j<E> extends ForwardingNavigableSet<E> {
        public final /* synthetic */ NavigableSet a;

        public j(NavigableSet navigableSet) {
            this.a = navigableSet;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Queue
        public boolean add(E e) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection
        public boolean addAll(Collection<? extends E> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public NavigableSet<E> descendingSet() {
            return Maps.C(super.descendingSet());
        }

        @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
        public SortedSet<E> headSet(E e) {
            return Maps.E(super.headSet(e));
        }

        @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
        public SortedSet<E> subSet(E e, E e2) {
            return Maps.E(super.subSet(e, e2));
        }

        @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
        public SortedSet<E> tailSet(E e) {
            return Maps.E(super.tailSet(e));
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public NavigableSet<E> headSet(E e, boolean z) {
            return Maps.C(super.headSet(e, z));
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public NavigableSet<E> subSet(E e, boolean z, E e2, boolean z2) {
            return Maps.C(super.subSet(e, z, e2, z2));
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public NavigableSet<E> tailSet(E e, boolean z) {
            return Maps.C(super.tailSet(e, z));
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public NavigableSet<E> delegate() {
            return this.a;
        }
    }

    public static class j0<K, V1, V2> extends h0<K, V1, V2> implements SortedMap<K, V2> {
        public j0(SortedMap<K, V1> sortedMap, EntryTransformer<? super K, ? super V1, V2> entryTransformer) {
            super(sortedMap, entryTransformer);
        }

        public SortedMap<K, V1> c() {
            return (SortedMap) this.a;
        }

        @Override // java.util.SortedMap
        public Comparator<? super K> comparator() {
            return c().comparator();
        }

        @Override // java.util.SortedMap
        public K firstKey() {
            return c().firstKey();
        }

        public SortedMap<K, V2> headMap(K k) {
            return Maps.transformEntries((SortedMap) c().headMap(k), (EntryTransformer) this.b);
        }

        @Override // java.util.SortedMap
        public K lastKey() {
            return c().lastKey();
        }

        public SortedMap<K, V2> subMap(K k, K k2) {
            return Maps.transformEntries((SortedMap) c().subMap(k, k2), (EntryTransformer) this.b);
        }

        public SortedMap<K, V2> tailMap(K k) {
            return Maps.transformEntries((SortedMap) c().tailMap(k), (EntryTransformer) this.b);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [V, K] */
    public static class k<K, V> extends com.google.common.collect.f<K, V> {
        public final /* synthetic */ Map.Entry a;

        public k(Map.Entry entry) {
            this.a = entry;
        }

        @Override // com.google.common.collect.f, java.util.Map.Entry
        public K getKey() {
            return (K) this.a.getKey();
        }

        @Override // com.google.common.collect.f, java.util.Map.Entry
        public V getValue() {
            return (V) this.a.getValue();
        }
    }

    public static class k0<K, V> extends ForwardingMap<K, V> implements BiMap<K, V>, Serializable {
        private static final long serialVersionUID = 0;
        public final Map<K, V> a;
        public final BiMap<? extends K, ? extends V> b;

        @RetainedWith
        @MonotonicNonNullDecl
        public BiMap<V, K> c;

        @MonotonicNonNullDecl
        public transient Set<V> d;

        public k0(BiMap<? extends K, ? extends V> biMap, @NullableDecl BiMap<V, K> biMap2) {
            this.a = Collections.unmodifiableMap(biMap);
            this.b = biMap;
            this.c = biMap2;
        }

        @Override // com.google.common.collect.BiMap
        public V forcePut(K k, V v) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.BiMap
        public BiMap<V, K> inverse() {
            BiMap<V, K> biMap = this.c;
            if (biMap != null) {
                return biMap;
            }
            k0 k0Var = new k0(this.b.inverse(), this);
            this.c = k0Var;
            return k0Var;
        }

        @Override // com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
        public Map<K, V> delegate() {
            return this.a;
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map, com.google.common.collect.BiMap
        public Set<V> values() {
            Set<V> set = this.d;
            if (set != null) {
                return set;
            }
            Set<V> setUnmodifiableSet = Collections.unmodifiableSet(this.b.values());
            this.d = setUnmodifiableSet;
            return setUnmodifiableSet;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [V, K] */
    public static class l<K, V> extends UnmodifiableIterator<Map.Entry<K, V>> {
        public final /* synthetic */ Iterator a;

        public l(Iterator it2) {
            this.a = it2;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            return Maps.K((Map.Entry) this.a.next());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.a.hasNext();
        }
    }

    public static class l0<K, V> extends ForwardingCollection<Map.Entry<K, V>> {
        private final Collection<Map.Entry<K, V>> a;

        public l0(Collection<Map.Entry<K, V>> collection) {
            this.a = collection;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.lang.Iterable
        public Iterator<Map.Entry<K, V>> iterator() {
            return Maps.L(this.a.iterator());
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection
        public Object[] toArray() {
            return standardToArray();
        }

        @Override // com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public Collection<Map.Entry<K, V>> delegate() {
            return this.a;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) standardToArray(tArr);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [K, V1, V2] */
    public static class m<K, V1, V2> implements EntryTransformer<K, V1, V2> {
        public final /* synthetic */ Function a;

        public m(Function function) {
            this.a = function;
        }

        @Override // com.google.common.collect.Maps.EntryTransformer
        public V2 transformEntry(K k, V1 v1) {
            return (V2) this.a.apply(v1);
        }
    }

    public static class m0<K, V> extends l0<K, V> implements Set<Map.Entry<K, V>> {
        public m0(Set<Map.Entry<K, V>> set) {
            super(set);
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(@NullableDecl Object obj) {
            return Sets.a(this, obj);
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            return Sets.b(this);
        }
    }

    public static abstract class n<K, V> extends q0<K, V> {
        public final Map<K, V> d;
        public final Predicate<? super Map.Entry<K, V>> e;

        public n(Map<K, V> map, Predicate<? super Map.Entry<K, V>> predicate) {
            this.d = map;
            this.e = predicate;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return this.d.containsKey(obj) && e(obj, this.d.get(obj));
        }

        @Override // com.google.common.collect.Maps.q0
        public Collection<V> d() {
            return new y(this, this.d, this.e);
        }

        public boolean e(@NullableDecl Object obj, @NullableDecl V v) {
            return this.e.apply(Maps.immutableEntry(obj, v));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V get(Object obj) {
            V v = this.d.get(obj);
            if (v == null || !e(obj, v)) {
                return null;
            }
            return v;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean isEmpty() {
            return entrySet().isEmpty();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V put(K k, V v) {
            Preconditions.checkArgument(e(k, v));
            return this.d.put(k, v);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void putAll(Map<? extends K, ? extends V> map) {
            for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
                Preconditions.checkArgument(e(entry.getKey(), entry.getValue()));
            }
            this.d.putAll(map);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V remove(Object obj) {
            if (containsKey(obj)) {
                return this.d.remove(obj);
            }
            return null;
        }
    }

    @GwtIncompatible
    public static class n0<K, V> extends ForwardingSortedMap<K, V> implements NavigableMap<K, V>, Serializable {
        private final NavigableMap<K, ? extends V> a;

        @MonotonicNonNullDecl
        private transient n0<K, V> b;

        public n0(NavigableMap<K, ? extends V> navigableMap) {
            this.a = navigableMap;
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> ceilingEntry(K k) {
            return Maps.O(this.a.ceilingEntry(k));
        }

        @Override // java.util.NavigableMap
        public K ceilingKey(K k) {
            return this.a.ceilingKey(k);
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> descendingKeySet() {
            return Sets.unmodifiableNavigableSet(this.a.descendingKeySet());
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> descendingMap() {
            n0<K, V> n0Var = this.b;
            if (n0Var != null) {
                return n0Var;
            }
            n0<K, V> n0Var2 = new n0<>(this.a.descendingMap(), this);
            this.b = n0Var2;
            return n0Var2;
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> firstEntry() {
            return Maps.O(this.a.firstEntry());
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> floorEntry(K k) {
            return Maps.O(this.a.floorEntry(k));
        }

        @Override // java.util.NavigableMap
        public K floorKey(K k) {
            return this.a.floorKey(k);
        }

        @Override // com.google.common.collect.ForwardingSortedMap, java.util.SortedMap
        public SortedMap<K, V> headMap(K k) {
            return headMap(k, false);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> higherEntry(K k) {
            return Maps.O(this.a.higherEntry(k));
        }

        @Override // java.util.NavigableMap
        public K higherKey(K k) {
            return this.a.higherKey(k);
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        public Set<K> keySet() {
            return navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> lastEntry() {
            return Maps.O(this.a.lastEntry());
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> lowerEntry(K k) {
            return Maps.O(this.a.lowerEntry(k));
        }

        @Override // java.util.NavigableMap
        public K lowerKey(K k) {
            return this.a.lowerKey(k);
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> navigableKeySet() {
            return Sets.unmodifiableNavigableSet(this.a.navigableKeySet());
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, V> pollFirstEntry() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, V> pollLastEntry() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingSortedMap, java.util.SortedMap
        public SortedMap<K, V> subMap(K k, K k2) {
            return subMap(k, true, k2, false);
        }

        @Override // com.google.common.collect.ForwardingSortedMap, java.util.SortedMap
        public SortedMap<K, V> tailMap(K k) {
            return tailMap(k, true);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> headMap(K k, boolean z) {
            return Maps.unmodifiableNavigableMap(this.a.headMap(k, z));
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> subMap(K k, boolean z, K k2, boolean z2) {
            return Maps.unmodifiableNavigableMap(this.a.subMap(k, z, k2, z2));
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> tailMap(K k, boolean z) {
            return Maps.unmodifiableNavigableMap(this.a.tailMap(k, z));
        }

        public n0(NavigableMap<K, ? extends V> navigableMap, n0<K, V> n0Var) {
            this.a = navigableMap;
            this.b = n0Var;
        }

        @Override // com.google.common.collect.ForwardingSortedMap, com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
        public SortedMap<K, V> delegate() {
            return Collections.unmodifiableSortedMap(this.a);
        }
    }

    public static class o<K, V> extends q0<K, V> {
        private final Set<K> d;
        public final Function<? super K, V> e;

        public class a extends s<K, V> {
            public a() {
            }

            @Override // com.google.common.collect.Maps.s
            public Map<K, V> d() {
                return o.this;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, V>> iterator() {
                return Maps.i(o.this.e(), o.this.e);
            }
        }

        public o(Set<K> set, Function<? super K, V> function) {
            this.d = (Set) Preconditions.checkNotNull(set);
            this.e = (Function) Preconditions.checkNotNull(function);
        }

        @Override // com.google.common.collect.Maps.q0
        public Set<Map.Entry<K, V>> a() {
            return new a();
        }

        @Override // com.google.common.collect.Maps.q0
        /* JADX INFO: renamed from: c */
        public Set<K> h() {
            return Maps.D(e());
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            e().clear();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@NullableDecl Object obj) {
            return e().contains(obj);
        }

        @Override // com.google.common.collect.Maps.q0
        public Collection<V> d() {
            return Collections2.transform(this.d, this.e);
        }

        public Set<K> e() {
            return this.d;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V get(@NullableDecl Object obj) {
            if (Collections2.g(e(), obj)) {
                return this.e.apply(obj);
            }
            return null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V remove(@NullableDecl Object obj) {
            if (e().remove(obj)) {
                return this.e.apply(obj);
            }
            return null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return e().size();
        }
    }

    public static class o0<V> implements MapDifference.ValueDifference<V> {

        @NullableDecl
        private final V a;

        @NullableDecl
        private final V b;

        private o0(@NullableDecl V v, @NullableDecl V v2) {
            this.a = v;
            this.b = v2;
        }

        public static <V> MapDifference.ValueDifference<V> a(@NullableDecl V v, @NullableDecl V v2) {
            return new o0(v, v2);
        }

        @Override // com.google.common.collect.MapDifference.ValueDifference
        public boolean equals(@NullableDecl Object obj) {
            if (!(obj instanceof MapDifference.ValueDifference)) {
                return false;
            }
            MapDifference.ValueDifference valueDifference = (MapDifference.ValueDifference) obj;
            return Objects.equal(this.a, valueDifference.leftValue()) && Objects.equal(this.b, valueDifference.rightValue());
        }

        @Override // com.google.common.collect.MapDifference.ValueDifference
        public int hashCode() {
            return Objects.hashCode(this.a, this.b);
        }

        @Override // com.google.common.collect.MapDifference.ValueDifference
        public V leftValue() {
            return this.a;
        }

        @Override // com.google.common.collect.MapDifference.ValueDifference
        public V rightValue() {
            return this.b;
        }

        public String toString() {
            return "(" + this.a + ", " + this.b + ")";
        }
    }

    public static final class p<A, B> extends Converter<A, B> implements Serializable {
        private static final long serialVersionUID = 0;
        private final BiMap<A, B> c;

        public p(BiMap<A, B> biMap) {
            this.c = (BiMap) Preconditions.checkNotNull(biMap);
        }

        private static <X, Y> Y e(BiMap<X, Y> biMap, X x) {
            Y y = biMap.get(x);
            Preconditions.checkArgument(y != null, "No non-null mapping present for input: %s", x);
            return y;
        }

        @Override // com.google.common.base.Converter
        public A doBackward(B b) {
            return (A) e(this.c.inverse(), b);
        }

        @Override // com.google.common.base.Converter
        public B doForward(A a) {
            return (B) e(this.c, a);
        }

        @Override // com.google.common.base.Converter, com.google.common.base.Function
        public boolean equals(@NullableDecl Object obj) {
            if (obj instanceof p) {
                return this.c.equals(((p) obj).c);
            }
            return false;
        }

        public int hashCode() {
            return this.c.hashCode();
        }

        public String toString() {
            return "Maps.asConverter(" + this.c + ")";
        }
    }

    public static class p0<K, V> extends AbstractCollection<V> {

        @Weak
        public final Map<K, V> a;

        public p0(Map<K, V> map) {
            this.a = (Map) Preconditions.checkNotNull(map);
        }

        public final Map<K, V> a() {
            return this.a;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            a().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(@NullableDecl Object obj) {
            return a().containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return a().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return Maps.Q(a().entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            try {
                return super.remove(obj);
            } catch (UnsupportedOperationException unused) {
                for (Map.Entry<K, V> entry : a().entrySet()) {
                    if (Objects.equal(obj, entry.getValue())) {
                        a().remove(entry.getKey());
                        return true;
                    }
                }
                return false;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            try {
                return super.removeAll((Collection) Preconditions.checkNotNull(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet hashSetNewHashSet = Sets.newHashSet();
                for (Map.Entry<K, V> entry : a().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        hashSetNewHashSet.add(entry.getKey());
                    }
                }
                return a().keySet().removeAll(hashSetNewHashSet);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            try {
                return super.retainAll((Collection) Preconditions.checkNotNull(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet hashSetNewHashSet = Sets.newHashSet();
                for (Map.Entry<K, V> entry : a().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        hashSetNewHashSet.add(entry.getKey());
                    }
                }
                return a().keySet().retainAll(hashSetNewHashSet);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return a().size();
        }
    }

    @GwtIncompatible
    public static abstract class q<K, V> extends ForwardingMap<K, V> implements NavigableMap<K, V> {

        @MonotonicNonNullDecl
        private transient Comparator<? super K> a;

        @MonotonicNonNullDecl
        private transient Set<Map.Entry<K, V>> b;

        @MonotonicNonNullDecl
        private transient NavigableSet<K> c;

        public class a extends s<K, V> {
            public a() {
            }

            @Override // com.google.common.collect.Maps.s
            public Map<K, V> d() {
                return q.this;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, V>> iterator() {
                return q.this.entryIterator();
            }
        }

        private static <T> Ordering<T> g(Comparator<T> comparator) {
            return Ordering.from(comparator).reverse();
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> ceilingEntry(K k) {
            return f().floorEntry(k);
        }

        @Override // java.util.NavigableMap
        public K ceilingKey(K k) {
            return f().floorKey(k);
        }

        @Override // java.util.SortedMap
        public Comparator<? super K> comparator() {
            Comparator<? super K> comparator = this.a;
            if (comparator != null) {
                return comparator;
            }
            Comparator<? super K> comparator2 = f().comparator();
            if (comparator2 == null) {
                comparator2 = Ordering.natural();
            }
            Ordering orderingG = g(comparator2);
            this.a = orderingG;
            return orderingG;
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> descendingKeySet() {
            return f().navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> descendingMap() {
            return f();
        }

        public Set<Map.Entry<K, V>> e() {
            return new a();
        }

        public abstract Iterator<Map.Entry<K, V>> entryIterator();

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        public Set<Map.Entry<K, V>> entrySet() {
            Set<Map.Entry<K, V>> set = this.b;
            if (set != null) {
                return set;
            }
            Set<Map.Entry<K, V>> setE = e();
            this.b = setE;
            return setE;
        }

        public abstract NavigableMap<K, V> f();

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> firstEntry() {
            return f().lastEntry();
        }

        @Override // java.util.SortedMap
        public K firstKey() {
            return f().lastKey();
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> floorEntry(K k) {
            return f().ceilingEntry(k);
        }

        @Override // java.util.NavigableMap
        public K floorKey(K k) {
            return f().ceilingKey(k);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> headMap(K k, boolean z) {
            return f().tailMap(k, z).descendingMap();
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> higherEntry(K k) {
            return f().lowerEntry(k);
        }

        @Override // java.util.NavigableMap
        public K higherKey(K k) {
            return f().lowerKey(k);
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        public Set<K> keySet() {
            return navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> lastEntry() {
            return f().firstEntry();
        }

        @Override // java.util.SortedMap
        public K lastKey() {
            return f().firstKey();
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> lowerEntry(K k) {
            return f().higherEntry(k);
        }

        @Override // java.util.NavigableMap
        public K lowerKey(K k) {
            return f().higherKey(k);
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> navigableKeySet() {
            NavigableSet<K> navigableSet = this.c;
            if (navigableSet != null) {
                return navigableSet;
            }
            d0 d0Var = new d0(this);
            this.c = d0Var;
            return d0Var;
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> pollFirstEntry() {
            return f().pollLastEntry();
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> pollLastEntry() {
            return f().pollFirstEntry();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> subMap(K k, boolean z, K k2, boolean z2) {
            return f().subMap(k2, z2, k, z).descendingMap();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> tailMap(K k, boolean z) {
            return f().headMap(k, z).descendingMap();
        }

        @Override // com.google.common.collect.ForwardingObject
        public String toString() {
            return standardToString();
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map, com.google.common.collect.BiMap
        public Collection<V> values() {
            return new p0(this);
        }

        @Override // com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
        public final Map<K, V> delegate() {
            return f();
        }

        @Override // java.util.NavigableMap, java.util.SortedMap
        public SortedMap<K, V> headMap(K k) {
            return headMap(k, false);
        }

        @Override // java.util.NavigableMap, java.util.SortedMap
        public SortedMap<K, V> subMap(K k, K k2) {
            return subMap(k, true, k2, false);
        }

        @Override // java.util.NavigableMap, java.util.SortedMap
        public SortedMap<K, V> tailMap(K k) {
            return tailMap(k, true);
        }
    }

    @GwtCompatible
    public static abstract class q0<K, V> extends AbstractMap<K, V> {

        @MonotonicNonNullDecl
        private transient Set<Map.Entry<K, V>> a;

        @MonotonicNonNullDecl
        private transient Set<K> b;

        @MonotonicNonNullDecl
        private transient Collection<V> c;

        public abstract Set<Map.Entry<K, V>> a();

        /* JADX INFO: renamed from: c */
        public Set<K> h() {
            return new a0(this);
        }

        public Collection<V> d() {
            return new p0(this);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<K, V>> entrySet() {
            Set<Map.Entry<K, V>> set = this.a;
            if (set != null) {
                return set;
            }
            Set<Map.Entry<K, V>> setA = a();
            this.a = setA;
            return setA;
        }

        @Override // java.util.AbstractMap, java.util.Map, java.util.SortedMap
        public Set<K> keySet() {
            Set<K> set = this.b;
            if (set != null) {
                return set;
            }
            Set<K> setH = h();
            this.b = setH;
            return setH;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Collection<V> values() {
            Collection<V> collection = this.c;
            if (collection != null) {
                return collection;
            }
            Collection<V> collectionD = d();
            this.c = collectionD;
            return collectionD;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static abstract class r implements Function<Map.Entry<?, ?>, Object> {
        private static final /* synthetic */ r[] $VALUES;
        public static final r KEY;
        public static final r VALUE;

        public static enum a extends r {
            public a(String str, int i) {
                super(str, i, null);
            }

            @Override // com.google.common.base.Function
            @NullableDecl
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Object apply(Map.Entry<?, ?> entry) {
                return entry.getKey();
            }
        }

        public static enum b extends r {
            public b(String str, int i) {
                super(str, i, null);
            }

            @Override // com.google.common.base.Function
            @NullableDecl
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Object apply(Map.Entry<?, ?> entry) {
                return entry.getValue();
            }
        }

        static {
            a aVar = new a("KEY", 0);
            KEY = aVar;
            b bVar = new b("VALUE", 1);
            VALUE = bVar;
            $VALUES = new r[]{aVar, bVar};
        }

        private r(String str, int i) {
            super(str, i);
        }

        public static r valueOf(String str) {
            return (r) Enum.valueOf(r.class, str);
        }

        public static r[] values() {
            return (r[]) $VALUES.clone();
        }

        public /* synthetic */ r(String str, int i, e eVar) {
            this(str, i);
        }
    }

    public static abstract class s<K, V> extends Sets.k<Map.Entry<K, V>> {
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            d().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object objG = Maps.G(d(), key);
            if (Objects.equal(objG, entry.getValue())) {
                return objG != null || d().containsKey(key);
            }
            return false;
        }

        public abstract Map<K, V> d();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return d().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (contains(obj)) {
                return d().keySet().remove(((Map.Entry) obj).getKey());
            }
            return false;
        }

        @Override // com.google.common.collect.Sets.k, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            try {
                return super.removeAll((Collection) Preconditions.checkNotNull(collection));
            } catch (UnsupportedOperationException unused) {
                return Sets.e(this, collection.iterator());
            }
        }

        @Override // com.google.common.collect.Sets.k, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            try {
                return super.retainAll((Collection) Preconditions.checkNotNull(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet hashSetNewHashSetWithExpectedSize = Sets.newHashSetWithExpectedSize(collection.size());
                for (Object obj : collection) {
                    if (contains(obj)) {
                        hashSetNewHashSetWithExpectedSize.add(((Map.Entry) obj).getKey());
                    }
                }
                return d().keySet().retainAll(hashSetNewHashSetWithExpectedSize);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return d().size();
        }
    }

    public static final class t<K, V> extends u<K, V> implements BiMap<K, V> {

        @RetainedWith
        private final BiMap<V, K> g;

        public static class a implements Predicate<Map.Entry<V, K>> {
            public final /* synthetic */ Predicate a;

            public a(Predicate predicate) {
                this.a = predicate;
            }

            @Override // com.google.common.base.Predicate
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public boolean apply(Map.Entry<V, K> entry) {
                return this.a.apply(Maps.immutableEntry(entry.getValue(), entry.getKey()));
            }
        }

        public t(BiMap<K, V> biMap, Predicate<? super Map.Entry<K, V>> predicate) {
            super(biMap, predicate);
            this.g = new t(biMap.inverse(), h(predicate), this);
        }

        private static <K, V> Predicate<Map.Entry<V, K>> h(Predicate<? super Map.Entry<K, V>> predicate) {
            return new a(predicate);
        }

        @Override // com.google.common.collect.BiMap
        public V forcePut(@NullableDecl K k, @NullableDecl V v) {
            Preconditions.checkArgument(e(k, v));
            return i().forcePut(k, v);
        }

        public BiMap<K, V> i() {
            return (BiMap) this.d;
        }

        @Override // com.google.common.collect.BiMap
        public BiMap<V, K> inverse() {
            return this.g;
        }

        @Override // com.google.common.collect.Maps.q0, java.util.AbstractMap, java.util.Map
        public Set<V> values() {
            return this.g.keySet();
        }

        private t(BiMap<K, V> biMap, Predicate<? super Map.Entry<K, V>> predicate, BiMap<V, K> biMap2) {
            super(biMap, predicate);
            this.g = biMap2;
        }
    }

    public static class u<K, V> extends n<K, V> {
        public final Set<Map.Entry<K, V>> f;

        public class a extends ForwardingSet<Map.Entry<K, V>> {

            /* JADX INFO: renamed from: com.google.common.collect.Maps$u$a$a, reason: collision with other inner class name */
            public class C0179a extends x2<Map.Entry<K, V>, Map.Entry<K, V>> {

                /* JADX INFO: renamed from: com.google.common.collect.Maps$u$a$a$a, reason: collision with other inner class name */
                public class C0180a extends ForwardingMapEntry<K, V> {
                    public final /* synthetic */ Map.Entry a;

                    public C0180a(Map.Entry entry) {
                        this.a = entry;
                    }

                    @Override // com.google.common.collect.ForwardingMapEntry, java.util.Map.Entry
                    public V setValue(V v) {
                        Preconditions.checkArgument(u.this.e(getKey(), v));
                        return (V) super.setValue(v);
                    }

                    @Override // com.google.common.collect.ForwardingMapEntry, com.google.common.collect.ForwardingObject
                    public Map.Entry<K, V> delegate() {
                        return this.a;
                    }
                }

                public C0179a(Iterator it2) {
                    super(it2);
                }

                @Override // com.google.common.collect.x2
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public Map.Entry<K, V> a(Map.Entry<K, V> entry) {
                    return new C0180a(entry);
                }
            }

            private a() {
            }

            @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.lang.Iterable
            public Iterator<Map.Entry<K, V>> iterator() {
                return new C0179a(u.this.f.iterator());
            }

            public /* synthetic */ a(u uVar, e eVar) {
                this();
            }

            @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
            public Set<Map.Entry<K, V>> delegate() {
                return u.this.f;
            }
        }

        public class b extends a0<K, V> {
            public b() {
                super(u.this);
            }

            @Override // com.google.common.collect.Maps.a0, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
                if (!u.this.containsKey(obj)) {
                    return false;
                }
                u.this.d.remove(obj);
                return true;
            }

            @Override // com.google.common.collect.Sets.k, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean removeAll(Collection<?> collection) {
                u uVar = u.this;
                return u.f(uVar.d, uVar.e, collection);
            }

            @Override // com.google.common.collect.Sets.k, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean retainAll(Collection<?> collection) {
                u uVar = u.this;
                return u.g(uVar.d, uVar.e, collection);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public Object[] toArray() {
                return Lists.newArrayList(iterator()).toArray();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public <T> T[] toArray(T[] tArr) {
                return (T[]) Lists.newArrayList(iterator()).toArray(tArr);
            }
        }

        public u(Map<K, V> map, Predicate<? super Map.Entry<K, V>> predicate) {
            super(map, predicate);
            this.f = Sets.filter(map.entrySet(), this.e);
        }

        public static <K, V> boolean f(Map<K, V> map, Predicate<? super Map.Entry<K, V>> predicate, Collection<?> collection) {
            Iterator<Map.Entry<K, V>> it2 = map.entrySet().iterator();
            boolean z = false;
            while (it2.hasNext()) {
                Map.Entry<K, V> next = it2.next();
                if (predicate.apply(next) && collection.contains(next.getKey())) {
                    it2.remove();
                    z = true;
                }
            }
            return z;
        }

        public static <K, V> boolean g(Map<K, V> map, Predicate<? super Map.Entry<K, V>> predicate, Collection<?> collection) {
            Iterator<Map.Entry<K, V>> it2 = map.entrySet().iterator();
            boolean z = false;
            while (it2.hasNext()) {
                Map.Entry<K, V> next = it2.next();
                if (predicate.apply(next) && !collection.contains(next.getKey())) {
                    it2.remove();
                    z = true;
                }
            }
            return z;
        }

        @Override // com.google.common.collect.Maps.q0
        public Set<Map.Entry<K, V>> a() {
            return new a(this, null);
        }

        @Override // com.google.common.collect.Maps.q0
        /* JADX INFO: renamed from: c */
        public Set<K> h() {
            return new b();
        }
    }

    @GwtIncompatible
    public static class v<K, V> extends com.google.common.collect.i<K, V> {
        private final NavigableMap<K, V> a;
        private final Predicate<? super Map.Entry<K, V>> b;
        private final Map<K, V> c;

        public class a extends d0<K, V> {
            public a(NavigableMap navigableMap) {
                super(navigableMap);
            }

            @Override // com.google.common.collect.Sets.k, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean removeAll(Collection<?> collection) {
                return u.f(v.this.a, v.this.b, collection);
            }

            @Override // com.google.common.collect.Sets.k, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean retainAll(Collection<?> collection) {
                return u.g(v.this.a, v.this.b, collection);
            }
        }

        public v(NavigableMap<K, V> navigableMap, Predicate<? super Map.Entry<K, V>> predicate) {
            this.a = (NavigableMap) Preconditions.checkNotNull(navigableMap);
            this.b = predicate;
            this.c = new u(navigableMap, predicate);
        }

        @Override // com.google.common.collect.Maps.z
        public Iterator<Map.Entry<K, V>> a() {
            return Iterators.filter(this.a.entrySet().iterator(), this.b);
        }

        @Override // com.google.common.collect.i
        public Iterator<Map.Entry<K, V>> c() {
            return Iterators.filter(this.a.descendingMap().entrySet().iterator(), this.b);
        }

        @Override // com.google.common.collect.Maps.z, java.util.AbstractMap, java.util.Map
        public void clear() {
            this.c.clear();
        }

        @Override // java.util.SortedMap
        public Comparator<? super K> comparator() {
            return this.a.comparator();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@NullableDecl Object obj) {
            return this.c.containsKey(obj);
        }

        @Override // com.google.common.collect.i, java.util.NavigableMap
        public NavigableMap<K, V> descendingMap() {
            return Maps.filterEntries((NavigableMap) this.a.descendingMap(), (Predicate) this.b);
        }

        @Override // com.google.common.collect.Maps.z, java.util.AbstractMap, java.util.Map, java.util.SortedMap
        public Set<Map.Entry<K, V>> entrySet() {
            return this.c.entrySet();
        }

        @Override // com.google.common.collect.i, java.util.AbstractMap, java.util.Map
        @NullableDecl
        public V get(@NullableDecl Object obj) {
            return this.c.get(obj);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> headMap(K k, boolean z) {
            return Maps.filterEntries((NavigableMap) this.a.headMap(k, z), (Predicate) this.b);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean isEmpty() {
            return !Iterables.any(this.a.entrySet(), this.b);
        }

        @Override // com.google.common.collect.i, java.util.NavigableMap
        public NavigableSet<K> navigableKeySet() {
            return new a(this);
        }

        @Override // com.google.common.collect.i, java.util.NavigableMap
        public Map.Entry<K, V> pollFirstEntry() {
            return (Map.Entry) Iterables.c(this.a.entrySet(), this.b);
        }

        @Override // com.google.common.collect.i, java.util.NavigableMap
        public Map.Entry<K, V> pollLastEntry() {
            return (Map.Entry) Iterables.c(this.a.descendingMap().entrySet(), this.b);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V put(K k, V v) {
            return this.c.put(k, v);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void putAll(Map<? extends K, ? extends V> map) {
            this.c.putAll(map);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V remove(@NullableDecl Object obj) {
            return this.c.remove(obj);
        }

        @Override // com.google.common.collect.Maps.z, java.util.AbstractMap, java.util.Map
        public int size() {
            return this.c.size();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> subMap(K k, boolean z, K k2, boolean z2) {
            return Maps.filterEntries((NavigableMap) this.a.subMap(k, z, k2, z2), (Predicate) this.b);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> tailMap(K k, boolean z) {
            return Maps.filterEntries((NavigableMap) this.a.tailMap(k, z), (Predicate) this.b);
        }

        @Override // java.util.AbstractMap, java.util.Map, java.util.SortedMap
        public Collection<V> values() {
            return new y(this, this.a, this.b);
        }
    }

    public static class w<K, V> extends u<K, V> implements SortedMap<K, V> {

        public class a extends u<K, V>.b implements SortedSet<K> {
            public a() {
                super();
            }

            @Override // java.util.SortedSet
            public Comparator<? super K> comparator() {
                return w.this.j().comparator();
            }

            @Override // java.util.SortedSet
            public K first() {
                return (K) w.this.firstKey();
            }

            @Override // java.util.SortedSet
            public SortedSet<K> headSet(K k) {
                return (SortedSet) w.this.headMap(k).keySet();
            }

            @Override // java.util.SortedSet
            public K last() {
                return (K) w.this.lastKey();
            }

            @Override // java.util.SortedSet
            public SortedSet<K> subSet(K k, K k2) {
                return (SortedSet) w.this.subMap(k, k2).keySet();
            }

            @Override // java.util.SortedSet
            public SortedSet<K> tailSet(K k) {
                return (SortedSet) w.this.tailMap(k).keySet();
            }
        }

        public w(SortedMap<K, V> sortedMap, Predicate<? super Map.Entry<K, V>> predicate) {
            super(sortedMap, predicate);
        }

        @Override // java.util.SortedMap
        public Comparator<? super K> comparator() {
            return j().comparator();
        }

        @Override // java.util.SortedMap
        public K firstKey() {
            return keySet().iterator().next();
        }

        @Override // com.google.common.collect.Maps.u, com.google.common.collect.Maps.q0
        public SortedSet<K> h() {
            return new a();
        }

        @Override // java.util.SortedMap
        public SortedMap<K, V> headMap(K k) {
            return new w(j().headMap(k), this.e);
        }

        @Override // com.google.common.collect.Maps.q0, java.util.AbstractMap, java.util.Map, java.util.SortedMap
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public SortedSet<K> keySet() {
            return (SortedSet) super.keySet();
        }

        public SortedMap<K, V> j() {
            return (SortedMap) this.d;
        }

        @Override // java.util.SortedMap
        public K lastKey() {
            SortedMap<K, V> sortedMapJ = j();
            while (true) {
                K kLastKey = sortedMapJ.lastKey();
                if (e(kLastKey, this.d.get(kLastKey))) {
                    return kLastKey;
                }
                sortedMapJ = j().headMap(kLastKey);
            }
        }

        @Override // java.util.SortedMap
        public SortedMap<K, V> subMap(K k, K k2) {
            return new w(j().subMap(k, k2), this.e);
        }

        @Override // java.util.SortedMap
        public SortedMap<K, V> tailMap(K k) {
            return new w(j().tailMap(k), this.e);
        }
    }

    public static class x<K, V> extends n<K, V> {
        public final Predicate<? super K> f;

        public x(Map<K, V> map, Predicate<? super K> predicate, Predicate<? super Map.Entry<K, V>> predicate2) {
            super(map, predicate2);
            this.f = predicate;
        }

        @Override // com.google.common.collect.Maps.q0
        public Set<Map.Entry<K, V>> a() {
            return Sets.filter(this.d.entrySet(), this.e);
        }

        @Override // com.google.common.collect.Maps.q0
        /* JADX INFO: renamed from: c */
        public Set<K> h() {
            return Sets.filter(this.d.keySet(), this.f);
        }

        @Override // com.google.common.collect.Maps.n, java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return this.d.containsKey(obj) && this.f.apply(obj);
        }
    }

    public static final class y<K, V> extends p0<K, V> {
        public final Map<K, V> b;
        public final Predicate<? super Map.Entry<K, V>> c;

        public y(Map<K, V> map, Map<K, V> map2, Predicate<? super Map.Entry<K, V>> predicate) {
            super(map);
            this.b = map2;
            this.c = predicate;
        }

        @Override // com.google.common.collect.Maps.p0, java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            Iterator<Map.Entry<K, V>> it2 = this.b.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry<K, V> next = it2.next();
                if (this.c.apply(next) && Objects.equal(next.getValue(), obj)) {
                    it2.remove();
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.common.collect.Maps.p0, java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            Iterator<Map.Entry<K, V>> it2 = this.b.entrySet().iterator();
            boolean z = false;
            while (it2.hasNext()) {
                Map.Entry<K, V> next = it2.next();
                if (this.c.apply(next) && collection.contains(next.getValue())) {
                    it2.remove();
                    z = true;
                }
            }
            return z;
        }

        @Override // com.google.common.collect.Maps.p0, java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            Iterator<Map.Entry<K, V>> it2 = this.b.entrySet().iterator();
            boolean z = false;
            while (it2.hasNext()) {
                Map.Entry<K, V> next = it2.next();
                if (this.c.apply(next) && !collection.contains(next.getValue())) {
                    it2.remove();
                    z = true;
                }
            }
            return z;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public Object[] toArray() {
            return Lists.newArrayList(iterator()).toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) Lists.newArrayList(iterator()).toArray(tArr);
        }
    }

    public static abstract class z<K, V> extends AbstractMap<K, V> {

        public class a extends s<K, V> {
            public a() {
            }

            @Override // com.google.common.collect.Maps.s
            public Map<K, V> d() {
                return z.this;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, V>> iterator() {
                return z.this.a();
            }
        }

        public abstract Iterator<Map.Entry<K, V>> a();

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            Iterators.c(a());
        }

        @Override // java.util.AbstractMap, java.util.Map, java.util.SortedMap
        public Set<Map.Entry<K, V>> entrySet() {
            return new a();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public abstract int size();
    }

    private Maps() {
    }

    public static <K, V> void A(Map<K, V> map, Map<? extends K, ? extends V> map2) {
        for (Map.Entry<? extends K, ? extends V> entry : map2.entrySet()) {
            map.put(entry.getKey(), entry.getValue());
        }
    }

    public static <K, V> boolean B(Collection<Map.Entry<K, V>> collection, Object obj) {
        if (obj instanceof Map.Entry) {
            return collection.remove(K((Map.Entry) obj));
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @GwtIncompatible
    public static <E> NavigableSet<E> C(NavigableSet<E> navigableSet) {
        return new j(navigableSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> Set<E> D(Set<E> set) {
        return new h(set);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> SortedSet<E> E(SortedSet<E> sortedSet) {
        return new i(sortedSet);
    }

    public static boolean F(Map<?, ?> map, Object obj) {
        Preconditions.checkNotNull(map);
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public static <V> V G(Map<?, V> map, @NullableDecl Object obj) {
        Preconditions.checkNotNull(map);
        try {
            return map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    public static <V> V H(Map<?, V> map, Object obj) {
        Preconditions.checkNotNull(map);
        try {
            return map.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    public static String I(Map<?, ?> map) {
        StringBuilder sbF = Collections2.f(map.size());
        sbF.append('{');
        boolean z2 = true;
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            if (!z2) {
                sbF.append(", ");
            }
            z2 = false;
            sbF.append(entry.getKey());
            sbF.append(com.alipay.sdk.m.n.a.h);
            sbF.append(entry.getValue());
        }
        sbF.append('}');
        return sbF.toString();
    }

    public static <V2, K, V1> Map.Entry<K, V2> J(EntryTransformer<? super K, ? super V1, V2> entryTransformer, Map.Entry<K, V1> entry) {
        Preconditions.checkNotNull(entryTransformer);
        Preconditions.checkNotNull(entry);
        return new c(entry, entryTransformer);
    }

    public static <K, V> Map.Entry<K, V> K(Map.Entry<? extends K, ? extends V> entry) {
        Preconditions.checkNotNull(entry);
        return new k(entry);
    }

    public static <K, V> UnmodifiableIterator<Map.Entry<K, V>> L(Iterator<Map.Entry<K, V>> it2) {
        return new l(it2);
    }

    public static <K, V> Set<Map.Entry<K, V>> M(Set<Map.Entry<K, V>> set) {
        return new m0(Collections.unmodifiableSet(set));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <K, V> Map<K, V> N(Map<K, ? extends V> map) {
        return map instanceof SortedMap ? Collections.unmodifiableSortedMap((SortedMap) map) : Collections.unmodifiableMap(map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NullableDecl
    public static <K, V> Map.Entry<K, V> O(@NullableDecl Map.Entry<K, ? extends V> entry) {
        if (entry == null) {
            return null;
        }
        return K(entry);
    }

    public static <V> Function<Map.Entry<?, V>, V> P() {
        return r.VALUE;
    }

    public static <K, V> Iterator<V> Q(Iterator<Map.Entry<K, V>> it2) {
        return new f(it2);
    }

    @NullableDecl
    public static <V> V R(@NullableDecl Map.Entry<?, V> entry) {
        if (entry == null) {
            return null;
        }
        return entry.getValue();
    }

    public static <V> Predicate<Map.Entry<?, V>> S(Predicate<? super V> predicate) {
        return Predicates.compose(predicate, P());
    }

    @Beta
    public static <A, B> Converter<A, B> asConverter(BiMap<A, B> biMap) {
        return new p(biMap);
    }

    public static <K, V> Map<K, V> asMap(Set<K> set, Function<? super K, V> function) {
        return new o(set, function);
    }

    public static <K, V> MapDifference<K, V> difference(Map<? extends K, ? extends V> map, Map<? extends K, ? extends V> map2) {
        return map instanceof SortedMap ? difference((SortedMap) map, (Map) map2) : difference(map, map2, Equivalence.equals());
    }

    public static <K, V1, V2> Function<Map.Entry<K, V1>, Map.Entry<K, V2>> f(EntryTransformer<? super K, ? super V1, V2> entryTransformer) {
        Preconditions.checkNotNull(entryTransformer);
        return new d(entryTransformer);
    }

    public static <K, V> Map<K, V> filterEntries(Map<K, V> map, Predicate<? super Map.Entry<K, V>> predicate) {
        Preconditions.checkNotNull(predicate);
        return map instanceof n ? r((n) map, predicate) : new u((Map) Preconditions.checkNotNull(map), predicate);
    }

    public static <K, V> Map<K, V> filterKeys(Map<K, V> map, Predicate<? super K> predicate) {
        Preconditions.checkNotNull(predicate);
        Predicate predicateY = y(predicate);
        return map instanceof n ? r((n) map, predicateY) : new x((Map) Preconditions.checkNotNull(map), predicate, predicateY);
    }

    public static <K, V> Map<K, V> filterValues(Map<K, V> map, Predicate<? super V> predicate) {
        return filterEntries(map, S(predicate));
    }

    @GwtIncompatible
    public static ImmutableMap<String, String> fromProperties(Properties properties) {
        ImmutableMap.Builder builder = ImmutableMap.builder();
        Enumeration<?> enumerationPropertyNames = properties.propertyNames();
        while (enumerationPropertyNames.hasMoreElements()) {
            String str = (String) enumerationPropertyNames.nextElement();
            builder.put(str, properties.getProperty(str));
        }
        return builder.build();
    }

    public static <K, V1, V2> Function<Map.Entry<K, V1>, V2> g(EntryTransformer<? super K, ? super V1, V2> entryTransformer) {
        Preconditions.checkNotNull(entryTransformer);
        return new b(entryTransformer);
    }

    public static <K, V1, V2> EntryTransformer<K, V1, V2> h(Function<? super V1, V2> function) {
        Preconditions.checkNotNull(function);
        return new m(function);
    }

    public static <K, V> Iterator<Map.Entry<K, V>> i(Set<K> set, Function<? super K, V> function) {
        return new g(set.iterator(), function);
    }

    @GwtCompatible(serializable = true)
    public static <K, V> Map.Entry<K, V> immutableEntry(@NullableDecl K k2, @NullableDecl V v2) {
        return new d1(k2, v2);
    }

    @Beta
    @GwtCompatible(serializable = true)
    public static <K extends Enum<K>, V> ImmutableMap<K, V> immutableEnumMap(Map<K, ? extends V> map) {
        if (map instanceof e1) {
            return (e1) map;
        }
        Iterator<Map.Entry<K, ? extends V>> it2 = map.entrySet().iterator();
        if (!it2.hasNext()) {
            return ImmutableMap.of();
        }
        Map.Entry<K, ? extends V> next = it2.next();
        K key = next.getKey();
        V value = next.getValue();
        com.google.common.collect.u.a(key, value);
        EnumMap enumMap = new EnumMap(key.getDeclaringClass());
        enumMap.put((Enum) key, (Object) value);
        while (it2.hasNext()) {
            Map.Entry<K, ? extends V> next2 = it2.next();
            K key2 = next2.getKey();
            V value2 = next2.getValue();
            com.google.common.collect.u.a(key2, value2);
            enumMap.put((Enum) key2, (Object) value2);
        }
        return e1.n(enumMap);
    }

    public static <K, V1, V2> Function<V1, V2> j(EntryTransformer<? super K, V1, V2> entryTransformer, K k2) {
        Preconditions.checkNotNull(entryTransformer);
        return new a(entryTransformer, k2);
    }

    public static int k(int i2) {
        if (i2 < 3) {
            com.google.common.collect.u.b(i2, "expectedSize");
            return i2 + 1;
        }
        if (i2 < 1073741824) {
            return (int) ((i2 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static <K, V> boolean l(Collection<Map.Entry<K, V>> collection, Object obj) {
        if (obj instanceof Map.Entry) {
            return collection.contains(K((Map.Entry) obj));
        }
        return false;
    }

    public static boolean m(Map<?, ?> map, @NullableDecl Object obj) {
        return Iterators.contains(w(map.entrySet().iterator()), obj);
    }

    public static boolean n(Map<?, ?> map, @NullableDecl Object obj) {
        return Iterators.contains(Q(map.entrySet().iterator()), obj);
    }

    public static <K, V> ConcurrentMap<K, V> newConcurrentMap() {
        return new ConcurrentHashMap();
    }

    public static <K extends Enum<K>, V> EnumMap<K, V> newEnumMap(Class<K> cls) {
        return new EnumMap<>((Class) Preconditions.checkNotNull(cls));
    }

    public static <K, V> HashMap<K, V> newHashMap() {
        return new HashMap<>();
    }

    public static <K, V> HashMap<K, V> newHashMapWithExpectedSize(int i2) {
        return new HashMap<>(k(i2));
    }

    public static <K, V> IdentityHashMap<K, V> newIdentityHashMap() {
        return new IdentityHashMap<>();
    }

    public static <K, V> LinkedHashMap<K, V> newLinkedHashMap() {
        return new LinkedHashMap<>();
    }

    public static <K, V> LinkedHashMap<K, V> newLinkedHashMapWithExpectedSize(int i2) {
        return new LinkedHashMap<>(k(i2));
    }

    public static <K extends Comparable, V> TreeMap<K, V> newTreeMap() {
        return new TreeMap<>();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <K, V> void o(Map<? extends K, ? extends V> map, Map<? extends K, ? extends V> map2, Equivalence<? super V> equivalence, Map<K, V> map3, Map<K, V> map4, Map<K, V> map5, Map<K, MapDifference.ValueDifference<V>> map6) {
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            K key = entry.getKey();
            V value = entry.getValue();
            if (map2.containsKey(key)) {
                V vRemove = map4.remove(key);
                if (equivalence.equivalent(value, vRemove)) {
                    map5.put(key, value);
                } else {
                    map6.put(key, o0.a(value, vRemove));
                }
            } else {
                map3.put(key, value);
            }
        }
    }

    public static boolean p(Map<?, ?> map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    private static <K, V> BiMap<K, V> q(t<K, V> tVar, Predicate<? super Map.Entry<K, V>> predicate) {
        return new t(tVar.i(), Predicates.and(tVar.e, predicate));
    }

    private static <K, V> Map<K, V> r(n<K, V> nVar, Predicate<? super Map.Entry<K, V>> predicate) {
        return new u(nVar.d, Predicates.and(nVar.e, predicate));
    }

    @GwtIncompatible
    private static <K, V> NavigableMap<K, V> s(v<K, V> vVar, Predicate<? super Map.Entry<K, V>> predicate) {
        return new v(((v) vVar).a, Predicates.and(((v) vVar).b, predicate));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Beta
    @GwtIncompatible
    public static <K extends Comparable<? super K>, V> NavigableMap<K, V> subMap(NavigableMap<K, V> navigableMap, Range<K> range) {
        if (navigableMap.comparator() != null && navigableMap.comparator() != Ordering.natural() && range.hasLowerBound() && range.hasUpperBound()) {
            Preconditions.checkArgument(navigableMap.comparator().compare(range.lowerEndpoint(), range.upperEndpoint()) <= 0, "map is using a custom comparator which is inconsistent with the natural ordering.");
        }
        if (range.hasLowerBound() && range.hasUpperBound()) {
            Comparable comparableLowerEndpoint = range.lowerEndpoint();
            BoundType boundTypeLowerBoundType = range.lowerBoundType();
            BoundType boundType = BoundType.CLOSED;
            return navigableMap.subMap(comparableLowerEndpoint, boundTypeLowerBoundType == boundType, range.upperEndpoint(), range.upperBoundType() == boundType);
        }
        if (range.hasLowerBound()) {
            return navigableMap.tailMap(range.lowerEndpoint(), range.lowerBoundType() == BoundType.CLOSED);
        }
        if (range.hasUpperBound()) {
            return navigableMap.headMap(range.upperEndpoint(), range.upperBoundType() == BoundType.CLOSED);
        }
        return (NavigableMap) Preconditions.checkNotNull(navigableMap);
    }

    public static <K, V> BiMap<K, V> synchronizedBiMap(BiMap<K, V> biMap) {
        return v2.g(biMap, null);
    }

    @GwtIncompatible
    public static <K, V> NavigableMap<K, V> synchronizedNavigableMap(NavigableMap<K, V> navigableMap) {
        return v2.o(navigableMap);
    }

    private static <K, V> SortedMap<K, V> t(w<K, V> wVar, Predicate<? super Map.Entry<K, V>> predicate) {
        return new w(wVar.j(), Predicates.and(wVar.e, predicate));
    }

    public static <K, V> ImmutableMap<K, V> toMap(Iterable<K> iterable, Function<? super K, V> function) {
        return toMap(iterable.iterator(), function);
    }

    public static <K, V1, V2> Map<K, V2> transformEntries(Map<K, V1> map, EntryTransformer<? super K, ? super V1, V2> entryTransformer) {
        return new h0(map, entryTransformer);
    }

    public static <K, V1, V2> Map<K, V2> transformValues(Map<K, V1> map, Function<? super V1, V2> function) {
        return transformEntries(map, h(function));
    }

    public static <E> ImmutableMap<E, Integer> u(Collection<E> collection) {
        ImmutableMap.Builder builder = new ImmutableMap.Builder(collection.size());
        Iterator<E> it2 = collection.iterator();
        int i2 = 0;
        while (it2.hasNext()) {
            builder.put(it2.next(), Integer.valueOf(i2));
            i2++;
        }
        return builder.build();
    }

    @CanIgnoreReturnValue
    public static <K, V> ImmutableMap<K, V> uniqueIndex(Iterable<V> iterable, Function<? super V, K> function) {
        return uniqueIndex(iterable.iterator(), function);
    }

    public static <K, V> BiMap<K, V> unmodifiableBiMap(BiMap<? extends K, ? extends V> biMap) {
        return new k0(biMap, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @GwtIncompatible
    public static <K, V> NavigableMap<K, V> unmodifiableNavigableMap(NavigableMap<K, ? extends V> navigableMap) {
        Preconditions.checkNotNull(navigableMap);
        return navigableMap instanceof n0 ? navigableMap : new n0(navigableMap);
    }

    public static <K> Function<Map.Entry<K, ?>, K> v() {
        return r.KEY;
    }

    public static <K, V> Iterator<K> w(Iterator<Map.Entry<K, V>> it2) {
        return new e(it2);
    }

    @NullableDecl
    public static <K> K x(@NullableDecl Map.Entry<K, ?> entry) {
        if (entry == null) {
            return null;
        }
        return entry.getKey();
    }

    public static <K> Predicate<Map.Entry<K, ?>> y(Predicate<? super K> predicate) {
        return Predicates.compose(predicate, v());
    }

    public static <E> Comparator<? super E> z(@NullableDecl Comparator<? super E> comparator) {
        return comparator != null ? comparator : Ordering.natural();
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    public static class h<E> extends ForwardingSet<E> {
        public final /* synthetic */ Set a;

        public h(Set set) {
            this.a = set;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Queue
        public boolean add(E e) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection
        public boolean addAll(Collection<? extends E> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public Set<E> delegate() {
            return this.a;
        }
    }

    public static <K, V> SortedMap<K, V> asMap(SortedSet<K> sortedSet, Function<? super K, V> function) {
        return new e0(sortedSet, function);
    }

    public static <K, V> SortedMap<K, V> filterValues(SortedMap<K, V> sortedMap, Predicate<? super V> predicate) {
        return filterEntries((SortedMap) sortedMap, S(predicate));
    }

    public static <K extends Enum<K>, V> EnumMap<K, V> newEnumMap(Map<K, ? extends V> map) {
        return new EnumMap<>(map);
    }

    public static <K, V> HashMap<K, V> newHashMap(Map<? extends K, ? extends V> map) {
        return new HashMap<>(map);
    }

    public static <K, V> LinkedHashMap<K, V> newLinkedHashMap(Map<? extends K, ? extends V> map) {
        return new LinkedHashMap<>(map);
    }

    public static <K, V> TreeMap<K, V> newTreeMap(SortedMap<K, ? extends V> sortedMap) {
        return new TreeMap<>((SortedMap) sortedMap);
    }

    public static <K, V> ImmutableMap<K, V> toMap(Iterator<K> it2, Function<? super K, V> function) {
        Preconditions.checkNotNull(function);
        LinkedHashMap linkedHashMapNewLinkedHashMap = newLinkedHashMap();
        while (it2.hasNext()) {
            K next = it2.next();
            linkedHashMapNewLinkedHashMap.put(next, function.apply(next));
        }
        return ImmutableMap.copyOf((Map) linkedHashMapNewLinkedHashMap);
    }

    public static <K, V1, V2> SortedMap<K, V2> transformEntries(SortedMap<K, V1> sortedMap, EntryTransformer<? super K, ? super V1, V2> entryTransformer) {
        return new j0(sortedMap, entryTransformer);
    }

    public static <K, V1, V2> SortedMap<K, V2> transformValues(SortedMap<K, V1> sortedMap, Function<? super V1, V2> function) {
        return transformEntries((SortedMap) sortedMap, h(function));
    }

    @CanIgnoreReturnValue
    public static <K, V> ImmutableMap<K, V> uniqueIndex(Iterator<V> it2, Function<? super V, K> function) {
        Preconditions.checkNotNull(function);
        ImmutableMap.Builder builder = ImmutableMap.builder();
        while (it2.hasNext()) {
            V next = it2.next();
            builder.put(function.apply(next), next);
        }
        try {
            return builder.build();
        } catch (IllegalArgumentException e2) {
            throw new IllegalArgumentException(e2.getMessage() + ". To index multiple values under a key, use Multimaps.index.");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    public static class i<E> extends ForwardingSortedSet<E> {
        public final /* synthetic */ SortedSet a;

        public i(SortedSet sortedSet) {
            this.a = sortedSet;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Queue
        public boolean add(E e) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection
        public boolean addAll(Collection<? extends E> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
        public SortedSet<E> headSet(E e) {
            return Maps.E(super.headSet(e));
        }

        @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
        public SortedSet<E> subSet(E e, E e2) {
            return Maps.E(super.subSet(e, e2));
        }

        @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
        public SortedSet<E> tailSet(E e) {
            return Maps.E(super.tailSet(e));
        }

        @Override // com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public SortedSet<E> delegate() {
            return this.a;
        }
    }

    @GwtIncompatible
    public static <K, V> NavigableMap<K, V> asMap(NavigableSet<K> navigableSet, Function<? super K, V> function) {
        return new c0(navigableSet, function);
    }

    @GwtIncompatible
    public static <K, V> NavigableMap<K, V> filterValues(NavigableMap<K, V> navigableMap, Predicate<? super V> predicate) {
        return filterEntries((NavigableMap) navigableMap, S(predicate));
    }

    public static <C, K extends C, V> TreeMap<K, V> newTreeMap(@NullableDecl Comparator<C> comparator) {
        return new TreeMap<>(comparator);
    }

    @GwtIncompatible
    public static <K, V1, V2> NavigableMap<K, V2> transformEntries(NavigableMap<K, V1> navigableMap, EntryTransformer<? super K, ? super V1, V2> entryTransformer) {
        return new i0(navigableMap, entryTransformer);
    }

    @GwtIncompatible
    public static <K, V1, V2> NavigableMap<K, V2> transformValues(NavigableMap<K, V1> navigableMap, Function<? super V1, V2> function) {
        return transformEntries((NavigableMap) navigableMap, h(function));
    }

    public static <K, V> BiMap<K, V> filterValues(BiMap<K, V> biMap, Predicate<? super V> predicate) {
        return filterEntries((BiMap) biMap, S(predicate));
    }

    public static <K, V> MapDifference<K, V> difference(Map<? extends K, ? extends V> map, Map<? extends K, ? extends V> map2, Equivalence<? super V> equivalence) {
        Preconditions.checkNotNull(equivalence);
        LinkedHashMap linkedHashMapNewLinkedHashMap = newLinkedHashMap();
        LinkedHashMap linkedHashMap = new LinkedHashMap(map2);
        LinkedHashMap linkedHashMapNewLinkedHashMap2 = newLinkedHashMap();
        LinkedHashMap linkedHashMapNewLinkedHashMap3 = newLinkedHashMap();
        o(map, map2, equivalence, linkedHashMapNewLinkedHashMap, linkedHashMap, linkedHashMapNewLinkedHashMap2, linkedHashMapNewLinkedHashMap3);
        return new b0(linkedHashMapNewLinkedHashMap, linkedHashMap, linkedHashMapNewLinkedHashMap2, linkedHashMapNewLinkedHashMap3);
    }

    public static <K, V> SortedMap<K, V> filterEntries(SortedMap<K, V> sortedMap, Predicate<? super Map.Entry<K, V>> predicate) {
        Preconditions.checkNotNull(predicate);
        if (sortedMap instanceof w) {
            return t((w) sortedMap, predicate);
        }
        return new w((SortedMap) Preconditions.checkNotNull(sortedMap), predicate);
    }

    public static <K, V> SortedMap<K, V> filterKeys(SortedMap<K, V> sortedMap, Predicate<? super K> predicate) {
        return filterEntries((SortedMap) sortedMap, y(predicate));
    }

    @GwtIncompatible
    public static <K, V> NavigableMap<K, V> filterKeys(NavigableMap<K, V> navigableMap, Predicate<? super K> predicate) {
        return filterEntries((NavigableMap) navigableMap, y(predicate));
    }

    public static <K, V> BiMap<K, V> filterKeys(BiMap<K, V> biMap, Predicate<? super K> predicate) {
        Preconditions.checkNotNull(predicate);
        return filterEntries((BiMap) biMap, y(predicate));
    }

    @GwtIncompatible
    public static <K, V> NavigableMap<K, V> filterEntries(NavigableMap<K, V> navigableMap, Predicate<? super Map.Entry<K, V>> predicate) {
        Preconditions.checkNotNull(predicate);
        if (navigableMap instanceof v) {
            return s((v) navigableMap, predicate);
        }
        return new v((NavigableMap) Preconditions.checkNotNull(navigableMap), predicate);
    }

    public static <K, V> SortedMapDifference<K, V> difference(SortedMap<K, ? extends V> sortedMap, Map<? extends K, ? extends V> map) {
        Preconditions.checkNotNull(sortedMap);
        Preconditions.checkNotNull(map);
        Comparator comparatorZ = z(sortedMap.comparator());
        TreeMap treeMapNewTreeMap = newTreeMap(comparatorZ);
        TreeMap treeMapNewTreeMap2 = newTreeMap(comparatorZ);
        treeMapNewTreeMap2.putAll(map);
        TreeMap treeMapNewTreeMap3 = newTreeMap(comparatorZ);
        TreeMap treeMapNewTreeMap4 = newTreeMap(comparatorZ);
        o(sortedMap, map, Equivalence.equals(), treeMapNewTreeMap, treeMapNewTreeMap2, treeMapNewTreeMap3, treeMapNewTreeMap4);
        return new g0(treeMapNewTreeMap, treeMapNewTreeMap2, treeMapNewTreeMap3, treeMapNewTreeMap4);
    }

    public static <K, V> BiMap<K, V> filterEntries(BiMap<K, V> biMap, Predicate<? super Map.Entry<K, V>> predicate) {
        Preconditions.checkNotNull(biMap);
        Preconditions.checkNotNull(predicate);
        return biMap instanceof t ? q((t) biMap, predicate) : new t(biMap, predicate);
    }
}
