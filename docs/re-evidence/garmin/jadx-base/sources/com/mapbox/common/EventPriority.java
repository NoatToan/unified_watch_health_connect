package com.mapbox.common;

/* JADX INFO: loaded from: classes2.dex */
public enum EventPriority {
    DEFERRED,
    QUEUED,
    IMMEDIATE;

    private int getValue() {
        return ordinal();
    }
}
