package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes2.dex */
final class LogWriterBackendNative implements LogWriterBackend {
    protected long peer;

    public static class LogWriterBackendPeerCleaner implements Runnable {
        private long peer;

        public LogWriterBackendPeerCleaner(long j8) {
            this.peer = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            LogWriterBackendNative.cleanNativePeer(this.peer);
        }
    }

    public LogWriterBackendNative(long j8) {
        this.peer = j8;
        CleanerService.register(this, new LogWriterBackendPeerCleaner(j8));
    }

    public static native void cleanNativePeer(long j8);

    @Override // com.mapbox.common.LogWriterBackend
    public native void writeLog(LoggingLevel loggingLevel, String str);
}
