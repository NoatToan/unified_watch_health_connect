package com.huawei.phoneservice.faq.base.util;

import android.app.Activity;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.phoneservice.faq.base.constants.FaqConstants;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collection;

/* JADX INFO: loaded from: classes13.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f21585a;

    public static boolean d(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    public static boolean d() {
        synchronized (d.class) {
            if (f21585a == null) {
                f21585a = b("ro.build.characteristics");
            }
        }
        return "tablet".equals(f21585a) || "car".equals(f21585a) || h();
    }

    public static boolean c(Collection<?> collection) {
        return collection == null || collection.isEmpty();
    }

    public static boolean c(Context context) {
        ConnectivityManager connectivityManager;
        if (context != null && (connectivityManager = (ConnectivityManager) context.getApplicationContext().getSystemService("connectivity")) != null) {
            for (Network network : connectivityManager.getAllNetworks()) {
                NetworkInfo networkInfo = connectivityManager.getNetworkInfo(network);
                if (networkInfo != null && networkInfo.isConnected()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean e() {
        return g() && c("9.0.0") >= 0;
    }

    public static boolean b() {
        return g() && c("6.0.0") >= 0;
    }

    public static void b(Activity activity) {
        View viewPeekDecorView;
        if (activity == null || (viewPeekDecorView = activity.getWindow().peekDecorView()) == null || viewPeekDecorView.getWindowToken() == null) {
            return;
        }
        ((InputMethodManager) activity.getSystemService("input_method")).hideSoftInputFromWindow(viewPeekDecorView.getWindowToken(), 0);
    }

    public static int b(Context context) {
        return (d(context) ? e(context) : a(context)) / 2;
    }

    public static int a(Context context) {
        return i(context).widthPixels;
    }

    public static int e(Context context) {
        return i(context).heightPixels;
    }

    private static boolean g() {
        return e("com.huawei.android.os.BuildEx");
    }

    private static boolean h() {
        return "Y".equalsIgnoreCase(i.d().getSdk(FaqConstants.FAQ_IS_OTHER_BRAND_CAR));
    }

    private static String b(String str) {
        Class<?> cls;
        String str2;
        String str3;
        Method declaredMethod = null;
        try {
            cls = Class.forName("android.os.SystemProperties");
            try {
                declaredMethod = cls.getDeclaredMethod("get", String.class);
            } catch (ClassNotFoundException unused) {
                str2 = "ClassNotFoundException";
                g.c("FaqCommonUtils", str2);
            } catch (NoSuchMethodException unused2) {
                str2 = "NoSuchMethodException";
                g.c("FaqCommonUtils", str2);
            } catch (Exception unused3) {
                g.c("FaqCommonUtils", "Exception");
            }
        } catch (ClassNotFoundException unused4) {
            cls = null;
        } catch (NoSuchMethodException unused5) {
            cls = null;
        } catch (Exception unused6) {
            cls = null;
        }
        if (declaredMethod != null) {
            try {
                return (String) declaredMethod.invoke(cls, str);
            } catch (IllegalAccessException unused7) {
                str3 = "IllegalAccessException";
                g.c("FaqCommonUtils", str3);
                return "";
            } catch (IllegalArgumentException unused8) {
                str3 = "IllegalArgumentException";
                g.c("FaqCommonUtils", str3);
                return "";
            } catch (InvocationTargetException unused9) {
                str3 = "InvocationTargetException";
                g.c("FaqCommonUtils", str3);
                return "";
            } catch (Exception unused10) {
                g.c("FaqCommonUtils", "Exception");
            }
        }
        return "";
    }

    private static boolean e(String str) {
        try {
            Class.forName(str);
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    private static String c() {
        return b("ro.build.version.emui");
    }

    private static String a() {
        try {
            String strC = c();
            if (TextUtils.isEmpty(strC)) {
                return null;
            }
            return strC.split("_")[1];
        } catch (Exception unused) {
            g.c("FaqCommonUtils", "getEmui()  Exception...");
            return null;
        }
    }

    private static DisplayMetrics i(Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        if (context != null) {
            ((WindowManager) context.getSystemService(Constants.NATIVE_WINDOW_SUB_DIR)).getDefaultDisplay().getMetrics(displayMetrics);
        }
        return displayMetrics;
    }

    private static int c(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        String strA = a();
        if (TextUtils.isEmpty(strA)) {
            return -1;
        }
        if (str.equals(strA)) {
            return 0;
        }
        String[] strArrSplit = str.split("\\.");
        String[] strArrSplit2 = strA.split("\\.");
        int length = strArrSplit.length;
        int length2 = strArrSplit2.length;
        int iMin = Math.min(length, length2);
        for (int i = 0; i < iMin; i++) {
            int i2 = Integer.parseInt(strArrSplit[i]);
            int i3 = Integer.parseInt(strArrSplit2[i]);
            if (i2 > i3) {
                return -1;
            }
            if (i2 < i3) {
                return 1;
            }
        }
        return Integer.compare(length2, length);
    }
}
