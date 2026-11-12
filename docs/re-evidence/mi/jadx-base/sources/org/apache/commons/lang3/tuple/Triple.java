package org.apache.commons.lang3.tuple;

import defpackage.s94;
import java.io.Serializable;
import org.apache.commons.lang3.ObjectUtils;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Triple<L, M, R> implements Comparable<Triple<L, M, R>>, Serializable {
    private static final long serialVersionUID = 1;

    public static <L, M, R> Triple<L, M, R> of(L l, M m, R r2) {
        return new ImmutableTriple(l, m, r2);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Triple)) {
            return false;
        }
        Triple triple = (Triple) obj;
        return ObjectUtils.b(getLeft(), triple.getLeft()) && ObjectUtils.b(getMiddle(), triple.getMiddle()) && ObjectUtils.b(getRight(), triple.getRight());
    }

    public abstract L getLeft();

    public abstract M getMiddle();

    public abstract R getRight();

    public int hashCode() {
        return ((getLeft() == null ? 0 : getLeft().hashCode()) ^ (getMiddle() == null ? 0 : getMiddle().hashCode())) ^ (getRight() != null ? getRight().hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('(');
        sb.append(getLeft());
        sb.append(',');
        sb.append(getMiddle());
        sb.append(',');
        sb.append(getRight());
        sb.append(')');
        return sb.toString();
    }

    @Override // java.lang.Comparable
    public int compareTo(Triple<L, M, R> triple) {
        return new s94().g(getLeft(), triple.getLeft()).g(getMiddle(), triple.getMiddle()).g(getRight(), triple.getRight()).t();
    }

    public String toString(String str) {
        return String.format(str, getLeft(), getMiddle(), getRight());
    }
}
