package com.xiaomi.channel.commonutils.android;

import android.annotation.TargetApi;
import android.app.AppOpsManager;
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
import com.huami.sleep.sleephome.ui.SleepHomeActivity;
import com.xiaomi.push.z;

/* JADX INFO: loaded from: classes18.dex */
public class a {
    private static InterfaceC0773a a;

    /* JADX INFO: renamed from: com.xiaomi.channel.commonutils.android.a$a, reason: collision with other inner class name */
    public interface InterfaceC0773a {
        boolean a(Context context, String str);

        boolean b(Context context, String str);
    }

    public enum b {
        UNKNOWN(0),
        ALLOWED(1),
        NOT_ALLOWED(2);


        /* JADX INFO: renamed from: a, reason: collision with other field name */
        private final int f29a;

        b(int i) {
            this.f29a = i;
        }

        public int a() {
            return this.f29a;
        }
    }

    public static int a(Context context) {
        Bundle bundle;
        if (context == null) {
            return 0;
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo("com.android.systemui", 128);
            if (applicationInfo == null || (bundle = applicationInfo.metaData) == null) {
                return 0;
            }
            return bundle.getInt("SupportForPushVersionCode");
        } catch (PackageManager.NameNotFoundException unused) {
            return 0;
        }
    }

    public static int a(Context context, String str) {
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

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static Drawable m3416a(Context context, String str) {
        ApplicationInfo applicationInfoD = d(context, str);
        Drawable drawableLoadIcon = null;
        if (applicationInfoD != null) {
            try {
                drawableLoadIcon = applicationInfoD.loadIcon(context.getPackageManager());
                if (drawableLoadIcon == null) {
                    drawableLoadIcon = applicationInfoD.loadLogo(context.getPackageManager());
                }
            } catch (Exception e) {
                com.xiaomi.channel.commonutils.logger.b.m3434a("get app icon drawable failed, " + e);
            }
        }
        return drawableLoadIcon != null ? drawableLoadIcon : new ColorDrawable(0);
    }

    @TargetApi(19)
    public static b a(Context context, String str, boolean z) {
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
            Integer num = (Integer) z.a((Class<? extends Object>) AppOpsManager.class, "OP_POST_NOTIFICATION");
            if (num == null) {
                return bVar;
            }
            Integer num2 = (Integer) z.a(context.getSystemService("appops"), "checkOpNoThrow", num, Integer.valueOf(applicationInfo.uid), str);
            int i = (Integer) z.a((Class<? extends Object>) AppOpsManager.class, "MODE_ALLOWED");
            int i2 = (Integer) z.a((Class<? extends Object>) AppOpsManager.class, "MODE_IGNORED");
            com.xiaomi.channel.commonutils.logger.b.b(String.format("get app mode %s|%s|%s", num2, i, i2));
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
            com.xiaomi.channel.commonutils.logger.b.m3434a("get app op error " + th);
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static String m3417a(Context context, String str) {
        PackageInfo packageInfo;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(str, 16384);
        } catch (Exception unused) {
            packageInfo = null;
        }
        return packageInfo != null ? packageInfo.versionName : "1.0";
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static boolean m3418a(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            return false;
        }
        if (!f.m3426a()) {
            return context.getPackageName().equals(str);
        }
        InterfaceC0773a interfaceC0773a = a;
        return interfaceC0773a != null && interfaceC0773a.a(context, str);
    }

    public static int b(Context context, String str) {
        ApplicationInfo applicationInfoD = d(context, str);
        if (applicationInfoD == null) {
            return 0;
        }
        int i = applicationInfoD.icon;
        return i == 0 ? applicationInfoD.logo : i;
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public static String m3419b(Context context, String str) {
        ApplicationInfo applicationInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 0);
            return (packageInfo == null || (applicationInfo = packageInfo.applicationInfo) == null) ? str : packageManager.getApplicationLabel(applicationInfo).toString();
        } catch (PackageManager.NameNotFoundException unused) {
            return str;
        }
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public static boolean m3420b(Context context, String str) {
        InterfaceC0773a interfaceC0773a = a;
        return interfaceC0773a != null && interfaceC0773a.b(context, str);
    }

    public static boolean c(Context context, String str) {
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

    private static ApplicationInfo d(Context context, String str) {
        if (str.equals(context.getPackageName())) {
            return context.getApplicationInfo();
        }
        try {
            return context.getPackageManager().getApplicationInfo(str, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            com.xiaomi.channel.commonutils.logger.b.m3434a("not found app info " + str);
            return null;
        }
    }

    private static b e(Context context, ApplicationInfo applicationInfo) {
        int i = Build.VERSION.SDK_INT;
        if (applicationInfo == null || i < 24) {
            return b.UNKNOWN;
        }
        Boolean boolValueOf = null;
        try {
            if (applicationInfo.packageName.equals(context.getPackageName())) {
                boolValueOf = Boolean.valueOf(((NotificationManager) context.getSystemService(SleepHomeActivity.FROM_NOTIFICATION)).areNotificationsEnabled());
            } else {
                Object objA = i >= 29 ? z.a(context.getSystemService(SleepHomeActivity.FROM_NOTIFICATION), "getService", new Object[0]) : context.getSystemService("security");
                if (objA != null) {
                    boolValueOf = (Boolean) z.b(objA, "areNotificationsEnabledForPackage", applicationInfo.packageName, Integer.valueOf(applicationInfo.uid));
                }
            }
            if (boolValueOf != null) {
                return boolValueOf.booleanValue() ? b.ALLOWED : b.NOT_ALLOWED;
            }
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.b.m3434a("are notifications enabled error " + e);
        }
        return b.UNKNOWN;
    }
}
