package com.mapbox.common.location;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes2.dex */
final class GetLocationCallbackNative implements GetLocationCallback {
    private long peer;

    public static class GetLocationCallbackPeerCleaner implements Runnable {
        private long peer;

        public GetLocationCallbackPeerCleaner(long j8) {
            this.peer = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            GetLocationCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private GetLocationCallbackNative(long j8) {
        this.peer = j8;
        CleanerService.register(this, new GetLocationCallbackPeerCleaner(j8));
    }

    public static native void cleanNativePeer(long j8);

    @Override // com.mapbox.common.location.GetLocationCallback
    public native void run(Location location);
}
