package com.miui.tsmclient.common.net;

/* JADX INFO: loaded from: classes4.dex */
public interface RequestCallback<T> {
    default void onCanceled() {
    }

    void onFailed(ErrorInfo errorInfo);

    void onResponse(T t);
}
