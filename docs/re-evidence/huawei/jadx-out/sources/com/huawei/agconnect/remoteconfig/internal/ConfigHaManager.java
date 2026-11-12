package com.huawei.agconnect.remoteconfig.internal;

import com.huawei.agconnect.common.api.HaBridge;
import com.huawei.hmf.tasks.Task;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class ConfigHaManager {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ConfigHaManager f5056b = new ConfigHaManager();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HaBridge f5057a;

    public void b() {
        this.f5057a = new HaBridge(HaBridge.HA_SERVICE_TAG_CONFIG);
    }

    public Task<Map<String, String>> a(boolean z) {
        return this.f5057a.getUserProfiles(z);
    }

    public static ConfigHaManager a() {
        ConfigHaManager configHaManager;
        synchronized (ConfigHaManager.class) {
            configHaManager = f5056b;
        }
        return configHaManager;
    }

    private ConfigHaManager() {
        if (this.f5057a == null) {
            this.f5057a = new HaBridge(HaBridge.HA_SERVICE_TAG_CONFIG);
        }
    }
}
