package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes2.dex */
final class MemoryMonitorObserverNative implements MemoryMonitorObserver {
    protected long peer;

    public static class MemoryMonitorObserverPeerCleaner implements Runnable {
        private long peer;

        public MemoryMonitorObserverPeerCleaner(long j8) {
            this.peer = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            MemoryMonitorObserverNative.cleanNativePeer(this.peer);
        }
    }

    public MemoryMonitorObserverNative(long j8) {
        this.peer = j8;
        CleanerService.register(this, new MemoryMonitorObserverPeerCleaner(j8));
    }

    public static native void cleanNativePeer(long j8);

    @Override // com.mapbox.common.MemoryMonitorObserver
    public native void onMemoryMonitorAlert(MemoryMonitorStatus memoryMonitorStatus);
}
