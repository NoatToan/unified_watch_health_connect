package org.java_websocket.exceptions;

/* JADX INFO: loaded from: classes23.dex */
public class IncompleteException extends Exception {
    private static final long serialVersionUID = 7330519489840500997L;
    private final int a;

    public IncompleteException(int i) {
        this.a = i;
    }

    public int getPreferredSize() {
        return this.a;
    }
}
