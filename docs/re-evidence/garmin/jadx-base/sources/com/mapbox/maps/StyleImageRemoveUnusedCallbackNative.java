package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes2.dex */
final class StyleImageRemoveUnusedCallbackNative implements StyleImageRemoveUnusedCallback {
    private long peer;

    public static class StyleImageRemoveUnusedCallbackPeerCleaner implements Runnable {
        private long peer;

        public StyleImageRemoveUnusedCallbackPeerCleaner(long j8) {
            this.peer = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            StyleImageRemoveUnusedCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private StyleImageRemoveUnusedCallbackNative(long j8) {
        this.peer = j8;
        CleanerService.register(this, new StyleImageRemoveUnusedCallbackPeerCleaner(j8));
    }

    public static native void cleanNativePeer(long j8);

    @Override // com.mapbox.maps.StyleImageRemoveUnusedCallback
    public native void run(StyleImageRemoveUnused styleImageRemoveUnused);
}
