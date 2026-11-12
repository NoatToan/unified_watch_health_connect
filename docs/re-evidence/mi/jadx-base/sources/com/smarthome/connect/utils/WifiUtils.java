package com.smarthome.connect.utils;

import android.content.Context;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.text.TextUtils;
import androidx.annotation.Keep;
import com.xiaomi.smarthome.dddcommon.Infrastruction;

/* JADX INFO: loaded from: classes6.dex */
@Infrastruction
@Keep
public class WifiUtils {
    public static int currentWifiFrequency(Context context) {
        WifiManager wifiManager = (WifiManager) context.getApplicationContext().getSystemService("wifi");
        String ssid = getConnectionInfo(wifiManager).getSSID();
        if (TextUtils.isEmpty(ssid) || ssid.length() <= 1) {
            return 0;
        }
        String strSubstring = ssid.substring(1, ssid.length() - 1);
        for (ScanResult scanResult : wifiManager.getScanResults()) {
            if (scanResult.SSID.equals(strSubstring)) {
                return scanResult.frequency;
            }
        }
        return 0;
    }

    public static WifiInfo getConnectionInfo(WifiManager wifiManager) {
        if (wifiManager == null) {
            return null;
        }
        return wifiManager.getConnectionInfo();
    }

    public static String getCurrentSSID(String str) {
        return TextUtils.isEmpty(str) ? "" : str.substring(1, str.length() - 1);
    }

    public static boolean isCurrentWifi5G(Context context) {
        return currentWifiFrequency(context) > 4900;
    }
}
