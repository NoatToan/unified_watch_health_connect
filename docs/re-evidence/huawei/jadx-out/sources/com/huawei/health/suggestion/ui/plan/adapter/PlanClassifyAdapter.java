package com.huawei.health.suggestion.ui.plan.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.ui.plan.viewholder.PlanRunImproveViewHolder;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.njy;
import defpackage.pdl;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class PlanClassifyAdapter extends RecyclerView.Adapter<PlanRunImproveViewHolder> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f9631b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<pdl> f9632c;

    public PlanClassifyAdapter(List<pdl> list, Context context) {
        this.f9631b = context;
        this.f9632c = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public PlanRunImproveViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new PlanRunImproveViewHolder(LayoutInflater.from(this.f9631b).inflate(R.layout.sug_layout_plans, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(PlanRunImproveViewHolder planRunImproveViewHolder, int i) {
        if (njy.e(this.f9632c, i)) {
            return;
        }
        pdl pdlVar = this.f9632c.get(i);
        LogUtil.a("Suggestion_PlanClassifyAdapter", "groupName = ", pdlVar.a());
        planRunImproveViewHolder.a(pdlVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f9632c.size();
    }
}
