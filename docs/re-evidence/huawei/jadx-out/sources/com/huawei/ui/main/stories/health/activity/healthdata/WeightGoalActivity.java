package com.huawei.ui.main.stories.health.activity.healthdata;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.os.Message;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.basefitnessadvice.model.intplan.IntPlan;
import com.huawei.haf.design.pattern.ObserveLabels;
import com.huawei.haf.design.pattern.Observer;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.haf.router.AppRouterUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.arkuix.utils.ArkUIXConstants;
import com.huawei.health.device.callback.WeightInsertStatusCallback;
import com.huawei.health.device.fatscale.multiusers.MultiUsersManager;
import com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader;
import com.huawei.health.messagecenter.model.CommonUtil;
import com.huawei.health.plan.api.PlanApi;
import com.huawei.health.weight.bean.WeightTargetDifferences;
import com.huawei.hihealth.HiGoalInfo;
import com.huawei.hihealth.HiUserInfo;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.listener.HiCommonListener;
import com.huawei.hms.support.feature.result.CommonConstant;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwcommonmodel.fitnessdatatype.HeartRateThresholdConfig;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.operation.OperationKey;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.cardview.HealthCardView;
import com.huawei.ui.commonui.datepicker.HealthDatePicker;
import com.huawei.ui.commonui.dialog.CustomViewDialog;
import com.huawei.ui.commonui.edittext.HealthEditText;
import com.huawei.ui.commonui.edittext.HealthErrorTipTextLayout;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.scrollview.ScrollScaleView;
import com.huawei.ui.commonui.seekbar.HealthSeekBar;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.health.model.weight.card.CardConstants;
import com.huawei.ui.main.stories.health.views.WeightScrollScaleView;
import com.huawei.uikit.hwdatepicker.widget.HwDatePicker;
import defpackage.dnj;
import defpackage.dso;
import defpackage.enw;
import defpackage.exz;
import defpackage.iov;
import defpackage.ioy;
import defpackage.iun;
import defpackage.ivd;
import defpackage.lmf;
import defpackage.lsl;
import defpackage.lua;
import defpackage.nkf;
import defpackage.nsv;
import defpackage.oru;
import defpackage.qpx;
import defpackage.qra;
import defpackage.qre;
import defpackage.qrs;
import defpackage.vbs;
import defpackage.vdv;
import defpackage.vei;
import defpackage.vms;
import defpackage.vng;
import defpackage.wvf;
import health.compact.a.AuthorizationUtils;
import health.compact.a.LanguageUtil;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public class WeightGoalActivity extends BaseActivity implements View.OnClickListener {
    private int aa;
    private HiUserInfo ac;
    private ImageView ae;
    private HealthTextView af;
    private HealthCardView ag;
    private LinearLayout ai;
    private View al;
    private HealthTextView am;
    private View an;
    private HealthTextView ao;
    private ImageView ap;
    private HealthTextView aq;
    private LinearLayout ar;
    private WeightScrollScaleView as;
    private HealthTextView av;
    private HealthCardView ax;
    private HealthTextView ay;
    private HealthTextView az;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f27654b;
    private HealthTextView ba;
    private HealthTextView bb;
    private int bd;
    private float be;
    private double bi;
    private HealthButton bj;
    private HealthTextView bk;
    private HealthSeekBar bm;
    private HealthTextView bn;
    private View bo;
    private HealthTextView bp;
    private double bq;
    private HealthTextView br;
    private HealthTextView bs;
    private ImageView bt;
    private LinearLayout bu;
    private ImageView bv;
    private HealthCardView bw;
    private LinearLayout bx;
    private ImageView by;
    private CustomTitleBar bz;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f27655c;
    private LinearLayout ca;
    private LinearLayout cb;
    private WeightScrollScaleView cc;
    private float cd;
    private HealthTextView ce;
    private float cf;
    private FrameLayout ch;
    private LinearLayout ci;
    private LinearLayout cj;
    private HealthTextView ck;
    private HealthTextView cl;
    private WeightTargetDifferences cm;
    private ivd cn;
    private HealthTextView co;
    private HealthTextView cp;
    private HealthTextView cs;
    private int e;
    private HealthTextView f;
    private HealthCardView g;
    private IntPlan i;
    private WeightScrollScaleView j;
    private HealthTextView k;
    private HealthDatePicker m;
    private int n;
    private HealthEditText o;
    private ImageView p;
    private LinearLayout q;
    private ImageView r;
    private HealthCardView s;
    private HealthTextView t;
    private LinearLayout u;
    private double x;
    private int y;
    private int bf = 0;
    private final g cg = new g();
    private final Observer bc = new d(this);
    private double l = 0.0d;
    private int aw = 1;
    private final HiGoalInfo ab = new HiGoalInfo();
    private long bl = 0;
    private double h = MultiUsersManager.INSTANCE.getMainUser().r();
    private double ak = 0.0d;
    private double aj = 0.0d;
    private boolean at = true;
    private int cq = 0;
    private boolean au = false;
    private int v = 0;
    private final int[] bh = {10, 250, 22, 552};
    private final enw z = new enw(10006);
    private double ah = 10.0d;
    private double ad = 251.0d;
    private double bg = 10.0d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private double f27653a = 10.0d;
    private double d = 251.0d;
    private float ct = MultiUsersManager.INSTANCE.getMainUser().f();
    private Boolean w = false;

    /* JADX INFO: loaded from: classes19.dex */
    static class g extends BaseHandler<WeightGoalActivity> {
        private g(WeightGoalActivity weightGoalActivity) {
            super(weightGoalActivity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(WeightGoalActivity weightGoalActivity, Message message) {
            int i = message.what;
            if (i == 2) {
                weightGoalActivity.ah();
                return;
            }
            if (i == 3) {
                if (message.obj instanceof WeightTargetDifferences) {
                    WeightTargetDifferences weightTargetDifferences = (WeightTargetDifferences) message.obj;
                    weightGoalActivity.b(weightTargetDifferences);
                    weightGoalActivity.d(weightTargetDifferences);
                    return;
                }
                return;
            }
            if (i == 4) {
                if (weightGoalActivity == null || weightGoalActivity.isFinishing()) {
                    LogUtil.e("HealthWeight_WeightGoalActivity", "activity is null or finishing");
                    return;
                } else {
                    Object obj = message.obj;
                    weightGoalActivity.d(weightGoalActivity, obj instanceof Float ? ((Float) obj).floatValue() : 0.0f);
                    return;
                }
            }
            LogUtil.a("HealthWeight_WeightGoalActivity", "handleMessageWhenReferenceNotNull default");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(WeightGoalActivity weightGoalActivity, float f2) {
        dnj mainUser = MultiUsersManager.INSTANCE.getMainUser();
        double dE = this.au ? e(this.cn) : this.h;
        if (mainUser != null) {
            mainUser.a((float) dE);
            mainUser.c(f2);
        }
        Intent intent = new Intent(weightGoalActivity, (Class<?>) WeightGoalPreviewActivity.class);
        intent.putExtra("WEIGHT_GOAL_ACTION", 0);
        intent.putExtra("IS_WEIGHT_CURRENT_GOAL_EDIT_TYPE", weightGoalActivity.au);
        intent.putExtra("weightManager", this.cn);
        intent.putExtra("startWeight", dE);
        intent.putExtra("targetWeight", f2);
        iov.d(BaseApplication.getActivity(), intent);
        vei.d((Activity) this, true);
        weightGoalActivity.finish();
    }

    /* JADX INFO: loaded from: classes19.dex */
    static class c implements WeightInsertStatusCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        float f27662a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        WeakReference<g> f27663c;

        c(g gVar, float f) {
            this.f27663c = new WeakReference<>(gVar);
            this.f27662a = f;
        }

        @Override // com.huawei.health.device.callback.WeightInsertStatusCallback
        public void isSuccess(boolean z) {
            g gVar = this.f27663c.get();
            if (gVar != null) {
                LogUtil.a("HealthWeight_WeightGoalActivity", "InsertWeightResponseCallback,insert successful");
                Message messageObtainMessage = gVar.obtainMessage();
                messageObtainMessage.what = 4;
                messageObtainMessage.obj = Float.valueOf(this.f27662a);
                gVar.sendMessage(messageObtainMessage);
                return;
            }
            LogUtil.e("HealthWeight_WeightGoalActivity", "handler is null");
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.health_data_weight_goal_set);
        this.f27655c = this;
        int iE = UnitUtil.e();
        this.cq = iE;
        LogUtil.a("HealthWeight_WeightGoalActivity", "onCreate mWeightShowUnit ", Integer.valueOf(iE));
        p();
        l();
        f();
        ObserverManagerUtil.d(this.bc, ObserveLabels.STAY_FIT_PLAN_END);
    }

    private void l() {
        this.bx.setOnClickListener(this);
        this.u.setOnClickListener(this);
        this.ci.setOnClickListener(this);
        this.ca.setOnClickListener(this);
        this.ar.setOnClickListener(this);
        this.bj.setOnClickListener(this);
        this.ap.setOnClickListener(this);
        this.co.setOnClickListener(this);
        this.ck.setOnClickListener(this);
        this.cl.setOnClickListener(this);
        this.g.setOnClickListener(this);
        this.af.setOnClickListener(this);
        this.am.setOnClickListener(this);
        this.r.setOnClickListener(this);
        this.bv.setOnClickListener(this);
    }

    private void p() {
        this.bz = (CustomTitleBar) findViewById(R.id.health_healthdata_weightgoal_title_layout);
        this.bo = findViewById(R.id.health_data_start_weight_and_date_cardView);
        this.bz.setTitleBarBackgroundColor(getResources().getColor(R.color.transparent));
        this.cj = (LinearLayout) findViewById(R.id.hw_weight_management_goal_content);
        this.ch = (FrameLayout) findViewById(R.id.hw_weight_management_goal_cardview);
        this.bx = (LinearLayout) findViewById(R.id.health_data_target_weight_title);
        this.u = (LinearLayout) findViewById(R.id.health_data_finish_title);
        this.bs = (HealthTextView) findViewById(R.id.hw_target_weight_text);
        this.bu = (LinearLayout) findViewById(R.id.health_data_target_weight_content);
        this.q = (LinearLayout) findViewById(R.id.hw_weight_management_finish_date_content);
        this.bt = (ImageView) findViewById(R.id.hw_target_weight_icon);
        this.p = (ImageView) findViewById(R.id.hw_finish_date_icon);
        this.t = (HealthTextView) findViewById(R.id.hw_finish_date_text);
        this.ci = (LinearLayout) findViewById(R.id.hw_show_health_data_weight_layout);
        this.cs = (HealthTextView) findViewById(R.id.hw_show_health_data_weight_mid_weight);
        this.ca = (LinearLayout) findViewById(R.id.health_data_weight_change_title);
        this.ar = (LinearLayout) findViewById(R.id.health_data_hold_weight_title);
        this.cb = (LinearLayout) findViewById(R.id.health_data_weight_change_content);
        this.ai = (LinearLayout) findViewById(R.id.health_data_hold_weight_content);
        this.by = (ImageView) findViewById(R.id.hw_health_current_weight_icon);
        this.ae = (ImageView) findViewById(R.id.hw_hold_weight_icon);
        this.ce = (HealthTextView) findViewById(R.id.health_data_weight_change_text);
        this.bj = (HealthButton) findViewById(R.id.hw_show_health_data_weight_goal);
        this.ap = (ImageView) findViewById(R.id.hw_show_health_data_weight_suggestion_icon);
        this.cp = (HealthTextView) findViewById(R.id.hw_show_health_data_mid_weight);
        this.cc = (WeightScrollScaleView) findViewById(R.id.health_healthdata_weight_goal_scale);
        this.j = (WeightScrollScaleView) findViewById(R.id.health_data_expect_current_weight_scale);
        this.as = (WeightScrollScaleView) findViewById(R.id.health_healthdata_hold_weight_goal_scale);
        this.f = (HealthTextView) findViewById(R.id.hw_health_data_current_weight);
        this.ao = (HealthTextView) findViewById(R.id.hw_hold_weight_text);
        this.g = (HealthCardView) findViewById(R.id.health_data_current_weight_cardview);
        this.co = (HealthTextView) findViewById(R.id.hw_weight_management_reduce_text);
        this.ck = (HealthTextView) findViewById(R.id.hw_weight_management_gain_text);
        this.cl = (HealthTextView) findViewById(R.id.hw_weight_management_hold_text);
        this.s = (HealthCardView) findViewById(R.id.health_data_target_finish_date_cardview);
        this.bw = (HealthCardView) findViewById(R.id.health_data_target_weight_cardview);
        this.ag = (HealthCardView) findViewById(R.id.health_data_target_hold_weight_cardview);
        this.m = (HealthDatePicker) findViewById(R.id.select_finish_date_view);
        this.az = (HealthTextView) findViewById(R.id.health_data_lose_weight_rate_progress);
        this.av = (HealthTextView) findViewById(R.id.health_data_lose_weight_rate_description);
        this.ax = (HealthCardView) findViewById(R.id.health_data_lose_weight_rate_cardview);
        this.bb = (HealthTextView) findViewById(R.id.health_data_lose_weight_rate_description_recommend);
        q();
        s();
        this.ba = (HealthTextView) findViewById(R.id.need_weight_value);
        this.k = (HealthTextView) findViewById(R.id.finish_date_tips);
        this.ay = (HealthTextView) findViewById(R.id.need_weight_hold_value);
        this.bn = (HealthTextView) findViewById(R.id.start_weight_text);
        m();
        t();
        a();
    }

    private void q() {
        this.bm = (HealthSeekBar) findViewById(R.id.lose_weight_rate_card_seek_bar);
        if (LanguageUtil.br(this.f27655c)) {
            this.bm.setRotation(180.0f);
        }
        this.bm.setTouchable(true);
        this.bm.setOnSeekBarChangeListener(new HealthSeekBar.OnSeekBarChangeListener() { // from class: com.huawei.ui.main.stories.health.activity.healthdata.WeightGoalActivity.4
            @Override // com.huawei.ui.commonui.seekbar.HealthSeekBar.OnSeekBarChangeListener
            public void onStartTrackingTouch(HealthSeekBar healthSeekBar) {
            }

            @Override // com.huawei.ui.commonui.seekbar.HealthSeekBar.OnSeekBarChangeListener
            public void onStopTrackingTouch(HealthSeekBar healthSeekBar) {
            }

            @Override // com.huawei.ui.commonui.seekbar.HealthSeekBar.OnSeekBarChangeListener
            public void onProgressChanged(HealthSeekBar healthSeekBar, int i2, boolean z) {
                String string;
                if (i2 <= 30) {
                    WeightGoalActivity.this.aw = 1;
                    healthSeekBar.setProgress(0);
                    string = BaseApplication.getContext().getResources().getString(R.string.IDS_hwh_home_lose_weight_rate_normal);
                    WeightGoalActivity.this.av.setText(string);
                } else if (i2 <= 60) {
                    WeightGoalActivity.this.aw = 2;
                    healthSeekBar.setProgress(45);
                    string = BaseApplication.getContext().getResources().getString(R.string.IDS_hwh_home_lose_weight_rate_quick);
                } else {
                    WeightGoalActivity.this.aw = 3;
                    healthSeekBar.setProgress(90);
                    string = BaseApplication.getContext().getResources().getString(R.string.IDS_hwh_home_lose_weight_rate_radical);
                }
                LogUtil.a("HealthWeight_WeightGoalActivity", "onProgressChanged mLoseWeightRate ", Integer.valueOf(WeightGoalActivity.this.aw));
                WeightGoalActivity.this.av.setText(string);
                WeightGoalActivity weightGoalActivity = WeightGoalActivity.this;
                weightGoalActivity.e(weightGoalActivity.bb, WeightGoalActivity.this.aw != 1 ? 8 : 0);
                WeightGoalActivity.this.h();
                WeightGoalActivity.this.ak();
                WeightGoalActivity.this.ax();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        double[] dArrC = vei.c(this.aw, this.h);
        double d2 = dArrC[0];
        double d3 = dArrC[1];
        LogUtil.a("HealthWeight_WeightGoalActivity", "getLoseWeightRange low ", Double.valueOf(d2), " high ", Double.valueOf(d3));
        this.az.setText(a(String.format(BaseApplication.getContext().getResources().getString(R.string.IDS_hwh_home_avg_weekly_weight_loss_kg), getResources().getString(R.string.IDS_hw_pressure_grade_range, UnitUtil.e(d2, 1, 1), vei.b(d3, 1)))));
    }

    private void a() {
        HashMap map = new HashMap();
        map.put("click", "1");
        map.put(CommonUtil.PAGE_TYPE, Integer.valueOf(this.au ? 2 : 1));
        map.put("from", Integer.valueOf(this.v));
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.WEIGHT_EDIT_GOAL_CLICKED_2040148.value(), map, 0);
    }

    private void s() {
        View viewInflate;
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.weight_range_layout);
        if (LanguageUtil.z(this.f27655c)) {
            viewInflate = View.inflate(this.f27655c, R.layout.health_data_weight_goal_set_scope_hebrew, null);
        } else {
            viewInflate = View.inflate(this.f27655c, R.layout.health_data_weight_goal_set_scope, null);
        }
        relativeLayout.addView(viewInflate);
        this.af = (HealthTextView) viewInflate.findViewById(R.id.hw_weight_management_hold_left_value);
        this.am = (HealthTextView) viewInflate.findViewById(R.id.hw_weight_management_hold_right_value);
        this.an = viewInflate.findViewById(R.id.hw_weight_management_hold_left_view);
        this.al = viewInflate.findViewById(R.id.hw_weight_management_hold_right_view);
        this.aq = (HealthTextView) viewInflate.findViewById(R.id.hw_weight_management_hold_unit);
    }

    private void m() {
        this.r = (ImageView) findViewById(R.id.hw_show_finish_date_suggestion_icon);
        this.br = (HealthTextView) findViewById(R.id.start_current_weight_title);
        this.bv = (ImageView) findViewById(R.id.hold_data_weight_suggestion_icon);
        this.bp = (HealthTextView) findViewById(R.id.hold_health_data_mid_weight);
    }

    private void t() {
        CardConstants.c(this.co);
        CardConstants.c(this.ck);
        CardConstants.c(this.cl);
        a(this.bt);
        a(this.p);
        a(this.by);
        a(this.ae);
        al();
        this.ch.setVisibility(0);
        an();
        ai();
        cancelAdaptRingRegion();
        setViewSafeRegion(false, findViewById(R.id.health_data_weight_goal_rl));
        this.m.setmIsSupportLunarSwitch(false);
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTimeInMillis(System.currentTimeMillis());
        a(gregorianCalendar);
        GregorianCalendar gregorianCalendar2 = new GregorianCalendar();
        gregorianCalendar2.setTimeInMillis(Long.MAX_VALUE);
        this.m.e(gregorianCalendar, gregorianCalendar2);
        if (getIntent() != null && getIntent().getExtras() != null) {
            if (getIntent().getExtras().getInt("WEIGHT_GOAL_ACTION", 0) == 1) {
                this.au = true;
                e();
            }
            this.v = getIntent().getExtras().getInt("from", 0);
            z();
        }
        k();
        this.m.setSpinnersSelectorPaintColor(getColor(R.color.weight_primary_color));
        d(this.as);
        d(this.j);
        d(this.cc);
        b(this.ao, this.ai, this.ae, true);
    }

    private void z() {
        if (getIntent().getExtras().getBoolean("IS_SELECT_KEEP_WEIGHT", false)) {
            this.cl.postDelayed(new Runnable() { // from class: com.huawei.ui.main.stories.health.activity.healthdata.WeightGoalActivity.1
                @Override // java.lang.Runnable
                public void run() {
                    WeightGoalActivity.this.cl.performClick();
                }
            }, 100L);
        }
    }

    private void k() {
        Uri uriB = AppRouterUtils.b(getIntent());
        if (uriB == null) {
            LogUtil.j("HealthWeight_WeightGoalActivity", "mSchemeData == null");
            return;
        }
        if (AuthorizationUtils.c(this)) {
            int iJ = health.compact.a.CommonUtil.j(uriB.getQueryParameter(ArkUIXConstants.FROM_TYPE));
            LogUtil.a("HealthWeight_WeightGoalActivity", "initSchemeData weightGoalAction", Integer.valueOf(iJ));
            if (iJ == 1) {
                this.au = true;
                e();
            }
            this.v = health.compact.a.CommonUtil.j(uriB.getQueryParameter("from"));
        }
    }

    private void e() {
        this.cj.setVisibility(8);
        this.r.setVisibility(0);
        this.br.setText(R.string.IDS_hwh_home_current_weight);
        this.bz.setTitleText(getResources().getString(R.string.IDS_hwh_home_adjust_current_target));
    }

    private void a(GregorianCalendar gregorianCalendar) {
        this.m.b(gregorianCalendar.get(1), gregorianCalendar.get(2) + 1, gregorianCalendar.get(5), new HwDatePicker.OnDateChangedListener() { // from class: com.huawei.ui.main.stories.health.activity.healthdata.WeightGoalActivity.2
            @Override // com.huawei.uikit.hwdatepicker.widget.HwDatePicker.OnDateChangedListener
            public void onDateChanged(HwDatePicker hwDatePicker, int i2, int i3, int i4, GregorianCalendar gregorianCalendar2) {
                long j = WeightGoalActivity.this.j();
                WeightGoalActivity.this.a(j);
                WeightGoalActivity.this.t.setText(DateFormatUtil.a(j, DateFormatUtil.DateFormatType.DATE_FORMAT_YYYYMD));
            }
        });
    }

    private void b() {
        WeightTargetDifferences weightTargetDifferencesE = vng.e();
        if (weightTargetDifferencesE == null || this.cd == 0.0f) {
            LogUtil.j("HealthWeight_WeightGoalActivity", "fetchDailyWeightGoal weightTargetDifferences ", weightTargetDifferencesE);
            Message messageObtainMessage = this.cg.obtainMessage();
            messageObtainMessage.what = 2;
            this.cg.sendMessage(messageObtainMessage);
            return;
        }
        Message messageObtainMessage2 = this.cg.obtainMessage();
        messageObtainMessage2.what = 3;
        messageObtainMessage2.obj = weightTargetDifferencesE;
        this.cg.sendMessage(messageObtainMessage2);
    }

    private void an() {
        this.j.setOnSelectedListener(new ScrollScaleView.OnSelectedListener() { // from class: com.huawei.ui.main.stories.health.activity.healthdata.WeightGoalActivity.5
            @Override // com.huawei.ui.commonui.scrollview.ScrollScaleView.OnSelectedListener
            public void onSelected(List<String> list, int i2) {
                WeightGoalActivity.this.c(i2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i2) {
        f(i2);
        e(i2);
        av();
        w();
        h();
    }

    private void w() {
        if (aa()) {
            LogUtil.a("HealthWeight_WeightGoalActivity", "limitHoldWeightScrollView noSetHeight()");
            return;
        }
        double d2 = this.bq;
        double d3 = this.h;
        if (d2 <= d3 && this.bi >= d3) {
            aq();
            double d4 = this.bq;
            this.ah = d4;
            double d5 = this.bi;
            this.ad = d5;
            this.as.setData(vng.d((int) d4, ((int) Math.ceil(d5)) + 1), 10, 40);
            this.as.setSelectedPosition(e(this.bq, (int) this.ah));
            return;
        }
        if (d3 < d2) {
            this.ak = d3;
            this.ah = d3;
            double d6 = this.bi;
            this.ad = d6;
            this.as.setData(vng.d((int) d3, ((int) Math.ceil(d6)) + 1), 10, 40);
            aq();
            this.as.setSelectedPosition(e(this.ak, (int) this.ah));
            return;
        }
        this.aj = d3;
        this.ah = d2;
        this.ad = d3;
        this.as.setData(vng.d((int) d2, ((int) Math.ceil(d3)) + 1), 10, 40);
        ap();
        this.as.setSelectedPosition(e(this.aj, (int) this.ah));
    }

    private void e(int i2) {
        int iB = b(this.x);
        if (this.e == 0 && i2 <= iB) {
            this.cc.setSelectedPosition(i2 + 1);
        }
        if (this.e == 1 && i2 >= iB) {
            this.cc.setSelectedPosition(iB - 1);
        }
        if (this.au) {
            if (this.h > vei.d(this.ct, this.aw, this.aa)) {
                ax();
                return;
            }
            return;
        }
        ax();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ax() {
        double d2 = vei.d(this.au ? this.ct : this.h, this.aw, this.aa);
        this.bg = d2;
        LogUtil.a("HealthWeight_WeightGoalActivity", "updateWeightGoalScroll mReduceScaleMinValue: ", Double.valueOf(d2));
        if (this.au && this.h <= this.bg) {
            this.bg = 10.0d;
        }
        double d3 = this.x;
        if (d3 < 10.0d || d3 > this.bg) {
            return;
        }
        LogUtil.a("HealthWeight_WeightGoalActivity", "updateWeightGoalScroll mWeightGoal: ", Float.valueOf(this.cd));
        this.cc.setSelectedPosition(b(this.bg));
    }

    private void ai() {
        this.as.setOnSelectedListener(new ScrollScaleView.OnSelectedListener() { // from class: com.huawei.ui.main.stories.health.activity.healthdata.WeightGoalActivity.9
            @Override // com.huawei.ui.commonui.scrollview.ScrollScaleView.OnSelectedListener
            public void onSelected(List<String> list, int i2) {
                int iA = WeightGoalActivity.this.at ? WeightGoalActivity.this.a(i2) : WeightGoalActivity.this.d(i2);
                if (iA != i2) {
                    WeightGoalActivity.this.as.setSelectedPosition(iA);
                }
                WeightGoalActivity.this.h(iA);
                WeightGoalActivity.this.av();
            }
        });
    }

    private void x() {
        double d2 = this.aj;
        double d3 = this.ah;
        LogUtil.a("HealthWeight_WeightGoalActivity", "mHoldWeightRangeHighValue = ", Double.valueOf(d2), " mHoldScaleMinValue = ", Double.valueOf(d3), " mHoldWeightRangeLowValue = ", Double.valueOf(this.ak), "mHoldScaleMaxValue = ", Double.valueOf(this.ad), "mHoldScaleMinValue = ", Double.valueOf(d3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int d(int i2) {
        int iE = e(this.ak, (int) this.ah) + 1;
        if (i2 < iE) {
            i2 = iE;
        }
        int iE2 = e(this.ad, (int) this.ah);
        return i2 > iE2 ? iE2 : i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int a(int i2) {
        int iE = e(this.aj, (int) this.ah) - 1;
        if (i2 > iE) {
            i2 = iE;
        }
        double d2 = this.ah;
        int iE2 = e(d2, (int) d2);
        return i2 < iE2 ? iE2 : i2;
    }

    private void d(ScrollScaleView scrollScaleView) {
        scrollScaleView.setData(vng.c(), 10, 40);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(WeightTargetDifferences weightTargetDifferences) {
        String strB;
        if (this.au) {
            a(weightTargetDifferences);
        } else {
            av();
        }
        if (!this.au || weightTargetDifferences.e() == WeightTargetDifferences.WeightTargetType.WEIGHT_KEE) {
            return;
        }
        this.bo.setVisibility(0);
        if (MultiUsersManager.INSTANCE.getMainUser() == null) {
            LogUtil.e("HealthWeight_WeightGoalActivity", "mainUser is null ,retur");
            strB = "";
        } else {
            strB = vei.b(UnitUtil.b(MultiUsersManager.INSTANCE.getMainUser().f(), 1), 1);
        }
        if (TextUtils.isEmpty(strB)) {
            ReleaseLogUtil.e("HealthWeight_WeightGoalActivity", "setGoalFinishDateAndStartDate startWeightAndUnit ", strB);
        } else if (weightTargetDifferences.a() != 0) {
            this.bn.setText(qre.a(R.string.IDS_motiontrack_history_all_unit, strB, DateFormatUtil.a(weightTargetDifferences.a(), DateFormatUtil.DateFormatType.DATE_FORMAT_YYYYMD)));
        } else {
            this.bn.setText(strB);
        }
    }

    private void a(final WeightTargetDifferences weightTargetDifferences) {
        if (System.currentTimeMillis() < weightTargetDifferences.b()) {
            this.m.post(new Runnable() { // from class: urt
                @Override // java.lang.Runnable
                public final void run() {
                    this.f50494a.e(weightTargetDifferences);
                }
            });
        }
    }

    public /* synthetic */ void e(WeightTargetDifferences weightTargetDifferences) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(weightTargetDifferences.b());
        this.m.d(calendar.get(1), calendar.get(2) + 1, calendar.get(5));
        a(j());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(long j) {
        LogUtil.a("HealthWeight_WeightGoalActivity", "setFinishDateTipsView finishDate:", Long.valueOf(j));
        int iB = lsl.b(DateFormatUtil.a(System.currentTimeMillis()), DateFormatUtil.a(j));
        double d2 = iB;
        String quantityString = getResources().getQuantityString(R.plurals.IDS_benefit_message_num_day, iB, UnitUtil.e(d2, 1, 0));
        double dAbs = Math.abs(this.x - this.h) / (d2 / 7.0d);
        int i2 = this.e;
        if (i2 == 1) {
            c(quantityString, dAbs);
        } else if (i2 == 0) {
            b(quantityString, dAbs);
            o(dAbs);
        } else {
            LogUtil.a("HealthWeight_WeightGoalActivity", "other targetType");
        }
    }

    private void o(double d2) {
        if (d2 > 1.0d) {
            this.r.setVisibility(8);
            this.k.setText(getString(R.string.IDS_weight_loss_diff_four_hint, new Object[]{vei.b(UnitUtil.b(1.0d, 0), 0)}));
            this.k.setTextColor(getColor(R.color.pie_sector_running_level_color_sss));
        }
    }

    private void b(String str, double d2) {
        double dB = UnitUtil.b(d2, 2);
        if (this.au) {
            this.k.setText(getString(R.string.IDS_hwh_home_avg_weekly_weight_loss_kg, new Object[]{vei.b(dB, 1)}));
            this.r.setVisibility(0);
        } else {
            this.k.setText(a(getResources().getString(R.string.IDS_hwh_home_days_to_achieve_target, str, vei.b(dB, 2))));
        }
        this.k.setTextColor(getColor(R.color.textColorPrimary));
    }

    private void c(String str, double d2) {
        double dB = UnitUtil.b(d2, 2);
        if (this.au) {
            this.k.setText(getString(R.string.IDS_hwh_home_avg_weekly_weight_increase_kg, new Object[]{vei.b(dB, 1)}));
            this.r.setVisibility(0);
        } else {
            this.k.setText(a(getResources().getString(R.string.IDS_hwh_home_days_to_achieve_target_increase, str, vei.b(dB, 2))));
        }
        this.k.setTextColor(getColor(R.color.textColorPrimary));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void av() {
        int i2 = this.e;
        if (i2 == 1) {
            c(0.05d, 5.0d);
        } else if (i2 == 0) {
            c(0.05d, 2.0d);
        } else {
            LogUtil.a("HealthWeight_WeightGoalActivity", "updateDatePicker");
        }
    }

    private void c(double d2, double d3) {
        GregorianCalendar gregorianCalendarA = a(d3, false);
        GregorianCalendar gregorianCalendarA2 = a(d2, true);
        this.m.e(gregorianCalendarA, gregorianCalendarA2);
        Calendar calendarN = n();
        LogUtil.a("HealthWeight_WeightGoalActivity", "startTime:", Long.valueOf(gregorianCalendarA.getTimeInMillis()), "endDate:", Long.valueOf(gregorianCalendarA2.getTimeInMillis()));
        this.m.d(calendarN.get(1), calendarN.get(2) + 1, calendarN.get(5));
    }

    private Calendar n() {
        GregorianCalendar gregorianCalendarA = a(0.5d, false);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(gregorianCalendarA.getTimeInMillis());
        return calendar;
    }

    private GregorianCalendar a(double d2, boolean z) {
        double dAbs = Math.abs(this.x - this.h);
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTimeInMillis(vng.c(dAbs, d2, z));
        return gregorianCalendar;
    }

    private SpannableString a(String str) {
        return UnitUtil.b(this, "\\d", str, R.style.health_data_value_primary, R.style.health_data_value_secondary);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(WeightTargetDifferences weightTargetDifferences) {
        am();
        this.cm = weightTargetDifferences;
        i(weightTargetDifferences.c());
        int i2 = this.e;
        if (i2 == -1) {
            ad();
            aj();
        } else if (i2 == 0) {
            af();
        } else if (i2 != 1) {
            if (i2 == 2) {
                c(weightTargetDifferences);
                b(this.ak, this.aj);
            } else {
                LogUtil.a("HealthWeight_WeightGoalActivity", "setGoalAndChangeWeight mCurrentGoalType is hold");
            }
        }
        ar();
        at();
    }

    private void af() {
        nkf.a().d(new b(this));
    }

    /* JADX INFO: loaded from: classes19.dex */
    static class b implements ResponseCallback<Pair<Long, ivd>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private WeakReference<WeightGoalActivity> f27661b;

        b(WeightGoalActivity weightGoalActivity) {
            this.f27661b = new WeakReference<>(weightGoalActivity);
        }

        @Override // com.huawei.hwbasemgr.ResponseCallback
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onResponse(int i, Pair<Long, ivd> pair) {
            WeightGoalActivity weightGoalActivity = this.f27661b.get();
            if (weightGoalActivity == null || weightGoalActivity.isFinishing() || weightGoalActivity.isDestroyed()) {
                ReleaseLogUtil.e("HealthWeight_WeightGoalActivity", "InnerGetWeightManager activity ", weightGoalActivity);
                return;
            }
            if (pair == null) {
                ReleaseLogUtil.e("HealthWeight_WeightGoalActivity", "InnerGetWeightManager pair is null");
                return;
            }
            ivd ivdVar = (ivd) pair.second;
            LogUtil.a("HealthWeight_WeightGoalActivity", "InnerGetWeightManager weightManager ", ivdVar);
            if (ivdVar == null) {
                weightGoalActivity.o();
                return;
            }
            if (ivdVar.d() != null) {
                weightGoalActivity.aw = ivdVar.d().d();
            }
            weightGoalActivity.bd = weightGoalActivity.aw;
            weightGoalActivity.ag();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        this.aw = vei.d(UnitUtil.d((this.cm.c() / 1000.0d) * 7.0d, 1), this.h);
        ag();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ag() {
        if (!HandlerExecutor.c()) {
            HandlerExecutor.c(new Runnable() { // from class: urs
                @Override // java.lang.Runnable
                public final void run() {
                    this.e.ag();
                }
            });
            return;
        }
        LogUtil.a("HealthWeight_WeightGoalActivity", "setLoseRateProgress mLoseWeightRate ", Integer.valueOf(this.aw));
        int i2 = this.aw;
        if (i2 == 1) {
            this.bm.setProgress(0);
        } else if (i2 == 2) {
            this.bm.setProgress(45);
        } else {
            if (i2 != 3) {
                return;
            }
            this.bm.setProgress(90);
        }
    }

    private void ar() {
        if (!this.au) {
            int i2 = this.e;
            if (i2 == 1 || i2 == 0) {
                this.l = a(i2 == 0);
                return;
            }
        }
        this.l = this.cd;
    }

    private double a(boolean z) {
        double d2 = this.bq;
        double d3 = (this.bi + d2) / 2.0d;
        if (z) {
            if (d2 <= 0.0d || this.h <= d3) {
                return this.h - 1.0d;
            }
        } else if (d2 <= 0.0d || this.h >= d3) {
            return this.h + 1.0d;
        }
        return d3;
    }

    private void c(WeightTargetDifferences weightTargetDifferences) {
        if (weightTargetDifferences.d() == 0) {
            g();
        } else {
            y();
        }
    }

    private void g() {
        if (this.cd == 0.0f) {
            this.cd = this.cf;
        }
        if (y()) {
            return;
        }
        if (this.ak == 0.0d || this.aj == 0.0d) {
            double d2 = this.cd;
            this.ak = d2 - 1.0d;
            this.aj = d2 + 1.0d;
        }
    }

    private boolean y() {
        if (!aa() && !health.compact.a.CommonUtil.b(this.bq)) {
            this.ak = this.bq;
            this.aj = this.bi;
            w();
            x();
            return true;
        }
        LogUtil.a("HealthWeight_WeightGoalActivity", "no set height.");
        return false;
    }

    private void b(double d2, double d3) {
        double d4 = this.at ? d2 : d3;
        String strE = UnitUtil.e(UnitUtil.c(d2), 1, 1);
        String strE2 = UnitUtil.e(UnitUtil.c(d3), 1, 1);
        this.as.setSelectedPosition(vng.a(d4, (int) this.ah));
        this.af.setText(strE);
        this.am.setText(strE2);
        this.aq.setText(vei.b(UnitUtil.b(d3, 1)));
        this.ao.setText(getResources().getString(R.string.IDS_hw_pressure_grade_range, UnitUtil.e(UnitUtil.b(d2, 1), 1, 1), vei.b(UnitUtil.b(d3, 1), 1)));
    }

    private void f(int i2) {
        double dE = vng.e(i2, true);
        this.h = dE;
        String strB = vei.b(UnitUtil.c(dE), 1);
        this.ce.setText(UnitUtil.b(this.f27655c, "\\d+.\\d+|\\d+", strB, R.style.health_weight_goal_value_text, R.style.health_data_weight_unit));
        this.f.setText(strB);
        v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(int i2) {
        double dC = vng.c((int) this.ah, i2, true);
        if (this.at) {
            this.ak = dC;
        } else {
            this.aj = dC;
        }
        (this.at ? this.af : this.am).setText(UnitUtil.e(UnitUtil.c(dC), 1, 1));
    }

    private void al() {
        this.cc.setOnSelectedListener(new ScrollScaleView.OnSelectedListener() { // from class: com.huawei.ui.main.stories.health.activity.healthdata.WeightGoalActivity.8
            @Override // com.huawei.ui.commonui.scrollview.ScrollScaleView.OnSelectedListener
            public void onSelected(List<String> list, int i2) {
                WeightGoalActivity.this.g(i2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(int i2) {
        int i3 = i();
        int iB = b(this.bg);
        if (i3 == iB) {
            int iB2 = b(10.0d);
            this.bg = 10.0d;
            iB = iB2;
        }
        int i4 = this.e;
        if (i4 == 0 && i2 >= i3) {
            int i5 = i3 - 1;
            this.cc.setSelectedPosition(i5);
            j(this.cc.b(i5));
        } else if (i4 == 0 && i2 <= iB) {
            this.cc.setSelectedPosition(iB);
            j(this.cc.b(iB));
        } else if (i4 == 1 && i2 <= i3) {
            int i6 = i3 + 1;
            this.cc.setSelectedPosition(i6);
            j(this.cc.b(i6));
        } else {
            j(i2);
        }
        av();
        h();
    }

    private int i() {
        if (!this.au) {
            return b(this.h);
        }
        float f2 = MultiUsersManager.INSTANCE.getMainUser().f();
        if (f2 <= 0.0f) {
            return b(this.h);
        }
        int i2 = this.e;
        if (i2 == 0) {
            return b(Math.min(f2, this.h));
        }
        if (i2 == 1) {
            return b(Math.max(f2, this.h));
        }
        return b(this.h);
    }

    private void at() {
        am();
        int i2 = this.e;
        if (i2 != 2 && i2 != -1) {
            this.ab.setGoalType(5);
            this.ab.setGoalValue(new BigDecimal(this.l).doubleValue());
            j(UnitUtil.c(this.l));
            this.cc.setSelectedPosition(b(this.l));
            return;
        }
        LogUtil.j("HealthWeight_WeightGoalActivity", "updateScrollView GoalType is illegal and not Oversea");
    }

    private void v() {
        double dC = UnitUtil.c(Math.abs(this.x - this.h));
        int i2 = this.e;
        if (i2 == 1) {
            this.ba.setText(a(getString(R.string.IDS_hwh_home_you_need_to_increase_weight, new Object[]{vei.b(dC, 1)})));
        } else if (i2 == 2) {
            this.ay.setText(a(getString(R.string.IDS_hwh_home_standard_weight_range_value, new Object[]{UnitUtil.e(this.ak, 1, 1), vei.b(this.aj, 1)})));
        } else {
            ak();
        }
        a(j());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ak() {
        String quantityString;
        double dC = UnitUtil.c(Math.abs(this.x - this.h));
        String string = BaseApplication.getContext().getResources().getString(R.string.IDS_hwh_home_you_need_to_lose_weight_weekly);
        int iD = vei.d(this.aw, this.h, this.ab.getGoalValue());
        LogUtil.a("HealthWeight_WeightGoalActivity", "setWeightDayText day ", Integer.valueOf(iD), " mCurrentWeight ", Double.valueOf(this.h), " mGoalWeight ", Double.valueOf(this.x));
        if (this.x != 0.0d) {
            quantityString = BaseApplication.getContext().getResources().getQuantityString(R.plurals.IDS_user_profile_achieve_num_day, iD, UnitUtil.e(iD, 1, 0));
        } else {
            quantityString = BaseApplication.getContext().getResources().getQuantityString(R.plurals.IDS_user_profile_achieve_num_day, iD, "");
        }
        this.ba.setText(a(String.format(string, vei.b(dC, 1), quantityString)));
    }

    private void i(double d2) {
        if (d2 > 0.0d) {
            this.n = 0;
            c(this.co, this.ck, this.cl, 0);
        } else if (d2 < 0.0d) {
            this.n = 1;
            c(this.ck, this.co, this.cl, 1);
        } else {
            this.n = 2;
            c(this.cl, this.co, this.ck, 2);
        }
        this.e = this.n;
    }

    private void j(int i2) {
        double dDoubleValue;
        int i3 = this.cq;
        if (i3 == 3) {
            dDoubleValue = new BigDecimal(((double) (i2 + HeartRateThresholdConfig.HEART_RATE_LIMIT)) / 10.0d).setScale(1, 4).doubleValue();
            this.ab.setGoalType(5);
            this.ab.setGoalValue(new BigDecimal(UnitUtil.i(dDoubleValue)).doubleValue());
        } else if (i3 == 1) {
            dDoubleValue = new BigDecimal(((UnitUtil.j(10.0d) * 10.0d) + ((double) i2)) / 10.0d).setScale(1, 4).doubleValue();
            this.ab.setGoalType(5);
            this.ab.setGoalValue(BigDecimal.valueOf(UnitUtil.b(dDoubleValue)).doubleValue());
        } else {
            dDoubleValue = new BigDecimal(((double) (i2 + 100)) / 10.0d).setScale(1, 4).doubleValue();
            this.ab.setGoalType(5);
            this.ab.setGoalValue(dDoubleValue);
        }
        e(dDoubleValue);
        v();
    }

    private void e(double d2) {
        j(d2);
        float f2 = this.cf;
        if (f2 > 10.0f && f2 < 251.0f) {
            ao();
        } else {
            LogUtil.a("HealthWeight_WeightGoalActivity", "setSelectScrollViewData mWeightData less more 10");
        }
    }

    private void ao() {
        double goalValue = this.ab.getGoalValue();
        double d2 = this.h;
        if (goalValue > d2) {
            c(this.ck, this.co, this.cl, 1);
        } else if (goalValue < d2) {
            c(this.co, this.ck, this.cl, 0);
        } else {
            LogUtil.a("HealthWeight_WeightGoalActivity", "setWeightManagementState goalValue is equals mWeightData");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ah() {
        am();
        ad();
        if (this.au) {
            this.cj.setVisibility(0);
        }
        if (this.cd == 0.0f) {
            this.bs.setText("--");
            this.n = -1;
            return;
        }
        aj();
        float f2 = this.cd;
        this.l = f2;
        float f3 = this.cf;
        if (f2 < f3) {
            this.n = 0;
        } else if (f2 > f3) {
            this.n = 1;
        } else {
            this.n = 2;
        }
    }

    private void ad() {
        this.e = -1;
        this.bx.setEnabled(false);
        a(this.bt);
        this.bt.setVisibility(8);
        this.bu.setVisibility(8);
        this.bs.setVisibility(0);
        HealthTextView healthTextView = this.bk;
        if (healthTextView != null) {
            healthTextView.setTextAppearance(R.style.weight_management_goal_normal);
            this.bk.setBackgroundResource(R.drawable.weight_management_card_normal);
            this.bk = null;
        }
        d(false);
    }

    private void aj() {
        this.bs.setText(vei.b(UnitUtil.d(this.cd, 0), 0));
    }

    private void am() {
        String string;
        if (aa()) {
            int i2 = this.cq;
            if (i2 == 3) {
                string = getString(R.string.IDS_hwh_home_standard_weight_range_no_data_imp);
            } else if (i2 == 1) {
                string = getString(R.string.IDS_hwh_home_standard_weight_catty_range_no_data);
            } else {
                string = getString(R.string.IDS_hwh_home_standard_weight_range_no_data);
            }
            this.cp.setText(string);
            return;
        }
        au();
    }

    private void j(double d2) {
        double d3;
        int i2 = 1;
        int i3 = d2 == ((double) Double.valueOf(d2).intValue()) ? 1 : 0;
        if (this.e == 2) {
            boolean z = Math.round(Math.pow(10.0d, 2.0d) * d2) % 10 == 0;
            if (i3 != 0) {
                i2 = 0;
            } else if (!z) {
                i2 = 2;
            }
            d3 = UnitUtil.d(d2, i2);
            this.bs.setText(vei.b(d3, i2));
        } else {
            int i4 = i3 ^ 1;
            d3 = UnitUtil.d(d2, i4);
            String strB = vei.b(d3, i4);
            this.cs.setText(UnitUtil.b(this.f27655c, "\\d+.\\d+|\\d+", strB, R.style.health_weight_goal_value_text, R.style.health_data_weight_unit));
            this.bs.setText(strB);
        }
        this.x = UnitUtil.d(d3);
    }

    private int e(double d2, double d3) {
        int i2 = this.cq;
        if (i2 == 3) {
            double dH = UnitUtil.h(d2);
            if (dH >= 552.0d) {
                dH = 551.0d;
            }
            return vei.e((float) ((dH - ((double) ((int) UnitUtil.h(d3)))) * 10.0d));
        }
        if (i2 == 1) {
            double dJ = UnitUtil.j(d2);
            if (dJ >= UnitUtil.j(251.0d)) {
                dJ = UnitUtil.j(251.0d) - 1.0d;
            }
            return vei.e((float) ((dJ - UnitUtil.j(d3)) * 10.0d));
        }
        if (d2 >= 251.0d) {
            d2 = 250.0d;
        }
        return vei.e((float) ((d2 - d3) * 10.0d));
    }

    private int b(double d2) {
        return e(d2, 10.0d);
    }

    private void au() {
        double[] dArrA = exz.a((byte) this.y);
        double dPow = Math.pow(((double) this.aa) / 100.0d, 2.0d);
        double d2 = dArrA[0];
        double dPow2 = Math.pow(((double) this.aa) / 100.0d, 2.0d);
        double d3 = dArrA[1];
        this.f27653a = UnitUtil.d(dPow * d2, 1);
        double d4 = UnitUtil.d(dPow2 * d3, 1);
        this.d = d4;
        this.ah = this.f27653a;
        this.ad = d4;
        double[] dArrE = exz.e(Utils.o(), (byte) this.y, this.ac.getAge());
        double dPow3 = Math.pow(((double) this.aa) / 100.0d, 2.0d) * dArrE[0];
        this.bq = d(dPow3).intValue();
        double dPow4 = Math.pow(((double) this.aa) / 100.0d, 2.0d) * dArrE[1];
        this.bi = d(dPow4).intValue();
        double dC = UnitUtil.c(dPow3);
        double dC2 = UnitUtil.c(dPow4);
        int i2 = this.cq;
        if (i2 == 3) {
            this.cp.setText(String.format(BaseApplication.getContext().getResources().getQuantityString(R.plurals.IDS_hwh_home_standard_weight_range_imperial, 0), Float.valueOf(d(dC).floatValue()), Float.valueOf(d(dC2).floatValue())));
        } else if (i2 == 1) {
            this.cp.setText(String.format(BaseApplication.getContext().getResources().getString(R.string.IDS_hwh_home_standard_weight_range_value), UnitUtil.e(d(dC).intValue(), 1, 0), vei.b(dC2, 0)));
        } else {
            this.cp.setText(String.format(BaseApplication.getContext().getString(R.string.IDS_hwh_home_standard_weight_range), Integer.valueOf(d(dC).intValue()), Integer.valueOf(d(dC2).intValue())));
        }
        this.bp.setText(getString(R.string.IDS_hwh_home_standard_weight_range_value, new Object[]{UnitUtil.e(d(dC).intValue(), 1, 0), vei.b(d(dC2).intValue(), 0)}));
        a(dC, dC2);
        this.as.setData(vng.d((int) Math.floor(this.ah), ((int) Math.ceil(this.ad)) + 1), 10, 40);
    }

    private void a(double d2, double d3) {
        if (LanguageUtil.br(this.f27655c) || LanguageUtil.z(this.f27655c) || LanguageUtil.x(this.f27655c)) {
            this.bp.setText(getString(R.string.IDS_hwh_home_standard_weight_range_value, new Object[]{c(d3), a(d2)}));
        }
        if (LanguageUtil.aj(this.f27655c)) {
            this.bp.setText(getString(R.string.IDS_hwh_home_standard_weight_range_value, new Object[]{a(d2), c(d3)}));
        }
    }

    private String c(double d2) {
        return UnitUtil.e(d(d2).intValue(), 1, 0);
    }

    private String a(double d2) {
        return vei.b(d(d2).intValue(), 0);
    }

    private BigDecimal d(double d2) {
        return new BigDecimal(d2).setScale(0, 4);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        LogUtil.a("HealthWeight_WeightGoalActivity", "onResume mHiUserInfo ", this.ac);
        ThreadPoolManager.c().a("getHeightIsNotSet", new Runnable() { // from class: com.huawei.ui.main.stories.health.activity.healthdata.WeightGoalActivity.6
            @Override // java.lang.Runnable
            public void run() {
                WeightGoalActivity.this.f27654b = wvf.e().c();
                WeightGoalActivity.this.r();
            }
        });
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ObserverManagerUtil.c(this.bc);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == null) {
            LogUtil.j("HealthWeight_WeightGoalActivity", "onclick failure because view is null!");
        } else {
            a(view);
        }
    }

    private void a(View view) {
        if (this.bj == view) {
            if (qrs.r()) {
                LogUtil.e("HealthWeight_WeightGoalActivity", "fast click save goals, return");
                return;
            }
            if (this.e == -1) {
                qpx.e(this, R.string.IDS_tips_no_weight_goal);
                return;
            }
            double goalValue = this.ab.getGoalValue();
            if (this.e != 2 && Math.abs(goalValue - this.h) <= 1.0E-6d) {
                ab();
                return;
            } else {
                ac();
                return;
            }
        }
        if (this.ap == view || this.bv == view) {
            vdv.c(this.f27655c, !aa());
            return;
        }
        if (this.ci == view) {
            as();
            return;
        }
        HealthTextView healthTextView = this.co;
        if (healthTextView == view) {
            if (this.e != 0) {
                c(healthTextView, this.ck, this.cl, 0);
                ae();
                av();
                return;
            }
            return;
        }
        HealthTextView healthTextView2 = this.ck;
        if (healthTextView2 == view) {
            if (this.e != 1) {
                c(healthTextView2, healthTextView, this.cl, 1);
                ae();
                av();
                return;
            }
            return;
        }
        HealthTextView healthTextView3 = this.cl;
        if (healthTextView3 == view) {
            if (this.e != 2) {
                c(healthTextView3, healthTextView, healthTextView2, 2);
                g();
                b(this.ak, this.aj);
                return;
            }
            return;
        }
        if (view == this.r) {
            vbs.c(this);
        } else {
            c(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(View view, int i2) {
        if (view.getVisibility() != i2) {
            view.setVisibility(i2);
        }
    }

    private void c(View view) {
        if (this.bx == view) {
            b(this.bs, this.bu, this.bt, this.bu.getVisibility() != 0);
            return;
        }
        if (this.u == view) {
            b(this.t, this.q, this.p, this.q.getVisibility() != 0);
            return;
        }
        if (this.ca == view) {
            b(this.f, this.cb, this.by, this.cb.getVisibility() != 0);
            return;
        }
        if (this.ar == view) {
            b(this.ao, this.ai, this.ae, this.ai.getVisibility() != 0);
            return;
        }
        if (this.af == view) {
            aq();
        } else if (this.am == view) {
            ap();
        } else {
            LogUtil.a("HealthWeight_WeightGoalActivity", "onclick failure");
        }
    }

    private void ap() {
        this.at = false;
        this.an.setVisibility(8);
        this.al.setVisibility(0);
        this.af.setTextColor(getColor(R.color.textColorSecondary));
        this.am.setTextColor(getColor(R.color.hw_show_setting_prompt_text_color));
        b(this.ak, this.aj);
    }

    private void aq() {
        this.at = true;
        this.an.setVisibility(0);
        this.al.setVisibility(8);
        this.am.setTextColor(getColor(R.color.textColorSecondary));
        this.af.setTextColor(getColor(R.color.hw_show_setting_prompt_text_color));
        b(this.ak, this.aj);
    }

    private void b(HealthTextView healthTextView, LinearLayout linearLayout, ImageView imageView, boolean z) {
        if (z) {
            if (healthTextView != null) {
                healthTextView.setVisibility(8);
            }
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
            }
            if (imageView != null) {
                d(imageView);
                return;
            }
            return;
        }
        if (healthTextView != null) {
            healthTextView.setVisibility(0);
        }
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        if (imageView != null) {
            a(imageView);
        }
    }

    private void a(ImageView imageView) {
        if (LanguageUtil.ba(BaseApplication.getContext())) {
            imageView.setImageResource(R.drawable.ic_arrow_up);
        } else {
            imageView.setImageResource(R.drawable.ic_arrow_down);
        }
    }

    private void d(ImageView imageView) {
        if (LanguageUtil.ba(BaseApplication.getContext())) {
            imageView.setImageResource(R.drawable.ic_arrow_down);
        } else {
            imageView.setImageResource(R.drawable.ic_arrow_up);
        }
    }

    private void ae() {
        int i2 = 0;
        double dA = a(this.e == 0);
        j(UnitUtil.c(dA));
        int iB = b(dA);
        if (iB <= 0) {
            LogUtil.a("HealthWeight_WeightGoalActivity", "setNewGoalType newGoalPosition is min");
        } else {
            LogUtil.a("HealthWeight_WeightGoalActivity", "setNewGoalType newGoalPosition is normal");
            i2 = iB;
        }
        this.cc.setSelectedPosition(i2);
    }

    private void c(HealthTextView healthTextView, HealthTextView healthTextView2, HealthTextView healthTextView3, int i2) {
        this.e = i2;
        e(this.bb, this.aw == 1 ? 0 : 8);
        h();
        d(true);
        this.bk = healthTextView;
        healthTextView.setTextAppearance(R.style.weight_management_goal_select);
        this.bk.setTextColor(this.f27655c.getResources().getColor(R.color.weight_text_color));
        this.bk.setBackgroundResource(R.drawable.weight_management_card_select);
        healthTextView2.setTextAppearance(R.style.weight_management_goal_normal);
        healthTextView2.setBackgroundResource(R.drawable.function_set_big_card_button_background);
        healthTextView3.setTextAppearance(R.style.weight_management_goal_normal);
        healthTextView3.setBackgroundResource(R.drawable.function_set_big_card_button_background);
        if (i2 == 2) {
            this.bx.setEnabled(false);
            this.bs.setVisibility(0);
            a(this.bt);
            this.bt.setVisibility(8);
            this.s.setVisibility(8);
            this.bw.setVisibility(8);
            this.ag.setVisibility(0);
            this.ax.setVisibility(8);
            u();
            j(UnitUtil.a(this.cf));
            return;
        }
        if (i2 == 0) {
            this.bx.setEnabled(true);
            this.bt.setVisibility(0);
            this.s.setVisibility(8);
            this.bw.setVisibility(0);
            this.ag.setVisibility(8);
            this.ax.setVisibility(0);
            return;
        }
        this.bx.setEnabled(true);
        this.bt.setVisibility(0);
        this.s.setVisibility(0);
        this.bw.setVisibility(0);
        this.ag.setVisibility(8);
        this.ax.setVisibility(8);
    }

    private void u() {
        this.ab.setGoalType(5);
        this.ab.setGoalValue(new BigDecimal(this.cf).doubleValue());
    }

    private void ab() {
        vdv.a(this.f27655c);
    }

    private void h(double d2) {
        f(d2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(float f2) {
        this.z.e(new c(this.cg, f2));
        final dso dsoVar = new dso();
        dsoVar.setBodyFatRat(0.0f);
        dsoVar.setWeight((float) UnitUtil.d(this.h, 1));
        dsoVar.setStartTime(this.bl);
        dsoVar.d(true);
        dsoVar.setEndTime(this.bl);
        this.z.b(MultiUsersManager.INSTANCE.getMainUser());
        final dnj mainUser = MultiUsersManager.INSTANCE.getMainUser();
        if (mainUser == null) {
            LogUtil.e("HealthWeight_WeightGoalActivity", "main user is null");
        } else {
            ThreadPoolManager.c().execute(new Runnable() { // from class: urw
                @Override // java.lang.Runnable
                public final void run() {
                    this.f50499b.d(mainUser, dsoVar);
                }
            });
        }
    }

    public /* synthetic */ void d(dnj dnjVar, dso dsoVar) {
        this.z.b(dnjVar);
        this.z.onDataChanged(vng.a(), dsoVar);
    }

    private void f(double d2) {
        if (!health.compact.a.CommonUtil.ab(BaseApplication.getContext())) {
            qpx.e(this, R.string.IDS_network_connect_error);
            LogUtil.j("HealthWeight_WeightGoalActivity", "saveWeightTargetDifferences No network");
        } else {
            e(d2, this.i, this.w);
        }
    }

    private void e(double d2, IntPlan intPlan, Boolean bool) {
        int i2;
        long j;
        WeightTargetDifferences weightTargetDifferences;
        int i3 = 0;
        if (intPlan != null && intPlan.getPlanType() == IntPlan.PlanType.AI_FITNESS_PLAN) {
            vei.d(intPlan.getPlanId(), (Context) this, false);
            return;
        }
        boolean zE = lua.e();
        if (!Utils.h() || zE) {
            LogUtil.a("HealthWeight_WeightGoalActivity", "saveGoals mCurrentGoalType ", Integer.valueOf(this.e));
            Bundle bundle = new Bundle();
            bundle.putInt("age", ioy.d());
            bundle.putInt(CommonConstant.KEY_GENDER, this.y);
            bundle.putInt("height", this.aa);
            bundle.putDouble("weight", this.h);
            bundle.putDouble("targetWeight", d2);
            bundle.putInt("fatBurnChoice", this.aw);
            if (this.au) {
                bundle.putBoolean("targetSettingChanged", (this.bd == this.aw && Float.compare(this.be, (float) d2) == 0) ? false : true);
                bundle.putBoolean("isRefreshInitWeight", false);
                bundle.putDouble("startWeight", e(this.cn));
            } else {
                bundle.putBoolean("targetSettingChanged", true);
                bundle.putBoolean("isRefreshInitWeight", true);
            }
            int i4 = this.e;
            if (i4 == 0) {
                i2 = 0;
                j = 0;
                i3 = 1;
            } else if (i4 == 1) {
                j = j();
                i2 = 0;
                i3 = 2;
            } else {
                i2 = (int) (((this.aj * 1000.0d) - (this.ak * 1000.0d)) / 2.0d);
                ReleaseLogUtil.d("HealthWeight_WeightGoalActivity", "saveWeightGoal mCurrentGoalType ", Integer.valueOf(i4));
                j = 0;
            }
            bundle.putInt("weightManagerType", i3);
            bundle.putLong("targetFinishDate", j);
            bundle.putInt("maintainTargetWeightRange", i2);
            long jCurrentTimeMillis = System.currentTimeMillis();
            bundle.putLong("targetBeginDate", (!this.au || (weightTargetDifferences = this.cm) == null || weightTargetDifferences.a() == 0) ? jCurrentTimeMillis : this.cm.a());
            bundle.putLong("modifiedTime", jCurrentTimeMillis);
            bundle.putSerializable("intPlan", (Serializable) intPlan);
            bundle.putBoolean("getIntPlan", bool.booleanValue());
            bundle.putBoolean("waitSaveWeight", true);
            vms.c(bundle, new f(d2));
            return;
        }
        ReleaseLogUtil.e("HealthWeight_WeightGoalActivity", "isPullAllStatus is false");
        Context context = this.f27655c;
        qpx.b(context, context.getString(R.string.IDS_hwh_home_weight_goal_tips));
    }

    private double e(ivd ivdVar) {
        float f2 = MultiUsersManager.INSTANCE.getMainUser().f();
        if (f2 > 0.0f) {
            return f2;
        }
        ReleaseLogUtil.e("HealthWeight_WeightGoalActivity", "getStartWeight startWeight ", Float.valueOf(f2));
        if (ivdVar == null) {
            ReleaseLogUtil.e("HealthWeight_WeightGoalActivity", "getStartWeight weightManager is null");
            return 0.0d;
        }
        return ivdVar.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:11:0x0046  */
    /* JADX WARN: Code duplicated, block: B:12:0x005b  */
    /* JADX WARN: Code duplicated, block: B:20:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:24:0x0108  */
    public void g(double d2) {
        double d3;
        long j;
        double dE;
        long j2;
        int i2;
        long jCurrentTimeMillis;
        long jA;
        WeightTargetDifferences weightTargetDifferences;
        double d4 = this.h;
        double d5 = d4 - this.x;
        int i3 = this.e;
        if (i3 == 0) {
            j = b(vei.d(this.aw, d4, d2));
            dE = vng.e(System.currentTimeMillis(), j, d5);
        } else {
            if (i3 == 1) {
                dE = vng.e(System.currentTimeMillis(), j(), d5);
                j = j();
            } else {
                d3 = 0.0d;
                j = 0;
            }
            if (d3 == 0.0d) {
                i2 = (int) (((this.aj * 1000.0d) - (this.ak * 1000.0d)) / 2.0d);
                j2 = 0;
            } else {
                j2 = j;
                i2 = 0;
            }
            LogUtil.a("HealthWeight_WeightGoalActivity", "finalDailyWeightDiff ", Double.valueOf(d3), "mCurrentWeight:", Double.valueOf(this.h), "mGoalWeight:", Double.valueOf(this.x), " finishDate ", Long.valueOf(j2), " maintainTargetWeightRange ", Integer.valueOf(i2), " goalValue ", Double.valueOf(d2));
            this.ab.setGoalValue(d2);
            int iB = lsl.b(DateFormatUtil.a(System.currentTimeMillis()), DateFormatUtil.a(j()));
            jCurrentTimeMillis = System.currentTimeMillis();
            if (this.au || (weightTargetDifferences = this.cm) == null || weightTargetDifferences.a() == 0) {
                jA = jCurrentTimeMillis;
            } else {
                jA = this.cm.a();
            }
            this.bl = jCurrentTimeMillis;
            c(this.e, iB, d5, new WeightTargetDifferences(d3, jA, j2, i2));
            e(j2);
            oru.a(com.huawei.haf.application.BaseApplication.b()).c(com.huawei.haf.application.BaseApplication.b(), String.valueOf(1200), new HashMap());
            if (Math.abs(((double) this.be) - d2) >= 0.5d) {
                nsv.e(com.huawei.haf.application.BaseApplication.b()).d(20000);
                SharedPreferenceManager.e(com.huawei.haf.application.BaseApplication.b(), String.valueOf(10006), "health_weight_goal_change", String.valueOf(true), null);
            }
            health.compact.a.CommonUtil.am(com.huawei.haf.application.BaseApplication.b());
        }
        d3 = dE;
        if (d3 == 0.0d) {
            i2 = (int) (((this.aj * 1000.0d) - (this.ak * 1000.0d)) / 2.0d);
            j2 = 0;
        } else {
            j2 = j;
            i2 = 0;
        }
        LogUtil.a("HealthWeight_WeightGoalActivity", "finalDailyWeightDiff ", Double.valueOf(d3), "mCurrentWeight:", Double.valueOf(this.h), "mGoalWeight:", Double.valueOf(this.x), " finishDate ", Long.valueOf(j2), " maintainTargetWeightRange ", Integer.valueOf(i2), " goalValue ", Double.valueOf(d2));
        this.ab.setGoalValue(d2);
        int iB2 = lsl.b(DateFormatUtil.a(System.currentTimeMillis()), DateFormatUtil.a(j()));
        jCurrentTimeMillis = System.currentTimeMillis();
        if (this.au) {
            jA = jCurrentTimeMillis;
        } else {
            jA = jCurrentTimeMillis;
        }
        this.bl = jCurrentTimeMillis;
        c(this.e, iB2, d5, new WeightTargetDifferences(d3, jA, j2, i2));
        e(j2);
        oru.a(com.huawei.haf.application.BaseApplication.b()).c(com.huawei.haf.application.BaseApplication.b(), String.valueOf(1200), new HashMap());
        if (Math.abs(((double) this.be) - d2) >= 0.5d) {
            nsv.e(com.huawei.haf.application.BaseApplication.b()).d(20000);
            SharedPreferenceManager.e(com.huawei.haf.application.BaseApplication.b(), String.valueOf(10006), "health_weight_goal_change", String.valueOf(true), null);
        }
        health.compact.a.CommonUtil.am(com.huawei.haf.application.BaseApplication.b());
    }

    private void e(long j) {
        dnj mainUser = MultiUsersManager.INSTANCE.getMainUser();
        if (mainUser == null) {
            LogUtil.j("HealthWeight_WeightGoalActivity", "createWeightDialogTargetId user is null");
            return;
        }
        vdv.c(j + mainUser.i());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long j() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(1, this.m.getYear());
        calendar.set(2, this.m.getMonth() - 1);
        calendar.set(5, this.m.getDayOfMonth());
        Date time = calendar.getTime();
        LogUtil.a("HealthWeight_WeightGoalActivity", "finisDate:", Long.valueOf(time.getTime()));
        return time.getTime();
    }

    private long b(int i2) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(5, i2 - 1);
        Date time = calendar.getTime();
        LogUtil.a("HealthWeight_WeightGoalActivity", "loseWeight finishDate: ", Long.valueOf(time.getTime()));
        return time.getTime();
    }

    private void c(int i2, int i3, double d2, WeightTargetDifferences weightTargetDifferences) {
        HashMap map = new HashMap(16);
        map.put("click", 1);
        map.put("type", Integer.valueOf(i2));
        if (i2 == 0) {
            double dAbs = Math.abs((UnitUtil.d((weightTargetDifferences.c() / 1000.0d) * 7.0d, 1) / 7.0d) * 7700.0d);
            if (dAbs < 400.0d) {
                map.put("difficulty", 1);
            } else if (dAbs <= 600.0d) {
                map.put("difficulty", 2);
            } else {
                map.put("difficulty", 3);
            }
        }
        map.put("target", Double.valueOf(Math.abs(UnitUtil.d(d2, 1))));
        if (UnitUtil.e() == 1) {
            map.put("unit", "catty");
        }
        if (UnitUtil.e() == 2) {
            map.put("unit", "kilogram");
        }
        if (UnitUtil.e() == 3) {
            map.put("unit", "Pounds");
        }
        map.put("days", Integer.valueOf(i3));
        map.put(FunctionSetBeanReader.BI_ELEMENT, Double.valueOf(Math.abs(UnitUtil.d((weightTargetDifferences.c() / 1000.0d) * 7.0d, 1))));
        a(map, i2);
    }

    private void a(Map<String, Object> map, int i2) {
        if (this.au) {
            map.put("setType", 1);
            if (i2 != 2) {
                double d2 = this.x;
                double d3 = this.cd;
                if (d2 > d3) {
                    map.put("adjustType", 1);
                } else if (d2 < d3) {
                    map.put("adjustType", -1);
                } else {
                    map.put("adjustType", 0);
                }
            }
        } else {
            map.put("from", Integer.valueOf(this.v));
            map.put("setType", 0);
        }
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.WEIGHT_SAVE_GOAL_CLICKED_2040149.value(), map, 0);
    }

    private void ac() {
        double goalValue = this.ab.getGoalValue();
        if (goalValue <= 0.0d) {
            goalValue = MultiUsersManager.INSTANCE.getMainUser().n();
        }
        int i2 = this.e;
        if (i2 != 1 && i2 != 0) {
            goalValue = (this.ak + this.aj) / 2.0d;
        }
        LogUtil.a("HealthWeight_WeightGoalActivity", "saveData goalValue ", Double.valueOf(goalValue), " mCurrentGoalType ", Integer.valueOf(i2), " mHoldWeightRangeLowValue ", Double.valueOf(this.ak), " mHoldWeightRangeHighValue ", Double.valueOf(this.aj));
        h(goalValue);
    }

    private boolean aa() {
        int i2 = this.aa;
        return (i2 == 170 && this.f27654b) || i2 == 0;
    }

    private void d(boolean z) {
        LogUtil.a("HealthWeight_WeightGoalActivity", "setSaveClick isClick:", Boolean.valueOf(z));
        if (z) {
            this.bj.setBackgroundResource(R.drawable.weight_button_background);
        } else {
            this.bj.setBackgroundResource(R.drawable.weight_button_background_disable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        HiHealthManager.d(BaseApplication.getContext()).fetchUserData(new e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Object obj) {
        LogUtil.a("HealthWeight_WeightGoalActivity", "fetchUserData onSuccess,data = ", obj);
        OpAnalyticsUtil.getInstance().setEventOneErrorCode(OperationKey.HEALTH_APP_WEIGHT_GET_USER_INFORMATION_85070011.value(), qrs.a("0"));
        if (obj == null) {
            return;
        }
        List list = (List) obj;
        if (list.size() > 0) {
            HiUserInfo hiUserInfo = (HiUserInfo) list.get(0);
            this.ac = hiUserInfo;
            this.aa = hiUserInfo.getHeight();
            float fN = MultiUsersManager.INSTANCE.getMainUser().n();
            this.cd = fN;
            this.be = fN;
            float fC = iun.c();
            this.cf = fC;
            this.h = fC;
            this.y = this.ac.getGender();
            boolean zD = d();
            LogUtil.a("HealthWeight_WeightGoalActivity", "processUserInformation isUserInfoValid ", Boolean.valueOf(zD), " mWeightData: ", Float.valueOf(this.cf));
            if (zD) {
                b();
            } else {
                aw();
            }
        } else {
            double dR = MultiUsersManager.INSTANCE.getMainUser().r();
            this.h = dR;
            LogUtil.a("HealthWeight_WeightGoalActivity", "processUserInformation mCurrentWeight ", Double.valueOf(dR));
        }
        HandlerExecutor.b(new Runnable() { // from class: urn
            @Override // java.lang.Runnable
            public final void run() {
                this.f50486a.c();
            }
        });
    }

    public /* synthetic */ void c() {
        int iE = vng.e(this.h);
        this.bf = iE;
        this.j.setSelectedPosition(iE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void aw() {
        if (!HandlerExecutor.c()) {
            HandlerExecutor.b(new Runnable() { // from class: uru
                @Override // java.lang.Runnable
                public final void run() {
                    this.f50496c.aw();
                }
            });
            return;
        }
        LogUtil.a("HealthWeight_WeightGoalActivity", "showSettingDialog  weight ", Float.valueOf(this.cf), " height ", Integer.valueOf(this.aa), " gender ", Integer.valueOf(this.y));
        qra.c(this, false, new i(this), getColor(R.color.light_fasting_body_state_bg));
    }

    /* JADX INFO: loaded from: classes19.dex */
    static class i implements IBaseResponseCallback {
        private WeakReference<WeightGoalActivity> d;

        i(WeightGoalActivity weightGoalActivity) {
            this.d = new WeakReference<>(weightGoalActivity);
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            WeightGoalActivity weightGoalActivity = this.d.get();
            LogUtil.a("HealthWeight_WeightGoalActivity", "ShowUserInfoCallBack errorCode ", Integer.valueOf(i), " activity ", weightGoalActivity);
            if (weightGoalActivity == null || weightGoalActivity.isFinishing() || weightGoalActivity.isDestroyed() || i == 0) {
                return;
            }
            weightGoalActivity.finish();
        }
    }

    private boolean d() {
        return this.ac.isWeightValid() && this.ac.isHeightValid() && this.ac.isBirthdayValid() && this.ac.isGenderValid();
    }

    private void as() {
        View viewInflate = View.inflate(this, R.layout.health_healthdata_edit_goal_dialog, null);
        double goalValue = this.ab.getGoalValue();
        if (goalValue <= 0.0d) {
            goalValue = MultiUsersManager.INSTANCE.getMainUser().n();
        }
        double dC = UnitUtil.c(goalValue);
        HealthEditText healthEditText = (HealthEditText) viewInflate.findViewById(R.id.edit_goal);
        this.o = healthEditText;
        try {
            healthEditText.setText(String.valueOf(Integer.parseInt(String.valueOf(new BigDecimal(dC).setScale(0, 4)))));
        } catch (NumberFormatException e2) {
            LogUtil.e("HealthWeight_WeightGoalActivity", "showEditDialog NumberFormatException ", e2.getMessage());
        }
        this.o.setFocusableInTouchMode(true);
        this.o.setFocusable(true);
        this.o.requestFocus();
        final HealthErrorTipTextLayout healthErrorTipTextLayout = (HealthErrorTipTextLayout) viewInflate.findViewById(R.id.edit_goal_layout);
        final CustomViewDialog.Builder builder = new CustomViewDialog.Builder(this.f27655c);
        builder.b(R.string.IDS_hw_show_main_home_page_step_goal);
        builder.d(viewInflate);
        builder.c(false);
        builder.c(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: com.huawei.ui.main.stories.health.activity.healthdata.WeightGoalActivity.10
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        });
        builder.d(R.string.IDS_settings_button_ok, new View.OnClickListener() { // from class: com.huawei.ui.main.stories.health.activity.healthdata.WeightGoalActivity.7
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                WeightGoalActivity.this.c(WeightGoalActivity.this.o.getText().toString().trim(), healthErrorTipTextLayout, builder);
            }
        });
        CustomViewDialog customViewDialogD = builder.d();
        customViewDialogD.setCanceledOnTouchOutside(true);
        customViewDialogD.show();
        g gVar = this.cg;
        if (gVar != null) {
            gVar.postDelayed(new Runnable() { // from class: com.huawei.ui.main.stories.health.activity.healthdata.WeightGoalActivity.3
                @Override // java.lang.Runnable
                public void run() {
                    ((InputMethodManager) WeightGoalActivity.this.f27655c.getSystemService("input_method")).toggleSoftInput(0, 2);
                }
            }, 100L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str, HealthErrorTipTextLayout healthErrorTipTextLayout, CustomViewDialog.Builder builder) {
        int i2;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (b(str)) {
            try {
                i2 = Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                LogUtil.e("HealthWeight_WeightGoalActivity", "setDialogText:NumberFormatException for string ", str);
                i2 = 0;
            }
            d(healthErrorTipTextLayout, builder, i2);
            return;
        }
        healthErrorTipTextLayout.setError(this.f27655c.getResources().getString(R.string.IDS_hwh_home_weight_goal_set_int));
    }

    private void d(HealthErrorTipTextLayout healthErrorTipTextLayout, CustomViewDialog.Builder builder, int i2) {
        int i3 = this.cq;
        if (i3 == 3) {
            if (i2 >= 552 || i2 < 22) {
                String string = this.f27655c.getResources().getString(R.string.IDS_hwh_home_weight_goal_set_range);
                int[] iArr = this.bh;
                healthErrorTipTextLayout.setError(String.format(string, Integer.valueOf(iArr[2]), Integer.valueOf(iArr[3])));
                return;
            }
            healthErrorTipTextLayout.setError(null);
            builder.c(true);
            this.ab.setGoalValue(UnitUtil.i(i2));
            i(i2);
            this.cc.setIsShowText(true);
            this.cc.setSelectedPosition((i2 - 22) * 10);
            return;
        }
        if (i3 == 1) {
            double d2 = i2;
            if (d2 >= UnitUtil.j(251.0d) || d2 < UnitUtil.j(10.0d)) {
                healthErrorTipTextLayout.setError(String.format(this.f27655c.getResources().getString(R.string.IDS_hwh_home_weight_goal_set_range), Integer.valueOf((int) UnitUtil.j(this.bh[0])), Integer.valueOf((int) UnitUtil.j(this.bh[1]))));
                return;
            }
            healthErrorTipTextLayout.setError(null);
            builder.c(true);
            this.ab.setGoalValue(UnitUtil.b(d2));
            i(i2);
            this.cc.setIsShowText(true);
            this.cc.setSelectedPosition((int) ((d2 - UnitUtil.j(10.0d)) * 10.0d));
            return;
        }
        if (i2 >= 251 || i2 < 10) {
            String string2 = this.f27655c.getResources().getString(R.string.IDS_hwh_home_weight_goal_set_range);
            int[] iArr2 = this.bh;
            healthErrorTipTextLayout.setError(String.format(string2, Integer.valueOf(iArr2[0]), Integer.valueOf(iArr2[1])));
            return;
        }
        healthErrorTipTextLayout.setError(null);
        builder.c(true);
        this.ab.setGoalValue(i2);
        i(i2);
        this.cc.setIsShowText(true);
        this.cc.setSelectedPosition((i2 - 10) * 10);
    }

    private boolean b(String str) {
        return Pattern.compile("[0-9]*").matcher(str).matches();
    }

    private void i(int i2) {
        int i3 = this.cq;
        boolean z = false;
        boolean z2 = i3 == 3 && i2 == 132;
        boolean z3 = i3 == 2 && i2 == 60;
        if (i3 == 1 && i2 == 120) {
            z = true;
        }
        if (z2 || z3 || z) {
            j(i2);
            d(true);
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static class e implements HiCommonListener {
        private final WeakReference<WeightGoalActivity> d;

        private e(WeightGoalActivity weightGoalActivity) {
            this.d = new WeakReference<>(weightGoalActivity);
        }

        @Override // com.huawei.hihealth.data.listener.HiCommonListener
        public void onSuccess(int i, final Object obj) {
            final WeightGoalActivity weightGoalActivity = this.d.get();
            if (weightGoalActivity == null || weightGoalActivity.isFinishing()) {
                LogUtil.j("HealthWeight_WeightGoalActivity", "FetchDataListener onSuccess activity is null or finishing");
            } else {
                ThreadPoolManager.c().execute(new Runnable() { // from class: urv
                    @Override // java.lang.Runnable
                    public final void run() {
                        weightGoalActivity.e(obj);
                    }
                });
            }
        }

        @Override // com.huawei.hihealth.data.listener.HiCommonListener
        public void onFailure(int i, Object obj) {
            LogUtil.a("HealthWeight_WeightGoalActivity", "fetchUserData onFailure");
            OpAnalyticsUtil.getInstance().setEventOneErrorCode(OperationKey.HEALTH_APP_WEIGHT_GET_USER_INFORMATION_85070011.value(), i);
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    static class f implements ResponseCallback<ivd> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<WeightGoalActivity> f27665a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final double f27666c;

        private f(WeightGoalActivity weightGoalActivity, double d) {
            this.f27665a = new WeakReference<>(weightGoalActivity);
            this.f27666c = d;
        }

        @Override // com.huawei.hwbasemgr.ResponseCallback
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void onResponse(int i, ivd ivdVar) {
            LogUtil.a("HealthWeight_WeightGoalActivity", "SaveWeightCallback onResponse errorCode ", Integer.valueOf(i), " weightManager ", ivdVar);
            WeightGoalActivity weightGoalActivity = this.f27665a.get();
            if (weightGoalActivity == null || weightGoalActivity.isFinishing()) {
                LogUtil.j("HealthWeight_WeightGoalActivity", "SaveWeightCallBack onSuccess activity is null or finishing");
                return;
            }
            if (i != 0) {
                return;
            }
            if (ivdVar != null) {
                weightGoalActivity.cn = ivdVar;
            }
            weightGoalActivity.g(this.f27666c);
            if (vng.e(weightGoalActivity.h) == weightGoalActivity.bf && Double.compare(UnitUtil.d(weightGoalActivity.h, 1), UnitUtil.d(weightGoalActivity.h, 2)) == 0) {
                LogUtil.a("HealthWeight_WeightGoalActivity", "currentWeight & origin weight is same, jump to weightGoalPreviewActivity");
                weightGoalActivity.d(weightGoalActivity, (float) this.f27666c);
            } else {
                LogUtil.a("HealthWeight_WeightGoalActivity", "currentWeight & origin weight is not same, insert weight data");
                weightGoalActivity.e((float) this.f27666c);
            }
        }
    }

    private void f() {
        PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
        if (planApi != null) {
            planApi.e(new a(this));
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    static class d implements Observer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<WeightGoalActivity> f27664a;

        d(WeightGoalActivity weightGoalActivity) {
            this.f27664a = new WeakReference<>(weightGoalActivity);
        }

        @Override // com.huawei.haf.design.pattern.Observer
        public void notify(String str, Object... objArr) {
            WeightGoalActivity weightGoalActivity = this.f27664a.get();
            if (weightGoalActivity == null || weightGoalActivity.isFinishing() || weightGoalActivity.isDestroyed()) {
                ReleaseLogUtil.e("HealthWeight_WeightGoalActivity", "InnerObserver notify activity ", weightGoalActivity);
                return;
            }
            LogUtil.a("HealthWeight_WeightGoalActivity", "InnerObserver notify label ", str, " objects ", objArr);
            if (ObserveLabels.STAY_FIT_PLAN_END.equals(str)) {
                weightGoalActivity.i = null;
                weightGoalActivity.w = false;
            }
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    static class a extends UiCallback<IntPlan> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        WeakReference<WeightGoalActivity> f27660b;

        a(WeightGoalActivity weightGoalActivity) {
            this.f27660b = new WeakReference<>(weightGoalActivity);
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public void onFailure(int i, String str) {
            WeightGoalActivity weightGoalActivity = this.f27660b.get();
            if (weightGoalActivity == null || weightGoalActivity.isFinishing()) {
                LogUtil.j("HealthWeight_WeightGoalActivity", "GetIntPlanCallback onFailure activity is null or finishing");
                return;
            }
            LogUtil.e("HealthWeight_WeightGoalActivity", "getCurrentPlan onFailure");
            weightGoalActivity.i = null;
            weightGoalActivity.w = false;
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onSuccess(IntPlan intPlan) {
            WeightGoalActivity weightGoalActivity = this.f27660b.get();
            if (weightGoalActivity != null && !weightGoalActivity.isFinishing()) {
                weightGoalActivity.w = true;
                if (intPlan != null && intPlan.getPlanType() == IntPlan.PlanType.AI_FITNESS_PLAN) {
                    weightGoalActivity.i = intPlan;
                    return;
                } else {
                    LogUtil.j("HealthWeight_WeightGoalActivity", "getCurrentIntPlan onSuccess intPlan is not exist");
                    weightGoalActivity.i = null;
                    return;
                }
            }
            LogUtil.j("HealthWeight_WeightGoalActivity", "GetIntPlanCallback onSuccess activity is null or finishing");
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
