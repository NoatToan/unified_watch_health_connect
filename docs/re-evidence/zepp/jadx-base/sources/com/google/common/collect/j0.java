package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible(serializable = true)
class j0 extends ImmutableListMultimap<Object, Object> {
    public static final j0 i = new j0();
    private static final long serialVersionUID = 0;

    private j0() {
        super(ImmutableMap.of(), 0);
    }

    private Object readResolve() {
        return i;
    }
}
