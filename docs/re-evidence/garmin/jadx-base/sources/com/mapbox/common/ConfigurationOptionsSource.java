package com.mapbox.common;

/* JADX INFO: loaded from: classes2.dex */
public enum ConfigurationOptionsSource {
    LOCAL("Local"),
    SERVER(com.google.common.net.HttpHeaders.SERVER);

    private String str;

    ConfigurationOptionsSource(String str) {
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
