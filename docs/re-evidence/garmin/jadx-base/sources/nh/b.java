package nh;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes7.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static long f126108a = -1;

    public static synchronized boolean a() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime - f126108a < 3000) {
            return true;
        }
        f126108a = jElapsedRealtime;
        return false;
    }
}
