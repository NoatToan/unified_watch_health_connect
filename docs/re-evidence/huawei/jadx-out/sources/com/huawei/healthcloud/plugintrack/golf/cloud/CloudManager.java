package com.huawei.healthcloud.plugintrack.golf.cloud;

/* JADX INFO: loaded from: classes10.dex */
public class CloudManager {
    private static final Object LOCK = new Object();
    private static volatile CloudApi sCloudApi;

    private CloudManager() {
    }

    public static CloudApi getInstance() {
        if (sCloudApi == null) {
            synchronized (LOCK) {
                if (sCloudApi == null) {
                    sCloudApi = new CloudImpl();
                }
            }
        }
        return sCloudApi;
    }
}
