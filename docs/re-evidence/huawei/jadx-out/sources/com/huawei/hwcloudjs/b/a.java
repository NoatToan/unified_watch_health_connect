package com.huawei.hwcloudjs.b;

import android.content.Context;

/* JADX INFO: loaded from: classes10.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Context f17037a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f17038b = true;

    public static boolean b() {
        return f17038b;
    }

    public static void a(boolean z) {
        f17038b = z;
    }

    public static void a(Context context) {
        f17037a = context.getApplicationContext();
    }

    public static Context a() {
        return f17037a;
    }
}
