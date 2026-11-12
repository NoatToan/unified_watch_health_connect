package com.huawei.ui.main.stories.settings.activity.heartrate;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioGroup;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwcommonmodel.fitnessdatatype.HeartRateThresholdConfig;
import com.huawei.hwcommonmodel.fitnessdatatype.HeartZoneConf;
import com.huawei.hwcommonmodel.fitnessdatatype.StudentHeartRateZoneMgr;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.operation.OperationKey;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.radiobutton.HealthRadioButton;
import com.huawei.ui.commonui.switchbutton.HealthSwitchButton;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.main.R;
import defpackage.lmf;
import defpackage.lsy;
import defpackage.lxw;
import defpackage.nkd;
import defpackage.qrs;
import defpackage.qsp;
import defpackage.wly;
import defpackage.wma;
import health.compact.a.CommonUtil;
import health.compact.a.KeyValDbManager;
import health.compact.a.LanguageUtil;
import health.compact.a.LogUtil;
import health.compact.a.StorageParams;
import health.compact.a.UnitUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes19.dex */
public class StudentHeartRateActivity extends BaseActivity implements View.OnClickListener {
    private HealthRadioButton ad;
    private HealthTextView af;
    private HealthTextView ag;
    private HealthTextView ai;
    private int aj;
    private View al;
    private HealthRadioButton am;
    private HealthTextView an;
    private HealthTextView ao;
    private HealthTextView ap;
    private HealthTextView as;
    private StudentHeartRateZoneMgr at;
    private HealthSwitchButton aw;
    private HealthTextView ay;
    private HealthTextView az;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthTextView f28826b;
    private HealthTextView bb;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthTextView f28827c;
    private HealthTextView e;
    private HealthTextView f;
    private HealthTextView g;
    private int i;
    private HealthTextView j;
    private HealthTextView k;
    private HealthTextView l;
    private HealthTextView n;
    private HealthTextView o;
    private Context p;
    private CustomTitleBar t;
    private HealthTextView u;
    private HealthTextView w;
    private HealthTextView x;
    private boolean s = true;
    private int q = 0;
    private int av = 60;
    private int ax = 195;
    private int ak = 195;
    private int ae = 176;
    private float ah = 90.0f;
    private int h = 156;
    private float m = 80.0f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f28825a = 137;
    private float d = 70.0f;
    private int ar = 117;
    private float aq = 60.0f;
    private int au = 98;
    private float ba = 50.0f;
    private float ac = 95.0f;
    private float z = 88.0f;
    private float aa = 84.0f;
    private float y = 74.0f;
    private float v = 59.0f;
    private boolean ab = false;
    private Handler r = new b(this);

    static class b extends BaseHandler<StudentHeartRateActivity> {
        b(StudentHeartRateActivity studentHeartRateActivity) {
            super(studentHeartRateActivity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(StudentHeartRateActivity studentHeartRateActivity, Message message) {
            int i = message.what;
            if (i == 7) {
                studentHeartRateActivity.h();
            } else if (i == 8) {
                studentHeartRateActivity.j();
                return;
            } else if (i == 4368) {
                StudentHeartRateActivity.a(studentHeartRateActivity, message);
            }
            studentHeartRateActivity.b(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(StudentHeartRateActivity studentHeartRateActivity, Message message) {
        int i = message.arg1;
        studentHeartRateActivity.ax = i;
        studentHeartRateActivity.at.setHeartRateConfig(studentHeartRateActivity.s, i, studentHeartRateActivity.q, studentHeartRateActivity.ak, studentHeartRateActivity.av);
        studentHeartRateActivity.at.setStudentWarningLimitStatus(true);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        d(bundle);
        this.p = getApplicationContext();
        f();
        a();
        LogUtil.b("StudentHeartRateActivity", "onCreate");
        k();
    }

    private void d(Bundle bundle) {
        if (bundle != null) {
            String string = bundle.getString("currentActivityHashCode", "");
            if (TextUtils.isEmpty(string) || string.equals(toString())) {
                return;
            }
            Intent intent = new Intent();
            intent.setClassName(BaseApplication.getAppPackage(), "com.huawei.health.MainActivity");
            intent.setFlags(268468224);
            startActivity(intent);
            finish();
        }
    }

    private void a() {
        this.i = c();
        c(g() ? 8 : 0);
    }

    private void m() {
        c();
        LogUtil.b("StudentHeartRateActivity", "refreshUserInfo isBirthdayValid() ", Boolean.valueOf(g()));
        c(g() ? 8 : 0);
        int i = this.i;
        int i2 = this.aj;
        if (i != i2) {
            this.i = i2;
            k();
        }
    }

    private void c(int i) {
        View view = this.al;
        if (view != null) {
            view.setVisibility(i);
        }
    }

    private boolean g() {
        return this.aj != 0;
    }

    private int c() {
        int iE = CommonUtil.e(KeyValDbManager.d(BaseApplication.getContext()).b("family_mode_student_age_key", new StorageParams(1)), 0);
        this.aj = iE;
        return iE;
    }

    @Override // android.app.Activity
    protected void onRestart() {
        super.onRestart();
        if (this.ab) {
            m();
            this.ab = false;
        }
    }

    private void k() {
        lsy.a(new Runnable() { // from class: com.huawei.ui.main.stories.settings.activity.heartrate.StudentHeartRateActivity.5
            @Override // java.lang.Runnable
            public void run() {
                StudentHeartRateActivity.this.at = nkd.c().b().b();
                StudentHeartRateActivity studentHeartRateActivity = StudentHeartRateActivity.this;
                studentHeartRateActivity.q = studentHeartRateActivity.at.getStudentHeartRateThresholdData().getClassifyMethod();
                StudentHeartRateActivity studentHeartRateActivity2 = StudentHeartRateActivity.this;
                studentHeartRateActivity2.av = studentHeartRateActivity2.at.getStudentHeartRateThresholdData().getRestHeartRate();
                StudentHeartRateActivity.this.r.sendEmptyMessage(8);
            }
        });
    }

    private void f() {
        d();
        this.af = (HealthTextView) qsp.a(this, R.id.text_view_limit);
        this.an = (HealthTextView) qsp.a(this, R.id.text_limit_unit);
        this.ai = (HealthTextView) qsp.a(this, R.id.heart_zone_percent_01);
        this.k = (HealthTextView) qsp.a(this, R.id.text_view_anaerobic);
        this.o = (HealthTextView) qsp.a(this, R.id.text_anaerobic_unit);
        this.n = (HealthTextView) qsp.a(this, R.id.heart_zone_percent_02);
        this.f28826b = (HealthTextView) qsp.a(this, R.id.text_view_aerobic);
        this.j = (HealthTextView) qsp.a(this, R.id.text_aerobic_unit);
        this.g = (HealthTextView) qsp.a(this, R.id.heart_zone_percent_03);
        this.as = (HealthTextView) qsp.a(this, R.id.text_view_reduce_fat);
        this.ao = (HealthTextView) qsp.a(this, R.id.text_reduce_fat_unit);
        this.ap = (HealthTextView) qsp.a(this, R.id.heart_zone_percent_04);
        this.bb = (HealthTextView) qsp.a(this, R.id.text_view_warm_up);
        this.ay = (HealthTextView) qsp.a(this, R.id.text_warm_up_unit);
        this.az = (HealthTextView) qsp.a(this, R.id.heart_zone_percent_05);
        if (LanguageUtil.ba(BaseApplication.getContext())) {
            ((ImageView) qsp.a(this, R.id.upper_limit_enter_ic)).setImageResource(R.drawable.common_ui_arrow_left);
        }
        s();
    }

    private void s() {
        if (LanguageUtil.aj(BaseApplication.getContext())) {
            this.an.setText(c(this.ae, this.ak, 1));
            this.o.setText(c(this.h, this.ae - 1, 1));
            this.j.setText(c(this.f28825a, this.h - 1, 1));
            this.ao.setText(c(this.ar, this.f28825a - 1, 1));
            this.ay.setText(c(this.au, this.ar - 1, 1));
            this.af.setText(this.p.getString(R.string.IDS_main_watch_heart_rate_unit_string));
            this.k.setText(this.p.getString(R.string.IDS_main_watch_heart_rate_unit_string));
            this.f28826b.setText(this.p.getString(R.string.IDS_main_watch_heart_rate_unit_string));
            this.as.setText(this.p.getString(R.string.IDS_main_watch_heart_rate_unit_string));
            this.bb.setText(this.p.getString(R.string.IDS_main_watch_heart_rate_unit_string));
            return;
        }
        this.af.setText(c(this.ae, this.ak, 1));
        this.k.setText(c(this.h, this.ae - 1, 1));
        this.f28826b.setText(c(this.f28825a, this.h - 1, 1));
        this.as.setText(c(this.ar, this.f28825a - 1, 1));
        this.bb.setText(c(this.au, this.ar - 1, 1));
        this.an.setText(this.p.getString(R.string.IDS_main_watch_heart_rate_unit_string));
        this.o.setText(this.p.getString(R.string.IDS_main_watch_heart_rate_unit_string));
        this.j.setText(this.p.getString(R.string.IDS_main_watch_heart_rate_unit_string));
        this.ao.setText(this.p.getString(R.string.IDS_main_watch_heart_rate_unit_string));
        this.ay.setText(this.p.getString(R.string.IDS_main_watch_heart_rate_unit_string));
    }

    private void d() {
        setContentView(R.layout.activity_heart_rate_zone_setting_new);
        CustomTitleBar customTitleBar = (CustomTitleBar) qsp.a(this, R.id.heart_rate_title_bar);
        this.t = customTitleBar;
        customTitleBar.setVisibility(0);
        HealthSwitchButton healthSwitchButton = (HealthSwitchButton) qsp.a(this, R.id.max_heart_alarm_switch_button);
        this.aw = healthSwitchButton;
        healthSwitchButton.setVisibility(8);
        this.aw.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.huawei.ui.main.stories.settings.activity.heartrate.StudentHeartRateActivity.4
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                StudentHeartRateActivity.this.s = z;
                StudentHeartRateActivity.this.at.setHeartRateConfig(StudentHeartRateActivity.this.s, StudentHeartRateActivity.this.ax, StudentHeartRateActivity.this.q, StudentHeartRateActivity.this.ak, StudentHeartRateActivity.this.av);
                if (z) {
                    StudentHeartRateActivity.this.b(AnalyticsValue.HEALTH_HEART_RATE_INTERVAL_WARNING_2090001.value(), "1");
                } else {
                    StudentHeartRateActivity.this.b(AnalyticsValue.HEALTH_HEART_RATE_INTERVAL_WARNING_2090001.value(), "2");
                }
            }
        });
        findViewById(R.id.upper_limit_layout).setOnClickListener(this);
        this.u = (HealthTextView) qsp.a(this, R.id.upper_limit_textview);
        this.w = (HealthTextView) qsp.a(this, R.id.upper_limit_heart_rate_desc);
        this.am = (HealthRadioButton) qsp.a(this, R.id.max_heart_rate_radio_button);
        findViewById(R.id.max_heart_rate_layout).setOnClickListener(this);
        this.ad = (HealthRadioButton) qsp.a(this, R.id.heart_rate_reserve_radio_button);
        findViewById(R.id.heart_rate_reserve_layout).setOnClickListener(this);
        ((RadioGroup) findViewById(R.id.layout_radio_group)).setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: com.huawei.ui.main.stories.settings.activity.heartrate.StudentHeartRateActivity.1
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.max_heart_rate_radio_button) {
                    StudentHeartRateActivity.this.a(0);
                } else {
                    StudentHeartRateActivity.this.a(1);
                }
            }
        });
        e();
    }

    private void e() {
        this.x = (HealthTextView) qsp.a(this, R.id.heart_rate_describe);
        qsp.a(this, R.id.advance_settings_tv).setOnClickListener(this);
        this.l = (HealthTextView) qsp.a(this, R.id.zone_name1);
        this.f = (HealthTextView) qsp.a(this, R.id.zone_name2);
        this.ag = (HealthTextView) qsp.a(this, R.id.zone_name3);
        this.f28827c = (HealthTextView) qsp.a(this, R.id.zone_name4);
        this.e = (HealthTextView) qsp.a(this, R.id.zone_name5);
        this.al = findViewById(R.id.hw_health_rate_zone_tips);
        ((HealthTextView) findViewById(R.id.notice_message)).setText(this.p.getResources().getString(R.string.IDS_rate_zone_notice_message, Integer.valueOf(HeartRateThresholdConfig.HEART_RATE_LIMIT)));
        findViewById(R.id.rate_zone_set_age_text).setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.main.stories.settings.activity.heartrate.StudentHeartRateActivity.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                StudentHeartRateActivity.this.ab = true;
                Intent intent = new Intent();
                intent.setClassName(BaseApplication.getAppPackage(), "com.huawei.ui.main.stories.me.activity.StudentInfoActivity");
                StudentHeartRateActivity.this.startActivity(intent);
            }
        });
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("currentActivityHashCode", toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        h();
        int oldMaxThreshold = this.at.getOldMaxThreshold();
        LogUtil.b("StudentHeartRateActivity", "old maxHeartRateValue ", Integer.valueOf(oldMaxThreshold));
        e(oldMaxThreshold);
        if (oldMaxThreshold == this.ak) {
            b(false);
            return;
        }
        if (i()) {
            l();
        } else {
            t();
        }
        q();
        b(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        this.s = this.at.getStudentHeartRateThresholdData().getWarningEnable();
        this.ax = this.at.getStudentHeartRateThresholdData().getWarningLimit();
        this.ak = this.at.getStudentHeartRateThresholdData().getMaxThreshold();
        if (i()) {
            this.ae = this.at.getStudentHeartRateThresholdData().getAnaerobicThreshold();
            this.h = this.at.getStudentHeartRateThresholdData().getAerobicThreshold();
            this.f28825a = this.at.getStudentHeartRateThresholdData().getFatBurnThreshold();
            this.ar = this.at.getStudentHeartRateThresholdData().getWarmUpThreshold();
            this.au = this.at.getStudentHeartRateThresholdData().getFitnessThreshold();
        } else {
            this.ae = this.at.getStudentHeartRateThresholdData().getAnaerobicAdvanceThreshold();
            this.h = this.at.getStudentHeartRateThresholdData().getAnaerobicBaseThreshold();
            this.f28825a = this.at.getStudentHeartRateThresholdData().getLacticAcidThreshold();
            this.ar = this.at.getStudentHeartRateThresholdData().getAerobicAdvanceThreshold();
            this.au = this.at.getStudentHeartRateThresholdData().getAerobicBaseThreshold();
        }
        LogUtil.b("StudentHeartRateActivity", "initData from sp mHasMaxAlarm:", Boolean.valueOf(this.s), ", mUpLimit = ", Integer.valueOf(this.ax), ",mMaxCount = ", Integer.valueOf(this.ak), ",mLimitCount = ", Integer.valueOf(this.ae), ", mAnaerobic = ", Integer.valueOf(this.h), ", mAerobic = ", Integer.valueOf(this.f28825a), ",mReduceFat = ", Integer.valueOf(this.ar), ",mWarmUp = ", Integer.valueOf(this.au));
    }

    private void d(int i) {
        if (!i()) {
            int i2 = this.av;
            int i3 = i - i2;
            if (i3 == 0) {
                LogUtil.e("StudentHeartRateActivity", "updateUiPercent reserve is zero");
                return;
            }
            float f = i3;
            this.ac = ((this.ae - i2) * 100) / f;
            this.z = ((this.h - i2) * 100) / f;
            this.aa = ((this.f28825a - i2) * 100) / f;
            this.y = ((this.ar - i2) * 100) / f;
            float f2 = ((this.au - i2) * 100) / f;
            this.v = f2;
            if (f2 < 30.0f) {
                this.v = 30.0f;
            }
        } else {
            if (i == 0) {
                LogUtil.e("StudentHeartRateActivity", "updateUiPercent maxHeartRateValue is zero");
                return;
            }
            float f3 = i;
            this.ah = (this.ae * 100) / f3;
            this.m = (this.h * 100) / f3;
            this.d = (this.f28825a * 100) / f3;
            this.aq = (this.ar * 100) / f3;
            float f4 = (this.au * 100) / f3;
            this.ba = f4;
            if (f4 < 30.0f) {
                this.ba = 30.0f;
            }
        }
        LogUtil.b("StudentHeartRateActivity", "updateUiPercent LimitPercent = ", Float.valueOf(this.ah), ", AnaerobicPercent = ", Float.valueOf(this.m), ", AerobicPercent = ", Float.valueOf(this.d), ", ReduceFatPercent = ", Float.valueOf(this.aq), ", WarmUpPercent = ", Float.valueOf(this.ba));
    }

    private void e(int i) {
        int anaerobicThreshold = this.at.getStudentHeartRateThresholdData().getAnaerobicThreshold();
        int aerobicThreshold = this.at.getStudentHeartRateThresholdData().getAerobicThreshold();
        if (i <= 0) {
            LogUtil.d("StudentHeartRateActivity", "Heart Rate is wrong");
            return;
        }
        float f = i;
        this.ah = (anaerobicThreshold * 100) / f;
        this.m = (aerobicThreshold * 100) / f;
        this.d = (this.at.getStudentHeartRateThresholdData().getFatBurnThreshold() * 100) / f;
        this.aq = (this.at.getStudentHeartRateThresholdData().getWarmUpThreshold() * 100) / f;
        float fitnessThreshold = (this.at.getStudentHeartRateThresholdData().getFitnessThreshold() * 100) / f;
        this.ba = fitnessThreshold;
        if (fitnessThreshold < 30.0f) {
            this.ba = 30.0f;
        }
        LogUtil.b("StudentHeartRateActivity", "setHeartRateZonePercent LimitPercent = ", Float.valueOf(this.ah), " AnaerobicPercent = ", Float.valueOf(this.m), "AerobicPercent = ", Float.valueOf(this.d), "ReduceFatPercent = ", Float.valueOf(this.aq), "WarmUpPercent = ", Float.valueOf(this.ba));
        int anaerobicAdvanceThreshold = this.at.getStudentHeartRateThresholdData().getAnaerobicAdvanceThreshold();
        int anaerobicBaseThreshold = this.at.getStudentHeartRateThresholdData().getAnaerobicBaseThreshold();
        int lacticAcidThreshold = this.at.getStudentHeartRateThresholdData().getLacticAcidThreshold();
        int aerobicAdvanceThreshold = this.at.getStudentHeartRateThresholdData().getAerobicAdvanceThreshold();
        int aerobicBaseThreshold = this.at.getStudentHeartRateThresholdData().getAerobicBaseThreshold();
        int i2 = this.av;
        float f2 = i - i2;
        float f3 = ((anaerobicAdvanceThreshold - i2) * 100) / f2;
        this.ac = f3;
        float f4 = ((anaerobicBaseThreshold - i2) * 100) / f2;
        this.z = f4;
        float f5 = ((lacticAcidThreshold - i2) * 100) / f2;
        this.aa = f5;
        float f6 = ((aerobicAdvanceThreshold - i2) * 100) / f2;
        this.y = f6;
        float f7 = ((aerobicBaseThreshold - i2) * 100) / f2;
        this.v = f7;
        if (f7 < 30.0f) {
            this.v = 30.0f;
        }
        LogUtil.b("StudentHeartRateActivity", "setHeartRateZonePercent hrrHeartRate LimitPercent =", Float.valueOf(f3), " AnaerobicPercent = ", Float.valueOf(f4), " AerobicPercent = ", Float.valueOf(f5), " ReduceFatPercent = ", Float.valueOf(f6), " WarmUpPercent = ", Float.valueOf(this.v));
        a(i, true);
        o();
    }

    private void a(int i, boolean z) {
        if (z && i == this.ak) {
            return;
        }
        if (i()) {
            if (Math.round(this.ah) == 90.0f && Math.round(this.m) == 80.0f && Math.round(this.d) == 70.0f && Math.round(this.aq) == 60.0f && Math.round(this.ba) == 50.0f) {
                this.ah = 90.0f;
                this.m = 80.0f;
                this.d = 70.0f;
                this.aq = 60.0f;
                this.ba = 50.0f;
                ReleaseLogUtil.d("StudentHeartRateActivity", "reset maxPercent");
                return;
            }
            return;
        }
        if (Math.round(this.ac) == 95.0f && Math.round(this.z) == 88.0f && Math.round(this.aa) == 84.0f && Math.round(this.y) == 74.0f && Math.round(this.v) == 59.0f) {
            this.ac = 95.0f;
            this.z = 88.0f;
            this.aa = 84.0f;
            this.y = 74.0f;
            this.v = 59.0f;
            ReleaseLogUtil.d("StudentHeartRateActivity", "reset HrrPercent");
        }
    }

    private void o() {
        if (this.ah > 100.0f) {
            this.ah = 90.0f;
            this.m = 80.0f;
            this.d = 70.0f;
            this.aq = 60.0f;
            this.ba = 50.0f;
            LogUtil.b("StudentHeartRateActivity", "max percent exception");
        }
        int iRound = Math.round(((this.ak - this.av) * this.ac) / 100.0f) + this.av;
        this.ae = iRound;
        if (iRound >= this.ak) {
            this.ac = 95.0f;
            this.z = 88.0f;
            this.aa = 84.0f;
            this.y = 74.0f;
            this.v = 59.0f;
            LogUtil.b("StudentHeartRateActivity", "hrr percent exception");
        }
    }

    private void q() {
        int iRound = Math.round((this.ak * this.ah) / 100.0f);
        int iRound2 = Math.round((this.ak * this.m) / 100.0f);
        int iRound3 = Math.round((this.ak * this.d) / 100.0f);
        int iRound4 = Math.round((this.ak * this.aq) / 100.0f);
        int iRound5 = Math.round((this.ak * this.ba) / 100.0f);
        this.at.setHeartRateConfig(this.s, this.ax, this.q, this.ak, this.av);
        this.at.setMaxHeartRateThreshold(iRound, iRound2, iRound3, iRound4, iRound5);
        LogUtil.b("StudentHeartRateActivity", "updateHeartZoneDataConfig mHasMaxAlarm = ", Boolean.valueOf(this.s), ", mUpLimit", Integer.valueOf(this.ax), ", mClassifyMethod = ", Integer.valueOf(this.q), ", mMaxCount = ", Integer.valueOf(this.ak), ", mRestHeartRateCount = ", Integer.valueOf(this.av));
        LogUtil.b("StudentHeartRateActivity", "updateHeartZoneDataConfig MaxHeartRateThreshold = ", Integer.valueOf(iRound), " ", Integer.valueOf(iRound2), " ", Integer.valueOf(iRound3), " ", Integer.valueOf(iRound4), " ", Integer.valueOf(iRound5));
        float f = this.ak - this.av;
        int iRound6 = Math.round((this.ac * f) / 100.0f) + this.av;
        int iRound7 = Math.round((this.z * f) / 100.0f) + this.av;
        int iRound8 = Math.round((this.aa * f) / 100.0f) + this.av;
        int iRound9 = Math.round((this.y * f) / 100.0f) + this.av;
        int iRound10 = Math.round((f * this.v) / 100.0f) + this.av;
        this.at.setHrrHeartRateZoneThreshold(iRound6, iRound7, iRound8, iRound9, iRound10);
        LogUtil.b("StudentHeartRateActivity", "updateHeartZoneDataConfig HrrHeartRateZoneThreshold = ", Integer.valueOf(iRound6), " ", Integer.valueOf(iRound7), " ", Integer.valueOf(iRound8), " ", Integer.valueOf(iRound9), " ", Integer.valueOf(iRound10));
    }

    private void l() {
        this.ae = Math.round((this.ak * this.ah) / 100.0f);
        this.h = Math.round((this.ak * this.m) / 100.0f);
        this.f28825a = Math.round((this.ak * this.d) / 100.0f);
        this.ar = Math.round((this.ak * this.aq) / 100.0f);
        int iRound = Math.round((this.ak * this.ba) / 100.0f);
        this.au = iRound;
        LogUtil.b("StudentHeartRateActivity", "processAllValue LimitPercent = ", Float.valueOf(this.ah), ", mLimitCount = ", Integer.valueOf(this.ae), ", AnaerobicPercent = ", Float.valueOf(this.m), "， mAnaerobic = ", Integer.valueOf(this.h), ", AerobicPercent = ", Float.valueOf(this.d), ", ReduceFatPercent = ", Float.valueOf(this.aq), ", mMaxCount = ", Integer.valueOf(this.ak), ", mReduceFat = ", Integer.valueOf(this.ar), ", WarmUpPercent = ", Float.valueOf(this.ba), ", mWarmUp = ", Integer.valueOf(iRound));
    }

    private void t() {
        int i = this.ak - this.av;
        float f = i;
        this.ae = Math.round((this.ac * f) / 100.0f) + this.av;
        this.h = Math.round((this.z * f) / 100.0f) + this.av;
        this.f28825a = Math.round((this.aa * f) / 100.0f) + this.av;
        this.ar = Math.round((this.y * f) / 100.0f) + this.av;
        int iRound = Math.round((f * this.v) / 100.0f) + this.av;
        this.au = iRound;
        LogUtil.b("StudentHeartRateActivity", "updateRestHeartRate mHrrAnaerobicPercent = ", Float.valueOf(this.ac), ", mLimitCount = ", Integer.valueOf(this.ae), ", mHrrAnaerobicBasePercent = ", Float.valueOf(this.z), ", hrr = ", Integer.valueOf(i), ", mAnaerobic = ", Integer.valueOf(this.h), ", mHrrLacticAcidPercent = ", Float.valueOf(this.aa), ", mAerobic = ", Integer.valueOf(this.f28825a), ", mHrrAerobicPercent = ", Float.valueOf(this.y), ", mReduceFat = ", Integer.valueOf(this.ar), ", mHrrAerobicBasePercent = ", Float.valueOf(this.v), ", mWarmUp = ", Integer.valueOf(iRound));
    }

    private boolean i() {
        return this.q == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(boolean z) {
        String string;
        this.aw.setChecked(this.s);
        this.aw.setVisibility(0);
        this.u.setText(BaseApplication.getContext().getResources().getQuantityString(R.plurals.IDS_hwh_heart_rate_unit, 2, Integer.valueOf(this.ax)));
        this.w.setText(String.format(Locale.ENGLISH, getString(R.string.IDS_hwh_motiontrack_sport_heart_rate_limit_warning), Integer.valueOf(this.ax)));
        String string2 = getString(R.string.IDS_unusual_stopped_message_more_new);
        if (i()) {
            this.am.setChecked(true);
            this.ad.setChecked(false);
            string = this.p.getResources().getString(R.string.IDS_max_heart_rate_description, Integer.valueOf(HeartRateThresholdConfig.HEART_RATE_LIMIT), string2);
            this.l.setText(R.string.IDS_rate_zone_maximum_threshold);
            this.f.setText(R.string.IDS_rate_zone_anaerobic_threshold);
            this.ag.setText(R.string.IDS_rate_zone_aerobic_threshold);
            this.f28827c.setText(R.string.IDS_rate_zone_fatburn_threshold_string);
            this.e.setText(R.string.IDS_rate_zone_warmup_threshold);
        } else {
            this.am.setChecked(false);
            this.ad.setChecked(true);
            string = String.format(Locale.ENGLISH, getString(R.string.IDS_hrr_heart_rate_description), string2);
            this.l.setText(R.string.IDS_rate_zone_hrr_anaerobicAdvance_threshold);
            this.f.setText(R.string.IDS_rate_zone_hrr_anaerobicBase_threshold);
            this.ag.setText(R.string.IDS_rate_zone_hrr_lacticAcid_threshold);
            this.f28827c.setText(R.string.IDS_rate_zone_hrr_aerobicAdvance_threshold);
            this.e.setText(R.string.IDS_rate_zone_hrr_aerobicBase_threshold);
        }
        SpannableString spannableString = new SpannableString(string);
        int length = string.length();
        spannableString.setSpan(new wma(i()), length - string2.length(), length, 17);
        this.x.setMovementMethod(LinkMovementMethod.getInstance());
        this.x.setText(spannableString);
        d(z);
    }

    private void d(boolean z) {
        int i;
        int i2;
        int i3;
        s();
        if (!z) {
            d(this.ak);
        }
        if (i()) {
            this.ai.setText(c(Math.round(this.ah), 100, 2));
            this.n.setText(c(Math.round(this.m), Math.round(this.ah), 2));
            this.g.setText(c(Math.round(this.d), Math.round(this.m), 2));
            this.ap.setText(c(Math.round(this.aq), Math.round(this.d), 2));
            this.az.setText(c(Math.round(this.ba), Math.round(this.aq), 2));
        } else {
            this.ai.setText(c(Math.round(this.ac), 100, 2));
            this.n.setText(c(Math.round(this.z), Math.round(this.ac), 2));
            this.g.setText(c(Math.round(this.aa), Math.round(this.z), 2));
            this.ap.setText(c(Math.round(this.y), Math.round(this.aa), 2));
            this.az.setText(c(Math.round(this.v), Math.round(this.y), 2));
        }
        int i4 = this.ae;
        if (i4 > this.ak || (i = this.h) > i4 || (i2 = this.f28825a) > i || (i3 = this.ar) > i2 || this.au > i3) {
            LogUtil.b("StudentHeartRateActivity", "updateUiZone threshold wrong");
            LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>(1);
            linkedHashMap.put("actiontype", Integer.toString(2));
            OpAnalyticsUtil.getInstance().setEvent2nd(OperationKey.HEALTH_APP_HEART_RATE_ZONE_80040005.value(), linkedHashMap);
        }
        LogUtil.b("StudentHeartRateActivity", "setHeartRateZonePercent LimitPercent = ", Float.valueOf(this.ah), " AnaerobicPercent = ", Float.valueOf(this.m), " AerobicPercent = ", Float.valueOf(this.d), " ReduceFatPercent = ", Float.valueOf(this.aq), " WarmUpPercent = ", Float.valueOf(this.ba), "setHeartRateZone Limit = ", Integer.valueOf(this.ae), " Anaerobic = ", Integer.valueOf(this.h), " Aerobic = ", Integer.valueOf(this.f28825a), " ReduceFat = ", Integer.valueOf(this.ar), " WarmUp = ", Integer.valueOf(this.au));
    }

    private String c(int i, int i2, int i3) {
        StringBuffer stringBuffer = new StringBuffer(UnitUtil.e(i, i3, 0));
        stringBuffer.append("～");
        stringBuffer.append(UnitUtil.e(i2, i3, 0));
        return stringBuffer.toString();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == null) {
            return;
        }
        if (qrs.c(600)) {
            LogUtil.d("StudentHeartRateActivity", "CLICK IS FAST");
            return;
        }
        if (R.id.upper_limit_layout == view.getId()) {
            n();
        }
        if (R.id.heart_rate_reserve_layout == view.getId()) {
            a(1);
            return;
        }
        if (R.id.max_heart_rate_layout == view.getId()) {
            a(0);
        } else if (R.id.advance_settings_tv == view.getId()) {
            b();
        } else {
            LogUtil.b("StudentHeartRateActivity", "onClick else");
        }
    }

    private void n() {
        b(100, HeartRateThresholdConfig.HEART_RATE_LIMIT, 4368, this.ax, this.p.getString(R.string.IDS_rate_max_limit));
        b(AnalyticsValue.HEALTH_HEART_RATE_LIMIT_2090002.value(), (String) null);
    }

    private void b(int i, int i2, int i3, int i4, String str) {
        wly.d dVar;
        wly wlyVarC;
        if (i <= i2 && (wlyVarC = (dVar = new wly.d(this, this.r, i3)).c(b(i, i2), Integer.valueOf(i4))) != null) {
            dVar.e(str);
            wlyVarC.show();
        }
    }

    private int[] b(int i, int i2) {
        if (i > i2) {
            return null;
        }
        int[] iArr = new int[(i2 - i) + 1];
        for (int i3 = i; i3 <= i2; i3++) {
            iArr[i3 - i] = i3;
        }
        return iArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        this.q = i;
        this.at.setHeartRateConfig(this.s, this.ax, i, this.ak, this.av);
        this.r.removeMessages(7);
        this.r.sendEmptyMessage(7);
    }

    private void b() {
        LogUtil.b("StudentHeartRateActivity", "goToHeartRateSettingActivity");
        Intent intent = new Intent(this, (Class<?>) HeartRateSectionActivity.class);
        intent.putExtra("maxHeartValue", this.ak);
        intent.putExtra("heartRateZone1", this.ae);
        intent.putExtra("heartRateZone2", this.h);
        intent.putExtra("heartRateZone3", this.f28825a);
        intent.putExtra("heartRateZone4", this.ar);
        intent.putExtra("heartRateZone5", this.au);
        if (i()) {
            intent.putExtra("intent_extra_heart_rate_type", 0);
            intent.putExtra("heartRatePercent1", this.ah);
            intent.putExtra("heartRatePercent2", this.m);
            intent.putExtra("heartRatePercent3", this.d);
            intent.putExtra("heartRatePercent4", this.aq);
            intent.putExtra("heartRatePercent5", this.ba);
        } else {
            intent.putExtra("intent_extra_heart_rate_type", 1);
            intent.putExtra("heartRatePercent1", this.ac);
            intent.putExtra("heartRatePercent2", this.z);
            intent.putExtra("heartRatePercent3", this.aa);
            intent.putExtra("heartRatePercent4", this.y);
            intent.putExtra("heartRatePercent5", this.v);
        }
        intent.putExtra("intent_extra_hrr_heart_rate", this.av);
        intent.putExtra("isStudentMode", true);
        startActivityForResult(intent, 110);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (intent == null) {
            LogUtil.d("StudentHeartRateActivity", "onActivityResult data is null");
            return;
        }
        LogUtil.b("StudentHeartRateActivity", "onActivityResult requestCode = ", Integer.valueOf(i));
        if (i2 == 3 && i == 110) {
            d(intent, 5, "maxHeartValue");
            d(intent, 4, "heartRateZone1");
            d(intent, 3, "heartRateZone2");
            d(intent, 2, "heartRateZone3");
            d(intent, 1, "heartRateZone4");
            d(intent, 0, "heartRateZone5");
            boolean booleanExtra = intent.getBooleanExtra("intent_extra_max_heart_rate_change", false);
            if (i()) {
                if (booleanExtra) {
                    q();
                }
                this.at.setHeartRateConfig(this.s, this.ax, this.q, this.ak, this.av);
                this.at.setMaxHeartRateThreshold(this.ae, this.h, this.f28825a, this.ar, this.au);
            } else {
                d(intent, 6, "intent_extra_hrr_heart_rate");
                if (booleanExtra) {
                    q();
                }
                this.at.setHeartRateConfig(this.s, this.ax, this.q, this.ak, this.av);
                this.at.setHrrHeartRateZoneThreshold(this.ae, this.h, this.f28825a, this.ar, this.au);
            }
            e(intent);
            b(true);
        }
    }

    private void e(Intent intent) {
        if (i()) {
            this.ah = intent.getFloatExtra("heartRatePercent1", this.ah);
            this.m = intent.getFloatExtra("heartRatePercent2", this.m);
            this.d = intent.getFloatExtra("heartRatePercent3", this.d);
            this.aq = intent.getFloatExtra("heartRatePercent4", this.aq);
            this.ba = intent.getFloatExtra("heartRatePercent5", this.ba);
            return;
        }
        this.ac = intent.getFloatExtra("heartRatePercent1", this.ac);
        this.z = intent.getFloatExtra("heartRatePercent2", this.z);
        this.aa = intent.getFloatExtra("heartRatePercent3", this.aa);
        this.y = intent.getFloatExtra("heartRatePercent4", this.y);
        this.v = intent.getFloatExtra("heartRatePercent5", this.v);
    }

    private void d(Intent intent, int i, String str) {
        try {
            c(i, intent.getIntExtra(str, -1));
        } catch (NumberFormatException unused) {
            LogUtil.d("StudentHeartRateActivity", "dealWithOnResultData NumberFormatException");
        }
    }

    private void c(int i, int i2) {
        LogUtil.b("StudentHeartRateActivity", "setRangValue index= ", Integer.valueOf(i), "  value= ", Integer.valueOf(i2));
        switch (i) {
            case 0:
                this.au = i2;
                break;
            case 1:
                this.ar = i2;
                break;
            case 2:
                this.f28825a = i2;
                break;
            case 3:
                this.h = i2;
                break;
            case 4:
                this.ae = i2;
                break;
            case 5:
                this.ak = i2;
                break;
            case 6:
                this.av = i2;
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str, String str2) {
        HashMap map = new HashMap(16);
        map.put("click", "1");
        if (str2 != null) {
            map.put("type", str2);
        }
        lmf.d().c(this.p, str, map, 0);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        LogUtil.b("StudentHeartRateActivity", "onStop");
        this.at.getStudentHeartRateThresholdData().setOldMaxThreshold(this.ak);
        this.at.setStudentHeartDataToSp();
        lxw.b((HeartZoneConf) null, nkd.c().b().b(), true);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
