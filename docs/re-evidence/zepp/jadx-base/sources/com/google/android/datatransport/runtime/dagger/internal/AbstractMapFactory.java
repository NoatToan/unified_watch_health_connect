package com.google.android.datatransport.runtime.dagger.internal;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractMapFactory<K, V, V2> implements Factory<Map<K, V2>> {
    private final Map<K, Provider<V>> a;

    public static abstract class Builder<K, V, V2> {
        public final LinkedHashMap<K, Provider<V>> a;

        public Builder(int i) {
            this.a = DaggerCollections.newLinkedHashMapWithExpectedSize(i);
        }

        public Builder<K, V, V2> put(K k, Provider<V> provider) {
            this.a.put((K) Preconditions.checkNotNull(k, "key"), (Provider<V>) Preconditions.checkNotNull(provider, "provider"));
            return this;
        }

        public Builder<K, V, V2> putAll(Provider<Map<K, V2>> provider) {
            if (provider instanceof DelegateFactory) {
                return putAll(((DelegateFactory) provider).a());
            }
            this.a.putAll(((AbstractMapFactory) provider).a);
            return this;
        }
    }

    public AbstractMapFactory(Map<K, Provider<V>> map) {
        this.a = Collections.unmodifiableMap(map);
    }

    final Map<K, Provider<V>> b() {
        return this.a;
    }
}
