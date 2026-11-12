package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;

/* JADX INFO: loaded from: classes2.dex */
final class QueryFeatureExtensionCallbackNative implements QueryFeatureExtensionCallback {
    private long peer;

    public static class QueryFeatureExtensionCallbackPeerCleaner implements Runnable {
        private long peer;

        public QueryFeatureExtensionCallbackPeerCleaner(long j8) {
            this.peer = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            QueryFeatureExtensionCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private QueryFeatureExtensionCallbackNative(long j8) {
        this.peer = j8;
        CleanerService.register(this, new QueryFeatureExtensionCallbackPeerCleaner(j8));
    }

    public static native void cleanNativePeer(long j8);

    @Override // com.mapbox.maps.QueryFeatureExtensionCallback
    public native void run(Expected<String, FeatureExtensionValue> expected);
}
