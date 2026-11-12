package com.mapbox.maps;

/* JADX INFO: loaded from: classes2.dex */
public enum GlyphsRasterizationMode {
    NO_GLYPHS_RASTERIZED_LOCALLY,
    IDEOGRAPHS_RASTERIZED_LOCALLY,
    ALL_GLYPHS_RASTERIZED_LOCALLY;

    private int getValue() {
        return ordinal();
    }
}
