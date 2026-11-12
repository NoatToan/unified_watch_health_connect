package com.mapbox.maps;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public enum OfflineRegionErrorType {
    NOT_FOUND,
    SERVER,
    CONNECTION,
    RATE_LIMIT,
    DISK_FULL,
    TILE_COUNT_LIMIT_EXCEEDED,
    OTHER;

    private int getValue() {
        return ordinal();
    }
}
