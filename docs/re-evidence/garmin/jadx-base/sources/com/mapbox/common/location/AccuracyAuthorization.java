package com.mapbox.common.location;

/* JADX INFO: loaded from: classes2.dex */
public enum AccuracyAuthorization {
    NONE("None"),
    EXACT("Exact"),
    INEXACT("Inexact");

    private String str;

    AccuracyAuthorization(String str) {
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
