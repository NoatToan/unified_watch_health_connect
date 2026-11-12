package com.huawei.haf.common.dfx;

import android.os.HandlerThread;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public class DfxMonitorCenter$DfxMonitorThread {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final DfxMonitorCenter$DfxMonitorThread f5857b = new DfxMonitorCenter$DfxMonitorThread();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HandlerThread f5858a;

    private DfxMonitorCenter$DfxMonitorThread() {
        HandlerThread handlerThread = new HandlerThread("DfxMonitorThread");
        this.f5858a = handlerThread;
        handlerThread.start();
    }

    static Looper c() {
        return f5857b.f5858a.getLooper();
    }
}
