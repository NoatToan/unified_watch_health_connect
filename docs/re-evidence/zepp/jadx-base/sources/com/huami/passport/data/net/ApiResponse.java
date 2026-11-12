package com.huami.passport.data.net;

/* JADX INFO: loaded from: classes12.dex */
public interface ApiResponse<T, E> {
    T getBody();

    E getError();

    boolean isSuccessful();
}
