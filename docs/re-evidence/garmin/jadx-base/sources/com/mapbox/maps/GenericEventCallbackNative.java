package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes2.dex */
final class GenericEventCallbackNative implements GenericEventCallback {
    private long peer;

    public static class GenericEventCallbackPeerCleaner implements Runnable {
        private long peer;

        public GenericEventCallbackPeerCleaner(long j8) {
            this.peer = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            GenericEventCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private GenericEventCallbackNative(long j8) {
        this.peer = j8;
        CleanerService.register(this, new GenericEventCallbackPeerCleaner(j8));
    }

    public static native void cleanNativePeer(long j8);

    @Override // com.mapbox.maps.GenericEventCallback
    public native void run(GenericEvent genericEvent);
}
