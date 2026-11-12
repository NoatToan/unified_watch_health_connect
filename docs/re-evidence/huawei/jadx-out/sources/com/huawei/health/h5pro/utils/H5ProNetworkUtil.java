package com.huawei.health.h5pro.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.Build;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes7.dex */
public class H5ProNetworkUtil {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static ConnectivityManager f6994a;

    /* JADX INFO: loaded from: classes3.dex */
    @Retention(RetentionPolicy.SOURCE)
    public @interface NetworkType {
    }

    /* JADX INFO: loaded from: classes3.dex */
    @Retention(RetentionPolicy.SOURCE)
    public @interface TransportType {
    }

    private H5ProNetworkUtil() {
    }

    private static void b(Context context) {
        if (f6994a == null && context != null) {
            Context applicationContext = context.getApplicationContext();
            ConnectivityManager connectivityManager = (ConnectivityManager) applicationContext.getSystemService(ConnectivityManager.class);
            f6994a = connectivityManager;
            if (connectivityManager == null) {
                f6994a = (ConnectivityManager) applicationContext.getSystemService("connectivity");
            }
        }
    }

    private static boolean e(Context context, int... iArr) {
        if (iArr != null && iArr.length != 0) {
            b(context);
            ConnectivityManager connectivityManager = f6994a;
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            if (networkCapabilities != null && networkCapabilities.hasCapability(16) && networkCapabilities.hasCapability(12)) {
                for (int i : iArr) {
                    if (d(networkCapabilities, i)) {
                        return true;
                    }
                }
                return false;
            }
            LogUtil.w("H5PRO_H5ProNetworkUtil", "isTransportTypeConnected: network is unavailable");
        }
        return false;
    }

    public static boolean isNetworkAvailable(Context context) {
        b(context);
        ConnectivityManager connectivityManager = f6994a;
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        if (networkCapabilities == null) {
            LogUtil.w("H5PRO_H5ProNetworkUtil", "isNetworkAvailable: networkCapabilities is null");
            return false;
        }
        if (networkCapabilities.hasCapability(16)) {
            return networkCapabilities.hasCapability(12);
        }
        LogUtil.w("H5PRO_H5ProNetworkUtil", "isNetworkAvailable: no capability NET_CAPABILITY_VALIDATED");
        return false;
    }

    public static boolean isMobileConnected(Context context) {
        return e(context, 0);
    }

    public static boolean isOtherConnected(Context context) {
        return e(context, 2, 3, 5, 6);
    }

    public static boolean isVpnConnected(Context context) {
        return e(context, 4);
    }

    public static boolean isWifiConnected(Context context) {
        return e(context, 1);
    }

    private static boolean d(NetworkCapabilities networkCapabilities, int i) {
        if (i == 5) {
            return networkCapabilities.hasTransport(5);
        }
        if (i != 6) {
            return networkCapabilities.hasTransport(i);
        }
        if (Build.VERSION.SDK_INT >= 27) {
            return networkCapabilities.hasTransport(6);
        }
        return false;
    }
}
