package com.alipay.sdk.m.u;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes2.dex */
public class b {
    public static final long a = 3000;
    public static long b = -1;

    public static synchronized boolean a() {
        boolean z;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime - b >= 3000) {
            b = jElapsedRealtime;
            z = false;
        } else {
            z = true;
        }
        return z;
    }
}
