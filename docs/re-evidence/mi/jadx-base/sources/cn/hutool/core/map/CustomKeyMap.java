package cn.hutool.core.map;

import java.util.Map;
import java.util.function.BiConsumer;

/* JADX INFO: loaded from: classes.dex */
public abstract class CustomKeyMap<K, V> extends MapWrapper<K, V> {
    private static final long serialVersionUID = 4043263744224569870L;

    public CustomKeyMap(Map<K, V> map) {
        super(map);
    }

    @Override // cn.hutool.core.map.MapWrapper, java.util.Map
    public boolean containsKey(Object obj) {
        return super.containsKey(customKey(obj));
    }

    public abstract Object customKey(Object obj);

    @Override // cn.hutool.core.map.MapWrapper, java.util.Map
    public V get(Object obj) {
        return (V) super.get(customKey(obj));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // cn.hutool.core.map.MapWrapper, java.util.Map
    public V put(K k2, V v) {
        return (V) super.put(customKey(k2), v);
    }

    @Override // cn.hutool.core.map.MapWrapper, java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        map.forEach(new BiConsumer() { // from class: vd5
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                this.f36764a.put(obj, obj2);
            }
        });
    }

    @Override // cn.hutool.core.map.MapWrapper, java.util.Map
    public V remove(Object obj) {
        return (V) super.remove(customKey(obj));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // cn.hutool.core.map.MapWrapper, java.util.Map
    public boolean replace(K k2, V v, V v2) {
        return super.replace(customKey(k2), v, v2);
    }

    @Override // cn.hutool.core.map.MapWrapper, java.util.Map
    public boolean remove(Object obj, Object obj2) {
        return super.remove(customKey(obj), obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // cn.hutool.core.map.MapWrapper, java.util.Map
    public V replace(K k2, V v) {
        return (V) super.replace(customKey(k2), v);
    }
}
