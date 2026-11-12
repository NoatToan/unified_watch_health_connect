package com.google.common.cache;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.aqt;
import defpackage.aqw;
import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes21.dex */
@ElementTypesAreNonnullByDefault
public abstract class CacheLoader<K, V> {
    public abstract V load(K k) throws Exception;

    public ListenableFuture<V> reload(K k, V v) throws Exception {
        Preconditions.checkNotNull(k);
        Preconditions.checkNotNull(v);
        return aqt.a(load(k));
    }

    public Map<K, V> loadAll(Iterable<? extends K> iterable) throws Exception {
        throw new e();
    }

    public static <K, V> CacheLoader<K, V> from(Function<K, V> function) {
        return new c(function);
    }

    public static <V> CacheLoader<Object, V> from(Supplier<V> supplier) {
        return new a(supplier);
    }

    static final class c<K, V> extends CacheLoader<K, V> implements Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Function<K, V> f4225c;

        public c(Function<K, V> function) {
            this.f4225c = (Function) Preconditions.checkNotNull(function);
        }

        @Override // com.google.common.cache.CacheLoader
        public V load(K k) {
            return this.f4225c.apply((K) Preconditions.checkNotNull(k));
        }
    }

    public static <K, V> CacheLoader<K, V> asyncReloading(CacheLoader<K, V> cacheLoader, Executor executor) {
        Preconditions.checkNotNull(cacheLoader);
        Preconditions.checkNotNull(executor);
        return cacheLoader.new AnonymousClass5(executor);
    }

    /* JADX INFO: renamed from: com.google.common.cache.CacheLoader$5, reason: invalid class name */
    public class AnonymousClass5 extends CacheLoader<K, V> {
        final /* synthetic */ Executor e;

        AnonymousClass5(Executor executor) {
            this.e = executor;
        }

        @Override // com.google.common.cache.CacheLoader
        public V load(K k) throws Exception {
            return (V) CacheLoader.this.load(k);
        }

        @Override // com.google.common.cache.CacheLoader
        public ListenableFuture<V> reload(final K k, final V v) {
            final CacheLoader cacheLoader = CacheLoader.this;
            aqw aqwVarE = aqw.e(new Callable() { // from class: ajs
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return cacheLoader.reload(k, v).get();
                }
            });
            this.e.execute(aqwVarE);
            return aqwVarE;
        }

        @Override // com.google.common.cache.CacheLoader
        public Map<K, V> loadAll(Iterable<? extends K> iterable) throws Exception {
            return CacheLoader.this.loadAll(iterable);
        }
    }

    static final class a<V> extends CacheLoader<Object, V> implements Serializable {
        private static final long serialVersionUID = 0;
        private final Supplier<V> d;

        public a(Supplier<V> supplier) {
            this.d = (Supplier) Preconditions.checkNotNull(supplier);
        }

        @Override // com.google.common.cache.CacheLoader
        public V load(Object obj) {
            Preconditions.checkNotNull(obj);
            return this.d.get();
        }
    }

    public static final class e extends UnsupportedOperationException {
        e() {
        }
    }

    public static final class b extends RuntimeException {
        public b(String str) {
            super(str);
        }
    }
}
