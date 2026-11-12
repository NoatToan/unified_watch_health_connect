package com.huawei.android.hicloud.sync.update.ui.activity;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import com.huawei.android.hicloud.sync.R;
import com.huawei.android.hicloud.sync.update.UpdateManager;
import com.huawei.android.hicloud.sync.update.ui.dialog.UpHisyncDialogCallback;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.updatesdk.service.appmgr.bean.ApkUpgradeInfo;
import defpackage.bcw;
import defpackage.bcz;
import defpackage.bda;
import defpackage.bdb;

/* JADX INFO: loaded from: classes23.dex */
public class UpCloudActivity extends Activity implements UpHisyncDialogCallback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private TextView f5115b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AlertDialog f5116c;
    private ApkUpgradeInfo e;
    private ProgressBar f;
    private AlertDialog i;
    private bcz j;
    private Context d = this;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f5114a = new b();

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            UpCloudActivity.this.d();
        }
    }

    class b extends Handler {
        b() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 2) {
                UpdateManager.b().b(1);
                return;
            }
            if (i == 16) {
                Toast.makeText(UpCloudActivity.this.d, UpCloudActivity.this.d.getString(R.string.hisync_sdk_server_error), 0).show();
                UpdateManager.b().b(2);
                UpCloudActivity.this.finish();
            } else if (i == 4) {
                bcw.c("UpCloudActivity", "UPDATE_CODE_SHOW_DOWNLOAD_PROGRESS");
                UpCloudActivity.this.d(message, false);
            } else if (i == 5) {
                bcw.c("UpCloudActivity", "UPDATE_CODE_DOWNLOAD_FINISH");
                UpCloudActivity.this.d(message, true);
                UpCloudActivity.this.finish();
            } else {
                if (i != 6) {
                    return;
                }
                Toast.makeText(UpCloudActivity.this.d, UpCloudActivity.this.d.getString(R.string.hisync_sdk_download_app_fail), 0).show();
                UpCloudActivity.this.finish();
            }
        }
    }

    class c implements DialogInterface.OnKeyListener {
        c() {
        }

        @Override // android.content.DialogInterface.OnKeyListener
        public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
            return i == 4;
        }
    }

    class d implements DialogInterface.OnKeyListener {
        d() {
        }

        @Override // android.content.DialogInterface.OnKeyListener
        public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
            return i == 4;
        }
    }

    class e implements DialogInterface.OnClickListener {
        e() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            UpCloudActivity upCloudActivity = UpCloudActivity.this;
            upCloudActivity.e(upCloudActivity.f5116c);
            UpCloudActivity.this.f5116c = null;
            UpCloudActivity.this.i.show();
        }
    }

    class h implements DialogInterface.OnClickListener {
        h() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            UpdateManager.b().d();
            UpdateManager.b().b(-1);
            UpCloudActivity.this.finish();
        }
    }

    private void b() {
        Intent intent = getIntent();
        if (intent == null) {
            bcw.d("UpCloudActivity", "intent is null");
            finish();
            return;
        }
        try {
            this.e = (ApkUpgradeInfo) intent.getSerializableExtra("new_version_info");
        } catch (Exception e2) {
            bcw.d("UpCloudActivity", "initView: getApkUpgradeInfo Serializable error " + e2.getMessage());
        }
        ApkUpgradeInfo apkUpgradeInfo = this.e;
        bcz bczVar = new bcz(this.d, this, apkUpgradeInfo != null ? apkUpgradeInfo.getSize_() : 0L);
        this.j = bczVar;
        try {
            bczVar.show();
        } catch (Exception unused) {
            bcw.d("UpCloudActivity", "initView exception");
            finish();
        }
    }

    private void c(ApkUpgradeInfo apkUpgradeInfo) {
        e(this.j);
        this.j = null;
        a();
        UpdateManager.b().c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this.d);
        builder.setOnKeyListener(new d());
        builder.setPositiveButton(R.string.hisync_sdk_install_cancle, new h()).setNegativeButton(R.string.hisync_sdk_download_stop_btn, new e());
        builder.setMessage(R.string.hisync_sdk_download_cancle_alert);
        AlertDialog alertDialogCreate = builder.create();
        this.f5116c = alertDialogCreate;
        alertDialogCreate.setCancelable(false);
        e(this.i);
        this.f5116c.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Message message, boolean z) {
        TextView textView = this.f5115b;
        if (textView == null || this.f == null) {
            return;
        }
        if (z) {
            textView.setText(this.d.getString(R.string.hisync_sdk_progress_show, 100));
            this.f.setProgress(100);
        } else {
            int i = message.arg1;
            textView.setText(this.d.getString(R.string.hisync_sdk_progress_show, Integer.valueOf(i)));
            this.f.setProgress(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(AlertDialog alertDialog) {
        if (alertDialog != null) {
            try {
                alertDialog.dismiss();
            } catch (Exception unused) {
                bcw.d("UpCloudActivity", "Dialog dismiss exception");
            }
        }
    }

    public void a() {
        bcw.c("UpCloudActivity", "startDownloadDialog");
        AlertDialog.Builder builder = new AlertDialog.Builder(this.d);
        builder.setOnKeyListener(new c());
        View viewInflate = LayoutInflater.from(this.d).inflate(R.layout.up_hisync_download_dialog, (ViewGroup) null);
        TextView textView = (TextView) bdb.d(viewInflate, R.id.up_hisync_download_dialog_progress_text);
        this.f5115b = textView;
        textView.setText(this.d.getString(R.string.hisync_sdk_progress_show, 0));
        ProgressBar progressBar = (ProgressBar) bdb.d(viewInflate, R.id.up_hisync_download_dialog_progress);
        this.f = progressBar;
        progressBar.setProgress(0);
        TextView textView2 = (TextView) bdb.d(viewInflate, R.id.up_hisync_download_dialog_content);
        Context context = this.d;
        textView2.setText(context.getString(R.string.up_hisync_download_dialog, context.getString(R.string.hisync_sdk_cloud_app_name)));
        ImageView imageView = (ImageView) bdb.d(viewInflate, R.id.cancel_download);
        if (Build.VERSION.SDK_INT > 26) {
            imageView.setImageResource(R.drawable.cancel_download9);
        } else {
            imageView.setImageResource(R.drawable.cancel_download);
        }
        imageView.setOnClickListener(new a());
        AlertDialog alertDialogCreate = builder.create();
        this.i = alertDialogCreate;
        alertDialogCreate.setCanceledOnTouchOutside(false);
        this.i.setView(viewInflate);
        this.i.show();
    }

    public void d(ApkUpgradeInfo apkUpgradeInfo) {
        if (apkUpgradeInfo == null || TextUtils.isEmpty(apkUpgradeInfo.getDetailId_()) || TextUtils.isEmpty(apkUpgradeInfo.getPackage_())) {
            return;
        }
        try {
            Intent intent = new Intent("com.huawei.appmarket.appmarket.intent.action.AppDetail.withdetailId");
            intent.setPackage("com.huawei.appmarket");
            intent.putExtra("appDetailId", apkUpgradeInfo.getDetailId_());
            intent.putExtra("thirdId", apkUpgradeInfo.getPackage_());
            startActivity(intent);
            UpdateManager.b().b(11);
            finish();
        } catch (Exception unused) {
            bcw.c("UpCloudActivity", "Exception");
            c(apkUpgradeInfo);
        }
    }

    @Override // com.huawei.android.hicloud.sync.update.ui.dialog.UpHisyncDialogCallback
    public void onClickCancel() {
        bcw.c("UpCloudActivity", "onClickCancel");
        UpdateManager.b().b(-1);
        finish();
    }

    @Override // com.huawei.android.hicloud.sync.update.ui.dialog.UpHisyncDialogCallback
    public void onClickInstall() {
        bcw.c("UpCloudActivity", "onClickInstall");
        if (bda.e(this.d)) {
            e(this.j);
            this.j = null;
            d(this.e);
        } else {
            Context context = this.d;
            Toast.makeText(context, context.getString(R.string.hisync_sdk_server_error), 0).show();
            UpdateManager.b().b(7);
            finish();
        }
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        b();
        UpdateManager.b().b(this.f5114a);
    }

    @Override // android.app.Activity
    public void onDestroy() {
        bcw.c("UpCloudActivity", "onDestroy");
        super.onDestroy();
        UpdateManager.b().e();
        e(this.j);
        this.j = null;
        e(this.i);
        this.i = null;
        e(this.f5116c);
        this.f5116c = null;
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
