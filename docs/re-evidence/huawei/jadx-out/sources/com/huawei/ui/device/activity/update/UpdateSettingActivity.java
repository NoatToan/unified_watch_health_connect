package com.huawei.ui.device.activity.update;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.switchbutton.HealthSwitchButton;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.device.R;
import defpackage.lmf;
import defpackage.maq;
import defpackage.max;
import defpackage.mhs;
import defpackage.qpx;
import defpackage.qsp;
import defpackage.rcw;
import defpackage.rdt;
import health.compact.a.Utils;
import java.util.HashMap;

/* JADX INFO: loaded from: classes16.dex */
public class UpdateSettingActivity extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthSwitchButton f24800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f24801b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private CustomTitleBar f24802c;
    private LinearLayout d;
    private boolean e;
    private String f;
    private LinearLayout g;
    private String h;
    private boolean i;
    private HealthTextView j;
    private HealthTextView k;
    private HealthTextView l;
    private RelativeLayout m;
    private HealthTextView n;
    private HealthSwitchButton o;
    private HealthSwitchButton r;

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LogUtil.a("UpdateSettingActivity", "onCreate");
        cancelAdaptRingRegion();
        setContentView(R.layout.activity_device_update_setting);
        clearBackgroundDrawable();
        e();
        d();
    }

    private void e() {
        Intent intent = getIntent();
        if (intent != null) {
            this.e = intent.getBooleanExtra("device_support_wlan", false);
            this.f24801b = intent.getBooleanExtra("device_support_auto", false);
            this.i = intent.getBooleanExtra("device_support_wlan_transmit", false);
            this.h = intent.getStringExtra("device_unique");
            this.f = intent.getStringExtra("device_id");
        }
        LogUtil.a("UpdateSettingActivity", "mIsSupportWlan :", Boolean.valueOf(this.e), "mIsSupportAuto :", Boolean.valueOf(this.f24801b));
    }

    private void d() {
        CustomTitleBar customTitleBar = (CustomTitleBar) qsp.a(this, R.id.update_setting_title);
        this.f24802c = customTitleBar;
        customTitleBar.setTitleText(BaseApplication.getContext().getResources().getString(R.string.IDS_main_btn_state_settings));
        this.f24802c.setLeftButtonOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.device.activity.update.UpdateSettingActivity.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                UpdateSettingActivity.this.onBackPressed();
            }
        });
        i();
        h();
        f();
    }

    private void f() {
        this.d = (LinearLayout) qsp.a(this, R.id.update_setting_auto);
        HealthSwitchButton healthSwitchButton = (HealthSwitchButton) qsp.a(this, R.id.update_setting_auto_switch);
        this.f24800a = healthSwitchButton;
        healthSwitchButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.huawei.ui.device.activity.update.UpdateSettingActivity.1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                int i;
                LogUtil.a("UpdateSettingActivity", "auto switch isChecked :", Boolean.valueOf(z));
                HashMap map = new HashMap(16);
                if (UpdateSettingActivity.this.g()) {
                    if (z) {
                        mhs.a().setSwitchSetting("auto_update_status", "true", UpdateSettingActivity.this.h, null);
                        map.put("type", "1");
                        i = 23;
                    } else {
                        mhs.a().setSwitchSetting("auto_update_status", "false", UpdateSettingActivity.this.h, null);
                        map.put("type", "0");
                        i = 24;
                    }
                    rcw.b(BaseApplication.getContext()).a(UpdateSettingActivity.this.f, z);
                    map.put("click", 1);
                    lmf.d().c(BaseApplication.getContext(), AnalyticsValue.SETTING_1090037.value(), map, 0);
                    max.c().b(UpdateSettingActivity.this.f, i);
                    return;
                }
                qpx.e(BaseApplication.getContext(), R.string.IDS_watchface_wearable_need_connect_to_use);
            }
        });
        if (this.f24801b) {
            this.d.setVisibility(0);
            c();
        }
    }

    private void h() {
        this.g = (LinearLayout) qsp.a(this, R.id.update_setting_transmit);
        this.o = (HealthSwitchButton) qsp.a(this, R.id.update_setting_transmit_switch);
        this.k = (HealthTextView) qsp.a(this, R.id.update_setting_transmit_title);
        this.j = (HealthTextView) qsp.a(this, R.id.update_setting_transmit_content);
        this.o.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.huawei.ui.device.activity.update.UpdateSettingActivity.5
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                LogUtil.a("UpdateSettingActivity", "transmit switch isChecked :", Boolean.valueOf(z));
                if (UpdateSettingActivity.this.g()) {
                    rdt.d(z, UpdateSettingActivity.this.f);
                } else {
                    qpx.e(BaseApplication.getContext(), R.string.IDS_watchface_wearable_need_connect_to_use);
                }
            }
        });
        if (Utils.o()) {
            this.k.setText(R.string.IDS_device_transmit_text_overseas);
            this.j.setText(R.string.IDS_device_transmit_tips_overseas);
        } else {
            this.k.setText(R.string.IDS_device_transmit_text);
            this.j.setText(R.string.IDS_device_transmit_tips);
        }
        if (this.i) {
            this.g.setVisibility(0);
            a();
        }
    }

    private void a() {
        mhs.a().getSwitchSetting("auto_open_wlan_status", this.f, new IBaseResponseCallback() { // from class: com.huawei.ui.device.activity.update.UpdateSettingActivity.4
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                LogUtil.a("UpdateSettingActivity", "getTransmitSwitch errorCode = ", Integer.valueOf(i));
                if (i == 0 && (obj instanceof String)) {
                    if (TextUtils.equals("1", String.valueOf(obj))) {
                        UpdateSettingActivity.this.e("auto_open_wlan_status", true);
                    } else {
                        UpdateSettingActivity.this.e("auto_open_wlan_status", false);
                    }
                }
            }
        });
    }

    private void i() {
        this.m = (RelativeLayout) qsp.a(this, R.id.update_setting_wlan);
        this.l = (HealthTextView) qsp.a(this, R.id.update_setting_wlan_content);
        this.n = (HealthTextView) qsp.a(this, R.id.update_setting_wlan_only_content);
        if (Utils.o()) {
            this.l.setText(R.string.IDS_wlan_auto_update_device_new_overseas);
            this.n.setText(R.string.IDS_device_only_update_overseas);
        } else {
            this.l.setText(R.string.IDS_wlan_auto_update_device_new);
            this.n.setText(R.string.IDS_device_only_update);
        }
        HealthSwitchButton healthSwitchButton = (HealthSwitchButton) qsp.a(this, R.id.update_setting_wlan_switch);
        this.r = healthSwitchButton;
        healthSwitchButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.huawei.ui.device.activity.update.UpdateSettingActivity.3
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                int i;
                LogUtil.a("UpdateSettingActivity", "wlan switch isChecked :", Boolean.valueOf(z));
                HashMap map = new HashMap(16);
                if (z) {
                    mhs.a().setSwitchSetting("wlan_auto_update", "1", null);
                    map.put("type", "1");
                    i = 21;
                } else {
                    mhs.a().setSwitchSetting("wlan_auto_update", "2", null);
                    map.put("type", "0");
                    i = 22;
                }
                map.put("click", 1);
                lmf.d().c(BaseApplication.getContext(), AnalyticsValue.SETTING_1090006.value(), map, 0);
                max.c().b(UpdateSettingActivity.this.f, i);
            }
        });
        if (this.e) {
            this.m.setVisibility(0);
            b();
        }
    }

    private void b() {
        mhs.a().getSwitchSetting("wlan_auto_update", new IBaseResponseCallback() { // from class: com.huawei.ui.device.activity.update.UpdateSettingActivity.8
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                LogUtil.a("UpdateSettingActivity", "getWlanSwitchStatus errorCode = ", Integer.valueOf(i));
                boolean z = i == 0 && (obj instanceof String) && !TextUtils.equals("2", (String) obj);
                LogUtil.a("UpdateSettingActivity", "getSwitchStatus status :", Boolean.valueOf(z));
                if (z) {
                    UpdateSettingActivity.this.e("wlan_auto_update", true);
                } else {
                    UpdateSettingActivity.this.e("wlan_auto_update", false);
                }
            }
        });
    }

    private void c() {
        mhs.a().getSwitchSetting("auto_update_status", this.h, new IBaseResponseCallback() { // from class: com.huawei.ui.device.activity.update.UpdateSettingActivity.6
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                LogUtil.a("UpdateSettingActivity", "getAutoSwitchStatus errorCode = ", Integer.valueOf(i));
                if (i == 0 && (obj instanceof String)) {
                    if (TextUtils.equals("true", String.valueOf(obj))) {
                        UpdateSettingActivity.this.e("auto_update_status", true);
                    } else {
                        UpdateSettingActivity.this.e("auto_update_status", false);
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(final String str, final boolean z) {
        runOnUiThread(new Runnable() { // from class: com.huawei.ui.device.activity.update.UpdateSettingActivity.9
            /* JADX WARN: Code duplicated, block: B:19:0x0039  */
            @Override // java.lang.Runnable
            public void run() {
                byte b2;
                String str2 = str;
                str2.hashCode();
                int iHashCode = str2.hashCode();
                if (iHashCode != 105734552) {
                    if (iHashCode != 312087338) {
                        if (iHashCode == 1760488028 && str2.equals("wlan_auto_update")) {
                            b2 = 2;
                        } else {
                            b2 = -1;
                        }
                    } else if (str2.equals("auto_open_wlan_status")) {
                        b2 = 1;
                    } else {
                        b2 = -1;
                    }
                } else if (str2.equals("auto_update_status")) {
                    b2 = 0;
                } else {
                    b2 = -1;
                }
                if (b2 == 0) {
                    UpdateSettingActivity.this.f24800a.setChecked(z);
                    return;
                }
                if (b2 == 1) {
                    UpdateSettingActivity.this.o.setChecked(z);
                } else if (b2 == 2) {
                    UpdateSettingActivity.this.r.setChecked(z);
                } else {
                    LogUtil.j("UpdateSettingActivity", "updateUiState error");
                }
            }
        });
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        HealthSwitchButton healthSwitchButton;
        LogUtil.a("UpdateSettingActivity", "onBackPressed()");
        if (this.f24801b && (healthSwitchButton = this.f24800a) != null) {
            if (healthSwitchButton.isChecked()) {
                setResult(1000);
            } else {
                setResult(2000);
            }
        }
        super.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean g() {
        DeviceInfo deviceInfoE = maq.b().e(this.f);
        if (deviceInfoE != null && deviceInfoE.getDeviceConnectState() == 2) {
            return true;
        }
        LogUtil.a("UpdateSettingActivity", "device disconnected");
        return false;
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
