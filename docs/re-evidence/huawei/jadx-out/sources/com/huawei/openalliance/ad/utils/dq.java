package com.huawei.openalliance.ad.utils;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes12.dex */
public abstract class dq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected static final ao f20650a = new ao(new Handler(Looper.getMainLooper()));

    public static void a(String str) {
        f20650a.a(str);
    }

    public static void a(Runnable runnable, String str, long j) {
        f20650a.a(runnable, str, j);
    }

    public static void a(Runnable runnable, long j) {
        f20650a.a(runnable, null, j);
    }

    public static void a(Runnable runnable) {
        f20650a.a(runnable);
    }
}
