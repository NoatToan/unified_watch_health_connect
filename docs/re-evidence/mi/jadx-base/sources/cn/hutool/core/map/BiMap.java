package cn.hutool.core.map;

import defpackage.v4f;
import java.util.Map;
import java.util.function.BiConsumer;

/* JADX INFO: loaded from: classes.dex */
public class BiMap<K, V> extends MapWrapper<K, V> {
    private static final long serialVersionUID = 1;
    private Map<V, K> inverse;

    public BiMap(Map<K, V> map) {
        super(map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$putAll$0(Object obj, Object obj2) {
        this.inverse.put(obj2, obj);
    }

    @Override // cn.hutool.core.map.MapWrapper, java.util.Map
    public void clear() {
        super.clear();
        this.inverse = null;
    }

    public Map<V, K> getInverse() {
        if (this.inverse == null) {
            this.inverse = v4f.n(getRaw());
        }
        return this.inverse;
    }

    public K getKey(V v) {
        return getInverse().get(v);
    }

    @Override // cn.hutool.core.map.MapWrapper, java.util.Map
    public V put(K k2, V v) {
        Map<V, K> map = this.inverse;
        if (map != null) {
            map.put(v, k2);
        }
        return (V) super.put(k2, v);
    }

    @Override // cn.hutool.core.map.MapWrapper, java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        super.putAll(map);
        if (this.inverse != null) {
            map.forEach(new BiConsumer() { // from class: qi2
                @Override // java.util.function.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    this.f31539a.lambda$putAll$0(obj, obj2);
                }
            });
        }
    }
}
