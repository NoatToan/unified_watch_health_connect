package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes2.dex */
final class ResourceLoadProgressCallbackNative implements ResourceLoadProgressCallback {
    private long peer;

    public static class ResourceLoadProgressCallbackPeerCleaner implements Runnable {
        private long peer;

        public ResourceLoadProgressCallbackPeerCleaner(long j8) {
            this.peer = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            ResourceLoadProgressCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private ResourceLoadProgressCallbackNative(long j8) {
        this.peer = j8;
        CleanerService.register(this, new ResourceLoadProgressCallbackPeerCleaner(j8));
    }

    public static native void cleanNativePeer(long j8);

    @Override // com.mapbox.common.ResourceLoadProgressCallback
    public native void run(ResourceLoadProgress resourceLoadProgress);
}
