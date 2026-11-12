package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;

/* JADX INFO: loaded from: classes14.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public enum BoundType {
    OPEN(false),
    CLOSED(true);

    final boolean inclusive;

    BoundType(boolean z14) {
        this.inclusive = z14;
    }

    public static BoundType forBoolean(boolean z14) {
        return z14 ? CLOSED : OPEN;
    }
}
