package defpackage;

import android.content.Context;
import android.os.PowerManager;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes10.dex */
public class miz {
    private static PowerManager.WakeLock d;
    private static final Object e = new Object();

    public static void d(Context context) {
        synchronized (e) {
            if (d == null) {
                Object systemService = context.getSystemService("power");
                if (systemService instanceof PowerManager) {
                    LogUtil.a("WakeLockUtil", "acquireWakeLock");
                    PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) systemService).newWakeLock(1, "WakeLockUtil");
                    d = wakeLockNewWakeLock;
                    wakeLockNewWakeLock.setReferenceCounted(false);
                    d.acquire();
                }
            }
            LogUtil.a("WakeLockUtil", "acquireWakeLock end");
        }
    }

    public static void d() {
        synchronized (e) {
            if (d != null) {
                LogUtil.a("WakeLockUtil", "release the wake lock now.");
                if (d.isHeld()) {
                    d.release();
                }
                d = null;
            }
            LogUtil.a("WakeLockUtil", "releaseWakeLock end");
        }
    }
}
