package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes2.dex */
public final class MetricsServiceFactory {
    protected long peer;

    public static class MetricsServiceFactoryPeerCleaner implements Runnable {
        private long peer;

        public MetricsServiceFactoryPeerCleaner(long j8) {
            this.peer = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            MetricsServiceFactory.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public MetricsServiceFactory(long j8) {
        setPeer(j8);
    }

    public static native void cleanNativePeer(long j8);

    public static native MetricsService getInstance();

    public static native MetricsService getInstanceForLogging();

    public static native void reset();

    private void setPeer(long j8) {
        this.peer = j8;
        if (j8 == 0) {
            return;
        }
        CleanerService.register(this, new MetricsServiceFactoryPeerCleaner(j8));
    }
}
