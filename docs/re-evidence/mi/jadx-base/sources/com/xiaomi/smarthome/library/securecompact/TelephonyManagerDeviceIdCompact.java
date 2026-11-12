package com.xiaomi.smarthome.library.securecompact;

import android.annotation.SuppressLint;
import android.telephony.TelephonyManager;
import com.tencent.mmkv.MMKV;

/* JADX INFO: loaded from: classes2.dex */
public class TelephonyManagerDeviceIdCompact {
    private static String getCacheDataKey() {
        return "telephony.device.id.data.key";
    }

    private static String getCacheDeviceIdData() {
        return MMKV.G(FrequencySecureLimitHelper.CACHE_NAME, 2).k(getCacheDataKey(), "");
    }

    private static String getCacheTimeKey() {
        return "telephony.device.id.time.key";
    }

    @SuppressLint({"MissingPermission"})
    public static synchronized String getDeviceId(TelephonyManager telephonyManager) {
        String cacheDeviceIdData;
        StringBuilder sb = new StringBuilder();
        sb.append("getDeviceId:");
        sb.append(FrequencySecureLimitHelper.canInvoke(getCacheTimeKey()));
        cacheDeviceIdData = getCacheDeviceIdData();
        if (FrequencySecureLimitHelper.canInvoke(getCacheTimeKey())) {
            try {
                cacheDeviceIdData = telephonyManager.getDeviceId();
            } catch (Exception unused) {
            }
            saveCacheDeviceIdData(cacheDeviceIdData);
            FrequencySecureLimitHelper.cacheInvokeTime(getCacheTimeKey());
        }
        return cacheDeviceIdData;
    }

    private static void saveCacheDeviceIdData(String str) {
        MMKV.G(FrequencySecureLimitHelper.CACHE_NAME, 2).u(getCacheDataKey(), str);
    }
}
