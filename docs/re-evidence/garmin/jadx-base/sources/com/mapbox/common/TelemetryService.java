package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes2.dex */
public final class TelemetryService {
    protected long peer;

    public static class TelemetryServicePeerCleaner implements Runnable {
        private long peer;

        public TelemetryServicePeerCleaner(long j8) {
            this.peer = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            TelemetryService.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public TelemetryService(long j8) {
        setPeer(j8);
    }

    public static native void cleanNativePeer(long j8);

    public static native TelemetryService getOrCreate();

    private void setPeer(long j8) {
        this.peer = j8;
        if (j8 == 0) {
            return;
        }
        CleanerService.register(this, new TelemetryServicePeerCleaner(j8));
    }

    public native void flush(FlushOperationResultCallback flushOperationResultCallback);
}
