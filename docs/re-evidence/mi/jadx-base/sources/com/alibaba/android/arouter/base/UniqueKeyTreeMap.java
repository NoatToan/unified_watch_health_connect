package com.alibaba.android.arouter.base;

import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public class UniqueKeyTreeMap<K, V> extends TreeMap<K, V> {
    private String tipText;

    public UniqueKeyTreeMap(String str) {
        this.tipText = str;
    }

    @Override // java.util.TreeMap, java.util.AbstractMap, java.util.Map
    public V put(K k2, V v) {
        if (containsKey(k2)) {
            throw new RuntimeException(String.format(this.tipText, k2));
        }
        return (V) super.put(k2, v);
    }
}
