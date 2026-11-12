package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
final class OfflineRegionCreateCallbackNative implements OfflineRegionCreateCallback {
    private long peer;

    public static class OfflineRegionCreateCallbackPeerCleaner implements Runnable {
        private long peer;

        public OfflineRegionCreateCallbackPeerCleaner(long j8) {
            this.peer = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            OfflineRegionCreateCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private OfflineRegionCreateCallbackNative(long j8) {
        this.peer = j8;
        CleanerService.register(this, new OfflineRegionCreateCallbackPeerCleaner(j8));
    }

    public static native void cleanNativePeer(long j8);

    @Override // com.mapbox.maps.OfflineRegionCreateCallback
    public native void run(Expected<String, OfflineRegion> expected);
}
