package com.huawei.health.suggestion.ui.fitness.viewholder;

import android.content.Intent;
import android.view.View;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.ui.fitness.activity.MyFitnessCourseActivity;
import com.huawei.health.suggestion.ui.fitness.activity.SportAllCourseActivity;
import com.huawei.health.suggestion.ui.fitness.adapter.FitnessMyCourseWithDataAdapter;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnessadvice.FitWorkout;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.subheader.HealthSubHeader;
import defpackage.idy;
import defpackage.njy;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes31.dex */
public class FitnessMyCourseViewHolder extends AbsFitnessViewHolder<List<FitWorkout>> implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f9481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final View f9482b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HealthButton f9483c;
    private FitnessMyCourseWithDataAdapter d;
    private final HealthSubHeader e;
    private final HealthRecycleView g;

    @Override // com.huawei.health.suggestion.ui.fitness.viewholder.AbsFitnessViewHolder
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void init(List<FitWorkout> list) {
        if (list == null) {
            LogUtil.j("Suggestion_FitnessMyCourseViewHolder", "FitnessMyCourseViewHolder init fitWorkouts null");
            return;
        }
        e();
        d();
        b(list);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == null) {
            LogUtil.j("Suggestion_FitnessMyCourseViewHolder", "onClick view null");
            return;
        }
        if (isFastClick()) {
            LogUtil.j("Suggestion_FitnessMyCourseViewHolder", "FitnessMyCourseViewHolder is fast click");
        } else if (view.getId() == R.id.tv_fitness_add_course) {
            b();
        } else {
            a();
        }
    }

    private void e() {
        setRecyclerViewLayout(this.itemView.getContext(), this.g);
        this.g.setAdapter(this.d);
    }

    private void b() {
        HashMap map = new HashMap(2);
        map.put("entrance", this.itemView.getContext().getString(R.string.IDS_fitness_advice_run_choose_running_courses));
        map.put("position", 3);
        idy.b("1130015", map);
        Intent intent = new Intent(this.itemView.getContext(), (Class<?>) SportAllCourseActivity.class);
        intent.setFlags(268435456);
        intent.putExtra("SKIP_ALL_COURSE_KEY", "FITNESS_COURSE");
        this.itemView.getContext().startActivity(intent);
    }

    private void a() {
        HashMap map = new HashMap(2);
        map.put("entrance", this.itemView.getContext().getString(R.string.sug_my_fitness_class));
        map.put("position", 2);
        idy.b("1130015", map);
        Intent intent = new Intent(this.itemView.getContext(), (Class<?>) MyFitnessCourseActivity.class);
        intent.setFlags(268435456);
        this.itemView.getContext().startActivity(intent);
    }

    private void d() {
        this.f9483c.setOnClickListener(this);
        this.e.setOnClickListener(this);
    }

    private void b(List<FitWorkout> list) {
        e(list);
        if (njy.e(list)) {
            LogUtil.j("Suggestion_FitnessMyCourseViewHolder", "workouts is empty");
        } else {
            this.d.c(list);
        }
    }

    private void e(List<FitWorkout> list) {
        if (njy.e(list)) {
            this.f9482b.setVisibility(8);
            this.f9481a.setVisibility(0);
        } else {
            this.f9482b.setVisibility(0);
            this.f9481a.setVisibility(8);
        }
    }
}
