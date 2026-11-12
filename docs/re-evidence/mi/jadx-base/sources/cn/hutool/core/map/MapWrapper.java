package cn.hutool.core.map;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: loaded from: classes.dex */
public class MapWrapper<K, V> implements Map<K, V>, Iterable<Map.Entry<K, V>>, Serializable, Cloneable {
    protected static final int DEFAULT_INITIAL_CAPACITY = 16;
    protected static final float DEFAULT_LOAD_FACTOR = 0.75f;
    private static final long serialVersionUID = -7524578042008586382L;
    private final Map<K, V> raw;

    public MapWrapper(Map<K, V> map) {
        this.raw = map;
    }

    @Override // java.util.Map
    public void clear() {
        this.raw.clear();
    }

    @Override // java.util.Map
    public V compute(K k2, BiFunction<? super K, ? super V, ? extends V> biFunction) {
        return this.raw.compute(k2, biFunction);
    }

    @Override // java.util.Map
    public V computeIfAbsent(K k2, Function<? super K, ? extends V> function) {
        return this.raw.computeIfAbsent(k2, function);
    }

    @Override // java.util.Map
    public V computeIfPresent(K k2, BiFunction<? super K, ? super V, ? extends V> biFunction) {
        return this.raw.computeIfPresent(k2, biFunction);
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.raw.containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return this.raw.containsValue(obj);
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return this.raw.entrySet();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.raw, ((MapWrapper) obj).raw);
    }

    @Override // java.util.Map
    public void forEach(BiConsumer<? super K, ? super V> biConsumer) {
        this.raw.forEach(biConsumer);
    }

    @Override // java.util.Map
    public V get(Object obj) {
        return this.raw.get(obj);
    }

    @Override // java.util.Map
    public V getOrDefault(Object obj, V v) {
        return this.raw.getOrDefault(obj, v);
    }

    public Map<K, V> getRaw() {
        return this.raw;
    }

    @Override // java.util.Map
    public int hashCode() {
        return Objects.hash(this.raw);
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.raw.isEmpty();
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        return entrySet().iterator();
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        return this.raw.keySet();
    }

    @Override // java.util.Map
    public V merge(K k2, V v, BiFunction<? super V, ? super V, ? extends V> biFunction) {
        return this.raw.merge(k2, v, biFunction);
    }

    @Override // java.util.Map
    public V put(K k2, V v) {
        return this.raw.put(k2, v);
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        this.raw.putAll(map);
    }

    @Override // java.util.Map
    public V putIfAbsent(K k2, V v) {
        return this.raw.putIfAbsent(k2, v);
    }

    @Override // java.util.Map
    public V remove(Object obj) {
        return this.raw.remove(obj);
    }

    @Override // java.util.Map
    public boolean replace(K k2, V v, V v2) {
        return this.raw.replace(k2, v, v2);
    }

    @Override // java.util.Map
    public void replaceAll(BiFunction<? super K, ? super V, ? extends V> biFunction) {
        this.raw.replaceAll(biFunction);
    }

    @Override // java.util.Map
    public int size() {
        return this.raw.size();
    }

    public String toString() {
        return this.raw.toString();
    }

    @Override // java.util.Map
    public Collection<V> values() {
        return this.raw.values();
    }

    @Override // java.util.Map
    public boolean remove(Object obj, Object obj2) {
        return this.raw.remove(obj, obj2);
    }

    @Override // java.util.Map
    public V replace(K k2, V v) {
        return this.raw.replace(k2, v);
    }
}
