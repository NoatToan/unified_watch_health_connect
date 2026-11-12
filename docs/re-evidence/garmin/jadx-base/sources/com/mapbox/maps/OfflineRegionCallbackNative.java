package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
final class OfflineRegionCallbackNative implements OfflineRegionCallback {
    private long peer;

    public static class OfflineRegionCallbackPeerCleaner implements Runnable {
        private long peer;

        public OfflineRegionCallbackPeerCleaner(long j8) {
            this.peer = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            OfflineRegionCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private OfflineRegionCallbackNative(long j8) {
        this.peer = j8;
        CleanerService.register(this, new OfflineRegionCallbackPeerCleaner(j8));
    }

    public static native void cleanNativePeer(long j8);

    @Override // com.mapbox.maps.OfflineRegionCallback
    public native void run(Expected<String, List<OfflineRegion>> expected);
}
