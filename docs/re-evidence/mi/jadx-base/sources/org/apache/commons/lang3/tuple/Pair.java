package org.apache.commons.lang3.tuple;

import defpackage.s94;
import java.io.Serializable;
import java.util.Map;
import org.apache.commons.lang3.ObjectUtils;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Pair<L, R> implements Map.Entry<L, R>, Comparable<Pair<L, R>>, Serializable {
    private static final long serialVersionUID = 4954918890077093841L;

    public static <L, R> Pair<L, R> of(L l, R r2) {
        return new ImmutablePair(l, r2);
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return ObjectUtils.b(getKey(), entry.getKey()) && ObjectUtils.b(getValue(), entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final L getKey() {
        return getLeft();
    }

    public abstract L getLeft();

    public abstract R getRight();

    @Override // java.util.Map.Entry
    public R getValue() {
        return getRight();
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        return (getKey() == null ? 0 : getKey().hashCode()) ^ (getValue() != null ? getValue().hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('(');
        sb.append(getLeft());
        sb.append(',');
        sb.append(getRight());
        sb.append(')');
        return sb.toString();
    }

    @Override // java.lang.Comparable
    public int compareTo(Pair<L, R> pair) {
        return new s94().g(getLeft(), pair.getLeft()).g(getRight(), pair.getRight()).t();
    }

    public String toString(String str) {
        return String.format(str, getLeft(), getRight());
    }
}
