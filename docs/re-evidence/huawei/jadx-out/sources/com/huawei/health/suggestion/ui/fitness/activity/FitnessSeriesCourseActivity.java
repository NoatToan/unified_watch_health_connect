package com.huawei.health.suggestion.ui.fitness.activity;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.LinearLayout;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.basefitnessadvice.model.Topic;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.course.api.CourseApi;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.ui.BaseStateActivity;
import com.huawei.health.suggestion.ui.fitness.adapter.FitSeriesCourseAdapter;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import defpackage.btt;
import defpackage.ien;
import health.compact.a.Services;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class FitnessSeriesCourseActivity extends BaseStateActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f9107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f9108b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthRecycleView f9109c;
    private FitSeriesCourseAdapter d;
    private LinearLayout e;

    static /* synthetic */ int d(FitnessSeriesCourseActivity fitnessSeriesCourseActivity) {
        int i = fitnessSeriesCourseActivity.f9108b;
        fitnessSeriesCourseActivity.f9108b = i + 1;
        return i;
    }

    @Override // com.huawei.health.suggestion.ui.BaseStateActivity, com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f9107a = this;
        FitSeriesCourseAdapter fitSeriesCourseAdapter = new FitSeriesCourseAdapter(this.f9109c);
        this.d = fitSeriesCourseAdapter;
        this.f9109c.setAdapter(fitSeriesCourseAdapter);
        ien.b(this.f9107a, this.f9109c);
        this.d.c(new FitSeriesCourseAdapter.LoadMoreCourseListener() { // from class: com.huawei.health.suggestion.ui.fitness.activity.FitnessSeriesCourseActivity.3
            @Override // com.huawei.health.suggestion.ui.fitness.adapter.FitSeriesCourseAdapter.LoadMoreCourseListener
            public void loadMore() {
                FitnessSeriesCourseActivity.this.d();
            }
        });
    }

    @Override // com.huawei.health.suggestion.ui.BaseStateActivity
    public void initLayout() {
        setContentView(R.layout.sug_activity_series_course);
    }

    @Override // com.huawei.health.suggestion.ui.BaseStateActivity
    public void initViewController() {
        this.f9109c = (HealthRecycleView) findViewById(R.id.recyclerview_series_course);
        this.e = (LinearLayout) findViewById(R.id.series_course);
    }

    @Override // com.huawei.health.suggestion.ui.BaseStateActivity
    public void initData() {
        e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void e() {
        LogUtil.a("FitnessSeriesCourseActivity", "getSeriesCourseDateAndRefresh(), mPager=", Integer.valueOf(this.f9108b));
        CourseApi courseApi = (CourseApi) Services.d("CoursePlanService", CourseApi.class);
        if (courseApi == null) {
            LogUtil.j("FitnessSeriesCourseActivity", "getSeriesCourseDateAndRefresh : courseApi is null.");
        } else {
            courseApi.getCourseTopicList(this.f9108b, new e(this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        btt.d().c(new Runnable() { // from class: hga
            @Override // java.lang.Runnable
            public final void run() {
                this.f36718a.e();
            }
        });
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
        HealthRecycleView healthRecycleView = this.f9109c;
        if (healthRecycleView == null || this.d == null) {
            return;
        }
        healthRecycleView.setAdapter(null);
        this.f9109c.setLayoutManager(null);
        this.f9109c.setAdapter(this.d);
        ien.b(this.f9107a, this.f9109c);
        this.d.notifyDataSetChanged();
    }

    static class e extends UiCallback<List<Topic>> {
        WeakReference<FitnessSeriesCourseActivity> e;

        e(FitnessSeriesCourseActivity fitnessSeriesCourseActivity) {
            this.e = new WeakReference<>(fitnessSeriesCourseActivity);
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public void onFailure(int i, String str) {
            LogUtil.e("FitnessSeriesCourseActivity", "GetTopicCallback, load data failed");
            FitnessSeriesCourseActivity fitnessSeriesCourseActivity = this.e.get();
            if (fitnessSeriesCourseActivity != null) {
                fitnessSeriesCourseActivity.e.setVisibility(0);
                fitnessSeriesCourseActivity.d.c((List<Topic>) null);
            } else {
                LogUtil.j("FitnessSeriesCourseActivity", "FitnessSeriesCourseActivity is null");
            }
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onSuccess(List<Topic> list) {
            LogUtil.d("FitnessSeriesCourseActivity", "GetTopicCallback,load data success");
            FitnessSeriesCourseActivity fitnessSeriesCourseActivity = this.e.get();
            if (fitnessSeriesCourseActivity == null) {
                LogUtil.j("FitnessSeriesCourseActivity", "FitnessSeriesCourseActivity is null");
            } else {
                FitnessSeriesCourseActivity.d(fitnessSeriesCourseActivity);
                fitnessSeriesCourseActivity.d.c(list);
            }
        }
    }
}
