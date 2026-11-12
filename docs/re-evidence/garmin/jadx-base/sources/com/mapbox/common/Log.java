package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes2.dex */
class Log {
    protected long peer;

    public static class LogPeerCleaner implements Runnable {
        private long peer;

        public LogPeerCleaner(long j8) {
            this.peer = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            Log.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public Log(long j8) {
        setPeer(j8);
    }

    public static native void cleanNativePeer(long j8);

    public static native void debug(String str, String str2);

    public static native void error(String str, String str2);

    public static native void info(String str, String str2);

    private void setPeer(long j8) {
        this.peer = j8;
        if (j8 == 0) {
            return;
        }
        CleanerService.register(this, new LogPeerCleaner(j8));
    }

    public static native void warning(String str, String str2);
}
