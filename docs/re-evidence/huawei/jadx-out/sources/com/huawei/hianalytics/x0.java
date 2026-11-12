package com.huawei.hianalytics;

import android.app.Application;
import android.content.ContentResolver;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Pair;
import com.huawei.hianalytics.core.log.HiLog;

/* JADX INFO: loaded from: classes3.dex */
public abstract class x0 {
    /* JADX WARN: Code duplicated, block: B:24:0x005e  */
    /* JADX WARN: Code duplicated, block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r5v1, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v6 */
    public static String b(Context context) {
        ?? packageName;
        ?? packageName2;
        if (context == 0) {
            return "";
        }
        String str = k.b().a().q;
        if (str == null) {
            str = "";
        }
        if (!TextUtils.isEmpty(str)) {
            String str2 = k.b().a().q;
            return str2 == null ? "" : str2;
        }
        try {
            if (Build.VERSION.SDK_INT < 28) {
                try {
                    String str3 = (String) Class.forName("android.app.ActivityThread").getMethod("currentProcessName", new Class[0]).invoke(null, new Object[0]);
                    boolean zIsEmpty = TextUtils.isEmpty(str3);
                    packageName = str3;
                    if (zIsEmpty) {
                        context = context.getPackageName();
                        packageName2 = context;
                    }
                } catch (Throwable unused) {
                    packageName2 = context.getPackageName();
                }
                if (TextUtils.isEmpty(packageName)) {
                    return "";
                }
                return packageName;
            }
            packageName2 = Application.getProcessName();
            packageName = packageName2;
        } catch (Exception unused2) {
            HiLog.e("HAUtils", "get process name error");
            packageName = context.getPackageName();
        }
        if (TextUtils.isEmpty(packageName)) {
            return "";
        }
        return packageName;
    }

    public static Pair a(Context context) {
        if (context == null) {
            return new Pair("", Boolean.FALSE);
        }
        ContentResolver contentResolver = context.getContentResolver();
        return new Pair(Settings.Global.getString(contentResolver, "pps_oaid"), Boolean.valueOf(Boolean.parseBoolean(Settings.Global.getString(contentResolver, "pps_track_limit"))));
    }
}
