package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.Value;

/* JADX INFO: loaded from: classes2.dex */
final class QueryFeatureStateCallbackNative implements QueryFeatureStateCallback {
    private long peer;

    public static class QueryFeatureStateCallbackPeerCleaner implements Runnable {
        private long peer;

        public QueryFeatureStateCallbackPeerCleaner(long j8) {
            this.peer = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            QueryFeatureStateCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private QueryFeatureStateCallbackNative(long j8) {
        this.peer = j8;
        CleanerService.register(this, new QueryFeatureStateCallbackPeerCleaner(j8));
    }

    public static native void cleanNativePeer(long j8);

    @Override // com.mapbox.maps.QueryFeatureStateCallback
    public native void run(Expected<String, Value> expected);
}
