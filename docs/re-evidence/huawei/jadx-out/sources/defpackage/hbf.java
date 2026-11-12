package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.huawei.haf.bundle.AppBundle;
import com.huawei.haf.bundle.AppBundleLauncher;
import com.huawei.health.sportservice.download.common.BaseDownloader;
import com.huawei.health.sportservice.download.listener.DownloadListener;
import com.huawei.health.sportservice.download.listener.ResDownloadCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class hbf extends BaseDownloader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private View.OnClickListener f36346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ResDownloadCallback f36347b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private View.OnClickListener f36348c;
    private Activity d;
    private String e;
    private float h;
    private int g = 0;
    private boolean i = false;
    private DownloadListener f = new DownloadListener() { // from class: hbf.4
        @Override // com.huawei.health.sportservice.download.listener.DownloadListener
        public void getInstallStateDesc(String str) {
        }

        @Override // com.huawei.health.sportservice.download.listener.DownloadListener
        public void showDownloadAskDialog(Context context, List<String> list, long j, View.OnClickListener onClickListener, View.OnClickListener onClickListener2) {
            LogUtil.a("SportService_BundleDownload", "showDownloadAskDialog mIsCancelDownload = ", Boolean.valueOf(hbf.this.i));
            if (hbf.this.i) {
                return;
            }
            hbf.this.f36348c = onClickListener2;
            hbf.this.f36346a = onClickListener;
            hbf.this.f36347b.onQueryResult("multilingualBundleDownload", true, false, j, null);
        }

        @Override // com.huawei.health.sportservice.download.listener.DownloadListener
        public void showDownloadErrorDialog(Activity activity, int i, String str, View.OnClickListener onClickListener) {
            LogUtil.a("SportService_BundleDownload", "showDownloadErrorDialog mIsCancelDownload = ", Boolean.valueOf(hbf.this.i));
            onClickListener.onClick(null);
            if (hbf.this.i) {
                return;
            }
            hbf.this.f36347b.onDownloadFail(i, str);
        }

        @Override // com.huawei.health.sportservice.download.listener.DownloadListener
        public void update(int i, String str) {
            int i2 = i - hbf.this.g;
            hbf.this.g = i;
            if (i2 < 0) {
                i2 = 0;
            }
            hbf.this.f36347b.onProgress((int) (i2 * hbf.this.h), "multilingualBundleDownload");
        }

        @Override // com.huawei.health.sportservice.download.listener.DownloadListener
        public void close() {
            hbf.this.f36347b.onCompleteDownload("multilingualBundleDownload");
        }
    };

    @Override // com.huawei.health.sportservice.download.common.BaseDownloader
    public int getMaxNumberOfDownload() {
        return 1;
    }

    @Override // com.huawei.health.sportservice.download.common.BaseDownloader
    public void onStartDownload() {
    }

    public hbf(Activity activity, String str) {
        this.e = str;
        this.d = activity;
    }

    @Override // com.huawei.health.sportservice.download.common.BaseDownloader
    public void startQueryState() {
        if (AppBundle.d().isInstalledModule(this.e)) {
            LogUtil.a("SportService_BundleDownload", "startQueryState isInstalledModule = ", this.e);
            if (this.i) {
                return;
            }
            this.f36347b.onQueryResult("multilingualBundleDownload", false, false, 0L, null);
            this.f36347b.onInstallSuccess("multilingualBundleDownload");
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("moduleName", this.e);
        intent.setClassName(BaseApplication.getAppPackage(), "com.huawei.health.MainActivity");
        LogUtil.a("SportService_BundleDownload", "startQueryState = ", this.e);
        AppBundle.d().launchActivity(this.d, intent, new a(null), new haq(this.f, this.d));
    }

    @Override // com.huawei.health.sportservice.download.common.BaseDownloader
    public void onCancelDownload() {
        LogUtil.a("SportService_BundleDownload", "onCancelDownload");
        this.i = true;
    }

    @Override // com.huawei.health.sportservice.download.common.BaseDownloader
    public View.OnClickListener cancelListener() {
        return this.f36346a;
    }

    @Override // com.huawei.health.sportservice.download.common.BaseDownloader
    public View.OnClickListener confirmListener() {
        return this.f36348c;
    }

    @Override // com.huawei.health.sportservice.download.common.BaseDownloader
    public void setDownloadListener(ResDownloadCallback resDownloadCallback) {
        this.f36347b = resDownloadCallback;
    }

    @Override // com.huawei.health.sportservice.download.common.BaseDownloader
    public void setProgressRatio(String str, float f) {
        if ("multilingualBundleDownload".equals(str)) {
            this.h = f;
        }
    }

    class a implements AppBundleLauncher.InstallCallback {
        a(AppBundleLauncher.InstallCallback installCallback) {
        }

        @Override // com.huawei.haf.bundle.AppBundleLauncher.InstallCallback
        public boolean call(Context context, Intent intent) {
            LogUtil.a("SportService_BundleDownload", "InnerInstallCallback downloaded mIsCancelDownload = ", Boolean.valueOf(hbf.this.i));
            if (hbf.this.i) {
                return false;
            }
            hbf.this.f36347b.onQueryResult("multilingualBundleDownload", false, false, 0L, null);
            hbf.this.f36347b.onInstallSuccess("multilingualBundleDownload");
            return true;
        }
    }
}
