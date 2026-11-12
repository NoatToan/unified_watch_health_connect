package com.mapbox.maps;

/* JADX INFO: loaded from: classes2.dex */
public enum PlatformEventType {
    CLICK,
    LONG_CLICK,
    DRAG_BEGIN,
    DRAG,
    DRAG_END;

    private int getValue() {
        return ordinal();
    }
}
