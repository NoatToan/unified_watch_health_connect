package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;
import java.util.List;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible(serializable = true)
final class l0<T> extends Ordering<T> implements Serializable {
    private static final long serialVersionUID = 0;
    public final ImmutableMap<T, Integer> c;

    public l0(List<T> list) {
        this(Maps.u(list));
    }

    private int b(T t) {
        Integer num = this.c.get(t);
        if (num != null) {
            return num.intValue();
        }
        throw new Ordering.c(t);
    }

    @Override // com.google.common.collect.Ordering, java.util.Comparator
    public int compare(T t, T t2) {
        return b(t) - b(t2);
    }

    @Override // java.util.Comparator
    public boolean equals(@NullableDecl Object obj) {
        if (obj instanceof l0) {
            return this.c.equals(((l0) obj).c);
        }
        return false;
    }

    public int hashCode() {
        return this.c.hashCode();
    }

    public String toString() {
        return "Ordering.explicit(" + this.c.keySet() + ")";
    }

    public l0(ImmutableMap<T, Integer> immutableMap) {
        this.c = immutableMap;
    }
}
