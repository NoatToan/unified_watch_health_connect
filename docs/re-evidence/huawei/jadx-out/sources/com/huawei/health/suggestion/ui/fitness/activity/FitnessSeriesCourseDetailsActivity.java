package com.huawei.health.suggestion.ui.fitness.activity;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.course.api.CourseApi;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.ui.BaseStateActivity;
import com.huawei.health.suggestion.ui.fitness.adapter.FitSeriesCourseDetialsAdapter;
import com.huawei.health.suggestion.ui.view.FitnessEmptyView;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnessadvice.Workout;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import defpackage.btt;
import defpackage.ien;
import defpackage.pea;
import defpackage.qrs;
import health.compact.a.Services;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class FitnessSeriesCourseDetailsActivity extends BaseStateActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f9111a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private FitnessEmptyView f9112b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthRecycleView f9113c;
    private FitSeriesCourseDetialsAdapter d;
    private Context e;
    private CustomTitleBar f;
    private int g;
    private String h;
    private HealthTextView i;
    private String j;

    static /* synthetic */ int f(FitnessSeriesCourseDetailsActivity fitnessSeriesCourseDetailsActivity) {
        int i = fitnessSeriesCourseDetailsActivity.f9111a;
        fitnessSeriesCourseDetailsActivity.f9111a = i + 1;
        return i;
    }

    @Override // com.huawei.health.suggestion.ui.BaseStateActivity, com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.e = this;
        FitSeriesCourseDetialsAdapter fitSeriesCourseDetialsAdapter = new FitSeriesCourseDetialsAdapter(this.f9113c);
        this.d = fitSeriesCourseDetialsAdapter;
        this.f9113c.setAdapter(fitSeriesCourseDetialsAdapter);
        ien.b(this.e, this.f9113c);
        this.d.b(new FitSeriesCourseDetialsAdapter.LoadMoreCourseDetialsListener() { // from class: com.huawei.health.suggestion.ui.fitness.activity.FitnessSeriesCourseDetailsActivity.3
            @Override // com.huawei.health.suggestion.ui.fitness.adapter.FitSeriesCourseDetialsAdapter.LoadMoreCourseDetialsListener
            public void loadMore() {
                FitnessSeriesCourseDetailsActivity.this.b();
            }
        });
    }

    @Override // com.huawei.health.suggestion.ui.BaseStateActivity
    public void initLayout() {
        setContentView(R.layout.sug_activity_series_course_details);
    }

    @Override // com.huawei.health.suggestion.ui.BaseStateActivity
    public void initViewController() {
        this.f9113c = (HealthRecycleView) findViewById(R.id.recyclerview_series_course_details);
        this.f = (CustomTitleBar) findViewById(R.id.tv_title_train);
        this.i = (HealthTextView) findViewById(R.id.tv_description);
        this.f9112b = (FitnessEmptyView) findViewById(R.id.sug_series_course_empty_view);
        setViewSafeRegion(true, this.f9113c);
    }

    @Override // com.huawei.health.suggestion.ui.BaseStateActivity
    public void initData() {
        Intent intent = getIntent();
        if (intent == null) {
            LogUtil.j("Sug_FitnessSeriesCourseDetailsActivity", "initData(),intent is null");
            return;
        }
        this.g = intent.getIntExtra("intent_key_topicid", -1);
        this.h = intent.getStringExtra("intent_key_topicname");
        this.j = intent.getStringExtra("intent_key_description");
        FitSeriesCourseDetialsAdapter fitSeriesCourseDetialsAdapter = this.d;
        if (fitSeriesCourseDetialsAdapter != null) {
            fitSeriesCourseDetialsAdapter.a(this.h);
        }
        runOnUiThread(new Runnable() { // from class: com.huawei.health.suggestion.ui.fitness.activity.FitnessSeriesCourseDetailsActivity.5
            @Override // java.lang.Runnable
            public void run() {
                FitnessSeriesCourseDetailsActivity.this.f.setTitleText(TextUtils.isEmpty(FitnessSeriesCourseDetailsActivity.this.h) ? "" : FitnessSeriesCourseDetailsActivity.this.h);
                if (TextUtils.isEmpty(FitnessSeriesCourseDetailsActivity.this.j)) {
                    FitnessSeriesCourseDetailsActivity.this.i.setVisibility(8);
                } else {
                    FitnessSeriesCourseDetailsActivity.this.i.setText(FitnessSeriesCourseDetailsActivity.this.j);
                }
            }
        });
        int i = this.g;
        LogUtil.a("Sug_FitnessSeriesCourseDetailsActivity", "mTopicId:", Integer.valueOf(i), "-mTopicName:", this.h);
        c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        btt.d().c(new Runnable() { // from class: hgc
            @Override // java.lang.Runnable
            public final void run() {
                this.f36719c.c();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void c() {
        LogUtil.a("Sug_FitnessSeriesCourseDetailsActivity", "getDetailsWorkoutsByTopicIdAndRefresh(), mPage=", Integer.valueOf(this.f9111a), "mTopicId=", Integer.valueOf(this.g));
        CourseApi courseApi = (CourseApi) Services.d("CoursePlanService", CourseApi.class);
        if (courseApi == null) {
            LogUtil.j("Sug_FitnessSeriesCourseDetailsActivity", "getDetailsWorkoutsByTopicIdAndRefresh : courseApi is null.");
        } else {
            courseApi.getCoursesByTopicId(this.f9111a, this.g, new UiCallback<List<Workout>>() { // from class: com.huawei.health.suggestion.ui.fitness.activity.FitnessSeriesCourseDetailsActivity.1
                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                public void onFailure(int i, String str) {
                    LogUtil.e("Sug_FitnessSeriesCourseDetailsActivity", "getDetailsWorkoutsByTopicIdAndRefresh(), load data failed");
                    FitnessSeriesCourseDetailsActivity.this.d.e(null);
                    FitnessSeriesCourseDetailsActivity.this.f9112b.b();
                }

                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
                public void onSuccess(List<Workout> list) {
                    LogUtil.d("Sug_FitnessSeriesCourseDetailsActivity", "getDetailsWorkoutsByTopicIdAndRefresh(),load data success");
                    FitnessSeriesCourseDetailsActivity.f(FitnessSeriesCourseDetailsActivity.this);
                    FitnessSeriesCourseDetailsActivity.this.d.e(pea.b(list));
                    FitnessSeriesCourseDetailsActivity.this.f9112b.e();
                }
            });
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
        d();
        HealthRecycleView healthRecycleView = this.f9113c;
        if (healthRecycleView == null || this.d == null) {
            return;
        }
        healthRecycleView.setAdapter(null);
        this.f9113c.setLayoutManager(null);
        this.f9113c.setAdapter(this.d);
        ien.b(this.e, this.f9113c);
        this.d.notifyDataSetChanged();
    }

    private void d() {
        if (!qrs.t()) {
            LogUtil.d("Sug_FitnessSeriesCourseDetailsActivity", "adaptMateX(),is not adaptMateX");
            return;
        }
        qrs.a(getBaseContext(), true, true, (CustomTitleBar) findViewById(R.id.tv_title), (HealthTextView) findViewById(R.id.tv_description));
    }
}
