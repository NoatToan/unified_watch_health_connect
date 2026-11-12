package com.mapbox.bindgen;

import java.util.HashMap;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class HashMapKeyValueExtractor {
    private final Object[] keys;
    private final Object[] values;

    public HashMapKeyValueExtractor(HashMap<Object, Object> map) {
        Set<Object> setKeySet = map.keySet();
        int size = setKeySet.size();
        this.keys = new Object[size];
        this.values = new Object[size];
        int i14 = 0;
        for (Object obj : setKeySet) {
            this.keys[i14] = obj;
            this.values[i14] = map.get(obj);
            i14++;
        }
    }

    public Object[] getKeys() {
        return this.keys;
    }

    public Object[] getValues() {
        return this.values;
    }
}
