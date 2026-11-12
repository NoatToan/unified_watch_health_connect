package com.huawei.health.suggestion.ui.plan.viewholder;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.media3.common.C;
import com.amap.api.maps.model.MyLocationStyle;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.basefitnessadvice.model.intplan.IntPlan;
import com.huawei.basefitnessadvice.model.intplan.IntWeekPlan;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.dfx.DfxUtils;
import com.huawei.haf.handler.HandlerCenter;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.h5pro.core.H5ProLaunchOption;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.ui.fitness.viewholder.AbsFitnessViewHolder;
import com.huawei.health.suggestion.ui.plan.fragment.AiFatReductionPlanFragment;
import com.huawei.health.suggestion.ui.plan.fragment.DietDetailsFragment;
import com.huawei.health.suggestion.ui.plan.fragment.DietRecordFragment;
import com.huawei.health.suggestion.ui.plan.fragment.WorkoutDetailsFragment;
import com.huawei.health.suggestion.util.JumpUtil;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.CloudParamKeys;
import com.huawei.ui.commonui.bubblelayout.HealthBubbleLayout;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.calendarview.HealthCalendar;
import com.huawei.ui.commonui.calendarview.HealthCalendarView;
import com.huawei.ui.commonui.calendarview.HealthMark;
import com.huawei.ui.commonui.cardview.HealthCardView;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.imageview.HealthImageView;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.ruler.circlescaleruler.CircleScaleRuler;
import com.huawei.ui.commonui.ruler.circlescaleruler.HealthCircleScaleRuler;
import com.huawei.ui.commonui.subtab.HealthSubTabWidget;
import com.huawei.ui.commonui.view.PlanUpgradeGuideView;
import com.huawei.ui.commonui.viewpager.HealthViewPager;
import defpackage.btw;
import defpackage.ddv;
import defpackage.ezn;
import defpackage.gzx;
import defpackage.hcz;
import defpackage.hdc;
import defpackage.hde;
import defpackage.hdf;
import defpackage.hdh;
import defpackage.hdp;
import defpackage.hqr;
import defpackage.hvq;
import defpackage.hvu;
import defpackage.hvv;
import defpackage.hwx;
import defpackage.ift;
import defpackage.iun;
import defpackage.iuo;
import defpackage.lsl;
import defpackage.njy;
import defpackage.qjj;
import defpackage.qox;
import defpackage.qpn;
import defpackage.qqz;
import defpackage.qre;
import defpackage.qrs;
import defpackage.qsp;
import defpackage.qsr;
import defpackage.vfy;
import defpackage.vgo;
import defpackage.xfz;
import health.compact.a.LanguageUtil;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class AiPlanWeekDetailViewHolder extends AbsFitnessViewHolder<IntPlan> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private LinearLayout f9738a;
    private boolean aa;
    private boolean ab;
    private HealthButton ac;
    private HealthButton ad;
    private long ae;
    private HealthCardView af;
    private int ag;
    private LinearLayout ah;
    private vfy ai;
    private LinearLayout aj;
    private PlanUpgradeGuideView ak;
    private final HealthRecycleView al;
    private LinearLayout am;
    private IntPlan an;
    private HealthSubTabWidget ao;
    private HealthViewPager ap;
    private Map<Integer, Integer> aq;
    private boolean ar;
    private HealthCircleScaleRuler as;
    private int at;
    private WorkoutDetailsFragment au;
    private int av;
    private vfy aw;
    private HealthTextView ax;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f9739b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AiFatReductionPlanFragment f9740c;
    private ConstraintLayout d;
    private DietDetailsFragment e;
    private LinearLayout f;
    private int g;
    private HealthCalendarView h;
    private int i;
    private final qox j;
    private HealthImageView k;
    private HealthTextView l;
    private HealthBubbleLayout m;
    private HealthImageView n;
    private HealthTextView o;
    private HealthTextView p;
    private int q;
    private int r;
    private HealthTextView s;
    private Context t;
    private hqr u;
    private qpn v;
    private LinearLayout w;
    private FragmentManager x;
    private DietRecordFragment y;
    private HealthTextView z;

    public AiPlanWeekDetailViewHolder(View view, FragmentManager fragmentManager, HealthRecycleView healthRecycleView, hqr hqrVar) {
        super(view);
        this.f9739b = new Handler(Looper.getMainLooper());
        this.j = new qox(false);
        this.aq = new HashMap(16);
        this.at = -1;
        this.ag = 1;
        this.t = view.getContext();
        this.x = fragmentManager;
        this.al = healthRecycleView;
        this.u = hqrVar;
        j(view);
    }

    private void h(View view) {
        ViewGroup.LayoutParams layoutParams = this.aj.getLayoutParams();
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            layoutParams2.addRule(20);
            layoutParams2.setMarginEnd(0);
            this.aj.setLayoutParams(layoutParams2);
        }
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.week_text);
        linearLayout.setGravity(1);
        ViewGroup.LayoutParams layoutParams3 = linearLayout.getLayoutParams();
        if (layoutParams3 instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) layoutParams3;
            layoutParams4.addRule(14);
            layoutParams4.setMarginEnd(0);
            linearLayout.setLayoutParams(layoutParams4);
        }
    }

    private void j(View view) {
        this.aj = (LinearLayout) view.findViewById(R.id.week_pre);
        this.ah = (LinearLayout) view.findViewById(R.id.week_next);
        h(view);
        HealthTextView healthTextView = (HealthTextView) view.findViewById(R.id.week_number);
        this.ax = healthTextView;
        healthTextView.setAlpha(0.6f);
        this.ax.setTextSize(14.0f);
        view.findViewById(R.id.level_name).setVisibility(8);
        this.f9738a = (LinearLayout) view.findViewById(R.id.fitness_sub_tab_layout);
        this.ao = (HealthSubTabWidget) view.findViewById(R.id.work_diet_detail_tab);
        this.ap = (HealthViewPager) view.findViewById(R.id.work_diet_detail_vp);
        f(view);
        this.f = (LinearLayout) view.findViewById(R.id.ai_fat_reduction_program);
        this.af = (HealthCardView) view.findViewById(R.id.member_expiration_card);
        this.am = (LinearLayout) view.findViewById(R.id.view_pager_layout);
        this.ac = (HealthButton) this.itemView.findViewById(R.id.immedate_renewal);
        this.ad = (HealthButton) this.itemView.findViewById(R.id.immedate_renewal_older);
        Drawable drawableC = qqz.c(BaseApplication.b(), R.drawable.common_ui_arrow_left);
        if (drawableC == null) {
            ReleaseLogUtil.d("Suggestion_AiPlanWeekDetailViewHolder", "initViewHolder drawable is null");
        } else {
            ((ImageView) view.findViewById(R.id.arrow_left)).setImageDrawable(drawableC);
        }
        if (qrs.v()) {
            this.ac.setVisibility(8);
            this.ad.setVisibility(0);
            this.ad.setOnClickListener(new View.OnClickListener() { // from class: hxf
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.d.e(view2);
                }
            });
        } else {
            this.ad.setVisibility(8);
            this.ac.setVisibility(0);
            this.ac.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.plan.viewholder.AiPlanWeekDetailViewHolder.5
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    if (view2.getId() == R.id.immedate_renewal) {
                        JumpUtil.d(AiPlanWeekDetailViewHolder.this.an);
                    }
                }
            });
        }
        this.ab = btw.g();
        t();
        g(view);
        LogUtil.a("Suggestion_AiPlanWeekDetailViewHolder", "init viewHolder !!!");
        l();
        view.setOnTouchListener(new View.OnTouchListener() { // from class: hxy
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                return this.f37319c.e(view2, motionEvent);
            }
        });
    }

    public /* synthetic */ void e(View view) {
        if (view.getId() == R.id.immedate_renewal_older) {
            JumpUtil.d(this.an);
        }
    }

    public /* synthetic */ boolean e(View view, MotionEvent motionEvent) {
        LogUtil.a("Suggestion_AiPlanWeekDetailViewHolder", "initViewHolder onTouch tempView ", view, " motionEvent ", motionEvent, " performClick ", Boolean.valueOf(view != null ? view.performClick() : false));
        HealthBubbleLayout healthBubbleLayout = this.m;
        if (healthBubbleLayout != null && healthBubbleLayout.getVisibility() == 0) {
            this.m.setVisibility(8);
        }
        return false;
    }

    private void f(View view) {
        this.h = (HealthCalendarView) view.findViewById(R.id.week_calendarView);
        Context contextB = BaseApplication.b();
        Resources resources = contextB.getResources();
        if (!LanguageUtil.f(contextB)) {
            this.h.setDayTextSize(resources.getDimensionPixelSize(com.huawei.ui.commonui.R.dimen.health_common_12dp));
        }
        this.h.a(true);
        this.h.d(true);
        this.h.setWeekStart(2);
        this.h.setIsSelectFutureDate(true);
        this.h.setIsSetGrayFutureDate(true);
        this.h.setSelectGrayDate(false);
        this.h.setMarkViewSize(qrs.d(this.t, 24.0f));
        this.h.setMarkTopMargin(qrs.d(this.t, 4.0f));
        this.h.setIsWeekDayReplaceDate(true);
        this.h.setModeOnlyWeekView();
        ViewGroup.LayoutParams layoutParams = this.h.getLayoutParams();
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams2.topMargin = -resources.getDimensionPixelSize(com.huawei.ui.commonui.R.dimen.health_common_12dp);
            layoutParams2.bottomMargin = 0;
            this.h.setLayoutParams(layoutParams2);
        }
    }

    private void g(View view) {
        this.as = (HealthCircleScaleRuler) view.findViewById(R.id.sug_layout_plan_week_detail_health_circle_scale_ruler);
        ezn.d(this.j, false);
        this.as.setCircleScaleRulerData(this.j);
        this.w = (LinearLayout) view.findViewById(R.id.sug_layout_plan_week_detail_layout);
        this.n = (HealthImageView) view.findViewById(R.id.sug_layout_plan_week_detail_total_consumption_icon);
        this.p = (HealthTextView) view.findViewById(R.id.sug_layout_plan_week_detail_total_consumption_title);
        this.k = (HealthImageView) view.findViewById(R.id.sug_layout_plan_week_detail_total_consumption_icon_tip);
        this.s = (HealthTextView) view.findViewById(R.id.sug_layout_plan_week_detail_total_consumption_value);
        this.m = (HealthBubbleLayout) view.findViewById(R.id.sug_layout_plan_week_detail_total_consumption_bubble);
        this.ak = (PlanUpgradeGuideView) ((ViewStub) view.findViewById(R.id.smart_weight_plan_upgrade_guide_view_stub)).inflate();
        this.o = (HealthTextView) view.findViewById(R.id.sug_layout_plan_week_detail_total_consumption_bubble_sport);
        this.l = (HealthTextView) view.findViewById(R.id.sug_layout_plan_week_detail_total_consumption_bubble_resting);
        this.z = (HealthTextView) view.findViewById(R.id.sug_layout_plan_week_detail_total_intake_value);
        ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(R.id.circle_constraintLayout);
        this.d = constraintLayout;
        constraintLayout.setVisibility(8);
    }

    private void l() {
        this.aj.setClickable(true);
        this.ah.setClickable(true);
        this.aj.setOnClickListener(new View.OnClickListener() { // from class: hxl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.e.d(view);
            }
        });
        this.ah.setOnClickListener(new View.OnClickListener() { // from class: hxj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.e.c(view);
            }
        });
        this.as.setIconOnClickListener(new View.OnClickListener() { // from class: hxi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                JumpUtil.c();
            }
        });
        i(this.n);
        i(this.p);
        i(this.k);
        i(this.s);
        i(this.m);
        this.ak.setOnButtonClickListener(new PlanUpgradeGuideView.OnButtonClickListener() { // from class: hxm
            @Override // com.huawei.ui.commonui.view.PlanUpgradeGuideView.OnButtonClickListener
            public final void onClick() {
                this.f37303b.c();
            }
        });
    }

    public /* synthetic */ void d(View view) {
        m();
    }

    public /* synthetic */ void c(View view) {
        i();
    }

    public /* synthetic */ void c() {
        ddv.b().loadH5ProApp(this.t, "com.huawei.health.h5.ai-weight", new H5ProLaunchOption.Builder().addPath("#/plan_introduce_new"));
    }

    private void i(View view) {
        view.setOnClickListener(new View.OnClickListener() { // from class: hxp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.e.b(view2);
            }
        });
    }

    public /* synthetic */ void b(View view) {
        int i = this.g;
        int i2 = this.i;
        int i3 = (i * 7) + i2;
        int i4 = this.q;
        int i5 = this.r;
        boolean z = i3 > (i4 * 7) + i5;
        ReleaseLogUtil.c("Suggestion_AiPlanWeekDetailViewHolder", "initConsumptionClick isFuture ", Boolean.valueOf(z), " mCalenderWeekIndex ", Integer.valueOf(i), " mCalenderDayIndex ", Integer.valueOf(i2), " mCurrentWeekOrder ", Integer.valueOf(i4), " mCurrentDayOrder ", Integer.valueOf(i5));
        if (z) {
            return;
        }
        ezn.a(this.m, this.p.getMeasuredWidth(), this.o, this.l, this.ai);
    }

    public HealthCalendarView d() {
        return this.h;
    }

    @Override // com.huawei.health.suggestion.ui.fitness.viewholder.AbsFitnessViewHolder
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void init(final IntPlan intPlan) {
        if (!HandlerExecutor.d()) {
            HandlerExecutor.c(new Runnable() { // from class: hxk
                @Override // java.lang.Runnable
                public final void run() {
                    this.e.d(intPlan);
                }
            });
            return;
        }
        if (intPlan == null) {
            ReleaseLogUtil.d("Suggestion_AiPlanWeekDetailViewHolder", "init plan is null");
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (lsl.aa(this.ae) && Math.abs(jCurrentTimeMillis - this.ae) <= 1000) {
            long j = this.ae;
            LogUtil.j("Suggestion_AiPlanWeekDetailViewHolder", "init mLastInitTimeMillis ", Long.valueOf(j), " dumpStackTraceInfo ", DfxUtils.d(Thread.currentThread(), null));
            return;
        }
        long j2 = this.ae;
        LogUtil.a("Suggestion_AiPlanWeekDetailViewHolder", "init mLastInitTimeMillis ", Long.valueOf(j2), " mPlan ", this.an, " plan ", intPlan);
        this.ae = jCurrentTimeMillis;
        if (intPlan != this.an) {
            this.an = intPlan;
            this.h.c(false);
            this.av = intPlan.getMetaInfo().getWeekCount();
            p();
            n();
            k();
            e();
        }
        p();
        u();
        o();
        y();
        r();
        b(true, false);
        q();
        ReleaseLogUtil.c("Suggestion_AiPlanWeekDetailViewHolder", "init mCalenderWeekIndex ", Integer.valueOf(this.g), " mCurrentWeekOrder ", Integer.valueOf(this.q), " mCalenderDayIndex ", Integer.valueOf(this.i), " mCurrentDayOrder ", Integer.valueOf(this.r));
        if (this.g == this.q) {
            List<vgo> listD = iuo.d();
            LogUtil.a("Suggestion_AiPlanWeekDetailViewHolder", "init dietRecordCacheList ", listD);
            d(listD, true);
        }
        if (this.i == this.r) {
            vgo vgoVarC = iuo.c();
            LogUtil.a("Suggestion_AiPlanWeekDetailViewHolder", "init dayDietRecord ", vgoVarC);
            if (vgoVarC != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(vgoVarC);
                d((List<vgo>) arrayList, true);
                a(vgoVarC.d());
            }
        }
    }

    private void p() {
        long beginDate = this.an.getPlanTimeInfo().getBeginDate() * 1000;
        long jCurrentTimeMillis = System.currentTimeMillis();
        LogUtil.a("Suggestion_AiPlanWeekDetailViewHolder", "startTime=", Long.valueOf(beginDate), "  currentTime=", Long.valueOf(jCurrentTimeMillis));
        int iC = ift.c(beginDate, jCurrentTimeMillis) + 1;
        this.q = iC;
        this.ag = iC <= 0 ? iC : 1;
        int iB = ift.b(Calendar.getInstance().get(7));
        this.r = iB;
        LogUtil.a("Suggestion_AiPlanWeekDetailViewHolder", "mCurrentWeekOrder=", Integer.valueOf(this.q), "  mCurrentDayOrder=", Integer.valueOf(iB));
    }

    private void n() {
        this.g = this.q;
        y();
        int iB = ift.b(Calendar.getInstance().get(7));
        this.i = iB;
        LogUtil.a("Suggestion_AiPlanWeekDetailViewHolder", "mCalenderWeekIndex=", Integer.valueOf(this.g), " mCalenderDayIndex=", Integer.valueOf(iB));
    }

    private void k() {
        this.h.setOnCalendarSelectListener(new HealthCalendarView.OnCalendarSelectListener() { // from class: com.huawei.health.suggestion.ui.plan.viewholder.AiPlanWeekDetailViewHolder.2
            @Override // com.huawei.ui.commonui.calendarview.HealthCalendarView.OnCalendarSelectListener
            public void onCalendarOutOfRange(HealthCalendar healthCalendar) {
            }

            @Override // com.huawei.ui.commonui.calendarview.HealthCalendarView.OnCalendarSelectListener
            public void onCalendarSelect(HealthCalendar healthCalendar, boolean z) {
                AiPlanWeekDetailViewHolder.this.i = ift.b(healthCalendar.getWeek());
                int iC = ift.c(AiPlanWeekDetailViewHolder.this.an.getPlanTimeInfo().getBeginDate() * 1000, healthCalendar.transformCalendar().getTimeInMillis());
                AiPlanWeekDetailViewHolder aiPlanWeekDetailViewHolder = AiPlanWeekDetailViewHolder.this;
                aiPlanWeekDetailViewHolder.ar = (z || iC + 1 == aiPlanWeekDetailViewHolder.g) ? false : true;
                if (AiPlanWeekDetailViewHolder.this.i == AiPlanWeekDetailViewHolder.this.at && AiPlanWeekDetailViewHolder.this.g == iC + 1) {
                    LogUtil.a("Suggestion_AiPlanWeekDetailViewHolder", "onCalendarSelect repeat");
                    return;
                }
                AiPlanWeekDetailViewHolder aiPlanWeekDetailViewHolder2 = AiPlanWeekDetailViewHolder.this;
                aiPlanWeekDetailViewHolder2.at = aiPlanWeekDetailViewHolder2.i;
                AiPlanWeekDetailViewHolder.this.g = iC + 1;
                LogUtil.a("Suggestion_AiPlanWeekDetailViewHolder", "onCalendarSelect calenderDayIndex ", Integer.valueOf(AiPlanWeekDetailViewHolder.this.i), " calenderWeekIndex", Integer.valueOf(AiPlanWeekDetailViewHolder.this.g));
                if (AiPlanWeekDetailViewHolder.this.ar) {
                    AiPlanWeekDetailViewHolder aiPlanWeekDetailViewHolder3 = AiPlanWeekDetailViewHolder.this;
                    aiPlanWeekDetailViewHolder3.c(aiPlanWeekDetailViewHolder3.i);
                }
                AiPlanWeekDetailViewHolder.this.u();
                AiPlanWeekDetailViewHolder.this.b(true, false);
                LogUtil.a("Suggestion_AiPlanWeekDetailViewHolder", "onCalendarSelect end");
            }
        });
        this.h.setOnWeekChangeListener(new HealthCalendarView.OnWeekChangeListener() { // from class: com.huawei.health.suggestion.ui.plan.viewholder.AiPlanWeekDetailViewHolder.4
            @Override // com.huawei.ui.commonui.calendarview.HealthCalendarView.OnWeekChangeListener
            public void onWeekChange(List<HealthCalendar> list) {
                LogUtil.a("Suggestion_AiPlanWeekDetailViewHolder", "onWeekChange enter ", list == null ? null : Integer.valueOf(list.size()));
                AiPlanWeekDetailViewHolder.this.d(list);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(List<HealthCalendar> list) {
        if (njy.e(list)) {
            return;
        }
        HealthCalendar healthCalendar = list.get(0);
        HealthCalendar healthCalendar2 = list.get(list.size() - 1);
        int iA = DateFormatUtil.a(qjj.d(healthCalendar));
        int iA2 = DateFormatUtil.a(qjj.e(healthCalendar2));
        int iB = btw.b(this.an);
        if (iB >= iA && iB <= iA2) {
            this.ah.setVisibility(4);
            this.h.setForbiddenSwipeNextWeek(true);
        } else {
            this.ah.setVisibility(0);
            this.h.setForbiddenSwipeNextWeek(false);
        }
        int iF = btw.f(this.an);
        if (iF >= iA && iF <= iA2) {
            this.aj.setVisibility(4);
            this.h.setForbiddenSwipePreWeek(true);
        } else {
            this.aj.setVisibility(0);
            this.h.setForbiddenSwipePreWeek(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u() {
        qsp.a(this.ax, UnitUtil.a(new Date(ift.b(this.an.getPlanTimeInfo().getBeginDate() * 1000, this.g, this.i)), 22), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q() {
        IntPlan intPlan = this.an;
        if (intPlan == null || intPlan.getPlanTimeInfo() == null) {
            ReleaseLogUtil.d("Suggestion_AiPlanWeekDetailViewHolder", "queryPlanDietRecord mPlan ", this.an);
            return;
        }
        if (HandlerExecutor.c()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: hxt
                @Override // java.lang.Runnable
                public final void run() {
                    this.f37314b.q();
                }
            });
            return;
        }
        long jA = lsl.a(ift.b(this.an.getPlanTimeInfo().getBeginDate() * 1000, this.q, this.r), -1);
        final int iF = btw.f(this.an);
        int iA = DateFormatUtil.a(jA);
        if (iF > iA) {
            ReleaseLogUtil.d("Suggestion_AiPlanWeekDetailViewHolder", "queryPlanDietRecord planStartDate ", Integer.valueOf(iF), " endDate ", Integer.valueOf(iA));
            return;
        }
        if (hvu.c()) {
            LogUtil.j("Suggestion_AiPlanWeekDetailViewHolder", "queryPlanDietRecord isInSyncDataProgress");
            return;
        }
        int iA2 = DateFormatUtil.a(lsl.e(jA, 2, 0));
        final int iMax = Math.max(iF, iA2);
        ReleaseLogUtil.c("Suggestion_AiPlanWeekDetailViewHolder", "queryPlanDietRecord planStartDate ", Integer.valueOf(iF), " startDate ", Integer.valueOf(iMax), " endDate ", Integer.valueOf(iA), " weekStartDate ", Integer.valueOf(iA2), " mCalenderWeekIndex ", Integer.valueOf(this.g), " mCalenderDayIndex ", Integer.valueOf(this.i));
        iun.c(iMax, iA, new ResponseCallback() { // from class: hxv
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i, Object obj) {
                this.e.a(i, (List) obj);
            }
        });
        if (iF >= iMax) {
            return;
        }
        HandlerCenter.a().d(new Runnable() { // from class: hxw
            @Override // java.lang.Runnable
            public final void run() {
                this.f37316a.c(iF, iMax);
            }
        }, C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS);
    }

    public /* synthetic */ void a(int i, List list) {
        LogUtil.a("Suggestion_AiPlanWeekDetailViewHolder", "queryPlanDietRecord errorCode ", Integer.valueOf(i), " list ", list);
        d((List<vgo>) list, false);
        hvq.d((List<vgo>) list);
    }

    public /* synthetic */ void c(int i, int i2) {
        iun.c(i, i2, new ResponseCallback() { // from class: hya
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i3, Object obj) {
                this.d.d(i3, (List) obj);
            }
        });
    }

    public /* synthetic */ void d(int i, List list) {
        LogUtil.a("Suggestion_AiPlanWeekDetailViewHolder", "queryPlanDietRecord errorCode ", Integer.valueOf(i), " list ", list);
        d((List<vgo>) list, false);
        hvq.d((List<vgo>) list);
    }

    private void o() {
        this.h.b();
        HashMap map = new HashMap();
        for (int i = 0; i < this.an.getMetaInfo().getWeekCount(); i++) {
            IntWeekPlan weekInfoByIdx = this.an.getWeekInfoByIdx(i);
            if (weekInfoByIdx == null) {
                LogUtil.a("Suggestion_AiPlanWeekDetailViewHolder", "weekInfo is null");
            } else {
                for (int i2 = 1; i2 <= 7; i2++) {
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTimeInMillis(ift.a(this.an.getPlanTimeInfo().getBeginDate() * 1000, weekInfoByIdx.getWeekOrder() - 1, i2));
                    HealthMark healthMark = new HealthMark();
                    HealthCalendar healthCalendarD = d(calendar);
                    View viewA = qre.a(this.t, R.layout.ai_plan_calendar_circle_scale_ruler_layout, this.h, false);
                    if (viewA != null) {
                        CircleScaleRuler circleScaleRuler = (CircleScaleRuler) viewA.findViewById(R.id.ai_plan_calendar_layout_circle_scale_ruler);
                        qox qoxVar = new qox(true);
                        qoxVar.e(R.color.colorControlNormal);
                        qoxVar.d(R.color.colorControlNormal);
                        circleScaleRuler.setCircleScaleRulerData(qoxVar);
                    }
                    healthMark.e(viewA);
                    healthMark.a(qre.b(R.dimen.health_common_4dp));
                    healthCalendarD.addMark(healthMark);
                    map.put(healthCalendarD.toString(), healthCalendarD);
                }
            }
        }
        this.h.e(map);
    }

    private void r() {
        HealthCalendarView healthCalendarView = this.h;
        if (healthCalendarView != null) {
            d(healthCalendarView.getCurrentWeekCalendars());
        }
    }

    private HealthCalendar d(Calendar calendar) {
        int i = calendar.get(1);
        int i2 = calendar.get(2);
        int i3 = calendar.get(5);
        HealthCalendar healthCalendar = new HealthCalendar();
        healthCalendar.setYear(i);
        healthCalendar.setMonth(i2 + 1);
        healthCalendar.setDay(i3);
        return healthCalendar;
    }

    private void d(final List<vgo> list, final boolean z) {
        if (njy.e(list)) {
            return;
        }
        HandlerExecutor.b(new Runnable() { // from class: hxo
            @Override // java.lang.Runnable
            public final void run() {
                this.f37306c.a(list, z);
            }
        });
    }

    public /* synthetic */ void a(List list, boolean z) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        Calendar calendar = Calendar.getInstance();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            vgo vgoVar = (vgo) it.next();
            if (vgoVar != null) {
                long jD = DateFormatUtil.d(vgoVar.c());
                if (!z || lsl.g(jCurrentTimeMillis, jD)) {
                    calendar.setTimeInMillis(jD);
                    c(d(calendar), vgoVar);
                }
            }
        }
    }

    private void c(HealthCalendar healthCalendar, vgo vgoVar) {
        LogUtil.a("Suggestion_AiPlanWeekDetailViewHolder", "updateCalendarMarkProgress calendarItem ", healthCalendar, " dietRecord ", vgoVar);
        if (healthCalendar == null || vgoVar == null) {
            return;
        }
        HealthMark healthMark = new HealthMark();
        View viewA = qre.a(this.t, R.layout.ai_plan_calendar_circle_scale_ruler_layout, this.h, false);
        if (viewA != null) {
            HealthTextView healthTextView = (HealthTextView) viewA.findViewById(R.id.ai_plan_calendar_layout_text);
            CircleScaleRuler circleScaleRuler = (CircleScaleRuler) viewA.findViewById(R.id.ai_plan_calendar_layout_circle_scale_ruler);
            qox qoxVar = new qox(true);
            int iA = DateFormatUtil.a(healthCalendar.transformCalendar().getTimeInMillis());
            int iA2 = DateFormatUtil.a(System.currentTimeMillis());
            int iF = btw.f(this.an);
            LogUtil.a("Suggestion_AiPlanWeekDetailViewHolder", "updateCalendarMarkProgress date ", Integer.valueOf(iA), " todayDate ", Integer.valueOf(iA2), " planStartDate ", Integer.valueOf(iF));
            if (iA > iA2 || iA < iF) {
                healthTextView.setText("");
                qoxVar.b(0.0f);
                qoxVar.e(R.color.colorControlNormal);
                qoxVar.d(R.color.colorControlNormal);
            } else {
                vfy vfyVarD = vgoVar.d();
                healthTextView.setText(UnitUtil.e(ezn.d(vfyVarD), 1, 0));
                if (LanguageUtil.c(BaseApplication.b())) {
                    healthTextView.setTextDirection(4);
                }
                qoxVar.b(ezn.b(vfyVarD));
            }
            circleScaleRuler.setCircleScaleRulerData(qoxVar);
        }
        healthMark.e(viewA);
        healthMark.a(qre.b(R.dimen.health_common_4dp));
        healthCalendar.addMark(healthMark);
        HashMap map = new HashMap();
        map.put(healthCalendar.toString(), healthCalendar);
        this.h.e(map);
    }

    private HealthCalendar d(int i, int i2, int i3) {
        HealthCalendar healthCalendar = new HealthCalendar();
        healthCalendar.setYear(i);
        healthCalendar.setMonth(i2);
        healthCalendar.setDay(i3);
        return healthCalendar;
    }

    private void y() {
        if (this.g <= this.ag) {
            this.aj.setVisibility(4);
        } else {
            this.aj.setVisibility(0);
        }
        if (this.g >= this.av) {
            this.ah.setVisibility(4);
        } else {
            this.ah.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i) {
        y();
        u();
        Calendar calendar = Calendar.getInstance();
        long beginDate = this.an.getPlanTimeInfo().getBeginDate();
        int i2 = this.g;
        if (i2 == this.q) {
            i = this.r;
        }
        calendar.setTimeInMillis(ift.a(beginDate * 1000, i2 - 1, i));
        int i3 = calendar.get(1);
        int i4 = calendar.get(2);
        int i5 = calendar.get(5);
        HealthCalendar healthCalendarD = d(i3, i4 + 1, i5);
        if (!this.ar) {
            this.h.c(healthCalendarD, true, true);
        }
        LogUtil.a("Suggestion_AiPlanWeekDetailViewHolder", "handlePreviousWeekClick day:", Integer.valueOf(i5));
        b(true, false);
        this.ar = false;
    }

    private void m() {
        if (qrs.c(500)) {
            return;
        }
        this.g--;
        c(7);
    }

    private void i() {
        if (qrs.c(500)) {
            return;
        }
        this.g++;
        c(1);
    }

    private void t() {
        final LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        this.ap.addOnPageChangeListener(new HealthViewPager.OnPageChangeListener() { // from class: com.huawei.health.suggestion.ui.plan.viewholder.AiPlanWeekDetailViewHolder.3
            @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
            public void onPageScrollStateChanged(int i) {
            }

            @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
            public void onPageScrolled(int i, float f, int i2) {
            }

            @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
            public void onPageSelected(int i) {
                if (i <= 2) {
                    if (AiPlanWeekDetailViewHolder.this.aq.size() > i) {
                        layoutParams.height = ((Integer) AiPlanWeekDetailViewHolder.this.aq.get(Integer.valueOf(i))).intValue();
                        LogUtil.d("Suggestion_AiPlanWeekDetailViewHolder", "position " + i + " " + AiPlanWeekDetailViewHolder.this.aq.get(Integer.valueOf(i)));
                        AiPlanWeekDetailViewHolder.this.ap.setLayoutParams(layoutParams);
                        return;
                    }
                    return;
                }
                LogUtil.j("Suggestion_AiPlanWeekDetailViewHolder", "onPageSelected position error:", Integer.valueOf(i));
            }
        });
        this.aq.put(0, 0);
        this.aq.put(1, 0);
        if (this.ab) {
            this.f9740c = new AiFatReductionPlanFragment(this.u);
        } else {
            this.v = new qpn(this.x, this.ap, this.ao);
            a();
        }
    }

    public void b(int i, int i2) {
        this.aq.put(Integer.valueOf(i), Integer.valueOf(i2));
        if (this.ao.getSelectedSubTabPostion() == i) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.height = i2;
            LogUtil.d("Suggestion_AiPlanWeekDetailViewHolder", "position " + i + " height " + i2);
            this.ap.setLayoutParams(layoutParams);
        }
    }

    public void b(boolean z, boolean z2) {
        AiFatReductionPlanFragment aiFatReductionPlanFragment;
        if (hvu.r(this.an)) {
            this.as.setVisibility(8);
            this.w.setVisibility(8);
            this.d.setVisibility(8);
            this.f9738a.setVisibility(8);
            this.f.setVisibility(8);
            this.af.setVisibility(0);
            this.am.setVisibility(8);
            return;
        }
        if (!hvv.c(this.an, this.g, this.i)) {
            this.f9738a.setVisibility(8);
            this.f.setVisibility(8);
            this.as.setVisibility(8);
            this.w.setVisibility(8);
            this.d.setVisibility(8);
            this.af.setVisibility(8);
            if (this.g <= this.ag) {
                this.am.setVisibility(0);
                e();
                return;
            } else {
                this.am.setVisibility(8);
                return;
            }
        }
        this.f9738a.setVisibility(0);
        this.f.setVisibility(0);
        this.as.setVisibility(0);
        this.w.setVisibility(0);
        this.d.setVisibility(8);
        this.af.setVisibility(8);
        this.am.setVisibility(8);
        List<Integer> listAsList = Arrays.asList(Integer.valueOf(this.q), Integer.valueOf(this.g), Integer.valueOf(this.r), Integer.valueOf(this.i));
        if (this.ab && (aiFatReductionPlanFragment = this.f9740c) != null) {
            aiFatReductionPlanFragment.b(this.t, this.an, this, listAsList, this.al);
            this.f.setVisibility(0);
            this.f9738a.setVisibility(8);
        } else {
            WorkoutDetailsFragment workoutDetailsFragment = this.au;
            if (workoutDetailsFragment != null) {
                workoutDetailsFragment.d(this.t, this, this.an, listAsList);
            }
        }
        if (hvu.c()) {
            return;
        }
        b();
        if (this.aa) {
            s();
        }
        hvv.e();
    }

    private void b(final vgo vgoVar, final long j) {
        ReleaseLogUtil.c("Suggestion_AiPlanWeekDetailViewHolder", "initDiet timeMillis ", Long.valueOf(j));
        hvv.c((ResponseCallback<Pair<Long, String>>) new ResponseCallback() { // from class: hxn
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i, Object obj) {
                this.f37304c.e(vgoVar, j, i, (Pair) obj);
            }
        });
    }

    public /* synthetic */ void e(vgo vgoVar, long j, int i, Pair pair) {
        ReleaseLogUtil.c("Suggestion_AiPlanWeekDetailViewHolder", "initDiet pair ", pair);
        e(vgoVar, j);
    }

    private void s() {
        boolean z = (this.g * 7) + this.i > (this.q * 7) + this.r;
        long jB = ift.b(this.an.getPlanTimeInfo().getBeginDate() * 1000, this.g, this.i);
        LogUtil.a("Suggestion_AiPlanWeekDetailViewHolder", "DietRecordFragment isFutureTime: ", Boolean.valueOf(z), ", currentSelectTime: ", Long.valueOf(jB));
        DietRecordFragment dietRecordFragment = this.y;
        if (dietRecordFragment != null) {
            dietRecordFragment.d(z, jB);
        }
    }

    public void e() {
        hwx hwxVar = new hwx(this.t, this.am);
        hwxVar.a(this.an);
        hwxVar.i();
    }

    public void b() {
        boolean z = (this.g * 7) + this.i > (this.q * 7) + this.r;
        final long jB = ift.b(this.an.getPlanTimeInfo().getBeginDate() * 1000, this.g, this.i);
        long jB2 = ift.b(this.an.getPlanTimeInfo().getBeginDate() * 1000, this.q, this.r);
        if (!z) {
            jB2 = jB;
        }
        int iA = DateFormatUtil.a(jB2);
        ReleaseLogUtil.c("Suggestion_AiPlanWeekDetailViewHolder", "getDietRecord dayFormat ", Integer.valueOf(iA), " mCalenderWeekIndex ", Integer.valueOf(this.g), " mCalenderDayIndex ", Integer.valueOf(this.i));
        iun.c(iA, iA, new ResponseCallback() { // from class: hxu
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i, Object obj) {
                this.f37315a.d(jB, i, (List) obj);
            }
        });
    }

    public /* synthetic */ void d(final long j, int i, final List list) {
        LogUtil.a("Suggestion_AiPlanWeekDetailViewHolder", "getDietRecord errorCode ", Integer.valueOf(i), " list ", list);
        HandlerExecutor.b(new Runnable() { // from class: hxr
            @Override // java.lang.Runnable
            public final void run() {
                this.f37310c.c(list, j);
            }
        });
    }

    public /* synthetic */ void c(List list, long j) {
        if (njy.e(list)) {
            b((vgo) null, j);
            a(this.aw);
            return;
        }
        vgo vgoVar = (vgo) list.get(0);
        if (vgoVar == null) {
            b((vgo) null, j);
            a(this.aw);
            return;
        }
        this.aw = vgoVar.d();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        c(d(calendar), vgoVar);
        b(vgoVar, j);
        a(this.aw);
        this.ai = this.aw;
        hvq.d((List<vgo>) list);
    }

    private void a(vfy vfyVar) {
        LogUtil.a("Suggestion_AiPlanWeekDetailViewHolder", "refreshCaloricDeficit overview ", vfyVar);
        if (vfyVar == null) {
            return;
        }
        this.m.setVisibility(8);
        int i = (this.g * 7) + this.i;
        int i2 = (this.q * 7) + this.r;
        boolean z = i > i2;
        if (i == i2) {
            ezn.f(vfyVar);
        }
        ezn.d(this.j, vfyVar, z);
        this.as.setCircleScaleRulerData(this.j);
        ezn.d(this.as, vfyVar, z);
        ezn.e(this.s, vfyVar, z);
        ezn.c(this.z, vfyVar, z);
    }

    private void e(long j, UiCallback<hdh> uiCallback) {
        if (this.aa) {
            return;
        }
        vfy vfyVar = this.aw;
        int iMin = vfyVar != null ? Math.min(Math.max(1000, Math.round(vfyVar.e())), 10000) : 1000;
        hcz hczVar = new hcz();
        hczVar.c(String.valueOf(iMin));
        if (qsr.c().i()) {
            hczVar.e(hvv.b());
        } else {
            hczVar.e("1");
        }
        hczVar.a(this.aw);
        new hdp().getFoodRecommendDetail(this.an.getPlanId(), DateFormatUtil.e(j, DateFormatUtil.DateFormatType.DATE_FORMAT_YYYY_MM_DD), hczVar, uiCallback);
    }

    /* JADX INFO: renamed from: com.huawei.health.suggestion.ui.plan.viewholder.AiPlanWeekDetailViewHolder$1, reason: invalid class name */
    public class AnonymousClass1 extends UiCallback<hdh> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ vgo f9741a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f9742b;
        final /* synthetic */ List e;

        AnonymousClass1(List list, vgo vgoVar, long j) {
            this.e = list;
            this.f9741a = vgoVar;
            this.f9742b = j;
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public void onFailure(int i, String str) {
            LogUtil.j("Suggestion_AiPlanWeekDetailViewHolder", "getRecommendFoodForTomorrow errorCode ", Integer.valueOf(i), " errorInfo ", str);
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onSuccess(hdh hdhVar) {
            hdf hdfVarD;
            LogUtil.a("Suggestion_AiPlanWeekDetailViewHolder", "getRecommendFoodForTomorrow recipeResponse ", HiJsonUtil.d(hdhVar));
            if (hdhVar != null && (hdfVarD = hdhVar.d()) != null) {
                AiPlanWeekDetailViewHolder.this.c(0, hdfVarD.c(), new ArrayList(), (List<List<hdc>>) this.e);
                AiPlanWeekDetailViewHolder.this.c(1, hdfVarD.a(), new ArrayList(), (List<List<hdc>>) this.e);
                AiPlanWeekDetailViewHolder.this.c(2, hdfVarD.b(), new ArrayList(), (List<List<hdc>>) this.e);
            }
            final List list = this.e;
            final vgo vgoVar = this.f9741a;
            final long j = this.f9742b;
            HandlerExecutor.b(new Runnable() { // from class: hxx
                @Override // java.lang.Runnable
                public final void run() {
                    this.f37318c.c(list, vgoVar, j);
                }
            });
        }

        public /* synthetic */ void c(List list, vgo vgoVar, long j) {
            if (!AiPlanWeekDetailViewHolder.this.ab || AiPlanWeekDetailViewHolder.this.f9740c == null) {
                return;
            }
            AiPlanWeekDetailViewHolder.this.f9740c.e((List<List<hdc>>) list, vgoVar, j);
        }
    }

    private void b(vgo vgoVar, List<List<hdc>> list, long j) {
        e(lsl.w(j), new AnonymousClass1(list, vgoVar, j));
    }

    private List<List<hdc>> h() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new hdc());
        arrayList.add(arrayList2);
        arrayList.add(arrayList2);
        arrayList.add(arrayList2);
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void e(final vgo vgoVar, final long j) {
        if (!btw.c()) {
            AiFatReductionPlanFragment aiFatReductionPlanFragment = this.f9740c;
            if (aiFatReductionPlanFragment != null) {
                aiFatReductionPlanFragment.e(h(), vgoVar, j);
                return;
            }
            return;
        }
        if (HandlerExecutor.c()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: hxq
                @Override // java.lang.Runnable
                public final void run() {
                    this.f37307b.e(vgoVar, j);
                }
            });
        } else {
            e(j, new UiCallback<hdh>() { // from class: com.huawei.health.suggestion.ui.plan.viewholder.AiPlanWeekDetailViewHolder.10
                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                public void onFailure(int i, String str) {
                    LogUtil.j("Suggestion_AiPlanWeekDetailViewHolder", "getRecommendFoods errorCode ", Integer.valueOf(i), " errorInfo ", str);
                }

                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
                public void onSuccess(hdh hdhVar) {
                    LogUtil.a("Suggestion_AiPlanWeekDetailViewHolder", "getRecommendFoods recipeResponse ", HiJsonUtil.d(hdhVar));
                    if (hdhVar == null) {
                        return;
                    }
                    if (hdhVar.b() == 0) {
                        if (!AiPlanWeekDetailViewHolder.this.ab || AiPlanWeekDetailViewHolder.this.f9740c == null) {
                            return;
                        }
                        AiPlanWeekDetailViewHolder.this.f9740c.e(Collections.EMPTY_LIST, vgoVar, j);
                        return;
                    }
                    hdf hdfVarD = hdhVar.d();
                    if (hdfVarD != null) {
                        AiPlanWeekDetailViewHolder.this.b(vgoVar, j, hdfVarD);
                    } else {
                        LogUtil.j("Suggestion_AiPlanWeekDetailViewHolder", "getRecommendFoods recipes is null");
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final vgo vgoVar, final long j, hdf hdfVar) {
        final ArrayList arrayList = new ArrayList(3);
        final ArrayList arrayList2 = new ArrayList(3);
        c(0, hdfVar.c(), arrayList2, arrayList);
        c(1, hdfVar.a(), arrayList2, arrayList);
        c(2, hdfVar.b(), arrayList2, arrayList);
        HandlerExecutor.b(new Runnable() { // from class: hxs
            @Override // java.lang.Runnable
            public final void run() {
                this.f37311a.e(arrayList2, arrayList, vgoVar, j);
            }
        });
    }

    public /* synthetic */ void e(List list, List list2, vgo vgoVar, long j) {
        DietDetailsFragment dietDetailsFragment = this.e;
        if (dietDetailsFragment != null) {
            dietDetailsFragment.a(this.an, list, list2, vgoVar, DateFormatUtil.e(j, DateFormatUtil.DateFormatType.DATE_FORMAT_YYYY_MM_DD));
        }
        if (!this.ab || this.f9740c == null) {
            return;
        }
        if (hvq.e(list2, vgoVar, j)) {
            b(vgoVar, (List<List<hdc>>) list2, j);
        } else {
            this.f9740c.e((List<List<hdc>>) list2, vgoVar, j);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i, List<hdc> list, List<String> list2, List<List<hdc>> list3) {
        if (njy.e(list)) {
            return;
        }
        list3.add(list);
        StringBuilder sb = new StringBuilder();
        Iterator<hdc> it = list.iterator();
        float fH = 0.0f;
        while (it.hasNext()) {
            fH += it.next().h();
        }
        if (i == 0) {
            sb.append(gzx.c(this.t, R.string.IDS_recommend_breakfast, ((int) fH) + " "));
        } else if (i == 1) {
            sb.append(gzx.c(this.t, R.string.IDS_recommend_launch, ((int) fH) + " "));
        } else if (i == 2) {
            sb.append(gzx.c(this.t, R.string.IDS_recommend_dinner, ((int) fH) + " "));
        }
        sb.append(BaseApplication.b().getResources().getString(R.string.sug_finess_kcal1));
        list2.add(sb.toString());
    }

    public void g() {
        FragmentManager fragmentManager;
        LogUtil.a("Suggestion_AiPlanWeekDetailViewHolder", "replaceFragment mIsSupportNewAiFitnessPlan ", Boolean.valueOf(this.ab), " mFragmentManager ", this.x, " mAiFatReductionProgram ", this.f);
        if (!this.ab || (fragmentManager = this.x) == null || this.f == null) {
            return;
        }
        FragmentTransaction fragmentTransactionBeginTransaction = fragmentManager.beginTransaction();
        fragmentTransactionBeginTransaction.replace(R.id.ai_fat_reduction_program, this.f9740c);
        fragmentTransactionBeginTransaction.commitAllowingStateLoss();
    }

    public void f() {
        AiFatReductionPlanFragment aiFatReductionPlanFragment = this.f9740c;
        if (aiFatReductionPlanFragment != null) {
            aiFatReductionPlanFragment.a();
        }
    }

    public void a() {
        if (this.v == null) {
            LogUtil.j("Suggestion_AiPlanWeekDetailViewHolder", "addSubTabsOnPlanVisible mFitnessTabsAdapter is null");
            return;
        }
        boolean zO = Utils.o();
        this.aa = zO;
        LogUtil.a("Suggestion_AiPlanWeekDetailViewHolder", "addSubTabsOnPlanVisible() mIsOversea: ", Boolean.valueOf(zO));
        this.au = new WorkoutDetailsFragment();
        this.v.b(this.ao.b(this.t.getResources().getString(R.string.IDS_workout_name)), this.au, true);
        if (!this.aa) {
            xfz xfzVarB = this.ao.b(this.t.getResources().getString(R.string.IDS_diet_name));
            DietDetailsFragment dietDetailsFragmentA = DietDetailsFragment.a();
            this.e = dietDetailsFragmentA;
            this.v.b(xfzVarB, dietDetailsFragmentA, false);
            this.e.b(this);
        } else {
            xfz xfzVarB2 = this.ao.b(this.t.getResources().getString(R.string.IDS_health_model_diet));
            DietRecordFragment dietRecordFragmentA = DietRecordFragment.a();
            this.y = dietRecordFragmentA;
            this.v.b(xfzVarB2, dietRecordFragmentA, false);
            this.y.d(this);
        }
        this.ap.setOffscreenPageLimit(this.ao.getSubTabCount());
    }

    public void j() {
        qpn qpnVar = this.v;
        if (qpnVar == null) {
            LogUtil.j("Suggestion_AiPlanWeekDetailViewHolder", "removeSubTabsOnPlanFinish mFitnessTabsAdapter is null");
            return;
        }
        for (int count = qpnVar.getCount() - 1; count >= 0; count--) {
            this.v.b(count);
        }
        this.v.notifyDataSetChanged();
    }

    public void a(final List<hdc> list, final int i, final String str) {
        final hcz hczVar = new hcz();
        String strValueOf = String.valueOf(1000);
        vfy vfyVar = this.aw;
        if (vfyVar != null) {
            strValueOf = String.valueOf(Math.min(Math.max(1000, Math.round(vfyVar.e())), 10000));
        }
        LogUtil.d("Suggestion_AiPlanWeekDetailViewHolder", "mEnergy", strValueOf);
        hczVar.c(strValueOf);
        if (qsr.c().i()) {
            hczVar.e(hvv.b());
        } else {
            hczVar.e("1");
        }
        hczVar.a(this.aw);
        LogUtil.a("Suggestion_AiPlanWeekDetailViewHolder", "getRecommendFoods time recipesDate" + str);
        new hdp().getFoodRecommendDetail(this.an.getPlanId(), str, hczVar, new UiCallback<hdh>() { // from class: com.huawei.health.suggestion.ui.plan.viewholder.AiPlanWeekDetailViewHolder.9
            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            public void onFailure(int i2, String str2) {
                LogUtil.j("Suggestion_AiPlanWeekDetailViewHolder", "errorCode:" + i2 + MyLocationStyle.ERROR_INFO + str2);
            }

            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onSuccess(hdh hdhVar) {
                hdf hdfVarD;
                LogUtil.a("Suggestion_AiPlanWeekDetailViewHolder", "getRecommendFoodOnReplacement response ", HiJsonUtil.d(hdhVar));
                if (hdhVar == null || (hdfVarD = hdhVar.d()) == null) {
                    return;
                }
                int i2 = i;
                if (i2 == 0) {
                    hdfVarD.d(list);
                } else if (i2 == 1) {
                    hdfVarD.b(list);
                } else if (i2 == 2) {
                    hdfVarD.a(list);
                }
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                AiPlanWeekDetailViewHolder.this.c(0, hdfVarD.c(), arrayList, arrayList2);
                AiPlanWeekDetailViewHolder.this.c(1, hdfVarD.a(), arrayList, arrayList2);
                AiPlanWeekDetailViewHolder.this.c(2, hdfVarD.b(), arrayList, arrayList2);
                AiPlanWeekDetailViewHolder.this.d(hdfVarD, str, hczVar, i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(hdf hdfVar, String str, hcz hczVar, int i) {
        hdp hdpVar = new hdp();
        hde hdeVar = new hde();
        hdeVar.a(this.an.getPlanId());
        hdeVar.a(hczVar);
        hdeVar.a(i + 1);
        hdeVar.b(2);
        hdeVar.b(str);
        hdeVar.d(hdfVar);
        hdpVar.saveReplaceFood(hdeVar, new AnonymousClass8());
    }

    /* JADX INFO: renamed from: com.huawei.health.suggestion.ui.plan.viewholder.AiPlanWeekDetailViewHolder$8, reason: invalid class name */
    public class AnonymousClass8 extends UiCallback<String> {
        AnonymousClass8() {
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public void onFailure(int i, String str) {
            LogUtil.e("Suggestion_AiPlanWeekDetailViewHolder", "saveReplaceFood errorCode:", Integer.valueOf(i), CloudParamKeys.INFO, str);
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(String str) {
            LogUtil.a("Suggestion_AiPlanWeekDetailViewHolder", "saveReplaceFood onSuccess:" + str);
            AiPlanWeekDetailViewHolder.this.f9739b.post(new Runnable() { // from class: hxz
                @Override // java.lang.Runnable
                public final void run() {
                    this.f37320b.b();
                }
            });
        }

        public /* synthetic */ void b() {
            AiPlanWeekDetailViewHolder.this.b(true, true);
        }
    }
}
