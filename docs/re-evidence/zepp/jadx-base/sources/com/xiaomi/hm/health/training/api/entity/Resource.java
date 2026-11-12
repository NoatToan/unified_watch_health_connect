package com.xiaomi.hm.health.training.api.entity;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.xiaomi.hm.health.training.api.function.Function;

/* JADX INFO: loaded from: classes21.dex */
public class Resource<T> {

    @NonNull
    private Status a;

    @Nullable
    private T b;

    @Nullable
    private String c;

    @Nullable
    private String d;

    private Resource(@NonNull Status status, @Nullable T t, @Nullable String str, @Nullable String str2) {
        this.a = status;
        this.b = t;
        this.c = str;
        this.d = str2;
    }

    public static <T> Resource<T> error(@Nullable String str, @Nullable String str2, @Nullable T t) {
        return new Resource<>(Status.ERROR, t, str, str2);
    }

    public static <T> Resource<T> loading(@Nullable T t) {
        return new Resource<>(Status.LOADING, t, null, null);
    }

    public static <T> Resource<T> success(@Nullable T t) {
        return new Resource<>(Status.SUCCESS, t, null, null);
    }

    @Nullable
    public String getCode() {
        return this.c;
    }

    @Nullable
    public T getData() {
        return this.b;
    }

    @Nullable
    public String getMessage() {
        return this.d;
    }

    @NonNull
    public Status getStatus() {
        return this.a;
    }

    public boolean isComplete() {
        Status status = this.a;
        return status == Status.SUCCESS || status == Status.ERROR;
    }

    public <R> Resource<R> map(@NonNull Function<T, R> function) {
        return new Resource<>(this.a, function.apply(this.b), this.c, this.d);
    }
}
