package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes2.dex */
final class PlaybackFinishedNative implements PlaybackFinished {
    private long peer;

    public static class PlaybackFinishedPeerCleaner implements Runnable {
        private long peer;

        public PlaybackFinishedPeerCleaner(long j8) {
            this.peer = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            PlaybackFinishedNative.cleanNativePeer(this.peer);
        }
    }

    private PlaybackFinishedNative(long j8) {
        this.peer = j8;
        CleanerService.register(this, new PlaybackFinishedPeerCleaner(j8));
    }

    public static native void cleanNativePeer(long j8);

    @Override // com.mapbox.maps.PlaybackFinished
    public native void run();
}
