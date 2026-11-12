package health.compact.a;

import android.os.Handler;
import android.os.Message;
import androidx.media3.common.C;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.dfx.DfxMonitorCenter$DfxMonitorHandler;
import com.huawei.haf.common.dfx.DfxMonitorMgr;
import com.huawei.haf.common.dfx.DfxMonitorTask;
import com.huawei.haf.common.os.MemoryUtils;

/* JADX INFO: loaded from: classes.dex */
public final class DfxMonitorCenter {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Class<? extends DfxMonitorMgr> f36539c;
    private static DfxMonitorMgr d;

    private DfxMonitorCenter() {
    }

    public static void c(Class<? extends DfxMonitorMgr> cls) {
        if (f36539c == null) {
            f36539c = cls;
        }
    }

    public static void b() {
        Class<? extends DfxMonitorMgr> cls;
        if (d == null && (cls = f36539c) != null) {
            Object objB = ReflectionUtils.b(cls);
            DfxMonitorMgr dfxMonitorMgr = objB instanceof DfxMonitorMgr ? (DfxMonitorMgr) objB : null;
            if (dfxMonitorMgr != null) {
                dfxMonitorMgr.installMonitor(BaseApplication.b());
            }
            d = dfxMonitorMgr;
        }
    }

    public static void a() {
        DfxMonitorMgr dfxMonitorMgr = d;
        d = null;
        if (dfxMonitorMgr != null) {
            dfxMonitorMgr.uninstallMonitor(BaseApplication.b());
        }
    }

    public static void e(DfxMonitorTask dfxMonitorTask) {
        if (dfxMonitorTask != null) {
            Handler handlerB = DfxMonitorCenter$DfxMonitorHandler.b();
            handlerB.removeMessages(100, dfxMonitorTask);
            handlerB.sendMessageDelayed(Message.obtain(handlerB, 100, dfxMonitorTask), Math.max(dfxMonitorTask.monitorDelayTime(), 1000L));
        }
    }

    public static void c(DfxMonitorTask dfxMonitorTask) {
        if (dfxMonitorTask != null) {
            DfxMonitorCenter$DfxMonitorHandler.b().removeMessages(100, dfxMonitorTask);
        }
    }

    public static void c(Runnable runnable) {
        b(runnable, 0L);
    }

    public static void b(Runnable runnable, long j) {
        if (runnable != null) {
            Handler handlerB = DfxMonitorCenter$DfxMonitorHandler.b();
            handlerB.removeCallbacks(runnable);
            handlerB.postDelayed(runnable, j);
        }
    }

    public static void d() {
        c(MemoryUtils.d);
    }

    public static void c() {
        b(MemoryUtils.f5917c, C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS);
        b(MemoryUtils.d, 5000L);
    }
}
