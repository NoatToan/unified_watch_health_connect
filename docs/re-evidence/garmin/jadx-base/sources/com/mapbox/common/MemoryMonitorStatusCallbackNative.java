package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;

/* JADX INFO: loaded from: classes2.dex */
final class MemoryMonitorStatusCallbackNative implements MemoryMonitorStatusCallback {
    private long peer;

    public static class MemoryMonitorStatusCallbackPeerCleaner implements Runnable {
        private long peer;

        public MemoryMonitorStatusCallbackPeerCleaner(long j8) {
            this.peer = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            MemoryMonitorStatusCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private MemoryMonitorStatusCallbackNative(long j8) {
        this.peer = j8;
        CleanerService.register(this, new MemoryMonitorStatusCallbackPeerCleaner(j8));
    }

    public static native void cleanNativePeer(long j8);

    @Override // com.mapbox.common.MemoryMonitorStatusCallback
    public native void run(Expected<String, MemoryMonitorStatus> expected);
}
