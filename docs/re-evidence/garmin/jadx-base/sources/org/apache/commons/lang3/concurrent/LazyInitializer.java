package org.apache.commons.lang3.concurrent;

/* JADX INFO: loaded from: classes3.dex */
public abstract class LazyInitializer<T> implements ConcurrentInitializer<T> {
    private static final Object NO_INIT = new Object();
    private volatile T object = (T) NO_INIT;

    @Override // org.apache.commons.lang3.concurrent.ConcurrentInitializer
    public T get() {
        T tInitialize;
        T t7 = this.object;
        Object obj = NO_INIT;
        if (t7 != obj) {
            return t7;
        }
        synchronized (this) {
            try {
                tInitialize = this.object;
                if (tInitialize == obj) {
                    tInitialize = initialize();
                    this.object = tInitialize;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return tInitialize;
    }

    public abstract T initialize();
}
