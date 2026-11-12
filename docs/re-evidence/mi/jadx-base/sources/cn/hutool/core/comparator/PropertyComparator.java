package cn.hutool.core.comparator;

import defpackage.g4h;
import defpackage.rh2;
import defpackage.t94;
import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public class PropertyComparator<T> implements Comparator<T>, Serializable {
    private static final long serialVersionUID = 9157326766723846313L;
    private final boolean isNullGreater;
    private final String property;

    public PropertyComparator(String str) {
        this(str, true);
    }

    @Override // java.util.Comparator
    public int compare(T t, T t2) {
        if (t == t2) {
            return 0;
        }
        if (t == null) {
            return this.isNullGreater ? 1 : -1;
        }
        if (t2 == null) {
            return this.isNullGreater ? -1 : 1;
        }
        try {
            return compare(t, t2, (Comparable) rh2.q(t, this.property), (Comparable) rh2.q(t2, this.property));
        } catch (Exception e) {
            throw new ComparatorException(e);
        }
    }

    public PropertyComparator(String str, boolean z) {
        this.property = str;
        this.isNullGreater = z;
    }

    private int compare(T t, T t2, Comparable comparable, Comparable comparable2) {
        int iD = g4h.d(comparable, comparable2, this.isNullGreater);
        return iD == 0 ? t94.c(t, t2, this.isNullGreater) : iD;
    }
}
