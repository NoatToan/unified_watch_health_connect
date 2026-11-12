package cn.hutool.core.map.multi;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class ListValueMap<K, V> extends AbsCollValueMap<K, V, List<V>> {
    private static final long serialVersionUID = 6044017508487827899L;

    public ListValueMap() {
        this(16);
    }

    public ListValueMap(int i) {
        this(i, 0.75f);
    }

    @Override // cn.hutool.core.map.multi.AbsCollValueMap
    public List<V> createCollection() {
        return new ArrayList(3);
    }

    public ListValueMap(Map<? extends K, ? extends Collection<V>> map) {
        this(0.75f, map);
    }

    public ListValueMap(float f, Map<? extends K, ? extends Collection<V>> map) {
        this(map.size(), f);
        putAllValues(map);
    }

    public ListValueMap(int i, float f) {
        super(new HashMap(i, f));
    }
}
