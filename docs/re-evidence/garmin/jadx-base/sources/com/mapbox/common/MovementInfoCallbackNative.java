package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;

/* JADX INFO: loaded from: classes2.dex */
final class MovementInfoCallbackNative implements MovementInfoCallback {
    private long peer;

    public static class MovementInfoCallbackPeerCleaner implements Runnable {
        private long peer;

        public MovementInfoCallbackPeerCleaner(long j8) {
            this.peer = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            MovementInfoCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private MovementInfoCallbackNative(long j8) {
        this.peer = j8;
        CleanerService.register(this, new MovementInfoCallbackPeerCleaner(j8));
    }

    public static native void cleanNativePeer(long j8);

    @Override // com.mapbox.common.MovementInfoCallback
    public native void run(Expected<String, MovementInfo> expected);
}
