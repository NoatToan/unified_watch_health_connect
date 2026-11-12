package com.huawei.watchface.api;

/* JADX INFO: loaded from: classes20.dex */
public interface ResponseListener<T> {
    void onError();

    void onResponse(T t);
}
