package com.google.android.datatransport.runtime.dagger.internal;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class MapBuilder<K, V> {
    private final Map<K, V> a;

    private MapBuilder(int i) {
        this.a = DaggerCollections.newLinkedHashMapWithExpectedSize(i);
    }

    public static <K, V> MapBuilder<K, V> newMapBuilder(int i) {
        return new MapBuilder<>(i);
    }

    public Map<K, V> build() {
        return this.a.size() != 0 ? Collections.unmodifiableMap(this.a) : Collections.emptyMap();
    }

    public MapBuilder<K, V> put(K k, V v) {
        this.a.put(k, v);
        return this;
    }

    public MapBuilder<K, V> putAll(Map<K, V> map) {
        this.a.putAll(map);
        return this;
    }
}
