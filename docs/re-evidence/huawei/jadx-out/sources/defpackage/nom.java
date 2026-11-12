package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.hwidauth.api.ResultCallBack;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.constant.ParamConstants;
import com.huawei.secure.android.common.util.SafeString;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URLDecoder;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public class nom {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static ResultCallBack f43364a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static ResultCallBack f43365b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static ResultCallBack f43366c = null;
    private static ResultCallBack d = null;
    private static ResultCallBack e = null;
    private static ResultCallBack f = null;
    private static String g = "";
    private static ResultCallBack h = null;
    private static ResultCallBack i = null;
    private static ResultCallBack j = null;
    private static ArrayList<String> l = new ArrayList<>();
    private static String m = "";
    private static String n;

    public static String b() {
        if (Build.VERSION.SDK_INT >= 33) {
            return "android.permission.READ_MEDIA_IMAGES";
        }
        return "android.permission.WRITE_EXTERNAL_STORAGE";
    }

    private static String j(Context context) {
        return context.getResources().getConfiguration().locale.getLanguage().toLowerCase(Locale.getDefault());
    }

    public static String b(Context context) {
        return context.getResources().getConfiguration().locale.getCountry().toLowerCase(Locale.getDefault());
    }

    public static void b(Activity activity) {
        if (nos.b()) {
            try {
                activity.getWindow().getAttributes().getClass().getDeclaredField(ParamConstants.Param.LAYOUT_IN_DISPLAY_CUTOUT_MODE).set(activity.getWindow().getAttributes(), 1);
            } catch (RuntimeException e2) {
                nox.a("BaseUtil", "RuntimeException: " + e2.getClass().getSimpleName(), true);
            } catch (Exception e3) {
                nox.a("BaseUtil", "Exception: " + e3.getClass().getSimpleName(), true);
            }
        }
    }

    public static boolean d() {
        return nos.d() || c();
    }

    public static boolean c() {
        return nos.c() || e();
    }

    public static boolean e() {
        return nos.a();
    }

    public static String e(Context context) {
        if (context == null) {
            return "";
        }
        if (TextUtils.isEmpty(d(context))) {
            return j(context) + Constants.LINK + b(context).toUpperCase(Locale.getDefault());
        }
        return j(context) + Constants.LINK + d(context) + Constants.LINK + b(context).toUpperCase(Locale.getDefault());
    }

    public static String d(Context context) {
        Configuration configuration = context.getResources().getConfiguration();
        if (configuration == null || configuration.locale == null) {
            return null;
        }
        return configuration.locale.getScript();
    }

    public static byte[] d(String str) {
        if (TextUtils.isEmpty(str)) {
            nox.a("BaseUtil", "getUTF8Bytes, str is empty", true);
            return new byte[0];
        }
        try {
            return str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException unused) {
            nox.a("BaseUtil", "getBytes error", true);
            return new byte[0];
        }
    }

    public static boolean a(Context context) {
        try {
            context.getPackageManager().getPackageInfo("com.tencent.mm", 0);
            nox.b("BaseUtil", "WXApp Installed", true);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            nox.a("BaseUtil", "isWechatAppSupport nameNotFound", true);
            return false;
        } catch (Exception e2) {
            nox.a("BaseUtil", "isWechatAppSupport err: " + e2.getClass().getSimpleName(), true);
            return false;
        }
    }

    public static boolean a() {
        try {
            Class.forName("com.tencent.mm.opensdk.openapi.IWXAPI");
            nox.b("BaseUtil", "has wx-sdk", true);
            return true;
        } catch (ClassNotFoundException unused) {
            nox.e("BaseUtil", "has no wx-sdk", true);
            return false;
        }
    }

    public static int c(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            nox.a("BaseUtil", "NameNotFoundException getVersionTag error", true);
            return 0;
        } catch (Exception e2) {
            nox.a("BaseUtil", "getVersionCode err: " + e2.getClass().getSimpleName(), true);
            return 0;
        }
    }

    public static int b(String str) {
        try {
            return Integer.parseInt(str);
        } catch (Exception e2) {
            nox.a("BaseUtil", "parseInt error " + e2.getClass().getSimpleName(), true);
            return -1;
        }
    }

    public static boolean a(String str) {
        try {
            Class.forName(str);
            nox.b("BaseUtil", "isExsitOfClass", true);
            return true;
        } catch (ClassNotFoundException unused) {
            nox.a("BaseUtil", "The class is not existing: ", true);
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0021  */
    public static Bundle e(String str) {
        Bundle bundleI;
        if (TextUtils.isEmpty(str)) {
            bundleI = null;
        } else {
            int iIndexOf = str.indexOf(63);
            if (iIndexOf < 0) {
                iIndexOf = str.indexOf(35);
            }
            if (iIndexOf > 0) {
                bundleI = i(SafeString.substring(str, iIndexOf + 1));
            } else {
                bundleI = null;
            }
        }
        nox.b("BaseUtil", "parseUrl", true);
        return bundleI;
    }

    private static Bundle i(String str) {
        Bundle bundle = new Bundle();
        if (str != null) {
            for (String str2 : str.split("&")) {
                String[] strArrSplit = str2.split("=");
                if (strArrSplit.length == 2) {
                    String str3 = strArrSplit[0];
                    String str4 = strArrSplit[1];
                    if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
                        bundle.putString(g(str3), g(str4));
                    }
                }
            }
        }
        return bundle;
    }

    private static String g(String str) {
        try {
            return URLDecoder.decode(str, "UTF-8");
        } catch (UnsupportedEncodingException e2) {
            e = e2;
            nox.a("BaseUtil", "Exception:" + e.getClass().getSimpleName(), true);
            return str;
        } catch (IllegalArgumentException e3) {
            e = e3;
            nox.a("BaseUtil", "Exception:" + e.getClass().getSimpleName(), true);
            return str;
        } catch (Exception e4) {
            nox.a("BaseUtil", "Exception:" + e4.getClass().getSimpleName(), true);
            return str;
        }
    }

    public static ResultCallBack h() {
        return e;
    }

    public static ResultCallBack g() {
        return f43364a;
    }

    public static ResultCallBack i() {
        return d;
    }

    public static ResultCallBack j() {
        return f43366c;
    }

    public static ResultCallBack f() {
        return f43365b;
    }

    public static void d(ResultCallBack resultCallBack) {
        synchronized (nom.class) {
            f43366c = resultCallBack;
        }
    }

    public static void c(ResultCallBack resultCallBack) {
        synchronized (nom.class) {
            e = resultCallBack;
        }
    }

    public static void a(ResultCallBack resultCallBack) {
        synchronized (nom.class) {
            d = resultCallBack;
        }
    }

    public static ResultCallBack n() {
        return h;
    }

    public static ResultCallBack m() {
        return i;
    }

    public static void e(ResultCallBack resultCallBack) {
        synchronized (nom.class) {
            f = resultCallBack;
        }
    }

    public static ResultCallBack o() {
        return f;
    }

    public static void b(ResultCallBack resultCallBack) {
        synchronized (nom.class) {
            f43365b = resultCallBack;
        }
    }

    public static ResultCallBack l() {
        return j;
    }

    public static void i(ResultCallBack resultCallBack) {
        j = resultCallBack;
    }

    public static String k() {
        return g;
    }

    public static void c(String str) {
        synchronized (nom.class) {
            g = str;
        }
    }

    public static boolean i(Context context) {
        nox.b("BaseUtil", "enter networkIsAvaiable", true);
        if (context == null) {
            return false;
        }
        Object systemService = context.getApplicationContext().getSystemService("connectivity");
        if (systemService == null) {
            nox.b("BaseUtil", "connectivity is null,so networkIsAvaiable is unaviable", true);
            return false;
        }
        NetworkInfo[] allNetworkInfo = ((ConnectivityManager) systemService).getAllNetworkInfo();
        if (allNetworkInfo == null || allNetworkInfo.length == 0) {
            nox.b("BaseUtil", "NetworkInfo is null,so networkIsAvaiable is unaviable", true);
            return false;
        }
        for (NetworkInfo networkInfo : allNetworkInfo) {
            if (networkInfo != null && networkInfo.getState() == NetworkInfo.State.CONNECTED) {
                return true;
            }
        }
        nox.b("BaseUtil", "NetworkInfo state is unaviable", true);
        return false;
    }

    public static boolean c(Bundle bundle) {
        return (bundle == null || TextUtils.isEmpty(bundle.getString("code", null))) ? false : true;
    }

    public static String q() {
        try {
            Object objC = now.c("android.os.SystemProperties", "get", new Class[]{String.class}, new Object[]{"ro.config.marketing_name"});
            if (objC != null) {
                return (String) objC;
            }
            return "";
        } catch (Exception e2) {
            nox.e("BaseUtil", e2.getClass().getSimpleName(), true);
            return "";
        }
    }

    public static void j(String str) {
        n = str;
    }

    public static String t() {
        return n;
    }

    public static ArrayList<String> r() {
        return l;
    }

    public static void a(ArrayList<String> arrayList) {
        l = arrayList;
    }

    public static void e(Activity activity) {
        if (activity == null || activity.isFinishing()) {
            return;
        }
        e(activity.getWindow(), "addPrivateFlags", new Object[]{524288}, new Class[]{Integer.TYPE});
    }

    public static String p() {
        return System.currentTimeMillis() + s();
    }

    public static String s() {
        SecureRandom secureRandomB = npd.b();
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < 19; i2++) {
            sb.append(secureRandomB.nextInt(10));
        }
        return sb.toString();
    }

    public static Object e(final Object obj, final String str, final Object[] objArr, final Class[] clsArr) {
        if (obj == null) {
            return null;
        }
        try {
            AccessController.doPrivileged(new PrivilegedAction<Object>() { // from class: nom.4
                @Override // java.security.PrivilegedAction
                public Object run() {
                    Method methodB = nom.b(obj, str, objArr, clsArr);
                    if (methodB == null) {
                        return null;
                    }
                    methodB.setAccessible(true);
                    try {
                        return methodB.invoke(obj, objArr);
                    } catch (IllegalAccessException e2) {
                        nox.b("BaseUtil", e2.getClass().getSimpleName(), true);
                        return null;
                    } catch (IllegalArgumentException e3) {
                        nox.b("BaseUtil", e3.getClass().getSimpleName(), true);
                        return null;
                    } catch (InvocationTargetException e4) {
                        nox.b("BaseUtil", e4.getClass().getSimpleName(), true);
                        return null;
                    }
                }
            });
        } catch (Exception e2) {
            nox.a("BaseUtil", "Exception: " + e2.getClass().getSimpleName(), true);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Method b(Object obj, String str, Object[] objArr, Class[] clsArr) {
        for (Class<?> superclass = obj.getClass(); superclass != Object.class; superclass = superclass.getSuperclass()) {
            try {
                return superclass.getDeclaredMethod(str, clsArr);
            } catch (NoSuchMethodException e2) {
                nox.b("BaseUtil", e2.getClass().getSimpleName(), true);
            } catch (SecurityException e3) {
                nox.b("BaseUtil", e3.getClass().getSimpleName(), true);
            }
        }
        return null;
    }

    public static String d(String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (String str : strArr) {
            sb.append(str);
            sb.append(" ");
        }
        return sb.toString();
    }

    public static String y() {
        try {
            Object objC = now.c("android.os.SystemProperties", "get", new Class[]{String.class, String.class}, new Object[]{"ro.build.version.emui", ""});
            if (objC != null) {
                return (String) objC;
            }
        } catch (Exception e2) {
            nox.e("BaseUtil", e2.getClass().getSimpleName(), true);
        }
        return "";
    }

    public static String f(String str) {
        return str != null ? str.replaceAll("\\s", "") : "";
    }

    public static String x() {
        return m;
    }

    public static void h(String str) {
        synchronized (nom.class) {
            m = str;
        }
    }
}
