package df;

import android.content.Context;
import android.os.PowerManager;

/* JADX INFO: loaded from: classes7.dex */
public final class t {
    static {
        ue.u.b("WakeLocks");
    }

    public static final PowerManager.WakeLock a(Context context) {
        context.getClass();
        Object systemService = context.getApplicationContext().getSystemService("power");
        systemService.getClass();
        String strConcat = "WorkManager: ".concat("ProcessorForegroundLck");
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) systemService).newWakeLock(1, strConcat);
        synchronized (u.f59427a) {
            u.f59428b.put(wakeLockNewWakeLock, strConcat);
        }
        wakeLockNewWakeLock.getClass();
        return wakeLockNewWakeLock;
    }
}
