package com.google.maps.android.compose;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@o13.e
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/google/maps/android/compose/DragState;", "", "<init>", "(Ljava/lang/String;I)V", "START", "DRAG", "END", "maps-compose_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public enum DragState {
    START,
    DRAG,
    END;

    private static final /* synthetic */ w13.a $ENTRIES = w13.b.g(values());

    public static w13.a<DragState> getEntries() {
        return $ENTRIES;
    }
}
