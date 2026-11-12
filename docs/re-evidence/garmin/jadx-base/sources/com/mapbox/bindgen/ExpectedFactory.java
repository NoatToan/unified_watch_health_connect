package com.mapbox.bindgen;

/* JADX INFO: loaded from: classes2.dex */
public final class ExpectedFactory {
    private ExpectedFactory() {
    }

    public static <E, V> Expected<E, V> createError(E e4) {
        return new Expected<>(e4, null);
    }

    public static <E> Expected<E, None> createNone() {
        return new Expected<>(null, None.getInstance());
    }

    public static <E, V> Expected<E, V> createValue(V v14) {
        return new Expected<>(null, v14);
    }
}
