package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Equivalence;
import com.google.common.base.Preconditions;
import com.google.common.collect.q1.j;
import com.google.common.collect.q1.o;
import com.google.common.primitives.Ints;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.concurrent.GuardedBy;
import com.google.j2objc.annotations.Weak;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes3.dex */
@GwtIncompatible
class q1<K, V, E extends j<K, V, E>, S extends o<K, V, E, S>> extends AbstractMap<K, V> implements ConcurrentMap<K, V>, Serializable {
    public static final int j = 1073741824;
    public static final int k = 65536;
    public static final int l = 3;
    public static final int m = 63;
    public static final int n = 16;
    public static final long o = 60;
    public static final h0<Object, Object, f> p = new a();
    private static final long serialVersionUID = 5;
    public final transient int a;
    public final transient int b;
    public final transient o<K, V, E, S>[] c;
    public final int d;
    public final Equivalence<Object> e;
    public final transient k<K, V, E, S> f;

    @MonotonicNonNullDecl
    public transient Set<K> g;

    @MonotonicNonNullDecl
    public transient Collection<V> h;

    @MonotonicNonNullDecl
    public transient Set<Map.Entry<K, V>> i;

    public static class a implements h0<Object, Object, f> {
        @Override // com.google.common.collect.q1.h0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public h0<Object, Object, f> b(ReferenceQueue<Object> referenceQueue, f fVar) {
            return this;
        }

        @Override // com.google.common.collect.q1.h0
        public void clear() {
        }

        @Override // com.google.common.collect.q1.h0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public f a() {
            return null;
        }

        @Override // com.google.common.collect.q1.h0
        public Object get() {
            return null;
        }
    }

    public static final class a0<K> extends d<K, MapMaker.a, a0<K>> implements x<K, MapMaker.a, a0<K>> {

        public static final class a<K> implements k<K, MapMaker.a, a0<K>, b0<K>> {
            private static final a<?> a = new a<>();

            public static <K> a<K> h() {
                return (a<K>) a;
            }

            @Override // com.google.common.collect.q1.k
            public q b() {
                return q.WEAK;
            }

            @Override // com.google.common.collect.q1.k
            public q d() {
                return q.STRONG;
            }

            @Override // com.google.common.collect.q1.k
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public a0<K> c(b0<K> b0Var, a0<K> a0Var, @NullableDecl a0<K> a0Var2) {
                if (a0Var.getKey() == null) {
                    return null;
                }
                return a0Var.e(((b0) b0Var).h, a0Var2);
            }

            @Override // com.google.common.collect.q1.k
            /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
            public a0<K> e(b0<K> b0Var, K k, int i, @NullableDecl a0<K> a0Var) {
                return new a0<>(((b0) b0Var).h, k, i, a0Var);
            }

            @Override // com.google.common.collect.q1.k
            /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
            public b0<K> f(q1<K, MapMaker.a, a0<K>, b0<K>> q1Var, int i, int i2) {
                return new b0<>(q1Var, i, i2);
            }

            @Override // com.google.common.collect.q1.k
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public void a(b0<K> b0Var, a0<K> a0Var, MapMaker.a aVar) {
            }
        }

        public a0(ReferenceQueue<K> referenceQueue, K k, int i, @NullableDecl a0<K> a0Var) {
            super(referenceQueue, k, i, a0Var);
        }

        public a0<K> e(ReferenceQueue<K> referenceQueue, a0<K> a0Var) {
            return new a0<>(referenceQueue, getKey(), this.a, a0Var);
        }

        @Override // com.google.common.collect.q1.j
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public MapMaker.a getValue() {
            return MapMaker.a.VALUE;
        }

        public void g(MapMaker.a aVar) {
        }
    }

    public static final class b0<K> extends o<K, MapMaker.a, a0<K>, b0<K>> {
        private final ReferenceQueue<K> h;

        public b0(q1<K, MapMaker.a, a0<K>, b0<K>> q1Var, int i, int i2) {
            super(q1Var, i, i2);
            this.h = new ReferenceQueue<>();
        }

        @Override // com.google.common.collect.q1.o
        /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
        public a0<K> a(j<K, MapMaker.a, ?> jVar) {
            return (a0) jVar;
        }

        @Override // com.google.common.collect.q1.o
        /* JADX INFO: renamed from: a0, reason: merged with bridge method [inline-methods] */
        public b0<K> S() {
            return this;
        }

        @Override // com.google.common.collect.q1.o
        public ReferenceQueue<K> q() {
            return this.h;
        }

        @Override // com.google.common.collect.q1.o
        public void y() {
            c(this.h);
        }

        @Override // com.google.common.collect.q1.o
        public void z() {
            j(this.h);
        }
    }

    public static abstract class c<K, V, E extends j<K, V, E>> implements j<K, V, E> {
        public final K a;
        public final int b;

        @NullableDecl
        public final E c;

        public c(K k, int i, @NullableDecl E e) {
            this.a = k;
            this.b = i;
            this.c = e;
        }

        @Override // com.google.common.collect.q1.j
        public E b() {
            return this.c;
        }

        @Override // com.google.common.collect.q1.j
        public int c() {
            return this.b;
        }

        @Override // com.google.common.collect.q1.j
        public K getKey() {
            return this.a;
        }
    }

    public static final class c0<K, V> extends d<K, V, c0<K, V>> implements x<K, V, c0<K, V>> {

        @NullableDecl
        private volatile V c;

        public static final class a<K, V> implements k<K, V, c0<K, V>, d0<K, V>> {
            private static final a<?, ?> a = new a<>();

            public static <K, V> a<K, V> h() {
                return (a<K, V>) a;
            }

            @Override // com.google.common.collect.q1.k
            public q b() {
                return q.WEAK;
            }

            @Override // com.google.common.collect.q1.k
            public q d() {
                return q.STRONG;
            }

            @Override // com.google.common.collect.q1.k
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public c0<K, V> c(d0<K, V> d0Var, c0<K, V> c0Var, @NullableDecl c0<K, V> c0Var2) {
                if (c0Var.getKey() == null) {
                    return null;
                }
                return c0Var.e(((d0) d0Var).h, c0Var2);
            }

            @Override // com.google.common.collect.q1.k
            /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
            public c0<K, V> e(d0<K, V> d0Var, K k, int i, @NullableDecl c0<K, V> c0Var) {
                return new c0<>(((d0) d0Var).h, k, i, c0Var);
            }

            @Override // com.google.common.collect.q1.k
            /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
            public d0<K, V> f(q1<K, V, c0<K, V>, d0<K, V>> q1Var, int i, int i2) {
                return new d0<>(q1Var, i, i2);
            }

            @Override // com.google.common.collect.q1.k
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public void a(d0<K, V> d0Var, c0<K, V> c0Var, V v) {
                c0Var.f(v);
            }
        }

        public c0(ReferenceQueue<K> referenceQueue, K k, int i, @NullableDecl c0<K, V> c0Var) {
            super(referenceQueue, k, i, c0Var);
            this.c = null;
        }

        public c0<K, V> e(ReferenceQueue<K> referenceQueue, c0<K, V> c0Var) {
            c0<K, V> c0Var2 = new c0<>(referenceQueue, getKey(), this.a, c0Var);
            c0Var2.f(this.c);
            return c0Var2;
        }

        public void f(V v) {
            this.c = v;
        }

        @Override // com.google.common.collect.q1.j
        @NullableDecl
        public V getValue() {
            return this.c;
        }
    }

    public static abstract class d<K, V, E extends j<K, V, E>> extends WeakReference<K> implements j<K, V, E> {
        public final int a;

        @NullableDecl
        public final E b;

        public d(ReferenceQueue<K> referenceQueue, K k, int i, @NullableDecl E e) {
            super(k, referenceQueue);
            this.a = i;
            this.b = e;
        }

        @Override // com.google.common.collect.q1.j
        public E b() {
            return this.b;
        }

        @Override // com.google.common.collect.q1.j
        public int c() {
            return this.a;
        }

        @Override // com.google.common.collect.q1.j
        public K getKey() {
            return get();
        }
    }

    public static final class d0<K, V> extends o<K, V, c0<K, V>, d0<K, V>> {
        private final ReferenceQueue<K> h;

        public d0(q1<K, V, c0<K, V>, d0<K, V>> q1Var, int i, int i2) {
            super(q1Var, i, i2);
            this.h = new ReferenceQueue<>();
        }

        @Override // com.google.common.collect.q1.o
        /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
        public c0<K, V> a(j<K, V, ?> jVar) {
            return (c0) jVar;
        }

        @Override // com.google.common.collect.q1.o
        /* JADX INFO: renamed from: a0, reason: merged with bridge method [inline-methods] */
        public d0<K, V> S() {
            return this;
        }

        @Override // com.google.common.collect.q1.o
        public ReferenceQueue<K> q() {
            return this.h;
        }

        @Override // com.google.common.collect.q1.o
        public void y() {
            c(this.h);
        }

        @Override // com.google.common.collect.q1.o
        public void z() {
            j(this.h);
        }
    }

    public static final class e implements Runnable {
        public final WeakReference<q1<?, ?, ?, ?>> a;

        public e(q1<?, ?, ?, ?> q1Var) {
            this.a = new WeakReference<>(q1Var);
        }

        @Override // java.lang.Runnable
        public void run() {
            q1<?, ?, ?, ?> q1Var = this.a.get();
            if (q1Var == null) {
                throw new CancellationException();
            }
            for (o<?, ?, E, S> oVar : q1Var.c) {
                oVar.Q();
            }
        }
    }

    public static final class e0<K, V> extends d<K, V, e0<K, V>> implements g0<K, V, e0<K, V>> {
        private volatile h0<K, V, e0<K, V>> c;

        public static final class a<K, V> implements k<K, V, e0<K, V>, f0<K, V>> {
            private static final a<?, ?> a = new a<>();

            public static <K, V> a<K, V> h() {
                return (a<K, V>) a;
            }

            @Override // com.google.common.collect.q1.k
            public q b() {
                return q.WEAK;
            }

            @Override // com.google.common.collect.q1.k
            public q d() {
                return q.WEAK;
            }

            @Override // com.google.common.collect.q1.k
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public e0<K, V> c(f0<K, V> f0Var, e0<K, V> e0Var, @NullableDecl e0<K, V> e0Var2) {
                if (e0Var.getKey() == null || o.x(e0Var)) {
                    return null;
                }
                return e0Var.g(((f0) f0Var).h, ((f0) f0Var).i, e0Var2);
            }

            @Override // com.google.common.collect.q1.k
            /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
            public e0<K, V> e(f0<K, V> f0Var, K k, int i, @NullableDecl e0<K, V> e0Var) {
                return new e0<>(((f0) f0Var).h, k, i, e0Var);
            }

            @Override // com.google.common.collect.q1.k
            /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
            public f0<K, V> f(q1<K, V, e0<K, V>, f0<K, V>> q1Var, int i, int i2) {
                return new f0<>(q1Var, i, i2);
            }

            @Override // com.google.common.collect.q1.k
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public void a(f0<K, V> f0Var, e0<K, V> e0Var, V v) {
                e0Var.h(v, ((f0) f0Var).i);
            }
        }

        public e0(ReferenceQueue<K> referenceQueue, K k, int i, @NullableDecl e0<K, V> e0Var) {
            super(referenceQueue, k, i, e0Var);
            this.c = q1.t();
        }

        @Override // com.google.common.collect.q1.g0
        public h0<K, V, e0<K, V>> a() {
            return this.c;
        }

        @Override // com.google.common.collect.q1.g0
        public void d() {
            this.c.clear();
        }

        public e0<K, V> g(ReferenceQueue<K> referenceQueue, ReferenceQueue<V> referenceQueue2, e0<K, V> e0Var) {
            e0<K, V> e0Var2 = new e0<>(referenceQueue, getKey(), this.a, e0Var);
            e0Var2.c = this.c.b(referenceQueue2, e0Var2);
            return e0Var2;
        }

        @Override // com.google.common.collect.q1.j
        public V getValue() {
            return this.c.get();
        }

        public void h(V v, ReferenceQueue<V> referenceQueue) {
            h0<K, V, e0<K, V>> h0Var = this.c;
            this.c = new i0(referenceQueue, v, this);
            h0Var.clear();
        }
    }

    public static final class f implements j<Object, Object, f> {
        private f() {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.q1.j
        public int c() {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.q1.j
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public f b() {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.q1.j
        public Object getKey() {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.q1.j
        public Object getValue() {
            throw new AssertionError();
        }
    }

    public static final class f0<K, V> extends o<K, V, e0<K, V>, f0<K, V>> {
        private final ReferenceQueue<K> h;
        private final ReferenceQueue<V> i;

        public f0(q1<K, V, e0<K, V>, f0<K, V>> q1Var, int i, int i2) {
            super(q1Var, i, i2);
            this.h = new ReferenceQueue<>();
            this.i = new ReferenceQueue<>();
        }

        @Override // com.google.common.collect.q1.o
        public h0<K, V, e0<K, V>> C(j<K, V, ?> jVar, V v) {
            return new i0(this.i, v, a(jVar));
        }

        @Override // com.google.common.collect.q1.o
        public void W(j<K, V, ?> jVar, h0<K, V, ? extends j<K, V, ?>> h0Var) {
            e0<K, V> e0VarA = a(jVar);
            h0 h0Var2 = ((e0) e0VarA).c;
            ((e0) e0VarA).c = h0Var;
            h0Var2.clear();
        }

        @Override // com.google.common.collect.q1.o
        /* JADX INFO: renamed from: a0, reason: merged with bridge method [inline-methods] */
        public e0<K, V> a(j<K, V, ?> jVar) {
            return (e0) jVar;
        }

        @Override // com.google.common.collect.q1.o
        /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
        public f0<K, V> S() {
            return this;
        }

        @Override // com.google.common.collect.q1.o
        public ReferenceQueue<K> q() {
            return this.h;
        }

        @Override // com.google.common.collect.q1.o
        public ReferenceQueue<V> u() {
            return this.i;
        }

        @Override // com.google.common.collect.q1.o
        public h0<K, V, e0<K, V>> v(j<K, V, ?> jVar) {
            return a(jVar).a();
        }

        @Override // com.google.common.collect.q1.o
        public void y() {
            c(this.h);
        }

        @Override // com.google.common.collect.q1.o
        public void z() {
            j(this.h);
            k(this.i);
        }
    }

    public final class g extends q1<K, V, E, S>.i<Map.Entry<K, V>> {
        public g() {
            super();
        }

        @Override // com.google.common.collect.q1.i, java.util.Iterator
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            return c();
        }
    }

    public interface g0<K, V, E extends j<K, V, E>> extends j<K, V, E> {
        h0<K, V, E> a();

        void d();
    }

    public final class h extends n<Map.Entry<K, V>> {
        public h() {
            super(null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            q1.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry;
            Object key;
            Object obj2;
            return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && (obj2 = q1.this.get(key)) != null && q1.this.u().equivalent(entry.getValue(), obj2);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return q1.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new g();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry;
            Object key;
            return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && q1.this.remove(key, entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return q1.this.size();
        }
    }

    public interface h0<K, V, E extends j<K, V, E>> {
        E a();

        h0<K, V, E> b(ReferenceQueue<V> referenceQueue, E e);

        void clear();

        @NullableDecl
        V get();
    }

    public abstract class i<T> implements Iterator<T> {
        public int a;
        public int b = -1;

        @MonotonicNonNullDecl
        public o<K, V, E, S> c;

        @MonotonicNonNullDecl
        public AtomicReferenceArray<E> d;

        @NullableDecl
        public E e;

        @NullableDecl
        public q1<K, V, E, S>.j0 f;

        @NullableDecl
        public q1<K, V, E, S>.j0 g;

        public i() {
            this.a = q1.this.c.length - 1;
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
                o<K, V, E, S>[] oVarArr = q1.this.c;
                this.a = i - 1;
                o<K, V, E, S> oVar = oVarArr[i];
                this.c = oVar;
                if (oVar.b != 0) {
                    AtomicReferenceArray<E> atomicReferenceArray = this.c.e;
                    this.d = atomicReferenceArray;
                    this.b = atomicReferenceArray.length() - 1;
                    if (e()) {
                        return;
                    }
                }
            }
        }

        public boolean b(E e) {
            boolean z;
            try {
                Object key = e.getKey();
                Object objI = q1.this.i(e);
                if (objI != null) {
                    this.f = new j0(key, objI);
                    z = true;
                } else {
                    z = false;
                }
                return z;
            } finally {
                this.c.D();
            }
        }

        public q1<K, V, E, S>.j0 c() {
            q1<K, V, E, S>.j0 j0Var = this.f;
            if (j0Var == null) {
                throw new NoSuchElementException();
            }
            this.g = j0Var;
            a();
            return this.g;
        }

        public boolean d() {
            E e = this.e;
            if (e == null) {
                return false;
            }
            while (true) {
                this.e = (E) e.b();
                E e2 = this.e;
                if (e2 == null) {
                    return false;
                }
                if (b(e2)) {
                    return true;
                }
                e = this.e;
            }
        }

        public boolean e() {
            while (true) {
                int i = this.b;
                if (i < 0) {
                    return false;
                }
                AtomicReferenceArray<E> atomicReferenceArray = this.d;
                this.b = i - 1;
                E e = atomicReferenceArray.get(i);
                this.e = e;
                if (e != null && (b(e) || d())) {
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
            com.google.common.collect.u.e(this.g != null);
            q1.this.remove(this.g.getKey());
            this.g = null;
        }
    }

    public static final class i0<K, V, E extends j<K, V, E>> extends WeakReference<V> implements h0<K, V, E> {

        @Weak
        public final E a;

        public i0(ReferenceQueue<V> referenceQueue, V v, E e) {
            super(v, referenceQueue);
            this.a = e;
        }

        @Override // com.google.common.collect.q1.h0
        public E a() {
            return this.a;
        }

        @Override // com.google.common.collect.q1.h0
        public h0<K, V, E> b(ReferenceQueue<V> referenceQueue, E e) {
            return new i0(referenceQueue, get(), e);
        }
    }

    public interface j<K, V, E extends j<K, V, E>> {
        E b();

        int c();

        K getKey();

        V getValue();
    }

    public final class j0 extends com.google.common.collect.f<K, V> {
        public final K a;
        public V b;

        public j0(K k, V v) {
            this.a = k;
            this.b = v;
        }

        @Override // com.google.common.collect.f, java.util.Map.Entry
        public boolean equals(@NullableDecl Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return this.a.equals(entry.getKey()) && this.b.equals(entry.getValue());
        }

        @Override // com.google.common.collect.f, java.util.Map.Entry
        public K getKey() {
            return this.a;
        }

        @Override // com.google.common.collect.f, java.util.Map.Entry
        public V getValue() {
            return this.b;
        }

        @Override // com.google.common.collect.f, java.util.Map.Entry
        public int hashCode() {
            return this.a.hashCode() ^ this.b.hashCode();
        }

        @Override // com.google.common.collect.f, java.util.Map.Entry
        public V setValue(V v) {
            V v2 = (V) q1.this.put(this.a, v);
            this.b = v;
            return v2;
        }
    }

    public interface k<K, V, E extends j<K, V, E>, S extends o<K, V, E, S>> {
        void a(S s, E e, V v);

        q b();

        E c(S s, E e, @NullableDecl E e2);

        q d();

        E e(S s, K k, int i, @NullableDecl E e);

        S f(q1<K, V, E, S> q1Var, int i, int i2);
    }

    public final class l extends q1<K, V, E, S>.i<K> {
        public l() {
            super();
        }

        @Override // com.google.common.collect.q1.i, java.util.Iterator
        public K next() {
            return c().getKey();
        }
    }

    public final class m extends n<K> {
        public m() {
            super(null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            q1.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return q1.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return q1.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new l();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return q1.this.remove(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return q1.this.size();
        }
    }

    public static abstract class n<E> extends AbstractSet<E> {
        private n() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public Object[] toArray() {
            return q1.s(this).toArray();
        }

        public /* synthetic */ n(a aVar) {
            this();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            return (T[]) q1.s(this).toArray(tArr);
        }
    }

    public static abstract class o<K, V, E extends j<K, V, E>, S extends o<K, V, E, S>> extends ReentrantLock {

        @Weak
        public final q1<K, V, E, S> a;
        public volatile int b;
        public int c;
        public int d;

        @MonotonicNonNullDecl
        public volatile AtomicReferenceArray<E> e;
        public final int f;
        public final AtomicInteger g = new AtomicInteger();

        public o(q1<K, V, E, S> q1Var, int i, int i2) {
            this.a = q1Var;
            this.f = i2;
            w(A(i));
        }

        public static <K, V, E extends j<K, V, E>> boolean x(E e) {
            return e.getValue() == null;
        }

        public AtomicReferenceArray<E> A(int i) {
            return new AtomicReferenceArray<>(i);
        }

        public E B(K k, int i, @NullableDecl j<K, V, ?> jVar) {
            return (E) this.a.f.e(S(), k, i, a(jVar));
        }

        public h0<K, V, E> C(j<K, V, ?> jVar, V v) {
            throw new AssertionError();
        }

        public void D() {
            if ((this.g.incrementAndGet() & 63) == 0) {
                Q();
            }
        }

        @GuardedBy("this")
        public void E() {
            R();
        }

        public V F(K k, int i, V v, boolean z) {
            lock();
            try {
                E();
                int i2 = this.b + 1;
                if (i2 > this.d) {
                    m();
                    i2 = this.b + 1;
                }
                AtomicReferenceArray<E> atomicReferenceArray = this.e;
                int length = (atomicReferenceArray.length() - 1) & i;
                E e = atomicReferenceArray.get(length);
                for (j jVarB = e; jVarB != null; jVarB = jVarB.b()) {
                    Object key = jVarB.getKey();
                    if (jVarB.c() == i && key != null && this.a.e.equivalent(k, key)) {
                        V v2 = (V) jVarB.getValue();
                        if (v2 == null) {
                            this.c++;
                            U(jVarB, v);
                            this.b = this.b;
                            return null;
                        }
                        if (z) {
                            return v2;
                        }
                        this.c++;
                        U(jVarB, v);
                        return v2;
                    }
                }
                this.c++;
                j jVarE = this.a.f.e(S(), k, i, e);
                U(jVarE, v);
                atomicReferenceArray.set(length, (E) jVarE);
                this.b = i2;
                return null;
            } finally {
                unlock();
            }
        }

        @CanIgnoreReturnValue
        public boolean G(E e, int i) {
            lock();
            try {
                AtomicReferenceArray<E> atomicReferenceArray = this.e;
                int length = i & (atomicReferenceArray.length() - 1);
                E e2 = atomicReferenceArray.get(length);
                for (j jVarB = e2; jVarB != null; jVarB = jVarB.b()) {
                    if (jVarB == e) {
                        this.c++;
                        j jVarL = L(e2, jVarB);
                        int i2 = this.b - 1;
                        atomicReferenceArray.set(length, (E) jVarL);
                        this.b = i2;
                        return true;
                    }
                }
                return false;
            } finally {
                unlock();
            }
        }

        @CanIgnoreReturnValue
        public boolean H(K k, int i, h0<K, V, E> h0Var) {
            lock();
            try {
                AtomicReferenceArray<E> atomicReferenceArray = this.e;
                int length = (atomicReferenceArray.length() - 1) & i;
                E e = atomicReferenceArray.get(length);
                for (j jVarB = e; jVarB != null; jVarB = jVarB.b()) {
                    Object key = jVarB.getKey();
                    if (jVarB.c() == i && key != null && this.a.e.equivalent(k, key)) {
                        if (((g0) jVarB).a() != h0Var) {
                            return false;
                        }
                        this.c++;
                        j jVarL = L(e, jVarB);
                        int i2 = this.b - 1;
                        atomicReferenceArray.set(length, (E) jVarL);
                        this.b = i2;
                        return true;
                    }
                }
                return false;
            } finally {
                unlock();
            }
        }

        @CanIgnoreReturnValue
        public V I(Object obj, int i) {
            lock();
            try {
                E();
                AtomicReferenceArray<E> atomicReferenceArray = this.e;
                int length = (atomicReferenceArray.length() - 1) & i;
                E e = atomicReferenceArray.get(length);
                for (j jVarB = e; jVarB != null; jVarB = jVarB.b()) {
                    Object key = jVarB.getKey();
                    if (jVarB.c() == i && key != null && this.a.e.equivalent(obj, key)) {
                        V v = (V) jVarB.getValue();
                        if (v == null && !x(jVarB)) {
                            return null;
                        }
                        this.c++;
                        j jVarL = L(e, jVarB);
                        int i2 = this.b - 1;
                        atomicReferenceArray.set(length, (E) jVarL);
                        this.b = i2;
                        return v;
                    }
                }
                return null;
            } finally {
                unlock();
            }
        }

        public boolean J(Object obj, int i, Object obj2) {
            lock();
            try {
                E();
                AtomicReferenceArray<E> atomicReferenceArray = this.e;
                int length = (atomicReferenceArray.length() - 1) & i;
                E e = atomicReferenceArray.get(length);
                j jVarB = e;
                while (true) {
                    boolean z = false;
                    if (jVarB == null) {
                        return false;
                    }
                    Object key = jVarB.getKey();
                    if (jVarB.c() == i && key != null && this.a.e.equivalent(obj, key)) {
                        if (this.a.u().equivalent(obj2, jVarB.getValue())) {
                            z = true;
                        } else if (!x(jVarB)) {
                            return false;
                        }
                        this.c++;
                        j jVarL = L(e, jVarB);
                        int i2 = this.b - 1;
                        atomicReferenceArray.set(length, (E) jVarL);
                        this.b = i2;
                        return z;
                    }
                    jVarB = jVarB.b();
                }
            } finally {
                unlock();
            }
        }

        @GuardedBy("this")
        public boolean K(E e) {
            int iC = e.c();
            AtomicReferenceArray<E> atomicReferenceArray = this.e;
            int length = iC & (atomicReferenceArray.length() - 1);
            E e2 = atomicReferenceArray.get(length);
            for (j jVarB = e2; jVarB != null; jVarB = jVarB.b()) {
                if (jVarB == e) {
                    this.c++;
                    j jVarL = L(e2, jVarB);
                    int i = this.b - 1;
                    atomicReferenceArray.set(length, (E) jVarL);
                    this.b = i;
                    return true;
                }
            }
            return false;
        }

        @GuardedBy("this")
        public E L(E e, E e2) {
            int i = this.b;
            E e3 = (E) e2.b();
            while (e != e2) {
                j jVarH = h(e, e3);
                if (jVarH != null) {
                    e3 = (E) jVarH;
                } else {
                    i--;
                }
                e = (E) e.b();
            }
            this.b = i;
            return e3;
        }

        public E M(j<K, V, ?> jVar, j<K, V, ?> jVar2) {
            return (E) L(a(jVar), a(jVar2));
        }

        @CanIgnoreReturnValue
        public boolean N(j<K, V, ?> jVar) {
            return K(a(jVar));
        }

        public V O(K k, int i, V v) {
            lock();
            try {
                E();
                AtomicReferenceArray<E> atomicReferenceArray = this.e;
                int length = (atomicReferenceArray.length() - 1) & i;
                E e = atomicReferenceArray.get(length);
                for (j jVarB = e; jVarB != null; jVarB = jVarB.b()) {
                    Object key = jVarB.getKey();
                    if (jVarB.c() == i && key != null && this.a.e.equivalent(k, key)) {
                        V v2 = (V) jVarB.getValue();
                        if (v2 != null) {
                            this.c++;
                            U(jVarB, v);
                            return v2;
                        }
                        if (x(jVarB)) {
                            this.c++;
                            j jVarL = L(e, jVarB);
                            int i2 = this.b - 1;
                            atomicReferenceArray.set(length, (E) jVarL);
                            this.b = i2;
                        }
                        return null;
                    }
                }
                return null;
            } finally {
                unlock();
            }
        }

        public boolean P(K k, int i, V v, V v2) {
            lock();
            try {
                E();
                AtomicReferenceArray<E> atomicReferenceArray = this.e;
                int length = (atomicReferenceArray.length() - 1) & i;
                E e = atomicReferenceArray.get(length);
                for (j jVarB = e; jVarB != null; jVarB = jVarB.b()) {
                    Object key = jVarB.getKey();
                    if (jVarB.c() == i && key != null && this.a.e.equivalent(k, key)) {
                        Object value = jVarB.getValue();
                        if (value != null) {
                            if (!this.a.u().equivalent(v, value)) {
                                return false;
                            }
                            this.c++;
                            U(jVarB, v2);
                            return true;
                        }
                        if (x(jVarB)) {
                            this.c++;
                            j jVarL = L(e, jVarB);
                            int i2 = this.b - 1;
                            atomicReferenceArray.set(length, (E) jVarL);
                            this.b = i2;
                        }
                        return false;
                    }
                }
                return false;
            } finally {
                unlock();
            }
        }

        public void Q() {
            R();
        }

        public void R() {
            if (tryLock()) {
                try {
                    z();
                    this.g.set(0);
                } finally {
                    unlock();
                }
            }
        }

        public abstract S S();

        public void T(int i, j<K, V, ?> jVar) {
            this.e.set(i, (E) a(jVar));
        }

        public void U(E e, V v) {
            this.a.f.a(S(), e, v);
        }

        public void V(j<K, V, ?> jVar, V v) {
            this.a.f.a(S(), a(jVar), v);
        }

        public void W(j<K, V, ?> jVar, h0<K, V, ? extends j<K, V, ?>> h0Var) {
            throw new AssertionError();
        }

        public void X() {
            if (tryLock()) {
                try {
                    z();
                } finally {
                    unlock();
                }
            }
        }

        public abstract E a(j<K, V, ?> jVar);

        public void b() {
            if (this.b != 0) {
                lock();
                try {
                    AtomicReferenceArray<E> atomicReferenceArray = this.e;
                    for (int i = 0; i < atomicReferenceArray.length(); i++) {
                        atomicReferenceArray.set(i, null);
                    }
                    y();
                    this.g.set(0);
                    this.c++;
                    this.b = 0;
                } finally {
                    unlock();
                }
            }
        }

        public <T> void c(ReferenceQueue<T> referenceQueue) {
            while (referenceQueue.poll() != null) {
            }
        }

        @CanIgnoreReturnValue
        public boolean e(K k, int i, h0<K, V, ? extends j<K, V, ?>> h0Var) {
            lock();
            try {
                AtomicReferenceArray<E> atomicReferenceArray = this.e;
                int length = (atomicReferenceArray.length() - 1) & i;
                E e = atomicReferenceArray.get(length);
                for (j jVarB = e; jVarB != null; jVarB = jVarB.b()) {
                    Object key = jVarB.getKey();
                    if (jVarB.c() == i && key != null && this.a.e.equivalent(k, key)) {
                        if (((g0) jVarB).a() != h0Var) {
                            return false;
                        }
                        atomicReferenceArray.set(length, (E) L(e, jVarB));
                        return true;
                    }
                }
                return false;
            } finally {
                unlock();
            }
        }

        public boolean f(Object obj, int i) {
            try {
                boolean z = false;
                if (this.b == 0) {
                    return false;
                }
                j jVarR = r(obj, i);
                if (jVarR != null && jVarR.getValue() != null) {
                    z = true;
                }
                return z;
            } finally {
                D();
            }
        }

        @VisibleForTesting
        public boolean g(Object obj) {
            try {
                if (this.b != 0) {
                    AtomicReferenceArray<E> atomicReferenceArray = this.e;
                    int length = atomicReferenceArray.length();
                    for (int i = 0; i < length; i++) {
                        for (E eB = atomicReferenceArray.get(i); eB != null; eB = eB.b()) {
                            V vS = s(eB);
                            if (vS != null && this.a.u().equivalent(obj, vS)) {
                                return true;
                            }
                        }
                    }
                }
                return false;
            } finally {
                D();
            }
        }

        public E h(E e, E e2) {
            return (E) this.a.f.c(S(), e, e2);
        }

        public E i(j<K, V, ?> jVar, @NullableDecl j<K, V, ?> jVar2) {
            return (E) this.a.f.c(S(), a(jVar), a(jVar2));
        }

        @GuardedBy("this")
        public void j(ReferenceQueue<K> referenceQueue) {
            int i = 0;
            do {
                Reference<? extends K> referencePoll = referenceQueue.poll();
                if (referencePoll == null) {
                    return;
                }
                this.a.o((j) referencePoll);
                i++;
            } while (i != 16);
        }

        @GuardedBy("this")
        public void k(ReferenceQueue<V> referenceQueue) {
            int i = 0;
            do {
                Reference<? extends V> referencePoll = referenceQueue.poll();
                if (referencePoll == null) {
                    return;
                }
                this.a.p((h0) referencePoll);
                i++;
            } while (i != 16);
        }

        @GuardedBy("this")
        public void m() {
            AtomicReferenceArray<E> atomicReferenceArray = this.e;
            int length = atomicReferenceArray.length();
            if (length >= 1073741824) {
                return;
            }
            int i = this.b;
            AtomicReferenceArray<E> atomicReferenceArrayA = A(length << 1);
            this.d = (atomicReferenceArrayA.length() * 3) / 4;
            int length2 = atomicReferenceArrayA.length() - 1;
            for (int i2 = 0; i2 < length; i2++) {
                E eB = atomicReferenceArray.get(i2);
                if (eB != null) {
                    j jVarB = eB.b();
                    int iC = eB.c() & length2;
                    if (jVarB == null) {
                        atomicReferenceArrayA.set(iC, eB);
                    } else {
                        j jVar = eB;
                        while (jVarB != null) {
                            int iC2 = jVarB.c() & length2;
                            if (iC2 != iC) {
                                jVar = jVarB;
                                iC = iC2;
                            }
                            jVarB = jVarB.b();
                        }
                        atomicReferenceArrayA.set(iC, jVar);
                        while (eB != jVar) {
                            int iC3 = eB.c() & length2;
                            j jVarH = h(eB, (j) atomicReferenceArrayA.get(iC3));
                            if (jVarH != null) {
                                atomicReferenceArrayA.set(iC3, jVarH);
                            } else {
                                i--;
                            }
                            eB = eB.b();
                        }
                    }
                }
            }
            this.e = atomicReferenceArrayA;
            this.b = i;
        }

        public V n(Object obj, int i) {
            try {
                j jVarR = r(obj, i);
                if (jVarR == null) {
                    return null;
                }
                V v = (V) jVarR.getValue();
                if (v == null) {
                    X();
                }
                return v;
            } finally {
                D();
            }
        }

        public E o(Object obj, int i) {
            if (this.b == 0) {
                return null;
            }
            for (E e = (E) p(i); e != null; e = (E) e.b()) {
                if (e.c() == i) {
                    Object key = e.getKey();
                    if (key == null) {
                        X();
                    } else if (this.a.e.equivalent(obj, key)) {
                        return e;
                    }
                }
            }
            return null;
        }

        public E p(int i) {
            AtomicReferenceArray<E> atomicReferenceArray = this.e;
            return atomicReferenceArray.get(i & (atomicReferenceArray.length() - 1));
        }

        public ReferenceQueue<K> q() {
            throw new AssertionError();
        }

        public E r(Object obj, int i) {
            return (E) o(obj, i);
        }

        @NullableDecl
        public V s(E e) {
            if (e.getKey() == null) {
                X();
                return null;
            }
            V v = (V) e.getValue();
            if (v != null) {
                return v;
            }
            X();
            return null;
        }

        @NullableDecl
        public V t(j<K, V, ?> jVar) {
            return s(a(jVar));
        }

        public ReferenceQueue<V> u() {
            throw new AssertionError();
        }

        public h0<K, V, E> v(j<K, V, ?> jVar) {
            throw new AssertionError();
        }

        public void w(AtomicReferenceArray<E> atomicReferenceArray) {
            int length = (atomicReferenceArray.length() * 3) / 4;
            this.d = length;
            if (length == this.f) {
                this.d = length + 1;
            }
            this.e = atomicReferenceArray;
        }

        public void y() {
        }

        @GuardedBy("this")
        public void z() {
        }
    }

    public static final class p<K, V> extends b<K, V> {
        private static final long serialVersionUID = 3;

        public p(q qVar, q qVar2, Equivalence<Object> equivalence, Equivalence<Object> equivalence2, int i, ConcurrentMap<K, V> concurrentMap) {
            super(qVar, qVar2, equivalence, equivalence2, i, concurrentMap);
        }

        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            this.f = f(objectInputStream).makeMap();
            e(objectInputStream);
        }

        private Object readResolve() {
            return this.f;
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            g(objectOutputStream);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static abstract class q {
        private static final /* synthetic */ q[] $VALUES;
        public static final q STRONG;
        public static final q WEAK;

        public static enum a extends q {
            public a(String str, int i) {
                super(str, i, null);
            }

            @Override // com.google.common.collect.q1.q
            public Equivalence<Object> a() {
                return Equivalence.equals();
            }
        }

        public static enum b extends q {
            public b(String str, int i) {
                super(str, i, null);
            }

            @Override // com.google.common.collect.q1.q
            public Equivalence<Object> a() {
                return Equivalence.identity();
            }
        }

        static {
            a aVar = new a("STRONG", 0);
            STRONG = aVar;
            b bVar = new b("WEAK", 1);
            WEAK = bVar;
            $VALUES = new q[]{aVar, bVar};
        }

        private q(String str, int i) {
            super(str, i);
        }

        public static q valueOf(String str) {
            return (q) Enum.valueOf(q.class, str);
        }

        public static q[] values() {
            return (q[]) $VALUES.clone();
        }

        public abstract Equivalence<Object> a();

        public /* synthetic */ q(String str, int i, a aVar) {
            this(str, i);
        }
    }

    public static final class r<K> extends c<K, MapMaker.a, r<K>> implements x<K, MapMaker.a, r<K>> {

        public static final class a<K> implements k<K, MapMaker.a, r<K>, s<K>> {
            private static final a<?> a = new a<>();

            public static <K> a<K> h() {
                return (a<K>) a;
            }

            @Override // com.google.common.collect.q1.k
            public q b() {
                return q.STRONG;
            }

            @Override // com.google.common.collect.q1.k
            public q d() {
                return q.STRONG;
            }

            @Override // com.google.common.collect.q1.k
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public r<K> c(s<K> sVar, r<K> rVar, @NullableDecl r<K> rVar2) {
                return rVar.e(rVar2);
            }

            @Override // com.google.common.collect.q1.k
            /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
            public r<K> e(s<K> sVar, K k, int i, @NullableDecl r<K> rVar) {
                return new r<>(k, i, rVar);
            }

            @Override // com.google.common.collect.q1.k
            /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
            public s<K> f(q1<K, MapMaker.a, r<K>, s<K>> q1Var, int i, int i2) {
                return new s<>(q1Var, i, i2);
            }

            @Override // com.google.common.collect.q1.k
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public void a(s<K> sVar, r<K> rVar, MapMaker.a aVar) {
            }
        }

        public r(K k, int i, @NullableDecl r<K> rVar) {
            super(k, i, rVar);
        }

        public r<K> e(r<K> rVar) {
            return new r<>(this.a, this.b, rVar);
        }

        @Override // com.google.common.collect.q1.j
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public MapMaker.a getValue() {
            return MapMaker.a.VALUE;
        }

        public void g(MapMaker.a aVar) {
        }
    }

    public static final class s<K> extends o<K, MapMaker.a, r<K>, s<K>> {
        public s(q1<K, MapMaker.a, r<K>, s<K>> q1Var, int i, int i2) {
            super(q1Var, i, i2);
        }

        @Override // com.google.common.collect.q1.o
        /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
        public r<K> a(j<K, MapMaker.a, ?> jVar) {
            return (r) jVar;
        }

        @Override // com.google.common.collect.q1.o
        /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
        public s<K> S() {
            return this;
        }
    }

    public static final class t<K, V> extends c<K, V, t<K, V>> implements x<K, V, t<K, V>> {

        @NullableDecl
        private volatile V d;

        public static final class a<K, V> implements k<K, V, t<K, V>, u<K, V>> {
            private static final a<?, ?> a = new a<>();

            public static <K, V> a<K, V> h() {
                return (a<K, V>) a;
            }

            @Override // com.google.common.collect.q1.k
            public q b() {
                return q.STRONG;
            }

            @Override // com.google.common.collect.q1.k
            public q d() {
                return q.STRONG;
            }

            @Override // com.google.common.collect.q1.k
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public t<K, V> c(u<K, V> uVar, t<K, V> tVar, @NullableDecl t<K, V> tVar2) {
                return tVar.e(tVar2);
            }

            @Override // com.google.common.collect.q1.k
            /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
            public t<K, V> e(u<K, V> uVar, K k, int i, @NullableDecl t<K, V> tVar) {
                return new t<>(k, i, tVar);
            }

            @Override // com.google.common.collect.q1.k
            /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
            public u<K, V> f(q1<K, V, t<K, V>, u<K, V>> q1Var, int i, int i2) {
                return new u<>(q1Var, i, i2);
            }

            @Override // com.google.common.collect.q1.k
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public void a(u<K, V> uVar, t<K, V> tVar, V v) {
                tVar.f(v);
            }
        }

        public t(K k, int i, @NullableDecl t<K, V> tVar) {
            super(k, i, tVar);
            this.d = null;
        }

        public t<K, V> e(t<K, V> tVar) {
            t<K, V> tVar2 = new t<>(this.a, this.b, tVar);
            tVar2.d = this.d;
            return tVar2;
        }

        public void f(V v) {
            this.d = v;
        }

        @Override // com.google.common.collect.q1.j
        @NullableDecl
        public V getValue() {
            return this.d;
        }
    }

    public static final class u<K, V> extends o<K, V, t<K, V>, u<K, V>> {
        public u(q1<K, V, t<K, V>, u<K, V>> q1Var, int i, int i2) {
            super(q1Var, i, i2);
        }

        @Override // com.google.common.collect.q1.o
        /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
        public t<K, V> a(j<K, V, ?> jVar) {
            return (t) jVar;
        }

        @Override // com.google.common.collect.q1.o
        /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
        public u<K, V> S() {
            return this;
        }
    }

    public static final class v<K, V> extends c<K, V, v<K, V>> implements g0<K, V, v<K, V>> {
        private volatile h0<K, V, v<K, V>> d;

        public static final class a<K, V> implements k<K, V, v<K, V>, w<K, V>> {
            private static final a<?, ?> a = new a<>();

            public static <K, V> a<K, V> h() {
                return (a<K, V>) a;
            }

            @Override // com.google.common.collect.q1.k
            public q b() {
                return q.STRONG;
            }

            @Override // com.google.common.collect.q1.k
            public q d() {
                return q.WEAK;
            }

            @Override // com.google.common.collect.q1.k
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public v<K, V> c(w<K, V> wVar, v<K, V> vVar, @NullableDecl v<K, V> vVar2) {
                if (o.x(vVar)) {
                    return null;
                }
                return vVar.g(((w) wVar).h, vVar2);
            }

            @Override // com.google.common.collect.q1.k
            /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
            public v<K, V> e(w<K, V> wVar, K k, int i, @NullableDecl v<K, V> vVar) {
                return new v<>(k, i, vVar);
            }

            @Override // com.google.common.collect.q1.k
            /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
            public w<K, V> f(q1<K, V, v<K, V>, w<K, V>> q1Var, int i, int i2) {
                return new w<>(q1Var, i, i2);
            }

            @Override // com.google.common.collect.q1.k
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public void a(w<K, V> wVar, v<K, V> vVar, V v) {
                vVar.h(v, ((w) wVar).h);
            }
        }

        public v(K k, int i, @NullableDecl v<K, V> vVar) {
            super(k, i, vVar);
            this.d = q1.t();
        }

        @Override // com.google.common.collect.q1.g0
        public h0<K, V, v<K, V>> a() {
            return this.d;
        }

        @Override // com.google.common.collect.q1.g0
        public void d() {
            this.d.clear();
        }

        public v<K, V> g(ReferenceQueue<V> referenceQueue, v<K, V> vVar) {
            v<K, V> vVar2 = new v<>(this.a, this.b, vVar);
            vVar2.d = this.d.b(referenceQueue, vVar2);
            return vVar2;
        }

        @Override // com.google.common.collect.q1.j
        public V getValue() {
            return this.d.get();
        }

        public void h(V v, ReferenceQueue<V> referenceQueue) {
            h0<K, V, v<K, V>> h0Var = this.d;
            this.d = new i0(referenceQueue, v, this);
            h0Var.clear();
        }
    }

    public static final class w<K, V> extends o<K, V, v<K, V>, w<K, V>> {
        private final ReferenceQueue<V> h;

        public w(q1<K, V, v<K, V>, w<K, V>> q1Var, int i, int i2) {
            super(q1Var, i, i2);
            this.h = new ReferenceQueue<>();
        }

        @Override // com.google.common.collect.q1.o
        public h0<K, V, v<K, V>> C(j<K, V, ?> jVar, V v) {
            return new i0(this.h, v, a(jVar));
        }

        @Override // com.google.common.collect.q1.o
        public void W(j<K, V, ?> jVar, h0<K, V, ? extends j<K, V, ?>> h0Var) {
            v<K, V> vVarA = a(jVar);
            h0 h0Var2 = ((v) vVarA).d;
            ((v) vVarA).d = h0Var;
            h0Var2.clear();
        }

        @Override // com.google.common.collect.q1.o
        /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
        public v<K, V> a(j<K, V, ?> jVar) {
            return (v) jVar;
        }

        @Override // com.google.common.collect.q1.o
        /* JADX INFO: renamed from: a0, reason: merged with bridge method [inline-methods] */
        public w<K, V> S() {
            return this;
        }

        @Override // com.google.common.collect.q1.o
        public ReferenceQueue<V> u() {
            return this.h;
        }

        @Override // com.google.common.collect.q1.o
        public h0<K, V, v<K, V>> v(j<K, V, ?> jVar) {
            return a(jVar).a();
        }

        @Override // com.google.common.collect.q1.o
        public void y() {
            c(this.h);
        }

        @Override // com.google.common.collect.q1.o
        public void z() {
            k(this.h);
        }
    }

    public interface x<K, V, E extends j<K, V, E>> extends j<K, V, E> {
    }

    public final class y extends q1<K, V, E, S>.i<V> {
        public y() {
            super();
        }

        @Override // com.google.common.collect.q1.i, java.util.Iterator
        public V next() {
            return c().getValue();
        }
    }

    public final class z extends AbstractCollection<V> {
        public z() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            q1.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return q1.this.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return q1.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return new y();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return q1.this.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public Object[] toArray() {
            return q1.s(this).toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) q1.s(this).toArray(tArr);
        }
    }

    private q1(MapMaker mapMaker, k<K, V, E, S> kVar) {
        this.d = Math.min(mapMaker.a(), 65536);
        this.e = mapMaker.c();
        this.f = kVar;
        int iMin = Math.min(mapMaker.b(), 1073741824);
        int i2 = 0;
        int i3 = 1;
        int i4 = 1;
        int i5 = 0;
        while (i4 < this.d) {
            i5++;
            i4 <<= 1;
        }
        this.b = 32 - i5;
        this.a = i4 - 1;
        this.c = n(i4);
        int i6 = iMin / i4;
        while (i3 < (i4 * i6 < iMin ? i6 + 1 : i6)) {
            i3 <<= 1;
        }
        while (true) {
            o<K, V, E, S>[] oVarArr = this.c;
            if (i2 >= oVarArr.length) {
                return;
            }
            oVarArr[i2] = f(i3, -1);
            i2++;
        }
    }

    public static <K, V> q1<K, V, ? extends j<K, V, ?>, ?> e(MapMaker mapMaker) {
        q qVarD = mapMaker.d();
        q qVar = q.STRONG;
        if (qVarD == qVar && mapMaker.e() == qVar) {
            return new q1<>(mapMaker, t.a.h());
        }
        if (mapMaker.d() == qVar && mapMaker.e() == q.WEAK) {
            return new q1<>(mapMaker, v.a.h());
        }
        q qVarD2 = mapMaker.d();
        q qVar2 = q.WEAK;
        if (qVarD2 == qVar2 && mapMaker.e() == qVar) {
            return new q1<>(mapMaker, c0.a.h());
        }
        if (mapMaker.d() == qVar2 && mapMaker.e() == qVar2) {
            return new q1<>(mapMaker, e0.a.h());
        }
        throw new AssertionError();
    }

    public static <K> q1<K, MapMaker.a, ? extends j<K, MapMaker.a, ?>, ?> g(MapMaker mapMaker) {
        q qVarD = mapMaker.d();
        q qVar = q.STRONG;
        if (qVarD == qVar && mapMaker.e() == qVar) {
            return new q1<>(mapMaker, r.a.h());
        }
        q qVarD2 = mapMaker.d();
        q qVar2 = q.WEAK;
        if (qVarD2 == qVar2 && mapMaker.e() == qVar) {
            return new q1<>(mapMaker, a0.a.h());
        }
        if (mapMaker.e() == qVar2) {
            throw new IllegalArgumentException("Map cannot have both weak and dummy values");
        }
        throw new AssertionError();
    }

    public static int q(int i2) {
        int i3 = i2 + ((i2 << 15) ^ (-12931));
        int i4 = i3 ^ (i3 >>> 10);
        int i5 = i4 + (i4 << 3);
        int i6 = i5 ^ (i5 >>> 6);
        int i7 = i6 + (i6 << 2) + (i6 << 14);
        return i7 ^ (i7 >>> 16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> ArrayList<E> s(Collection<E> collection) {
        ArrayList<E> arrayList = new ArrayList<>(collection.size());
        Iterators.addAll(arrayList, collection.iterator());
        return arrayList;
    }

    public static <K, V, E extends j<K, V, E>> h0<K, V, E> t() {
        return (h0<K, V, E>) p;
    }

    @VisibleForTesting
    public E c(E e2, E e3) {
        return (E) r(e2.c()).h(e2, e3);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        for (o<K, V, E, S> oVar : this.c) {
            oVar.b();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(@NullableDecl Object obj) {
        if (obj == null) {
            return false;
        }
        int iJ = j(obj);
        return r(iJ).f(obj, iJ);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(@NullableDecl Object obj) {
        if (obj == null) {
            return false;
        }
        o<K, V, E, S>[] oVarArr = this.c;
        long j2 = -1;
        int i2 = 0;
        while (i2 < 3) {
            long j3 = 0;
            for (o<K, V, E, S> oVar : oVarArr) {
                int i3 = oVar.b;
                AtomicReferenceArray<E> atomicReferenceArray = oVar.e;
                for (int i4 = 0; i4 < atomicReferenceArray.length(); i4++) {
                    for (E eB = atomicReferenceArray.get(i4); eB != null; eB = eB.b()) {
                        V vS = oVar.s(eB);
                        if (vS != null && u().equivalent(obj, vS)) {
                            return true;
                        }
                    }
                }
                j3 += (long) oVar.c;
            }
            if (j3 == j2) {
                return false;
            }
            i2++;
            j2 = j3;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.i;
        if (set != null) {
            return set;
        }
        h hVar = new h();
        this.i = hVar;
        return hVar;
    }

    public o<K, V, E, S> f(int i2, int i3) {
        return this.f.f(this, i2, i3);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(@NullableDecl Object obj) {
        if (obj == null) {
            return null;
        }
        int iJ = j(obj);
        return r(iJ).n(obj, iJ);
    }

    public E h(@NullableDecl Object obj) {
        if (obj == null) {
            return null;
        }
        int iJ = j(obj);
        return (E) r(iJ).o(obj, iJ);
    }

    public V i(E e2) {
        V v2;
        if (e2.getKey() == null || (v2 = (V) e2.getValue()) == null) {
            return null;
        }
        return v2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        o<K, V, E, S>[] oVarArr = this.c;
        long j2 = 0;
        for (int i2 = 0; i2 < oVarArr.length; i2++) {
            if (oVarArr[i2].b != 0) {
                return false;
            }
            j2 += (long) oVarArr[i2].c;
        }
        if (j2 == 0) {
            return true;
        }
        for (int i3 = 0; i3 < oVarArr.length; i3++) {
            if (oVarArr[i3].b != 0) {
                return false;
            }
            j2 -= (long) oVarArr[i3].c;
        }
        return j2 == 0;
    }

    public int j(Object obj) {
        return q(this.e.hash(obj));
    }

    @VisibleForTesting
    public boolean k(j<K, V, ?> jVar) {
        return r(jVar.c()).t(jVar) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.g;
        if (set != null) {
            return set;
        }
        m mVar = new m();
        this.g = mVar;
        return mVar;
    }

    @VisibleForTesting
    public q m() {
        return this.f.b();
    }

    public final o<K, V, E, S>[] n(int i2) {
        return new o[i2];
    }

    public void o(E e2) {
        int iC = e2.c();
        r(iC).G(e2, iC);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void p(h0<K, V, E> h0Var) {
        j jVarA = h0Var.a();
        int iC = jVarA.c();
        r(iC).H(jVarA.getKey(), iC, h0Var);
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CanIgnoreReturnValue
    public V put(K k2, V v2) {
        Preconditions.checkNotNull(k2);
        Preconditions.checkNotNull(v2);
        int iJ = j(k2);
        return r(iJ).F(k2, iJ, v2, false);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @CanIgnoreReturnValue
    public V putIfAbsent(K k2, V v2) {
        Preconditions.checkNotNull(k2);
        Preconditions.checkNotNull(v2);
        int iJ = j(k2);
        return r(iJ).F(k2, iJ, v2, true);
    }

    public o<K, V, E, S> r(int i2) {
        return this.c[(i2 >>> this.b) & this.a];
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CanIgnoreReturnValue
    public V remove(@NullableDecl Object obj) {
        if (obj == null) {
            return null;
        }
        int iJ = j(obj);
        return r(iJ).I(obj, iJ);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @CanIgnoreReturnValue
    public boolean replace(K k2, @NullableDecl V v2, V v3) {
        Preconditions.checkNotNull(k2);
        Preconditions.checkNotNull(v3);
        if (v2 == null) {
            return false;
        }
        int iJ = j(k2);
        return r(iJ).P(k2, iJ, v2, v3);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        long j2 = 0;
        for (o<K, V, E, S> oVar : this.c) {
            j2 += (long) oVar.b;
        }
        return Ints.saturatedCast(j2);
    }

    @VisibleForTesting
    public Equivalence<Object> u() {
        return this.f.d().a();
    }

    @VisibleForTesting
    public q v() {
        return this.f.d();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<V> values() {
        Collection<V> collection = this.h;
        if (collection != null) {
            return collection;
        }
        z zVar = new z();
        this.h = zVar;
        return zVar;
    }

    public Object writeReplace() {
        return new p(this.f.b(), this.f.d(), this.e, this.f.d().a(), this.d, this);
    }

    public static abstract class b<K, V> extends ForwardingConcurrentMap<K, V> implements Serializable {
        private static final long serialVersionUID = 3;
        public final q a;
        public final q b;
        public final Equivalence<Object> c;
        public final Equivalence<Object> d;
        public final int e;
        public transient ConcurrentMap<K, V> f;

        public b(q qVar, q qVar2, Equivalence<Object> equivalence, Equivalence<Object> equivalence2, int i, ConcurrentMap<K, V> concurrentMap) {
            this.a = qVar;
            this.b = qVar2;
            this.c = equivalence;
            this.d = equivalence2;
            this.e = i;
            this.f = concurrentMap;
        }

        public void e(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            while (true) {
                Object object = objectInputStream.readObject();
                if (object == null) {
                    return;
                }
                this.f.put((K) object, (V) objectInputStream.readObject());
            }
        }

        public MapMaker f(ObjectInputStream objectInputStream) throws IOException {
            return new MapMaker().initialCapacity(objectInputStream.readInt()).g(this.a).h(this.b).f(this.c).concurrencyLevel(this.e);
        }

        public void g(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.writeInt(this.f.size());
            for (Map.Entry<K, V> entry : this.f.entrySet()) {
                objectOutputStream.writeObject(entry.getKey());
                objectOutputStream.writeObject(entry.getValue());
            }
            objectOutputStream.writeObject(null);
        }

        @Override // com.google.common.collect.ForwardingConcurrentMap, com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
        public ConcurrentMap<K, V> delegate() {
            return this.f;
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @CanIgnoreReturnValue
    public boolean remove(@NullableDecl Object obj, @NullableDecl Object obj2) {
        if (obj == null || obj2 == null) {
            return false;
        }
        int iJ = j(obj);
        return r(iJ).J(obj, iJ, obj2);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @CanIgnoreReturnValue
    public V replace(K k2, V v2) {
        Preconditions.checkNotNull(k2);
        Preconditions.checkNotNull(v2);
        int iJ = j(k2);
        return r(iJ).O(k2, iJ, v2);
    }
}
