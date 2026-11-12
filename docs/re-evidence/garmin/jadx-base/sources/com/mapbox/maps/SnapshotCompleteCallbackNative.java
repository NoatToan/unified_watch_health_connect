package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;

/* JADX INFO: loaded from: classes2.dex */
final class SnapshotCompleteCallbackNative implements SnapshotCompleteCallback {
    private long peer;

    public static class SnapshotCompleteCallbackPeerCleaner implements Runnable {
        private long peer;

        public SnapshotCompleteCallbackPeerCleaner(long j8) {
            this.peer = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            SnapshotCompleteCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private SnapshotCompleteCallbackNative(long j8) {
        this.peer = j8;
        CleanerService.register(this, new SnapshotCompleteCallbackPeerCleaner(j8));
    }

    public static native void cleanNativePeer(long j8);

    @Override // com.mapbox.maps.SnapshotCompleteCallback, com.mapbox.maps.QueryRenderedFeaturesCallback
    public native void run(Expected<String, MapSnapshot> expected);
}
