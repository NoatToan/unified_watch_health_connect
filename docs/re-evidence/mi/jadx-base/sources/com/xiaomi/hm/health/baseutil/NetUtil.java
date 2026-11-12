package com.xiaomi.hm.health.baseutil;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.example.statistics.export.OneTrackConstant;

/* JADX INFO: loaded from: classes11.dex */
@Deprecated
public class NetUtil {
    private static final int KEY_NET_TYPE_2G = 2;
    private static final int KEY_NET_TYPE_3G = 3;
    private static final int KEY_NET_TYPE_4G = 4;
    private static final int KEY_NET_TYPE_NO_NETWORK = 0;
    private static final int KEY_NET_TYPE_WIFI = 1;
    private static final String TAG = "NetUtil";
    public static final String VALUE_NETWORK_TYPE_2G = "2g";
    public static final String VALUE_NETWORK_TYPE_3G = "3g";
    public static final String VALUE_NETWORK_TYPE_4G = "4g";
    public static final String VALUE_NETWORK_TYPE_NO_NETWORK = "TYPE_NO_NETWORK";
    public static final String VALUE_NETWORK_TYPE_WIFI = "wifi";

    private static ConnectivityManager getConnectivityManager(Context context) {
        return (ConnectivityManager) context.getApplicationContext().getSystemService(OneTrackConstant.EVENT_NAME_CONNECTIVITY);
    }

    public static String getNetType(Context context) {
        if (!isNetworkConnected(context)) {
            return VALUE_NETWORK_TYPE_NO_NETWORK;
        }
        if (isConnectedBy2G(context)) {
            return VALUE_NETWORK_TYPE_2G;
        }
        if (isConnectedBy3G(context)) {
            return VALUE_NETWORK_TYPE_3G;
        }
        if (isConnectedBy4G(context)) {
            return VALUE_NETWORK_TYPE_4G;
        }
        return isConnectedByWifi(context) ? "wifi" : "";
    }

    public static int getNetworkType(Context context) {
        NetworkInfo activeNetworkInfo = getConnectivityManager(context).getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isAvailable() || !activeNetworkInfo.isConnected()) {
            return 0;
        }
        int type = activeNetworkInfo.getType();
        int i = 1;
        if (type != 1) {
            if (type != 0) {
                return 0;
            }
            String subtypeName = activeNetworkInfo.getSubtypeName();
            int subtype = activeNetworkInfo.getSubtype();
            if (subtype == 4 || subtype == 1 || subtype == 2 || subtype == 7 || subtype == 11) {
                return 2;
            }
            i = 3;
            if (subtype != 3 && subtype != 8 && subtype != 6 && subtype != 5 && subtype != 9 && subtype != 10 && subtype != 14 && subtype != 15 && subtype != 12) {
                if (subtype == 13) {
                    return 4;
                }
                if (!"TD-SCDMA".equalsIgnoreCase(subtypeName) && !"WCDMA".equalsIgnoreCase(subtypeName) && !"CDMA2000".equalsIgnoreCase(subtypeName)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("strSubTypeName:");
                    sb.append(subtypeName);
                    return 0;
                }
            }
        }
        return i;
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

    private static boolean isConnectedBy5G(Context context) {
        return false;
    }

    public static boolean isConnectedByWifi(Context context) {
        return getNetworkType(context) == 1;
    }

    public static boolean isNetworkConnected(Context context) {
        NetworkInfo activeNetworkInfo;
        ConnectivityManager connectivityManager = getConnectivityManager(context);
        return (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnected()) ? false : true;
    }

    public static boolean isWifiConnected(Context context) {
        NetworkInfo[] allNetworkInfo = getConnectivityManager(context).getAllNetworkInfo();
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
