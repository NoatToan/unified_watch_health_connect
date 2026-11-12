package com.huawei.wear.wallet.ui.dialog;

import android.content.Context;
import android.os.Build;
import android.os.SystemProperties;
import com.huawei.hms.android.SystemUtils;
import com.huawei.hms.framework.common.ReflectionUtils;
import defpackage.xnd;
import defpackage.yfk;

/* JADX INFO: loaded from: classes46.dex */
public class WidgetBuilder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f30721a = "com.huawei.wear.wallet.ui.dialog.WidgetBuilder";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f30722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static IBuilder f30723c;
    private static boolean e;

    public interface IBuilder {
        HwDialogInterface createDialog(Context context);

        HwProgressDialogInterface createProgressDialog(Context context);
    }

    static {
        c("com.huawei.cp3.widget.custom.BuilderCustom");
        e = "HONOR".equalsIgnoreCase(SystemProperties.get(SystemUtils.PRODUCT_BRAND, "")) && !SystemProperties.getBoolean("ro.config.hw_themeInsulate", false);
        f30722b = SystemProperties.getBoolean("ro.config.hw_novaThemeSupport", false);
    }

    public static void d(IBuilder iBuilder) {
        f30723c = iBuilder;
    }

    public static HwDialogInterface c(Context context) {
        return e().createDialog(context);
    }

    public static HwProgressDialogInterface a(Context context) {
        return e().createProgressDialog(context);
    }

    private static boolean c(String str) {
        try {
            Class.forName(str);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    private static IBuilder e() {
        if (f30723c == null) {
            f30723c = new yfk();
        }
        return f30723c;
    }

    public static boolean d(Context context) {
        if (c()) {
            xnd.d(f30721a, "getPhoneIsPad isSupportOrientation: false & isHuaweiMateX");
            return false;
        }
        if (context == null) {
            xnd.a(f30721a, "getPhoneIsPad context == null & false");
            return false;
        }
        boolean zB = b(context);
        xnd.d(f30721a, "getPhoneIsPad = " + zB);
        return zB;
    }

    public static boolean c() {
        if ("HUAWEI".equalsIgnoreCase(Build.BRAND)) {
            return Build.DEVICE.contains("RLI") || Build.DEVICE.contains("HWTAH") || Build.DEVICE.contains("TAH-AN00");
        }
        return false;
    }

    private static boolean b(Context context) {
        String str;
        String str2 = f30721a;
        xnd.d(str2, "getPhoneIsPad isPad start");
        Object objInvokeStaticMethod = ReflectionUtils.invokeStaticMethod("android.os.SystemProperties", "get", new Class[]{String.class}, "ro.build.characteristics");
        if (!(objInvokeStaticMethod instanceof String)) {
            str = "default";
        } else {
            str = (String) objInvokeStaticMethod;
        }
        boolean zEquals = "tablet".equals(str);
        xnd.d(str2, "getPhoneIsPad check isPad = " + zEquals);
        return zEquals;
    }
}
