package com.huawei.ui.main.stories.settings.fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioGroup;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwcommonmodel.fitnessdatatype.HeartRateThresholdConfig;
import com.huawei.hwcommonmodel.fitnessdatatype.HeartRateZoneMgr;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.operation.OperationKey;
import com.huawei.ui.commonui.base.BaseFragment;
import com.huawei.ui.commonui.divider.HealthDivider;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.radiobutton.HealthRadioButton;
import com.huawei.ui.commonui.switchbutton.HealthSwitchButton;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.settings.activity.heartrate.HeartRateSectionActivity;
import defpackage.lmf;
import defpackage.lsy;
import defpackage.nkd;
import defpackage.qrs;
import defpackage.qsp;
import defpackage.wly;
import defpackage.wma;
import health.compact.a.LanguageUtil;
import health.compact.a.LogUtil;
import health.compact.a.UnitUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes19.dex */
public class BaseHeartRateZoneFragment extends BaseFragment implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthTextView f28829a;
    private HealthRadioButton ac;
    private HealthTextView ae;
    private HealthTextView ag;
    private IBaseResponseCallback ah;
    private HealthRadioButton aj;
    private HealthTextView ak;
    private HealthTextView am;
    private HealthTextView ao;
    private HealthTextView aq;
    private HealthTextView as;
    private HealthSwitchButton at;
    private String au;
    private View av;
    private int ax;
    private HealthTextView ay;
    private HealthTextView az;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthTextView f28830b;
    private HealthTextView bb;
    private HealthTextView e;
    private HealthTextView f;
    private HealthTextView g;
    private HealthTextView i;
    private HealthTextView k;
    private HealthTextView l;
    private HealthTextView m;
    private HealthTextView n;
    private HealthDivider p;
    private HealthTextView s;
    private Context t;
    private HeartRateThresholdConfig u;
    private HealthTextView w;
    private HealthTextView x;
    private HealthTextView y;
    private int ar = 60;
    private boolean r = true;
    private int aw = 195;
    private int al = 195;
    private int ai = 176;
    private float af = 90.0f;
    private int h = 156;
    private float j = 80.0f;
    private int d = 137;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f28831c = 70.0f;
    private int an = 117;
    private float ap = 60.0f;
    private int bc = 98;
    private float ba = 50.0f;
    private float z = 95.0f;
    private float aa = 88.0f;
    private float ad = 84.0f;
    private float ab = 74.0f;
    private float v = 59.0f;
    private int o = 0;
    private Handler q = new c(this);

    public BaseHeartRateZoneFragment() {
    }

    public BaseHeartRateZoneFragment(int i, IBaseResponseCallback iBaseResponseCallback) {
        this.ax = i;
        this.au = "BaseHeartRateZoneFragment" + i;
        this.ah = iBaseResponseCallback;
    }

    static class c extends BaseHandler<BaseHeartRateZoneFragment> {
        c(BaseHeartRateZoneFragment baseHeartRateZoneFragment) {
            super(baseHeartRateZoneFragment);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(BaseHeartRateZoneFragment baseHeartRateZoneFragment, Message message) {
            int i = message.what;
            if (i == 7) {
                baseHeartRateZoneFragment.b();
            } else if (i == 8) {
                baseHeartRateZoneFragment.c();
                return;
            } else if (i == 4368) {
                BaseHeartRateZoneFragment.e(baseHeartRateZoneFragment, message);
            }
            baseHeartRateZoneFragment.a(false);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == null) {
            return;
        }
        if (qrs.c(600)) {
            LogUtil.d(this.au, "CLICK IS FAST");
            return;
        }
        if (R.id.upper_limit_layout == view.getId()) {
            o();
        }
        if (R.id.heart_rate_reserve_layout == view.getId()) {
            e(this.ax, 1);
            return;
        }
        if (R.id.max_heart_rate_layout == view.getId()) {
            e(this.ax, 0);
        } else if (R.id.advance_settings_tv == view.getId()) {
            d();
        } else {
            LogUtil.b(this.au, "onClick else");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (this.av == null) {
            LogUtil.b("BaseHeartRateZoneFragment", "onCreateView");
            if (qrs.v()) {
                this.av = layoutInflater.inflate(R.layout.activity_heart_rate_zone_setting_fitolder, viewGroup, false);
            } else {
                this.av = layoutInflater.inflate(R.layout.activity_heart_rate_zone_setting_new, viewGroup, false);
            }
            this.t = getActivity();
            l();
            e();
            i();
        }
        return this.av;
    }

    public void e() {
        this.u = nkd.c().a().getPostureType(this.ax);
        e(this.ax);
        this.at.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.huawei.ui.main.stories.settings.fragment.BaseHeartRateZoneFragment.5
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                BaseHeartRateZoneFragment.this.r = z;
                if (BaseHeartRateZoneFragment.this.a()) {
                    nkd.c().a(false, BaseHeartRateZoneFragment.this.ax, BaseHeartRateZoneFragment.this.r, BaseHeartRateZoneFragment.this.aw, BaseHeartRateZoneFragment.this.al, BaseHeartRateZoneFragment.this.ai, BaseHeartRateZoneFragment.this.h, BaseHeartRateZoneFragment.this.d, BaseHeartRateZoneFragment.this.an, BaseHeartRateZoneFragment.this.bc);
                } else {
                    nkd.c().e(false, BaseHeartRateZoneFragment.this.ax, BaseHeartRateZoneFragment.this.r, BaseHeartRateZoneFragment.this.aw, BaseHeartRateZoneFragment.this.al, BaseHeartRateZoneFragment.this.ai, BaseHeartRateZoneFragment.this.h, BaseHeartRateZoneFragment.this.d, BaseHeartRateZoneFragment.this.an, BaseHeartRateZoneFragment.this.bc);
                }
                if (z) {
                    BaseHeartRateZoneFragment.this.a(AnalyticsValue.HEALTH_HEART_RATE_INTERVAL_WARNING_2090001.value(), "1");
                } else {
                    BaseHeartRateZoneFragment.this.a(AnalyticsValue.HEALTH_HEART_RATE_INTERVAL_WARNING_2090001.value(), "2");
                }
            }
        });
    }

    public void i() {
        lsy.a(new Runnable() { // from class: com.huawei.ui.main.stories.settings.fragment.BaseHeartRateZoneFragment.1
            @Override // java.lang.Runnable
            public void run() {
                HeartRateZoneMgr heartRateZoneMgrA = nkd.c().a();
                BaseHeartRateZoneFragment baseHeartRateZoneFragment = BaseHeartRateZoneFragment.this;
                baseHeartRateZoneFragment.o = heartRateZoneMgrA.getPostureType(baseHeartRateZoneFragment.ax).getClassifyMethod();
                BaseHeartRateZoneFragment baseHeartRateZoneFragment2 = BaseHeartRateZoneFragment.this;
                baseHeartRateZoneFragment2.ar = heartRateZoneMgrA.getPostureType(baseHeartRateZoneFragment2.ax).getRestHeartRate();
                LogUtil.b(BaseHeartRateZoneFragment.this.au, "mClassifyMethod = ", Integer.valueOf(BaseHeartRateZoneFragment.this.o), " mRestHeartRateCount = ", Integer.valueOf(BaseHeartRateZoneFragment.this.ar));
                BaseHeartRateZoneFragment.this.q.sendEmptyMessage(8);
            }
        });
    }

    public void c() {
        b();
        int iA = nkd.c().a(this.ax);
        LogUtil.b(this.au, "old maxHeartRateValue ", Integer.valueOf(iA));
        c(iA);
        d(iA);
        if (a()) {
            h();
        } else {
            f();
        }
        g();
        a(false);
    }

    public void b() {
        if (a()) {
            this.r = this.u.getWarningEnable();
            this.aw = this.u.getWarningLimit();
            this.al = this.u.getMaxThreshold();
            this.ai = this.u.getAnaerobicThreshold();
            this.h = this.u.getAerobicThreshold();
            this.d = this.u.getFatBurnThreshold();
            this.an = this.u.getWarmUpThreshold();
            this.bc = this.u.getFitnessThreshold();
        } else {
            this.r = this.u.getWarningEnable();
            this.aw = this.u.getWarningLimit();
            this.al = this.u.getMaxThreshold();
            this.ai = this.u.getAnaerobicAdvanceThreshold();
            this.h = this.u.getAnaerobicBaseThreshold();
            this.d = this.u.getLacticAcidThreshold();
            this.an = this.u.getAerobicAdvanceThreshold();
            this.bc = this.u.getAerobicBaseThreshold();
        }
        LogUtil.b(this.au, "initData mHasMaxAlarm:", Boolean.valueOf(this.r), ", mUpLimit = ", Integer.valueOf(this.aw), ",mMaxCount = ", Integer.valueOf(this.al), ",mLimitCount = ", Integer.valueOf(this.ai), ", mAnaerobic= ", Integer.valueOf(this.h), ", mAerobic= ", Integer.valueOf(this.d), ",mReduceFat= ", Integer.valueOf(this.an), ",mWarmUp = ", Integer.valueOf(this.bc));
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.ah.a(0, true);
        if (intent == null) {
            LogUtil.d(this.au, "onActivityResult data is null");
            return;
        }
        LogUtil.b(this.au, "onActivityResult requestCode = ", Integer.valueOf(i));
        if (i2 == 3 && i == 110) {
            e(intent, 5, "maxHeartValue");
            e(intent, 4, "heartRateZone1");
            e(intent, 3, "heartRateZone2");
            e(intent, 2, "heartRateZone3");
            e(intent, 1, "heartRateZone4");
            e(intent, 0, "heartRateZone5");
            boolean booleanExtra = intent.getBooleanExtra("intent_extra_other_heart_rate_change", false);
            boolean booleanExtra2 = intent.getBooleanExtra("intent_extra_max_heart_rate_change", false);
            if (a()) {
                if (booleanExtra2) {
                    g();
                }
                if (booleanExtra || !booleanExtra2) {
                    nkd.c().a(false, this.ax, this.r, this.aw, this.al, this.ai, this.h, this.d, this.an, this.bc);
                }
            } else {
                e(intent, 6, "intent_extra_hrr_heart_rate");
                nkd.c().d(false, this.ax, this.ar);
                if (booleanExtra2) {
                    g();
                }
                if (booleanExtra || !booleanExtra2) {
                    nkd.c().e(false, this.ax, this.r, this.aw, this.al, this.ai, this.h, this.d, this.an, this.bc);
                }
            }
            e(intent);
            a(true);
        }
    }

    private void e(Intent intent) {
        if (a()) {
            this.af = intent.getFloatExtra("heartRatePercent1", this.af);
            this.j = intent.getFloatExtra("heartRatePercent2", this.j);
            this.f28831c = intent.getFloatExtra("heartRatePercent3", this.f28831c);
            this.ap = intent.getFloatExtra("heartRatePercent4", this.ap);
            this.ba = intent.getFloatExtra("heartRatePercent5", this.ba);
            return;
        }
        this.z = intent.getFloatExtra("heartRatePercent1", this.z);
        this.aa = intent.getFloatExtra("heartRatePercent2", this.aa);
        this.ad = intent.getFloatExtra("heartRatePercent3", this.ad);
        this.ab = intent.getFloatExtra("heartRatePercent4", this.ab);
        this.v = intent.getFloatExtra("heartRatePercent5", this.v);
    }

    private void e(Intent intent, int i, String str) {
        try {
            a(i, intent.getIntExtra(str, -1));
        } catch (NumberFormatException unused) {
            LogUtil.d(this.au, "dealWithOnResultData NumberFormatException");
        }
    }

    private void a(int i, int i2) {
        LogUtil.b(this.au, "setRangValue index= ", Integer.valueOf(i), "  value= ", Integer.valueOf(i2));
        switch (i) {
            case 0:
                this.bc = i2;
                break;
            case 1:
                this.an = i2;
                break;
            case 2:
                this.d = i2;
                break;
            case 3:
                this.h = i2;
                break;
            case 4:
                this.ai = i2;
                break;
            case 5:
                this.al = i2;
                break;
            case 6:
                this.ar = i2;
                break;
        }
    }

    public void c(int i) {
        if (!a()) {
            int i2 = this.ar;
            int i3 = i - i2;
            if (i3 == 0) {
                LogUtil.e(this.au, "updateUiPercent reserve is zero");
                return;
            }
            float f = i3;
            this.z = ((this.ai - i2) * 100) / f;
            this.aa = ((this.h - i2) * 100) / f;
            this.ad = ((this.d - i2) * 100) / f;
            this.ab = ((this.an - i2) * 100) / f;
            float f2 = ((this.bc - i2) * 100) / f;
            this.v = f2;
            if (f2 < 30.0f) {
                this.v = 30.0f;
            }
        } else {
            if (i == 0) {
                LogUtil.e(this.au, "updateUiPercent maxHeartRateValue is zero");
                return;
            }
            float f3 = i;
            this.af = (this.ai * 100) / f3;
            this.j = (this.h * 100) / f3;
            this.f28831c = (this.d * 100) / f3;
            this.ap = (this.an * 100) / f3;
            float f4 = (this.bc * 100) / f3;
            this.ba = f4;
            if (f4 < 30.0f) {
                this.ba = 30.0f;
            }
        }
        LogUtil.b(this.au, "updateUiPercent LimitPercent = ", Float.valueOf(this.af), ", AnaerobicPercent = ", Float.valueOf(this.j), ", AerobicPercent = ", Float.valueOf(this.f28831c), ", ReduceFatPercent = ", Float.valueOf(this.ap), ", WarmUpPercent = ", Float.valueOf(this.ba));
    }

    public void g() {
        int iRound = Math.round((this.al * this.af) / 100.0f);
        int iRound2 = Math.round((this.al * this.j) / 100.0f);
        int iRound3 = Math.round((this.al * this.f28831c) / 100.0f);
        int iRound4 = Math.round((this.al * this.ap) / 100.0f);
        int iRound5 = Math.round((this.al * this.ba) / 100.0f);
        nkd.c().a(false, this.ax, this.r, this.aw, this.al, iRound, iRound2, iRound3, iRound4, iRound5);
        LogUtil.b(this.au, "updateHeartZoneDataConfig mHasMaxAlarm = ", Boolean.valueOf(this.r), ", mUpLimit", Integer.valueOf(this.aw), ",mMaxCount = ", Integer.valueOf(this.al), ", limit = ", Integer.valueOf(iRound), ",mAnaerobic = ", Integer.valueOf(iRound2), ",mAerobic = ", Integer.valueOf(iRound3), ",mReduceFat = ", Integer.valueOf(iRound4), ", warmUp = ", Integer.valueOf(iRound5));
        float f = this.al - this.ar;
        int iRound6 = Math.round((this.z * f) / 100.0f) + this.ar;
        int iRound7 = Math.round((this.aa * f) / 100.0f) + this.ar;
        int iRound8 = Math.round((this.ad * f) / 100.0f) + this.ar;
        int iRound9 = Math.round((this.ab * f) / 100.0f) + this.ar;
        int iRound10 = Math.round((f * this.v) / 100.0f) + this.ar;
        nkd.c().e(false, this.ax, this.r, this.aw, this.al, iRound6, iRound7, iRound8, iRound9, iRound10);
        LogUtil.b(this.au, "updateHeartZoneDataConfig mHasMaxAlarm = ", Boolean.valueOf(this.r), ", mUpLimit", Integer.valueOf(this.aw), ", mMaxCount = ", Integer.valueOf(this.al), ", limit = ", Integer.valueOf(iRound6), ", mAnaerobic = ", Integer.valueOf(iRound7), ", mAerobic = ", Integer.valueOf(iRound8), ",mReduceFat = ", Integer.valueOf(iRound9), ", warmUp = ", Integer.valueOf(iRound10));
    }

    private void l() {
        this.s = (HealthTextView) qsp.a(this.av, R.id.heart_gesture_introduction);
        this.p = (HealthDivider) qsp.a(this.av, R.id.heart_rate_introduction_divider);
        this.s.setVisibility(0);
        this.p.setVisibility(0);
        HealthSwitchButton healthSwitchButton = (HealthSwitchButton) qsp.a(this.av, R.id.max_heart_alarm_switch_button);
        this.at = healthSwitchButton;
        healthSwitchButton.setVisibility(8);
        qsp.a(this.av, R.id.upper_limit_layout).setOnClickListener(this);
        this.x = (HealthTextView) qsp.a(this.av, R.id.upper_limit_textview);
        this.w = (HealthTextView) qsp.a(this.av, R.id.upper_limit_heart_rate_desc);
        this.aj = (HealthRadioButton) qsp.a(this.av, R.id.max_heart_rate_radio_button);
        this.ac = (HealthRadioButton) qsp.a(this.av, R.id.heart_rate_reserve_radio_button);
        qsp.a(this.av, R.id.heart_rate_reserve_layout).setOnClickListener(this);
        ((RadioGroup) qsp.a(this.av, R.id.layout_radio_group)).setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: com.huawei.ui.main.stories.settings.fragment.BaseHeartRateZoneFragment.2
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.max_heart_rate_radio_button) {
                    BaseHeartRateZoneFragment baseHeartRateZoneFragment = BaseHeartRateZoneFragment.this;
                    baseHeartRateZoneFragment.e(baseHeartRateZoneFragment.ax, 0);
                } else {
                    BaseHeartRateZoneFragment baseHeartRateZoneFragment2 = BaseHeartRateZoneFragment.this;
                    baseHeartRateZoneFragment2.e(baseHeartRateZoneFragment2.ax, 1);
                }
            }
        });
        m();
    }

    private void m() {
        this.y = (HealthTextView) qsp.a(this.av, R.id.heart_rate_describe);
        qsp.a(this.av, R.id.advance_settings_tv).setOnClickListener(this);
        this.k = (HealthTextView) qsp.a(this.av, R.id.zone_name1);
        this.f = (HealthTextView) qsp.a(this.av, R.id.zone_name2);
        this.ag = (HealthTextView) qsp.a(this.av, R.id.zone_name3);
        this.f28830b = (HealthTextView) qsp.a(this.av, R.id.zone_name4);
        this.f28829a = (HealthTextView) qsp.a(this.av, R.id.zone_name5);
        this.ae = (HealthTextView) qsp.a(this.av, R.id.text_view_limit);
        this.am = (HealthTextView) qsp.a(this.av, R.id.text_limit_unit);
        this.ak = (HealthTextView) qsp.a(this.av, R.id.heart_zone_percent_01);
        this.n = (HealthTextView) qsp.a(this.av, R.id.text_view_anaerobic);
        this.l = (HealthTextView) qsp.a(this.av, R.id.text_anaerobic_unit);
        this.m = (HealthTextView) qsp.a(this.av, R.id.heart_zone_percent_02);
        this.e = (HealthTextView) qsp.a(this.av, R.id.text_view_aerobic);
        this.g = (HealthTextView) qsp.a(this.av, R.id.text_aerobic_unit);
        this.i = (HealthTextView) qsp.a(this.av, R.id.heart_zone_percent_03);
        this.aq = (HealthTextView) qsp.a(this.av, R.id.text_view_reduce_fat);
        this.ao = (HealthTextView) qsp.a(this.av, R.id.text_reduce_fat_unit);
        this.as = (HealthTextView) qsp.a(this.av, R.id.heart_zone_percent_04);
        this.ay = (HealthTextView) qsp.a(this.av, R.id.text_view_warm_up);
        this.az = (HealthTextView) qsp.a(this.av, R.id.text_warm_up_unit);
        this.bb = (HealthTextView) qsp.a(this.av, R.id.heart_zone_percent_05);
        if (LanguageUtil.ba(BaseApplication.getContext())) {
            ((ImageView) qsp.a(this.av, R.id.upper_limit_enter_ic)).setImageResource(R.drawable.common_ui_arrow_left);
        }
        k();
        qsp.a(this.av, R.id.max_heart_rate_layout).setOnClickListener(this);
    }

    private void k() {
        if (LanguageUtil.aj(BaseApplication.getContext())) {
            this.am.setText(b(this.ai, this.al, 1));
            this.l.setText(b(this.h, this.ai - 1, 1));
            this.g.setText(b(this.d, this.h - 1, 1));
            this.ao.setText(b(this.an, this.d - 1, 1));
            this.az.setText(b(this.bc, this.an - 1, 1));
            this.ae.setText(this.t.getString(R.string.IDS_main_watch_heart_rate_unit_string));
            this.n.setText(this.t.getString(R.string.IDS_main_watch_heart_rate_unit_string));
            this.e.setText(this.t.getString(R.string.IDS_main_watch_heart_rate_unit_string));
            this.aq.setText(this.t.getString(R.string.IDS_main_watch_heart_rate_unit_string));
            this.ay.setText(this.t.getString(R.string.IDS_main_watch_heart_rate_unit_string));
            return;
        }
        this.ae.setText(b(this.ai, this.al, 1));
        this.n.setText(b(this.h, this.ai - 1, 1));
        this.e.setText(b(this.d, this.h - 1, 1));
        this.aq.setText(b(this.an, this.d - 1, 1));
        this.ay.setText(b(this.bc, this.an - 1, 1));
        this.am.setText(this.t.getString(R.string.IDS_main_watch_heart_rate_unit_string));
        this.l.setText(this.t.getString(R.string.IDS_main_watch_heart_rate_unit_string));
        this.g.setText(this.t.getString(R.string.IDS_main_watch_heart_rate_unit_string));
        this.ao.setText(this.t.getString(R.string.IDS_main_watch_heart_rate_unit_string));
        this.az.setText(this.t.getString(R.string.IDS_main_watch_heart_rate_unit_string));
    }

    public void e(int i, int i2) {
        this.o = i2;
        nkd.c().d(i, i2);
        this.q.removeMessages(7);
        this.q.sendEmptyMessage(7);
    }

    private void o() {
        c(100, HeartRateThresholdConfig.HEART_RATE_LIMIT, 4368, this.aw, this.t.getString(R.string.IDS_rate_max_limit));
        a(AnalyticsValue.HEALTH_HEART_RATE_LIMIT_2090002.value(), (String) null);
    }

    public boolean a() {
        return this.o == 0;
    }

    public static void e(BaseHeartRateZoneFragment baseHeartRateZoneFragment, Message message) {
        baseHeartRateZoneFragment.aw = message.arg1;
        if (baseHeartRateZoneFragment.a()) {
            nkd.c().a(false, baseHeartRateZoneFragment.ax, baseHeartRateZoneFragment.r, baseHeartRateZoneFragment.aw, baseHeartRateZoneFragment.al, baseHeartRateZoneFragment.ai, baseHeartRateZoneFragment.h, baseHeartRateZoneFragment.d, baseHeartRateZoneFragment.an, baseHeartRateZoneFragment.bc);
        } else {
            nkd.c().e(false, baseHeartRateZoneFragment.ax, baseHeartRateZoneFragment.r, baseHeartRateZoneFragment.aw, baseHeartRateZoneFragment.al, baseHeartRateZoneFragment.ai, baseHeartRateZoneFragment.h, baseHeartRateZoneFragment.d, baseHeartRateZoneFragment.an, baseHeartRateZoneFragment.bc);
        }
        nkd.c().e(baseHeartRateZoneFragment.ax);
    }

    private void c(int i, int i2, int i3, int i4, String str) {
        wly.d dVar;
        wly wlyVarC;
        if (i <= i2 && (wlyVarC = (dVar = new wly.d(this.t, this.q, i3)).c(d(i, i2), Integer.valueOf(i4))) != null) {
            dVar.e(str);
            wlyVarC.show();
        }
    }

    private int[] d(int i, int i2) {
        if (i > i2) {
            return null;
        }
        int[] iArr = new int[(i2 - i) + 1];
        for (int i3 = i; i3 <= i2; i3++) {
            iArr[i3 - i] = i3;
        }
        return iArr;
    }

    public String b(int i, int i2, int i3) {
        StringBuffer stringBuffer = new StringBuffer(UnitUtil.e(i, i3, 0));
        stringBuffer.append("～");
        stringBuffer.append(UnitUtil.e(i2, i3, 0));
        return stringBuffer.toString();
    }

    protected void a(String str, String str2) {
        HashMap map = new HashMap(16);
        map.put("click", "1");
        if (str2 != null) {
            map.put("type", str2);
        }
        lmf.d().c(this.t, str, map, 0);
    }

    public void d() {
        LogUtil.b(this.au, "goToHeartRateSettingActivity");
        this.ah.a(0, false);
        Intent intent = new Intent(this.t, (Class<?>) HeartRateSectionActivity.class);
        intent.putExtra("maxHeartValue", this.al);
        intent.putExtra("heartRateZone1", this.ai);
        intent.putExtra("heartRateZone2", this.h);
        intent.putExtra("heartRateZone3", this.d);
        intent.putExtra("heartRateZone4", this.an);
        intent.putExtra("heartRateZone5", this.bc);
        intent.putExtra("heartRateZone_posture_type", this.ax);
        intent.putExtra("isStudentMode", false);
        if (a()) {
            intent.putExtra("intent_extra_heart_rate_type", 0);
            intent.putExtra("heartRatePercent1", this.af);
            intent.putExtra("heartRatePercent2", this.j);
            intent.putExtra("heartRatePercent3", this.f28831c);
            intent.putExtra("heartRatePercent4", this.ap);
            intent.putExtra("heartRatePercent5", this.ba);
        } else {
            intent.putExtra("intent_extra_heart_rate_type", 1);
            intent.putExtra("heartRatePercent1", this.z);
            intent.putExtra("heartRatePercent2", this.aa);
            intent.putExtra("heartRatePercent3", this.ad);
            intent.putExtra("heartRatePercent4", this.ab);
            intent.putExtra("heartRatePercent5", this.v);
        }
        intent.putExtra("intent_extra_hrr_heart_rate", this.ar);
        startActivityForResult(intent, 110);
    }

    public void a(boolean z) {
        String string;
        this.at.setChecked(this.r);
        this.at.setVisibility(0);
        this.x.setText(BaseApplication.getContext().getResources().getQuantityString(R.plurals.IDS_hwh_heart_rate_unit, 2, Integer.valueOf(this.aw)));
        this.w.setText(getString(R.string.IDS_hwh_motiontrack_sport_heart_rate_limit_warning, Integer.valueOf(this.aw)));
        String string2 = getString(R.string.IDS_unusual_stopped_message_more_new);
        if (a()) {
            this.aj.setChecked(true);
            this.ac.setChecked(false);
            string = this.t.getResources().getString(R.string.IDS_max_heart_rate_introduction, string2);
            this.k.setText(R.string.IDS_rate_zone_maximum_threshold);
            this.f.setText(R.string.IDS_rate_zone_anaerobic_threshold);
            this.ag.setText(R.string.IDS_rate_zone_aerobic_threshold);
            this.f28830b.setText(R.string.IDS_rate_zone_fatburn_threshold_string);
            this.f28829a.setText(R.string.IDS_rate_zone_warmup_threshold);
        } else {
            this.aj.setChecked(false);
            this.ac.setChecked(true);
            string = String.format(Locale.ENGLISH, getString(R.string.IDS_hrr_heart_rate_description), string2);
            this.k.setText(R.string.IDS_rate_zone_hrr_anaerobicAdvance_threshold);
            this.f.setText(R.string.IDS_rate_zone_hrr_anaerobicBase_threshold);
            this.ag.setText(R.string.IDS_rate_zone_hrr_lacticAcid_threshold);
            this.f28830b.setText(R.string.IDS_rate_zone_hrr_aerobicAdvance_threshold);
            this.f28829a.setText(R.string.IDS_rate_zone_hrr_aerobicBase_threshold);
        }
        SpannableString spannableString = new SpannableString(string);
        int length = string.length();
        spannableString.setSpan(new wma(a()), length - string2.length(), length, 17);
        this.y.setMovementMethod(LinkMovementMethod.getInstance());
        this.y.setText(spannableString);
        e(z);
    }

    public void e(boolean z) {
        int i;
        int i2;
        int i3;
        k();
        if (!z) {
            c(this.al);
        }
        if (a()) {
            this.ak.setText(b(Math.round(this.af), 100, 2));
            this.m.setText(b(Math.round(this.j), Math.round(this.af), 2));
            this.i.setText(b(Math.round(this.f28831c), Math.round(this.j), 2));
            this.as.setText(b(Math.round(this.ap), Math.round(this.f28831c), 2));
            this.bb.setText(b(Math.round(this.ba), Math.round(this.ap), 2));
        } else {
            this.ak.setText(b(Math.round(this.z), 100, 2));
            this.m.setText(b(Math.round(this.aa), Math.round(this.z), 2));
            this.i.setText(b(Math.round(this.ad), Math.round(this.aa), 2));
            this.as.setText(b(Math.round(this.ab), Math.round(this.ad), 2));
            this.bb.setText(b(Math.round(this.v), Math.round(this.ab), 2));
        }
        int i4 = this.ai;
        if (i4 > this.al || (i = this.h) > i4 || (i2 = this.d) > i || (i3 = this.an) > i2 || this.bc > i3) {
            LogUtil.b(this.au, "updateUiZone threshold wrong");
            LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>(1);
            linkedHashMap.put("actiontype", Integer.toString(2));
            OpAnalyticsUtil.getInstance().setEvent2nd(OperationKey.HEALTH_APP_HEART_RATE_ZONE_80040005.value(), linkedHashMap);
        }
        LogUtil.b(this.au, "setHeartRateZonePercent LimitPercent = ", Float.valueOf(this.af), " AnaerobicPercent = ", Float.valueOf(this.j), " AerobicPercent = ", Float.valueOf(this.f28831c), " ReduceFatPercent = ", Float.valueOf(this.ap), " WarmUpPercent = ", Float.valueOf(this.ba), "setHeartRateZone Limit = ", Integer.valueOf(this.ai), " Anaerobic = ", Integer.valueOf(this.h), " Aerobic = ", Integer.valueOf(this.d), " ReduceFat = ", Integer.valueOf(this.an), " WarmUp = ", Integer.valueOf(this.bc));
    }

    public void b(int i, boolean z) {
        if (z && i == this.al) {
            return;
        }
        if (a()) {
            if (Math.round(this.af) == 90.0f && Math.round(this.j) == 80.0f && Math.round(this.f28831c) == 70.0f && Math.round(this.ap) == 60.0f && Math.round(this.ba) == 50.0f) {
                this.af = 90.0f;
                this.j = 80.0f;
                this.f28831c = 70.0f;
                this.ap = 60.0f;
                this.ba = 50.0f;
                ReleaseLogUtil.d(this.au, "reset maxPercent");
                return;
            }
            return;
        }
        if (Math.round(this.z) == 95.0f && Math.round(this.aa) == 88.0f && Math.round(this.ad) == 84.0f && Math.round(this.ab) == 74.0f && Math.round(this.v) == 59.0f) {
            this.z = 95.0f;
            this.aa = 88.0f;
            this.ad = 84.0f;
            this.ab = 74.0f;
            this.v = 59.0f;
            ReleaseLogUtil.d(this.au, "reset HrrPercent");
        }
    }

    public void j() {
        if (this.af > 100.0f) {
            this.af = 90.0f;
            this.j = 80.0f;
            this.f28831c = 70.0f;
            this.ap = 60.0f;
            this.ba = 50.0f;
            LogUtil.b(this.au, "max percent exception");
        }
        int iRound = Math.round(((this.al - this.ar) * this.z) / 100.0f) + this.ar;
        this.ai = iRound;
        if (iRound >= this.al) {
            this.z = 95.0f;
            this.aa = 88.0f;
            this.ad = 84.0f;
            this.ab = 74.0f;
            this.v = 59.0f;
            LogUtil.b(this.au, "hrr percent exception");
        }
    }

    public void h() {
        this.ai = Math.round((this.al * this.af) / 100.0f);
        this.h = Math.round((this.al * this.j) / 100.0f);
        this.d = Math.round((this.al * this.f28831c) / 100.0f);
        this.an = Math.round((this.al * this.ap) / 100.0f);
        int iRound = Math.round((this.al * this.ba) / 100.0f);
        this.bc = iRound;
        LogUtil.b(this.au, "processAllValue LimitPercent = ", Float.valueOf(this.af), ", mLimitCount = ", Integer.valueOf(this.ai), ", AnaerobicPercent = ", Float.valueOf(this.j), "， mAnaerobic = ", Integer.valueOf(this.h), ", AerobicPercent = ", Float.valueOf(this.f28831c), ", ReduceFatPercent = ", Float.valueOf(this.ap), ", mMaxCount = ", Integer.valueOf(this.al), ", mReduceFat = ", Integer.valueOf(this.an), ", WarmUpPercent = ", Float.valueOf(this.ba), ", mWarmUp = ", Integer.valueOf(iRound));
    }

    public void f() {
        int i = this.al - this.ar;
        float f = i;
        this.ai = Math.round((this.z * f) / 100.0f) + this.ar;
        this.h = Math.round((this.aa * f) / 100.0f) + this.ar;
        this.d = Math.round((this.ad * f) / 100.0f) + this.ar;
        this.an = Math.round((this.ab * f) / 100.0f) + this.ar;
        int iRound = Math.round((f * this.v) / 100.0f) + this.ar;
        this.bc = iRound;
        LogUtil.b(this.au, "updateRestHeartRate mHrrAnaerobicPercent = ", Float.valueOf(this.z), ", mLimitCount = ", Integer.valueOf(this.ai), ", mHrrAnaerobicBasePercent = ", Float.valueOf(this.aa), ", hrr = ", Integer.valueOf(i), ", mAnaerobic = ", Integer.valueOf(this.h), ", mHrrLacticAcidPercent = ", Float.valueOf(this.ad), ", mAerobic = ", Integer.valueOf(this.d), ", mHrrAerobicPercent = ", Float.valueOf(this.ab), ", mReduceFat = ", Integer.valueOf(this.an), ", mHrrAerobicBasePercent = ", Float.valueOf(this.v), ", mWarmUp = ", Integer.valueOf(iRound));
    }

    private void e(int i) {
        if (i == 1) {
            this.s.setText(R.string.IDS_heart_raet_standing_introduction);
            return;
        }
        if (i == 2) {
            this.s.setText(R.string.IDS_heart_raet_riding_introduction);
            return;
        }
        if (i == 3) {
            this.s.setText(R.string.IDS_heart_raet_strokes_introduction);
        } else if (i == 4) {
            this.s.setText(R.string.IDS_heart_raet_other_introduction);
        } else {
            LogUtil.e(this.au, "exception position:", Integer.valueOf(i));
        }
    }

    private void d(int i) {
        int anaerobicThreshold = this.u.getAnaerobicThreshold();
        int aerobicThreshold = this.u.getAerobicThreshold();
        if (i <= 0) {
            LogUtil.d(this.au, "Heart Rate is wrong");
            return;
        }
        float f = i;
        this.af = (anaerobicThreshold * 100) / f;
        this.j = (aerobicThreshold * 100) / f;
        this.f28831c = (this.u.getFatBurnThreshold() * 100) / f;
        this.ap = (this.u.getWarmUpThreshold() * 100) / f;
        float fitnessThreshold = (this.u.getFitnessThreshold() * 100) / f;
        this.ba = fitnessThreshold;
        if (fitnessThreshold < 30.0f) {
            this.ba = 30.0f;
        }
        LogUtil.b(this.au, "setHeartRateZonePercent LimitPercent = ", Float.valueOf(this.af), "AnaerobicPercent = ", Float.valueOf(this.j), "AerobicPercent = ", Float.valueOf(this.f28831c), "ReduceFatPercent = ", Float.valueOf(this.ap), "WarmUpPercent = ", Float.valueOf(this.ba));
        int anaerobicAdvanceThreshold = this.u.getAnaerobicAdvanceThreshold();
        int anaerobicBaseThreshold = this.u.getAnaerobicBaseThreshold();
        int lacticAcidThreshold = this.u.getLacticAcidThreshold();
        int aerobicAdvanceThreshold = this.u.getAerobicAdvanceThreshold();
        int aerobicBaseThreshold = this.u.getAerobicBaseThreshold();
        int i2 = this.ar;
        float f2 = i - i2;
        float f3 = ((anaerobicAdvanceThreshold - i2) * 100) / f2;
        this.z = f3;
        float f4 = ((anaerobicBaseThreshold - i2) * 100) / f2;
        this.aa = f4;
        float f5 = ((lacticAcidThreshold - i2) * 100) / f2;
        this.ad = f5;
        float f6 = ((aerobicAdvanceThreshold - i2) * 100) / f2;
        this.ab = f6;
        float f7 = ((aerobicBaseThreshold - i2) * 100) / f2;
        this.v = f7;
        if (f7 < 30.0f) {
            this.v = 30.0f;
        }
        LogUtil.b(this.au, "setHeartRateZonePercent hrrHeartRate LimitPercent =", Float.valueOf(f3), " AnaerobicPercent = ", Float.valueOf(f4), " AerobicPercent = ", Float.valueOf(f5), " ReduceFatPercent = ", Float.valueOf(f6), " WarmUpPercent = ", Float.valueOf(this.v));
        b(i, true);
        j();
    }
}
