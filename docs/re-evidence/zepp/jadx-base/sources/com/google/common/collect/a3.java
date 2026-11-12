package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible(serializable = true)
final class a3 extends Ordering<Object> implements Serializable {
    public static final a3 c = new a3();
    private static final long serialVersionUID = 0;

    private a3() {
    }

    private Object readResolve() {
        return c;
    }

    @Override // com.google.common.collect.Ordering, java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return obj.toString().compareTo(obj2.toString());
    }

    public String toString() {
        return "Ordering.usingToString()";
    }
}
