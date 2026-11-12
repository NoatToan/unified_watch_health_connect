package nh;

import android.content.Context;
import android.preference.PreferenceManager;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes7.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f126131a;

    public static String a(Context context) {
        String packageName;
        if (TextUtils.isEmpty(f126131a)) {
            try {
                packageName = context.getApplicationContext().getPackageName();
            } catch (Throwable th3) {
                d.a(th3);
                packageName = "";
            }
            f126131a = (packageName + "0000000000000000000000000000").substring(0, 24);
        }
        return f126131a;
    }

    public static synchronized String b(String str, String str2, Context context, lh.a aVar) {
        String str3;
        str3 = null;
        try {
            String string = PreferenceManager.getDefaultSharedPreferences(context).getString(str, str2);
            if (!TextUtils.isEmpty(string)) {
                try {
                    str3 = new String(ch.d.a(a(context), str, ch.a.c(string)));
                } catch (Exception unused) {
                }
            }
            if (!TextUtils.isEmpty(string) && TextUtils.isEmpty(str3)) {
                wg.a.g(aVar, "cp", "TriDesEncryptError", str + "," + string);
            }
        } catch (Exception e4) {
            d.a(e4);
        }
        return str3;
    }

    public static synchronized void c(String str, String str2, Context context, lh.a aVar) {
        String strA;
        try {
            try {
                strA = ch.a.a(ch.d.b(a(context), str, str2.getBytes()));
            } catch (Exception unused) {
                strA = null;
            }
            if (!TextUtils.isEmpty(str2) && TextUtils.isEmpty(strA)) {
                wg.a.g(aVar, "cp", "TriDesDecryptError", str + "," + str2);
            }
            PreferenceManager.getDefaultSharedPreferences(context).edit().putString(str, strA).apply();
        } catch (Throwable th3) {
            d.a(th3);
        }
    }
}
