package com.beaglebuddy.exception;

/* JADX INFO: loaded from: classes2.dex */
public class ParseException extends RuntimeException {
    private static final long serialVersionUID = -3213501781487092248L;
    public byte[] a;

    public ParseException(String str) {
        super(str);
        this.a = null;
    }

    public byte[] getData() {
        return this.a;
    }

    public ParseException(String str, byte[] bArr) {
        super(str);
        this.a = bArr;
    }
}
