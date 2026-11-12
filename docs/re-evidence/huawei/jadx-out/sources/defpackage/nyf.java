package defpackage;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.device.base.AbstractFitnessClient;
import com.huawei.health.sportservice.SportLifecycle;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.indoorequip.R;
import com.huawei.indoorequip.doublescreen.IndoorTvBaseDisplay;
import com.huawei.indoorequip.magnet.RealTimeDynamicChartView;
import com.huawei.indoorequip.viewmodel.BaseRealTimeDynamicChartViewModel;
import com.huawei.indoorequip.viewmodel.IndoorEquipViewModel;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.progressbar.HealthProgressBar;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public class nyf extends IndoorTvBaseDisplay implements SportLifecycle {
    private static float d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private LinearLayout f43942a;
    private boolean aa;
    private boolean ab;
    private RelativeLayout ac;
    private ImageView ad;
    private HealthTextView ae;
    private LinearLayout af;
    private HealthTextView ag;
    private String ah;
    private ImageView ai;
    private LinearLayout aj;
    private HealthTextView ak;
    private HealthProgressBar al;
    private HealthTextView am;
    private HealthTextView an;
    private HealthTextView ao;
    private int ap;
    private HealthTextView aq;
    private HealthTextView ar;
    private HealthTextView as;
    private HealthTextView at;
    private LinearLayout au;
    private ImageView av;
    private ImageView aw;
    private ImageView ax;
    private HealthTextView ay;
    private BaseRealTimeDynamicChartViewModel az;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthTextView f43943b;
    private HealthTextView ba;
    private HealthTextView bb;
    private LinearLayout bc;
    private HealthTextView bd;
    private ViewStub be;
    private ImageView bf;
    private HealthTextView bg;
    private HealthTextView bh;
    private LinearLayout bi;
    private LinearLayout bj;
    private HealthTextView bl;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthTextView f43944c;
    private HealthTextView e;
    private HealthTextView f;
    private HealthTextView g;
    private HealthTextView h;
    private int i;
    private HealthTextView j;
    private HealthTextView k;
    private HealthTextView l;
    private HealthTextView m;
    private ImageView n;
    private HealthTextView o;
    private BaseRealTimeDynamicChartViewModel p;
    private LinearLayout q;
    private LinearLayout r;
    private HealthTextView s;
    private LinearLayout t;
    private boolean u;
    private Handler v;
    private BaseRealTimeDynamicChartViewModel w;
    private boolean x;
    private BaseRealTimeDynamicChartViewModel y;
    private boolean z;

    @Override // com.huawei.health.sportservice.SportLifecycle
    public void onPauseSport() {
        this.ap = 2;
        LogUtil.a("IDEQ_IndoorTreadmillTvDisplay", "tv sport state: ", 2);
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    public void onResumeSport() {
        this.ap = 1;
        a(1);
        LogUtil.a("IDEQ_IndoorTreadmillTvDisplay", "tv sport state: ", Integer.valueOf(this.ap));
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    public void onStartSport() {
        this.ap = 1;
        a(1);
        LogUtil.a("IDEQ_IndoorTreadmillTvDisplay", "tv sport state: ", Integer.valueOf(this.ap));
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    /* JADX INFO: renamed from: onStopSport */
    public void m825x32b3e3a1() {
        this.ap = 3;
        LogUtil.a("IDEQ_IndoorTreadmillTvDisplay", "tv sport state: ", 3);
    }

    public nyf(Context context, Display display, boolean z, IndoorEquipViewModel indoorEquipViewModel) {
        super(context, display);
        this.ab = false;
        this.u = false;
        this.z = false;
        this.x = false;
        this.aa = false;
        this.ap = 0;
        this.ah = b(Locale.getDefault());
        this.v = new Handler() { // from class: nyf.2
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                if (message == null) {
                    LogUtil.e("IDEQ_IndoorTreadmillTvDisplay", "msg == null");
                    return;
                }
                super.handleMessage(message);
                int i = message.what;
                if (i == 2020) {
                    LogUtil.a("IDEQ_IndoorTreadmillTvDisplay", "accept update ui msg");
                    if (message.obj instanceof HashMap) {
                        nyf.this.d((HashMap) message.obj);
                        return;
                    }
                    return;
                }
                if (i == 10010) {
                    nyf.this.mRunway.setBackgroundResource(R.drawable.runway2_2);
                    nyf.this.e(10020);
                } else {
                    if (i != 10020) {
                        return;
                    }
                    nyf.this.mRunway.setBackgroundResource(R.drawable.runway2_3);
                    nyf.this.e(10010);
                }
            }
        };
        this.mHasWear = z;
        this.mContext = context;
        this.mViewModel = indoorEquipViewModel;
        if (this.mViewModel != null) {
            this.ap = this.mViewModel.getSportStatus();
            this.ab = this.mViewModel.p();
            this.mHasRunPostureDevice = this.mViewModel.r();
        }
        LogUtil.a("IDEQ_IndoorTreadmillTvDisplay", "Constructor, hasRunPostureDevice = ", Boolean.valueOf(this.mHasRunPostureDevice), ",ishasWear = ", Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i) {
        Handler handler = this.v;
        if (handler != null && this.ap == 1) {
            handler.sendEmptyMessageDelayed(i, nzc.b(d));
            return;
        }
        if (handler != null) {
            handler.removeMessages(10010);
            this.v.removeMessages(10020);
        }
        this.x = false;
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.mHasRunPostureDevice) {
            setContentView(R.layout.ie_data_show_treadmill_aw70_tv);
            this.i = 1;
        } else {
            setContentView(R.layout.ie_data_show_treadmill_without_aw70_tv);
            this.i = 0;
        }
        initWindowConfig();
        a(this.ap);
        l();
        this.aa = true;
    }

    @Override // android.app.Presentation
    public void onDisplayRemoved() {
        LogUtil.a("IDEQ_IndoorTreadmillTvDisplay", "Treadmill tv display destroy.");
    }

    private void l() {
        BitmapDrawable bitmapDrawableE;
        if (this.mHasRunPostureDevice) {
            LinearLayout linearLayout = (LinearLayout) findViewById(R.id.include_landscape_aw70_other_tv);
            this.af = linearLayout;
            linearLayout.setVisibility(0);
            if (this.mViewModel.q()) {
                findViewById(R.id.view_zero_one_line).setVisibility(0);
                findViewById(R.id.rl_three_line_data).setVisibility(8);
                findViewById(R.id.view_three_four_line).setVisibility(8);
                findViewById(R.id.rl_four_line_data).setVisibility(8);
            }
        } else {
            this.af = (LinearLayout) findViewById(R.id.leftlayout);
        }
        this.o = (HealthTextView) findViewById(R.id.duration_type);
        this.e = (HealthTextView) findViewById(R.id.calories_type);
        this.f43942a = (LinearLayout) findViewById(R.id.calories_layout);
        this.f43943b = (HealthTextView) findViewById(R.id.calories_value);
        this.f43944c = (HealthTextView) findViewById(R.id.calories_unit);
        this.ba = (HealthTextView) findViewById(R.id.step_type);
        this.au = (LinearLayout) findViewById(R.id.step_layout);
        this.bc = (LinearLayout) findViewById(R.id.step_type_layout);
        this.ax = (ImageView) findViewById(R.id.step_device);
        this.ar = (HealthTextView) findViewById(R.id.step_value);
        this.bd = (HealthTextView) findViewById(R.id.step_unit);
        initNormalView();
        this.mLogoLayout = (LinearLayout) findViewById(R.id.logoLayout);
        this.mRunway = (ImageView) findViewById(R.id.runway);
        this.mRunwayBackground = (ImageView) findViewById(R.id.runwaybackground);
        this.al = (HealthProgressBar) findViewById(R.id.hw_recycler_loading_hpb);
        this.mBtIcon = (ImageView) findViewById(R.id.ie_bt_icon);
        if (LanguageUtil.ba(this.mContext) && (bitmapDrawableE = qqz.e(this.mContext, R.id.ie_bt_icon)) != null) {
            this.mBtIcon.setImageDrawable(bitmapDrawableE);
        }
        this.mBtBoltConnectIcon = (ImageView) findViewById(R.id.ie_bolt_icon);
        if (this.ab) {
            this.mBtBoltConnectIcon.setVisibility(0);
            this.mBtBoltConnectIcon.setImageResource(nzc.a(this.mViewModel.o()));
            changeBtBoltIconSize();
        }
        this.mLogoImage = (ImageView) findViewById(R.id.logoImage);
        this.an = (HealthTextView) findViewById(R.id.logoText);
        g();
        c();
        b();
        f();
        y();
    }

    @Override // com.huawei.indoorequip.doublescreen.IndoorTvBaseDisplay
    public void initNormalView() {
        findViewById(R.id.view_stub_speed).setVisibility(0);
        if (isTargetType()) {
            initTargetLayout();
            if (nyg.b(this.mViewModel)) {
                ((LinearLayout) findViewById(R.id.distance_left_view)).setVisibility(0);
                findViewById(R.id.duration_left_view).setVisibility(8);
                n();
            }
            if (nyg.d(this.mViewModel)) {
                LinearLayout linearLayout = (LinearLayout) findViewById(R.id.distance_right_view);
                this.h = (HealthTextView) findViewById(R.id.distance_right_value);
                this.j = (HealthTextView) findViewById(R.id.distance_right_type);
                linearLayout.setVisibility(0);
                e(linearLayout);
                k();
            }
        } else {
            ViewStub viewStub = (ViewStub) findViewById(R.id.view_stub_heartrate_distance);
            this.be = viewStub;
            viewStub.setVisibility(0);
        }
        this.o.setText(R.string.IDS_hw_motiontrack_segment_use_time);
        this.l = (HealthTextView) findViewById(R.id.duration_value);
        this.f = (HealthTextView) findViewById(R.id.distance_value);
        this.g = (HealthTextView) findViewById(R.id.distance_unit);
        this.aq = (HealthTextView) findViewById(R.id.speed_type);
        this.as = (HealthTextView) findViewById(R.id.speed_value);
        this.ao = (HealthTextView) findViewById(R.id.speed_unit);
        this.ac = (RelativeLayout) findViewById(R.id.heartrate_layout);
        this.mHeartRateImage = (ImageView) findViewById(R.id.heartrate_image);
        this.ad = (ImageView) findViewById(R.id.heartrate_device);
        this.mBackground = (ImageView) findViewById(R.id.background_layout_tv);
        if (this.mHasWear) {
            this.mHeartRateType = (HealthTextView) findViewById(R.id.heartrate_type);
            this.mHeartRate = (HealthTextView) findViewById(R.id.heartrate_value);
            this.mHeartRateUnit = (HealthTextView) findViewById(R.id.heartrate_unit);
        }
    }

    private void n() {
        this.h = (HealthTextView) findViewById(R.id.distance_left_value);
        this.j = (HealthTextView) findViewById(R.id.distance_left_type);
        if (this.mHasRunPostureDevice) {
            c(this.h, 105.0f);
            c(this.j, 105.0f);
        }
    }

    private void k() {
        View viewFindViewById = findViewById(R.id.calorie_right_view);
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(8);
        } else {
            this.f43942a.setVisibility(8);
        }
    }

    private void c() {
        if (this.mHasWear) {
            r();
            ThreadPoolManager.c().execute(new Runnable() { // from class: nyd
                @Override // java.lang.Runnable
                public final void run() {
                    this.d.e();
                }
            });
        } else {
            t();
        }
        if (this.mHasRunPostureDevice) {
            m();
            o();
            return;
        }
        this.aj = (LinearLayout) findViewById(R.id.rightlayout);
        HealthTextView healthTextView = (HealthTextView) findViewById(R.id.step_frequency_value);
        this.at = healthTextView;
        healthTextView.setTextSize(0, this.mScale * this.at.getTextSize());
        HealthTextView healthTextView2 = (HealthTextView) findViewById(R.id.step_frequency_type);
        this.bb = healthTextView2;
        healthTextView2.setTextSize(0, this.mScale * this.bb.getTextSize());
        HealthTextView healthTextView3 = (HealthTextView) findViewById(R.id.step_frequency_unit);
        this.ay = healthTextView3;
        healthTextView3.setTextSize(0, this.mScale * this.ay.getTextSize());
        this.av = (ImageView) findViewById(R.id.step_frequency_device);
        this.aw = (ImageView) findViewById(R.id.step_frequency_arrow);
        HealthTextView healthTextView4 = (HealthTextView) findViewById(R.id.pace_type);
        this.ak = healthTextView4;
        healthTextView4.setTextSize(0, this.mScale * this.ak.getTextSize());
        HealthTextView healthTextView5 = (HealthTextView) findViewById(R.id.pace_value);
        this.am = healthTextView5;
        healthTextView5.setTextSize(0, this.mScale * this.am.getTextSize());
    }

    /* synthetic */ void e() {
        if (this.mViewModel != null) {
            initHeartRateZone(this.mViewModel.getSportType());
        }
    }

    private void t() {
        ae();
        if (isTargetType()) {
            return;
        }
        this.ac.setVisibility(8);
        this.f.setTextSize(0, dp2px(80.0f) * this.mScale);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, 0, 0, qrs.d(this.mContext, this.mScale * 3.0f));
        layoutParams.addRule(14);
        this.f.setLayoutParams(layoutParams);
        this.g.setTextSize(0, dp2px(13.0f) * this.mScale);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(3, R.id.distance_value);
        layoutParams2.addRule(14);
        this.g.setLayoutParams(layoutParams2);
    }

    private void r() {
        if (isTargetType()) {
            ae();
            return;
        }
        this.ac.setVisibility(0);
        if (this.mHeartRateType.getLayoutParams() instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.mHeartRateType.getLayoutParams();
            layoutParams.width = (int) (this.mScale * dp2px(85.0f));
            this.mHeartRateType.setLayoutParams(layoutParams);
            ViewGroup.LayoutParams layoutParams2 = this.be.getLayoutParams();
            layoutParams2.width = -2;
            this.be.setLayoutParams(layoutParams2);
        }
    }

    private void ae() {
        this.mBackground.setVisibility(0);
        changeBackgroundSize();
    }

    private void o() {
        if (this.bg.getLayoutParams() instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.bg.getLayoutParams();
            layoutParams.width = (int) (this.mScale * dp2px(93.3f));
            this.bg.setLayoutParams(layoutParams);
        }
        if (this.s.getLayoutParams() instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.s.getLayoutParams();
            layoutParams2.width = (int) (this.mScale * dp2px(80.0f));
            this.s.setLayoutParams(layoutParams2);
        }
        if (this.ae.getLayoutParams() instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) this.ae.getLayoutParams();
            layoutParams3.width = (int) (this.mScale * dp2px(93.3f));
            this.ae.setLayoutParams(layoutParams3);
        }
        if (this.ag.getLayoutParams() instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) this.ag.getLayoutParams();
            layoutParams4.width = (int) (this.mScale * dp2px(93.3f));
            this.ag.setLayoutParams(layoutParams4);
        }
    }

    private void g() {
        if (this.mHasRunPostureDevice) {
            this.l.setTextSize(0, dp2px(20.0f));
            this.as.setTextSize(0, dp2px(20.0f));
        } else {
            this.ao.setTextSize(0, dp2px(13.0f));
        }
        this.as.setTextSize(0, this.mScale * this.as.getTextSize());
        this.ao.setTextSize(0, this.mScale * this.ao.getTextSize());
        this.ao.setMaxWidth((int) (this.mScale * this.ao.getMaxWidth()));
        this.aq.setTextSize(0, this.mScale * this.aq.getTextSize());
        if (this.mHasWear && !isTargetType()) {
            this.mHeartRateType.setTextSize(0, this.mScale * this.mHeartRateType.getTextSize());
            this.mHeartRate.setTextSize(0, this.mScale * this.mHeartRate.getTextSize());
            this.mHeartRateUnit.setTextSize(0, this.mScale * this.mHeartRateUnit.getTextSize());
            this.mHeartRateUnit.setMaxWidth((int) (this.mScale * this.mHeartRateUnit.getMaxWidth()));
        }
        if (!isTargetType()) {
            this.f.setTextSize(0, this.mScale * this.f.getTextSize());
            this.g.setTextSize(0, this.mScale * this.g.getTextSize());
        } else {
            HealthTextView healthTextView = this.h;
            if (healthTextView != null && this.j != null) {
                healthTextView.setTextSize(0, this.mScale * this.h.getTextSize());
                this.j.setTextSize(0, this.mScale * this.j.getTextSize());
            }
        }
        this.l.setTextSize(0, this.mScale * this.l.getTextSize());
        this.an.setTextSize(0, this.mScale * this.an.getTextSize());
        this.o.setTextSize(0, this.mScale * this.o.getTextSize());
        this.e.setTextSize(0, this.mScale * this.e.getTextSize());
        this.f43943b.setTextSize(0, this.mScale * this.f43943b.getTextSize());
        this.f43944c.setTextSize(0, this.mScale * this.f43944c.getTextSize());
        this.ba.setTextSize(0, this.mScale * this.ba.getTextSize());
        this.ar.setTextSize(0, this.mScale * this.ar.getTextSize());
        this.bd.setTextSize(0, this.mScale * this.bd.getTextSize());
        j();
    }

    private void j() {
        HealthTextView healthTextView;
        if ((LanguageUtil.aa(this.mContext) || LanguageUtil.bd(this.mContext) || LanguageUtil.az(this.mContext) || LanguageUtil.am(this.mContext) || LanguageUtil.bb(this.mContext) || LanguageUtil.t(this.mContext) || LanguageUtil.ai(this.mContext)) && this.mHeartRateUnit != null) {
            this.mHeartRateUnit.setTextSize(0, this.mHeartRateUnit.getTextSize() * 0.7f);
        }
        if ((LanguageUtil.ay(this.mContext) || LanguageUtil.h(this.mContext) || LanguageUtil.bb(this.mContext) || LanguageUtil.bf(this.mContext)) && (healthTextView = this.ag) != null) {
            healthTextView.setTextSize(0, healthTextView.getTextSize() * 0.7f);
        }
    }

    private void b() {
        ImageView imageView;
        changeBtIconSize();
        changeRunwaySize();
        d(this.ax);
        changeLogoSize();
        ImageView imageView2 = this.av;
        if (imageView2 != null) {
            d(imageView2);
        }
        if (this.mHasWear) {
            d();
        }
        if (this.mHasRunPostureDevice && (imageView = this.ai) != null) {
            if (imageView.getLayoutParams() instanceof RelativeLayout.LayoutParams) {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.ai.getLayoutParams();
                layoutParams.width = (int) (this.mScale * dp2px(40.0f));
                layoutParams.height = (int) (this.mScale * dp2px(40.0f));
                layoutParams.setMarginStart((int) (this.mScale * dp2px(137.8f)));
                this.ai.setLayoutParams(layoutParams);
            }
            if (this.bf.getLayoutParams() instanceof LinearLayout.LayoutParams) {
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.bf.getLayoutParams();
                layoutParams2.width = (int) (this.mScale * dp2px(5.0f));
                layoutParams2.setMarginStart((int) (this.mScale * dp2px(4.0f)));
                this.bf.setLayoutParams(layoutParams2);
            }
            if (this.n.getLayoutParams() instanceof LinearLayout.LayoutParams) {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) this.n.getLayoutParams();
                layoutParams3.width = (int) (this.mScale * dp2px(5.0f));
                LogUtil.a("IDEQ_IndoorTreadmillTvDisplay", "changeImageSize before", Float.valueOf(this.mContext.getResources().getDisplayMetrics().density));
                LogUtil.a("IDEQ_IndoorTreadmillTvDisplay", "changeImageSize after", Float.valueOf(this.mCurrentDisplayDensity));
                layoutParams3.setMarginStart((int) (this.mScale * dp2px(4.0f)));
                this.n.setLayoutParams(layoutParams3);
            }
            if (this.aj.getLayoutParams() instanceof RelativeLayout.LayoutParams) {
                RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) this.aj.getLayoutParams();
                layoutParams4.width = (int) (this.mScale * dp2px(180.0f));
                LogUtil.a("IDEQ_IndoorTreadmillTvDisplay", "RightLayout.width = ", Float.valueOf(this.mScale * dp2px(180.0f)));
                this.aj.setLayoutParams(layoutParams4);
                return;
            }
            return;
        }
        ai();
    }

    private void ai() {
        if (this.aw.getLayoutParams() instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.aw.getLayoutParams();
            layoutParams.width = (int) (this.mScale * dp2px(5.0f));
            layoutParams.setMargins(0, 0, 0, (int) (this.mScale * dp2px(6.0f)));
            layoutParams.setMarginEnd((int) (this.mScale * dp2px(4.0f)));
            this.aw.setLayoutParams(layoutParams);
        }
    }

    private void d() {
        if (isTargetType()) {
            return;
        }
        if (this.mHeartRateImage.getLayoutParams() instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.mHeartRateImage.getLayoutParams();
            layoutParams.width = (int) (this.mScale * dp2px(196.0f));
            layoutParams.height = (int) (this.mScale * dp2px(163.0f));
            this.mHeartRateImage.setLayoutParams(layoutParams);
        }
        if (this.ad.getLayoutParams() instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.ad.getLayoutParams();
            layoutParams2.width = (int) (this.mScale * dp2px(12.0f));
            layoutParams2.height = (int) (this.mScale * dp2px(12.0f));
            this.ad.setLayoutParams(layoutParams2);
        }
    }

    private void f() {
        ImageView imageView;
        a();
        changeLogoMargin();
        if (this.i == 1) {
            i();
        } else if (this.aj.getLayoutParams() instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.aj.getLayoutParams();
            layoutParams.setMargins(0, (int) (this.mScale * dp2px(73.5f)), 0, (int) (this.mScale * dp2px(73.5f)));
            layoutParams.setMarginStart(((int) this.mScale) * dp2px(146.5f));
            layoutParams.width = ((int) this.mScale) * dp2px(184.8f);
            this.aj.setLayoutParams(layoutParams);
        }
        if (this.mHasWear && (imageView = this.ad) != null) {
            if (imageView.getLayoutParams() instanceof RelativeLayout.LayoutParams) {
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.ad.getLayoutParams();
                layoutParams2.setMargins(0, (int) (this.mScale * dp2px(2.0f)), 0, 0);
                this.ad.setLayoutParams(layoutParams2);
                if (this.mHeartRateType != null && (this.mHeartRateType.getLayoutParams() instanceof RelativeLayout.LayoutParams)) {
                    RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) this.mHeartRateType.getLayoutParams();
                    layoutParams3.setMargins(0, (int) (this.mScale * dp2px(43.5f)), 0, 0);
                    this.mHeartRateType.setLayoutParams(layoutParams3);
                }
            } else if (this.ad.getLayoutParams() instanceof RelativeLayout.LayoutParams) {
                RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) this.ad.getLayoutParams();
                layoutParams4.setMargins(4, 0, 0, 0);
                this.ad.setLayoutParams(layoutParams4);
            }
        }
        HealthTextView healthTextView = this.g;
        if (healthTextView == null || !(healthTextView.getLayoutParams() instanceof RelativeLayout.LayoutParams)) {
            return;
        }
        ((RelativeLayout.LayoutParams) this.g.getLayoutParams()).setMarginStart((int) (this.mScale * dp2px(24.0f)));
    }

    private void i() {
        e(this.f43942a);
        e(this.au);
        e(this.r);
        if (this.ai.getLayoutParams() instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.ai.getLayoutParams();
            layoutParams.setMargins(0, 0, 0, 0);
            layoutParams.setMarginStart((int) (this.mScale * dp2px(137.8f)));
            this.ai.setLayoutParams(layoutParams);
        }
        if (this.aj.getLayoutParams() instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.aj.getLayoutParams();
            layoutParams2.setMargins(0, (int) (this.mScale * dp2px(52.0f)), 0, (int) (this.mScale * dp2px(51.8f)));
            layoutParams2.setMarginEnd((int) (this.mScale * dp2px(20.0f)));
            this.aj.setLayoutParams(layoutParams2);
        }
        af();
        ag();
    }

    private void af() {
        c(this.l, 105.0f);
        c(this.o, 105.0f);
        c(this.as, 105.0f);
        c(this.aq, 105.0f);
        c(this.ag, 105.0f);
        c(this.ae, 105.0f);
        c(this.bi, 105.0f);
        c(this.bj, 105.0f);
    }

    private void c(LinearLayout linearLayout, float f) {
        if (linearLayout.getLayoutParams() instanceof LinearLayout.LayoutParams) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linearLayout.getLayoutParams();
            layoutParams.width = (int) (this.mScale * dp2px(f));
            linearLayout.setLayoutParams(layoutParams);
        }
    }

    private void c(HealthTextView healthTextView, float f) {
        if (healthTextView.getLayoutParams() instanceof LinearLayout.LayoutParams) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) healthTextView.getLayoutParams();
            layoutParams.width = (int) (this.mScale * dp2px(f));
            healthTextView.setLayoutParams(layoutParams);
        }
    }

    private void ag() {
        c(this.f43943b, 100.0f);
        c(this.e, 100.0f);
        c(this.ar, 100.0f);
        if (nyg.d(this.mViewModel)) {
            c(this.h, 100.0f);
        }
        c(this.bc, 100.0f);
        c(this.q, 100.0f);
        c(this.t, 100.0f);
    }

    private void e(LinearLayout linearLayout) {
        if (linearLayout.getLayoutParams() instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) linearLayout.getLayoutParams();
            layoutParams.setMargins(0, 0, 0, 0);
            layoutParams.setMarginStart((int) (this.mScale * dp2px(105.0f)));
            linearLayout.setLayoutParams(layoutParams);
        }
    }

    private void m() {
        this.z = true;
        this.bg = (HealthTextView) findViewById(R.id.swingAngle_type);
        this.bh = (HealthTextView) findViewById(R.id.swingAngle_value);
        this.bj = (LinearLayout) findViewById(R.id.swingAngle_value_layout);
        this.bl = (HealthTextView) findViewById(R.id.swingAngle_unit);
        this.bf = (ImageView) findViewById(R.id.swingAngleArrow);
        this.bi = (LinearLayout) findViewById(R.id.swingAngle_type_layout);
        this.ae = (HealthTextView) findViewById(R.id.way_of_landing_type);
        this.ag = (HealthTextView) findViewById(R.id.way_of_landing);
        this.ai = (ImageView) findViewById(R.id.way_of_landing_image);
        this.s = (HealthTextView) findViewById(R.id.Eversion_type);
        this.r = (LinearLayout) findViewById(R.id.Eversion_layout);
        this.q = (LinearLayout) findViewById(R.id.Eversion_type_layout);
        this.t = (LinearLayout) findViewById(R.id.Eversion_value_layout);
        this.k = (HealthTextView) findViewById(R.id.Eversion_value);
        this.m = (HealthTextView) findViewById(R.id.Eversion_unit);
        this.n = (ImageView) findViewById(R.id.eversionExcursionArrow);
        s();
        if (this.s.getText().length() > 10 || this.az.getTitleTextLength() > 4 || this.p.getTitleTextLength() > 4 || this.y.getTitleTextLength() > 4 || this.w.getTitleTextLength() > 4) {
            this.u = true;
            HealthTextView healthTextView = this.s;
            healthTextView.setTextSize(0, healthTextView.getTextSize() * 0.7f);
            HealthTextView healthTextView2 = this.bg;
            healthTextView2.setTextSize(0, healthTextView2.getTextSize() * 0.7f);
            HealthTextView healthTextView3 = this.o;
            healthTextView3.setTextSize(0, healthTextView3.getTextSize() * 0.7f);
            HealthTextView healthTextView4 = this.e;
            healthTextView4.setTextSize(0, healthTextView4.getTextSize() * 0.7f);
            HealthTextView healthTextView5 = this.aq;
            healthTextView5.setTextSize(0, healthTextView5.getTextSize() * 0.7f);
            HealthTextView healthTextView6 = this.ba;
            healthTextView6.setTextSize(0, healthTextView6.getTextSize() * 0.7f);
            HealthTextView healthTextView7 = this.ae;
            healthTextView7.setTextSize(0, healthTextView7.getTextSize() * 0.7f);
            this.az.setSmallTextSize();
            this.p.setSmallTextSize();
            this.y.setSmallTextSize();
            this.w.setSmallTextSize();
        }
    }

    private void s() {
        this.aj = (LinearLayout) findViewById(R.id.rightlayout);
        this.ae.setTextSize(0, this.mScale * this.ae.getTextSize());
        this.ag.setTextSize(0, this.mScale * this.ag.getTextSize());
        this.bg.setTextSize(0, this.mScale * this.bg.getTextSize());
        this.bh.setTextSize(0, this.mScale * this.bh.getTextSize());
        this.bl.setTextSize(0, this.mScale * this.bl.getTextSize());
        this.s.setTextSize(0, this.mScale * this.s.getTextSize());
        this.k.setTextSize(0, this.mScale * this.k.getTextSize());
        this.m.setTextSize(0, this.mScale * this.m.getTextSize());
        RealTimeDynamicChartView realTimeDynamicChartView = (RealTimeDynamicChartView) findViewById(R.id.step_frequency_magnet);
        RealTimeDynamicChartView realTimeDynamicChartView2 = (RealTimeDynamicChartView) findViewById(R.id.touchdown_magnet);
        RealTimeDynamicChartView realTimeDynamicChartView3 = (RealTimeDynamicChartView) findViewById(R.id.ground_impact_magnet);
        RealTimeDynamicChartView realTimeDynamicChartView4 = (RealTimeDynamicChartView) findViewById(R.id.ground_shock_peak);
        realTimeDynamicChartView3.setVisibility((this.mViewModel.p() || this.mViewModel.q()) ? 8 : 0);
        realTimeDynamicChartView4.setVisibility(this.mViewModel.p() ? 0 : 8);
        this.az = new nzw(realTimeDynamicChartView);
        this.p = new nzh(realTimeDynamicChartView2);
        this.y = new nzi(realTimeDynamicChartView3);
        this.w = new nzn(realTimeDynamicChartView4);
        this.az.setDefaultOrdinateY();
        this.p.setDefaultOrdinateY();
        this.y.setDefaultOrdinateY();
        this.w.setDefaultOrdinateY();
        this.az.setScale(this.mScale);
        this.p.setScale(this.mScale);
        this.y.setScale(this.mScale);
        this.w.setScale(this.mScale);
    }

    private void y() {
        this.e.setText(this.mContext.getString(R.string.ie_motiontrack_show_detail_calories));
        this.f43944c.setText(this.mContext.getString(R.string.IDS_track_total_calories_kcal));
        this.aq.setText(this.mContext.getString(R.string.IDS_hwh_motiontrack_show_speed_km_hour));
        this.o.setText(this.mContext.getString(R.string.IDS_hw_motiontrack_segment_use_time));
        if (this.ar != null) {
            this.ba.setText(this.mContext.getString(R.string.ie_main_watch_steps_rate_string));
        }
        BaseRealTimeDynamicChartViewModel baseRealTimeDynamicChartViewModel = this.az;
        if (baseRealTimeDynamicChartViewModel != null) {
            baseRealTimeDynamicChartViewModel.updateConfiguration(this.mContext);
        }
        if (this.at != null) {
            this.bb.setText(this.mContext.getString(R.string.IDS_fitness_equipment_cadence));
            this.ay.setText(this.mContext.getString(R.string.IDS_motiontrack_show_detail_stempsmin));
        }
        HealthTextView healthTextView = this.ak;
        if (healthTextView != null) {
            healthTextView.setText(R.string.IDS_pace);
        }
        if (this.mHasWear && this.mHeartRate != null && !isTargetType()) {
            this.mHeartRateUnit.setText(nzc.a(0, this.mContext));
        }
        if (this.mHasRunPostureDevice && this.z) {
            this.p.updateConfiguration(this.mContext);
            this.y.updateConfiguration(this.mContext);
            this.w.updateConfiguration(this.mContext);
            this.ae.setText(this.mContext.getString(R.string.ie_landing_way));
            this.bg.setText(this.mContext.getString(R.string.ie_swingAngleType));
            this.s.setText(this.mContext.getString(R.string.ie_eversionExcursionType));
        }
    }

    private void a(int i) {
        Handler handler;
        this.ap = i;
        if (this.x || i != 1 || (handler = this.v) == null) {
            return;
        }
        this.x = true;
        handler.sendEmptyMessage(10010);
    }

    @Override // com.huawei.indoorequip.doublescreen.IndoorTvBaseDisplay
    public void setBtConnectState(String str) {
        if (AbstractFitnessClient.ACTION_SERVICE_DISCOVERIED.equals(str) || AbstractFitnessClient.ACTION_SERVICE_REDISCOVERIED.equals(str)) {
            this.al.setVisibility(8);
            this.mBtIcon.setImageDrawable(nzc.b(this.mContext, R.drawable.ic_treadmill_connected));
        } else if (AbstractFitnessClient.ACTION_GATT_STATE_RECONNECTING.equals(str)) {
            this.al.setVisibility(0);
            this.mBtIcon.setImageDrawable(nzc.b(this.mContext, R.drawable.icon_being_connected));
        } else {
            this.al.setVisibility(8);
            this.mBtIcon.setImageDrawable(nzc.b(this.mContext, R.drawable.ic_treadmill_disconnect));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Map<Integer, Object> map) {
        if (x()) {
            h();
        }
        if (this.mHasWear && this.mHeartRate != null && !isTargetType()) {
            updateHeartRate(e(map, 20004));
        }
        this.f43943b.setText(nzc.b(e(map, 6), 1, 0));
        this.l.setText(UnitUtil.e(e(map, 2)));
        d(map, UnitUtil.f());
        a(map);
        if (this.mTargetModeWithProgressViewHolder != null) {
            this.mTargetModeWithProgressViewHolder.e(map);
        }
        if (this.ar != null) {
            int iE = e(map, 8);
            this.ar.setText(nzc.b(iE, 1, 0));
            this.bd.setText(this.mContext.getResources().getQuantityString(R.plurals.ie_main_watch_steps_rate_unit_string, iE, ""));
        }
        BaseRealTimeDynamicChartViewModel baseRealTimeDynamicChartViewModel = this.az;
        if (baseRealTimeDynamicChartViewModel != null) {
            baseRealTimeDynamicChartViewModel.pushNewData(e(map, 4), d);
        }
        if (this.at != null) {
            b(e(map, 4));
        }
        if (map.get(20002) != null && this.mHasRunPostureDevice && this.z) {
            a((gzv) map.get(20002));
        } else if (map.get(20002) == null && this.z) {
            ah();
        } else {
            LogUtil.d("IDEQ_IndoorTreadmillTvDisplay", "updateUi, hasRunPostureDevice = ", Boolean.valueOf(this.mHasRunPostureDevice));
        }
        e(map);
    }

    private int e(Map<Integer, Object> map, int i) {
        Object obj = map.get(Integer.valueOf(i));
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        return 0;
    }

    private void e(Map<Integer, Object> map) {
        String string;
        String string2;
        int iE = e(map, 1);
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        float f = UnitUtil.f() ? (iE / 1000.0f) * 0.621371f : iE / 1000.0f;
        if (nyg.c(this.mViewModel)) {
            return;
        }
        if (nyg.d(this.mViewModel) || nyg.b(this.mViewModel)) {
            this.h.setText(decimalFormat.format(f));
            HealthTextView healthTextView = this.j;
            if (UnitUtil.f()) {
                string = this.mContext.getResources().getQuantityString(R.plurals.ie_motiontrack_show_sport_unit_mile, iE, "");
            } else {
                string = this.mContext.getString(R.string.ie_motiontrack_show_sport_unit_km);
            }
            healthTextView.setText(string);
            return;
        }
        this.f.setText(decimalFormat.format(f));
        HealthTextView healthTextView2 = this.g;
        if (UnitUtil.f()) {
            string2 = this.mContext.getResources().getQuantityString(R.plurals.ie_motiontrack_show_sport_unit_mile, iE, "");
        } else {
            string2 = this.mContext.getString(R.string.ie_motiontrack_show_sport_unit_km);
        }
        healthTextView2.setText(string2);
    }

    private void a(Map<Integer, Object> map) {
        if (this.am == null) {
            return;
        }
        if (map == null || map.get(14) == null || ((Integer) map.get(14)).intValue() == 0) {
            this.am.setText(getResources().getString(R.string.ie_motiontrack_detail_pace_default));
            return;
        }
        float fFloatValue = new BigDecimal(((Integer) map.get(14)).intValue()).divide(new BigDecimal(100), 2, 4).floatValue();
        if (UnitUtil.f()) {
            fFloatValue = (float) UnitUtil.c(fFloatValue, 3);
        }
        this.am.setText(izn.a(fFloatValue));
    }

    @Override // com.huawei.indoorequip.doublescreen.IndoorTvBaseDisplay
    public void updateUi(Map<Integer, Object> map) {
        if (map == null || !this.aa) {
            LogUtil.e("IDEQ_IndoorTreadmillTvDisplay", "updateUi, indoorEquipDataStructForShow = null");
            return;
        }
        LogUtil.a("IDEQ_IndoorTreadmillTvDisplay", "start update tv ui :", map.toString());
        Message messageObtainMessage = this.v.obtainMessage(2020);
        messageObtainMessage.obj = map;
        this.v.sendMessage(messageObtainMessage);
    }

    @Override // com.huawei.indoorequip.doublescreen.IndoorTvBaseDisplay
    public void updateProgress(int i) {
        if (this.mTargetModeWithProgressViewHolder != null) {
            this.mTargetModeWithProgressViewHolder.d(i);
        }
    }

    private void h() {
        float f;
        LogUtil.a("IDEQ_IndoorTreadmillTvDisplay", "changeTextLanguage");
        if (!LanguageUtil.l(this.mContext) && !this.u) {
            this.u = true;
            f = 0.7f;
        } else if (LanguageUtil.l(this.mContext) && this.u) {
            this.u = false;
            f = 1.4f;
        } else {
            f = 1.0f;
        }
        c(f);
        HealthTextView healthTextView = this.bg;
        if (healthTextView != null) {
            healthTextView.setTextSize(0, healthTextView.getTextSize() * f);
            this.bg.setText(this.mContext.getString(R.string.ie_swingAngleType));
        }
        HealthTextView healthTextView2 = this.s;
        if (healthTextView2 != null) {
            healthTextView2.setTextSize(0, healthTextView2.getTextSize() * f);
            this.s.setText(this.mContext.getString(R.string.ie_eversionExcursionType));
        }
        HealthTextView healthTextView3 = this.ae;
        if (healthTextView3 != null) {
            healthTextView3.setTextSize(0, f * healthTextView3.getTextSize());
            this.ae.setText(this.mContext.getString(R.string.ie_landing_way));
        }
        HealthTextView healthTextView4 = this.an;
        if (healthTextView4 != null) {
            healthTextView4.setText(this.mContext.getString(R.string.IDS_app_name_health));
        }
        if (this.mHeartRateUnit != null && this.mHeartRateType != null) {
            this.mHeartRateUnit.setText(nzc.a(0, this.mContext));
        }
        if (this.mViewModel.p()) {
            p();
        } else {
            q();
        }
    }

    private void c(float f) {
        HealthTextView healthTextView;
        HealthTextView healthTextView2 = this.bb;
        if (healthTextView2 != null && this.ay != null) {
            healthTextView2.setText(this.mContext.getString(R.string.IDS_fitness_equipment_cadence));
            this.ay.setText(this.mContext.getString(R.string.IDS_motiontrack_show_detail_stempsmin));
        }
        HealthTextView healthTextView3 = this.e;
        if (healthTextView3 != null && (healthTextView = this.f43944c) != null) {
            healthTextView.setTextSize(0, healthTextView3.getTextSize() * f);
            this.e.setText(this.mContext.getString(R.string.ie_motiontrack_show_detail_calories));
            this.f43944c.setText(this.mContext.getString(R.string.IDS_track_total_calories_kcal));
        }
        HealthTextView healthTextView4 = this.ak;
        if (healthTextView4 != null) {
            healthTextView4.setTextSize(0, healthTextView4.getTextSize() * f);
            this.ak.setText(R.string.IDS_pace);
        }
        HealthTextView healthTextView5 = this.ba;
        if (healthTextView5 != null && this.bd != null) {
            healthTextView5.setTextSize(0, healthTextView5.getTextSize() * f);
            this.ba.setText(this.mContext.getString(R.string.IDS_fitness_equipment_cadence));
            this.bd.setText(this.mContext.getResources().getQuantityString(R.plurals.ie_main_watch_steps_rate_unit_string, 2, ""));
        }
        HealthTextView healthTextView6 = this.o;
        if (healthTextView6 != null) {
            healthTextView6.setTextSize(0, healthTextView6.getTextSize() * f);
            this.o.setText(this.mContext.getString(R.string.IDS_hw_motiontrack_segment_use_time));
        }
        HealthTextView healthTextView7 = this.aq;
        if (healthTextView7 != null) {
            healthTextView7.setTextSize(0, f * healthTextView7.getTextSize());
            this.aq.setText(this.mContext.getString(R.string.IDS_hwh_motiontrack_show_speed_km_hour));
        }
    }

    private void q() {
        BaseRealTimeDynamicChartViewModel baseRealTimeDynamicChartViewModel = this.y;
        if (baseRealTimeDynamicChartViewModel == null || this.p == null) {
            return;
        }
        baseRealTimeDynamicChartViewModel.updateConfiguration(this.mContext);
        this.p.updateConfiguration(this.mContext);
        BaseRealTimeDynamicChartViewModel baseRealTimeDynamicChartViewModel2 = this.az;
        if (baseRealTimeDynamicChartViewModel2 != null) {
            baseRealTimeDynamicChartViewModel2.updateConfiguration(this.mContext);
            if (this.az.getTitleTextLength() > 4 || this.y.getTitleTextLength() > 4 || this.p.getTitleTextLength() > 4) {
                this.az.setSmallTextSize();
                this.y.setSmallTextSize();
                this.p.setSmallTextSize();
            } else {
                this.az.setNormalTextSize();
                this.y.setNormalTextSize();
                this.p.setNormalTextSize();
            }
        }
    }

    private void p() {
        BaseRealTimeDynamicChartViewModel baseRealTimeDynamicChartViewModel = this.w;
        if (baseRealTimeDynamicChartViewModel == null || this.p == null) {
            return;
        }
        baseRealTimeDynamicChartViewModel.updateConfiguration(this.mContext);
        this.p.updateConfiguration(this.mContext);
        BaseRealTimeDynamicChartViewModel baseRealTimeDynamicChartViewModel2 = this.az;
        if (baseRealTimeDynamicChartViewModel2 != null) {
            baseRealTimeDynamicChartViewModel2.updateConfiguration(this.mContext);
            if (this.az.getTitleTextLength() > 4 || this.w.getTitleTextLength() > 4 || this.p.getTitleTextLength() > 4) {
                this.az.setSmallTextSize();
                this.w.setSmallTextSize();
                this.p.setSmallTextSize();
            } else {
                this.az.setNormalTextSize();
                this.w.setNormalTextSize();
                this.p.setNormalTextSize();
            }
        }
    }

    private String b(Locale locale) {
        if (locale == null) {
            return "";
        }
        return locale.getLanguage() + Constants.LINK + locale.getCountry();
    }

    private boolean x() {
        String strB = b(Locale.getDefault());
        if (strB.equals(this.ah)) {
            return false;
        }
        this.ah = strB;
        return true;
    }

    private void b(int i) {
        int iB = nzc.b("step frequency", i, d);
        if (i <= 0) {
            this.at.setText(getResources().getString(R.string.ie_motiontrack_detail_pace_default));
        } else {
            this.at.setText(nzc.b(i, 1, 0));
        }
        if (iB == 1) {
            ab();
        } else {
            ac();
        }
    }

    private void d(Map<Integer, Object> map, boolean z) {
        if (map.get(3) == null || ((Integer) map.get(3)).intValue() == 0) {
            HealthTextView healthTextView = this.as;
            if (healthTextView != null) {
                healthTextView.setText(getResources().getString(R.string.ie_motiontrack_detail_pace_default));
                d = 0.0f;
                return;
            }
            return;
        }
        float fIntValue = ((Integer) map.get(3)).intValue() / 100.0f;
        d = fIntValue;
        if (z) {
            if (this.as == null || this.ao == null) {
                return;
            }
            this.as.setText(new DecimalFormat("0.0").format(fIntValue * 0.621371f));
            this.aq.setText(this.mContext.getResources().getString(R.string.IDS_hwh_motiontrack_show_speed_mi_hour));
            return;
        }
        if (this.as == null || this.ao == null) {
            return;
        }
        this.as.setText(new DecimalFormat("0.0").format(fIntValue));
        this.aq.setText(this.mContext.getString(R.string.IDS_hwh_motiontrack_show_speed_km_hour));
    }

    private void ah() {
        this.ag.setText(this.mContext.getString(R.string.ie_state_of_eqp_UNKNOWN_string));
        this.ai.setImageDrawable(null);
        if (this.mViewModel.p()) {
            this.w.pushNewData(0, 0.0f);
        } else {
            this.y.pushNewData(0, 0.0f);
        }
        this.p.pushNewData(0, 0.0f);
        this.bh.setText(nzc.b(0.0d, 1, 0));
        ad();
        this.k.setText(nzc.b(0.0d, 1, 0));
        u();
    }

    private void a(gzv gzvVar) {
        int iE = gzvVar.e();
        int i = gzvVar.i();
        int iC = gzvVar.c();
        int i2 = iE > i ? iE : i;
        if (i2 > iC) {
            iC = i2;
        }
        if (this.ag == null) {
            LogUtil.j("IDEQ_IndoorTreadmillTvDisplay", "updatePosture, mLandingWay = null");
            return;
        }
        e(iE, i, iC);
        this.p.pushNewData(gzvVar.a(), d);
        this.y.pushNewData(gzvVar.d(), d);
        this.w.pushNewData(gzvVar.o());
        int iJ = gzvVar.j();
        this.bh.setText(nzc.b(iJ, 1, 0));
        int iB = nzc.b("swing angle", iJ, d);
        if (iB == 1) {
            z();
        } else if (iB == 2) {
            aa();
        } else {
            ad();
        }
        int iB2 = gzvVar.b();
        int iB3 = nzc.b("eversion angle", iB2, d);
        this.k.setText(nzc.b(iB2, 1, 0));
        if (iB3 == 1) {
            w();
        } else if (iB3 == 2) {
            v();
        } else {
            u();
        }
    }

    private void e(int i, int i2, int i3) {
        if (i3 <= 0 || i3 == i2) {
            this.ag.setText(this.mContext.getString(R.string.ie_landing_way_whole));
            this.ai.setImageDrawable(nzc.e(this.mContext, R.drawable.horizontal_landing2));
        } else if (i3 == i) {
            this.ag.setText(this.mContext.getString(R.string.ie_landing_way_front));
            this.ai.setImageDrawable(nzc.e(this.mContext, R.drawable.horizontal_landing3));
        } else {
            this.ag.setText(this.mContext.getString(R.string.IDS_running_posture_avg_foot_strike_pattern_hind));
            this.ai.setImageDrawable(nzc.e(this.mContext, R.drawable.horizontal_landing1));
        }
    }

    private void ab() {
        this.aw.setVisibility(0);
        this.aw.setBackgroundResource(R.drawable.arrow_down);
        this.at.setTextColor(-14774785);
        this.ay.setTextColor(-14774785);
    }

    private void ac() {
        this.aw.setVisibility(4);
        this.at.setTextColor(-1);
        this.ay.setTextColor(-1);
    }

    private void aa() {
        this.bf.setVisibility(0);
        this.bf.setBackgroundResource(R.drawable.arrow_up);
        this.bh.setTextColor(-53241);
        this.bl.setTextColor(-53241);
    }

    private void ad() {
        this.bf.setVisibility(4);
        this.bh.setTextColor(-1);
        this.bl.setTextColor(-1);
    }

    private void z() {
        this.bf.setVisibility(0);
        this.bf.setBackgroundResource(R.drawable.arrow_down);
        this.bh.setTextColor(-14774785);
        this.bl.setTextColor(-14774785);
    }

    private void v() {
        this.n.setVisibility(0);
        this.n.setBackgroundResource(R.drawable.arrow_up);
        this.k.setTextColor(-53241);
        this.m.setTextColor(-53241);
    }

    private void u() {
        this.n.setVisibility(4);
        this.k.setTextColor(-1);
        this.m.setTextColor(-1);
    }

    private void w() {
        this.n.setVisibility(0);
        this.n.setBackgroundResource(R.drawable.arrow_down);
        this.k.setTextColor(-14774785);
        this.m.setTextColor(-14774785);
    }

    private void d(ImageView imageView) {
        if (imageView == null) {
            LogUtil.j("IDEQ_IndoorTreadmillTvDisplay", "STEP IMAGE IS NULL");
            return;
        }
        if (imageView.getLayoutParams() instanceof LinearLayout.LayoutParams) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) imageView.getLayoutParams();
            layoutParams.width = (int) (this.mScale * dp2px(16.0f));
            layoutParams.height = (int) (this.mScale * dp2px(16.0f));
            layoutParams.setMarginStart(((int) this.mScale) * dp2px(4.0f));
            imageView.setLayoutParams(layoutParams);
        }
    }

    private void a() {
        if (this.af.getLayoutParams() instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.af.getLayoutParams();
            if (this.i == 1) {
                layoutParams.setMargins(0, (int) (this.mScale * dp2px(64.0f)), 0, (int) (this.mScale * dp2px(51.8f)));
                layoutParams.setMarginStart(((int) this.mScale) * dp2px(16.0f));
                layoutParams.width = ((int) this.mScale) * dp2px(287.8f);
            } else {
                layoutParams.setMargins(0, (int) (this.mScale * dp2px(73.5f)), 0, (int) (this.mScale * dp2px(73.5f)));
                layoutParams.setMarginStart(((int) this.mScale) * dp2px(30.0f));
                layoutParams.width = ((int) this.mScale) * dp2px(184.8f);
            }
            this.af.setLayoutParams(layoutParams);
        }
    }
}
