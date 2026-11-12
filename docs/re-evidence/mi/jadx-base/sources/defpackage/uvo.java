package defpackage;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes4.dex */
public class uvo {
    public static long a() {
        return System.currentTimeMillis();
    }

    public static long b() {
        return System.nanoTime();
    }

    public static long c() {
        return SystemClock.uptimeMillis();
    }
}
