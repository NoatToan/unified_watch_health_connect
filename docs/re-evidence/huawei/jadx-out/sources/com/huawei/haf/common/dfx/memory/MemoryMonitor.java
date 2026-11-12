package com.huawei.haf.common.dfx.memory;

import com.huawei.haf.common.dfx.DfxMonitorTask;
import health.compact.a.DfxMonitorCenter;

/* JADX INFO: loaded from: classes.dex */
public final class MemoryMonitor implements DfxMonitorTask {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static MemoryCallback f5883b;
    private static DfxMonitorTask e;

    @Override // com.huawei.haf.common.dfx.DfxMonitorTask
    public long monitorDelayTime() {
        return 60000L;
    }

    private MemoryMonitor() {
    }

    public static void a(MemoryCallback memoryCallback) {
        if (f5883b != null || memoryCallback == null) {
            return;
        }
        f5883b = memoryCallback;
        if (memoryCallback.isAutoCheck()) {
            MemoryMonitor memoryMonitor = new MemoryMonitor();
            e = memoryMonitor;
            DfxMonitorCenter.e(memoryMonitor);
        }
    }

    public static void c() {
        if (f5883b != null) {
            DfxMonitorTask dfxMonitorTask = e;
            if (dfxMonitorTask != null) {
                DfxMonitorCenter.c(dfxMonitorTask);
                e = null;
            }
            f5883b = null;
            CloseGuardMonitor.c();
        }
    }

    public static void d(boolean z) {
        MemoryCallback memoryCallback = f5883b;
        if (memoryCallback == null || e != null) {
            return;
        }
        memoryCallback.check(z);
    }

    public static boolean d() {
        return f5883b != null;
    }

    public static void c(String str, String str2, String str3, long j) {
        MemoryCallback memoryCallback = f5883b;
        if (memoryCallback != null) {
            memoryCallback.reportLeak(str, str2, str3, j);
        }
    }

    public static void e() {
        if (d()) {
            CloseGuardMonitor.e();
        }
    }

    @Override // com.huawei.haf.common.dfx.DfxMonitorTask
    public void onMonitor() {
        MemoryCallback memoryCallback = f5883b;
        if (memoryCallback != null) {
            DfxMonitorCenter.e(this);
            memoryCallback.check(true);
        }
    }
}
