package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;

/* JADX INFO: loaded from: classes2.dex */
final class Tracing {
    protected long peer;

    public static class TracingPeerCleaner implements Runnable {
        private long peer;

        public TracingPeerCleaner(long j8) {
            this.peer = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            Tracing.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public Tracing(long j8) {
        setPeer(j8);
    }

    public static native void cleanNativePeer(long j8);

    public static native TracingBackendType getTracingBackendType();

    private void setPeer(long j8) {
        this.peer = j8;
        if (j8 == 0) {
            return;
        }
        CleanerService.register(this, new TracingPeerCleaner(j8));
    }

    public static native void setTracingBackendType(TracingBackendType tracingBackendType);
}
