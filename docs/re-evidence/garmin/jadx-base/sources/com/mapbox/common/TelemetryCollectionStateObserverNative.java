package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes2.dex */
final class TelemetryCollectionStateObserverNative implements TelemetryCollectionStateObserver {
    protected long peer;

    public static class TelemetryCollectionStateObserverPeerCleaner implements Runnable {
        private long peer;

        public TelemetryCollectionStateObserverPeerCleaner(long j8) {
            this.peer = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            TelemetryCollectionStateObserverNative.cleanNativePeer(this.peer);
        }
    }

    public TelemetryCollectionStateObserverNative(long j8) {
        this.peer = j8;
        CleanerService.register(this, new TelemetryCollectionStateObserverPeerCleaner(j8));
    }

    public static native void cleanNativePeer(long j8);

    @Override // com.mapbox.common.TelemetryCollectionStateObserver
    public native void onStateChanged(TelemetryCollectionState telemetryCollectionState);
}
