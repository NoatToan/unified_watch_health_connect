package com.huami.wallet.accessdoor.helper;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public class Resource<T> {

    @Nullable
    public final String code;

    @Nullable
    public final T data;

    @Nullable
    public final String message;

    @Nullable
    public final String rawMessage;

    @NonNull
    public final Status status;

    public Resource(@NonNull Status status, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable T t) {
        this.status = status;
        this.code = str;
        this.data = t;
        this.message = str2;
        this.rawMessage = str3;
    }

    public static <T> Resource<T> error(String str, @Nullable T t) {
        return new Resource<>(Status.ERROR, null, str, null, t);
    }

    public static <T> Resource<T> loading(@Nullable T t) {
        return new Resource<>(Status.LOADING, null, null, null, t);
    }

    public static <T> Resource<T> success(@Nullable T t) {
        return new Resource<>(Status.SUCCESS, null, null, null, t);
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
        String str = this.code;
        if (str == null ? resource.code != null : !str.equals(resource.code)) {
            return false;
        }
        String str2 = this.message;
        if (str2 == null ? resource.message == null : str2.equals(resource.message)) {
            T t = this.data;
            T t2 = resource.data;
            if (t != null) {
                if (t.equals(t2)) {
                    return true;
                }
            } else if (t2 == null) {
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

    public String toString() {
        return "Resource{status=" + this.status + ", code='" + this.code + "', message='" + this.message + "', data=" + this.data + '}';
    }

    public static <T> Resource<T> error(String str, String str2, @Nullable T t) {
        return new Resource<>(Status.ERROR, str, str2, null, t);
    }

    public static <T> Resource<T> error(String str, String str2, String str3, @Nullable T t) {
        return new Resource<>(Status.ERROR, str, str2, str3, t);
    }
}
