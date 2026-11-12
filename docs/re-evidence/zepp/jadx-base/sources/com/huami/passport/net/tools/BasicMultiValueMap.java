package com.huami.passport.net.tools;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes12.dex */
public class BasicMultiValueMap<K, V> implements MultiValueMap<K, V> {
    private Map<K, List<V>> mSource;

    public BasicMultiValueMap(Map<K, List<V>> map) {
        this.mSource = map;
    }

    @Override // com.huami.passport.net.tools.MultiValueMap
    public void add(K k, V v) {
        if (k != null) {
            if (!this.mSource.containsKey(k)) {
                this.mSource.put(k, new ArrayList(2));
            }
            this.mSource.get(k).add(v);
        }
    }

    @Override // com.huami.passport.net.tools.MultiValueMap
    public void clear() {
        this.mSource.clear();
    }

    @Override // com.huami.passport.net.tools.MultiValueMap
    public boolean containsKey(K k) {
        return this.mSource.containsKey(k);
    }

    @Override // com.huami.passport.net.tools.MultiValueMap
    public Set<Map.Entry<K, List<V>>> entrySet() {
        return this.mSource.entrySet();
    }

    public Map<K, List<V>> getSource() {
        return this.mSource;
    }

    @Override // com.huami.passport.net.tools.MultiValueMap
    public V getValue(K k, int i) {
        List<V> list = this.mSource.get(k);
        if (list == null || i >= list.size()) {
            return null;
        }
        return list.get(i);
    }

    @Override // com.huami.passport.net.tools.MultiValueMap
    public List<V> getValues(K k) {
        return this.mSource.get(k);
    }

    @Override // com.huami.passport.net.tools.MultiValueMap
    public boolean isEmpty() {
        return this.mSource.isEmpty();
    }

    @Override // com.huami.passport.net.tools.MultiValueMap
    public Set<K> keySet() {
        return this.mSource.keySet();
    }

    @Override // com.huami.passport.net.tools.MultiValueMap
    public List<V> remove(K k) {
        return this.mSource.remove(k);
    }

    @Override // com.huami.passport.net.tools.MultiValueMap
    public void set(K k, V v) {
        this.mSource.remove(k);
        add(k, v);
    }

    @Override // com.huami.passport.net.tools.MultiValueMap
    public int size() {
        return this.mSource.size();
    }

    @Override // com.huami.passport.net.tools.MultiValueMap
    public List<V> values() {
        ArrayList arrayList = new ArrayList();
        Iterator<K> it2 = this.mSource.keySet().iterator();
        while (it2.hasNext()) {
            arrayList.addAll(this.mSource.get(it2.next()));
        }
        return arrayList;
    }

    @Override // com.huami.passport.net.tools.MultiValueMap
    public void set(K k, List<V> list) {
        this.mSource.remove(k);
        add((Object) k, (List) list);
    }

    @Override // com.huami.passport.net.tools.MultiValueMap
    public void add(K k, List<V> list) {
        Iterator<V> it2 = list.iterator();
        while (it2.hasNext()) {
            add(k, it2.next());
        }
    }

    @Override // com.huami.passport.net.tools.MultiValueMap
    public void set(Map<K, List<V>> map) {
        this.mSource.clear();
        for (Map.Entry<K, List<V>> entry : map.entrySet()) {
            add((Object) entry.getKey(), (List) entry.getValue());
        }
    }
}
