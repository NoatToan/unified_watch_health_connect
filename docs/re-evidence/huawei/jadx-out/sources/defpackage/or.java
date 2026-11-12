package defpackage;

import android.content.Context;
import android.preference.PreferenceManager;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes4.dex */
public class or {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f44388b;

    public static void c(on onVar, Context context, String str, String str2) {
        synchronized (or.class) {
            try {
                String strA = nm.a(d(context), str2, str);
                if (!TextUtils.isEmpty(str2) && TextUtils.isEmpty(strA)) {
                    mu.e(onVar, "cp", "TriDesDecryptError", String.format("%s,%s", str, str2));
                }
                PreferenceManager.getDefaultSharedPreferences(context).edit().putString(str, strA).apply();
            } catch (Throwable th) {
                oq.c(th);
            }
        }
    }

    public static String d(on onVar, Context context, String str, String str2) {
        String strD;
        synchronized (or.class) {
            strD = null;
            try {
                String string = PreferenceManager.getDefaultSharedPreferences(context).getString(str, str2);
                strD = TextUtils.isEmpty(string) ? null : nm.d(d(context), string, str);
                if (!TextUtils.isEmpty(string) && TextUtils.isEmpty(strD)) {
                    mu.e(onVar, "cp", "TriDesEncryptError", String.format("%s,%s", str, string));
                }
            } catch (Exception e) {
                oq.c(e);
            }
        }
        return strD;
    }

    public static String d(Context context) {
        String packageName;
        if (TextUtils.isEmpty(f44388b)) {
            try {
                packageName = context.getApplicationContext().getPackageName();
            } catch (Throwable th) {
                oq.c(th);
                packageName = "";
            }
            f44388b = (packageName + "0000000000000000000000000000").substring(0, 24);
        }
        return f44388b;
    }
}
