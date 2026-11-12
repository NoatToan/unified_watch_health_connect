package no.nordicsemi.android.ble.exception;

import no.nordicsemi.android.ble.x;

/* JADX INFO: loaded from: classes3.dex */
public final class InvalidRequestException extends Exception {
    private final x request;

    public InvalidRequestException(x xVar) {
        super("Invalid request");
        this.request = xVar;
    }

    public x getRequest() {
        return this.request;
    }
}
