package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes2.dex */
public final class Version {
    protected long peer;

    public static class VersionPeerCleaner implements Runnable {
        private long peer;

        public VersionPeerCleaner(long j8) {
            this.peer = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            Version.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public Version(long j8) {
        setPeer(j8);
    }

    public static native void cleanNativePeer(long j8);

    public static native String getCommonSDKRevisionString();

    public static native String getCommonSDKVersionString();

    public static native int getMajorVersion();

    public static native int getMinorVersion();

    public static native int getPatchVersion();

    private void setPeer(long j8) {
        this.peer = j8;
        if (j8 == 0) {
            return;
        }
        CleanerService.register(this, new VersionPeerCleaner(j8));
    }
}
