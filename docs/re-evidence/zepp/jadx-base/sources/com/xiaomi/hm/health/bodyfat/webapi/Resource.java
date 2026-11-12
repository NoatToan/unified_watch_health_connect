package com.xiaomi.hm.health.bodyfat.webapi;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes19.dex */
public class Resource<T> {

    @Nullable
    public final T data;

    @Nullable
    public final String message;

    @NonNull
    public final Status status;

    public Resource(@NonNull Status status, @Nullable T t, @Nullable String str) {
        this.status = status;
        this.data = t;
        this.message = str;
    }

    public static <T> Resource<T> error(String str, @Nullable T t) {
        return new Resource<>(Status.ERROR, t, str);
    }

    public static <T> Resource<T> loading(@Nullable T t) {
        return new Resource<>(Status.LOADING, t, null);
    }

    public static <T> Resource<T> success(@Nullable T t) {
        return new Resource<>(Status.SUCCESS, t, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Resource resource = (Resource) obj;
        if (this.status != resource.status) {
            return false;
        }
        String str = this.message;
        if (str == null ? resource.message != null : !str.equals(resource.message)) {
            return false;
        }
        T t = this.data;
        T t2 = resource.data;
        if (t != null) {
            return t.equals(t2);
        }
        return t2 == null;
    }

    public int hashCode() {
        int iHashCode = this.status.hashCode() * 31;
        String str = this.message;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        T t = this.data;
        return iHashCode2 + (t != null ? t.hashCode() : 0);
    }

    public boolean isSuccess() {
        return this.status == Status.SUCCESS;
    }

    public String toString() {
        return "Resource{status=" + this.status + ", message='" + this.message + "', data=" + this.data + '}';
    }

    public static <T> Resource<T> loading() {
        return new Resource<>(Status.LOADING, null, null);
    }
}
