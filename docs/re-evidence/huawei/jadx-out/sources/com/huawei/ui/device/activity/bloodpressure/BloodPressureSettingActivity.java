package com.huawei.ui.device.activity.bloodpressure;

import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.CompoundButton;
import com.huawei.basichealth.bloodpressure.BloodPressureSyncManager;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.switchbutton.HealthSwitchButton;
import com.huawei.ui.device.R;
import defpackage.lmf;
import defpackage.mhs;
import java.util.HashMap;

/* JADX INFO: loaded from: classes43.dex */
public class BloodPressureSettingActivity extends BaseActivity {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthSwitchButton f24292b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private CompoundButton.OnCheckedChangeListener f24293c = new CompoundButton.OnCheckedChangeListener() { // from class: com.huawei.ui.device.activity.bloodpressure.BloodPressureSettingActivity.5
        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            LogUtil.a("BloodPressureSettingActivity", "blood pressure switch button is ", Boolean.valueOf(z));
            BloodPressureSettingActivity.this.f24292b.setChecked(z);
            BloodPressureSettingActivity.this.c(z);
        }
    };
    private mhs d;

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_blood_pressure_setting);
        this.d = mhs.a();
        this.f24292b = (HealthSwitchButton) findViewById(R.id.blood_switch_btn);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        b();
    }

    private void b() {
        this.d.getSwitchSetting("blood_pressure_remind", new IBaseResponseCallback() { // from class: com.huawei.ui.device.activity.bloodpressure.BloodPressureSettingActivity.1
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                LogUtil.a("BloodPressureSettingActivity", "CORE_SLEEP_BUTTON errorCode = ", Integer.valueOf(i));
                final boolean zEquals = (i == 0 && (obj instanceof String)) ? "1".equals((String) obj) : false;
                LogUtil.a("BloodPressureSettingActivity", "getBloodBtStatus():", Boolean.valueOf(zEquals));
                BloodPressureSettingActivity.this.runOnUiThread(new Runnable() { // from class: com.huawei.ui.device.activity.bloodpressure.BloodPressureSettingActivity.1.4
                    @Override // java.lang.Runnable
                    public void run() {
                        BloodPressureSettingActivity.this.f24292b.setChecked(zEquals);
                        BloodPressureSettingActivity.this.f24292b.setOnCheckedChangeListener(BloodPressureSettingActivity.this.f24293c);
                        BloodPressureSettingActivity.this.a(zEquals);
                    }
                });
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(final boolean z) {
        this.d.setSwitchSetting("blood_pressure_remind", Integer.toString(z ? 1 : 0), new IBaseResponseCallback() { // from class: com.huawei.ui.device.activity.bloodpressure.BloodPressureSettingActivity.3
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                LogUtil.a("BloodPressureSettingActivity", "setBloodPressureSwitchToCloud errorCode: ", Integer.valueOf(i));
                if (i == 0) {
                    BloodPressureSettingActivity.this.a(z);
                }
            }
        });
        HashMap map = new HashMap(16);
        map.put("click", "1");
        map.put("status", (z ? 1 : 0) + "");
        String strValue = AnalyticsValue.SETTING_2090015.value();
        lmf.d().c(BaseApplication.getContext(), strValue, map, 0);
        LogUtil.a("BloodPressureSettingActivity", "BI biBloodPressureSwitch click event finish, value: ", strValue, "typeMap: ", map.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        LogUtil.a("BloodPressureSettingActivity", "send BloodPressure switch status command:", Boolean.valueOf(z));
        BloodPressureSyncManager.d().c(0);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
