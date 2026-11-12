package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
final class OfflineDatabaseMergeCallbackNative implements OfflineDatabaseMergeCallback {
    private long peer;

    public static class OfflineDatabaseMergeCallbackPeerCleaner implements Runnable {
        private long peer;

        public OfflineDatabaseMergeCallbackPeerCleaner(long j8) {
            this.peer = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            OfflineDatabaseMergeCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private OfflineDatabaseMergeCallbackNative(long j8) {
        this.peer = j8;
        CleanerService.register(this, new OfflineDatabaseMergeCallbackPeerCleaner(j8));
    }

    public static native void cleanNativePeer(long j8);

    @Override // com.mapbox.maps.OfflineDatabaseMergeCallback
    public native void run(Expected<String, List<OfflineRegion>> expected);
}
