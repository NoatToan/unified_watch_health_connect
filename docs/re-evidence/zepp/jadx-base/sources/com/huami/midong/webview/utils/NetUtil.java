package com.huami.midong.webview.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.huami.watch.util.Log;
import com.huami.watch.util.NetworkUtil;

/* JADX INFO: loaded from: classes11.dex */
public class NetUtil {
    private static final int KEY_NET_TYPE_2G = 2;
    private static final int KEY_NET_TYPE_3G = 3;
    private static final int KEY_NET_TYPE_4G = 4;
    private static final int KEY_NET_TYPE_NO_NETWORK = 0;
    private static final int KEY_NET_TYPE_WIFI = 1;
    private static final String NET_TYPE_2G = "2G";
    private static final String NET_TYPE_3G_4G = "3G+";
    private static final String NET_TYPE_WIFI = "WIFI";
    private static final String TAG = "JsBridge-NetUtil";
    private static final String VALUE_NETWORK_TYPE_2G = "2g";
    private static final String VALUE_NETWORK_TYPE_3G = "3g";
    private static final String VALUE_NETWORK_TYPE_4G = "4g";
    private static final String VALUE_NETWORK_TYPE_NO_NETWORK = "TYPE_NO_NETWORK";
    private static final String VALUE_NETWORK_TYPE_WIFI = "wifi";

    public static String getNetType(Context context) {
        String str;
        if (!NetworkUtil.isOnline(context)) {
            str = "TYPE_NO_NETWORK";
        } else if (isConnectedBy2G(context)) {
            str = "2g";
        } else if (isConnectedBy3G(context)) {
            str = "3g";
        } else if (isConnectedBy4G(context)) {
            str = "4g";
        } else {
            str = isConnectedByWifi(context) ? "wifi" : "";
        }
        Log.d(TAG, "net type:" + str, new Object[0]);
        return str;
    }

    public static String getNetTypeParams(Context context) {
        String netType = getNetType(context);
        if (netType.equals("wifi")) {
            return NET_TYPE_WIFI;
        }
        if (netType.equals("2g")) {
            return "2G";
        }
        return (netType.equals("3g") || netType.equals("4g")) ? NET_TYPE_3G_4G : "";
    }

    public static int getNetworkType(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
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

    public static boolean isWifiConnected(Context context) {
        for (NetworkInfo networkInfo : ((ConnectivityManager) context.getSystemService("connectivity")).getAllNetworkInfo()) {
            if (networkInfo.getType() == 1) {
                if (networkInfo.isConnected()) {
                    return true;
                }
            } else if (networkInfo.getType() == 9) {
                if (networkInfo.isConnected()) {
                    return false;
                }
            } else if (networkInfo.getType() == 0 && networkInfo.isConnected()) {
                return false;
            }
        }
        return false;
    }
}
