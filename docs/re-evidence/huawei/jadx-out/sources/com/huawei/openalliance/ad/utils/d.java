package com.huawei.openalliance.ad.utils;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.Pair;
import android.view.Display;
import android.view.WindowManager;
import android.webkit.WebSettings;
import com.huawei.appgallery.markethomecountrysdk.api.HomeCountryApi;
import com.huawei.hmf.tasks.Tasks;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.constant.IntervalMethods;
import com.huawei.openalliance.ad.constant.RTCMethods;
import com.huawei.openalliance.ad.fe;
import com.huawei.openalliance.ad.fl;
import com.huawei.openalliance.ad.fp;
import com.huawei.openalliance.ad.ge;
import com.huawei.openalliance.ad.gk;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.inter.HiAd;
import com.huawei.openalliance.ad.inter.data.IAd;
import com.huawei.openalliance.ad.ipc.CallResult;
import com.huawei.openalliance.ad.ipc.RemoteCallResultCallback;
import com.huawei.openalliance.ad.na;
import com.huawei.openalliance.ad.opendeviceidentifier.OAIDServiceManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes12.dex */
public abstract class d {
    public static Integer z(Context context) {
        Integer numZ = cn.a(context).Z();
        return numZ == null ? A(context) : numZ;
    }

    public static String y(final Context context) {
        String strV = cn.a(context).V();
        if (TextUtils.isEmpty(strV)) {
            o.i(new Runnable() { // from class: com.huawei.openalliance.ad.utils.d.4
                @Override // java.lang.Runnable
                public void run() {
                    cn.a(context).H(ab.c(context));
                }
            });
        }
        return strV;
    }

    public static String x(final Context context) {
        String strU = cn.a(context).U();
        if (TextUtils.isEmpty(strU)) {
            o.i(new Runnable() { // from class: com.huawei.openalliance.ad.utils.d.3
                @Override // java.lang.Runnable
                public void run() {
                    cn.a(context).G(ab.b(context));
                }
            });
        }
        return strU;
    }

    public static int w(Context context) {
        try {
            return Integer.parseInt(fe.a(context).b());
        } catch (NumberFormatException unused) {
            hw.c("AdInfoUtil", "EncodingMode fromString Exception");
            return 1;
        }
    }

    public static List<String> v(Context context) {
        String str;
        ArrayList arrayList = new ArrayList();
        String strA = fe.a(context).a();
        if (!TextUtils.equals(strA, "")) {
            try {
                return new ArrayList(Arrays.asList(strA.split(",")));
            } catch (RuntimeException unused) {
                str = "fromString RuntimeException";
                hw.c("AdInfoUtil", str);
                return arrayList;
            } catch (Exception unused2) {
                str = "fromString Exception";
                hw.c("AdInfoUtil", str);
                return arrayList;
            }
        }
        return arrayList;
    }

    public static String u(final Context context) {
        final cn cnVarA = cn.a(context);
        String strD = cnVarA.D();
        if (TextUtils.isEmpty(strD)) {
            strD = e(cnVarA, context);
        } else if (Cdo.a("getBrandCust")) {
            o.f(new Runnable() { // from class: com.huawei.openalliance.ad.utils.d.2
                @Override // java.lang.Runnable
                public void run() {
                    d.e(cnVarA, context);
                }
            });
        }
        if (TextUtils.equals(Constants.NOT_FOUND, strD)) {
            return null;
        }
        return strD;
    }

    public static int t(Context context) {
        try {
            return Settings.Secure.getInt(context.getContentResolver(), "secure_gesture_navigation", 0);
        } catch (Throwable th) {
            hw.c("AdInfoUtil", "exception happen: " + th.getClass().getSimpleName());
            return 0;
        }
    }

    public static boolean s(Context context) {
        if (context != null) {
            String packageName = context.getPackageName();
            if (!TextUtils.isEmpty(packageName)) {
                try {
                    String string = Settings.Global.getString(context.getContentResolver(), "ex_splash_block_list");
                    if ((!TextUtils.isEmpty(string) && Arrays.asList(string.split(";")).contains(packageName)) || Settings.Global.getInt(context.getContentResolver(), "ex_splash_func_status", 0) == 0) {
                        return false;
                    }
                    String string2 = Settings.Global.getString(context.getContentResolver(), "ex_splash_list");
                    if (TextUtils.isEmpty(string2)) {
                        return false;
                    }
                    return Arrays.asList(string2.split(";")).contains(packageName);
                } catch (Throwable th) {
                    hw.c("AdInfoUtil", "exception happen: " + th.getClass().getSimpleName());
                }
            }
        }
        return false;
    }

    public static int r(Context context) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        int iK = K(context);
        if (hw.a()) {
            hw.a("AdInfoUtil", "getScreenReaderStatus end duration: %d", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
        }
        return iK;
    }

    public static int q(Context context) {
        String str;
        if (context == null) {
            return 1;
        }
        try {
            return Settings.Global.getInt(context.getContentResolver(), Constants.NAVIGATIONBAR_IS_MIN) == 1 ? 1 : 0;
        } catch (Settings.SettingNotFoundException unused) {
            str = "get navigation status error, setting not found.";
            hw.d("AdInfoUtil", str);
            return 1;
        } catch (Throwable unused2) {
            str = "get navigation status error.";
            hw.d("AdInfoUtil", str);
            return 1;
        }
    }

    public static int p(Context context) {
        if (context != null && o(context)) {
            try {
                int i = Settings.Secure.getInt(context.getContentResolver(), Constants.PATH_CHILDMODE_STATUS);
                int i2 = Settings.Secure.getInt(context.getContentResolver(), Constants.PATH_PARENTMODE_STATUS);
                if (i == 0) {
                    return i2 == 0 ? -1 : 0;
                }
                return 1;
            } catch (Settings.SettingNotFoundException unused) {
                hw.d("AdInfoUtil", "get childMode and parentMode error, setting not found.");
            } catch (Throwable unused2) {
                hw.d("AdInfoUtil", "get childMode and parentMode error.");
                return 1;
            }
        }
        return -1;
    }

    public static boolean o(Context context) {
        if (com.huawei.openalliance.ad.cc.a(context).d() && (as.a(context) >= 10 || com.huawei.openalliance.ad.cc.e(context))) {
            if (context == null) {
                return true;
            }
            try {
                try {
                    Object obj = context.getPackageManager().getApplicationInfo(Constants.PARENT_CONTROL_PACKAGE_NAME, 128).metaData.get(Constants.CONTENT_SWITCH_SUPPORT_KEY);
                    return obj != null && "1".equals(obj.toString());
                } catch (Throwable unused) {
                    return true;
                }
            } catch (PackageManager.NameNotFoundException | Exception unused2) {
            }
        }
        return false;
    }

    public static String n(final Context context) {
        if (!com.huawei.openalliance.ad.cc.b(context)) {
            return null;
        }
        final cn cnVarA = cn.a(context);
        String strM = cnVarA.m();
        if (hw.a()) {
            hw.a("AdInfoUtil", "cached agCountryCode: %s", strM);
        }
        if (TextUtils.isEmpty(strM) || Cdo.a("getAgCountryCode")) {
            o.f(new Runnable() { // from class: com.huawei.openalliance.ad.utils.d.13
                @Override // java.lang.Runnable
                public void run() {
                    d.h(context, cnVarA);
                }
            });
        }
        if (TextUtils.equals(Constants.NOT_FOUND, strM)) {
            return null;
        }
        return strM;
    }

    public static String m(final Context context) {
        final cn cnVarA = cn.a(context);
        String strL = cnVarA.l();
        if (TextUtils.isEmpty(strL)) {
            strL = j(context, cnVarA);
        } else if (Cdo.a("getAgVersionCode")) {
            o.f(new Runnable() { // from class: com.huawei.openalliance.ad.utils.d.12
                @Override // java.lang.Runnable
                public void run() {
                    d.j(context, cnVarA);
                }
            });
        }
        if (TextUtils.equals(Constants.NOT_FOUND, strL)) {
            return null;
        }
        return strL;
    }

    public static String l(final Context context) {
        final cn cnVarA = cn.a(context);
        String strE = cnVarA.e();
        if (TextUtils.isEmpty(strE)) {
            strE = i(context, cnVarA);
        } else if (Cdo.a("getHmsVersionCode")) {
            o.f(new Runnable() { // from class: com.huawei.openalliance.ad.utils.d.11
                @Override // java.lang.Runnable
                public void run() {
                    d.i(context, cnVarA);
                }
            });
        }
        if (TextUtils.equals(Constants.NOT_FOUND, strE)) {
            return null;
        }
        return strE;
    }

    public static String k(final Context context) {
        final cn cnVarA = cn.a(context);
        String strD = cnVarA.d();
        if (TextUtils.isEmpty(strD)) {
            strD = g(context, cnVarA);
        } else if (Cdo.a("getHsfVersionCode")) {
            o.f(new Runnable() { // from class: com.huawei.openalliance.ad.utils.d.10
                @Override // java.lang.Runnable
                public void run() {
                    d.g(context, cnVarA);
                }
            });
        }
        if (TextUtils.equals(Constants.NOT_FOUND, strD)) {
            return null;
        }
        return strD;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String j(Context context, cn cnVar) {
        String strA = a(context, "com.huawei.appmarket");
        if (strA == null) {
            strA = Constants.NOT_FOUND;
        }
        cnVar.i(strA);
        return strA;
    }

    public static String j(Context context) {
        if (context == null) {
            return null;
        }
        cn cnVarA = cn.a(context);
        String strB = cnVarA.b();
        if (TextUtils.isEmpty(strB)) {
            strB = I(context);
            cnVarA.a(strB);
        } else if (!Constants.HW_INTELLIEGNT_PACKAGE.equalsIgnoreCase(context.getPackageName())) {
            f(context, cnVarA);
        }
        if (TextUtils.equals(Constants.NOT_FOUND, strB)) {
            return null;
        }
        return strB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String i(Context context, cn cnVar) {
        String strA = a(context, k.e(context));
        if (strA == null) {
            strA = Constants.NOT_FOUND;
        }
        cnVar.c(strA);
        return strA;
    }

    public static float i(Context context) {
        try {
            DisplayMetrics displayMetricsH = H(context);
            if (displayMetricsH != null) {
                return displayMetricsH.density;
            }
            return 0.0f;
        } catch (RuntimeException | Exception unused) {
            hw.c("AdInfoUtil", "getDensity fail");
            return 0.0f;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String h(Context context, cn cnVar) {
        String strJ = J(context);
        if (strJ == null) {
            strJ = Constants.NOT_FOUND;
        }
        if (!TextUtils.equals(Constants.NOT_FOUND, strJ)) {
            cnVar.j(strJ);
        }
        return strJ;
    }

    public static int h(Context context) {
        try {
            DisplayMetrics displayMetricsH = H(context);
            if (displayMetricsH != null) {
                return displayMetricsH.densityDpi;
            }
            return 0;
        } catch (RuntimeException | Exception unused) {
            hw.c("AdInfoUtil", "getDensityDpi fail");
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String g(Context context, cn cnVar) {
        String strA = a(context, Constants.REMOTE_APP_INSTALL_HOST_HSF_PACKAGE);
        if (strA == null) {
            strA = a(context, Constants.REMOTE_APP_INSTALL_HOST_HSF_PACKAGE_NEW);
        }
        if (strA == null) {
            strA = Constants.NOT_FOUND;
        }
        cnVar.b(strA);
        return strA;
    }

    public static String g(Context context) {
        if (!HiAd.getInstance(context).isEnableUserInfo()) {
            hw.b("AdInfoUtil", "not enable userinfo, skip udid.");
            return null;
        }
        cn cnVarA = cn.a(context);
        String strG = cnVarA.G();
        if (TextUtils.isEmpty(strG)) {
            return e(context, cnVarA);
        }
        hw.b("AdInfoUtil", "use cached udid");
        if (Constants.NOT_FOUND.equalsIgnoreCase(strG)) {
            return null;
        }
        return strG;
    }

    private static void f(final Context context, final cn cnVar) {
        long jCa = fp.b(context).ca();
        final long jC = as.c();
        if (jC - jCa >= Constants.TWO_WEEK) {
            o.f(new Runnable() { // from class: com.huawei.openalliance.ad.utils.d.9
                @Override // java.lang.Runnable
                public void run() {
                    cnVar.a(d.I(context));
                    fp.b(context).i(jC);
                }
            });
        } else {
            hw.b("AdInfoUtil", "query ua once 2 week");
        }
    }

    public static DisplayMetrics f(Context context) {
        WindowManager windowManager;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        if (context == null || (windowManager = (WindowManager) context.getSystemService(Constants.NATIVE_WINDOW_SUB_DIR)) == null) {
            return displayMetrics;
        }
        windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
        return displayMetrics;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String e(cn cnVar, Context context) {
        String strA = dk.a("hw_sc.product.useBrandCust");
        if (strA == null) {
            strA = Constants.NOT_FOUND;
        }
        cnVar.A(strA);
        return strA;
    }

    private static String e(Context context, cn cnVar) {
        StringBuilder sb;
        if (!HiAd.getInstance(context).isEnableUserInfo()) {
            hw.b("AdInfoUtil", "not enable userinfo, skip udid.");
            return null;
        }
        if (fp.b(context).b("udid")) {
            hw.a("AdInfoUtil", "within udid call time interval");
            return null;
        }
        try {
            if (hw.a()) {
                hw.a("AdInfoUtil", "no cached udid, direct get.");
            }
            fp.b(context).s("udid");
            Class<?> cls = Class.forName(com.huawei.openalliance.ad.ce.a(context).f());
            Object objInvoke = cls.getDeclaredMethod("getUDID", new Class[0]).invoke(cls, new Object[0]);
            if (objInvoke instanceof String) {
                cnVar.B((String) objInvoke);
                return (String) objInvoke;
            }
            cnVar.B(Constants.NOT_FOUND);
            return null;
        } catch (RuntimeException e) {
            e = e;
            sb = new StringBuilder("getUDID RuntimeException:");
            sb.append(e.getClass().getSimpleName());
            hw.d("AdInfoUtil", sb.toString());
        } catch (Throwable th) {
            e = th;
            sb = new StringBuilder("getUDID Exception:");
            sb.append(e.getClass().getSimpleName());
            hw.d("AdInfoUtil", sb.toString());
        }
    }

    private static String e() {
        String str;
        try {
            return System.getProperty("http.agent");
        } catch (IllegalArgumentException unused) {
            str = "getSystemUserAgent fail";
            hw.c("AdInfoUtil", str);
            return null;
        } catch (Exception unused2) {
            str = "getSystemUserAgent Exception";
            hw.c("AdInfoUtil", str);
            return null;
        }
    }

    public static int e(Context context) {
        if (context == null) {
            return 0;
        }
        int iA = a(context);
        int iB = b(context);
        return iA > iB ? iA : iB;
    }

    public static boolean d() {
        try {
            return Build.MANUFACTURER.equalsIgnoreCase("HONOR") && Build.VERSION.SDK_INT >= 31 && com.hihonor.android.os.Build.VERSION.MAGIC_SDK_INT >= 33;
        } catch (Throwable th) {
            Log.e("AdInfoUtil", "isHonor6UpPhone Error:" + th.getClass().getSimpleName());
            return false;
        }
    }

    private static void d(final cn cnVar, final Context context) {
        o.f(new Runnable() { // from class: com.huawei.openalliance.ad.utils.d.8
            @Override // java.lang.Runnable
            public void run() {
                if (com.huawei.openalliance.ad.cc.h(context)) {
                    OAIDServiceManager.getInstance(context).requireOaid(new OAIDServiceManager.OaidResultCallback() { // from class: com.huawei.openalliance.ad.utils.d.8.1
                        @Override // com.huawei.openalliance.ad.opendeviceidentifier.OAIDServiceManager.OaidResultCallback
                        public void a(String str, boolean z) {
                            hw.b("AdInfoUtil", "onOaidAcquired");
                            if (cnVar != null) {
                                cnVar.a(str, Boolean.valueOf(z));
                            }
                        }

                        @Override // com.huawei.openalliance.ad.opendeviceidentifier.OAIDServiceManager.OaidResultCallback
                        public void a() {
                            hw.b("AdInfoUtil", "onOaidAcquireFailed");
                            if (cnVar != null) {
                                cnVar.a((String) null, (Boolean) null);
                            }
                        }
                    });
                    return;
                }
                hw.b("AdInfoUtil", "thirdDevice, get oaid.");
                Pair<String, Boolean> pairA = dn.a(context);
                if (pairA == null || cnVar == null) {
                    cnVar.a((String) null, (Boolean) false);
                    hw.b("AdInfoUtil", "get oaid fail.");
                } else {
                    hw.b("AdInfoUtil", "oaid acquired.");
                    cnVar.a((String) pairA.first, (Boolean) pairA.second);
                }
            }
        });
    }

    public static int d(Context context) {
        if (context == null) {
            return 0;
        }
        int iA = a(context);
        int iB = b(context);
        return iA > iB ? iB : iA;
    }

    public static boolean c(Context context, String str) {
        int iA;
        return TextUtils.isEmpty(str) || 1 == (iA = fl.a(context).a(str)) || iA == 0;
    }

    public static boolean c(Context context, int i) {
        if (i != 1) {
            hw.a("AdInfoUtil", "ad type %s not support kit preload", Integer.valueOf(i));
            return false;
        }
        if (!ab.n(context) && !ab.o(context)) {
            hw.a("AdInfoUtil", "kit preload only support phone or pad");
            return false;
        }
        if (!com.huawei.openalliance.ad.cc.b(context)) {
            hw.a("AdInfoUtil", "kit preload only support inner device");
            return false;
        }
        if (ab.p(context)) {
            hw.a("AdInfoUtil", "kit preload not support eink");
            return false;
        }
        if (k.c(context)) {
            return true;
        }
        hw.a("AdInfoUtil", "hms not installed");
        return false;
    }

    private static void c(final cn cnVar, final Context context) {
        o.f(new Runnable() { // from class: com.huawei.openalliance.ad.utils.d.7
            @Override // java.lang.Runnable
            public void run() {
                if (com.huawei.openalliance.ad.cc.b(context)) {
                    final AtomicInteger atomicInteger = new AtomicInteger(0);
                    na.a(context).a(RTCMethods.QUERY_UUID, "", new RemoteCallResultCallback<String>() { // from class: com.huawei.openalliance.ad.utils.d.7.1
                        @Override // com.huawei.openalliance.ad.ipc.RemoteCallResultCallback
                        public void onRemoteCallResult(String str, CallResult<String> callResult) {
                            atomicInteger.incrementAndGet();
                            if (callResult.getCode() != 200) {
                                hw.b("AdInfoUtil", "requestUuid failed");
                                return;
                            }
                            hw.b("AdInfoUtil", "requestUuid success");
                            cnVar.h(callResult.getData());
                            d.b(atomicInteger, cnVar, context);
                        }
                    }, String.class);
                    OAIDServiceManager.getInstance(context).requireOaid(new OAIDServiceManager.OaidResultCallback() { // from class: com.huawei.openalliance.ad.utils.d.7.2
                        @Override // com.huawei.openalliance.ad.opendeviceidentifier.OAIDServiceManager.OaidResultCallback
                        public void a(String str, boolean z) {
                            hw.b("AdInfoUtil", "onOaidAcquired");
                            cnVar.a(str, Boolean.valueOf(z));
                            atomicInteger.incrementAndGet();
                            d.b(atomicInteger, cnVar, context);
                        }

                        @Override // com.huawei.openalliance.ad.opendeviceidentifier.OAIDServiceManager.OaidResultCallback
                        public void a() {
                            hw.b("AdInfoUtil", "onOaidAcquireFailed");
                            cnVar.a((String) null, (Boolean) null);
                        }
                    });
                }
            }
        });
    }

    public static String c() {
        return Locale.getDefault().getLanguage() + Constants.LINK + Locale.getDefault().getCountry();
    }

    public static int c(Context context) {
        if (context == null) {
            return 0;
        }
        return as.b(context, d(context));
    }

    public static boolean b(Context context, String str) {
        if (context != null && !TextUtils.isEmpty(str)) {
            try {
                ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(str, 0);
                if (applicationInfo != null && (applicationInfo.flags & 1) > 0) {
                    return true;
                }
            } catch (PackageManager.NameNotFoundException | Exception unused) {
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(AtomicInteger atomicInteger, cn cnVar, Context context) {
        if (atomicInteger.get() >= 2) {
            cnVar.g(ab.a(context));
        }
    }

    private static void b(final cn cnVar, final Context context) {
        if (HiAd.getInstance(context).isEnableUserInfo()) {
            o.f(new Runnable() { // from class: com.huawei.openalliance.ad.utils.d.1
                @Override // java.lang.Runnable
                public void run() {
                    if (com.huawei.openalliance.ad.cc.b(context)) {
                        if (d.E(context)) {
                            hw.a("AdInfoUtil", "within uuid request interval, skip query uuid.");
                        } else {
                            hw.b("AdInfoUtil", "start to request UUID");
                            na.a(context).a(RTCMethods.QUERY_UUID, "", new RemoteCallResultCallback<String>() { // from class: com.huawei.openalliance.ad.utils.d.1.1
                                @Override // com.huawei.openalliance.ad.ipc.RemoteCallResultCallback
                                public void onRemoteCallResult(String str, CallResult<String> callResult) {
                                    if (callResult.getCode() != 200) {
                                        hw.b("AdInfoUtil", "requestUuid failed");
                                    } else {
                                        hw.b("AdInfoUtil", "requestUuid success");
                                        cnVar.h(callResult.getData());
                                    }
                                }
                            }, String.class);
                        }
                    }
                }
            });
        } else {
            hw.b("AdInfoUtil", "not enable userinfo, skip uuid.");
        }
    }

    public static String b() {
        return Locale.getDefault().getScript();
    }

    public static Pair<String, Boolean> b(Context context, boolean z) {
        if (context == null) {
            return null;
        }
        if (!HiAd.getInstance(context).isEnableUserInfo()) {
            hw.b("AdInfoUtil", "not enable user info, skip oaid");
            return null;
        }
        cn cnVarA = cn.a(context);
        hw.b("AdInfoUtil", "query oaid");
        if (com.huawei.openalliance.ad.cc.h(context)) {
            Pair<String, Boolean> pairA = ce.a(context);
            if (pairA != null && !F(context)) {
                hw.b("AdInfoUtil", "read from setting");
                d(com.huawei.openalliance.ad.cc.a(context).d() ? cnVarA : null, context.getApplicationContext());
            }
            if (pairA != null) {
                return pairA;
            }
        } else {
            Pair<String, Boolean> pairG = G(context);
            if (pairG != null) {
                return pairG;
            }
        }
        if (!com.huawei.openalliance.ad.cc.a(context).d()) {
            return null;
        }
        String strA = ab.a(context);
        if (!TextUtils.isEmpty(strA) && !strA.equalsIgnoreCase(cnVarA.j())) {
            c(cnVarA, context.getApplicationContext());
            return null;
        }
        if (z && com.huawei.openalliance.ad.cc.h(context) && !fp.b(context).b(IntervalMethods.DIRECT_REQ_OAID, 2)) {
            hw.b("AdInfoUtil", "start to request oaid");
            fp.b(context).s(IntervalMethods.DIRECT_REQ_OAID);
            d(cnVarA, context.getApplicationContext());
        }
        hw.b("AdInfoUtil", "read from cache");
        Pair<String, Boolean> pairI = cnVarA.i();
        return (Build.BRAND.equalsIgnoreCase("HONOR") && pairI == null) ? au.a(context) : pairI;
    }

    public static int b(Context context, int i) {
        return i == 0 ? d(context) : e(context);
    }

    public static int b(Context context) {
        if (context == null) {
            return 0;
        }
        return f(context).widthPixels;
    }

    public static boolean a(Context context, IAd iAd) {
        if (iAd == null) {
            return false;
        }
        return as.a(context, iAd);
    }

    public static void a(Context context, List<String> list) {
        String strA = dg.a(list, ",");
        ge geVarA = fe.a(context);
        if (bm.a(list)) {
            geVarA.a("");
        } else {
            geVarA.a(strA);
        }
    }

    public static void a(Context context, String str, boolean z) {
        o.f(new a(context, str, z));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:20:0x003b  */
    public static String a(String str) {
        byte b2;
        if (dg.b(str)) {
            return "0";
        }
        switch (str) {
            case "2":
                b2 = 3;
                break;
            case "3":
                b2 = 0;
                break;
            case "4":
                b2 = 1;
                break;
            case "5":
                b2 = 2;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 != 0) {
            return (b2 == 1 || b2 == 2) ? "2" : "0";
        }
        return "1";
    }

    public static String a(Context context, boolean z) {
        cn cnVarA = cn.a(context);
        String strA = ab.a(context);
        if (!TextUtils.isEmpty(strA) && !strA.equalsIgnoreCase(cnVarA.j())) {
            c(cnVarA, context.getApplicationContext());
            return null;
        }
        if (z && context != null) {
            b(cnVarA, context.getApplicationContext());
        }
        return cnVarA.k();
    }

    public static String a(Context context, String str) {
        try {
            PackageInfo packageInfoB = k.b(context, str);
            if (packageInfoB == null) {
                return null;
            }
            return String.valueOf(packageInfoB.versionCode);
        } catch (AndroidRuntimeException | Exception unused) {
            hw.c("AdInfoUtil", "getVersionCode fail");
            return null;
        }
    }

    public static String a(int i) {
        if (i == 1) {
            return "3";
        }
        if (i != 2) {
            return i != 3 ? "2" : "5";
        }
        return "4";
    }

    public static String a() {
        return Locale.getDefault().getLanguage();
    }

    public static int a(Context context, int i) {
        return i == 0 ? e(context) : d(context);
    }

    public static int a(Context context) {
        if (context == null) {
            return 0;
        }
        return f(context).heightPixels;
    }

    private static int K(Context context) {
        String string;
        if (context == null) {
            return -1;
        }
        if (as.a(context) >= 10 || com.huawei.openalliance.ad.cc.e(context)) {
            try {
                int iA = Settings.Secure.getInt(context.getContentResolver(), "accessibility_screenreader_enabled");
                if (iA == -1) {
                    iA = com.huawei.openalliance.ad.ce.a(context).a(context);
                }
                if (iA == 1) {
                    return 1;
                }
                return iA == 0 ? 0 : -1;
            } catch (Settings.SettingNotFoundException unused) {
                hw.d("AdInfoUtil", "get ScreenReader status error, setting not found.");
                return -1;
            } catch (Throwable unused2) {
                hw.d("AdInfoUtil", "get ScreenReader status error.");
                return -1;
            }
        }
        try {
            if (Settings.Secure.getInt(context.getContentResolver(), "accessibility_enabled") != 1 || (string = Settings.Secure.getString(context.getContentResolver(), "enabled_accessibility_services")) == null) {
                return 0;
            }
            return (string.contains(new ComponentName("com.google.android.marvin.talkback", "com.google.android.marvin.talkback.TalkBackService").flattenToString()) || string.contains(new ComponentName("com.bjbyhd.screenreader_huawei", "com.bjbyhd.screenreader_huawei.ScreenReaderService").flattenToString()) || string.contains(new ComponentName("com.google.android.marvin.talkback", ".TalkBackService").flattenToString()) || string.contains(new ComponentName("com.samsung.accessibility", "com.samsung.android.app.talkback.TalkBackService").flattenToString())) ? 1 : 0;
        } catch (Settings.SettingNotFoundException unused3) {
            hw.d("AdInfoUtil", "get ScreenReader status error, setting not found.");
            return -1;
        } catch (Throwable unused4) {
            hw.d("AdInfoUtil", "get ScreenReader status error.");
            return -1;
        }
    }

    private static String J(final Context context) {
        hw.b("AdInfoUtil", "getAgCountryCodeFromAg");
        String str = (String) dj.a(new Callable<String>() { // from class: com.huawei.openalliance.ad.utils.d.14
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public String call() {
                try {
                    return (String) Tasks.await(HomeCountryApi.getHomeCountry(context, "PPSSDK", false));
                } catch (Throwable unused) {
                    hw.d("AdInfoUtil", "getAgCountryCodeFromAg Throwable ");
                    return Constants.NOT_FOUND;
                }
            }
        }, 100L, Constants.NOT_FOUND);
        hw.a("AdInfoUtil", "ag country code=" + str);
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String I(Context context) {
        String str;
        String strE;
        try {
            dk.h(context);
            strE = WebSettings.getDefaultUserAgent(context);
            if (hw.a()) {
                hw.a("AdInfoUtil", "get ua:%s", strE);
            }
            if (TextUtils.isEmpty(strE)) {
                strE = e();
            }
        } catch (AndroidRuntimeException unused) {
            str = "getUserAgent fail";
            hw.c("AdInfoUtil", str);
            strE = e();
        } catch (Throwable th) {
            str = "getUserAgent fail: " + th.getClass().getSimpleName();
            hw.c("AdInfoUtil", str);
            strE = e();
        }
        return TextUtils.isEmpty(strE) ? Constants.NOT_FOUND : strE;
    }

    private static DisplayMetrics H(Context context) {
        WindowManager windowManager;
        Display defaultDisplay;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        if (context == null || (windowManager = (WindowManager) context.getSystemService(Constants.NATIVE_WINDOW_SUB_DIR)) == null || (defaultDisplay = windowManager.getDefaultDisplay()) == null) {
            return null;
        }
        defaultDisplay.getMetrics(displayMetrics);
        return displayMetrics;
    }

    private static Pair<String, Boolean> G(Context context) {
        cn cnVarA = cn.a(context);
        hw.b("AdInfoUtil", "thirdDevice, get oaid.");
        Pair<String, Boolean> pairI = cnVarA.i();
        if (F(context)) {
            return pairI;
        }
        Pair<String, Boolean> pairA = dn.a(context);
        if (pairA != null) {
            hw.b("AdInfoUtil", "oaid acquired.");
            cnVarA.a((String) pairA.first, (Boolean) pairA.second);
            return pairA;
        }
        hw.b("AdInfoUtil", "derectOaid is null.");
        cnVarA.a((String) null, (Boolean) null);
        return null;
    }

    private static boolean F(Context context) {
        String packageName = context.getPackageName();
        gk gkVarB = fp.b(context);
        long jCo = gkVarB.co();
        Long lValueOf = Long.valueOf(jCo);
        long jR = ((long) gkVarB.R()) * 60000;
        if (lValueOf != null) {
            lValueOf.getClass();
        } else {
            jCo = 0;
        }
        if (System.currentTimeMillis() - jCo >= jR) {
            gkVarB.j(System.currentTimeMillis());
            return false;
        }
        hw.a("AdInfoUtil", "request OAID time limit, timeInter=" + jR + ", lastTime=" + jCo + " callerPkg: " + packageName);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean E(Context context) {
        gk gkVarB = fp.b(context);
        long jCp = gkVarB.cp();
        long jS = ((long) gkVarB.S()) * 60000;
        long jC = as.c();
        if (jC >= jCp + jS) {
            gkVarB.k(jC);
            return false;
        }
        hw.a("AdInfoUtil", "request UUID time limit, timeInterval= %s min, lastTime= %s", Long.valueOf(jS / 60000), as.a(Constants.TIME_FORMAT_WITHOUT_MILLS).format(Long.valueOf(jCp)));
        return true;
    }

    static class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f20613a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f20614b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f20615c;

        @Override // java.lang.Runnable
        public void run() {
            cn.a(this.f20613a).a(this.f20614b, Boolean.valueOf(this.f20615c));
        }

        a(Context context, String str, boolean z) {
            this.f20613a = context;
            this.f20614b = str;
            this.f20615c = z;
        }
    }

    public static void B(final Context context) {
        o.a(new Runnable() { // from class: com.huawei.openalliance.ad.utils.d.6
            @Override // java.lang.Runnable
            public void run() {
                String str;
                hw.a("AdInfoUtil", "adid_double_frame start to getAdid from hms");
                if (dk.g()) {
                    boolean zB = fp.b(context).b("adid", 180);
                    hw.a("AdInfoUtil", "adid_double_frame getAdid in Interval : %s", Boolean.valueOf(zB));
                    if (zB) {
                        return;
                    }
                    long jC = as.c();
                    hw.a("AdInfoUtil", "adid_double_frame get adid start time : %s", Long.valueOf(jC));
                    Pair<Integer, String> pairA = cf.a(context, "/adid/sync", "");
                    fp.b(context).s("adid");
                    if (pairA != null && ((Integer) pairA.first).intValue() == 200) {
                        long jC2 = as.c();
                        hw.a("AdInfoUtil", "adid_double_frame get adid end time : %s, diff : %s, adid is : %s", Long.valueOf(jC2), Long.valueOf(jC2 - jC), dg.i((String) pairA.second));
                        fp.b(context).C(pairA.second != null ? (String) pairA.second : "");
                        return;
                    }
                    str = "adid_double_frame get adid error";
                } else {
                    str = "adid_double_frame not inside device";
                }
                hw.a("AdInfoUtil", str);
            }
        });
    }

    public static Integer A(final Context context) {
        final Integer numG = as.g(context);
        o.i(new Runnable() { // from class: com.huawei.openalliance.ad.utils.d.5
            @Override // java.lang.Runnable
            public void run() {
                cn.a(context).a(numG);
            }
        });
        return numG;
    }
}
