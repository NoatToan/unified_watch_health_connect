package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes2.dex */
public class SchedulerFactory {
    protected long peer;

    public static class SchedulerFactoryPeerCleaner implements Runnable {
        private long peer;

        public SchedulerFactoryPeerCleaner(long j8) {
            this.peer = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            SchedulerFactory.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public SchedulerFactory(long j8) {
        setPeer(j8);
    }

    public static native void cleanNativePeer(long j8);

    public static native Scheduler createSequenced();

    public static native Scheduler createSequenced(ThreadServiceType threadServiceType);

    public static native Scheduler createSingleThreaded();

    public static native Scheduler createSingleThreaded(ThreadServiceType threadServiceType);

    private void setPeer(long j8) {
        this.peer = j8;
        if (j8 == 0) {
            return;
        }
        CleanerService.register(this, new SchedulerFactoryPeerCleaner(j8));
    }

    public static native Scheduler threadPool();

    public static native Scheduler threadPool(ThreadServiceType threadServiceType);
}
