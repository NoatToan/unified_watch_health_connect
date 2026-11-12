package com.huawei.openalliance.ad.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.system.Os;
import android.system.StructStat;
import android.text.TextUtils;
import androidx.media3.common.C;
import com.huawei.hms.android.SystemUtils;
import com.huawei.openalliance.ad.activity.SafeIntent;
import com.huawei.openalliance.ad.beans.inner.CountryCodeBean;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.constant.RTCMethods;
import com.huawei.openalliance.ad.constant.SystemProperties;
import com.huawei.openalliance.ad.fp;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.ipc.CallResult;
import com.huawei.openalliance.ad.mz;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes12.dex */
public class ab {
    public static boolean d() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String z(Context context, cn cnVar) {
        String strN = dg.n(com.huawei.openalliance.ad.cc.a(context).q());
        if (TextUtils.isEmpty(strN)) {
            strN = Constants.NOT_FOUND;
        }
        cnVar.s(strN);
        return strN;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String y(Context context, cn cnVar) {
        String strN = dg.n(com.huawei.openalliance.ad.cc.a(context).p());
        if (TextUtils.isEmpty(strN)) {
            strN = Constants.NOT_FOUND;
        }
        cnVar.r(strN);
        return strN;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String x(Context context, cn cnVar) {
        String strG = dd.g(context);
        String strA = !TextUtils.isEmpty(strG) ? dg.a(ai.c(strG)) : null;
        if (TextUtils.isEmpty(strA)) {
            strA = Constants.NOT_FOUND;
        }
        cnVar.I(strA);
        return strA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String w(Context context, cn cnVar) {
        String strF = dd.f(context);
        String strA = !TextUtils.isEmpty(strF) ? dg.a(ai.c(strF)) : null;
        if (TextUtils.isEmpty(strA)) {
            strA = Constants.NOT_FOUND;
        }
        cnVar.q(strA);
        return strA;
    }

    public static boolean v(final Context context, int i) {
        final cn cnVarA = cn.a(context);
        if (cnVarA.ae() == null) {
            return L(context, cnVarA).booleanValue();
        }
        boolean zBooleanValue = cnVarA.ae().booleanValue();
        if (Cdo.a("isChildMode", i)) {
            o.i(new Runnable() { // from class: com.huawei.openalliance.ad.utils.ab.20
                @Override // java.lang.Runnable
                public void run() {
                    ab.L(context, cnVarA);
                }
            });
        }
        return zBooleanValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String v(Context context, cn cnVar) {
        String strA = dg.a(Long.valueOf(v(context)));
        if (TextUtils.isEmpty(strA)) {
            strA = Constants.NOT_FOUND;
        }
        cnVar.p(strA);
        return strA;
    }

    private static long v(Context context) {
        String strF = dd.f(context);
        if (TextUtils.isEmpty(strF)) {
            return 0L;
        }
        return ai.d(strF).longValue();
    }

    public static boolean u(final Context context, int i) {
        final cn cnVarA = cn.a(context);
        if (cnVarA.ad() == null) {
            return K(context, cnVarA).booleanValue();
        }
        boolean zBooleanValue = cnVarA.ad().booleanValue();
        if (Cdo.a("isWelinkUser", i)) {
            o.i(new Runnable() { // from class: com.huawei.openalliance.ad.utils.ab.19
                @Override // java.lang.Runnable
                public void run() {
                    ab.K(context, cnVarA);
                }
            });
        }
        return zBooleanValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String u(Context context, cn cnVar) {
        long jU = u(context);
        String string = jU > 0 ? Long.toString(jU) : Constants.NOT_FOUND;
        cnVar.o(string);
        return string;
    }

    private static long u(Context context) {
        long jG = com.huawei.openalliance.ad.cc.d(context) ? g() : 0L;
        return jG <= 0 ? h() : jG;
    }

    public static boolean t(final Context context, int i) {
        final cn cnVarA = cn.a(context);
        if (cnVarA.R() == null) {
            return J(context, cnVarA);
        }
        boolean zBooleanValue = cnVarA.R().booleanValue();
        if (Cdo.a("getEmulator", i)) {
            o.i(new Runnable() { // from class: com.huawei.openalliance.ad.utils.ab.17
                @Override // java.lang.Runnable
                public void run() {
                    ab.J(context, cnVarA);
                }
            });
        }
        return zBooleanValue;
    }

    public static boolean t(Context context) {
        String strA = aa.a(context).a();
        hw.a("DeviceUtil", "deviceType: " + strA);
        return "4".equalsIgnoreCase(strA) || "5".equalsIgnoreCase(strA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String t(Context context, cn cnVar) {
        String string = Settings.Global.getString(context.getContentResolver(), "unified_device_name");
        if (TextUtils.isEmpty(string)) {
            string = dk.a("ro.config.marketing_name");
        }
        if (TextUtils.isEmpty(string)) {
            string = dk.a("ro.product.model");
        }
        if (TextUtils.isEmpty(string)) {
            string = Constants.NOT_FOUND;
        }
        cnVar.k(string);
        return string;
    }

    public static boolean s(final Context context, int i) {
        final cn cnVarA = cn.a(context);
        if (cnVarA.Q() == null) {
            return I(context, cnVarA);
        }
        boolean zBooleanValue = cnVarA.Q().booleanValue();
        if (Cdo.a("getUSB", i)) {
            o.i(new Runnable() { // from class: com.huawei.openalliance.ad.utils.ab.16
                @Override // java.lang.Runnable
                public void run() {
                    ab.I(context, cnVarA);
                }
            });
        }
        return zBooleanValue;
    }

    public static int s(Context context) {
        return ((float) d.e(context)) / ((float) d.d(context)) > 1.5f ? 2 : 1;
    }

    public static boolean r(final Context context, int i) {
        final cn cnVarA = cn.a(context);
        if (cnVarA.P() == null) {
            return H(context, cnVarA);
        }
        boolean zBooleanValue = cnVarA.P().booleanValue();
        if (Cdo.a("getDebug", i)) {
            o.i(new Runnable() { // from class: com.huawei.openalliance.ad.utils.ab.15
                @Override // java.lang.Runnable
                public void run() {
                    ab.H(context, cnVarA);
                }
            });
        }
        return zBooleanValue;
    }

    public static boolean r(Context context) {
        int iS;
        try {
            iS = com.huawei.openalliance.ad.ce.a(context).c();
        } catch (Throwable th) {
            iS = s(context);
            hw.c("DeviceUtil", "getFoldableStatus %s", th.getClass().getSimpleName());
        }
        return iS == 1 || iS == 7;
    }

    public static boolean q(final Context context, int i) {
        final cn cnVarA = cn.a(context);
        if (cnVarA.O() == null) {
            return G(context, cnVarA);
        }
        boolean zBooleanValue = cnVarA.O().booleanValue();
        if (Cdo.a("getProxy", i)) {
            o.i(new Runnable() { // from class: com.huawei.openalliance.ad.utils.ab.14
                @Override // java.lang.Runnable
                public void run() {
                    ab.G(context, cnVarA);
                }
            });
        }
        return zBooleanValue;
    }

    public static boolean q(Context context) {
        if (context == null) {
            return false;
        }
        try {
            return com.huawei.openalliance.ad.ce.a(context).d();
        } catch (Throwable th) {
            hw.c("DeviceUtil", "isFoldablePhone exception: %s", th.getClass().getSimpleName());
            return false;
        }
    }

    public static boolean p(Context context) {
        if (context == null) {
            return false;
        }
        try {
            return com.huawei.openalliance.ad.ce.a(context).g();
        } catch (Throwable th) {
            hw.c("DeviceUtil", "isEinkDevice exception: %s", th.getClass().getSimpleName());
            return false;
        }
    }

    public static Integer p(final Context context, int i) {
        final cn cnVarA = cn.a(context);
        String strB = cnVarA.B();
        if (TextUtils.isEmpty(strB)) {
            strB = F(context, cnVarA);
        } else if (Cdo.a("getCharging", i)) {
            o.i(new Runnable() { // from class: com.huawei.openalliance.ad.utils.ab.13
                @Override // java.lang.Runnable
                public void run() {
                    ab.F(context, cnVarA);
                }
            });
        }
        if (TextUtils.equals(Constants.NOT_FOUND, strB)) {
            strB = null;
        }
        return dg.j(strB);
    }

    public static boolean o(Context context) {
        return "0".equalsIgnoreCase(aa.a(context).a());
    }

    public static Integer o(final Context context, int i) {
        final cn cnVarA = cn.a(context);
        String strA = cnVarA.A();
        if (TextUtils.isEmpty(strA)) {
            strA = E(context, cnVarA);
        } else if (Cdo.a("getBattery", i)) {
            o.i(new Runnable() { // from class: com.huawei.openalliance.ad.utils.ab.11
                @Override // java.lang.Runnable
                public void run() {
                    ab.E(context, cnVarA);
                }
            });
        }
        if (TextUtils.equals(Constants.NOT_FOUND, strA)) {
            strA = null;
        }
        return dg.j(strA);
    }

    public static boolean n(Context context) {
        return "1".equalsIgnoreCase(aa.a(context).a());
    }

    public static String n(final Context context, int i) {
        final cn cnVarA = cn.a(context);
        String strZ = cnVarA.z();
        if (TextUtils.isEmpty(strZ)) {
            strZ = D(context, cnVarA);
        } else if (Cdo.a("getBaro", i)) {
            o.i(new Runnable() { // from class: com.huawei.openalliance.ad.utils.ab.9
                @Override // java.lang.Runnable
                public void run() {
                    ab.D(context, cnVarA);
                }
            });
        }
        if (TextUtils.equals(Constants.NOT_FOUND, strZ)) {
            return null;
        }
        return strZ;
    }

    public static String m(final Context context, int i) {
        final cn cnVarA = cn.a(context);
        String strY = cnVarA.y();
        if (TextUtils.isEmpty(strY)) {
            strY = C(context, cnVarA);
        } else if (Cdo.a("getMagnet", i)) {
            o.i(new Runnable() { // from class: com.huawei.openalliance.ad.utils.ab.7
                @Override // java.lang.Runnable
                public void run() {
                    ab.C(context, cnVarA);
                }
            });
        }
        if (TextUtils.equals(Constants.NOT_FOUND, strY)) {
            return null;
        }
        return strY;
    }

    public static String m(Context context) {
        String strF = com.huawei.openalliance.ad.cc.a(context).f();
        hw.b("DeviceUtil", "getHMVerion, ver= %s", strF);
        if (TextUtils.isEmpty(strF)) {
            return null;
        }
        return strF;
    }

    public static boolean l(Context context) {
        cn cnVarA = cn.a(context);
        boolean z = true;
        try {
            if (cnVarA.L() != null) {
                return cnVarA.L().booleanValue();
            }
            if (((SensorManager) context.getSystemService("sensor")).getDefaultSensor(1) == null) {
                z = false;
            }
            cnVarA.b(Boolean.valueOf(z));
            return z;
        } catch (Throwable th) {
            hw.c("DeviceUtil", "getHasAccAndRotate err: %s", th.getClass().getSimpleName());
            return true;
        }
    }

    public static String l(final Context context, int i) {
        final cn cnVarA = cn.a(context);
        String strX = cnVarA.x();
        if (TextUtils.isEmpty(strX)) {
            strX = B(context, cnVarA);
        } else if (Cdo.a("getAcceler", i)) {
            o.i(new Runnable() { // from class: com.huawei.openalliance.ad.utils.ab.5
                @Override // java.lang.Runnable
                public void run() {
                    ab.B(context, cnVarA);
                }
            });
        }
        if (TextUtils.equals(Constants.NOT_FOUND, strX)) {
            return null;
        }
        return strX;
    }

    public static String k(final Context context, int i) {
        final cn cnVarA = cn.a(context);
        String strW = cnVarA.w();
        if (TextUtils.isEmpty(strW)) {
            strW = A(context, cnVarA);
        } else if (Cdo.a("getGyro", i)) {
            o.i(new Runnable() { // from class: com.huawei.openalliance.ad.utils.ab.3
                @Override // java.lang.Runnable
                public void run() {
                    ab.A(context, cnVarA);
                }
            });
        }
        if (TextUtils.equals(Constants.NOT_FOUND, strW)) {
            return null;
        }
        return strW;
    }

    public static int k(Context context) {
        cn cnVarA = cn.a(context);
        if (cnVarA.F() != null) {
            return cnVarA.F().intValue();
        }
        int iC = aa.a(context).c();
        cnVarA.a(iC);
        return iC;
    }

    public static boolean j(Context context) {
        cn cnVarA = cn.a(context);
        if (cnVarA.E() != null) {
            return cnVarA.E().booleanValue();
        }
        boolean zB = aa.a(context).b();
        cnVarA.c(zB);
        return zB;
    }

    public static String j(final Context context, int i) {
        final cn cnVarA = cn.a(context);
        String strV = cnVarA.v();
        if (TextUtils.isEmpty(strV)) {
            return z(context, cnVarA);
        }
        if (!TextUtils.equals(Constants.NOT_FOUND, strV)) {
            return strV;
        }
        if (!Cdo.a("getVendCountry", i)) {
            return null;
        }
        o.i(new Runnable() { // from class: com.huawei.openalliance.ad.utils.ab.2
            @Override // java.lang.Runnable
            public void run() {
                ab.z(context, cnVarA);
            }
        });
        return null;
    }

    public static String i(final Context context, int i) {
        final cn cnVarA = cn.a(context);
        String strU = cnVarA.u();
        if (TextUtils.isEmpty(strU)) {
            return y(context, cnVarA);
        }
        if (!TextUtils.equals(Constants.NOT_FOUND, strU)) {
            return strU;
        }
        if (!Cdo.a("getVendor", i)) {
            return null;
        }
        o.i(new Runnable() { // from class: com.huawei.openalliance.ad.utils.ab.27
            @Override // java.lang.Runnable
            public void run() {
                ab.y(context, cnVarA);
            }
        });
        return null;
    }

    public static Context i(Context context) {
        return d() ? context.createDeviceProtectedStorageContext() : context;
    }

    public static boolean h(Context context) {
        NetworkInfo activeNetworkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getApplicationContext().getSystemService("connectivity");
        return connectivityManager != null && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null && activeNetworkInfo.isConnected() && activeNetworkInfo.getState() == NetworkInfo.State.CONNECTED;
    }

    public static Long h(final Context context, int i) {
        final cn cnVarA = cn.a(context);
        String strY = cnVarA.Y();
        if (TextUtils.isEmpty(strY)) {
            strY = x(context, cnVarA);
        } else if (Cdo.a("getFreeSdcard", i)) {
            o.i(new Runnable() { // from class: com.huawei.openalliance.ad.utils.ab.26
                @Override // java.lang.Runnable
                public void run() {
                    ab.x(context, cnVarA);
                }
            });
        }
        if (TextUtils.equals(Constants.NOT_FOUND, strY)) {
            strY = null;
        }
        return dg.k(strY);
    }

    private static long h() {
        FileInputStream fileInputStream;
        BufferedReader bufferedReader;
        Object th;
        InputStreamReader inputStreamReader;
        try {
            File file = new File("/proc/meminfo");
            if (!file.exists()) {
                df.a((Closeable) null);
                df.a((Closeable) null);
                df.a((Closeable) null);
                return 0L;
            }
            fileInputStream = new FileInputStream(file);
            try {
                inputStreamReader = new InputStreamReader(fileInputStream, "UTF-8");
                try {
                    bufferedReader = new BufferedReader(inputStreamReader);
                    try {
                        String line = bufferedReader.readLine();
                        if (dg.b(line)) {
                            df.a(bufferedReader);
                            df.a(inputStreamReader);
                            df.a((Closeable) fileInputStream);
                            return 0L;
                        }
                        String[] strArrSplit = line.split("\\s+");
                        if (strArrSplit.length < 2) {
                            df.a(bufferedReader);
                            df.a(inputStreamReader);
                            df.a((Closeable) fileInputStream);
                            return 0L;
                        }
                        long j = Long.parseLong(strArrSplit[1]);
                        df.a(bufferedReader);
                        df.a(inputStreamReader);
                        df.a((Closeable) fileInputStream);
                        return j * 1024;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Throwable th3) {
                    bufferedReader = null;
                    th = th3;
                }
            } catch (Throwable th4) {
                th = th4;
                bufferedReader = null;
                th = th;
                inputStreamReader = null;
            }
        } catch (Throwable th5) {
            th = th5;
            fileInputStream = null;
        }
        bufferedReader = null;
        th = th;
        inputStreamReader = null;
        try {
            hw.d("DeviceUtil", "getDeviceRamNative: %s", th.getClass().getSimpleName());
            return 0L;
        } finally {
            df.a(bufferedReader);
            df.a(inputStreamReader);
            df.a((Closeable) fileInputStream);
        }
    }

    public static boolean g(Context context) {
        String str;
        if (context == null) {
            str = "loc_tag isGpsSwitchOpen Context is null";
        } else {
            try {
                int i = Settings.Secure.getInt(context.getContentResolver(), "location_mode");
                hw.b("DeviceUtil", "loc_tag isGpsSwitchOpen locationMode is " + i);
                return i == 3;
            } catch (Settings.SettingNotFoundException unused) {
                str = "loc_tag isGpsSwitchOpen SettingNotFoundException";
            }
        }
        hw.d("DeviceUtil", str);
        return false;
    }

    public static Long g(final Context context, int i) {
        final cn cnVarA = cn.a(context);
        String strT = cnVarA.t();
        if (TextUtils.isEmpty(strT)) {
            strT = w(context, cnVarA);
        } else if (Cdo.a("getFreeSto", i)) {
            o.i(new Runnable() { // from class: com.huawei.openalliance.ad.utils.ab.25
                @Override // java.lang.Runnable
                public void run() {
                    ab.w(context, cnVarA);
                }
            });
        }
        if (TextUtils.equals(Constants.NOT_FOUND, strT)) {
            strT = null;
        }
        return dg.k(strT);
    }

    private static long g() {
        try {
            if ("true".equals(dk.a(SystemProperties.VICKY_DEMO_6))) {
                return 6442450944L;
            }
            Class<?> cls = Class.forName("com.huawei.android.util.SystemInfo");
            return Long.parseLong((String) cls.getMethod("getDeviceRam", new Class[0]).invoke(cls, new Object[0])) * 1024;
        } catch (Throwable th) {
            hw.d("DeviceUtil", "getDeviceRamForHw: %s", th.getClass().getSimpleName());
            return 0L;
        }
    }

    public static boolean f(Context context) {
        try {
            return g(context);
        } catch (Throwable th) {
            hw.c("DeviceUtil", "get location service switch exception: " + th.getClass().getSimpleName());
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.io.FileReader, java.io.Reader] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v8, types: [boolean] */
    public static String f(cn cnVar) throws Throwable {
        BufferedReader bufferedReader;
        ?? IsEmpty;
        String str;
        ?? r2;
        ?? r3;
        String strA;
        ?? r1 = 0;
        strTrim = null;
        String strTrim = null;
        try {
            try {
                IsEmpty = new FileReader("/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq");
                try {
                    bufferedReader = new BufferedReader(IsEmpty);
                    try {
                        String line = bufferedReader.readLine();
                        r3 = IsEmpty;
                        if (!TextUtils.isEmpty(line)) {
                            strTrim = line.trim();
                            r3 = IsEmpty;
                        }
                    } catch (FileNotFoundException unused) {
                        str = "get CpuSpeed exception : FileNotFoundException";
                        r2 = IsEmpty;
                        hw.d("DeviceUtil", str);
                        r3 = r2;
                    } catch (IOException unused2) {
                        str = "get CpuModel exception : IOException";
                        r2 = IsEmpty;
                        hw.d("DeviceUtil", str);
                        r3 = r2;
                    }
                } catch (FileNotFoundException unused3) {
                    bufferedReader = null;
                } catch (IOException unused4) {
                    bufferedReader = null;
                } catch (Throwable th) {
                    th = th;
                    bufferedReader = null;
                    r1 = IsEmpty;
                    df.a((Closeable) r1);
                    df.a(bufferedReader);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (FileNotFoundException unused5) {
            IsEmpty = 0;
            bufferedReader = null;
        } catch (IOException unused6) {
            IsEmpty = 0;
            bufferedReader = null;
        } catch (Throwable th3) {
            th = th3;
            bufferedReader = null;
            df.a((Closeable) r1);
            df.a(bufferedReader);
            throw th;
        }
        df.a((Closeable) r3);
        df.a(bufferedReader);
        IsEmpty = TextUtils.isEmpty(strTrim);
        if (IsEmpty != 0) {
            strA = Constants.NOT_FOUND;
        } else {
            try {
                strA = dg.a(Float.valueOf(Float.valueOf(strTrim).floatValue() / 1000000.0f));
            } catch (NumberFormatException unused7) {
                hw.d("DeviceUtil", "getCpuSpeed toInteger NumberFormatException");
                strA = Constants.NOT_FOUND;
            }
        }
        cnVar.n(strA);
        return strA;
    }

    public static String f() {
        if (Build.VERSION.SDK_INT < 27) {
            return "";
        }
        try {
            StructStat structStatStat = Os.stat("/data/data");
            long j = structStatStat.st_atim.tv_nsec;
            return structStatStat.st_atim.tv_sec + "." + j;
        } catch (Throwable th) {
            hw.d("DeviceUtil", "get update mark exception: %s", th.getClass().getSimpleName());
            return "";
        }
    }

    public static Long f(final Context context, int i) {
        final cn cnVarA = cn.a(context);
        String strS = cnVarA.s();
        if (TextUtils.isEmpty(strS)) {
            strS = v(context, cnVarA);
        } else if (TextUtils.equals(Constants.NOT_FOUND, strS)) {
            if (Cdo.a("getTotalSto", i)) {
                o.i(new Runnable() { // from class: com.huawei.openalliance.ad.utils.ab.24
                    @Override // java.lang.Runnable
                    public void run() {
                        ab.v(context, cnVarA);
                    }
                });
            }
            strS = null;
        }
        return dg.k(strS);
    }

    public static boolean e(Context context) {
        cn cnVarA = cn.a(context);
        boolean zC = cnVarA.C();
        a(cnVarA, context);
        return zC;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String e(cn cnVar) {
        String strA;
        try {
            strA = dg.a(Integer.valueOf(new File("/sys/devices/system/cpu/").listFiles(new a()).length));
        } catch (Throwable unused) {
            hw.d("DeviceUtil", "get CpuCoreCnt exception");
            strA = null;
        }
        if (strA == null) {
            strA = Constants.NOT_FOUND;
        }
        cnVar.m(strA);
        return strA;
    }

    public static String e() {
        InputStreamReader inputStreamReader;
        BufferedReader bufferedReader;
        Object th;
        FileInputStream fileInputStream;
        String strTrim = "";
        try {
            fileInputStream = new FileInputStream("/proc/sys/kernel/random/boot_id");
            try {
                inputStreamReader = new InputStreamReader(fileInputStream, "UTF-8");
                try {
                    bufferedReader = new BufferedReader(inputStreamReader);
                    try {
                        String line = bufferedReader.readLine();
                        if (!TextUtils.isEmpty(line)) {
                            strTrim = line.trim();
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            hw.d("DeviceUtil", "get boot mark exception: %s", th.getClass().getSimpleName());
                        } finally {
                            df.a(bufferedReader);
                            df.a(inputStreamReader);
                            df.a((Closeable) fileInputStream);
                        }
                    }
                } catch (Throwable th3) {
                    bufferedReader = null;
                    th = th3;
                }
            } catch (Throwable th4) {
                bufferedReader = null;
                th = th4;
                inputStreamReader = null;
            }
        } catch (Throwable th5) {
            inputStreamReader = null;
            bufferedReader = null;
            th = th5;
            fileInputStream = null;
        }
        return strTrim;
    }

    public static Long e(final Context context, int i) {
        final cn cnVarA = cn.a(context);
        String strR = cnVarA.r();
        if (TextUtils.isEmpty(strR)) {
            strR = u(context, cnVarA);
        } else if (TextUtils.equals(Constants.NOT_FOUND, strR)) {
            if (Cdo.a("getTotalMem", i)) {
                o.i(new Runnable() { // from class: com.huawei.openalliance.ad.utils.ab.23
                    @Override // java.lang.Runnable
                    public void run() {
                        ab.u(context, cnVarA);
                    }
                });
            }
            strR = null;
        }
        return dg.k(strR);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String d(cn cnVar) {
        String strA = dk.a("ro.product.cpu.abi");
        if (TextUtils.isEmpty(strA)) {
            strA = dk.a("ro.product.cpu.abilist64");
        }
        if (TextUtils.isEmpty(strA)) {
            strA = Constants.NOT_FOUND;
        }
        cnVar.l(strA);
        return strA;
    }

    public static String d(Context context, int i) {
        final cn cnVarA = cn.a(context);
        String strQ = cnVarA.q();
        if (TextUtils.isEmpty(strQ)) {
            return f(cnVarA);
        }
        if (!TextUtils.equals(Constants.NOT_FOUND, strQ)) {
            return strQ;
        }
        if (!Cdo.a("getCpuSpeed", i)) {
            return null;
        }
        o.i(new Runnable() { // from class: com.huawei.openalliance.ad.utils.ab.22
            @Override // java.lang.Runnable
            public void run() throws Throwable {
                ab.f(cnVarA);
            }
        });
        return null;
    }

    public static String d(Context context) {
        return dg.n(com.huawei.openalliance.ad.cc.a(context).m() ? fp.b(context).cc() : new CountryCodeBean(context).a());
    }

    public static boolean c() {
        return aw.a.f20436a >= 21 || aw.a.f20437b >= 33;
    }

    public static String c(Context context) {
        return ai.c(v(context));
    }

    public static Integer c(Context context, int i) {
        final cn cnVarA = cn.a(context);
        String strP = cnVarA.p();
        if (TextUtils.isEmpty(strP)) {
            strP = e(cnVarA);
        } else if (TextUtils.equals(Constants.NOT_FOUND, strP)) {
            if (Cdo.a("getCpuCoreCnt", i)) {
                o.i(new Runnable() { // from class: com.huawei.openalliance.ad.utils.ab.21
                    @Override // java.lang.Runnable
                    public void run() {
                        ab.e(cnVarA);
                    }
                });
            }
            strP = null;
        }
        return dg.j(strP);
    }

    public static String b(Context context, int i) {
        final cn cnVarA = cn.a(context);
        String strO = cnVarA.o();
        if (TextUtils.isEmpty(strO)) {
            return d(cnVarA);
        }
        if (!TextUtils.equals(Constants.NOT_FOUND, strO)) {
            return strO;
        }
        if (!Cdo.a("getCpuModel", i)) {
            return null;
        }
        o.i(new Runnable() { // from class: com.huawei.openalliance.ad.utils.ab.12
            @Override // java.lang.Runnable
            public void run() {
                ab.d(cnVarA);
            }
        });
        return null;
    }

    public static String b(Context context) {
        return ai.b(u(context));
    }

    public static String b() {
        String strA = dk.a("ro.product.model");
        return TextUtils.isEmpty(strA) ? Build.MODEL : strA;
    }

    private static void a(final cn cnVar, final Context context) {
        o.f(new Runnable() { // from class: com.huawei.openalliance.ad.utils.ab.18
            @Override // java.lang.Runnable
            public void run() {
                Uri uriBuild = new Uri.Builder().scheme("content").authority("com.huawei.hwid.pps.apiprovider").path("/switch/query").build();
                if (!as.b(context, uriBuild)) {
                    hw.c("DeviceUtil", "provider uri invalid.");
                    return;
                }
                Cursor cursorQuery = null;
                try {
                    cursorQuery = context.getContentResolver().query(uriBuild, null, null, null, null);
                    if (cursorQuery == null || !cursorQuery.moveToFirst()) {
                        hw.c("DeviceUtil", "loc_tag isBaseLocationSwitch, cursor is null");
                    } else {
                        try {
                            cnVar.b(Boolean.TRUE.toString().equalsIgnoreCase(cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("isSwitchChecked"))));
                            if (cursorQuery != null) {
                                cursorQuery.close();
                                return;
                            }
                            return;
                        } catch (Exception unused) {
                            hw.d("DeviceUtil", "loc_tag isBaseLocationSwitch Exception");
                        }
                    }
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                } catch (Throwable th) {
                    try {
                        hw.d("DeviceUtil", "loc_tag isBaseLocationSwitch query error: " + th.getClass().getSimpleName());
                        if (cursorQuery != null) {
                        }
                    } catch (Throwable th2) {
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        throw th2;
                    }
                }
                cnVar.b(false);
            }
        });
    }

    public static String a(Context context, String str) {
        try {
            PackageManager packageManager = context.getApplicationContext().getPackageManager();
            if (packageManager == null) {
                return null;
            }
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 128);
            return Build.VERSION.SDK_INT >= 28 ? String.valueOf(packageInfo.getLongVersionCode()) : String.valueOf(packageInfo.versionCode);
        } catch (Throwable unused) {
            hw.c("DeviceUtil", "fail to get appVerCode");
            return null;
        }
    }

    public static String a(final Context context, int i) {
        final cn cnVarA = cn.a(context);
        String strN = cnVarA.n();
        if (TextUtils.isEmpty(strN)) {
            return t(context, cnVarA);
        }
        if (!TextUtils.equals(Constants.NOT_FOUND, strN)) {
            return strN;
        }
        if (!Cdo.a("getPdtName", i)) {
            return null;
        }
        o.i(new Runnable() { // from class: com.huawei.openalliance.ad.utils.ab.1
            @Override // java.lang.Runnable
            public void run() {
                ab.t(context, cnVarA);
            }
        });
        return null;
    }

    public static String a(Context context) {
        return db.a(com.huawei.openalliance.ad.cc.a(context).b() + d.g(context));
    }

    public static String a() {
        return dk.a(SystemUtils.PRODUCT_BRAND);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Boolean L(Context context, cn cnVar) {
        try {
            CallResult callResultA = mz.a(context).a(RTCMethods.QUERY_CHILD_MODE, "", String.class);
            if (callResultA != null && 200 == callResultA.getCode()) {
                hw.b("DeviceUtil", "query child mode success");
                String str = (String) callResultA.getData();
                if (dg.b(str)) {
                    return false;
                }
                boolean z = Boolean.parseBoolean(str);
                cnVar.g(z);
                return Boolean.valueOf(z);
            }
        } catch (Throwable th) {
            hw.c("DeviceUtil", "query child mode err: %s", th.getClass().getSimpleName());
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Boolean K(Context context, cn cnVar) {
        boolean zA = k.a(context, Constants.WELINK_PKG_NAME);
        cnVar.f(zA);
        return Boolean.valueOf(zA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean J(Context context, cn cnVar) {
        int i;
        boolean z;
        boolean z2;
        ArrayList arrayList = new ArrayList();
        arrayList.add("/system/lib/libc_malloc_debug_qemu.so");
        arrayList.add("/sys/qemu_trace");
        arrayList.add("/system/bin/qemu-props");
        arrayList.add("/dev/socket/genyd");
        arrayList.add("/dev/socket/baseband_genyd");
        arrayList.add("/dev/socket/qemud");
        arrayList.add("/dev/qemu_pipe");
        Iterator it = arrayList.iterator();
        while (true) {
            z = true;
            if (!it.hasNext()) {
                z2 = false;
                break;
            }
            if (new File((String) it.next()).exists()) {
                z2 = true;
                break;
            }
        }
        String strAa = fp.b(context).aa();
        if (TextUtils.isEmpty(strAa)) {
            z = z2;
        } else {
            for (String str : strAa.split(",")) {
                if (!new File(str).exists()) {
                }
            }
            z = z2;
        }
        cnVar.f(Boolean.valueOf(z));
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean I(Context context, cn cnVar) {
        SafeIntent safeIntent = new SafeIntent(as.a(context, (BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED")));
        int intExtra = safeIntent.getIntExtra("status", -1);
        boolean z = false;
        boolean z2 = intExtra == 2 || intExtra == 5;
        boolean z3 = safeIntent.getIntExtra("plugged", -1) == 2;
        if (z2 && z3) {
            z = true;
        }
        cnVar.e(Boolean.valueOf(z));
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean H(Context context, cn cnVar) {
        boolean z = Settings.Secure.getInt(context.getContentResolver(), "adb_enabled", 0) > 0;
        cnVar.d(Boolean.valueOf(z));
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean G(Context context, cn cnVar) {
        String property = System.getProperty("http.proxyPort");
        String property2 = System.getProperty("http.proxyHost");
        if (property == null) {
            property = "-1";
        }
        boolean z = (TextUtils.isEmpty(property2) || Integer.parseInt(property) == -1) ? false : true;
        cnVar.c(Boolean.valueOf(z));
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String F(Context context, cn cnVar) {
        int intExtra = new SafeIntent(as.a(context, (BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"))).getIntExtra("status", 1);
        String strA = intExtra == 1 ? Constants.NOT_FOUND : dg.a(Integer.valueOf(intExtra));
        cnVar.y(strA);
        return strA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String E(Context context, cn cnVar) {
        SafeIntent safeIntent = new SafeIntent(as.a(context, (BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED")));
        int intExtra = safeIntent.getIntExtra("level", -1);
        int intExtra2 = safeIntent.getIntExtra("scale", -1);
        String strA = (intExtra == -1 || intExtra2 == -1) ? Constants.NOT_FOUND : dg.a(Integer.valueOf((int) ((intExtra / intExtra2) * 100.0f)));
        cnVar.x(strA);
        return strA;
    }

    static class b implements SensorEventListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private SensorManager f20386a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private cn f20387b;

        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            if (sensorEvent.sensor.getType() == 4) {
                this.f20387b.t(dg.a(Float.valueOf(sensorEvent.values[0])) + "," + dg.a(Float.valueOf(sensorEvent.values[1])) + "," + dg.a(Float.valueOf(sensorEvent.values[2])));
                this.f20386a.unregisterListener(this);
                bu.a("HIADSDK_GROY_DeviceUtil");
            }
            if (sensorEvent.sensor.getType() == 1) {
                this.f20387b.u(dg.a(Float.valueOf(sensorEvent.values[0])) + "," + dg.a(Float.valueOf(sensorEvent.values[1])) + "," + dg.a(Float.valueOf(sensorEvent.values[2])));
                this.f20386a.unregisterListener(this);
                bu.a("HIADSDK_ACCELER_DeviceUtil");
            }
            if (sensorEvent.sensor.getType() == 2) {
                this.f20387b.v(dg.a(Float.valueOf(sensorEvent.values[0])) + "," + dg.a(Float.valueOf(sensorEvent.values[1])) + "," + dg.a(Float.valueOf(sensorEvent.values[2])));
                this.f20386a.unregisterListener(this);
                bu.a("HIADSDK_MAGNET_DeviceUtil");
            }
            if (sensorEvent.sensor.getType() == 6) {
                this.f20387b.w(dg.a(Float.valueOf(sensorEvent.values[0])));
                this.f20386a.unregisterListener(this);
                bu.a("HIADSDK_BARO_DeviceUtil");
            }
        }

        public b(SensorManager sensorManager, cn cnVar) {
            this.f20386a = sensorManager;
            this.f20387b = cnVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String D(Context context, cn cnVar) {
        try {
            final SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
            Sensor defaultSensor = sensorManager.getDefaultSensor(6);
            if (defaultSensor == null) {
                return null;
            }
            final b bVar = new b(sensorManager, cnVar);
            sensorManager.registerListener(bVar, defaultSensor, 3);
            bu.a(new Runnable() { // from class: com.huawei.openalliance.ad.utils.ab.10
                @Override // java.lang.Runnable
                public void run() {
                    sensorManager.unregisterListener(bVar);
                }
            }, C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS);
            return cnVar.z();
        } catch (Throwable th) {
            hw.c("DeviceUtil", "getBaroInner exception: %s", th.getClass().getSimpleName());
            return null;
        }
    }

    class a implements FileFilter {
        @Override // java.io.FileFilter
        public boolean accept(File file) {
            return Pattern.matches("cpu[0-9]", file.getName());
        }

        a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String C(Context context, cn cnVar) {
        try {
            final SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
            Sensor defaultSensor = sensorManager.getDefaultSensor(2);
            if (defaultSensor == null) {
                return null;
            }
            final b bVar = new b(sensorManager, cnVar);
            sensorManager.registerListener(bVar, defaultSensor, 3);
            bu.a(new Runnable() { // from class: com.huawei.openalliance.ad.utils.ab.8
                @Override // java.lang.Runnable
                public void run() {
                    sensorManager.unregisterListener(bVar);
                }
            }, C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS);
            return cnVar.y();
        } catch (Throwable th) {
            hw.c("DeviceUtil", "getMagnetInner exception: %s", th.getClass().getSimpleName());
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String B(Context context, cn cnVar) {
        try {
            final SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
            Sensor defaultSensor = sensorManager.getDefaultSensor(1);
            if (defaultSensor == null) {
                return null;
            }
            final b bVar = new b(sensorManager, cnVar);
            sensorManager.registerListener(bVar, defaultSensor, 3);
            bu.a(new Runnable() { // from class: com.huawei.openalliance.ad.utils.ab.6
                @Override // java.lang.Runnable
                public void run() {
                    sensorManager.unregisterListener(bVar);
                }
            }, C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS);
            return cnVar.x();
        } catch (Throwable th) {
            hw.c("DeviceUtil", "getAccelerInner exception: %s", th.getClass().getSimpleName());
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String A(Context context, cn cnVar) {
        try {
            final SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
            Sensor defaultSensor = sensorManager.getDefaultSensor(4);
            if (defaultSensor == null) {
                return null;
            }
            final b bVar = new b(sensorManager, cnVar);
            sensorManager.registerListener(bVar, defaultSensor, 3);
            bu.a(new Runnable() { // from class: com.huawei.openalliance.ad.utils.ab.4
                @Override // java.lang.Runnable
                public void run() {
                    sensorManager.unregisterListener(bVar);
                }
            }, C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS);
            return cnVar.w();
        } catch (Throwable th) {
            hw.c("DeviceUtil", "getGyroInner exception: %s", th.getClass().getSimpleName());
            return null;
        }
    }
}
