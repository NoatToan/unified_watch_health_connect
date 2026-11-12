package com.xiaomi.smarthome.framework.api;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AsyncResponseCallback<T> {
    public abstract void onFailure(int i);

    public abstract void onFailure(int i, Object obj);

    public abstract void onSuccess(T t);
}
