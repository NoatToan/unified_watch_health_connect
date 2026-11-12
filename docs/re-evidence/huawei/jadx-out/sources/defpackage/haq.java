package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.huawei.haf.bundle.InstallGuide;
import com.huawei.haf.bundle.InstallSessionState;
import com.huawei.health.sportservice.download.listener.DownloadListener;
import com.huawei.ui.commonui.R;
import health.compact.a.LogUtil;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class haq implements InstallGuide {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Activity f36322b;
    private DownloadListener d;

    public haq(DownloadListener downloadListener, Activity activity) {
        this.d = downloadListener;
        this.f36322b = activity;
    }

    @Override // com.huawei.haf.bundle.InstallGuide
    public Class<? extends Activity> getTransparentGuideActivity() {
        LogUtil.b("AudioBundleInstallGuide", "getTransparentGuideActivity");
        return this.f36322b.getClass();
    }

    @Override // com.huawei.haf.bundle.InstallGuide
    public void showDownloadAskDialog(Activity activity, List<String> list, long j, View.OnClickListener onClickListener, View.OnClickListener onClickListener2) {
        LogUtil.b("AudioBundleInstallGuide", "showDownloadAskDialog");
        this.d.showDownloadAskDialog(activity, list, j, onClickListener, onClickListener2);
    }

    @Override // com.huawei.haf.bundle.InstallGuide
    public InstallGuide.InstallProgress createInstallProgress(Activity activity, String str, View.OnClickListener onClickListener) {
        LogUtil.b("AudioBundleInstallGuide", "createInstallProgress");
        return new e(onClickListener, this.d);
    }

    @Override // com.huawei.haf.bundle.InstallGuide
    public void showDownloadErrorDialog(Activity activity, int i, String str, View.OnClickListener onClickListener) {
        LogUtil.b("AudioBundleInstallGuide", "showDownloadErrorDialog");
        this.d.showDownloadErrorDialog(activity, i, str, onClickListener);
    }

    @Override // com.huawei.haf.bundle.InstallGuide
    public String getInstallStateDesc(Context context, InstallSessionState installSessionState) {
        String string;
        LogUtil.b("AudioBundleInstallGuide", "getInstallStateDesc state.status()= ", Integer.valueOf(installSessionState.status()));
        int iStatus = installSessionState.status();
        if (iStatus == 1) {
            string = context.getString(R.string.IDS_bundle_download_begin_desc);
        } else if (iStatus == 2) {
            string = context.getString(installSessionState.bytesDownloaded() <= 0 ? R.string.IDS_bundle_download_begin_desc : R.string.IDS_bundle_downloading_prompt);
        } else {
            string = iStatus != 6 ? "" : getInstallErrorDesc(context, installSessionState.errorCode());
        }
        this.d.getInstallStateDesc(string);
        return string;
    }

    @Override // com.huawei.haf.bundle.InstallGuide
    public String getInstallErrorDesc(Context context, int i) {
        LogUtil.b("AudioBundleInstallGuide", "getInstallErrorDesc", Integer.valueOf(i));
        if (i != -100) {
            switch (i) {
                case -9:
                    return context.getString(R.string.IDS_bundle_error_service_died);
                case -8:
                    return context.getString(R.string.IDS_bundle_error_existing_session);
                case -7:
                    return context.getString(R.string.IDS_bundle_error_access_denied);
                case -6:
                    return context.getString(R.string.IDS_bundle_error_network_error);
                case -5:
                    return context.getString(R.string.IDS_bundle_error_internal_error);
                case -4:
                    return context.getString(R.string.IDS_bundle_error_internal_error);
                case -3:
                    return context.getString(R.string.IDS_bundle_error_invalid_request);
                case -2:
                    return context.getString(R.string.IDS_bundle_error_module_unavailable);
                case -1:
                case 0:
                    return "";
                default:
                    return context.getString(R.string.IDS_bundle_download_fail);
            }
        }
        return context.getString(R.string.IDS_bundle_error_internal_error);
    }

    /* JADX INFO: loaded from: classes31.dex */
    static class e implements InstallGuide.InstallProgress {
        private DownloadListener d;

        e(View.OnClickListener onClickListener, DownloadListener downloadListener) {
            this.d = downloadListener;
            LogUtil.b("AudioBundleInstallGuide", "InstallProgressDialog");
        }

        @Override // com.huawei.haf.bundle.InstallGuide.InstallProgress
        public void update(int i, String str) {
            LogUtil.b("AudioBundleInstallGuide", "update", Integer.valueOf(i));
            DownloadListener downloadListener = this.d;
            if (downloadListener != null) {
                downloadListener.update(i, str);
            }
        }

        @Override // com.huawei.haf.bundle.InstallGuide.InstallProgress
        public void close() {
            LogUtil.b("AudioBundleInstallGuide", "close");
            DownloadListener downloadListener = this.d;
            if (downloadListener != null) {
                downloadListener.close();
            }
        }
    }
}
