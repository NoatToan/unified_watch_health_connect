package com.xiaomi.hm.health.training.utils;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes22.dex */
public class WebBrowserUtils {
    private static final String a = "com.huami.web.container.WebActivity";
    private static final String b = "com.xiaomi.hm.health.action.WEB_URL";
    private static final String c = "Title";

    public static void jump2WebBrowser(Context context, String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        ComponentName componentName = new ComponentName(context.getPackageName(), a);
        Intent intent = new Intent();
        intent.setComponent(componentName);
        intent.putExtra(b, str);
        intent.putExtra(c, str2);
        context.startActivity(intent);
    }
}
