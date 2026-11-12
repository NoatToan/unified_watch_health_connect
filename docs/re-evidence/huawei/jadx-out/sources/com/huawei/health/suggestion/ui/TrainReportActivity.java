package com.huawei.health.suggestion.ui;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.basefitnessadvice.model.Plan;
import com.huawei.basefitnessadvice.model.PlanRecord;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.course.api.CourseApi;
import com.huawei.health.plan.api.PlanApi;
import com.huawei.health.plan.model.PlanStat;
import com.huawei.health.sport.model.WorkoutRecord;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.ui.run.adapter.TrainReportAdapter;
import com.huawei.health.userprofilemgr.api.UserProfileMgrApi;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.up.model.UserInfomation;
import defpackage.gzx;
import defpackage.ibl;
import defpackage.idy;
import defpackage.pei;
import defpackage.qre;
import health.compact.a.LogAnonymous;
import health.compact.a.Services;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class TrainReportActivity extends BaseCloudActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private PlanRecord f9016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CustomTitleBar f9017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Plan f9018c;
    private boolean d;
    private LinearLayout e;
    private PlanStat g;
    private HealthRecycleView i;
    private List<WorkoutRecord> j;

    @Override // com.huawei.health.suggestion.ui.BaseCloudActivity
    protected void bindView() {
        setContentView(R.layout.sug_train_report);
        this.e = (LinearLayout) findViewById(R.id.sug_ll_load);
        this.i = (HealthRecycleView) findViewById(R.id.sug_rcv_report);
        this.f9017b = (CustomTitleBar) findViewById(R.id.sug_titleBar);
    }

    @Override // com.huawei.health.suggestion.ui.BaseCloudActivity
    protected void preInitCloudData() {
        Intent intent = getIntent();
        if (intent != null) {
            try {
                if (intent.getParcelableExtra("plan") != null) {
                    this.f9018c = (Plan) intent.getParcelableExtra("plan");
                }
            } catch (Exception e) {
                LogUtil.e("Suggestion_TrainReportActivity", LogAnonymous.b(e));
            }
        }
        if (this.f9018c == null) {
            this.f9018c = b(this);
        }
    }

    public static Plan b(Context context) {
        Plan planE = ibl.e();
        if (planE != null) {
            return planE;
        }
        Plan plan = new Plan();
        plan.putName(pei.c(context, R.string.sug_no_plan, new Object[0]));
        return plan;
    }

    @Override // com.huawei.health.suggestion.ui.BaseCloudActivity
    protected void registerUiCallback() {
        registerUiCallback(1, new b(this));
    }

    static class b extends UiCallback<List<WorkoutRecord>> {
        private WeakReference<TrainReportActivity> e;

        b(TrainReportActivity trainReportActivity) {
            this.e = null;
            this.e = new WeakReference<>(trainReportActivity);
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public void onFailure(int i, String str) {
            LogUtil.j("Suggestion_TrainReportActivity", Integer.valueOf(i), str);
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onSuccess(List<WorkoutRecord> list) {
            TrainReportActivity trainReportActivity = this.e.get();
            if (trainReportActivity != null) {
                trainReportActivity.j = list;
            }
        }
    }

    @Override // com.huawei.health.suggestion.ui.BaseCloudActivity
    protected void initCloudData() {
        try {
            CourseApi courseApi = (CourseApi) Services.d("CoursePlanService", CourseApi.class);
            if (courseApi != null) {
                this.j = courseApi.getWorkoutRecords(this.f9018c.acquireId(), getUiCallback(1));
            }
        } catch (Exception unused) {
            LogUtil.e("Suggestion_TrainReportActivity", "initCloudData failed");
            finish();
        }
    }

    @Override // com.huawei.health.suggestion.ui.BaseCloudActivity
    protected void initLocalData() {
        LogUtil.a("Suggestion_TrainReportActivity", "initLocalData enter");
        Intent intent = getIntent();
        if (intent != null) {
            this.d = intent.getBooleanExtra("finish_plan", false);
        }
        UserProfileMgrApi userProfileMgrApi = (UserProfileMgrApi) Services.d("HWUserProfileMgr", UserProfileMgrApi.class);
        if (userProfileMgrApi == null) {
            LogUtil.j("Suggestion_TrainReportActivity", "initLocalData : userProfileMgrApi is null.");
            return;
        }
        UserInfomation userInfo = userProfileMgrApi.getUserInfo();
        if (userInfo == null) {
            LogUtil.j("Suggestion_TrainReportActivity", "initLocalData null of userInfo");
            finish();
            return;
        }
        PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
        if (planApi == null) {
            LogUtil.j("Suggestion_TrainReportActivity", "initLocalData : planApi is null.");
            return;
        }
        if (this.f9018c.acquireType() == 3) {
            planApi.setPlanType(3);
            this.g = planApi.getPlanBestRecord(this.f9018c.acquireId(), userInfo.getWeightOrDefaultValue());
            this.f9016a = planApi.getPlanProgress(this.f9018c.acquireId(), false);
        } else {
            planApi.setPlanType(0);
            this.g = planApi.getPlanBestRecord(this.f9018c.acquireId(), 0.0f);
            this.f9016a = planApi.getPlanProgress(this.f9018c.acquireId(), true);
        }
        d();
    }

    @Override // com.huawei.health.suggestion.ui.BaseCloudActivity
    public void initLayout() {
        this.e.setVisibility(8);
        this.i.setLayoutManager(new LinearLayoutManager(this));
        this.f9017b.setTitleText(gzx.c(this, R.string.sug_report_t, this.f9018c.acquireName()));
        this.f9017b.setRightButtonDrawable(getResources().getDrawable(com.huawei.ui.commonui.R.drawable.ic_health_nav_share_black), qre.f(com.huawei.ui.commonui.R.string.accessibility_share));
    }

    @Override // com.huawei.health.suggestion.ui.BaseCloudActivity
    public void initViewController() {
        if (isFinishing()) {
            return;
        }
        if (this.g == null) {
            finish();
        } else {
            this.i.setAdapter(new TrainReportAdapter(this, this.f9018c, this.g, this.f9016a, this.j));
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
        initViewController();
    }

    private void d() {
        if (this.f9018c.acquireType() == 0) {
            e();
        } else {
            c();
        }
    }

    private void c() {
        PlanStat planStat;
        HashMap map = new HashMap(10);
        JSONObject jSONObject = new JSONObject();
        try {
            PlanRecord planRecord = this.f9016a;
            if (planRecord == null) {
                planRecord = new PlanRecord();
            }
            jSONObject.put("type", this.f9018c.acquireType());
            if (idy.d()) {
                jSONObject.put("finish_rate", idy.c(planRecord.acquireFinishRate()));
            }
            if (idy.d() && (planStat = this.g) != null) {
                jSONObject.put("highest_complete_rate", idy.c(planStat.getHighestCompleteRate()));
            }
            map.put("data", jSONObject.toString());
            idy.b("1120010", map);
        } catch (JSONException e) {
            LogUtil.e("Suggestion_TrainReportActivity", "fitnessTrainReportBi exception = ", LogAnonymous.b(e));
        }
    }

    private void e() {
        HashMap map = new HashMap(10);
        JSONObject jSONObject = new JSONObject();
        try {
            PlanRecord planRecord = this.f9016a;
            if (planRecord == null) {
                planRecord = new PlanRecord();
            }
            if (idy.d()) {
                jSONObject.put("finish_rate", idy.c(planRecord.acquireFinishRate()));
            }
            jSONObject.put("type", this.f9018c.acquireType());
            map.put("data", jSONObject.toString());
            idy.b("1120010", map);
        } catch (JSONException e) {
            LogUtil.e("Suggestion_TrainReportActivity", "runTrainReportBi exception = ", LogAnonymous.b(e));
        }
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        boolean z = this.d;
        if (z) {
            LogUtil.a("Suggestion_TrainReportActivity", "finish", Boolean.valueOf(z));
        }
    }
}
