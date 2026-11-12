package com.xiaomi.smarthome.library.securecompact;

import android.annotation.SuppressLint;
import android.net.wifi.WifiInfo;
import com.tencent.mmkv.MMKV;

/* JADX INFO: loaded from: classes2.dex */
public class WifiInfoMacAddressCompact {
    private static String getCacheDataKey() {
        return "wifi.info.mac.address.data.key";
    }

    private static String getCacheTimeKey() {
        return "wifi.info.mac.address.time.key";
    }

    private static String getCacheWifiMacAddressData() {
        return MMKV.G(FrequencySecureLimitHelper.CACHE_NAME, 2).k(getCacheDataKey(), "");
    }

    @SuppressLint({"MissingPermission"})
    public static synchronized String getMacAddress(WifiInfo wifiInfo) {
        String macAddress;
        StringBuilder sb = new StringBuilder();
        sb.append("getMacAddress:");
        sb.append(FrequencySecureLimitHelper.canInvoke(getCacheTimeKey()));
        macAddress = "";
        if (FrequencySecureLimitHelper.canInvoke(getCacheTimeKey())) {
            try {
                macAddress = wifiInfo.getMacAddress();
            } catch (Exception unused) {
            }
            saveCacheWifiMacAddressData(macAddress);
            FrequencySecureLimitHelper.cacheInvokeTime(getCacheTimeKey());
        }
        return macAddress;
    }

    private static void saveCacheWifiMacAddressData(String str) {
        MMKV.G(FrequencySecureLimitHelper.CACHE_NAME, 2).u(getCacheDataKey(), str);
    }
}
