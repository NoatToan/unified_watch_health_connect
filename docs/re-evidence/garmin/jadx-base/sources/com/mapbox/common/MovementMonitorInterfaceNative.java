package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes2.dex */
final class MovementMonitorInterfaceNative implements MovementMonitorInterface {
    protected long peer;

    public static class MovementMonitorInterfacePeerCleaner implements Runnable {
        private long peer;

        public MovementMonitorInterfacePeerCleaner(long j8) {
            this.peer = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            MovementMonitorInterfaceNative.cleanNativePeer(this.peer);
        }
    }

    public MovementMonitorInterfaceNative(long j8) {
        this.peer = j8;
        CleanerService.register(this, new MovementMonitorInterfacePeerCleaner(j8));
    }

    public static native void cleanNativePeer(long j8);

    @Override // com.mapbox.common.MovementMonitorInterface
    public native void getMovementInfo(MovementInfoCallback movementInfoCallback);

    @Override // com.mapbox.common.MovementMonitorInterface
    public native void registerObserver(MovementModeObserver movementModeObserver);

    @Override // com.mapbox.common.MovementMonitorInterface
    public native void setMovementInfo(MovementInfo movementInfo);

    @Override // com.mapbox.common.MovementMonitorInterface
    public native void unregisterObserver(MovementModeObserver movementModeObserver);
}
