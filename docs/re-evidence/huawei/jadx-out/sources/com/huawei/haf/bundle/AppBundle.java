package com.huawei.haf.bundle;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class AppBundle {
    private AppBundle() {
    }

    public static void e(Context context) {
        HealthBundleFramework.d().onApplicationAttachBaseContext(context);
    }

    public static void a(Context context, AppBundleConfiguration appBundleConfiguration) {
        HealthBundleFramework.d().onApplicationCreated(context, appBundleConfiguration);
    }

    public static AppBundleInstallManager a(Context context) {
        return HealthBundleFramework.d().create(context);
    }

    public static AppBundleResources e() {
        return HealthBundleFramework.d().getResources();
    }

    public static AppBundleExtension c() {
        return HealthBundleFramework.d().getExtension();
    }

    public static AppBundleLauncher d() {
        return HealthBundleFramework.d().getLauncher();
    }
}
