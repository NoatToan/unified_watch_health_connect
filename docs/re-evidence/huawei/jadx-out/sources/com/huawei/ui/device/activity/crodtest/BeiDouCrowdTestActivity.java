package com.huawei.ui.device.activity.crodtest;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.device.R;
import defpackage.mfx;
import defpackage.qpx;
import health.compact.a.CommonUtil;

/* JADX INFO: loaded from: classes16.dex */
public class BeiDouCrowdTestActivity extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthTextView f24306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f24307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private DeviceInfo f24308c;
    private HealthTextView d;
    private boolean e;

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_bei_dou_crowd_test);
        c();
        e();
    }

    private void c() {
        this.f24306a = (HealthTextView) findViewById(R.id.tv_crowd_test_later);
        this.d = (HealthTextView) findViewById(R.id.tv_crowd_test_apply);
        this.f24306a.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.device.activity.crodtest.BeiDouCrowdTestActivity.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                BeiDouCrowdTestActivity.this.d();
            }
        });
        this.d.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.device.activity.crodtest.BeiDouCrowdTestActivity.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (!CommonUtil.ab(BaseApplication.getContext())) {
                    qpx.e(BeiDouCrowdTestActivity.this, R.string.IDS_submit_error_message_1);
                    return;
                }
                qpx.b(BeiDouCrowdTestActivity.this, R.string.apply_crowd_test_toast);
                mfx.d(BeiDouCrowdTestActivity.this.f24308c);
                BeiDouCrowdTestActivity.this.d();
            }
        });
    }

    private void e() {
        Intent intent = getIntent();
        if (intent == null) {
            LogUtil.j("BeiDouCrowdTestActivity", "intent is null");
            return;
        }
        this.e = intent.getBooleanExtra("isFromWear", false);
        DeviceInfo deviceInfo = (DeviceInfo) intent.getParcelableExtra("deviceinfo");
        this.f24308c = deviceInfo;
        if (deviceInfo == null) {
            LogUtil.j("BeiDouCrowdTestActivity", "mDeviceInfo is null");
        } else {
            this.f24307b = deviceInfo.getDeviceIdentify();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        try {
            Intent intent = new Intent();
            intent.setClassName(BaseApplication.getContext(), "com.huawei.ui.homewear21.home.WearHomeActivity");
            intent.putExtra("isFromWear", this.e);
            intent.putExtra("device_id", this.f24307b);
            startActivity(intent);
        } catch (ActivityNotFoundException e) {
            LogUtil.e("BeiDouCrowdTestActivity", "ActivityNotFoundException e:", e.getMessage());
        }
        if (isFinishing()) {
            return;
        }
        finish();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        LogUtil.a("BeiDouCrowdTestActivity", "onBackPressed()");
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
