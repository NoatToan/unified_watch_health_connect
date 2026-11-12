package com.google.firebase.components;

import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;

/* JADX INFO: loaded from: classes3.dex */
class k<T> implements Provider<T>, Deferred<T> {
    private static final Deferred.DeferredHandler<Object> c = new Deferred.DeferredHandler() { // from class: com.google.firebase.components.i
        @Override // com.google.firebase.inject.Deferred.DeferredHandler
        public final void handle(Provider provider) {
            k.e(provider);
        }
    };
    private static final Provider<Object> d = new Provider() { // from class: com.google.firebase.components.j
        @Override // com.google.firebase.inject.Provider
        public final Object get() {
            return k.f();
        }
    };

    @GuardedBy("this")
    private Deferred.DeferredHandler<T> a;
    private volatile Provider<T> b;

    private k(Deferred.DeferredHandler<T> deferredHandler, Provider<T> provider) {
        this.a = deferredHandler;
        this.b = provider;
    }

    public static <T> k<T> d() {
        return new k<>(c, d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void e(Provider provider) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object f() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void g(Deferred.DeferredHandler deferredHandler, Deferred.DeferredHandler deferredHandler2, Provider provider) {
        deferredHandler.handle(provider);
        deferredHandler2.handle(provider);
    }

    public static <T> k<T> h(Provider<T> provider) {
        return new k<>(null, provider);
    }

    @Override // com.google.firebase.inject.Provider
    public T get() {
        return this.b.get();
    }

    public void i(Provider<T> provider) {
        Deferred.DeferredHandler<T> deferredHandler;
        if (this.b != d) {
            throw new IllegalStateException("provide() can be called only once.");
        }
        synchronized (this) {
            deferredHandler = this.a;
            this.a = null;
            this.b = provider;
        }
        deferredHandler.handle(provider);
    }

    @Override // com.google.firebase.inject.Deferred
    public void whenAvailable(@NonNull final Deferred.DeferredHandler<T> deferredHandler) {
        Provider<T> provider;
        Provider<T> provider2 = this.b;
        Provider<Object> provider3 = d;
        if (provider2 != provider3) {
            deferredHandler.handle(provider2);
            return;
        }
        Provider<T> provider4 = null;
        synchronized (this) {
            provider = this.b;
            if (provider != provider3) {
                provider4 = provider;
            } else {
                final Deferred.DeferredHandler<T> deferredHandler2 = this.a;
                this.a = new Deferred.DeferredHandler() { // from class: com.google.firebase.components.h
                    @Override // com.google.firebase.inject.Deferred.DeferredHandler
                    public final void handle(Provider provider5) {
                        k.g(deferredHandler2, deferredHandler, provider5);
                    }
                };
            }
        }
        if (provider4 != null) {
            deferredHandler.handle(provider);
        }
    }
}
