package com.google.common.graph;

import com.google.common.base.Preconditions;
import com.google.common.collect.AbstractIterator;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.UnmodifiableIterator;
import java.util.AbstractSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes3.dex */
final class k<N, V> implements s<N, V> {
    private static final Object d = new Object();
    private final Map<N, Object> a;
    private int b;
    private int c;

    public class a extends AbstractSet<N> {

        /* JADX INFO: renamed from: com.google.common.graph.k$a$a, reason: collision with other inner class name */
        public class C0221a extends AbstractIterator<N> {
            public final /* synthetic */ Iterator c;

            public C0221a(Iterator it2) {
                this.c = it2;
            }

            @Override // com.google.common.collect.AbstractIterator
            public N computeNext() {
                while (this.c.hasNext()) {
                    Map.Entry entry = (Map.Entry) this.c.next();
                    if (k.n(entry.getValue())) {
                        return (N) entry.getKey();
                    }
                }
                return endOfData();
            }
        }

        public a() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public UnmodifiableIterator<N> iterator() {
            return new C0221a(k.this.a.entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@NullableDecl Object obj) {
            return k.n(k.this.a.get(obj));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return k.this.b;
        }
    }

    public class b extends AbstractSet<N> {

        public class a extends AbstractIterator<N> {
            public final /* synthetic */ Iterator c;

            public a(Iterator it2) {
                this.c = it2;
            }

            @Override // com.google.common.collect.AbstractIterator
            public N computeNext() {
                while (this.c.hasNext()) {
                    Map.Entry entry = (Map.Entry) this.c.next();
                    if (k.o(entry.getValue())) {
                        return (N) entry.getKey();
                    }
                }
                return endOfData();
            }
        }

        public b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public UnmodifiableIterator<N> iterator() {
            return new a(k.this.a.entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@NullableDecl Object obj) {
            return k.o(k.this.a.get(obj));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return k.this.c;
        }
    }

    public static final class c {
        private final Object a;

        public c(Object obj) {
            this.a = obj;
        }
    }

    private k(Map<N, Object> map, int i, int i2) {
        this.a = (Map) Preconditions.checkNotNull(map);
        this.b = Graphs.b(i);
        this.c = Graphs.b(i2);
        Preconditions.checkState(i <= map.size() && i2 <= map.size());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean n(@NullableDecl Object obj) {
        return obj == d || (obj instanceof c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean o(@NullableDecl Object obj) {
        return (obj == d || obj == null) ? false : true;
    }

    public static <N, V> k<N, V> p() {
        return new k<>(new HashMap(4, 1.0f), 0, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <N, V> k<N, V> q(Set<N> set, Map<N, V> map) {
        HashMap map2 = new HashMap();
        map2.putAll(map);
        for (N n : set) {
            Object objPut = map2.put(n, d);
            if (objPut != null) {
                map2.put(n, new c(objPut));
            }
        }
        return new k<>(ImmutableMap.copyOf((Map) map2), set.size(), map.size());
    }

    @Override // com.google.common.graph.s
    public Set<N> a() {
        return Collections.unmodifiableSet(this.a.keySet());
    }

    @Override // com.google.common.graph.s
    public Set<N> b() {
        return new b();
    }

    @Override // com.google.common.graph.s
    public Set<N> c() {
        return new a();
    }

    @Override // com.google.common.graph.s
    public void d(N n, V v) {
        Map<N, Object> map = this.a;
        Object obj = d;
        Object objPut = map.put(n, obj);
        if (objPut == null) {
            int i = this.b + 1;
            this.b = i;
            Graphs.d(i);
        } else if (objPut instanceof c) {
            this.a.put(n, objPut);
        } else if (objPut != obj) {
            this.a.put(n, new c(objPut));
            int i2 = this.b + 1;
            this.b = i2;
            Graphs.d(i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.s
    public V e(N n) {
        V v = (V) this.a.get(n);
        if (v == d) {
            return null;
        }
        return v instanceof c ? (V) ((c) v).a : v;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.s
    public V f(Object obj) {
        Object obj2;
        V v = (V) this.a.get(obj);
        if (v == 0 || v == (obj2 = d)) {
            return null;
        }
        if (v instanceof c) {
            this.a.put(obj, obj2);
            int i = this.c - 1;
            this.c = i;
            Graphs.b(i);
            return (V) ((c) v).a;
        }
        this.a.remove(obj);
        int i2 = this.c - 1;
        this.c = i2;
        Graphs.b(i2);
        return v;
    }

    @Override // com.google.common.graph.s
    public void g(N n) {
        Object obj = this.a.get(n);
        if (obj == d) {
            this.a.remove(n);
            int i = this.b - 1;
            this.b = i;
            Graphs.b(i);
            return;
        }
        if (obj instanceof c) {
            this.a.put(n, ((c) obj).a);
            int i2 = this.b - 1;
            this.b = i2;
            Graphs.b(i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.s
    public V h(N n, V v) {
        V v2 = (V) this.a.put(n, v);
        if (v2 == 0) {
            int i = this.c + 1;
            this.c = i;
            Graphs.d(i);
            return null;
        }
        if (v2 instanceof c) {
            this.a.put(n, new c(v));
            return (V) ((c) v2).a;
        }
        if (v2 != d) {
            return v2;
        }
        this.a.put(n, new c(v));
        int i2 = this.c + 1;
        this.c = i2;
        Graphs.d(i2);
        return null;
    }
}
