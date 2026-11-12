package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes2.dex */
final class StyleManagerCallbackNative implements StyleManagerCallback {
    private long peer;

    public static class StyleManagerCallbackPeerCleaner implements Runnable {
        private long peer;

        public StyleManagerCallbackPeerCleaner(long j8) {
            this.peer = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            StyleManagerCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private StyleManagerCallbackNative(long j8) {
        this.peer = j8;
        CleanerService.register(this, new StyleManagerCallbackPeerCleaner(j8));
    }

    public static native void cleanNativePeer(long j8);

    @Override // com.mapbox.maps.StyleManagerCallback
    public native void run(StyleManager styleManager);
}
