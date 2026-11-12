package io.reactivex.internal.util;

import defpackage.jf8;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class AtomicThrowable extends AtomicReference<Throwable> {
    private static final long serialVersionUID = 3949248817947090603L;

    public boolean addThrowable(Throwable th) {
        return jf8.a(this, th);
    }

    public boolean isTerminated() {
        return get() == jf8.f22731a;
    }

    public Throwable terminate() {
        return jf8.b(this);
    }
}
