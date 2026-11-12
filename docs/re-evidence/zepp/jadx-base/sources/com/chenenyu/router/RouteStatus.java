package com.chenenyu.router;

/* JADX INFO: loaded from: classes2.dex */
public enum RouteStatus {
    PROCESSING,
    SUCCEED,
    INTERCEPTED,
    NOT_FOUND,
    FAILED;

    public boolean isSuccessful() {
        return this == SUCCEED;
    }
}
