package com.huawei.android.defaultbundle;

import android.content.Context;
import com.huawei.haf.bundle.AppBundleConfiguration;
import com.huawei.haf.bundle.AppBundleExtension;
import com.huawei.haf.bundle.AppBundleFramework;
import com.huawei.haf.bundle.AppBundleInstallManager;
import com.huawei.haf.bundle.AppBundleLauncher;
import com.huawei.haf.bundle.AppBundleResources;
import com.huawei.haf.bundle.guide.BaseBundleLauncher;
import com.huawei.haf.bundle.guide.BundleInstallGuideHolder;
import defpackage.azy;
import defpackage.ban;
import defpackage.bbt;
import defpackage.bby;
import defpackage.bca;

/* JADX INFO: loaded from: classes22.dex */
public final class DefaultBundleFramework implements AppBundleFramework {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AppBundleResources f5097c = new bby();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AppBundleExtension f5096b = new bca();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AppBundleLauncher f5095a = new BaseBundleLauncher(this);

    @Override // com.huawei.haf.bundle.AppBundleFramework
    public void onApplicationAttachBaseContext(Context context) {
        ban.d(context);
    }

    @Override // com.huawei.haf.bundle.AppBundleFramework
    public void onApplicationCreated(Context context, AppBundleConfiguration appBundleConfiguration) {
        ban.d(context, new bbt(appBundleConfiguration.getDownloader()), DefaultUserConfirmationDialog.class);
        BundleInstallGuideHolder.c(appBundleConfiguration.getDefaultInstallGuide());
    }

    @Override // com.huawei.haf.bundle.AppBundleFramework
    public AppBundleInstallManager create(Context context) {
        return azy.a(context);
    }

    @Override // com.huawei.haf.bundle.AppBundleFramework
    public AppBundleResources getResources() {
        return this.f5097c;
    }

    @Override // com.huawei.haf.bundle.AppBundleFramework
    public AppBundleExtension getExtension() {
        return this.f5096b;
    }

    @Override // com.huawei.haf.bundle.AppBundleFramework
    public AppBundleLauncher getLauncher() {
        return this.f5095a;
    }
}
