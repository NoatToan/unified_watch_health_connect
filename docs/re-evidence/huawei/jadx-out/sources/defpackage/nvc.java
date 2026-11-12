package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.huawei.hwcommonmodel.application.BaseApplication;
import health.compact.a.LogUtil;

/* JADX INFO: loaded from: classes40.dex */
public class nvc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Context f43786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f43787b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static SharedPreferences f43788c;
    private static nvc d;

    public static nvc b() {
        nvc nvcVar;
        synchronized (f43787b) {
            if (f43786a == null) {
                f43786a = BaseApplication.getContext();
            }
            if (d == null) {
                d = new nvc();
                f43788c = f43786a.getSharedPreferences("sleep_shared_pref_smart_msg", 0);
            }
            nvcVar = d;
        }
        return nvcVar;
    }

    public void b(String str) {
        String str2;
        if (f43786a == null || str == null) {
            LogUtil.e("SharedPreferenceUtils", "mContext or resultData is null");
            return;
        }
        SharedPreferences sharedPreferences = f43788c;
        if (sharedPreferences != null) {
            String string = sharedPreferences.getString("app_update_message", "");
            if (TextUtils.isEmpty(string)) {
                str2 = str;
            } else {
                str2 = (string + ",") + str;
            }
            LogUtil.b("SharedPreferenceUtils", "set appUpdateMsgInsertRecord is :", str);
            f43788c.edit().putString("app_update_message", str2).commit();
        }
    }

    public String d() {
        SharedPreferences sharedPreferences;
        if (f43786a == null || (sharedPreferences = f43788c) == null) {
            LogUtil.d("SharedPreferenceUtils", "mContext or mSharedPreferences is null");
            return "";
        }
        return sharedPreferences.getString("app_update_message", "");
    }
}
