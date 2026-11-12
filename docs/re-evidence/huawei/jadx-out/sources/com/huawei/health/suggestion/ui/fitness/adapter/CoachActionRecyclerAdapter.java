package com.huawei.health.suggestion.ui.fitness.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.model.CoachMotion;
import com.huawei.health.suggestion.ui.fitness.helper.LoadMoreInterface;
import com.huawei.health.suggestion.ui.fitness.module.TrainActionIntro;
import com.huawei.health.suggestion.ui.fitness.viewholder.CoachActionViewHolder;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class CoachActionRecyclerAdapter extends RecyclerView.Adapter<CoachActionViewHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f9256a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private CoachActionViewHolder f9258c;
    private TrainActionIntro e;
    private LoadMoreInterface g;
    private List<CoachMotion> d = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f9257b = 1;

    public CoachActionRecyclerAdapter(HealthRecycleView healthRecycleView, TrainActionIntro trainActionIntro, Context context) {
        this.f9256a = context;
        this.e = trainActionIntro;
        if (healthRecycleView == null) {
            LogUtil.j("Suggestion_CoachActionRecyclerAdapter", "RecyclerView can not be null");
        } else {
            healthRecycleView.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.huawei.health.suggestion.ui.fitness.adapter.CoachActionRecyclerAdapter.4
                @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
                public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                    super.onScrolled(recyclerView, i, i2);
                    if (ViewCompat.canScrollVertically(recyclerView, CoachActionRecyclerAdapter.this.f9257b) || CoachActionRecyclerAdapter.this.g == null) {
                        return;
                    }
                    CoachActionRecyclerAdapter.this.g.loadMore();
                }
            });
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public CoachActionViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        CoachActionViewHolder coachActionViewHolder = new CoachActionViewHolder(LayoutInflater.from(this.f9256a).inflate(R.layout.sug_item_coach_action, viewGroup, false), this.e);
        this.f9258c = coachActionViewHolder;
        return coachActionViewHolder;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(CoachActionViewHolder coachActionViewHolder, int i) {
        coachActionViewHolder.e(this.d, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<CoachMotion> list = this.d;
        if (list == null || list.size() <= 0) {
            return 0;
        }
        return this.d.size();
    }

    public void b(List<CoachMotion> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        this.d.clear();
        this.d.addAll(list);
        notifyDataSetChanged();
    }

    public void d(int i, boolean z) {
        for (int i2 = 0; i2 < this.d.size(); i2++) {
            CoachMotion coachMotion = this.d.get(i2);
            if (i2 == i) {
                coachMotion.setButtonVisible(z);
            } else {
                coachMotion.setButtonVisible(false);
            }
        }
        notifyDataSetChanged();
    }
}
