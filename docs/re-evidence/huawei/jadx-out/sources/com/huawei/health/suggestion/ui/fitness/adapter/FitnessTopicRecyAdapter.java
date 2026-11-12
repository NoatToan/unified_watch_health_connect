package com.huawei.health.suggestion.ui.fitness.adapter;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.ui.fitness.module.FitnessTopicDeleteModel;
import com.huawei.health.suggestion.ui.fitness.viewholder.FitnessTopicViewHolder;
import com.huawei.health.suggestion.ui.fitness.viewholder.LoadMoreViewHolder;
import com.huawei.health.suggestion.ui.fitness.viewholder.WarmUpAndStretchViewHolder;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnessadvice.FitWorkout;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import defpackage.njy;
import defpackage.qrs;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class FitnessTopicRecyAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Bundle f9281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f9282b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<FitWorkout> f9283c;
    private FitnessTopicDeleteModel d;
    private boolean e;
    private HealthRecycleView f;
    private int g;
    private boolean h;
    private String i;
    private LoadMoreListener j;

    public interface LoadMoreListener {
        void loadMore();
    }

    public FitnessTopicRecyAdapter(HealthRecycleView healthRecycleView) {
        this.f9283c = new ArrayList(10);
        this.e = true;
        this.f = healthRecycleView;
        this.f9282b = healthRecycleView.getContext();
        healthRecycleView.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.huawei.health.suggestion.ui.fitness.adapter.FitnessTopicRecyAdapter.3
            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                super.onScrolled(recyclerView, i, i2);
                if (ViewCompat.canScrollVertically(recyclerView, 1) || !FitnessTopicRecyAdapter.this.e || FitnessTopicRecyAdapter.this.j == null) {
                    return;
                }
                LogUtil.a("Suggestion_FitnessTopicRecyAdapter", "method:loadMore()");
                FitnessTopicRecyAdapter.this.j.loadMore();
            }
        });
    }

    public FitnessTopicRecyAdapter(HealthRecycleView healthRecycleView, int i, Bundle bundle) {
        this(healthRecycleView);
        this.g = i;
        this.f9281a = bundle;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        LogUtil.a("Suggestion_FitnessTopicRecyAdapter", "onCreateViewHolder(ViewGroup parent, int viewType)");
        if (i == 1) {
            return new LoadMoreViewHolder(LayoutInflater.from(this.f.getContext()).inflate(R.layout.sug_his_loading_more, viewGroup, false));
        }
        if (this.g == 8) {
            return new WarmUpAndStretchViewHolder(LayoutInflater.from(this.f.getContext()).inflate(R.layout.sug_warm_up_and_stretch_item, viewGroup, false), this.f9281a);
        }
        return new FitnessTopicViewHolder(LayoutInflater.from(this.f.getContext()).inflate(R.layout.sug_fitness_list_item, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        LogUtil.a("Suggestion_FitnessTopicRecyAdapter", "onBindViewHolder(HealthRecycleView.ViewHolder holder, int position)");
        if (getItemViewType(i) == 0) {
            if (this.g == 8) {
                if (njy.e(this.f9283c, i)) {
                    return;
                }
                FitWorkout fitWorkout = this.f9283c.size() != 0 ? this.f9283c.get(i) : null;
                if (viewHolder instanceof WarmUpAndStretchViewHolder) {
                    ((WarmUpAndStretchViewHolder) viewHolder).c(fitWorkout, this.i, this.f9282b);
                    return;
                }
                return;
            }
            FitnessTopicDeleteModel fitnessTopicDeleteModel = this.d;
            if (fitnessTopicDeleteModel != null) {
                fitnessTopicDeleteModel.savePosition(i);
            }
            if (viewHolder instanceof FitnessTopicViewHolder) {
                if (i == 0) {
                    ((FitnessTopicViewHolder) viewHolder).b(0);
                } else if (qrs.af(this.f9282b) && i == 1) {
                    ((FitnessTopicViewHolder) viewHolder).b(0);
                } else {
                    ((FitnessTopicViewHolder) viewHolder).b(8);
                }
                ((FitnessTopicViewHolder) viewHolder).e(this.d, this.i, this.h, this.f9283c.size() != 0 ? this.f9283c.get(i) : null);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        if (this.e && this.f9283c.size() >= 10) {
            return this.f9283c.size() + 1;
        }
        return this.f9283c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return (this.e && this.f9283c.size() >= 10 && i == getItemCount() - 1) ? 1 : 0;
    }

    public void b(boolean z) {
        this.e = z;
        notifyDataSetChanged();
    }

    public void e(LoadMoreListener loadMoreListener) {
        this.j = loadMoreListener;
    }

    public void e(FitnessTopicDeleteModel fitnessTopicDeleteModel, boolean z, List<FitWorkout> list) {
        this.f9283c.clear();
        d(fitnessTopicDeleteModel, z, list);
    }

    public void d(FitnessTopicDeleteModel fitnessTopicDeleteModel, boolean z, List<FitWorkout> list) {
        if (list == null) {
            LogUtil.j("Suggestion_FitnessTopicRecyAdapter", "fitWorkouts null or size =0");
            return;
        }
        if (list.size() < 10) {
            this.e = false;
        }
        if (fitnessTopicDeleteModel != null) {
            this.d = fitnessTopicDeleteModel;
        }
        int size = this.f9283c.size();
        this.h = z;
        this.f9283c.addAll(list);
        int iMax = Math.max(1, getItemCount() - size);
        if (size == 0) {
            notifyDataSetChanged();
        } else {
            notifyItemRangeChanged(size, iMax);
        }
    }

    public void b(FitnessTopicDeleteModel fitnessTopicDeleteModel, boolean z) {
        if (fitnessTopicDeleteModel != null) {
            this.d = fitnessTopicDeleteModel;
        }
        this.h = z;
        notifyItemRangeChanged(0, getItemCount(), true);
    }

    public List<FitWorkout> b() {
        return this.f9283c;
    }

    public void b(String str) {
        this.i = str;
    }
}
