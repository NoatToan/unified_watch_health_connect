package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public class ksu {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static String f39387c = "com.huawei.health";

    public static boolean e(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            context.getPackageManager().getApplicationInfo(str, 8192);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("CheckAppUtil", "Health application does not exist");
            return false;
        }
    }

    public static int c(Context context, String str) {
        PackageInfo packageInfoB = b(context, str);
        if (packageInfoB != null) {
            return packageInfoB.versionCode;
        }
        return 0;
    }

    private static PackageInfo b(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            Log.e("CheckAppUtil", "Health application does not exist");
            return null;
        }
    }

    public static String b() {
        if (TextUtils.isEmpty(f39387c)) {
            return "com.huawei.health";
        }
        return f39387c;
    }

    public static void d(String str) {
        f39387c = str;
    }
}
