package health.compact.a;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.huawei.haf.bundle.InstallGuide;
import com.huawei.haf.bundle.InstallSessionState;
import com.huawei.health.bundleadapter.HealthBundleInstallActivity;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.dialog.CustomProgressDialog;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import defpackage.djy;
import defpackage.dkc;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class HealthBundleInstallGuide implements InstallGuide {
    @Override // com.huawei.haf.bundle.InstallGuide
    public Class<? extends Activity> getTransparentGuideActivity() {
        return HealthBundleInstallActivity.class;
    }

    @Override // com.huawei.haf.bundle.InstallGuide
    public void showDownloadAskDialog(Activity activity, List<String> list, long j, View.OnClickListener onClickListener, View.OnClickListener onClickListener2) {
        new dkc(activity, list, j).a(onClickListener, onClickListener2);
    }

    @Override // com.huawei.haf.bundle.InstallGuide
    public InstallGuide.InstallProgress createInstallProgress(Activity activity, String str, View.OnClickListener onClickListener) {
        return new a(activity, str, onClickListener);
    }

    @Override // com.huawei.haf.bundle.InstallGuide
    public void showDownloadErrorDialog(Activity activity, int i, String str, View.OnClickListener onClickListener) {
        djy djyVar = new djy(onClickListener);
        CustomTextAlertDialog customTextAlertDialogB = new CustomTextAlertDialog.Builder(activity).a(R.string.IDS_service_area_notice_title).a(str).e(R.string.IDS_settings_close, djyVar).b();
        customTextAlertDialogB.setCancelable(false);
        customTextAlertDialogB.setOnDismissListener(djyVar);
        customTextAlertDialogB.show();
    }

    @Override // com.huawei.haf.bundle.InstallGuide
    public String getInstallStateDesc(Context context, InstallSessionState installSessionState) {
        switch (installSessionState.status()) {
            case 1:
                return context.getString(R.string.IDS_bundle_download_begin_desc);
            case 2:
                return context.getString(installSessionState.bytesDownloaded() <= 0 ? R.string.IDS_bundle_download_begin_desc : R.string.IDS_bundle_downloading_prompt);
            case 3:
                return context.getString(R.string.IDS_bundle_downloaded_prompt);
            case 4:
                return context.getString(R.string.IDS_bundle_installing_prompt);
            case 5:
                return context.getString(R.string.IDS_bundle_installied_prompt);
            case 6:
                return getInstallErrorDesc(context, installSessionState.errorCode());
            default:
                return "";
        }
    }

    @Override // com.huawei.haf.bundle.InstallGuide
    public String getInstallErrorDesc(Context context, int i) {
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

    /* JADX INFO: loaded from: classes2.dex */
    static class a implements InstallGuide.InstallProgress {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private CustomProgressDialog f36563a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Activity f36564c;
        private CustomProgressDialog.Builder d;

        a(Activity activity, String str, View.OnClickListener onClickListener) {
            this.f36564c = activity;
            CustomProgressDialog.Builder builder = new CustomProgressDialog.Builder(activity);
            this.d = builder;
            builder.e(str).e(onClickListener);
            CustomProgressDialog customProgressDialogC = this.d.c();
            this.f36563a = customProgressDialogC;
            customProgressDialogC.setCanceledOnTouchOutside(false);
        }

        @Override // com.huawei.haf.bundle.InstallGuide.InstallProgress
        public void update(int i, String str) {
            CustomProgressDialog.Builder builder = this.d;
            CustomProgressDialog customProgressDialog = this.f36563a;
            if (builder == null || customProgressDialog == null || this.f36564c.isFinishing()) {
                return;
            }
            if (i > 0) {
                builder.b(i);
            }
            if (!TextUtils.isEmpty(str)) {
                builder.e(str);
            }
            if (customProgressDialog.isShowing()) {
                return;
            }
            customProgressDialog.show();
        }

        @Override // com.huawei.haf.bundle.InstallGuide.InstallProgress
        public void close() {
            CustomProgressDialog customProgressDialog = this.f36563a;
            this.f36563a = null;
            this.d = null;
            if (customProgressDialog != null) {
                customProgressDialog.dismiss();
            }
        }
    }
}
