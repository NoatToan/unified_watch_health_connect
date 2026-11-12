package defpackage;

import android.annotation.TargetApi;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.PowerManager;
import android.os.StatFs;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.facebook.react.modules.deviceinfo.DeviceInfoModule;
import com.mi.fitness.netproxy.NetProxyComponentKt;
import com.miui.tsmclient.util.Constants;
import com.xiaomi.accountsdk.account.AccountIntent;
import com.xiaomi.fitness.login.region.RegionManagerImpl;
import com.xiaomi.fitness.userinfo.collect.Category;
import com.xiaomi.smarthome.frame.server_compact.ServerConstants;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes11.dex */
public class lzs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f25594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f25595b;
    public static String c;
    public static final String d = String.valueOf((char) 2);
    public static final String[] e = {"--", "a-", "u-", "v-", "o-", "g-", "d-"};
    public static final Set<String> f;
    public static boolean g;

    static {
        HashSet hashSet = new HashSet();
        f = hashSet;
        hashSet.add("com.xiaomi.xmsf");
        hashSet.add(AccountIntent.PACKAGE_NAME_FIND_DEVICE);
        hashSet.add(Constants.PACKAGE_NAME_SECURITYCENTER);
        g = true;
    }

    public static synchronized String A(Context context) {
        return qcs.k(p(context) + ((String) null));
    }

    public static String B(Context context) {
        return ((TelephonyManager) context.getSystemService("phone")).getSimOperatorName();
    }

    @Deprecated
    public static String C(Context context) {
        return "";
    }

    public static String D(Context context) {
        String string = context.getSharedPreferences(Category.DEVICE_INFO, 0).getString("default_id", null);
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        String strE = E(context);
        i(context, strE);
        return strE;
    }

    public static String E(Context context) {
        return ecs.a(Build.BRAND + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + Build.MODEL + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + Build.VERSION.SDK_INT + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + Build.VERSION.RELEASE + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + Build.VERSION.INCREMENTAL + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + c() + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + context.getPackageName() + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + System.currentTimeMillis() + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + qcs.a(16));
    }

    public static double a(double d2) {
        int i = 1;
        while (true) {
            double d3 = i;
            if (d3 >= d2) {
                return d3;
            }
            i <<= 1;
        }
    }

    public static float b(int i) {
        float f2 = (((((i + 102400) / 524288) + 1) * 524288) / 1024.0f) / 1024.0f;
        double d2 = f2;
        return d2 > 0.5d ? (float) Math.ceil(d2) : f2;
    }

    @TargetApi(17)
    public static int c() {
        Object objG = zbs.g("android.os.UserHandle", "myUserId", new Object[0]);
        if (objG == null) {
            return -1;
        }
        return ((Integer) Integer.class.cast(objG)).intValue();
    }

    public static long d(File file) {
        StatFs statFs = new StatFs(file.getPath());
        return statFs.getBlockSizeLong() * statFs.getBlockCountLong();
    }

    public static String e() {
        return b(n()) + ServerConstants.GB_COUNTRY_CODE;
    }

    public static String f(int i) {
        if (i > 0) {
            String[] strArr = e;
            if (i < strArr.length) {
                return strArr[i];
            }
        }
        return e[0];
    }

    @Deprecated
    public static String g(Context context) {
        return null;
    }

    public static synchronized String h(Context context, boolean z) {
        int i;
        try {
            if (f25595b == null) {
                String strP = p(context);
                String strT = "";
                if (!y0t.t()) {
                    strT = z ? t(context) : C(context);
                }
                String strG = g(context);
                if (r(strT) && r(strG)) {
                    String strE = k8s.a(context).e();
                    if (TextUtils.isEmpty(strE)) {
                        String strA = k8s.a(context).a();
                        if (!TextUtils.isEmpty(strA) && !strA.startsWith("00000000-0000-0000-0000-000000000000")) {
                            i = 4;
                            strP = strA;
                        } else if (TextUtils.isEmpty(strP)) {
                            strP = D(context);
                            i = 6;
                        } else {
                            i = 5;
                        }
                    } else {
                        strP = strE + strP;
                        i = 2;
                    }
                } else {
                    strP = strT + strP + strG;
                    i = 1;
                }
                x9s.y("devid rule select:" + i);
                if (i == 3) {
                    f25595b = strP;
                } else {
                    f25595b = f(i) + qcs.k(strP);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return f25595b;
    }

    public static void i(Context context, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(Category.DEVICE_INFO, 0);
        if (TextUtils.isEmpty(sharedPreferences.getString("default_id", null))) {
            sharedPreferences.edit().putString("default_id", str).apply();
        } else {
            x9s.o("default_id exist,do not change it.");
        }
    }

    public static boolean j() {
        return c() <= 0;
    }

    public static boolean k(Context context) {
        Intent intentC = a5t.c(context, null, new IntentFilter("android.intent.action.BATTERY_CHANGED"), null, null);
        if (intentC == null) {
            return false;
        }
        int intExtra = intentC.getIntExtra("status", -1);
        return intExtra == 2 || intExtra == 5;
    }

    public static boolean l(Context context, String str) {
        ApplicationInfo applicationInfo;
        PackageInfo packageInfo = (PackageInfo) zbs.e(context.getPackageManager(), "getPackageInfoAsUser", str, 0, 999);
        return packageInfo == null || (applicationInfo = packageInfo.applicationInfo) == null || (applicationInfo.flags & NetProxyComponentKt.DEVICE_CAPABILITY_NET_PROXY) != 8388608;
    }

    public static boolean m(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        int i = 0;
        while (true) {
            String[] strArr = e;
            if (i >= strArr.length) {
                return false;
            }
            if (str.startsWith(strArr[i])) {
                return true;
            }
            i++;
        }
    }

    public static int n() throws Throwable {
        BufferedReader bufferedReader;
        Throwable th;
        String[] strArrSplit;
        int i = 0;
        if (new File("/proc/meminfo").exists()) {
            BufferedReader bufferedReader2 = null;
            try {
                try {
                    bufferedReader = new BufferedReader(new FileReader("/proc/meminfo"), 8192);
                    try {
                        String line = bufferedReader.readLine();
                        if (!TextUtils.isEmpty(line) && (strArrSplit = line.split("\\s+")) != null && strArrSplit.length >= 2 && TextUtils.isDigitsOnly(strArrSplit[1])) {
                            i = Integer.parseInt(strArrSplit[1]);
                        }
                        bufferedReader.close();
                    } catch (Exception unused) {
                        bufferedReader2 = bufferedReader;
                        if (bufferedReader2 != null) {
                            bufferedReader2.close();
                        }
                        return i;
                    } catch (Throwable th2) {
                        th = th2;
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException unused2) {
                            }
                        }
                        throw th;
                    }
                } catch (IOException unused3) {
                }
            } catch (Exception unused4) {
            } catch (Throwable th3) {
                bufferedReader = null;
                th = th3;
            }
        }
        return i;
    }

    public static String o() {
        return a(((d(Environment.getDataDirectory()) / 1024.0d) / 1024.0d) / 1024.0d) + ServerConstants.GB_COUNTRY_CODE;
    }

    public static String p(Context context) {
        String str = f25594a;
        if (str != null || !g) {
            return str;
        }
        boolean zU = u(context);
        g = zU;
        if (!zU) {
            return null;
        }
        try {
            f25594a = Settings.Secure.getString(context.getContentResolver(), "android_id");
        } catch (Throwable th) {
            x9s.o("failure to get androidId: " + th);
        }
        return f25594a;
    }

    public static boolean q(Context context) {
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        return powerManager == null || powerManager.isScreenOn();
    }

    public static boolean r(String str) {
        if (str == null) {
            return true;
        }
        String strTrim = str.trim();
        return strTrim.length() == 0 || strTrim.equalsIgnoreCase(AbstractJsonLexerKt.NULL) || strTrim.equalsIgnoreCase("unknown");
    }

    public static String s() {
        return n() + "KB";
    }

    @Deprecated
    public static String t(Context context) {
        return null;
    }

    public static boolean u(Context context) {
        Bundle bundle;
        ApplicationInfo applicationInfo;
        Bundle bundle2;
        if ("com.xiaomi.xmsf".equals(context.getPackageName())) {
            return true;
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 128);
            if (packageInfo != null && (applicationInfo = packageInfo.applicationInfo) != null && (bundle2 = applicationInfo.metaData) != null && bundle2.containsKey("supportGetAndroidID")) {
                boolean z = packageInfo.applicationInfo.metaData.getBoolean("supportGetAndroidID", true);
                x9s.z(DeviceInfoModule.NAME, "Get supportGetAndroidID from app metaData: " + z);
                return z;
            }
        } catch (Exception e2) {
            x9s.t(DeviceInfoModule.NAME, "Check supportGetAndroidID from app metaData error: " + e2.getMessage());
        }
        try {
            Intent intent = new Intent();
            ComponentName componentName = new ComponentName(context.getPackageName(), "com.xiaomi.push.service.XMPushService");
            intent.setComponent(componentName);
            ServiceInfo serviceInfo = context.getPackageManager().getServiceInfo(componentName, 128);
            if (serviceInfo != null && (bundle = serviceInfo.metaData) != null && bundle.containsKey("supportGetAndroidID")) {
                x9s.z(DeviceInfoModule.NAME, "The metaData of XMPushService contains key supportGetAndroidID,so return false.");
                return false;
            }
        } catch (Exception e3) {
            x9s.t(DeviceInfoModule.NAME, "Check supportGetAndroidID from XMPushService metaData error: " + e3.getMessage());
        }
        x9s.z(DeviceInfoModule.NAME, "Not configure the metaData key of supportGetAndroidID，return true by default.");
        return true;
    }

    public static String v() {
        return (d(Environment.getDataDirectory()) / 1024) + "KB";
    }

    @Deprecated
    public static String w(Context context) {
        return null;
    }

    @Deprecated
    public static String x(Context context) {
        return null;
    }

    @Deprecated
    public static String y(Context context) {
        return "";
    }

    public static synchronized String z(Context context) {
        String str = c;
        if (str != null) {
            return str;
        }
        String strK = qcs.k(p(context) + g(context));
        c = strK;
        return strK;
    }
}
