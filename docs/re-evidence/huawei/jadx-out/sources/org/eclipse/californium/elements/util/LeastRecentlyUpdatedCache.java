package org.eclipse.californium.elements.util;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes20.dex */
public class LeastRecentlyUpdatedCache<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f44467a = TimeUnit.MINUTES.toSeconds(30);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile int f44468b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ConcurrentMap<K, e<K, V>> f44469c;
    private volatile long d;
    private final List<EvictionListener<V>> e;
    private final ReentrantReadWriteLock f;
    private final e<K, V> h;
    private volatile boolean i;
    private Collection<V> j;

    public interface EvictionListener<V> {
        void onEviction(V v);
    }

    /* JADX INFO: loaded from: classes46.dex */
    @Deprecated
    public interface Predicate<V> {
        boolean accept(V v);
    }

    public LeastRecentlyUpdatedCache() {
        this(16, 150000, f44467a, TimeUnit.SECONDS);
    }

    public LeastRecentlyUpdatedCache(int i, long j, TimeUnit timeUnit) {
        this(Math.min(i, 16), i, j, timeUnit);
    }

    public LeastRecentlyUpdatedCache(int i, int i2, long j, TimeUnit timeUnit) {
        this.f = new ReentrantReadWriteLock();
        this.h = new e<>();
        this.e = new LinkedList();
        if (i > i2) {
            throw new IllegalArgumentException("initial capacity must be <= max capacity");
        }
        this.f44468b = i2;
        this.f44469c = new ConcurrentHashMap(i);
        c(j, timeUnit);
    }

    public final ReentrantReadWriteLock.ReadLock a() {
        return this.f.readLock();
    }

    public final ReentrantReadWriteLock.WriteLock f() {
        return this.f.writeLock();
    }

    public void a(EvictionListener<V> evictionListener) {
        if (evictionListener != null) {
            this.e.add(evictionListener);
        }
    }

    public final long a(TimeUnit timeUnit) {
        return timeUnit.convert(this.d, TimeUnit.NANOSECONDS);
    }

    public final void c(long j, TimeUnit timeUnit) {
        this.d = timeUnit.toNanos(j);
    }

    public final int b() {
        return this.f44468b;
    }

    public final int h() {
        return this.f44469c.size();
    }

    public final int c() {
        return Math.max(0, this.f44468b - this.f44469c.size());
    }

    public void c(boolean z) {
        this.i = z;
    }

    public final void e() {
        this.f.writeLock().lock();
        try {
            this.f44469c.clear();
            e<K, V> eVar = this.h;
            if (eVar != ((e) eVar).f44481c && ((e) this.h).f44481c != null) {
                ((e) this.h).f44481c.f44480b = null;
            }
            e<K, V> eVar2 = this.h;
            if (eVar2 != ((e) eVar2).f44480b && ((e) this.h).f44480b != null) {
                ((e) this.h).f44480b.f44481c = null;
            }
            e<K, V> eVar3 = this.h;
            ((e) eVar3).f44481c = ((e) eVar3).f44480b = eVar3;
        } finally {
            this.f.writeLock().unlock();
        }
    }

    private final void i(V v) {
        if (v == null || this.e.isEmpty()) {
            return;
        }
        Iterator<EvictionListener<V>> it = this.e.iterator();
        while (it.hasNext()) {
            it.next().onEviction(v);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean a(K k, V v) {
        Object objE;
        if (v == null) {
            return false;
        }
        this.f.writeLock().lock();
        try {
            e<K, V> eVar = this.f44469c.get(k);
            if (eVar == null) {
                if (this.f44469c.size() < this.f44468b) {
                    b(k, v);
                } else {
                    e eVar2 = ((e) this.h).f44481c;
                    if (eVar2.b(this.d)) {
                        eVar2.a();
                        this.f44469c.remove(eVar2.d());
                        b(k, v);
                        objE = eVar2.e();
                    } else {
                        objE = null;
                    }
                    this.f.writeLock().unlock();
                    if (objE == null) {
                        return false;
                    }
                    i(objE);
                    return true;
                }
            } else {
                eVar.a();
                b(k, v);
            }
            this.f.writeLock().unlock();
            return true;
        } catch (Throwable th) {
            this.f.writeLock().unlock();
            throw th;
        }
    }

    private final void b(K k, V v) {
        e<K, V> eVar = new e<>(k, v);
        this.f44469c.put(k, eVar);
        eVar.k(this.h);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean a(K k, V v, long j) {
        Object objE;
        if (v == null) {
            return false;
        }
        this.f.writeLock().lock();
        try {
            e<K, V> eVar = this.f44469c.get(k);
            if (eVar == null) {
                if (this.f44469c.size() < this.f44468b) {
                    b(k, v, j);
                } else {
                    e eVar2 = ((e) this.h).f44481c;
                    if (!eVar2.b(this.d) || j - eVar2.d < 0) {
                        objE = null;
                    } else {
                        eVar2.a();
                        this.f44469c.remove(eVar2.d());
                        b(k, v, j);
                        objE = eVar2.e();
                    }
                    this.f.writeLock().unlock();
                    if (objE == null) {
                        return false;
                    }
                    i(objE);
                    return true;
                }
            } else {
                eVar.a();
                b(k, v, j);
            }
            this.f.writeLock().unlock();
            return true;
        } catch (Throwable th) {
            this.f.writeLock().unlock();
            throw th;
        }
    }

    private final void b(K k, V v, long j) {
        e<K, V> eVar = new e<>(k, v, j);
        this.f44469c.put(k, eVar);
        e<K, V> eVar2 = ((e) this.h).f44480b;
        e<K, V> eVar3 = this.h;
        if (eVar2 != eVar3) {
            while (j - ((e) eVar3).f44480b.d < 0 && (eVar3 = ((e) eVar3).f44480b) != this.h) {
            }
            eVar.k(eVar3);
            return;
        }
        eVar.k(eVar3);
    }

    private final e<K, V> c(K k) {
        if (k == null) {
            return null;
        }
        return this.f44469c.get(k);
    }

    public final boolean b(K k) {
        e<K, V> eVarC = c(k);
        if (eVarC == null) {
            return false;
        }
        return eVarC.b(this.d);
    }

    public final V d(K k) {
        e<K, V> eVarC = c(k);
        if (eVarC == null) {
            return null;
        }
        if (this.i && eVarC.b(this.d)) {
            return null;
        }
        return (V) eVarC.e();
    }

    public final V e(K k) {
        if (k == null) {
            return null;
        }
        this.f.writeLock().lock();
        try {
            e<K, V> eVar = this.f44469c.get(k);
            if (eVar == null || (this.i && eVar.b(this.d))) {
                return null;
            }
            eVar.l(this.h);
            return (V) eVar.e();
        } finally {
            this.f.writeLock().unlock();
        }
    }

    public final V a(K k) {
        if (k == null) {
            return null;
        }
        this.f.writeLock().lock();
        try {
            e<K, V> eVarRemove = this.f44469c.remove(k);
            if (eVarRemove == null) {
                return null;
            }
            eVarRemove.a();
            return (V) eVarRemove.e();
        } finally {
            this.f.writeLock().unlock();
        }
    }

    public final V c(K k, V v) {
        if (k == null) {
            return null;
        }
        this.f.writeLock().lock();
        try {
            e<K, V> eVar = this.f44469c.get(k);
            if (eVar == null || eVar.e() != v) {
                return null;
            }
            this.f44469c.remove(k);
            eVar.a();
            return v;
        } finally {
            this.f.writeLock().unlock();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int a(int i) {
        int i2 = 0;
        while (true) {
            if (i != 0 && i2 >= i) {
                break;
            }
            e<K, V> eVarA = a((e) this.h);
            if (this.h == eVarA || !eVarA.b(this.d)) {
                break;
            }
            try {
                this.f.writeLock().lock();
                Object objE = eVarA.a() ? eVarA.e() : null;
                this.f44469c.remove(eVarA.d(), eVarA);
                i2++;
                this.f.writeLock().unlock();
                if (objE != null) {
                    i(objE);
                }
            } catch (Throwable th) {
                this.f.writeLock().unlock();
                throw th;
            }
        }
        return i2;
    }

    public V a(Filter<V> filter) {
        if (filter == null) {
            return null;
        }
        for (e<K, V> eVar : this.f44469c.values()) {
            if (!this.i || !eVar.b(this.d)) {
                V v = (V) eVar.e();
                if (filter.accept(v)) {
                    return v;
                }
            }
        }
        return null;
    }

    public final Iterator<V> g() {
        return new Iterator<V>() { // from class: org.eclipse.californium.elements.util.LeastRecentlyUpdatedCache.1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private volatile e<K, V> f44470a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final Iterator<e<K, V>> f44471b;
            private volatile boolean d;

            {
                this.f44471b = LeastRecentlyUpdatedCache.this.f44469c.values().iterator();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                if (!this.d) {
                    this.f44470a = null;
                    while (this.f44471b.hasNext()) {
                        e<K, V> next = this.f44471b.next();
                        if (!LeastRecentlyUpdatedCache.this.i || !next.b(LeastRecentlyUpdatedCache.this.d)) {
                            this.f44470a = next;
                            break;
                        }
                    }
                    this.d = true;
                }
                return this.f44470a != null;
            }

            @Override // java.util.Iterator
            public V next() {
                hasNext();
                this.d = false;
                if (this.f44470a == null) {
                    throw new NoSuchElementException();
                }
                return (V) ((e) this.f44470a).i;
            }

            @Override // java.util.Iterator
            public void remove() {
                if (this.f44470a != null && !this.d) {
                    LeastRecentlyUpdatedCache.this.f.writeLock().lock();
                    try {
                        this.f44471b.remove();
                        this.f44470a.a();
                        LeastRecentlyUpdatedCache.this.f.writeLock().unlock();
                        this.f44470a = null;
                        return;
                    } catch (Throwable th) {
                        LeastRecentlyUpdatedCache.this.f.writeLock().unlock();
                        throw th;
                    }
                }
                throw new IllegalStateException("next() must be called before remove()!");
            }
        };
    }

    public final Collection<V> j() {
        Collection<V> collection = this.j;
        if (collection != null) {
            return collection;
        }
        AbstractCollection<V> abstractCollection = new AbstractCollection<V>() { // from class: org.eclipse.californium.elements.util.LeastRecentlyUpdatedCache.4
            @Override // java.util.AbstractCollection, java.util.Collection
            public final int size() {
                return LeastRecentlyUpdatedCache.this.f44469c.size();
            }

            @Override // java.util.AbstractCollection, java.util.Collection
            public final boolean contains(final Object obj) {
                return LeastRecentlyUpdatedCache.this.a((Filter) new Filter<V>() { // from class: org.eclipse.californium.elements.util.LeastRecentlyUpdatedCache.4.5
                    @Override // org.eclipse.californium.elements.util.Filter
                    public boolean accept(V v) {
                        return v.equals(obj);
                    }
                }) != null;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
            public final Iterator<V> iterator() {
                return LeastRecentlyUpdatedCache.this.g();
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
        this.j = abstractCollection;
        return abstractCollection;
    }

    public final Iterator<V> d() {
        return new Iterator<V>() { // from class: org.eclipse.californium.elements.util.LeastRecentlyUpdatedCache.5
            final Iterator<e<K, V>> d;

            {
                this.d = new d();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.d.hasNext();
            }

            @Override // java.util.Iterator
            public V next() {
                return (V) ((e) this.d.next()).i;
            }

            @Override // java.util.Iterator
            public void remove() {
                this.d.remove();
            }
        };
    }

    public final Iterator<b<V>> i() {
        return new Iterator<b<V>>() { // from class: org.eclipse.californium.elements.util.LeastRecentlyUpdatedCache.3
            final Iterator<e<K, V>> d;

            {
                this.d = new d();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.d.hasNext();
            }

            @Override // java.util.Iterator
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public b<V> next() {
                return this.d.next().c();
            }

            @Override // java.util.Iterator
            public void remove() {
                this.d.remove();
            }
        };
    }

    class d implements Iterator<e<K, V>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        e<K, V> f44477b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        e<K, V> f44478c;

        private d() {
            this.f44477b = null;
            this.f44478c = e(LeastRecentlyUpdatedCache.this.h);
        }

        public e<K, V> e(e<K, V> eVar) {
            return LeastRecentlyUpdatedCache.this.a((e) eVar);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            e<K, V> eVar;
            while (this.f44478c != LeastRecentlyUpdatedCache.this.h && (eVar = this.f44478c) != null && (eVar.b() || (LeastRecentlyUpdatedCache.this.i && this.f44478c.b(LeastRecentlyUpdatedCache.this.d)))) {
                this.f44478c = e(this.f44478c);
            }
            e<K, V> eVar2 = this.f44478c;
            return (eVar2 == null || eVar2.b()) ? false : true;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public e<K, V> next() {
            this.f44477b = this.f44478c;
            if (hasNext()) {
                this.f44477b = this.f44478c;
            } else {
                e<K, V> eVar = this.f44477b;
                if (eVar == null || eVar == LeastRecentlyUpdatedCache.this.h) {
                    throw new NoSuchElementException();
                }
            }
            this.f44478c = e(this.f44478c);
            hasNext();
            return this.f44477b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Iterator
        public void remove() {
            e<K, V> eVar = this.f44477b;
            if (eVar == null) {
                throw new IllegalStateException("next() must be called before remove()!");
            }
            LeastRecentlyUpdatedCache.this.c(((e) eVar).e, ((e) this.f44477b).i);
            this.f44477b = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public e<K, V> a(e<K, V> eVar) {
        try {
            this.f.readLock().lock();
            return ((e) eVar).f44481c;
        } finally {
            this.f.readLock().unlock();
        }
    }

    static class e<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static long f44479a = -1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private e<K, V> f44480b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private e<K, V> f44481c;
        private volatile long d;
        private final K e;
        private final V i;

        private e() {
            this.e = null;
            this.i = null;
            this.d = f44479a;
            this.f44481c = this;
            this.f44480b = this;
        }

        private e(K k, V v) {
            this(k, v, ClockUtil.c());
        }

        private e(K k, V v, long j) {
            this.e = k;
            this.i = v;
            this.d = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final b<V> c() {
            return new b<>(this.i, this.d);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final K d() {
            return this.e;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final V e() {
            return this.i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean b(long j) {
            return ClockUtil.c() - this.d >= j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean l(e<K, V> eVar) {
            if (!a()) {
                return false;
            }
            this.d = ClockUtil.c();
            k(eVar);
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void k(e<K, V> eVar) {
            this.f44481c = eVar;
            e<K, V> eVar2 = eVar.f44480b;
            this.f44480b = eVar2;
            eVar2.f44481c = this;
            this.f44481c.f44480b = this;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean a() {
            if (this.f44480b == null || this.f44481c == null) {
                return false;
            }
            this.d = f44479a;
            e<K, V> eVar = this.f44480b;
            eVar.f44481c = this.f44481c;
            this.f44481c.f44480b = eVar;
            this.f44480b = null;
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean b() {
            return this.d == f44479a;
        }

        public String toString() {
            return "CacheEntry [key: " + this.e + ", last access: " + this.d + "]";
        }
    }

    /* JADX INFO: loaded from: classes46.dex */
    public static final class b<V> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f44475c;
        private final V e;

        public b(V v, long j) {
            this.e = v;
            this.f44475c = j;
        }

        public final V e() {
            return this.e;
        }

        public final long a() {
            return this.f44475c;
        }

        public int hashCode() {
            long j = this.f44475c;
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
            b bVar = (b) obj;
            if (this.f44475c != bVar.f44475c) {
                return false;
            }
            V v = this.e;
            if (v == null) {
                return bVar.e == null;
            }
            return v.equals(bVar.e);
        }

        public String toString() {
            return this.f44475c + ": " + this.e;
        }
    }
}
