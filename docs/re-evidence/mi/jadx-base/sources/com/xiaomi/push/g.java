package com.xiaomi.push;

import android.annotation.TargetApi;
import android.app.AppOpsManager;
import android.app.Application;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.text.TextUtils;
import com.miui.tsmclient.util.Constants;
import defpackage.x9s;
import defpackage.y0t;
import defpackage.zbs;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class g {

    public enum b {
        UNKNOWN(0),
        ALLOWED(1),
        NOT_ALLOWED(2);


        /* JADX INFO: renamed from: a, reason: collision with other field name */
        private final int f82a;

        b(int i) {
            this.f82a = i;
        }

        public int a() {
            return this.f82a;
        }
    }

    public static int a(Context context) {
        Bundle bundle;
        if (context == null) {
            return 0;
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(Constants.PACKAGE_NAME_SYSTEM_UI, 128);
            if (applicationInfo == null || (bundle = applicationInfo.metaData) == null) {
                return 0;
            }
            return bundle.getInt("SupportForPushVersionCode");
        } catch (PackageManager.NameNotFoundException unused) {
            return 0;
        }
    }

    public static int b(Context context, String str) {
        PackageInfo packageInfo;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(str, 16384);
        } catch (Exception unused) {
            packageInfo = null;
        }
        if (packageInfo != null) {
            return packageInfo.versionCode;
        }
        return 0;
    }

    public static ApplicationInfo c(Context context, String str) {
        if (str.equals(context.getPackageName())) {
            return context.getApplicationInfo();
        }
        try {
            return context.getPackageManager().getApplicationInfo(str, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            x9s.o("not found app info " + str);
            return null;
        }
    }

    public static Drawable d(Context context, String str) {
        ApplicationInfo applicationInfoC = c(context, str);
        Drawable drawableLoadIcon = null;
        if (applicationInfoC != null) {
            try {
                drawableLoadIcon = applicationInfoC.loadIcon(context.getPackageManager());
                if (drawableLoadIcon == null) {
                    drawableLoadIcon = applicationInfoC.loadLogo(context.getPackageManager());
                }
            } catch (Exception e) {
                x9s.o("get app icon drawable failed, " + e);
            }
        }
        return drawableLoadIcon != null ? drawableLoadIcon : new ColorDrawable(0);
    }

    public static b e(Context context, ApplicationInfo applicationInfo) {
        Boolean boolValueOf;
        int i = Build.VERSION.SDK_INT;
        if (applicationInfo == null) {
            return b.UNKNOWN;
        }
        try {
            if (applicationInfo.packageName.equals(context.getPackageName())) {
                boolValueOf = Boolean.valueOf(((NotificationManager) context.getSystemService("notification")).areNotificationsEnabled());
            } else {
                Object objE = i >= 29 ? zbs.e(context.getSystemService("notification"), "getService", new Object[0]) : context.getSystemService("security");
                boolValueOf = objE != null ? (Boolean) zbs.n(objE, "areNotificationsEnabledForPackage", applicationInfo.packageName, Integer.valueOf(applicationInfo.uid)) : null;
            }
            if (boolValueOf != null) {
                return boolValueOf.booleanValue() ? b.ALLOWED : b.NOT_ALLOWED;
            }
        } catch (Exception e) {
            x9s.o("are notifications enabled error " + e);
        }
        return b.UNKNOWN;
    }

    @TargetApi(19)
    public static b f(Context context, String str, boolean z) {
        if (context == null || TextUtils.isEmpty(str)) {
            return b.UNKNOWN;
        }
        try {
            ApplicationInfo applicationInfo = str.equals(context.getPackageName()) ? context.getApplicationInfo() : context.getPackageManager().getApplicationInfo(str, 0);
            b bVarE = e(context, applicationInfo);
            b bVar = b.UNKNOWN;
            if (bVarE != bVar) {
                return bVarE;
            }
            Integer num = (Integer) zbs.b(AppOpsManager.class, "OP_POST_NOTIFICATION");
            if (num == null) {
                return bVar;
            }
            Integer num2 = (Integer) zbs.e((AppOpsManager) context.getSystemService("appops"), "checkOpNoThrow", num, Integer.valueOf(applicationInfo.uid), str);
            int i = (Integer) zbs.b(AppOpsManager.class, "MODE_ALLOWED");
            int i2 = (Integer) zbs.b(AppOpsManager.class, "MODE_IGNORED");
            x9s.y(String.format("get app mode %s|%s|%s", num2, i, i2));
            if (i == null) {
                i = 0;
            }
            if (i2 == null) {
                i2 = 1;
            }
            if (num2 != null) {
                if (z) {
                    return !num2.equals(i2) ? b.ALLOWED : b.NOT_ALLOWED;
                }
                return num2.equals(i) ? b.ALLOWED : b.NOT_ALLOWED;
            }
            return b.UNKNOWN;
        } catch (Throwable th) {
            x9s.o("get app op error " + th);
        }
    }

    public static String g() {
        String processName = Build.VERSION.SDK_INT >= 28 ? Application.getProcessName() : (String) zbs.g("android.app.ActivityThread", "currentProcessName", new Object[0]);
        return !TextUtils.isEmpty(processName) ? processName : "";
    }

    public static String h(Context context, String str) {
        PackageInfo packageInfo;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(str, 16384);
        } catch (Exception unused) {
            packageInfo = null;
        }
        return packageInfo != null ? packageInfo.versionName : "1.0";
    }

    public static Map<String, String> i(Context context, String str) {
        return null;
    }

    public static void j(Context context, ApplicationInfo applicationInfo, boolean z) {
        int i = Build.VERSION.SDK_INT;
        if (b.ALLOWED != e(context, applicationInfo)) {
            try {
                Object objE = i >= 29 ? zbs.e(context.getSystemService("notification"), "getService", new Object[0]) : context.getSystemService("security");
                if (objE != null) {
                    zbs.n(objE, "setNotificationsEnabledForPackage", applicationInfo.packageName, Integer.valueOf(applicationInfo.uid), Boolean.valueOf(z));
                }
            } catch (Exception e) {
                x9s.o("set notifications enabled error " + e);
            }
        }
    }

    public static boolean k(Context context) {
        String strG = g();
        if (TextUtils.isEmpty(strG) || context == null) {
            return false;
        }
        return strG.equals(context.getPackageName());
    }

    public static boolean l(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str) || y0t.i()) {
            return false;
        }
        return context.getPackageName().equals(str);
    }

    public static int m(Context context, String str) {
        ApplicationInfo applicationInfoC = c(context, str);
        if (applicationInfoC == null) {
            return 0;
        }
        int i = applicationInfoC.icon;
        return i == 0 ? applicationInfoC.logo : i;
    }

    public static String n(Context context, String str) {
        ApplicationInfo applicationInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 0);
            return (packageInfo == null || (applicationInfo = packageInfo.applicationInfo) == null) ? str : packageManager.getApplicationLabel(applicationInfo).toString();
        } catch (PackageManager.NameNotFoundException unused) {
            return str;
        }
    }

    public static boolean o(Context context, String str) {
        return false;
    }

    public static boolean p(Context context, String str) {
        PackageInfo packageInfo;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            packageInfo = null;
        }
        return packageInfo != null;
    }

    public static boolean q(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            if (Settings.Secure.getInt(context.getContentResolver(), "freeform_window_state", -1) >= 0) {
                return str.equals(Settings.Secure.getString(context.getContentResolver(), "freeform_package_name"));
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }
}
