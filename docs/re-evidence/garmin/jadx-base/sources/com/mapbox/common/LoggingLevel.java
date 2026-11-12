package com.mapbox.common;

/* JADX INFO: loaded from: classes2.dex */
public enum LoggingLevel {
    DEBUG("Debug"),
    INFO("Info"),
    WARNING(com.google.common.net.HttpHeaders.WARNING),
    ERROR("Error");

    private String str;

    LoggingLevel(String str) {
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
