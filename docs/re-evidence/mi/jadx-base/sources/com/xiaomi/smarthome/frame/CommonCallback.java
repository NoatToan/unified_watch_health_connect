package com.xiaomi.smarthome.frame;

/* JADX INFO: loaded from: classes2.dex */
public interface CommonCallback<T> {
    void onCache(T t);

    void onFail(int i, String str);

    void onSuccess(T t);
}
