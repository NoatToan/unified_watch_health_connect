package com.mapbox.common;

/* JADX INFO: loaded from: classes2.dex */
public enum HttpRequestErrorType {
    CONNECTION_ERROR("ConnectionError"),
    SSLERROR("SSLError"),
    REQUEST_CANCELLED("RequestCancelled"),
    REQUEST_TIMED_OUT("RequestTimedOut"),
    RANGE_ERROR("RangeError"),
    OTHER_ERROR("OtherError");

    private String str;

    HttpRequestErrorType(String str) {
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
