package org.java_websocket.exceptions;

/* JADX INFO: loaded from: classes23.dex */
public class InvalidDataException extends Exception {
    private static final long serialVersionUID = 3731842424390998726L;
    private final int a;

    public InvalidDataException(int i) {
        this.a = i;
    }

    public int getCloseCode() {
        return this.a;
    }

    public InvalidDataException(int i, String str) {
        super(str);
        this.a = i;
    }

    public InvalidDataException(int i, Throwable th) {
        super(th);
        this.a = i;
    }

    public InvalidDataException(int i, String str, Throwable th) {
        super(str, th);
        this.a = i;
    }
}
