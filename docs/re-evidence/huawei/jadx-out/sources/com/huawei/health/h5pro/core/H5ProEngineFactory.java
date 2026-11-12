package com.huawei.health.h5pro.core;

import com.huawei.health.h5pro.vengine.H5ProVirtualEngine;
import com.huawei.health.h5pro.webkit.WebKitEngine;

/* JADX INFO: loaded from: classes7.dex */
public class H5ProEngineFactory {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f6731c = new Object();
    private static volatile H5ProVirtualEngine e;

    private H5ProEngineFactory() {
    }

    public static void destroy() {
        synchronized (H5ProEngineFactory.class) {
            if (e != null) {
                e = null;
            }
        }
    }

    public static H5ProVirtualEngine getH5ProEngine() {
        if (e == null) {
            synchronized (f6731c) {
                if (e == null) {
                    e = new WebKitEngine();
                }
            }
        }
        return e;
    }
}
