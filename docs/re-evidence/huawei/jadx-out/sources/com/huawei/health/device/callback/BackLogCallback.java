package com.huawei.health.device.callback;

/* JADX INFO: loaded from: classes7.dex */
public interface BackLogCallback<T> {
    void onFailure(int i, String str);

    void onSuccess(T t);
}
