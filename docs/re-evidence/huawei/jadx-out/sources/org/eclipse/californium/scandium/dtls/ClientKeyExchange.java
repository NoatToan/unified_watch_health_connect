package org.eclipse.californium.scandium.dtls;

/* JADX INFO: loaded from: classes20.dex */
public abstract class ClientKeyExchange extends HandshakeMessage {
    @Override // org.eclipse.californium.scandium.dtls.HandshakeMessage
    public final HandshakeType getMessageType() {
        return HandshakeType.CLIENT_KEY_EXCHANGE;
    }
}
