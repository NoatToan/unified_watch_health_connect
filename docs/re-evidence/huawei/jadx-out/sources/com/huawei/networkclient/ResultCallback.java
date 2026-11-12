package com.huawei.networkclient;

/* JADX INFO: loaded from: classes3.dex */
public interface ResultCallback<T> {
    void onFailure(Throwable th);

    void onSuccess(T t);
}
