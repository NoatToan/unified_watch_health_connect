package com.huawei.hwcloudjs.e.a;

import android.content.Context;

/* JADX INFO: loaded from: classes37.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f17104a = "CacheRequestManager";

    public static void a(String[] strArr, int i, Context context) {
        com.huawei.hwcloudjs.f.d.c(f17104a, "enter into preload", true);
        new Thread(new d(strArr, context, i)).start();
    }
}
