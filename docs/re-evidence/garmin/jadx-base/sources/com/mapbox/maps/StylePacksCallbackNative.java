package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class StylePacksCallbackNative implements StylePacksCallback {
    private long peer;

    public static class StylePacksCallbackPeerCleaner implements Runnable {
        private long peer;

        public StylePacksCallbackPeerCleaner(long j8) {
            this.peer = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            StylePacksCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private StylePacksCallbackNative(long j8) {
        this.peer = j8;
        CleanerService.register(this, new StylePacksCallbackPeerCleaner(j8));
    }

    public static native void cleanNativePeer(long j8);

    @Override // com.mapbox.maps.StylePacksCallback
    public native void run(Expected<StylePackError, List<StylePack>> expected);
}
