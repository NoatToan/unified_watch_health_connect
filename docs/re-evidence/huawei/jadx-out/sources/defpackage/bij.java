package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.huawei.hms.android.SystemUtils;
import com.huawei.openalliance.ad.constant.Constants;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes23.dex */
public class bij {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Map<String, Object> f1126b = new HashMap();

    public static boolean j() {
        String str;
        try {
            return bio.a("hw_sc.product.useBrandCust", false);
        } catch (RuntimeException unused) {
            str = "get isUseBrandCust fail: RuntimeException";
            bir.e("DeviceUtil", str);
            return false;
        } catch (Exception unused2) {
            str = "get isUseBrandCust fail: Exception";
            bir.e("DeviceUtil", str);
            return false;
        }
    }

    private static void f(Context context) {
        DisplayMetrics displayMetricsA = a(context);
        if (displayMetricsA != null) {
            f1126b.put("DPI", String.valueOf(displayMetricsA.densityDpi));
            int i = displayMetricsA.widthPixels;
            int i2 = displayMetricsA.heightPixels;
            f1126b.put("RESOLUTION", String.valueOf(i) + "_" + String.valueOf(i2));
        }
    }

    public static boolean j(Context context) {
        return context.getPackageManager().hasSystemFeature("com.huawei.software.features.car");
    }

    public static int g() {
        Integer num = (Integer) f1126b.get("SystemBit");
        if (num != null) {
            return num.intValue();
        }
        Integer numValueOf = Integer.valueOf(bio.d("ro.product.cpu.abi", "").contains("arm64") ? 2 : 1);
        f1126b.put("SystemBit", numValueOf);
        return numValueOf.intValue();
    }

    public static boolean i(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.type.watch");
    }

    public static int i() {
        return Build.VERSION.SDK_INT;
    }

    public static boolean e(Context context) {
        String str;
        if (context == null) {
            str = "isTelevision: context is null!";
        } else {
            Resources resources = context.getResources();
            if (resources != null) {
                return (resources.getConfiguration().uiMode & 15) == 4;
            }
            str = "isTelevision: resource is null!";
        }
        bir.d("DeviceUtil", str);
        return false;
    }

    public static String e() {
        String strA = bio.a("ro.product.hw_model");
        if (TextUtils.isEmpty(strA)) {
            strA = bio.a("ro.product.hn_model");
            if (TextUtils.isEmpty(strA)) {
                strA = Build.MODEL;
            }
        }
        bir.e("DeviceUtil", "phoneType:" + strA);
        return strA;
    }

    public static String c(Context context) {
        String str = (String) f1126b.get("DPI");
        if (str != null) {
            return str;
        }
        f(context);
        return (String) f1126b.get("DPI");
    }

    public static String b() {
        String strD;
        try {
            strD = com.hihonor.android.os.Build.MAGIC_VERSION;
        } catch (Error | Exception unused) {
            strD = bio.d("ro.build.version.magic", "");
        }
        bir.e("DeviceUtil", "magicVer:" + strD);
        return strD;
    }

    public static String d(Context context) {
        String str = (String) f1126b.get("RESOLUTION");
        if (str != null) {
            return str;
        }
        f(context);
        return (String) f1126b.get("RESOLUTION");
    }

    public static int a() {
        int iE;
        try {
            iE = com.hihonor.android.os.Build.VERSION.MAGIC_SDK_INT;
        } catch (Error | Exception unused) {
            iE = bio.e("ro.build.magic_api_level", 0);
        }
        bir.e("DeviceUtil", "magicApiLevel:" + iE);
        return iE;
    }

    public static String d() {
        return String.valueOf(Build.DISPLAY);
    }

    public static DisplayMetrics a(Context context) {
        Display defaultDisplay;
        WindowManager windowManager = (WindowManager) context.getSystemService(Constants.NATIVE_WINDOW_SUB_DIR);
        if (windowManager == null || (defaultDisplay = windowManager.getDefaultDisplay()) == null) {
            return null;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        return displayMetrics;
    }

    public static String c() {
        return bio.a(SystemUtils.PRODUCT_BRAND);
    }

    public static int b(Context context) {
        if (e(context)) {
            return 1;
        }
        if (i(context)) {
            return 2;
        }
        return j(context) ? 7 : 0;
    }
}
