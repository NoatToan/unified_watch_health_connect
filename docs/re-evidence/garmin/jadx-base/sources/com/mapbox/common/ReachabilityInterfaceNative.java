package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes2.dex */
final class ReachabilityInterfaceNative implements ReachabilityInterface {
    protected long peer;

    public static class ReachabilityInterfacePeerCleaner implements Runnable {
        private long peer;

        public ReachabilityInterfacePeerCleaner(long j8) {
            this.peer = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            ReachabilityInterfaceNative.cleanNativePeer(this.peer);
        }
    }

    public ReachabilityInterfaceNative(long j8) {
        this.peer = j8;
        CleanerService.register(this, new ReachabilityInterfacePeerCleaner(j8));
    }

    public static native void cleanNativePeer(long j8);

    @Override // com.mapbox.common.ReachabilityInterface
    public native long addListener(ReachabilityChanged reachabilityChanged);

    @Override // com.mapbox.common.ReachabilityInterface
    public native NetworkStatus currentNetworkStatus();

    @Override // com.mapbox.common.ReachabilityInterface
    public native boolean isReachable();

    @Override // com.mapbox.common.ReachabilityInterface
    public native boolean removeListener(long j8);
}
