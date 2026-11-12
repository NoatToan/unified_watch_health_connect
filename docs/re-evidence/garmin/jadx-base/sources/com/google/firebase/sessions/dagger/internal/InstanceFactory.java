package com.google.firebase.sessions.dagger.internal;

import com.google.firebase.sessions.dagger.Lazy;

/* JADX INFO: loaded from: classes2.dex */
public final class InstanceFactory<T> implements Factory<T>, Lazy<T> {
    private static final InstanceFactory<Object> NULL_INSTANCE_FACTORY = new InstanceFactory<>(null);
    private final T instance;

    private InstanceFactory(T t7) {
        this.instance = t7;
    }

    public static <T> Factory<T> create(T t7) {
        return new InstanceFactory(Preconditions.checkNotNull(t7, "instance cannot be null"));
    }

    public static <T> Factory<T> createNullable(T t7) {
        return t7 == null ? nullInstanceFactory() : new InstanceFactory(t7);
    }

    private static <T> InstanceFactory<T> nullInstanceFactory() {
        return (InstanceFactory<T>) NULL_INSTANCE_FACTORY;
    }

    @Override // com.google.firebase.sessions.dagger.internal.Factory, com.google.firebase.sessions.dagger.internal.Provider, n13.a
    public T get() {
        return this.instance;
    }
}
