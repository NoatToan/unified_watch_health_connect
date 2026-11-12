package com.mapbox.maps;

import com.google.common.net.HttpHeaders;

/* JADX INFO: loaded from: classes2.dex */
public enum RequestErrorType {
    SUCCESS("Success"),
    NOT_FOUND("NotFound"),
    SERVER(HttpHeaders.SERVER),
    CONNECTION(HttpHeaders.CONNECTION),
    RATE_LIMIT("RateLimit"),
    IN_OFFLINE_MODE("InOfflineMode"),
    OTHER("Other");

    private String str;

    RequestErrorType(String str) {
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
