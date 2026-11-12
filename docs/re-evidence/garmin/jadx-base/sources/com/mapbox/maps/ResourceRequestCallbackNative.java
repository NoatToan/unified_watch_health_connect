package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes2.dex */
final class ResourceRequestCallbackNative implements ResourceRequestCallback {
    private long peer;

    public static class ResourceRequestCallbackPeerCleaner implements Runnable {
        private long peer;

        public ResourceRequestCallbackPeerCleaner(long j8) {
            this.peer = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            ResourceRequestCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private ResourceRequestCallbackNative(long j8) {
        this.peer = j8;
        CleanerService.register(this, new ResourceRequestCallbackPeerCleaner(j8));
    }

    public static native void cleanNativePeer(long j8);

    @Override // com.mapbox.maps.ResourceRequestCallback
    public native void run(ResourceRequest resourceRequest);
}
