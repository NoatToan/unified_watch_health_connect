package com.xiaomi.smarthome.library.common.network;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.util.Log;
import com.example.statistics.export.OneTrackConstant;
import com.xiaomi.smarthome.library.log.LogType;
import com.xiaomi.smarthome.library.log.MiJiaLog;

/* JADX INFO: loaded from: classes2.dex */
public class WifiUtil {
    public static final String TAG = "WifiUtil";
    private static WifiManager.MulticastLock multicastLock;

    public static void acquireMulticast(Context context) {
        if (context == null) {
            return;
        }
        releaseMulticast(context);
        try {
            WifiManager.MulticastLock multicastLockCreateMulticastLock = ((WifiManager) context.getSystemService("wifi")).createMulticastLock("multicast.test");
            multicastLock = multicastLockCreateMulticastLock;
            multicastLockCreateMulticastLock.acquire();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String getBSSID(Context context) {
        WifiInfo connectionInfo;
        if (context == null) {
            return "";
        }
        try {
            connectionInfo = ((WifiManager) context.getSystemService("wifi")).getConnectionInfo();
        } catch (Exception e) {
            MiJiaLog.writeLogOnAll(LogType.GENERAL, TAG, "getBSSID      " + Log.getStackTraceString(e));
            connectionInfo = null;
        }
        if (connectionInfo != null) {
            return connectionInfo.getBSSID();
        }
        return null;
    }

    public static String getIpAddress(Context context) {
        if (context == null) {
            return "";
        }
        try {
            WifiManager wifiManager = (WifiManager) context.getSystemService("wifi");
            if (!wifiManager.isWifiEnabled()) {
                wifiManager.setWifiEnabled(true);
            }
            return intToIp(wifiManager.getConnectionInfo().getIpAddress());
        } catch (Exception e) {
            MiJiaLog.writeLogOnAll(LogType.GENERAL, TAG, "getIpAddress      " + Log.getStackTraceString(e));
            return "";
        }
    }

    public static String getMacAddress(Context context) {
        WifiInfo connectionInfo;
        if (context == null) {
            return "";
        }
        try {
            connectionInfo = ((WifiManager) context.getSystemService("wifi")).getConnectionInfo();
        } catch (Exception e) {
            MiJiaLog.writeLogOnAll(LogType.GENERAL, TAG, "getMacAddress     " + Log.getStackTraceString(e));
            connectionInfo = null;
        }
        if (connectionInfo != null) {
            return connectionInfo.getMacAddress();
        }
        return null;
    }

    public static String getSSID(Context context) {
        WifiInfo connectionInfo;
        String ssid;
        if (context == null) {
            return "";
        }
        try {
            connectionInfo = ((WifiManager) context.getSystemService("wifi")).getConnectionInfo();
        } catch (Exception e) {
            MiJiaLog.writeLogOnAll(LogType.GENERAL, TAG, "getSSID       " + Log.getStackTraceString(e));
            connectionInfo = null;
        }
        if (connectionInfo == null || (ssid = connectionInfo.getSSID()) == null) {
            return null;
        }
        return (ssid.length() >= 3 && ssid.startsWith("\"") && ssid.endsWith("\"")) ? ssid.substring(1, ssid.length() - 1) : ssid;
    }

    public static String getWifiMac(Context context) {
        WifiInfo connectionInfo;
        if (context == null) {
            return "";
        }
        try {
            connectionInfo = ((WifiManager) context.getSystemService("wifi")).getConnectionInfo();
        } catch (Exception e) {
            MiJiaLog.writeLogOnAll(LogType.GENERAL, TAG, "getWifiMac    " + Log.getStackTraceString(e));
            connectionInfo = null;
        }
        if (connectionInfo != null) {
            return connectionInfo.getBSSID();
        }
        return null;
    }

    private static String intToIp(int i) {
        return (i & 255) + "." + ((i >> 8) & 255) + "." + ((i >> 16) & 255) + "." + ((i >> 24) & 255);
    }

    public static boolean isWifi(Context context) {
        NetworkInfo activeNetworkInfo;
        return (context == null || (activeNetworkInfo = ((ConnectivityManager) context.getSystemService(OneTrackConstant.EVENT_NAME_CONNECTIVITY)).getActiveNetworkInfo()) == null || activeNetworkInfo.getType() != 1) ? false : true;
    }

    public static void releaseMulticast(Context context) {
        try {
            WifiManager.MulticastLock multicastLock2 = multicastLock;
            if (multicastLock2 != null && multicastLock2.isHeld()) {
                multicastLock.release();
            }
            multicastLock = null;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
