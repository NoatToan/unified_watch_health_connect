package com.mapbox.maps;

/* JADX INFO: loaded from: classes2.dex */
public enum StylePackErrorType {
    CANCELED("Canceled"),
    DOES_NOT_EXIST("DoesNotExist"),
    DISK_FULL("DiskFull"),
    OTHER("Other");

    private String str;

    StylePackErrorType(String str) {
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
