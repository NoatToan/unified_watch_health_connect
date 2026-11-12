package com.xiaomi.android.ble.exception;

import com.xiaomi.android.ble.v;

/* JADX INFO: loaded from: classes7.dex */
public final class RequestFailedException extends Exception {
    private final v request;
    private final int status;

    public RequestFailedException(v vVar, int i) {
        super("Request failed with status " + i);
        this.request = vVar;
        this.status = i;
    }

    public v getRequest() {
        return this.request;
    }

    public int getStatus() {
        return this.status;
    }
}
