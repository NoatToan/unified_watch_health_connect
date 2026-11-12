package com.huawei.health.suggestion.ui.plan.viewholder;

import android.content.Context;
import android.view.View;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.ui.fitness.viewholder.AbsFitnessViewHolder;
import com.huawei.health.suggestion.ui.plan.adapter.PlanClassifyAdapter;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.recycleview.HealthLinearLayoutManager;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import defpackage.njy;
import defpackage.pdl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class PlanRunViewHolder extends AbsFitnessViewHolder<List<pdl>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthRecycleView f9780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f9781b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<pdl> f9782c;
    private PlanClassifyAdapter e;

    public PlanRunViewHolder(View view) {
        super(view);
        this.f9782c = new ArrayList();
        this.f9781b = view.getContext();
        HealthRecycleView healthRecycleView = (HealthRecycleView) view.findViewById(R.id.my_recommend_fitness_view);
        this.f9780a = healthRecycleView;
        healthRecycleView.setLayoutManager(new HealthLinearLayoutManager(this.f9781b));
    }

    @Override // com.huawei.health.suggestion.ui.fitness.viewholder.AbsFitnessViewHolder
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void init(List<pdl> list) {
        if (njy.b(list)) {
            LogUtil.a("Suggestion_PlanRunViewHolder", "PlanRunViewHolder data：", Integer.valueOf(list.size()));
            for (pdl pdlVar : list) {
                if (pdlVar != null && !this.f9782c.contains(pdlVar)) {
                    this.f9782c.add(pdlVar);
                }
            }
            Collections.sort(this.f9782c, new Comparator<pdl>() { // from class: com.huawei.health.suggestion.ui.plan.viewholder.PlanRunViewHolder.5
                @Override // java.util.Comparator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public int compare(pdl pdlVar2, pdl pdlVar3) {
                    return Integer.compare(pdlVar3.b(), pdlVar2.b());
                }
            });
            PlanClassifyAdapter planClassifyAdapter = new PlanClassifyAdapter(this.f9782c, this.f9781b);
            this.e = planClassifyAdapter;
            this.f9780a.setAdapter(planClassifyAdapter);
            this.f9780a.setVisibility(0);
            return;
        }
        LogUtil.j("Suggestion_PlanRunViewHolder", "PlanRunViewHolder init RunPlanInfo null");
        this.f9780a.setVisibility(8);
    }
}
