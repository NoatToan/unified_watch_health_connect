package com.huawei.health.suggestion.ui.fitness.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.ui.fitness.helper.LoadMoreInterface;
import com.huawei.health.suggestion.ui.fitness.viewholder.FitnessActionTypeHolder;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnessadvice.AtomicAction;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import defpackage.btx;
import defpackage.njy;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes31.dex */
public class FitnessActionTypeRecyAdapter extends RecyclerView.Adapter<FitnessActionTypeHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private LoadMoreInterface f9275a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private FitnessActionTypeHolder f9277c;
    private List<AtomicAction> d = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f9276b = 1;

    public FitnessActionTypeRecyAdapter(HealthRecycleView healthRecycleView, Context context) {
        if (healthRecycleView == null) {
            LogUtil.j("FitnessActionTypeRecyAdapter", "RecyclerView can not be null");
        } else {
            healthRecycleView.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.huawei.health.suggestion.ui.fitness.adapter.FitnessActionTypeRecyAdapter.4
                @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
                public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                    super.onScrolled(recyclerView, i, i2);
                    if (ViewCompat.canScrollVertically(recyclerView, FitnessActionTypeRecyAdapter.this.f9276b) || FitnessActionTypeRecyAdapter.this.f9275a == null) {
                        return;
                    }
                    FitnessActionTypeRecyAdapter.this.f9275a.loadMore();
                }
            });
        }
    }

    public void b(List<AtomicAction> list) {
        if (njy.b(list)) {
            this.d.addAll(list);
            notifyDataSetChanged();
        }
    }

    public void a() {
        this.d.clear();
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public FitnessActionTypeHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        FitnessActionTypeHolder fitnessActionTypeHolder = new FitnessActionTypeHolder(LayoutInflater.from(btx.c()).inflate(R.layout.sug_item_fitness_action_type, viewGroup, false));
        this.f9277c = fitnessActionTypeHolder;
        return fitnessActionTypeHolder;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(FitnessActionTypeHolder fitnessActionTypeHolder, int i) {
        if (i < 0 || i >= this.d.size()) {
            return;
        }
        fitnessActionTypeHolder.d(this.d.get(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.d.size();
    }

    public int d() {
        return this.d.size();
    }

    public void a(LoadMoreInterface loadMoreInterface) {
        this.f9275a = loadMoreInterface;
    }
}
