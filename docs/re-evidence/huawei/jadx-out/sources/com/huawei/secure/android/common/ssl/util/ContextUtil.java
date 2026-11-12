package com.huawei.secure.android.common.ssl.util;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public class ContextUtil {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Context f22902a;

    public static Context getInstance() {
        return f22902a;
    }

    public static void setContext(Context context) {
        if (context == null || f22902a != null) {
            return;
        }
        f22902a = context.getApplicationContext();
    }
}
