package com.mapbox.common;

/* JADX INFO: loaded from: classes2.dex */
public enum ResourceLoadErrorType {
    ERRORED,
    UNSATISFIED,
    CANCELED,
    INVALID_ARGUMENT,
    INSUFFICIENT_STORAGE;

    private int getValue() {
        return ordinal();
    }
}
