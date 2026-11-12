package com.xiaomi.smarthome.server;

import com.xiaomi.smarthome.update.DefaultPluginUpdateProviderImpl;
import com.xiaomi.smarthome.update.IPluginUpdateProvider;

/* JADX INFO: loaded from: classes2.dex */
public class PluginUpdateProviderManager {
    public static final String KEY_PLUGIN_UPDATE_API = "com.xiaomi.smarthome.update.IPluginUpdateProvider";
    private static volatile PluginUpdateProviderManager sInstance;
    private IPluginUpdateProvider mPluginUpdateProvider = new DefaultPluginUpdateProviderImpl();

    public static PluginUpdateProviderManager getInstance() {
        if (sInstance == null) {
            synchronized (PluginUpdateProviderManager.class) {
                try {
                    if (sInstance == null) {
                        sInstance = new PluginUpdateProviderManager();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return sInstance;
    }

    public IPluginUpdateProvider getPluginUpdateProviderApi() {
        return this.mPluginUpdateProvider;
    }

    public void setPluginUpdateProvider(IPluginUpdateProvider iPluginUpdateProvider) {
        this.mPluginUpdateProvider = iPluginUpdateProvider;
    }
}
