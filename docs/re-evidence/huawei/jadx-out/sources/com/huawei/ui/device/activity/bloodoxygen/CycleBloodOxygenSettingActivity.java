package com.huawei.ui.device.activity.bloodoxygen;

import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import com.huawei.haf.design.pattern.ObserveLabels;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.dialog.CustomViewDialog;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.radiobutton.HealthRadioButton;
import com.huawei.ui.commonui.switchbutton.HealthSwitchButton;
import com.huawei.ui.device.R;
import com.huawei.ui.device.interactors.DeviceSettingsInteractors;
import defpackage.dfd;
import defpackage.ipg;
import defpackage.lrd;
import defpackage.lvi;
import defpackage.mgb;
import defpackage.mgg;
import defpackage.mhs;
import defpackage.qre;
import defpackage.qrs;
import defpackage.qsp;
import defpackage.rer;
import health.compact.a.CommonUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.UnitUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public class CycleBloodOxygenSettingActivity extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthTextView f24259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private RelativeLayout f24260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthTextView f24261c;
    private DeviceInfo f;
    private String g;
    private HealthSwitchButton h;
    private HealthTextView j;
    private DeviceSettingsInteractors k;
    private ImageView l;
    private mhs m;
    private rer o;
    private boolean p;
    private PopupWindow r;
    private ImageView u;
    private HealthTextView v;
    private HealthTextView w;
    private ImageView x;
    private int e = 0;
    private int y = 0;
    private Map<Integer, RelativeLayout> t = new HashMap(16);
    private Map<Integer, HealthRadioButton> s = new HashMap(16);
    private boolean q = true;
    private CompoundButton.OnCheckedChangeListener i = new CompoundButton.OnCheckedChangeListener() { // from class: com.huawei.ui.device.activity.bloodoxygen.CycleBloodOxygenSettingActivity.5
        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            ReleaseLogUtil.d("DEVMGR_CycleBloodOxygenSettingActivity", "mBloodOxygenSwitchCheckedListener isChecked:", Boolean.valueOf(z), ", mIsUpdateStatus:", Boolean.valueOf(CycleBloodOxygenSettingActivity.this.q), ", mIsSupportHighLand:", Boolean.valueOf(CycleBloodOxygenSettingActivity.this.p));
            if (CycleBloodOxygenSettingActivity.this.q) {
                if (!CycleBloodOxygenSettingActivity.this.p) {
                    CycleBloodOxygenSettingActivity.this.c(z);
                    return;
                } else if (z) {
                    CycleBloodOxygenSettingActivity.this.c(true);
                    return;
                } else {
                    CycleBloodOxygenSettingActivity.this.a();
                    return;
                }
            }
            LogUtil.j("CycleBloodOxygenSettingActivity", "mIsUpdateStatus is false,return");
            CycleBloodOxygenSettingActivity.this.q = true;
        }
    };
    private View.OnClickListener d = new View.OnClickListener() { // from class: com.huawei.ui.device.activity.bloodoxygen.CycleBloodOxygenSettingActivity.10
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!qrs.r()) {
                CycleBloodOxygenSettingActivity.this.f();
            } else {
                LogUtil.j("CycleBloodOxygenSettingActivity", "downRemindClick is fast click");
            }
        }
    };
    private View.OnClickListener ad = new View.OnClickListener() { // from class: com.huawei.ui.device.activity.bloodoxygen.CycleBloodOxygenSettingActivity.7
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (qrs.r()) {
                return;
            }
            if (CycleBloodOxygenSettingActivity.this.r.isShowing()) {
                CycleBloodOxygenSettingActivity.this.u.setVisibility(4);
                CycleBloodOxygenSettingActivity.this.r.dismiss();
                return;
            }
            int[] iArr = new int[2];
            CycleBloodOxygenSettingActivity.this.u.getLocationOnScreen(iArr);
            CycleBloodOxygenSettingActivity.this.r.showAtLocation(CycleBloodOxygenSettingActivity.this.u, 0, 0, iArr[1] + CycleBloodOxygenSettingActivity.this.u.getHeight());
            CycleBloodOxygenSettingActivity.this.u.setVisibility(0);
            if (lrd.d()) {
                lrd.c(CycleBloodOxygenSettingActivity.this.x, qre.f(R.string.IDS_blood_oxygen_i_hint));
            }
        }
    };
    private View.OnClickListener n = new View.OnClickListener() { // from class: com.huawei.ui.device.activity.bloodoxygen.CycleBloodOxygenSettingActivity.9
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            for (Map.Entry entry : CycleBloodOxygenSettingActivity.this.t.entrySet()) {
                if (entry.getValue() == view) {
                    CycleBloodOxygenSettingActivity.this.y = ((Integer) entry.getKey()).intValue();
                    LogUtil.d("CycleBloodOxygenSettingActivity", "select blood oxygen is ", Integer.valueOf(CycleBloodOxygenSettingActivity.this.y));
                    CycleBloodOxygenSettingActivity cycleBloodOxygenSettingActivity = CycleBloodOxygenSettingActivity.this;
                    cycleBloodOxygenSettingActivity.d(cycleBloodOxygenSettingActivity.y);
                    return;
                }
            }
        }
    };

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_device_continue_measure_blood_oxygen);
        clearBackgroundDrawable();
        this.m = mhs.a();
        this.k = DeviceSettingsInteractors.e(BaseApplication.getContext());
        this.o = new rer();
        c();
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        this.m.getSwitchSetting("highland.blood.oxygen.switch", new IBaseResponseCallback() { // from class: com.huawei.ui.device.activity.bloodoxygen.CycleBloodOxygenSettingActivity.11
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                final String str;
                LogUtil.a("CycleBloodOxygenSettingActivity", "getHighLandBloodOxygen objectData:", obj, ", errorCode:", Integer.valueOf(i));
                if (i == 0 && (obj instanceof String)) {
                    str = (String) obj;
                } else {
                    str = "0";
                }
                CycleBloodOxygenSettingActivity.this.runOnUiThread(new Runnable() { // from class: com.huawei.ui.device.activity.bloodoxygen.CycleBloodOxygenSettingActivity.11.3
                    @Override // java.lang.Runnable
                    public void run() {
                        if ("0".equals(str)) {
                            CycleBloodOxygenSettingActivity.this.c(false);
                        } else {
                            CycleBloodOxygenSettingActivity.this.j();
                        }
                    }
                });
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(this);
        builder.b(com.huawei.ui.main.R.string.IDS_blood_oxygen_alert_off);
        builder.c(com.huawei.ui.main.R.string.IDS_highland_sure_off, new View.OnClickListener() { // from class: com.huawei.ui.device.activity.bloodoxygen.CycleBloodOxygenSettingActivity.12
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                CycleBloodOxygenSettingActivity.this.c(false);
            }
        });
        builder.a(com.huawei.ui.main.R.string.IDS_highland_cancel, new View.OnClickListener() { // from class: com.huawei.ui.device.activity.bloodoxygen.CycleBloodOxygenSettingActivity.13
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("CycleBloodOxygenSettingActivity", "dialog set negative");
                CycleBloodOxygenSettingActivity.this.q = false;
                CycleBloodOxygenSettingActivity.this.h.setChecked(true);
            }
        });
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = builder.c();
        noTitleCustomAlertDialogC.setCancelable(false);
        noTitleCustomAlertDialogC.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(boolean z) {
        if (this.k != null) {
            ReleaseLogUtil.d("DEVMGR_CycleBloodOxygenSettingActivity", "send BloodOxygen switch status command");
            this.k.d(z ? 1 : 0);
        }
        ReleaseLogUtil.d("DEVMGR_CycleBloodOxygenSettingActivity", "blood switch button is ", Boolean.valueOf(z));
        e(z);
        a(z);
        this.o.d("biBloodOxygenSwitch", z ? 1 : 0);
        ObserverManagerUtil.e(ObserveLabels.SPO2_MONITOR_SWITCH_STATUS, Integer.valueOf(z ? 1 : 0));
    }

    private void c() {
        DeviceInfo deviceInfoC = mgg.c("CycleBloodOxygenSettingActivity");
        this.f = deviceInfoC;
        this.p = dfd.c(deviceInfoC) && ipg.e();
        this.l = (ImageView) qsp.a(this, R.id.settings_blood_oxygen_imageView);
        this.h = (HealthSwitchButton) qsp.a(this, R.id.blood_oxygen_switch_button);
        this.f24260b = (RelativeLayout) qsp.a(this, R.id.settings_blood_oxygen_down_remind_explain_layout);
        this.j = (HealthTextView) qsp.a(this, R.id.raise_remind_number);
        LogUtil.a("CycleBloodOxygenSettingActivity", "isRTLLanguage is ", Boolean.valueOf(LanguageUtil.ba(BaseApplication.getContext())));
        if (LanguageUtil.ba(BaseApplication.getContext())) {
            Drawable drawable = getResources().getDrawable(R.mipmap.common_arrow_left_click_false);
            drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
            this.j.setCompoundDrawables(drawable, null, null, null);
        } else {
            Drawable drawable2 = getResources().getDrawable(R.drawable.ic_health_sleep_arrow_right);
            drawable2.setBounds(0, 0, drawable2.getMinimumWidth(), drawable2.getMinimumHeight());
            this.j.setCompoundDrawables(null, null, drawable2, null);
        }
        this.f24259a = (HealthTextView) qsp.a(this, R.id.blood_oxygen_down_remind_explain);
        this.f24261c = (HealthTextView) qsp.a(this, R.id.blood_oxygen_down_remind_content_explain);
        this.w = (HealthTextView) qsp.a(this, R.id.blood_oxygen_tip1_tv);
        this.v = (HealthTextView) qsp.a(this, R.id.blood_oxygen_tip2_tv);
        this.w.setText(getResources().getString(R.string.IDS_blood_oxygen_wear_tip, 1));
        this.v.setText(getResources().getString(R.string.IDS_blood_oxygen_tip, 2));
        this.f24260b.setOnClickListener(this.d);
        DeviceInfo deviceInfo = this.f;
        if (deviceInfo != null) {
            if (!lvi.f(deviceInfo.getProductType())) {
                this.l.setImageResource(R.drawable.home_set_rate_watch_remider_image);
            } else {
                this.l.setImageResource(R.drawable.home_set_rate_band_remider_image);
            }
        }
        ImageView imageView = (ImageView) qsp.a(this, R.id.oxygen_remind_tips);
        this.u = imageView;
        imageView.setAlpha(0.8f);
        this.x = (ImageView) qsp.a(this, R.id.text_oxygen_remind_tips);
        e();
        lrd.b(this.x, qre.f(R.string.accessibility_explain));
        this.x.setOnClickListener(this.ad);
    }

    private void e() {
        View viewInflate = LayoutInflater.from(this).inflate(R.layout.activity_oxygen_i_hint, (ViewGroup) null, false);
        this.r = new PopupWindow(viewInflate, -1, -2);
        viewInflate.measure(0, 0);
        this.r.setBackgroundDrawable(getDrawable(R.color.common_transparent));
        this.r.setOutsideTouchable(true);
        this.r.setFocusable(false);
        this.r.setTouchInterceptor(new View.OnTouchListener() { // from class: com.huawei.ui.device.activity.bloodoxygen.CycleBloodOxygenSettingActivity.14
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                CycleBloodOxygenSettingActivity.this.u.setVisibility(4);
                CycleBloodOxygenSettingActivity.this.r.dismiss();
                return false;
            }
        });
    }

    private String e(int i) {
        String strE = UnitUtil.e(i, 2, 0);
        LogUtil.a("CycleBloodOxygenSettingActivity", "languageLocalNumber ", strE);
        return strE;
    }

    private void b() {
        DeviceInfo deviceInfo = this.f;
        if (deviceInfo != null && mgb.d(deviceInfo.getDeviceIdentify()) == 2) {
            d();
        } else {
            ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.ui.device.activity.bloodoxygen.CycleBloodOxygenSettingActivity.15
                @Override // java.lang.Runnable
                public void run() {
                    Semaphore semaphore = new Semaphore(1);
                    CycleBloodOxygenSettingActivity.this.a(semaphore);
                    CycleBloodOxygenSettingActivity.this.d(semaphore);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(final Semaphore semaphore) {
        LogUtil.a("CycleBloodOxygenSettingActivity", "getBloodOxygenSwitch enter");
        try {
            if (semaphore.tryAcquire(1000L, TimeUnit.MILLISECONDS)) {
                LogUtil.a("CycleBloodOxygenSettingActivity", "getBloodOxygenSwitch isTryAcquire true");
            } else {
                ReleaseLogUtil.e("CycleBloodOxygenSettingActivity", "getBloodOxygenSwitch isTryAcquire false");
                OpAnalyticsUtil.getInstance().setProbabilityProblemEvent("getBloodOxygenSwitchError", "getBloodOxygenSwitch time out");
            }
        } catch (InterruptedException unused) {
            LogUtil.e("CycleBloodOxygenSettingActivity", "getBloodOxygenSwitch InterruptedException");
        }
        this.m.getSwitchSetting("custom.blood.oxygen.switch", new IBaseResponseCallback() { // from class: com.huawei.ui.device.activity.bloodoxygen.CycleBloodOxygenSettingActivity.4
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                String str;
                LogUtil.a("CycleBloodOxygenSettingActivity", "bloodOxygen errorCode = ", Integer.valueOf(i));
                if (i == 0 && (obj instanceof String)) {
                    str = (String) obj;
                } else {
                    str = "0";
                }
                CycleBloodOxygenSettingActivity.this.g = str;
                CycleBloodOxygenSettingActivity.this.runOnUiThread(new Runnable() { // from class: com.huawei.ui.device.activity.bloodoxygen.CycleBloodOxygenSettingActivity.4.3
                    @Override // java.lang.Runnable
                    public void run() {
                        CycleBloodOxygenSettingActivity.this.i();
                    }
                });
                semaphore.release();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        LogUtil.a("CycleBloodOxygenSettingActivity", "updateBloodOxygenUi enter");
        boolean zEquals = "1".equals(this.g);
        this.h.setChecked(zEquals);
        this.h.setOnCheckedChangeListener(this.i);
        e(zEquals);
        e(zEquals, false, false);
    }

    private void d() {
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), "100", "custom.blood.oxygen.switch");
        boolean z = CommonUtil.j(strE) == 1;
        String strE2 = SharedPreferenceManager.e(BaseApplication.getContext(), "103", "custom.blood.oxygen.remind");
        this.e = CommonUtil.b(BaseApplication.getContext(), strE2, 0);
        this.y = CommonUtil.b(BaseApplication.getContext(), strE2, 0);
        LogUtil.a("CycleBloodOxygenSettingActivity", "family MODULE_BLOOD_OXYGEN_REMIND status : ", strE, "mBloodOxygenNumber : ", Integer.valueOf(this.e));
        this.h.setChecked(z);
        this.h.setOnCheckedChangeListener(this.i);
        e(z);
        e(z, false, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final Semaphore semaphore) {
        LogUtil.a("CycleBloodOxygenSettingActivity", "getBloodOxygenNumber enter");
        try {
            if (semaphore.tryAcquire(1000L, TimeUnit.MILLISECONDS)) {
                LogUtil.a("CycleBloodOxygenSettingActivity", "getBloodOxygenNumber isTryAcquire true");
            } else {
                ReleaseLogUtil.e("CycleBloodOxygenSettingActivity", "getBloodOxygenNumber isTryAcquire false");
                OpAnalyticsUtil.getInstance().setProbabilityProblemEvent("getBloodOxygenNumberError", "getBloodOxygenNumber time out");
            }
        } catch (InterruptedException unused) {
            LogUtil.e("CycleBloodOxygenSettingActivity", "getBloodOxygenNumber InterruptedException");
        }
        this.m.getSwitchSetting("custom.blood.oxygen.remind", new IBaseResponseCallback() { // from class: com.huawei.ui.device.activity.bloodoxygen.CycleBloodOxygenSettingActivity.1
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                LogUtil.a("CycleBloodOxygenSettingActivity", "getBloodOxygenNumber errorCode = ", Integer.valueOf(i));
                if (i == 0 && (obj instanceof String)) {
                    String str = (String) obj;
                    CycleBloodOxygenSettingActivity.this.e = CommonUtil.b(BaseApplication.getContext(), str, 0);
                    CycleBloodOxygenSettingActivity.this.y = CommonUtil.b(BaseApplication.getContext(), str, 0);
                    CycleBloodOxygenSettingActivity cycleBloodOxygenSettingActivity = CycleBloodOxygenSettingActivity.this;
                    cycleBloodOxygenSettingActivity.e = Math.min(90, cycleBloodOxygenSettingActivity.e);
                    CycleBloodOxygenSettingActivity cycleBloodOxygenSettingActivity2 = CycleBloodOxygenSettingActivity.this;
                    cycleBloodOxygenSettingActivity2.y = Math.min(90, cycleBloodOxygenSettingActivity2.y);
                }
                semaphore.release();
            }
        });
    }

    private void e(boolean z) {
        if (z) {
            this.f24259a.setTextColor(getResources().getColor(R.color.health_heart_remind_open_text_color));
            this.j.setTextColor(getResources().getColor(R.color.textColorSecondary));
            this.f24261c.setTextColor(getResources().getColor(R.color.textColorSecondary));
            this.f24260b.setEnabled(true);
            return;
        }
        this.f24259a.setTextColor(getResources().getColor(R.color.textColorSecondary));
        this.j.setTextColor(getResources().getColor(R.color.colorTertiary));
        this.f24261c.setTextColor(getResources().getColor(R.color.colorTertiary));
        this.f24260b.setEnabled(false);
    }

    private void a(final boolean z) {
        if (z) {
            this.m.getSwitchSetting("custom.blood.oxygen.remind", new IBaseResponseCallback() { // from class: com.huawei.ui.device.activity.bloodoxygen.CycleBloodOxygenSettingActivity.2
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    LogUtil.a("CycleBloodOxygenSettingActivity", "setDefaultDownRemindCommand errorCode: ", Integer.valueOf(i), ", objectData:", obj);
                    if (obj == null) {
                        CycleBloodOxygenSettingActivity.this.e = 90;
                    }
                    CycleBloodOxygenSettingActivity.this.runOnUiThread(new Runnable() { // from class: com.huawei.ui.device.activity.bloodoxygen.CycleBloodOxygenSettingActivity.2.4
                        @Override // java.lang.Runnable
                        public void run() {
                            CycleBloodOxygenSettingActivity.this.e(z, false, true);
                        }
                    });
                }
            });
        } else {
            e(z, false, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(boolean z, boolean z2, boolean z3) {
        int i;
        ReleaseLogUtil.d("DEVMGR_CycleBloodOxygenSettingActivity", "enter handleDownRemindCommand isMigrate: ", Boolean.valueOf(z2), " isSendCommand: ", Boolean.valueOf(z3), " isBloodOxygenChecked: ", Boolean.valueOf(z));
        if (z && (i = this.e) != 0) {
            this.j.setText(e(i));
            if (z3) {
                DeviceSettingsInteractors deviceSettingsInteractors = this.k;
                if (deviceSettingsInteractors == null) {
                    LogUtil.j("CycleBloodOxygenSettingActivity", "handleDownRemindCommand turn on mDeviceInteractors is null");
                    return;
                } else {
                    deviceSettingsInteractors.a(1, this.e, z2);
                    return;
                }
            }
            return;
        }
        this.j.setText(R.string.IDS_settings_about_huawei_cloud_service_heartrate_turn_off);
        if (z3) {
            DeviceSettingsInteractors deviceSettingsInteractors2 = this.k;
            if (deviceSettingsInteractors2 == null) {
                LogUtil.j("CycleBloodOxygenSettingActivity", "handleDownRemindCommand turn off mDeviceInteractors is null");
                return;
            } else {
                deviceSettingsInteractors2.a(0, 0, z2);
                return;
            }
        }
        if (z2) {
            this.e = Math.min(this.e, 90);
            this.m.setSwitchSetting("custom.blood.oxygen.remind", this.e + "", new IBaseResponseCallback() { // from class: com.huawei.ui.device.activity.bloodoxygen.CycleBloodOxygenSettingActivity.3
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i2, Object obj) {
                    LogUtil.a("CycleBloodOxygenSettingActivity", "migrateBloodOxygenNumber bloodRemidNumber is", obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        ReleaseLogUtil.d("DEVMGR_CycleBloodOxygenSettingActivity", "downRemind showDialog");
        this.t.clear();
        this.s.clear();
        View viewInflate = LayoutInflater.from(this).inflate(R.layout.hw_show_setting_blood_oxygen_down_remind, (ViewGroup) null);
        CustomViewDialog.Builder builder = new CustomViewDialog.Builder(this);
        builder.a(getString(com.huawei.ui.main.R.string.IDS_blood_oxygen_down_remind)).b(viewInflate, 0, 0).d(com.huawei.ui.main.R.string.IDS_hw_common_ui_dialog_confirm, new View.OnClickListener() { // from class: com.huawei.ui.device.activity.bloodoxygen.CycleBloodOxygenSettingActivity.6
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                CycleBloodOxygenSettingActivity cycleBloodOxygenSettingActivity = CycleBloodOxygenSettingActivity.this;
                cycleBloodOxygenSettingActivity.e = cycleBloodOxygenSettingActivity.y;
                CycleBloodOxygenSettingActivity.this.e(true, true, true);
                CycleBloodOxygenSettingActivity.this.o.d("biBloodOxygenRemindValue", CycleBloodOxygenSettingActivity.this.e);
            }
        }).c(com.huawei.ui.main.R.string.IDS_hw_show_cancel, new View.OnClickListener() { // from class: com.huawei.ui.device.activity.bloodoxygen.CycleBloodOxygenSettingActivity.8
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("CycleBloodOxygenSettingActivity", "dialog set negative");
            }
        });
        a(viewInflate);
        CustomViewDialog customViewDialogD = builder.d();
        customViewDialogD.setCancelable(false);
        customViewDialogD.show();
    }

    private void a(View view) {
        ((HealthTextView) qsp.a(view, R.id.tv_75)).setText(e(75));
        ((HealthTextView) qsp.a(view, R.id.tv_80)).setText(e(80));
        ((HealthTextView) qsp.a(view, R.id.tv_85)).setText(e(85));
        ((HealthTextView) qsp.a(view, R.id.tv_90)).setText(e(90));
        RelativeLayout relativeLayout = (RelativeLayout) qsp.a(view, R.id.rl_close);
        HealthRadioButton healthRadioButton = (HealthRadioButton) qsp.a(view, R.id.iv_close);
        this.t.put(0, relativeLayout);
        this.s.put(0, healthRadioButton);
        RelativeLayout relativeLayout2 = (RelativeLayout) qsp.a(view, R.id.rl_75);
        HealthRadioButton healthRadioButton2 = (HealthRadioButton) qsp.a(view, R.id.iv_75);
        this.t.put(75, relativeLayout2);
        this.s.put(75, healthRadioButton2);
        RelativeLayout relativeLayout3 = (RelativeLayout) qsp.a(view, R.id.rl_80);
        HealthRadioButton healthRadioButton3 = (HealthRadioButton) qsp.a(view, R.id.iv_80);
        this.t.put(80, relativeLayout3);
        this.s.put(80, healthRadioButton3);
        RelativeLayout relativeLayout4 = (RelativeLayout) qsp.a(view, R.id.rl_85);
        HealthRadioButton healthRadioButton4 = (HealthRadioButton) qsp.a(view, R.id.iv_85);
        this.t.put(85, relativeLayout4);
        this.s.put(85, healthRadioButton4);
        RelativeLayout relativeLayout5 = (RelativeLayout) qsp.a(view, R.id.rl_90);
        HealthRadioButton healthRadioButton5 = (HealthRadioButton) qsp.a(view, R.id.iv_90);
        this.t.put(90, relativeLayout5);
        this.s.put(90, healthRadioButton5);
        relativeLayout.setOnClickListener(this.n);
        relativeLayout2.setOnClickListener(this.n);
        relativeLayout3.setOnClickListener(this.n);
        relativeLayout4.setOnClickListener(this.n);
        relativeLayout5.setOnClickListener(this.n);
        d(this.e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i) {
        ReleaseLogUtil.d("DEVMGR_CycleBloodOxygenSettingActivity", "updateItemSelectButtonDrawable");
        for (Map.Entry<Integer, HealthRadioButton> entry : this.s.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            HealthRadioButton value = entry.getValue();
            if (i == iIntValue) {
                value.setChecked(true);
            } else {
                value.setChecked(false);
            }
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
