package com.xiaomi.channel.commonutils.android;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.PowerManager;
import android.provider.Settings;
import android.text.TextUtils;
import com.xiaomi.push.ad;
import com.xiaomi.push.z;

/* JADX INFO: loaded from: classes18.dex */
public class c {
    private static String a;
    private static String b;
    private static String c;
    private static final String[] d = {"--", "a-", "u-", "v-", "o-", "g-"};

    @TargetApi(17)
    public static int a() {
        Object objA = z.a("android.os.UserHandle", "myUserId", new Object[0]);
        if (objA == null) {
            return -1;
        }
        return ((Integer) Integer.class.cast(objA)).intValue();
    }

    public static String a(Context context) {
        if (b == null) {
            b = b() + ad.b(c(context));
        }
        return b;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static boolean m3421a(Context context) {
        try {
            return !d.a(context).b();
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.b.m3434a("failure to read gaid limit:" + e.getMessage());
            return true;
        }
    }

    public static boolean a(Context context, String str) {
        ApplicationInfo applicationInfo;
        PackageInfo packageInfo = (PackageInfo) z.a((Object) context.getPackageManager(), "getPackageInfoAsUser", str, 0, 999);
        if (packageInfo != null && (applicationInfo = packageInfo.applicationInfo) != null) {
            int i = applicationInfo.flags;
            if ((i & 2097152) != 2097152 || (i & 8388608) == 8388608) {
                return false;
            }
        }
        return true;
    }

    public static boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        for (String str2 : d) {
            if (str.startsWith(str2)) {
                return true;
            }
        }
        return false;
    }

    private static String b() {
        String[] strArr = d;
        return 5 >= strArr.length ? strArr[0] : strArr[5];
    }

    public static String b(Context context) {
        if (!m3421a(context)) {
            return null;
        }
        try {
            return d.a(context).a();
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.b.m3434a("failure to get gaid:" + e.getMessage());
            return null;
        }
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public static boolean m3422b(Context context) {
        Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver == null) {
            return false;
        }
        int intExtra = intentRegisterReceiver.getIntExtra("status", -1);
        return intExtra == 2 || intExtra == 5;
    }

    public static String c(Context context) {
        String str = a;
        if (str != null) {
            return str;
        }
        try {
            a = Settings.Secure.getString(context.getContentResolver(), "android_id");
        } catch (Throwable th) {
            com.xiaomi.channel.commonutils.logger.b.m3434a("failure to get androidId: " + th);
        }
        return a;
    }

    /* JADX INFO: renamed from: c, reason: collision with other method in class */
    public static boolean m3423c(Context context) {
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        return powerManager == null || powerManager.isScreenOn();
    }

    public static synchronized String d(Context context) {
        String str = c;
        if (str != null) {
            return str;
        }
        String strB = ad.b(c(context));
        c = strB;
        return strB;
    }

    public static synchronized String e(Context context) {
        return ad.b(c(context));
    }
}
