package com.huawei.health.suggestion.ui;

import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.PointF;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.basefitnessadvice.model.Plan;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.basefitnessadvice.R;
import com.huawei.health.course.api.CourseApi;
import com.huawei.health.plan.api.PlanApi;
import com.huawei.health.sport.model.WorkoutRecord;
import com.huawei.health.suggestion.ui.fitness.activity.fragment.TrainEventBaseFragment;
import com.huawei.hihealthservice.db.table.DBSessionCommon;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.subtab.HealthSubTabWidget;
import com.huawei.ui.commonui.toolbar.HealthToolBar;
import com.huawei.ui.commonui.viewpager.HealthViewPager;
import defpackage.qpn;
import defpackage.xfz;
import defpackage.xkd;
import health.compact.a.Services;
import health.compact.a.utils.StringUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class TrainEventActivity extends BaseStateActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private xfz f9011a;
    private qpn d;
    private Plan e;
    private String[] f;
    private HealthSubTabWidget g;
    private String h;
    private HealthViewPager i;
    private int j;
    private int k;
    private xfz l;
    private xfz o;
    private List<TrainEventBaseFragment> n = new ArrayList(10);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private PointF f9012b = new PointF(0.0f, 0.0f);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f9013c = true;

    @Override // com.huawei.health.suggestion.ui.BaseStateActivity
    protected int setLoadingBackgroundColor() {
        return 0;
    }

    @Override // com.huawei.health.suggestion.ui.BaseStateActivity, com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setFlags(16777216, 16777216);
    }

    @Override // com.huawei.health.suggestion.ui.BaseStateActivity
    public int getLoadingLayoutId() {
        return R.layout.sug_loading_layout;
    }

    @Override // com.huawei.health.suggestion.ui.BaseStateActivity
    public void initLayout() {
        setContentView(com.huawei.health.suggestion.R.layout.sug_activity_train_event2);
        this.k = ViewConfiguration.get(getApplicationContext()).getScaledTouchSlop();
    }

    @Override // com.huawei.health.suggestion.ui.BaseStateActivity
    public void initViewController() {
        HealthToolBar healthToolBar = (HealthToolBar) findViewById(com.huawei.health.suggestion.R.id.tool_bar);
        healthToolBar.d(View.inflate(this, com.huawei.ui.commonui.R.layout.hw_toolbar_bottomview, null));
        healthToolBar.setIconTitle(2, getString(com.huawei.health.suggestion.R.string.sug_train_event_report));
        if (xkd.b()) {
            healthToolBar.setIcon(2, com.huawei.health.suggestion.R.drawable.sug_event_w_report);
        } else {
            healthToolBar.setIcon(2, com.huawei.health.suggestion.R.drawable.ic_health_toolbar_report);
        }
        healthToolBar.a(this);
        healthToolBar.setOnSingleTapListener(new HealthToolBar.OnSingleTapListener() { // from class: com.huawei.health.suggestion.ui.TrainEventActivity.1
            @Override // com.huawei.ui.commonui.toolbar.HealthToolBar.OnSingleTapListener
            public void onSingleTap(int i) {
                Intent intent = new Intent(TrainEventActivity.this.getApplicationContext(), (Class<?>) TrainReportActivity.class);
                intent.putExtra("plan", TrainEventActivity.this.e);
                TrainEventActivity.this.startActivity(intent);
            }
        });
        HealthViewPager healthViewPager = (HealthViewPager) findViewById(com.huawei.health.suggestion.R.id.sug_train_event_vp);
        this.i = healthViewPager;
        BaseActivity.cancelLayoutById(healthViewPager);
        this.i.setIsScroll(false);
        this.g = (HealthSubTabWidget) findViewById(com.huawei.health.suggestion.R.id.sug_event_pst);
        this.f = new String[]{getString(com.huawei.health.suggestion.R.string.sug_train_event_week), getString(com.huawei.health.suggestion.R.string.sug_train_event_month), getString(com.huawei.health.suggestion.R.string.sug_train_event_total)};
        this.d = new qpn(this, this.i, this.g);
        this.l = this.g.b(this.f[0]);
        this.f9011a = this.g.b(this.f[1]);
        this.o = this.g.b(this.f[2]);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity
    public void initViewTahiti() {
        super.initViewTahiti();
        initData();
    }

    @Override // com.huawei.health.suggestion.ui.BaseStateActivity
    public void initData() {
        this.n = new ArrayList(10);
        Intent intent = getIntent();
        if (intent == null) {
            LogUtil.j("Suggestion_TrainEventActivity", "the intent is null");
            finish();
            return;
        }
        String stringExtra = intent.getStringExtra("planid");
        this.h = stringExtra;
        if (stringExtra == null) {
            LogUtil.j("Suggestion_TrainEventActivity", "the planid is null --initData");
            finish();
            return;
        }
        this.j = intent.getIntExtra("plantype", 1);
        PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
        if (planApi == null) {
            LogUtil.j("Suggestion_TrainEventActivity", "TrainEventActivity, initData : planApi is null.");
            return;
        }
        planApi.setPlanType(this.j);
        Plan plan = planApi.getjoinedPlanById(this.h);
        this.e = plan;
        if (plan == null) {
            LogUtil.j("Suggestion_TrainEventActivity", "get null data of the plan's history record,destroy the view");
            finish();
            return;
        }
        e();
        CourseApi courseApi = (CourseApi) Services.d("CoursePlanService", CourseApi.class);
        if (courseApi != null) {
            courseApi.getWorkoutRecords(this.h, new a(this));
        }
    }

    static class a extends UiCallback<List<WorkoutRecord>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        WeakReference<TrainEventActivity> f9015b;

        a(TrainEventActivity trainEventActivity) {
            this.f9015b = new WeakReference<>(trainEventActivity);
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public void onFailure(int i, String str) {
            TrainEventActivity trainEventActivity = this.f9015b.get();
            if (trainEventActivity == null) {
                LogUtil.e("Suggestion_TrainEventActivity", "onFailure activity is null");
                return;
            }
            if (trainEventActivity.mTitleBar != null) {
                trainEventActivity.mTitleBar.setTitleText(StringUtils.c((Object) trainEventActivity.e.acquireName()));
            }
            trainEventActivity.a();
            trainEventActivity.showErrorLayout();
            LogUtil.j("Suggestion_TrainEventActivity", str);
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void onSuccess(List<WorkoutRecord> list) {
            TrainEventActivity trainEventActivity = this.f9015b.get();
            if (trainEventActivity == null) {
                LogUtil.e("Suggestion_TrainEventActivity", "onSuccess activity is null");
                return;
            }
            if (trainEventActivity.mTitleBar != null) {
                trainEventActivity.mTitleBar.setTitleText(StringUtils.c((Object) trainEventActivity.e.acquireName()));
            }
            trainEventActivity.a();
            trainEventActivity.finishLoading();
        }
    }

    private void e() {
        TrainEventBaseFragment trainEventBaseFragment = new TrainEventBaseFragment();
        TrainEventBaseFragment trainEventBaseFragment2 = new TrainEventBaseFragment();
        TrainEventBaseFragment trainEventBaseFragment3 = new TrainEventBaseFragment();
        c(trainEventBaseFragment, 2);
        c(trainEventBaseFragment2, 3);
        c(trainEventBaseFragment3, 4);
        this.n.add(trainEventBaseFragment);
        this.n.add(trainEventBaseFragment2);
        this.n.add(trainEventBaseFragment3);
    }

    private void c(TrainEventBaseFragment trainEventBaseFragment, int i) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("joined", this.e);
        bundle.putString("planid", this.h);
        bundle.putInt(DBSessionCommon.COLUMN_TIME_ZONE, i);
        bundle.putInt("plantype", this.j);
        trainEventBaseFragment.setArguments(bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        this.i.setOffscreenPageLimit(this.n.size());
        if (this.f9013c) {
            this.f9013c = false;
            this.d.b(this.l, this.n.get(0), true);
            this.d.b(this.f9011a, this.n.get(1), false);
            this.d.b(this.o, this.n.get(2), false);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f9012b.x = motionEvent.getX();
            this.f9012b.y = motionEvent.getY();
        } else if (motionEvent.getAction() == 2 && Math.abs(motionEvent.getX() - this.f9012b.x) > this.k * 3) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
