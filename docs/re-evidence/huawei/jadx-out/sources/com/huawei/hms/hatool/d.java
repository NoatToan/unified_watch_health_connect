package com.huawei.hms.hatool;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class d {
    public static String c(Context context, String str) {
        String packageName = context.getPackageName();
        String strN = a1.n("_hms_config_tag", "oper");
        if (TextUtils.isEmpty(strN)) {
            return "hms_" + str + "_" + packageName;
        }
        return "hms_" + str + "_" + packageName + "_" + strN;
    }

    public static void b(Context context, String str, String str2, String str3) {
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            v.e("hmsSdk", "context is null or spName empty or spkey is empty");
            return;
        }
        SharedPreferences sharedPreferencesB = b(context, str);
        if (sharedPreferencesB != null) {
            SharedPreferences.Editor editorEdit = sharedPreferencesB.edit();
            editorEdit.putString(str2, str3);
            editorEdit.commit();
        }
    }

    public static void b(Context context, String str, String str2, long j) {
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            v.f("hmsSdk", "context is null or spName empty or spkey is empty");
            return;
        }
        SharedPreferences sharedPreferencesB = b(context, str);
        if (sharedPreferencesB != null) {
            SharedPreferences.Editor editorEdit = sharedPreferencesB.edit();
            editorEdit.putLong(str2, j);
            editorEdit.commit();
        }
    }

    private static SharedPreferences b(Context context, String str) {
        return context.getSharedPreferences(c(context, str), 0);
    }

    public static void a(Context context, String str, String... strArr) {
        if (context == null || TextUtils.isEmpty(str)) {
            v.f("hmsSdk", "clearData(): parameter error.context,spname");
            return;
        }
        if (strArr == null) {
            v.f("hmsSdk", "clearData(): No data need to be deleted,keys is null");
            return;
        }
        SharedPreferences sharedPreferencesB = b(context, str);
        if (sharedPreferencesB != null) {
            SharedPreferences.Editor editorEdit = sharedPreferencesB.edit();
            if (strArr.length == 0) {
                editorEdit.clear();
                editorEdit.commit();
                return;
            }
            for (String str2 : strArr) {
                if (sharedPreferencesB.contains(str2)) {
                    editorEdit.remove(str2);
                    editorEdit.commit();
                }
            }
        }
    }

    public static Map<String, ?> a(Context context, String str) {
        return b(context, str).getAll();
    }

    public static String a(Context context, String str, String str2, String str3) {
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            v.f("hmsSdk", "context is null or spName empty or spkey is empty");
            return str3;
        }
        SharedPreferences sharedPreferencesB = b(context, str);
        return sharedPreferencesB != null ? sharedPreferencesB.getString(str2, str3) : str3;
    }

    public static long a(Context context, String str, String str2, long j) {
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            v.f("hmsSdk", "context is null or spName empty or spkey is empty");
            return j;
        }
        SharedPreferences sharedPreferencesB = b(context, str);
        return sharedPreferencesB != null ? sharedPreferencesB.getLong(str2, j) : j;
    }
}
