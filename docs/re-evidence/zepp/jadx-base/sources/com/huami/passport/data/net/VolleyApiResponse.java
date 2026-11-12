package com.huami.passport.data.net;

import androidx.annotation.Nullable;
import com.huami.passport.data.entity.ErrorEntity;

/* JADX INFO: loaded from: classes12.dex */
public class VolleyApiResponse<T, E> implements ApiResponse<T, E> {
    private static final String TAG = "VolleyApiResponse";

    @Nullable
    public final T body;

    @Nullable
    public final E error;

    public VolleyApiResponse(T t, E e) {
        this.error = e;
        this.body = t;
    }

    public static <E> ApiResponse error(E e) {
        return new VolleyApiResponse(null, e);
    }

    public static <T> ApiResponse<T, ErrorEntity> success(T t) {
        return new VolleyApiResponse(t, null);
    }

    @Override // com.huami.passport.data.net.ApiResponse
    @Nullable
    public T getBody() {
        return this.body;
    }

    @Override // com.huami.passport.data.net.ApiResponse
    public E getError() {
        return this.error;
    }

    @Override // com.huami.passport.data.net.ApiResponse
    public boolean isSuccessful() {
        return this.body != null;
    }
}
