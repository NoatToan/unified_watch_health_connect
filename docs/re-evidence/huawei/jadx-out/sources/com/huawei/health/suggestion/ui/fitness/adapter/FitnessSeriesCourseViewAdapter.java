package com.huawei.health.suggestion.ui.fitness.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.basefitnessadvice.model.Topic;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.ui.fitness.viewholder.FitSeriesCourseViewHolder;
import defpackage.btx;
import defpackage.qrs;
import health.compact.a.util.LogUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes31.dex */
public class FitnessSeriesCourseViewAdapter extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<Topic> f9279a;

    public FitnessSeriesCourseViewAdapter(List<Topic> list) {
        if (this.f9279a == null) {
            this.f9279a = new ArrayList();
        }
        this.f9279a.addAll(list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new FitSeriesCourseViewHolder(LayoutInflater.from(btx.c()).inflate(R.layout.sug_item_series_course, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        if ((viewHolder instanceof FitSeriesCourseViewHolder) && i >= 0 && this.f9279a.size() > i) {
            ((FitSeriesCourseViewHolder) viewHolder).b(this.f9279a.get(i));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        if (this.f9279a.size() <= 0) {
            return 0;
        }
        return qrs.af(btx.c()) ? 2 : 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return super.getItemViewType(i);
    }

    public void c(List<Topic> list) {
        List<Topic> list2 = this.f9279a;
        if (list2 == null) {
            LogUtil.d("Suggestion_FitnessSeriesCourseViewAdapter", "notifyClearAndAddALl is null");
            return;
        }
        list2.clear();
        this.f9279a.addAll(list);
        notifyDataSetChanged();
    }
}
