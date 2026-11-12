package com.huawei.ui.device.activity.notification;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.dialog.CustomAlertDialog;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.device.R;
import com.huawei.ui.device.activity.crodtest.BeiDouCrowdTestActivity;
import defpackage.cqd;
import defpackage.mgg;
import defpackage.nvd;
import defpackage.qsp;
import defpackage.rgd;
import health.compact.a.CommonUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;

/* JADX INFO: loaded from: classes43.dex */
public class NotificationOpenActivity extends NotificationBaseActivity implements View.OnClickListener {
    private TextView m;
    private Dialog o;
    private ViewStub q;
    private boolean t = false;
    protected String k = "";
    private boolean s = false;

    @Override // com.huawei.ui.device.activity.notification.NotificationBaseActivity, com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LogUtil.a("NotificationOpenActivity", "onCreate");
        Intent intent = getIntent();
        if (intent != null) {
            this.k = intent.getStringExtra("device_id");
            this.t = intent.getBooleanExtra("isFromWear", false);
            this.s = intent.getBooleanExtra("isShowWalletOobeActivity", false);
        }
    }

    @Override // com.huawei.ui.device.activity.notification.NotificationBaseActivity
    protected void i() {
        super.i();
        this.m = (TextView) findViewById(R.id.complete_button);
        ViewStub viewStub = (ViewStub) qsp.a(this.e, R.id.notification_tip_header);
        this.q = viewStub;
        if (viewStub != null) {
            viewStub.inflate();
        }
        this.g.setVisibility(8);
        this.m.setVisibility(0);
        this.m.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() != R.id.complete_button) {
            return;
        }
        if (this.h.isChecked()) {
            j();
            return;
        }
        c(nvd.b(), this);
        e(this);
        LogUtil.a("NotificationOpenActivity", "notification remind twice");
        g();
    }

    private void j() {
        LogUtil.a("NotificationOpenActivity", "showAlertDialog");
        View viewInflate = LayoutInflater.from(this).inflate(R.layout.notification_alert_dialog, (ViewGroup) null);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.set_notification_alert_dialog_image);
        HealthTextView healthTextView = (HealthTextView) viewInflate.findViewById(R.id.set_nitification_alert_dialog_text);
        imageView.setImageResource(R.drawable.ic_pairing_notification_alert);
        healthTextView.setText(R.string.IDS_device_msgnotif_alert_dialog);
        CustomAlertDialog.Builder builderA = new CustomAlertDialog.Builder(this).a(R.string.IDS_user_permission_know, new DialogInterface.OnClickListener() { // from class: com.huawei.ui.device.activity.notification.NotificationOpenActivity.3
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                NotificationOpenActivity.this.o.dismiss();
                NotificationOpenActivity.this.n();
            }
        });
        builderA.a(viewInflate);
        CustomAlertDialog customAlertDialogB = builderA.b();
        this.o = customAlertDialogB;
        customAlertDialogB.setCancelable(false);
        if (this.o.isShowing() || isFinishing()) {
            return;
        }
        this.o.show();
    }

    private void e(Context context) {
        StorageParams storageParams = new StorageParams(0);
        String strE = SharedPreferenceManager.e(this, String.valueOf(10000), "dialog_show_time");
        LogUtil.a("NotificationOpenActivity", "setDialogshowTime,number-----------", strE);
        if (TextUtils.isEmpty(strE)) {
            LogUtil.a("NotificationOpenActivity", "numberIsNull", strE);
            SharedPreferenceManager.e(context, String.valueOf(10000), "dialog_show_time", "0", storageParams);
        } else {
            int iN = CommonUtil.n(context, strE);
            LogUtil.a("NotificationOpenActivity", "numberPlusOne", strE);
            SharedPreferenceManager.e(context, String.valueOf(10000), "dialog_show_time", String.valueOf(iN + 1), storageParams);
        }
    }

    private void g() {
        NoTitleCustomAlertDialog.Builder builderA = new NoTitleCustomAlertDialog.Builder(this).c(R.string.IDS_common_enable_button, new View.OnClickListener() { // from class: com.huawei.ui.device.activity.notification.NotificationOpenActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                NotificationOpenActivity.this.h.setChecked(true);
                LogUtil.a("NotificationOpenActivity", "notification remind twice clicked open");
            }
        }).a(R.string.IDS_open_later, new View.OnClickListener() { // from class: com.huawei.ui.device.activity.notification.NotificationOpenActivity.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                NotificationOpenActivity.this.n();
            }
        });
        builderA.a(getString(R.string.IDS_nottification_settings_remind_twice));
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = builderA.c();
        noTitleCustomAlertDialogC.setCancelable(false);
        if (noTitleCustomAlertDialogC.isShowing()) {
            return;
        }
        noTitleCustomAlertDialogC.show();
    }

    private void c(String str, Context context) {
        LogUtil.a("NotificationOpenActivity", "setDialogCheckTime,time-----------", str);
        SharedPreferenceManager.e(context, String.valueOf(10000), "sp_dialog_check_time", str, new StorageParams(0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        if (this.s) {
            DeviceInfo deviceInfoC = mgg.c(this.k, "NotificationOpenActivity");
            if (deviceInfoC != null && cqd.c(deviceInfoC, 283)) {
                Intent intent = new Intent();
                intent.setClass(this, BeiDouCrowdTestActivity.class);
                intent.putExtra("deviceinfo", deviceInfoC);
                startActivity(intent);
                finish();
                return;
            }
            rgd.c(this.k, this, this.t, true);
        } else {
            Intent intent2 = new Intent();
            intent2.putExtra("isFromWear", this.t);
            intent2.putExtra("device_id", this.k);
            intent2.setClassName(this, "com.huawei.ui.homewear21.home.WearHomeActivity");
            startActivity(intent2);
        }
        finish();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
