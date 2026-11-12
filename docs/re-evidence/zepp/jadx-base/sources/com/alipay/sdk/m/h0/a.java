package com.alipay.sdk.m.h0;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public class a {
    public static String a(Context context) {
        if (com.alipay.sdk.m.a.a.b.a) {
            return com.alipay.sdk.m.a.a.c.b.a.a(context.getApplicationContext(), "AUID");
        }
        throw new RuntimeException("SDK Need Init First!");
    }

    public static String b(Context context) {
        if (com.alipay.sdk.m.a.a.b.a) {
            return com.alipay.sdk.m.a.a.c.b.a.a(context.getApplicationContext(), "OUID");
        }
        throw new RuntimeException("SDK Need Init First!");
    }

    public static String c(Context context) {
        if (com.alipay.sdk.m.a.a.b.a) {
            return com.alipay.sdk.m.a.a.c.b.a.a(context.getApplicationContext(), "GUID");
        }
        throw new RuntimeException("SDK Need Init First!");
    }

    public static String d(Context context) {
        if (com.alipay.sdk.m.a.a.b.a) {
            return com.alipay.sdk.m.a.a.c.b.a.a(context.getApplicationContext(), "DUID");
        }
        throw new RuntimeException("SDK Need Init First!");
    }

    public static void e(Context context) {
        com.alipay.sdk.m.a.a.b.b = com.alipay.sdk.m.a.a.c.b.a.a(context.getApplicationContext());
        com.alipay.sdk.m.a.a.b.a = true;
    }

    public static boolean a() {
        if (com.alipay.sdk.m.a.a.b.a) {
            return com.alipay.sdk.m.a.a.b.b;
        }
        throw new RuntimeException("SDK Need Init First!");
    }
}
