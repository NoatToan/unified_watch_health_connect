package com.huawei.ui.device.activity.sleepbreathe;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.CompoundButton;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.imageview.HealthImageView;
import com.huawei.ui.commonui.switchbutton.HealthSwitchButton;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.device.R;
import com.huawei.ui.device.activity.HealthMonitoringBaseActivity;
import defpackage.lxw;
import defpackage.mbt;
import defpackage.mhs;
import defpackage.mhw;
import defpackage.qpx;
import defpackage.qqf;
import defpackage.qrs;

/* JADX INFO: loaded from: classes3.dex */
public class SleepBreatheActivity extends HealthMonitoringBaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CompoundButton.OnCheckedChangeListener f24717a = new AnonymousClass5();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthTextView f24718b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f24719c;
    private mhs d;
    private HealthTextView e;
    private HealthTextView f;
    private HealthSwitchButton j;

    /* JADX INFO: renamed from: com.huawei.ui.device.activity.sleepbreathe.SleepBreatheActivity$5, reason: invalid class name */
    public class AnonymousClass5 implements CompoundButton.OnCheckedChangeListener {
        AnonymousClass5() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            String str;
            LogUtil.a("SleepBreatheActivity", "mSleepBreatheSwitchListener isChecked: ", Boolean.valueOf(z));
            if (z) {
                SleepBreatheActivity.this.d.getSwitchSetting("core_sleep_button", new IBaseResponseCallback() { // from class: rac
                    @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                    /* JADX INFO: renamed from: onResponse */
                    public final void a(int i, Object obj) {
                        this.d.e(i, obj);
                    }
                });
                str = "true";
            } else {
                str = "false";
            }
            mbt.a().a(str);
        }

        public /* synthetic */ void e(int i, Object obj) {
            LogUtil.a("SleepBreatheActivity", "getCoreSleepSwitch errorCode: ", Integer.valueOf(i));
            if (i == 0 && "1".equals(obj)) {
                return;
            }
            SleepBreatheActivity.this.d.setSwitchSetting("core_sleep_button", "1", new IBaseResponseCallback() { // from class: rab
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i2, Object obj2) {
                    LogUtil.a("SleepBreatheActivity", "setCoreSleepSwitch errorCode: ", Integer.valueOf(i2));
                }
            });
            mhw.c("1");
            lxw.d(1);
            SleepBreatheActivity.this.runOnUiThread(new Runnable() { // from class: qzy
                @Override // java.lang.Runnable
                public final void run() {
                    this.f47043a.a();
                }
            });
        }

        public /* synthetic */ void a() {
            int i;
            boolean zB = mbt.a().b();
            SleepBreatheActivity sleepBreatheActivity = SleepBreatheActivity.this;
            if (zB) {
                i = R.string.ids_sleep_breathe_enabled_sciencesleep_nmpa;
            } else {
                i = R.string.ids_sleep_breathe_enabled_sciencesleep;
            }
            qpx.e(SleepBreatheActivity.this.getApplicationContext(), sleepBreatheActivity.getString(i));
        }
    }

    @Override // com.huawei.ui.device.activity.HealthMonitoringBaseActivity, com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_sleep_breathe);
        clearBackgroundDrawable();
        Intent intent = getIntent();
        if (intent != null) {
            this.f24719c = intent.getStringExtra("SleepBreatheEnable");
        }
        LogUtil.a("SleepBreatheActivity", "mSleepBreatheSwitch: ", this.f24719c);
        d();
        e();
    }

    private void d() {
        CustomTitleBar customTitleBar = (CustomTitleBar) findViewById(R.id.setting_device_title_bar);
        HealthTextView healthTextView = (HealthTextView) findViewById(R.id.sleep_breathe_switch_text);
        if (mbt.a().b()) {
            customTitleBar.setTitleText(getString(R.string.IDS_sleep_breathe_banner_title_nmpa));
            healthTextView.setText(R.string.IDS_sleep_breathe_banner_title_nmpa);
        }
        this.j = (HealthSwitchButton) findViewById(R.id.event_sleep_breathe_switch_btn);
        this.e = (HealthTextView) findViewById(R.id.tip_1);
        this.f24718b = (HealthTextView) findViewById(R.id.tip_2);
        this.f = (HealthTextView) findViewById(R.id.tip_3);
        c((HealthImageView) findViewById(R.id.sleep_breathe_image));
    }

    private void c(HealthImageView healthImageView) {
        int iMin = (int) (((double) Math.min(qrs.m() / 2, qrs.q())) * 0.8d);
        healthImageView.getLayoutParams().height = iMin;
        healthImageView.getLayoutParams().width = iMin;
        healthImageView.setImageBitmap(qqf.a(qqf.e(R.mipmap.ic_sleep_breathe_img, BaseApplication.getContext()), healthImageView));
    }

    private void e() {
        this.d = mhs.a();
        this.e.setText(getResources().getString(R.string.IDS_sleep_breathe_tips1, 1));
        this.f24718b.setText(getResources().getString(R.string.IDS_sleep_breathe_tips2, 2));
        this.f.setText(getResources().getString(R.string.IDS_sleep_breathe_tips3, 3));
        if ("true".equals(this.f24719c) || "false".equals(this.f24719c)) {
            a();
        } else {
            this.d.getSwitchSetting("sleep_breathe_key", new IBaseResponseCallback() { // from class: qzt
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i, Object obj) {
                    this.f47037a.b(i, obj);
                }
            });
        }
    }

    public /* synthetic */ void b(int i, Object obj) {
        LogUtil.a("SleepBreatheActivity", "changeSleepBreatheSwitch errorCode: ", Integer.valueOf(i));
        this.f24719c = "false";
        if (i == 0 && (obj instanceof String)) {
            this.f24719c = (String) obj;
            if ("1".equals(obj)) {
                this.f24719c = "true";
            }
        }
        runOnUiThread(new Runnable() { // from class: qzz
            @Override // java.lang.Runnable
            public final void run() {
                this.e.a();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void a() {
        mbt.a().a(this.f24719c);
        this.j.setChecked(Boolean.parseBoolean(this.f24719c));
        this.j.setOnCheckedChangeListener(this.f24717a);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
