package defpackage;

import com.huawei.haf.bundle.AppBundleConfiguration;
import com.huawei.haf.bundle.AppBundleDownloader;
import com.huawei.haf.bundle.InstallGuide;
import health.compact.a.HealthBundleInstallGuide;

/* JADX INFO: loaded from: classes.dex */
public final class djt implements AppBundleConfiguration {
    @Override // com.huawei.haf.bundle.AppBundleConfiguration
    public AppBundleDownloader getDownloader() {
        return new djx();
    }

    @Override // com.huawei.haf.bundle.AppBundleConfiguration
    public InstallGuide getDefaultInstallGuide() {
        return new HealthBundleInstallGuide();
    }
}
