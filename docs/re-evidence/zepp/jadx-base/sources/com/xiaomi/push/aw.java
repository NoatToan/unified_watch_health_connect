package com.xiaomi.push;

import android.content.Context;

/* JADX INFO: loaded from: classes22.dex */
public class aw {
    private static volatile aw b;
    private Context a;

    private aw(Context context) {
        this.a = context;
    }

    public static aw a(Context context) {
        if (b == null) {
            synchronized (aw.class) {
                if (b == null) {
                    b = new aw(context);
                }
            }
        }
        return b;
    }

    @Deprecated
    public void a(String str, String str2, String str3, String str4) {
    }
}
