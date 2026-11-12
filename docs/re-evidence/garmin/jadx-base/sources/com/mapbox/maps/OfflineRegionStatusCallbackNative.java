package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
final class OfflineRegionStatusCallbackNative implements OfflineRegionStatusCallback {
    private long peer;

    public static class OfflineRegionStatusCallbackPeerCleaner implements Runnable {
        private long peer;

        public OfflineRegionStatusCallbackPeerCleaner(long j8) {
            this.peer = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            OfflineRegionStatusCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private OfflineRegionStatusCallbackNative(long j8) {
        this.peer = j8;
        CleanerService.register(this, new OfflineRegionStatusCallbackPeerCleaner(j8));
    }

    public static native void cleanNativePeer(long j8);

    @Override // com.mapbox.maps.OfflineRegionStatusCallback
    public native void run(Expected<String, OfflineRegionStatus> expected);
}
