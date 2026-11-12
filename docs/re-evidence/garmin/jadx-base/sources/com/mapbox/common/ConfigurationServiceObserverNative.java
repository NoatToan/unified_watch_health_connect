package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes2.dex */
final class ConfigurationServiceObserverNative implements ConfigurationServiceObserver {
    protected long peer;

    public static class ConfigurationServiceObserverPeerCleaner implements Runnable {
        private long peer;

        public ConfigurationServiceObserverPeerCleaner(long j8) {
            this.peer = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            ConfigurationServiceObserverNative.cleanNativePeer(this.peer);
        }
    }

    public ConfigurationServiceObserverNative(long j8) {
        this.peer = j8;
        CleanerService.register(this, new ConfigurationServiceObserverPeerCleaner(j8));
    }

    public static native void cleanNativePeer(long j8);

    @Override // com.mapbox.common.ConfigurationServiceObserver
    public native void didEncounterError(ConfigurationServiceError configurationServiceError);

    @Override // com.mapbox.common.ConfigurationServiceObserver
    public native void didStartUpdate();

    @Override // com.mapbox.common.ConfigurationServiceObserver
    public native void didUpdate(ConfigurationOptions configurationOptions);
}
