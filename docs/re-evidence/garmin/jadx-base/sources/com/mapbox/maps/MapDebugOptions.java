package com.mapbox.maps;

/* JADX INFO: loaded from: classes2.dex */
public enum MapDebugOptions {
    TILE_BORDERS,
    PARSE_STATUS,
    TIMESTAMPS,
    COLLISION,
    OVERDRAW,
    STENCIL_CLIP,
    DEPTH_BUFFER,
    MODEL_BOUNDS,
    TERRAIN_WIREFRAME,
    LAYERS2_DWIREFRAME,
    LAYERS3_DWIREFRAME,
    LIGHT;

    private int getValue() {
        return ordinal();
    }
}
