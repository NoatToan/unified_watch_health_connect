package com.huawei.health.suggestion.ui.fitness.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.ui.fitness.viewholder.FitSeriesCourseDetailsViewHolder;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnessadvice.FitWorkout;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import defpackage.njy;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class FitSeriesCourseDetialsAdapter extends RecyclerView.Adapter<FitSeriesCourseDetailsViewHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private LoadMoreCourseDetialsListener f9270a;
    private boolean d = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<FitWorkout> f9271c = new ArrayList(10);
    private String e = "";

    public interface LoadMoreCourseDetialsListener {
        void loadMore();
    }

    public FitSeriesCourseDetialsAdapter(HealthRecycleView healthRecycleView) {
        healthRecycleView.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.huawei.health.suggestion.ui.fitness.adapter.FitSeriesCourseDetialsAdapter.5
            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                super.onScrolled(recyclerView, i, i2);
                if (ViewCompat.canScrollVertically(recyclerView, 1) || !FitSeriesCourseDetialsAdapter.this.d || FitSeriesCourseDetialsAdapter.this.f9270a == null) {
                    return;
                }
                FitSeriesCourseDetialsAdapter.this.f9270a.loadMore();
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public FitSeriesCourseDetailsViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new FitSeriesCourseDetailsViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.sug_item_series_course_details, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(FitSeriesCourseDetailsViewHolder fitSeriesCourseDetailsViewHolder, int i) {
        if (i < 0 || this.f9271c.size() <= i) {
            return;
        }
        fitSeriesCourseDetailsViewHolder.e(this.f9271c.get(i), this.e);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<FitWorkout> list = this.f9271c;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public void b(LoadMoreCourseDetialsListener loadMoreCourseDetialsListener) {
        this.f9270a = loadMoreCourseDetialsListener;
    }

    public void e(List<FitWorkout> list) {
        if (njy.e(list)) {
            LogUtil.j("FitSeriesCourseDetialsAdapter", "notifyAddAllDetailsList(),fitWorkouts is null");
            this.d = false;
            return;
        }
        if (list.size() < 10) {
            this.f9271c.addAll(list);
            notifyDataSetChanged();
            this.d = false;
        }
        int itemCount = getItemCount();
        a(list);
        notifyItemRangeInserted(itemCount, (getItemCount() - itemCount) - 1);
    }

    private void a(List<FitWorkout> list) {
        for (FitWorkout fitWorkout : list) {
            if (!this.f9271c.contains(fitWorkout)) {
                this.f9271c.add(fitWorkout);
            }
        }
    }

    public void a(String str) {
        this.e = str;
    }
}
