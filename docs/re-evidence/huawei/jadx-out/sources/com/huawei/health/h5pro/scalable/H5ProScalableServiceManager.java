package com.huawei.health.h5pro.scalable;

import com.huawei.health.h5pro.scalable.storage.IH5ProAppLoadStorageService;

/* JADX INFO: loaded from: classes7.dex */
public class H5ProScalableServiceManager {
    private static final Object d = new Object();
    private static volatile H5ProScalableServiceManager e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private IH5ProAppLoadStorageService f6971c;

    private H5ProScalableServiceManager() {
    }

    public static H5ProScalableServiceManager getInstance() {
        if (e == null) {
            synchronized (d) {
                if (e == null) {
                    e = new H5ProScalableServiceManager();
                }
            }
        }
        return e;
    }

    public IH5ProAppLoadStorageService getH5ProAppLoadStorageService() {
        return this.f6971c;
    }

    public void registerService(Object obj) {
        if (obj instanceof IH5ProAppLoadStorageService) {
            this.f6971c = (IH5ProAppLoadStorageService) obj;
        }
    }
}
