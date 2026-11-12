package cn.hutool.core.map;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class FixedLinkedHashMap<K, V> extends LinkedHashMap<K, V> {
    private static final long serialVersionUID = -629171177321416095L;
    private int capacity;

    public FixedLinkedHashMap(int i) {
        super(i + 1, 1.0f, true);
        this.capacity = i;
    }

    public int getCapacity() {
        return this.capacity;
    }

    @Override // java.util.LinkedHashMap
    public boolean removeEldestEntry(Map.Entry<K, V> entry) {
        return size() > this.capacity;
    }

    public void setCapacity(int i) {
        this.capacity = i;
    }
}
