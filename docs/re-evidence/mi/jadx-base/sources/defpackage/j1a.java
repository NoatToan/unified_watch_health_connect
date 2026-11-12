package defpackage;

import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes5.dex */
public abstract class j1a<K, V> extends r1a<K, V> implements ConcurrentMap<K, V> {
    public abstract ConcurrentMap<K, V> f();

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public V putIfAbsent(K k2, V v) {
        return f().putIfAbsent(k2, v);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public boolean remove(Object obj, Object obj2) {
        return f().remove(obj, obj2);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public V replace(K k2, V v) {
        return f().replace(k2, v);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public boolean replace(K k2, V v, V v2) {
        return f().replace(k2, v, v2);
    }
}
