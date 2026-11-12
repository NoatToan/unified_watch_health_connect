package com.google.firebase.perf.util;

import j20.x;
import n23.j;

/* JADX INFO: loaded from: classes2.dex */
public final class Optional<T> {
    private final T value;

    private Optional(T t7) {
        if (t7 != null) {
            this.value = t7;
        } else {
            x.l("value for optional is empty.");
            throw null;
        }
    }

    public static <T> Optional<T> absent() {
        return new Optional<>();
    }

    public static <T> Optional<T> fromNullable(T t7) {
        return t7 == null ? absent() : of(t7);
    }

    public static <T> Optional<T> of(T t7) {
        return new Optional<>(t7);
    }

    public T get() {
        T t7 = this.value;
        if (t7 != null) {
            return t7;
        }
        j.s("No value present");
        return null;
    }

    public boolean isAvailable() {
        return this.value != null;
    }

    private Optional() {
        this.value = null;
    }
}
