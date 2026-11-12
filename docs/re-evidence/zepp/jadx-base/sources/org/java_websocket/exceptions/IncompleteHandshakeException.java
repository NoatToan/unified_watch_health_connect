package org.java_websocket.exceptions;

/* JADX INFO: loaded from: classes23.dex */
public class IncompleteHandshakeException extends RuntimeException {
    private static final long serialVersionUID = 7906596804233893092L;
    private final int a;

    public IncompleteHandshakeException(int i) {
        this.a = i;
    }

    public int getPreferredSize() {
        return this.a;
    }

    public IncompleteHandshakeException() {
        this.a = 0;
    }
}
