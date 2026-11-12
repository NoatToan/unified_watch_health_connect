package com.xiaomi.hm.health.baseutil;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes19.dex */
@Deprecated
public class NetUtil {
    public static final String VALUE_NETWORK_TYPE_2G = "2g";
    public static final String VALUE_NETWORK_TYPE_3G = "3g";
    public static final String VALUE_NETWORK_TYPE_4G = "4g";
    public static final String VALUE_NETWORK_TYPE_NO_NETWORK = "TYPE_NO_NETWORK";
    public static final String VALUE_NETWORK_TYPE_WIFI = "wifi";
    private static final String a = "NetUtil";
    private static final int b = 0;
    private static final int c = 1;
    private static final int d = 2;
    private static final int e = 3;
    private static final int f = 4;

    private static ConnectivityManager a(Context context) {
        return (ConnectivityManager) context.getApplicationContext().getSystemService("connectivity");
    }

    private static boolean b(@NonNull Context context) {
        return false;
    }

    public static String getNetType(Context context) {
        if (!isNetworkConnected(context)) {
            return "TYPE_NO_NETWORK";
        }
        if (isConnectedBy2G(context)) {
            return "2g";
        }
        if (isConnectedBy3G(context)) {
            return "3g";
        }
        if (isConnectedBy4G(context)) {
            return "4g";
        }
        return isConnectedByWifi(context) ? "wifi" : "";
    }

    public static int getNetworkType(Context context) {
        NetworkInfo activeNetworkInfo = a(context).getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isAvailable() || !activeNetworkInfo.isConnected()) {
            return 0;
        }
        int type = activeNetworkInfo.getType();
        if (type == 1) {
            return 1;
        }
        if (type != 0) {
            return 0;
        }
        String subtypeName = activeNetworkInfo.getSubtypeName();
        int subtype = activeNetworkInfo.getSubtype();
        if (subtype == 4 || subtype == 1 || subtype == 2 || subtype == 7 || subtype == 11) {
            return 2;
        }
        if (subtype != 3 && subtype != 8 && subtype != 6 && subtype != 5 && subtype != 9 && subtype != 10 && subtype != 14 && subtype != 15 && subtype != 12) {
            if (subtype == 13) {
                return 4;
            }
            if (!"TD-SCDMA".equalsIgnoreCase(subtypeName) && !"WCDMA".equalsIgnoreCase(subtypeName) && !"CDMA2000".equalsIgnoreCase(subtypeName)) {
                Log.i(a, "strSubTypeName:" + subtypeName);
                return 0;
            }
        }
        return 3;
    }

    public static boolean isConnectedBy2G(Context context) {
        return getNetworkType(context) == 2;
    }

    public static boolean isConnectedBy3G(Context context) {
        return getNetworkType(context) == 3;
    }

    public static boolean isConnectedBy4G(Context context) {
        return getNetworkType(context) == 4;
    }

    public static boolean isConnectedByWifi(Context context) {
        return getNetworkType(context) == 1;
    }

    public static boolean isNetworkConnected(Context context) {
        NetworkInfo activeNetworkInfo;
        ConnectivityManager connectivityManagerA = a(context);
        return (connectivityManagerA == null || (activeNetworkInfo = connectivityManagerA.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnected()) ? false : true;
    }

    public static boolean isWifiConnected(Context context) {
        NetworkInfo[] allNetworkInfo = a(context).getAllNetworkInfo();
        for (int i = 0; i < allNetworkInfo.length; i++) {
            if (allNetworkInfo[i].getType() == 1) {
                if (allNetworkInfo[i].isConnected()) {
                    return true;
                }
            } else if (allNetworkInfo[i].getType() == 9) {
                if (allNetworkInfo[i].isConnected()) {
                    return false;
                }
            } else if (allNetworkInfo[i].getType() == 0 && allNetworkInfo[i].isConnected()) {
                return false;
            }
        }
        return false;
    }
}
