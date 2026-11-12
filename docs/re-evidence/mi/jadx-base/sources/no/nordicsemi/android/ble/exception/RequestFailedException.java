package no.nordicsemi.android.ble.exception;

import no.nordicsemi.android.ble.x;

/* JADX INFO: loaded from: classes3.dex */
public final class RequestFailedException extends Exception {
    private final x request;
    private final int status;

    public RequestFailedException(x xVar, int i) {
        super("Request failed with status " + i);
        this.request = xVar;
        this.status = i;
    }

    public x getRequest() {
        return this.request;
    }

    public int getStatus() {
        return this.status;
    }
}
