package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Value;

/* JADX INFO: loaded from: classes2.dex */
final class MetricsServiceSerializeCallbackNative implements MetricsServiceSerializeCallback {
    private long peer;

    public static class MetricsServiceSerializeCallbackPeerCleaner implements Runnable {
        private long peer;

        public MetricsServiceSerializeCallbackPeerCleaner(long j8) {
            this.peer = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            MetricsServiceSerializeCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private MetricsServiceSerializeCallbackNative(long j8) {
        this.peer = j8;
        CleanerService.register(this, new MetricsServiceSerializeCallbackPeerCleaner(j8));
    }

    public static native void cleanNativePeer(long j8);

    @Override // com.mapbox.common.MetricsServiceSerializeCallback
    public native void run(Value value);
}
