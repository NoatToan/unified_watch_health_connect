package com.google.common.collect;

import defpackage.c6i;
import defpackage.d2h;
import defpackage.epd;
import defpackage.m44;
import defpackage.xyl;
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
import java.util.Objects;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes5.dex */
public abstract class b<K, V> extends com.google.common.collect.d<K, V> implements Serializable {
    private static final long serialVersionUID = 2447537837011683357L;
    private transient Map<K, Collection<V>> map;
    private transient int totalSize;

    public class a extends b<K, V>.d<V> {
        public a(b bVar) {
            super();
        }

        @Override // com.google.common.collect.b.d
        public V a(K k2, V v) {
            return v;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.b$b, reason: collision with other inner class name */
    public class C0231b extends b<K, V>.d<Map.Entry<K, V>> {
        public C0231b(b bVar) {
            super();
        }

        @Override // com.google.common.collect.b.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> a(K k2, V v) {
            return s.i(k2, v);
        }
    }

    public class c extends s.r<K, Collection<V>> {
        public final transient Map<K, Collection<V>> d;

        public class a extends s.j<K, Collection<V>> {
            public a() {
            }

            @Override // com.google.common.collect.s.j, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
                return m44.c(c.this.d.entrySet(), obj);
            }

            @Override // com.google.common.collect.s.j
            public Map<K, Collection<V>> i() {
                return c.this;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, Collection<V>>> iterator() {
                return c.this.new C0232b();
            }

            @Override // com.google.common.collect.s.j, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
                if (!contains(obj)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Objects.requireNonNull(entry);
                b.this.removeValuesForKey(entry.getKey());
                return true;
            }
        }

        /* JADX INFO: renamed from: com.google.common.collect.b$c$b, reason: collision with other inner class name */
        public class C0232b implements Iterator<Map.Entry<K, Collection<V>>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Iterator<Map.Entry<K, Collection<V>>> f9148a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public Collection<V> f9149b;

            public C0232b() {
                this.f9148a = c.this.d.entrySet().iterator();
            }

            @Override // java.util.Iterator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, Collection<V>> next() {
                Map.Entry<K, Collection<V>> next = this.f9148a.next();
                this.f9149b = next.getValue();
                return c.this.g(next);
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f9148a.hasNext();
            }

            @Override // java.util.Iterator
            public void remove() {
                c6i.u(this.f9149b != null, "no calls to next() since the last call to remove()");
                this.f9148a.remove();
                b.access$220(b.this, this.f9149b.size());
                this.f9149b.clear();
                this.f9149b = null;
            }
        }

        public c(Map<K, Collection<V>> map) {
            this.d = map;
        }

        @Override // com.google.common.collect.s.r
        public Set<Map.Entry<K, Collection<V>>> a() {
            return new a();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            if (this.d == b.this.map) {
                b.this.clear();
            } else {
                epd.d(new C0232b());
            }
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return s.u(this.d, obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Collection<V> get(Object obj) {
            Collection<V> collection = (Collection) s.v(this.d, obj);
            if (collection == null) {
                return null;
            }
            return b.this.wrapCollection(obj, collection);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean equals(Object obj) {
            return this == obj || this.d.equals(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Collection<V> remove(Object obj) {
            Collection<V> collectionRemove = this.d.remove(obj);
            if (collectionRemove == null) {
                return null;
            }
            Collection<V> collectionCreateCollection = b.this.createCollection();
            collectionCreateCollection.addAll(collectionRemove);
            b.access$220(b.this, collectionRemove.size());
            collectionRemove.clear();
            return collectionCreateCollection;
        }

        public Map.Entry<K, Collection<V>> g(Map.Entry<K, Collection<V>> entry) {
            K key = entry.getKey();
            return s.i(key, b.this.wrapCollection(key, entry.getValue()));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int hashCode() {
            return this.d.hashCode();
        }

        @Override // com.google.common.collect.s.r, java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: keySet */
        public Set<K> l() {
            return b.this.keySet();
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

    public abstract class d<T> implements Iterator<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Iterator<Map.Entry<K, Collection<V>>> f9150a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public K f9151b = null;
        public Collection<V> c = null;
        public Iterator<V> d = epd.j();

        public d() {
            this.f9150a = b.this.map.entrySet().iterator();
        }

        public abstract T a(K k2, V v);

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f9150a.hasNext() || this.d.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            if (!this.d.hasNext()) {
                Map.Entry<K, Collection<V>> next = this.f9150a.next();
                this.f9151b = next.getKey();
                Collection<V> value = next.getValue();
                this.c = value;
                this.d = value.iterator();
            }
            return a(d2h.a(this.f9151b), this.d.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            this.d.remove();
            Collection<V> collection = this.c;
            Objects.requireNonNull(collection);
            if (collection.isEmpty()) {
                this.f9150a.remove();
            }
            b.access$210(b.this);
        }
    }

    public class e extends s.m<K, Collection<V>> {

        public class a implements Iterator<K> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public Map.Entry<K, Collection<V>> f9153a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Iterator f9154b;

            public a(Iterator it) {
                this.f9154b = it;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f9154b.hasNext();
            }

            @Override // java.util.Iterator
            public K next() {
                Map.Entry<K, Collection<V>> entry = (Map.Entry) this.f9154b.next();
                this.f9153a = entry;
                return entry.getKey();
            }

            @Override // java.util.Iterator
            public void remove() {
                c6i.u(this.f9153a != null, "no calls to next() since the last call to remove()");
                Collection<V> value = this.f9153a.getValue();
                this.f9154b.remove();
                b.access$220(b.this, value.size());
                value.clear();
                this.f9153a = null;
            }
        }

        public e(Map<K, Collection<V>> map) {
            super(map);
        }

        @Override // com.google.common.collect.s.m, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            epd.d(iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            return j().keySet().containsAll(collection);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            return this == obj || j().keySet().equals(obj);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public int hashCode() {
            return j().keySet().hashCode();
        }

        @Override // com.google.common.collect.s.m, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new a(j().entrySet().iterator());
        }

        @Override // com.google.common.collect.s.m, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Collection<V> collectionRemove = j().remove(obj);
            if (collectionRemove != null) {
                int size = collectionRemove.size();
                collectionRemove.clear();
                b.access$220(b.this, size);
                if (size > 0) {
                    return true;
                }
            }
            return false;
        }
    }

    public class f extends b<K, V>.i implements NavigableMap<K, Collection<V>> {
        public f(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> ceilingEntry(K k2) {
            Map.Entry<K, Collection<V>> entryCeilingEntry = m().ceilingEntry(k2);
            if (entryCeilingEntry == null) {
                return null;
            }
            return g(entryCeilingEntry);
        }

        @Override // java.util.NavigableMap
        public K ceilingKey(K k2) {
            return m().ceilingKey(k2);
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> descendingKeySet() {
            return descendingMap().navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> descendingMap() {
            return new f(m().descendingMap());
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> firstEntry() {
            Map.Entry<K, Collection<V>> entryFirstEntry = m().firstEntry();
            if (entryFirstEntry == null) {
                return null;
            }
            return g(entryFirstEntry);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> floorEntry(K k2) {
            Map.Entry<K, Collection<V>> entryFloorEntry = m().floorEntry(k2);
            if (entryFloorEntry == null) {
                return null;
            }
            return g(entryFloorEntry);
        }

        @Override // java.util.NavigableMap
        public K floorKey(K k2) {
            return m().floorKey(k2);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> higherEntry(K k2) {
            Map.Entry<K, Collection<V>> entryHigherEntry = m().higherEntry(k2);
            if (entryHigherEntry == null) {
                return null;
            }
            return g(entryHigherEntry);
        }

        @Override // java.util.NavigableMap
        public K higherKey(K k2) {
            return m().higherKey(k2);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> lastEntry() {
            Map.Entry<K, Collection<V>> entryLastEntry = m().lastEntry();
            if (entryLastEntry == null) {
                return null;
            }
            return g(entryLastEntry);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> lowerEntry(K k2) {
            Map.Entry<K, Collection<V>> entryLowerEntry = m().lowerEntry(k2);
            if (entryLowerEntry == null) {
                return null;
            }
            return g(entryLowerEntry);
        }

        @Override // java.util.NavigableMap
        public K lowerKey(K k2) {
            return m().lowerKey(k2);
        }

        @Override // com.google.common.collect.b.i
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public NavigableSet<K> j() {
            return new g(m());
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> navigableKeySet() {
            return keySet();
        }

        @Override // com.google.common.collect.b.i, java.util.SortedMap, java.util.NavigableMap
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, Collection<V>> headMap(K k2) {
            return headMap(k2, false);
        }

        @Override // com.google.common.collect.b.i
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public NavigableSet<K> l() {
            return (NavigableSet) super.l();
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> pollFirstEntry() {
            return q(entrySet().iterator());
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> pollLastEntry() {
            return q(descendingMap().entrySet().iterator());
        }

        public Map.Entry<K, Collection<V>> q(Iterator<Map.Entry<K, Collection<V>>> it) {
            if (!it.hasNext()) {
                return null;
            }
            Map.Entry<K, Collection<V>> next = it.next();
            Collection<V> collectionCreateCollection = b.this.createCollection();
            collectionCreateCollection.addAll(next.getValue());
            it.remove();
            return s.i(next.getKey(), b.this.unmodifiableCollectionSubclass(collectionCreateCollection));
        }

        @Override // com.google.common.collect.b.i
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, Collection<V>> m() {
            return (NavigableMap) super.m();
        }

        @Override // com.google.common.collect.b.i, java.util.SortedMap, java.util.NavigableMap
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, Collection<V>> subMap(K k2, K k3) {
            return subMap(k2, true, k3, false);
        }

        @Override // com.google.common.collect.b.i, java.util.SortedMap, java.util.NavigableMap
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, Collection<V>> tailMap(K k2) {
            return tailMap(k2, true);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> headMap(K k2, boolean z) {
            return new f(m().headMap(k2, z));
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> subMap(K k2, boolean z, K k3, boolean z2) {
            return new f(m().subMap(k2, z, k3, z2));
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> tailMap(K k2, boolean z) {
            return new f(m().tailMap(k2, z));
        }
    }

    public class g extends b<K, V>.j implements NavigableSet<K> {
        public g(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        @Override // java.util.NavigableSet
        public K ceiling(K k2) {
            return j().ceilingKey(k2);
        }

        @Override // java.util.NavigableSet
        public Iterator<K> descendingIterator() {
            return descendingSet().iterator();
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> descendingSet() {
            return new g(j().descendingMap());
        }

        @Override // java.util.NavigableSet
        public K floor(K k2) {
            return j().floorKey(k2);
        }

        @Override // java.util.NavigableSet
        public K higher(K k2) {
            return j().higherKey(k2);
        }

        @Override // com.google.common.collect.b.j, java.util.SortedSet, java.util.NavigableSet
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public NavigableSet<K> headSet(K k2) {
            return headSet(k2, false);
        }

        @Override // com.google.common.collect.b.j
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, Collection<V>> j() {
            return (NavigableMap) super.j();
        }

        @Override // java.util.NavigableSet
        public K lower(K k2) {
            return j().lowerKey(k2);
        }

        @Override // com.google.common.collect.b.j, java.util.SortedSet, java.util.NavigableSet
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public NavigableSet<K> subSet(K k2, K k3) {
            return subSet(k2, true, k3, false);
        }

        @Override // com.google.common.collect.b.j, java.util.SortedSet, java.util.NavigableSet
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public NavigableSet<K> tailSet(K k2) {
            return tailSet(k2, true);
        }

        @Override // java.util.NavigableSet
        public K pollFirst() {
            return (K) epd.q(iterator());
        }

        @Override // java.util.NavigableSet
        public K pollLast() {
            return (K) epd.q(descendingIterator());
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> headSet(K k2, boolean z) {
            return new g(j().headMap(k2, z));
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> subSet(K k2, boolean z, K k3, boolean z2) {
            return new g(j().subMap(k2, z, k3, z2));
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> tailSet(K k2, boolean z) {
            return new g(j().tailMap(k2, z));
        }
    }

    public class h extends b<K, V>.l implements RandomAccess {
        public h(b bVar, K k2, List<V> list, b<K, V>.k kVar) {
            super(k2, list, kVar);
        }
    }

    public class i extends b<K, V>.c implements SortedMap<K, Collection<V>> {
        public SortedSet<K> f;

        public i(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        @Override // java.util.SortedMap
        public Comparator<? super K> comparator() {
            return m().comparator();
        }

        @Override // java.util.SortedMap
        public K firstKey() {
            return m().firstKey();
        }

        public SortedMap<K, Collection<V>> headMap(K k2) {
            return new i(m().headMap(k2));
        }

        @Override // com.google.common.collect.s.r
        public SortedSet<K> j() {
            return new j(m());
        }

        @Override // com.google.common.collect.b.c, com.google.common.collect.s.r, java.util.AbstractMap, java.util.Map
        public SortedSet<K> l() {
            SortedSet<K> sortedSet = this.f;
            if (sortedSet != null) {
                return sortedSet;
            }
            SortedSet<K> sortedSetJ = j();
            this.f = sortedSetJ;
            return sortedSetJ;
        }

        @Override // java.util.SortedMap
        public K lastKey() {
            return m().lastKey();
        }

        public SortedMap<K, Collection<V>> m() {
            return (SortedMap) this.d;
        }

        public SortedMap<K, Collection<V>> subMap(K k2, K k3) {
            return new i(m().subMap(k2, k3));
        }

        public SortedMap<K, Collection<V>> tailMap(K k2) {
            return new i(m().tailMap(k2));
        }
    }

    public class j extends b<K, V>.e implements SortedSet<K> {
        public j(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        @Override // java.util.SortedSet
        public Comparator<? super K> comparator() {
            return j().comparator();
        }

        @Override // java.util.SortedSet
        public K first() {
            return j().firstKey();
        }

        public SortedSet<K> headSet(K k2) {
            return new j(j().headMap(k2));
        }

        public SortedMap<K, Collection<V>> j() {
            return (SortedMap) super.j();
        }

        @Override // java.util.SortedSet
        public K last() {
            return j().lastKey();
        }

        public SortedSet<K> subSet(K k2, K k3) {
            return new j(j().subMap(k2, k3));
        }

        public SortedSet<K> tailSet(K k2) {
            return new j(j().tailMap(k2));
        }
    }

    public class m extends b<K, V>.o implements NavigableSet<V> {
        public m(K k2, NavigableSet<V> navigableSet, b<K, V>.k kVar) {
            super(k2, navigableSet, kVar);
        }

        @Override // java.util.NavigableSet
        public V ceiling(V v) {
            return k().ceiling(v);
        }

        @Override // java.util.NavigableSet
        public Iterator<V> descendingIterator() {
            return new k.a(k().descendingIterator());
        }

        @Override // java.util.NavigableSet
        public NavigableSet<V> descendingSet() {
            return m(k().descendingSet());
        }

        @Override // java.util.NavigableSet
        public V floor(V v) {
            return k().floor(v);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<V> headSet(V v, boolean z) {
            return m(k().headSet(v, z));
        }

        @Override // java.util.NavigableSet
        public V higher(V v) {
            return k().higher(v);
        }

        @Override // com.google.common.collect.b.o
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public NavigableSet<V> k() {
            return (NavigableSet) super.k();
        }

        @Override // java.util.NavigableSet
        public V lower(V v) {
            return k().lower(v);
        }

        public final NavigableSet<V> m(NavigableSet<V> navigableSet) {
            return new m(this.f9155a, navigableSet, f() == null ? this : f());
        }

        @Override // java.util.NavigableSet
        public V pollFirst() {
            return (V) epd.q(iterator());
        }

        @Override // java.util.NavigableSet
        public V pollLast() {
            return (V) epd.q(descendingIterator());
        }

        @Override // java.util.NavigableSet
        public NavigableSet<V> subSet(V v, boolean z, V v2, boolean z2) {
            return m(k().subSet(v, z, v2, z2));
        }

        @Override // java.util.NavigableSet
        public NavigableSet<V> tailSet(V v, boolean z) {
            return m(k().tailSet(v, z));
        }
    }

    public class n extends b<K, V>.k implements Set<V> {
        public n(K k2, Set<V> set) {
            super(k2, set, null);
        }

        @Override // com.google.common.collect.b.k, java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zG = i0.g((Set) this.f9156b, collection);
            if (zG) {
                b.access$212(b.this, this.f9156b.size() - size);
                j();
            }
            return zG;
        }
    }

    public class o extends b<K, V>.k implements SortedSet<V> {
        public o(K k2, SortedSet<V> sortedSet, b<K, V>.k kVar) {
            super(k2, sortedSet, kVar);
        }

        @Override // java.util.SortedSet
        public Comparator<? super V> comparator() {
            return k().comparator();
        }

        @Override // java.util.SortedSet
        public V first() {
            i();
            return k().first();
        }

        @Override // java.util.SortedSet
        public SortedSet<V> headSet(V v) {
            i();
            return new o(h(), k().headSet(v), f() == null ? this : f());
        }

        public SortedSet<V> k() {
            return (SortedSet) g();
        }

        @Override // java.util.SortedSet
        public V last() {
            i();
            return k().last();
        }

        @Override // java.util.SortedSet
        public SortedSet<V> subSet(V v, V v2) {
            i();
            return new o(h(), k().subSet(v, v2), f() == null ? this : f());
        }

        @Override // java.util.SortedSet
        public SortedSet<V> tailSet(V v) {
            i();
            return new o(h(), k().tailSet(v), f() == null ? this : f());
        }
    }

    public b(Map<K, Collection<V>> map) {
        c6i.d(map.isEmpty());
        this.map = map;
    }

    public static /* synthetic */ int access$208(b bVar) {
        int i2 = bVar.totalSize;
        bVar.totalSize = i2 + 1;
        return i2;
    }

    public static /* synthetic */ int access$210(b bVar) {
        int i2 = bVar.totalSize;
        bVar.totalSize = i2 - 1;
        return i2;
    }

    public static /* synthetic */ int access$212(b bVar, int i2) {
        int i3 = bVar.totalSize + i2;
        bVar.totalSize = i3;
        return i3;
    }

    public static /* synthetic */ int access$220(b bVar, int i2) {
        int i3 = bVar.totalSize - i2;
        bVar.totalSize = i3;
        return i3;
    }

    private Collection<V> getOrCreateCollection(K k2) {
        Collection<V> collection = this.map.get(k2);
        if (collection != null) {
            return collection;
        }
        Collection<V> collectionCreateCollection = createCollection(k2);
        this.map.put(k2, collectionCreateCollection);
        return collectionCreateCollection;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> Iterator<E> iteratorOrListIterator(Collection<E> collection) {
        return collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeValuesForKey(Object obj) {
        Collection collection = (Collection) s.w(this.map, obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            this.totalSize -= size;
        }
    }

    public Map<K, Collection<V>> backingMap() {
        return this.map;
    }

    @Override // defpackage.nag
    public void clear() {
        Iterator<Collection<V>> it = this.map.values().iterator();
        while (it.hasNext()) {
            it.next().clear();
        }
        this.map.clear();
        this.totalSize = 0;
    }

    @Override // defpackage.nag
    public boolean containsKey(Object obj) {
        return this.map.containsKey(obj);
    }

    @Override // com.google.common.collect.d
    public Map<K, Collection<V>> createAsMap() {
        return new c(this.map);
    }

    public abstract Collection<V> createCollection();

    public Collection<V> createCollection(K k2) {
        return createCollection();
    }

    @Override // com.google.common.collect.d
    public Collection<Map.Entry<K, V>> createEntries() {
        return this instanceof xyl ? new com.google.common.collect.d.b(this) : new com.google.common.collect.d.a();
    }

    @Override // com.google.common.collect.d
    public Set<K> createKeySet() {
        return new e(this.map);
    }

    @Override // com.google.common.collect.d
    public u<K> createKeys() {
        return new t.d(this);
    }

    public final Map<K, Collection<V>> createMaybeNavigableAsMap() {
        Map<K, Collection<V>> map = this.map;
        if (map instanceof NavigableMap) {
            return new f((NavigableMap) this.map);
        }
        return map instanceof SortedMap ? new i((SortedMap) this.map) : new c(this.map);
    }

    public final Set<K> createMaybeNavigableKeySet() {
        Map<K, Collection<V>> map = this.map;
        if (map instanceof NavigableMap) {
            return new g((NavigableMap) this.map);
        }
        return map instanceof SortedMap ? new j((SortedMap) this.map) : new e(this.map);
    }

    public Collection<V> createUnmodifiableEmptyCollection() {
        return (Collection<V>) unmodifiableCollectionSubclass(createCollection());
    }

    @Override // com.google.common.collect.d
    public Collection<V> createValues() {
        return new com.google.common.collect.d.c();
    }

    @Override // com.google.common.collect.d, defpackage.nag
    public Collection<Map.Entry<K, V>> entries() {
        return super.entries();
    }

    @Override // com.google.common.collect.d
    public Iterator<Map.Entry<K, V>> entryIterator() {
        return new C0231b(this);
    }

    @Override // defpackage.nag
    public Collection<V> get(K k2) {
        Collection<V> collectionCreateCollection = this.map.get(k2);
        if (collectionCreateCollection == null) {
            collectionCreateCollection = createCollection(k2);
        }
        return wrapCollection(k2, collectionCreateCollection);
    }

    @Override // com.google.common.collect.d, defpackage.nag
    public boolean put(K k2, V v) {
        Collection<V> collection = this.map.get(k2);
        if (collection != null) {
            if (!collection.add(v)) {
                return false;
            }
            this.totalSize++;
            return true;
        }
        Collection<V> collectionCreateCollection = createCollection(k2);
        if (!collectionCreateCollection.add(v)) {
            throw new AssertionError("New Collection violated the Collection spec");
        }
        this.totalSize++;
        this.map.put(k2, collectionCreateCollection);
        return true;
    }

    @Override // defpackage.nag
    public Collection<V> removeAll(Object obj) {
        Collection<V> collectionRemove = this.map.remove(obj);
        if (collectionRemove == null) {
            return createUnmodifiableEmptyCollection();
        }
        Collection collectionCreateCollection = createCollection();
        collectionCreateCollection.addAll(collectionRemove);
        this.totalSize -= collectionRemove.size();
        collectionRemove.clear();
        return (Collection<V>) unmodifiableCollectionSubclass(collectionCreateCollection);
    }

    @Override // com.google.common.collect.d
    public Collection<V> replaceValues(K k2, Iterable<? extends V> iterable) {
        Iterator<? extends V> it = iterable.iterator();
        if (!it.hasNext()) {
            return removeAll(k2);
        }
        Collection<V> orCreateCollection = getOrCreateCollection(k2);
        Collection<V> collectionCreateCollection = createCollection();
        collectionCreateCollection.addAll(orCreateCollection);
        this.totalSize -= orCreateCollection.size();
        orCreateCollection.clear();
        while (it.hasNext()) {
            if (orCreateCollection.add(it.next())) {
                this.totalSize++;
            }
        }
        return (Collection<V>) unmodifiableCollectionSubclass(collectionCreateCollection);
    }

    public final void setMap(Map<K, Collection<V>> map) {
        this.map = map;
        this.totalSize = 0;
        for (Collection<V> collection : map.values()) {
            c6i.d(!collection.isEmpty());
            this.totalSize += collection.size();
        }
    }

    @Override // defpackage.nag
    public int size() {
        return this.totalSize;
    }

    public <E> Collection<E> unmodifiableCollectionSubclass(Collection<E> collection) {
        return Collections.unmodifiableCollection(collection);
    }

    @Override // com.google.common.collect.d
    public Iterator<V> valueIterator() {
        return new a(this);
    }

    @Override // com.google.common.collect.d, defpackage.nag
    public Collection<V> values() {
        return super.values();
    }

    public Collection<V> wrapCollection(K k2, Collection<V> collection) {
        return new k(k2, collection, null);
    }

    public final List<V> wrapList(K k2, List<V> list, b<K, V>.k kVar) {
        return list instanceof RandomAccess ? new h(this, k2, list, kVar) : new l(k2, list, kVar);
    }

    public class k extends AbstractCollection<V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final K f9155a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Collection<V> f9156b;
        public final b<K, V>.k c;
        public final Collection<V> d;

        public k(K k2, Collection<V> collection, b<K, V>.k kVar) {
            this.f9155a = k2;
            this.f9156b = collection;
            this.c = kVar;
            this.d = kVar == null ? null : kVar.g();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean add(V v) {
            i();
            boolean zIsEmpty = this.f9156b.isEmpty();
            boolean zAdd = this.f9156b.add(v);
            if (zAdd) {
                b.access$208(b.this);
                if (zIsEmpty) {
                    e();
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
            boolean zAddAll = this.f9156b.addAll(collection);
            if (zAddAll) {
                b.access$212(b.this, this.f9156b.size() - size);
                if (size == 0) {
                    e();
                }
            }
            return zAddAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            int size = size();
            if (size == 0) {
                return;
            }
            this.f9156b.clear();
            b.access$220(b.this, size);
            j();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            i();
            return this.f9156b.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            i();
            return this.f9156b.containsAll(collection);
        }

        public void e() {
            b<K, V>.k kVar = this.c;
            if (kVar != null) {
                kVar.e();
            } else {
                b.this.map.put(this.f9155a, this.f9156b);
            }
        }

        @Override // java.util.Collection
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            i();
            return this.f9156b.equals(obj);
        }

        public b<K, V>.k f() {
            return this.c;
        }

        public Collection<V> g() {
            return this.f9156b;
        }

        public K h() {
            return this.f9155a;
        }

        @Override // java.util.Collection
        public int hashCode() {
            i();
            return this.f9156b.hashCode();
        }

        public void i() {
            Collection<V> collection;
            b<K, V>.k kVar = this.c;
            if (kVar != null) {
                kVar.i();
                if (this.c.g() != this.d) {
                    throw new ConcurrentModificationException();
                }
            } else {
                if (!this.f9156b.isEmpty() || (collection = (Collection) b.this.map.get(this.f9155a)) == null) {
                    return;
                }
                this.f9156b = collection;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            i();
            return new a();
        }

        public void j() {
            b<K, V>.k kVar = this.c;
            if (kVar != null) {
                kVar.j();
            } else if (this.f9156b.isEmpty()) {
                b.this.map.remove(this.f9155a);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            i();
            boolean zRemove = this.f9156b.remove(obj);
            if (zRemove) {
                b.access$210(b.this);
                j();
            }
            return zRemove;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zRemoveAll = this.f9156b.removeAll(collection);
            if (zRemoveAll) {
                b.access$212(b.this, this.f9156b.size() - size);
                j();
            }
            return zRemoveAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            c6i.o(collection);
            int size = size();
            boolean zRetainAll = this.f9156b.retainAll(collection);
            if (zRetainAll) {
                b.access$212(b.this, this.f9156b.size() - size);
                j();
            }
            return zRetainAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            i();
            return this.f9156b.size();
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            i();
            return this.f9156b.toString();
        }

        public class a implements Iterator<V> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Iterator<V> f9157a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Collection<V> f9158b;

            public a() {
                Collection<V> collection = k.this.f9156b;
                this.f9158b = collection;
                this.f9157a = b.iteratorOrListIterator(collection);
            }

            public Iterator<V> a() {
                b();
                return this.f9157a;
            }

            public void b() {
                k.this.i();
                if (k.this.f9156b != this.f9158b) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                b();
                return this.f9157a.hasNext();
            }

            @Override // java.util.Iterator
            public V next() {
                b();
                return this.f9157a.next();
            }

            @Override // java.util.Iterator
            public void remove() {
                this.f9157a.remove();
                b.access$210(b.this);
                k.this.j();
            }

            public a(Iterator<V> it) {
                this.f9158b = k.this.f9156b;
                this.f9157a = it;
            }
        }
    }

    public class l extends b<K, V>.k implements List<V> {

        public class a extends b<K, V>.k.a implements ListIterator<V> {
            public a() {
                super();
            }

            @Override // java.util.ListIterator
            public void add(V v) {
                boolean zIsEmpty = l.this.isEmpty();
                c().add(v);
                b.access$208(b.this);
                if (zIsEmpty) {
                    l.this.e();
                }
            }

            public final ListIterator<V> c() {
                return (ListIterator) a();
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
                super(l.this.k().listIterator(i));
            }
        }

        public l(K k2, List<V> list, b<K, V>.k kVar) {
            super(k2, list, kVar);
        }

        @Override // java.util.List
        public void add(int i, V v) {
            i();
            boolean zIsEmpty = g().isEmpty();
            k().add(i, v);
            b.access$208(b.this);
            if (zIsEmpty) {
                e();
            }
        }

        @Override // java.util.List
        public boolean addAll(int i, Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zAddAll = k().addAll(i, collection);
            if (zAddAll) {
                b.access$212(b.this, g().size() - size);
                if (size == 0) {
                    e();
                }
            }
            return zAddAll;
        }

        @Override // java.util.List
        public V get(int i) {
            i();
            return k().get(i);
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            i();
            return k().indexOf(obj);
        }

        public List<V> k() {
            return (List) g();
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            i();
            return k().lastIndexOf(obj);
        }

        @Override // java.util.List
        public ListIterator<V> listIterator() {
            i();
            return new a();
        }

        @Override // java.util.List
        public V remove(int i) {
            i();
            V vRemove = k().remove(i);
            b.access$210(b.this);
            j();
            return vRemove;
        }

        @Override // java.util.List
        public V set(int i, V v) {
            i();
            return k().set(i, v);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.List
        public List<V> subList(int i, int i2) {
            i();
            return b.this.wrapList(h(), k().subList(i, i2), f() == null ? this : f());
        }

        @Override // java.util.List
        public ListIterator<V> listIterator(int i) {
            i();
            return new a(i);
        }
    }
}
