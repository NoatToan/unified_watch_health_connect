package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes2.dex */
final class StylePackLoadProgressCallbackNative implements StylePackLoadProgressCallback {
    private long peer;

    public static class StylePackLoadProgressCallbackPeerCleaner implements Runnable {
        private long peer;

        public StylePackLoadProgressCallbackPeerCleaner(long j8) {
            this.peer = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            StylePackLoadProgressCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private StylePackLoadProgressCallbackNative(long j8) {
        this.peer = j8;
        CleanerService.register(this, new StylePackLoadProgressCallbackPeerCleaner(j8));
    }

    public static native void cleanNativePeer(long j8);

    @Override // com.mapbox.maps.StylePackLoadProgressCallback
    public native void run(StylePackLoadProgress stylePackLoadProgress);
}
