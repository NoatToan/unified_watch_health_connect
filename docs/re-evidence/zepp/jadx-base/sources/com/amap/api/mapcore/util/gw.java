package com.amap.api.mapcore.util;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public class gw {
    private static gw a;
    private final Context b;
    private final String c = hd.a(gu.c("RYW1hcF9kZXZpY2VfYWRpdQ"));

    private gw(Context context) {
        this.b = context.getApplicationContext();
    }

    public static gw a(Context context) {
        if (a == null) {
            synchronized (gw.class) {
                if (a == null) {
                    a = new gw(context);
                }
            }
        }
        return a;
    }

    public final void a(String str) {
        gx.a(this.b).a(this.c);
        gx.a(this.b).b(str);
    }
}
