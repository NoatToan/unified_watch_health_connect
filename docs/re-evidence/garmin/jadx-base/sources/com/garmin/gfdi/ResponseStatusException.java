package com.garmin.gfdi;

import fb1.c;
import p005kotlin.Metadata;
import rs2.y;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\n\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/garmin/gfdi/ResponseStatusException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Lrs2/y;", "status", "", "payload", "<init>", "(Lrs2/y;[B)V", "Lrs2/y;", "getStatus", "()Lrs2/y;", "[B", "getPayload", "()[B", "gfdi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ResponseStatusException extends Exception {
    private final byte[] payload;
    private final y status;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResponseStatusException(y yVar, byte[] bArr) {
        super(c.n("Request failed. Status = ", yVar.name()));
        yVar.getClass();
        bArr.getClass();
        this.status = yVar;
        this.payload = bArr;
    }

    public final byte[] getPayload() {
        return this.payload;
    }

    public final y getStatus() {
        return this.status;
    }
}
