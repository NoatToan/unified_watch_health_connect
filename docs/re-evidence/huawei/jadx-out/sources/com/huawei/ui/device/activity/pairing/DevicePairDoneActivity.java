package com.huawei.ui.device.activity.pairing;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.device.R;
import defpackage.qsp;
import defpackage.rdt;

/* JADX INFO: loaded from: classes16.dex */
public class DevicePairDoneActivity extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthButton f24601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthButton f24602b;

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_device_pair_done);
        LogUtil.a("DevicePairDoneActivity", "onCreate()");
        this.f24601a = (HealthButton) qsp.a(this, R.id.device_pair_enable_button);
        this.f24602b = (HealthButton) qsp.a(this, R.id.device_pair_manual_button);
        this.f24601a.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.device.activity.pairing.DevicePairDoneActivity.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("DevicePairDoneActivity", "mPairEnableButton onclick");
                rdt.b(1);
                DevicePairDoneActivity.this.b(2);
            }
        });
        this.f24602b.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.device.activity.pairing.DevicePairDoneActivity.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("DevicePairDoneActivity", "mPairManualButton onclick");
                rdt.b(2);
                DevicePairDoneActivity.this.b(1);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i) {
        setResult(i, new Intent());
        finish();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        LogUtil.a("DevicePairDoneActivity", "onDestroy()");
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity
    public void initViewTahiti() {
        super.initViewTahiti();
        LogUtil.a("DevicePairDoneActivity", "initViewTahiti()");
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        LogUtil.a("DevicePairDoneActivity", "onBackPressed()");
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
