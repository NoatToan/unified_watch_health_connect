package com.mapbox.common.location;

/* JADX INFO: loaded from: classes2.dex */
public enum PermissionStatus {
    DENIED("Denied"),
    GRANTED("Granted"),
    FOREGROUND("Foreground"),
    BACKGROUND("Background");

    private String str;

    PermissionStatus(String str) {
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
