package com.huawei.secure.android.common.util;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes42.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Handler f22951a = new Handler(Looper.getMainLooper());

    public static void a(Runnable runnable) {
        if (runnable == null) {
            return;
        }
        f22951a.post(runnable);
    }
}
