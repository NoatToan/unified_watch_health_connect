package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes2.dex */
final class ReachabilityChangedNative implements ReachabilityChanged {
    private long peer;

    public static class ReachabilityChangedPeerCleaner implements Runnable {
        private long peer;

        public ReachabilityChangedPeerCleaner(long j8) {
            this.peer = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            ReachabilityChangedNative.cleanNativePeer(this.peer);
        }
    }

    private ReachabilityChangedNative(long j8) {
        this.peer = j8;
        CleanerService.register(this, new ReachabilityChangedPeerCleaner(j8));
    }

    public static native void cleanNativePeer(long j8);

    @Override // com.mapbox.common.ReachabilityChanged
    public native void run(NetworkStatus networkStatus);
}
