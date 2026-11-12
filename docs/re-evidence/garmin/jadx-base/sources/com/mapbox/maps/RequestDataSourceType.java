package com.mapbox.maps;

import com.google.firebase.perf.metrics.resource.ResourceType;

/* JADX INFO: loaded from: classes2.dex */
public enum RequestDataSourceType {
    ASSET("Asset"),
    DATABASE("Database"),
    FILE_SYSTEM("FileSystem"),
    NETWORK(ResourceType.NETWORK),
    RESOURCE_LOADER("ResourceLoader");

    private String str;

    RequestDataSourceType(String str) {
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
