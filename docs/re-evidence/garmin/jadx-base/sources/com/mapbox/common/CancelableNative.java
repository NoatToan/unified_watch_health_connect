package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes2.dex */
final class CancelableNative implements Cancelable {
    protected long peer;

    public static class CancelablePeerCleaner implements Runnable {
        private long peer;

        public CancelablePeerCleaner(long j8) {
            this.peer = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            CancelableNative.cleanNativePeer(this.peer);
        }
    }

    public CancelableNative(long j8) {
        this.peer = j8;
        CleanerService.register(this, new CancelablePeerCleaner(j8));
    }

    public static native void cleanNativePeer(long j8);

    @Override // com.mapbox.common.Cancelable
    public native void cancel();
}
