package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes2.dex */
@com.mapbox.annotation.MapboxExperimental
final class CameraChangedCoalescedCallbackNative implements CameraChangedCoalescedCallback {
    private long peer;

    public static class CameraChangedCoalescedCallbackPeerCleaner implements Runnable {
        private long peer;

        public CameraChangedCoalescedCallbackPeerCleaner(long j8) {
            this.peer = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            CameraChangedCoalescedCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private CameraChangedCoalescedCallbackNative(long j8) {
        this.peer = j8;
        CleanerService.register(this, new CameraChangedCoalescedCallbackPeerCleaner(j8));
    }

    public static native void cleanNativePeer(long j8);

    @Override // com.mapbox.maps.CameraChangedCoalescedCallback
    public native void run(CameraChangedCoalesced cameraChangedCoalesced);
}
