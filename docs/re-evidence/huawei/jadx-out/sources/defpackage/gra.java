package defpackage;

import android.content.Context;
import android.os.PowerManager;

/* JADX INFO: loaded from: classes30.dex */
public class gra {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f35951b = new Object();
    private static PowerManager.WakeLock e;

    public static void e() {
        if (e != null) {
            grn.e("WakelockUtil", "wakelock already init");
            return;
        }
        Context contextD = gqv.d();
        if (contextD != null) {
            grn.d("WakelockUtil", "init wakelock start");
            PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) contextD.getSystemService("power")).newWakeLock(1, "aar:lbs");
            e = wakeLockNewWakeLock;
            wakeLockNewWakeLock.setReferenceCounted(true);
            return;
        }
        grn.c("WakelockUtil", "init wakelock is null");
    }

    public static void d(int i) {
        if (e == null) {
            grn.c("WakelockUtil", "acquire wakelock is null");
            return;
        }
        synchronized (f35951b) {
            e.acquire(i);
            grn.d("WakelockUtil", "acquire wakelock succeed");
        }
    }

    public static void d() {
        if (e == null) {
            grn.c("WakelockUtil", "release wakelock is null");
            return;
        }
        synchronized (f35951b) {
            if (e.isHeld()) {
                e.release();
                grn.d("WakelockUtil", "release wakelock succeed");
            } else {
                grn.c("WakelockUtil", "WakeLock expired before release");
            }
        }
    }
}
