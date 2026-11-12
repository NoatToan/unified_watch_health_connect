package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible(serializable = true)
class k0 extends ImmutableSetMultimap<Object, Object> {
    public static final k0 k = new k0();
    private static final long serialVersionUID = 0;

    private k0() {
        super(ImmutableMap.of(), 0, null);
    }

    private Object readResolve() {
        return k;
    }
}
