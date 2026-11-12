package org.acra.collections;

import androidx.annotation.NonNull;
import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes23.dex */
public final class ImmutableMap<K, V> implements Map<K, V>, Serializable {
    private final Map<K, V> a;

    public static class a<K, V> implements Map.Entry<K, V> {
        private final Map.Entry<K, V> a;

        public a(Map.Entry<K, V> entry) {
            this.a = entry;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.a.getKey();
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.a.getValue();
        }

        @Override // java.util.Map.Entry
        @NonNull
        public V setValue(Object obj) {
            throw new UnsupportedOperationException();
        }
    }

    public ImmutableMap(@NonNull Map<K, V> map) {
        this.a = new HashMap(map);
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.a.containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return this.a.containsValue(obj);
    }

    @Override // java.util.Map
    @NonNull
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> setEntrySet = this.a.entrySet();
        ImmutableSet.Builder builder = new ImmutableSet.Builder();
        Iterator<Map.Entry<K, V>> it2 = setEntrySet.iterator();
        while (it2.hasNext()) {
            builder.add(new a(it2.next()));
        }
        return builder.build();
    }

    @Override // java.util.Map
    public V get(Object obj) {
        return this.a.get(obj);
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.Map
    @NonNull
    public Set<K> keySet() {
        return new ImmutableSet(this.a.keySet());
    }

    @Override // java.util.Map
    public V put(K k, V v) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public void putAll(@NonNull Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public int size() {
        return this.a.size();
    }

    @Override // java.util.Map
    @NonNull
    public Collection<V> values() {
        return new ImmutableList(this.a.values());
    }
}
