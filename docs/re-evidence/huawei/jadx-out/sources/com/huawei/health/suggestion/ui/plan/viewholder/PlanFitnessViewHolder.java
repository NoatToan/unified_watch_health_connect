package com.huawei.health.suggestion.ui.plan.viewholder;

import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.ui.fitness.viewholder.AbsFitnessViewHolder;
import com.huawei.health.suggestion.ui.run.adapter.PlanInfoAdapter;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnessadvice.FitnessPackageInfo;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.subheader.HealthSubHeader;
import defpackage.ien;
import defpackage.njy;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class PlanFitnessViewHolder extends AbsFitnessViewHolder<List<FitnessPackageInfo>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f9772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<FitnessPackageInfo> f9773b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthSubHeader f9774c;
    private PlanInfoAdapter d;
    private RelativeLayout e;
    private HealthRecycleView i;

    public PlanFitnessViewHolder(View view) {
        super(view);
        this.f9773b = new ArrayList();
        this.f9772a = view.getContext();
        HealthRecycleView healthRecycleView = (HealthRecycleView) view.findViewById(R.id.sug_plans_rcy);
        this.i = healthRecycleView;
        ien.b(this.f9772a, healthRecycleView, false);
        this.e = (RelativeLayout) view.findViewById(R.id.sug_plans_layout);
        this.f9774c = (HealthSubHeader) view.findViewById(R.id.plans_title);
    }

    @Override // com.huawei.health.suggestion.ui.fitness.viewholder.AbsFitnessViewHolder
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void init(List<FitnessPackageInfo> list) {
        if (njy.b(list)) {
            this.f9774c.setHeadTitleText(this.f9772a.getResources().getString(R.string.IDS_header_fitness_plan));
            this.f9774c.setVisibility(0);
            this.e.setVisibility(0);
            this.f9774c.setMoreLayoutVisibility(8);
            for (FitnessPackageInfo fitnessPackageInfo : list) {
                if (fitnessPackageInfo != null && !this.f9773b.contains(fitnessPackageInfo)) {
                    this.f9773b.add(fitnessPackageInfo);
                }
            }
            PlanInfoAdapter planInfoAdapter = new PlanInfoAdapter(this.f9773b, 3, this.f9772a);
            this.d = planInfoAdapter;
            this.i.setAdapter(planInfoAdapter);
            return;
        }
        LogUtil.j("Suggestion_PlanFitnessViewHolder", "PlanFitnessViewHolder init FitnessMyPlanUseCase null");
        this.e.setVisibility(8);
        this.f9774c.setVisibility(8);
    }
}
