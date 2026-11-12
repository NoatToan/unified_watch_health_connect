package com.huawei.watchface;

import android.app.Application;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.huawei.secure.android.common.webview.UriUtil;
import com.huawei.watchface.environment.Environment;
import com.huawei.watchface.utils.HwLog;

/* JADX INFO: loaded from: classes20.dex */
public abstract class x2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f30658a = "x2";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Integer f30659b;

    public static boolean a(Context context) {
        if (context == null) {
            HwLog.w(f30658a, "Network no Available: context is null.");
            return false;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null) {
            HwLog.w(f30658a, "Network no Available: ConnectivityManager is null.");
            return false;
        }
        try {
            Network activeNetwork = connectivityManager.getActiveNetwork();
            if (activeNetwork == null) {
                HwLog.w(f30658a, "Network no Available: ActiveNetwork is null.");
                return false;
            }
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
            if (networkCapabilities == null) {
                HwLog.w(f30658a, "Network no Available: NetworkCapabilities is null.");
                return false;
            }
            if (networkCapabilities.hasCapability(16)) {
                return true;
            }
            HwLog.w(f30658a, "Network not has capability.");
            return connectivityManager.isDefaultNetworkActive();
        } catch (SecurityException e) {
            HwLog.e(f30658a, "isNetworkAvailable SecurityException " + HwLog.printException((Exception) e));
            return false;
        }
    }

    public static int b() {
        NetworkInfo activeNetworkInfo;
        NetworkInfo.State state;
        Application applicationContext = Environment.getApplicationContext();
        ConnectivityManager connectivityManager = (ConnectivityManager) applicationContext.getSystemService("connectivity");
        int networkType = 0;
        if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isAvailable()) {
            return 0;
        }
        NetworkInfo networkInfo = connectivityManager.getNetworkInfo(1);
        if (networkInfo != null && (state = networkInfo.getState()) != null && (state == NetworkInfo.State.CONNECTED || state == NetworkInfo.State.CONNECTING)) {
            return 1;
        }
        TelephonyManager telephonyManager = (TelephonyManager) applicationContext.getSystemService("phone");
        if (telephonyManager != null) {
            try {
                networkType = telephonyManager.getNetworkType();
            } catch (Exception e) {
                HwLog.e(f30658a, "getNetworkType error =" + HwLog.printException(e));
            }
        }
        switch (networkType) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
                return 2;
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
                return 3;
            case 13:
                return 4;
            default:
                return 5;
        }
    }

    public static int c() {
        boolean zHasCapability;
        boolean zHasCapability2;
        Integer num = f30659b;
        if (num != null) {
            return num.intValue();
        }
        int iB = b();
        NetworkCapabilities networkCapabilitiesA = a();
        if (networkCapabilitiesA != null) {
            zHasCapability = networkCapabilitiesA.hasCapability(16);
            zHasCapability2 = networkCapabilitiesA.hasCapability(17);
        } else {
            zHasCapability = false;
            zHasCapability2 = false;
        }
        if (!zHasCapability || zHasCapability2) {
            if (iB == 1) {
                iB = zHasCapability2 ? 11 : 6;
            } else if (iB == 2) {
                iB = 7;
            } else if (iB == 3) {
                iB = 8;
            } else if (iB == 4) {
                iB = 9;
            } else if (iB == 5) {
                iB = 10;
            }
        }
        f30659b = Integer.valueOf(iB);
        return iB;
    }

    public static boolean d() {
        return a(Environment.getApplicationContext());
    }

    public static String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "ip empty";
        }
        if (str.contains(":")) {
            return "ipv6";
        }
        if (str.contains(".")) {
            return "ipv4";
        }
        return "ip unknown";
    }

    public static String a(String str) {
        if (str == null) {
            return null;
        }
        try {
            return UriUtil.getHostByURI(str);
        } catch (Exception e) {
            HwLog.e(f30658a, HwLog.printException(e));
            return null;
        }
    }

    public static NetworkCapabilities a() {
        Application applicationContext = Environment.getApplicationContext();
        if (applicationContext == null) {
            HwLog.w(f30658a, "getNetworkCapability Network no Available: context is null.");
            return null;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) applicationContext.getSystemService("connectivity");
        if (connectivityManager == null) {
            HwLog.w(f30658a, "getNetworkCapability Network no Available: ConnectivityManager is null.");
            return null;
        }
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (activeNetwork == null) {
            HwLog.w(f30658a, "getNetworkCapability Network no Available: ActiveNetwork is null.");
            return null;
        }
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
        if (networkCapabilities == null) {
            HwLog.w(f30658a, "getNetworkCapability Network no Available: NetworkCapabilities is null.");
        }
        return networkCapabilities;
    }

    public static void a(Integer num) {
        f30659b = num;
    }
}
