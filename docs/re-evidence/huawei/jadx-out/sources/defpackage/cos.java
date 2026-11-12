package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import health.compact.a.LogUtil;

/* JADX INFO: loaded from: classes4.dex */
public class cos {
    public static String d(String str, Context context) {
        if (str == null || context == null) {
            LogUtil.b("CommandPackage", "getKeyFromSharedPreferences with parameter incorrect.");
            return "";
        }
        String string = context.getSharedPreferences("btsdk_sharedpreferences_name4", 0).getString(str, "");
        LogUtil.b("CommandPackage", "getKeyFromSharedPreferences ok");
        return string;
    }

    public static void c(String str, String str2, String str3, Context context) {
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str3)) {
            return;
        }
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(str3, 0).edit();
        editorEdit.putString(str, str2);
        editorEdit.commit();
        LogUtil.b("CommandPackage", "putInfoToSharedPreferences ok");
    }

    public static String e(String str, Context context) {
        if (str == null || context == null) {
            LogUtil.b("CommandPackage", "getBindIdFromSharedPreferences with parameter incorrect.");
            return "";
        }
        String string = context.getSharedPreferences("btsdk_sharedpreferences_bindid", 0).getString(str, "");
        LogUtil.b("CommandPackage", "getBindIdFromSharedPreferences ok, bindId: ", cph.a(string));
        return string;
    }
}
