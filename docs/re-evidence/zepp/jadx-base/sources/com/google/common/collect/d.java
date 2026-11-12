package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible
abstract class d<K, V> extends com.google.common.collect.g<K, V> implements Serializable {
    private static final long serialVersionUID = 2447537837011683357L;
    private transient Map<K, Collection<V>> f;
    private transient int g;

    public class a extends d<K, V>.AbstractC0195d<V> {
        public a() {
            super();
        }

        @Override // com.google.common.collect.d.AbstractC0195d
        public V a(K k, V v) {
            return v;
        }
    }

    public class b extends d<K, V>.AbstractC0195d<Map.Entry<K, V>> {
        public b() {
            super();
        }

        @Override // com.google.common.collect.d.AbstractC0195d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> a(K k, V v) {
            return Maps.immutableEntry(k, v);
        }
    }

    public class c extends Maps.q0<K, Collection<V>> {
        public final transient Map<K, Collection<V>> d;

        public class a extends Maps.s<K, Collection<V>> {
            public a() {
            }

            @Override // com.google.common.collect.Maps.s, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
                return Collections2.g(c.this.d.entrySet(), obj);
            }

            @Override // com.google.common.collect.Maps.s
            public Map<K, Collection<V>> d() {
                return c.this;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, Collection<V>>> iterator() {
                return c.this.new b();
            }

            @Override // com.google.common.collect.Maps.s, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
                if (!contains(obj)) {
                    return false;
                }
                d.this.A(((Map.Entry) obj).getKey());
                return true;
            }
        }

        public class b implements Iterator<Map.Entry<K, Collection<V>>> {
            public final Iterator<Map.Entry<K, Collection<V>>> a;

            @NullableDecl
            public Collection<V> b;

            public b() {
                this.a = c.this.d.entrySet().iterator();
            }

            @Override // java.util.Iterator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, Collection<V>> next() {
                Map.Entry<K, Collection<V>> next = this.a.next();
                this.b = next.getValue();
                return c.this.g(next);
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.a.hasNext();
            }

            @Override // java.util.Iterator
            public void remove() {
                u.e(this.b != null);
                this.a.remove();
                d.this.g -= this.b.size();
                this.b.clear();
                this.b = null;
            }
        }

        public c(Map<K, Collection<V>> map) {
            this.d = map;
        }

        @Override // com.google.common.collect.Maps.q0
        public Set<Map.Entry<K, Collection<V>>> a() {
            return new a();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            if (this.d == d.this.f) {
                d.this.clear();
            } else {
                Iterators.c(new b());
            }
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return Maps.F(this.d, obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Collection<V> get(Object obj) {
            Collection<V> collection = (Collection) Maps.G(this.d, obj);
            if (collection == null) {
                return null;
            }
            return d.this.D(obj, collection);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean equals(@NullableDecl Object obj) {
            return this == obj || this.d.equals(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Collection<V> remove(Object obj) {
            Collection<V> collectionRemove = this.d.remove(obj);
            if (collectionRemove == null) {
                return null;
            }
            Collection<V> collectionT = d.this.t();
            collectionT.addAll(collectionRemove);
            d.this.g -= collectionRemove.size();
            collectionRemove.clear();
            return collectionT;
        }

        public Map.Entry<K, Collection<V>> g(Map.Entry<K, Collection<V>> entry) {
            K key = entry.getKey();
            return Maps.immutableEntry(key, d.this.D(key, entry.getValue()));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int hashCode() {
            return this.d.hashCode();
        }

        @Override // com.google.common.collect.Maps.q0, java.util.AbstractMap, java.util.Map, java.util.SortedMap
        public Set<K> keySet() {
            return d.this.keySet();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return this.d.size();
        }

        @Override // java.util.AbstractMap
        public String toString() {
            return this.d.toString();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.d$d, reason: collision with other inner class name */
    public abstract class AbstractC0195d<T> implements Iterator<T> {
        public final Iterator<Map.Entry<K, Collection<V>>> a;

        @NullableDecl
        public K b = null;

        @MonotonicNonNullDecl
        public Collection<V> c = null;
        public Iterator<V> d = Iterators.h();

        public AbstractC0195d() {
            this.a = d.this.f.entrySet().iterator();
        }

        public abstract T a(K k, V v);

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.a.hasNext() || this.d.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            if (!this.d.hasNext()) {
                Map.Entry<K, Collection<V>> next = this.a.next();
                this.b = next.getKey();
                Collection<V> value = next.getValue();
                this.c = value;
                this.d = value.iterator();
            }
            return a(this.b, this.d.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            this.d.remove();
            if (this.c.isEmpty()) {
                this.a.remove();
            }
            d.q(d.this);
        }
    }

    public class e extends Maps.a0<K, Collection<V>> {

        public class a implements Iterator<K> {

            @NullableDecl
            public Map.Entry<K, Collection<V>> a;
            public final /* synthetic */ Iterator b;

            public a(Iterator it2) {
                this.b = it2;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.b.hasNext();
            }

            @Override // java.util.Iterator
            public K next() {
                Map.Entry<K, Collection<V>> entry = (Map.Entry) this.b.next();
                this.a = entry;
                return entry.getKey();
            }

            @Override // java.util.Iterator
            public void remove() {
                u.e(this.a != null);
                Collection<V> value = this.a.getValue();
                this.b.remove();
                d.this.g -= value.size();
                value.clear();
                this.a = null;
            }
        }

        public e(Map<K, Collection<V>> map) {
            super(map);
        }

        @Override // com.google.common.collect.Maps.a0, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            Iterators.c(iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            return f().keySet().containsAll(collection);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public boolean equals(@NullableDecl Object obj) {
            return this == obj || f().keySet().equals(obj);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public int hashCode() {
            return f().keySet().hashCode();
        }

        @Override // com.google.common.collect.Maps.a0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new a(f().entrySet().iterator());
        }

        @Override // com.google.common.collect.Maps.a0, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            int size;
            Collection<V> collectionRemove = f().remove(obj);
            if (collectionRemove != null) {
                size = collectionRemove.size();
                collectionRemove.clear();
                d.this.g -= size;
            } else {
                size = 0;
            }
            return size > 0;
        }
    }

    public class f extends d<K, V>.i implements NavigableMap<K, Collection<V>> {
        public f(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> ceilingEntry(K k) {
            Map.Entry<K, Collection<V>> entryCeilingEntry = j().ceilingEntry(k);
            if (entryCeilingEntry == null) {
                return null;
            }
            return g(entryCeilingEntry);
        }

        @Override // java.util.NavigableMap
        public K ceilingKey(K k) {
            return j().ceilingKey(k);
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> descendingKeySet() {
            return descendingMap().navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> descendingMap() {
            return new f(j().descendingMap());
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> firstEntry() {
            Map.Entry<K, Collection<V>> entryFirstEntry = j().firstEntry();
            if (entryFirstEntry == null) {
                return null;
            }
            return g(entryFirstEntry);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> floorEntry(K k) {
            Map.Entry<K, Collection<V>> entryFloorEntry = j().floorEntry(k);
            if (entryFloorEntry == null) {
                return null;
            }
            return g(entryFloorEntry);
        }

        @Override // java.util.NavigableMap
        public K floorKey(K k) {
            return j().floorKey(k);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> higherEntry(K k) {
            Map.Entry<K, Collection<V>> entryHigherEntry = j().higherEntry(k);
            if (entryHigherEntry == null) {
                return null;
            }
            return g(entryHigherEntry);
        }

        @Override // java.util.NavigableMap
        public K higherKey(K k) {
            return j().higherKey(k);
        }

        @Override // com.google.common.collect.d.i
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public NavigableSet<K> h() {
            return new g(j());
        }

        @Override // com.google.common.collect.d.i, java.util.SortedMap, java.util.NavigableMap
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, Collection<V>> headMap(K k) {
            return headMap(k, false);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> lastEntry() {
            Map.Entry<K, Collection<V>> entryLastEntry = j().lastEntry();
            if (entryLastEntry == null) {
                return null;
            }
            return g(entryLastEntry);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> lowerEntry(K k) {
            Map.Entry<K, Collection<V>> entryLowerEntry = j().lowerEntry(k);
            if (entryLowerEntry == null) {
                return null;
            }
            return g(entryLowerEntry);
        }

        @Override // java.util.NavigableMap
        public K lowerKey(K k) {
            return j().lowerKey(k);
        }

        @Override // com.google.common.collect.d.i, com.google.common.collect.d.c, com.google.common.collect.Maps.q0, java.util.AbstractMap, java.util.Map, java.util.SortedMap
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public NavigableSet<K> keySet() {
            return (NavigableSet) super.keySet();
        }

        public Map.Entry<K, Collection<V>> n(Iterator<Map.Entry<K, Collection<V>>> it2) {
            if (!it2.hasNext()) {
                return null;
            }
            Map.Entry<K, Collection<V>> next = it2.next();
            Collection<V> collectionT = d.this.t();
            collectionT.addAll(next.getValue());
            it2.remove();
            return Maps.immutableEntry(next.getKey(), d.this.C(collectionT));
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> navigableKeySet() {
            return i();
        }

        @Override // com.google.common.collect.d.i
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, Collection<V>> j() {
            return (NavigableMap) super.j();
        }

        @Override // com.google.common.collect.d.i, java.util.SortedMap, java.util.NavigableMap
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, Collection<V>> subMap(K k, K k2) {
            return subMap(k, true, k2, false);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> pollFirstEntry() {
            return n(entrySet().iterator());
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> pollLastEntry() {
            return n(descendingMap().entrySet().iterator());
        }

        @Override // com.google.common.collect.d.i, java.util.SortedMap, java.util.NavigableMap
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, Collection<V>> tailMap(K k) {
            return tailMap(k, true);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> headMap(K k, boolean z) {
            return new f(j().headMap(k, z));
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> subMap(K k, boolean z, K k2, boolean z2) {
            return new f(j().subMap(k, z, k2, z2));
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> tailMap(K k, boolean z) {
            return new f(j().tailMap(k, z));
        }
    }

    public class g extends d<K, V>.j implements NavigableSet<K> {
        public g(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        @Override // java.util.NavigableSet
        public K ceiling(K k) {
            return f().ceilingKey(k);
        }

        @Override // java.util.NavigableSet
        public Iterator<K> descendingIterator() {
            return descendingSet().iterator();
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> descendingSet() {
            return new g(f().descendingMap());
        }

        @Override // java.util.NavigableSet
        public K floor(K k) {
            return f().floorKey(k);
        }

        @Override // com.google.common.collect.d.j, java.util.SortedSet, java.util.NavigableSet
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public NavigableSet<K> headSet(K k) {
            return headSet(k, false);
        }

        @Override // com.google.common.collect.d.j
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, Collection<V>> f() {
            return (NavigableMap) super.f();
        }

        @Override // java.util.NavigableSet
        public K higher(K k) {
            return f().higherKey(k);
        }

        @Override // com.google.common.collect.d.j, java.util.SortedSet, java.util.NavigableSet
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public NavigableSet<K> subSet(K k, K k2) {
            return subSet(k, true, k2, false);
        }

        @Override // com.google.common.collect.d.j, java.util.SortedSet, java.util.NavigableSet
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public NavigableSet<K> tailSet(K k) {
            return tailSet(k, true);
        }

        @Override // java.util.NavigableSet
        public K lower(K k) {
            return f().lowerKey(k);
        }

        @Override // java.util.NavigableSet
        public K pollFirst() {
            return (K) Iterators.k(iterator());
        }

        @Override // java.util.NavigableSet
        public K pollLast() {
            return (K) Iterators.k(descendingIterator());
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> headSet(K k, boolean z) {
            return new g(f().headMap(k, z));
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> subSet(K k, boolean z, K k2, boolean z2) {
            return new g(f().subMap(k, z, k2, z2));
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> tailSet(K k, boolean z) {
            return new g(f().tailMap(k, z));
        }
    }

    public class h extends d<K, V>.l implements RandomAccess {
        public h(K k, @NullableDecl List<V> list, d<K, V>.k kVar) {
            super(k, list, kVar);
        }
    }

    public class i extends d<K, V>.c implements SortedMap<K, Collection<V>> {

        @MonotonicNonNullDecl
        public SortedSet<K> f;

        public i(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        @Override // java.util.SortedMap
        public Comparator<? super K> comparator() {
            return j().comparator();
        }

        @Override // java.util.SortedMap
        public K firstKey() {
            return j().firstKey();
        }

        @Override // com.google.common.collect.Maps.q0
        public SortedSet<K> h() {
            return new j(j());
        }

        public SortedMap<K, Collection<V>> headMap(K k) {
            return new i(j().headMap(k));
        }

        @Override // com.google.common.collect.d.c, com.google.common.collect.Maps.q0, java.util.AbstractMap, java.util.Map, java.util.SortedMap
        /* JADX INFO: renamed from: i */
        public SortedSet<K> keySet() {
            SortedSet<K> sortedSet = this.f;
            if (sortedSet != null) {
                return sortedSet;
            }
            SortedSet<K> sortedSetH = h();
            this.f = sortedSetH;
            return sortedSetH;
        }

        public SortedMap<K, Collection<V>> j() {
            return (SortedMap) this.d;
        }

        @Override // java.util.SortedMap
        public K lastKey() {
            return j().lastKey();
        }

        public SortedMap<K, Collection<V>> subMap(K k, K k2) {
            return new i(j().subMap(k, k2));
        }

        public SortedMap<K, Collection<V>> tailMap(K k) {
            return new i(j().tailMap(k));
        }
    }

    public class j extends d<K, V>.e implements SortedSet<K> {
        public j(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        @Override // java.util.SortedSet
        public Comparator<? super K> comparator() {
            return f().comparator();
        }

        public SortedMap<K, Collection<V>> f() {
            return (SortedMap) super.f();
        }

        @Override // java.util.SortedSet
        public K first() {
            return f().firstKey();
        }

        public SortedSet<K> headSet(K k) {
            return new j(f().headMap(k));
        }

        @Override // java.util.SortedSet
        public K last() {
            return f().lastKey();
        }

        public SortedSet<K> subSet(K k, K k2) {
            return new j(f().subMap(k, k2));
        }

        public SortedSet<K> tailSet(K k) {
            return new j(f().tailMap(k));
        }
    }

    public class m extends d<K, V>.o implements NavigableSet<V> {
        public m(K k, @NullableDecl NavigableSet<V> navigableSet, d<K, V>.k kVar) {
            super(k, navigableSet, kVar);
        }

        private NavigableSet<V> i(NavigableSet<V> navigableSet) {
            return new m(this.a, navigableSet, b() == null ? this : b());
        }

        @Override // java.util.NavigableSet
        public V ceiling(V v) {
            return g().ceiling(v);
        }

        @Override // java.util.NavigableSet
        public Iterator<V> descendingIterator() {
            return new k.a(g().descendingIterator());
        }

        @Override // java.util.NavigableSet
        public NavigableSet<V> descendingSet() {
            return i(g().descendingSet());
        }

        @Override // java.util.NavigableSet
        public V floor(V v) {
            return g().floor(v);
        }

        @Override // com.google.common.collect.d.o
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public NavigableSet<V> g() {
            return (NavigableSet) super.g();
        }

        @Override // java.util.NavigableSet
        public NavigableSet<V> headSet(V v, boolean z) {
            return i(g().headSet(v, z));
        }

        @Override // java.util.NavigableSet
        public V higher(V v) {
            return g().higher(v);
        }

        @Override // java.util.NavigableSet
        public V lower(V v) {
            return g().lower(v);
        }

        @Override // java.util.NavigableSet
        public V pollFirst() {
            return (V) Iterators.k(iterator());
        }

        @Override // java.util.NavigableSet
        public V pollLast() {
            return (V) Iterators.k(descendingIterator());
        }

        @Override // java.util.NavigableSet
        public NavigableSet<V> subSet(V v, boolean z, V v2, boolean z2) {
            return i(g().subSet(v, z, v2, z2));
        }

        @Override // java.util.NavigableSet
        public NavigableSet<V> tailSet(V v, boolean z) {
            return i(g().tailSet(v, z));
        }
    }

    public class n extends d<K, V>.k implements Set<V> {
        public n(K k, Set<V> set) {
            super(k, set, null);
        }

        @Override // com.google.common.collect.d.k, java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zD = Sets.d((Set) this.b, collection);
            if (zD) {
                int size2 = this.b.size();
                d.this.g += size2 - size;
                f();
            }
            return zD;
        }
    }

    public class o extends d<K, V>.k implements SortedSet<V> {
        public o(K k, @NullableDecl SortedSet<V> sortedSet, d<K, V>.k kVar) {
            super(k, sortedSet, kVar);
        }

        @Override // java.util.SortedSet
        public Comparator<? super V> comparator() {
            return g().comparator();
        }

        @Override // java.util.SortedSet
        public V first() {
            e();
            return g().first();
        }

        public SortedSet<V> g() {
            return (SortedSet) c();
        }

        @Override // java.util.SortedSet
        public SortedSet<V> headSet(V v) {
            e();
            return new o(d(), g().headSet(v), b() == null ? this : b());
        }

        @Override // java.util.SortedSet
        public V last() {
            e();
            return g().last();
        }

        @Override // java.util.SortedSet
        public SortedSet<V> subSet(V v, V v2) {
            e();
            return new o(d(), g().subSet(v, v2), b() == null ? this : b());
        }

        @Override // java.util.SortedSet
        public SortedSet<V> tailSet(V v) {
            e();
            return new o(d(), g().tailSet(v), b() == null ? this : b());
        }
    }

    public d(Map<K, Collection<V>> map) {
        Preconditions.checkArgument(map.isEmpty());
        this.f = map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A(Object obj) {
        Collection collection = (Collection) Maps.H(this.f, obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            this.g -= size;
        }
    }

    public static /* synthetic */ int p(d dVar) {
        int i2 = dVar.g;
        dVar.g = i2 + 1;
        return i2;
    }

    public static /* synthetic */ int q(d dVar) {
        int i2 = dVar.g;
        dVar.g = i2 - 1;
        return i2;
    }

    private Collection<V> y(@NullableDecl K k2) {
        Collection<V> collection = this.f.get(k2);
        if (collection != null) {
            return collection;
        }
        Collection<V> collectionU = u(k2);
        this.f.put(k2, collectionU);
        return collectionU;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> Iterator<E> z(Collection<E> collection) {
        return collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    public final void B(Map<K, Collection<V>> map) {
        this.f = map;
        this.g = 0;
        for (Collection<V> collection : map.values()) {
            Preconditions.checkArgument(!collection.isEmpty());
            this.g += collection.size();
        }
    }

    public <E> Collection<E> C(Collection<E> collection) {
        return Collections.unmodifiableCollection(collection);
    }

    public Collection<V> D(@NullableDecl K k2, Collection<V> collection) {
        return new k(k2, collection, null);
    }

    public final List<V> E(@NullableDecl K k2, List<V> list, @NullableDecl d<K, V>.k kVar) {
        return list instanceof RandomAccess ? new h(k2, list, kVar) : new l(k2, list, kVar);
    }

    @Override // com.google.common.collect.g
    public Map<K, Collection<V>> b() {
        return new c(this.f);
    }

    @Override // com.google.common.collect.Multimap
    public void clear() {
        Iterator<Collection<V>> it2 = this.f.values().iterator();
        while (it2.hasNext()) {
            it2.next().clear();
        }
        this.f.clear();
        this.g = 0;
    }

    @Override // com.google.common.collect.Multimap
    public boolean containsKey(@NullableDecl Object obj) {
        return this.f.containsKey(obj);
    }

    @Override // com.google.common.collect.g
    public Collection<Map.Entry<K, V>> e() {
        return this instanceof SetMultimap ? new com.google.common.collect.g.b() : new com.google.common.collect.g.a();
    }

    @Override // com.google.common.collect.g, com.google.common.collect.Multimap
    public Collection<Map.Entry<K, V>> entries() {
        return super.entries();
    }

    @Override // com.google.common.collect.g
    public Set<K> f() {
        return new e(this.f);
    }

    @Override // com.google.common.collect.g
    public Multiset<K> g() {
        return new Multimaps.g(this);
    }

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public Collection<V> get(@NullableDecl K k2) {
        Collection<V> collectionU = this.f.get(k2);
        if (collectionU == null) {
            collectionU = u(k2);
        }
        return D(k2, collectionU);
    }

    @Override // com.google.common.collect.g
    public Collection<V> h() {
        return new com.google.common.collect.g.c();
    }

    @Override // com.google.common.collect.g
    public Iterator<Map.Entry<K, V>> i() {
        return new b();
    }

    @Override // com.google.common.collect.g
    public Iterator<V> j() {
        return new a();
    }

    @Override // com.google.common.collect.g, com.google.common.collect.Multimap
    public boolean put(@NullableDecl K k2, @NullableDecl V v) {
        Collection<V> collection = this.f.get(k2);
        if (collection != null) {
            if (!collection.add(v)) {
                return false;
            }
            this.g++;
            return true;
        }
        Collection<V> collectionU = u(k2);
        if (!collectionU.add(v)) {
            throw new AssertionError("New Collection violated the Collection spec");
        }
        this.g++;
        this.f.put(k2, collectionU);
        return true;
    }

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public Collection<V> removeAll(@NullableDecl Object obj) {
        Collection<V> collectionRemove = this.f.remove(obj);
        if (collectionRemove == null) {
            return x();
        }
        Collection collectionT = t();
        collectionT.addAll(collectionRemove);
        this.g -= collectionRemove.size();
        collectionRemove.clear();
        return (Collection<V>) C(collectionT);
    }

    @Override // com.google.common.collect.g, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public Collection<V> replaceValues(@NullableDecl K k2, Iterable<? extends V> iterable) {
        Iterator<? extends V> it2 = iterable.iterator();
        if (!it2.hasNext()) {
            return removeAll(k2);
        }
        Collection<V> collectionY = y(k2);
        Collection<V> collectionT = t();
        collectionT.addAll(collectionY);
        this.g -= collectionY.size();
        collectionY.clear();
        while (it2.hasNext()) {
            if (collectionY.add(it2.next())) {
                this.g++;
            }
        }
        return (Collection<V>) C(collectionT);
    }

    public Map<K, Collection<V>> s() {
        return this.f;
    }

    @Override // com.google.common.collect.Multimap
    public int size() {
        return this.g;
    }

    public abstract Collection<V> t();

    public Collection<V> u(@NullableDecl K k2) {
        return t();
    }

    public final Map<K, Collection<V>> v() {
        Map<K, Collection<V>> map = this.f;
        if (map instanceof NavigableMap) {
            return new f((NavigableMap) this.f);
        }
        return map instanceof SortedMap ? new i((SortedMap) this.f) : new c(this.f);
    }

    @Override // com.google.common.collect.g, com.google.common.collect.Multimap
    public Collection<V> values() {
        return super.values();
    }

    public final Set<K> w() {
        Map<K, Collection<V>> map = this.f;
        if (map instanceof NavigableMap) {
            return new g((NavigableMap) this.f);
        }
        return map instanceof SortedMap ? new j((SortedMap) this.f) : new e(this.f);
    }

    public Collection<V> x() {
        return (Collection<V>) C(t());
    }

    public class k extends AbstractCollection<V> {

        @NullableDecl
        public final K a;
        public Collection<V> b;

        @NullableDecl
        public final d<K, V>.k c;

        @NullableDecl
        public final Collection<V> d;

        public k(K k, @NullableDecl Collection<V> collection, d<K, V>.k kVar) {
            this.a = k;
            this.b = collection;
            this.c = kVar;
            this.d = kVar == null ? null : kVar.c();
        }

        public void a() {
            d<K, V>.k kVar = this.c;
            if (kVar != null) {
                kVar.a();
            } else {
                d.this.f.put(this.a, this.b);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean add(V v) {
            e();
            boolean zIsEmpty = this.b.isEmpty();
            boolean zAdd = this.b.add(v);
            if (zAdd) {
                d.p(d.this);
                if (zIsEmpty) {
                    a();
                }
            }
            return zAdd;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean addAll(Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zAddAll = this.b.addAll(collection);
            if (zAddAll) {
                int size2 = this.b.size();
                d.this.g += size2 - size;
                if (size == 0) {
                    a();
                }
            }
            return zAddAll;
        }

        public d<K, V>.k b() {
            return this.c;
        }

        public Collection<V> c() {
            return this.b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            int size = size();
            if (size == 0) {
                return;
            }
            this.b.clear();
            d.this.g -= size;
            f();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            e();
            return this.b.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            e();
            return this.b.containsAll(collection);
        }

        K d() {
            return this.a;
        }

        public void e() {
            Collection<V> collection;
            d<K, V>.k kVar = this.c;
            if (kVar != null) {
                kVar.e();
                if (this.c.c() != this.d) {
                    throw new ConcurrentModificationException();
                }
            } else {
                if (!this.b.isEmpty() || (collection = (Collection) d.this.f.get(this.a)) == null) {
                    return;
                }
                this.b = collection;
            }
        }

        @Override // java.util.Collection
        public boolean equals(@NullableDecl Object obj) {
            if (obj == this) {
                return true;
            }
            e();
            return this.b.equals(obj);
        }

        public void f() {
            d<K, V>.k kVar = this.c;
            if (kVar != null) {
                kVar.f();
            } else if (this.b.isEmpty()) {
                d.this.f.remove(this.a);
            }
        }

        @Override // java.util.Collection
        public int hashCode() {
            e();
            return this.b.hashCode();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            e();
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            e();
            boolean zRemove = this.b.remove(obj);
            if (zRemove) {
                d.q(d.this);
                f();
            }
            return zRemove;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zRemoveAll = this.b.removeAll(collection);
            if (zRemoveAll) {
                int size2 = this.b.size();
                d.this.g += size2 - size;
                f();
            }
            return zRemoveAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            Preconditions.checkNotNull(collection);
            int size = size();
            boolean zRetainAll = this.b.retainAll(collection);
            if (zRetainAll) {
                int size2 = this.b.size();
                d.this.g += size2 - size;
                f();
            }
            return zRetainAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            e();
            return this.b.size();
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            e();
            return this.b.toString();
        }

        public class a implements Iterator<V> {
            public final Iterator<V> a;
            public final Collection<V> b;

            public a() {
                Collection<V> collection = k.this.b;
                this.b = collection;
                this.a = d.z(collection);
            }

            public Iterator<V> a() {
                b();
                return this.a;
            }

            public void b() {
                k.this.e();
                if (k.this.b != this.b) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                b();
                return this.a.hasNext();
            }

            @Override // java.util.Iterator
            public V next() {
                b();
                return this.a.next();
            }

            @Override // java.util.Iterator
            public void remove() {
                this.a.remove();
                d.q(d.this);
                k.this.f();
            }

            public a(Iterator<V> it2) {
                this.b = k.this.b;
                this.a = it2;
            }
        }
    }

    public class l extends d<K, V>.k implements List<V> {

        public class a extends d<K, V>.k.a implements ListIterator<V> {
            public a() {
                super();
            }

            private ListIterator<V> c() {
                return (ListIterator) a();
            }

            @Override // java.util.ListIterator
            public void add(V v) {
                boolean zIsEmpty = l.this.isEmpty();
                c().add(v);
                d.p(d.this);
                if (zIsEmpty) {
                    l.this.a();
                }
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                return c().hasPrevious();
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                return c().nextIndex();
            }

            @Override // java.util.ListIterator
            public V previous() {
                return c().previous();
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                return c().previousIndex();
            }

            @Override // java.util.ListIterator
            public void set(V v) {
                c().set(v);
            }

            public a(int i) {
                super(l.this.g().listIterator(i));
            }
        }

        public l(K k, @NullableDecl List<V> list, d<K, V>.k kVar) {
            super(k, list, kVar);
        }

        @Override // java.util.List
        public void add(int i, V v) {
            e();
            boolean zIsEmpty = c().isEmpty();
            g().add(i, v);
            d.p(d.this);
            if (zIsEmpty) {
                a();
            }
        }

        @Override // java.util.List
        public boolean addAll(int i, Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zAddAll = g().addAll(i, collection);
            if (zAddAll) {
                int size2 = c().size();
                d.this.g += size2 - size;
                if (size == 0) {
                    a();
                }
            }
            return zAddAll;
        }

        public List<V> g() {
            return (List) c();
        }

        @Override // java.util.List
        public V get(int i) {
            e();
            return g().get(i);
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            e();
            return g().indexOf(obj);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            e();
            return g().lastIndexOf(obj);
        }

        @Override // java.util.List
        public ListIterator<V> listIterator() {
            e();
            return new a();
        }

        @Override // java.util.List
        public V remove(int i) {
            e();
            V vRemove = g().remove(i);
            d.q(d.this);
            f();
            return vRemove;
        }

        @Override // java.util.List
        public V set(int i, V v) {
            e();
            return g().set(i, v);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.List
        public List<V> subList(int i, int i2) {
            e();
            return d.this.E(d(), g().subList(i, i2), b() == null ? this : b());
        }

        @Override // java.util.List
        public ListIterator<V> listIterator(int i) {
            e();
            return new a(i);
        }
    }
}
