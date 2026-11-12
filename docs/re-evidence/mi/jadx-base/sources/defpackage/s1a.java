package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public abstract class s1a<K, V> extends t1a implements Map.Entry<K, V> {
    public boolean equals(Object obj) {
        return f().equals(obj);
    }

    public abstract Map.Entry<K, V> f();

    @Override // java.util.Map.Entry
    public K getKey() {
        return f().getKey();
    }

    @Override // java.util.Map.Entry
    public V getValue() {
        return f().getValue();
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        return f().hashCode();
    }

    public V setValue(V v) {
        return f().setValue(v);
    }

    public boolean standardEquals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return j4h.a(getKey(), entry.getKey()) && j4h.a(getValue(), entry.getValue());
    }
}
