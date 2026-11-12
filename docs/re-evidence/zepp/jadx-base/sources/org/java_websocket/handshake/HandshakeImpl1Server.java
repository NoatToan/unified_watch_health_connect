package org.java_websocket.handshake;

/* JADX INFO: loaded from: classes23.dex */
public class HandshakeImpl1Server extends HandshakedataImpl1 implements ServerHandshakeBuilder {
    private short c;
    private String d;

    @Override // org.java_websocket.handshake.ServerHandshake
    public short getHttpStatus() {
        return this.c;
    }

    @Override // org.java_websocket.handshake.ServerHandshake
    public String getHttpStatusMessage() {
        return this.d;
    }

    @Override // org.java_websocket.handshake.ServerHandshakeBuilder
    public void setHttpStatus(short s) {
        this.c = s;
    }

    @Override // org.java_websocket.handshake.ServerHandshakeBuilder
    public void setHttpStatusMessage(String str) {
        this.d = str;
    }
}
