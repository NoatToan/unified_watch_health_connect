package com.mapbox.common;

/* JADX INFO: loaded from: classes2.dex */
public enum TileRegionErrorType {
    CANCELED("Canceled"),
    DOES_NOT_EXIST("DoesNotExist"),
    TILESET_DESCRIPTOR("TilesetDescriptor"),
    DISK_FULL("DiskFull"),
    OTHER("Other"),
    TILE_COUNT_EXCEEDED("TileCountExceeded");

    private String str;

    TileRegionErrorType(String str) {
        this.str = str;
    }

    private int getValue() {
        return ordinal();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.str;
    }
}
