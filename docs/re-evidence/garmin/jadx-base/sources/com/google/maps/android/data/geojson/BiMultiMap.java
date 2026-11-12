package com.google.maps.android.data.geojson;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class BiMultiMap<K> extends HashMap<K, Object> {
    private final Map<Object, K> mValuesToKeys = new HashMap();

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void clear() {
        super.clear();
        this.mValuesToKeys.clear();
    }

    @Override // java.util.HashMap, java.util.AbstractMap
    public BiMultiMap<K> clone() {
        BiMultiMap<K> biMultiMap = new BiMultiMap<>();
        biMultiMap.putAll((Map) super.clone());
        return biMultiMap;
    }

    public K getKey(Object obj) {
        return this.mValuesToKeys.get(obj);
    }

    public Object put(K k14, Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            this.mValuesToKeys.put(it.next(), k14);
        }
        return super.put((Object) k14, collection);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void putAll(Map<? extends K, ?> map) {
        for (Map.Entry<? extends K, ?> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        Object objRemove = super.remove(obj);
        if (!(objRemove instanceof Collection)) {
            this.mValuesToKeys.remove(objRemove);
            return objRemove;
        }
        Iterator it = ((Collection) objRemove).iterator();
        while (it.hasNext()) {
            this.mValuesToKeys.remove(it.next());
        }
        return objRemove;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Object put(K k14, Object obj) {
        if (obj instanceof Collection) {
            return put((Object) k14, (Collection) obj);
        }
        this.mValuesToKeys.put(obj, k14);
        return super.put(k14, obj);
    }
}
