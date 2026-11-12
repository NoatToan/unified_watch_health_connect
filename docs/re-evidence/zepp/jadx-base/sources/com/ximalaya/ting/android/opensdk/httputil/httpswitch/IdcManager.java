package com.ximalaya.ting.android.opensdk.httputil.httpswitch;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes22.dex */
class IdcManager {
    private static long sLastNoIdcTime;

    public static synchronized void idcSwitch(String str) {
        DNSCache.getInstance().setIdcString(str);
    }

    public static synchronized void noIdcStringTime() {
        if (sLastNoIdcTime != 0) {
            if (DNSCache.getInstance().ifReachNoIdcStringIntervalTime(SystemClock.elapsedRealtime() - sLastNoIdcTime)) {
                sLastNoIdcTime = SystemClock.elapsedRealtime();
            }
        } else {
            sLastNoIdcTime = SystemClock.elapsedRealtime();
        }
    }
}
