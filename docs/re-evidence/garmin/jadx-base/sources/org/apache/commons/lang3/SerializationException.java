package org.apache.commons.lang3;

/* JADX INFO: loaded from: classes3.dex */
public class SerializationException extends RuntimeException {
    private static final long serialVersionUID = 4029025366392702726L;

    public SerializationException() {
    }

    public SerializationException(String str) {
        super(str);
    }

    public SerializationException(Throwable th3) {
        super(th3);
    }

    public SerializationException(String str, Throwable th3) {
        super(str, th3);
    }
}
