package com.huawei.health.baseapi.pluginaudiodevice;

/* JADX INFO: loaded from: classes25.dex */
public interface ResultCallback<T> {
    void onFailure(int i, String str);

    void onSuccess(T t);
}
