package org.apache.commons.lang3.concurrent;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes23.dex */
public abstract class AtomicInitializer<T> implements ConcurrentInitializer<T> {
    private final AtomicReference<T> a = new AtomicReference<>();

    @Override // org.apache.commons.lang3.concurrent.ConcurrentInitializer
    public T get() throws ConcurrentException {
        T t = this.a.get();
        if (t != null) {
            return t;
        }
        T tInitialize = initialize();
        return !this.a.compareAndSet(null, tInitialize) ? this.a.get() : tInitialize;
    }

    public abstract T initialize() throws ConcurrentException;
}
