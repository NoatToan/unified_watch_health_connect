package com.mapbox.maps;

/* JADX INFO: loaded from: classes2.dex */
public enum RequestPriorityType {
    REGULAR("Regular"),
    LOW("Low");

    private String str;

    RequestPriorityType(String str) {
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
