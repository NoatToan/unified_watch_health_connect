package com.xiaomi.common;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes7.dex */
public final class Optional<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Optional<?> f11174b = new Optional<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f11175a;

    public Optional() {
        this.f11175a = null;
    }

    public static <T> Optional<T> a() {
        return (Optional<T>) f11174b;
    }

    public static <T> Optional<T> d(T t) {
        return new Optional<>(t);
    }

    public static <T> Optional<T> e(T t) {
        return t == null ? a() : d(t);
    }

    public T b() {
        T t = this.f11175a;
        if (t != null) {
            return t;
        }
        throw new NoSuchElementException("No value present");
    }

    public boolean c() {
        return this.f11175a != null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Optional)) {
            return false;
        }
        T t = this.f11175a;
        T t2 = ((Optional) obj).f11175a;
        if (t != t2) {
            return t != null && t.equals(t2);
        }
        return true;
    }

    public int hashCode() {
        T t = this.f11175a;
        if (t == null) {
            return 0;
        }
        return t.hashCode();
    }

    public String toString() {
        T t = this.f11175a;
        return t != null ? String.format("Optional[%s]", t) : "Optional.empty";
    }

    public Optional(T t) {
        t.getClass();
        this.f11175a = t;
    }
}
