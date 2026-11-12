package com.unionpay.entity;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes18.dex */
public class UnionPayResource<T> {

    @Nullable
    public final String code;

    @Nullable
    public final T data;

    @Nullable
    public final String message;

    @NonNull
    public final UnionPayStatus status;

    public UnionPayResource(@NonNull UnionPayStatus unionPayStatus, @Nullable String str, @Nullable String str2, @Nullable T t) {
        this.status = unionPayStatus;
        this.code = str;
        this.data = t;
        this.message = str2;
    }

    private boolean a(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        return obj != null && obj.equals(obj2);
    }

    public static <T> UnionPayResource<T> error(String str, String str2, @Nullable T t) {
        return new UnionPayResource<>(UnionPayStatus.ERROR, str, str2, t);
    }

    public static <T> UnionPayResource<T> loading(@Nullable T t) {
        return new UnionPayResource<>(UnionPayStatus.LOADING, null, null, t);
    }

    public static <T> UnionPayResource<T> success(@Nullable T t) {
        return new UnionPayResource<>(UnionPayStatus.SUCCESS, null, null, t);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UnionPayResource unionPayResource = (UnionPayResource) obj;
        if (this.status == unionPayResource.status && a(this.code, unionPayResource.code) && a(this.message, unionPayResource.message)) {
            return a(this.data, unionPayResource.data);
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

    public boolean isSuccessful() {
        return this.status == UnionPayStatus.SUCCESS;
    }
}
