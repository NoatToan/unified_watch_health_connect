package org.apache.commons.lang3.concurrent;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public abstract class AtomicInitializer<T> implements ConcurrentInitializer<T> {
    private final AtomicReference<T> reference = new AtomicReference<>();

    @Override // org.apache.commons.lang3.concurrent.ConcurrentInitializer
    public T get() {
        T t7 = this.reference.get();
        if (t7 != null) {
            return t7;
        }
        T tInitialize = initialize();
        AtomicReference<T> atomicReference = this.reference;
        while (!atomicReference.compareAndSet(null, tInitialize)) {
            if (atomicReference.get() != null) {
                return this.reference.get();
            }
        }
        return tInitialize;
    }

    public abstract T initialize();
}
