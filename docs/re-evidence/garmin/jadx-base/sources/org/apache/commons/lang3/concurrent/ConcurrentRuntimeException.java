package org.apache.commons.lang3.concurrent;

/* JADX INFO: loaded from: classes3.dex */
public class ConcurrentRuntimeException extends RuntimeException {
    private static final long serialVersionUID = -6582182735562919670L;

    public ConcurrentRuntimeException(Throwable th3) {
        super(ConcurrentUtils.checkedException(th3));
    }

    public ConcurrentRuntimeException() {
    }

    public ConcurrentRuntimeException(String str, Throwable th3) {
        super(str, ConcurrentUtils.checkedException(th3));
    }
}
