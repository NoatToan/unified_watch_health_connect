package com.mapbox.maps;

/* JADX INFO: loaded from: classes2.dex */
public enum TracingBackendType {
    NOOP("Noop"),
    PLATFORM("Platform"),
    LOGGER("Logger");

    private String str;

    TracingBackendType(String str) {
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
