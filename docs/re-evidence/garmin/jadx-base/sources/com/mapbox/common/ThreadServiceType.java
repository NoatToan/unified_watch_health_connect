package com.mapbox.common;

/* JADX INFO: loaded from: classes2.dex */
public enum ThreadServiceType {
    INTERACTIVE("Interactive"),
    IMPORTANT("Important"),
    DEFAULT("Default"),
    UTILITY("Utility"),
    BACKGROUND("Background"),
    UNSPECIFIED("Unspecified");

    private String str;

    ThreadServiceType(String str) {
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
