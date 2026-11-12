package com.mapbox.maps;

import com.google.firebase.perf.metrics.resource.ResourceType;

/* JADX INFO: loaded from: classes2.dex */
public enum ResponseSourceType {
    NETWORK(ResourceType.NETWORK),
    CACHE("Cache"),
    TILE_STORE("TileStore"),
    LOCAL_FILE("LocalFile");

    private String str;

    ResponseSourceType(String str) {
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
