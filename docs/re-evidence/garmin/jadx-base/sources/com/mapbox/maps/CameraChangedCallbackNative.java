package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes2.dex */
final class CameraChangedCallbackNative implements CameraChangedCallback {
    private long peer;

    public static class CameraChangedCallbackPeerCleaner implements Runnable {
        private long peer;

        public CameraChangedCallbackPeerCleaner(long j8) {
            this.peer = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            CameraChangedCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private CameraChangedCallbackNative(long j8) {
        this.peer = j8;
        CleanerService.register(this, new CameraChangedCallbackPeerCleaner(j8));
    }

    public static native void cleanNativePeer(long j8);

    @Override // com.mapbox.maps.CameraChangedCallback
    public native void run(CameraChanged cameraChanged);
}
