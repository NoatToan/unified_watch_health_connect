package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.mipush.sdk.ac;

/* JADX INFO: loaded from: classes11.dex */
public class b7t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f3902a = -1;

    public static ac a(Context context) {
        if (c(context)) {
            return ac.HUAWEI;
        }
        if (e(context)) {
            return ac.OPPO;
        }
        return f(context) ? ac.VIVO : ac.OTHER;
    }

    public static boolean b() {
        try {
            String str = (String) zbs.g("android.os.SystemProperties", "get", "ro.build.hw_emui_api_level", "");
            return !TextUtils.isEmpty(str) && Integer.parseInt(str) >= 9;
        } catch (Exception e) {
            x9s.s(e);
        }
    }

    public static boolean c(Context context) {
        try {
            return context.getPackageManager().getServiceInfo(new ComponentName("com.huawei.hwid", "com.huawei.hms.core.service.HMSCoreService"), 128) != null && b();
        } catch (Throwable unused) {
        }
    }

    public static boolean d(Context context) {
        Object objE = zbs.e(zbs.g("com.google.android.gms.common.GoogleApiAvailability", "getInstance", new Object[0]), "isGooglePlayServicesAvailable", context);
        Object objF = zbs.f("com.google.android.gms.common.ConnectionResult", "SUCCESS");
        if (objF == null || !(objF instanceof Integer)) {
            x9s.B("google service is not avaliable");
            f3902a = 0;
            return false;
        }
        int iIntValue = ((Integer) Integer.class.cast(objF)).intValue();
        if (objE != null) {
            if (objE instanceof Integer) {
                f3902a = ((Integer) Integer.class.cast(objE)).intValue() == iIntValue ? 1 : 0;
            } else {
                f3902a = 0;
                x9s.B("google service is not avaliable");
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("is google service can be used");
        sb.append(f3902a > 0);
        x9s.B(sb.toString());
        return f3902a > 0;
    }

    public static boolean e(Context context) {
        Object objG = zbs.g("com.xiaomi.assemble.control.COSPushManager", "isSupportPush", context);
        boolean zBooleanValue = (objG == null || !(objG instanceof Boolean)) ? false : ((Boolean) Boolean.class.cast(objG)).booleanValue();
        x9s.B("color os push  is avaliable ? :" + zBooleanValue);
        return zBooleanValue;
    }

    public static boolean f(Context context) {
        Object objG = zbs.g("com.xiaomi.assemble.control.FTOSPushManager", "isSupportPush", context);
        boolean zBooleanValue = (objG == null || !(objG instanceof Boolean)) ? false : ((Boolean) Boolean.class.cast(objG)).booleanValue();
        x9s.B("fun touch os push  is avaliable ? :" + zBooleanValue);
        return zBooleanValue;
    }
}
