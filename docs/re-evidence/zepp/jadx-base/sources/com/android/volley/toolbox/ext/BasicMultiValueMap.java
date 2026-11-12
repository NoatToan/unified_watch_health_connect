package com.android.volley.toolbox.ext;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class BasicMultiValueMap<K, V> implements MultiValueMap<K, V> {
    private Map<K, List<V>> a;

    public BasicMultiValueMap(Map<K, List<V>> map) {
        this.a = map;
    }

    @Override // com.android.volley.toolbox.ext.MultiValueMap
    public void add(K k, V v) {
        if (k != null) {
            if (!this.a.containsKey(k)) {
                this.a.put(k, new ArrayList(2));
            }
            this.a.get(k).add(v);
        }
    }

    @Override // com.android.volley.toolbox.ext.MultiValueMap
    public void clear() {
        this.a.clear();
    }

    @Override // com.android.volley.toolbox.ext.MultiValueMap
    public boolean containsKey(K k) {
        return this.a.containsKey(k);
    }

    @Override // com.android.volley.toolbox.ext.MultiValueMap
    public Set<Map.Entry<K, List<V>>> entrySet() {
        return this.a.entrySet();
    }

    public Map<K, List<V>> getSource() {
        return this.a;
    }

    @Override // com.android.volley.toolbox.ext.MultiValueMap
    public V getValue(K k, int i) {
        List<V> list = this.a.get(k);
        if (list == null || i >= list.size()) {
            return null;
        }
        return list.get(i);
    }

    @Override // com.android.volley.toolbox.ext.MultiValueMap
    public List<V> getValues(K k) {
        return this.a.get(k);
    }

    @Override // com.android.volley.toolbox.ext.MultiValueMap
    public boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // com.android.volley.toolbox.ext.MultiValueMap
    public Set<K> keySet() {
        return this.a.keySet();
    }

    @Override // com.android.volley.toolbox.ext.MultiValueMap
    public List<V> remove(K k) {
        return this.a.remove(k);
    }

    @Override // com.android.volley.toolbox.ext.MultiValueMap
    public void set(K k, V v) {
        this.a.remove(k);
        add(k, v);
    }

    @Override // com.android.volley.toolbox.ext.MultiValueMap
    public int size() {
        return this.a.size();
    }

    @Override // com.android.volley.toolbox.ext.MultiValueMap
    public List<V> values() {
        ArrayList arrayList = new ArrayList();
        Iterator<K> it2 = this.a.keySet().iterator();
        while (it2.hasNext()) {
            arrayList.addAll(this.a.get(it2.next()));
        }
        return arrayList;
    }

    @Override // com.android.volley.toolbox.ext.MultiValueMap
    public void set(K k, List<V> list) {
        this.a.remove(k);
        add((Object) k, (List) list);
    }

    @Override // com.android.volley.toolbox.ext.MultiValueMap
    public void add(K k, List<V> list) {
        Iterator<V> it2 = list.iterator();
        while (it2.hasNext()) {
            add(k, it2.next());
        }
    }

    @Override // com.android.volley.toolbox.ext.MultiValueMap
    public void set(Map<K, List<V>> map) {
        this.a.clear();
        for (Map.Entry<K, List<V>> entry : map.entrySet()) {
            add((Object) entry.getKey(), (List) entry.getValue());
        }
    }
}
