package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes2.dex */
final class PerformanceStatisticsCallbackNative implements PerformanceStatisticsCallback {
    private long peer;

    public static class PerformanceStatisticsCallbackPeerCleaner implements Runnable {
        private long peer;

        public PerformanceStatisticsCallbackPeerCleaner(long j8) {
            this.peer = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            PerformanceStatisticsCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private PerformanceStatisticsCallbackNative(long j8) {
        this.peer = j8;
        CleanerService.register(this, new PerformanceStatisticsCallbackPeerCleaner(j8));
    }

    public static native void cleanNativePeer(long j8);

    @Override // com.mapbox.maps.PerformanceStatisticsCallback
    public native void run(PerformanceStatistics performanceStatistics);
}
