package com.alipay.apmobilesecuritysdk.e;

import android.content.Context;
import android.content.SharedPreferences;
import defpackage.kj;
import defpackage.ks;
import defpackage.lm;

/* JADX INFO: loaded from: classes4.dex */
public class g {
    public static void b(Context context, String str) {
        synchronized (g.class) {
        }
    }

    public static void a(Context context, String str, String str2) {
        synchronized (g.class) {
            try {
                SharedPreferences.Editor editorEdit = context.getSharedPreferences("openapi_file_pri", 0).edit();
                if (editorEdit != null) {
                    editorEdit.putString("openApi" + str, ks.c(ks.e(), str2));
                    editorEdit.commit();
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static void a(Context context) {
        synchronized (g.class) {
            SharedPreferences.Editor editorEdit = context.getSharedPreferences("openapi_file_pri", 0).edit();
            if (editorEdit != null) {
                editorEdit.clear();
                editorEdit.commit();
            }
        }
    }

    public static String a(Context context, String str) {
        synchronized (g.class) {
            String strE = lm.e(context, "openapi_file_pri", "openApi" + str, "");
            if (kj.c(strE)) {
                return "";
            }
            String strE2 = ks.e(ks.e(), strE);
            return kj.c(strE2) ? "" : strE2;
        }
    }
}
