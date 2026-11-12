package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;

/* JADX INFO: loaded from: classes2.dex */
final class ConfigurationServiceGetConfigCallbackNative implements ConfigurationServiceGetConfigCallback {
    private long peer;

    public static class ConfigurationServiceGetConfigCallbackPeerCleaner implements Runnable {
        private long peer;

        public ConfigurationServiceGetConfigCallbackPeerCleaner(long j8) {
            this.peer = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            ConfigurationServiceGetConfigCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private ConfigurationServiceGetConfigCallbackNative(long j8) {
        this.peer = j8;
        CleanerService.register(this, new ConfigurationServiceGetConfigCallbackPeerCleaner(j8));
    }

    public static native void cleanNativePeer(long j8);

    @Override // com.mapbox.common.ConfigurationServiceGetConfigCallback
    public native void run(Expected<ConfigurationServiceError, ConfigurationOptions> expected);
}
