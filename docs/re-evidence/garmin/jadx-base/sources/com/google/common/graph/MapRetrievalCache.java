package com.google.common.graph;

import com.google.common.base.Preconditions;
import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
@ElementTypesAreNonnullByDefault
final class MapRetrievalCache<K, V> extends MapIteratorCache<K, V> {
    private volatile transient CacheEntry<K, V> cacheEntry1;
    private volatile transient CacheEntry<K, V> cacheEntry2;

    public static final class CacheEntry<K, V> {
        final K key;
        final V value;

        public CacheEntry(K k14, V v14) {
            this.key = k14;
            this.value = v14;
        }
    }

    public MapRetrievalCache(Map<K, V> map) {
        super(map);
    }

    private void addToCache(K k14, V v14) {
        addToCache(new CacheEntry<>(k14, v14));
    }

    @Override // com.google.common.graph.MapIteratorCache
    public void clearCache() {
        super.clearCache();
        this.cacheEntry1 = null;
        this.cacheEntry2 = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.MapIteratorCache
    public V get(Object obj) {
        Preconditions.checkNotNull(obj);
        V ifCached = getIfCached(obj);
        if (ifCached != null) {
            return ifCached;
        }
        V withoutCaching = getWithoutCaching(obj);
        if (withoutCaching != null) {
            addToCache(obj, withoutCaching);
        }
        return withoutCaching;
    }

    @Override // com.google.common.graph.MapIteratorCache
    public V getIfCached(Object obj) {
        V v14 = (V) super.getIfCached(obj);
        if (v14 != null) {
            return v14;
        }
        CacheEntry<K, V> cacheEntry = this.cacheEntry1;
        if (cacheEntry != null && cacheEntry.key == obj) {
            return cacheEntry.value;
        }
        CacheEntry<K, V> cacheEntry2 = this.cacheEntry2;
        if (cacheEntry2 == null || cacheEntry2.key != obj) {
            return null;
        }
        addToCache(cacheEntry2);
        return cacheEntry2.value;
    }

    private void addToCache(CacheEntry<K, V> cacheEntry) {
        this.cacheEntry2 = this.cacheEntry1;
        this.cacheEntry1 = cacheEntry;
    }
}
