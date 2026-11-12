package cn.hutool.core.lang;

import defpackage.s14;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class Pair<K, V> extends s14<Pair<K, V>> implements Serializable {
    private static final long serialVersionUID = 1;
    private final K key;
    private final V value;

    public Pair(K k2, V v) {
        this.key = k2;
        this.value = v;
    }

    public static <K, V> Pair<K, V> of(K k2, V v) {
        return new Pair<>(k2, v);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Pair)) {
            return false;
        }
        Pair pair = (Pair) obj;
        return Objects.equals(getKey(), pair.getKey()) && Objects.equals(getValue(), pair.getValue());
    }

    public K getKey() {
        return this.key;
    }

    public V getValue() {
        return this.value;
    }

    public int hashCode() {
        return Objects.hashCode(this.key) ^ Objects.hashCode(this.value);
    }

    public String toString() {
        return "Pair [key=" + this.key + ", value=" + this.value + "]";
    }
}
