package org.eclipse.californium.elements.util;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes20.dex */
@Deprecated
public class LeastRecentlyUsedCache<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<K, d<K, V>> f44482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<EvictionListener<V>> f44483b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile int f44484c;
    private volatile long d;
    private volatile boolean e;
    private d<K, V> f;
    private Collection<V> g;
    private volatile boolean j;

    public interface EvictionListener<V> {
        void onEviction(V v);
    }

    public interface Predicate<V> {
        boolean accept(V v);
    }

    public LeastRecentlyUsedCache() {
        this(16, 150000, 1800L, TimeUnit.SECONDS);
    }

    public LeastRecentlyUsedCache(int i, long j) {
        this(Math.min(i, 16), i, j, TimeUnit.SECONDS);
    }

    public LeastRecentlyUsedCache(int i, int i2, long j, TimeUnit timeUnit) {
        this.e = true;
        this.j = true;
        this.f44483b = new LinkedList();
        if (i > i2) {
            throw new IllegalArgumentException("initial capacity must be <= max capacity");
        }
        this.f44484c = i2;
        this.f44482a = new ConcurrentHashMap(i);
        b(j, timeUnit);
        g();
    }

    private void g() {
        d<K, V> dVar = new d<>();
        this.f = dVar;
        ((d) dVar).e = ((d) dVar).f44494c = dVar;
    }

    public void a(EvictionListener<V> evictionListener) {
        if (evictionListener != null) {
            this.f44483b.add(evictionListener);
        }
    }

    public void e(boolean z) {
        this.e = z;
    }

    public void a(boolean z) {
        this.j = z;
    }

    public final void b(long j, TimeUnit timeUnit) {
        this.d = timeUnit.toNanos(j);
    }

    public final int b() {
        return this.f44484c;
    }

    public final int c() {
        return this.f44482a.size();
    }

    public final int d() {
        return Math.max(0, this.f44484c - this.f44482a.size());
    }

    public final void e() {
        this.f44482a.clear();
        g();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean e(K k, V v) {
        if (v == null) {
            return false;
        }
        d<K, V> dVar = this.f44482a.get(k);
        if (dVar == null) {
            if (this.f44482a.size() < this.f44484c) {
                c(k, v);
                return true;
            }
            d dVar2 = ((d) this.f).e;
            if (!dVar2.c(this.d)) {
                return false;
            }
            dVar2.d();
            this.f44482a.remove(dVar2.e());
            c(k, v);
            e(dVar2.c());
            return true;
        }
        dVar.d();
        c(k, v);
        return true;
    }

    private void e(V v) {
        Iterator<EvictionListener<V>> it = this.f44483b.iterator();
        while (it.hasNext()) {
            it.next().onEviction(v);
        }
    }

    private void c(K k, V v) {
        d<K, V> dVar = new d<>(k, v);
        this.f44482a.put(k, dVar);
        dVar.j(this.f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean a(K k, V v, long j) {
        if (v == null) {
            return false;
        }
        d<K, V> dVar = this.f44482a.get(k);
        if (dVar == null) {
            if (this.f44482a.size() < this.f44484c) {
                d(k, v, j);
                return true;
            }
            d dVar2 = ((d) this.f).e;
            if (!dVar2.c(this.d) || j - dVar2.f44493b < 0) {
                return false;
            }
            dVar2.d();
            this.f44482a.remove(dVar2.e());
            d(k, v, j);
            e(dVar2.c());
            return true;
        }
        dVar.d();
        d(k, v, j);
        return true;
    }

    private void d(K k, V v, long j) {
        d<K, V> dVar = new d<>(k, v, j);
        this.f44482a.put(k, dVar);
        d<K, V> dVar2 = ((d) this.f).f44494c;
        d<K, V> dVar3 = this.f;
        if (dVar2 != dVar3) {
            while (j - ((d) dVar3).f44494c.f44493b < 0 && (dVar3 = ((d) dVar3).f44494c) != this.f) {
            }
            dVar.j(dVar3);
            return;
        }
        dVar.j(dVar3);
    }

    public final V c(K k) {
        d<K, V> dVar;
        if (k == null || (dVar = this.f44482a.get(k)) == null) {
            return null;
        }
        return e((d) dVar, (Iterator) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final V e(d<K, V> dVar, Iterator<d<K, V>> it) {
        if (!this.e || this.d <= 0 || !dVar.c(this.d)) {
            if (this.j) {
                dVar.i(this.f);
            }
            return (V) dVar.c();
        }
        if (it != null) {
            it.remove();
        } else {
            this.f44482a.remove(dVar.e());
        }
        dVar.d();
        e(dVar.c());
        return null;
    }

    public final boolean a(K k) {
        d<K, V> dVar;
        if (k == null || (dVar = this.f44482a.get(k)) == null) {
            return false;
        }
        dVar.i(this.f);
        return true;
    }

    public final V a(K k, V v) {
        d<K, V> dVar;
        if (k == null || (dVar = this.f44482a.get(k)) == null || dVar.c() != v) {
            return null;
        }
        this.f44482a.remove(k);
        dVar.d();
        return v;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final V e(Predicate<V> predicate, boolean z) {
        if (predicate == 0) {
            return null;
        }
        Iterator<d<K, V>> it = this.f44482a.values().iterator();
        while (it.hasNext()) {
            d<K, V> next = it.next();
            if (predicate.accept(next.c())) {
                V vE = e((d) next, (Iterator) it);
                if (z || vE != null) {
                    return vE;
                }
            }
        }
        return null;
    }

    public final Iterator<V> f() {
        return c(true);
    }

    public final Iterator<V> c(final boolean z) {
        final Iterator<d<K, V>> it = this.f44482a.values().iterator();
        return new Iterator<V>() { // from class: org.eclipse.californium.elements.util.LeastRecentlyUsedCache.3

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private boolean f44487a;
            private d<K, V> d;

            @Override // java.util.Iterator
            public boolean hasNext() {
                if (!this.f44487a) {
                    this.d = null;
                    while (it.hasNext()) {
                        d<K, V> dVar = (d) it.next();
                        if (z) {
                            synchronized (LeastRecentlyUsedCache.this) {
                                if (LeastRecentlyUsedCache.this.e((d) dVar, it) != null) {
                                    this.d = dVar;
                                }
                            }
                            break;
                        }
                        this.d = dVar;
                        break;
                    }
                    this.f44487a = true;
                }
                return this.d != null;
            }

            @Override // java.util.Iterator
            public V next() {
                hasNext();
                this.f44487a = false;
                d<K, V> dVar = this.d;
                if (dVar == null) {
                    throw new NoSuchElementException();
                }
                return (V) ((d) dVar).d;
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    public final Collection<V> i() {
        Collection<V> collection = this.g;
        if (collection != null) {
            return collection;
        }
        AbstractCollection<V> abstractCollection = new AbstractCollection<V>() { // from class: org.eclipse.californium.elements.util.LeastRecentlyUsedCache.1
            @Override // java.util.AbstractCollection, java.util.Collection
            public final int size() {
                return LeastRecentlyUsedCache.this.f44482a.size();
            }

            @Override // java.util.AbstractCollection, java.util.Collection
            public final boolean contains(final Object obj) {
                return LeastRecentlyUsedCache.this.e((Predicate) new Predicate<V>() { // from class: org.eclipse.californium.elements.util.LeastRecentlyUsedCache.1.1
                    @Override // org.eclipse.californium.elements.util.LeastRecentlyUsedCache.Predicate
                    public boolean accept(V v) {
                        return v.equals(obj);
                    }
                }, false) != null;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
            public final Iterator<V> iterator() {
                return LeastRecentlyUsedCache.this.f();
            }

            @Override // java.util.AbstractCollection, java.util.Collection
            public final boolean add(Object obj) {
                throw new UnsupportedOperationException();
            }

            @Override // java.util.AbstractCollection, java.util.Collection
            public final boolean remove(Object obj) {
                throw new UnsupportedOperationException();
            }

            @Override // java.util.AbstractCollection, java.util.Collection
            public final void clear() {
                throw new UnsupportedOperationException();
            }
        };
        this.g = abstractCollection;
        return abstractCollection;
    }

    public final Iterator<e<V>> a() {
        return new Iterator<e<V>>() { // from class: org.eclipse.californium.elements.util.LeastRecentlyUsedCache.5

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            int f44491c;
            d<K, V> d;
            final int e;

            {
                this.e = LeastRecentlyUsedCache.this.f44482a.size();
                this.d = LeastRecentlyUsedCache.this.f;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return ((d) this.d).e != LeastRecentlyUsedCache.this.f && this.f44491c < this.e;
            }

            @Override // java.util.Iterator
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public e<V> next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                this.f44491c++;
                d<K, V> dVar = ((d) this.d).e;
                this.d = dVar;
                return dVar.b();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    static class d<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final K f44492a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f44493b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private d<K, V> f44494c;
        private final V d;
        private d<K, V> e;

        private d() {
            this.f44492a = null;
            this.d = null;
            this.f44493b = -1L;
        }

        private d(K k, V v) {
            this(k, v, ClockUtil.c());
        }

        private d(K k, V v, long j) {
            this.f44492a = k;
            this.d = v;
            this.f44493b = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public e<V> b() {
            return new e<>(this.d, this.f44493b);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public K e() {
            return this.f44492a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public V c() {
            return this.d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean c(long j) {
            return ClockUtil.c() - this.f44493b >= j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void i(d<K, V> dVar) {
            d();
            this.f44493b = ClockUtil.c();
            j(dVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void j(d<K, V> dVar) {
            this.e = dVar;
            d<K, V> dVar2 = dVar.f44494c;
            this.f44494c = dVar2;
            dVar2.e = this;
            this.e.f44494c = this;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d() {
            d<K, V> dVar = this.f44494c;
            dVar.e = this.e;
            this.e.f44494c = dVar;
        }

        public String toString() {
            return "CacheEntry [key: " + this.f44492a + ", last access: " + this.f44493b + "]";
        }
    }

    /* JADX INFO: loaded from: classes46.dex */
    public static final class e<V> {
        private final long d;
        private final V e;

        public e(V v, long j) {
            this.e = v;
            this.d = j;
        }

        public V c() {
            return this.e;
        }

        public long e() {
            return this.d;
        }

        public int hashCode() {
            long j = this.d;
            int i = (int) (j ^ (j >>> 32));
            V v = this.e;
            return v != null ? i + v.hashCode() : i;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            e eVar = (e) obj;
            if (this.d != eVar.d) {
                return false;
            }
            V v = this.e;
            if (v == null) {
                return eVar.e == null;
            }
            return v.equals(eVar.e);
        }

        public String toString() {
            return this.d + ": " + this.e;
        }
    }
}
