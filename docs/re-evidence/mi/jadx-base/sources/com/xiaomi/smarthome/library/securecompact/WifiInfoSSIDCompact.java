package com.xiaomi.smarthome.library.securecompact;

import android.annotation.SuppressLint;
import android.net.wifi.WifiInfo;
import com.tencent.mmkv.MMKV;

/* JADX INFO: loaded from: classes2.dex */
public class WifiInfoSSIDCompact {
    private static String getCacheDataKey() {
        return "wifi.info.ssid.data.key";
    }

    private static String getCacheSSIDData() {
        return MMKV.G(FrequencySecureLimitHelper.CACHE_NAME, 2).k(getCacheDataKey(), "");
    }

    private static String getCacheTimeKey() {
        return "wifi.info.ssid.time.key";
    }

    @SuppressLint({"MissingPermission"})
    public static synchronized String getSSID(WifiInfo wifiInfo) {
        String ssid;
        StringBuilder sb = new StringBuilder();
        sb.append("getSSID:");
        sb.append(FrequencySecureLimitHelper.canInvoke(getCacheTimeKey()));
        ssid = "";
        if (FrequencySecureLimitHelper.canInvoke(getCacheTimeKey())) {
            try {
                ssid = wifiInfo.getSSID();
            } catch (Exception unused) {
            }
            saveCacheWifiSSIDData(ssid);
            FrequencySecureLimitHelper.cacheInvokeTime(getCacheTimeKey());
        }
        return ssid;
    }

    private static void saveCacheWifiSSIDData(String str) {
        MMKV.G(FrequencySecureLimitHelper.CACHE_NAME, 2).u(getCacheDataKey(), str);
    }
}
