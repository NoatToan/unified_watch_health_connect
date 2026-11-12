package com.huawei.updatesdk.sdk.foundation.utils.device;

import android.app.UiModeManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.FeatureInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.LocaleList;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.Window;
import android.view.WindowManager;
import com.huawei.android.app.PackageManagerEx;
import com.huawei.hms.android.SystemUtils;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.constant.SystemProperties;
import com.huawei.system.BuildEx;
import com.huawei.updatesdk.sdk.foundation.utils.f;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes20.dex */
public class c {
    private static int e = -1;
    private static int f = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f29906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f29907b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f29908c;
    private static c g = new c();
    private static String h = null;
    private static int l = -1;
    public static final String d = a(SystemUtils.PRODUCT_BRAND, "");
    public static final boolean i = a("hw_sc.product.useBrandCust", false);
    public static final int j = a(SystemProperties.HW_SC_BUILD_OS_API_VERSION, 0);
    public static final String k = g();

    public int h() {
        return this.f29908c;
    }

    public int f() {
        return this.f29907b;
    }

    public int e() {
        return this.f29906a;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0049  */
    /* JADX WARN: Code duplicated, block: B:22:0x004a A[Catch: all -> 0x0076, TRY_LEAVE, TryCatch #0 {all -> 0x0076, blocks: (B:9:0x001e, B:11:0x0025, B:12:0x0028, B:18:0x0041, B:22:0x004a, B:15:0x0035), top: B:27:0x001e }] */
    public void a(Window window) {
        Class<?> cls;
        String str;
        if ((com.huawei.updatesdk.service.util.a.d().b() >= 21 || com.huawei.updatesdk.service.util.a.d().e() > 0) && window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            try {
                if (Build.VERSION.SDK_INT >= 28) {
                    attributes.layoutInDisplayCutoutMode = 1;
                }
                if (com.huawei.updatesdk.service.util.a.d().b() <= 0) {
                    if (com.huawei.updatesdk.service.util.a.d().e() > 0) {
                        str = "com.hihonor.android.view.WindowManagerEx$LayoutParamsEx";
                    } else {
                        cls = null;
                    }
                    if (cls == null) {
                        return;
                    }
                    cls.getMethod("setDisplaySideMode", Integer.TYPE).invoke(cls.getConstructor(WindowManager.LayoutParams.class).newInstance(attributes), 1);
                }
                str = "com.huawei.android.view.WindowManagerEx$LayoutParamsEx";
                cls = Class.forName(str);
                if (cls == null) {
                    return;
                }
                cls.getMethod("setDisplaySideMode", Integer.TYPE).invoke(cls.getConstructor(WindowManager.LayoutParams.class).newInstance(attributes), 1);
            } catch (Throwable th) {
                com.huawei.updatesdk.sdk.foundation.log.ecs.mtk.a.b("DeviceUtil", "setWindowDisplaySideMode exception: " + th.getMessage());
            }
        }
    }

    private static boolean o() {
        return a("com.huawei.software.features.kidpad");
    }

    public static boolean n() {
        return com.huawei.updatesdk.service.util.a.d().b() > 0 || com.huawei.updatesdk.service.util.a.d().e() > 0;
    }

    public static String m() {
        String language;
        String script;
        String country;
        Locale locale = Locale.getDefault();
        if (locale != null) {
            language = locale.getLanguage();
            script = locale.getScript();
            country = locale.getCountry();
        } else {
            language = "en";
            script = "";
            country = "US";
        }
        if (TextUtils.isEmpty(script)) {
            return language + "_" + country;
        }
        return language + "_" + script + "_" + country;
    }

    private static boolean l(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.type.watch");
    }

    public static int l() {
        return a("ro.product.cpu.abi", "").contains("arm64") ? 2 : 1;
    }

    public static String[] k() {
        String[] strArr = Build.SUPPORTED_ABIS;
        return strArr == null ? new String[0] : strArr;
    }

    private static boolean k(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getSystemService("uimode");
        com.huawei.updatesdk.sdk.foundation.a.b("DeviceUtil", "UI mode: " + uiModeManager.getCurrentModeType());
        return uiModeManager.getCurrentModeType() == 4;
    }

    public static boolean j(Context context) {
        PackageManager packageManager = context.getPackageManager();
        try {
            packageManager.getPackageInfo("com.google.android.gsf.login", 16);
            packageManager.getPackageInfo("com.google.android.gsf", 16);
            ApplicationInfo applicationInfo = packageManager.getPackageInfo("com.google.android.gms", 16).applicationInfo;
            return (applicationInfo == null || (applicationInfo.flags & 1) == 0) ? false : true;
        } catch (Exception e2) {
            com.huawei.updatesdk.sdk.foundation.log.ecs.mtk.a.d("DeviceUtil", e2.getMessage());
            return false;
        }
    }

    public static int j() {
        int i2 = f;
        if (i2 != -1) {
            return i2;
        }
        f = i();
        com.huawei.updatesdk.sdk.foundation.log.ecs.mtk.a.c("DeviceUtil", "subBrand: " + f);
        return f;
    }

    private static boolean i(Context context) {
        return context.getPackageManager().hasSystemFeature("com.huawei.software.features.car");
    }

    private static int i() {
        try {
            if (i) {
                return 4;
            }
            if (!"HONOR".equalsIgnoreCase(d)) {
                return 0;
            }
            com.huawei.updatesdk.service.device.c cVarA = com.huawei.updatesdk.service.device.b.a();
            String strD = cVarA.d();
            if ("HUAWEI".equalsIgnoreCase(strD)) {
                return 1;
            }
            if ("HONOR".equalsIgnoreCase(strD)) {
                return b(cVarA.b()) ? 2 : 3;
            }
            return 0;
        } catch (Throwable th) {
            com.huawei.updatesdk.sdk.foundation.log.ecs.mtk.a.b("DeviceUtil", "getSubBrand e: " + th.getMessage());
            return 0;
        }
    }

    private static boolean h(Context context) {
        boolean zHasSystemFeature = context.getPackageManager().hasSystemFeature("android.hardware.type.automotive");
        if (zHasSystemFeature) {
            return zHasSystemFeature;
        }
        return com.huawei.updatesdk.service.util.b.d(context, "com.huawei.appmarket.car.bmw") != null;
    }

    public static String g(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 16).versionName + "";
        } catch (Exception e2) {
            com.huawei.updatesdk.sdk.foundation.log.ecs.mtk.a.a("DeviceUtil", "Exception while get version name from system: ", e2);
            return null;
        }
    }

    private static String g() {
        try {
            return BuildEx.getOsBrand();
        } catch (Throwable th) {
            com.huawei.updatesdk.sdk.foundation.log.ecs.mtk.a.b("DeviceUtil", "getOsBrand e: " + th.getMessage());
            return null;
        }
    }

    public static int f(Context context) {
        try {
            return Integer.parseInt(context.getPackageManager().getPackageInfo(context.getPackageName(), 16).versionCode + "");
        } catch (Exception e2) {
            com.huawei.updatesdk.sdk.foundation.log.ecs.mtk.a.a("DeviceUtil", "Exception while get version code from system: ", e2);
            return 1;
        }
    }

    public static String e(Context context) {
        DisplayMetrics displayMetricsB = b(context);
        return displayMetricsB != null ? String.valueOf(displayMetricsB.densityDpi) : "";
    }

    public static String d(Context context) {
        DisplayMetrics displayMetricsB = b(context);
        if (displayMetricsB == null) {
            return "";
        }
        return String.valueOf(displayMetricsB.widthPixels) + "_" + String.valueOf(displayMetricsB.heightPixels);
    }

    public static String d() {
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        String country = locale.getCountry();
        String variant = locale.getVariant();
        String script = locale.getScript();
        if (TextUtils.isEmpty(script) && TextUtils.isEmpty(variant)) {
            return language + "_" + country;
        }
        return language + "_" + script + "_" + country + "_" + variant;
    }

    public static List<String> c(Context context) {
        ArrayList arrayList = new ArrayList();
        LocaleList locales = context.getResources().getConfiguration().getLocales();
        for (int i2 = 0; i2 < locales.size(); i2++) {
            String language = locales.get(i2).getLanguage();
            if (!TextUtils.isEmpty(language) && !arrayList.contains(language)) {
                arrayList.add(language);
            }
        }
        return arrayList;
    }

    public static c c() {
        return g;
    }

    private static boolean b(String str) {
        com.huawei.updatesdk.sdk.foundation.log.ecs.mtk.a.c("DeviceUtil", "hasInstallPackagesPermission pkg: " + str);
        int i2 = l;
        if (i2 != -1) {
            return i2 == 2;
        }
        try {
            if (com.huawei.updatesdk.sdk.service.app.a.c().a().getPackageManager().checkPermission("android.permission.INSTALL_PACKAGES", str) == 0) {
                l = 2;
            } else {
                com.huawei.updatesdk.sdk.foundation.log.ecs.mtk.a.c("DeviceUtil", "no install package permission");
                l = 1;
            }
        } catch (Exception e2) {
            com.huawei.updatesdk.sdk.foundation.log.ecs.mtk.a.b("DeviceUtil", "check install package permission err: " + e2.getMessage());
            l = 1;
        }
        return l == 2;
    }

    public static String b(Context context, String str) {
        String strA = a(context, str);
        int i2 = 0;
        int i3 = 0;
        while (i2 < strA.length() && i3 < 3) {
            if (strA.charAt(i2) == '.') {
                i3++;
            }
            i2++;
        }
        return 3 == i3 ? strA.substring(0, i2 - 1) : strA;
    }

    private static DisplayMetrics b(Context context) {
        Display defaultDisplay;
        Object systemService = context.getSystemService(Constants.NATIVE_WINDOW_SUB_DIR);
        WindowManager windowManager = systemService instanceof WindowManager ? (WindowManager) systemService : null;
        if (windowManager == null || (defaultDisplay = windowManager.getDefaultDisplay()) == null) {
            return null;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        return displayMetrics;
    }

    public static int b() {
        int i2;
        int i3 = e;
        if (i3 >= 0) {
            return i3;
        }
        Context contextA = com.huawei.updatesdk.sdk.service.app.a.c().a();
        if (k(contextA)) {
            i2 = 1;
        } else if (l(contextA)) {
            i2 = 2;
        } else if (h(contextA)) {
            i2 = 3;
        } else if (o()) {
            i2 = 4;
        } else {
            i2 = i(contextA) ? 7 : 0;
        }
        e = i2;
        return i2;
    }

    static boolean a(String str, String[] strArr) {
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        for (String str2 : strArr) {
            if (str2.startsWith("config.")) {
                i2 = 1;
            } else if (!str2.contains(".config.")) {
                i3++;
            }
            if (str2.endsWith("config." + str)) {
                i4++;
            }
        }
        return i2 + i3 == i4;
    }

    private static boolean a(String str, boolean z) {
        try {
            return ((Boolean) Class.forName("android.os.SystemProperties").getMethod("getBoolean", String.class, Boolean.TYPE).invoke(null, str, Boolean.valueOf(z))).booleanValue();
        } catch (Throwable th) {
            com.huawei.updatesdk.sdk.foundation.log.ecs.mtk.a.a("DeviceUtil", "Exception while getting system property: ", th);
            return z;
        }
    }

    private static boolean a(String str) {
        try {
            return PackageManagerEx.hasHwSystemFeature(str);
        } catch (Throwable th) {
            com.huawei.updatesdk.sdk.foundation.log.ecs.mtk.a.b("DeviceUtil", "hasHwSystemFeature e: " + th.getMessage());
            return false;
        }
    }

    private static void a(FeatureInfo[] featureInfoArr, List<String> list) {
        if (featureInfoArr != null) {
            for (FeatureInfo featureInfo : featureInfoArr) {
                String str = featureInfo.name;
                if (str != null) {
                    list.add(com.huawei.updatesdk.sdk.foundation.utils.c.a(str));
                }
            }
        }
    }

    private static void a(List<String> list) {
        try {
            a(PackageManagerEx.getHwSystemAvailableFeatures(), list);
        } catch (Throwable th) {
            com.huawei.updatesdk.sdk.foundation.log.ecs.mtk.a.c("DeviceUtil", "initHwDeviceFeatures: " + th.getMessage());
        }
    }

    private static void a(Context context, List<String> list) {
        a(context.getPackageManager().getSystemAvailableFeatures(), list);
    }

    public static List<String> a(List<String> list, String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (!a(str, strArr)) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    public static String a(String str, String str2) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, str2);
        } catch (Throwable th) {
            com.huawei.updatesdk.sdk.foundation.log.ecs.mtk.a.a("DeviceUtil", "Exception while getting system property: ", th);
            return str2;
        }
    }

    public static String a(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 16).versionName + "";
        } catch (Exception e2) {
            com.huawei.updatesdk.sdk.foundation.log.ecs.mtk.a.a("DeviceUtil", "Exception while get store version name from system: ", e2);
            return "";
        }
    }

    static String a(Context context) {
        if (h == null) {
            ArrayList arrayList = new ArrayList();
            a(context, arrayList);
            a(arrayList);
            h = f.a(arrayList, ",");
        }
        return h;
    }

    public static String a() {
        try {
            Object obj = Class.forName("com.huawei.system.BuildEx").getField("DISPLAY").get(null);
            return obj == null ? Build.DISPLAY : obj.toString();
        } catch (Throwable th) {
            com.huawei.updatesdk.sdk.foundation.log.ecs.mtk.a.b("DeviceUtil", "Exception while get build version: " + th.getMessage());
            return Build.DISPLAY;
        }
    }

    public static int a(String str, int i2) {
        try {
            return ((Integer) Class.forName("android.os.SystemProperties").getMethod("getInt", String.class, Integer.TYPE).invoke(null, str, Integer.valueOf(i2))).intValue();
        } catch (Throwable th) {
            com.huawei.updatesdk.sdk.foundation.log.ecs.mtk.a.a("DeviceUtil", "Exception while getting system property: ", th);
            return i2;
        }
    }

    private c() {
        this.f29906a = 0;
        if (a("ro.maple.enable", 0) == 1) {
            this.f29906a = 1;
        }
        this.f29907b = a("ro.build.version.ark", 0);
        this.f29908c = a("ro.kernel.evox", 0);
    }
}
