package com.huawei.health.suggestion.ui.fitness.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.ui.fitness.helper.LoadMoreInterface;
import com.huawei.health.suggestion.ui.fitness.viewholder.FitnessActionViewHolder;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import defpackage.btx;
import defpackage.hkv;
import defpackage.qrs;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes31.dex */
public class FitnessActionRecyAdapter extends RecyclerView.Adapter<FitnessActionViewHolder> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private LoadMoreInterface f9273b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private FitnessActionViewHolder f9274c;
    private List<hkv> e = new ArrayList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f9272a = 1;

    public FitnessActionRecyAdapter(HealthRecycleView healthRecycleView, Context context) {
        if (healthRecycleView == null) {
            LogUtil.j("FitnessActionRecyAdapter", "RecyclerView can not be null");
        } else {
            healthRecycleView.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.huawei.health.suggestion.ui.fitness.adapter.FitnessActionRecyAdapter.5
                @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
                public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                    super.onScrolled(recyclerView, i, i2);
                    if (ViewCompat.canScrollVertically(recyclerView, FitnessActionRecyAdapter.this.f9272a) || FitnessActionRecyAdapter.this.f9273b == null) {
                        return;
                    }
                    FitnessActionRecyAdapter.this.f9273b.loadMore();
                }
            });
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public FitnessActionViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (qrs.ac()) {
            this.f9274c = new FitnessActionViewHolder(LayoutInflater.from(btx.c()).inflate(R.layout.sug_item_fitness_action_library_three_fold_fonts, viewGroup, false));
        } else {
            this.f9274c = new FitnessActionViewHolder(LayoutInflater.from(btx.c()).inflate(R.layout.sug_item_fitness_action_library, viewGroup, false));
        }
        return this.f9274c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(FitnessActionViewHolder fitnessActionViewHolder, int i) {
        fitnessActionViewHolder.d(this.e, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.e.size() / 2;
    }

    public void c(List<hkv> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        this.e.clear();
        this.e.addAll(list);
        notifyDataSetChanged();
    }
}
