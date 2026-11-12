package com.huawei.health.suggestion.ui.fitness.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.ui.fitness.viewholder.FitnessMyCourseWithDataViewHolder;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnessadvice.FitWorkout;
import defpackage.btx;
import defpackage.njy;
import defpackage.qrs;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes31.dex */
public class FitnessMyCourseWithDataAdapter extends RecyclerView.Adapter {
    private List<FitWorkout> e = new ArrayList(10);

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new FitnessMyCourseWithDataViewHolder(LayoutInflater.from(btx.c()).inflate(R.layout.sug_item_fitness_each_course, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        if ((viewHolder instanceof FitnessMyCourseWithDataViewHolder) && njy.b(this.e) && !njy.e(this.e, i)) {
            FitnessMyCourseWithDataViewHolder fitnessMyCourseWithDataViewHolder = (FitnessMyCourseWithDataViewHolder) viewHolder;
            fitnessMyCourseWithDataViewHolder.init(this.e.get(i));
            if (!qrs.af(btx.c()) && this.e.size() >= 2 && i == 0) {
                fitnessMyCourseWithDataViewHolder.e().setVisibility(0);
            } else {
                fitnessMyCourseWithDataViewHolder.e().setVisibility(8);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        if (this.e.size() < 2) {
            return this.e.size();
        }
        return 2;
    }

    public void c(List<FitWorkout> list) {
        if (list == null) {
            LogUtil.j("Suggestion_FitnessMyCourseWithDataAdapter", "notifyClearAndAddAll is null");
            return;
        }
        this.e.clear();
        this.e.addAll(list);
        notifyDataSetChanged();
        LogUtil.a("Suggestion_FitnessMyCourseWithDataAdapter", "notifyClearAndAddAll List<FitWorkout>", Integer.valueOf(list.size()));
    }
}
