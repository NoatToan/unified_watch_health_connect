package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes2.dex */
final class StyleDataLoadedCallbackNative implements StyleDataLoadedCallback {
    private long peer;

    public static class StyleDataLoadedCallbackPeerCleaner implements Runnable {
        private long peer;

        public StyleDataLoadedCallbackPeerCleaner(long j8) {
            this.peer = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            StyleDataLoadedCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private StyleDataLoadedCallbackNative(long j8) {
        this.peer = j8;
        CleanerService.register(this, new StyleDataLoadedCallbackPeerCleaner(j8));
    }

    public static native void cleanNativePeer(long j8);

    @Override // com.mapbox.maps.StyleDataLoadedCallback
    public native void run(StyleDataLoaded styleDataLoaded);
}
