package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes2.dex */
final class RenderFrameFinishedCallbackNative implements RenderFrameFinishedCallback {
    private long peer;

    public static class RenderFrameFinishedCallbackPeerCleaner implements Runnable {
        private long peer;

        public RenderFrameFinishedCallbackPeerCleaner(long j8) {
            this.peer = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            RenderFrameFinishedCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private RenderFrameFinishedCallbackNative(long j8) {
        this.peer = j8;
        CleanerService.register(this, new RenderFrameFinishedCallbackPeerCleaner(j8));
    }

    public static native void cleanNativePeer(long j8);

    @Override // com.mapbox.maps.RenderFrameFinishedCallback
    public native void run(RenderFrameFinished renderFrameFinished);
}
