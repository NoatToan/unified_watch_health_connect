package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;

/* JADX INFO: loaded from: classes2.dex */
final class GetLifecycleMonitoringStateCallbackNative implements GetLifecycleMonitoringStateCallback {
    private long peer;

    public static class GetLifecycleMonitoringStateCallbackPeerCleaner implements Runnable {
        private long peer;

        public GetLifecycleMonitoringStateCallbackPeerCleaner(long j8) {
            this.peer = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            GetLifecycleMonitoringStateCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private GetLifecycleMonitoringStateCallbackNative(long j8) {
        this.peer = j8;
        CleanerService.register(this, new GetLifecycleMonitoringStateCallbackPeerCleaner(j8));
    }

    public static native void cleanNativePeer(long j8);

    @Override // com.mapbox.common.GetLifecycleMonitoringStateCallback
    public native void run(Expected<String, LifecycleMonitoringState> expected);
}
