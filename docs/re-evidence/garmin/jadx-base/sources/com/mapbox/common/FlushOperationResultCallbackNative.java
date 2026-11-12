package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.None;

/* JADX INFO: loaded from: classes2.dex */
final class FlushOperationResultCallbackNative implements FlushOperationResultCallback {
    private long peer;

    public static class FlushOperationResultCallbackPeerCleaner implements Runnable {
        private long peer;

        public FlushOperationResultCallbackPeerCleaner(long j8) {
            this.peer = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            FlushOperationResultCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private FlushOperationResultCallbackNative(long j8) {
        this.peer = j8;
        CleanerService.register(this, new FlushOperationResultCallbackPeerCleaner(j8));
    }

    public static native void cleanNativePeer(long j8);

    @Override // com.mapbox.common.FlushOperationResultCallback, com.mapbox.maps.FeatureStateOperationCallback
    public native void run(Expected<String, None> expected);
}
