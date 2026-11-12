package com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.bouncycastle.util.encoders;

/* JADX INFO: loaded from: classes10.dex */
public class DecoderException extends IllegalStateException {
    private Throwable cause;

    public DecoderException(String str, Throwable th) {
        super(str);
        this.cause = th;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }
}
