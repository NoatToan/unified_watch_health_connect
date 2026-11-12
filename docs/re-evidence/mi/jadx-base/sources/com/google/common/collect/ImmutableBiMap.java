package com.google.common.collect;

import defpackage.d44;
import defpackage.ri2;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public abstract class ImmutableBiMap<K, V> extends ImmutableMap<K, V> implements ri2<K, V> {

    public static final class a<K, V> extends ImmutableMap.b<K, V> {
        public a() {
        }

        @Override // com.google.common.collect.ImmutableMap.b
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public ImmutableBiMap<K, V> a() {
            return d();
        }

        @Override // com.google.common.collect.ImmutableMap.b
        @Deprecated
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public ImmutableBiMap<K, V> c() {
            throw new UnsupportedOperationException("Not supported for bimaps");
        }

        @Override // com.google.common.collect.ImmutableMap.b
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public ImmutableBiMap<K, V> d() {
            int i = this.c;
            if (i == 0) {
                return ImmutableBiMap.of();
            }
            if (this.f9028a != null) {
                if (this.d) {
                    this.f9029b = Arrays.copyOf(this.f9029b, i * 2);
                }
                ImmutableMap.b.k(this.f9029b, this.c, this.f9028a);
            }
            this.d = true;
            return new y(this.f9029b, this.c);
        }

        @Override // com.google.common.collect.ImmutableMap.b
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public a<K, V> g(K k2, V v) {
            super.g(k2, v);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMap.b
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public a<K, V> h(Map.Entry<? extends K, ? extends V> entry) {
            super.h(entry);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMap.b
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public a<K, V> i(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            super.i(iterable);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMap.b
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public a<K, V> j(Map<? extends K, ? extends V> map) {
            super.j(map);
            return this;
        }

        public a(int i) {
            super(i);
        }
    }

    public static class b<K, V> extends ImmutableMap.e<K, V> {
        private static final long serialVersionUID = 0;

        public b(ImmutableBiMap<K, V> immutableBiMap) {
            super(immutableBiMap);
        }

        @Override // com.google.common.collect.ImmutableMap.e
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public a<K, V> b(int i) {
            return new a<>(i);
        }
    }

    public static <K, V> a<K, V> builder() {
        return new a<>();
    }

    public static <K, V> a<K, V> builderWithExpectedSize(int i) {
        d44.b(i, "expectedSize");
        return new a<>(i);
    }

    public static <K, V> ImmutableBiMap<K, V> copyOf(Map<? extends K, ? extends V> map) {
        if (map instanceof ImmutableBiMap) {
            ImmutableBiMap<K, V> immutableBiMap = (ImmutableBiMap) map;
            if (!immutableBiMap.isPartialView()) {
                return immutableBiMap;
            }
        }
        return copyOf((Iterable) map.entrySet());
    }

    public static <K, V> ImmutableBiMap<K, V> of() {
        return y.f;
    }

    @SafeVarargs
    public static <K, V> ImmutableBiMap<K, V> ofEntries(Map.Entry<? extends K, ? extends V>... entryArr) {
        return copyOf((Iterable) Arrays.asList(entryArr));
    }

    @Deprecated
    public final V forcePut(K k2, V v) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.ri2
    public abstract ImmutableBiMap<V, K> inverse();

    @Override // com.google.common.collect.ImmutableMap
    public Object writeReplace() {
        return new b(this);
    }

    public static <K, V> ImmutableBiMap<K, V> of(K k2, V v) {
        d44.a(k2, v);
        return new y(new Object[]{k2, v}, 1);
    }

    @Override // com.google.common.collect.ImmutableMap
    public final ImmutableSet<V> createValues() {
        throw new AssertionError("should never be called");
    }

    public static <K, V> ImmutableBiMap<K, V> of(K k2, V v, K k3, V v2) {
        d44.a(k2, v);
        d44.a(k3, v2);
        return new y(new Object[]{k2, v, k3, v2}, 2);
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public ImmutableSet<V> values() {
        return inverse().keySet();
    }

    public static <K, V> ImmutableBiMap<K, V> copyOf(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        return new a(iterable instanceof Collection ? ((Collection) iterable).size() : 4).i(iterable).a();
    }

    public static <K, V> ImmutableBiMap<K, V> of(K k2, V v, K k3, V v2, K k4, V v3) {
        d44.a(k2, v);
        d44.a(k3, v2);
        d44.a(k4, v3);
        return new y(new Object[]{k2, v, k3, v2, k4, v3}, 3);
    }

    public static <K, V> ImmutableBiMap<K, V> of(K k2, V v, K k3, V v2, K k4, V v3, K k5, V v4) {
        d44.a(k2, v);
        d44.a(k3, v2);
        d44.a(k4, v3);
        d44.a(k5, v4);
        return new y(new Object[]{k2, v, k3, v2, k4, v3, k5, v4}, 4);
    }

    public static <K, V> ImmutableBiMap<K, V> of(K k2, V v, K k3, V v2, K k4, V v3, K k5, V v4, K k6, V v5) {
        d44.a(k2, v);
        d44.a(k3, v2);
        d44.a(k4, v3);
        d44.a(k5, v4);
        d44.a(k6, v5);
        return new y(new Object[]{k2, v, k3, v2, k4, v3, k5, v4, k6, v5}, 5);
    }

    public static <K, V> ImmutableBiMap<K, V> of(K k2, V v, K k3, V v2, K k4, V v3, K k5, V v4, K k6, V v5, K k7, V v6) {
        d44.a(k2, v);
        d44.a(k3, v2);
        d44.a(k4, v3);
        d44.a(k5, v4);
        d44.a(k6, v5);
        d44.a(k7, v6);
        return new y(new Object[]{k2, v, k3, v2, k4, v3, k5, v4, k6, v5, k7, v6}, 6);
    }

    public static <K, V> ImmutableBiMap<K, V> of(K k2, V v, K k3, V v2, K k4, V v3, K k5, V v4, K k6, V v5, K k7, V v6, K k8, V v7) {
        d44.a(k2, v);
        d44.a(k3, v2);
        d44.a(k4, v3);
        d44.a(k5, v4);
        d44.a(k6, v5);
        d44.a(k7, v6);
        d44.a(k8, v7);
        return new y(new Object[]{k2, v, k3, v2, k4, v3, k5, v4, k6, v5, k7, v6, k8, v7}, 7);
    }

    public static <K, V> ImmutableBiMap<K, V> of(K k2, V v, K k3, V v2, K k4, V v3, K k5, V v4, K k6, V v5, K k7, V v6, K k8, V v7, K k9, V v8) {
        d44.a(k2, v);
        d44.a(k3, v2);
        d44.a(k4, v3);
        d44.a(k5, v4);
        d44.a(k6, v5);
        d44.a(k7, v6);
        d44.a(k8, v7);
        d44.a(k9, v8);
        return new y(new Object[]{k2, v, k3, v2, k4, v3, k5, v4, k6, v5, k7, v6, k8, v7, k9, v8}, 8);
    }

    public static <K, V> ImmutableBiMap<K, V> of(K k2, V v, K k3, V v2, K k4, V v3, K k5, V v4, K k6, V v5, K k7, V v6, K k8, V v7, K k9, V v8, K k10, V v9) {
        d44.a(k2, v);
        d44.a(k3, v2);
        d44.a(k4, v3);
        d44.a(k5, v4);
        d44.a(k6, v5);
        d44.a(k7, v6);
        d44.a(k8, v7);
        d44.a(k9, v8);
        d44.a(k10, v9);
        return new y(new Object[]{k2, v, k3, v2, k4, v3, k5, v4, k6, v5, k7, v6, k8, v7, k9, v8, k10, v9}, 9);
    }

    public static <K, V> ImmutableBiMap<K, V> of(K k2, V v, K k3, V v2, K k4, V v3, K k5, V v4, K k6, V v5, K k7, V v6, K k8, V v7, K k9, V v8, K k10, V v9, K k11, V v10) {
        d44.a(k2, v);
        d44.a(k3, v2);
        d44.a(k4, v3);
        d44.a(k5, v4);
        d44.a(k6, v5);
        d44.a(k7, v6);
        d44.a(k8, v7);
        d44.a(k9, v8);
        d44.a(k10, v9);
        d44.a(k11, v10);
        return new y(new Object[]{k2, v, k3, v2, k4, v3, k5, v4, k6, v5, k7, v6, k8, v7, k9, v8, k10, v9, k11, v10}, 10);
    }
}
