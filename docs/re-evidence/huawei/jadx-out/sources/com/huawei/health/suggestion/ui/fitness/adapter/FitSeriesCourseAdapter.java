package com.huawei.health.suggestion.ui.fitness.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.basefitnessadvice.model.Topic;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.ui.fitness.viewholder.FitSeriesCourseViewHolder;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import defpackage.njy;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class FitSeriesCourseAdapter extends RecyclerView.Adapter<FitSeriesCourseViewHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<Topic> f9267a = new ArrayList(10);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f9268b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LoadMoreCourseListener f9269c;

    public interface LoadMoreCourseListener {
        void loadMore();
    }

    public FitSeriesCourseAdapter(HealthRecycleView healthRecycleView) {
        healthRecycleView.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.huawei.health.suggestion.ui.fitness.adapter.FitSeriesCourseAdapter.3
            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                super.onScrolled(recyclerView, i, i2);
                if (ViewCompat.canScrollVertically(recyclerView, 1) || !FitSeriesCourseAdapter.this.f9268b || FitSeriesCourseAdapter.this.f9269c == null) {
                    return;
                }
                FitSeriesCourseAdapter.this.f9269c.loadMore();
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public FitSeriesCourseViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new FitSeriesCourseViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.sug_item_series_course, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(FitSeriesCourseViewHolder fitSeriesCourseViewHolder, int i) {
        if (i < 0 || this.f9267a.size() <= i) {
            return;
        }
        fitSeriesCourseViewHolder.b(this.f9267a.get(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<Topic> list = this.f9267a;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public void c(LoadMoreCourseListener loadMoreCourseListener) {
        this.f9269c = loadMoreCourseListener;
    }

    private void b(List<Topic> list) {
        for (Topic topic : list) {
            if (!this.f9267a.contains(topic)) {
                this.f9267a.add(topic);
            }
        }
    }

    public void c(List<Topic> list) {
        if (njy.e(list)) {
            this.f9268b = false;
            LogUtil.j("Sug_FitSeriesCourseAdapter", "notifyAddAllList, topics is null");
            return;
        }
        if (list.size() < 10) {
            this.f9267a.addAll(list);
            notifyDataSetChanged();
            this.f9268b = false;
        }
        int itemCount = getItemCount();
        b(list);
        notifyItemRangeInserted(itemCount, (getItemCount() - itemCount) - 1);
    }
}
