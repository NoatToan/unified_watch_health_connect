package com.huawei.hms.ads.uiengineloader;

import android.os.Build;
import android.text.TextUtils;
import com.huawei.hms.framework.common.EmuiUtil;

/* JADX INFO: loaded from: classes10.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f12908a = 27;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f12909b = "DeviceUtil";

    private static boolean d() {
        try {
            return Build.MANUFACTURER.equalsIgnoreCase("HONOR") && Build.VERSION.SDK_INT >= 31 && com.hihonor.android.os.Build.VERSION.MAGIC_SDK_INT >= 33;
        } catch (Throwable th) {
            af.d(f12909b, "isHonor6UpPhone Error:" + th.getClass().getSimpleName());
            return false;
        }
    }

    private static boolean c() {
        String strA = a("ro.build.2b2c.partner.ext_channel");
        return !TextUtils.isEmpty(strA) && strA.startsWith(com.huawei.hms.ads.dynamic.a.t);
    }

    private static boolean b() {
        if (a()) {
            return true;
        }
        String strA = a("ro.build.2b2c.partner.ext_channel");
        return !TextUtils.isEmpty(strA) && strA.startsWith(com.huawei.hms.ads.dynamic.a.t);
    }

    public static boolean a() {
        Object th;
        boolean z = false;
        try {
            boolean z2 = Build.BRAND.equalsIgnoreCase("HUAWEI") || Build.MANUFACTURER.equalsIgnoreCase("HUAWEI") || Build.BRAND.equalsIgnoreCase("HONOR") || Build.MANUFACTURER.equalsIgnoreCase("HONOR");
            if (z2) {
                return z2;
            }
            try {
                return ((Integer) Class.forName(EmuiUtil.BUILDEX_VERSION).getDeclaredField(EmuiUtil.EMUI_SDK_INT).get(null)).intValue() > 0;
            } catch (Throwable th2) {
                th = th2;
                z = z2;
                af.d(f12909b, "isHuaweiPhone Error:" + th.getClass().getSimpleName());
                return z;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static String a(String str) {
        Class<?> cls;
        try {
            if (Build.VERSION.SDK_INT >= 27) {
                try {
                    cls = Class.forName(d() ? "com.hihonor.android.os.SystemPropertiesEx" : "com.huawei.android.os.SystemPropertiesEx");
                } catch (ClassNotFoundException unused) {
                    cls = Class.forName("android.os.SystemProperties");
                }
            } else {
                cls = Class.forName("android.os.SystemProperties");
            }
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Throwable th) {
            af.c(f12909b, "getSystemProperties Exception:" + th.getClass().getSimpleName());
            return null;
        }
    }
}
