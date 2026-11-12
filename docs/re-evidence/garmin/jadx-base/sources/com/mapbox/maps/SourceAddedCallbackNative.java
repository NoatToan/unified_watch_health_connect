package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes2.dex */
final class SourceAddedCallbackNative implements SourceAddedCallback {
    private long peer;

    public static class SourceAddedCallbackPeerCleaner implements Runnable {
        private long peer;

        public SourceAddedCallbackPeerCleaner(long j8) {
            this.peer = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            SourceAddedCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private SourceAddedCallbackNative(long j8) {
        this.peer = j8;
        CleanerService.register(this, new SourceAddedCallbackPeerCleaner(j8));
    }

    public static native void cleanNativePeer(long j8);

    @Override // com.mapbox.maps.SourceAddedCallback
    public native void run(SourceAdded sourceAdded);
}
