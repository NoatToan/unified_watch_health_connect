package com.xiaomi.smarthome.library.securecompact;

import android.net.wifi.WifiInfo;
import com.tencent.mmkv.MMKV;

/* JADX INFO: loaded from: classes2.dex */
public class WifiInfoIpAddressCompact {
    private static String getCacheDataKey() {
        return "wifi.info.ip.address.data.key";
    }

    private static String getCacheTimeKey() {
        return "wifi.info.ip.address.time.key";
    }

    private static int getCacheWifiIpAddressData() {
        return MMKV.G(FrequencySecureLimitHelper.CACHE_NAME, 2).f(getCacheDataKey(), 0);
    }

    public static synchronized int getIpAddress(WifiInfo wifiInfo) {
        int ipAddress;
        StringBuilder sb = new StringBuilder();
        sb.append("getIpAddress:");
        sb.append(FrequencySecureLimitHelper.canInvoke(getCacheTimeKey()));
        ipAddress = 0;
        if (FrequencySecureLimitHelper.canInvoke(getCacheTimeKey())) {
            try {
                ipAddress = wifiInfo.getIpAddress();
            } catch (Exception unused) {
            }
            saveCacheWifiIpAddressData(ipAddress);
            FrequencySecureLimitHelper.cacheInvokeTime(getCacheTimeKey());
        }
        return ipAddress;
    }

    private static void saveCacheWifiIpAddressData(int i) {
        MMKV.G(FrequencySecureLimitHelper.CACHE_NAME, 2).r(getCacheDataKey(), i);
    }
}
