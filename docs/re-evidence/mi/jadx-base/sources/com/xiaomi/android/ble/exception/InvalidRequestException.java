package com.xiaomi.android.ble.exception;

import com.xiaomi.android.ble.v;

/* JADX INFO: loaded from: classes7.dex */
public final class InvalidRequestException extends Exception {
    private final v request;

    public InvalidRequestException(v vVar) {
        super("Invalid request");
        this.request = vVar;
    }

    public v getRequest() {
        return this.request;
    }
}
