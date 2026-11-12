package com.google.common.collect;

import defpackage.ajz;
import defpackage.ale;
import defpackage.ana;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collector;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes21.dex */
@ElementTypesAreNonnullByDefault
public abstract class ImmutableBiMap<K, V> extends ImmutableMap<K, V> implements BiMap<K, V> {
    private static final long serialVersionUID = 912559;

    @Override // com.google.common.collect.BiMap
    public abstract ImmutableBiMap<V, K> inverse();

    static <T, K, V> Collector<T, ?, ImmutableBiMap<K, V>> toImmutableBiMap(Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2) {
        return ajz.e(function, function2);
    }

    public static <K, V> ImmutableBiMap<K, V> of() {
        return ana.f576c;
    }

    public static <K, V> ImmutableBiMap<K, V> of(K k, V v) {
        ale.d(k, v);
        return new ana(new Object[]{k, v}, 1);
    }

    public static <K, V> ImmutableBiMap<K, V> of(K k, V v, K k2, V v2) {
        ale.d(k, v);
        ale.d(k2, v2);
        return new ana(new Object[]{k, v, k2, v2}, 2);
    }

    public static <K, V> ImmutableBiMap<K, V> of(K k, V v, K k2, V v2, K k3, V v3) {
        ale.d(k, v);
        ale.d(k2, v2);
        ale.d(k3, v3);
        return new ana(new Object[]{k, v, k2, v2, k3, v3}, 3);
    }

    public static <K, V> ImmutableBiMap<K, V> of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4) {
        ale.d(k, v);
        ale.d(k2, v2);
        ale.d(k3, v3);
        ale.d(k4, v4);
        return new ana(new Object[]{k, v, k2, v2, k3, v3, k4, v4}, 4);
    }

    public static <K, V> ImmutableBiMap<K, V> of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
        ale.d(k, v);
        ale.d(k2, v2);
        ale.d(k3, v3);
        ale.d(k4, v4);
        ale.d(k5, v5);
        return new ana(new Object[]{k, v, k2, v2, k3, v3, k4, v4, k5, v5}, 5);
    }

    public static <K, V> ImmutableBiMap<K, V> of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6) {
        ale.d(k, v);
        ale.d(k2, v2);
        ale.d(k3, v3);
        ale.d(k4, v4);
        ale.d(k5, v5);
        ale.d(k6, v6);
        return new ana(new Object[]{k, v, k2, v2, k3, v3, k4, v4, k5, v5, k6, v6}, 6);
    }

    public static <K, V> ImmutableBiMap<K, V> of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7) {
        ale.d(k, v);
        ale.d(k2, v2);
        ale.d(k3, v3);
        ale.d(k4, v4);
        ale.d(k5, v5);
        ale.d(k6, v6);
        ale.d(k7, v7);
        return new ana(new Object[]{k, v, k2, v2, k3, v3, k4, v4, k5, v5, k6, v6, k7, v7}, 7);
    }

    public static <K, V> ImmutableBiMap<K, V> of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7, K k8, V v8) {
        ale.d(k, v);
        ale.d(k2, v2);
        ale.d(k3, v3);
        ale.d(k4, v4);
        ale.d(k5, v5);
        ale.d(k6, v6);
        ale.d(k7, v7);
        ale.d(k8, v8);
        return new ana(new Object[]{k, v, k2, v2, k3, v3, k4, v4, k5, v5, k6, v6, k7, v7, k8, v8}, 8);
    }

    public static <K, V> ImmutableBiMap<K, V> of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7, K k8, V v8, K k9, V v9) {
        ale.d(k, v);
        ale.d(k2, v2);
        ale.d(k3, v3);
        ale.d(k4, v4);
        ale.d(k5, v5);
        ale.d(k6, v6);
        ale.d(k7, v7);
        ale.d(k8, v8);
        ale.d(k9, v9);
        return new ana(new Object[]{k, v, k2, v2, k3, v3, k4, v4, k5, v5, k6, v6, k7, v7, k8, v8, k9, v9}, 9);
    }

    public static <K, V> ImmutableBiMap<K, V> of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7, K k8, V v8, K k9, V v9, K k10, V v10) {
        ale.d(k, v);
        ale.d(k2, v2);
        ale.d(k3, v3);
        ale.d(k4, v4);
        ale.d(k5, v5);
        ale.d(k6, v6);
        ale.d(k7, v7);
        ale.d(k8, v8);
        ale.d(k9, v9);
        ale.d(k10, v10);
        return new ana(new Object[]{k, v, k2, v2, k3, v3, k4, v4, k5, v5, k6, v6, k7, v7, k8, v8, k9, v9, k10, v10}, 10);
    }

    @SafeVarargs
    public static <K, V> ImmutableBiMap<K, V> ofEntries(Map.Entry<? extends K, ? extends V>... entryArr) {
        return copyOf((Iterable) Arrays.asList(entryArr));
    }

    public static <K, V> c<K, V> builder() {
        return new c<>();
    }

    public static <K, V> c<K, V> builderWithExpectedSize(int i) {
        ale.b(i, "expectedSize");
        return new c<>(i);
    }

    public static final class c<K, V> extends ImmutableMap.b<K, V> {
        public c() {
        }

        c(int i) {
            super(i);
        }

        @Override // com.google.common.collect.ImmutableMap.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public c<K, V> c(K k, V v) {
            super.c(k, v);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMap.b
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public c<K, V> d(Map.Entry<? extends K, ? extends V> entry) {
            super.d(entry);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMap.b
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public c<K, V> b(Map<? extends K, ? extends V> map) {
            super.b(map);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMap.b
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public c<K, V> d(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            super.d(iterable);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMap.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public c<K, V> d(ImmutableMap.b<K, V> bVar) {
            super.d(bVar);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMap.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ImmutableBiMap<K, V> d() {
            return j();
        }

        @Override // com.google.common.collect.ImmutableMap.b
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public ImmutableBiMap<K, V> j() {
            if (this.e == 0) {
                return ImmutableBiMap.of();
            }
            if (this.f4362a != null) {
                if (this.f4363b) {
                    this.f4364c = Arrays.copyOf(this.f4364c, this.e * 2);
                }
                d(this.f4364c, this.e, this.f4362a);
            }
            this.f4363b = true;
            return new ana(this.f4364c, this.e);
        }

        @Override // com.google.common.collect.ImmutableMap.b
        @Deprecated
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public ImmutableBiMap<K, V> b() {
            throw new UnsupportedOperationException("Not supported for bimaps");
        }
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

    public static <K, V> ImmutableBiMap<K, V> copyOf(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        return new c(iterable instanceof Collection ? ((Collection) iterable).size() : 4).d(iterable).d();
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map, java.util.SortedMap
    public ImmutableSet<V> values() {
        return inverse().keySet();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.ImmutableMap
    public final ImmutableSet<V> createValues() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.BiMap
    @CheckForNull
    @Deprecated
    public final V forcePut(K k, V v) {
        throw new UnsupportedOperationException();
    }

    static class e<K, V> extends ImmutableMap.e<K, V> {
        private static final long serialVersionUID = 0;

        e(ImmutableBiMap<K, V> immutableBiMap) {
            super(immutableBiMap);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.ImmutableMap.e
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public c<K, V> b(int i) {
            return new c<>(i);
        }
    }

    @Override // com.google.common.collect.ImmutableMap
    public Object writeReplace() {
        return new e(this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Deprecated
    static <T, K, V> Collector<T, ?, ImmutableMap<K, V>> toImmutableMap(Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    static <T, K, V> Collector<T, ?, ImmutableMap<K, V>> toImmutableMap(Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2, BinaryOperator<V> binaryOperator) {
        throw new UnsupportedOperationException();
    }
}
