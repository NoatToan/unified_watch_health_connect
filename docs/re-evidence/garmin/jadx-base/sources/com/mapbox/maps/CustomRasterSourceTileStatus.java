package com.mapbox.maps;

/* JADX INFO: loaded from: classes2.dex */
public enum CustomRasterSourceTileStatus {
    REQUIRED,
    OPTIONAL,
    NOT_NEEDED;

    private int getValue() {
        return ordinal();
    }
}
