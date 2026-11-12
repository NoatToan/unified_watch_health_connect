package com.mapbox.maps;

import com.google.firebase.perf.metrics.resource.ResourceType;

/* JADX INFO: loaded from: classes2.dex */
public enum RequestLoadingMethodType {
    NETWORK(ResourceType.NETWORK),
    CACHE("Cache");

    private String str;

    RequestLoadingMethodType(String str) {
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
