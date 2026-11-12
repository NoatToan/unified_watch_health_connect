package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes2.dex */
public final class CleanupManager {
    protected long peer;

    public static class CleanupManagerPeerCleaner implements Runnable {
        private long peer;

        public CleanupManagerPeerCleaner(long j8) {
            this.peer = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            CleanupManager.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public CleanupManager(long j8) {
        setPeer(j8);
    }

    public static native void cleanNativePeer(long j8);

    public static native void cleanup();

    private void setPeer(long j8) {
        this.peer = j8;
        if (j8 == 0) {
            return;
        }
        CleanerService.register(this, new CleanupManagerPeerCleaner(j8));
    }
}
