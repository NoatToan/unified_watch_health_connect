package com.google.common.graph;

import com.google.common.base.Preconditions;
import com.google.common.collect.UnmodifiableIterator;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes3.dex */
class u<K, V> {
    private final Map<K, V> a;

    @NullableDecl
    private transient Map.Entry<K, V> b;

    public class a extends AbstractSet<K> {

        /* JADX INFO: renamed from: com.google.common.graph.u$a$a, reason: collision with other inner class name */
        public class C0222a extends UnmodifiableIterator<K> {
            public final /* synthetic */ Iterator a;

            public C0222a(Iterator it2) {
                this.a = it2;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.a.hasNext();
            }

            @Override // java.util.Iterator
            public K next() {
                Map.Entry entry = (Map.Entry) this.a.next();
                u.this.b = entry;
                return (K) entry.getKey();
            }
        }

        public a() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public UnmodifiableIterator<K> iterator() {
            return new C0222a(u.this.a.entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@NullableDecl Object obj) {
            return u.this.e(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return u.this.a.size();
        }
    }

    public u(Map<K, V> map) {
        this.a = (Map) Preconditions.checkNotNull(map);
    }

    public void c() {
        d();
        this.a.clear();
    }

    public void d() {
        this.b = null;
    }

    public final boolean e(@NullableDecl Object obj) {
        return g(obj) != null || this.a.containsKey(obj);
    }

    public V f(@NullableDecl Object obj) {
        V vG = g(obj);
        return vG != null ? vG : h(obj);
    }

    public V g(@NullableDecl Object obj) {
        Map.Entry<K, V> entry = this.b;
        if (entry == null || entry.getKey() != obj) {
            return null;
        }
        return entry.getValue();
    }

    public final V h(@NullableDecl Object obj) {
        return this.a.get(obj);
    }

    @CanIgnoreReturnValue
    public V i(@NullableDecl K k, @NullableDecl V v) {
        d();
        return this.a.put(k, v);
    }

    @CanIgnoreReturnValue
    public V j(@NullableDecl Object obj) {
        d();
        return this.a.remove(obj);
    }

    public final Set<K> k() {
        return new a();
    }
}
