package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;

/* JADX INFO: loaded from: classes2.dex */
final class ReadStreamNative implements ReadStream {
    protected long peer;

    public static class ReadStreamPeerCleaner implements Runnable {
        private long peer;

        public ReadStreamPeerCleaner(long j8) {
            this.peer = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            ReadStreamNative.cleanNativePeer(this.peer);
        }
    }

    public ReadStreamNative(long j8) {
        this.peer = j8;
        CleanerService.register(this, new ReadStreamPeerCleaner(j8));
    }

    public static native void cleanNativePeer(long j8);

    @Override // com.mapbox.common.ReadStream
    public native boolean isExhausted();

    @Override // com.mapbox.common.ReadStream
    public native boolean isReadable();

    @Override // com.mapbox.common.ReadStream
    public native Expected<String, Long> read(Buffer buffer);

    @Override // com.mapbox.common.ReadStream
    public native long readBytes();
}
