package com.mapbox.common;

/* JADX INFO: loaded from: classes2.dex */
public enum Platform {
    LINUX("Linux"),
    IOS("IOS"),
    ANDROID("Android"),
    MAC_OS("MacOS");

    private String str;

    Platform(String str) {
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
