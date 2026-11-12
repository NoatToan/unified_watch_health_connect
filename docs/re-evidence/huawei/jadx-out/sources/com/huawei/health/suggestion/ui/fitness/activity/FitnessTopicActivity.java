package com.huawei.health.suggestion.ui.fitness.activity;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import com.amap.api.maps.model.MyLocationStyle;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.basefitnessadvice.model.Topic;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.course.api.CourseApi;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.ui.BaseStateActivity;
import com.huawei.health.suggestion.ui.fitness.activity.fragment.FitnessTopicFragment;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.subtab.HealthSubTabWidget;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.commonui.viewpager.HealthViewPager;
import defpackage.btx;
import defpackage.hjs;
import defpackage.idy;
import defpackage.qpn;
import defpackage.xfz;
import health.compact.a.Services;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class FitnessTopicActivity extends BaseStateActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f9114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private qpn f9115b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthSubTabWidget f9116c;
    private HealthViewPager d;
    private CustomTitleBar e;
    private int f;
    private String i;

    @Override // com.huawei.health.suggestion.ui.BaseStateActivity, com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setFlags(16777216, 16777216);
        LogUtil.a("Suggestion_FitnessTopicActivity", "Lifecycle: onCreate()");
    }

    @Override // com.huawei.health.suggestion.ui.BaseStateActivity
    public void initViewController() {
        LogUtil.a("Suggestion_FitnessTopicActivity", "initViewController()");
    }

    @Override // com.huawei.health.suggestion.ui.BaseStateActivity
    public void initLayout() {
        setContentView(R.layout.sug_activity_fit_topic);
        this.e = (CustomTitleBar) findViewById(R.id.custom_titlebar);
        this.f9116c = (HealthSubTabWidget) findViewById(R.id.sug_detail_tab);
        this.d = (HealthViewPager) findViewById(R.id.sug_detail_vp);
        e();
        c();
    }

    @Override // com.huawei.health.suggestion.ui.BaseStateActivity
    public void initData() {
        LogUtil.a("Suggestion_FitnessTopicActivity", "initData()");
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override // com.huawei.health.suggestion.ui.BaseStateActivity, com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        LogUtil.a("Suggestion_FitnessTopicActivity", "Lifecycle: onDestroy()");
        hjs.b().e();
        b();
        super.onDestroy();
    }

    public CustomTitleBar d() {
        return this.e;
    }

    public HealthViewPager a() {
        return this.d;
    }

    private void c() {
        this.f9115b = new qpn(this, this.d, this.f9116c);
        this.f9116c.setVisibility(8);
        xfz xfzVarF = this.f9116c.f();
        Intent intent = getIntent();
        if (intent != null && "warm_up_and_stretch".equals(intent.getStringExtra("entrance"))) {
            this.f9115b.b(xfzVarF, FitnessTopicFragment.a(8), false);
        } else {
            this.f9115b.b(xfzVarF, FitnessTopicFragment.a(0), false);
        }
    }

    private void b() {
        HashMap map = new HashMap(2);
        map.put("topic_name", this.i);
        map.put("stay_time", Long.valueOf(System.currentTimeMillis() - this.f9114a));
        idy.b("1130016", map);
    }

    private void e() {
        Intent intent = getIntent();
        if (intent == null) {
            return;
        }
        this.f9114a = System.currentTimeMillis();
        this.f = intent.getIntExtra("intent_key_topicid", -1);
        if (intent.getStringExtra("intent_key_topicname") != null) {
            this.i = intent.getStringExtra("intent_key_topicname");
        } else {
            this.i = "";
        }
        int i = this.f;
        LogUtil.a("Suggestion_FitnessTopicActivity", "mTopicId:", Integer.valueOf(i), "-mTopicName:", this.i);
        if (this.f != -1) {
            i();
        } else {
            this.e.setTitleText(btx.c().getString(R.string.IDS_FitnessAdvice_previous_train));
        }
        LogUtil.a("Suggestion_FitnessTopicActivity", "mTopicName = ", this.i);
        LogUtil.a("Suggestion_FitnessTopicActivity", "mTopicId = ", Integer.valueOf(this.f));
    }

    private void i() {
        String str = this.i;
        if (str == null || str.isEmpty()) {
            c cVar = new c(this);
            CourseApi courseApi = (CourseApi) Services.d("CoursePlanService", CourseApi.class);
            if (courseApi != null) {
                courseApi.getCourseTopicList(0, cVar);
                return;
            }
            return;
        }
        j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        this.e.setTitleText(this.i);
    }

    /* JADX INFO: loaded from: classes9.dex */
    static class c extends UiCallback<List<Topic>> {
        WeakReference<FitnessTopicActivity> d;

        c(FitnessTopicActivity fitnessTopicActivity) {
            this.d = new WeakReference<>(fitnessTopicActivity);
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public void onFailure(int i, String str) {
            LogUtil.j("Suggestion_FitnessTopicActivity", "GetTopicNameCallBack on failure ", "errorCode:", Integer.valueOf(i), MyLocationStyle.ERROR_INFO, str);
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onSuccess(List<Topic> list) {
            if (list == null) {
                LogUtil.j("Suggestion_FitnessTopicActivity", "GetTopicNameCallBack onSuccess topic data null");
                return;
            }
            WeakReference<FitnessTopicActivity> weakReference = this.d;
            if (weakReference == null || weakReference.get() == null) {
                LogUtil.j("Suggestion_FitnessTopicActivity", "mWeakReference is null");
                return;
            }
            final FitnessTopicActivity fitnessTopicActivity = this.d.get();
            for (final Topic topic : list) {
                if (topic != null && topic.acquireId() == fitnessTopicActivity.f) {
                    fitnessTopicActivity.runOnUiThread(new Runnable() { // from class: com.huawei.health.suggestion.ui.fitness.activity.FitnessTopicActivity.c.1
                        @Override // java.lang.Runnable
                        public void run() {
                            fitnessTopicActivity.i = topic.acquireName();
                            fitnessTopicActivity.j();
                        }
                    });
                    return;
                }
            }
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
