package com.huawei.hianalytics.framework;

import com.huawei.hianalytics.core.storage.IStorageHandler;
import com.huawei.hianalytics.framework.config.ICollectorConfig;
import com.huawei.hianalytics.framework.policy.IStoragePolicy;

/* JADX INFO: loaded from: classes3.dex */
public abstract class j {
    public static g a(String str) {
        return (g) b.e.f11500c.get(str);
    }

    public static ICollectorConfig b(String str) {
        return (ICollectorConfig) b.e.f11499b.get(str);
    }

    public static IStorageHandler c(String str) {
        g gVarA = a(str);
        if (gVarA != null) {
            return gVarA.f11518a;
        }
        return null;
    }

    public static IStoragePolicy d(String str) {
        return (IStoragePolicy) b.e.d.get(str);
    }
}
