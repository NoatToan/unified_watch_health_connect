package com.huawei.health.suggestion.ui.plan.viewholder;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.huawei.basefitnessadvice.model.intplan.IntAction;
import com.huawei.basefitnessadvice.model.intplan.IntDayPlan;
import com.huawei.basefitnessadvice.model.intplan.IntPlan;
import com.huawei.basefitnessadvice.model.intplan.IntWeekPlan;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.ui.fitness.viewholder.AbsFitnessViewHolder;
import com.huawei.health.suggestion.util.JumpUtil;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.calendarview.HealthCalendar;
import com.huawei.ui.commonui.calendarview.HealthCalendarView;
import com.huawei.ui.commonui.calendarview.HealthMark;
import com.huawei.ui.commonui.cardview.HealthCardView;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.btw;
import defpackage.hvu;
import defpackage.hvv;
import defpackage.hwx;
import defpackage.ift;
import defpackage.qqz;
import defpackage.qrs;
import health.compact.a.LanguageUtil;
import java.util.Calendar;
import java.util.HashMap;

/* JADX INFO: loaded from: classes9.dex */
public class IntPlanWeekDetailViewHolder extends AbsFitnessViewHolder<IntPlan> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ConstraintLayout f9762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthCalendarView f9763b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f9764c;
    private int d;
    private Context e;
    private int f;
    private int g;
    private hwx h;
    private HealthTextView i;
    private HealthButton j;
    private IntPlan k;
    private LinearLayout l;
    private HealthCardView m;
    private LinearLayout n;
    private int o;
    private HealthTextView p;
    private HealthTextView q;
    private int r;
    private int s;
    private LinearLayout t;
    private int w;
    private int x;

    public IntPlanWeekDetailViewHolder(View view) {
        super(view);
        this.r = 1;
        this.x = -1;
        this.w = -1;
        this.o = -1;
        this.e = view.getContext();
        d(view);
    }

    private void d(View view) {
        this.t = (LinearLayout) view.findViewById(R.id.view_pager_layout);
        this.l = (LinearLayout) view.findViewById(R.id.week_pre);
        this.n = (LinearLayout) view.findViewById(R.id.week_next);
        this.q = (HealthTextView) view.findViewById(R.id.week_number);
        this.i = (HealthTextView) view.findViewById(R.id.level_name);
        HealthCalendarView healthCalendarView = (HealthCalendarView) view.findViewById(R.id.week_calendarView);
        this.f9763b = healthCalendarView;
        healthCalendarView.a(true);
        this.f9763b.setWeekViewScrollable(false);
        this.f9763b.setModeOnlyWeekView();
        if (LanguageUtil.ba(this.e)) {
            ((ImageView) view.findViewById(R.id.arrow_left)).setImageDrawable(qqz.e(this.e, R.drawable.common_ui_arrow_left));
            ((ImageView) view.findViewById(R.id.arrow_right)).setImageResource(R.drawable.common_ui_arrow_left);
        }
        this.m = (HealthCardView) view.findViewById(R.id.member_expiration_card);
        this.p = (HealthTextView) view.findViewById(R.id.remind_follow_the_plan);
        HealthButton healthButton = (HealthButton) this.itemView.findViewById(R.id.immedate_renewal);
        this.j = healthButton;
        healthButton.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.plan.viewholder.IntPlanWeekDetailViewHolder.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                if (view2.getId() == R.id.immedate_renewal) {
                    JumpUtil.f(IntPlanWeekDetailViewHolder.this.e);
                }
            }
        });
        view.findViewById(R.id.fitness_sub_tab_layout).setVisibility(8);
        b(view);
        LogUtil.a("Suggestion_PlanWeekDetailViewHolder", "init viewHolder !!!");
        j();
    }

    private void b(View view) {
        this.f9762a = (ConstraintLayout) view.findViewById(R.id.circle_constraintLayout);
    }

    private void j() {
        this.l.setClickable(true);
        this.n.setClickable(true);
        this.l.setOnClickListener(new View.OnClickListener() { // from class: hyk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f37331a.c(view);
            }
        });
        this.n.setOnClickListener(new View.OnClickListener() { // from class: hyj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f37330b.e(view);
            }
        });
    }

    public /* synthetic */ void c(View view) {
        b();
    }

    public /* synthetic */ void e(View view) {
        a();
    }

    @Override // com.huawei.health.suggestion.ui.fitness.viewholder.AbsFitnessViewHolder
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void d(IntPlan intPlan) {
        if (intPlan != this.k) {
            this.k = intPlan;
            this.f9763b.c(false);
            this.s = intPlan.getMetaInfo().getWeekCount();
            i();
            f();
            e();
            this.f9762a.setVisibility(8);
            this.h = new hwx(this.e, this.t);
        }
        i();
        o();
        h();
        n();
        if (hvu.r(intPlan)) {
            this.m.setVisibility(0);
            this.t.setVisibility(8);
        } else {
            this.m.setVisibility(8);
            this.t.setVisibility(0);
            c();
        }
    }

    public void c() {
        this.h.a(this.k);
        g();
    }

    private void i() {
        LogUtil.a("Suggestion_PlanWeekDetailViewHolder", "startTime=", Long.valueOf(this.k.getPlanTimeInfo().getBeginDate() * 1000), "  currentTime=", Long.valueOf(System.currentTimeMillis()));
        int iH = btw.h(this.k);
        this.g = iH;
        if (iH > 0) {
            iH = 1;
        }
        this.o = iH;
        int iB = ift.b(Calendar.getInstance().get(7));
        this.f = iB;
        LogUtil.a("Suggestion_PlanWeekDetailViewHolder", "mCurrentWeekOrder=", Integer.valueOf(this.g), "  mCurrentDayOrder=", Integer.valueOf(iB));
    }

    private void f() {
        this.f9764c = this.g;
        n();
        int iB = ift.b(Calendar.getInstance().get(7));
        this.d = iB;
        LogUtil.a("Suggestion_PlanWeekDetailViewHolder", "mCalenderWeekIndex=", Integer.valueOf(this.f9764c), "  mCalenderDayIndex=", Integer.valueOf(iB));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        if (!hvv.c(this.k, this.f9764c, this.d)) {
            this.h.f();
            if (this.f9764c <= this.o) {
                this.h.i();
                return;
            }
            return;
        }
        this.p.setVisibility(8);
        int i = this.f9764c;
        int i2 = this.g;
        if (i < i2) {
            this.r = 0;
        } else if (i > i2) {
            this.r = 3;
            if (this.k.getPlanType() == IntPlan.PlanType.AI_RUN_PLAN) {
                this.p.setVisibility(0);
                this.p.setText(R.string.IDS_plugin_adjust_schedule);
            } else {
                this.p.setVisibility(8);
            }
        } else {
            Calendar calendar = Calendar.getInstance();
            int iB = ift.b(calendar.get(7));
            calendar.setTimeInMillis(this.k.getPlanTimeInfo().getBeginDate() * 1000);
            int iB2 = ift.b(calendar.get(7));
            LogUtil.a("Suggestion_PlanWeekDetailViewHolder", "startDay=", Integer.valueOf(iB2), "currentDay= ", Integer.valueOf(iB));
            if (this.g == 1 && iB2 > iB) {
                this.r = 3;
            } else {
                this.r = 1;
            }
            m();
        }
        if (this.k.getPlanType().equals(IntPlan.PlanType.FIT_PLAN)) {
            this.r = 1;
        }
        this.h.e(this.r);
        this.h.c(this.f9764c, this.d, (AiPlanWeekDetailViewHolder) null, 0);
    }

    private void m() {
        hvv.a(this.k, this.f9764c, this.d, new IBaseResponseCallback() { // from class: hyi
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.f37329c.b(i, obj);
            }
        });
    }

    public /* synthetic */ void b(int i, Object obj) {
        if ((obj instanceof Boolean) && ((Boolean) obj).booleanValue()) {
            HandlerExecutor.b(new Runnable() { // from class: hyp
                @Override // java.lang.Runnable
                public final void run() {
                    this.f37336b.d();
                }
            });
        }
    }

    public /* synthetic */ void d() {
        this.p.setText(R.string.IDS_plugin_follow_plan);
        this.p.setVisibility(0);
    }

    private void e() {
        this.f9763b.setOnCalendarSelectListener(new HealthCalendarView.OnCalendarSelectListener() { // from class: com.huawei.health.suggestion.ui.plan.viewholder.IntPlanWeekDetailViewHolder.3
            @Override // com.huawei.ui.commonui.calendarview.HealthCalendarView.OnCalendarSelectListener
            public void onCalendarOutOfRange(HealthCalendar healthCalendar) {
            }

            @Override // com.huawei.ui.commonui.calendarview.HealthCalendarView.OnCalendarSelectListener
            public void onCalendarSelect(HealthCalendar healthCalendar, boolean z) {
                int week = healthCalendar.getWeek();
                IntPlanWeekDetailViewHolder.this.d = ift.b(week);
                if (week != IntPlanWeekDetailViewHolder.this.x || IntPlanWeekDetailViewHolder.this.d != IntPlanWeekDetailViewHolder.this.w) {
                    IntPlanWeekDetailViewHolder.this.x = week;
                    IntPlanWeekDetailViewHolder intPlanWeekDetailViewHolder = IntPlanWeekDetailViewHolder.this;
                    intPlanWeekDetailViewHolder.w = intPlanWeekDetailViewHolder.d;
                    LogUtil.a("Suggestion_PlanWeekDetailViewHolder", "onCalendarSelect calenderDayIndex ", Integer.valueOf(IntPlanWeekDetailViewHolder.this.d), " calenderWeekIndex", Integer.valueOf(IntPlanWeekDetailViewHolder.this.f9764c));
                    if (!hvu.r(IntPlanWeekDetailViewHolder.this.k)) {
                        IntPlanWeekDetailViewHolder.this.g();
                    }
                    LogUtil.a("Suggestion_PlanWeekDetailViewHolder", "onCalendarSelect end");
                    return;
                }
                LogUtil.a("Suggestion_PlanWeekDetailViewHolder", "onCalendarSelect repeat");
            }
        });
    }

    private void o() {
        if (this.f9764c > 0) {
            Resources resources = this.e.getResources();
            int i = R.plurals.IDS_fitness_plan_week;
            int i2 = this.s;
            this.q.setText(this.e.getResources().getString(R.string.IDS_fitness_plan_week_index, Integer.valueOf(this.f9764c), resources.getQuantityString(i, i2, Integer.valueOf(i2))));
        } else {
            this.q.setText(this.e.getResources().getString(R.string.IDS_fitness_plan_before_week_count, Integer.valueOf(1 - this.f9764c)));
        }
        IntWeekPlan weekInfoByOrder = this.k.getWeekInfoByOrder(this.f9764c);
        if (weekInfoByOrder != null) {
            this.i.setText(weekInfoByOrder.getWeekPeriod());
        } else {
            this.i.setText("");
        }
    }

    private void h() {
        this.f9763b.b();
        HashMap map = new HashMap();
        for (int i = 0; i < this.k.getMetaInfo().getWeekCount(); i++) {
            IntWeekPlan weekInfoByIdx = this.k.getWeekInfoByIdx(i);
            if (weekInfoByIdx == null) {
                LogUtil.a("Suggestion_PlanWeekDetailViewHolder", "weekInfo is null");
            } else {
                for (int i2 = 0; i2 < weekInfoByIdx.getDayCount(); i2++) {
                    IntDayPlan dayByIdx = weekInfoByIdx.getDayByIdx(i2);
                    if (dayByIdx != null && (hvv.d(dayByIdx, IntAction.ActionType.WORKOUT) || hvv.d(dayByIdx, IntAction.ActionType.RUN))) {
                        Calendar calendar = Calendar.getInstance();
                        calendar.setTimeInMillis(ift.a(this.k.getPlanTimeInfo().getBeginDate() * 1000, weekInfoByIdx.getWeekOrder() - 1, dayByIdx.getDayOrder()));
                        int i3 = calendar.get(1);
                        int i4 = calendar.get(2) + 1;
                        int i5 = calendar.get(5);
                        HealthCalendar healthCalendarB = b(i3, i4, i5);
                        HealthMark healthMark = new HealthMark(HealthMark.MarkType.COLOR);
                        healthMark.b(this.e.getResources().getColor(R.color.calender_day_background));
                        healthCalendarB.addMark(healthMark);
                        if (dayByIdx.getPunchFlag() == 1) {
                            HealthMark healthMark2 = new HealthMark(HealthMark.MarkType.DRAWABLE);
                            healthMark2.e(this.e.getDrawable(R.drawable.calendar_select));
                            healthMark2.a(qrs.d(this.e, 7.0f));
                            healthCalendarB.addMark(healthMark2);
                            LogUtil.a("Suggestion_PlanWeekDetailViewHolder", "mark checkIn month ", Integer.valueOf(i4), " day ", Integer.valueOf(i5));
                        }
                        map.put(healthCalendarB.toString(), healthCalendarB);
                    }
                }
            }
        }
        this.f9763b.e(map);
    }

    private HealthCalendar b(int i, int i2, int i3) {
        HealthCalendar healthCalendar = new HealthCalendar();
        healthCalendar.setYear(i);
        healthCalendar.setMonth(i2);
        healthCalendar.setDay(i3);
        return healthCalendar;
    }

    private void n() {
        if (this.f9764c <= this.o) {
            this.l.setVisibility(4);
        } else {
            this.l.setVisibility(0);
        }
        if (this.f9764c >= this.s) {
            this.n.setVisibility(4);
        } else {
            this.n.setVisibility(0);
        }
    }

    private void e(int i) {
        n();
        o();
        Calendar calendar = Calendar.getInstance();
        long beginDate = this.k.getPlanTimeInfo().getBeginDate();
        int i2 = this.f9764c;
        if (i2 == this.g) {
            i = this.f;
        }
        calendar.setTimeInMillis(ift.a(beginDate * 1000, i2 - 1, i));
        int i3 = calendar.get(1);
        int i4 = calendar.get(2);
        int i5 = calendar.get(5);
        this.f9763b.c(b(i3, i4 + 1, i5), true, true);
        g();
        LogUtil.a("Suggestion_PlanWeekDetailViewHolder", "handlePreviousWeekClick day:", Integer.valueOf(i5));
    }

    private void b() {
        this.f9764c--;
        e(7);
    }

    private void a() {
        this.f9764c++;
        e(1);
    }
}
