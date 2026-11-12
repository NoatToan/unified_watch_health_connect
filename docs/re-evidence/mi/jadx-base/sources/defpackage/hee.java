package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class hee<V> implements Map<Class<?>, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<String, V> f19975a;

    public hee(Map<String, V> map) {
        this.f19975a = map;
    }

    public static <V> Map<Class<?>, V> a(Map<String, V> map) {
        return new hee(map);
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public V put(Class<?> cls, V v) {
        throw new UnsupportedOperationException("Dagger map bindings are immutable");
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Dagger map bindings are immutable");
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        if (obj instanceof Class) {
            return this.f19975a.containsKey(((Class) obj).getName());
        }
        throw new IllegalArgumentException("Key must be a class");
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return this.f19975a.containsValue(obj);
    }

    @Override // java.util.Map
    public Set<Map.Entry<Class<?>, V>> entrySet() {
        throw new UnsupportedOperationException("Maps created with @LazyClassKey do not support usage of entrySet(). Consider @ClassKey instead.");
    }

    @Override // java.util.Map
    public V get(Object obj) {
        if (obj instanceof Class) {
            return this.f19975a.get(((Class) obj).getName());
        }
        throw new IllegalArgumentException("Key must be a class");
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.f19975a.isEmpty();
    }

    @Override // java.util.Map
    public Set<Class<?>> keySet() {
        throw new UnsupportedOperationException("Maps created with @LazyClassKey do not support usage of keySet(). Consider @ClassKey instead.");
    }

    @Override // java.util.Map
    public void putAll(Map<? extends Class<?>, ? extends V> map) {
        throw new UnsupportedOperationException("Dagger map bindings are immutable");
    }

    @Override // java.util.Map
    public V remove(Object obj) {
        throw new UnsupportedOperationException("Dagger map bindings are immutable");
    }

    @Override // java.util.Map
    public int size() {
        return this.f19975a.size();
    }

    @Override // java.util.Map
    public Collection<V> values() {
        return this.f19975a.values();
    }
}
