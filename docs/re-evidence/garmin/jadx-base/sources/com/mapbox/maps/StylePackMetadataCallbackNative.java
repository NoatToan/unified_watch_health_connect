package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.Value;

/* JADX INFO: loaded from: classes2.dex */
final class StylePackMetadataCallbackNative implements StylePackMetadataCallback {
    private long peer;

    public static class StylePackMetadataCallbackPeerCleaner implements Runnable {
        private long peer;

        public StylePackMetadataCallbackPeerCleaner(long j8) {
            this.peer = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            StylePackMetadataCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private StylePackMetadataCallbackNative(long j8) {
        this.peer = j8;
        CleanerService.register(this, new StylePackMetadataCallbackPeerCleaner(j8));
    }

    public static native void cleanNativePeer(long j8);

    @Override // com.mapbox.maps.StylePackMetadataCallback
    public native void run(Expected<StylePackError, Value> expected);
}
