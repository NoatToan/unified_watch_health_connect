package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes2.dex */
final class RenderFrameStartedCallbackNative implements RenderFrameStartedCallback {
    private long peer;

    public static class RenderFrameStartedCallbackPeerCleaner implements Runnable {
        private long peer;

        public RenderFrameStartedCallbackPeerCleaner(long j8) {
            this.peer = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            RenderFrameStartedCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private RenderFrameStartedCallbackNative(long j8) {
        this.peer = j8;
        CleanerService.register(this, new RenderFrameStartedCallbackPeerCleaner(j8));
    }

    public static native void cleanNativePeer(long j8);

    @Override // com.mapbox.maps.RenderFrameStartedCallback
    public native void run(RenderFrameStarted renderFrameStarted);
}
