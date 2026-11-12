package com.huawei.ui.device.activity.pairing;

import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.device.R;
import defpackage.qsp;
import defpackage.rdp;
import defpackage.rdt;
import health.compact.a.CommonUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.Utils;
import health.compact.a.util.LogUtil;

/* JADX INFO: loaded from: classes16.dex */
public class KeepAliveTipsActivity extends BaseActivity implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ImageView f24643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ImageView f24644b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ImageView f24645c;
    private NoTitleCustomAlertDialog d;
    private HealthButton e;
    private HealthButton h;
    private HealthTextView i;

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_keep_alive_tips);
        b();
    }

    private void b() {
        this.i = (HealthTextView) qsp.a(this, R.id.notification_affect);
        if (Utils.o()) {
            this.i.setText(R.string.IDS_notification_affect_oversea);
        }
        this.h = (HealthButton) qsp.a(this, R.id.btn_set_keep_alive);
        this.e = (HealthButton) qsp.a(this, R.id.btn_completed);
        this.h.setOnClickListener(this);
        this.e.setOnClickListener(this);
        this.f24645c = (ImageView) qsp.a(this, R.id.img_notification);
        this.f24643a = (ImageView) qsp.a(this, R.id.img_call_phone);
        this.f24644b = (ImageView) qsp.a(this, R.id.img_endurance);
        if (LanguageUtil.ba(BaseApplication.getContext())) {
            Drawable drawable = getResources().getDrawable(R.mipmap.icon_notification_affect);
            drawable.setAutoMirrored(true);
            this.f24645c.setImageDrawable(drawable);
            Drawable drawable2 = getResources().getDrawable(R.mipmap.icon_call_phone_affect);
            drawable2.setAutoMirrored(true);
            this.f24643a.setImageDrawable(drawable2);
            Drawable drawable3 = getResources().getDrawable(R.mipmap.icon_endurance_affect);
            drawable3.setAutoMirrored(true);
            this.f24644b.setImageDrawable(drawable3);
        }
        if (Utils.h() && CommonUtil.j(LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1009)) == 7) {
            this.h.setBackgroundResource(R.drawable.hwbutton_default_emui);
            this.h.setTextColor(getColor(R.color.common_colorAccent));
            this.e.setBackgroundResource(R.drawable.hwbutton_default_emui);
            this.e.setTextColor(getColor(R.color.common_colorAccent));
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R.id.btn_set_keep_alive) {
            Intent intent = getIntent();
            if (intent != null) {
                rdt.b(100104, intent.getStringExtra("DEVICE_NAME"));
            }
            a();
            return;
        }
        if (view.getId() == R.id.btn_completed) {
            c();
        }
    }

    private void a() {
        ThreadPoolManager.c().a("KeepAliveTipsActivity", new Runnable() { // from class: com.huawei.ui.device.activity.pairing.KeepAliveTipsActivity.5
            @Override // java.lang.Runnable
            public void run() {
                rdp.d(KeepAliveTipsActivity.this, "11075");
            }
        });
    }

    private void c() {
        NoTitleCustomAlertDialog noTitleCustomAlertDialog = this.d;
        if (noTitleCustomAlertDialog != null) {
            if (noTitleCustomAlertDialog.isShowing()) {
                this.d.dismiss();
            }
            this.d = null;
        }
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = new NoTitleCustomAlertDialog.Builder(this).b(R.string.IDS_keep_alive_dialog).a(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: com.huawei.ui.device.activity.pairing.KeepAliveTipsActivity.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (KeepAliveTipsActivity.this.d != null) {
                    KeepAliveTipsActivity.this.d.dismiss();
                    KeepAliveTipsActivity.this.d = null;
                }
            }
        }).c(R.string.IDS_continue, new View.OnClickListener() { // from class: com.huawei.ui.device.activity.pairing.KeepAliveTipsActivity.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (KeepAliveTipsActivity.this.d != null) {
                    KeepAliveTipsActivity.this.d.dismiss();
                    KeepAliveTipsActivity.this.d = null;
                }
                KeepAliveTipsActivity.this.setResult(3, new Intent());
                KeepAliveTipsActivity.this.finish();
            }
        }).c();
        this.d = noTitleCustomAlertDialogC;
        noTitleCustomAlertDialogC.setCancelable(false);
        this.d.show();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        LogUtil.a("KeepAliveTipsActivity", "onDestroy()");
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity
    public void initViewTahiti() {
        super.initViewTahiti();
        LogUtil.a("KeepAliveTipsActivity", "initViewTahiti()");
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        LogUtil.a("KeepAliveTipsActivity", "onBackPressed()");
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
