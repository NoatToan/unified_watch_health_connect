package com.huami.discovery.bridge.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* JADX INFO: loaded from: classes8.dex */
public class NetUtil {
    private static final String a = "NetUtil";
    private static final int b = 0;
    private static final int c = 1;
    private static final int d = 2;
    private static final int e = 3;
    private static final int f = 4;
    private static final String g = "2g";
    private static final String h = "3g";
    private static final String i = "4g";
    private static final String j = "wifi";
    private static final String k = "TYPE_NO_NETWORK";

    @Deprecated
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

    @Deprecated
    public static int getNetworkType(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
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
            if (!subtypeName.equalsIgnoreCase("TD-SCDMA") && !subtypeName.equalsIgnoreCase("WCDMA") && !subtypeName.equalsIgnoreCase("CDMA2000")) {
                return 0;
            }
        }
        return 3;
    }

    @Deprecated
    public static boolean isConnectedBy2G(Context context) {
        return getNetworkType(context) == 2;
    }

    @Deprecated
    public static boolean isConnectedBy3G(Context context) {
        return getNetworkType(context) == 3;
    }

    @Deprecated
    public static boolean isConnectedBy4G(Context context) {
        return getNetworkType(context) == 4;
    }

    @Deprecated
    public static boolean isConnectedByWifi(Context context) {
        return getNetworkType(context) == 1;
    }

    public static boolean isNetworkConnected(Context context) {
        return com.huami.util.net.NetUtil.INSTANCE.networkInfo().isNetworkConnect();
    }

    @Deprecated
    public static boolean isWifiConnected(Context context) {
        NetworkInfo[] allNetworkInfo = ((ConnectivityManager) context.getApplicationContext().getSystemService("connectivity")).getAllNetworkInfo();
        for (int i2 = 0; i2 < allNetworkInfo.length; i2++) {
            if (allNetworkInfo[i2].getType() == 1) {
                if (allNetworkInfo[i2].isConnected()) {
                    return true;
                }
            } else if (allNetworkInfo[i2].getType() == 9) {
                if (allNetworkInfo[i2].isConnected()) {
                    return false;
                }
            } else if (allNetworkInfo[i2].getType() == 0 && allNetworkInfo[i2].isConnected()) {
                return false;
            }
        }
        return false;
    }
}
