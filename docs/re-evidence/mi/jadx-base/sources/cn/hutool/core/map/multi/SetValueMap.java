package cn.hutool.core.map.multi;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class SetValueMap<K, V> extends AbsCollValueMap<K, V, Set<V>> {
    private static final long serialVersionUID = 6044017508487827899L;

    public SetValueMap() {
        this(16);
    }

    public SetValueMap(int i) {
        this(i, 0.75f);
    }

    @Override // cn.hutool.core.map.multi.AbsCollValueMap
    public Set<V> createCollection() {
        return new LinkedHashSet(3);
    }

    public SetValueMap(Map<? extends K, ? extends Collection<V>> map) {
        this(0.75f, map);
    }

    public SetValueMap(float f, Map<? extends K, ? extends Collection<V>> map) {
        this(map.size(), f);
        putAllValues(map);
    }

    public SetValueMap(int i, float f) {
        super(new HashMap(i, f));
    }
}
