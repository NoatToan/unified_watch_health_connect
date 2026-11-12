package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes2.dex */
final class StyleLoadedCallbackNative implements StyleLoadedCallback {
    private long peer;

    public static class StyleLoadedCallbackPeerCleaner implements Runnable {
        private long peer;

        public StyleLoadedCallbackPeerCleaner(long j8) {
            this.peer = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            StyleLoadedCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private StyleLoadedCallbackNative(long j8) {
        this.peer = j8;
        CleanerService.register(this, new StyleLoadedCallbackPeerCleaner(j8));
    }

    public static native void cleanNativePeer(long j8);

    @Override // com.mapbox.maps.StyleLoadedCallback
    public native void run(StyleLoaded styleLoaded);
}
