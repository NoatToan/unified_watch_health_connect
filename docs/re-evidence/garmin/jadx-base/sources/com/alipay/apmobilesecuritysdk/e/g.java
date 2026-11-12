package com.alipay.apmobilesecuritysdk.e;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes7.dex */
public final class g {
    public static synchronized String a(Context context, String str) {
        String string = context.getSharedPreferences("openapi_file_pri", 0).getString("openApi" + str, "");
        if (oi0.c.g(string)) {
            return "";
        }
        String strR = og.a.r(og.a.m(), string);
        return oi0.c.g(strR) ? "" : strR;
    }

    public static synchronized void a() {
    }

    public static synchronized void a(Context context) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("openapi_file_pri", 0).edit();
        if (editorEdit != null) {
            editorEdit.clear();
            editorEdit.commit();
        }
    }

    public static synchronized void a(Context context, String str, String str2) {
        try {
            SharedPreferences.Editor editorEdit = context.getSharedPreferences("openapi_file_pri", 0).edit();
            if (editorEdit != null) {
                editorEdit.putString("openApi" + str, og.a.n(og.a.m(), str2));
                editorEdit.commit();
            }
        } catch (Throwable unused) {
        }
    }
}
