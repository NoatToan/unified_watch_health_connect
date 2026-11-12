package com.mapbox.common;

/* JADX INFO: loaded from: classes2.dex */
public enum MemoryMonitorState {
    OK("Ok"),
    APP_RUNNING_IN_BACKGROUND("AppRunningInBackground"),
    MEMORY_THRESHOLD_REACHED("MemoryThresholdReached"),
    SYSTEM_MEMORY_WARNING_RECEIVED("SystemMemoryWarningReceived");

    private String str;

    MemoryMonitorState(String str) {
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
