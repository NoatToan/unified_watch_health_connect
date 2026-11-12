package com.mapbox.maps;

/* JADX INFO: loaded from: classes2.dex */
public enum InteractionType {
    CLICK,
    LONG_CLICK,
    DRAG;

    private int getValue() {
        return ordinal();
    }
}
