package com.xiaomi.smarthome.library.securecompact;

import com.tencent.mmkv.MMKV;
import java.net.InetAddress;

/* JADX INFO: loaded from: classes2.dex */
public class HostNameCompact extends FrequencySecureLimitHelper {
    private static String getCacheDataKey() {
        return "host.name.data.key";
    }

    private static String getCacheHostNameData() {
        return MMKV.G(FrequencySecureLimitHelper.CACHE_NAME, 2).k(getCacheDataKey(), "");
    }

    private static String getCacheTimeKey() {
        return "host.name.time.key";
    }

    public static synchronized String getHostName(InetAddress inetAddress) {
        String hostName;
        StringBuilder sb = new StringBuilder();
        sb.append("getHostName:");
        sb.append(FrequencySecureLimitHelper.canInvoke(getCacheTimeKey()));
        hostName = "";
        if (FrequencySecureLimitHelper.canInvoke(getCacheTimeKey())) {
            hostName = inetAddress.getHostName();
            saveCacheHostNameData(hostName);
            FrequencySecureLimitHelper.cacheInvokeTime(getCacheTimeKey());
        }
        return hostName;
    }

    private static void saveCacheHostNameData(String str) {
        MMKV.G(FrequencySecureLimitHelper.CACHE_NAME, 2).u(getCacheDataKey(), str);
    }
}
