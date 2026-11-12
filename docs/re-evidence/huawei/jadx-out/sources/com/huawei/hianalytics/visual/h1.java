package com.huawei.hianalytics.visual;

import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes33.dex */
public abstract class h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f11648a = new HashMap();

    public static ExecutorService a() {
        HashMap map = f11648a;
        if (map.containsKey("HA-VISUAL")) {
            return (ExecutorService) map.get("HA-VISUAL");
        }
        synchronized (map) {
            if (map.containsKey("HA-VISUAL")) {
                return (ExecutorService) map.get("HA-VISUAL");
            }
            ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new g1());
            map.put("HA-VISUAL", executorServiceNewSingleThreadExecutor);
            return executorServiceNewSingleThreadExecutor;
        }
    }
}
