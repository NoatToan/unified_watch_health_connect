package org.java_websocket.exceptions;

import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes23.dex */
public class InvalidEncodingException extends RuntimeException {
    private final UnsupportedEncodingException a;

    public InvalidEncodingException(UnsupportedEncodingException unsupportedEncodingException) {
        if (unsupportedEncodingException == null) {
            throw new IllegalArgumentException();
        }
        this.a = unsupportedEncodingException;
    }

    public UnsupportedEncodingException getEncodingException() {
        return this.a;
    }
}
