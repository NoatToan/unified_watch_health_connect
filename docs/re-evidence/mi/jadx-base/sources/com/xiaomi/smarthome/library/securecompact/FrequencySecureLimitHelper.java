package com.xiaomi.smarthome.library.securecompact;

import com.tencent.mmkv.MMKV;

/* JADX INFO: loaded from: classes2.dex */
public class FrequencySecureLimitHelper {
    public static final String CACHE_NAME = "secure.frequency.limit.data";
    public static final long INVOKE_TIME_THRESHOLD = 1100;

    public static boolean cacheInvokeTime(String str) {
        return MMKV.G(CACHE_NAME, 2).s(str, System.currentTimeMillis());
    }

    public static boolean canInvoke(String str) {
        return System.currentTimeMillis() - getLastInvokeTime(str) > INVOKE_TIME_THRESHOLD;
    }

    public static long getLastInvokeTime(String str) {
        return MMKV.G(CACHE_NAME, 2).g(str, 0L);
    }
}
