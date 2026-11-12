package com.mapbox.common;

/* JADX INFO: loaded from: classes2.dex */
public enum SchedulerType {
    PARALLEL,
    SEQUENTIAL;

    private int getValue() {
        return ordinal();
    }
}
