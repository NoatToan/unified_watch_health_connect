package cn.hutool.core.map;

import defpackage.v4f;
import java.io.Serializable;
import java.util.Map;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes.dex */
public class MapBuilder<K, V> implements Serializable {
    private static final long serialVersionUID = 1;
    private final Map<K, V> map;

    public MapBuilder(Map<K, V> map) {
        this.map = map;
    }

    public static <K, V> MapBuilder<K, V> create() {
        return create(false);
    }

    public Map<K, V> build() {
        return map();
    }

    public String join(String str, String str2) {
        return v4f.r(this.map, str, str2, new String[0]);
    }

    public String joinIgnoreNull(String str, String str2) {
        return v4f.s(this.map, str, str2, new String[0]);
    }

    public Map<K, V> map() {
        return this.map;
    }

    public MapBuilder<K, V> put(K k2, V v) {
        this.map.put(k2, v);
        return this;
    }

    public MapBuilder<K, V> putAll(Map<K, V> map) {
        this.map.putAll(map);
        return this;
    }

    public static <K, V> MapBuilder<K, V> create(boolean z) {
        return create(v4f.z(z));
    }

    public String join(String str, String str2, boolean z) {
        return v4f.q(this.map, str, str2, z, new String[0]);
    }

    public MapBuilder<K, V> put(boolean z, K k2, V v) {
        if (z) {
            put(k2, v);
        }
        return this;
    }

    public static <K, V> MapBuilder<K, V> create(Map<K, V> map) {
        return new MapBuilder<>(map);
    }

    public MapBuilder<K, V> put(boolean z, K k2, Supplier<V> supplier) {
        if (z) {
            put(k2, supplier.get());
        }
        return this;
    }
}
