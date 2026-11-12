package com.huawei.haf.bundle.extension;

import health.compact.a.LogUtil;

/* JADX INFO: loaded from: classes2.dex */
public final class BundleExtension {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static BundleLoadManager f5810a;
    private static BundleStateManager d;

    private BundleExtension() {
    }

    public static void c(BundleLoadManager bundleLoadManager) {
        f5810a = bundleLoadManager;
        LogUtil.b("Bundle_Extension", "install ", Boolean.valueOf(bundleLoadManager != null));
        d = new BundleStateManager();
    }

    public static BundleLoadManager e() {
        return f5810a;
    }

    public static BundleStateManager d() {
        return d;
    }
}
