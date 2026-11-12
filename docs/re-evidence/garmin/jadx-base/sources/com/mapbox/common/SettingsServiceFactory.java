package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes2.dex */
public final class SettingsServiceFactory {
    protected long peer;

    public static class SettingsServiceFactoryPeerCleaner implements Runnable {
        private long peer;

        public SettingsServiceFactoryPeerCleaner(long j8) {
            this.peer = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            SettingsServiceFactory.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public SettingsServiceFactory(long j8) {
        setPeer(j8);
    }

    public static native void cleanNativePeer(long j8);

    public static native SettingsService getInstance(SettingsServiceStorageType settingsServiceStorageType);

    private void setPeer(long j8) {
        this.peer = j8;
        if (j8 == 0) {
            return;
        }
        CleanerService.register(this, new SettingsServiceFactoryPeerCleaner(j8));
    }
}
