package com.huawei.updatesdk.service.util;

import android.content.Context;
import android.content.res.Resources;

/* JADX INFO: loaded from: classes20.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f30015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Resources f30016b;

    public static int c(Context context, String str) {
        return a(context, str, "string");
    }

    public static int b(Context context, String str) {
        return a(context, str, "layout");
    }

    private static String a(Context context) {
        if (f30015a == null) {
            f30015a = context.getPackageName();
        }
        return f30015a;
    }

    private static int a(Context context, String str, String str2) {
        if (f30016b == null) {
            f30016b = context.getResources();
        }
        return f30016b.getIdentifier(str, str2, a(context));
    }

    public static int a(Context context, String str) {
        return a(context, str, "id");
    }
}
