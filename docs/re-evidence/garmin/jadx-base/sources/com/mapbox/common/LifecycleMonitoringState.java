package com.mapbox.common;

/* JADX INFO: loaded from: classes2.dex */
public enum LifecycleMonitoringState {
    STOPPED("STOPPED"),
    STARTED("STARTED");

    private String str;

    LifecycleMonitoringState(String str) {
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
