package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class cic {
    public static boolean d(Context context, String str) {
        return (context == null || TextUtils.isEmpty(str) || e(context, str) == null) ? false : true;
    }

    public static boolean c(String str, String str2) {
        if (!d(chm.c(), str)) {
            cib.b("PackageManagerUtil", "app package name is not available");
            return false;
        }
        if (b(c(chm.c(), str), str2) >= 0) {
            return true;
        }
        cib.b("PackageManagerUtil", "app version for this package name is not match");
        return false;
    }

    private static int b(String str, String str2) {
        int i;
        int i2;
        String[] strArrSplit = str.split("\\.");
        String[] strArrSplit2 = str2.split("\\.");
        int iMax = Math.max(strArrSplit.length, strArrSplit2.length);
        int i3 = 0;
        while (i3 < iMax) {
            try {
                i = i3 < strArrSplit.length ? Integer.parseInt(strArrSplit[i3]) : 0;
                try {
                    i2 = i3 < strArrSplit2.length ? Integer.parseInt(strArrSplit2[i3]) : 0;
                } catch (NumberFormatException unused) {
                    cib.d("PackageManagerUtil", "compareVersion NumberFormatException");
                }
            } catch (NumberFormatException unused2) {
                i = 0;
            }
            if (i != i2) {
                return i - i2;
            }
            cib.b("PackageManagerUtil", "continue compare");
            i3++;
        }
        return 0;
    }

    public static String c(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            return "";
        }
        PackageInfo packageInfoE = e(context, str);
        if (packageInfoE != null) {
            return packageInfoE.versionName;
        }
        cib.d("PackageManagerUtil", "appVersionName is null.");
        return "";
    }

    private static PackageInfo e(Context context, String str) {
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                cib.d("PackageManagerUtil", "packageManager is null.");
                return null;
            }
            return packageManager.getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            cib.d("PackageManagerUtil", "getPackageInfo fail:" + e.getMessage());
            return null;
        }
    }

    public static String c(String str) {
        return (cie.e() && TextUtils.equals(str, "com.huawei.pcassistant")) ? "com.hihonor.pcassistant" : str;
    }

    public static boolean d(Context context, Intent intent) {
        List<ResolveInfo> listQueryIntentActivities;
        return (context == null || (listQueryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0)) == null || listQueryIntentActivities.isEmpty()) ? false : true;
    }
}
