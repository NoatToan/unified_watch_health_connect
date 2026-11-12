package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes2.dex */
final class OfflineSwitchObserverNative implements OfflineSwitchObserver {
    protected long peer;

    public static class OfflineSwitchObserverPeerCleaner implements Runnable {
        private long peer;

        public OfflineSwitchObserverPeerCleaner(long j8) {
            this.peer = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            OfflineSwitchObserverNative.cleanNativePeer(this.peer);
        }
    }

    public OfflineSwitchObserverNative(long j8) {
        this.peer = j8;
        CleanerService.register(this, new OfflineSwitchObserverPeerCleaner(j8));
    }

    public static native void cleanNativePeer(long j8);

    @Override // com.mapbox.common.OfflineSwitchObserver
    public native void statusChanged(boolean z14);
}
