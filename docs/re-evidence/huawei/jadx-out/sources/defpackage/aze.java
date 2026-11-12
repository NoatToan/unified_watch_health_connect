package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import java.util.Properties;

/* JADX INFO: loaded from: classes22.dex */
public final class aze {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f833b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final boolean f834c;
    public static final boolean d;
    public static final boolean e;
    public static final String f;
    public static final boolean g;
    private static final char[] h;
    public static final String i;
    public static final boolean j;
    private static ayz k;
    private static final int m;
    private static Properties o;

    static {
        boolean zD = aza.d("ro.config.hw_emui_wfd_pc_mode", false);
        j = zD;
        f834c = zD;
        e = aza.d("ro.config.hw_emui_welink_cast", false);
        String strC = aza.c("ro.build.characteristics", "phone");
        f832a = strC;
        d = strC.equalsIgnoreCase("tablet");
        f833b = aza.d("hw_sc.product.useBrandCust", false);
        String strC2 = aza.c("debug.wfd_dump", "0");
        i = strC2;
        g = strC2.equalsIgnoreCase("1");
        f = aza.c("ro.build.product", "");
        m = aza.c("ro.logsystem.usertype", 0);
        h = "0123456789ABCDEF".toCharArray();
        o = null;
        k = ayz.e();
    }

    public static boolean e() {
        int i2 = m;
        return i2 == 3 || i2 == 5;
    }

    public static boolean a(Context context, String str) {
        if (!TextUtils.isEmpty(str) && context != null) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    k.a("UtilMethod", "isPackageExist: PM service not found");
                    return false;
                }
                packageManager.getApplicationInfo(str, 0);
                return true;
            } catch (PackageManager.NameNotFoundException unused) {
                k.a("UtilMethod", "isPackageExist: get app info fail for " + str);
            }
        }
        return false;
    }
}
