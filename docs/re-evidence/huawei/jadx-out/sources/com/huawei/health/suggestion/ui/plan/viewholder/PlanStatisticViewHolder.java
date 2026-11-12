package com.huawei.health.suggestion.ui.plan.viewholder;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.huawei.health.plan.model.PlanStatistics;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.ui.fitness.viewholder.AbsFitnessViewHolder;
import com.huawei.health.suggestion.util.JumpUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.cardview.HealthCardView;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.subheader.HealthSubHeader;
import defpackage.gzw;
import defpackage.gzx;
import defpackage.idy;
import defpackage.ped;
import defpackage.qqz;
import defpackage.qrs;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes9.dex */
public class PlanStatisticViewHolder extends AbsFitnessViewHolder<PlanStatistics> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static float f9783a = 17.4f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static float f9784b = 20.3f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f9785c = 1;
    private static int d = 9;
    private static float e = 40.5f;
    private static int i = 27;
    private HealthCardView f;
    private HealthTextView g;
    private HealthTextView h;
    private Context j;
    private HealthTextView k;
    private HealthTextView l;
    private HealthTextView m;
    private HealthTextView n;
    private LinearLayout o;
    private HealthTextView p;
    private HealthSubHeader q;
    private HealthTextView r;
    private HealthTextView s;
    private String t;
    private HealthTextView u;
    private HealthTextView v;
    private HealthTextView x;
    private RelativeLayout y;

    public PlanStatisticViewHolder(View view) {
        super(view);
        this.j = view.getContext();
        this.q = (HealthSubHeader) view.findViewById(R.id.plan_statistic_layout_title);
        this.o = (LinearLayout) view.findViewById(R.id.sug_plan_statistic_layout);
        this.r = (HealthTextView) view.findViewById(R.id.tv_plan_total_statistic);
        this.s = (HealthTextView) view.findViewById(R.id.tv_plan_total_statistic_unit);
        HealthTextView healthTextView = (HealthTextView) view.findViewById(R.id.tv_plan_total_history);
        this.m = healthTextView;
        healthTextView.setVisibility(qrs.af(this.j) ? 0 : 8);
        if (LanguageUtil.ba(this.j)) {
            ImageView imageView = (ImageView) view.findViewById(R.id.img_plan_total_history_arrow);
            BitmapDrawable bitmapDrawableE = qqz.e(this.j, R.drawable.ic_arrows_right);
            bitmapDrawableE.setBounds(0, 0, bitmapDrawableE.getMinimumWidth(), bitmapDrawableE.getMinimumHeight());
            imageView.setImageDrawable(bitmapDrawableE);
        }
        this.y = (RelativeLayout) view.findViewById(R.id.sug_plan_statistic_time_layout);
        this.u = (HealthTextView) view.findViewById(R.id.sug_fragment_plan_statistic_time);
        this.p = (HealthTextView) view.findViewById(R.id.sug_fragment_plan_statistic_calories);
        this.x = (HealthTextView) view.findViewById(R.id.sug_fragment_plan_statistic_num);
        this.v = (HealthTextView) view.findViewById(R.id.tv_plan_total_num_unit);
        this.q.setMoreLayoutVisibility(8);
        this.q.setBackgroundColor(this.j.getResources().getColor(R.color.common_transparent));
        this.g = (HealthTextView) view.findViewById(R.id.duration_item);
        this.h = (HealthTextView) view.findViewById(R.id.calories_item);
        this.n = (HealthTextView) view.findViewById(R.id.plans_item);
        this.l = (HealthTextView) view.findViewById(R.id.tv_plan_total_time_unit);
        this.k = (HealthTextView) view.findViewById(R.id.tv_plan_total_calories_unit);
        this.f = (HealthCardView) view.findViewById(R.id.recycle_item);
        e();
        this.o.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.plan.viewholder.PlanStatisticViewHolder.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                if (!qrs.r()) {
                    JumpUtil.e(PlanStatisticViewHolder.this.j, 2);
                    HashMap map = new HashMap();
                    map.put("click", "1");
                    idy.b("1120015", map);
                    return;
                }
                LogUtil.e("Suggestion_PlanStatisticViewHolder", "mStatisticLayout click too fast");
            }
        });
    }

    private void e() {
        if (qrs.y()) {
            this.r.setTextSize(1, e);
            this.s.setTextSize(1, f9784b);
            this.m.setTextSize(1, f9784b);
            this.g.setTextSize(1, f9783a);
            this.h.setTextSize(1, f9783a);
            this.n.setTextSize(1, f9783a);
            this.u.setTextSize(1, i);
            this.p.setTextSize(1, i);
            this.x.setTextSize(1, i);
            this.l.setTextSize(1, f9783a);
            this.k.setTextSize(1, f9783a);
            this.v.setTextSize(1, f9783a);
            if (this.f.getLayoutParams() instanceof LinearLayout.LayoutParams) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f.getLayoutParams();
                layoutParams.height = -2;
                layoutParams.width = -1;
                this.f.setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        b();
    }

    private void b() {
        this.g.setAutoTextInfo(d, f9785c, 2);
        this.h.setAutoTextInfo(d, f9785c, 2);
        this.g.setAutoTextInfo(d, f9785c, 2);
        this.n.setAutoTextInfo(d, f9785c, 2);
        this.u.setAutoTextInfo(d, f9785c, 2);
        this.p.setAutoTextInfo(d, f9785c, 2);
        this.x.setAutoTextInfo(d, f9785c, 2);
        this.l.setAutoTextInfo(d, f9785c, 2);
        this.k.setAutoTextInfo(d, f9785c, 2);
        this.v.setAutoTextInfo(d, f9785c, 2);
    }

    @Override // com.huawei.health.suggestion.ui.fitness.viewholder.AbsFitnessViewHolder
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void init(PlanStatistics planStatistics) {
        if (planStatistics == null) {
            LogUtil.j("Suggestion_PlanStatisticViewHolder", "PlanStatisticViewHolder data = null");
            return;
        }
        if (planStatistics.acquireType() == 2) {
            this.y.setVisibility(0);
            this.m.setText(this.j.getResources().getString(R.string.IDS_fitness_total_run_distance));
            b(planStatistics);
        } else {
            this.y.setVisibility(8);
            this.m.setText(this.j.getResources().getString(R.string.sug_total_duration));
            a(planStatistics);
        }
    }

    private void b(PlanStatistics planStatistics) {
        if (planStatistics.acquireTotalPlan() == 0) {
            return;
        }
        double totalDistance = planStatistics.getTotalDistance() / 1000.0d;
        if (UnitUtil.f()) {
            totalDistance = UnitUtil.e(totalDistance, 3);
        }
        this.r.setText(UnitUtil.e(totalDistance, 1, 2));
        this.p.setText(ped.f(ped.b(planStatistics.acquireCalorie())));
        this.x.setText(UnitUtil.e(planStatistics.acquireTotalPlan(), 1, 0));
        this.u.setText(ped.i(planStatistics.acquireDuration()));
        this.l.setText(gzx.d(R.plurals.IDS_plugin_fitnessadvice_min, (int) (planStatistics.acquireDuration() / 60000), ""));
        this.s.setText(gzx.d(gzw.a(), (int) totalDistance, ""));
        this.v.setText(gzx.d(R.plurals.sug_fitness_actions, planStatistics.acquireTotalPlan(), ""));
        this.k.setText(gzx.d(R.plurals.sug_chart_kcals, (int) ped.b(planStatistics.acquireCalorie()), ""));
    }

    private void a(PlanStatistics planStatistics) {
        String strI = ped.i(planStatistics.acquireDuration());
        int iAcquireTotalPlan = planStatistics.acquireTotalPlan();
        this.r.setText(strI);
        String strF = ped.f(ped.b(planStatistics.acquireCalorie()));
        this.t = strF;
        this.p.setText(strF);
        this.x.setText(String.valueOf(iAcquireTotalPlan));
        this.s.setText(this.j.getResources().getString(R.string.IDS_min));
        this.v.setText(String.format(Locale.ENGLISH, this.j.getResources().getString(R.string.sug_fitness_actions), ""));
    }
}
