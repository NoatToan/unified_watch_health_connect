package org.apache.commons.lang3.concurrent;

/* JADX INFO: loaded from: classes3.dex */
public class ConcurrentException extends Exception {
    private static final long serialVersionUID = 6622707671812226130L;

    public ConcurrentException(Throwable th3) {
        super(ConcurrentUtils.checkedException(th3));
    }

    public ConcurrentException() {
    }

    public ConcurrentException(String str, Throwable th3) {
        super(str, ConcurrentUtils.checkedException(th3));
    }
}
