package defpackage;

import com.google.common.collect.i0;
import com.google.common.collect.s;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public abstract class r1a<K, V> extends t1a implements Map<K, V> {
    public void clear() {
        delegate().clear();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return delegate().containsKey(obj);
    }

    public boolean containsValue(Object obj) {
        return delegate().containsValue(obj);
    }

    @Override // defpackage.t1a
    public abstract Map<K, V> delegate();

    public Set<Map.Entry<K, V>> entrySet() {
        return delegate().entrySet();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return obj == this || delegate().equals(obj);
    }

    @Override // java.util.Map
    public V get(Object obj) {
        return delegate().get(obj);
    }

    @Override // java.util.Map
    public int hashCode() {
        return delegate().hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return delegate().isEmpty();
    }

    public Set<K> keySet() {
        return delegate().keySet();
    }

    public V put(K k2, V v) {
        return delegate().put(k2, v);
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        delegate().putAll(map);
    }

    public V remove(Object obj) {
        return delegate().remove(obj);
    }

    @Override // java.util.Map
    public int size() {
        return delegate().size();
    }

    public void standardClear() {
        epd.d(entrySet().iterator());
    }

    public boolean standardContainsKey(Object obj) {
        return s.f(this, obj);
    }

    public boolean standardContainsValue(Object obj) {
        return s.g(this, obj);
    }

    public boolean standardEquals(Object obj) {
        return s.h(this, obj);
    }

    public int standardHashCode() {
        return i0.b(entrySet());
    }

    public boolean standardIsEmpty() {
        return !entrySet().iterator().hasNext();
    }

    public void standardPutAll(Map<? extends K, ? extends V> map) {
        s.t(this, map);
    }

    public V standardRemove(Object obj) {
        Iterator<Map.Entry<K, V>> it = entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (j4h.a(next.getKey(), obj)) {
                V value = next.getValue();
                it.remove();
                return value;
            }
        }
        return null;
    }

    public String standardToString() {
        return s.x(this);
    }

    public Collection<V> values() {
        return delegate().values();
    }
}
