package com.huawei.health.suggestion.ui.plan.adapter;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.health.suggestion.ui.plan.viewholder.PlanDetailImgVh;
import defpackage.njy;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class FitnessDetailAdapter extends RecyclerView.Adapter<PlanDetailImgVh> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<String> f9626a;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public PlanDetailImgVh onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new PlanDetailImgVh(viewGroup);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(PlanDetailImgVh planDetailImgVh, int i) {
        if (njy.c(this.f9626a, i)) {
            planDetailImgVh.b(this.f9626a.get(i));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        if (njy.e(this.f9626a)) {
            return 0;
        }
        return this.f9626a.size();
    }

    public void b(List<String> list) {
        this.f9626a = list;
        notifyDataSetChanged();
    }
}
