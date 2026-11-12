package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes2.dex */
final class SourceDataLoadedCallbackNative implements SourceDataLoadedCallback {
    private long peer;

    public static class SourceDataLoadedCallbackPeerCleaner implements Runnable {
        private long peer;

        public SourceDataLoadedCallbackPeerCleaner(long j8) {
            this.peer = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            SourceDataLoadedCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private SourceDataLoadedCallbackNative(long j8) {
        this.peer = j8;
        CleanerService.register(this, new SourceDataLoadedCallbackPeerCleaner(j8));
    }

    public static native void cleanNativePeer(long j8);

    @Override // com.mapbox.maps.SourceDataLoadedCallback
    public native void run(SourceDataLoaded sourceDataLoaded);
}
