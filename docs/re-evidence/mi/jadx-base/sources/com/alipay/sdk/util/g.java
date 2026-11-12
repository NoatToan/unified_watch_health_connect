package com.alipay.sdk.util;

import android.content.Context;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.xiaomi.ai.android.track.TraceConstants;

/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f5888a;

    public static String a(Context context) {
        String packageName;
        if (TextUtils.isEmpty(f5888a)) {
            try {
                packageName = context.getApplicationContext().getPackageName();
            } catch (Throwable th) {
                c.d(th);
                packageName = "";
            }
            f5888a = (packageName + "0000000000000000000000000000").substring(0, 24);
        }
        return f5888a;
    }

    public static synchronized void b(com.alipay.sdk.sys.a aVar, Context context, String str, String str2) {
        try {
            String strA = com.alipay.sdk.encrypt.e.a(a(context), str2, str);
            if (!TextUtils.isEmpty(str2) && TextUtils.isEmpty(strA)) {
                com.alipay.sdk.app.statistic.a.c(aVar, TraceConstants.Result.CP, "TriDesDecryptError", String.format("%s,%s", str, str2));
            }
            PreferenceManager.getDefaultSharedPreferences(context).edit().putString(str, strA).apply();
        } catch (Throwable th) {
            c.d(th);
        }
    }

    public static synchronized String c(com.alipay.sdk.sys.a aVar, Context context, String str, String str2) {
        String strC;
        strC = null;
        try {
            try {
                String string = PreferenceManager.getDefaultSharedPreferences(context).getString(str, str2);
                strC = TextUtils.isEmpty(string) ? null : com.alipay.sdk.encrypt.e.c(a(context), string, str);
                if (!TextUtils.isEmpty(string) && TextUtils.isEmpty(strC)) {
                    com.alipay.sdk.app.statistic.a.c(aVar, TraceConstants.Result.CP, "TriDesEncryptError", String.format("%s,%s", str, string));
                }
            } catch (Exception e) {
                c.d(e);
            }
        } catch (Throwable th) {
            throw th;
        }
        return strC;
    }
}
