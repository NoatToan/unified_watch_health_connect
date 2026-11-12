package com.xmlywind.sdk.common.utils;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes22.dex */
public final class p {
    public static SharedPreferences a(Context context) {
        m.a.a(context);
        return context.getSharedPreferences("com.xmlywind.Settings", 4);
    }

    public static SharedPreferences a(Context context, String str) {
        m.a.a(context);
        m.a.a(str);
        return context.getSharedPreferences(str, 4);
    }
}
