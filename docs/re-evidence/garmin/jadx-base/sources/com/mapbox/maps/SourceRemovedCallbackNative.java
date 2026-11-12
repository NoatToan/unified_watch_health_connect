package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes2.dex */
final class SourceRemovedCallbackNative implements SourceRemovedCallback {
    private long peer;

    public static class SourceRemovedCallbackPeerCleaner implements Runnable {
        private long peer;

        public SourceRemovedCallbackPeerCleaner(long j8) {
            this.peer = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            SourceRemovedCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private SourceRemovedCallbackNative(long j8) {
        this.peer = j8;
        CleanerService.register(this, new SourceRemovedCallbackPeerCleaner(j8));
    }

    public static native void cleanNativePeer(long j8);

    @Override // com.mapbox.maps.SourceRemovedCallback
    public native void run(SourceRemoved sourceRemoved);
}
