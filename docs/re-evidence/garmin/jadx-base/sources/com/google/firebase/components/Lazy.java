package com.google.firebase.components;

import com.google.firebase.inject.Provider;

/* JADX INFO: loaded from: classes2.dex */
public class Lazy<T> implements Provider<T> {
    private static final Object UNINITIALIZED = new Object();
    private volatile Object instance;
    private volatile Provider<T> provider;

    public Lazy(T t7) {
        this.instance = UNINITIALIZED;
        this.instance = t7;
    }

    @Override // com.google.firebase.inject.Provider
    public T get() {
        T t7;
        T t14 = (T) this.instance;
        Object obj = UNINITIALIZED;
        if (t14 != obj) {
            return t14;
        }
        synchronized (this) {
            try {
                t7 = (T) this.instance;
                if (t7 == obj) {
                    t7 = this.provider.get();
                    this.instance = t7;
                    this.provider = null;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return t7;
    }

    public boolean isInitialized() {
        return this.instance != UNINITIALIZED;
    }

    public Lazy(Provider<T> provider) {
        this.instance = UNINITIALIZED;
        this.provider = provider;
    }
}
