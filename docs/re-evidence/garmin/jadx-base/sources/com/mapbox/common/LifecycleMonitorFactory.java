package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes2.dex */
public final class LifecycleMonitorFactory {
    protected long peer;

    public static class LifecycleMonitorFactoryPeerCleaner implements Runnable {
        private long peer;

        public LifecycleMonitorFactoryPeerCleaner(long j8) {
            this.peer = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            LifecycleMonitorFactory.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public LifecycleMonitorFactory(long j8) {
        setPeer(j8);
    }

    public static native void cleanNativePeer(long j8);

    public static native LifecycleMonitorInterface getOrCreate();

    private void setPeer(long j8) {
        this.peer = j8;
        if (j8 == 0) {
            return;
        }
        CleanerService.register(this, new LifecycleMonitorFactoryPeerCleaner(j8));
    }
}
