package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;

/* JADX INFO: loaded from: classes2.dex */
final class AmbientCacheClearingCallbackNative implements AmbientCacheClearingCallback {
    private long peer;

    public static class AmbientCacheClearingCallbackPeerCleaner implements Runnable {
        private long peer;

        public AmbientCacheClearingCallbackPeerCleaner(long j8) {
            this.peer = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            AmbientCacheClearingCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private AmbientCacheClearingCallbackNative(long j8) {
        this.peer = j8;
        CleanerService.register(this, new AmbientCacheClearingCallbackPeerCleaner(j8));
    }

    public static native void cleanNativePeer(long j8);

    @Override // com.mapbox.common.AmbientCacheClearingCallback
    public native void run(Expected<CacheClearingError, Long> expected);
}
