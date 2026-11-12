package com.huawei.ui.device.activity.heartrate;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
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
import defpackage.mhs;
import defpackage.qrs;
import defpackage.qsp;
import defpackage.qvm;
import defpackage.rax;
import defpackage.rer;
import health.compact.a.CommonUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Semaphore;

/* JADX INFO: loaded from: classes3.dex */
public class ContinueHeartRateSettingActivity extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ImageView f24378a;
    private LinearLayout ab;
    private ImageView ad;
    private HealthTextView ae;
    private RelativeLayout af;
    private RelativeLayout ah;
    private LinearLayout ai;
    private RelativeLayout aj;
    private RelativeLayout al;
    private HealthTextView ao;
    private HealthTextView ap;
    private HealthTextView aq;
    private HealthTextView at;
    private HealthTextView au;
    private HealthTextView av;
    private HealthTextView ax;
    private HealthTextView az;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f24379b;
    private HealthTextView ba;
    private HealthTextView bc;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f24380c;
    private HealthTextView d;
    private HealthTextView e;
    private HealthTextView f;
    private ImageView g;
    private HealthSwitchButton i;
    private HealthTextView j;
    private ImageView m;
    private HealthTextView n;
    private DeviceSettingsInteractors o;
    private HealthSubHeader p;
    private rer q;
    private int r;
    private LinearLayout s;
    private HealthTextView t;
    private int v;
    private HealthTextView w;
    private mhs x;
    private ImageView y;
    private List<String> z;
    private Map<Integer, RelativeLayout> am = new HashMap(7);
    private Map<Integer, HealthRadioButton> u = new HashMap(7);
    private Map<Integer, RelativeLayout> an = new HashMap(7);
    private Map<Integer, HealthRadioButton> ac = new HashMap(7);
    private Map<Integer, RelativeLayout> ak = new HashMap(7);
    private Map<Integer, ImageView> aa = new HashMap(7);
    private Semaphore aw = new Semaphore(0);
    private View.OnTouchListener h = new View.OnTouchListener() { // from class: com.huawei.ui.device.activity.heartrate.ContinueHeartRateSettingActivity.1
        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (view.getId() != ContinueHeartRateSettingActivity.this.i.getId() || motionEvent.getAction() != 0) {
                return false;
            }
            boolean zIsChecked = ContinueHeartRateSettingActivity.this.i.isChecked();
            ReleaseLogUtil.d("DEVMGR_ContinueHeartRateSettingActivity", "mCustomSwitchButton isChecked:", Boolean.valueOf(!zIsChecked));
            if (!zIsChecked) {
                ContinueHeartRateSettingActivity.this.e(true);
                return true;
            }
            mbu.e().c(ContinueHeartRateSettingActivity.this, new IBaseResponseCallback() { // from class: com.huawei.ui.device.activity.heartrate.ContinueHeartRateSettingActivity.1.4
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    if (i == 0) {
                        ContinueHeartRateSettingActivity.this.e(false);
                    }
                }
            });
            return true;
        }
    };
    private View.OnClickListener as = new View.OnClickListener() { // from class: com.huawei.ui.device.activity.heartrate.ContinueHeartRateSettingActivity.4
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!qrs.r()) {
                ContinueHeartRateSettingActivity.this.c();
            } else {
                LogUtil.j("ContinueHeartRateSettingActivity", "click the raise button is fast click");
            }
        }
    };
    private View.OnClickListener ar = new View.OnClickListener() { // from class: com.huawei.ui.device.activity.heartrate.ContinueHeartRateSettingActivity.9
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!qrs.r()) {
                ContinueHeartRateSettingActivity.this.g();
            } else {
                LogUtil.j("ContinueHeartRateSettingActivity", "click the down button is fast click");
            }
        }
    };
    private View.OnClickListener k = new View.OnClickListener() { // from class: com.huawei.ui.device.activity.heartrate.ContinueHeartRateSettingActivity.10
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            for (Map.Entry entry : ContinueHeartRateSettingActivity.this.am.entrySet()) {
                if (entry.getValue() == view) {
                    ContinueHeartRateSettingActivity.this.f24380c = ((Integer) entry.getKey()).intValue();
                    ContinueHeartRateSettingActivity continueHeartRateSettingActivity = ContinueHeartRateSettingActivity.this;
                    continueHeartRateSettingActivity.c(continueHeartRateSettingActivity.f24380c);
                    return;
                }
            }
        }
    };
    private View.OnClickListener l = new View.OnClickListener() { // from class: com.huawei.ui.device.activity.heartrate.ContinueHeartRateSettingActivity.7
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            for (Map.Entry entry : ContinueHeartRateSettingActivity.this.an.entrySet()) {
                if (entry.getValue() == view) {
                    ContinueHeartRateSettingActivity.this.f24379b = ((Integer) entry.getKey()).intValue();
                    ContinueHeartRateSettingActivity continueHeartRateSettingActivity = ContinueHeartRateSettingActivity.this;
                    continueHeartRateSettingActivity.e(continueHeartRateSettingActivity.f24379b);
                    return;
                }
            }
        }
    };
    private View.OnClickListener ag = new View.OnClickListener() { // from class: com.huawei.ui.device.activity.heartrate.ContinueHeartRateSettingActivity.6
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            LogUtil.a("ContinueHeartRateSettingActivity", "click the radio button");
            for (Map.Entry entry : ContinueHeartRateSettingActivity.this.ak.entrySet()) {
                if (entry.getValue() == view) {
                    LogUtil.a("ContinueHeartRateSettingActivity", "get the button");
                    Integer num = (Integer) entry.getKey();
                    int iIntValue = num.intValue();
                    ContinueHeartRateSettingActivity.this.d(iIntValue);
                    ReleaseLogUtil.d("DEVMGR_ContinueHeartRateSettingActivity", "send heart rate key: ", num);
                    if (iIntValue != 0) {
                        if (iIntValue == 1) {
                            if (ContinueHeartRateSettingActivity.this.o != null) {
                                ContinueHeartRateSettingActivity.this.o.a(1);
                                ContinueHeartRateSettingActivity.this.q.d("biContinueHeartRateModeSwitch", 1);
                            } else {
                                LogUtil.j("ContinueHeartRateSettingActivity", "send cycle heart rate mDeviceInteractors is null");
                            }
                        } else {
                            LogUtil.d("ContinueHeartRateSettingActivity", "click not get heart rate choice");
                        }
                    } else if (ContinueHeartRateSettingActivity.this.o != null) {
                        ContinueHeartRateSettingActivity.this.o.c(1);
                        ContinueHeartRateSettingActivity.this.q.d("biContinueHeartRateModeSwitch", 0);
                    } else {
                        LogUtil.j("ContinueHeartRateSettingActivity", "send continue heart rate mDeviceInteractors is null");
                    }
                    LogUtil.a("ContinueHeartRateSettingActivity", "write sharedpreference");
                    ContinueHeartRateSettingActivity.this.c("heartRateChoiceKey", iIntValue);
                    LogUtil.a("ContinueHeartRateSettingActivity", "finish writting sharedpreference");
                    return;
                }
            }
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public void e(boolean z) {
        DeviceSettingsInteractors deviceSettingsInteractors;
        DeviceSettingsInteractors deviceSettingsInteractors2;
        this.i.setChecked(z);
        ReleaseLogUtil.d("DEVMGR_ContinueHeartRateSettingActivity", "continue heart rate onCheckedChanged: ", Boolean.valueOf(z));
        int iB = b("heartRateChoiceKey");
        ReleaseLogUtil.d("DEVMGR_ContinueHeartRateSettingActivity", "support key is ", Integer.valueOf(iB));
        if (iB == 0 && (deviceSettingsInteractors2 = this.o) != null) {
            deviceSettingsInteractors2.c(z ? 1 : 0);
        }
        if (iB == 1 && (deviceSettingsInteractors = this.o) != null) {
            deviceSettingsInteractors.a(z ? 1 : 0);
        }
        h(z ? 1 : 0);
        a(z, iB);
        b(z);
        this.q.d("biContinueHeartRateSwitch", z ? 1 : 0);
        ObserverManagerUtil.e(ObserveLabels.HEART_RATE_SWITCH_STATUS, Integer.valueOf(z ? 1 : 0));
    }

    private void b(final boolean z) {
        if (z) {
            ArrayList arrayList = new ArrayList(16);
            arrayList.add("custom.heart_rate_raise_remind");
            arrayList.add("custom.heart_rate_down_remind");
            this.x.getSwitchSetting(arrayList, new IBaseResponseCallback() { // from class: com.huawei.ui.device.activity.heartrate.ContinueHeartRateSettingActivity.8
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    LogUtil.a("ContinueHeartRateSettingActivity", "refreshHeartRateNumber errorCode is:", Integer.valueOf(i), ", objectData:", obj);
                    if (obj == null) {
                        ContinueHeartRateSettingActivity.this.v = 120;
                        ContinueHeartRateSettingActivity.this.r = 40;
                    } else {
                        List list = (List) obj;
                        String strC = qvm.c(list, "custom.heart_rate_raise_remind");
                        LogUtil.a("ContinueHeartRateSettingActivity", "refreshHeartRateNumber raiseNumber is:", strC);
                        if (strC == null) {
                            ContinueHeartRateSettingActivity.this.v = 120;
                        }
                        String strC2 = qvm.c(list, "custom.heart_rate_down_remind");
                        LogUtil.a("ContinueHeartRateSettingActivity", "refreshHeartRateNumber downNumber is:", strC);
                        if (strC2 == null) {
                            ContinueHeartRateSettingActivity.this.r = 40;
                        }
                    }
                    ContinueHeartRateSettingActivity.this.runOnUiThread(new Runnable() { // from class: com.huawei.ui.device.activity.heartrate.ContinueHeartRateSettingActivity.8.4
                        @Override // java.lang.Runnable
                        public void run() {
                            ContinueHeartRateSettingActivity.this.d(z);
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
        LogUtil.a("ContinueHeartRateSettingActivity", "refreshHeartRateNumber mHeartRateRaiseNumber: ", Integer.valueOf(this.v), " mHeartRateDownNumber: ", Integer.valueOf(this.r));
        b(true, z, false);
        a(true, z, false);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_device_continue_measure_heart_rate);
        this.x = mhs.a();
        this.o = DeviceSettingsInteractors.e(BaseApplication.getContext());
        this.q = new rer();
        a();
    }

    private void a() {
        this.i = (HealthSwitchButton) qsp.a(this, R.id.heart_rate_switch_button);
        this.aj = (RelativeLayout) qsp.a(this, R.id.settings_heart_rate_raise_remind_explain_layout);
        this.al = (RelativeLayout) qsp.a(this, R.id.settings_heart_rate_down_remind_explain_layout);
        this.av = (HealthTextView) qsp.a(this, R.id.raise_remind_number);
        this.ao = (HealthTextView) qsp.a(this, R.id.down_remind_number);
        this.y = (ImageView) qsp.a(this, R.id.settings_heart_rate_imageView);
        this.j = (HealthTextView) qsp.a(this, R.id.heart_rate_content_tv);
        this.ax = (HealthTextView) qsp.a(this, R.id.heart_rate_tip1_tv);
        this.az = (HealthTextView) qsp.a(this, R.id.heart_rate_tip2_tv);
        this.bc = (HealthTextView) qsp.a(this, R.id.heart_rate_tip3_tv);
        this.ba = (HealthTextView) qsp.a(this, R.id.heart_rate_tip4_tv);
        this.au = (HealthTextView) qsp.a(this, R.id.heart_rate_up_remind_explain);
        this.at = (HealthTextView) qsp.a(this, R.id.heart_rate_down_remind_explain);
        this.aq = (HealthTextView) qsp.a(this, R.id.heart_rate_up_remind_content_explain);
        this.ai = (LinearLayout) qsp.a(this, R.id.layout_raise_remind_number);
        this.s = (LinearLayout) qsp.a(this, R.id.layout_down_remind_number);
        this.ae = (HealthTextView) qsp.a(this, R.id.raise_remind_value);
        this.t = (HealthTextView) qsp.a(this, R.id.down_remind_value);
        this.m = (ImageView) qsp.a(this, R.id.image_right_down);
        this.ad = (ImageView) qsp.a(this, R.id.image_right_raise);
        setViewSafeRegion(false, this.aq);
        this.ap = (HealthTextView) qsp.a(this, R.id.heart_rate_down_remind_content_explain);
        e();
        DeviceCapability deviceCapabilityC = eej.c();
        if (deviceCapabilityC != null) {
            if (!deviceCapabilityC.isSupportHeartRateRaiseAlarm()) {
                this.aj.setVisibility(8);
            }
            if (!deviceCapabilityC.isSupportHeartRateDownAlarm()) {
                this.al.setVisibility(8);
                this.ap.setVisibility(8);
            }
            LogUtil.a("ContinueHeartRateSettingActivity", "get device capablity");
            d(deviceCapabilityC);
        }
        this.aj.setOnClickListener(this.as);
        this.al.setOnClickListener(this.ar);
        if (LanguageUtil.aj(BaseApplication.getContext())) {
            this.ai.setLayoutDirection(1);
            this.s.setLayoutDirection(1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0016  */
    private void d(DeviceCapability deviceCapability) {
        int i;
        if (deviceCapability.isSupportContinueHeartRate()) {
            if (deviceCapability.isSupportHeartRateEnable()) {
                i = 3;
            } else {
                i = 0;
            }
        } else if (deviceCapability.isSupportHeartRateEnable()) {
            i = 1;
        } else {
            i = 0;
        }
        LogUtil.a("ContinueHeartRateSettingActivity", "get choice key " + i);
        c("heartRateSupportChoiceKey", i);
        b(i);
        b();
    }

    private void b() {
        ArrayList arrayList = new ArrayList(16);
        this.z = arrayList;
        arrayList.add("continue_heart_rate");
        this.z.add("custom.heart_rate_raise_remind");
        this.z.add("custom.heart_rate_down_remind");
        this.z.add("heart_rate_mode");
        this.x.getSwitchSetting(this.z, new IBaseResponseCallback() { // from class: com.huawei.ui.device.activity.heartrate.ContinueHeartRateSettingActivity.15
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                LogUtil.a("ContinueHeartRateSettingActivity", "initData list errCode is:", Integer.valueOf(i));
                if (i == 0 && (obj instanceof List)) {
                    List list = (List) obj;
                    final int iJ = 0;
                    final int iB = CommonUtil.b(BaseApplication.getContext(), qvm.c(list, "continue_heart_rate"), 0);
                    LogUtil.a("ContinueHeartRateSettingActivity", "CONTINUE_HEART_RATE status :", Integer.valueOf(iB));
                    String strC = qvm.c(list, "custom.heart_rate_raise_remind");
                    ContinueHeartRateSettingActivity.this.v = CommonUtil.j(strC);
                    String strC2 = qvm.c(list, "custom.heart_rate_down_remind");
                    ContinueHeartRateSettingActivity.this.r = CommonUtil.j(strC2);
                    DeviceCapability deviceCapabilityC = eej.c();
                    if (deviceCapabilityC.isSupportContinueHeartRate() && deviceCapabilityC.isSupportHeartRateEnable()) {
                        iJ = CommonUtil.j(qvm.c(list, "heart_rate_mode"));
                        LogUtil.a("ContinueHeartRateSettingActivity", "initItemSelect HEART_RATE_MODE support : ", Integer.valueOf(iJ));
                    } else if (!deviceCapabilityC.isSupportContinueHeartRate() || deviceCapabilityC.isSupportHeartRateEnable()) {
                        iJ = 1;
                        LogUtil.a("ContinueHeartRateSettingActivity", "initData supportValue:", 1);
                    }
                    ContinueHeartRateSettingActivity.this.runOnUiThread(new Runnable() { // from class: com.huawei.ui.device.activity.heartrate.ContinueHeartRateSettingActivity.15.4
                        @Override // java.lang.Runnable
                        public void run() {
                            ContinueHeartRateSettingActivity.this.d(iB, iJ);
                        }
                    });
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i, int i2) {
        boolean z = i != 0;
        this.af.setEnabled(z);
        this.ah.setEnabled(z);
        LogUtil.a("ContinueHeartRateSettingActivity", "switch checked is ", Boolean.valueOf(z));
        this.i.setChecked(z);
        this.i.setOnTouchListener(this.h);
        h(i);
        b(false, z, false);
        a(false, z, false);
        c("heartRateChoiceKey", i2);
        d(i2, z);
        this.aw.release();
    }

    private void h(int i) {
        LogUtil.a("ContinueHeartRateSettingActivity", "updateViewBySwitchStatus: ", Integer.valueOf(i));
        if (i == 0) {
            this.au.setTextColor(getResources().getColor(R.color.textColorSecondary));
            this.av.setTextColor(getResources().getColor(R.color.colorTertiary));
            this.aq.setTextColor(getResources().getColor(R.color.colorTertiary));
            this.aj.setEnabled(false);
            this.at.setTextColor(getResources().getColor(R.color.health_heart_remind_close_text_50_color));
            this.ao.setTextColor(getResources().getColor(R.color.colorTertiary));
            this.ap.setTextColor(getResources().getColor(R.color.colorTertiary));
            this.d.setTextColor(getResources().getColor(R.color.colorTertiary));
            this.n.setTextColor(getResources().getColor(R.color.colorTertiary));
            this.f.setTextColor(getResources().getColor(R.color.colorTertiary));
            this.e.setTextColor(getResources().getColor(R.color.colorTertiary));
            this.al.setEnabled(false);
            return;
        }
        if (i == 1) {
            this.au.setTextColor(getResources().getColor(R.color.health_heart_remind_open_text_color));
            this.av.setTextColor(getResources().getColor(R.color.textColorSecondary));
            this.aq.setTextColor(getResources().getColor(R.color.textColorSecondary));
            this.aj.setEnabled(true);
            this.at.setTextColor(getResources().getColor(R.color.health_heart_remind_open_text_color));
            this.ao.setTextColor(getResources().getColor(R.color.textColorSecondary));
            this.ap.setTextColor(getResources().getColor(R.color.textColorSecondary));
            this.al.setEnabled(true);
            this.d.setTextColor(getResources().getColor(R.color.health_heart_remind_open_text_color));
            this.n.setTextColor(getResources().getColor(R.color.health_heart_remind_open_text_color));
            this.f.setTextColor(getResources().getColor(R.color.textColorSecondary));
            this.e.setTextColor(getResources().getColor(R.color.textColorSecondary));
            return;
        }
        LogUtil.j("ContinueHeartRateSettingActivity", "no this status");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(boolean z, boolean z2, boolean z3) {
        int i;
        ReleaseLogUtil.d("DEVMGR_ContinueHeartRateSettingActivity", "updateViewByHeartRateNumber isSendCommand:", Boolean.valueOf(z), ", isContinueHeartRateIsChecked:", Boolean.valueOf(z2), ", isMigrateHeartRateRaiseRemind:", Boolean.valueOf(z3));
        int i2 = this.v;
        this.f24380c = i2;
        if (z2 && i2 != 0) {
            this.aq.setText(getResources().getString(R.string.IDS_heartrate_raise_remind_explain, getResources().getString(R.string.IDS_hw_show_set_target_sport_time_unit, UnitUtil.e(10.0d, 1, 0)), UnitUtil.e(this.v, 1, 0)));
            String strB = qvm.b(this.v);
            this.ae.setText(strB);
            c(this.av, CommonUtil.n(BaseApplication.getContext(), strB));
            if (z) {
                b(1, this.v, true);
            }
        } else {
            try {
                i = Integer.parseInt(UnitUtil.e(10.0d, 1, 0));
            } catch (NumberFormatException unused) {
                LogUtil.e("ContinueHeartRateSettingActivity", "updateViewByHeartRateNumber NumberFormatException");
                i = 10;
            }
            this.aq.setText(getResources().getString(R.string.IDS_heartrate_raise_remind_explain_disable_division_unit, Integer.valueOf(i)));
            this.av.setText(R.string.IDS_settings_about_huawei_cloud_service_heartrate_turn_off);
            this.ae.setText("");
            if (z) {
                b(0, 0, z3);
            } else if (z3) {
                this.x.setSwitchSetting("custom.heart_rate_raise_remind", this.v + "", null);
            }
        }
        if (LanguageUtil.ba(BaseApplication.getContext())) {
            this.ad.setBackgroundResource(R.drawable.common_ui_arrow_left);
        } else {
            this.ad.setBackgroundResource(R.drawable.common_ui_arrow_right);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z, boolean z2, boolean z3) {
        DeviceCapability deviceCapabilityC;
        ReleaseLogUtil.d("DEVMGR_ContinueHeartRateSettingActivity", "updateViewByHeartRateNumberDownRate isSendCommand:", Boolean.valueOf(z), ", isContinueHeartRateChecked:", Boolean.valueOf(z2), ", isMigrateHeartRateRaiseRemind:", Boolean.valueOf(z3));
        int i = this.r;
        this.f24379b = i;
        if (z2 && i != 0) {
            HealthTextView healthTextView = this.ap;
            Resources resources = getResources();
            int i2 = R.string.IDS_heartrate_down_remind_explain_new;
            String quantityString = getResources().getQuantityString(R.plurals.sug_fitness_train_minutes, 10, 10);
            Resources resources2 = getResources();
            int i3 = R.plurals.IDS_heartrate_unit_string;
            int i4 = this.r;
            healthTextView.setText(resources.getString(i2, quantityString, resources2.getQuantityString(i3, i4, Integer.valueOf(i4))));
            String strB = qvm.b(this.r);
            this.t.setText(strB);
            c(this.ao, CommonUtil.n(BaseApplication.getContext(), strB));
            if (z) {
                c(1, this.r, true);
            }
        } else {
            this.ap.setText(getResources().getString(R.string.IDS_heartrate_down_remind_explain_disable_new, getResources().getString(R.string.IDS_hw_show_set_target_sport_time_unit, UnitUtil.e(10.0d, 1, 0))));
            this.ao.setText(R.string.IDS_settings_about_huawei_cloud_service_heartrate_turn_off);
            this.t.setText("");
            if (z) {
                c(0, 0, z3);
            } else if (z3 && (deviceCapabilityC = eej.c()) != null && deviceCapabilityC.isSupportHeartRateDownAlarm()) {
                this.x.setSwitchSetting("custom.heart_rate_down_remind", this.r + "", null);
                LogUtil.a("ContinueHeartRateSettingActivity", "update view by heart rate down");
            }
        }
        if (LanguageUtil.ba(BaseApplication.getContext())) {
            this.m.setBackgroundResource(R.drawable.common_ui_arrow_left);
        } else {
            this.m.setBackgroundResource(R.drawable.common_ui_arrow_right);
        }
    }

    private void b(int i, int i2, boolean z) {
        LogUtil.a("ContinueHeartRateSettingActivity", "openOrCloseHeartRateRaiseRemindEnable openOrClose: ", Integer.valueOf(i), " number: ", Integer.valueOf(i2));
        DeviceSettingsInteractors deviceSettingsInteractors = this.o;
        if (deviceSettingsInteractors == null) {
            LogUtil.j("ContinueHeartRateSettingActivity", "openOrCloseHeartRateRaiseRemindEnable mDeviceInteractors is null");
        } else {
            deviceSettingsInteractors.c(i, i2, z);
        }
    }

    private void c(int i, int i2, boolean z) {
        LogUtil.a("ContinueHeartRateSettingActivity", "openOrCloseHeartRateDownRemindEnable openOrClose: ", Integer.valueOf(i), " number: ", Integer.valueOf(i2));
        DeviceSettingsInteractors deviceSettingsInteractors = this.o;
        if (deviceSettingsInteractors == null) {
            LogUtil.j("ContinueHeartRateSettingActivity", "openOrCloseHeartRateDownRemindEnable mDeviceInteractors is null");
        } else {
            deviceSettingsInteractors.e(i, i2, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        this.am.clear();
        this.u.clear();
        ReleaseLogUtil.d("DEVMGR_ContinueHeartRateSettingActivity", "showDialog()");
        LayoutInflater layoutInflater = getSystemService("layout_inflater") instanceof LayoutInflater ? (LayoutInflater) getSystemService("layout_inflater") : null;
        if (layoutInflater != null) {
            View viewInflate = layoutInflater.inflate(R.layout.hw_show_setting_heart_reate_rasise_remind, (ViewGroup) null);
            d(viewInflate);
            CustomAlertDialog.Builder builder = new CustomAlertDialog.Builder(this);
            builder.b(getString(com.huawei.ui.main.R.string.IDS_heartrate_raise_remind)).a(viewInflate).d(com.huawei.ui.main.R.string.IDS_hw_common_ui_dialog_confirm, new DialogInterface.OnClickListener() { // from class: com.huawei.ui.device.activity.heartrate.ContinueHeartRateSettingActivity.5
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    LogUtil.a("ContinueHeartRateSettingActivity", "dialog set positive");
                    ContinueHeartRateSettingActivity continueHeartRateSettingActivity = ContinueHeartRateSettingActivity.this;
                    continueHeartRateSettingActivity.v = continueHeartRateSettingActivity.f24380c;
                    ContinueHeartRateSettingActivity.this.b(true, true, true);
                }
            }).a(com.huawei.ui.main.R.string.IDS_hw_show_cancel, new DialogInterface.OnClickListener() { // from class: com.huawei.ui.device.activity.heartrate.ContinueHeartRateSettingActivity.14
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    LogUtil.a("ContinueHeartRateSettingActivity", "dialog set negative");
                }
            });
            CustomAlertDialog customAlertDialogB = builder.b();
            customAlertDialogB.setCancelable(false);
            customAlertDialogB.show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        this.an.clear();
        this.ac.clear();
        ReleaseLogUtil.d("DEVMGR_ContinueHeartRateSettingActivity", "showDialogDownRate()");
        LayoutInflater layoutInflater = getSystemService("layout_inflater") instanceof LayoutInflater ? (LayoutInflater) getSystemService("layout_inflater") : null;
        if (layoutInflater != null) {
            View viewInflate = layoutInflater.inflate(R.layout.hw_show_setting_heart_reate_down_remind, (ViewGroup) null);
            e(viewInflate);
            CustomAlertDialog.Builder builder = new CustomAlertDialog.Builder(this);
            builder.b(getString(com.huawei.ui.main.R.string.IDS_heartrate_down_remind)).a(viewInflate).d(com.huawei.ui.main.R.string.IDS_hw_common_ui_dialog_confirm, new DialogInterface.OnClickListener() { // from class: com.huawei.ui.device.activity.heartrate.ContinueHeartRateSettingActivity.3
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    LogUtil.a("ContinueHeartRateSettingActivity", "dialog set positive");
                    ContinueHeartRateSettingActivity continueHeartRateSettingActivity = ContinueHeartRateSettingActivity.this;
                    continueHeartRateSettingActivity.r = continueHeartRateSettingActivity.f24379b;
                    ContinueHeartRateSettingActivity.this.a(true, true, true);
                }
            }).a(com.huawei.ui.main.R.string.IDS_hw_show_cancel, new DialogInterface.OnClickListener() { // from class: com.huawei.ui.device.activity.heartrate.ContinueHeartRateSettingActivity.2
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    LogUtil.a("ContinueHeartRateSettingActivity", "dialog set negative");
                }
            });
            CustomAlertDialog customAlertDialogB = builder.b();
            customAlertDialogB.setCancelable(false);
            customAlertDialogB.show();
        }
    }

    private void c(HealthTextView healthTextView, int i) {
        healthTextView.setText(getResources().getQuantityString(R.plurals.IDS_heartrate_unit_string, i, Integer.valueOf(i)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i) {
        ReleaseLogUtil.d("DEVMGR_ContinueHeartRateSettingActivity", "Enter updateContinueHighItemDrawable");
        for (Map.Entry<Integer, HealthRadioButton> entry : this.u.entrySet()) {
            entry.getValue().setChecked(i == entry.getKey().intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i) {
        ReleaseLogUtil.d("DEVMGR_ContinueHeartRateSettingActivity", "Enter updateItemSelectButtonDrawableDownRate");
        for (Map.Entry<Integer, HealthRadioButton> entry : this.ac.entrySet()) {
            entry.getValue().setChecked(i == entry.getKey().intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i) {
        for (Map.Entry<Integer, ImageView> entry : this.aa.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            ImageView value = entry.getValue();
            if (i == iIntValue) {
                value.setImageResource(com.huawei.ui.main.R.drawable.btn_health_list_radio_sel);
            } else {
                value.setImageResource(com.huawei.ui.main.R.drawable.btn_health_list_radio_nor);
            }
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.u.clear();
        this.am.clear();
        this.ak.clear();
        this.aa.clear();
        CommonUtil.d(this);
    }

    private void d(View view) {
        c((HealthTextView) qsp.a(view, R.id.tv_100), 100);
        c((HealthTextView) qsp.a(view, R.id.tv_110), 110);
        c((HealthTextView) qsp.a(view, R.id.tv_120), 120);
        c((HealthTextView) qsp.a(view, R.id.tv_130), 130);
        c((HealthTextView) qsp.a(view, R.id.tv_140), 140);
        c((HealthTextView) qsp.a(view, R.id.tv_150), 150);
        RelativeLayout relativeLayout = (RelativeLayout) qsp.a(view, R.id.rl_close);
        this.am.put(0, relativeLayout);
        this.u.put(0, (HealthRadioButton) qsp.a(view, R.id.iv_close));
        RelativeLayout relativeLayout2 = (RelativeLayout) qsp.a(view, R.id.rl_100);
        this.am.put(100, relativeLayout2);
        this.u.put(100, (HealthRadioButton) qsp.a(view, R.id.iv_100));
        RelativeLayout relativeLayout3 = (RelativeLayout) qsp.a(view, R.id.rl_110);
        this.am.put(110, relativeLayout3);
        this.u.put(110, (HealthRadioButton) qsp.a(view, R.id.iv_110));
        RelativeLayout relativeLayout4 = (RelativeLayout) qsp.a(view, R.id.rl_120);
        this.am.put(120, relativeLayout4);
        this.u.put(120, (HealthRadioButton) qsp.a(view, R.id.iv_120));
        RelativeLayout relativeLayout5 = (RelativeLayout) qsp.a(view, R.id.rl_130);
        this.am.put(130, relativeLayout5);
        this.u.put(130, (HealthRadioButton) qsp.a(view, R.id.iv_130));
        RelativeLayout relativeLayout6 = (RelativeLayout) qsp.a(view, R.id.rl_140);
        this.am.put(140, relativeLayout6);
        this.u.put(140, (HealthRadioButton) qsp.a(view, R.id.iv_140));
        RelativeLayout relativeLayout7 = (RelativeLayout) qsp.a(view, R.id.rl_150);
        this.am.put(150, relativeLayout7);
        this.u.put(150, (HealthRadioButton) qsp.a(view, R.id.iv_150));
        relativeLayout.setOnClickListener(this.k);
        relativeLayout2.setOnClickListener(this.k);
        relativeLayout3.setOnClickListener(this.k);
        relativeLayout4.setOnClickListener(this.k);
        relativeLayout5.setOnClickListener(this.k);
        relativeLayout6.setOnClickListener(this.k);
        relativeLayout7.setOnClickListener(this.k);
        c(this.v);
    }

    private void e(View view) {
        c((HealthTextView) qsp.a(view, R.id.tv_50), 50);
        c((HealthTextView) qsp.a(view, R.id.tv_45), 45);
        c((HealthTextView) qsp.a(view, R.id.tv_40), 40);
        RelativeLayout relativeLayout = (RelativeLayout) qsp.a(view, R.id.rl_close);
        this.an.put(0, relativeLayout);
        this.ac.put(0, (HealthRadioButton) qsp.a(view, R.id.iv_close));
        RelativeLayout relativeLayout2 = (RelativeLayout) qsp.a(view, R.id.rl_50);
        this.an.put(50, relativeLayout2);
        this.ac.put(50, (HealthRadioButton) qsp.a(view, R.id.iv_50));
        RelativeLayout relativeLayout3 = (RelativeLayout) qsp.a(view, R.id.rl_45);
        this.an.put(45, relativeLayout3);
        this.ac.put(45, (HealthRadioButton) qsp.a(view, R.id.iv_45));
        RelativeLayout relativeLayout4 = (RelativeLayout) qsp.a(view, R.id.rl_40);
        this.an.put(40, relativeLayout4);
        this.ac.put(40, (HealthRadioButton) qsp.a(view, R.id.iv_40));
        relativeLayout.setOnClickListener(this.l);
        relativeLayout2.setOnClickListener(this.l);
        relativeLayout3.setOnClickListener(this.l);
        relativeLayout4.setOnClickListener(this.l);
        e(this.r);
    }

    private void b(int i) {
        LogUtil.a("ContinueHeartRateSettingActivity", "heart rate lqm init choice choice key is ", Integer.valueOf(i));
        this.af = (RelativeLayout) qsp.a(this, R.id.radio_heart_rate_auto_measurement);
        this.d = (HealthTextView) qsp.a(this, R.id.tv_heart_rate_auto_measurement);
        this.f24378a = (ImageView) qsp.a(this, R.id.iv_heart_rate_auto_measurement);
        this.e = (HealthTextView) qsp.a(this, R.id.tv_heart_rate_auto_measurement_detail);
        this.ah = (RelativeLayout) qsp.a(this, R.id.radio_heart_rate_cycle_measurement);
        this.n = (HealthTextView) qsp.a(this, R.id.tv_heart_rate_cycle_measurement);
        this.g = (ImageView) qsp.a(this, R.id.iv_heart_rate_cycle_measurement);
        this.f = (HealthTextView) qsp.a(this, R.id.tv_heart_rate_cycle_measurement_detail);
        this.p = (HealthSubHeader) qsp.a(this, R.id.subheader_heart_rate_measurement);
        this.ab = (LinearLayout) qsp.a(this, R.id.settings_heart_rate_layout);
        this.w = (HealthTextView) qsp.a(this, R.id.heart_rate_tv_sub);
        ViewGroup.LayoutParams layoutParams = this.ab.getLayoutParams();
        if (i == 3) {
            this.ab.setLayoutParams(layoutParams);
            d();
        } else {
            this.ab.setLayoutParams(layoutParams);
            a(i);
        }
    }

    private int b(String str) {
        return BaseApplication.getContext().getSharedPreferences("heartRateChoiceSP", 0).getInt(str, -1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str, int i) {
        SharedPreferences.Editor editorEdit = BaseApplication.getContext().getSharedPreferences("heartRateChoiceSP", 0).edit();
        editorEdit.putInt(str, i);
        editorEdit.apply();
    }

    private void a(int i, boolean z) {
        if (z) {
            if (i == 0) {
                this.f24378a.setImageResource(com.huawei.ui.main.R.drawable.btn_health_list_radio_sel);
                this.g.setImageResource(com.huawei.ui.main.R.drawable.btn_health_list_radio_nor);
                return;
            } else if (i != 1) {
                LogUtil.d("ContinueHeartRateSettingActivity", "isHeartRateSwitchChecked not get heart rate choice");
                return;
            } else {
                this.f24378a.setImageResource(com.huawei.ui.main.R.drawable.btn_health_list_radio_nor);
                this.g.setImageResource(com.huawei.ui.main.R.drawable.btn_health_list_radio_sel);
                return;
            }
        }
        if (i == 0) {
            this.f24378a.setImageResource(com.huawei.ui.main.R.drawable.btn_radio_select_dissable);
            this.g.setImageResource(com.huawei.ui.main.R.drawable.btn_radio_off_dissable);
        } else if (i != 1) {
            LogUtil.d("ContinueHeartRateSettingActivity", "!isHeartRateSwitchChecked not get heart rate choice");
        } else {
            this.f24378a.setImageResource(com.huawei.ui.main.R.drawable.btn_radio_off_dissable);
            this.g.setImageResource(com.huawei.ui.main.R.drawable.btn_radio_select_dissable);
        }
    }

    private void d(int i, boolean z) {
        if (this.af.getVisibility() == 0) {
            if (i == -1 || i == 0) {
                LogUtil.a("ContinueHeartRateSettingActivity", "init click continue click");
                a(0, z);
            } else if (i != 1) {
                LogUtil.d("ContinueHeartRateSettingActivity", "updateSwitchStatus not get heart rate choice");
            } else {
                LogUtil.a("ContinueHeartRateSettingActivity", "init cycle continue click");
                a(1, z);
            }
        }
    }

    private void a(boolean z) {
        if (!z) {
            this.ah.setOnClickListener(null);
            this.af.setOnClickListener(null);
            this.ah.setEnabled(false);
            this.af.setEnabled(false);
            return;
        }
        this.af.setOnClickListener(this.ag);
        this.ah.setOnClickListener(this.ag);
        this.ah.setEnabled(true);
        this.af.setEnabled(true);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private void e(boolean z, rax raxVar) {
        LogUtil.a("ContinueHeartRateSettingActivity", "sendHearRateMeasureCommand onCheckedChanged: ", Boolean.valueOf(z));
        this.af.setEnabled(z);
        this.ah.setEnabled(z);
        boolean zC = raxVar.c();
        int iB = raxVar.b();
        if (iB == 0) {
            LogUtil.a("ContinueHeartRateSettingActivity", "send continue heart rate ", Integer.valueOf(zC ? 1 : 0));
            DeviceSettingsInteractors deviceSettingsInteractors = this.o;
            if (deviceSettingsInteractors != null) {
                deviceSettingsInteractors.c(zC ? 1 : 0);
            } else {
                LogUtil.j("ContinueHeartRateSettingActivity", "sendHearRateMeasureCommand support continue, mDeviceInteractors is null");
            }
            h(zC ? 1 : 0);
            return;
        }
        if (iB == 1) {
            LogUtil.a("ContinueHeartRateSettingActivity", "send cycle heart rate ", Integer.valueOf(zC ? 1 : 0));
            DeviceSettingsInteractors deviceSettingsInteractors2 = this.o;
            if (deviceSettingsInteractors2 != null) {
                deviceSettingsInteractors2.a(zC ? 1 : 0);
            } else {
                LogUtil.j("ContinueHeartRateSettingActivity", "sendHearRateMeasureCommand support cycle, mDeviceInteractors is null");
            }
            h(zC ? 1 : 0);
            return;
        }
        LogUtil.d("ContinueHeartRateSettingActivity", "sendHearRateMeasureCommand not get heart rate choice");
    }

    private void d() {
        this.af.setVisibility(0);
        this.d.setVisibility(0);
        this.f24378a.setVisibility(0);
        this.e.setVisibility(0);
        this.ah.setVisibility(0);
        this.n.setVisibility(0);
        this.g.setVisibility(0);
        this.f.setVisibility(0);
        this.ak.put(0, this.af);
        this.ak.put(1, this.ah);
        this.aa.put(0, this.f24378a);
        this.aa.put(1, this.g);
        this.af.setOnClickListener(this.ag);
        this.ah.setOnClickListener(this.ag);
        this.w.setVisibility(8);
        this.p.setVisibility(0);
        String string = getResources().getString(R.string.IDS_hwh_motiontrack_intelligent_explain);
        String string2 = getResources().getString(R.string.IDS_hwh_motiontrack_realtime_explain);
        String strB = qvm.b(24);
        this.e.setText(String.format(string2, Integer.valueOf(CommonUtil.n(BaseApplication.getContext(), strB))));
        this.f.setText(String.format(string, Integer.valueOf(CommonUtil.n(BaseApplication.getContext(), strB))));
    }

    private void a(int i) {
        this.af.setVisibility(8);
        this.af.setEnabled(false);
        this.d.setVisibility(8);
        this.f24378a.setVisibility(8);
        this.e.setVisibility(8);
        this.ah.setVisibility(8);
        this.ah.setEnabled(false);
        this.n.setVisibility(8);
        this.g.setVisibility(8);
        this.f.setVisibility(8);
        this.p.setVisibility(8);
        this.w.setVisibility(0);
        if (i == 0) {
            this.w.setText(String.format(getResources().getString(R.string.IDS_hwh_motiontrack_monitor_heart_rate_realtime), 24));
        } else if (i == 1) {
            this.w.setText(String.format(getResources().getString(R.string.IDS_hwh_motiontrack_dynamically_adjust_measurement), 24));
        } else {
            this.w.setVisibility(8);
            this.w.setText("");
        }
    }

    private void e() {
        String string;
        String string2;
        String string3;
        DeviceSettingsInteractors deviceSettingsInteractors = this.o;
        if (deviceSettingsInteractors == null) {
            LogUtil.j("ContinueHeartRateSettingActivity", "initTipText mDeviceInteractors is null");
            return;
        }
        DeviceInfo deviceInfoE = deviceSettingsInteractors.e();
        if (deviceInfoE == null) {
            LogUtil.j("ContinueHeartRateSettingActivity", "refresh dialog Support deviceInfo is null , return");
            return;
        }
        if (!lvi.f(deviceInfoE.getProductType())) {
            LogUtil.a("ContinueHeartRateSettingActivity", "WATCH PRODUCT");
            string = getResources().getString(R.string.IDS_settings_continue_HeartRate_explain_watch);
            string2 = getResources().getString(R.string.IDS_Settings_heart_rate_watch_tip);
            string3 = getResources().getString(R.string.IDS_hwh_motiontrack_device_using_tips);
            this.y.setImageResource(R.drawable.home_set_rate_watch_remider_image);
        } else {
            string = getResources().getString(R.string.IDS_settings_continue_HeartRate_explain_wristband);
            string2 = getResources().getString(R.string.IDS_Settings_heart_rate_band_tip);
            string3 = getResources().getString(R.string.IDS_hwh_motiontrack_band_using_tips);
            this.y.setImageResource(R.drawable.home_set_rate_band_remider_image);
        }
        String string4 = getResources().getString(R.string.IDS_Settings_continue_heart_rate_watch_or_band_tip);
        String string5 = getResources().getString(R.string.IDS_hwh_motiontrack_default_heart_rate_measurement_explain);
        this.j.setText(String.format(string, 24));
        this.ax.setText(String.format(string2, 1));
        this.az.setText(String.format(string4, 2));
        this.bc.setText(String.format(string3, 3));
        this.ba.setText(String.format(string5, 4));
    }

    private void a(boolean z, int i) {
        rax raxVar = new rax();
        raxVar.c(z);
        raxVar.c(i);
        boolean zC = raxVar.c();
        e(z, raxVar);
        LogUtil.a("ContinueHeartRateSettingActivity", "isOpenHeartRateMeasure is ", Boolean.valueOf(zC));
        a(zC);
        int iB = raxVar.b();
        if (this.af.getVisibility() == 0) {
            a(iB, zC);
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
