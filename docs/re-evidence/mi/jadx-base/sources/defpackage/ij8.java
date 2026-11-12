package defpackage;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedSet;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import net.jodah.expiringmap.ExpirationPolicy;

/* JADX INFO: loaded from: classes3.dex */
public class ij8<K, V> implements ConcurrentMap<K, V> {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static volatile ScheduledExecutorService f21198k;
    public static volatile ThreadPoolExecutor l;
    public static ThreadFactory m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List<gj8<K, V>> f21199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List<gj8<K, V>> f21200b;
    public AtomicLong c;
    public int d;
    public final AtomicReference<ExpirationPolicy> e;
    public final ReadWriteLock f;
    public final Lock g;
    public final Lock h;
    public final i<K, V> i;
    public final boolean j;

    public class a extends AbstractSet<Map.Entry<K, V>> {
        public a() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            ij8.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (obj instanceof Map.Entry) {
                return ij8.this.containsKey(((Map.Entry) obj).getKey());
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            if (ij8.this.i instanceof h) {
                h hVar = (h) ij8.this.i;
                hVar.getClass();
                return new h.b();
            }
            j jVar = (j) ij8.this.i;
            jVar.getClass();
            return new j.b();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return (obj instanceof Map.Entry) && ij8.this.remove(((Map.Entry) obj).getKey()) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return ij8.this.size();
        }
    }

    public class b extends AbstractSet<K> {
        public b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            ij8.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return ij8.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            if (ij8.this.i instanceof h) {
                h hVar = (h) ij8.this.i;
                hVar.getClass();
                return new h.c();
            }
            j jVar = (j) ij8.this.i;
            jVar.getClass();
            return new j.d();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return ij8.this.remove(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return ij8.this.size();
        }
    }

    public class c extends AbstractCollection<V> {
        public c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            ij8.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return ij8.this.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            if (ij8.this.i instanceof h) {
                h hVar = (h) ij8.this.i;
                hVar.getClass();
                return new h.d();
            }
            j jVar = (j) ij8.this.i;
            jVar.getClass();
            return new j.e();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return ij8.this.size();
        }
    }

    public class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ gj8 f21204a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ k f21205b;

        public d(gj8 gj8Var, k kVar) {
            this.f21204a = gj8Var;
            this.f21205b = kVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            try {
                gj8 gj8Var = this.f21204a;
                k kVar = this.f21205b;
                gj8Var.a(kVar.d, kVar.c());
            } catch (Exception unused) {
            }
        }
    }

    public class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ WeakReference f21206a;

        public e(WeakReference weakReference) {
            this.f21206a = weakReference;
        }

        @Override // java.lang.Runnable
        public void run() {
            k<K, V> kVar = (k) this.f21206a.get();
            ij8.this.h.lock();
            if (kVar != null) {
                try {
                    if (kVar.g) {
                        ij8.this.i.remove(kVar.d);
                        ij8.this.m(kVar);
                    }
                } finally {
                    ij8.this.h.unlock();
                }
            }
            try {
                Iterator<k<K, V>> itK = ij8.this.i.k();
                boolean z = true;
                while (itK.hasNext() && z) {
                    k<K, V> next = itK.next();
                    if (next.f21217b.get() <= System.nanoTime()) {
                        itK.remove();
                        ij8.this.m(next);
                    } else {
                        ij8.this.p(next);
                        z = false;
                    }
                }
            } catch (NoSuchElementException unused) {
            }
        }
    }

    public static class f implements Map.Entry<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ k f21208a;

        public f(k kVar) {
            this.f21208a = kVar;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f21208a.d;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f21208a.f;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            throw new UnsupportedOperationException();
        }
    }

    public static final class g<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ExpirationPolicy f21209a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public List<gj8<K, V>> f21210b;
        public List<gj8<K, V>> c;
        public TimeUnit d;
        public boolean e;
        public long f;
        public int g;

        public /* synthetic */ g(a aVar) {
            this();
        }

        public static /* synthetic */ hj8 c(g gVar) {
            gVar.getClass();
            return null;
        }

        public static /* synthetic */ gc8 i(g gVar) {
            gVar.getClass();
            return null;
        }

        public <K1 extends K, V1 extends V> ij8<K1, V1> j() {
            return new ij8<>(this, null);
        }

        public g<K, V> k(long j, TimeUnit timeUnit) {
            this.f = j;
            this.d = (TimeUnit) pk1.a(timeUnit, "timeUnit");
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public <K1 extends K, V1 extends V> g<K1, V1> l(gj8<? super K1, ? super V1> gj8Var) {
            pk1.a(gj8Var, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            if (this.f21210b == null) {
                this.f21210b = new ArrayList();
            }
            this.f21210b.add(gj8Var);
            return this;
        }

        public g<K, V> m(ExpirationPolicy expirationPolicy) {
            this.f21209a = (ExpirationPolicy) pk1.a(expirationPolicy, "expirationPolicy");
            return this;
        }

        public g() {
            this.f21209a = ExpirationPolicy.CREATED;
            this.d = TimeUnit.SECONDS;
            this.f = 60L;
            this.g = Integer.MAX_VALUE;
        }
    }

    public static class h<K, V> extends LinkedHashMap<K, k<K, V>> implements i<K, V> {
        private static final long serialVersionUID = 1;

        public abstract class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Iterator<Map.Entry<K, k<K, V>>> f21211a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public k<K, V> f21212b;

            public a() {
                this.f21211a = h.this.entrySet().iterator();
            }

            public k<K, V> a() {
                k<K, V> value = this.f21211a.next().getValue();
                this.f21212b = value;
                return value;
            }

            public boolean hasNext() {
                return this.f21211a.hasNext();
            }

            public void remove() {
                this.f21211a.remove();
            }
        }

        public final class b extends h<K, V>.a implements Iterator<Map.Entry<K, V>> {
            public b() {
                super();
            }

            @Override // ij8.h.a
            public /* bridge */ /* synthetic */ k a() {
                return super.a();
            }

            @Override // java.util.Iterator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Map.Entry<K, V> next() {
                return ij8.l(a());
            }

            @Override // ij8.h.a, java.util.Iterator
            public /* bridge */ /* synthetic */ boolean hasNext() {
                return super.hasNext();
            }

            @Override // ij8.h.a, java.util.Iterator
            public /* bridge */ /* synthetic */ void remove() {
                super.remove();
            }
        }

        public final class c extends h<K, V>.a implements Iterator<K> {
            public c() {
                super();
            }

            @Override // java.util.Iterator
            public final K next() {
                return a().d;
            }
        }

        public final class d extends h<K, V>.a implements Iterator<V> {
            public d() {
                super();
            }

            @Override // java.util.Iterator
            public final V next() {
                return a().f;
            }
        }

        public h() {
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public boolean containsValue(Object obj) {
            Iterator<V> it = values().iterator();
            while (it.hasNext()) {
                V v = ((k) it.next()).f;
                if (v == obj) {
                    return true;
                }
                if (obj != null && obj.equals(v)) {
                    return true;
                }
            }
            return false;
        }

        @Override // ij8.i
        public k<K, V> first() {
            if (isEmpty()) {
                return null;
            }
            return (k) values().iterator().next();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // ij8.i
        public void h(k<K, V> kVar) {
            remove(kVar.d);
            kVar.d();
            put(kVar.d, kVar);
        }

        @Override // ij8.i
        public Iterator<k<K, V>> k() {
            return values().iterator();
        }

        public /* synthetic */ h(a aVar) {
            this();
        }
    }

    public interface i<K, V> extends Map<K, k<K, V>> {
        k<K, V> first();

        void h(k<K, V> kVar);

        Iterator<k<K, V>> k();
    }

    public static class k<K, V> implements Comparable<k<K, V>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AtomicLong f21216a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AtomicLong f21217b = new AtomicLong();
        public final AtomicReference<ExpirationPolicy> c;
        public final K d;
        public volatile Future<?> e;
        public V f;
        public volatile boolean g;

        public k(K k2, V v, AtomicReference<ExpirationPolicy> atomicReference, AtomicLong atomicLong) {
            this.d = k2;
            this.f = v;
            this.c = atomicReference;
            this.f21216a = atomicLong;
            d();
        }

        public synchronized boolean a() {
            boolean z;
            try {
                z = this.g;
                if (this.e != null) {
                    this.e.cancel(false);
                }
                this.e = null;
                this.g = false;
            } catch (Throwable th) {
                throw th;
            }
            return z;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compareTo(k<K, V> kVar) {
            if (this.d.equals(kVar.d)) {
                return 0;
            }
            return this.f21217b.get() < kVar.f21217b.get() ? -1 : 1;
        }

        public synchronized V c() {
            return this.f;
        }

        public void d() {
            this.f21217b.set(this.f21216a.get() + System.nanoTime());
        }

        public synchronized void e(Future<?> future) {
            this.e = future;
            this.g = true;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            k kVar = (k) obj;
            if (!this.d.equals(kVar.d)) {
                return false;
            }
            V v = this.f;
            if (v == null) {
                if (kVar.f != null) {
                    return false;
                }
            } else if (!v.equals(kVar.f)) {
                return false;
            }
            return true;
        }

        public synchronized void h(V v) {
            this.f = v;
        }

        public int hashCode() {
            K k2 = this.d;
            int iHashCode = ((k2 == null ? 0 : k2.hashCode()) + 31) * 31;
            V v = this.f;
            return iHashCode + (v != null ? v.hashCode() : 0);
        }

        public String toString() {
            return this.f.toString();
        }
    }

    public /* synthetic */ ij8(g gVar, a aVar) {
        this(gVar);
    }

    public static g<Object, Object> d() {
        return new g<>(null);
    }

    public static <K, V> Map.Entry<K, V> l(k<K, V> kVar) {
        return new f(kVar);
    }

    @Override // java.util.Map
    public void clear() {
        this.h.lock();
        try {
            Iterator<V> it = this.i.values().iterator();
            while (it.hasNext()) {
                ((k) it.next()).a();
            }
            this.i.clear();
        } finally {
            this.h.unlock();
        }
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        this.g.lock();
        try {
            return this.i.containsKey(obj);
        } finally {
            this.g.unlock();
        }
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        this.g.lock();
        try {
            return this.i.containsValue(obj);
        } finally {
            this.g.unlock();
        }
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return new a();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        this.g.lock();
        try {
            return this.i.equals(obj);
        } finally {
            this.g.unlock();
        }
    }

    public k<K, V> f(Object obj) {
        this.g.lock();
        try {
            return (k) this.i.get(obj);
        } finally {
            this.g.unlock();
        }
    }

    public final void g() {
        synchronized (ij8.class) {
            try {
                if (l == null) {
                    ThreadFactory qggVar = m;
                    if (qggVar == null) {
                        qggVar = new qgg("ExpiringMap-Listener-%s");
                    }
                    l = (ThreadPoolExecutor) Executors.newCachedThreadPool(qggVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public V get(Object obj) {
        k<K, V> kVarF = f(obj);
        if (kVarF == null) {
            return j(obj);
        }
        if (ExpirationPolicy.ACCESSED.equals(kVarF.c.get())) {
            o(kVarF, false);
        }
        return kVarF.c();
    }

    @Override // java.util.Map
    public int hashCode() {
        this.g.lock();
        try {
            return this.i.hashCode();
        } finally {
            this.g.unlock();
        }
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        this.g.lock();
        try {
            return this.i.isEmpty();
        } finally {
            this.g.unlock();
        }
    }

    public final V j(K k2) {
        return null;
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        return new b();
    }

    public void m(k<K, V> kVar) {
        List<gj8<K, V>> list = this.f21200b;
        if (list != null) {
            Iterator<gj8<K, V>> it = list.iterator();
            while (it.hasNext()) {
                l.execute(new d(it.next(), kVar));
            }
        }
        List<gj8<K, V>> list2 = this.f21199a;
        if (list2 != null) {
            Iterator<gj8<K, V>> it2 = list2.iterator();
            while (it2.hasNext()) {
                try {
                    it2.next().a(kVar.d, kVar.c());
                } catch (Exception unused) {
                }
            }
        }
    }

    public V n(K k2, V v, ExpirationPolicy expirationPolicy, long j2) {
        V vC;
        this.h.lock();
        try {
            k<K, V> kVar = (k) this.i.get(k2);
            if (kVar == null) {
                k<K, V> kVar2 = new k<>(k2, v, this.j ? new AtomicReference<>(expirationPolicy) : this.e, this.j ? new AtomicLong(j2) : this.c);
                if (this.i.size() >= this.d) {
                    k<K, V> kVarFirst = this.i.first();
                    this.i.remove(kVarFirst.d);
                    m(kVarFirst);
                }
                this.i.put(k2, kVar2);
                if (this.i.size() == 1 || this.i.first().equals(kVar2)) {
                    p(kVar2);
                }
                vC = null;
            } else {
                vC = kVar.c();
                if (!ExpirationPolicy.ACCESSED.equals(expirationPolicy) && ((vC == null && v == null) || (vC != null && vC.equals(v)))) {
                    return v;
                }
                kVar.h(v);
                o(kVar, false);
            }
            return vC;
        } finally {
            this.h.unlock();
        }
    }

    public void o(k<K, V> kVar, boolean z) {
        this.h.lock();
        try {
            boolean zA = kVar.a();
            this.i.h(kVar);
            if (zA || z) {
                p(this.i.first());
            }
        } finally {
            this.h.unlock();
        }
    }

    public void p(k<K, V> kVar) {
        if (kVar == null || kVar.g) {
            return;
        }
        synchronized (kVar) {
            try {
                if (kVar.g) {
                    return;
                }
                kVar.e(f21198k.schedule(new e(new WeakReference(kVar)), kVar.f21217b.get() - System.nanoTime(), TimeUnit.NANOSECONDS));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.Map
    public V put(K k2, V v) {
        pk1.a(k2, "key");
        return n(k2, v, this.e.get(), this.c.get());
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        pk1.a(map, "map");
        long j2 = this.c.get();
        ExpirationPolicy expirationPolicy = this.e.get();
        this.h.lock();
        try {
            for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
                n(entry.getKey(), entry.getValue(), expirationPolicy, j2);
            }
            this.h.unlock();
        } catch (Throwable th) {
            this.h.unlock();
            throw th;
        }
    }

    @Override // java.util.concurrent.ConcurrentMap, java.util.Map
    public V putIfAbsent(K k2, V v) {
        pk1.a(k2, "key");
        this.h.lock();
        try {
            return !this.i.containsKey(k2) ? n(k2, v, this.e.get(), this.c.get()) : (V) ((k) this.i.get(k2)).c();
        } finally {
            this.h.unlock();
        }
    }

    @Override // java.util.Map
    public V remove(Object obj) {
        pk1.a(obj, "key");
        this.h.lock();
        try {
            k kVar = (k) this.i.remove(obj);
            if (kVar == null) {
                return null;
            }
            if (kVar.a()) {
                p(this.i.first());
            }
            return (V) kVar.c();
        } finally {
            this.h.unlock();
        }
    }

    @Override // java.util.concurrent.ConcurrentMap, java.util.Map
    public V replace(K k2, V v) {
        pk1.a(k2, "key");
        this.h.lock();
        try {
            if (this.i.containsKey(k2)) {
                return n(k2, v, this.e.get(), this.c.get());
            }
            return null;
        } finally {
            this.h.unlock();
        }
    }

    @Override // java.util.Map
    public int size() {
        this.g.lock();
        try {
            return this.i.size();
        } finally {
            this.g.unlock();
        }
    }

    public String toString() {
        this.g.lock();
        try {
            return this.i.toString();
        } finally {
            this.g.unlock();
        }
    }

    @Override // java.util.Map
    public Collection<V> values() {
        return new c();
    }

    public static class j<K, V> extends HashMap<K, k<K, V>> implements i<K, V> {
        private static final long serialVersionUID = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public SortedSet<k<K, V>> f21213a;

        public abstract class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Iterator<k<K, V>> f21214a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public k<K, V> f21215b;

            public a() {
                this.f21214a = j.this.f21213a.iterator();
            }

            public k<K, V> a() {
                k<K, V> next = this.f21214a.next();
                this.f21215b = next;
                return next;
            }

            public boolean hasNext() {
                return this.f21214a.hasNext();
            }

            public void remove() {
                j.super.remove(this.f21215b.d);
                this.f21214a.remove();
            }
        }

        public final class b extends j<K, V>.a implements Iterator<Map.Entry<K, V>> {
            public b() {
                super();
            }

            @Override // java.util.Iterator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Map.Entry<K, V> next() {
                return ij8.l(a());
            }
        }

        public final class c extends j<K, V>.a implements Iterator<k<K, V>> {
            public c() {
                super();
            }

            @Override // java.util.Iterator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final k<K, V> next() {
                return a();
            }
        }

        public final class d extends j<K, V>.a implements Iterator<K> {
            public d() {
                super();
            }

            @Override // java.util.Iterator
            public final K next() {
                return a().d;
            }
        }

        public final class e extends j<K, V>.a implements Iterator<V> {
            public e() {
                super();
            }

            @Override // java.util.Iterator
            public final V next() {
                return a().f;
            }
        }

        public j() {
            this.f21213a = new ConcurrentSkipListSet();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public k<K, V> put(K k2, k<K, V> kVar) {
            this.f21213a.add(kVar);
            return (k) super.put(k2, kVar);
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public k<K, V> remove(Object obj) {
            k<K, V> kVar = (k) super.remove(obj);
            if (kVar != null) {
                this.f21213a.remove(kVar);
            }
            return kVar;
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public void clear() {
            super.clear();
            this.f21213a.clear();
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public boolean containsValue(Object obj) {
            Iterator<V> it = values().iterator();
            while (it.hasNext()) {
                V v = ((k) it.next()).f;
                if (v == obj) {
                    return true;
                }
                if (obj != null && obj.equals(v)) {
                    return true;
                }
            }
            return false;
        }

        @Override // ij8.i
        public k<K, V> first() {
            if (this.f21213a.isEmpty()) {
                return null;
            }
            return this.f21213a.first();
        }

        @Override // ij8.i
        public void h(k<K, V> kVar) {
            this.f21213a.remove(kVar);
            kVar.d();
            this.f21213a.add(kVar);
        }

        @Override // ij8.i
        public Iterator<k<K, V>> k() {
            return new c();
        }

        public /* synthetic */ j(a aVar) {
            this();
        }
    }

    public ij8(g<K, V> gVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f = reentrantReadWriteLock;
        this.g = reentrantReadWriteLock.readLock();
        this.h = reentrantReadWriteLock.writeLock();
        if (f21198k == null) {
            synchronized (ij8.class) {
                try {
                    if (f21198k == null) {
                        ThreadFactory threadFactory = m;
                        f21198k = Executors.newSingleThreadScheduledExecutor(threadFactory == null ? new qgg("ExpiringMap-Expirer") : threadFactory);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (l == null && gVar.c != null) {
            g();
        }
        boolean z = gVar.e;
        this.j = z;
        a aVar = null;
        this.i = z ? new j<>(aVar) : new h<>(aVar);
        if (gVar.f21210b != null) {
            this.f21199a = new CopyOnWriteArrayList(gVar.f21210b);
        }
        if (gVar.c != null) {
            this.f21200b = new CopyOnWriteArrayList(gVar.c);
        }
        this.e = new AtomicReference<>(gVar.f21209a);
        this.c = new AtomicLong(TimeUnit.NANOSECONDS.convert(gVar.f, gVar.d));
        this.d = gVar.g;
        g.i(gVar);
        g.c(gVar);
    }

    @Override // java.util.concurrent.ConcurrentMap, java.util.Map
    public boolean replace(K k2, V v, V v2) {
        pk1.a(k2, "key");
        this.h.lock();
        try {
            k kVar = (k) this.i.get(k2);
            if (kVar == null || !kVar.c().equals(v)) {
                return false;
            }
            n(k2, v2, this.e.get(), this.c.get());
            return true;
        } finally {
            this.h.unlock();
        }
    }

    @Override // java.util.concurrent.ConcurrentMap, java.util.Map
    public boolean remove(Object obj, Object obj2) {
        pk1.a(obj, "key");
        this.h.lock();
        try {
            k kVar = (k) this.i.get(obj);
            if (kVar == null || !kVar.c().equals(obj2)) {
                return false;
            }
            this.i.remove(obj);
            if (kVar.a()) {
                p(this.i.first());
            }
            return true;
        } finally {
            this.h.unlock();
        }
    }
}
