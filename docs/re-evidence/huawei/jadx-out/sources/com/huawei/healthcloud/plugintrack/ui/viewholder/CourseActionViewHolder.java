package com.huawei.healthcloud.plugintrack.ui.viewholder;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.huawei.health.course.api.CourseApi;
import com.huawei.health.device.model.RecordAction;
import com.huawei.health.sport.model.WorkoutRecord;
import com.huawei.health.suggestion.PluginSuggestion;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.healthcloud.plugintrack.ui.view.TrainingResultsView;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwfoundationmodel.trackmodel.MotionPathSimplify;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.ui.commonui.divider.HealthDivider;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import defpackage.gzx;
import defpackage.gzy;
import defpackage.iec;
import defpackage.njy;
import defpackage.ped;
import defpackage.peh;
import health.compact.a.Services;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class CourseActionViewHolder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private WorkoutRecord f11385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LinearLayout f11386c;
    private final Context d;
    private HealthRecycleView e;

    public CourseActionViewHolder(Context context) {
        this.d = context;
    }

    public View e(boolean z) {
        View viewInflate = View.inflate(this.d, R.layout.track_course_action, null);
        HealthDivider healthDivider = (HealthDivider) viewInflate.findViewById(R.id.action_top_divider);
        if (z) {
            healthDivider.setVisibility(8);
        }
        this.f11386c = (LinearLayout) viewInflate.findViewById(R.id.course_action_layout);
        HealthRecycleView healthRecycleView = (HealthRecycleView) viewInflate.findViewById(R.id.sug_coach_rcv_actions);
        this.e = healthRecycleView;
        healthRecycleView.setNestedScrollingEnabled(false);
        this.e.setLayoutManager(new LinearLayoutManager(this.d, 1, false));
        return viewInflate;
    }

    public boolean a(MotionPathSimplify motionPathSimplify) {
        if (motionPathSimplify == null) {
            LogUtil.e("Track_CourseActionViewHolder", " motionPathSimplify == null");
            return false;
        }
        CourseApi courseApi = (CourseApi) Services.d("CoursePlanService", CourseApi.class);
        if (courseApi == null) {
            LogUtil.j("Track_CourseActionViewHolder", "refreshDifficulty : courseApi is null.");
            return false;
        }
        WorkoutRecord workoutRecordAcquireWorkoutRecordByExerciseTime = courseApi.acquireWorkoutRecordByExerciseTime(LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011), motionPathSimplify.requestEndTime(), motionPathSimplify.requestRunCourseId());
        if (workoutRecordAcquireWorkoutRecordByExerciseTime == null) {
            LogUtil.e("Track_CourseActionViewHolder", "refreshCourseLayout mRecord == null");
            return false;
        }
        this.f11385b = workoutRecordAcquireWorkoutRecordByExerciseTime;
        if (workoutRecordAcquireWorkoutRecordByExerciseTime.isFitnessRecordFromTv()) {
            LogUtil.a("Track_CourseActionViewHolder", "refreshCourseLayout isFitnessRecordFromTv");
            return false;
        }
        if (workoutRecordAcquireWorkoutRecordByExerciseTime.acquireWorkoutId() == null || !workoutRecordAcquireWorkoutRecordByExerciseTime.acquireWorkoutId().equals(motionPathSimplify.requestRunCourseId())) {
            return false;
        }
        return a(workoutRecordAcquireWorkoutRecordByExerciseTime);
    }

    private boolean a(WorkoutRecord workoutRecord) {
        List<RecordAction> listC = c(workoutRecord.acquireActionSummary());
        if (njy.e(listC)) {
            LogUtil.e("Track_CourseActionViewHolder", "updateActionsName mRecordActions is empty");
            return false;
        }
        HashMap map = new HashMap();
        for (RecordAction recordAction : listC) {
            if (recordAction != null && recordAction.getActionId() != null) {
                int iB = new gzy().b(recordAction.getActionId().trim());
                if (iB != 0) {
                    map.put(recordAction.getActionId(), this.d.getString(iB));
                } else {
                    map.put(recordAction.getActionId(), recordAction.getActionName());
                }
                recordAction.setActionName((String) map.get(recordAction.getActionId()));
            }
        }
        return a(listC);
    }

    private boolean a(List<RecordAction> list) {
        if (list == null || list.size() <= 0) {
            return false;
        }
        this.f11386c.setVisibility(0);
        e(list);
        this.e.getAdapter().notifyDataSetChanged();
        return true;
    }

    private void e(List<RecordAction> list) {
        PluginSuggestion pluginSuggestion = (PluginSuggestion) Services.d("PluginFitnessAdvice", PluginSuggestion.class);
        if (pluginSuggestion != null) {
            this.e.setAdapter(pluginSuggestion.getBaseRecyclerViewAdapter(list));
        }
    }

    private List<RecordAction> c(String str) {
        if (str == null) {
            return Collections.EMPTY_LIST;
        }
        return peh.c(str, RecordAction[].class);
    }

    public TrainingResultsView a(boolean z) {
        TrainingResultsView trainingResultsView = new TrainingResultsView(this.d);
        WorkoutRecord workoutRecord = this.f11385b;
        if (workoutRecord == null) {
            trainingResultsView.setVisibility(8);
            return trainingResultsView;
        }
        trainingResultsView.setCourseName(workoutRecord.acquireWorkoutName());
        trainingResultsView.setCourseDifficulty(iec.c(this.f11385b.acquireDifficulty()));
        trainingResultsView.setCourseDuration(gzx.c(this.d, R.string.sug_fitness_min, ped.m(this.f11385b.acquireCourseDuration())));
        trainingResultsView.setCourseFinish(this.f11385b.acquireFinishRate());
        trainingResultsView.setHealthDivider(z);
        return trainingResultsView;
    }
}
