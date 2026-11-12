package com.huawei.ui.device.activity.featuremanager;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.RewardKeys;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.dialog.CustomAlertDialog;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.progressbar.HealthProgressBar;
import com.huawei.ui.device.R;
import defpackage.lvb;
import defpackage.mrp;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes43.dex */
public class HwCloudFileConfigDialogActivity extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Bundle f24358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f24359b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f24360c;
    private HealthProgressBar d;

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LogUtil.a("HwCloudFileConfigDialogActivity", "HwCloudFileConfigDialogActivity onCreate.");
        Window window = getWindow();
        window.setGravity(80);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -2;
        window.setAttributes(attributes);
        Intent intent = getIntent();
        if (intent != null) {
            this.f24358a = intent.getBundleExtra("bundle");
            this.f24360c = intent.getIntExtra(RewardKeys.DIALOG_TYPE, 0);
            b();
        }
    }

    private void b() {
        int i = this.f24360c;
        if (i == 1) {
            e(this.f24358a);
            return;
        }
        if (i == 2) {
            a(this.f24358a);
            return;
        }
        if (i == 3) {
            b(this.f24358a);
        } else if (i == 4) {
            a();
        } else {
            LogUtil.j("HwCloudFileConfigDialogActivity", "other dialogStyle: ", Integer.valueOf(i));
            finish();
        }
    }

    private void e(Bundle bundle) {
        ReleaseLogUtil.d("R_HwCloudFileConfigDialogActivity", "showDownloadDialog");
        this.f24359b = true;
        int iB = mrp.b(bundle);
        String strE = mrp.e(bundle.getString("hex_data"));
        CustomTextAlertDialog.Builder builder = new CustomTextAlertDialog.Builder(this);
        builder.e(getResources().getString(R.string.IDS_notify_file_content_title));
        builder.a(mrp.b(iB, strE));
        builder.a(getResources().getString(R.string.IDS_notify_cancel), new View.OnClickListener() { // from class: com.huawei.ui.device.activity.featuremanager.HwCloudFileConfigDialogActivity.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ReleaseLogUtil.d("R_HwCloudFileConfigDialogActivity", "showDownloadDialog cancle");
                HwCloudFileConfigDialogActivity.this.finish();
            }
        });
        builder.b(getResources().getString(R.string.IDS_notify_agree), new View.OnClickListener() { // from class: com.huawei.ui.device.activity.featuremanager.HwCloudFileConfigDialogActivity.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ReleaseLogUtil.d("R_HwCloudFileConfigDialogActivity", "showDownloadDialog download");
                HwCloudFileConfigDialogActivity.this.f24359b = false;
                HwCloudFileConfigDialogActivity.this.finish();
                lvb.e().b("featureManager", new DeviceInfo(), 0, "start_download");
            }
        });
        CustomTextAlertDialog customTextAlertDialogB = builder.b();
        customTextAlertDialogB.setCancelable(false);
        if (isFinishing()) {
            return;
        }
        customTextAlertDialogB.show();
    }

    private void a(Bundle bundle) {
        ReleaseLogUtil.d("R_HwCloudFileConfigDialogActivity", "showDownloadErrorDialog");
        this.f24359b = true;
        NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(this);
        builder.a(getResources().getString(R.string.IDS_notify_file_download_error_tips));
        builder.d(getResources().getString(R.string.IDS_notify_cancel), new View.OnClickListener() { // from class: com.huawei.ui.device.activity.featuremanager.HwCloudFileConfigDialogActivity.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ReleaseLogUtil.d("R_HwCloudFileConfigDialogActivity", "showDownloadErrorDialog cancle");
                HwCloudFileConfigDialogActivity.this.finish();
            }
        });
        builder.a(getResources().getString(R.string.IDS_notify_retry), new View.OnClickListener() { // from class: com.huawei.ui.device.activity.featuremanager.HwCloudFileConfigDialogActivity.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ReleaseLogUtil.d("R_HwCloudFileConfigDialogActivity", "showDownloadErrorDialog retry");
                HwCloudFileConfigDialogActivity.this.f24359b = false;
                HwCloudFileConfigDialogActivity.this.finish();
                lvb.e().b("featureManager", new DeviceInfo(), 0, "start_download");
            }
        });
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = builder.c();
        noTitleCustomAlertDialogC.setCancelable(false);
        if (isFinishing()) {
            return;
        }
        noTitleCustomAlertDialogC.show();
    }

    private void b(Bundle bundle) {
        ReleaseLogUtil.d("R_HwCloudFileConfigDialogActivity", "showTransErrorDialog");
        this.f24359b = true;
        NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(this);
        builder.a(getResources().getString(R.string.IDS_file_transport_error_tips));
        builder.d(getResources().getString(R.string.IDS_notify_cancel), new View.OnClickListener() { // from class: com.huawei.ui.device.activity.featuremanager.HwCloudFileConfigDialogActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ReleaseLogUtil.d("R_HwCloudFileConfigDialogActivity", "showTransErrorDialog cancle");
                HwCloudFileConfigDialogActivity.this.finish();
            }
        });
        builder.a(getResources().getString(R.string.IDS_notify_retry), new View.OnClickListener() { // from class: com.huawei.ui.device.activity.featuremanager.HwCloudFileConfigDialogActivity.6
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ReleaseLogUtil.d("R_HwCloudFileConfigDialogActivity", "showTransErrorDialog retry");
                HwCloudFileConfigDialogActivity.this.f24359b = false;
                HwCloudFileConfigDialogActivity.this.finish();
                lvb.e().b("featureManager", new DeviceInfo(), 0, "start_transfor");
            }
        });
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = builder.c();
        noTitleCustomAlertDialogC.setCancelable(false);
        if (isFinishing()) {
            return;
        }
        noTitleCustomAlertDialogC.show();
    }

    private void a() {
        ReleaseLogUtil.d("R_HwCloudFileConfigDialogActivity", "showTransDoneDialog");
        this.f24359b = true;
        LayoutInflater layoutInflater = getSystemService("layout_inflater") instanceof LayoutInflater ? (LayoutInflater) getSystemService("layout_inflater") : null;
        if (layoutInflater == null) {
            LogUtil.j("HwCloudFileConfigDialogActivity", "showTransDoneDialog, inflater is null");
            return;
        }
        View viewInflate = layoutInflater.inflate(R.layout.dialog_translate_done_layout, (ViewGroup) null);
        CustomAlertDialog.Builder builder = new CustomAlertDialog.Builder(this);
        HealthProgressBar healthProgressBar = (HealthProgressBar) viewInflate.findViewById(R.id.transfor_progress);
        this.d = healthProgressBar;
        healthProgressBar.b(this, R.color.colorBackground, R.color.emui_accent);
        this.d.setProgress(100);
        builder.a(R.string.IDS_notify_done, new DialogInterface.OnClickListener() { // from class: com.huawei.ui.device.activity.featuremanager.HwCloudFileConfigDialogActivity.9
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                ReleaseLogUtil.d("R_HwCloudFileConfigDialogActivity", "showTransDoneDialog cancle");
                HwCloudFileConfigDialogActivity.this.finish();
            }
        });
        builder.a(viewInflate);
        CustomAlertDialog customAlertDialogB = builder.b();
        customAlertDialogB.setCancelable(false);
        if (isFinishing()) {
            return;
        }
        customAlertDialogB.show();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        LogUtil.a("HwCloudFileConfigDialogActivity", "onDestroy");
        if (this.f24359b) {
            lvb.e().b("featureManager", new DeviceInfo(), 0, "task_complete");
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
