package com.huawei.watchface;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes20.dex */
public abstract class p4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Handler f30543a = new Handler(Looper.getMainLooper());

    public static void a(Runnable runnable) {
        if (runnable == null) {
            return;
        }
        f30543a.post(runnable);
    }
}
