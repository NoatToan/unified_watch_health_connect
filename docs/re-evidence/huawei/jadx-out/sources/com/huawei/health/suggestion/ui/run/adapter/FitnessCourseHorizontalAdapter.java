package com.huawei.health.suggestion.ui.run.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.collection.ArrayMap;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.health.basefitnessadvice.R;
import com.huawei.health.suggestion.ui.fitness.viewholder.FitnessInnerViewHolder;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnessadvice.FitWorkout;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class FitnessCourseHorizontalAdapter extends RecyclerView.Adapter<FitnessInnerViewHolder> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<FitWorkout> f9941b = new ArrayList();
    private ArrayMap<String, String> e;

    public void c(List<FitWorkout> list) {
        if (list == null) {
            return;
        }
        this.f9941b.clear();
        this.f9941b.addAll(list);
        notifyDataSetChanged();
        LogUtil.a("Suggestion_FitnessCourseHorizontalAdapter", "clearAndAddAll()");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public FitnessInnerViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.sug_item_fitness_topic_inner, viewGroup, false);
        if (viewInflate.getLayoutParams() instanceof RecyclerView.LayoutParams) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) viewInflate.getLayoutParams();
            if (i == 1) {
                layoutParams.setMarginStart(viewInflate.getContext().getResources().getDimensionPixelSize(R.dimen.defaultPaddingStart));
                layoutParams.setMarginEnd(viewInflate.getContext().getResources().getDimensionPixelSize(R.dimen.defaultPaddingEnd));
            } else if (i == 2) {
                layoutParams.setMarginStart(viewInflate.getContext().getResources().getDimensionPixelSize(R.dimen.defaultPaddingStart));
                layoutParams.setMarginEnd(viewInflate.getContext().getResources().getDimensionPixelSize(R.dimen.cardMarginMiddle));
            } else if (i == 3) {
                layoutParams.setMarginEnd(viewInflate.getContext().getResources().getDimensionPixelSize(R.dimen.defaultPaddingEnd));
            } else {
                layoutParams.setMarginEnd(viewInflate.getContext().getResources().getDimensionPixelSize(R.dimen.cardMarginMiddle));
            }
            viewInflate.setLayoutParams(layoutParams);
        }
        return new FitnessInnerViewHolder(viewInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(FitnessInnerViewHolder fitnessInnerViewHolder, int i) {
        if (i == 0) {
            fitnessInnerViewHolder.d(this.f9941b.get(i), true, false);
        } else if (i == this.f9941b.size() - 1) {
            fitnessInnerViewHolder.d(this.f9941b.get(i), false, true);
        } else {
            fitnessInnerViewHolder.d(this.f9941b.get(i), false, false);
        }
        if (this.e == null || this.f9941b.get(i) == null) {
            return;
        }
        fitnessInnerViewHolder.d(this.e.get(this.f9941b.get(i).acquireId()));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f9941b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (getItemCount() == 1) {
            return 1;
        }
        if (i == 0) {
            return 2;
        }
        if (i + 1 == getItemCount()) {
            return 3;
        }
        return super.getItemViewType(i);
    }

    public void b(ArrayMap<String, String> arrayMap) {
        this.e = arrayMap;
    }
}
