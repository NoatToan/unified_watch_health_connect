package com.mapbox.maps;

/* JADX INFO: loaded from: classes2.dex */
public enum TileStoreUsageMode {
    DISABLED("Disabled"),
    READ_ONLY("ReadOnly"),
    READ_AND_UPDATE("ReadAndUpdate");

    private String str;

    TileStoreUsageMode(String str) {
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
