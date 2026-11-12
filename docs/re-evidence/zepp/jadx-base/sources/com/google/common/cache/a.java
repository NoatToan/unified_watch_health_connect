package com.google.common.cache;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Equivalence;
import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.base.Stopwatch;
import com.google.common.base.Ticker;
import com.google.common.collect.AbstractSequentialIterator;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterators;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.common.primitives.Ints;
import com.google.common.util.concurrent.ExecutionError;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.common.util.concurrent.SettableFuture;
import com.google.common.util.concurrent.UncheckedExecutionException;
import com.google.common.util.concurrent.Uninterruptibles;
import com.google.errorprone.annotations.concurrent.GuardedBy;
import com.google.j2objc.annotations.Weak;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractQueue;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible(emulated = true)
class a<K, V> extends AbstractMap<K, V> implements ConcurrentMap<K, V> {
    public static final int A = 16;
    public static final Logger B = Logger.getLogger(a.class.getName());
    public static final a0<Object, Object> C = new C0167a();
    public static final Queue<?> D = new b();
    public static final int w = 1073741824;
    public static final int x = 65536;
    public static final int y = 3;
    public static final int z = 63;
    public final int a;
    public final int b;
    public final r<K, V>[] c;
    public final int d;
    public final Equivalence<Object> e;
    public final Equivalence<Object> f;
    public final t g;
    public final t h;
    public final long i;
    public final Weigher<K, V> j;
    public final long k;
    public final long l;
    public final long m;
    public final Queue<RemovalNotification<K, V>> n;
    public final RemovalListener<K, V> o;
    public final Ticker p;
    public final f q;
    public final AbstractCache.StatsCounter r;

    @NullableDecl
    public final CacheLoader<? super K, V> s;

    @MonotonicNonNullDecl
    public Set<K> t;

    @MonotonicNonNullDecl
    public Collection<V> u;

    @MonotonicNonNullDecl
    public Set<Map.Entry<K, V>> v;

    /* JADX INFO: renamed from: com.google.common.cache.a$a, reason: collision with other inner class name */
    public static class C0167a implements a0<Object, Object> {
        @Override // com.google.common.cache.a.a0
        public com.google.common.cache.e<Object, Object> a() {
            return null;
        }

        @Override // com.google.common.cache.a.a0
        public void b(Object obj) {
        }

        @Override // com.google.common.cache.a.a0
        public Object c() {
            return null;
        }

        @Override // com.google.common.cache.a.a0
        public a0<Object, Object> d(ReferenceQueue<Object> referenceQueue, @NullableDecl Object obj, com.google.common.cache.e<Object, Object> eVar) {
            return this;
        }

        @Override // com.google.common.cache.a.a0
        public Object get() {
            return null;
        }

        @Override // com.google.common.cache.a.a0
        public int getWeight() {
            return 0;
        }

        @Override // com.google.common.cache.a.a0
        public boolean isActive() {
            return false;
        }

        @Override // com.google.common.cache.a.a0
        public boolean isLoading() {
            return false;
        }
    }

    public interface a0<K, V> {
        @NullableDecl
        com.google.common.cache.e<K, V> a();

        void b(@NullableDecl V v);

        V c() throws ExecutionException;

        a0<K, V> d(ReferenceQueue<V> referenceQueue, @NullableDecl V v, com.google.common.cache.e<K, V> eVar);

        @NullableDecl
        V get();

        int getWeight();

        boolean isActive();

        boolean isLoading();
    }

    public static class b extends AbstractQueue<Object> {
        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<Object> iterator() {
            return ImmutableSet.of().iterator();
        }

        @Override // java.util.Queue
        public boolean offer(Object obj) {
            return true;
        }

        @Override // java.util.Queue
        public Object peek() {
            return null;
        }

        @Override // java.util.Queue
        public Object poll() {
            return null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return 0;
        }
    }

    public final class b0 extends AbstractCollection<V> {
        private final ConcurrentMap<?, ?> a;

        public b0(ConcurrentMap<?, ?> concurrentMap) {
            this.a = concurrentMap;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            this.a.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return this.a.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return this.a.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return new z();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.a.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public Object[] toArray() {
            return a.Q(this).toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public <E> E[] toArray(E[] eArr) {
            return (E[]) a.Q(this).toArray(eArr);
        }
    }

    public abstract class c<T> extends AbstractSet<T> {

        @Weak
        public final ConcurrentMap<?, ?> a;

        public c(ConcurrentMap<?, ?> concurrentMap) {
            this.a = concurrentMap;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            this.a.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return this.a.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.a.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public Object[] toArray() {
            return a.Q(this).toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public <E> E[] toArray(E[] eArr) {
            return (E[]) a.Q(this).toArray(eArr);
        }
    }

    public static final class c0<K, V> extends e0<K, V> {
        public volatile long d;
        public com.google.common.cache.e<K, V> e;
        public com.google.common.cache.e<K, V> f;

        public c0(ReferenceQueue<K> referenceQueue, K k, int i, @NullableDecl com.google.common.cache.e<K, V> eVar) {
            super(referenceQueue, k, i, eVar);
            this.d = Long.MAX_VALUE;
            this.e = a.D();
            this.f = a.D();
        }

        @Override // com.google.common.cache.a.e0, com.google.common.cache.e
        public void e(com.google.common.cache.e<K, V> eVar) {
            this.f = eVar;
        }

        @Override // com.google.common.cache.a.e0, com.google.common.cache.e
        public void i(long j) {
            this.d = j;
        }

        @Override // com.google.common.cache.a.e0, com.google.common.cache.e
        public com.google.common.cache.e<K, V> k() {
            return this.f;
        }

        @Override // com.google.common.cache.a.e0, com.google.common.cache.e
        public com.google.common.cache.e<K, V> n() {
            return this.e;
        }

        @Override // com.google.common.cache.a.e0, com.google.common.cache.e
        public long o() {
            return this.d;
        }

        @Override // com.google.common.cache.a.e0, com.google.common.cache.e
        public void p(com.google.common.cache.e<K, V> eVar) {
            this.e = eVar;
        }
    }

    public static abstract class d<K, V> implements com.google.common.cache.e<K, V> {
        @Override // com.google.common.cache.e
        public a0<K, V> a() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.e
        public com.google.common.cache.e<K, V> b() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.e
        public int c() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.e
        public void e(com.google.common.cache.e<K, V> eVar) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.e
        public com.google.common.cache.e<K, V> f() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.e
        public void g(a0<K, V> a0Var) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.e
        public K getKey() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.e
        public long h() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.e
        public void i(long j) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.e
        public void j(long j) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.e
        public com.google.common.cache.e<K, V> k() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.e
        public com.google.common.cache.e<K, V> m() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.e
        public com.google.common.cache.e<K, V> n() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.e
        public long o() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.e
        public void p(com.google.common.cache.e<K, V> eVar) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.e
        public void q(com.google.common.cache.e<K, V> eVar) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.e
        public void r(com.google.common.cache.e<K, V> eVar) {
            throw new UnsupportedOperationException();
        }
    }

    public static final class d0<K, V> extends e0<K, V> {
        public volatile long d;
        public com.google.common.cache.e<K, V> e;
        public com.google.common.cache.e<K, V> f;
        public volatile long g;
        public com.google.common.cache.e<K, V> h;
        public com.google.common.cache.e<K, V> i;

        public d0(ReferenceQueue<K> referenceQueue, K k, int i, @NullableDecl com.google.common.cache.e<K, V> eVar) {
            super(referenceQueue, k, i, eVar);
            this.d = Long.MAX_VALUE;
            this.e = a.D();
            this.f = a.D();
            this.g = Long.MAX_VALUE;
            this.h = a.D();
            this.i = a.D();
        }

        @Override // com.google.common.cache.a.e0, com.google.common.cache.e
        public void e(com.google.common.cache.e<K, V> eVar) {
            this.f = eVar;
        }

        @Override // com.google.common.cache.a.e0, com.google.common.cache.e
        public com.google.common.cache.e<K, V> f() {
            return this.i;
        }

        @Override // com.google.common.cache.a.e0, com.google.common.cache.e
        public long h() {
            return this.g;
        }

        @Override // com.google.common.cache.a.e0, com.google.common.cache.e
        public void i(long j) {
            this.d = j;
        }

        @Override // com.google.common.cache.a.e0, com.google.common.cache.e
        public void j(long j) {
            this.g = j;
        }

        @Override // com.google.common.cache.a.e0, com.google.common.cache.e
        public com.google.common.cache.e<K, V> k() {
            return this.f;
        }

        @Override // com.google.common.cache.a.e0, com.google.common.cache.e
        public com.google.common.cache.e<K, V> m() {
            return this.h;
        }

        @Override // com.google.common.cache.a.e0, com.google.common.cache.e
        public com.google.common.cache.e<K, V> n() {
            return this.e;
        }

        @Override // com.google.common.cache.a.e0, com.google.common.cache.e
        public long o() {
            return this.d;
        }

        @Override // com.google.common.cache.a.e0, com.google.common.cache.e
        public void p(com.google.common.cache.e<K, V> eVar) {
            this.e = eVar;
        }

        @Override // com.google.common.cache.a.e0, com.google.common.cache.e
        public void q(com.google.common.cache.e<K, V> eVar) {
            this.h = eVar;
        }

        @Override // com.google.common.cache.a.e0, com.google.common.cache.e
        public void r(com.google.common.cache.e<K, V> eVar) {
            this.i = eVar;
        }
    }

    public static final class e<K, V> extends AbstractQueue<com.google.common.cache.e<K, V>> {
        public final com.google.common.cache.e<K, V> a = new C0168a();

        /* JADX INFO: renamed from: com.google.common.cache.a$e$a, reason: collision with other inner class name */
        public class C0168a extends d<K, V> {
            public com.google.common.cache.e<K, V> a = this;
            public com.google.common.cache.e<K, V> b = this;

            public C0168a() {
            }

            @Override // com.google.common.cache.a.d, com.google.common.cache.e
            public void e(com.google.common.cache.e<K, V> eVar) {
                this.b = eVar;
            }

            @Override // com.google.common.cache.a.d, com.google.common.cache.e
            public void i(long j) {
            }

            @Override // com.google.common.cache.a.d, com.google.common.cache.e
            public com.google.common.cache.e<K, V> k() {
                return this.b;
            }

            @Override // com.google.common.cache.a.d, com.google.common.cache.e
            public com.google.common.cache.e<K, V> n() {
                return this.a;
            }

            @Override // com.google.common.cache.a.d, com.google.common.cache.e
            public long o() {
                return Long.MAX_VALUE;
            }

            @Override // com.google.common.cache.a.d, com.google.common.cache.e
            public void p(com.google.common.cache.e<K, V> eVar) {
                this.a = eVar;
            }
        }

        public class b extends AbstractSequentialIterator<com.google.common.cache.e<K, V>> {
            public b(com.google.common.cache.e eVar) {
                super(eVar);
            }

            @Override // com.google.common.collect.AbstractSequentialIterator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public com.google.common.cache.e<K, V> computeNext(com.google.common.cache.e<K, V> eVar) {
                com.google.common.cache.e<K, V> eVarN = eVar.n();
                if (eVarN == e.this.a) {
                    return null;
                }
                return eVarN;
            }
        }

        @Override // java.util.Queue
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean offer(com.google.common.cache.e<K, V> eVar) {
            a.d(eVar.k(), eVar.n());
            a.d(this.a.k(), eVar);
            a.d(eVar, this.a);
            return true;
        }

        @Override // java.util.Queue
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public com.google.common.cache.e<K, V> peek() {
            com.google.common.cache.e<K, V> eVarN = this.a.n();
            if (eVarN == this.a) {
                return null;
            }
            return eVarN;
        }

        @Override // java.util.Queue
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public com.google.common.cache.e<K, V> poll() {
            com.google.common.cache.e<K, V> eVarN = this.a.n();
            if (eVarN == this.a) {
                return null;
            }
            remove(eVarN);
            return eVarN;
        }

        @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
        public void clear() {
            com.google.common.cache.e<K, V> eVarN = this.a.n();
            while (true) {
                com.google.common.cache.e<K, V> eVar = this.a;
                if (eVarN == eVar) {
                    eVar.p(eVar);
                    com.google.common.cache.e<K, V> eVar2 = this.a;
                    eVar2.e(eVar2);
                    return;
                } else {
                    com.google.common.cache.e<K, V> eVarN2 = eVarN.n();
                    a.E(eVarN);
                    eVarN = eVarN2;
                }
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return ((com.google.common.cache.e) obj).n() != q.INSTANCE;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return this.a.n() == this.a;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<com.google.common.cache.e<K, V>> iterator() {
            return new b(peek());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            com.google.common.cache.e eVar = (com.google.common.cache.e) obj;
            com.google.common.cache.e<K, V> eVarK = eVar.k();
            com.google.common.cache.e<K, V> eVarN = eVar.n();
            a.d(eVarK, eVarN);
            a.E(eVar);
            return eVarN != q.INSTANCE;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            int i = 0;
            for (com.google.common.cache.e<K, V> eVarN = this.a.n(); eVarN != this.a; eVarN = eVarN.n()) {
                i++;
            }
            return i;
        }
    }

    public static class e0<K, V> extends WeakReference<K> implements com.google.common.cache.e<K, V> {
        public final int a;

        @NullableDecl
        public final com.google.common.cache.e<K, V> b;
        public volatile a0<K, V> c;

        public e0(ReferenceQueue<K> referenceQueue, K k, int i, @NullableDecl com.google.common.cache.e<K, V> eVar) {
            super(k, referenceQueue);
            this.c = a.R();
            this.a = i;
            this.b = eVar;
        }

        @Override // com.google.common.cache.e
        public a0<K, V> a() {
            return this.c;
        }

        @Override // com.google.common.cache.e
        public com.google.common.cache.e<K, V> b() {
            return this.b;
        }

        @Override // com.google.common.cache.e
        public int c() {
            return this.a;
        }

        public void e(com.google.common.cache.e<K, V> eVar) {
            throw new UnsupportedOperationException();
        }

        public com.google.common.cache.e<K, V> f() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.e
        public void g(a0<K, V> a0Var) {
            this.c = a0Var;
        }

        @Override // com.google.common.cache.e
        public K getKey() {
            return get();
        }

        public long h() {
            throw new UnsupportedOperationException();
        }

        public void i(long j) {
            throw new UnsupportedOperationException();
        }

        public void j(long j) {
            throw new UnsupportedOperationException();
        }

        public com.google.common.cache.e<K, V> k() {
            throw new UnsupportedOperationException();
        }

        public com.google.common.cache.e<K, V> m() {
            throw new UnsupportedOperationException();
        }

        public com.google.common.cache.e<K, V> n() {
            throw new UnsupportedOperationException();
        }

        public long o() {
            throw new UnsupportedOperationException();
        }

        public void p(com.google.common.cache.e<K, V> eVar) {
            throw new UnsupportedOperationException();
        }

        public void q(com.google.common.cache.e<K, V> eVar) {
            throw new UnsupportedOperationException();
        }

        public void r(com.google.common.cache.e<K, V> eVar) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static abstract class f {
        private static final /* synthetic */ f[] $VALUES;
        public static final int ACCESS_MASK = 1;
        public static final f STRONG;
        public static final f STRONG_ACCESS;
        public static final f STRONG_ACCESS_WRITE;
        public static final f STRONG_WRITE;
        public static final f WEAK;
        public static final f WEAK_ACCESS;
        public static final f WEAK_ACCESS_WRITE;
        public static final int WEAK_MASK = 4;
        public static final f WEAK_WRITE;
        public static final int WRITE_MASK = 2;
        public static final f[] factories;

        /* JADX INFO: renamed from: com.google.common.cache.a$f$a, reason: collision with other inner class name */
        public static enum C0169a extends f {
            public C0169a(String str, int i) {
                super(str, i, null);
            }

            @Override // com.google.common.cache.a.f
            public <K, V> com.google.common.cache.e<K, V> f(r<K, V> rVar, K k, int i, @NullableDecl com.google.common.cache.e<K, V> eVar) {
                return new w(k, i, eVar);
            }
        }

        public static enum b extends f {
            public b(String str, int i) {
                super(str, i, null);
            }

            @Override // com.google.common.cache.a.f
            public <K, V> com.google.common.cache.e<K, V> b(r<K, V> rVar, com.google.common.cache.e<K, V> eVar, com.google.common.cache.e<K, V> eVar2) {
                com.google.common.cache.e<K, V> eVarB = super.b(rVar, eVar, eVar2);
                a(eVar, eVarB);
                return eVarB;
            }

            @Override // com.google.common.cache.a.f
            public <K, V> com.google.common.cache.e<K, V> f(r<K, V> rVar, K k, int i, @NullableDecl com.google.common.cache.e<K, V> eVar) {
                return new u(k, i, eVar);
            }
        }

        public static enum c extends f {
            public c(String str, int i) {
                super(str, i, null);
            }

            @Override // com.google.common.cache.a.f
            public <K, V> com.google.common.cache.e<K, V> b(r<K, V> rVar, com.google.common.cache.e<K, V> eVar, com.google.common.cache.e<K, V> eVar2) {
                com.google.common.cache.e<K, V> eVarB = super.b(rVar, eVar, eVar2);
                c(eVar, eVarB);
                return eVarB;
            }

            @Override // com.google.common.cache.a.f
            public <K, V> com.google.common.cache.e<K, V> f(r<K, V> rVar, K k, int i, @NullableDecl com.google.common.cache.e<K, V> eVar) {
                return new y(k, i, eVar);
            }
        }

        public static enum d extends f {
            public d(String str, int i) {
                super(str, i, null);
            }

            @Override // com.google.common.cache.a.f
            public <K, V> com.google.common.cache.e<K, V> b(r<K, V> rVar, com.google.common.cache.e<K, V> eVar, com.google.common.cache.e<K, V> eVar2) {
                com.google.common.cache.e<K, V> eVarB = super.b(rVar, eVar, eVar2);
                a(eVar, eVarB);
                c(eVar, eVarB);
                return eVarB;
            }

            @Override // com.google.common.cache.a.f
            public <K, V> com.google.common.cache.e<K, V> f(r<K, V> rVar, K k, int i, @NullableDecl com.google.common.cache.e<K, V> eVar) {
                return new v(k, i, eVar);
            }
        }

        public static enum e extends f {
            public e(String str, int i) {
                super(str, i, null);
            }

            @Override // com.google.common.cache.a.f
            public <K, V> com.google.common.cache.e<K, V> f(r<K, V> rVar, K k, int i, @NullableDecl com.google.common.cache.e<K, V> eVar) {
                return new e0(rVar.h, k, i, eVar);
            }
        }

        /* JADX INFO: renamed from: com.google.common.cache.a$f$f, reason: collision with other inner class name */
        public static enum C0170f extends f {
            public C0170f(String str, int i) {
                super(str, i, null);
            }

            @Override // com.google.common.cache.a.f
            public <K, V> com.google.common.cache.e<K, V> b(r<K, V> rVar, com.google.common.cache.e<K, V> eVar, com.google.common.cache.e<K, V> eVar2) {
                com.google.common.cache.e<K, V> eVarB = super.b(rVar, eVar, eVar2);
                a(eVar, eVarB);
                return eVarB;
            }

            @Override // com.google.common.cache.a.f
            public <K, V> com.google.common.cache.e<K, V> f(r<K, V> rVar, K k, int i, @NullableDecl com.google.common.cache.e<K, V> eVar) {
                return new c0(rVar.h, k, i, eVar);
            }
        }

        public static enum g extends f {
            public g(String str, int i) {
                super(str, i, null);
            }

            @Override // com.google.common.cache.a.f
            public <K, V> com.google.common.cache.e<K, V> b(r<K, V> rVar, com.google.common.cache.e<K, V> eVar, com.google.common.cache.e<K, V> eVar2) {
                com.google.common.cache.e<K, V> eVarB = super.b(rVar, eVar, eVar2);
                c(eVar, eVarB);
                return eVarB;
            }

            @Override // com.google.common.cache.a.f
            public <K, V> com.google.common.cache.e<K, V> f(r<K, V> rVar, K k, int i, @NullableDecl com.google.common.cache.e<K, V> eVar) {
                return new g0(rVar.h, k, i, eVar);
            }
        }

        public static enum h extends f {
            public h(String str, int i) {
                super(str, i, null);
            }

            @Override // com.google.common.cache.a.f
            public <K, V> com.google.common.cache.e<K, V> b(r<K, V> rVar, com.google.common.cache.e<K, V> eVar, com.google.common.cache.e<K, V> eVar2) {
                com.google.common.cache.e<K, V> eVarB = super.b(rVar, eVar, eVar2);
                a(eVar, eVarB);
                c(eVar, eVarB);
                return eVarB;
            }

            @Override // com.google.common.cache.a.f
            public <K, V> com.google.common.cache.e<K, V> f(r<K, V> rVar, K k, int i, @NullableDecl com.google.common.cache.e<K, V> eVar) {
                return new d0(rVar.h, k, i, eVar);
            }
        }

        static {
            C0169a c0169a = new C0169a("STRONG", 0);
            STRONG = c0169a;
            b bVar = new b("STRONG_ACCESS", 1);
            STRONG_ACCESS = bVar;
            c cVar = new c("STRONG_WRITE", 2);
            STRONG_WRITE = cVar;
            d dVar = new d("STRONG_ACCESS_WRITE", 3);
            STRONG_ACCESS_WRITE = dVar;
            e eVar = new e("WEAK", 4);
            WEAK = eVar;
            C0170f c0170f = new C0170f("WEAK_ACCESS", 5);
            WEAK_ACCESS = c0170f;
            g gVar = new g("WEAK_WRITE", 6);
            WEAK_WRITE = gVar;
            h hVar = new h("WEAK_ACCESS_WRITE", 7);
            WEAK_ACCESS_WRITE = hVar;
            $VALUES = new f[]{c0169a, bVar, cVar, dVar, eVar, c0170f, gVar, hVar};
            factories = new f[]{c0169a, bVar, cVar, dVar, eVar, c0170f, gVar, hVar};
        }

        private f(String str, int i) {
            super(str, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static f e(t tVar, boolean z, boolean z2) {
            return factories[((tVar == t.WEAK ? (char) 4 : (char) 0) | (z ? 1 : 0) ? 1 : 0) | (z2 ? 2 : 0)];
        }

        public static f valueOf(String str) {
            return (f) Enum.valueOf(f.class, str);
        }

        public static f[] values() {
            return (f[]) $VALUES.clone();
        }

        public <K, V> void a(com.google.common.cache.e<K, V> eVar, com.google.common.cache.e<K, V> eVar2) {
            eVar2.i(eVar.o());
            a.d(eVar.k(), eVar2);
            a.d(eVar2, eVar.n());
            a.E(eVar);
        }

        public <K, V> com.google.common.cache.e<K, V> b(r<K, V> rVar, com.google.common.cache.e<K, V> eVar, com.google.common.cache.e<K, V> eVar2) {
            return f(rVar, eVar.getKey(), eVar.c(), eVar2);
        }

        public <K, V> void c(com.google.common.cache.e<K, V> eVar, com.google.common.cache.e<K, V> eVar2) {
            eVar2.j(eVar.h());
            a.e(eVar.f(), eVar2);
            a.e(eVar2, eVar.m());
            a.F(eVar);
        }

        public abstract <K, V> com.google.common.cache.e<K, V> f(r<K, V> rVar, K k, int i, @NullableDecl com.google.common.cache.e<K, V> eVar);

        public /* synthetic */ f(String str, int i, C0167a c0167a) {
            this(str, i);
        }
    }

    public static class f0<K, V> extends WeakReference<V> implements a0<K, V> {
        public final com.google.common.cache.e<K, V> a;

        public f0(ReferenceQueue<V> referenceQueue, V v, com.google.common.cache.e<K, V> eVar) {
            super(v, referenceQueue);
            this.a = eVar;
        }

        @Override // com.google.common.cache.a.a0
        public com.google.common.cache.e<K, V> a() {
            return this.a;
        }

        @Override // com.google.common.cache.a.a0
        public void b(V v) {
        }

        @Override // com.google.common.cache.a.a0
        public V c() {
            return get();
        }

        @Override // com.google.common.cache.a.a0
        public a0<K, V> d(ReferenceQueue<V> referenceQueue, V v, com.google.common.cache.e<K, V> eVar) {
            return new f0(referenceQueue, v, eVar);
        }

        @Override // com.google.common.cache.a.a0
        public int getWeight() {
            return 1;
        }

        @Override // com.google.common.cache.a.a0
        public boolean isActive() {
            return true;
        }

        @Override // com.google.common.cache.a.a0
        public boolean isLoading() {
            return false;
        }
    }

    public final class g extends a<K, V>.i<Map.Entry<K, V>> {
        public g() {
            super();
        }

        @Override // com.google.common.cache.a.i, java.util.Iterator
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            return c();
        }
    }

    public static final class g0<K, V> extends e0<K, V> {
        public volatile long d;
        public com.google.common.cache.e<K, V> e;
        public com.google.common.cache.e<K, V> f;

        public g0(ReferenceQueue<K> referenceQueue, K k, int i, @NullableDecl com.google.common.cache.e<K, V> eVar) {
            super(referenceQueue, k, i, eVar);
            this.d = Long.MAX_VALUE;
            this.e = a.D();
            this.f = a.D();
        }

        @Override // com.google.common.cache.a.e0, com.google.common.cache.e
        public com.google.common.cache.e<K, V> f() {
            return this.f;
        }

        @Override // com.google.common.cache.a.e0, com.google.common.cache.e
        public long h() {
            return this.d;
        }

        @Override // com.google.common.cache.a.e0, com.google.common.cache.e
        public void j(long j) {
            this.d = j;
        }

        @Override // com.google.common.cache.a.e0, com.google.common.cache.e
        public com.google.common.cache.e<K, V> m() {
            return this.e;
        }

        @Override // com.google.common.cache.a.e0, com.google.common.cache.e
        public void q(com.google.common.cache.e<K, V> eVar) {
            this.e = eVar;
        }

        @Override // com.google.common.cache.a.e0, com.google.common.cache.e
        public void r(com.google.common.cache.e<K, V> eVar) {
            this.f = eVar;
        }
    }

    public final class h extends a<K, V>.c<Map.Entry<K, V>> {
        public h(ConcurrentMap<?, ?> concurrentMap) {
            super(concurrentMap);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry;
            Object key;
            Object obj2;
            return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && (obj2 = a.this.get(key)) != null && a.this.f.equivalent(entry.getValue(), obj2);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new g();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry;
            Object key;
            return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && a.this.remove(key, entry.getValue());
        }
    }

    public static final class h0<K, V> extends s<K, V> {
        public final int b;

        public h0(ReferenceQueue<V> referenceQueue, V v, com.google.common.cache.e<K, V> eVar, int i) {
            super(referenceQueue, v, eVar);
            this.b = i;
        }

        @Override // com.google.common.cache.a.s, com.google.common.cache.a.a0
        public a0<K, V> d(ReferenceQueue<V> referenceQueue, V v, com.google.common.cache.e<K, V> eVar) {
            return new h0(referenceQueue, v, eVar, this.b);
        }

        @Override // com.google.common.cache.a.s, com.google.common.cache.a.a0
        public int getWeight() {
            return this.b;
        }
    }

    public abstract class i<T> implements Iterator<T> {
        public int a;
        public int b = -1;

        @MonotonicNonNullDecl
        public r<K, V> c;

        @MonotonicNonNullDecl
        public AtomicReferenceArray<com.google.common.cache.e<K, V>> d;

        @NullableDecl
        public com.google.common.cache.e<K, V> e;

        @NullableDecl
        public a<K, V>.l0 f;

        @NullableDecl
        public a<K, V>.l0 g;

        public i() {
            this.a = a.this.c.length - 1;
            a();
        }

        public final void a() {
            this.f = null;
            if (d() || e()) {
                return;
            }
            while (true) {
                int i = this.a;
                if (i < 0) {
                    return;
                }
                r<K, V>[] rVarArr = a.this.c;
                this.a = i - 1;
                r<K, V> rVar = rVarArr[i];
                this.c = rVar;
                if (rVar.b != 0) {
                    AtomicReferenceArray<com.google.common.cache.e<K, V>> atomicReferenceArray = this.c.f;
                    this.d = atomicReferenceArray;
                    this.b = atomicReferenceArray.length() - 1;
                    if (e()) {
                        return;
                    }
                }
            }
        }

        public boolean b(com.google.common.cache.e<K, V> eVar) {
            boolean z;
            try {
                long j = a.this.p.read();
                K key = eVar.getKey();
                Object objS = a.this.s(eVar, j);
                if (objS != null) {
                    this.f = new l0(key, objS);
                    z = true;
                } else {
                    z = false;
                }
                return z;
            } finally {
                this.c.H();
            }
        }

        public a<K, V>.l0 c() {
            a<K, V>.l0 l0Var = this.f;
            if (l0Var == null) {
                throw new NoSuchElementException();
            }
            this.g = l0Var;
            a();
            return this.g;
        }

        public boolean d() {
            com.google.common.cache.e<K, V> eVar = this.e;
            if (eVar == null) {
                return false;
            }
            while (true) {
                this.e = eVar.b();
                com.google.common.cache.e<K, V> eVar2 = this.e;
                if (eVar2 == null) {
                    return false;
                }
                if (b(eVar2)) {
                    return true;
                }
                eVar = this.e;
            }
        }

        public boolean e() {
            while (true) {
                int i = this.b;
                if (i < 0) {
                    return false;
                }
                AtomicReferenceArray<com.google.common.cache.e<K, V>> atomicReferenceArray = this.d;
                this.b = i - 1;
                com.google.common.cache.e<K, V> eVar = atomicReferenceArray.get(i);
                this.e = eVar;
                if (eVar != null && (b(eVar) || d())) {
                    return true;
                }
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f != null;
        }

        @Override // java.util.Iterator
        public abstract T next();

        @Override // java.util.Iterator
        public void remove() {
            Preconditions.checkState(this.g != null);
            a.this.remove(this.g.getKey());
            this.g = null;
        }
    }

    public static final class i0<K, V> extends x<K, V> {
        public final int b;

        public i0(V v, int i) {
            super(v);
            this.b = i;
        }

        @Override // com.google.common.cache.a.x, com.google.common.cache.a.a0
        public int getWeight() {
            return this.b;
        }
    }

    public final class j extends a<K, V>.i<K> {
        public j() {
            super();
        }

        @Override // com.google.common.cache.a.i, java.util.Iterator
        public K next() {
            return c().getKey();
        }
    }

    public static final class j0<K, V> extends f0<K, V> {
        public final int b;

        public j0(ReferenceQueue<V> referenceQueue, V v, com.google.common.cache.e<K, V> eVar, int i) {
            super(referenceQueue, v, eVar);
            this.b = i;
        }

        @Override // com.google.common.cache.a.f0, com.google.common.cache.a.a0
        public a0<K, V> d(ReferenceQueue<V> referenceQueue, V v, com.google.common.cache.e<K, V> eVar) {
            return new j0(referenceQueue, v, eVar, this.b);
        }

        @Override // com.google.common.cache.a.f0, com.google.common.cache.a.a0
        public int getWeight() {
            return this.b;
        }
    }

    public final class k extends a<K, V>.c<K> {
        public k(ConcurrentMap<?, ?> concurrentMap) {
            super(concurrentMap);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.a.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new j();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return this.a.remove(obj) != null;
        }
    }

    public static final class k0<K, V> extends AbstractQueue<com.google.common.cache.e<K, V>> {
        public final com.google.common.cache.e<K, V> a = new C0171a();

        /* JADX INFO: renamed from: com.google.common.cache.a$k0$a, reason: collision with other inner class name */
        public class C0171a extends d<K, V> {
            public com.google.common.cache.e<K, V> a = this;
            public com.google.common.cache.e<K, V> b = this;

            public C0171a() {
            }

            @Override // com.google.common.cache.a.d, com.google.common.cache.e
            public com.google.common.cache.e<K, V> f() {
                return this.b;
            }

            @Override // com.google.common.cache.a.d, com.google.common.cache.e
            public long h() {
                return Long.MAX_VALUE;
            }

            @Override // com.google.common.cache.a.d, com.google.common.cache.e
            public void j(long j) {
            }

            @Override // com.google.common.cache.a.d, com.google.common.cache.e
            public com.google.common.cache.e<K, V> m() {
                return this.a;
            }

            @Override // com.google.common.cache.a.d, com.google.common.cache.e
            public void q(com.google.common.cache.e<K, V> eVar) {
                this.a = eVar;
            }

            @Override // com.google.common.cache.a.d, com.google.common.cache.e
            public void r(com.google.common.cache.e<K, V> eVar) {
                this.b = eVar;
            }
        }

        public class b extends AbstractSequentialIterator<com.google.common.cache.e<K, V>> {
            public b(com.google.common.cache.e eVar) {
                super(eVar);
            }

            @Override // com.google.common.collect.AbstractSequentialIterator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public com.google.common.cache.e<K, V> computeNext(com.google.common.cache.e<K, V> eVar) {
                com.google.common.cache.e<K, V> eVarM = eVar.m();
                if (eVarM == k0.this.a) {
                    return null;
                }
                return eVarM;
            }
        }

        @Override // java.util.Queue
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean offer(com.google.common.cache.e<K, V> eVar) {
            a.e(eVar.f(), eVar.m());
            a.e(this.a.f(), eVar);
            a.e(eVar, this.a);
            return true;
        }

        @Override // java.util.Queue
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public com.google.common.cache.e<K, V> peek() {
            com.google.common.cache.e<K, V> eVarM = this.a.m();
            if (eVarM == this.a) {
                return null;
            }
            return eVarM;
        }

        @Override // java.util.Queue
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public com.google.common.cache.e<K, V> poll() {
            com.google.common.cache.e<K, V> eVarM = this.a.m();
            if (eVarM == this.a) {
                return null;
            }
            remove(eVarM);
            return eVarM;
        }

        @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
        public void clear() {
            com.google.common.cache.e<K, V> eVarM = this.a.m();
            while (true) {
                com.google.common.cache.e<K, V> eVar = this.a;
                if (eVarM == eVar) {
                    eVar.q(eVar);
                    com.google.common.cache.e<K, V> eVar2 = this.a;
                    eVar2.r(eVar2);
                    return;
                } else {
                    com.google.common.cache.e<K, V> eVarM2 = eVarM.m();
                    a.F(eVarM);
                    eVarM = eVarM2;
                }
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return ((com.google.common.cache.e) obj).m() != q.INSTANCE;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return this.a.m() == this.a;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<com.google.common.cache.e<K, V>> iterator() {
            return new b(peek());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            com.google.common.cache.e eVar = (com.google.common.cache.e) obj;
            com.google.common.cache.e<K, V> eVarF = eVar.f();
            com.google.common.cache.e<K, V> eVarM = eVar.m();
            a.e(eVarF, eVarM);
            a.F(eVar);
            return eVarM != q.INSTANCE;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            int i = 0;
            for (com.google.common.cache.e<K, V> eVarM = this.a.m(); eVarM != this.a; eVarM = eVarM.m()) {
                i++;
            }
            return i;
        }
    }

    public static final class l<K, V> extends p<K, V> implements LoadingCache<K, V>, Serializable {
        private static final long serialVersionUID = 1;

        @MonotonicNonNullDecl
        public transient LoadingCache<K, V> n;

        public l(a<K, V> aVar) {
            super(aVar);
        }

        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            this.n = (LoadingCache<K, V>) e().build(this.l);
        }

        private Object readResolve() {
            return this.n;
        }

        @Override // com.google.common.cache.LoadingCache, com.google.common.base.Function
        public final V apply(K k) {
            return this.n.apply(k);
        }

        @Override // com.google.common.cache.LoadingCache
        public V get(K k) throws ExecutionException {
            return this.n.get(k);
        }

        @Override // com.google.common.cache.LoadingCache
        public ImmutableMap<K, V> getAll(Iterable<? extends K> iterable) throws ExecutionException {
            return this.n.getAll(iterable);
        }

        @Override // com.google.common.cache.LoadingCache
        public V getUnchecked(K k) {
            return this.n.getUnchecked(k);
        }

        @Override // com.google.common.cache.LoadingCache
        public void refresh(K k) {
            this.n.refresh(k);
        }
    }

    public final class l0 implements Map.Entry<K, V> {
        public final K a;
        public V b;

        public l0(K k, V v) {
            this.a = k;
            this.b = v;
        }

        @Override // java.util.Map.Entry
        public boolean equals(@NullableDecl Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return this.a.equals(entry.getKey()) && this.b.equals(entry.getValue());
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.a;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.a.hashCode() ^ this.b.hashCode();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            V v2 = (V) a.this.put(this.a, v);
            this.b = v;
            return v2;
        }

        public String toString() {
            return getKey() + SearchCriteria.EQ + getValue();
        }
    }

    public static class m<K, V> implements a0<K, V> {
        public volatile a0<K, V> a;
        public final SettableFuture<V> b;
        public final Stopwatch c;

        /* JADX INFO: renamed from: com.google.common.cache.a$m$a, reason: collision with other inner class name */
        public class C0172a implements Function<V, V> {
            public C0172a() {
            }

            @Override // com.google.common.base.Function
            public V apply(V v) {
                m.this.i(v);
                return v;
            }
        }

        public m() {
            this(a.R());
        }

        private ListenableFuture<V> f(Throwable th) {
            return Futures.immediateFailedFuture(th);
        }

        @Override // com.google.common.cache.a.a0
        public com.google.common.cache.e<K, V> a() {
            return null;
        }

        @Override // com.google.common.cache.a.a0
        public void b(@NullableDecl V v) {
            if (v != null) {
                i(v);
            } else {
                this.a = a.R();
            }
        }

        @Override // com.google.common.cache.a.a0
        public V c() throws ExecutionException {
            return (V) Uninterruptibles.getUninterruptibly(this.b);
        }

        @Override // com.google.common.cache.a.a0
        public a0<K, V> d(ReferenceQueue<V> referenceQueue, @NullableDecl V v, com.google.common.cache.e<K, V> eVar) {
            return this;
        }

        public long e() {
            return this.c.elapsed(TimeUnit.NANOSECONDS);
        }

        public a0<K, V> g() {
            return this.a;
        }

        @Override // com.google.common.cache.a.a0
        public V get() {
            return this.a.get();
        }

        @Override // com.google.common.cache.a.a0
        public int getWeight() {
            return this.a.getWeight();
        }

        public ListenableFuture<V> h(K k, CacheLoader<? super K, V> cacheLoader) {
            try {
                this.c.start();
                V v = this.a.get();
                if (v == null) {
                    V vLoad = cacheLoader.load(k);
                    return i(vLoad) ? this.b : Futures.immediateFuture(vLoad);
                }
                ListenableFuture<V> listenableFutureReload = cacheLoader.reload(k, v);
                return listenableFutureReload == null ? Futures.immediateFuture(null) : Futures.transform(listenableFutureReload, new C0172a(), MoreExecutors.directExecutor());
            } catch (Throwable th) {
                ListenableFuture<V> listenableFutureF = j(th) ? this.b : f(th);
                if (th instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                return listenableFutureF;
            }
        }

        public boolean i(@NullableDecl V v) {
            return this.b.set(v);
        }

        @Override // com.google.common.cache.a.a0
        public boolean isActive() {
            return this.a.isActive();
        }

        @Override // com.google.common.cache.a.a0
        public boolean isLoading() {
            return true;
        }

        public boolean j(Throwable th) {
            return this.b.setException(th);
        }

        public m(a0<K, V> a0Var) {
            this.b = SettableFuture.create();
            this.c = Stopwatch.createUnstarted();
            this.a = a0Var;
        }
    }

    public static class n<K, V> extends o<K, V> implements LoadingCache<K, V> {
        private static final long serialVersionUID = 1;

        public n(CacheBuilder<? super K, ? super V> cacheBuilder, CacheLoader<? super K, V> cacheLoader) {
            super(new a(cacheBuilder, (CacheLoader) Preconditions.checkNotNull(cacheLoader)), null);
        }

        @Override // com.google.common.cache.LoadingCache, com.google.common.base.Function
        public final V apply(K k) {
            return getUnchecked(k);
        }

        @Override // com.google.common.cache.LoadingCache
        public V get(K k) throws ExecutionException {
            return this.a.t(k);
        }

        @Override // com.google.common.cache.LoadingCache
        public ImmutableMap<K, V> getAll(Iterable<? extends K> iterable) throws ExecutionException {
            return this.a.o(iterable);
        }

        @Override // com.google.common.cache.LoadingCache
        public V getUnchecked(K k) {
            try {
                return get(k);
            } catch (ExecutionException e) {
                throw new UncheckedExecutionException(e.getCause());
            }
        }

        @Override // com.google.common.cache.LoadingCache
        public void refresh(K k) {
            this.a.M(k);
        }

        @Override // com.google.common.cache.a.o
        public Object writeReplace() {
            return new l(this.a);
        }
    }

    public static class o<K, V> implements Cache<K, V>, Serializable {
        private static final long serialVersionUID = 1;
        public final a<K, V> a;

        /* JADX INFO: renamed from: com.google.common.cache.a$o$a, reason: collision with other inner class name */
        public class C0173a extends CacheLoader<Object, V> {
            public final /* synthetic */ Callable a;

            public C0173a(Callable callable) {
                this.a = callable;
            }

            @Override // com.google.common.cache.CacheLoader
            public V load(Object obj) throws Exception {
                return (V) this.a.call();
            }
        }

        public /* synthetic */ o(a aVar, C0167a c0167a) {
            this(aVar);
        }

        @Override // com.google.common.cache.Cache
        public ConcurrentMap<K, V> asMap() {
            return this.a;
        }

        @Override // com.google.common.cache.Cache
        public void cleanUp() {
            this.a.c();
        }

        @Override // com.google.common.cache.Cache
        public V get(K k, Callable<? extends V> callable) throws ExecutionException {
            Preconditions.checkNotNull(callable);
            return this.a.n(k, new C0173a(callable));
        }

        @Override // com.google.common.cache.Cache
        public ImmutableMap<K, V> getAllPresent(Iterable<?> iterable) {
            return this.a.p(iterable);
        }

        @Override // com.google.common.cache.Cache
        @NullableDecl
        public V getIfPresent(Object obj) {
            return this.a.r(obj);
        }

        @Override // com.google.common.cache.Cache
        public void invalidate(Object obj) {
            Preconditions.checkNotNull(obj);
            this.a.remove(obj);
        }

        @Override // com.google.common.cache.Cache
        public void invalidateAll(Iterable<?> iterable) {
            this.a.v(iterable);
        }

        @Override // com.google.common.cache.Cache
        public void put(K k, V v) {
            this.a.put(k, v);
        }

        @Override // com.google.common.cache.Cache
        public void putAll(Map<? extends K, ? extends V> map) {
            this.a.putAll(map);
        }

        @Override // com.google.common.cache.Cache
        public long size() {
            return this.a.z();
        }

        @Override // com.google.common.cache.Cache
        public CacheStats stats() {
            AbstractCache.SimpleStatsCounter simpleStatsCounter = new AbstractCache.SimpleStatsCounter();
            simpleStatsCounter.incrementBy(this.a.r);
            for (r<K, V> rVar : this.a.c) {
                simpleStatsCounter.incrementBy(rVar.n);
            }
            return simpleStatsCounter.snapshot();
        }

        Object writeReplace() {
            return new p(this.a);
        }

        public o(CacheBuilder<? super K, ? super V> cacheBuilder) {
            this(new a(cacheBuilder, null));
        }

        @Override // com.google.common.cache.Cache
        public void invalidateAll() {
            this.a.clear();
        }

        private o(a<K, V> aVar) {
            this.a = aVar;
        }
    }

    public static class p<K, V> extends ForwardingCache<K, V> implements Serializable {
        private static final long serialVersionUID = 1;
        public final t a;
        public final t b;
        public final Equivalence<Object> c;
        public final Equivalence<Object> d;
        public final long e;
        public final long f;
        public final long g;
        public final Weigher<K, V> h;
        public final int i;
        public final RemovalListener<? super K, ? super V> j;

        @NullableDecl
        public final Ticker k;
        public final CacheLoader<? super K, V> l;

        @MonotonicNonNullDecl
        public transient Cache<K, V> m;

        public p(a<K, V> aVar) {
            this(aVar.g, aVar.h, aVar.e, aVar.f, aVar.l, aVar.k, aVar.i, aVar.j, aVar.d, aVar.o, aVar.p, aVar.s);
        }

        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            this.m = (Cache<K, V>) e().build();
        }

        private Object readResolve() {
            return this.m;
        }

        public CacheBuilder<K, V> e() {
            CacheBuilder<K, V> cacheBuilder = (CacheBuilder<K, V>) CacheBuilder.newBuilder().t(this.a).u(this.b).r(this.c).v(this.d).concurrencyLevel(this.i).removalListener(this.j);
            cacheBuilder.a = false;
            long j = this.e;
            if (j > 0) {
                cacheBuilder.expireAfterWrite(j, TimeUnit.NANOSECONDS);
            }
            long j2 = this.f;
            if (j2 > 0) {
                cacheBuilder.expireAfterAccess(j2, TimeUnit.NANOSECONDS);
            }
            Weigher weigher = this.h;
            if (weigher != CacheBuilder.e.INSTANCE) {
                cacheBuilder.weigher(weigher);
                long j3 = this.g;
                if (j3 != -1) {
                    cacheBuilder.maximumWeight(j3);
                }
            } else {
                long j4 = this.g;
                if (j4 != -1) {
                    cacheBuilder.maximumSize(j4);
                }
            }
            Ticker ticker = this.k;
            if (ticker != null) {
                cacheBuilder.ticker(ticker);
            }
            return cacheBuilder;
        }

        private p(t tVar, t tVar2, Equivalence<Object> equivalence, Equivalence<Object> equivalence2, long j, long j2, long j3, Weigher<K, V> weigher, int i, RemovalListener<? super K, ? super V> removalListener, Ticker ticker, CacheLoader<? super K, V> cacheLoader) {
            this.a = tVar;
            this.b = tVar2;
            this.c = equivalence;
            this.d = equivalence2;
            this.e = j;
            this.f = j2;
            this.g = j3;
            this.h = weigher;
            this.i = i;
            this.j = removalListener;
            this.k = (ticker == Ticker.systemTicker() || ticker == CacheBuilder.x) ? null : ticker;
            this.l = cacheLoader;
        }

        @Override // com.google.common.cache.ForwardingCache, com.google.common.collect.ForwardingObject
        public Cache<K, V> delegate() {
            return this.m;
        }
    }

    public enum q implements com.google.common.cache.e<Object, Object> {
        INSTANCE;

        @Override // com.google.common.cache.e
        public a0<Object, Object> a() {
            return null;
        }

        @Override // com.google.common.cache.e
        public com.google.common.cache.e<Object, Object> b() {
            return null;
        }

        @Override // com.google.common.cache.e
        public int c() {
            return 0;
        }

        @Override // com.google.common.cache.e
        public void e(com.google.common.cache.e<Object, Object> eVar) {
        }

        @Override // com.google.common.cache.e
        public com.google.common.cache.e<Object, Object> f() {
            return this;
        }

        @Override // com.google.common.cache.e
        public void g(a0<Object, Object> a0Var) {
        }

        @Override // com.google.common.cache.e
        public Object getKey() {
            return null;
        }

        @Override // com.google.common.cache.e
        public long h() {
            return 0L;
        }

        @Override // com.google.common.cache.e
        public void i(long j) {
        }

        @Override // com.google.common.cache.e
        public void j(long j) {
        }

        @Override // com.google.common.cache.e
        public com.google.common.cache.e<Object, Object> k() {
            return this;
        }

        @Override // com.google.common.cache.e
        public com.google.common.cache.e<Object, Object> m() {
            return this;
        }

        @Override // com.google.common.cache.e
        public com.google.common.cache.e<Object, Object> n() {
            return this;
        }

        @Override // com.google.common.cache.e
        public long o() {
            return 0L;
        }

        @Override // com.google.common.cache.e
        public void p(com.google.common.cache.e<Object, Object> eVar) {
        }

        @Override // com.google.common.cache.e
        public void q(com.google.common.cache.e<Object, Object> eVar) {
        }

        @Override // com.google.common.cache.e
        public void r(com.google.common.cache.e<Object, Object> eVar) {
        }
    }

    public static class r<K, V> extends ReentrantLock {

        @Weak
        public final a<K, V> a;
        public volatile int b;

        @GuardedBy("this")
        public long c;
        public int d;
        public int e;

        @MonotonicNonNullDecl
        public volatile AtomicReferenceArray<com.google.common.cache.e<K, V>> f;
        public final long g;

        @NullableDecl
        public final ReferenceQueue<K> h;

        @NullableDecl
        public final ReferenceQueue<V> i;
        public final Queue<com.google.common.cache.e<K, V>> j;
        public final AtomicInteger k = new AtomicInteger();

        @GuardedBy("this")
        public final Queue<com.google.common.cache.e<K, V>> l;

        @GuardedBy("this")
        public final Queue<com.google.common.cache.e<K, V>> m;
        public final AbstractCache.StatsCounter n;

        /* JADX INFO: renamed from: com.google.common.cache.a$r$a, reason: collision with other inner class name */
        public class RunnableC0174a implements Runnable {
            public final /* synthetic */ Object a;
            public final /* synthetic */ int b;
            public final /* synthetic */ m c;
            public final /* synthetic */ ListenableFuture d;

            public RunnableC0174a(Object obj, int i, m mVar, ListenableFuture listenableFuture) {
                this.a = obj;
                this.b = i;
                this.c = mVar;
                this.d = listenableFuture;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // java.lang.Runnable
            public void run() {
                try {
                    r.this.u(this.a, this.b, this.c, this.d);
                } catch (Throwable th) {
                    a.B.log(Level.WARNING, "Exception thrown during refresh", th);
                    this.c.j(th);
                }
            }
        }

        public r(a<K, V> aVar, int i, long j, AbstractCache.StatsCounter statsCounter) {
            this.a = aVar;
            this.g = j;
            this.n = (AbstractCache.StatsCounter) Preconditions.checkNotNull(statsCounter);
            A(G(i));
            this.h = aVar.U() ? new ReferenceQueue<>() : null;
            this.i = aVar.V() ? new ReferenceQueue<>() : null;
            this.j = aVar.T() ? new ConcurrentLinkedQueue<>() : a.i();
            this.l = aVar.X() ? new k0<>() : a.i();
            this.m = aVar.T() ? new e<>() : a.i();
        }

        public void A(AtomicReferenceArray<com.google.common.cache.e<K, V>> atomicReferenceArray) {
            this.e = (atomicReferenceArray.length() * 3) / 4;
            if (!this.a.h()) {
                int i = this.e;
                if (i == this.g) {
                    this.e = i + 1;
                }
            }
            this.f = atomicReferenceArray;
        }

        @NullableDecl
        public m<K, V> B(K k, int i, boolean z) {
            lock();
            try {
                long j = this.a.p.read();
                J(j);
                AtomicReferenceArray<com.google.common.cache.e<K, V>> atomicReferenceArray = this.f;
                int length = (atomicReferenceArray.length() - 1) & i;
                com.google.common.cache.e<K, V> eVar = (com.google.common.cache.e) atomicReferenceArray.get(length);
                for (com.google.common.cache.e eVarB = eVar; eVarB != null; eVarB = eVarB.b()) {
                    Object key = eVarB.getKey();
                    if (eVarB.c() == i && key != null && this.a.e.equivalent(k, key)) {
                        a0<K, V> a0VarA = eVarB.a();
                        if (!a0VarA.isLoading() && (!z || j - eVarB.h() >= this.a.m)) {
                            this.d++;
                            m<K, V> mVar = new m<>(a0VarA);
                            eVarB.g(mVar);
                            return mVar;
                        }
                        return null;
                    }
                }
                this.d++;
                m<K, V> mVar2 = new m<>();
                com.google.common.cache.e<K, V> eVarF = F(k, i, eVar);
                eVarF.g(mVar2);
                atomicReferenceArray.set(length, eVarF);
                return mVar2;
            } finally {
                unlock();
                I();
            }
        }

        public ListenableFuture<V> C(K k, int i, m<K, V> mVar, CacheLoader<? super K, V> cacheLoader) {
            ListenableFuture<V> listenableFutureH = mVar.h(k, cacheLoader);
            listenableFutureH.addListener(new RunnableC0174a(k, i, mVar, listenableFutureH), MoreExecutors.directExecutor());
            return listenableFutureH;
        }

        public V D(K k, int i, m<K, V> mVar, CacheLoader<? super K, V> cacheLoader) throws ExecutionException {
            return u(k, i, mVar, mVar.h(k, cacheLoader));
        }

        public V E(K k, int i, CacheLoader<? super K, V> cacheLoader) throws ExecutionException {
            m<K, V> mVar;
            a0<K, V> a0Var;
            boolean z;
            V vD;
            lock();
            try {
                long j = this.a.p.read();
                J(j);
                int i2 = this.b - 1;
                AtomicReferenceArray<com.google.common.cache.e<K, V>> atomicReferenceArray = this.f;
                int length = i & (atomicReferenceArray.length() - 1);
                com.google.common.cache.e<K, V> eVar = atomicReferenceArray.get(length);
                com.google.common.cache.e<K, V> eVarF = eVar;
                while (true) {
                    mVar = null;
                    if (eVarF != null) {
                        K key = eVarF.getKey();
                        if (eVarF.c() == i && key != null && this.a.e.equivalent(k, key)) {
                            a0<K, V> a0VarA = eVarF.a();
                            if (a0VarA.isLoading()) {
                                z = false;
                                a0Var = a0VarA;
                                break;
                            }
                            V v = a0VarA.get();
                            if (v == null) {
                                o(key, i, v, a0VarA.getWeight(), RemovalCause.COLLECTED);
                            } else {
                                if (!this.a.w(eVarF, j)) {
                                    N(eVarF, j);
                                    this.n.recordHits(1);
                                    unlock();
                                    I();
                                    return v;
                                }
                                o(key, i, v, a0VarA.getWeight(), RemovalCause.EXPIRED);
                            }
                            this.l.remove(eVarF);
                            this.m.remove(eVarF);
                            this.b = i2;
                            a0Var = a0VarA;
                        } else {
                            eVarF = eVarF.b();
                        }
                    } else {
                        a0Var = null;
                    }
                    z = true;
                    break;
                }
                if (z) {
                    mVar = new m<>();
                    if (eVarF == null) {
                        eVarF = F(k, i, eVar);
                        eVarF.g(mVar);
                        atomicReferenceArray.set(length, eVarF);
                    } else {
                        eVarF.g(mVar);
                    }
                }
                unlock();
                I();
                if (!z) {
                    return h0(eVarF, k, a0Var);
                }
                try {
                    synchronized (eVarF) {
                        vD = D(k, i, mVar, cacheLoader);
                    }
                    this.n.recordMisses(1);
                    return vD;
                } catch (Throwable th) {
                    this.n.recordMisses(1);
                    throw th;
                }
            } catch (Throwable th2) {
                unlock();
                I();
                throw th2;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @GuardedBy("this")
        public com.google.common.cache.e<K, V> F(K k, int i, @NullableDecl com.google.common.cache.e<K, V> eVar) {
            return this.a.q.f(this, Preconditions.checkNotNull(k), i, eVar);
        }

        public AtomicReferenceArray<com.google.common.cache.e<K, V>> G(int i) {
            return new AtomicReferenceArray<>(i);
        }

        public void H() {
            if ((this.k.incrementAndGet() & 63) == 0) {
                a();
            }
        }

        public void I() {
            b0();
        }

        @GuardedBy("this")
        public void J(long j) {
            a0(j);
        }

        @NullableDecl
        public V K(K k, int i, V v, boolean z) {
            int i2;
            lock();
            try {
                long j = this.a.p.read();
                J(j);
                if (this.b + 1 > this.e) {
                    q();
                }
                AtomicReferenceArray<com.google.common.cache.e<K, V>> atomicReferenceArray = this.f;
                int length = i & (atomicReferenceArray.length() - 1);
                com.google.common.cache.e<K, V> eVar = atomicReferenceArray.get(length);
                for (com.google.common.cache.e<K, V> eVarB = eVar; eVarB != null; eVarB = eVarB.b()) {
                    K key = eVarB.getKey();
                    if (eVarB.c() == i && key != null && this.a.e.equivalent(k, key)) {
                        a0<K, V> a0VarA = eVarB.a();
                        V v2 = a0VarA.get();
                        if (v2 != null) {
                            if (z) {
                                N(eVarB, j);
                            } else {
                                this.d++;
                                o(k, i, v2, a0VarA.getWeight(), RemovalCause.REPLACED);
                                d0(eVarB, k, v, j);
                                p(eVarB);
                            }
                            return v2;
                        }
                        this.d++;
                        if (a0VarA.isActive()) {
                            o(k, i, v2, a0VarA.getWeight(), RemovalCause.COLLECTED);
                            d0(eVarB, k, v, j);
                            i2 = this.b;
                        } else {
                            d0(eVarB, k, v, j);
                            i2 = this.b + 1;
                        }
                        this.b = i2;
                        p(eVarB);
                        return null;
                    }
                }
                this.d++;
                com.google.common.cache.e<K, V> eVarF = F(k, i, eVar);
                d0(eVarF, k, v, j);
                atomicReferenceArray.set(length, eVarF);
                this.b++;
                p(eVarF);
                return null;
            } finally {
                unlock();
                I();
            }
        }

        public boolean L(com.google.common.cache.e<K, V> eVar, int i) {
            lock();
            try {
                AtomicReferenceArray<com.google.common.cache.e<K, V>> atomicReferenceArray = this.f;
                int length = (atomicReferenceArray.length() - 1) & i;
                com.google.common.cache.e<K, V> eVar2 = atomicReferenceArray.get(length);
                for (com.google.common.cache.e<K, V> eVarB = eVar2; eVarB != null; eVarB = eVarB.b()) {
                    if (eVarB == eVar) {
                        this.d++;
                        com.google.common.cache.e<K, V> eVarX = X(eVar2, eVarB, eVarB.getKey(), i, eVarB.a().get(), eVarB.a(), RemovalCause.COLLECTED);
                        int i2 = this.b - 1;
                        atomicReferenceArray.set(length, eVarX);
                        this.b = i2;
                        return true;
                    }
                }
                return false;
            } finally {
                unlock();
                I();
            }
        }

        public boolean M(K k, int i, a0<K, V> a0Var) {
            lock();
            try {
                AtomicReferenceArray<com.google.common.cache.e<K, V>> atomicReferenceArray = this.f;
                int length = (atomicReferenceArray.length() - 1) & i;
                com.google.common.cache.e<K, V> eVar = atomicReferenceArray.get(length);
                for (com.google.common.cache.e<K, V> eVarB = eVar; eVarB != null; eVarB = eVarB.b()) {
                    K key = eVarB.getKey();
                    if (eVarB.c() == i && key != null && this.a.e.equivalent(k, key)) {
                        if (eVarB.a() != a0Var) {
                            return false;
                        }
                        this.d++;
                        com.google.common.cache.e<K, V> eVarX = X(eVar, eVarB, key, i, a0Var.get(), a0Var, RemovalCause.COLLECTED);
                        int i2 = this.b - 1;
                        atomicReferenceArray.set(length, eVarX);
                        this.b = i2;
                        return true;
                    }
                }
                return false;
            } finally {
                unlock();
                if (!isHeldByCurrentThread()) {
                    I();
                }
            }
        }

        @GuardedBy("this")
        public void N(com.google.common.cache.e<K, V> eVar, long j) {
            if (this.a.J()) {
                eVar.i(j);
            }
            this.m.add(eVar);
        }

        public void O(com.google.common.cache.e<K, V> eVar, long j) {
            if (this.a.J()) {
                eVar.i(j);
            }
            this.j.add(eVar);
        }

        @GuardedBy("this")
        public void P(com.google.common.cache.e<K, V> eVar, int i, long j) {
            k();
            this.c += (long) i;
            if (this.a.J()) {
                eVar.i(j);
            }
            if (this.a.L()) {
                eVar.j(j);
            }
            this.m.add(eVar);
            this.l.add(eVar);
        }

        @NullableDecl
        public V Q(K k, int i, CacheLoader<? super K, V> cacheLoader, boolean z) {
            m<K, V> mVarB = B(k, i, z);
            if (mVarB == null) {
                return null;
            }
            ListenableFuture<V> listenableFutureC = C(k, i, mVarB, cacheLoader);
            if (listenableFutureC.isDone()) {
                try {
                    return (V) Uninterruptibles.getUninterruptibly(listenableFutureC);
                } catch (Throwable unused) {
                }
            }
            return null;
        }

        @NullableDecl
        public V R(Object obj, int i) {
            RemovalCause removalCause;
            lock();
            try {
                J(this.a.p.read());
                AtomicReferenceArray<com.google.common.cache.e<K, V>> atomicReferenceArray = this.f;
                int length = (atomicReferenceArray.length() - 1) & i;
                com.google.common.cache.e<K, V> eVar = atomicReferenceArray.get(length);
                for (com.google.common.cache.e<K, V> eVarB = eVar; eVarB != null; eVarB = eVarB.b()) {
                    K key = eVarB.getKey();
                    if (eVarB.c() == i && key != null && this.a.e.equivalent(obj, key)) {
                        a0<K, V> a0VarA = eVarB.a();
                        V v = a0VarA.get();
                        if (v == null) {
                            if (!a0VarA.isActive()) {
                                break;
                            }
                            removalCause = RemovalCause.COLLECTED;
                        } else {
                            removalCause = RemovalCause.EXPLICIT;
                        }
                        RemovalCause removalCause2 = removalCause;
                        this.d++;
                        com.google.common.cache.e<K, V> eVarX = X(eVar, eVarB, key, i, v, a0VarA, removalCause2);
                        int i2 = this.b - 1;
                        atomicReferenceArray.set(length, eVarX);
                        this.b = i2;
                        return v;
                    }
                }
                return null;
            } finally {
                unlock();
                I();
            }
        }

        public boolean S(Object obj, int i, Object obj2) {
            RemovalCause removalCause;
            lock();
            try {
                J(this.a.p.read());
                AtomicReferenceArray<com.google.common.cache.e<K, V>> atomicReferenceArray = this.f;
                int length = (atomicReferenceArray.length() - 1) & i;
                com.google.common.cache.e<K, V> eVar = atomicReferenceArray.get(length);
                for (com.google.common.cache.e<K, V> eVarB = eVar; eVarB != null; eVarB = eVarB.b()) {
                    K key = eVarB.getKey();
                    if (eVarB.c() == i && key != null && this.a.e.equivalent(obj, key)) {
                        a0<K, V> a0VarA = eVarB.a();
                        V v = a0VarA.get();
                        if (!this.a.f.equivalent(obj2, v)) {
                            if (v != null || !a0VarA.isActive()) {
                                break;
                                break;
                            }
                            removalCause = RemovalCause.COLLECTED;
                        } else {
                            removalCause = RemovalCause.EXPLICIT;
                        }
                        this.d++;
                        com.google.common.cache.e<K, V> eVarX = X(eVar, eVarB, key, i, v, a0VarA, removalCause);
                        int i2 = this.b - 1;
                        atomicReferenceArray.set(length, eVarX);
                        this.b = i2;
                        return removalCause == RemovalCause.EXPLICIT;
                    }
                }
                return false;
            } finally {
                unlock();
                I();
            }
        }

        @GuardedBy("this")
        public void T(com.google.common.cache.e<K, V> eVar) {
            o(eVar.getKey(), eVar.c(), eVar.a().get(), eVar.a().getWeight(), RemovalCause.COLLECTED);
            this.l.remove(eVar);
            this.m.remove(eVar);
        }

        @VisibleForTesting
        @GuardedBy("this")
        public boolean U(com.google.common.cache.e<K, V> eVar, int i, RemovalCause removalCause) {
            AtomicReferenceArray<com.google.common.cache.e<K, V>> atomicReferenceArray = this.f;
            int length = (atomicReferenceArray.length() - 1) & i;
            com.google.common.cache.e<K, V> eVar2 = atomicReferenceArray.get(length);
            for (com.google.common.cache.e<K, V> eVarB = eVar2; eVarB != null; eVarB = eVarB.b()) {
                if (eVarB == eVar) {
                    this.d++;
                    com.google.common.cache.e<K, V> eVarX = X(eVar2, eVarB, eVarB.getKey(), i, eVarB.a().get(), eVarB.a(), removalCause);
                    int i2 = this.b - 1;
                    atomicReferenceArray.set(length, eVarX);
                    this.b = i2;
                    return true;
                }
            }
            return false;
        }

        @NullableDecl
        @GuardedBy("this")
        public com.google.common.cache.e<K, V> V(com.google.common.cache.e<K, V> eVar, com.google.common.cache.e<K, V> eVar2) {
            int i = this.b;
            com.google.common.cache.e<K, V> eVarB = eVar2.b();
            while (eVar != eVar2) {
                com.google.common.cache.e<K, V> eVarI = i(eVar, eVarB);
                if (eVarI != null) {
                    eVarB = eVarI;
                } else {
                    T(eVar);
                    i--;
                }
                eVar = eVar.b();
            }
            this.b = i;
            return eVarB;
        }

        public boolean W(K k, int i, m<K, V> mVar) {
            lock();
            try {
                AtomicReferenceArray<com.google.common.cache.e<K, V>> atomicReferenceArray = this.f;
                int length = (atomicReferenceArray.length() - 1) & i;
                com.google.common.cache.e<K, V> eVar = atomicReferenceArray.get(length);
                for (com.google.common.cache.e<K, V> eVarB = eVar; eVarB != null; eVarB = eVarB.b()) {
                    K key = eVarB.getKey();
                    if (eVarB.c() == i && key != null && this.a.e.equivalent(k, key)) {
                        if (eVarB.a() != mVar) {
                            break;
                        }
                        if (mVar.isActive()) {
                            eVarB.g(mVar.g());
                        } else {
                            atomicReferenceArray.set(length, V(eVar, eVarB));
                        }
                        return true;
                    }
                }
                return false;
            } finally {
                unlock();
                I();
            }
        }

        @NullableDecl
        @GuardedBy("this")
        public com.google.common.cache.e<K, V> X(com.google.common.cache.e<K, V> eVar, com.google.common.cache.e<K, V> eVar2, @NullableDecl K k, int i, V v, a0<K, V> a0Var, RemovalCause removalCause) {
            o(k, i, v, a0Var.getWeight(), removalCause);
            this.l.remove(eVar2);
            this.m.remove(eVar2);
            if (!a0Var.isLoading()) {
                return V(eVar, eVar2);
            }
            a0Var.b(null);
            return eVar;
        }

        @NullableDecl
        public V Y(K k, int i, V v) {
            lock();
            try {
                long j = this.a.p.read();
                J(j);
                AtomicReferenceArray<com.google.common.cache.e<K, V>> atomicReferenceArray = this.f;
                int length = i & (atomicReferenceArray.length() - 1);
                com.google.common.cache.e<K, V> eVar = atomicReferenceArray.get(length);
                for (com.google.common.cache.e<K, V> eVarB = eVar; eVarB != null; eVarB = eVarB.b()) {
                    K key = eVarB.getKey();
                    if (eVarB.c() == i && key != null) {
                        if (this.a.e.equivalent(k, key)) {
                            a0<K, V> a0VarA = eVarB.a();
                            V v2 = a0VarA.get();
                            if (v2 != null) {
                                this.d++;
                                o(k, i, v2, a0VarA.getWeight(), RemovalCause.REPLACED);
                                d0(eVarB, k, v, j);
                                p(eVarB);
                                return v2;
                            }
                            if (!a0VarA.isActive()) {
                                break;
                            }
                            this.d++;
                            com.google.common.cache.e<K, V> eVarX = X(eVar, eVarB, key, i, v2, a0VarA, RemovalCause.COLLECTED);
                            int i2 = this.b - 1;
                            atomicReferenceArray.set(length, eVarX);
                            this.b = i2;
                            break;
                        }
                    }
                }
                return null;
            } finally {
                unlock();
                I();
            }
        }

        public boolean Z(K k, int i, V v, V v2) {
            lock();
            try {
                long j = this.a.p.read();
                J(j);
                AtomicReferenceArray<com.google.common.cache.e<K, V>> atomicReferenceArray = this.f;
                int length = i & (atomicReferenceArray.length() - 1);
                com.google.common.cache.e<K, V> eVar = atomicReferenceArray.get(length);
                for (com.google.common.cache.e<K, V> eVarB = eVar; eVarB != null; eVarB = eVarB.b()) {
                    K key = eVarB.getKey();
                    if (eVarB.c() == i && key != null) {
                        if (this.a.e.equivalent(k, key)) {
                            a0<K, V> a0VarA = eVarB.a();
                            V v3 = a0VarA.get();
                            if (v3 != null) {
                                if (!this.a.f.equivalent(v, v3)) {
                                    N(eVarB, j);
                                    break;
                                }
                                this.d++;
                                o(k, i, v3, a0VarA.getWeight(), RemovalCause.REPLACED);
                                d0(eVarB, k, v2, j);
                                p(eVarB);
                                return true;
                            }
                            if (!a0VarA.isActive()) {
                                break;
                            }
                            this.d++;
                            com.google.common.cache.e<K, V> eVarX = X(eVar, eVarB, key, i, v3, a0VarA, RemovalCause.COLLECTED);
                            int i2 = this.b - 1;
                            atomicReferenceArray.set(length, eVarX);
                            this.b = i2;
                            break;
                        }
                    }
                }
                return false;
            } finally {
                unlock();
                I();
            }
        }

        public void a() {
            a0(this.a.p.read());
            b0();
        }

        public void a0(long j) {
            if (tryLock()) {
                try {
                    m();
                    r(j);
                    this.k.set(0);
                } finally {
                    unlock();
                }
            }
        }

        public void b() {
            if (this.b != 0) {
                lock();
                try {
                    J(this.a.p.read());
                    AtomicReferenceArray<com.google.common.cache.e<K, V>> atomicReferenceArray = this.f;
                    for (int i = 0; i < atomicReferenceArray.length(); i++) {
                        for (com.google.common.cache.e<K, V> eVarB = atomicReferenceArray.get(i); eVarB != null; eVarB = eVarB.b()) {
                            if (eVarB.a().isActive()) {
                                K key = eVarB.getKey();
                                V v = eVarB.a().get();
                                o(key, eVarB.c(), v, eVarB.a().getWeight(), (key == null || v == null) ? RemovalCause.COLLECTED : RemovalCause.EXPLICIT);
                            }
                        }
                    }
                    for (int i2 = 0; i2 < atomicReferenceArray.length(); i2++) {
                        atomicReferenceArray.set(i2, null);
                    }
                    e();
                    this.l.clear();
                    this.m.clear();
                    this.k.set(0);
                    this.d++;
                    this.b = 0;
                } finally {
                    unlock();
                    I();
                }
            }
        }

        public void b0() {
            if (isHeldByCurrentThread()) {
                return;
            }
            this.a.G();
        }

        public void c() {
            while (this.h.poll() != null) {
            }
        }

        public V c0(com.google.common.cache.e<K, V> eVar, K k, int i, V v, long j, CacheLoader<? super K, V> cacheLoader) {
            V vQ;
            return (!this.a.N() || j - eVar.h() <= this.a.m || eVar.a().isLoading() || (vQ = Q(k, i, cacheLoader, true)) == null) ? v : vQ;
        }

        @GuardedBy("this")
        public void d0(com.google.common.cache.e<K, V> eVar, K k, V v, long j) {
            a0<K, V> a0VarA = eVar.a();
            int iWeigh = this.a.j.weigh(k, v);
            Preconditions.checkState(iWeigh >= 0, "Weights must be non-negative");
            eVar.g(this.a.h.b(this, eVar, v, iWeigh));
            P(eVar, iWeigh, j);
            a0VarA.b(v);
        }

        public void e() {
            if (this.a.U()) {
                c();
            }
            if (this.a.V()) {
                f();
            }
        }

        public boolean e0(K k, int i, m<K, V> mVar, V v) {
            lock();
            try {
                long j = this.a.p.read();
                J(j);
                int i2 = this.b + 1;
                if (i2 > this.e) {
                    q();
                    i2 = this.b + 1;
                }
                int i3 = i2;
                AtomicReferenceArray<com.google.common.cache.e<K, V>> atomicReferenceArray = this.f;
                int length = i & (atomicReferenceArray.length() - 1);
                com.google.common.cache.e<K, V> eVar = atomicReferenceArray.get(length);
                for (com.google.common.cache.e<K, V> eVarB = eVar; eVarB != null; eVarB = eVarB.b()) {
                    K key = eVarB.getKey();
                    if (eVarB.c() == i && key != null && this.a.e.equivalent(k, key)) {
                        a0<K, V> a0VarA = eVarB.a();
                        V v2 = a0VarA.get();
                        if (mVar != a0VarA && (v2 != null || a0VarA == a.C)) {
                            o(k, i, v, 0, RemovalCause.REPLACED);
                            return false;
                        }
                        this.d++;
                        if (mVar.isActive()) {
                            o(k, i, v2, mVar.getWeight(), v2 == null ? RemovalCause.COLLECTED : RemovalCause.REPLACED);
                            i3--;
                        }
                        d0(eVarB, k, v, j);
                        this.b = i3;
                        p(eVarB);
                        return true;
                    }
                }
                this.d++;
                com.google.common.cache.e<K, V> eVarF = F(k, i, eVar);
                d0(eVarF, k, v, j);
                atomicReferenceArray.set(length, eVarF);
                this.b = i3;
                p(eVarF);
                return true;
            } finally {
                unlock();
                I();
            }
        }

        public void f() {
            while (this.i.poll() != null) {
            }
        }

        public void f0() {
            if (tryLock()) {
                try {
                    m();
                } finally {
                    unlock();
                }
            }
        }

        public boolean g(Object obj, int i) {
            try {
                if (this.b == 0) {
                    return false;
                }
                com.google.common.cache.e<K, V> eVarX = x(obj, i, this.a.p.read());
                if (eVarX == null) {
                    return false;
                }
                return eVarX.a().get() != null;
            } finally {
                H();
            }
        }

        public void g0(long j) {
            if (tryLock()) {
                try {
                    r(j);
                } finally {
                    unlock();
                }
            }
        }

        @VisibleForTesting
        public boolean h(Object obj) {
            try {
                if (this.b != 0) {
                    long j = this.a.p.read();
                    AtomicReferenceArray<com.google.common.cache.e<K, V>> atomicReferenceArray = this.f;
                    int length = atomicReferenceArray.length();
                    for (int i = 0; i < length; i++) {
                        for (com.google.common.cache.e<K, V> eVarB = atomicReferenceArray.get(i); eVarB != null; eVarB = eVarB.b()) {
                            V vY = y(eVarB, j);
                            if (vY != null && this.a.f.equivalent(obj, vY)) {
                                return true;
                            }
                        }
                    }
                }
                return false;
            } finally {
                H();
            }
        }

        public V h0(com.google.common.cache.e<K, V> eVar, K k, a0<K, V> a0Var) throws ExecutionException {
            if (!a0Var.isLoading()) {
                throw new AssertionError();
            }
            Preconditions.checkState(!Thread.holdsLock(eVar), "Recursive load of: %s", k);
            try {
                V vC = a0Var.c();
                if (vC != null) {
                    O(eVar, this.a.p.read());
                    this.n.recordMisses(1);
                    return vC;
                }
                throw new CacheLoader.InvalidCacheLoadException("CacheLoader returned null for key " + k + ".");
            } catch (Throwable th) {
                this.n.recordMisses(1);
                throw th;
            }
        }

        @GuardedBy("this")
        public com.google.common.cache.e<K, V> i(com.google.common.cache.e<K, V> eVar, com.google.common.cache.e<K, V> eVar2) {
            if (eVar.getKey() == null) {
                return null;
            }
            a0<K, V> a0VarA = eVar.a();
            V v = a0VarA.get();
            if (v == null && a0VarA.isActive()) {
                return null;
            }
            com.google.common.cache.e<K, V> eVarB = this.a.q.b(this, eVar, eVar2);
            eVarB.g(a0VarA.d(this.i, v, eVarB));
            return eVarB;
        }

        @GuardedBy("this")
        public void j() {
            int i = 0;
            do {
                Reference<? extends K> referencePoll = this.h.poll();
                if (referencePoll == null) {
                    return;
                }
                this.a.H((com.google.common.cache.e) referencePoll);
                i++;
            } while (i != 16);
        }

        @GuardedBy("this")
        public void k() {
            while (true) {
                com.google.common.cache.e<K, V> eVarPoll = this.j.poll();
                if (eVarPoll == null) {
                    return;
                }
                if (this.m.contains(eVarPoll)) {
                    this.m.add(eVarPoll);
                }
            }
        }

        @GuardedBy("this")
        public void m() {
            if (this.a.U()) {
                j();
            }
            if (this.a.V()) {
                n();
            }
        }

        @GuardedBy("this")
        public void n() {
            int i = 0;
            do {
                Reference<? extends V> referencePoll = this.i.poll();
                if (referencePoll == null) {
                    return;
                }
                this.a.I((a0) referencePoll);
                i++;
            } while (i != 16);
        }

        @GuardedBy("this")
        public void o(@NullableDecl K k, int i, @NullableDecl V v, int i2, RemovalCause removalCause) {
            this.c -= (long) i2;
            if (removalCause.a()) {
                this.n.recordEviction();
            }
            if (this.a.n != a.D) {
                this.a.n.offer(RemovalNotification.create(k, v, removalCause));
            }
        }

        @GuardedBy("this")
        public void p(com.google.common.cache.e<K, V> eVar) {
            if (this.a.j()) {
                k();
                if (eVar.a().getWeight() > this.g && !U(eVar, eVar.c(), RemovalCause.SIZE)) {
                    throw new AssertionError();
                }
                while (this.c > this.g) {
                    com.google.common.cache.e<K, V> eVarZ = z();
                    if (!U(eVarZ, eVarZ.c(), RemovalCause.SIZE)) {
                        throw new AssertionError();
                    }
                }
            }
        }

        @GuardedBy("this")
        public void q() {
            AtomicReferenceArray<com.google.common.cache.e<K, V>> atomicReferenceArray = this.f;
            int length = atomicReferenceArray.length();
            if (length >= 1073741824) {
                return;
            }
            int i = this.b;
            AtomicReferenceArray<com.google.common.cache.e<K, V>> atomicReferenceArrayG = G(length << 1);
            this.e = (atomicReferenceArrayG.length() * 3) / 4;
            int length2 = atomicReferenceArrayG.length() - 1;
            for (int i2 = 0; i2 < length; i2++) {
                com.google.common.cache.e<K, V> eVarB = atomicReferenceArray.get(i2);
                if (eVarB != null) {
                    com.google.common.cache.e<K, V> eVarB2 = eVarB.b();
                    int iC = eVarB.c() & length2;
                    if (eVarB2 == null) {
                        atomicReferenceArrayG.set(iC, eVarB);
                    } else {
                        com.google.common.cache.e<K, V> eVar = eVarB;
                        while (eVarB2 != null) {
                            int iC2 = eVarB2.c() & length2;
                            if (iC2 != iC) {
                                eVar = eVarB2;
                                iC = iC2;
                            }
                            eVarB2 = eVarB2.b();
                        }
                        atomicReferenceArrayG.set(iC, eVar);
                        while (eVarB != eVar) {
                            int iC3 = eVarB.c() & length2;
                            com.google.common.cache.e<K, V> eVarI = i(eVarB, atomicReferenceArrayG.get(iC3));
                            if (eVarI != null) {
                                atomicReferenceArrayG.set(iC3, eVarI);
                            } else {
                                T(eVarB);
                                i--;
                            }
                            eVarB = eVarB.b();
                        }
                    }
                }
            }
            this.f = atomicReferenceArrayG;
            this.b = i;
        }

        @GuardedBy("this")
        public void r(long j) {
            com.google.common.cache.e<K, V> eVarPeek;
            com.google.common.cache.e<K, V> eVarPeek2;
            k();
            do {
                eVarPeek = this.l.peek();
                if (eVarPeek == null || !this.a.w(eVarPeek, j)) {
                    do {
                        eVarPeek2 = this.m.peek();
                        if (eVarPeek2 == null || !this.a.w(eVarPeek2, j)) {
                            return;
                        }
                    } while (U(eVarPeek2, eVarPeek2.c(), RemovalCause.EXPIRED));
                    throw new AssertionError();
                }
            } while (U(eVarPeek, eVarPeek.c(), RemovalCause.EXPIRED));
            throw new AssertionError();
        }

        @NullableDecl
        public V s(Object obj, int i) {
            try {
                if (this.b != 0) {
                    long j = this.a.p.read();
                    com.google.common.cache.e<K, V> eVarX = x(obj, i, j);
                    if (eVarX == null) {
                        return null;
                    }
                    V v = eVarX.a().get();
                    if (v != null) {
                        O(eVarX, j);
                        return c0(eVarX, eVarX.getKey(), i, v, j, this.a.s);
                    }
                    f0();
                }
                return null;
            } finally {
                H();
            }
        }

        public V t(K k, int i, CacheLoader<? super K, V> cacheLoader) throws ExecutionException {
            com.google.common.cache.e<K, V> eVarV;
            Preconditions.checkNotNull(k);
            Preconditions.checkNotNull(cacheLoader);
            try {
                try {
                    if (this.b != 0 && (eVarV = v(k, i)) != null) {
                        long j = this.a.p.read();
                        V vY = y(eVarV, j);
                        if (vY != null) {
                            O(eVarV, j);
                            this.n.recordHits(1);
                            V vC0 = c0(eVarV, k, i, vY, j, cacheLoader);
                            H();
                            return vC0;
                        }
                        a0<K, V> a0VarA = eVarV.a();
                        if (a0VarA.isLoading()) {
                            V vH0 = h0(eVarV, k, a0VarA);
                            H();
                            return vH0;
                        }
                    }
                    V vE = E(k, i, cacheLoader);
                    H();
                    return vE;
                } catch (ExecutionException e) {
                    Throwable cause = e.getCause();
                    if (cause instanceof Error) {
                        throw new ExecutionError((Error) cause);
                    }
                    if (cause instanceof RuntimeException) {
                        throw new UncheckedExecutionException(cause);
                    }
                    throw e;
                }
            } catch (Throwable th) {
                H();
                throw th;
            }
        }

        public V u(K k, int i, m<K, V> mVar, ListenableFuture<V> listenableFuture) throws Throwable {
            V v;
            try {
                v = (V) Uninterruptibles.getUninterruptibly(listenableFuture);
                try {
                    if (v != null) {
                        this.n.recordLoadSuccess(mVar.e());
                        e0(k, i, mVar, v);
                        return v;
                    }
                    throw new CacheLoader.InvalidCacheLoadException("CacheLoader returned null for key " + k + ".");
                } catch (Throwable th) {
                    th = th;
                    if (v == null) {
                        this.n.recordLoadException(mVar.e());
                        W(k, i, mVar);
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                v = null;
            }
        }

        @NullableDecl
        public com.google.common.cache.e<K, V> v(Object obj, int i) {
            for (com.google.common.cache.e<K, V> eVarW = w(i); eVarW != null; eVarW = eVarW.b()) {
                if (eVarW.c() == i) {
                    K key = eVarW.getKey();
                    if (key == null) {
                        f0();
                    } else if (this.a.e.equivalent(obj, key)) {
                        return eVarW;
                    }
                }
            }
            return null;
        }

        public com.google.common.cache.e<K, V> w(int i) {
            AtomicReferenceArray<com.google.common.cache.e<K, V>> atomicReferenceArray = this.f;
            return atomicReferenceArray.get(i & (atomicReferenceArray.length() - 1));
        }

        @NullableDecl
        public com.google.common.cache.e<K, V> x(Object obj, int i, long j) {
            com.google.common.cache.e<K, V> eVarV = v(obj, i);
            if (eVarV == null) {
                return null;
            }
            if (!this.a.w(eVarV, j)) {
                return eVarV;
            }
            g0(j);
            return null;
        }

        public V y(com.google.common.cache.e<K, V> eVar, long j) {
            if (eVar.getKey() == null) {
                f0();
                return null;
            }
            V v = eVar.a().get();
            if (v == null) {
                f0();
                return null;
            }
            if (!this.a.w(eVar, j)) {
                return v;
            }
            g0(j);
            return null;
        }

        @GuardedBy("this")
        public com.google.common.cache.e<K, V> z() {
            for (com.google.common.cache.e<K, V> eVar : this.m) {
                if (eVar.a().getWeight() > 0) {
                    return eVar;
                }
            }
            throw new AssertionError();
        }
    }

    public static class s<K, V> extends SoftReference<V> implements a0<K, V> {
        public final com.google.common.cache.e<K, V> a;

        public s(ReferenceQueue<V> referenceQueue, V v, com.google.common.cache.e<K, V> eVar) {
            super(v, referenceQueue);
            this.a = eVar;
        }

        @Override // com.google.common.cache.a.a0
        public com.google.common.cache.e<K, V> a() {
            return this.a;
        }

        @Override // com.google.common.cache.a.a0
        public void b(V v) {
        }

        @Override // com.google.common.cache.a.a0
        public V c() {
            return get();
        }

        public a0<K, V> d(ReferenceQueue<V> referenceQueue, V v, com.google.common.cache.e<K, V> eVar) {
            return new s(referenceQueue, v, eVar);
        }

        public int getWeight() {
            return 1;
        }

        @Override // com.google.common.cache.a.a0
        public boolean isActive() {
            return true;
        }

        @Override // com.google.common.cache.a.a0
        public boolean isLoading() {
            return false;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static abstract class t {
        private static final /* synthetic */ t[] $VALUES;
        public static final t SOFT;
        public static final t STRONG;
        public static final t WEAK;

        /* JADX INFO: renamed from: com.google.common.cache.a$t$a, reason: collision with other inner class name */
        public static enum C0175a extends t {
            public C0175a(String str, int i) {
                super(str, i, null);
            }

            @Override // com.google.common.cache.a.t
            public Equivalence<Object> a() {
                return Equivalence.equals();
            }

            @Override // com.google.common.cache.a.t
            public <K, V> a0<K, V> b(r<K, V> rVar, com.google.common.cache.e<K, V> eVar, V v, int i) {
                return i == 1 ? new x(v) : new i0(v, i);
            }
        }

        public static enum b extends t {
            public b(String str, int i) {
                super(str, i, null);
            }

            @Override // com.google.common.cache.a.t
            public Equivalence<Object> a() {
                return Equivalence.identity();
            }

            @Override // com.google.common.cache.a.t
            public <K, V> a0<K, V> b(r<K, V> rVar, com.google.common.cache.e<K, V> eVar, V v, int i) {
                return i == 1 ? new s(rVar.i, v, eVar) : new h0(rVar.i, v, eVar, i);
            }
        }

        public static enum c extends t {
            public c(String str, int i) {
                super(str, i, null);
            }

            @Override // com.google.common.cache.a.t
            public Equivalence<Object> a() {
                return Equivalence.identity();
            }

            @Override // com.google.common.cache.a.t
            public <K, V> a0<K, V> b(r<K, V> rVar, com.google.common.cache.e<K, V> eVar, V v, int i) {
                return i == 1 ? new f0(rVar.i, v, eVar) : new j0(rVar.i, v, eVar, i);
            }
        }

        static {
            C0175a c0175a = new C0175a("STRONG", 0);
            STRONG = c0175a;
            b bVar = new b("SOFT", 1);
            SOFT = bVar;
            c cVar = new c("WEAK", 2);
            WEAK = cVar;
            $VALUES = new t[]{c0175a, bVar, cVar};
        }

        private t(String str, int i) {
            super(str, i);
        }

        public static t valueOf(String str) {
            return (t) Enum.valueOf(t.class, str);
        }

        public static t[] values() {
            return (t[]) $VALUES.clone();
        }

        public abstract Equivalence<Object> a();

        public abstract <K, V> a0<K, V> b(r<K, V> rVar, com.google.common.cache.e<K, V> eVar, V v, int i);

        public /* synthetic */ t(String str, int i, C0167a c0167a) {
            this(str, i);
        }
    }

    public static final class u<K, V> extends w<K, V> {
        public volatile long e;
        public com.google.common.cache.e<K, V> f;
        public com.google.common.cache.e<K, V> g;

        public u(K k, int i, @NullableDecl com.google.common.cache.e<K, V> eVar) {
            super(k, i, eVar);
            this.e = Long.MAX_VALUE;
            this.f = a.D();
            this.g = a.D();
        }

        @Override // com.google.common.cache.a.d, com.google.common.cache.e
        public void e(com.google.common.cache.e<K, V> eVar) {
            this.g = eVar;
        }

        @Override // com.google.common.cache.a.d, com.google.common.cache.e
        public void i(long j) {
            this.e = j;
        }

        @Override // com.google.common.cache.a.d, com.google.common.cache.e
        public com.google.common.cache.e<K, V> k() {
            return this.g;
        }

        @Override // com.google.common.cache.a.d, com.google.common.cache.e
        public com.google.common.cache.e<K, V> n() {
            return this.f;
        }

        @Override // com.google.common.cache.a.d, com.google.common.cache.e
        public long o() {
            return this.e;
        }

        @Override // com.google.common.cache.a.d, com.google.common.cache.e
        public void p(com.google.common.cache.e<K, V> eVar) {
            this.f = eVar;
        }
    }

    public static final class v<K, V> extends w<K, V> {
        public volatile long e;
        public com.google.common.cache.e<K, V> f;
        public com.google.common.cache.e<K, V> g;
        public volatile long h;
        public com.google.common.cache.e<K, V> i;
        public com.google.common.cache.e<K, V> j;

        public v(K k, int i, @NullableDecl com.google.common.cache.e<K, V> eVar) {
            super(k, i, eVar);
            this.e = Long.MAX_VALUE;
            this.f = a.D();
            this.g = a.D();
            this.h = Long.MAX_VALUE;
            this.i = a.D();
            this.j = a.D();
        }

        @Override // com.google.common.cache.a.d, com.google.common.cache.e
        public void e(com.google.common.cache.e<K, V> eVar) {
            this.g = eVar;
        }

        @Override // com.google.common.cache.a.d, com.google.common.cache.e
        public com.google.common.cache.e<K, V> f() {
            return this.j;
        }

        @Override // com.google.common.cache.a.d, com.google.common.cache.e
        public long h() {
            return this.h;
        }

        @Override // com.google.common.cache.a.d, com.google.common.cache.e
        public void i(long j) {
            this.e = j;
        }

        @Override // com.google.common.cache.a.d, com.google.common.cache.e
        public void j(long j) {
            this.h = j;
        }

        @Override // com.google.common.cache.a.d, com.google.common.cache.e
        public com.google.common.cache.e<K, V> k() {
            return this.g;
        }

        @Override // com.google.common.cache.a.d, com.google.common.cache.e
        public com.google.common.cache.e<K, V> m() {
            return this.i;
        }

        @Override // com.google.common.cache.a.d, com.google.common.cache.e
        public com.google.common.cache.e<K, V> n() {
            return this.f;
        }

        @Override // com.google.common.cache.a.d, com.google.common.cache.e
        public long o() {
            return this.e;
        }

        @Override // com.google.common.cache.a.d, com.google.common.cache.e
        public void p(com.google.common.cache.e<K, V> eVar) {
            this.f = eVar;
        }

        @Override // com.google.common.cache.a.d, com.google.common.cache.e
        public void q(com.google.common.cache.e<K, V> eVar) {
            this.i = eVar;
        }

        @Override // com.google.common.cache.a.d, com.google.common.cache.e
        public void r(com.google.common.cache.e<K, V> eVar) {
            this.j = eVar;
        }
    }

    public static class w<K, V> extends d<K, V> {
        public final K a;
        public final int b;

        @NullableDecl
        public final com.google.common.cache.e<K, V> c;
        public volatile a0<K, V> d = a.R();

        public w(K k, int i, @NullableDecl com.google.common.cache.e<K, V> eVar) {
            this.a = k;
            this.b = i;
            this.c = eVar;
        }

        @Override // com.google.common.cache.a.d, com.google.common.cache.e
        public a0<K, V> a() {
            return this.d;
        }

        @Override // com.google.common.cache.a.d, com.google.common.cache.e
        public com.google.common.cache.e<K, V> b() {
            return this.c;
        }

        @Override // com.google.common.cache.a.d, com.google.common.cache.e
        public int c() {
            return this.b;
        }

        @Override // com.google.common.cache.a.d, com.google.common.cache.e
        public void g(a0<K, V> a0Var) {
            this.d = a0Var;
        }

        @Override // com.google.common.cache.a.d, com.google.common.cache.e
        public K getKey() {
            return this.a;
        }
    }

    public static class x<K, V> implements a0<K, V> {
        public final V a;

        public x(V v) {
            this.a = v;
        }

        @Override // com.google.common.cache.a.a0
        public com.google.common.cache.e<K, V> a() {
            return null;
        }

        @Override // com.google.common.cache.a.a0
        public void b(V v) {
        }

        @Override // com.google.common.cache.a.a0
        public V c() {
            return get();
        }

        @Override // com.google.common.cache.a.a0
        public a0<K, V> d(ReferenceQueue<V> referenceQueue, V v, com.google.common.cache.e<K, V> eVar) {
            return this;
        }

        @Override // com.google.common.cache.a.a0
        public V get() {
            return this.a;
        }

        @Override // com.google.common.cache.a.a0
        public int getWeight() {
            return 1;
        }

        @Override // com.google.common.cache.a.a0
        public boolean isActive() {
            return true;
        }

        @Override // com.google.common.cache.a.a0
        public boolean isLoading() {
            return false;
        }
    }

    public static final class y<K, V> extends w<K, V> {
        public volatile long e;
        public com.google.common.cache.e<K, V> f;
        public com.google.common.cache.e<K, V> g;

        public y(K k, int i, @NullableDecl com.google.common.cache.e<K, V> eVar) {
            super(k, i, eVar);
            this.e = Long.MAX_VALUE;
            this.f = a.D();
            this.g = a.D();
        }

        @Override // com.google.common.cache.a.d, com.google.common.cache.e
        public com.google.common.cache.e<K, V> f() {
            return this.g;
        }

        @Override // com.google.common.cache.a.d, com.google.common.cache.e
        public long h() {
            return this.e;
        }

        @Override // com.google.common.cache.a.d, com.google.common.cache.e
        public void j(long j) {
            this.e = j;
        }

        @Override // com.google.common.cache.a.d, com.google.common.cache.e
        public com.google.common.cache.e<K, V> m() {
            return this.f;
        }

        @Override // com.google.common.cache.a.d, com.google.common.cache.e
        public void q(com.google.common.cache.e<K, V> eVar) {
            this.f = eVar;
        }

        @Override // com.google.common.cache.a.d, com.google.common.cache.e
        public void r(com.google.common.cache.e<K, V> eVar) {
            this.g = eVar;
        }
    }

    public final class z extends a<K, V>.i<V> {
        public z() {
            super();
        }

        @Override // com.google.common.cache.a.i, java.util.Iterator
        public V next() {
            return c().getValue();
        }
    }

    public a(CacheBuilder<? super K, ? super V> cacheBuilder, @NullableDecl CacheLoader<? super K, V> cacheLoader) {
        this.d = Math.min(cacheBuilder.c(), 65536);
        t tVarH = cacheBuilder.h();
        this.g = tVarH;
        this.h = cacheBuilder.o();
        this.e = cacheBuilder.g();
        this.f = cacheBuilder.n();
        long jI = cacheBuilder.i();
        this.i = jI;
        this.j = (Weigher<K, V>) cacheBuilder.p();
        this.k = cacheBuilder.d();
        this.l = cacheBuilder.e();
        this.m = cacheBuilder.j();
        CacheBuilder.d dVar = (RemovalListener<K, V>) cacheBuilder.k();
        this.o = dVar;
        this.n = dVar == CacheBuilder.d.INSTANCE ? i() : new ConcurrentLinkedQueue<>();
        this.p = cacheBuilder.m(K());
        this.q = f.e(tVarH, S(), W());
        this.r = cacheBuilder.l().get();
        this.s = cacheLoader;
        int iMin = Math.min(cacheBuilder.f(), 1073741824);
        if (j() && !h()) {
            iMin = (int) Math.min(iMin, jI);
        }
        int i2 = 0;
        int i3 = 1;
        int i4 = 1;
        int i5 = 0;
        while (i4 < this.d && (!j() || i4 * 20 <= this.i)) {
            i5++;
            i4 <<= 1;
        }
        this.b = 32 - i5;
        this.a = i4 - 1;
        this.c = B(i4);
        int i6 = iMin / i4;
        while (i3 < (i6 * i4 < iMin ? i6 + 1 : i6)) {
            i3 <<= 1;
        }
        if (j()) {
            long j2 = this.i;
            long j3 = i4;
            long j4 = (j2 / j3) + 1;
            long j5 = j2 % j3;
            while (true) {
                r<K, V>[] rVarArr = this.c;
                if (i2 >= rVarArr.length) {
                    return;
                }
                if (i2 == j5) {
                    j4--;
                }
                rVarArr[i2] = g(i3, j4, cacheBuilder.l().get());
                i2++;
            }
        } else {
            while (true) {
                r<K, V>[] rVarArr2 = this.c;
                if (i2 >= rVarArr2.length) {
                    return;
                }
                rVarArr2[i2] = g(i3, -1L, cacheBuilder.l().get());
                i2++;
            }
        }
    }

    public static <K, V> com.google.common.cache.e<K, V> D() {
        return q.INSTANCE;
    }

    public static <K, V> void E(com.google.common.cache.e<K, V> eVar) {
        com.google.common.cache.e<K, V> eVarD = D();
        eVar.p(eVarD);
        eVar.e(eVarD);
    }

    public static <K, V> void F(com.google.common.cache.e<K, V> eVar) {
        com.google.common.cache.e<K, V> eVarD = D();
        eVar.q(eVarD);
        eVar.r(eVarD);
    }

    public static int O(int i2) {
        int i3 = i2 + ((i2 << 15) ^ (-12931));
        int i4 = i3 ^ (i3 >>> 10);
        int i5 = i4 + (i4 << 3);
        int i6 = i5 ^ (i5 >>> 6);
        int i7 = i6 + (i6 << 2) + (i6 << 14);
        return i7 ^ (i7 >>> 16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> ArrayList<E> Q(Collection<E> collection) {
        ArrayList<E> arrayList = new ArrayList<>(collection.size());
        Iterators.addAll(arrayList, collection.iterator());
        return arrayList;
    }

    public static <K, V> a0<K, V> R() {
        return (a0<K, V>) C;
    }

    public static <K, V> void d(com.google.common.cache.e<K, V> eVar, com.google.common.cache.e<K, V> eVar2) {
        eVar.p(eVar2);
        eVar2.e(eVar);
    }

    public static <K, V> void e(com.google.common.cache.e<K, V> eVar, com.google.common.cache.e<K, V> eVar2) {
        eVar.q(eVar2);
        eVar2.r(eVar);
    }

    public static <E> Queue<E> i() {
        return (Queue<E>) D;
    }

    @VisibleForTesting
    public com.google.common.cache.e<K, V> A(K k2, int i2, @NullableDecl com.google.common.cache.e<K, V> eVar) {
        r<K, V> rVarP = P(i2);
        rVarP.lock();
        try {
            return rVarP.F(k2, i2, eVar);
        } finally {
            rVarP.unlock();
        }
    }

    public final r<K, V>[] B(int i2) {
        return new r[i2];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @VisibleForTesting
    public a0<K, V> C(com.google.common.cache.e<K, V> eVar, V v2, int i2) {
        return this.h.b(P(eVar.c()), eVar, Preconditions.checkNotNull(v2), i2);
    }

    public void G() {
        while (true) {
            RemovalNotification<K, V> removalNotificationPoll = this.n.poll();
            if (removalNotificationPoll == null) {
                return;
            }
            try {
                this.o.onRemoval(removalNotificationPoll);
            } catch (Throwable th) {
                B.log(Level.WARNING, "Exception thrown by removal listener", th);
            }
        }
    }

    public void H(com.google.common.cache.e<K, V> eVar) {
        int iC = eVar.c();
        P(iC).L(eVar, iC);
    }

    public void I(a0<K, V> a0Var) {
        com.google.common.cache.e<K, V> eVarA = a0Var.a();
        int iC = eVarA.c();
        P(iC).M(eVarA.getKey(), iC, a0Var);
    }

    public boolean J() {
        return l();
    }

    public boolean K() {
        return L() || J();
    }

    public boolean L() {
        return m() || N();
    }

    public void M(K k2) {
        int iU = u(Preconditions.checkNotNull(k2));
        P(iU).Q(k2, iU, this.s, false);
    }

    public boolean N() {
        return this.m > 0;
    }

    public r<K, V> P(int i2) {
        return this.c[(i2 >>> this.b) & this.a];
    }

    public boolean S() {
        return T() || J();
    }

    public boolean T() {
        return l() || j();
    }

    public boolean U() {
        return this.g != t.STRONG;
    }

    public boolean V() {
        return this.h != t.STRONG;
    }

    public boolean W() {
        return X() || L();
    }

    public boolean X() {
        return m();
    }

    public void c() {
        for (r<K, V> rVar : this.c) {
            rVar.a();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        for (r<K, V> rVar : this.c) {
            rVar.b();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(@NullableDecl Object obj) {
        if (obj == null) {
            return false;
        }
        int iU = u(obj);
        return P(iU).g(obj, iU);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(@NullableDecl Object obj) {
        if (obj == null) {
            return false;
        }
        long j2 = this.p.read();
        r<K, V>[] rVarArr = this.c;
        long j3 = -1;
        int i2 = 0;
        while (i2 < 3) {
            long j4 = 0;
            int length = rVarArr.length;
            int i3 = 0;
            while (i3 < length) {
                r<K, V> rVar = rVarArr[i3];
                int i4 = rVar.b;
                AtomicReferenceArray<com.google.common.cache.e<K, V>> atomicReferenceArray = rVar.f;
                for (int i5 = 0; i5 < atomicReferenceArray.length(); i5++) {
                    com.google.common.cache.e<K, V> eVarB = atomicReferenceArray.get(i5);
                    while (eVarB != null) {
                        r<K, V>[] rVarArr2 = rVarArr;
                        V vY = rVar.y(eVarB, j2);
                        long j5 = j2;
                        if (vY != null && this.f.equivalent(obj, vY)) {
                            return true;
                        }
                        eVarB = eVarB.b();
                        rVarArr = rVarArr2;
                        j2 = j5;
                    }
                }
                j4 += (long) rVar.d;
                i3++;
                j2 = j2;
            }
            long j6 = j2;
            r<K, V>[] rVarArr3 = rVarArr;
            if (j4 == j3) {
                return false;
            }
            i2++;
            j3 = j4;
            rVarArr = rVarArr3;
            j2 = j6;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @GwtIncompatible
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.v;
        if (set != null) {
            return set;
        }
        h hVar = new h(this);
        this.v = hVar;
        return hVar;
    }

    @VisibleForTesting
    public com.google.common.cache.e<K, V> f(com.google.common.cache.e<K, V> eVar, com.google.common.cache.e<K, V> eVar2) {
        return P(eVar.c()).i(eVar, eVar2);
    }

    public r<K, V> g(int i2, long j2, AbstractCache.StatsCounter statsCounter) {
        return new r<>(this, i2, j2, statsCounter);
    }

    @Override // java.util.AbstractMap, java.util.Map
    @NullableDecl
    public V get(@NullableDecl Object obj) {
        if (obj == null) {
            return null;
        }
        int iU = u(obj);
        return P(iU).s(obj, iU);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @NullableDecl
    public V getOrDefault(@NullableDecl Object obj, @NullableDecl V v2) {
        V v3 = get(obj);
        return v3 != null ? v3 : v2;
    }

    public boolean h() {
        return this.j != CacheBuilder.e.INSTANCE;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        r<K, V>[] rVarArr = this.c;
        long j2 = 0;
        for (int i2 = 0; i2 < rVarArr.length; i2++) {
            if (rVarArr[i2].b != 0) {
                return false;
            }
            j2 += (long) rVarArr[i2].d;
        }
        if (j2 == 0) {
            return true;
        }
        for (int i3 = 0; i3 < rVarArr.length; i3++) {
            if (rVarArr[i3].b != 0) {
                return false;
            }
            j2 -= (long) rVarArr[i3].d;
        }
        return j2 == 0;
    }

    public boolean j() {
        return this.i >= 0;
    }

    public boolean k() {
        return m() || l();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.t;
        if (set != null) {
            return set;
        }
        k kVar = new k(this);
        this.t = kVar;
        return kVar;
    }

    public boolean l() {
        return this.k > 0;
    }

    public boolean m() {
        return this.l > 0;
    }

    public V n(K k2, CacheLoader<? super K, V> cacheLoader) throws ExecutionException {
        int iU = u(Preconditions.checkNotNull(k2));
        return P(iU).t(k2, iU, cacheLoader);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ImmutableMap<K, V> o(Iterable<? extends K> iterable) throws ExecutionException {
        LinkedHashMap linkedHashMapNewLinkedHashMap = Maps.newLinkedHashMap();
        LinkedHashSet linkedHashSetNewLinkedHashSet = Sets.newLinkedHashSet();
        int i2 = 0;
        int i3 = 0;
        for (K k2 : iterable) {
            Object obj = get(k2);
            if (!linkedHashMapNewLinkedHashMap.containsKey(k2)) {
                linkedHashMapNewLinkedHashMap.put(k2, obj);
                if (obj == null) {
                    i3++;
                    linkedHashSetNewLinkedHashSet.add(k2);
                } else {
                    i2++;
                }
            }
        }
        try {
            if (!linkedHashSetNewLinkedHashSet.isEmpty()) {
                try {
                    Map mapY = y(linkedHashSetNewLinkedHashSet, this.s);
                    for (Object obj2 : linkedHashSetNewLinkedHashSet) {
                        Object obj3 = mapY.get(obj2);
                        if (obj3 == null) {
                            throw new CacheLoader.InvalidCacheLoadException("loadAll failed to return a value for " + obj2);
                        }
                        linkedHashMapNewLinkedHashMap.put(obj2, obj3);
                    }
                } catch (CacheLoader.UnsupportedLoadingOperationException unused) {
                    for (Object obj4 : linkedHashSetNewLinkedHashSet) {
                        i3--;
                        linkedHashMapNewLinkedHashMap.put(obj4, n(obj4, this.s));
                    }
                }
            }
            ImmutableMap<K, V> immutableMapCopyOf = ImmutableMap.copyOf((Map) linkedHashMapNewLinkedHashMap);
            this.r.recordHits(i2);
            this.r.recordMisses(i3);
            return immutableMapCopyOf;
        } catch (Throwable th) {
            this.r.recordHits(i2);
            this.r.recordMisses(i3);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ImmutableMap<K, V> p(Iterable<?> iterable) {
        LinkedHashMap linkedHashMapNewLinkedHashMap = Maps.newLinkedHashMap();
        int i2 = 0;
        int i3 = 0;
        for (Object obj : iterable) {
            V v2 = get(obj);
            if (v2 == null) {
                i3++;
            } else {
                linkedHashMapNewLinkedHashMap.put(obj, v2);
                i2++;
            }
        }
        this.r.recordHits(i2);
        this.r.recordMisses(i3);
        return ImmutableMap.copyOf((Map) linkedHashMapNewLinkedHashMap);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k2, V v2) {
        Preconditions.checkNotNull(k2);
        Preconditions.checkNotNull(v2);
        int iU = u(k2);
        return P(iU).K(k2, iU, v2, false);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public V putIfAbsent(K k2, V v2) {
        Preconditions.checkNotNull(k2);
        Preconditions.checkNotNull(v2);
        int iU = u(k2);
        return P(iU).K(k2, iU, v2, true);
    }

    public com.google.common.cache.e<K, V> q(@NullableDecl Object obj) {
        if (obj == null) {
            return null;
        }
        int iU = u(obj);
        return P(iU).v(obj, iU);
    }

    @NullableDecl
    public V r(Object obj) {
        int iU = u(Preconditions.checkNotNull(obj));
        V vS = P(iU).s(obj, iU);
        if (vS == null) {
            this.r.recordMisses(1);
        } else {
            this.r.recordHits(1);
        }
        return vS;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(@NullableDecl Object obj) {
        if (obj == null) {
            return null;
        }
        int iU = u(obj);
        return P(iU).R(obj, iU);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public boolean replace(K k2, @NullableDecl V v2, V v3) {
        Preconditions.checkNotNull(k2);
        Preconditions.checkNotNull(v3);
        if (v2 == null) {
            return false;
        }
        int iU = u(k2);
        return P(iU).Z(k2, iU, v2, v3);
    }

    @NullableDecl
    public V s(com.google.common.cache.e<K, V> eVar, long j2) {
        V v2;
        if (eVar.getKey() == null || (v2 = eVar.a().get()) == null || w(eVar, j2)) {
            return null;
        }
        return v2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return Ints.saturatedCast(z());
    }

    public V t(K k2) throws ExecutionException {
        return n(k2, this.s);
    }

    public int u(@NullableDecl Object obj) {
        return O(this.e.hash(obj));
    }

    public void v(Iterable<?> iterable) {
        Iterator<?> it2 = iterable.iterator();
        while (it2.hasNext()) {
            remove(it2.next());
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<V> values() {
        Collection<V> collection = this.u;
        if (collection != null) {
            return collection;
        }
        b0 b0Var = new b0(this);
        this.u = b0Var;
        return b0Var;
    }

    public boolean w(com.google.common.cache.e<K, V> eVar, long j2) {
        Preconditions.checkNotNull(eVar);
        if (!l() || j2 - eVar.o() < this.k) {
            return m() && j2 - eVar.h() >= this.l;
        }
        return true;
    }

    @VisibleForTesting
    public boolean x(com.google.common.cache.e<K, V> eVar, long j2) {
        return P(eVar.c()).y(eVar, j2) != null;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00b9  */
    @NullableDecl
    public Map<K, V> y(Set<? extends K> set, CacheLoader<? super K, V> cacheLoader) throws Throwable {
        Preconditions.checkNotNull(cacheLoader);
        Preconditions.checkNotNull(set);
        Stopwatch stopwatchCreateStarted = Stopwatch.createStarted();
        boolean z2 = true;
        boolean z3 = false;
        try {
            try {
                try {
                    Map<? super K, V> mapLoadAll = cacheLoader.loadAll(set);
                    if (mapLoadAll == null) {
                        this.r.recordLoadException(stopwatchCreateStarted.elapsed(TimeUnit.NANOSECONDS));
                        throw new CacheLoader.InvalidCacheLoadException(cacheLoader + " returned null map from loadAll");
                    }
                    stopwatchCreateStarted.stop();
                    for (Map.Entry<K, V> entry : mapLoadAll.entrySet()) {
                        K key = entry.getKey();
                        V value = entry.getValue();
                        if (key == null || value == null) {
                            z3 = true;
                        } else {
                            put(key, value);
                        }
                    }
                    if (!z3) {
                        this.r.recordLoadSuccess(stopwatchCreateStarted.elapsed(TimeUnit.NANOSECONDS));
                        return mapLoadAll;
                    }
                    this.r.recordLoadException(stopwatchCreateStarted.elapsed(TimeUnit.NANOSECONDS));
                    throw new CacheLoader.InvalidCacheLoadException(cacheLoader + " returned null keys or values from loadAll");
                } catch (CacheLoader.UnsupportedLoadingOperationException e2) {
                    try {
                        throw e2;
                    } catch (Throwable th) {
                        th = th;
                        if (!z2) {
                            this.r.recordLoadException(stopwatchCreateStarted.elapsed(TimeUnit.NANOSECONDS));
                        }
                        throw th;
                    }
                } catch (Exception e3) {
                    throw new ExecutionException(e3);
                }
            } catch (Error e4) {
                throw new ExecutionError(e4);
            } catch (InterruptedException e5) {
                Thread.currentThread().interrupt();
                throw new ExecutionException(e5);
            } catch (RuntimeException e6) {
                throw new UncheckedExecutionException(e6);
            }
        } catch (Throwable th2) {
            th = th2;
            z2 = false;
            if (!z2) {
                this.r.recordLoadException(stopwatchCreateStarted.elapsed(TimeUnit.NANOSECONDS));
            }
            throw th;
        }
    }

    public long z() {
        long jMax = 0;
        for (r<K, V> rVar : this.c) {
            jMax += (long) Math.max(0, rVar.b);
        }
        return jMax;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public boolean remove(@NullableDecl Object obj, @NullableDecl Object obj2) {
        if (obj == null || obj2 == null) {
            return false;
        }
        int iU = u(obj);
        return P(iU).S(obj, iU, obj2);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public V replace(K k2, V v2) {
        Preconditions.checkNotNull(k2);
        Preconditions.checkNotNull(v2);
        int iU = u(k2);
        return P(iU).Y(k2, iU, v2);
    }
}
