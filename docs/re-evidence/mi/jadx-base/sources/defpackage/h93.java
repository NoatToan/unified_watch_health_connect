package defpackage;

import java.lang.ref.ReferenceQueue;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes6.dex */
public abstract class h93<K, V> implements Map<K, V> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ReferenceQueue<V> f19822b = new ReferenceQueue<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Map<K, w0e<K, V>> f19821a = b();

    public final V a(K k2, V v) {
        w0e<K, V> w0eVarPut = this.f19821a.put(k2, c(k2, v, this.f19822b));
        if (w0eVarPut != null) {
            return w0eVarPut.get();
        }
        return null;
    }

    public Map<K, w0e<K, V>> b() {
        return new ConcurrentHashMap();
    }

    public abstract w0e<K, V> c(K k2, V v, ReferenceQueue<? super V> referenceQueue);

    @Override // java.util.Map
    public void clear() {
        this.f19821a.clear();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        d();
        return get(obj) != null;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        d();
        Iterator<w0e<K, V>> it = this.f19821a.values().iterator();
        while (it.hasNext()) {
            V v = it.next().get();
            if (v != null && v.equals(obj)) {
                return true;
            }
        }
        return false;
    }

    public final void d() {
        w0e w0eVar = (w0e) this.f19822b.poll();
        while (w0eVar != null) {
            Object objKey = w0eVar.key();
            if (objKey == null) {
                return;
            }
            this.f19821a.remove(objKey);
            w0eVar = (w0e) this.f19822b.poll();
        }
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        d();
        Map<K, w0e<K, V>> map = this.f19821a;
        HashSet hashSet = new HashSet(map.size());
        for (w0e<K, V> w0eVar : map.values()) {
            V v = w0eVar.get();
            if (v != null) {
                hashSet.add(new AbstractMap.SimpleEntry(w0eVar.key(), v));
            }
        }
        return hashSet;
    }

    @Override // java.util.Map
    public V get(Object obj) {
        d();
        w0e<K, V> w0eVar = this.f19821a.get(obj);
        if (w0eVar != null) {
            return w0eVar.get();
        }
        return null;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        d();
        return this.f19821a.isEmpty();
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        d();
        return this.f19821a.keySet();
    }

    @Override // java.util.Map
    public V put(K k2, V v) {
        d();
        return a(k2, v);
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        d();
        if (map.isEmpty()) {
            return;
        }
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            a(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public V remove(Object obj) {
        d();
        w0e<K, V> w0eVarRemove = this.f19821a.remove(obj);
        if (w0eVarRemove != null) {
            return w0eVarRemove.get();
        }
        return null;
    }

    @Override // java.util.Map
    public int size() {
        d();
        return this.f19821a.size();
    }

    @Override // java.util.Map
    public Collection<V> values() {
        d();
        ArrayList arrayList = new ArrayList();
        Iterator<w0e<K, V>> it = this.f19821a.values().iterator();
        while (it.hasNext()) {
            V v = it.next().get();
            if (v != null) {
                arrayList.add(v);
            }
        }
        return arrayList;
    }
}
