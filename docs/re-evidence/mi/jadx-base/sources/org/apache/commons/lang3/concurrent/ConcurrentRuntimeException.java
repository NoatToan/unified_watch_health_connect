package org.apache.commons.lang3.concurrent;

import defpackage.ib4;

/* JADX INFO: loaded from: classes3.dex */
public class ConcurrentRuntimeException extends RuntimeException {
    private static final long serialVersionUID = -6582182735562919670L;

    public ConcurrentRuntimeException() {
    }

    public ConcurrentRuntimeException(Throwable th) {
        super(ib4.a(th));
    }

    public ConcurrentRuntimeException(String str, Throwable th) {
        super(str, ib4.a(th));
    }
}
