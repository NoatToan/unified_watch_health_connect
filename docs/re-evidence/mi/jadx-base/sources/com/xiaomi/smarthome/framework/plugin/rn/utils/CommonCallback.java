package com.xiaomi.smarthome.framework.plugin.rn.utils;

/* JADX INFO: loaded from: classes2.dex */
public interface CommonCallback<T> {
    void onFailed(int i, String str);

    void onSuccess(T t);
}
