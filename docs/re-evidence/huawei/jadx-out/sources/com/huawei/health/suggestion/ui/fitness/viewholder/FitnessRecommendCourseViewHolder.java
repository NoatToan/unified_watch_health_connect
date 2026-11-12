package com.huawei.health.suggestion.ui.fitness.viewholder;

import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.collection.ArrayMap;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.ui.run.adapter.FitnessCourseHorizontalAdapter;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnessadvice.FitWorkout;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.subheader.HealthSubHeader;
import defpackage.njy;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class FitnessRecommendCourseViewHolder extends AbsFitnessViewHolder<List<FitWorkout>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HealthSubHeader f9495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private FitnessCourseHorizontalAdapter f9496b;
    private ArrayMap<String, String> d;
    private final HealthRecycleView e;

    public FitnessRecommendCourseViewHolder(ViewGroup viewGroup) {
        this(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.sug_item_fitness_recommand_course, viewGroup, false));
    }

    public FitnessRecommendCourseViewHolder(View view) {
        super(view);
        this.f9496b = new FitnessCourseHorizontalAdapter();
        HealthSubHeader healthSubHeader = (HealthSubHeader) view.findViewById(R.id.head_my_fitness);
        this.f9495a = healthSubHeader;
        HealthRecycleView healthRecycleView = (HealthRecycleView) view.findViewById(R.id.my_fitness_recycle_view);
        this.e = healthRecycleView;
        healthSubHeader.setMoreText("");
        healthSubHeader.setMoreLayoutVisibility(4);
        healthSubHeader.setSubHeaderBackgroundColor(ContextCompat.getColor(view.getContext(), com.huawei.health.servicesui.R.color.common_transparent));
        healthRecycleView.setAdapter(this.f9496b);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(view.getContext());
        linearLayoutManager.setOrientation(0);
        healthRecycleView.setLayoutManager(linearLayoutManager);
        healthRecycleView.addOnItemTouchListener(new RecyclerView.OnItemTouchListener() { // from class: com.huawei.health.suggestion.ui.fitness.viewholder.FitnessRecommendCourseViewHolder.1
            @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
            public boolean onInterceptTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
                return false;
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
            public void onRequestDisallowInterceptTouchEvent(boolean z) {
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
            public void onTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
                recyclerView.getParent().requestDisallowInterceptTouchEvent(true);
            }
        });
    }

    @Override // com.huawei.health.suggestion.ui.fitness.viewholder.AbsFitnessViewHolder
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void init(List<FitWorkout> list) {
        if (njy.b(list)) {
            c(list);
            return;
        }
        LogUtil.j("Suggestion_FitnessRecommandCourseViewHolder", "FitnessMyPlanViewHolder init FitnessMyPlanUseCase null");
        this.f9495a.setVisibility(8);
        this.e.setVisibility(8);
    }

    private void c(List<FitWorkout> list) {
        ArrayList arrayList = new ArrayList(6);
        int i = 0;
        for (FitWorkout fitWorkout : list) {
            if (fitWorkout != null) {
                if (i >= 6) {
                    break;
                }
                arrayList.add(fitWorkout);
                i++;
            }
        }
        LogUtil.a("Suggestion_FitnessRecommandCourseViewHolder", Integer.valueOf(this.f9495a.getVisibility()), Integer.valueOf(this.e.getVisibility()), Integer.valueOf(arrayList.size()));
        if (njy.b(arrayList)) {
            this.f9495a.setVisibility(0);
            this.e.setVisibility(0);
        } else {
            this.f9495a.setVisibility(8);
            this.e.setVisibility(8);
        }
        this.f9496b.b(this.d);
        this.f9496b.c(arrayList);
    }

    public void d(List<FitWorkout> list, ArrayMap<String, String> arrayMap) {
        this.d = arrayMap;
        if (njy.b(list)) {
            LogUtil.a("Suggestion_FitnessRecommandCourseViewHolder", "bindData: recommend fitWorkouts size is ", Integer.valueOf(list.size()));
            this.f9495a.setVisibility(0);
            this.e.setVisibility(0);
            this.f9496b.b(this.d);
            this.f9496b.c(list);
            return;
        }
        LogUtil.a("Suggestion_FitnessRecommandCourseViewHolder", "bindData: recommend fitWorkouts is empty");
        this.f9495a.setVisibility(8);
        this.e.setVisibility(8);
    }
}
