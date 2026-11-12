package com.amap.api.col.p0003sl;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public class ja {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static ja f2853a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f2854b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f2855c = false;
    private Context d;

    private ja(Context context) {
        this.d = context;
    }

    public static ja a(Context context) {
        if (f2853a == null) {
            synchronized (ja.class) {
                if (f2853a == null) {
                    f2853a = new ja(context);
                }
            }
        }
        return f2853a;
    }

    public static String a() {
        return "";
    }
}
