package defpackage;

import android.content.Context;
import android.os.PowerManager;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes10.dex */
public class ixw {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static PowerManager.WakeLock f38187c;
    private static final Object d = new Object();

    public static void c(Context context) {
        synchronized (d) {
            if (f38187c == null) {
                Object systemService = context.getSystemService("power");
                if (systemService instanceof PowerManager) {
                    LogUtil.a("Track_WakeLockUtil", "acquireWakeLock");
                    PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) systemService).newWakeLock(1, "SportWakeLock");
                    f38187c = wakeLockNewWakeLock;
                    wakeLockNewWakeLock.setReferenceCounted(false);
                    f38187c.acquire();
                }
            }
            LogUtil.a("Track_WakeLockUtil", "acquireWakeLock end");
        }
    }

    public static void b() {
        synchronized (d) {
            if (f38187c != null) {
                LogUtil.a("Track_WakeLockUtil", "release the wake lock now.");
                if (f38187c.isHeld()) {
                    f38187c.release();
                }
                f38187c = null;
            }
            LogUtil.a("Track_WakeLockUtil", "releaseWakeLock end");
        }
    }
}
