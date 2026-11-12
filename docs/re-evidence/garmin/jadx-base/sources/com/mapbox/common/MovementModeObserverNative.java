package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes2.dex */
final class MovementModeObserverNative implements MovementModeObserver {
    protected long peer;

    public static class MovementModeObserverPeerCleaner implements Runnable {
        private long peer;

        public MovementModeObserverPeerCleaner(long j8) {
            this.peer = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            MovementModeObserverNative.cleanNativePeer(this.peer);
        }
    }

    public MovementModeObserverNative(long j8) {
        this.peer = j8;
        CleanerService.register(this, new MovementModeObserverPeerCleaner(j8));
    }

    public static native void cleanNativePeer(long j8);

    @Override // com.mapbox.common.MovementModeObserver
    public native void onMovementModeChanged(MovementInfo movementInfo);

    @Override // com.mapbox.common.MovementModeObserver
    public native void onMovementModeError(String str);
}
