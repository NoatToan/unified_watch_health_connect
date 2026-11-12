package org.apache.commons.lang3.concurrent;

import defpackage.ib4;

/* JADX INFO: loaded from: classes3.dex */
public class ConcurrentException extends Exception {
    private static final long serialVersionUID = 6622707671812226130L;

    public ConcurrentException() {
    }

    public ConcurrentException(Throwable th) {
        super(ib4.a(th));
    }

    public ConcurrentException(String str, Throwable th) {
        super(str, ib4.a(th));
    }
}
