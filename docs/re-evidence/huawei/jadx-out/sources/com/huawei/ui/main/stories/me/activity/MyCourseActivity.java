package com.huawei.ui.main.stories.me.activity;

import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.basefitnessadvice.model.intplan.IntPlan;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.course.api.CourseApi;
import com.huawei.health.marketing.views.MarketingView;
import com.huawei.health.plan.api.PlanApi;
import com.huawei.health.plan.model.trainingplan.SmartPlanTypeEnum;
import com.huawei.health.suggestion.util.FitnessItemDecoration;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.pluginfitnessadvice.FitWorkout;
import com.huawei.pluginfitnessadvice.Workout;
import com.huawei.pluginfitnessadvice.WorkoutPackageInfo;
import com.huawei.pluginfitnessadvice.audio.SleepAudioSeries;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.recycleview.HealthLinearLayoutManager;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.me.adapter.MyCourseAdapter;
import defpackage.gzc;
import defpackage.njy;
import defpackage.pea;
import defpackage.qrs;
import defpackage.wtb;
import health.compact.a.Services;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class MyCourseActivity extends BaseActivity {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthRecycleView f28424b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private MyCourseAdapter f28425c;

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.hw_show_my_course);
        this.f28424b = (HealthRecycleView) findViewById(R.id.my_course);
        this.f28425c = new MyCourseAdapter(this);
        b();
        HealthLinearLayoutManager healthLinearLayoutManager = new HealthLinearLayoutManager(this) { // from class: com.huawei.ui.main.stories.me.activity.MyCourseActivity.1
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public boolean canScrollVertically() {
                return false;
            }
        };
        healthLinearLayoutManager.setOrientation(1);
        this.f28424b.setLayoutManager(healthLinearLayoutManager);
        this.f28424b.addItemDecoration(new FitnessItemDecoration(this, 0, qrs.e(this, getResources().getDimension(R.dimen.cardMarginMiddle))));
        this.f28424b.setAdapter(this.f28425c);
        a();
    }

    private void b() {
        MarketingView marketingView = new MarketingView(this);
        marketingView.setInvalidateCallback(new IBaseResponseCallback() { // from class: vty
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.f51590a.b(i, obj);
            }
        });
        marketingView.d(4159);
        this.f28425c.addBottomView(marketingView);
    }

    public /* synthetic */ void b(int i, Object obj) {
        this.f28425c.notifyDataSetChanged();
    }

    private void a() {
        if (LoginInit.getInstance(this).isBrowseMode()) {
            LogUtil.j("Suggestion_MyCourseActivity", "isBrowseMode");
        } else {
            ThreadPoolManager.c().execute(new Runnable() { // from class: vtu
                @Override // java.lang.Runnable
                public final void run() {
                    this.d.e();
                }
            });
        }
    }

    public /* synthetic */ void e() {
        CourseApi courseApi = (CourseApi) Services.d("CoursePlanService", CourseApi.class);
        if (courseApi == null) {
            LogUtil.j("Suggestion_MyCourseActivity", "getCourseData : courseApi is null");
            return;
        }
        c();
        d(courseApi, 0);
        d(courseApi, 1, "");
    }

    private void c() {
        PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
        if (planApi == null) {
            LogUtil.j("Suggestion_MyCourseActivity", "initCurrentPlanData, PlanApi is null.");
            this.f28425c.d("invalidUrl", 0);
            return;
        }
        IntPlan currentAllPlan = planApi.getCurrentAllPlan();
        if (currentAllPlan == null) {
            LogUtil.j("Suggestion_MyCourseActivity", "getCurrentIntPlan, data is null.");
            this.f28425c.d("invalidUrl", 0);
            return;
        }
        if (currentAllPlan.getSmartPlanType() == SmartPlanTypeEnum.SMART_TRAINING_PLAN.getValue()) {
            this.f28425c.d("smartTrainPlanUrl" + wtb.b(currentAllPlan.getSmartTrainPlanType()), 0);
            return;
        }
        if (currentAllPlan.getSmartPlanType() == SmartPlanTypeEnum.SMART_WEIGHT_PLAN.getValue()) {
            this.f28425c.d("smartTrainPlanUrl" + R.drawable.ic_smart_weight_plan, 0);
            return;
        }
        if (currentAllPlan.getMetaInfo() == null) {
            LogUtil.j("Suggestion_MyCourseActivity", "getCurrentIntPlan, data.getMetaInfo() is null.");
            this.f28425c.d("invalidUrl", 0);
        } else {
            this.f28425c.d(currentAllPlan.getMetaInfo().getPicture(), 0);
        }
    }

    private void d(CourseApi courseApi, int i, String str) {
        courseApi.getUserCourseList(0, 1, i, str, new UiCallback<List<Workout>>() { // from class: com.huawei.ui.main.stories.me.activity.MyCourseActivity.3
            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            public void onFailure(int i2, String str2) {
                LogUtil.e("Suggestion_MyCourseActivity", "getUsedCourseData onFailure: ", Integer.valueOf(i2), " : ", str2);
                MyCourseActivity.this.f28425c.d("invalidUrl", 1);
            }

            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onSuccess(List<Workout> list) {
                String topicPreviewPicUrl;
                if (njy.e(list)) {
                    LogUtil.a("Suggestion_MyCourseActivity", "CollectionUtils.isEmpty(workouts)");
                    MyCourseActivity.this.f28425c.d("invalidUrl", 1);
                    return;
                }
                Workout workout = list.get(0);
                if (workout == null) {
                    LogUtil.j("Suggestion_MyCourseActivity", "showCourseWorkout workout is null");
                    MyCourseActivity.this.f28425c.d("invalidUrl", 1);
                    return;
                }
                FitWorkout fitWorkoutD = pea.d(workout);
                if (fitWorkoutD != null) {
                    if (fitWorkoutD.getCourseDefineType() == 1) {
                        MyCourseActivity.this.f28425c.d(MyCourseAdapter.b(fitWorkoutD.acquireId()), 1);
                        return;
                    }
                    topicPreviewPicUrl = fitWorkoutD.getTopicPreviewPicUrl();
                } else {
                    WorkoutPackageInfo workoutPackageInfoA = pea.a(workout);
                    if (workoutPackageInfoA == null) {
                        LogUtil.j("Suggestion_MyCourseActivity", "setWorkoutPackageInfo workout is null");
                        MyCourseActivity.this.f28425c.d("invalidUrl", 1);
                        return;
                    } else {
                        String squarePicture = workoutPackageInfoA.getSquarePicture();
                        topicPreviewPicUrl = TextUtils.isEmpty(squarePicture) ? workoutPackageInfoA.getTopicPreviewPicUrl() : squarePicture;
                    }
                }
                if (!TextUtils.isEmpty(topicPreviewPicUrl)) {
                    MyCourseActivity.this.f28425c.d(topicPreviewPicUrl, 1);
                } else {
                    LogUtil.j("Suggestion_MyCourseActivity", "SportCourse workout is null");
                    MyCourseActivity.this.f28425c.d("invalidUrl", 1);
                }
            }
        });
    }

    private void d(CourseApi courseApi, int i) {
        courseApi.getAudioBehaviorList(new gzc.b().c(1).e(2).a(i).d(1).b(1).c(), new UiCallback<List<SleepAudioSeries>>() { // from class: com.huawei.ui.main.stories.me.activity.MyCourseActivity.4
            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            public void onFailure(int i2, String str) {
                LogUtil.e("Suggestion_MyCourseActivity", "initSleepCourseData onFailure: ", Integer.valueOf(i2), " : ", str);
                MyCourseActivity.this.f28425c.d("invalidUrl", 2);
            }

            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public void onSuccess(List<SleepAudioSeries> list) {
                if (list == null || list.size() <= 0) {
                    LogUtil.j("Suggestion_MyCourseActivity", "initSleepCourseData sleepAudioSeriesList == null");
                    MyCourseActivity.this.f28425c.d("invalidUrl", 2);
                } else {
                    if (list.get(0) == null) {
                        MyCourseActivity.this.f28425c.d("invalidUrl", 2);
                        return;
                    }
                    String smallImage = list.get(0).getSmallImage();
                    boolean zIsEmpty = TextUtils.isEmpty(smallImage);
                    LogUtil.a("Suggestion_MyCourseActivity", "isEmptyUrl = ", Boolean.valueOf(zIsEmpty));
                    MyCourseActivity.this.f28425c.d(zIsEmpty ? "invalidUrl" : smallImage, 2);
                }
            }
        });
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        LogUtil.a("Suggestion_MyCourseActivity", " onResume");
        MyCourseAdapter myCourseAdapter = this.f28425c;
        if (myCourseAdapter == null || !myCourseAdapter.d()) {
            return;
        }
        a();
        this.f28425c.b(false);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
