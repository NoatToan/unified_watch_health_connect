package com.huawei.ui.device.activity.leftrighthand;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.radiobutton.HealthRadioButton;
import com.huawei.ui.device.R;
import defpackage.mhs;
import defpackage.qpx;
import defpackage.qsp;
import defpackage.rcv;

/* JADX INFO: loaded from: classes16.dex */
public class LeftRightHandSettingsActivity extends BaseActivity implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthRadioButton f24410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f24411b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private mhs f24412c;
    private HealthRadioButton d;
    private Context e;

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_left_right_hand_setting);
        this.e = this;
        this.f24412c = mhs.a();
        this.f24410a = (HealthRadioButton) qsp.a(this, R.id.settings_left_btn);
        this.d = (HealthRadioButton) qsp.a(this, R.id.settings_right_btn);
        this.f24410a.setOnClickListener(this);
        this.d.setOnClickListener(this);
        this.f24412c.getSwitchSetting("left_or_right_hand_wear_status", new IBaseResponseCallback() { // from class: com.huawei.ui.device.activity.leftrighthand.LeftRightHandSettingsActivity.3
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                LogUtil.a("LeftRightHandSettingsActivity", "LEFT_OR_RIGHT_HAND_WEAR_STATUS errorCode = ", Integer.valueOf(i), " ; objectData = ", obj);
                if (i == 0 && (obj instanceof String) && "1".equals((String) obj)) {
                    LeftRightHandSettingsActivity.this.f24411b = true;
                }
                LogUtil.a("LeftRightHandSettingsActivity", "mWearState = ", Boolean.valueOf(LeftRightHandSettingsActivity.this.f24411b));
                LeftRightHandSettingsActivity.this.runOnUiThread(new Runnable() { // from class: com.huawei.ui.device.activity.leftrighthand.LeftRightHandSettingsActivity.3.2
                    @Override // java.lang.Runnable
                    public void run() {
                        LeftRightHandSettingsActivity.this.d(LeftRightHandSettingsActivity.this.f24411b);
                    }
                });
            }
        });
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        LogUtil.a("LeftRightHandSettingsActivity", "onResume()");
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (R.id.settings_left_btn == id) {
            if (this.f24411b) {
                this.f24411b = false;
                d(false);
                a(this.f24411b);
                return;
            }
            return;
        }
        if (R.id.settings_right_btn == id) {
            if (this.f24411b) {
                return;
            }
            this.f24411b = true;
            d(true);
            a(this.f24411b);
            return;
        }
        LogUtil.a("LeftRightHandSettingsActivity", "ignore onclick id = ", Integer.valueOf(view.getId()));
    }

    private void a(boolean z) {
        LogUtil.a("LeftRightHandSettingsActivity", "clickLeftOrRightBtnProcess isStateOpen = ", Boolean.valueOf(z));
        if (rcv.a(this.e).c() != 2) {
            LogUtil.a("LeftRightHandSettingsActivity", "showNoConnectedToast()");
            qpx.e(this.e, R.string.IDS_device_not_connect);
        }
        this.f24412c.sendSetSwitchSettingCmd(z, "", 1, 26, null);
        this.f24412c.setSwitchSetting("left_or_right_hand_wear_status", z ? "1" : "0", null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(boolean z) {
        if (!z) {
            this.f24410a.setChecked(true);
            this.d.setChecked(false);
        } else {
            this.f24410a.setChecked(false);
            this.d.setChecked(true);
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        LogUtil.a("LeftRightHandSettingsActivity", "onDestroy()");
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
