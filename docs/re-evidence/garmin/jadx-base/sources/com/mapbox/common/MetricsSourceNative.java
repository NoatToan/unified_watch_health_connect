package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class MetricsSourceNative implements MetricsSource {
    protected long peer;

    public static class MetricsSourcePeerCleaner implements Runnable {
        private long peer;

        public MetricsSourcePeerCleaner(long j8) {
            this.peer = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            MetricsSourceNative.cleanNativePeer(this.peer);
        }
    }

    public MetricsSourceNative(long j8) {
        this.peer = j8;
        CleanerService.register(this, new MetricsSourcePeerCleaner(j8));
    }

    public static native void cleanNativePeer(long j8);

    @Override // com.mapbox.common.MetricsSource
    public native List<Metrics> getMetrics();
}
