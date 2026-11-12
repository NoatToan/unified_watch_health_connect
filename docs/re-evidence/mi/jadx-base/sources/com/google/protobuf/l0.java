package com.google.protobuf;

import defpackage.mdg;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public class l0<K, V> implements mdg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile boolean f9689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile d f9690b;
    public c<K, V> c;
    public List<p0> d;
    public final a<K, V> e;

    public interface a<K, V> {
        p0 a(K k2, V v);

        p0 b();

        void c(p0 p0Var, Map<K, V> map);
    }

    public static class b<K, V> implements a<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final j0<K, V> f9691a;

        public b(j0<K, V> j0Var) {
            this.f9691a = j0Var;
        }

        @Override // com.google.protobuf.l0.a
        public p0 a(K k2, V v) {
            return this.f9691a.newBuilderForType().n(k2).q(v).buildPartial();
        }

        @Override // com.google.protobuf.l0.a
        public p0 b() {
            return this.f9691a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.protobuf.l0.a
        public void c(p0 p0Var, Map<K, V> map) {
            j0 j0Var = (j0) p0Var;
            map.put(j0Var.e(), j0Var.g());
        }
    }

    public static class c<K, V> implements Map<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final mdg f9692a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Map<K, V> f9693b;

        public static class a<E> implements Collection<E> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final mdg f9694a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Collection<E> f9695b;

            public a(mdg mdgVar, Collection<E> collection) {
                this.f9694a = mdgVar;
                this.f9695b = collection;
            }

            @Override // java.util.Collection
            public boolean add(E e) {
                throw new UnsupportedOperationException();
            }

            @Override // java.util.Collection
            public boolean addAll(Collection<? extends E> collection) {
                throw new UnsupportedOperationException();
            }

            @Override // java.util.Collection
            public void clear() {
                this.f9694a.a();
                this.f9695b.clear();
            }

            @Override // java.util.Collection
            public boolean contains(Object obj) {
                return this.f9695b.contains(obj);
            }

            @Override // java.util.Collection
            public boolean containsAll(Collection<?> collection) {
                return this.f9695b.containsAll(collection);
            }

            @Override // java.util.Collection
            public boolean equals(Object obj) {
                return this.f9695b.equals(obj);
            }

            @Override // java.util.Collection
            public int hashCode() {
                return this.f9695b.hashCode();
            }

            @Override // java.util.Collection
            public boolean isEmpty() {
                return this.f9695b.isEmpty();
            }

            @Override // java.util.Collection, java.lang.Iterable
            public Iterator<E> iterator() {
                return new b(this.f9694a, this.f9695b.iterator());
            }

            @Override // java.util.Collection
            public boolean remove(Object obj) {
                this.f9694a.a();
                return this.f9695b.remove(obj);
            }

            @Override // java.util.Collection
            public boolean removeAll(Collection<?> collection) {
                this.f9694a.a();
                return this.f9695b.removeAll(collection);
            }

            @Override // java.util.Collection
            public boolean retainAll(Collection<?> collection) {
                this.f9694a.a();
                return this.f9695b.retainAll(collection);
            }

            @Override // java.util.Collection
            public int size() {
                return this.f9695b.size();
            }

            @Override // java.util.Collection
            public Object[] toArray() {
                return this.f9695b.toArray();
            }

            public String toString() {
                return this.f9695b.toString();
            }

            @Override // java.util.Collection
            public <T> T[] toArray(T[] tArr) {
                return (T[]) this.f9695b.toArray(tArr);
            }
        }

        public static class b<E> implements Iterator<E> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final mdg f9696a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Iterator<E> f9697b;

            public b(mdg mdgVar, Iterator<E> it) {
                this.f9696a = mdgVar;
                this.f9697b = it;
            }

            public boolean equals(Object obj) {
                return this.f9697b.equals(obj);
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f9697b.hasNext();
            }

            public int hashCode() {
                return this.f9697b.hashCode();
            }

            @Override // java.util.Iterator
            public E next() {
                return this.f9697b.next();
            }

            @Override // java.util.Iterator
            public void remove() {
                this.f9696a.a();
                this.f9697b.remove();
            }

            public String toString() {
                return this.f9697b.toString();
            }
        }

        /* JADX INFO: renamed from: com.google.protobuf.l0$c$c, reason: collision with other inner class name */
        public static class C0260c<E> implements Set<E> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final mdg f9698a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Set<E> f9699b;

            public C0260c(mdg mdgVar, Set<E> set) {
                this.f9698a = mdgVar;
                this.f9699b = set;
            }

            @Override // java.util.Set, java.util.Collection
            public boolean add(E e) {
                this.f9698a.a();
                return this.f9699b.add(e);
            }

            @Override // java.util.Set, java.util.Collection
            public boolean addAll(Collection<? extends E> collection) {
                this.f9698a.a();
                return this.f9699b.addAll(collection);
            }

            @Override // java.util.Set, java.util.Collection
            public void clear() {
                this.f9698a.a();
                this.f9699b.clear();
            }

            @Override // java.util.Set, java.util.Collection
            public boolean contains(Object obj) {
                return this.f9699b.contains(obj);
            }

            @Override // java.util.Set, java.util.Collection
            public boolean containsAll(Collection<?> collection) {
                return this.f9699b.containsAll(collection);
            }

            @Override // java.util.Set, java.util.Collection
            public boolean equals(Object obj) {
                return this.f9699b.equals(obj);
            }

            @Override // java.util.Set, java.util.Collection
            public int hashCode() {
                return this.f9699b.hashCode();
            }

            @Override // java.util.Set, java.util.Collection
            public boolean isEmpty() {
                return this.f9699b.isEmpty();
            }

            @Override // java.util.Set, java.util.Collection, java.lang.Iterable
            public Iterator<E> iterator() {
                return new b(this.f9698a, this.f9699b.iterator());
            }

            @Override // java.util.Set, java.util.Collection
            public boolean remove(Object obj) {
                this.f9698a.a();
                return this.f9699b.remove(obj);
            }

            @Override // java.util.Set, java.util.Collection
            public boolean removeAll(Collection<?> collection) {
                this.f9698a.a();
                return this.f9699b.removeAll(collection);
            }

            @Override // java.util.Set, java.util.Collection
            public boolean retainAll(Collection<?> collection) {
                this.f9698a.a();
                return this.f9699b.retainAll(collection);
            }

            @Override // java.util.Set, java.util.Collection
            public int size() {
                return this.f9699b.size();
            }

            @Override // java.util.Set, java.util.Collection
            public Object[] toArray() {
                return this.f9699b.toArray();
            }

            public String toString() {
                return this.f9699b.toString();
            }

            @Override // java.util.Set, java.util.Collection
            public <T> T[] toArray(T[] tArr) {
                return (T[]) this.f9699b.toArray(tArr);
            }
        }

        public c(mdg mdgVar, Map<K, V> map) {
            this.f9692a = mdgVar;
            this.f9693b = map;
        }

        @Override // java.util.Map
        public void clear() {
            this.f9692a.a();
            this.f9693b.clear();
        }

        @Override // java.util.Map
        public boolean containsKey(Object obj) {
            return this.f9693b.containsKey(obj);
        }

        @Override // java.util.Map
        public boolean containsValue(Object obj) {
            return this.f9693b.containsValue(obj);
        }

        @Override // java.util.Map
        public Set<Map.Entry<K, V>> entrySet() {
            return new C0260c(this.f9692a, this.f9693b.entrySet());
        }

        @Override // java.util.Map
        public boolean equals(Object obj) {
            return this.f9693b.equals(obj);
        }

        @Override // java.util.Map
        public V get(Object obj) {
            return this.f9693b.get(obj);
        }

        @Override // java.util.Map
        public int hashCode() {
            return this.f9693b.hashCode();
        }

        @Override // java.util.Map
        public boolean isEmpty() {
            return this.f9693b.isEmpty();
        }

        @Override // java.util.Map
        public Set<K> keySet() {
            return new C0260c(this.f9692a, this.f9693b.keySet());
        }

        @Override // java.util.Map
        public V put(K k2, V v) {
            this.f9692a.a();
            d0.a(k2);
            d0.a(v);
            return this.f9693b.put(k2, v);
        }

        @Override // java.util.Map
        public void putAll(Map<? extends K, ? extends V> map) {
            this.f9692a.a();
            for (K k2 : map.keySet()) {
                d0.a(k2);
                d0.a(map.get(k2));
            }
            this.f9693b.putAll(map);
        }

        @Override // java.util.Map
        public V remove(Object obj) {
            this.f9692a.a();
            return this.f9693b.remove(obj);
        }

        @Override // java.util.Map
        public int size() {
            return this.f9693b.size();
        }

        public String toString() {
            return this.f9693b.toString();
        }

        @Override // java.util.Map
        public Collection<V> values() {
            return new a(this.f9692a, this.f9693b.values());
        }
    }

    public enum d {
        MAP,
        LIST,
        BOTH
    }

    public l0(a<K, V> aVar, d dVar, Map<K, V> map) {
        this.e = aVar;
        this.f9689a = true;
        this.f9690b = dVar;
        this.c = new c<>(this, map);
        this.d = null;
    }

    public static <K, V> l0<K, V> h(j0<K, V> j0Var) {
        return new l0<>(j0Var, d.MAP, Collections.emptyMap());
    }

    public static <K, V> l0<K, V> q(j0<K, V> j0Var) {
        return new l0<>(j0Var, d.MAP, new LinkedHashMap());
    }

    @Override // defpackage.mdg
    public void a() {
        if (!n()) {
            throw new UnsupportedOperationException();
        }
    }

    public void b() {
        this.c = new c<>(this, new LinkedHashMap());
        this.f9690b = d.MAP;
    }

    public final p0 c(K k2, V v) {
        return this.e.a(k2, v);
    }

    public final c<K, V> d(List<p0> list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<p0> it = list.iterator();
        while (it.hasNext()) {
            f(it.next(), linkedHashMap);
        }
        return new c<>(this, linkedHashMap);
    }

    public final List<p0> e(c<K, V> cVar) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<K, V> entry : cVar.entrySet()) {
            arrayList.add(c(entry.getKey(), entry.getValue()));
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        if (obj instanceof l0) {
            return MapFieldLite.equals((Map) j(), (Map) ((l0) obj).j());
        }
        return false;
    }

    public final void f(p0 p0Var, Map<K, V> map) {
        this.e.c(p0Var, map);
    }

    public l0<K, V> g() {
        return new l0<>(this.e, d.MAP, MapFieldLite.copy((Map) j()));
    }

    public int hashCode() {
        return MapFieldLite.calculateHashCodeForMap(j());
    }

    public List<p0> i() {
        d dVar = this.f9690b;
        d dVar2 = d.MAP;
        if (dVar == dVar2) {
            synchronized (this) {
                try {
                    if (this.f9690b == dVar2) {
                        this.d = e(this.c);
                        this.f9690b = d.BOTH;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return Collections.unmodifiableList(this.d);
    }

    public Map<K, V> j() {
        d dVar = this.f9690b;
        d dVar2 = d.LIST;
        if (dVar == dVar2) {
            synchronized (this) {
                try {
                    if (this.f9690b == dVar2) {
                        this.c = d(this.d);
                        this.f9690b = d.BOTH;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return Collections.unmodifiableMap(this.c);
    }

    public p0 k() {
        return this.e.b();
    }

    public List<p0> l() {
        d dVar = this.f9690b;
        d dVar2 = d.LIST;
        if (dVar != dVar2) {
            if (this.f9690b == d.MAP) {
                this.d = e(this.c);
            }
            this.c = null;
            this.f9690b = dVar2;
        }
        return this.d;
    }

    public Map<K, V> m() {
        d dVar = this.f9690b;
        d dVar2 = d.MAP;
        if (dVar != dVar2) {
            if (this.f9690b == d.LIST) {
                this.c = d(this.d);
            }
            this.d = null;
            this.f9690b = dVar2;
        }
        return this.c;
    }

    public boolean n() {
        return this.f9689a;
    }

    public void o() {
        this.f9689a = false;
    }

    public void p(l0<K, V> l0Var) {
        m().putAll(MapFieldLite.copy((Map) l0Var.j()));
    }

    public l0(j0<K, V> j0Var, d dVar, Map<K, V> map) {
        this(new b(j0Var), dVar, map);
    }
}
