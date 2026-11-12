package com.google.firebase.components;

import androidx.annotation.VisibleForTesting;
import com.google.firebase.inject.Provider;

/* JADX INFO: loaded from: classes3.dex */
public class Lazy<T> implements Provider<T> {
    private static final Object c = new Object();
    private volatile Object a;
    private volatile Provider<T> b;

    public Lazy(T t) {
        this.a = c;
        this.a = t;
    }

    @VisibleForTesting
    public boolean a() {
        return this.a != c;
    }

    @Override // com.google.firebase.inject.Provider
    public T get() {
        T t = (T) this.a;
        Object obj = c;
        if (t == obj) {
            synchronized (this) {
                t = (T) this.a;
                if (t == obj) {
                    t = this.b.get();
                    this.a = t;
                    this.b = null;
                }
            }
        }
        return t;
    }

    public Lazy(Provider<T> provider) {
        this.a = c;
        this.b = provider;
    }
}
