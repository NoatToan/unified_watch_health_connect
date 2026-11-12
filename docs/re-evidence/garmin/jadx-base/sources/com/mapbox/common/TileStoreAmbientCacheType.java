package com.mapbox.common;

/* JADX INFO: loaded from: classes2.dex */
public enum TileStoreAmbientCacheType {
    TILES("Tiles"),
    RESOURCES("Resources");

    private String str;

    TileStoreAmbientCacheType(String str) {
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
