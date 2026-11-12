package com.huawei.health.userprofilemgr.model;

/* JADX INFO: loaded from: classes9.dex */
public interface RouteResultCallBack<T> {
    void onFailure(Throwable th);

    void onSuccess(T t);
}
