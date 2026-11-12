package defpackage;

import android.content.Context;
import android.os.PowerManager;

/* JADX INFO: loaded from: classes6.dex */
public class u3r {
    public static PowerManager.WakeLock a(Context context, long j) {
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            return null;
        }
        PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(805306394, context.getClass().getName());
        wakeLockNewWakeLock.acquire(j);
        return wakeLockNewWakeLock;
    }

    public static boolean b(Context context) {
        return ((PowerManager) context.getSystemService("power")).isInteractive();
    }

    public static void c(PowerManager.WakeLock wakeLock) {
        if (wakeLock == null || !wakeLock.isHeld()) {
            return;
        }
        wakeLock.release();
    }
}
