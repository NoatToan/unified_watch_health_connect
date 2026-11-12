package com.mapbox.common;

/* JADX INFO: loaded from: classes2.dex */
public enum TelemetryCollectionState {
    ENABLED("Enabled"),
    TURNSTILE_EVENTS_ONLY("TurnstileEventsOnly"),
    UNKNOWN("Unknown");

    private String str;

    TelemetryCollectionState(String str) {
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
