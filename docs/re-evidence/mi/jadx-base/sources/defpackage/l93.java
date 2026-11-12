package defpackage;

import androidx.collection.ArrayMap;
import androidx.collection.SimpleArrayMap;

/* JADX INFO: loaded from: classes4.dex */
public final class l93<K, V> extends ArrayMap<K, V> {
    public int d;

    @Override // androidx.collection.SimpleArrayMap, java.util.Map
    public void clear() {
        this.d = 0;
        super.clear();
    }

    @Override // androidx.collection.SimpleArrayMap, java.util.Map
    public int hashCode() {
        if (this.d == 0) {
            this.d = super.hashCode();
        }
        return this.d;
    }

    @Override // androidx.collection.SimpleArrayMap, java.util.Map
    public V put(K k2, V v) {
        this.d = 0;
        return (V) super.put(k2, v);
    }

    @Override // androidx.collection.SimpleArrayMap
    public void putAll(SimpleArrayMap<? extends K, ? extends V> simpleArrayMap) {
        this.d = 0;
        super.putAll(simpleArrayMap);
    }

    @Override // androidx.collection.SimpleArrayMap
    public V removeAt(int i) {
        this.d = 0;
        return (V) super.removeAt(i);
    }

    @Override // androidx.collection.SimpleArrayMap
    public V setValueAt(int i, V v) {
        this.d = 0;
        return (V) super.setValueAt(i, v);
    }
}
