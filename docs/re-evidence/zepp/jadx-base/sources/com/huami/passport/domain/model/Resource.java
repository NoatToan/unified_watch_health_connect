package com.huami.passport.domain.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public class Resource<T, E> {

    @Nullable
    public final T data;
    public final E error;

    @NonNull
    public final Status status;

    public Resource(@NonNull Status status, @Nullable T t, E e) {
        this.status = status;
        this.data = t;
        this.error = e;
    }

    public static <T, E> Resource error(E e, @Nullable T t) {
        return new Resource(Status.ERROR, t, e);
    }

    public static <T, E> Resource loading(@Nullable T t) {
        return new Resource(Status.LOADING, t, null);
    }

    public static <T, E> Resource success(@Nullable T t) {
        return new Resource(Status.SUCCESS, t, null);
    }

    public String toString() {
        return "Resource{status=" + this.status + ", errorCode='" + this.error + "', data=" + this.data + '}';
    }

    public static <T, E> Resource error(E e) {
        return new Resource(Status.ERROR, null, e);
    }
}
