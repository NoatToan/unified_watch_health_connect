package com.google.android.datatransport.runtime.dagger.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes2.dex */
public final class DelegateFactory<T> implements Factory<T> {
    private Provider<T> a;

    public static <T> void setDelegate(Provider<T> provider, Provider<T> provider2) {
        Preconditions.checkNotNull(provider2);
        DelegateFactory delegateFactory = (DelegateFactory) provider;
        if (delegateFactory.a != null) {
            throw new IllegalStateException();
        }
        delegateFactory.a = provider2;
    }

    public Provider<T> a() {
        return (Provider) Preconditions.checkNotNull(this.a);
    }

    @Override // javax.inject.Provider
    public T get() {
        Provider<T> provider = this.a;
        if (provider != null) {
            return provider.get();
        }
        throw new IllegalStateException();
    }

    @Deprecated
    public void setDelegatedProvider(Provider<T> provider) {
        setDelegate(this, provider);
    }
}
