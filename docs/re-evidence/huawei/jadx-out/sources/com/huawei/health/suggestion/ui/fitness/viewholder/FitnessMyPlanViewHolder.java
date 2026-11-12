package com.huawei.health.suggestion.ui.fitness.viewholder;

import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.basefitnessadvice.model.Plan;
import com.huawei.basefitnessadvice.model.intplan.IntPlan;
import com.huawei.haf.router.AppRouter;
import com.huawei.health.suggestion.FitnessExternalUtils;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.model.fitness.FitnessMyPlanUseCase;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnessadvice.FitnessPackageInfo;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.subheader.HealthSubHeader;
import defpackage.lmf;
import defpackage.njy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes31.dex */
public class FitnessMyPlanViewHolder extends AbsFitnessViewHolder<FitnessMyPlanUseCase> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<IntPlan> f9487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HealthSubHeader f9488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<FitnessPackageInfo> f9489c;
    private RecyclerView.Adapter d;
    private final HealthRecycleView e;
    private int g;
    private List<Plan> h;
    private final HealthRecycleView i;
    private RecyclerView.Adapter j;

    @Override // com.huawei.health.suggestion.ui.fitness.viewholder.AbsFitnessViewHolder
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void init(FitnessMyPlanUseCase fitnessMyPlanUseCase) {
        if (fitnessMyPlanUseCase == null) {
            LogUtil.j("Suggestion_FitnessMyPlanViewHolder", "FitnessMyPlanViewHolder init FitnessMyPlanUseCase null");
            return;
        }
        e();
        d();
        a(fitnessMyPlanUseCase);
        c(fitnessMyPlanUseCase);
        d(fitnessMyPlanUseCase);
    }

    private void a(FitnessMyPlanUseCase fitnessMyPlanUseCase) {
        if (FitnessExternalUtils.b()) {
            if (fitnessMyPlanUseCase.getIntPlan() != null && (fitnessMyPlanUseCase.getIntPlan().getPlanType() == IntPlan.PlanType.AI_FITNESS_PLAN || fitnessMyPlanUseCase.getIntPlan().getPlanType() == IntPlan.PlanType.FIT_PLAN)) {
                this.e.setVisibility(0);
                this.i.setVisibility(8);
                return;
            } else {
                this.e.setVisibility(8);
                this.i.setVisibility(0);
                return;
            }
        }
        if (njy.e(fitnessMyPlanUseCase.getPlanList())) {
            this.e.setVisibility(8);
            this.i.setVisibility(0);
        } else {
            this.e.setVisibility(0);
            this.i.setVisibility(8);
        }
    }

    private void d() {
        this.f9488b.setMoreViewClickListener(new View.OnClickListener() { // from class: hnl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.a(view);
            }
        });
    }

    public /* synthetic */ void a(View view) {
        if (isFastClick()) {
            LogUtil.j("Suggestion_FitnessMyPlanViewHolder", "FitnessMyPlanViewHolder is fast click");
            return;
        }
        HashMap map = new HashMap(2);
        map.put("entrance", this.itemView.getContext().getString(R.string.IDS_header_fitness_plan));
        map.put("position", 6);
        lmf.d().c(this.itemView.getContext(), "1130015", map, 0);
        map.clear();
        map.put("click", 1);
        map.put("type", 3);
        lmf.d().c(this.itemView.getContext(), AnalyticsValue.INT_PLAN_2030075.value(), map, 0);
        Bundle bundle = new Bundle();
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(Integer.valueOf(IntPlan.PlanType.AI_RUN_PLAN.getType()));
        bundle.putIntegerArrayList("FILTERED_PLAN_TYPES", arrayList);
        bundle.putString("CUSTOM_TITLE", this.itemView.getContext().getString(R.string.IDS_header_fitness_plan));
        AppRouter.c("/PluginFitnessAdvice/PlanListActivity").d(bundle).b(view.getContext());
    }

    private void d(FitnessMyPlanUseCase fitnessMyPlanUseCase) {
        if (fitnessMyPlanUseCase == null || (njy.e(fitnessMyPlanUseCase.getPlanList()) && fitnessMyPlanUseCase.getIntPlan() == null)) {
            LogUtil.j("Suggestion_FitnessMyPlanViewHolder", "bindMyPlanView FitnessMyPlanUseCase null");
            return;
        }
        if (njy.b(fitnessMyPlanUseCase.getPlanList())) {
            this.h.clear();
            this.h.add(fitnessMyPlanUseCase.getPlanList().get(0));
        }
        if (fitnessMyPlanUseCase.getIntPlan() != null) {
            this.f9487a.clear();
            this.f9487a.add(fitnessMyPlanUseCase.getIntPlan());
        }
        this.d.notifyDataSetChanged();
    }

    private void c(FitnessMyPlanUseCase fitnessMyPlanUseCase) {
        if (fitnessMyPlanUseCase == null || njy.e(fitnessMyPlanUseCase.getFitnessPackageInfoList())) {
            LogUtil.j("Suggestion_FitnessMyPlanViewHolder", "bindRecommendedPlanView FitnessMyPlanUseCase null");
            return;
        }
        List<FitnessPackageInfo> fitnessPackageInfoList = fitnessMyPlanUseCase.getFitnessPackageInfoList();
        if (njy.b(fitnessPackageInfoList)) {
            if (fitnessPackageInfoList.size() > this.g) {
                this.f9489c.clear();
                this.f9489c.addAll(fitnessPackageInfoList.subList(0, this.g));
            } else {
                this.f9489c.clear();
                this.f9489c.addAll(fitnessPackageInfoList);
            }
        }
        this.j.notifyDataSetChanged();
    }

    private void e() {
        setRecyclerViewLayout(this.itemView.getContext(), this.e);
        this.e.setAdapter(this.d);
        setRecyclerViewLayout(this.itemView.getContext(), this.i);
        this.i.setAdapter(this.j);
    }
}
