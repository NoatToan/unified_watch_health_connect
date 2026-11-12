package org.bouncycastle.crypto.tls;

import defpackage.s41;

/* JADX INFO: loaded from: classes3.dex */
public class TlsFatalAlert extends TlsException {
    protected short alertDescription;

    public TlsFatalAlert(short s) {
        this(s, null);
    }

    public short getAlertDescription() {
        return this.alertDescription;
    }

    public TlsFatalAlert(short s, Throwable th) {
        super(s41.b(s), th);
        this.alertDescription = s;
    }
}
