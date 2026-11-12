package com.huawei.picture.security.base.activity;

/* JADX INFO: loaded from: classes41.dex */
public interface ActivityProtectHandler {
    boolean customInterceptProcessing(Thread thread, Throwable th, boolean z);

    void handleInterceptedCrash(Throwable th, boolean z);
}
