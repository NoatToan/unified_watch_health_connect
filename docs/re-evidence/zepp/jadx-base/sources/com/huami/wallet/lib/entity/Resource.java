package com.huami.wallet.lib.entity;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.huami.wallet.lib.util.Function;

/* JADX INFO: loaded from: classes13.dex */
public class Resource<T> {

    @Nullable
    public final String code;

    @Nullable
    public final T data;

    @Nullable
    public String message;

    @NonNull
    public final Status status;

    public Resource(@NonNull Status status, @Nullable String str, @Nullable String str2, @Nullable T t) {
        this.status = status;
        this.code = str;
        this.data = t;
        this.message = str2;
    }

    public static <T> Resource<T> error(String str, @Nullable T t) {
        return new Resource<>(Status.ERROR, null, str, t);
    }

    public static <T> Resource<T> loading(@Nullable T t) {
        return new Resource<>(Status.LOADING, null, null, t);
    }

    public static <T> Resource<T> success(@Nullable T t) {
        return new Resource<>(Status.SUCCESS, null, null, t);
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Resource resource = (Resource) obj;
        if (this.status == resource.status && ((str = this.code) == null ? resource.code == null : str.equals(resource.code)) && ((str2 = this.message) == null ? resource.message == null : str2.equals(resource.message))) {
            T t = this.data;
            if (t != null) {
                if (t.equals(resource.data)) {
                    return true;
                }
            } else if (resource.data == null) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = this.status.hashCode() * 31;
        String str = this.code;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.message;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        T t = this.data;
        return iHashCode3 + (t != null ? t.hashCode() : 0);
    }

    public boolean isCompleted() {
        Status status = this.status;
        return status == Status.SUCCESS || status == Status.ERROR;
    }

    public boolean isSuccessful() {
        return this.status == Status.SUCCESS;
    }

    public <R> Resource<R> map(@Nullable Function<T, R> function) {
        return new Resource<>(this.status, this.code, this.message, function != null ? function.apply(this.data) : null);
    }

    public String toString() {
        return "Resource{status=" + this.status + ", code='" + this.code + "', message='" + this.message + "', data=" + this.data + '}';
    }

    public static <T> Resource<T> error(String str, String str2, @Nullable T t) {
        return new Resource<>(Status.ERROR, str, str2, t);
    }
}
