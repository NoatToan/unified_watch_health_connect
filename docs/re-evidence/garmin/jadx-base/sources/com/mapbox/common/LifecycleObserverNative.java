package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes2.dex */
final class LifecycleObserverNative implements LifecycleObserver {
    protected long peer;

    public static class LifecycleObserverPeerCleaner implements Runnable {
        private long peer;

        public LifecycleObserverPeerCleaner(long j8) {
            this.peer = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            LifecycleObserverNative.cleanNativePeer(this.peer);
        }
    }

    public LifecycleObserverNative(long j8) {
        this.peer = j8;
        CleanerService.register(this, new LifecycleObserverPeerCleaner(j8));
    }

    public static native void cleanNativePeer(long j8);

    @Override // com.mapbox.common.LifecycleObserver
    public native void onLifecycleStateChanged(LifecycleState lifecycleState);

    @Override // com.mapbox.common.LifecycleObserver
    public native void onMonitoringStateChanged(LifecycleMonitoringState lifecycleMonitoringState, String str);
}
