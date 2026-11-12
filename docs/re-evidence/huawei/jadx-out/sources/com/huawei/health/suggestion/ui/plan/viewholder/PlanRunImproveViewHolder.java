package com.huawei.health.suggestion.ui.plan.viewholder;

import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.ui.run.adapter.PlanInfoAdapter;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.subheader.HealthSubHeader;
import com.huawei.ui.commonui.utils.versioncontrol.VersionControlUtil;
import defpackage.ien;
import defpackage.njy;
import defpackage.pcp;
import defpackage.pdl;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class PlanRunImproveViewHolder extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<pcp> f9777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private PlanInfoAdapter f9778b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f9779c;
    private HealthRecycleView d;
    private RelativeLayout e;
    private HealthSubHeader h;

    public PlanRunImproveViewHolder(View view) {
        super(view);
        this.f9777a = new ArrayList();
        this.f9779c = view.getContext();
        this.d = (HealthRecycleView) view.findViewById(R.id.sug_plans_rcy);
        this.e = (RelativeLayout) view.findViewById(R.id.sug_plans_layout);
        this.h = (HealthSubHeader) view.findViewById(R.id.plans_title);
        ien.b(this.f9779c, this.d, false);
    }

    public void a(pdl pdlVar) {
        if (pdlVar != null) {
            LogUtil.a("Suggestion_PlanRunImproveViewHolder", "PlanRunImproveViewHolder item = ", pdlVar.a());
            this.h.setHeadTitleText(pdlVar.a());
            for (pcp pcpVar : pdlVar.c()) {
                if (pcpVar != null && !this.f9777a.contains(pcpVar)) {
                    if (!VersionControlUtil.isSupportOperationAccount() && (pcpVar.getCommodityFlag() == 2 || pcpVar.getCommodityFlag() == 1)) {
                        LogUtil.j("Suggestion_PlanRunImproveViewHolder", "initData isKidAccount getCommodityFlag:", Integer.valueOf(pcpVar.getCommodityFlag()));
                    } else {
                        this.f9777a.add(pcpVar);
                    }
                }
            }
            if (njy.e(this.f9777a)) {
                this.e.setVisibility(8);
                this.h.setVisibility(8);
                return;
            }
            PlanInfoAdapter planInfoAdapter = new PlanInfoAdapter(0, this.f9777a, this.f9779c);
            this.f9778b = planInfoAdapter;
            this.d.setAdapter(planInfoAdapter);
            this.h.setVisibility(0);
            this.e.setVisibility(0);
            this.h.setMoreLayoutVisibility(8);
            return;
        }
        LogUtil.j("Suggestion_PlanRunImproveViewHolder", "PlanRunImproveViewHolder init FitnessMyPlanUseCase null");
        this.e.setVisibility(8);
        this.h.setVisibility(8);
    }
}
