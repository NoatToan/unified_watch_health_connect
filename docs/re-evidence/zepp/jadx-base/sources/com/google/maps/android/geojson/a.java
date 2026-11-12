package com.google.maps.android.geojson;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
class a<K> extends HashMap<K, Object> {
    private final Map<Object, K> a = new HashMap();

    @Override // java.util.HashMap, java.util.AbstractMap
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public a<K> clone() {
        a<K> aVar = new a<>();
        aVar.putAll((Map) super.clone());
        return aVar;
    }

    public K c(Object obj) {
        return this.a.get(obj);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void clear() {
        super.clear();
        this.a.clear();
    }

    public Object e(K k, Collection collection) {
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            this.a.put(it2.next(), k);
        }
        return super.put(k, collection);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Object put(K k, Object obj) {
        this.a.put(obj, k);
        return super.put(k, obj);
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
        if (objRemove instanceof Collection) {
            Iterator it2 = ((Collection) objRemove).iterator();
            while (it2.hasNext()) {
                this.a.remove(it2.next());
            }
        } else {
            this.a.remove(objRemove);
        }
        return objRemove;
    }
}
