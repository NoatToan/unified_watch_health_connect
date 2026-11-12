package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;

/* JADX INFO: loaded from: classes2.dex */
final class GetLifecycleStateCallbackNative implements GetLifecycleStateCallback {
    private long peer;

    public static class GetLifecycleStateCallbackPeerCleaner implements Runnable {
        private long peer;

        public GetLifecycleStateCallbackPeerCleaner(long j8) {
            this.peer = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            GetLifecycleStateCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private GetLifecycleStateCallbackNative(long j8) {
        this.peer = j8;
        CleanerService.register(this, new GetLifecycleStateCallbackPeerCleaner(j8));
    }

    public static native void cleanNativePeer(long j8);

    @Override // com.mapbox.common.GetLifecycleStateCallback
    public native void run(Expected<String, LifecycleState> expected);
}
