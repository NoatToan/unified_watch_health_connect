package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;

/* JADX INFO: loaded from: classes2.dex */
final class StylePackCallbackNative implements StylePackCallback {
    private long peer;

    public static class StylePackCallbackPeerCleaner implements Runnable {
        private long peer;

        public StylePackCallbackPeerCleaner(long j8) {
            this.peer = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            StylePackCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private StylePackCallbackNative(long j8) {
        this.peer = j8;
        CleanerService.register(this, new StylePackCallbackPeerCleaner(j8));
    }

    public static native void cleanNativePeer(long j8);

    @Override // com.mapbox.maps.StylePackCallback
    public native void run(Expected<StylePackError, StylePack> expected);
}
