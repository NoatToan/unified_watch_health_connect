package com.huawei.ui.main.stories.settings.activity.heartrate;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwcommonmodel.fitnessdatatype.HeartRateThresholdConfig;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.base.BaseDialog;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.main.R;
import defpackage.lmf;
import defpackage.nkd;
import defpackage.qre;
import defpackage.qrs;
import defpackage.qsp;
import defpackage.wlw;
import defpackage.wly;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.text.DecimalFormatSymbols;
import java.util.HashMap;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes19.dex */
public class HeartRateSectionActivity extends BaseActivity implements View.OnClickListener {
    private boolean aa;
    private HealthTextView ac;
    private HealthTextView ah;
    private HealthTextView ak;
    private int al;
    private int am;
    private int an;
    private int ao;
    private int ap;
    private int aq;
    private int ar;
    private int as;
    private HealthTextView au;
    private int av;
    private int ay;
    private RelativeLayout ba;
    private NoTitleCustomAlertDialog bb;
    private NoTitleCustomAlertDialog bc;
    private NoTitleCustomAlertDialog bd;
    private CustomTitleBar be;
    private HealthTextView bi;
    private HealthTextView bk;
    private HealthTextView bm;
    private HealthTextView d;
    private Context g;
    private HealthTextView j;
    private HealthTextView k;
    private HealthTextView l;
    private HealthTextView m;
    private HealthTextView n;
    private HealthTextView o;
    private HealthTextView p;
    private HealthTextView q;
    private HealthTextView r;
    private HealthTextView s;
    private HealthTextView t;
    private HealthTextView u;
    private HeartRateZoneSeekBar w;
    private HealthTextView x;
    private int az = 60;
    private boolean af = false;
    private boolean f = true;
    private int bf = 195;
    private int aj = 195;
    private int ae = 176;
    private float ai = 90.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f28802c = 156;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f28801b = 80.0f;
    private int e = 137;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f28800a = 70.0f;
    private int at = 117;
    private float ax = 60.0f;
    private int bg = 98;
    private float bh = 50.0f;
    private float ab = 95.0f;
    private float z = 88.0f;
    private float ad = 84.0f;
    private float v = 74.0f;
    private float y = 59.0f;
    private Handler h = new c(this);
    private boolean ag = false;
    private View.OnClickListener aw = new View.OnClickListener() { // from class: com.huawei.ui.main.stories.settings.activity.heartrate.HeartRateSectionActivity.5
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(HeartRateSectionActivity.this);
            builder.a(HeartRateSectionActivity.this.g.getResources().getString(R.string.IDS_sure_to_reset_button_rate_zone_text)).a(HeartRateSectionActivity.this.g.getResources().getString(R.string.IDS_plugin_menu_reset), new View.OnClickListener() { // from class: com.huawei.ui.main.stories.settings.activity.heartrate.HeartRateSectionActivity.5.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    HeartRateSectionActivity.this.a(AnalyticsValue.HEALTH_MINE_RECOVER_HEARTRATE_AND_WARNING_2040041.value(), "1");
                    nkd.c().b(HeartRateSectionActivity.this.af, HeartRateSectionActivity.this.ay);
                    HeartRateSectionActivity.this.az = nkd.c().c(HeartRateSectionActivity.this.af, HeartRateSectionActivity.this.ay);
                    HeartRateSectionActivity.this.a();
                    if (HeartRateSectionActivity.this.i()) {
                        nkd.c().a(HeartRateSectionActivity.this.af, HeartRateSectionActivity.this.ay, HeartRateSectionActivity.this.f, HeartRateSectionActivity.this.bf, HeartRateSectionActivity.this.aj, HeartRateSectionActivity.this.ae, HeartRateSectionActivity.this.f28802c, HeartRateSectionActivity.this.e, HeartRateSectionActivity.this.at, HeartRateSectionActivity.this.bg);
                    } else {
                        nkd.c().e(HeartRateSectionActivity.this.af, HeartRateSectionActivity.this.ay, HeartRateSectionActivity.this.f, HeartRateSectionActivity.this.bf, HeartRateSectionActivity.this.aj, HeartRateSectionActivity.this.ae, HeartRateSectionActivity.this.f28802c, HeartRateSectionActivity.this.e, HeartRateSectionActivity.this.at, HeartRateSectionActivity.this.bg);
                        nkd.c().d(HeartRateSectionActivity.this.af, HeartRateSectionActivity.this.ay, HeartRateSectionActivity.this.az);
                    }
                    HeartRateSectionActivity.this.c();
                    HeartRateSectionActivity.this.e(HeartRateSectionActivity.this.aj);
                    HeartRateSectionActivity.this.ag = false;
                    HeartRateSectionActivity.this.aa = true;
                    HeartRateSectionActivity.this.l();
                    HeartRateSectionActivity.this.ab();
                }
            }).d(HeartRateSectionActivity.this.g.getResources().getString(R.string.IDS_settings_button_cancal), new View.OnClickListener() { // from class: com.huawei.ui.main.stories.settings.activity.heartrate.HeartRateSectionActivity.5.4
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    HeartRateSectionActivity.this.a(AnalyticsValue.HEALTH_MINE_RECOVER_HEARTRATE_AND_WARNING_2040041.value(), "2");
                }
            });
            builder.c().show();
        }
    };
    private int i = 0;

    private float c(float f) {
        if (f < 30.0f) {
            return 30.0f;
        }
        return f;
    }

    static class c extends BaseHandler<HeartRateSectionActivity> {
        c(HeartRateSectionActivity heartRateSectionActivity) {
            super(heartRateSectionActivity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(HeartRateSectionActivity heartRateSectionActivity, Message message) {
            if (message == null || heartRateSectionActivity == null) {
                LogUtil.e("HeartRateSectionActivity", "handleMessageWhenReferenceNotNull  message is null or aactivity is null");
                return;
            }
            int i = message.what;
            if (i == 1) {
                heartRateSectionActivity.ae = message.arg1;
                b(heartRateSectionActivity);
            } else if (i == 2) {
                heartRateSectionActivity.f28802c = message.arg1;
                b(heartRateSectionActivity);
            } else if (i == 3) {
                heartRateSectionActivity.e = message.arg1;
                b(heartRateSectionActivity);
            } else if (i == 4) {
                heartRateSectionActivity.at = message.arg1;
                b(heartRateSectionActivity);
            } else if (i == 5) {
                heartRateSectionActivity.bg = message.arg1;
                b(heartRateSectionActivity);
            } else if (i == 1114) {
                heartRateSectionActivity.aj = message.arg1;
                heartRateSectionActivity.c(heartRateSectionActivity.aj, false);
                a(heartRateSectionActivity);
            } else if (i == 1115) {
                heartRateSectionActivity.az = message.arg1;
                if (!heartRateSectionActivity.i()) {
                    heartRateSectionActivity.z();
                }
            }
            heartRateSectionActivity.ag = false;
            heartRateSectionActivity.ab();
        }

        private void b(HeartRateSectionActivity heartRateSectionActivity) {
            heartRateSectionActivity.e(heartRateSectionActivity.aj);
            a(heartRateSectionActivity);
        }

        private void a(HeartRateSectionActivity heartRateSectionActivity) {
            if (heartRateSectionActivity.i()) {
                heartRateSectionActivity.m();
            } else {
                heartRateSectionActivity.z();
            }
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_heart_rate_section_new);
        g();
        d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean i() {
        return this.i == 0;
    }

    private void r() {
        String string;
        if (i()) {
            string = getResources().getString(R.string.IDS_rate_zone_max_text);
        } else {
            string = getResources().getString(R.string.IDS_rate_zone_hrr_text);
        }
        this.be.setTitleText(string);
    }

    private void d() {
        Intent intent = getIntent();
        if (intent == null) {
            LogUtil.e("HeartRateSectionActivity", "initData Intent  is null");
            return;
        }
        this.i = intent.getIntExtra("intent_extra_heart_rate_type", 0);
        this.aj = intent.getIntExtra("maxHeartValue", this.aj);
        this.ae = intent.getIntExtra("heartRateZone1", this.ae);
        this.f28802c = intent.getIntExtra("heartRateZone2", this.f28802c);
        this.e = intent.getIntExtra("heartRateZone3", this.e);
        this.at = intent.getIntExtra("heartRateZone4", this.at);
        this.bg = intent.getIntExtra("heartRateZone5", this.bg);
        this.ay = intent.getIntExtra("heartRateZone_posture_type", 0);
        this.af = intent.getBooleanExtra("isStudentMode", false);
        this.az = intent.getIntExtra("intent_extra_hrr_heart_rate", this.az);
        if (i()) {
            this.ah.setText(R.string.IDS_rate_zone_maximum_threshold);
            this.j.setText(R.string.IDS_rate_zone_anaerobic_threshold);
            this.d.setText(R.string.IDS_rate_zone_aerobic_threshold);
            this.au.setText(R.string.IDS_rate_zone_fatburn_threshold_string);
            this.bk.setText(R.string.IDS_rate_zone_warmup_threshold);
        } else {
            this.ba.setVisibility(0);
            this.ac.setVisibility(0);
            this.ah.setText(R.string.IDS_rate_zone_hrr_anaerobicAdvance_threshold);
            this.j.setText(R.string.IDS_rate_zone_hrr_anaerobicBase_threshold);
            this.d.setText(R.string.IDS_rate_zone_hrr_lacticAcid_threshold);
            this.au.setText(R.string.IDS_rate_zone_hrr_aerobicAdvance_threshold);
            this.bk.setText(R.string.IDS_rate_zone_hrr_aerobicBase_threshold);
        }
        d(intent);
        c();
        r();
        ab();
    }

    private void d(Intent intent) {
        if (i()) {
            this.ai = intent.getFloatExtra("heartRatePercent1", this.ai);
            this.f28801b = intent.getFloatExtra("heartRatePercent2", this.f28801b);
            this.f28800a = intent.getFloatExtra("heartRatePercent3", this.f28800a);
            this.ax = intent.getFloatExtra("heartRatePercent4", this.ax);
            this.bh = intent.getFloatExtra("heartRatePercent5", this.bh);
            return;
        }
        this.ab = intent.getFloatExtra("heartRatePercent1", this.ab);
        this.z = intent.getFloatExtra("heartRatePercent2", this.z);
        this.ad = intent.getFloatExtra("heartRatePercent3", this.ad);
        this.v = intent.getFloatExtra("heartRatePercent4", this.v);
        this.y = intent.getFloatExtra("heartRatePercent5", this.y);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        this.aq = this.aj;
        this.ar = this.az;
        this.ao = this.ae;
        this.ap = this.f28802c;
        this.al = this.e;
        this.as = this.at;
        this.av = this.bg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean j() {
        return (this.aq == this.aj && this.ar == this.az && this.ao == this.ae && this.ap == this.f28802c && this.al == this.e && this.as == this.at && this.av == this.bg) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        this.aj = this.aq;
        this.az = this.ar;
        this.ae = this.ao;
        this.f28802c = this.ap;
        this.e = this.al;
        this.at = this.as;
        this.bg = this.av;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ab() {
        this.r.setText(UnitUtil.e(100.0d, 2, 0));
        this.ak.setText(BaseApplication.getContext().getResources().getQuantityString(R.plurals.IDS_hwh_heart_rate_unit, 2, Integer.valueOf(this.aj)));
        this.s.setText(UnitUtil.e(this.aj, 1, 0));
        this.p.setText(UnitUtil.e(this.ae, 1, 0));
        this.n.setText(UnitUtil.e(this.f28802c, 1, 0));
        this.l.setText(UnitUtil.e(this.e, 1, 0));
        this.q.setText(UnitUtil.e(this.at, 1, 0));
        this.u.setText(UnitUtil.e(this.bg, 1, 0));
        if (i()) {
            this.an = Math.round((this.aj * 30) / 100.0f);
            this.t.setText(UnitUtil.e(Math.round(this.ai), 2, 0));
            this.k.setText(UnitUtil.e(Math.round(this.f28801b), 2, 0));
            this.o.setText(UnitUtil.e(Math.round(this.f28800a), 2, 0));
            this.m.setText(UnitUtil.e(Math.round(this.ax), 2, 0));
            this.x.setText(UnitUtil.e(Math.round(this.bh), 2, 0));
        } else {
            int i = this.aj;
            int i2 = this.az;
            this.am = Math.round((((i - i2) * 30) / 100.0f) + i2);
            this.ac.setText(BaseApplication.getContext().getResources().getQuantityString(R.plurals.IDS_hwh_heart_rate_unit, 2, Integer.valueOf(this.az)));
            this.t.setText(UnitUtil.e(Math.round(this.ab), 2, 0));
            this.k.setText(UnitUtil.e(Math.round(this.z), 2, 0));
            this.o.setText(UnitUtil.e(Math.round(this.ad), 2, 0));
            this.m.setText(UnitUtil.e(Math.round(this.v), 2, 0));
            this.x.setText(UnitUtil.e(Math.round(this.y), 2, 0));
        }
        v();
    }

    private void v() {
        if (b()) {
            LogUtil.j("HeartRateSectionActivity", "updateHeartZoneDataConfig isHeartRateZoneConflict");
        } else if (i()) {
            this.w.b(d(Math.round(this.bh), this.ax, this.f28800a, this.f28801b, this.ai));
        } else {
            this.w.b(d(Math.round(this.y), this.v, this.ad, this.z, this.ab));
        }
    }

    private wlw d(float f, float f2, float f3, float f4, float f5) {
        wlw.c cVar = new wlw.c(f, f2, -12739329);
        wlw.c cVar2 = new wlw.c(f2, f3, -16722343);
        wlw.c cVar3 = new wlw.c(f3, f4, -17893);
        wlw.c cVar4 = new wlw.c(f4, f5, -301790);
        wlw.c cVar5 = new wlw.c(f5, 100.0f, -52448);
        LinkedList linkedList = new LinkedList();
        linkedList.add(cVar);
        linkedList.add(cVar2);
        linkedList.add(cVar3);
        linkedList.add(cVar4);
        linkedList.add(cVar5);
        return new wlw(30.0f, 100.0f, this.g.getResources().getColor(R.color.colorControlNormal), linkedList, new float[]{30.0f, 40.0f, 50.0f, 60.0f, 70.0f, 80.0f, 90.0f, 100.0f});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i, boolean z) {
        if (z && i == this.aj) {
            return;
        }
        if (i()) {
            if (Math.round(this.ai) == 90.0f && Math.round(this.f28801b) == 80.0f && Math.round(this.f28800a) == 70.0f && Math.round(this.ax) == 60.0f && Math.round(this.bh) == 50.0f) {
                this.ai = 90.0f;
                this.f28801b = 80.0f;
                this.f28800a = 70.0f;
                this.ax = 60.0f;
                this.bh = 50.0f;
                ReleaseLogUtil.d("HeartRateSectionActivity", "reset maxPercent");
                return;
            }
            return;
        }
        if (Math.round(this.ab) == 95.0f && Math.round(this.z) == 88.0f && Math.round(this.ad) == 84.0f && Math.round(this.v) == 74.0f && Math.round(this.y) == 59.0f) {
            this.ab = 95.0f;
            this.z = 88.0f;
            this.ad = 84.0f;
            this.v = 74.0f;
            this.y = 59.0f;
            ReleaseLogUtil.d("HeartRateSectionActivity", "reset HrrPercent");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        this.ae = Math.round((this.aj * this.ai) / 100.0f);
        this.f28802c = Math.round((this.aj * this.f28801b) / 100.0f);
        this.e = Math.round((this.aj * this.f28800a) / 100.0f);
        this.at = Math.round((this.aj * this.ax) / 100.0f);
        int iRound = Math.round((this.aj * this.bh) / 100.0f);
        this.bg = iRound;
        LogUtil.a("HeartRateSectionActivity", "processAllValue LimitPercent = ", Float.valueOf(this.ai), ", mLimitCount = ", Integer.valueOf(this.ae), ", AnaerobicPercent = ", Float.valueOf(this.f28801b), "， mAnaerobic = ", Integer.valueOf(this.f28802c), ", AerobicPercent = ", Float.valueOf(this.f28800a), ", ReduceFatPercent = ", Float.valueOf(this.ax), ", mMaxCount = ", Integer.valueOf(this.aj), ", mReduceFat = ", Integer.valueOf(this.at), ", WarmUpPercent = ", Float.valueOf(this.bh), ", mWarmUp = ", Integer.valueOf(iRound));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z() {
        int i = this.aj - this.az;
        float f = i;
        this.ae = Math.round((this.ab * f) / 100.0f) + this.az;
        this.f28802c = Math.round((this.z * f) / 100.0f) + this.az;
        this.e = Math.round((this.ad * f) / 100.0f) + this.az;
        this.at = Math.round((this.v * f) / 100.0f) + this.az;
        int iRound = Math.round((f * this.y) / 100.0f) + this.az;
        this.bg = iRound;
        LogUtil.a("HeartRateSectionActivity", "updateRestHeartRate mHrrAnaerobicPercent = ", Float.valueOf(this.ab), ", mLimitCount = ", Integer.valueOf(this.ae), ", mHrrAnaerobicBasePercent = ", Float.valueOf(this.z), ", hrr = ", Integer.valueOf(i), ", mAnaerobic = ", Integer.valueOf(this.f28802c), ", mHrrLacticAcidPercent = ", Float.valueOf(this.ad), ", mAerobic = ", Integer.valueOf(this.e), ", mHrrAerobicPercent = ", Float.valueOf(this.v), ", mReduceFat = ", Integer.valueOf(this.at), ", mHrrAerobicBasePercent = ", Float.valueOf(this.y), ", mWarmUp = ", Integer.valueOf(iRound));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i) {
        if (!i()) {
            int i2 = this.az;
            int i3 = i - i2;
            if (i3 == 0) {
                LogUtil.j("HeartRateSectionActivity", "updateUiPercent reserve is zero");
                return;
            }
            float f = i3;
            this.ab = c(((this.ae - i2) * 100) / f);
            this.z = c(((this.f28802c - this.az) * 100) / f);
            this.ad = c(((this.e - this.az) * 100) / f);
            this.v = c(((this.at - this.az) * 100) / f);
            this.y = c(((this.bg - this.az) * 100) / f);
        } else {
            if (i == 0) {
                LogUtil.j("HeartRateSectionActivity", "updateUiPercent maxHeartRateValue is zero");
                return;
            }
            float f2 = i;
            this.ai = c((this.ae * 100) / f2);
            this.f28801b = c((this.f28802c * 100) / f2);
            this.f28800a = c((this.e * 100) / f2);
            this.ax = c((this.at * 100) / f2);
            this.bh = c((this.bg * 100) / f2);
        }
        LogUtil.a("HeartRateSectionActivity", "updateUiPercent LimitPercent = ", Float.valueOf(this.ai), ", AnaerobicPercent = ", Float.valueOf(this.f28801b), ", AerobicPercent = ", Float.valueOf(this.f28800a), ", ReduceFatPercent = ", Float.valueOf(this.ax), ", WarmUpPercent = ", Float.valueOf(this.bh));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        HealthTextView healthTextView = this.bm;
        if (healthTextView == null || this.bi == null) {
            return;
        }
        healthTextView.setBackgroundResource(R.drawable.pace_range_time_background);
        this.bi.setBackgroundResource(R.drawable.pace_range_time_background);
        this.bi = null;
        this.bm = null;
    }

    private void a(boolean z) {
        String string;
        if (z) {
            if (i()) {
                string = getString(R.string.IDS_hwh_motiontrack_heart_rate_upper_limit, new Object[]{getString(R.string.IDS_rate_zone_maximum_threshold)});
            } else {
                string = getString(R.string.IDS_hwh_motiontrack_heart_rate_upper_limit, new Object[]{getString(R.string.IDS_rate_zone_hrr_anaerobicAdvance_threshold)});
            }
        } else {
            string = getString(R.string.IDS_main_watch_detail_max_heart_rate_string);
        }
        l();
        int i = this.aj;
        a(Math.max(100, this.az + 15), HeartRateThresholdConfig.HEART_RATE_LIMIT, 1114, i, string);
        a(AnalyticsValue.HEALTH_HEART_RATE_MAX_2090003.value(), (String) null);
    }

    private void g() {
        this.g = this;
        CustomTitleBar customTitleBar = (CustomTitleBar) qsp.a(this, R.id.heart_rate_section_title_bar);
        this.be = customTitleBar;
        customTitleBar.setRightButtonVisibility(0);
        this.be.setRightButtonDrawable(getDrawable(R.drawable.ic_public_ok), qre.f(R.string.IDS_contact_confirm));
        this.be.setRightButtonOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.main.stories.settings.activity.heartrate.HeartRateSectionActivity.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (HeartRateSectionActivity.this.b()) {
                    HeartRateSectionActivity.this.s();
                    HeartRateSectionActivity.this.y();
                } else {
                    HeartRateSectionActivity.this.k();
                }
            }
        });
        this.be.setLeftButtonOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.main.stories.settings.activity.heartrate.HeartRateSectionActivity.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (!HeartRateSectionActivity.this.j() || !HeartRateSectionActivity.this.ag || !HeartRateSectionActivity.this.b()) {
                    if (HeartRateSectionActivity.this.j() || HeartRateSectionActivity.this.b()) {
                        HeartRateSectionActivity.this.w();
                        return;
                    } else if (HeartRateSectionActivity.this.aa) {
                        HeartRateSectionActivity.this.k();
                        return;
                    } else {
                        HeartRateSectionActivity.this.finish();
                        return;
                    }
                }
                HeartRateSectionActivity.this.u();
            }
        });
        qsp.a(this, R.id.max_layout).setOnClickListener(this);
        this.ak = (HealthTextView) qsp.a(this, R.id.max_textview);
        RelativeLayout relativeLayout = (RelativeLayout) qsp.a(this, R.id.rest_heart_rate_layout);
        this.ba = relativeLayout;
        relativeLayout.setOnClickListener(this);
        this.ac = (HealthTextView) qsp.a(this, R.id.rest_heart_rate_textview);
        qsp.a(this, R.id.reset_heart_rate_zone).setOnClickListener(this.aw);
        if (LanguageUtil.ba(BaseApplication.getContext())) {
            ((ImageView) qsp.a(this, R.id.max_enter_ic)).setImageResource(R.drawable.common_ui_arrow_left);
            ((ImageView) qsp.a(this, R.id.rest_heart_rate_enter_ic)).setImageResource(R.drawable.common_ui_arrow_left);
        }
        h();
    }

    private void h() {
        this.ah = (HealthTextView) findViewById(R.id.tv_heart_rate_zone_01);
        this.j = (HealthTextView) findViewById(R.id.tv_heart_rate_zone_name_02);
        this.d = (HealthTextView) findViewById(R.id.tv_heart_rate_zone_name_03);
        this.au = (HealthTextView) findViewById(R.id.tv_heart_rate_zone_name_04);
        this.bk = (HealthTextView) findViewById(R.id.tv_heart_rate_zone_name_5);
        HealthTextView healthTextView = (HealthTextView) findViewById(R.id.heart_rate_max_value);
        this.s = healthTextView;
        healthTextView.setOnClickListener(this);
        HealthTextView healthTextView2 = (HealthTextView) findViewById(R.id.heart_rate_limit_setting_value);
        this.p = healthTextView2;
        healthTextView2.setOnClickListener(this);
        HealthTextView healthTextView3 = (HealthTextView) findViewById(R.id.heart_rate_anaerobic_value);
        this.n = healthTextView3;
        healthTextView3.setOnClickListener(this);
        HealthTextView healthTextView4 = (HealthTextView) findViewById(R.id.heart_rate_aerobic_value);
        this.l = healthTextView4;
        healthTextView4.setOnClickListener(this);
        HealthTextView healthTextView5 = (HealthTextView) findViewById(R.id.heart_fat_reduce_value);
        this.q = healthTextView5;
        healthTextView5.setOnClickListener(this);
        HealthTextView healthTextView6 = (HealthTextView) findViewById(R.id.heart_rate_warm_up_value);
        this.u = healthTextView6;
        healthTextView6.setOnClickListener(this);
        HealthTextView healthTextView7 = (HealthTextView) findViewById(R.id.heart_rate_max_percent);
        this.r = healthTextView7;
        healthTextView7.setOnClickListener(this);
        HealthTextView healthTextView8 = (HealthTextView) findViewById(R.id.heart_rate_limit_setting_percent);
        this.t = healthTextView8;
        healthTextView8.setOnClickListener(this);
        HealthTextView healthTextView9 = (HealthTextView) findViewById(R.id.heart_rate_anaerobic_percent);
        this.k = healthTextView9;
        healthTextView9.setOnClickListener(this);
        HealthTextView healthTextView10 = (HealthTextView) findViewById(R.id.heart_rate_aerobic_percent);
        this.o = healthTextView10;
        healthTextView10.setOnClickListener(this);
        HealthTextView healthTextView11 = (HealthTextView) findViewById(R.id.heart_fat_reduce_percent);
        this.m = healthTextView11;
        healthTextView11.setOnClickListener(this);
        HealthTextView healthTextView12 = (HealthTextView) findViewById(R.id.heart_rate_warm_up_percent);
        this.x = healthTextView12;
        healthTextView12.setOnClickListener(this);
        ((HealthTextView) qsp.a(this, R.id.tv_heart_percent_range_result_title)).setText(getString(R.string.IDS_hwh_motiontrack_heart_rate_percentage, new Object[]{Character.valueOf(new DecimalFormatSymbols().getPercent())}));
        this.w = (HeartRateZoneSeekBar) qsp.a(this, R.id.kRangeSeekBarView);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        LogUtil.a("HeartRateSectionActivity", "onBackPressed");
        if (j() && this.ag && b()) {
            u();
            return;
        }
        if (j() || b()) {
            w();
        } else if (this.aa) {
            k();
        } else {
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        if (this.aq != this.aj) {
            nkd.c().e(this.af, this.ay);
        }
        Intent intent = new Intent(this, (Class<?>) HeartRateZoneSettingActivity.class);
        intent.putExtra("maxHeartValue", this.aj);
        intent.putExtra("heartRateZone1", this.ae);
        intent.putExtra("heartRateZone2", this.f28802c);
        intent.putExtra("heartRateZone3", this.e);
        intent.putExtra("heartRateZone4", this.at);
        intent.putExtra("heartRateZone5", this.bg);
        intent.putExtra("intent_extra_max_heart_rate_change", this.aq != this.aj);
        intent.putExtra("intent_extra_other_heart_rate_change", j());
        if (!i()) {
            intent.putExtra("intent_extra_hrr_heart_rate", this.az);
            intent.putExtra("heartRatePercent1", this.ab);
            intent.putExtra("heartRatePercent2", this.z);
            intent.putExtra("heartRatePercent3", this.ad);
            intent.putExtra("heartRatePercent4", this.v);
            intent.putExtra("heartRatePercent5", this.y);
        } else {
            intent.putExtra("heartRatePercent1", this.ai);
            intent.putExtra("heartRatePercent2", this.f28801b);
            intent.putExtra("heartRatePercent3", this.f28800a);
            intent.putExtra("heartRatePercent4", this.ax);
            intent.putExtra("heartRatePercent5", this.bh);
        }
        setResult(3, intent);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b() {
        int i;
        int i2;
        int i3;
        int i4 = this.ae;
        return i4 >= this.aj || i4 <= (i = this.f28802c) || i <= (i2 = this.e) || i2 <= (i3 = this.at) || i3 <= this.bg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s() {
        int i = this.ae;
        int i2 = this.aj;
        if (i >= i2) {
            d(this.p, this.t);
            return;
        }
        int i3 = this.f28802c;
        if (i <= i3) {
            if (i2 <= i3) {
                d(this.n, this.k);
                return;
            } else {
                d(this.p, this.t);
                return;
            }
        }
        int i4 = this.e;
        if (i3 <= i4) {
            if (i <= i4) {
                d(this.l, this.o);
                return;
            } else {
                d(this.n, this.k);
                return;
            }
        }
        int i5 = this.at;
        if (i4 <= i5) {
            if (i3 <= i5) {
                d(this.q, this.m);
                return;
            } else {
                d(this.l, this.o);
                return;
            }
        }
        int i6 = this.bg;
        if (i5 <= i6) {
            if (i4 <= i6) {
                d(this.u, this.x);
            } else {
                d(this.q, this.m);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w() {
        e(this.bd);
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = new NoTitleCustomAlertDialog.Builder(this).a(getString(R.string.IDS_pace_range_exit_save_content)).d(getString(R.string.IDS_btn_discard), new View.OnClickListener() { // from class: com.huawei.ui.main.stories.settings.activity.heartrate.HeartRateSectionActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (HeartRateSectionActivity.this.aa) {
                    HeartRateSectionActivity.this.f();
                    HeartRateSectionActivity.this.k();
                } else {
                    HeartRateSectionActivity.this.finish();
                }
            }
        }).a(getString(R.string.IDS_save), new View.OnClickListener() { // from class: com.huawei.ui.main.stories.settings.activity.heartrate.HeartRateSectionActivity.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (HeartRateSectionActivity.this.b()) {
                    HeartRateSectionActivity.this.s();
                    HeartRateSectionActivity.this.y();
                } else {
                    HeartRateSectionActivity.this.k();
                }
            }
        }).c();
        this.bd = noTitleCustomAlertDialogC;
        noTitleCustomAlertDialogC.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        if (this.aa) {
            a();
            e(this.aj);
            k();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u() {
        e(this.bb);
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = new NoTitleCustomAlertDialog.Builder(this).a(getString(R.string.IDS_heart_zone_waring_exit)).d(getString(R.string.IDS_hw_common_ui_dialog_cancel), new View.OnClickListener() { // from class: com.huawei.ui.main.stories.settings.activity.heartrate.HeartRateSectionActivity.9
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (HeartRateSectionActivity.this.bb != null) {
                    HeartRateSectionActivity.this.bb.dismiss();
                }
            }
        }).a(getString(R.string.IDS_hw_common_ui_dialog_confirm), new View.OnClickListener() { // from class: com.huawei.ui.main.stories.settings.activity.heartrate.HeartRateSectionActivity.10
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                HeartRateSectionActivity.this.p();
                HeartRateSectionActivity.this.finish();
            }
        }).c();
        this.bb = noTitleCustomAlertDialogC;
        noTitleCustomAlertDialogC.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y() {
        e(this.bc);
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = new NoTitleCustomAlertDialog.Builder(this).a(getString(R.string.IDS_heart_zone_waring_content)).a(getString(R.string.IDS_common_notification_know_tips), new View.OnClickListener() { // from class: com.huawei.ui.main.stories.settings.activity.heartrate.HeartRateSectionActivity.7
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                HeartRateSectionActivity.this.ag = true;
            }
        }).c();
        this.bc = noTitleCustomAlertDialogC;
        noTitleCustomAlertDialogC.show();
        this.bc.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.huawei.ui.main.stories.settings.activity.heartrate.HeartRateSectionActivity.6
            @Override // android.content.DialogInterface.OnCancelListener
            public void onCancel(DialogInterface dialogInterface) {
                HeartRateSectionActivity.this.ag = true;
            }
        });
    }

    private void e(BaseDialog baseDialog) {
        if (baseDialog == null || !baseDialog.isShowing()) {
            return;
        }
        baseDialog.dismiss();
    }

    private void d(HealthTextView healthTextView, HealthTextView healthTextView2) {
        if (healthTextView2 == null || healthTextView == null) {
            return;
        }
        healthTextView.setBackgroundResource(R.drawable.pace_range_time_warning_background);
        healthTextView2.setBackgroundResource(R.drawable.pace_range_time_warning_background);
        this.bi = healthTextView;
        this.bm = healthTextView2;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == null) {
            return;
        }
        if (qrs.c(600)) {
            LogUtil.e("HeartRateSectionActivity", "CLICK IS FAST");
            return;
        }
        if (view.getId() == R.id.max_layout) {
            a(false);
            return;
        }
        if (view.getId() == R.id.rest_heart_rate_layout) {
            e();
            return;
        }
        if (view == this.s || view == this.r) {
            a(true);
            return;
        }
        if (view == this.p || view == this.t) {
            t();
            return;
        }
        if (view == this.n || view == this.k) {
            o();
            return;
        }
        if (view == this.l || view == this.o) {
            n();
            return;
        }
        if (view == this.q || view == this.m) {
            q();
        } else if (view == this.u || view == this.x) {
            x();
        }
    }

    private void e() {
        a(30, Math.min(110, this.aj - 15), 1115, this.az, getString(R.string.IDS_resting_heart_rate_string));
        a(AnalyticsValue.HEALTH_HEART_RATE_REST_2090010.value(), (String) null);
    }

    private void a(int i, int i2, int i3, int i4, String str) {
        wly.d dVar;
        wly wlyVarC;
        if (i <= i2 && (wlyVarC = (dVar = new wly.d(this, this.h, i3)).c(c(i, i2), Integer.valueOf(i4))) != null) {
            dVar.e(str);
            wlyVarC.show();
        }
    }

    private int[] c(int i, int i2) {
        if (i > i2) {
            return new int[0];
        }
        int[] iArr = new int[(i2 - i) + 1];
        for (int i3 = i; i3 <= i2; i3++) {
            iArr[i3 - i] = i3;
        }
        return iArr;
    }

    private void t() {
        String string;
        int i;
        if (i()) {
            string = getString(R.string.IDS_hwh_motiontrack_heart_rate_upper_limit, new Object[]{getString(R.string.IDS_rate_zone_anaerobic_threshold)});
            i = this.an;
        } else {
            string = getString(R.string.IDS_hwh_motiontrack_heart_rate_upper_limit, new Object[]{getString(R.string.IDS_rate_zone_hrr_anaerobicBase_threshold)});
            i = this.am;
        }
        l();
        a(i, HeartRateThresholdConfig.HEART_RATE_LIMIT, 1, this.ae, string);
        a(AnalyticsValue.HEALTH_HEART_RATE_MAXIMUM_2090004.value(), (String) null);
    }

    private void o() {
        String string;
        int i;
        if (i()) {
            string = getString(R.string.IDS_hwh_motiontrack_heart_rate_upper_limit, new Object[]{getString(R.string.IDS_rate_zone_aerobic_threshold)});
            i = this.an;
        } else {
            string = getString(R.string.IDS_hwh_motiontrack_heart_rate_upper_limit, new Object[]{getString(R.string.IDS_rate_zone_hrr_lacticAcid_threshold)});
            i = this.am;
        }
        l();
        a(i, HeartRateThresholdConfig.HEART_RATE_LIMIT, 2, this.f28802c, string);
        a(AnalyticsValue.HEALTH_HEART_RATE_ANAEROBIC_ENDURANCE_2090005.value(), (String) null);
    }

    private void n() {
        String string;
        int i;
        if (i()) {
            string = getString(R.string.IDS_hwh_motiontrack_heart_rate_upper_limit, new Object[]{getString(R.string.IDS_rate_zone_fatburn_threshold_string)});
            i = this.an;
        } else {
            string = getString(R.string.IDS_hwh_motiontrack_heart_rate_upper_limit, new Object[]{getString(R.string.IDS_rate_zone_hrr_aerobicAdvance_threshold)});
            i = this.am;
        }
        l();
        a(i, HeartRateThresholdConfig.HEART_RATE_LIMIT, 3, this.e, string);
        a(AnalyticsValue.HEALTH_HEART_RATE_AEROBIC_ENDURANCE_2090006.value(), (String) null);
    }

    private void q() {
        String string;
        int i;
        if (i()) {
            string = getString(R.string.IDS_hwh_motiontrack_heart_rate_upper_limit, new Object[]{getString(R.string.IDS_rate_zone_warmup_threshold)});
            i = this.an;
        } else {
            string = getString(R.string.IDS_hwh_motiontrack_heart_rate_upper_limit, new Object[]{getString(R.string.IDS_rate_zone_hrr_aerobicBase_threshold)});
            i = this.am;
        }
        l();
        a(i, HeartRateThresholdConfig.HEART_RATE_LIMIT, 4, this.at, string);
        a(AnalyticsValue.HEALTH_HEART_RATE_FAT_BRUNING_2090007.value(), (String) null);
    }

    private void x() {
        String string;
        int i;
        if (i()) {
            string = getString(R.string.IDS_hwh_motiontrack_heart_rate_lower_limit, new Object[]{getString(R.string.IDS_rate_zone_warmup_threshold)});
            i = this.an;
        } else {
            string = getString(R.string.IDS_hwh_motiontrack_heart_rate_lower_limit, new Object[]{getString(R.string.IDS_rate_zone_hrr_aerobicBase_threshold)});
            i = this.am;
        }
        l();
        a(i, HeartRateThresholdConfig.HEART_RATE_LIMIT, 5, this.bg, string);
        a(AnalyticsValue.HEALTH_HEART_RATE_WARM_UP_2090008.value(), (String) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2) {
        HashMap map = new HashMap(16);
        map.put("click", "1");
        if (str2 != null) {
            map.put("type", str2);
        }
        lmf.d().c(this.g, str, map, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        HeartRateThresholdConfig heartRateThresholdConfigE = e(this.af, this.ay);
        this.f = heartRateThresholdConfigE.getWarningEnable();
        this.bf = heartRateThresholdConfigE.getWarningLimit();
        this.aj = heartRateThresholdConfigE.getMaxThreshold();
        if (i()) {
            this.ae = heartRateThresholdConfigE.getAnaerobicThreshold();
            this.f28802c = heartRateThresholdConfigE.getAerobicThreshold();
            this.e = heartRateThresholdConfigE.getFatBurnThreshold();
            this.at = heartRateThresholdConfigE.getWarmUpThreshold();
            this.bg = heartRateThresholdConfigE.getFitnessThreshold();
        } else {
            this.ae = heartRateThresholdConfigE.getAnaerobicAdvanceThreshold();
            this.f28802c = heartRateThresholdConfigE.getAnaerobicBaseThreshold();
            this.e = heartRateThresholdConfigE.getLacticAcidThreshold();
            this.at = heartRateThresholdConfigE.getAerobicAdvanceThreshold();
            this.bg = heartRateThresholdConfigE.getAerobicBaseThreshold();
        }
        LogUtil.a("HeartRateSectionActivity", "initData mHasMaxAlarm:", Boolean.valueOf(this.f), ", mUpLimit = ", Integer.valueOf(this.bf), ", mMaxCount = ", Integer.valueOf(this.aj), ",mLimitCount = ", Integer.valueOf(this.ae), ", mAnaerobic = ", Integer.valueOf(this.f28802c), ", mAerobic = ", Integer.valueOf(this.e), ", mReduceFat = ", Integer.valueOf(this.at), ", mWarmUp = ", Integer.valueOf(this.bg));
    }

    private HeartRateThresholdConfig e(boolean z, int i) {
        if (z) {
            return nkd.c().b().b().getStudentHeartRateThresholdData();
        }
        return nkd.c().a().getPostureType(i);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
