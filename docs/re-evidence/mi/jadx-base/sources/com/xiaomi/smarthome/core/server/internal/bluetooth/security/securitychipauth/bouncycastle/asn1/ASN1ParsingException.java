package com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.bouncycastle.asn1;

/* JADX INFO: loaded from: classes10.dex */
public class ASN1ParsingException extends IllegalStateException {
    private Throwable cause;

    public ASN1ParsingException(String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }

    public ASN1ParsingException(String str, Throwable th) {
        super(str);
        this.cause = th;
    }
}
