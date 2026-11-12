package dagger.internal;

import dagger.Lazy;

/* JADX INFO: loaded from: classes22.dex */
public final class InstanceFactory<T> implements Factory<T>, Lazy<T> {
    private static final InstanceFactory<Object> b = new InstanceFactory<>(null);
    private final T a;

    private InstanceFactory(T t) {
        this.a = t;
    }

    private static <T> InstanceFactory<T> a() {
        return (InstanceFactory<T>) b;
    }

    public static <T> Factory<T> create(T t) {
        return new InstanceFactory(Preconditions.checkNotNull(t, "instance cannot be null"));
    }

    public static <T> Factory<T> createNullable(T t) {
        return t == null ? a() : new InstanceFactory(t);
    }

    @Override // javax.inject.Provider
    public T get() {
        return this.a;
    }
}
