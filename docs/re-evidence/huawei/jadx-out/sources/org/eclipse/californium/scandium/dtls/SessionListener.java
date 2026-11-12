package org.eclipse.californium.scandium.dtls;

import defpackage.aaak;
import defpackage.aaay;

/* JADX INFO: loaded from: classes20.dex */
public interface SessionListener {
    void contextEstablished(Handshaker handshaker, aaak aaakVar) throws aaay;

    void handshakeCompleted(Handshaker handshaker);

    void handshakeFailed(Handshaker handshaker, Throwable th);

    void handshakeFlightRetransmitted(Handshaker handshaker, int i);

    void handshakeStarted(Handshaker handshaker) throws aaay;
}
