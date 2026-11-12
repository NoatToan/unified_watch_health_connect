package defpackage;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.huawei.hwcommonmodel.application.BaseApplication;
import health.compact.a.SharedPreferenceManager;

/* JADX INFO: loaded from: classes.dex */
public class buh {
    public static int a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str3)) {
            return -1;
        }
        return d(str, str3 + "_" + str2);
    }

    public static String b(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return "";
        }
        String strE = e(str);
        String str3 = str2 + '_';
        return (strE == null || !strE.startsWith(str3)) ? "" : strE.substring(str3.length());
    }

    public static int d(String str, String str2) {
        return e().edit().putString(str, str2).commit() ? 0 : -1;
    }

    public static String e(String str) {
        return e().getString(str, "");
    }

    private static SharedPreferences e() {
        return BaseApplication.getContext().getApplicationContext().getSharedPreferences("fit_SharedPreference", 0);
    }

    public static int c(String str) {
        SharedPreferences.Editor editorEdit = e().edit();
        editorEdit.remove(str);
        return editorEdit.commit() ? 0 : -1;
    }

    public static void c(boolean z) {
        SharedPreferenceManager.a("MMKV_SUGGEST_MODULE_TAG", "REMIND_MOBILE_SHORT_VIDEO", z);
    }

    public static boolean d() {
        return SharedPreferenceManager.b("MMKV_SUGGEST_MODULE_TAG", "REMIND_MOBILE_SHORT_VIDEO", false);
    }

    public static void c(long j) {
        SharedPreferenceManager.c("MMKV_SUGGEST_MODULE_TAG", "REMIND_MOBILE_TOAST_TIME", j);
    }

    public static long c() {
        return SharedPreferenceManager.d("MMKV_SUGGEST_MODULE_TAG", "REMIND_MOBILE_TOAST_TIME", 0L);
    }
}
