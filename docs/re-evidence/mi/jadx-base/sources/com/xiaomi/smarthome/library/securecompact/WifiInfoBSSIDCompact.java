package com.xiaomi.smarthome.library.securecompact;

import android.annotation.SuppressLint;
import android.net.wifi.WifiInfo;
import com.tencent.mmkv.MMKV;

/* JADX INFO: loaded from: classes2.dex */
public class WifiInfoBSSIDCompact {
    @SuppressLint({"MissingPermission"})
    public static synchronized String getBSSID(WifiInfo wifiInfo) {
        String bssid;
        StringBuilder sb = new StringBuilder();
        sb.append("getBSSID:");
        sb.append(FrequencySecureLimitHelper.canInvoke(getCacheTimeKey()));
        bssid = "";
        if (FrequencySecureLimitHelper.canInvoke(getCacheTimeKey())) {
            try {
                bssid = wifiInfo.getBSSID();
            } catch (Exception unused) {
            }
            saveCacheWifiBSSIDData(bssid);
            FrequencySecureLimitHelper.cacheInvokeTime(getCacheTimeKey());
        }
        return bssid;
    }

    private static String getCacheBSSIDData() {
        return MMKV.G(FrequencySecureLimitHelper.CACHE_NAME, 2).k(getCacheDataKey(), "");
    }

    private static String getCacheDataKey() {
        return "wifi.info.bssid.data.key";
    }

    private static String getCacheTimeKey() {
        return "wifi.info.bssid.time.key";
    }

    private static void saveCacheWifiBSSIDData(String str) {
        MMKV.G(FrequencySecureLimitHelper.CACHE_NAME, 2).u(getCacheDataKey(), str);
    }
}
