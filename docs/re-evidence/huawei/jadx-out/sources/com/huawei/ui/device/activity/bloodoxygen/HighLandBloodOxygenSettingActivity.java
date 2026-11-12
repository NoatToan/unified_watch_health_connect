package com.huawei.ui.device.activity.bloodoxygen;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import androidx.media3.exoplayer.DefaultLoadControl;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.switchbutton.HealthSwitchButton;
import com.huawei.ui.device.R;
import com.huawei.ui.device.interactors.DeviceSettingsInteractors;
import defpackage.ecu;
import defpackage.lmf;
import defpackage.lvh;
import defpackage.mhs;
import defpackage.qsp;
import health.compact.a.CommonUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class HighLandBloodOxygenSettingActivity extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private mhs f24279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CompoundButton.OnCheckedChangeListener f24280b = new AnonymousClass5();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private DeviceSettingsInteractors f24281c;
    private HealthSwitchButton d;
    private DeviceInfo e;
    private lvh i;

    /* JADX INFO: renamed from: com.huawei.ui.device.activity.bloodoxygen.HighLandBloodOxygenSettingActivity$5, reason: invalid class name */
    class AnonymousClass5 implements CompoundButton.OnCheckedChangeListener {
        AnonymousClass5() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, final boolean z) {
            ReleaseLogUtil.d("DEVMGR_HighLandBloodOxygenSettingActivity", "highland blood switch button is ", Boolean.valueOf(z));
            HighLandBloodOxygenSettingActivity.this.f24279a.getSwitchSetting("custom.blood.oxygen.switch", new IBaseResponseCallback() { // from class: com.huawei.ui.device.activity.bloodoxygen.HighLandBloodOxygenSettingActivity.5.4
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    String str;
                    LogUtil.a("HighLandBloodOxygenSettingActivity", "initBloodOxygenItem errorCode = ", Integer.valueOf(i));
                    if (i != 0 || !(obj instanceof String)) {
                        str = "0";
                    } else {
                        str = (String) obj;
                    }
                    if (z) {
                        SharedPreferenceManager.e(BaseApplication.getContext(), "1005", "custom.blood.oxygen.switch", str, null);
                    }
                    if ("1".equals(str) && z) {
                        HighLandBloodOxygenSettingActivity.this.e(true);
                    } else if ("0".equals(str) && !z) {
                        HighLandBloodOxygenSettingActivity.this.e(false);
                    } else {
                        HighLandBloodOxygenSettingActivity.this.runOnUiThread(new Runnable() { // from class: com.huawei.ui.device.activity.bloodoxygen.HighLandBloodOxygenSettingActivity.5.4.3
                            @Override // java.lang.Runnable
                            public void run() {
                                HighLandBloodOxygenSettingActivity.this.a(z);
                            }
                        });
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(boolean z) {
        ReleaseLogUtil.d("DEVMGR_HighLandBloodOxygenSettingActivity", "setHighLandBloodOxygen isChecked:", Boolean.valueOf(z));
        final String str = z ? "1" : "0";
        this.f24279a.setSwitchSetting("highland.blood.oxygen.switch", str, new IBaseResponseCallback() { // from class: com.huawei.ui.device.activity.bloodoxygen.HighLandBloodOxygenSettingActivity.2
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                if (i == 0) {
                    HighLandBloodOxygenSettingActivity.this.i.a(HighLandBloodOxygenSettingActivity.this.e, CommonUtil.n(BaseApplication.getContext(), str));
                    HighLandBloodOxygenSettingActivity.this.d(str);
                } else {
                    LogUtil.j("HighLandBloodOxygenSettingActivity", "setSwitchSetting is error");
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(boolean z, boolean z2) {
        ReleaseLogUtil.d("DEVMGR_HighLandBloodOxygenSettingActivity", "setCycleBloodOxygen isCheck:", Boolean.valueOf(z), ",isHighLandCheck：", Boolean.valueOf(z2));
        String str = z ? "1" : "0";
        if (this.f24281c != null) {
            LogUtil.a("HighLandBloodOxygenSettingActivity", "send BloodOxygen switch status command");
            this.f24281c.d(CommonUtil.n(BaseApplication.getContext(), str));
            e(z2);
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_high_land_health_settings);
        clearBackgroundDrawable();
        d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final boolean z) {
        int i;
        ReleaseLogUtil.d("DEVMGR_HighLandBloodOxygenSettingActivity", "showDialog isHighLandChecked:", Boolean.valueOf(z));
        final boolean z2 = true;
        if (z) {
            i = com.huawei.ui.main.R.string.IDS_highland_alert_on;
        } else {
            String strE = SharedPreferenceManager.e(BaseApplication.getContext(), "1005", "custom.blood.oxygen.switch");
            if ("1".equals(strE)) {
                LogUtil.a("HighLandBloodOxygenSettingActivity", "showDialog beforeBloodOxygenStatus:", strE);
                b(true, false);
                return;
            } else {
                i = com.huawei.ui.main.R.string.IDS_highland_alert_off;
                z2 = false;
            }
        }
        NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(this);
        builder.b(i);
        builder.c(com.huawei.ui.main.R.string.IDS_highland_know, new View.OnClickListener() { // from class: com.huawei.ui.device.activity.bloodoxygen.HighLandBloodOxygenSettingActivity.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                HighLandBloodOxygenSettingActivity.this.b(z2, z);
            }
        });
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = builder.c();
        noTitleCustomAlertDialogC.setCancelable(false);
        noTitleCustomAlertDialogC.show();
    }

    private void d() {
        this.d = (HealthSwitchButton) qsp.a(this, R.id.auto_monitor_button);
        HealthTextView healthTextView = (HealthTextView) qsp.a(this, R.id.highland_tv_sub);
        String str = String.format("%,d", Integer.valueOf(DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_MS));
        healthTextView.setText(getString(R.string.IDS_highland_subtitle, new Object[]{str}));
        ((HealthTextView) qsp.a(this, R.id.highland_content)).setText(getString(R.string.IDS_highland_content, new Object[]{str}));
        this.i = lvh.d();
        this.f24279a = mhs.a();
        this.f24281c = DeviceSettingsInteractors.e(BaseApplication.getContext());
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_MAIN_DEVICES, null, "HighLandBloodOxygenSettingActivity");
        if (deviceList == null || deviceList.isEmpty()) {
            LogUtil.j("HighLandBloodOxygenSettingActivity", "deviceList is null");
        } else {
            this.e = deviceList.get(0);
            this.f24279a.getSwitchSetting("highland.blood.oxygen.switch", new IBaseResponseCallback() { // from class: com.huawei.ui.device.activity.bloodoxygen.HighLandBloodOxygenSettingActivity.1
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    final String str2;
                    LogUtil.a("HighLandBloodOxygenSettingActivity", "highland bloodOxygen errorCode = ", Integer.valueOf(i));
                    if (i == 0 && (obj instanceof String)) {
                        str2 = (String) obj;
                    } else {
                        str2 = "0";
                    }
                    HighLandBloodOxygenSettingActivity.this.runOnUiThread(new Runnable() { // from class: com.huawei.ui.device.activity.bloodoxygen.HighLandBloodOxygenSettingActivity.1.4
                        @Override // java.lang.Runnable
                        public void run() {
                            HighLandBloodOxygenSettingActivity.this.d.setChecked("1".equals(str2));
                            HighLandBloodOxygenSettingActivity.this.d.setOnCheckedChangeListener(HighLandBloodOxygenSettingActivity.this.f24280b);
                        }
                    });
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String str) {
        HashMap map = new HashMap(16);
        map.put("click", "1");
        map.put("status", str);
        String strValue = AnalyticsValue.SETTING_2030090.value();
        lmf.d().c(BaseApplication.getContext(), strValue, map, 0);
        LogUtil.a("HighLandBloodOxygenSettingActivity", "BI biHighLandBloodOxygenSwitch click event finish, value: ", strValue, "typeMap: ", map.toString());
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
