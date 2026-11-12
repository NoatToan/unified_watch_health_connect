package com.huawei.phoneservice.faq.base.util;

import android.content.Context;
import android.content.SharedPreferences;
import com.huawei.phoneservice.faq.base.constants.FaqConstants;

/* JADX INFO: loaded from: classes13.dex */
public final class n {
    public static void c(Context context, String str, String str2, String str3) {
        if (context == null) {
            return;
        }
        try {
            if (k.b(str)) {
                str = FaqConstants.COMMON_FILE;
            }
            SharedPreferences.Editor editorEdit = context.getSharedPreferences(str, 0).edit();
            editorEdit.putString(str2, str3);
            editorEdit.apply();
        } catch (Exception e) {
            g.c("FaqSharePrefUtil", e.getMessage());
        }
    }

    public static String b(Context context, String str, String str2, String str3) {
        if (context == null) {
            return str3;
        }
        if (k.b(str)) {
            str = FaqConstants.COMMON_FILE;
        }
        return context.getSharedPreferences(str, 0).getString(str2, str3);
    }

    public static void d(Context context, String str, String str2) {
        if (context == null) {
            g.c("FaqSharePrefUtil", "delete context is null");
            return;
        }
        if (k.b(str)) {
            str = FaqConstants.COMMON_FILE;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
        if (sharedPreferences == null) {
            g.c("FaqSharePrefUtil", "delete sharedPreferences is null");
            return;
        }
        if (sharedPreferences.contains(str2)) {
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            if (editorEdit == null) {
                g.c("FaqSharePrefUtil", "delete editor is null");
            } else {
                editorEdit.remove(str2);
                editorEdit.apply();
            }
        }
    }

    public static void c(Context context, String str) {
        if (context != null) {
            try {
                SharedPreferences.Editor editorEdit = context.getSharedPreferences("FAQ_MODULE_FILE_NAME", 0).edit();
                editorEdit.putString("module", str);
                editorEdit.commit();
            } catch (Exception e) {
                g.c("FaqSharePrefUtil", e.getMessage());
            }
        }
    }

    public static String c(Context context) {
        return context != null ? context.getSharedPreferences("FAQ_MODULE_FILE_NAME", 0).getString("module", "") : "";
    }

    public static void d(Context context, String str) {
        if (context != null) {
            SharedPreferences.Editor editorEdit = context.getSharedPreferences("FAQ_LANGUAGE_FILE_NAME", 0).edit();
            editorEdit.putString("language", str);
            editorEdit.commit();
        }
    }

    public static String e(Context context) {
        return context != null ? context.getSharedPreferences("FAQ_LANGUAGE_FILE_NAME", 0).getString("language", "") : "";
    }
}
