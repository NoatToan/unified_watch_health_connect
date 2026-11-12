package com.mapbox.maps;

/* JADX INFO: loaded from: classes2.dex */
public enum SourceDataLoadedType {
    METADATA("Metadata"),
    TILE("Tile");

    private String str;

    SourceDataLoadedType(String str) {
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
