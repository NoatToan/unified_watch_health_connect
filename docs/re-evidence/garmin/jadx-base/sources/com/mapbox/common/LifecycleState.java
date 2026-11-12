package com.mapbox.common;

/* JADX INFO: loaded from: classes2.dex */
public enum LifecycleState {
    UNKNOWN("Unknown"),
    MOVING_FOREGROUND("MovingForeground"),
    FOREGROUND("Foreground"),
    MOVING_BACKGROUND("MovingBackground"),
    BACKGROUND("Background"),
    INACTIVE("Inactive");

    private String str;

    LifecycleState(String str) {
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
