package com.thanosfisherman.elvis;

import com.thanosfisherman.elvis.interfaces.Consumer;
import com.thanosfisherman.elvis.interfaces.Function;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
public final class Elvis<T> {

    @Nullable
    private final T a;

    private Elvis(@Nullable T t) {
        this.a = t;
    }

    public static <T> Elvis<T> empty() {
        return new Elvis<>();
    }

    public static <T> Elvis<T> of(T t) {
        return new Elvis<>(t);
    }

    @NotNull
    public static <T> Elvis<T> ofNonNull(@NotNull T t) {
        return new Elvis<>(Objects.requireNonNull(t, "SHOULD NOT BE NULL"));
    }

    @Nullable
    public T get() {
        return this.a;
    }

    public boolean getBoolean() {
        T t = this.a;
        if (t != null && (t instanceof Boolean)) {
            return ((Boolean) t).booleanValue();
        }
        return false;
    }

    public double getDouble() {
        T t = this.a;
        if (t != null && (t instanceof Double)) {
            return ((Double) t).doubleValue();
        }
        return 0.0d;
    }

    public int getInt() {
        T t = this.a;
        if (t != null && (t instanceof Integer)) {
            return ((Integer) t).intValue();
        }
        return 0;
    }

    public long getLong() {
        T t = this.a;
        if (t != null && (t instanceof Long)) {
            return ((Long) t).longValue();
        }
        return 0L;
    }

    public void ifPresent(@NotNull Consumer<? super T> consumer) {
        T t = this.a;
        if (t != null) {
            consumer.accept(t);
        }
    }

    public boolean isPresent() {
        return this.a != null;
    }

    public <S> Elvis<S> next(@NotNull Function<? super T, ? extends S> function) {
        T t = this.a;
        return new Elvis<>(t == null ? null : function.apply(t));
    }

    @NotNull
    public T orElse(@NotNull T t) {
        T t2 = this.a;
        return t2 == null ? t : t2;
    }

    private Elvis() {
        this.a = null;
    }
}
