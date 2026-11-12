package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes15.dex */
public class pyz {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f46002b;
    private static int e;

    public static boolean e(Context context) {
        PackageInfo packageInfoB = b(context);
        if (packageInfoB == null) {
            return true;
        }
        String str = packageInfoB.versionName;
        int i = packageInfoB.versionCode;
        String strC = pzb.c(context, "hw_skinner", "LAST_VERSION_NAME", (String) null);
        int iC = pzb.c(context, "hw_skinner", "LAST_VERSION_CODE", -1);
        if (str.equals(strC) && i == iC) {
            return false;
        }
        f46002b = str;
        e = i;
        return true;
    }

    public static void a(Context context) {
        if (TextUtils.isEmpty(f46002b) || e == 0) {
            return;
        }
        pzb.a(context, "hw_skinner", "LAST_VERSION_NAME", f46002b);
        pzb.d(context, "hw_skinner", "LAST_VERSION_CODE", e);
    }

    private static PackageInfo b(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 16384);
        } catch (Exception unused) {
            pyx.b("Get package info error.");
            return null;
        }
    }
}
