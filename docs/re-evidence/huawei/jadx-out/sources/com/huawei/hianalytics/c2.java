package com.huawei.hianalytics;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.huawei.hianalytics.core.common.EnvUtils;
import com.huawei.hianalytics.core.log.HiLog;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.constant.WatchFaceConstant;
import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c2 {
    public static void a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
            HiLog.e("SharedPreUtils", "spName or spKey is empty");
            return;
        }
        SharedPreferences sharedPreferencesA = a(str);
        if (sharedPreferencesA != null) {
            SharedPreferences.Editor editorEdit = sharedPreferencesA.edit();
            editorEdit.putString(str2, str3);
            editorEdit.commit();
        }
    }

    public static String b(Context context, String str) {
        String packageName = k.b().a().o;
        if (TextUtils.isEmpty(packageName)) {
            packageName = context.getPackageName();
        }
        return "hianalytics_" + str + "_" + packageName;
    }

    public static void b(String str, String str2, long j) {
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
            SharedPreferences sharedPreferencesA = a(str);
            if (sharedPreferencesA != null) {
                SharedPreferences.Editor editorEdit = sharedPreferencesA.edit();
                editorEdit.putLong(str2, j);
                editorEdit.commit();
                return;
            }
            return;
        }
        HiLog.e("SharedPreUtils", "spName or spKey is empty");
    }

    public static SharedPreferences a(String str) {
        Context appContext = EnvUtils.getAppContext();
        if (appContext == null) {
            HiLog.e("SharedPreUtils", "context is null");
            return null;
        }
        try {
            return appContext.getSharedPreferences(b(appContext, str), 0);
        } catch (Exception unused) {
            HiLog.e("SharedPreUtils", "getSharedPreferences Exception");
            return null;
        }
    }

    public static String a(String str, String str2) {
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
            SharedPreferences sharedPreferencesA = a(str);
            return sharedPreferencesA != null ? sharedPreferencesA.getString(str2, "") : "";
        }
        HiLog.e("SharedPreUtils", "spName or spKey is empty");
        return "";
    }

    public static long a(String str, String str2, long j) {
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
            SharedPreferences sharedPreferencesA = a(str);
            return sharedPreferencesA != null ? sharedPreferencesA.getLong(str2, j) : j;
        }
        HiLog.e("SharedPreUtils", "spName or spKey is empty");
        return j;
    }

    public static boolean a(Context context, String str) {
        File file = new File(context.getFilesDir(), "../shared_prefs/" + b(context, str) + WatchFaceConstant.XML_SUFFIX);
        if (file.exists() && file.delete()) {
            HiLog.w("SharedPreUtils", "delete sp file");
        }
        return file.exists() && file.delete();
    }
}
