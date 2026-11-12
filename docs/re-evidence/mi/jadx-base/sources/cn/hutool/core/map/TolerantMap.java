package cn.hutool.core.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes.dex */
public class TolerantMap<K, V> extends MapWrapper<K, V> {
    private static final long serialVersionUID = -4158133823263496197L;
    private final V defaultValue;

    public TolerantMap(V v) {
        this(new HashMap(), v);
    }

    public static <K, V> TolerantMap<K, V> of(Map<K, V> map, V v) {
        return new TolerantMap<>(map, v);
    }

    @Override // cn.hutool.core.map.MapWrapper, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        TolerantMap tolerantMap = (TolerantMap) obj;
        return getRaw().equals(tolerantMap.getRaw()) && Objects.equals(this.defaultValue, tolerantMap.defaultValue);
    }

    @Override // cn.hutool.core.map.MapWrapper, java.util.Map
    public V get(Object obj) {
        return getOrDefault(obj, this.defaultValue);
    }

    @Override // cn.hutool.core.map.MapWrapper, java.util.Map
    public int hashCode() {
        return Objects.hash(getRaw(), this.defaultValue);
    }

    @Override // cn.hutool.core.map.MapWrapper
    public String toString() {
        return "TolerantMap{map=" + getRaw() + ", defaultValue=" + this.defaultValue + AbstractJsonLexerKt.END_OBJ;
    }

    public TolerantMap(int i, float f, V v) {
        this(new HashMap(i, f), v);
    }

    public TolerantMap(int i, V v) {
        this(new HashMap(i), v);
    }

    public TolerantMap(Map<K, V> map, V v) {
        super(map);
        this.defaultValue = v;
    }
}
