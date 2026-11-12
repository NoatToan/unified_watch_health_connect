package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes2.dex */
final class StyleImageMissingCallbackNative implements StyleImageMissingCallback {
    private long peer;

    public static class StyleImageMissingCallbackPeerCleaner implements Runnable {
        private long peer;

        public StyleImageMissingCallbackPeerCleaner(long j8) {
            this.peer = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            StyleImageMissingCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private StyleImageMissingCallbackNative(long j8) {
        this.peer = j8;
        CleanerService.register(this, new StyleImageMissingCallbackPeerCleaner(j8));
    }

    public static native void cleanNativePeer(long j8);

    @Override // com.mapbox.maps.StyleImageMissingCallback
    public native void run(StyleImageMissing styleImageMissing);
}
