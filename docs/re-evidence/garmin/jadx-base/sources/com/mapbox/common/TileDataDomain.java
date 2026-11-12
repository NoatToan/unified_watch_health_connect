package com.mapbox.common;

/* JADX INFO: loaded from: classes2.dex */
public enum TileDataDomain {
    MAPS("Maps"),
    NAVIGATION("Navigation"),
    SEARCH("Search"),
    ADAS("Adas"),
    NAVIGATION_HD("NavigationHD");

    private String str;

    TileDataDomain(String str) {
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
