package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes2.dex */
public final class ConfigurationService {
    protected long peer;

    public static class ConfigurationServicePeerCleaner implements Runnable {
        private long peer;

        public ConfigurationServicePeerCleaner(long j8) {
            this.peer = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            ConfigurationService.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public ConfigurationService(long j8) {
        setPeer(j8);
    }

    public static native void cleanNativePeer(long j8);

    public static native ConfigurationService getOrCreate(EventsServerOptions eventsServerOptions);

    private void setPeer(long j8) {
        this.peer = j8;
        if (j8 == 0) {
            return;
        }
        CleanerService.register(this, new ConfigurationServicePeerCleaner(j8));
    }

    public native void getConfig(ConfigurationServiceGetConfigCallback configurationServiceGetConfigCallback);

    public native void registerObserver(ConfigurationServiceObserver configurationServiceObserver);

    public native void unregisterObserver(ConfigurationServiceObserver configurationServiceObserver);
}
