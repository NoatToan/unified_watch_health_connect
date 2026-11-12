package com.huawei.ui.main.stories.health.activity.healthdata;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.basefitnessadvice.model.intplan.IntPlan;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.haf.router.AppRouterUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.plan.api.PlanApi;
import com.huawei.health.weight.bean.WeightTargetDifferences;
import com.huawei.hihealth.HiAggregateOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.listener.HiAggregateListener;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.health.activity.healthdata.WeightGoalPreviewActivity;
import defpackage.btw;
import defpackage.iov;
import defpackage.iun;
import defpackage.ivd;
import defpackage.lsl;
import defpackage.njy;
import defpackage.nkf;
import defpackage.qpx;
import defpackage.vbs;
import defpackage.vei;
import defpackage.vng;
import defpackage.vns;
import health.compact.a.AuthorizationUtils;
import health.compact.a.CommonUtil;
import health.compact.a.HiDateUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.Services;
import health.compact.a.UnitUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class WeightGoalPreviewActivity extends BaseActivity implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthTextView f27667a;
    private LinearLayout aa;
    private HealthTextView ab;
    private LinearLayout ac;
    private float ad;
    private LinearLayout ae;
    private HealthTextView ah;
    private ConstraintLayout ai;
    private WeightTargetDifferences aj;
    private ivd al;
    private vns am;
    private HealthTextView an;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthTextView f27668b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthTextView f27669c;
    private IntPlan d;
    private HealthTextView e;
    private float f;
    private HealthTextView g;
    private double h;
    private HealthTextView i;
    private HealthTextView j;
    private ImageView k;
    private HealthButton l;
    private LinearLayout m;
    private HealthTextView n;
    private HealthTextView o;
    private RelativeLayout p;
    private HealthTextView r;
    private SpannableString s;
    private HealthTextView t;
    private HealthTextView u;
    private double v;
    private View w;
    private HealthTextView x;
    private ImageView y;
    private LinearLayout z;
    private int ag = 0;
    private boolean q = false;
    private Handler af = new d(this);

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_weight_goal_preview);
        g();
        d();
    }

    private void g() {
        this.ae = (LinearLayout) findViewById(R.id.hw_weight_management_goal_ll);
        this.m = (LinearLayout) findViewById(R.id.hw_weight_edit_go_back_ll);
        this.l = (HealthButton) findViewById(R.id.hw_weight_edit_go_back);
        this.u = (HealthTextView) findViewById(R.id.hw_weight_setup_new_goal);
        this.i = (HealthTextView) findViewById(R.id.hw_weight_edit_current_goal);
        this.ai = (ConstraintLayout) findViewById(R.id.weight_data_two_line);
        this.r = (HealthTextView) findViewById(R.id.hw_weight_goal_time_length_value);
        this.ah = (HealthTextView) findViewById(R.id.hw_weight_goal_cumulative_weight_value);
        this.x = (HealthTextView) findViewById(R.id.hw_weight_goal_time_length_text);
        this.ab = (HealthTextView) findViewById(R.id.hw_weight_goal_cumulative_weight_text);
        this.n = (HealthTextView) findViewById(R.id.hw_weight_every_week_weight_text);
        this.j = (HealthTextView) findViewById(R.id.hw_weight_every_week_weight_value);
        this.g = (HealthTextView) findViewById(R.id.hw_weight_every_week_heat_gap_text);
        this.o = (HealthTextView) findViewById(R.id.hw_weight_every_week_heat_gap_value);
        b();
        this.w = findViewById(R.id.static_chart_layout);
        this.y = (ImageView) findViewById(R.id.static_chart_image);
        this.p = (RelativeLayout) findViewById(R.id.data_loading);
        this.an = (HealthTextView) findViewById(R.id.weight_type);
        this.z = (LinearLayout) findViewById(R.id.tips_one);
        this.aa = (LinearLayout) findViewById(R.id.tips_two);
        this.ac = (LinearLayout) findViewById(R.id.tips_three);
        this.e = (HealthTextView) findViewById(R.id.chart_low_value);
        this.f27669c = (HealthTextView) findViewById(R.id.chart_high_value);
        this.f27668b = (HealthTextView) findViewById(R.id.chart_start_date);
        this.t = (HealthTextView) findViewById(R.id.currentPoint);
        this.k = (ImageView) findViewById(R.id.hw_show_finish_date_suggestion_icon);
        this.f27667a = (HealthTextView) findViewById(R.id.chart_end_date);
        this.u.setOnClickListener(this);
        this.i.setOnClickListener(this);
        this.l.setOnClickListener(this);
        this.k.setOnClickListener(this);
    }

    private void b() {
        vns vnsVar = new vns(findViewById(R.id.weight_goal_line_chart).getRootView(), null);
        this.am = vnsVar;
        vnsVar.b("bodyWeight");
    }

    private void d() {
        if (getIntent() == null) {
            LogUtil.j("WeightGoalPreviewActivity", "intent is null, return");
            return;
        }
        if (getIntent().getExtras() == null) {
            LogUtil.j("WeightGoalPreviewActivity", "extra is null, return");
            return;
        }
        Bundle extras = getIntent().getExtras();
        if (AppRouterUtils.b(getIntent()) != null && AuthorizationUtils.c(this)) {
            this.ag = 1;
        } else {
            this.ag = extras.getInt("WEIGHT_GOAL_ACTION", 0);
        }
        this.v = extras.getDouble("startWeight");
        this.ad = extras.getFloat("targetWeight");
        this.q = extras.getBoolean("IS_WEIGHT_CURRENT_GOAL_EDIT_TYPE", false);
        this.aj = (WeightTargetDifferences) extras.getParcelable("WEIGHT_TARGET_DIFFERENCES");
        if (this.ag == 0) {
            this.ae.setVisibility(8);
            this.m.setVisibility(0);
            Serializable serializable = extras.getSerializable("weightManager");
            if (serializable instanceof ivd) {
                this.al = (ivd) serializable;
            }
            LogUtil.a("WeightGoalPreviewActivity", "initData mWeightManager ", this.al);
            qpx.e(BaseApplication.getContext(), this.q ? R.string.IDS_hwh_home_target_adjustment_succeeded : R.string.IDS_hwh_home_target_set_success);
        } else {
            this.ae.setVisibility(0);
            this.m.setVisibility(8);
        }
        ThreadPoolManager.c().execute(new Runnable() { // from class: usa
            @Override // java.lang.Runnable
            public final void run() {
                this.f50503a.e();
            }
        });
    }

    public /* synthetic */ void e() {
        j();
        c();
    }

    private void a(WeightTargetDifferences weightTargetDifferences) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        HiAggregateOption hiAggregateOptionC = iun.c("");
        hiAggregateOptionC.setTimeRange(lsl.r(weightTargetDifferences.a()), jCurrentTimeMillis);
        hiAggregateOptionC.setGroupUnitType(3);
        hiAggregateOptionC.setAggregateType(3);
        hiAggregateOptionC.setSortOrder(0);
        HiHealthManager.d(com.huawei.haf.application.BaseApplication.b()).aggregateHiHealthData(hiAggregateOptionC, new a(this, weightTargetDifferences));
    }

    /* JADX INFO: loaded from: classes19.dex */
    static class a implements HiAggregateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeightTargetDifferences f27670a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final WeakReference<WeightGoalPreviewActivity> f27671c;

        a(WeightGoalPreviewActivity weightGoalPreviewActivity, WeightTargetDifferences weightTargetDifferences) {
            this.f27671c = new WeakReference<>(weightGoalPreviewActivity);
            this.f27670a = weightTargetDifferences;
        }

        @Override // com.huawei.hihealth.data.listener.HiAggregateListener
        public void onResult(List<HiHealthData> list, int i, int i2) {
            WeightGoalPreviewActivity weightGoalPreviewActivity = this.f27671c.get();
            if (weightGoalPreviewActivity != null) {
                weightGoalPreviewActivity.a((List<Pair<Long, Float>>) weightGoalPreviewActivity.c(list, weightGoalPreviewActivity.v, this.f27670a.a()));
            } else {
                LogUtil.e("WeightGoalPreviewActivity", "InnerViewHiAggregateListener activity == null");
            }
        }

        @Override // com.huawei.hihealth.data.listener.HiAggregateListener
        public void onResultIntent(int i, List<HiHealthData> list, int i2, int i3) {
            WeightGoalPreviewActivity weightGoalPreviewActivity = this.f27671c.get();
            if (weightGoalPreviewActivity == null) {
                LogUtil.e("WeightGoalPreviewActivity", "InnerViewHiAggregateListener activity == null");
            } else {
                LogUtil.j("WeightGoalPreviewActivity", "getChartData intentType");
                weightGoalPreviewActivity.a(new ArrayList());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(List<Pair<Long, Float>> list) {
        Message messageObtainMessage = this.af.obtainMessage();
        messageObtainMessage.what = 10;
        messageObtainMessage.obj = list;
        this.af.sendMessage(messageObtainMessage);
    }

    private void c() {
        PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
        if (planApi != null) {
            planApi.e(new e(this));
        }
    }

    private void j() {
        if (this.al == null) {
            nkf.a().d(new c(this));
        } else {
            i();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        if (this.aj == null) {
            this.aj = vng.e();
        }
        vng.a(new b(this));
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static class b implements ResponseCallback<HashMap<String, Double>> {
        private WeakReference<WeightGoalPreviewActivity> e;

        b(WeightGoalPreviewActivity weightGoalPreviewActivity) {
            this.e = new WeakReference<>(weightGoalPreviewActivity);
        }

        @Override // com.huawei.hwbasemgr.ResponseCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResponse(int i, final HashMap<String, Double> map) {
            final WeightGoalPreviewActivity weightGoalPreviewActivity = this.e.get();
            if (weightGoalPreviewActivity == null || weightGoalPreviewActivity.isDestroyed() || weightGoalPreviewActivity.isFinishing()) {
                LogUtil.j("WeightGoalPreviewActivity", "InnerGetWeightCallback activity is null");
            } else if (map == null) {
                LogUtil.j("WeightGoalPreviewActivity", "InnerGetWeightCallback map is null");
            } else {
                ThreadPoolManager.c().execute(new Runnable() { // from class: ury
                    @Override // java.lang.Runnable
                    public final void run() {
                        WeightGoalPreviewActivity.b.a(map, weightGoalPreviewActivity);
                    }
                });
            }
        }

        public static /* synthetic */ void a(HashMap map, WeightGoalPreviewActivity weightGoalPreviewActivity) {
            double dFloatValue;
            float fFloatValue;
            Double d = (Double) map.get("targetWeight");
            if (d != null) {
                if (weightGoalPreviewActivity.ad > 0.0f) {
                    fFloatValue = weightGoalPreviewActivity.ad;
                } else {
                    fFloatValue = d.floatValue();
                }
                weightGoalPreviewActivity.ad = fFloatValue;
            }
            Double d2 = (Double) map.get("startWeight");
            if (d2 != null) {
                if (weightGoalPreviewActivity.v > 0.0d) {
                    dFloatValue = weightGoalPreviewActivity.v;
                } else {
                    dFloatValue = d2.floatValue();
                }
                weightGoalPreviewActivity.v = dFloatValue;
            }
            weightGoalPreviewActivity.f = iun.c();
            LogUtil.a("WeightGoalPreviewActivity", "initWeightGoal mTargetWeight: ", Float.valueOf(weightGoalPreviewActivity.ad), " mStartWeight :", Double.valueOf(weightGoalPreviewActivity.v), " mCurrentWeight: ", Float.valueOf(weightGoalPreviewActivity.f));
            weightGoalPreviewActivity.e(weightGoalPreviewActivity.aj);
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    static class c implements ResponseCallback<Pair<Long, ivd>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private WeakReference<WeightGoalPreviewActivity> f27672b;

        c(WeightGoalPreviewActivity weightGoalPreviewActivity) {
            this.f27672b = new WeakReference<>(weightGoalPreviewActivity);
        }

        @Override // com.huawei.hwbasemgr.ResponseCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResponse(int i, Pair<Long, ivd> pair) {
            WeightGoalPreviewActivity weightGoalPreviewActivity = this.f27672b.get();
            if (weightGoalPreviewActivity == null) {
                LogUtil.j("WeightGoalPreviewActivity", "InnerReadWeightManagerCallBack activity is null");
                return;
            }
            if (pair == null) {
                ReleaseLogUtil.e("WeightGoalPreviewActivity", "InnerReadWeightManagerCallBack pair is null");
                weightGoalPreviewActivity.i();
                return;
            }
            ivd ivdVar = (ivd) pair.second;
            LogUtil.a("WeightGoalPreviewActivity", "InnerGetWeightManager weightManager ", ivdVar);
            if (ivdVar == null) {
                weightGoalPreviewActivity.i();
            } else {
                weightGoalPreviewActivity.al = ivdVar;
                weightGoalPreviewActivity.i();
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == this.l) {
            finish();
        }
        if (view == this.n && this.q) {
            qpx.e(BaseApplication.getContext(), R.string.IDS_hwh_home_overall_target_calculation);
        }
        IntPlan intPlan = this.d;
        if (intPlan != null && intPlan.getPlanType() == IntPlan.PlanType.AI_FITNESS_PLAN) {
            vei.d(this.d.getPlanId(), (Context) this, true);
            return;
        }
        if (view == this.i) {
            Intent intent = new Intent(this, (Class<?>) WeightGoalActivity.class);
            intent.putExtra("WEIGHT_GOAL_ACTION", 1);
            intent.putExtra("from", 0);
            iov.d(BaseApplication.getActivity(), intent);
            finish();
        }
        if (view == this.u) {
            Intent intent2 = new Intent(this, (Class<?>) WeightGoalActivity.class);
            intent2.putExtra("WEIGHT_GOAL_ACTION", 0);
            intent2.putExtra("from", 0);
            iov.d(BaseApplication.getActivity(), intent2);
            finish();
        }
        if (view == this.k) {
            vbs.c(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void e(final WeightTargetDifferences weightTargetDifferences) {
        int i;
        int i2;
        if (weightTargetDifferences == null) {
            LogUtil.j("WeightGoalPreviewActivity", "weightTargetDifferences == null");
            return;
        }
        if (!HandlerExecutor.d()) {
            HandlerExecutor.b(new Runnable() { // from class: urz
                @Override // java.lang.Runnable
                public final void run() {
                    this.e.e(weightTargetDifferences);
                }
            });
            return;
        }
        boolean zIsFinishing = isFinishing();
        boolean zIsDestroyed = isDestroyed();
        if (zIsFinishing || zIsDestroyed) {
            ReleaseLogUtil.e("WeightGoalPreviewActivity", "initDataView isFinishing ", Boolean.valueOf(zIsFinishing), " isDestroyed ", Boolean.valueOf(zIsDestroyed));
            return;
        }
        LogUtil.a("WeightGoalPreviewActivity", "weightTargetDifferences:", weightTargetDifferences.toString());
        this.p.setVisibility(8);
        this.h = Math.abs(UnitUtil.d(weightTargetDifferences.c() * 7.7d, 1));
        if (weightTargetDifferences.c() == 0.0d) {
            LogUtil.a("WeightGoalPreviewActivity", "initDataView keepWeight");
            e(getString(R.string.IDS_hwh_home_weight_loss_mild_tips), "", "");
            c(weightTargetDifferences);
            d(R.drawable.ic_chart_weight_keep, weightTargetDifferences);
            return;
        }
        if (weightTargetDifferences.c() < 0.0d) {
            LogUtil.a("WeightGoalPreviewActivity", "initDataView addWeight");
            e(getString(R.string.IDS_hwh_home_weight_loss_mild_tips), "", "");
            d(weightTargetDifferences);
            if (LanguageUtil.ba(this)) {
                i2 = R.drawable.ic_chart_weight_add_mirroring;
            } else {
                i2 = R.drawable.ic_chart_weight_add;
            }
            d(i2, weightTargetDifferences);
            return;
        }
        LogUtil.a("WeightGoalPreviewActivity", "initDataView lossWeight");
        f(weightTargetDifferences);
        f();
        if (LanguageUtil.ba(this)) {
            i = R.drawable.ic_chart_weight_loss_mirroring;
        } else {
            i = R.drawable.ic_chart_weight_loss;
        }
        d(i, weightTargetDifferences);
    }

    private void f(WeightTargetDifferences weightTargetDifferences) {
        this.an.setText(R.string.IDS_health_reduce_weight);
        this.x.setText(R.string.IDS_hwh_home_target_duration);
        this.ab.setText(R.string.IDS_hwh_home_cumulative_weight_loss);
        this.n.setText(R.string.IDS_hwh_home_weekly_weight_loss);
        this.g.setText(R.string.IDS_hwh_home_daily_caloric_gap);
        if (this.q) {
            this.n.setText(R.string.IDS_hwh_home_avg_weekly_weight_loss);
            a();
        }
        ivd ivdVar = this.al;
        if (ivdVar != null && ivdVar.i() == 1) {
            int iE = this.al.e();
            if (iE != 0) {
                this.h = iE;
            }
            this.s = d(vei.c(this.al.d().d(), this.f));
        }
        j(weightTargetDifferences);
    }

    private SpannableString d(double[] dArr) {
        String string = getResources().getString(R.string.IDS_hw_pressure_grade_range, UnitUtil.e(dArr[0], 1, 1), UnitUtil.e(dArr[1], 1, 1));
        SpannableString spannableString = new SpannableString(getResources().getString(R.string.IDS_hw_pressure_grade_range, UnitUtil.e(dArr[0], 1, 1), vei.b(dArr[1], 1)));
        if (string.length() < spannableString.length()) {
            spannableString.setSpan(new TextAppearanceSpan(this, R.style.health_text_chart_cursor_sub_value), 0, string.length(), 33);
            spannableString.setSpan(new TextAppearanceSpan(this, R.style.week_day_text_style), string.length(), spannableString.length(), 33);
        }
        return spannableString;
    }

    private void a() {
        this.x.setText(R.string.IDS_hwh_home_total_target_duration);
        Drawable drawable = ContextCompat.getDrawable(this, R.drawable.ic_statistics_explain);
        if (drawable != null) {
            drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
        }
        this.k.setVisibility(0);
    }

    private void f() {
        e(getString(R.string.IDS_hwh_home_weight_loss_mild_tips), "", "");
    }

    private void e(String str, String str2, String str3) {
        TextView textView = (TextView) this.z.findViewById(R.id.tips_weight);
        if (TextUtils.isEmpty(str)) {
            this.z.setVisibility(8);
        } else {
            this.z.setVisibility(0);
            if (textView != null) {
                textView.setText(str);
            }
        }
        if (TextUtils.isEmpty(str2)) {
            this.aa.setVisibility(8);
            this.ac.setVisibility(8);
            return;
        }
        ((TextView) this.aa.findViewById(R.id.tips_weight)).setText(str2);
        if (TextUtils.isEmpty(str3)) {
            this.ac.setVisibility(8);
        } else {
            ((TextView) this.ac.findViewById(R.id.tips_weight)).setText(str3);
        }
    }

    private String b(double d2) {
        return vei.b(e(d2), 1);
    }

    private void c(WeightTargetDifferences weightTargetDifferences) {
        this.an.setText(R.string.IDS_health_hold_weight);
        this.ai.setVisibility(8);
        this.x.setText(R.string.IDS_hwh_home_current_weight);
        this.ab.setText(R.string.IDS_hwh_home_retention_range);
        this.r.setText(a(b(this.f)));
        this.ah.setText(d(getResources().getString(R.string.IDS_hw_pressure_grade_range, UnitUtil.e(UnitUtil.b(c(weightTargetDifferences, true), 1), 1, 1), b(c(weightTargetDifferences, false))), "\\d+-\\d+|\\d+"));
        this.t.setText(UnitUtil.e(UnitUtil.a(this.f), 1, 1));
    }

    private void d(int i, WeightTargetDifferences weightTargetDifferences) {
        if (weightTargetDifferences == null) {
            LogUtil.e("WeightGoalPreviewActivity", "weightTargetDifferences null");
            return;
        }
        if (this.ag == 1) {
            LogUtil.a("WeightGoalPreviewActivity", "setStaticChartView WEIGHT_GOAL_PREVIEW_ACTION_PREVIEW");
            this.w.setVisibility(8);
            a(weightTargetDifferences);
            return;
        }
        LogUtil.a("WeightGoalPreviewActivity", "setStaticChartView weightTargetDifferences:", weightTargetDifferences.toString());
        double dC = c(weightTargetDifferences, true);
        double dC2 = c(weightTargetDifferences, false);
        if (weightTargetDifferences.e() == WeightTargetDifferences.WeightTargetType.WEIGHT_KEE) {
            d(dC, dC2);
            this.f27667a.setVisibility(8);
        }
        this.w.setVisibility(0);
        vns vnsVar = this.am;
        if (vnsVar != null) {
            vnsVar.b(new ArrayList());
        }
        this.y.setImageResource(i);
        String strE = UnitUtil.e(e(dC), 1, 1);
        String strE2 = UnitUtil.e(e(dC2), 1, 1);
        this.e.setText(strE);
        this.f27669c.setText(strE2);
        this.f27668b.setText(HiDateUtil.i(weightTargetDifferences.a()));
        this.f27667a.setText(HiDateUtil.i(weightTargetDifferences.b()));
    }

    private void d(double d2, double d3) {
        double d4 = d3 - d2;
        double d5 = d3 - ((double) this.f);
        int i = 0;
        this.t.setVisibility(0);
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.health_common_6dp);
        double d6 = this.f;
        if (d6 > d3) {
            d5 = 0.0d;
        } else if (d6 < d2) {
            i = dimensionPixelOffset + dimensionPixelOffset;
            d5 = d4;
        } else {
            i = dimensionPixelOffset;
        }
        double dimension = ((double) getResources().getDimension(R.dimen.dp_96)) / d4;
        if (this.t.getLayoutParams() instanceof ConstraintLayout.LayoutParams) {
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) this.t.getLayoutParams();
            layoutParams.topMargin = ((int) (d5 * dimension)) + i;
            this.t.setLayoutParams(layoutParams);
        }
    }

    private void d(WeightTargetDifferences weightTargetDifferences) {
        this.an.setText(R.string.IDS_health_gain_weight);
        this.x.setText(R.string.IDS_hwh_home_target_duration);
        this.ab.setText(R.string.IDS_hwh_home_cumulative_weight_increase);
        this.n.setText(R.string.IDS_hwh_home_weekly_weight_increase);
        this.g.setText(R.string.IDS_hwh_home_daily_caloric_surplus);
        j(weightTargetDifferences);
        if (this.q) {
            this.n.setText(R.string.IDS_hwh_home_avg_weekly_weight_increase);
            a();
        }
    }

    private int a(IntPlan intPlan) {
        if (intPlan == null || intPlan.getMetaInfo() == null || intPlan.getPlanType() != IntPlan.PlanType.AI_FITNESS_PLAN) {
            return 0;
        }
        return btw.e(intPlan);
    }

    private void j(WeightTargetDifferences weightTargetDifferences) {
        int iA = a(this.d);
        if (!CommonUtil.b(weightTargetDifferences.b()) || iA <= 0) {
            iA = vng.a(weightTargetDifferences, this.v, this.ad);
        }
        if (this.ag == 1 || this.q) {
            a(weightTargetDifferences, iA, lsl.b(DateFormatUtil.a(weightTargetDifferences.a()), DateFormatUtil.a(System.currentTimeMillis())));
        } else {
            this.r.setText(a(getResources().getQuantityString(R.plurals.IDS_user_profile_achieve_num_day, iA, c(iA))));
            this.ah.setText(a(b(Math.abs(((double) this.ad) - this.v))));
        }
        this.j.setText(d(UnitUtil.d((weightTargetDifferences.c() / 1000.0d) * 7.0d, 1)));
        if (!TextUtils.isEmpty(this.s)) {
            this.j.setText(this.s);
        }
        int iD = (int) UnitUtil.d(this.h, 0);
        this.o.setText(a(getResources().getQuantityString(R.plurals.IDS_caloric_diff_kcals, iD, c(iD))));
    }

    private SpannableString d(double d2) {
        String strE = UnitUtil.e(e(Math.abs(d2)), 1, 1);
        SpannableString spannableString = new SpannableString(b(Math.abs(d2)));
        if (strE.length() <= spannableString.length()) {
            spannableString.setSpan(new TextAppearanceSpan(this, R.style.health_text_chart_cursor_sub_value), 0, strE.length(), 33);
            spannableString.setSpan(new TextAppearanceSpan(this, R.style.week_day_text_style), strE.length(), spannableString.length(), 33);
        }
        return spannableString;
    }

    private void a(WeightTargetDifferences weightTargetDifferences, int i, int i2) {
        double dE;
        if (weightTargetDifferences.e() == WeightTargetDifferences.WeightTargetType.WEIGHT_GAIN) {
            dE = e(((double) this.f) - this.v);
        } else {
            dE = e(this.v - ((double) this.f));
        }
        if (CommonUtil.b(weightTargetDifferences.b())) {
            this.r.setText(a(getResources().getQuantityString(R.plurals.IDS_user_profile_achieve_num_day, i, c(i))));
        } else {
            b(c(i2), getResources().getQuantityString(R.plurals.IDS_user_profile_achieve_num_day, i, c(i)), this.r);
        }
        b(UnitUtil.e(dE, 1, 1), b(Math.abs(((double) this.ad) - this.v)), this.ah);
    }

    private void b(String str, String str2, HealthTextView healthTextView) {
        healthTextView.setText(UnitUtil.b(this, "/[^/]+$", getResources().getString(R.string.IDS_hwh_home_range, str, str2), R.style.week_day_text_style, R.style.health_text_chart_cursor_sub_value));
    }

    private double e(double d2) {
        return UnitUtil.b(d2, 1);
    }

    private String c(int i) {
        return UnitUtil.e(i, 1, 0);
    }

    private SpannableString a(String str) {
        return d(str, "\\d");
    }

    private SpannableString d(String str, String str2) {
        return UnitUtil.b(this, str2, str, R.style.health_text_chart_cursor_sub_value, R.style.week_day_text_style);
    }

    private double c(WeightTargetDifferences weightTargetDifferences, boolean z) {
        if (weightTargetDifferences == null) {
            LogUtil.e("WeightGoalPreviewActivity", "weightTargetDifferences == null");
            return 0.0d;
        }
        if (weightTargetDifferences.e() == WeightTargetDifferences.WeightTargetType.WEIGHT_GAIN) {
            return z ? this.v : this.ad;
        }
        if (weightTargetDifferences.e() == WeightTargetDifferences.WeightTargetType.WEIGHT_LOSS) {
            return z ? this.ad : this.v;
        }
        return c(weightTargetDifferences, z, this.ad);
    }

    private float c(WeightTargetDifferences weightTargetDifferences, boolean z, float f) {
        if (weightTargetDifferences.d() == 0) {
            return z ? f - 1.0f : f + 1.0f;
        }
        if (z) {
            return f - (weightTargetDifferences.d() / 1000.0f);
        }
        return f + (weightTargetDifferences.d() / 1000.0f);
    }

    /* JADX INFO: loaded from: classes19.dex */
    static class e extends UiCallback<IntPlan> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        WeakReference<WeightGoalPreviewActivity> f27674c;

        e(WeightGoalPreviewActivity weightGoalPreviewActivity) {
            this.f27674c = new WeakReference<>(weightGoalPreviewActivity);
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public void onFailure(int i, String str) {
            WeightGoalPreviewActivity weightGoalPreviewActivity = this.f27674c.get();
            if (weightGoalPreviewActivity == null || weightGoalPreviewActivity.isFinishing() || weightGoalPreviewActivity.isDestroyed()) {
                LogUtil.j("WeightGoalPreviewActivity", "GetIntPlanCallback onFailure activity is not exist");
                return;
            }
            LogUtil.e("WeightGoalPreviewActivity", "getCurrentPlan onFailure");
            weightGoalPreviewActivity.d = null;
            weightGoalPreviewActivity.e(weightGoalPreviewActivity.aj);
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(IntPlan intPlan) {
            WeightGoalPreviewActivity weightGoalPreviewActivity = this.f27674c.get();
            if (weightGoalPreviewActivity == null || weightGoalPreviewActivity.isFinishing() || weightGoalPreviewActivity.isDestroyed()) {
                LogUtil.j("WeightGoalPreviewActivity", "GetIntPlanCallback onSuccess activity is not exist");
                return;
            }
            if (intPlan != null && intPlan.getPlanType() == IntPlan.PlanType.AI_FITNESS_PLAN) {
                weightGoalPreviewActivity.d = intPlan;
            } else {
                LogUtil.j("WeightGoalPreviewActivity", "getCurrentIntPlan onSuccess intPlan is not exist");
                weightGoalPreviewActivity.d = null;
            }
            weightGoalPreviewActivity.e(weightGoalPreviewActivity.aj);
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    public class d extends BaseHandler<WeightGoalPreviewActivity> {
        d(WeightGoalPreviewActivity weightGoalPreviewActivity) {
            super(weightGoalPreviewActivity);
        }

        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(WeightGoalPreviewActivity weightGoalPreviewActivity, Message message) {
            ArrayList arrayList;
            if (weightGoalPreviewActivity == null) {
                LogUtil.j("WeightGoalPreviewActivity", "handleMessageWhenReferenceNotNull obj is null");
                return;
            }
            int i = message.what;
            if (i != 10) {
                if (i == 18) {
                    if (WeightGoalPreviewActivity.this.am != null) {
                        WeightGoalPreviewActivity.this.am.b(new ArrayList());
                        return;
                    }
                    return;
                }
                LogUtil.j("WeightGoalPreviewActivity", "other msg");
                return;
            }
            if (!njy.b(message.obj, Pair.class)) {
                LogUtil.j("WeightGoalPreviewActivity", "msg.obj is not instanceof List Pair");
                arrayList = new ArrayList();
            } else {
                arrayList = (ArrayList) message.obj;
            }
            if (WeightGoalPreviewActivity.this.am != null) {
                WeightGoalPreviewActivity.this.am.b(arrayList);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<Pair<Long, Float>> c(List<HiHealthData> list, double d2, long j) {
        ArrayList arrayList = new ArrayList();
        if (njy.e(list)) {
            return arrayList;
        }
        for (HiHealthData hiHealthData : list) {
            float fC = (float) UnitUtil.c(hiHealthData.getDouble("bodyWeight"));
            if (fC > 0.0f) {
                arrayList.add(new Pair<>(Long.valueOf(hiHealthData.getStartTime()), Float.valueOf(fC)));
            }
        }
        d(arrayList, d2, j);
        return arrayList;
    }

    private void d(List<Pair<Long, Float>> list, double d2, long j) {
        if (j == 0) {
            LogUtil.a("WeightGoalPreviewActivity", "startTime is 0, return");
            return;
        }
        if (njy.e(list)) {
            LogUtil.a("WeightGoalPreviewActivity", "trendData List is empty");
        } else if (lsl.c(((Long) list.get(0).first).longValue(), j)) {
            LogUtil.a("WeightGoalPreviewActivity", "first weight and start time is same day, return");
        } else {
            list.add(0, new Pair<>(Long.valueOf(j), Float.valueOf((float) UnitUtil.c(d2))));
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
