package com.huawei.ui.main.stories.me.activity;

import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.CompoundButton;
import com.huawei.haf.bundle.AppBundle;
import com.huawei.haf.bundle.AppBundleSetting;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.switchbutton.HealthSwitchButton;
import com.huawei.ui.main.R;

/* JADX INFO: loaded from: classes19.dex */
public class PluginSettingActivity extends BaseActivity implements CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AppBundleSetting f28451a = AppBundle.c().getSetting();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthSwitchButton f28452b;
    private HealthSwitchButton e;

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_plugin_setting);
        HealthSwitchButton healthSwitchButton = (HealthSwitchButton) findViewById(R.id.auto_update_plugin_switch_button);
        this.f28452b = healthSwitchButton;
        healthSwitchButton.setChecked(this.f28451a.isAllowAutoUpdateModule());
        this.f28452b.setOnCheckedChangeListener(this);
        HealthSwitchButton healthSwitchButton2 = (HealthSwitchButton) findViewById(R.id.mobil_update_plugin_switch_button);
        this.e = healthSwitchButton2;
        healthSwitchButton2.setChecked(this.f28451a.isAllowUsingMobileUpdateModule());
        this.e.setOnCheckedChangeListener(this);
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (compoundButton == this.f28452b) {
            this.f28451a.setAllowAutoUpdateModule(z);
            LogUtil.a("Bundle_PluginSettingActivity", "mAutoUpdateButton is ", Boolean.valueOf(z));
        } else if (compoundButton == this.e) {
            this.f28451a.setAllowUsingMobileUpdateModule(z);
            LogUtil.a("Bundle_PluginSettingActivity", "mMobileUpdateButton is ", Boolean.valueOf(z));
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
