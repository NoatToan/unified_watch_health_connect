package org.spongycastle.jce.exception;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class ExtIOException extends IOException {
    private Throwable cause;

    public ExtIOException(String str, Throwable th) {
        super(str);
        this.cause = th;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }
}
