package com.google.common.collect;

/* JADX INFO: loaded from: classes21.dex */
@ElementTypesAreNonnullByDefault
public enum BoundType {
    OPEN(false),
    CLOSED(true);

    final boolean inclusive;

    BoundType(boolean z) {
        this.inclusive = z;
    }

    public static BoundType forBoolean(boolean z) {
        return z ? CLOSED : OPEN;
    }
}
