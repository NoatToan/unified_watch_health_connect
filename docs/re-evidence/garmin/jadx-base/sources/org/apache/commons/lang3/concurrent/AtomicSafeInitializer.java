package org.apache.commons.lang3.concurrent;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public abstract class AtomicSafeInitializer<T> implements ConcurrentInitializer<T> {
    private final AtomicReference<AtomicSafeInitializer<T>> factory = new AtomicReference<>();
    private final AtomicReference<T> reference = new AtomicReference<>();

    @Override // org.apache.commons.lang3.concurrent.ConcurrentInitializer
    public final T get() {
        while (true) {
            T t7 = this.reference.get();
            if (t7 != null) {
                return t7;
            }
            AtomicReference<AtomicSafeInitializer<T>> atomicReference = this.factory;
            do {
                if (atomicReference.compareAndSet(null, this)) {
                    this.reference.set(initialize());
                    break;
                }
            } while (atomicReference.get() == null);
        }
    }

    public abstract T initialize();
}
