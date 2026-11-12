package com.huawei.health.suggestion.ui.plan.viewholder;

import android.content.Context;
import android.view.View;
import com.huawei.basefitnessadvice.model.Plan;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.ui.fitness.viewholder.AbsFitnessViewHolder;
import com.huawei.health.suggestion.ui.run.adapter.MyPlanInfoAdapter;
import com.huawei.health.suggestion.ui.run.adapter.RunPlanningAdapter;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.subheader.HealthSubHeader;
import defpackage.ien;
import defpackage.njy;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class MyAiPlanViewHolder extends AbsFitnessViewHolder<Plan> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthSubHeader f9765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f9766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<Plan> f9767c;
    private HealthRecycleView d;
    private MyPlanInfoAdapter e;
    private RunPlanningAdapter j;

    public MyAiPlanViewHolder(View view) {
        super(view);
        this.f9767c = new ArrayList();
        this.f9766b = view.getContext();
        HealthRecycleView healthRecycleView = (HealthRecycleView) view.findViewById(R.id.sug_plans_rcy);
        this.d = healthRecycleView;
        ien.b(this.f9766b, healthRecycleView, false);
        HealthSubHeader healthSubHeader = (HealthSubHeader) view.findViewById(R.id.plans_title);
        this.f9765a = healthSubHeader;
        healthSubHeader.setMoreLayoutVisibility(8);
        this.f9765a.setVisibility(8);
    }

    @Override // com.huawei.health.suggestion.ui.fitness.viewholder.AbsFitnessViewHolder
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void init(Plan plan) {
        if (plan == null) {
            LogUtil.j("Suggestion_MyAiPlanViewHolder", "FitnessMyPlanViewHolder data is null");
            return;
        }
        this.f9767c.clear();
        this.f9767c.add(plan);
        if (njy.b(this.f9767c) && this.f9767c.get(0).acquireType() == 0) {
            RunPlanningAdapter runPlanningAdapter = new RunPlanningAdapter(this.f9766b, this.f9767c);
            this.j = runPlanningAdapter;
            this.d.setAdapter(runPlanningAdapter);
        } else {
            MyPlanInfoAdapter myPlanInfoAdapter = new MyPlanInfoAdapter(this.f9767c, this.f9766b);
            this.e = myPlanInfoAdapter;
            this.d.setAdapter(myPlanInfoAdapter);
        }
    }
}
