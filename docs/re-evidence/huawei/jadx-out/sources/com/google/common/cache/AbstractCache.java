package com.google.common.cache;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import defpackage.ajo;
import defpackage.ajt;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes21.dex */
@ElementTypesAreNonnullByDefault
public abstract class AbstractCache<K, V> implements Cache<K, V> {

    public interface StatsCounter {
        void recordEviction();

        void recordHits(int i);

        void recordLoadException(long j);

        void recordLoadSuccess(long j);

        void recordMisses(int i);

        ajo snapshot();
    }

    @Override // com.google.common.cache.Cache
    public void cleanUp() {
    }

    protected AbstractCache() {
    }

    @Override // com.google.common.cache.Cache
    public V get(K k, Callable<? extends V> callable) throws ExecutionException {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.cache.Cache
    public ImmutableMap<K, V> getAllPresent(Iterable<? extends Object> iterable) {
        V ifPresent;
        LinkedHashMap linkedHashMapC = Maps.c();
        for (Object obj : iterable) {
            if (!linkedHashMapC.containsKey(obj) && (ifPresent = getIfPresent(obj)) != null) {
                linkedHashMapC.put(obj, ifPresent);
            }
        }
        return ImmutableMap.copyOf((Map) linkedHashMapC);
    }

    @Override // com.google.common.cache.Cache
    public void put(K k, V v) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.cache.Cache
    public void putAll(Map<? extends K, ? extends V> map) {
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.common.cache.Cache
    public long size() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.cache.Cache
    public void invalidate(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.cache.Cache
    public void invalidateAll(Iterable<? extends Object> iterable) {
        Iterator<? extends Object> it = iterable.iterator();
        while (it.hasNext()) {
            invalidate(it.next());
        }
    }

    @Override // com.google.common.cache.Cache
    public void invalidateAll() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.cache.Cache
    public ajo stats() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.cache.Cache
    public ConcurrentMap<K, V> asMap() {
        throw new UnsupportedOperationException();
    }

    public static final class c implements StatsCounter {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final LongAddable f4215c = ajt.b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final LongAddable f4214b = ajt.b();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final LongAddable f4213a = ajt.b();
        private final LongAddable e = ajt.b();
        private final LongAddable h = ajt.b();
        private final LongAddable d = ajt.b();

        private static long b(long j) {
            if (j >= 0) {
                return j;
            }
            return Long.MAX_VALUE;
        }

        @Override // com.google.common.cache.AbstractCache.StatsCounter
        public void recordHits(int i) {
            this.f4215c.add(i);
        }

        @Override // com.google.common.cache.AbstractCache.StatsCounter
        public void recordMisses(int i) {
            this.f4214b.add(i);
        }

        @Override // com.google.common.cache.AbstractCache.StatsCounter
        public void recordLoadSuccess(long j) {
            this.f4213a.increment();
            this.h.add(j);
        }

        @Override // com.google.common.cache.AbstractCache.StatsCounter
        public void recordLoadException(long j) {
            this.e.increment();
            this.h.add(j);
        }

        @Override // com.google.common.cache.AbstractCache.StatsCounter
        public void recordEviction() {
            this.d.increment();
        }

        @Override // com.google.common.cache.AbstractCache.StatsCounter
        public ajo snapshot() {
            return new ajo(b(this.f4215c.sum()), b(this.f4214b.sum()), b(this.f4213a.sum()), b(this.e.sum()), b(this.h.sum()), b(this.d.sum()));
        }

        public void a(StatsCounter statsCounter) {
            ajo ajoVarSnapshot = statsCounter.snapshot();
            this.f4215c.add(ajoVarSnapshot.d());
            this.f4214b.add(ajoVarSnapshot.c());
            this.f4213a.add(ajoVarSnapshot.a());
            this.e.add(ajoVarSnapshot.e());
            this.h.add(ajoVarSnapshot.f());
            this.d.add(ajoVarSnapshot.b());
        }
    }
}
