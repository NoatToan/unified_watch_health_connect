package com.xiaomi.smarthome.library.securecompact;

import java.net.InetAddress;
import java.net.NetworkInterface;

/* JADX INFO: loaded from: classes2.dex */
public class NetworkInterfaceCompact {
    private static NetworkInterface cacheInterface;

    public static synchronized NetworkInterface getByInetAddress(InetAddress inetAddress) {
        StringBuilder sb = new StringBuilder();
        sb.append("getByInetAddress:");
        sb.append(FrequencySecureLimitHelper.canInvoke(getCacheTimeKey()));
        if (FrequencySecureLimitHelper.canInvoke(getCacheTimeKey()) || cacheInterface == null) {
            try {
                cacheInterface = NetworkInterface.getByInetAddress(inetAddress);
                FrequencySecureLimitHelper.cacheInvokeTime(getCacheTimeKey());
            } catch (Exception unused) {
            }
        }
        return cacheInterface;
    }

    private static String getCacheTimeKey() {
        return "network.interface.time.key";
    }
}
