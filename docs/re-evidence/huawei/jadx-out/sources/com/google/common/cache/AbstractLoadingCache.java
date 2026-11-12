package com.google.common.cache;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import defpackage.arn;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes21.dex */
@ElementTypesAreNonnullByDefault
public abstract class AbstractLoadingCache<K, V> extends AbstractCache<K, V> implements LoadingCache<K, V> {
    protected AbstractLoadingCache() {
    }

    @Override // com.google.common.cache.LoadingCache
    public V getUnchecked(K k) {
        try {
            return get(k);
        } catch (ExecutionException e) {
            throw new arn(e.getCause());
        }
    }

    @Override // com.google.common.cache.LoadingCache
    public ImmutableMap<K, V> getAll(Iterable<? extends K> iterable) throws ExecutionException {
        LinkedHashMap linkedHashMapC = Maps.c();
        for (K k : iterable) {
            if (!linkedHashMapC.containsKey(k)) {
                linkedHashMapC.put(k, get(k));
            }
        }
        return ImmutableMap.copyOf((Map) linkedHashMapC);
    }

    @Override // com.google.common.cache.LoadingCache, com.google.common.base.Function
    public final V apply(K k) {
        return getUnchecked(k);
    }

    @Override // com.google.common.cache.LoadingCache
    public void refresh(K k) {
        throw new UnsupportedOperationException();
    }
}
