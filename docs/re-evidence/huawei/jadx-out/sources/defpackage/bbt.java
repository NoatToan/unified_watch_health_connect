package defpackage;

import com.huawei.android.bundlecore.download.DownloadCallback;
import com.huawei.android.bundlecore.download.DownloadRequest;
import com.huawei.android.bundlecore.download.Downloader;
import com.huawei.haf.bundle.AppBundle;
import com.huawei.haf.bundle.AppBundleBuildConfig;
import com.huawei.haf.bundle.AppBundleDownloader;
import com.huawei.haf.bundle.AppBundleSetting;
import com.huawei.haf.common.utils.NetworkUtil;
import health.compact.a.LogUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public final class bbt implements Downloader {
    private final AppBundleDownloader d;

    @Override // com.huawei.android.bundlecore.download.Downloader
    public long getDownloadSizeThresholdWhenUsingMobileData() {
        return 10485760L;
    }

    public bbt(AppBundleDownloader appBundleDownloader) {
        this.d = appBundleDownloader;
    }

    @Override // com.huawei.android.bundlecore.download.Downloader
    public void startDownload(int i, List<DownloadRequest> list, DownloadCallback downloadCallback) {
        this.d.startDownload(i, d(list), downloadCallback);
    }

    @Override // com.huawei.android.bundlecore.download.Downloader
    public void deferredDownload(int i, List<DownloadRequest> list, DownloadCallback downloadCallback, boolean z) {
        boolean zI = NetworkUtil.i();
        boolean zF = NetworkUtil.f();
        boolean zC = c(list);
        LogUtil.b("Bundle_Downloader", "deferredDownload isNetworkAvailable=", String.valueOf(zI), ", isMobileAvailable=", String.valueOf(zF), ", isUsingMobile=", String.valueOf(z), ", isForceUpdate=", String.valueOf(zC));
        if (zI) {
            if (!zF || z || zC) {
                this.d.deferredDownload(i, d(list), downloadCallback);
            }
        }
    }

    @Override // com.huawei.android.bundlecore.download.Downloader
    public boolean cancelDownloadSync(int i) {
        return this.d.cancelDownloadSync(i);
    }

    @Override // com.huawei.android.bundlecore.download.Downloader
    public boolean isDeferredDownloadOnlyWhenUsingWifiData() {
        return !b().isAllowUsingMobileUpdateModule();
    }

    private List<AppBundleDownloader.DownloadRequest> d(List<DownloadRequest> list) {
        return new ArrayList(list);
    }

    private boolean c(List<DownloadRequest> list) {
        AppBundleSetting appBundleSettingB = b();
        Iterator<DownloadRequest> it = list.iterator();
        while (it.hasNext()) {
            if (appBundleSettingB.isAllowDownloadModule(AppBundleBuildConfig.a(), it.next().getModuleName())) {
                return true;
            }
        }
        return false;
    }

    private AppBundleSetting b() {
        return AppBundle.c().getSetting();
    }
}
