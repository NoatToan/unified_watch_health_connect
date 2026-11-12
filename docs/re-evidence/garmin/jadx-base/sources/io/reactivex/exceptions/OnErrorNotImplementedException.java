package io.reactivex.exceptions;

import am.j;

/* JADX INFO: loaded from: classes3.dex */
public final class OnErrorNotImplementedException extends RuntimeException {
    private static final long serialVersionUID = -6298857009889503852L;

    public OnErrorNotImplementedException(String str, Throwable th3) {
        super(str, th3 == null ? new NullPointerException() : th3);
    }

    public OnErrorNotImplementedException(Throwable th3) {
        this(j.p("The exception was not handled due to missing onError handler in the subscribe() method call. Further reading: https://github.com/ReactiveX/RxJava/wiki/Error-Handling | ", th3), th3);
    }
}
