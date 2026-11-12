package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.None;

/* JADX INFO: loaded from: classes2.dex */
final class FeatureStateOperationCallbackNative implements FeatureStateOperationCallback {
    private long peer;

    public static class FeatureStateOperationCallbackPeerCleaner implements Runnable {
        private long peer;

        public FeatureStateOperationCallbackPeerCleaner(long j8) {
            this.peer = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            FeatureStateOperationCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private FeatureStateOperationCallbackNative(long j8) {
        this.peer = j8;
        CleanerService.register(this, new FeatureStateOperationCallbackPeerCleaner(j8));
    }

    public static native void cleanNativePeer(long j8);

    @Override // com.mapbox.maps.FeatureStateOperationCallback
    public native void run(Expected<String, None> expected);
}
