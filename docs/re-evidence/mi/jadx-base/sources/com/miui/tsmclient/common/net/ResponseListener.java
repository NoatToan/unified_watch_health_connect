package com.miui.tsmclient.common.net;

/* JADX INFO: loaded from: classes4.dex */
public interface ResponseListener<T> {
    void onFailed(int i, String str, T t);

    void onSuccess(T t);
}
