package com.huawei.health.suggestion.ui.fitness.viewholder;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.basefitnessadvice.model.Topic;
import com.huawei.haf.router.AppRouter;
import com.huawei.health.basefitnessadvice.R;
import com.huawei.health.sport.view.FitnessCardView;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnessadvice.FitWorkout;
import com.huawei.ui.commonui.recycleview.HealthLinearLayoutManager;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.subheader.HealthSubHeader;
import defpackage.idy;
import defpackage.ien;
import defpackage.njy;
import health.compact.a.CommonUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes31.dex */
public class FitnessCourseHorizontalHolder extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthSubHeader f9469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Topic f9470b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthRecycleView f9471c;
    private FitnessCourseHorizontalAdapter d;
    private View e;

    public FitnessCourseHorizontalHolder(View view, Context context) {
        super(view);
        this.d = new FitnessCourseHorizontalAdapter();
        if (CommonUtil.ca()) {
            HealthSubHeader healthSubHeader = (HealthSubHeader) view.findViewById(R.id.fitness_course_topic_sub_title_without_more);
            this.f9469a = healthSubHeader;
            healthSubHeader.setVisibility(0);
            ((HealthSubHeader) view.findViewById(R.id.fitness_course_topic_sub_title)).setVisibility(8);
            LogUtil.a("Suggestion_FitnessCourseHorizontalHolder", "subHeaderDebug, isStoreDemoVersion");
        } else {
            HealthSubHeader healthSubHeader2 = (HealthSubHeader) view.findViewById(R.id.fitness_course_topic_sub_title);
            this.f9469a = healthSubHeader2;
            healthSubHeader2.setVisibility(0);
            this.f9469a.setMoreTextVisibility(4);
            LogUtil.a("Suggestion_FitnessCourseHorizontalHolder", "subHeaderDebug, not isStoreDemoVersion");
        }
        this.f9471c = (HealthRecycleView) view.findViewById(R.id.sug_recycleview_topic);
        this.e = view.findViewById(R.id.fitness_bg_view_head);
        HealthLinearLayoutManager healthLinearLayoutManager = new HealthLinearLayoutManager(context) { // from class: com.huawei.health.suggestion.ui.fitness.viewholder.FitnessCourseHorizontalHolder.1
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public boolean canScrollHorizontally() {
                return false;
            }
        };
        healthLinearLayoutManager.setOrientation(0);
        this.f9471c.setLayoutManager(healthLinearLayoutManager);
        this.f9471c.setAdapter(this.d);
    }

    public void b(int i) {
        HealthSubHeader healthSubHeader = this.f9469a;
        if (healthSubHeader != null) {
            healthSubHeader.setSubHeaderBackgroundColor(i);
        }
        View view = this.e;
        if (view != null) {
            view.setBackgroundColor(i);
        }
    }

    public void d(final Topic topic, final String str) {
        if (topic == null) {
            return;
        }
        this.f9470b = topic;
        this.f9469a.setHeadTitleText(topic.acquireName());
        List<FitWorkout> listAcquireWorkoutList = topic.acquireWorkoutList();
        if (njy.e(listAcquireWorkoutList)) {
            LogUtil.j("Suggestion_FitnessCourseHorizontalHolder", "workouts is empty");
            return;
        }
        this.d.a(listAcquireWorkoutList);
        if (CommonUtil.ca()) {
            return;
        }
        this.f9469a.setMoreViewClickListener(new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.fitness.viewholder.FitnessCourseHorizontalHolder.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                int iAcquireId = topic.acquireId();
                LogUtil.a("Suggestion_FitnessCourseHorizontalHolder", "view == mRlName", "topic.acquireId():", Integer.valueOf(iAcquireId), "--", topic.acquireName());
                if (str != null) {
                    FitnessCourseHorizontalHolder.this.a();
                } else {
                    FitnessCourseHorizontalHolder.this.c(topic);
                }
                if (FitnessCourseHorizontalHolder.this.itemView.getParent() instanceof RecyclerView) {
                    Context context = ((RecyclerView) FitnessCourseHorizontalHolder.this.itemView.getParent()).getContext();
                    Bundle bundle = new Bundle();
                    bundle.putInt("intent_key_topicid", topic.acquireId());
                    bundle.putString("intent_key_topicname", topic.acquireName());
                    AppRouter.c("/PluginFitnessAdvice/FitnessTopicActivity").d(bundle).d(268435456).b(context);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(Topic topic) {
        HashMap map = new HashMap(2);
        map.put("entrance", topic.acquireName());
        map.put("position", 1);
        idy.b("1130015", map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        HashMap map = new HashMap(1);
        map.put("click", "1");
        idy.b(AnalyticsValue.HEALTH_WEIGHT_RECOMMENDED_TOPIC_2030066.value(), map);
        LogUtil.a("Suggestion_FitnessCourseHorizontalHolder", "doCurrentPageBi", AnalyticsValue.HEALTH_WEIGHT_RECOMMENDED_TOPIC_2030066.value());
    }

    public class FitnessCourseHorizontalAdapter extends RecyclerView.Adapter<FitnessInnerViewHolder> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List<FitWorkout> f9475b = new ArrayList(10);

        public FitnessCourseHorizontalAdapter() {
        }

        public void a(List<FitWorkout> list) {
            if (njy.e(list)) {
                LogUtil.j("Suggestion_FitnessCourseHorizontalHolder", "workout list is empty, pls check");
            }
            LogUtil.a("Suggestion_FitnessCourseHorizontalHolder", "clearAndAddAll()");
            this.f9475b.clear();
            this.f9475b.addAll(list);
            notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public FitnessInnerViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.sug_item_fitness_topic_inner, viewGroup, false);
            FitnessCardView fitnessCardView = (FitnessCardView) viewInflate.findViewById(R.id.recycle_item);
            fitnessCardView.setWidthWeight(21.0f);
            fitnessCardView.setHeightWeight(9.0f);
            return new FitnessInnerViewHolder(viewInflate);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(FitnessInnerViewHolder fitnessInnerViewHolder, int i) {
            if (njy.e(this.f9475b, i)) {
                LogUtil.j("Suggestion_FitnessCourseHorizontalHolder", "position out of bounds, position is ", Integer.valueOf(i), " , fit workouts size is ", Integer.valueOf(this.f9475b.size()));
            } else if (i == 0) {
                fitnessInnerViewHolder.c(this.f9475b.get(i), true, false, FitnessCourseHorizontalHolder.this.f9470b);
            } else if (i == getItemCount() - 1) {
                fitnessInnerViewHolder.c(this.f9475b.get(i), false, true, FitnessCourseHorizontalHolder.this.f9470b);
            } else {
                fitnessInnerViewHolder.c(this.f9475b.get(i), false, false, FitnessCourseHorizontalHolder.this.f9470b);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            if (this.f9475b == null) {
                return 0;
            }
            int iB = ien.b();
            return this.f9475b.size() > iB ? iB : this.f9475b.size();
        }
    }
}
