package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.None;

/* JADX INFO: loaded from: classes2.dex */
final class TelemetryUtilsResponseCallbackNative implements TelemetryUtilsResponseCallback {
    private long peer;

    public static class TelemetryUtilsResponseCallbackPeerCleaner implements Runnable {
        private long peer;

        public TelemetryUtilsResponseCallbackPeerCleaner(long j8) {
            this.peer = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            TelemetryUtilsResponseCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private TelemetryUtilsResponseCallbackNative(long j8) {
        this.peer = j8;
        CleanerService.register(this, new TelemetryUtilsResponseCallbackPeerCleaner(j8));
    }

    public static native void cleanNativePeer(long j8);

    @Override // com.mapbox.common.TelemetryUtilsResponseCallback
    public native void run(Expected<EventsServiceError, None> expected);
}
