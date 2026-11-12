package com.huawei.haf.common.dfx.storage;

import com.huawei.haf.common.dfx.DfxMonitorTask;
import health.compact.a.DfxMonitorCenter;
import health.compact.a.LogUtil;

/* JADX INFO: loaded from: classes.dex */
public final class StorageMonitor implements DfxMonitorTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static StorageCallback f5900a;

    @Override // com.huawei.haf.common.dfx.DfxMonitorTask
    public long monitorDelayTime() {
        return 60000L;
    }

    private StorageMonitor() {
    }

    public static void a(StorageCallback storageCallback) {
        if (storageCallback == null) {
            storageCallback = new DefaultStorageHandler("HAF_StorageMonitor");
        }
        f5900a = storageCallback;
    }

    public static void a() {
        f5900a = null;
    }

    public static void b() {
        DfxMonitorCenter.e(new StorageMonitor());
        LogUtil.b("HAF_StorageMonitor", "oneCheck");
    }

    public static void b(boolean z) {
        StorageCallback storageCallback = f5900a;
        if (storageCallback != null) {
            storageCallback.dumpStorageInfo(z);
        }
    }

    @Override // com.huawei.haf.common.dfx.DfxMonitorTask
    public void onMonitor() {
        StorageCallback storageCallback = f5900a;
        if (storageCallback != null) {
            storageCallback.checkStorageInfo(false);
        }
    }
}
