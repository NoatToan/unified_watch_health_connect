package com.huawei.haf.bundle;

import android.content.Context;
import health.compact.a.LogUtil;
import health.compact.a.ReflectionUtils;

/* JADX INFO: loaded from: classes.dex */
final class HealthBundleFramework implements AppBundleFramework {
    private static final String[] d = {"com.huawei.android.defaultbundle.DefaultBundleFramework", "com.huawei.android.googlebundle.GoogleBundleFramework", "com.huawei.android.huaweibundle.HuaweiBundleFramework"};
    private static volatile HealthBundleFramework e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AppBundleFramework f5798a = e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AppBundleFramework f5799b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f5800c;

    private HealthBundleFramework() {
    }

    public static AppBundleFramework d() {
        if (e == null) {
            synchronized (HealthBundleFramework.class) {
                if (e == null) {
                    e = new HealthBundleFramework();
                }
            }
        }
        return e;
    }

    @Override // com.huawei.haf.bundle.AppBundleFramework
    public void onApplicationAttachBaseContext(Context context) {
        this.f5798a.onApplicationAttachBaseContext(context);
        LogUtil.b("Bundle_Framework", "onApplicationAttachBaseContext");
    }

    @Override // com.huawei.haf.bundle.AppBundleFramework
    public void onApplicationCreated(Context context, AppBundleConfiguration appBundleConfiguration) {
        this.f5798a.onApplicationCreated(context, appBundleConfiguration);
        LogUtil.b("Bundle_Framework", "onApplicationCreated");
        this.f5800c = true;
    }

    @Override // com.huawei.haf.bundle.AppBundleFramework
    public AppBundleInstallManager create(Context context) {
        return c().create(context);
    }

    @Override // com.huawei.haf.bundle.AppBundleFramework
    public AppBundleResources getResources() {
        return c().getResources();
    }

    @Override // com.huawei.haf.bundle.AppBundleFramework
    public AppBundleExtension getExtension() {
        return c().getExtension();
    }

    @Override // com.huawei.haf.bundle.AppBundleFramework
    public AppBundleLauncher getLauncher() {
        return c().getLauncher();
    }

    private AppBundleFramework c() {
        if (this.f5800c) {
            return this.f5798a;
        }
        if (this.f5799b == null) {
            AppBundleFramework nullBundleFramework = this.f5798a;
            if (!(nullBundleFramework instanceof NullBundleFramework)) {
                nullBundleFramework = new NullBundleFramework();
            }
            this.f5799b = nullBundleFramework;
            LogUtil.e("Bundle_Framework", "AppBundleFramework is not initialized in application, using NullBundleFramework.");
        }
        return this.f5799b;
    }

    private AppBundleFramework e() {
        String simpleName;
        AppBundleFramework nullBundleFramework = null;
        for (String str : d) {
            nullBundleFramework = a(str);
            if (nullBundleFramework != null) {
                break;
            }
        }
        if (nullBundleFramework == null) {
            nullBundleFramework = new NullBundleFramework();
            simpleName = "NullBundleFramework";
        } else {
            simpleName = nullBundleFramework.getClass().getSimpleName();
        }
        LogUtil.b("Bundle_Framework", "current bundle framework: ", simpleName);
        return nullBundleFramework;
    }

    private AppBundleFramework a(String str) {
        try {
            Object objA = ReflectionUtils.a(str);
            if (objA instanceof AppBundleFramework) {
                return (AppBundleFramework) objA;
            }
            return null;
        } catch (Exception e2) {
            LogUtil.d("Bundle_Framework", "loadBundleFramework, ex=", LogUtil.c(e2));
            return null;
        }
    }
}
