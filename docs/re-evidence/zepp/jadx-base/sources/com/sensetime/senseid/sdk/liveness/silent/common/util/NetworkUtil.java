package com.sensetime.senseid.sdk.liveness.silent.common.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import androidx.annotation.RequiresPermission;

/* JADX INFO: loaded from: classes18.dex */
public final class NetworkUtil {
    public static final String NETWORK_CLASS_2_G = "2G";
    public static final String NETWORK_CLASS_3_G = "3G";
    public static final String NETWORK_CLASS_4_G = "4G";
    public static final String NETWORK_MOBILE = "mobile";
    public static final String NETWORK_UNKNOWN = "unknown";
    public static final String NETWORK_WIFI = "wifi";

    private NetworkUtil() {
    }

    @RequiresPermission("android.permission.ACCESS_NETWORK_STATE")
    public static String getCurrentNetworkType(Context context) {
        ConnectivityManager connectivityManager;
        NetworkInfo activeNetworkInfo;
        NetworkInfo.State state;
        if (context.getPackageManager().checkPermission("android.permission.ACCESS_NETWORK_STATE", context.getPackageName()) == 0 && (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) != null && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null && activeNetworkInfo.isAvailable() && (state = activeNetworkInfo.getState()) != null && (state == NetworkInfo.State.CONNECTED || state == NetworkInfo.State.CONNECTING)) {
            if (activeNetworkInfo.getType() == 1) {
                return "wifi";
            }
            if (activeNetworkInfo.getType() == 0) {
                switch (activeNetworkInfo.getSubtype()) {
                    case 1:
                    case 2:
                    case 4:
                    case 7:
                    case 11:
                        return NETWORK_CLASS_2_G;
                    case 3:
                    case 5:
                    case 6:
                    case 8:
                    case 9:
                    case 10:
                    case 12:
                    case 14:
                    case 15:
                        return NETWORK_CLASS_3_G;
                    case 13:
                        return NETWORK_CLASS_4_G;
                    default:
                        return "mobile";
                }
            }
        }
        return "unknown";
    }
}
