package com.huami.ad;

/* JADX INFO: loaded from: classes4.dex */
public interface AdLoadListener<T> {
    void onError(String str, T t);

    void onLoading();

    void onSuccess(T t);
}
