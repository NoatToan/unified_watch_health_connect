package com.google.firebase.sessions.dagger.internal;

import n13.a;

/* JADX INFO: loaded from: classes2.dex */
public final class Providers {
    private Providers() {
    }

    public static <T> Provider<T> asDaggerProvider(final a<T> aVar) {
        Preconditions.checkNotNull(aVar);
        return new Provider<T>() { // from class: com.google.firebase.sessions.dagger.internal.Providers.1
            @Override // com.google.firebase.sessions.dagger.internal.Provider, n13.a
            public T get() {
                return (T) aVar.get();
            }
        };
    }
}
