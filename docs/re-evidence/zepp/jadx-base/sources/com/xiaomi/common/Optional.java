package com.xiaomi.common;

import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: loaded from: classes18.dex */
public final class Optional<T> {
    private static final Optional<?> b = new Optional<>();
    private final T a;

    private Optional() {
        this.a = null;
    }

    private Optional(T t) {
        Objects.requireNonNull(t);
        this.a = t;
    }

    public static <T> Optional<T> empty() {
        return (Optional<T>) b;
    }

    public static <T> Optional<T> of(T t) {
        return new Optional<>(t);
    }

    public static <T> Optional<T> ofNullable(T t) {
        return t == null ? empty() : of(t);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Optional)) {
            return false;
        }
        T t = this.a;
        T t2 = ((Optional) obj).a;
        if (t != t2) {
            return t != null && t.equals(t2);
        }
        return true;
    }

    public T get() {
        T t = this.a;
        if (t != null) {
            return t;
        }
        throw new NoSuchElementException("No value present");
    }

    public int hashCode() {
        T t = this.a;
        if (t == null) {
            return 0;
        }
        return t.hashCode();
    }

    public boolean isPresent() {
        return this.a != null;
    }

    public String toString() {
        T t = this.a;
        return t != null ? String.format("Optional[%s]", t) : "Optional.empty";
    }
}
