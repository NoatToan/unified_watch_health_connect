package com.huawei.ui.device.activity.watchface;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.haf.localbroadcastmanager.LocalBroadcastManager;
import com.huawei.hwdevice.outofprocess.util.HwWatchFaceUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.R;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import defpackage.qsp;
import health.compact.a.LanguageUtil;
import health.compact.a.SharedPreferenceManager;

/* JADX INFO: loaded from: classes43.dex */
public class PrivacyStatementActivity extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ImageView f24853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private RelativeLayout f24854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private RelativeLayout f24855c;
    private ImageView d;
    private Context e;
    private String f = "";
    private RelativeLayout g;
    private ImageView j;

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_privacy_statement);
        this.e = this;
        if (getIntent() != null) {
            String stringExtra = getIntent().getStringExtra("from");
            this.f = stringExtra;
            LogUtil.a("PrivacyStatementActivity", "mWhereFrom: ", stringExtra);
        }
        c();
    }

    private void c() {
        this.f24855c = (RelativeLayout) qsp.a(this, R.id.rl_cancel_service);
        this.d = (ImageView) qsp.a(this, R.id.im_cancel_service_right);
        this.g = (RelativeLayout) qsp.a(this, R.id.rl_user_agreement);
        this.j = (ImageView) qsp.a(this, R.id.im_user_agreement_right);
        this.f24854b = (RelativeLayout) qsp.a(this, R.id.rl_privacy_statement);
        this.f24853a = (ImageView) qsp.a(this, R.id.im_privacy_statement_right);
        if (LanguageUtil.ba(this.e)) {
            this.d.setImageResource(R.drawable.common_ui_arrow_left);
            this.j.setImageResource(R.drawable.common_ui_arrow_left);
            this.f24853a.setImageResource(R.drawable.common_ui_arrow_left);
        } else {
            this.d.setImageResource(R.drawable.common_ui_arrow_right);
            this.j.setImageResource(R.drawable.common_ui_arrow_right);
            this.f24853a.setImageResource(R.drawable.common_ui_arrow_right);
        }
        this.f24855c.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.device.activity.watchface.PrivacyStatementActivity.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                PrivacyStatementActivity.this.a();
            }
        });
        this.g.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.device.activity.watchface.PrivacyStatementActivity.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Intent intent = new Intent(PrivacyStatementActivity.this.e, (Class<?>) WatchfaceUrlActivity.class);
                intent.putExtra("Agreement_key", "termsurl");
                intent.addFlags(268435456);
                HwWatchFaceUtil.e(PrivacyStatementActivity.this.e, intent, "PrivacyStatementActivity");
            }
        });
        this.f24854b.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.device.activity.watchface.PrivacyStatementActivity.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Intent intent = new Intent(PrivacyStatementActivity.this.e, (Class<?>) WatchfaceUrlActivity.class);
                intent.putExtra("Agreement_key", "privacyurl");
                intent.addFlags(268435456);
                HwWatchFaceUtil.e(PrivacyStatementActivity.this.e, intent, "PrivacyStatementActivity");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        CustomTextAlertDialog.Builder builder = new CustomTextAlertDialog.Builder(this.e);
        builder.e(getResources().getString(R.string.IDS_hw_watchface_secret_cancle_service)).a(getResources().getString(R.string.IDS_hw_watchface_secret_cancle_service_dialog_content)).a(R.string.IDS_hw_watchface_secret_revoke, new View.OnClickListener() { // from class: com.huawei.ui.device.activity.watchface.PrivacyStatementActivity.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                SharedPreferenceManager.b(PrivacyStatementActivity.this.e, false);
                Intent intent = new Intent();
                intent.setAction(com.huawei.watchface.mvp.ui.activity.PrivacyStatementActivity.ACTION_WATCHFACE_SERVICE_DISABLE);
                LocalBroadcastManager localBroadcastManager = LocalBroadcastManager.getInstance();
                if (localBroadcastManager != null) {
                    localBroadcastManager.sendBroadcast(intent);
                }
                PrivacyStatementActivity.this.setResult(-1);
                PrivacyStatementActivity.this.finish();
            }
        }).e(R.string.IDS_press_auto_monitor_next, new View.OnClickListener() { // from class: com.huawei.ui.device.activity.watchface.PrivacyStatementActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.d("PrivacyStatementActivity", "onClick Negative Button");
            }
        });
        builder.b().show();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
