package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.None;

/* JADX INFO: loaded from: classes2.dex */
final class AsyncOperationResultCallbackNative implements AsyncOperationResultCallback {
    private long peer;

    public static class AsyncOperationResultCallbackPeerCleaner implements Runnable {
        private long peer;

        public AsyncOperationResultCallbackPeerCleaner(long j8) {
            this.peer = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            AsyncOperationResultCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private AsyncOperationResultCallbackNative(long j8) {
        this.peer = j8;
        CleanerService.register(this, new AsyncOperationResultCallbackPeerCleaner(j8));
    }

    public static native void cleanNativePeer(long j8);

    @Override // com.mapbox.maps.AsyncOperationResultCallback
    public native void run(Expected<String, None> expected);
}
