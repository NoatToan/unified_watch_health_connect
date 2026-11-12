package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;

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
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public Version(long j8) {
        setPeer(j8);
    }

    public static native void cleanNativePeer(long j8);

    public static native int getMajorVersion();

    public static native int getMinorVersion();

    public static native int getPatchVersion();

    public static native String getRevisionString();

    public static native String getVersionString();

    private void setPeer(long j8) {
        this.peer = j8;
        if (j8 == 0) {
            return;
        }
        CleanerService.register(this, new VersionPeerCleaner(j8));
    }
}
