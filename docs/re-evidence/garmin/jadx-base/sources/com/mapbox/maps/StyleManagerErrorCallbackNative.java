package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes2.dex */
final class StyleManagerErrorCallbackNative implements StyleManagerErrorCallback {
    private long peer;

    public static class StyleManagerErrorCallbackPeerCleaner implements Runnable {
        private long peer;

        public StyleManagerErrorCallbackPeerCleaner(long j8) {
            this.peer = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            StyleManagerErrorCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private StyleManagerErrorCallbackNative(long j8) {
        this.peer = j8;
        CleanerService.register(this, new StyleManagerErrorCallbackPeerCleaner(j8));
    }

    public static native void cleanNativePeer(long j8);

    @Override // com.mapbox.maps.StyleManagerErrorCallback
    public native void run(StyleManager styleManager, MapLoadingError mapLoadingError);
}
