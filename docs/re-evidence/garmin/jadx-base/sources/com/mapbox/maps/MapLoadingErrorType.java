package com.mapbox.maps;

/* JADX INFO: loaded from: classes2.dex */
public enum MapLoadingErrorType {
    STYLE("Style"),
    SPRITE("Sprite"),
    SOURCE("Source"),
    GLYPHS("Glyphs"),
    TILE("Tile");

    private String str;

    MapLoadingErrorType(String str) {
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
