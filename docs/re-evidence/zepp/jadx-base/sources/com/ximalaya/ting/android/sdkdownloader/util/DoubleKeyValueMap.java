package com.ximalaya.ting.android.sdkdownloader.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes22.dex */
public class DoubleKeyValueMap<K1, K2, V> {
    private final ConcurrentHashMap<K1, ConcurrentHashMap<K2, V>> a = new ConcurrentHashMap<>();

    public void clear() {
        if (this.a.size() > 0) {
            Iterator<ConcurrentHashMap<K2, V>> it2 = this.a.values().iterator();
            while (it2.hasNext()) {
                it2.next().clear();
            }
            this.a.clear();
        }
    }

    public boolean containsKey(K1 k1, K2 k2) {
        if (this.a.containsKey(k1)) {
            return this.a.get(k1).containsKey(k2);
        }
        return false;
    }

    public ConcurrentHashMap<K2, V> get(K1 k1) {
        return this.a.get(k1);
    }

    public Collection<V> getAllValues(K1 k1) {
        ConcurrentHashMap<K2, V> concurrentHashMap = this.a.get(k1);
        if (concurrentHashMap == null) {
            return null;
        }
        return concurrentHashMap.values();
    }

    public Set<K1> getFirstKeys() {
        return this.a.keySet();
    }

    public void put(K1 k1, K2 k2, V v) {
        if (k1 == null || k2 == null || v == null) {
            return;
        }
        if (!this.a.containsKey(k1)) {
            ConcurrentHashMap<K2, V> concurrentHashMap = new ConcurrentHashMap<>();
            concurrentHashMap.put(k2, v);
            this.a.put(k1, concurrentHashMap);
            return;
        }
        ConcurrentHashMap<K2, V> concurrentHashMap2 = this.a.get(k1);
        if (concurrentHashMap2 != null) {
            concurrentHashMap2.put(k2, v);
            return;
        }
        ConcurrentHashMap<K2, V> concurrentHashMap3 = new ConcurrentHashMap<>();
        concurrentHashMap3.put(k2, v);
        this.a.put(k1, concurrentHashMap3);
    }

    public void remove(K1 k1) {
        this.a.remove(k1);
    }

    public int size() {
        int size = 0;
        if (this.a.size() == 0) {
            return 0;
        }
        Iterator<ConcurrentHashMap<K2, V>> it2 = this.a.values().iterator();
        while (it2.hasNext()) {
            size += it2.next().size();
        }
        return size;
    }

    public V get(K1 k1, K2 k2) {
        ConcurrentHashMap<K2, V> concurrentHashMap = this.a.get(k1);
        if (concurrentHashMap == null) {
            return null;
        }
        return concurrentHashMap.get(k2);
    }

    public void remove(K1 k1, K2 k2) {
        ConcurrentHashMap<K2, V> concurrentHashMap = this.a.get(k1);
        if (concurrentHashMap != null) {
            concurrentHashMap.remove(k2);
        }
        if (concurrentHashMap == null || concurrentHashMap.isEmpty()) {
            this.a.remove(k1);
        }
    }

    public boolean containsKey(K1 k1) {
        return this.a.containsKey(k1);
    }

    public Collection<V> getAllValues() {
        Set<K1> setKeySet = this.a.keySet();
        if (setKeySet == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<K1> it2 = setKeySet.iterator();
        while (it2.hasNext()) {
            Collection<V> collectionValues = this.a.get(it2.next()).values();
            if (collectionValues != null) {
                arrayList.addAll(collectionValues);
            }
        }
        return arrayList;
    }
}
