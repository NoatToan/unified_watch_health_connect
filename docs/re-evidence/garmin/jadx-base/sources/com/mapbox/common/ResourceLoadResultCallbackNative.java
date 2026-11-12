package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;

/* JADX INFO: loaded from: classes2.dex */
final class ResourceLoadResultCallbackNative implements ResourceLoadResultCallback {
    private long peer;

    public static class ResourceLoadResultCallbackPeerCleaner implements Runnable {
        private long peer;

        public ResourceLoadResultCallbackPeerCleaner(long j8) {
            this.peer = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            ResourceLoadResultCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private ResourceLoadResultCallbackNative(long j8) {
        this.peer = j8;
        CleanerService.register(this, new ResourceLoadResultCallbackPeerCleaner(j8));
    }

    public static native void cleanNativePeer(long j8);

    @Override // com.mapbox.common.ResourceLoadResultCallback
    public native void run(Expected<ResourceLoadError, ResourceLoadResult> expected);
}
