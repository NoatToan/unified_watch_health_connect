package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.huawei.haf.application.BaseApplication;
import health.compact.a.LogUtil;

/* JADX INFO: loaded from: classes4.dex */
public class cpv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Context f31244a = BaseApplication.b();

    public static String a(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.e("SharePreferenceUtil", "getSecretKeyFromSharedPreferences with parameter incorrect.");
            return "";
        }
        String strB = ckg.b(str);
        if (i == 1) {
            return h(strB, "share_preference_order_one");
        }
        if (i == 2) {
            return h(strB, "share_preference_order_two");
        }
        LogUtil.e("SharePreferenceUtil", "getSecretKeyFromSharedPreferences keyOrder unknown.");
        return "";
    }

    public static boolean e(String str, int i, String str2) {
        if (TextUtils.isEmpty(str) || str2 == null) {
            LogUtil.e("SharePreferenceUtil", "saveSecretKeyToSharedPreferences with parameter incorrect.");
            return false;
        }
        LogUtil.b("SharePreferenceUtil", "deviceIdentify: ", cpl.e(str), " keyOrder: ", Integer.valueOf(i), " secretKey: ", cpl.e(str2), " secretKeyLength: ", Integer.valueOf(str2.length()));
        String strB = ckg.b(str);
        if (i == 1) {
            return d(strB, str2, "share_preference_order_one");
        }
        if (i == 2) {
            return d(strB, str2, "share_preference_order_two");
        }
        LogUtil.e("SharePreferenceUtil", "saveSecretKeyToSharedPreferences keyOrder unknown.");
        return false;
    }

    public static void d() {
        LogUtil.b("SharePreferenceUtil", "clearSecretKey");
        a("share_preference_order_one");
        a("share_preference_order_two");
    }

    public static boolean a(String str, String str2) {
        if (TextUtils.isEmpty(str) || str2 == null) {
            LogUtil.e("SharePreferenceUtil", "saveBindIdToSharedPreferences with parameter incorrect.");
            return false;
        }
        return d(ckg.b(str), str2, "btsdk_sharedpreferences_bindid");
    }

    public static String d(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.e("SharePreferenceUtil", "getBindIdFromSharedPreferences with parameter incorrect.");
            return "";
        }
        return h(ckg.b(str), "btsdk_sharedpreferences_bindid");
    }

    public static String c(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.e("SharePreferenceUtil", "getUpdateKeySuccessLabelShared with parameter incorrect.");
            return "";
        }
        return h(ckg.b(str), "btsdk_sharedpreferences_update_key_label");
    }

    public static boolean c(String str, String str2) {
        if (TextUtils.isEmpty(str) || str2 == null) {
            LogUtil.e("SharePreferenceUtil", "saveUpdateKeySuccessLabelShared with parameter incorrect.");
            return false;
        }
        return d(ckg.b(str), str2, "btsdk_sharedpreferences_update_key_label");
    }

    public static boolean d(String str, String str2) {
        if (TextUtils.isEmpty(str) || str2 == null) {
            LogUtil.e("SharePreferenceUtil", "saveIdentifyKeyToSharedPreferences with parameter incorrect.");
            return false;
        }
        return d(ckg.b(str), str2, "btsdk_sharedpreferences_identify_key");
    }

    public static boolean b(String str, String str2) {
        if (TextUtils.isEmpty(str) || str2 == null) {
            LogUtil.e("SharePreferenceUtil", "saveIdentifyKeyToSharedPreferences with parameter incorrect.");
            return false;
        }
        return d(ckg.b(str), str2, "btsdk_sharedpreferences_identify_key_hm");
    }

    public static String b(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.e("SharePreferenceUtil", "getIdentifyKeyFromSharedPreferences with parameter incorrect.");
            return "";
        }
        return h(ckg.b(str), "btsdk_sharedpreferences_identify_key");
    }

    private static boolean d(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str3) || str2 == null) {
            LogUtil.e("SharePreferenceUtil", "saveInfoToSharedPreferences failed with invalid parameter");
            return false;
        }
        SharedPreferences.Editor editorEdit = f31244a.getSharedPreferences(str3, 0).edit();
        editorEdit.putString(str, str2);
        LogUtil.b("SharePreferenceUtil", "saveInfoToSharedPreferences()");
        editorEdit.commit();
        return true;
    }

    private static String h(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            LogUtil.e("SharePreferenceUtil", "getDataFromSharedPreferences failed with invalid parameter");
            return "";
        }
        SharedPreferences sharedPreferences = f31244a.getSharedPreferences(str2, 0);
        if (sharedPreferences == null) {
            LogUtil.e("SharePreferenceUtil", "getDataFromSharedPreferences failed with preferences error");
            return "";
        }
        String string = sharedPreferences.getString(str, "");
        LogUtil.b("SharePreferenceUtil", "getDataFromSharedPreferences ok");
        return string;
    }

    private static void a(String str) {
        f31244a.getSharedPreferences(str, 0).edit().clear().commit();
    }

    public static boolean e(String str, String str2) {
        if (TextUtils.isEmpty(str) || str2 == null) {
            LogUtil.e("SharePreferenceUtil", "saveIdentifyKeyToSharedPreferences with parameter incorrect.");
            return false;
        }
        return d(ckg.b(str), str2, "btsdk_sharedpreferences_identify_pin_codeMACA");
    }

    public static String e(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.e("SharePreferenceUtil", "getIdentifyKeyFromSharedPreferences with parameter incorrect.");
            return "";
        }
        return h(ckg.b(str), "btsdk_sharedpreferences_identify_pin_codeMACA");
    }
}
