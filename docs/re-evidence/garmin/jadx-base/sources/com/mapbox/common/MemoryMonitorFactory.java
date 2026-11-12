package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes2.dex */
public final class MemoryMonitorFactory {
    protected long peer;

    public static class MemoryMonitorFactoryPeerCleaner implements Runnable {
        private long peer;

        public MemoryMonitorFactoryPeerCleaner(long j8) {
            this.peer = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            MemoryMonitorFactory.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public MemoryMonitorFactory(long j8) {
        setPeer(j8);
    }

    public static native void cleanNativePeer(long j8);

    public static native MemoryMonitorInterface getOrCreate();

    public static native void reset();

    private void setPeer(long j8) {
        this.peer = j8;
        if (j8 == 0) {
            return;
        }
        CleanerService.register(this, new MemoryMonitorFactoryPeerCleaner(j8));
    }

    public static native void setUserDefined(MemoryMonitorInterface memoryMonitorInterface);
}
