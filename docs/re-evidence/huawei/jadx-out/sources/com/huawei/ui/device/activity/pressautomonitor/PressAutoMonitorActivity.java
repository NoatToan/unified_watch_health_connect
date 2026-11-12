package com.huawei.ui.device.activity.pressautomonitor;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.CompoundButton;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.health.constants.ObserveLabels;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwversionmgr.manager.HwVersionManager;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.base.CommonUiBaseResponse;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.switchbutton.HealthSwitchButton;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.device.R;
import com.huawei.ui.device.interactors.DeviceSettingsInteractors;
import com.huawei.ui.main.stories.fitness.activity.pressurecalibrate.activity.PressureCalibrateActivity;
import com.huawei.ui.main.stories.health.activity.healthdata.KnitPressureActivity;
import defpackage.idy;
import defpackage.lmf;
import defpackage.mgg;
import defpackage.mhs;
import defpackage.qjy;
import defpackage.qsp;
import defpackage.uis;
import defpackage.une;
import health.compact.a.CommonUtil;
import health.compact.a.UnitUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public class PressAutoMonitorActivity extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private DeviceSettingsInteractors f24658a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private CustomTitleBar f24660c;
    private Context d;
    private mhs e;
    private boolean g;
    private boolean h;
    private boolean i;
    private boolean j;
    private HealthSwitchButton k;
    private uis m;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Handler f24659b = new a(this);
    private CompoundButton.OnCheckedChangeListener f = new CompoundButton.OnCheckedChangeListener() { // from class: com.huawei.ui.device.activity.pressautomonitor.PressAutoMonitorActivity.1
        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (!z) {
                qjy.e(PressAutoMonitorActivity.this.d, "pressure_auto_detector_agree_no_again_tip", "pressure_auto_detector_count");
            }
            ReleaseLogUtil.d("DEVMGR_PressAutoMonitorActivity", "press auto monitor isChecked: ", Boolean.valueOf(z));
            PressAutoMonitorActivity.this.k.setEnabled(false);
            PressAutoMonitorActivity.this.i = z;
            HashMap map = new HashMap(0);
            int i = z ? 1 : 2;
            if (PressAutoMonitorActivity.this.j || !z) {
                if (PressAutoMonitorActivity.this.f24658a == null) {
                    PressAutoMonitorActivity.this.f24658a = DeviceSettingsInteractors.e(BaseApplication.getContext());
                }
                if (PressAutoMonitorActivity.this.f24658a != null) {
                    PressAutoMonitorActivity.this.f24658a.e(i);
                    PressAutoMonitorActivity.this.f24658a.d(PressAutoMonitorActivity.this.i);
                    ObserverManagerUtil.e(ObserveLabels.EMOTION_SWITCH_CHANGED, new Object[0]);
                    PressAutoMonitorActivity.this.e(z);
                    map.put("click", "1");
                    map.put("status", z ? "1" : "0");
                    lmf.d().c(BaseApplication.getContext(), AnalyticsValue.PRESS_AUTO_SWITCH.value(), map, 0);
                    LogUtil.a("PressAutoMonitorActivity", "biPressSwitch click event finish, value: ", AnalyticsValue.PRESS_AUTO_SWITCH.value(), "biSwitchStatusMap: ", map.toString());
                    return;
                }
                LogUtil.j("PressAutoMonitorActivity", "onCheckedChange mDeviceSettingsInteractors is null");
                return;
            }
            PressAutoMonitorActivity.this.a();
            map.put("click", "0");
            lmf.d().c(BaseApplication.getContext(), AnalyticsValue.PRESS_AUTO_SWITCH.value(), map, 0);
        }
    };

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_settings_press_auto_monitor);
        this.d = this;
        this.e = mhs.a();
        e();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        LogUtil.d("PressAutoMonitorActivity", "onDestroy()");
        setResult(0, null);
        this.k = null;
        CommonUtil.d(this.d);
    }

    private void e() {
        Intent intent = getIntent();
        this.h = false;
        if (intent != null) {
            LogUtil.a("PressAutoMonitorActivity", "enter intent != null");
            this.g = intent.getBooleanExtra("pressure_is_have_datas", false);
            this.h = intent.getBooleanExtra("from_card", false);
        }
        LogUtil.a("PressAutoMonitorActivity", "mIsFromCard: ", Boolean.valueOf(this.h), " mIsHavedDatas: ", Boolean.valueOf(this.g));
        this.f24658a = DeviceSettingsInteractors.e(BaseApplication.getContext());
        this.e.getSwitchSetting("press_auto_monitor_switch_status", new IBaseResponseCallback() { // from class: com.huawei.ui.device.activity.pressautomonitor.PressAutoMonitorActivity.5
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                LogUtil.a("PressAutoMonitorActivity", "initData errorCode = ", Integer.valueOf(i), " ; objectData = ", obj);
                PressAutoMonitorActivity.this.i = (i == 0 && (obj instanceof String)) ? !"false".equals((String) obj) : false;
                PressAutoMonitorActivity.this.runOnUiThread(new Runnable() { // from class: com.huawei.ui.device.activity.pressautomonitor.PressAutoMonitorActivity.5.4
                    @Override // java.lang.Runnable
                    public void run() {
                        PressAutoMonitorActivity.this.c();
                    }
                });
            }
        });
        c(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        CustomTitleBar customTitleBar = (CustomTitleBar) qsp.a(this, R.id.setting_device_title_bar);
        this.f24660c = customTitleBar;
        if (customTitleBar == null) {
            LogUtil.j("PressAutoMonitorActivity", "initView mDeviceTitleBar is null");
            return;
        }
        customTitleBar.setLeftButtonOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.device.activity.pressautomonitor.PressAutoMonitorActivity.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                PressAutoMonitorActivity.this.onBackPressed();
            }
        });
        this.k = (HealthSwitchButton) qsp.a(this, R.id.press_switch_button);
        HealthTextView healthTextView = (HealthTextView) qsp.a(this, R.id.textview_relax_number);
        this.k.setChecked(this.i);
        this.k.setOnCheckedChangeListener(this.f);
        healthTextView.setText(this.d.getResources().getString(R.string.IDS_press_auto_monitor_relax_range, UnitUtil.e(1.0d, 1, 0), UnitUtil.e(29.0d, 1, 0)));
        ((HealthTextView) qsp.a(this, R.id.textview_normal_number)).setText(this.d.getResources().getString(R.string.IDS_press_auto_monitor_relax_range, UnitUtil.e(30.0d, 1, 0), UnitUtil.e(59.0d, 1, 0)));
        ((HealthTextView) qsp.a(this, R.id.textview_middle_number)).setText(this.d.getResources().getString(R.string.IDS_press_auto_monitor_relax_range, UnitUtil.e(60.0d, 1, 0), UnitUtil.e(79.0d, 1, 0)));
        ((HealthTextView) qsp.a(this, R.id.textview_hight_number)).setText(this.d.getResources().getString(R.string.IDS_press_auto_monitor_relax_range, UnitUtil.e(80.0d, 1, 0), UnitUtil.e(99.0d, 1, 0)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        CustomTextAlertDialog.Builder builder = new CustomTextAlertDialog.Builder(this);
        builder.e(getResources().getString(R.string.IDS_hw_pressure_adjust));
        builder.a(getResources().getString(R.string.IDS_press_auto_monitor_dialog_explain));
        builder.a(getResources().getString(R.string.IDS_settings_button_cancal), new View.OnClickListener() { // from class: com.huawei.ui.device.activity.pressautomonitor.PressAutoMonitorActivity.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ReleaseLogUtil.d("DEVMGR_PressAutoMonitorActivity", "Users did not check.");
                PressAutoMonitorActivity.this.e(false);
            }
        });
        builder.b(getResources().getString(R.string.IDS_press_auto_monitor_start), new View.OnClickListener() { // from class: com.huawei.ui.device.activity.pressautomonitor.PressAutoMonitorActivity.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ReleaseLogUtil.d("DEVMGR_PressAutoMonitorActivity", "Jump to Pressure Calibration Interface");
                DeviceInfo deviceInfoD = mgg.d("PressAutoMonitorActivity");
                if (deviceInfoD == null || !HwVersionManager.b(BaseApplication.getContext()).m(deviceInfoD.getDeviceIdentify())) {
                    PressAutoMonitorActivity.this.f24659b.removeMessages(0);
                    PressAutoMonitorActivity.this.k.setEnabled(false);
                    PressAutoMonitorActivity.this.k.setChecked(PressAutoMonitorActivity.this.i);
                    HashMap map = new HashMap(0);
                    map.put("click", 1);
                    map.put("havedevice", 1);
                    idy.b(AnalyticsValue.HEALTH_PRESSUER_ADJUST_CLICK_2160005.value(), map);
                    Intent intent = new Intent(PressAutoMonitorActivity.this.d, (Class<?>) PressureCalibrateActivity.class);
                    intent.putExtra("press_auto_monitor", true);
                    PressAutoMonitorActivity.this.startActivityForResult(intent, 10);
                    return;
                }
                LogUtil.a("PressAutoMonitorActivity", "Current equipment upgrades");
                une.d(PressAutoMonitorActivity.this.d);
            }
        });
        CustomTextAlertDialog customTextAlertDialogB = builder.b();
        customTextAlertDialogB.setCancelable(false);
        customTextAlertDialogB.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(boolean z) {
        this.i = z;
        this.f24659b.sendEmptyMessageDelayed(0, 300L);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        LogUtil.a("PressAutoMonitorActivity", "onActivityResult");
        HealthSwitchButton healthSwitchButton = this.k;
        if (healthSwitchButton != null) {
            healthSwitchButton.setEnabled(false);
        }
        c(2);
    }

    private void c(final int i) {
        ReleaseLogUtil.d("DEVMGR_PressAutoMonitorActivity", "getCalibratedStatus");
        if (this.m == null) {
            this.m = new uis();
        }
        LogUtil.a("PressAutoMonitorActivity", "isAlreadyDoPressureAdjust");
        this.m.e(new CommonUiBaseResponse() { // from class: com.huawei.ui.device.activity.pressautomonitor.PressAutoMonitorActivity.7
            @Override // com.huawei.ui.commonui.base.CommonUiBaseResponse
            public void onResponse(int i2, Object obj) {
                if (i2 != 0 || obj == null) {
                    PressAutoMonitorActivity.this.j = false;
                    LogUtil.a("PressAutoMonitorActivity", " errCode " + i2 + " mIsCalibrated false");
                } else {
                    LogUtil.a("PressAutoMonitorActivity", "errCode " + i2 + " objData " + obj);
                    PressAutoMonitorActivity.this.j = ((Boolean) obj).booleanValue();
                    StringBuilder sb = new StringBuilder("mIsCalibrated ==");
                    sb.append(PressAutoMonitorActivity.this.j);
                    LogUtil.a("PressAutoMonitorActivity", sb.toString());
                }
                ReleaseLogUtil.d("DEVMGR_PressAutoMonitorActivity", "getCalibratedStatus mIsCalibrated :", Boolean.valueOf(PressAutoMonitorActivity.this.j));
                if (i == 2) {
                    PressAutoMonitorActivity pressAutoMonitorActivity = PressAutoMonitorActivity.this;
                    pressAutoMonitorActivity.e(pressAutoMonitorActivity.j);
                    if (PressAutoMonitorActivity.this.j) {
                        if (PressAutoMonitorActivity.this.f24658a == null) {
                            PressAutoMonitorActivity.this.f24658a = DeviceSettingsInteractors.e(BaseApplication.getContext());
                        }
                        if (PressAutoMonitorActivity.this.f24658a != null) {
                            PressAutoMonitorActivity.this.f24658a.e(1);
                            PressAutoMonitorActivity.this.f24658a.d(PressAutoMonitorActivity.this.i);
                            HashMap map = new HashMap(0);
                            map.put("status", "1");
                            lmf.d().c(BaseApplication.getContext(), AnalyticsValue.PRESS_AUTO_SWITCH.value(), map, 0);
                            return;
                        }
                        LogUtil.j("PressAutoMonitorActivity", "isAlreadyDoPressureAdjust mDeviceSettingsInteractors is null");
                    }
                }
            }
        });
    }

    /* JADX INFO: loaded from: classes16.dex */
    class a extends Handler {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        WeakReference<PressAutoMonitorActivity> f24667b;

        a(PressAutoMonitorActivity pressAutoMonitorActivity) {
            this.f24667b = new WeakReference<>(pressAutoMonitorActivity);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (this.f24667b.get() == null) {
                return;
            }
            removeMessages(0);
            if (PressAutoMonitorActivity.this.k != null) {
                PressAutoMonitorActivity.this.k.setEnabled(true);
                LogUtil.a("PressAutoMonitorActivity", "mHandler mIsPressAutoMonitorFlag = " + PressAutoMonitorActivity.this.i);
                PressAutoMonitorActivity.this.k.setChecked(PressAutoMonitorActivity.this.i);
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        LogUtil.a("PressAutoMonitorActivity", "mIsFromCard : " + this.h + "mIsHavedDatas : " + this.g);
        if (this.h) {
            if (this.g) {
                c(KnitPressureActivity.class);
                return;
            }
            if (this.m == null) {
                this.m = new uis();
            }
            this.m.e(new CommonUiBaseResponse() { // from class: com.huawei.ui.device.activity.pressautomonitor.PressAutoMonitorActivity.9
                @Override // com.huawei.ui.commonui.base.CommonUiBaseResponse
                public void onResponse(int i, Object obj) {
                    if (i != 0 || obj == null) {
                        PressAutoMonitorActivity.this.j = false;
                        LogUtil.a("PressAutoMonitorActivity", "errCode " + i + " false ");
                    } else {
                        if (obj instanceof Boolean) {
                            PressAutoMonitorActivity.this.j = ((Boolean) obj).booleanValue();
                        }
                        LogUtil.a("PressAutoMonitorActivity", "errCode " + i + " objData " + obj);
                    }
                    PressAutoMonitorActivity.this.c(KnitPressureActivity.class);
                }
            });
            return;
        }
        super.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(Class cls) {
        Intent intent = new Intent(this.d, (Class<?>) cls);
        LogUtil.a("PressAutoMonitorActivity", "to card activity = " + this.g);
        startActivity(intent);
        finish();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
