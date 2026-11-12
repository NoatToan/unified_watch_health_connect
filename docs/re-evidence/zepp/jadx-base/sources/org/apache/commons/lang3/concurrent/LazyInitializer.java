package org.apache.commons.lang3.concurrent;

/* JADX INFO: loaded from: classes23.dex */
public abstract class LazyInitializer<T> implements ConcurrentInitializer<T> {
    private static final Object b = new Object();
    private volatile T a = (T) b;

    @Override // org.apache.commons.lang3.concurrent.ConcurrentInitializer
    public T get() throws ConcurrentException {
        T tInitialize = this.a;
        Object obj = b;
        if (tInitialize == obj) {
            synchronized (this) {
                tInitialize = this.a;
                if (tInitialize == obj) {
                    tInitialize = initialize();
                    this.a = tInitialize;
                }
            }
        }
        return tInitialize;
    }

    public abstract T initialize() throws ConcurrentException;
}
