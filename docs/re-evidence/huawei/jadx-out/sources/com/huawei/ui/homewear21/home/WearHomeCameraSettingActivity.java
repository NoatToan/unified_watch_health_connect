package com.huawei.ui.homewear21.home;

import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.CompoundButton;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.hwdevice.mainprocess.mgr.settingcamera.CameraAuthStatusCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.switchbutton.HealthSwitchButton;
import com.huawei.ui.homewear21.R;
import defpackage.meo;

/* JADX INFO: loaded from: classes18.dex */
public class WearHomeCameraSettingActivity extends BaseActivity {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthSwitchButton f26217b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f26218c = false;
    private CameraAuthStatusCallback e = new CameraAuthStatusCallback() { // from class: com.huawei.ui.homewear21.home.WearHomeCameraSettingActivity.1
        @Override // com.huawei.hwdevice.mainprocess.mgr.settingcamera.CameraAuthStatusCallback
        public void authStatus(Boolean bool) {
            if (!String.valueOf(WearHomeCameraSettingActivity.this.f26217b.isChecked()).equals(String.valueOf(bool))) {
                WearHomeCameraSettingActivity.this.f26218c = true;
            }
            WearHomeCameraSettingActivity.this.f26217b.setChecked(bool.booleanValue());
        }
    };

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.wear_home_other_settings_camera_layout);
        d();
    }

    private void d() {
        HealthSwitchButton healthSwitchButton = (HealthSwitchButton) findViewById(R.id.setting_camera_switch_button);
        this.f26217b = healthSwitchButton;
        healthSwitchButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.huawei.ui.homewear21.home.WearHomeCameraSettingActivity.4
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                if (WearHomeCameraSettingActivity.this.f26218c) {
                    WearHomeCameraSettingActivity.this.f26218c = false;
                } else {
                    meo.a().d(z);
                }
            }
        });
    }

    private void b() {
        LogUtil.a("WearHomeCameraSettingActivity", "enter refreshSwitchStatus");
        meo.a().a(this.e);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        b();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        meo.a().b();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
