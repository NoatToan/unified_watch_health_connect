package com.mapbox.common;

/* JADX INFO: loaded from: classes2.dex */
public enum ResourceLoadStatus {
    AVAILABLE,
    NOT_FOUND,
    UNAUTHORIZED;

    private int getValue() {
        return ordinal();
    }
}
