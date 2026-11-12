package com.google.gson;

/* JADX INFO: loaded from: classes2.dex */
public class JsonParseException extends RuntimeException {
    static final long serialVersionUID = -4086729973971783390L;

    public JsonParseException(String str) {
        super(str);
    }

    public JsonParseException(String str, Throwable th3) {
        super(str, th3);
    }

    public JsonParseException(Throwable th3) {
        super(th3);
    }
}
