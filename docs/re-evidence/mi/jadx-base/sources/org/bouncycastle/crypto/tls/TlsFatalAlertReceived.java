package org.bouncycastle.crypto.tls;

import defpackage.s41;

/* JADX INFO: loaded from: classes3.dex */
public class TlsFatalAlertReceived extends TlsException {
    protected short alertDescription;

    public TlsFatalAlertReceived(short s) {
        super(s41.b(s), null);
        this.alertDescription = s;
    }

    public short getAlertDescription() {
        return this.alertDescription;
    }
}
