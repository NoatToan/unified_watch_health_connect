package com.huawei.haf.router;

import android.content.Context;
import android.net.Uri;
import com.huawei.haf.router.core.AppRouterHelper;

/* JADX INFO: loaded from: classes.dex */
public final class AppRouter {
    private AppRouter() {
    }

    public static Guidepost c(String str) {
        return AppRouterHelper.a(str);
    }

    public static Guidepost e(Uri uri) {
        return AppRouterHelper.b(uri);
    }

    public static <T> T b(Class<? extends T> cls) {
        return (T) AppRouterHelper.c((Context) null, (Class) cls, (String) null, (NaviConsumer) null, false);
    }

    public static <T> T e(String str, Class<? extends T> cls) {
        return (T) AppRouterHelper.c((Context) null, (Class) cls, str, (NaviConsumer) null, false);
    }

    public static <T> T e(String str, Class<? extends T> cls, Context context, NaviConsumer naviConsumer, boolean z) {
        return (T) AppRouterHelper.c(context, cls, str, naviConsumer, z);
    }

    public static boolean e(Context context, String str) {
        return AppRouterHelper.a(context, str, true);
    }
}
