package com.mapbox.maps;

/* JADX INFO: loaded from: classes2.dex */
public enum StyleDataLoadedType {
    STYLE("Style"),
    SPRITE("Sprite"),
    SOURCES("Sources");

    private String str;

    StyleDataLoadedType(String str) {
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
