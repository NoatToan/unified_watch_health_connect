package com.huawei.health.suggestion.ui.fitness.adapter;

import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.collection.ArrayMap;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.health.suggestion.ui.fitness.mvp.VideoPlayer;
import com.huawei.health.suggestion.ui.fitness.viewholder.CoachesIntroducesViewHolder;
import com.huawei.health.suggestion.ui.fitness.viewholder.FitnessNewDetailImageViewHolder;
import com.huawei.health.suggestion.ui.fitness.viewholder.FitnessNewDetailVideoViewHolder;
import com.huawei.health.suggestion.ui.fitness.viewholder.FitnessRecommendCourseViewHolder;
import com.huawei.health.suggestion.ui.fitness.viewholder.FitnessSubTitleViewHolder;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnessadvice.FitWorkout;
import com.huawei.pluginfitnessadvice.LayoutTemplateInfo;
import com.huawei.pluginfitnessadvice.ShowLayout;
import defpackage.njy;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class NewDetailInfoAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LinearLayoutManager f9286c;
    private List<FitWorkout> d;
    private LayoutTemplateInfo e;
    private ArrayMap<String, String> f;
    private RecyclerView h;
    private VideoPlayer i;
    private List<ShowLayout> j;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f9285b = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ArrayList<Integer> f9284a = new ArrayList<>();

    public NewDetailInfoAdapter(VideoPlayer videoPlayer) {
        this.i = videoPlayer;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 0) {
            return new FitnessNewDetailImageViewHolder(viewGroup);
        }
        if (i == 1) {
            return new FitnessNewDetailVideoViewHolder(viewGroup, this.i);
        }
        if (i == 2) {
            return new FitnessSubTitleViewHolder(viewGroup);
        }
        if (i == 3) {
            return new CoachesIntroducesViewHolder(viewGroup);
        }
        return new FitnessRecommendCourseViewHolder(viewGroup);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        int size = i - this.f9284a.size();
        if (viewHolder instanceof FitnessSubTitleViewHolder) {
            if (this.e.getWorkoutIntroductionBar() == null) {
                ((FitnessSubTitleViewHolder) viewHolder).e("");
                return;
            } else {
                ((FitnessSubTitleViewHolder) viewHolder).e(njy.e(this.j) ? "" : this.e.getWorkoutIntroductionBar().getName());
                return;
            }
        }
        if (viewHolder instanceof CoachesIntroducesViewHolder) {
            ((CoachesIntroducesViewHolder) viewHolder).c(this.e.getCoachBar());
            return;
        }
        if (viewHolder instanceof FitnessRecommendCourseViewHolder) {
            ((FitnessRecommendCourseViewHolder) viewHolder).d(this.d, this.f);
            return;
        }
        if ((viewHolder instanceof FitnessNewDetailImageViewHolder) && njy.c(this.j, size)) {
            ((FitnessNewDetailImageViewHolder) viewHolder).b(this.j.get(size));
        } else if ((viewHolder instanceof FitnessNewDetailVideoViewHolder) && njy.c(this.j, size)) {
            ((FitnessNewDetailVideoViewHolder) viewHolder).d(this.j.get(size), this.f9285b);
        } else {
            LogUtil.a("Suggestion_NewDetailInfoAdapter", "onBindViewHolder else");
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        LayoutTemplateInfo layoutTemplateInfo = this.e;
        if (layoutTemplateInfo == null) {
            return 0;
        }
        if (layoutTemplateInfo.getWorkoutIntroductionBar() == null || njy.e(this.e.getWorkoutIntroductionBar().getLayoutList())) {
            return this.f9284a.size();
        }
        LogUtil.a("Suggestion_NewDetailInfoAdapter", "getItemCount = ", Integer.valueOf(this.j.size()));
        return this.j.size() + this.f9284a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (i < this.f9284a.size()) {
            return this.f9284a.get(i).intValue();
        }
        int size = i - this.f9284a.size();
        if (njy.e(this.j, size)) {
            LogUtil.e("Suggestion_NewDetailInfoAdapter", "getItemViewType curPosition = ", Integer.valueOf(size));
            return 0;
        }
        int type = this.j.get(size).getType();
        LogUtil.a("Suggestion_NewDetailInfoAdapter", "getItemViewType mType = ", Integer.valueOf(type));
        return type;
    }

    public void e(LayoutTemplateInfo layoutTemplateInfo) {
        if (layoutTemplateInfo == null) {
            LogUtil.e("Suggestion_NewDetailInfoAdapter", "data is null");
            return;
        }
        this.e = layoutTemplateInfo;
        if (layoutTemplateInfo.getWorkoutIntroductionBar() != null && njy.b(layoutTemplateInfo.getWorkoutIntroductionBar().getLayoutList())) {
            this.j = layoutTemplateInfo.getWorkoutIntroductionBar().getLayoutList();
        } else {
            this.j = new ArrayList();
        }
        if (njy.b(this.f9284a)) {
            this.f9284a.clear();
        }
        if (this.e.getCoachBar() != null && !TextUtils.isEmpty(this.e.getCoachBar().getName())) {
            this.f9284a.add(3);
        }
        if (njy.b(this.d)) {
            this.f9284a.add(4);
        }
        if (njy.b(this.j) && !TextUtils.isEmpty(this.e.getWorkoutIntroductionBar().getName())) {
            this.f9284a.add(2);
        }
        notifyDataSetChanged();
    }

    public void b(List<FitWorkout> list, ArrayMap<String, String> arrayMap) {
        if (njy.e(list)) {
            LogUtil.j("Suggestion_NewDetailInfoAdapter", "fitWorkoutList is empty");
            return;
        }
        this.d = list;
        this.f = arrayMap;
        if (njy.b(list) && !this.f9284a.contains(4)) {
            if (this.f9284a.contains(2)) {
                this.f9284a.add(this.f9284a.indexOf(2), 4);
            } else {
                this.f9284a.add(4);
            }
        }
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.h = recyclerView;
        if (recyclerView.getLayoutManager() instanceof LinearLayoutManager) {
            this.f9286c = (LinearLayoutManager) this.h.getLayoutManager();
            this.h.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.huawei.health.suggestion.ui.fitness.adapter.NewDetailInfoAdapter.2
                @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
                public void onScrolled(RecyclerView recyclerView2, int i, int i2) {
                    super.onScrolled(recyclerView2, i, i2);
                }

                @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
                public void onScrollStateChanged(RecyclerView recyclerView2, int i) {
                    super.onScrollStateChanged(recyclerView2, i);
                    if (NewDetailInfoAdapter.this.i == null || NewDetailInfoAdapter.this.f9286c == null || 1 != i) {
                        return;
                    }
                    int iFindFirstVisibleItemPosition = NewDetailInfoAdapter.this.f9286c.findFirstVisibleItemPosition();
                    int iFindLastVisibleItemPosition = NewDetailInfoAdapter.this.f9286c.findLastVisibleItemPosition();
                    if ((NewDetailInfoAdapter.this.f9285b < iFindFirstVisibleItemPosition || NewDetailInfoAdapter.this.f9285b > iFindLastVisibleItemPosition) && NewDetailInfoAdapter.this.i.b()) {
                        NewDetailInfoAdapter.this.i.g();
                    }
                }
            });
        }
    }

    public void d(int i, int i2) {
        this.f9285b = -1;
        notifyItemChanged(i);
        this.f9285b = i2;
        if (i2 == -1) {
            notifyDataSetChanged();
        } else {
            this.h.getLayoutManager().scrollToPosition(this.f9285b);
        }
    }
}
