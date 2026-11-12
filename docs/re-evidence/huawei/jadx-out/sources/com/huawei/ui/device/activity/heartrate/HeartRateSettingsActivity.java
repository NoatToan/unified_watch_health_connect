package com.huawei.ui.device.activity.heartrate;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.huawei.haf.design.pattern.ObserveLabels;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.dialog.CustomAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.radiobutton.HealthRadioButton;
import com.huawei.ui.commonui.subheader.HealthSubHeader;
import com.huawei.ui.commonui.switchbutton.HealthSwitchButton;
import com.huawei.ui.device.R;
import com.huawei.ui.device.interactors.DeviceSettingsInteractors;
import defpackage.eej;
import defpackage.lvi;
import defpackage.mbu;
import defpackage.mgb;
import defpackage.mgg;
import defpackage.mhs;
import defpackage.qsp;
import defpackage.qvm;
import defpackage.rer;
import health.compact.a.CommonUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.UnitUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public class HeartRateSettingsActivity extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private DeviceCapability f24390a;
    private RelativeLayout aa;
    private HealthTextView ac;
    private RelativeLayout ad;
    private HealthTextView af;
    private HealthTextView ag;
    private HealthTextView ai;
    private HealthTextView aj;
    private HealthTextView ak;
    private HealthTextView al;
    private HealthTextView am;
    private HealthTextView an;
    private HealthTextView ao;
    private HealthTextView as;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f24391b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthTextView f24392c;
    private int d;
    private int e;
    private DeviceInfo f;
    private ImageView g;
    private DeviceSettingsInteractors j;
    private HealthTextView k;
    private rer l;
    private HealthSwitchButton m;
    private LinearLayout o;
    private mhs p;
    private ImageView s;
    private HealthTextView t;
    private ImageView u;
    private LinearLayout w;
    private List<String> x;
    private int q = 0;
    private int n = 0;
    private Map<Integer, HealthRadioButton> y = new HashMap(16);
    private Map<Integer, RelativeLayout> ab = new HashMap(16);
    private Map<Integer, RelativeLayout> z = new HashMap(16);
    private Map<Integer, HealthRadioButton> v = new HashMap(16);
    private View.OnTouchListener r = new View.OnTouchListener() { // from class: com.huawei.ui.device.activity.heartrate.HeartRateSettingsActivity.1
        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (view.getId() != HeartRateSettingsActivity.this.m.getId() || motionEvent.getAction() != 0) {
                return false;
            }
            if (!HeartRateSettingsActivity.this.m.isChecked()) {
                HeartRateSettingsActivity.this.c(true);
                return true;
            }
            mbu.e().c(HeartRateSettingsActivity.this, new IBaseResponseCallback() { // from class: com.huawei.ui.device.activity.heartrate.HeartRateSettingsActivity.1.2
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    if (i == 0) {
                        HeartRateSettingsActivity.this.c(false);
                    }
                }
            });
            return true;
        }
    };
    private View.OnClickListener h = new View.OnClickListener() { // from class: com.huawei.ui.device.activity.heartrate.HeartRateSettingsActivity.2
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            for (Map.Entry entry : HeartRateSettingsActivity.this.ab.entrySet()) {
                if (entry.getValue() == view) {
                    HeartRateSettingsActivity.this.d = ((Integer) entry.getKey()).intValue();
                    HeartRateSettingsActivity heartRateSettingsActivity = HeartRateSettingsActivity.this;
                    heartRateSettingsActivity.c(heartRateSettingsActivity.d);
                    return;
                }
            }
        }
    };
    private View.OnClickListener ae = new View.OnClickListener() { // from class: com.huawei.ui.device.activity.heartrate.HeartRateSettingsActivity.5
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            HeartRateSettingsActivity.this.f();
        }
    };
    private View.OnClickListener i = new View.OnClickListener() { // from class: com.huawei.ui.device.activity.heartrate.HeartRateSettingsActivity.9
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            for (Map.Entry entry : HeartRateSettingsActivity.this.z.entrySet()) {
                if (entry.getValue() == view) {
                    HeartRateSettingsActivity.this.e = ((Integer) entry.getKey()).intValue();
                    HeartRateSettingsActivity heartRateSettingsActivity = HeartRateSettingsActivity.this;
                    heartRateSettingsActivity.d(heartRateSettingsActivity.e);
                    return;
                }
            }
        }
    };
    private View.OnClickListener ah = new View.OnClickListener() { // from class: com.huawei.ui.device.activity.heartrate.HeartRateSettingsActivity.10
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            HeartRateSettingsActivity.this.d();
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public void c(boolean z) {
        this.m.setChecked(z);
        ReleaseLogUtil.d("DEVMGR_HeartRateSettingsActivity", "Heart Rate Switch is onCheckedChanged isChecked is ", Boolean.valueOf(z));
        DeviceSettingsInteractors deviceSettingsInteractors = this.j;
        if (deviceSettingsInteractors != null) {
            deviceSettingsInteractors.c(z);
        }
        Intent intent = new Intent();
        intent.putExtra("status", z ? "1" : "0");
        e(z);
        b(z);
        setResult(-1, intent);
        this.l.d("biAutoHeartRateSwitch", CommonUtil.j(z ? "1" : "0"));
        ObserverManagerUtil.e(ObserveLabels.HEART_RATE_SWITCH_STATUS, Integer.valueOf(z ? 1 : 0));
    }

    private void b(final boolean z) {
        if (z) {
            DeviceInfo deviceInfo = this.f;
            if (deviceInfo != null && mgb.d(deviceInfo.getDeviceIdentify()) == 2) {
                a(z);
                return;
            }
            ArrayList arrayList = new ArrayList(16);
            arrayList.add("custom.heart_rate_raise_remind");
            arrayList.add("custom.heart_rate_down_remind");
            this.p.getSwitchSetting(arrayList, new IBaseResponseCallback() { // from class: com.huawei.ui.device.activity.heartrate.HeartRateSettingsActivity.7
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    LogUtil.a("HeartRateSettingsActivity", "refreshHeartRateNumber errorCode is:", Integer.valueOf(i), ", objectData:", obj);
                    if (obj == null) {
                        HeartRateSettingsActivity.this.q = 120;
                        HeartRateSettingsActivity.this.n = 40;
                    } else {
                        List list = (List) obj;
                        String strC = qvm.c(list, "custom.heart_rate_raise_remind");
                        LogUtil.a("HeartRateSettingsActivity", "refreshHeartRateNumber raiseNumber is:", strC);
                        if (strC == null) {
                            HeartRateSettingsActivity.this.q = 120;
                        }
                        String strC2 = qvm.c(list, "custom.heart_rate_down_remind");
                        LogUtil.a("HeartRateSettingsActivity", "refreshHeartRateNumber downNumber is:", strC2);
                        if (strC2 == null) {
                            HeartRateSettingsActivity.this.n = 40;
                        }
                    }
                    HeartRateSettingsActivity.this.runOnUiThread(new Runnable() { // from class: com.huawei.ui.device.activity.heartrate.HeartRateSettingsActivity.7.5
                        @Override // java.lang.Runnable
                        public void run() {
                            HeartRateSettingsActivity.this.d(z);
                        }
                    });
                }
            });
            return;
        }
        d(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(boolean z) {
        LogUtil.a("HeartRateSettingsActivity", "updateHeartRateValue mHeartRateRaiseNumber: ", Integer.valueOf(this.q), " mHeartRateDownNumber: ", Integer.valueOf(this.n));
        DeviceCapability deviceCapability = this.f24390a;
        if (deviceCapability == null) {
            LogUtil.j("HeartRateSettingsActivity", "updateHeartRateValue mDeviceCapability is null not send command");
            a(false, z, false);
            b(false, z, false);
        } else {
            a(deviceCapability.isSupportHeartRateRaiseAlarm(), z, false);
            b(this.f24390a.isSupportHeartRateDownAlarm(), z, false);
        }
    }

    private void a(boolean z) {
        if (SharedPreferenceManager.e(BaseApplication.getContext(), "104", "custom.heart_rate_raise_remind") == null) {
            this.q = 120;
        }
        if (SharedPreferenceManager.e(BaseApplication.getContext(), "105", "custom.heart_rate_down_remind") == null) {
            this.n = 40;
        }
        d(z);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_heart_rate_settings);
        this.f24391b = BaseApplication.getContext();
        this.p = mhs.a();
        this.f24390a = eej.c();
        this.l = new rer();
        c();
        a();
        DeviceInfo deviceInfo = this.f;
        if (deviceInfo != null && mgb.d(deviceInfo.getDeviceIdentify()) == 2) {
            b();
        } else {
            e();
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.y.clear();
        this.ab.clear();
        CommonUtil.d(this);
    }

    private void c() {
        this.m = (HealthSwitchButton) qsp.a(this, R.id.heart_rate_switch_button);
        this.f24392c = (HealthTextView) qsp.a(this, R.id.heart_rate_content_tv);
        this.ak = (HealthTextView) qsp.a(this, R.id.heart_rate_tip1_tv);
        this.ao = (HealthTextView) qsp.a(this, R.id.heart_rate_tip2_tv);
        this.s = (ImageView) qsp.a(this, R.id.settings_heart_rate_imageView);
        this.t = (HealthTextView) qsp.a(this, R.id.heart_rate_tv_sub);
        this.an = (HealthTextView) qsp.a(this, R.id.heart_rate_tip3_tv);
        this.as = (HealthTextView) qsp.a(this, R.id.heart_rate_tip4_tv);
        this.ad = (RelativeLayout) qsp.a(this, R.id.settings_heart_rate_raise_remind_explain_layout);
        this.aa = (RelativeLayout) qsp.a(this, R.id.settings_heart_rate_down_remind_explain_layout);
        this.aj = (HealthTextView) qsp.a(this, R.id.raise_remind_number);
        this.am = (HealthTextView) qsp.a(this, R.id.down_remind_number);
        this.al = (HealthTextView) qsp.a(this, R.id.heart_rate_up_remind_explain);
        this.af = (HealthTextView) qsp.a(this, R.id.heart_rate_down_remind_explain);
        this.ai = (HealthTextView) qsp.a(this, R.id.heart_rate_up_remind_content_explain);
        this.ag = (HealthTextView) qsp.a(this, R.id.heart_rate_down_remind_content_explain);
        this.w = (LinearLayout) qsp.a(this, R.id.layout_raise_remind_number);
        this.o = (LinearLayout) qsp.a(this, R.id.layout_down_remind_number);
        this.ac = (HealthTextView) qsp.a(this, R.id.raise_remind_value);
        this.k = (HealthTextView) qsp.a(this, R.id.down_remind_value);
        this.g = (ImageView) qsp.a(this, R.id.image_right_down);
        this.u = (ImageView) qsp.a(this, R.id.image_right_raise);
        setViewSafeRegion(false, this.ai);
        DeviceCapability deviceCapabilityC = eej.c();
        if (deviceCapabilityC != null) {
            LogUtil.a("HeartRateSettingsActivity", "get deviceCapability 5.1.33 ", Boolean.valueOf(deviceCapabilityC.isSupportDefaultSwitch()));
            if (!deviceCapabilityC.isSupportHeartRateRaiseAlarm()) {
                this.ad.setVisibility(8);
            }
            if (!deviceCapabilityC.isSupportHeartRateDownAlarm()) {
                this.aa.setVisibility(8);
                this.ag.setVisibility(8);
            }
            if (!deviceCapabilityC.isSupportContinueHeartRate() && !deviceCapabilityC.isSupportHeartRateRaiseAlarm()) {
                this.ai.setVisibility(8);
                ((HealthSubHeader) qsp.a(this, R.id.trend_change_sub_header)).setVisibility(8);
            }
        }
        this.ad.setOnClickListener(this.ae);
        this.aa.setOnClickListener(this.ah);
        if (LanguageUtil.aj(BaseApplication.getContext())) {
            this.w.setLayoutDirection(1);
            this.o.setLayoutDirection(1);
        }
    }

    private void a() {
        String string;
        String string2;
        String string3;
        this.f = mgg.d("HeartRateSettingsActivity");
        DeviceSettingsInteractors deviceSettingsInteractorsE = DeviceSettingsInteractors.e(this.f24391b);
        this.j = deviceSettingsInteractorsE;
        DeviceInfo deviceInfoE = deviceSettingsInteractorsE.e();
        if (deviceInfoE == null) {
            LogUtil.a("HeartRateSettingsActivity", "refresh dialog Support deviceInfo is null , return");
            return;
        }
        if (!lvi.f(deviceInfoE.getProductType())) {
            string = getResources().getString(R.string.IDS_Settings_heart_rate_watch_content);
            string2 = getResources().getString(R.string.IDS_Settings_heart_rate_watch_tip);
            string3 = getResources().getString(R.string.IDS_hwh_motiontrack_device_using_tips);
            this.s.setImageResource(R.drawable.home_set_rate_watch_remider_image);
        } else {
            string = getResources().getString(R.string.IDS_Settings_heart_rate_band_content);
            string2 = getResources().getString(R.string.IDS_Settings_heart_rate_band_tip);
            string3 = getResources().getString(R.string.IDS_hwh_motiontrack_band_using_tips);
            this.s.setImageResource(R.drawable.home_set_rate_band_remider_image);
        }
        String string4 = getResources().getString(R.string.IDS_Settings_heart_rate_watch_or_band_tip);
        String string5 = getResources().getString(R.string.IDS_hwh_motiontrack_default_heart_rate_measurement_explain);
        this.f24392c.setText(String.format(string, 24));
        this.ak.setText(String.format(string2, 1));
        this.ao.setText(String.format(string4, 2));
        this.an.setText(String.format(string3, 3));
        this.as.setText(String.format(string5, 4));
        this.t.setText(String.format(getResources().getString(R.string.IDS_hwh_motiontrack_dynamically_adjust_measurement), Integer.valueOf(CommonUtil.n(BaseApplication.getContext(), qvm.b(24)))));
    }

    private void b() {
        this.n = CommonUtil.n(BaseApplication.getContext(), SharedPreferenceManager.e(BaseApplication.getContext(), "105", "custom.heart_rate_down_remind"));
        this.q = CommonUtil.n(BaseApplication.getContext(), SharedPreferenceManager.e(BaseApplication.getContext(), "104", "custom.heart_rate_raise_remind"));
        String strE = SharedPreferenceManager.e(this.f24391b, "102", "heart_rate_button");
        LogUtil.a("HeartRateSettingsActivity", "family MODULE_CYCLE_HEART_RATE_SWITCH status: ", strE, "mHeartRateRaiseNumber: ", Integer.valueOf(this.q), ",mHeartRateDownNumber: ", Integer.valueOf(this.n));
        boolean zEquals = !TextUtils.isEmpty(strE) ? "1".equals(strE) : false;
        this.m.setChecked(zEquals);
        this.m.setOnTouchListener(this.r);
        e(zEquals);
        a(false, zEquals, false);
        b(false, zEquals, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        this.ab.clear();
        this.y.clear();
        ReleaseLogUtil.d("DEVMGR_HeartRateSettingsActivity", "showDialogHighRate()");
        View viewInflate = ((LayoutInflater) getSystemService("layout_inflater")).inflate(R.layout.hw_show_setting_heart_reate_rasise_remind, (ViewGroup) null);
        b(viewInflate);
        CustomAlertDialog.Builder builder = new CustomAlertDialog.Builder(this);
        builder.b(getString(com.huawei.ui.main.R.string.IDS_heartrate_raise_remind)).a(viewInflate).d(com.huawei.ui.main.R.string.IDS_hw_common_ui_dialog_confirm, new DialogInterface.OnClickListener() { // from class: com.huawei.ui.device.activity.heartrate.HeartRateSettingsActivity.8
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                LogUtil.a("HeartRateSettingsActivity", "dialog set positive");
                HeartRateSettingsActivity heartRateSettingsActivity = HeartRateSettingsActivity.this;
                heartRateSettingsActivity.q = heartRateSettingsActivity.d;
                HeartRateSettingsActivity.this.a(true, true, true);
            }
        }).a(com.huawei.ui.main.R.string.IDS_hw_show_cancel, new DialogInterface.OnClickListener() { // from class: com.huawei.ui.device.activity.heartrate.HeartRateSettingsActivity.6
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                LogUtil.a("HeartRateSettingsActivity", "dialog set negative");
            }
        });
        CustomAlertDialog customAlertDialogB = builder.b();
        customAlertDialogB.setCancelable(false);
        customAlertDialogB.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        this.z.clear();
        this.v.clear();
        ReleaseLogUtil.d("DEVMGR_HeartRateSettingsActivity", "Enter showDialogDownRate()");
        View viewInflate = LayoutInflater.from(this.f24391b).inflate(R.layout.hw_show_setting_heart_reate_down_remind, (ViewGroup) null);
        e(viewInflate);
        CustomAlertDialog.Builder builder = new CustomAlertDialog.Builder(this);
        builder.b(getString(com.huawei.ui.main.R.string.IDS_heartrate_down_remind)).a(viewInflate).d(com.huawei.ui.main.R.string.IDS_hw_common_ui_dialog_confirm, new DialogInterface.OnClickListener() { // from class: com.huawei.ui.device.activity.heartrate.HeartRateSettingsActivity.3
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                LogUtil.a("HeartRateSettingsActivity", "hypo heart rate dialog set positive");
                HeartRateSettingsActivity heartRateSettingsActivity = HeartRateSettingsActivity.this;
                heartRateSettingsActivity.n = heartRateSettingsActivity.e;
                HeartRateSettingsActivity.this.b(true, true, true);
            }
        }).a(com.huawei.ui.main.R.string.IDS_hw_show_cancel, new DialogInterface.OnClickListener() { // from class: com.huawei.ui.device.activity.heartrate.HeartRateSettingsActivity.12
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                LogUtil.a("HeartRateSettingsActivity", "hypoheart rate dialog set negative");
            }
        });
        CustomAlertDialog customAlertDialogB = builder.b();
        customAlertDialogB.setCancelable(false);
        customAlertDialogB.show();
    }

    private void e() {
        ArrayList arrayList = new ArrayList(16);
        this.x = arrayList;
        arrayList.add("heart_rate_button");
        this.x.add("custom.heart_rate_raise_remind");
        this.x.add("custom.heart_rate_down_remind");
        this.p.getSwitchSetting(this.x, new IBaseResponseCallback() { // from class: com.huawei.ui.device.activity.heartrate.HeartRateSettingsActivity.4
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                LogUtil.a("HeartRateSettingsActivity", "initHeartRemind list errCode is ", Integer.valueOf(i));
                if (i == 0 && (obj instanceof List)) {
                    List list = (List) obj;
                    String strC = qvm.c(list, "custom.heart_rate_raise_remind");
                    HeartRateSettingsActivity.this.q = CommonUtil.j(strC);
                    String strC2 = qvm.c(list, "custom.heart_rate_down_remind");
                    HeartRateSettingsActivity.this.n = CommonUtil.j(strC2);
                    final boolean zEquals = "1".equals(qvm.c(list, "heart_rate_button"));
                    LogUtil.a("HeartRateSettingsActivity", "updateSwitchStatus isEnable: ", Boolean.valueOf(zEquals));
                    HeartRateSettingsActivity.this.runOnUiThread(new Runnable() { // from class: com.huawei.ui.device.activity.heartrate.HeartRateSettingsActivity.4.3
                        @Override // java.lang.Runnable
                        public void run() {
                            HeartRateSettingsActivity.this.m.setChecked(zEquals);
                            HeartRateSettingsActivity.this.m.setOnTouchListener(HeartRateSettingsActivity.this.r);
                            HeartRateSettingsActivity.this.e(zEquals);
                            HeartRateSettingsActivity.this.a(false, zEquals, false);
                            HeartRateSettingsActivity.this.b(false, zEquals, false);
                        }
                    });
                    if (HeartRateSettingsActivity.this.j != null) {
                        HeartRateSettingsActivity.this.j.c(zEquals);
                    } else {
                        LogUtil.j("HeartRateSettingsActivity", "updateSwitchStatus mDeviceInteractors is null");
                    }
                }
            }
        });
    }

    private void b(View view) {
        e((HealthTextView) qsp.a(view, R.id.tv_150), 150);
        e((HealthTextView) qsp.a(view, R.id.tv_140), 140);
        e((HealthTextView) qsp.a(view, R.id.tv_130), 130);
        e((HealthTextView) qsp.a(view, R.id.tv_120), 120);
        e((HealthTextView) qsp.a(view, R.id.tv_110), 110);
        e((HealthTextView) qsp.a(view, R.id.tv_100), 100);
        RelativeLayout relativeLayout = (RelativeLayout) qsp.a(view, R.id.rl_close);
        this.ab.put(0, relativeLayout);
        this.y.put(0, (HealthRadioButton) qsp.a(view, R.id.iv_close));
        RelativeLayout relativeLayout2 = (RelativeLayout) qsp.a(view, R.id.rl_100);
        this.ab.put(100, relativeLayout2);
        RelativeLayout relativeLayout3 = (RelativeLayout) qsp.a(view, R.id.rl_110);
        this.ab.put(110, relativeLayout3);
        RelativeLayout relativeLayout4 = (RelativeLayout) qsp.a(view, R.id.rl_120);
        this.ab.put(120, relativeLayout4);
        RelativeLayout relativeLayout5 = (RelativeLayout) qsp.a(view, R.id.rl_130);
        this.ab.put(130, relativeLayout5);
        RelativeLayout relativeLayout6 = (RelativeLayout) qsp.a(view, R.id.rl_140);
        this.ab.put(140, relativeLayout6);
        RelativeLayout relativeLayout7 = (RelativeLayout) qsp.a(view, R.id.rl_150);
        this.ab.put(150, relativeLayout7);
        this.y.put(100, (HealthRadioButton) qsp.a(view, R.id.iv_100));
        this.y.put(110, (HealthRadioButton) qsp.a(view, R.id.iv_110));
        this.y.put(120, (HealthRadioButton) qsp.a(view, R.id.iv_120));
        this.y.put(130, (HealthRadioButton) qsp.a(view, R.id.iv_130));
        this.y.put(140, (HealthRadioButton) qsp.a(view, R.id.iv_140));
        this.y.put(150, (HealthRadioButton) qsp.a(view, R.id.iv_150));
        relativeLayout.setOnClickListener(this.h);
        relativeLayout2.setOnClickListener(this.h);
        relativeLayout3.setOnClickListener(this.h);
        relativeLayout4.setOnClickListener(this.h);
        relativeLayout5.setOnClickListener(this.h);
        relativeLayout6.setOnClickListener(this.h);
        relativeLayout7.setOnClickListener(this.h);
        c(this.q);
    }

    private void e(View view) {
        e((HealthTextView) qsp.a(view, R.id.tv_40), 40);
        e((HealthTextView) qsp.a(view, R.id.tv_45), 45);
        e((HealthTextView) qsp.a(view, R.id.tv_50), 50);
        RelativeLayout relativeLayout = (RelativeLayout) qsp.a(view, R.id.rl_close);
        this.z.put(0, relativeLayout);
        this.v.put(0, (HealthRadioButton) qsp.a(view, R.id.iv_close));
        RelativeLayout relativeLayout2 = (RelativeLayout) qsp.a(view, R.id.rl_40);
        this.z.put(40, relativeLayout2);
        RelativeLayout relativeLayout3 = (RelativeLayout) qsp.a(view, R.id.rl_45);
        this.z.put(45, relativeLayout3);
        RelativeLayout relativeLayout4 = (RelativeLayout) qsp.a(view, R.id.rl_50);
        this.z.put(50, relativeLayout4);
        this.v.put(40, (HealthRadioButton) qsp.a(view, R.id.iv_40));
        this.v.put(45, (HealthRadioButton) qsp.a(view, R.id.iv_45));
        this.v.put(50, (HealthRadioButton) qsp.a(view, R.id.iv_50));
        relativeLayout.setOnClickListener(this.i);
        relativeLayout2.setOnClickListener(this.i);
        relativeLayout3.setOnClickListener(this.i);
        relativeLayout4.setOnClickListener(this.i);
        d(this.n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z, boolean z2, boolean z3) {
        int i;
        ReleaseLogUtil.d("DEVMGR_HeartRateSettingsActivity", "updateViewByHeartRateNumber isSendCommand:", Boolean.valueOf(z), ", isContinueHeartRateIsChecked:", Boolean.valueOf(z2), ", isMigrateHeartRateRaiseRemind:", Boolean.valueOf(z3));
        int i2 = this.q;
        this.d = i2;
        if (z2 && i2 != 0) {
            this.ai.setText(getResources().getString(R.string.IDS_heartrate_raise_remind_explain, getResources().getString(R.string.IDS_hw_show_set_target_sport_time_unit, UnitUtil.e(10.0d, 1, 0)), UnitUtil.e(this.q, 1, 0)));
            String strB = qvm.b(this.q);
            this.ac.setText(strB);
            e(this.aj, CommonUtil.n(BaseApplication.getContext(), strB));
            if (z) {
                d(1, this.q, true);
            }
        } else {
            try {
                i = Integer.parseInt(UnitUtil.e(10.0d, 1, 0));
            } catch (NumberFormatException unused) {
                LogUtil.e("HeartRateSettingsActivity", "updateViewByHeartRateNumber NumberFormatException");
                i = 10;
            }
            this.ai.setText(getResources().getString(R.string.IDS_heartrate_raise_remind_explain_disable_division_unit, Integer.valueOf(i)));
            this.aj.setText(R.string.IDS_settings_about_huawei_cloud_service_heartrate_turn_off);
            this.ac.setText("");
            if (z) {
                d(0, 0, z3);
            } else if (z3) {
                this.p.setSwitchSetting("custom.heart_rate_raise_remind", this.q + "", null);
            }
        }
        if (LanguageUtil.ba(BaseApplication.getContext())) {
            this.u.setBackgroundResource(R.drawable.common_ui_arrow_left);
        } else {
            this.u.setBackgroundResource(R.drawable.common_ui_arrow_right);
        }
    }

    private void e(HealthTextView healthTextView, int i) {
        healthTextView.setText(getResources().getQuantityString(R.plurals.IDS_heartrate_unit_string, i, Integer.valueOf(i)));
    }

    private void d(int i, int i2, boolean z) {
        LogUtil.a("HeartRateSettingsActivity", "openOrCloseHeartRateRaiseRemindEnable openOrClose : ", Integer.valueOf(i), " number: ", Integer.valueOf(i2));
        DeviceSettingsInteractors deviceSettingsInteractors = this.j;
        if (deviceSettingsInteractors == null) {
            LogUtil.j("HeartRateSettingsActivity", "openOrCloseHeartRateRaiseRemindEnable mDeviceInteractors is null");
        } else {
            deviceSettingsInteractors.c(i, i2, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i) {
        ReleaseLogUtil.d("DEVMGR_HeartRateSettingsActivity", "Enter updateHighItemSelectButtonDrawable");
        for (Map.Entry<Integer, HealthRadioButton> entry : this.y.entrySet()) {
            entry.getValue().setChecked(i == entry.getKey().intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i) {
        ReleaseLogUtil.d("DEVMGR_HeartRateSettingsActivity", "Enter updateHighItemSelectButtonDrawable");
        for (Map.Entry<Integer, HealthRadioButton> entry : this.v.entrySet()) {
            entry.getValue().setChecked(i == entry.getKey().intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(boolean z, boolean z2, boolean z3) {
        DeviceCapability deviceCapabilityC;
        ReleaseLogUtil.d("DEVMGR_HeartRateSettingsActivity", "updateViewByHeartRateNumberDownRate isSendCommand:", Boolean.valueOf(z), ", isContinueHeartRateChecked:", Boolean.valueOf(z2), ", isMigrateHeartRateRaiseRemind:", Boolean.valueOf(z3));
        int i = this.n;
        this.e = i;
        if (z2 && i != 0) {
            HealthTextView healthTextView = this.ag;
            Resources resources = getResources();
            int i2 = R.string.IDS_heartrate_down_remind_explain_new;
            String quantityString = getResources().getQuantityString(R.plurals.sug_fitness_train_minutes, 10, 10);
            Resources resources2 = getResources();
            int i3 = R.plurals.IDS_heartrate_unit_string;
            int i4 = this.n;
            healthTextView.setText(resources.getString(i2, quantityString, resources2.getQuantityString(i3, i4, Integer.valueOf(i4))));
            String strB = qvm.b(this.n);
            this.k.setText(strB);
            e(this.am, CommonUtil.n(BaseApplication.getContext(), strB));
            if (z) {
                a(1, this.n, true);
            }
        } else {
            this.ag.setText(getResources().getString(R.string.IDS_heartrate_down_remind_explain_disable_new, getResources().getString(R.string.IDS_hw_show_set_target_sport_time_unit, UnitUtil.e(10.0d, 1, 0))));
            this.am.setText(R.string.IDS_settings_about_huawei_cloud_service_heartrate_turn_off);
            this.k.setText("");
            if (z) {
                a(0, 0, z3);
            } else if (z3 && (deviceCapabilityC = eej.c()) != null && deviceCapabilityC.isSupportHeartRateDownAlarm()) {
                this.p.setSwitchSetting("custom.heart_rate_down_remind", this.n + "", null);
                LogUtil.a("HeartRateSettingsActivity", "updateViewByHeartRateNumberDownRate update view by heart rate down");
            }
        }
        if (LanguageUtil.ba(BaseApplication.getContext())) {
            this.g.setBackgroundResource(R.drawable.common_ui_arrow_left);
        } else {
            this.g.setBackgroundResource(R.drawable.common_ui_arrow_right);
        }
    }

    private void a(int i, int i2, boolean z) {
        LogUtil.a("HeartRateSettingsActivity", "openOrCloseHeartRateDownRemindEnable openOrClose: ", Integer.valueOf(i), " number: ", Integer.valueOf(i2));
        DeviceSettingsInteractors deviceSettingsInteractors = this.j;
        if (deviceSettingsInteractors == null) {
            LogUtil.j("HeartRateSettingsActivity", "openOrCloseHeartRateDownRemindEnable mDeviceInteractors is null");
        } else {
            deviceSettingsInteractors.e(i, i2, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(boolean z) {
        LogUtil.a("HeartRateSettingsActivity", "updateViewBySwitchStatus: ", Boolean.valueOf(z));
        if (!z) {
            this.al.setTextColor(getResources().getColor(R.color.textColorSecondary));
            this.aj.setTextColor(getResources().getColor(R.color.colorTertiary));
            this.ai.setTextColor(getResources().getColor(R.color.colorTertiary));
            this.ad.setEnabled(false);
            this.af.setTextColor(getResources().getColor(R.color.textColorSecondary));
            this.am.setTextColor(getResources().getColor(R.color.colorTertiary));
            this.ag.setTextColor(getResources().getColor(R.color.colorTertiary));
            this.aa.setEnabled(false);
            return;
        }
        this.al.setTextColor(getResources().getColor(R.color.health_heart_remind_open_text_color));
        this.aj.setTextColor(getResources().getColor(R.color.textColorSecondary));
        this.ai.setTextColor(getResources().getColor(R.color.textColorSecondary));
        this.ad.setEnabled(true);
        this.af.setTextColor(getResources().getColor(R.color.health_heart_remind_open_text_color));
        this.am.setTextColor(getResources().getColor(R.color.textColorSecondary));
        this.ag.setTextColor(getResources().getColor(R.color.textColorSecondary));
        this.aa.setEnabled(true);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
