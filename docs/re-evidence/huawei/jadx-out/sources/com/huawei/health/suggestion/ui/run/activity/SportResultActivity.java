package com.huawei.health.suggestion.ui.run.activity;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.basefitnessadvice.model.intplan.IntPlan;
import com.huawei.haf.design.pattern.Observer;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.course.api.CourseApi;
import com.huawei.health.courseplanservice.api.SportServiceApi;
import com.huawei.health.healthdatamgr.api.HealthDataMgrApi;
import com.huawei.health.plan.api.PlanApi;
import com.huawei.health.sport.view.AiFitnessPlanEnergyReplacementCard;
import com.huawei.health.suggestion.FitnessExternalUtils;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.ui.BaseStateActivity;
import com.huawei.health.suggestion.ui.fitness.adapter.FitnessTopicRecyAdapter;
import com.huawei.health.suggestion.ui.fitness.module.FitnessTopicDeleteModel;
import com.huawei.health.suggestion.ui.run.adapter.FitnessCourseHorizontalAdapter;
import com.huawei.health.suggestion.util.JumpUtil;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.ble.BleConstants;
import com.huawei.operation.utils.Constants;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import com.huawei.pluginfitnessadvice.FitWorkout;
import com.huawei.pluginfitnessadvice.Workout;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.recycleview.HealthLinearLayoutManager;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.subheader.HealthSubHeader;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import defpackage.btt;
import defpackage.btw;
import defpackage.ddq;
import defpackage.gzx;
import defpackage.hbz;
import defpackage.idy;
import defpackage.ieg;
import defpackage.iei;
import defpackage.njy;
import defpackage.ntn;
import defpackage.pea;
import defpackage.pec;
import health.compact.a.Services;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes31.dex */
public class SportResultActivity extends BaseStateActivity implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private AiFitnessPlanEnergyReplacementCard f9860a;
    private HealthTextView ac;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthTextView f9861b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private View f9862c;
    private Observer d;
    private int e;
    private String i;
    private long j;
    private ImageView k;
    private HealthSubHeader l;
    private RecyclerView.Adapter n;
    private ImageView p;
    private ImageView q;
    private HealthRecycleView r;
    private String s;
    private ImageView t;
    private LinearLayout w;
    private int x;
    private long y;
    private HealthTextView z;
    private int ad = 1;
    private int h = 0;
    private int v = 0;
    private int u = 0;
    private Handler m = new b();
    private FitnessTopicDeleteModel g = new FitnessTopicDeleteModel();
    private List<String> f = new ArrayList();
    private List<FitWorkout> ab = new ArrayList();
    private boolean o = false;

    static /* synthetic */ int a(SportResultActivity sportResultActivity) {
        int i = sportResultActivity.h;
        sportResultActivity.h = i + 1;
        return i;
    }

    @Override // com.huawei.health.suggestion.ui.BaseStateActivity
    public void initLayout() {
        setContentView(R.layout.activity_sport_result);
    }

    @Override // com.huawei.health.suggestion.ui.BaseStateActivity
    public void initViewController() {
        CustomTitleBar customTitleBar = (CustomTitleBar) findViewById(R.id.sport_result_title_bar);
        customTitleBar.setRightButtonVisibility(8);
        customTitleBar.setTitleBarBackgroundColor(0);
        this.f9861b = (HealthTextView) findViewById(R.id.completed_sport_times);
        this.w = (LinearLayout) findViewById(R.id.stretch_after_run_layout);
        this.ac = (HealthTextView) findViewById(R.id.stretch_suggestion);
        this.z = (HealthTextView) findViewById(R.id.stretch_title);
        findViewById(R.id.sug_rpe_great).setOnClickListener(this);
        findViewById(R.id.sug_rpe_good).setOnClickListener(this);
        findViewById(R.id.sug_rpe_ok).setOnClickListener(this);
        findViewById(R.id.sug_rpe_notgood).setOnClickListener(this);
        this.p = (ImageView) findViewById(R.id.iv_not_good);
        this.t = (ImageView) findViewById(R.id.iv_ok);
        this.k = (ImageView) findViewById(R.id.iv_good);
        this.q = (ImageView) findViewById(R.id.iv_great);
        findViewById(com.huawei.ui.commonui.R.id.action_bar_title).setOnClickListener(this);
        this.r = (HealthRecycleView) findViewById(R.id.recyclerView_topic);
        d();
        j();
        if (this.u == 258 && Utils.j()) {
            this.w.setVisibility(0);
        } else if (this.u == 283 && Utils.j()) {
            this.w.setVisibility(0);
            this.z.setText(R.string.IDS_track_skip_post_exercise);
            this.ac.setText(R.string.IDS_track_skip_stretch);
        }
        b();
        this.f9862c = findViewById(R.id.ai_fitness_plan_card_layout);
        this.f9860a = (AiFitnessPlanEnergyReplacementCard) findViewById(R.id.ai_fitness_plan_energy_replacement_card);
        h();
    }

    @Override // com.huawei.health.suggestion.ui.BaseStateActivity, com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        f();
    }

    private void b() {
        btt.d().c(new Runnable() { // from class: com.huawei.health.suggestion.ui.run.activity.SportResultActivity.5
            @Override // java.lang.Runnable
            public void run() {
                PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
                if (planApi == null) {
                    LogUtil.e("Suggestion_SportResultActivity", "getCoursePlanId, getCurrentPlan : planApi is null.");
                } else {
                    planApi.e(new UiCallback<IntPlan>() { // from class: com.huawei.health.suggestion.ui.run.activity.SportResultActivity.5.4
                        @Override // com.huawei.basefitnessadvice.callback.UiCallback
                        public void onFailure(int i, String str) {
                            LogUtil.j("Suggestion_SportResultActivity", "errorCode = ", Integer.valueOf(i), " errorInfo = ", str);
                        }

                        @Override // com.huawei.basefitnessadvice.callback.UiCallback
                        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
                        public void onSuccess(IntPlan intPlan) {
                            if (intPlan != null) {
                                SportResultActivity.this.s = intPlan.getPlanId();
                            }
                        }
                    });
                }
            }
        });
    }

    private void d() {
        Intent intent = getIntent();
        if (intent != null) {
            this.u = intent.getIntExtra(BleConstants.SPORT_TYPE, 0);
            this.u = intent.getIntExtra(BleConstants.SPORT_TYPE, 0);
            this.i = intent.getStringExtra("runningCourseId");
            this.j = intent.getLongExtra("endTime", System.currentTimeMillis());
            this.y = intent.getLongExtra("startTime", System.currentTimeMillis());
            this.e = intent.getIntExtra("calories", 0);
            this.x = intent.getIntExtra("plan_execute_time", 0);
            if (this.u == 264) {
                this.u = 258;
            }
        }
        if (intent != null) {
            Bundle bundleExtra = intent.getBundleExtra("bundlekey");
            HealthLinearLayoutManager healthLinearLayoutManager = new HealthLinearLayoutManager(this);
            this.r.setNestedScrollingEnabled(false);
            int i = this.u;
            if (i == 283) {
                healthLinearLayoutManager.setOrientation(0);
                this.n = new FitnessCourseHorizontalAdapter();
                this.r.b(true);
            } else if (i == 258) {
                this.n = new FitnessTopicRecyAdapter(this.r, 8, bundleExtra);
                this.r.b(false);
                this.r.setPadding((int) getResources().getDimension(R.dimen.emui_dimens_default_start), 0, (int) getResources().getDimension(R.dimen.emui_dimens_default_end), 0);
            }
            this.r.setLayoutManager(healthLinearLayoutManager);
            this.r.setAdapter(this.n);
        }
    }

    private void j() {
        HealthSubHeader healthSubHeader = (HealthSubHeader) findViewById(R.id.sport_result_rpe_sub_header);
        this.l = healthSubHeader;
        healthSubHeader.setSubHeaderBackgroundColor(0);
        int i = this.u;
        if (i != 283) {
            switch (i) {
                case 257:
                    this.l.setHeadTitleText(getResources().getString(com.huawei.ui.commonui.R.string.IDS_hw_sport_result_walk_rpe_name));
                    break;
                case 258:
                    this.l.setHeadTitleText(getResources().getString(com.huawei.ui.commonui.R.string.IDS_hw_sport_result_run_rpe_name));
                    break;
                case 259:
                    this.l.setHeadTitleText(getResources().getString(com.huawei.ui.commonui.R.string.IDS_hw_sport_result_bike_rpe_name));
                    break;
            }
            return;
        }
        this.l.setHeadTitleText(getResources().getString(com.huawei.ui.commonui.R.string.IDS_track_skip_rope_feel));
    }

    @Override // com.huawei.health.suggestion.ui.BaseStateActivity
    public void initData() {
        e();
        i();
        this.ad = this.f.size() + 1;
        g();
        Handler handler = this.m;
        if (handler != null) {
            Message messageObtainMessage = handler.obtainMessage();
            messageObtainMessage.what = -1;
            messageObtainMessage.arg1 = this.u;
            this.m.sendMessageDelayed(messageObtainMessage, 300L);
        }
    }

    private void i() {
        int i = this.u;
        if (i == 258) {
            this.f.add("R002");
        } else if (i == 283) {
            this.f.add("Y045");
            this.f.add("Y047");
            this.f.add("Y049");
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (this.o) {
            LogUtil.a("Suggestion_SportResultActivity", "sportResultActivity already postFeedBack");
            return;
        }
        if (view.getId() == R.id.sug_rpe_notgood) {
            this.v = 1;
            c(view.getId());
            return;
        }
        if (view.getId() == R.id.sug_rpe_ok) {
            this.v = 2;
            c(view.getId());
        } else if (view.getId() == R.id.sug_rpe_good) {
            this.v = 3;
            c(view.getId());
        } else if (view.getId() == R.id.sug_rpe_great) {
            this.v = 4;
            c(view.getId());
        } else {
            this.v = 0;
        }
    }

    private void e(int i) {
        if (i == R.id.sug_rpe_notgood) {
            this.p.setBackground(getResources().getDrawable(R.drawable.sug_rep_bg_checked));
        } else {
            this.p.setBackground(getResources().getDrawable(R.drawable.sug_rep_bg_normal));
        }
        if (i == R.id.sug_rpe_ok) {
            this.t.setBackground(getResources().getDrawable(R.drawable.sug_rep_bg_checked));
        } else {
            this.t.setBackground(getResources().getDrawable(R.drawable.sug_rep_bg_normal));
        }
        if (i == R.id.sug_rpe_good) {
            this.k.setBackground(getResources().getDrawable(R.drawable.sug_rep_bg_checked));
        } else {
            this.k.setBackground(getResources().getDrawable(R.drawable.sug_rep_bg_normal));
        }
        if (i == R.id.sug_rpe_great) {
            this.q.setBackground(getResources().getDrawable(R.drawable.sug_rep_bg_checked));
        } else {
            this.q.setBackground(getResources().getDrawable(R.drawable.sug_rep_bg_normal));
        }
    }

    private void f() {
        Observer observer = new Observer() { // from class: hzz
            @Override // com.huawei.haf.design.pattern.Observer
            public final void notify(String str, Object[] objArr) {
                this.f37397c.a(str, objArr);
            }
        };
        this.d = observer;
        ObserverManagerUtil.d(observer, "UPDATE_AI_PLAN_COURSE_RECORD");
    }

    public /* synthetic */ void a(String str, Object[] objArr) {
        if (objArr == null || objArr.length == 0) {
            LogUtil.e("Suggestion_SportResultActivity", "args is empty");
            return;
        }
        Object obj = objArr[0];
        if (!(obj instanceof Long)) {
            LogUtil.e("Suggestion_SportResultActivity", "args is not long");
            return;
        }
        Long l = (Long) obj;
        long jLongValue = l.longValue();
        ReleaseLogUtil.d("Suggestion_SportResultActivity", "endTime is ", l, " & exerciseEndTime is ", Long.valueOf(this.j));
        if (jLongValue / 1000 == this.j / 1000) {
            b(this.e);
        }
    }

    private void h() {
        if (!btw.g()) {
            LogUtil.a("Suggestion_SportResultActivity", "not support new ai fitness plan");
            return;
        }
        PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
        if (planApi == null) {
            LogUtil.e("Suggestion_SportResultActivity", "getCoursePlanId, getCurrentPlan : planApi is null.");
            return;
        }
        LogUtil.a("Suggestion_SportResultActivity", "endTime is ", Long.valueOf(this.j));
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new ntn(this.y, this.j));
        planApi.checkSportRecordOutPlanPunch(new c(), arrayList);
    }

    static final class c extends UiCallback<List<ntn>> {
        private final WeakReference<SportResultActivity> d;

        private c(SportResultActivity sportResultActivity) {
            this.d = new WeakReference<>(sportResultActivity);
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public void onFailure(int i, String str) {
            ReleaseLogUtil.a("Suggestion_SportResultActivity", "errorCode, ", Integer.valueOf(i), " errorInfo, ", str);
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void onSuccess(List<ntn> list) {
            ReleaseLogUtil.d("Suggestion_SportResultActivity", "timeRanges is ", list);
            SportResultActivity sportResultActivity = this.d.get();
            if (sportResultActivity == null) {
                LogUtil.a("Suggestion_SportResultActivity", "activity is null, return");
            } else {
                if (njy.e(list)) {
                    return;
                }
                sportResultActivity.b(sportResultActivity.e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final int i) {
        if (this.f9860a == null || this.f9862c == null) {
            ReleaseLogUtil.a("Suggestion_SportResultActivity", "view is null");
        } else {
            HandlerExecutor.b(new Runnable() { // from class: hzy
                @Override // java.lang.Runnable
                public final void run() {
                    this.d.d(i);
                }
            });
        }
    }

    public /* synthetic */ void d(int i) {
        iei.d(this.u, 0);
        this.f9862c.setVisibility(0);
        this.f9860a.setCalorieConsumption(i);
        this.f9860a.setJumpBtnClickListener(new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.run.activity.SportResultActivity.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                iei.d(SportResultActivity.this.u, 1);
                btw.a(8, 1, 1, 1);
                hbz.c().e("SP" + SportResultActivity.this.u);
                JumpUtil.a(SportResultActivity.this);
            }
        });
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ntn(this.y, this.j));
        btw.b(BaseApplication.getContext(), arrayList);
    }

    private void o() {
        if (TextUtils.isEmpty(this.s) || TextUtils.isEmpty(this.i) || FitnessExternalUtils.c()) {
            LogUtil.e("Suggestion_SportResultActivity", "postFeedback planId or courseId null open：", Boolean.valueOf(FitnessExternalUtils.c()));
            return;
        }
        ReleaseLogUtil.d("Suggestion_SportResultActivity", "postFeedback mStartPlanCourseTime: ", Integer.valueOf(this.x));
        if (((PlanApi) Services.d("CoursePlanService", PlanApi.class)) == null) {
            LogUtil.e("Suggestion_SportResultActivity", "postFeedback : planApi is null.");
            return;
        }
        pec pecVar = new pec();
        pecVar.c(this.s);
        pecVar.e(this.i);
        pecVar.c(this.j);
        pecVar.a(String.valueOf(this.v));
        pecVar.a(ieg.e(this.x));
        LoginInit loginInit = LoginInit.getInstance(BaseApplication.getContext());
        if (loginInit == null) {
            LogUtil.e("Suggestion_SportResultActivity", "postFeedback() getAccountInfo == null");
            return;
        }
        LogUtil.a("Suggestion_SportResultActivity", "postFeedback mSportType:", Integer.valueOf(this.v));
        SportServiceApi sportServiceApi = (SportServiceApi) Services.d("CoursePlanService", SportServiceApi.class);
        if (sportServiceApi != null) {
            sportServiceApi.addUpdateFeedback(loginInit.getUsetId(), pecVar);
        }
    }

    private void c(int i) {
        o();
        e(i);
        this.o = true;
    }

    private void e() {
        HealthDataMgrApi healthDataMgrApi = (HealthDataMgrApi) Services.d("HWHealthDataMgr", HealthDataMgrApi.class);
        if (healthDataMgrApi == null) {
            LogUtil.j("Suggestion_SportResultActivity", "requestTotalSportTimes : healthDataMgrApi is null.");
        } else {
            healthDataMgrApi.requestTotalSportTimes(0L, System.currentTimeMillis(), this.u, new IBaseResponseCallback() { // from class: com.huawei.health.suggestion.ui.run.activity.SportResultActivity.4
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    if (!SportResultActivity.this.isFinishing()) {
                        SportResultActivity.this.a();
                        if (obj == null) {
                            LogUtil.j("Suggestion_SportResultActivity", "getTotalSportTimes onResponse objectData is null");
                            return;
                        }
                        if (njy.b(obj, HiHealthData.class)) {
                            Message messageObtainMessage = SportResultActivity.this.m.obtainMessage();
                            messageObtainMessage.what = 0;
                            messageObtainMessage.obj = obj;
                            SportResultActivity.this.m.sendMessage(messageObtainMessage);
                            return;
                        }
                        LogUtil.j("Suggestion_SportResultActivity", "getTotalSportTimes onResponse objectData not instanceof List");
                        return;
                    }
                    LogUtil.j("Suggestion_SportResultActivity", "getTotalSportTimes onResponse activity is finishing");
                }
            });
        }
    }

    private void g() {
        if (Utils.j()) {
            CourseApi courseApi = (CourseApi) Services.d("CoursePlanService", CourseApi.class);
            if (courseApi == null) {
                LogUtil.j("Suggestion_SportResultActivity", "getWorkoutByWorkoutId : courseApi is null.");
                return;
            }
            for (int i = 0; i < this.f.size(); i++) {
                courseApi.getCourseById(this.f.get(i), null, null, new UiCallback<Workout>() { // from class: com.huawei.health.suggestion.ui.run.activity.SportResultActivity.2
                    boolean e;

                    @Override // com.huawei.basefitnessadvice.callback.UiCallback
                    public void onFailure(int i2, String str) {
                        if (SportResultActivity.this.isFinishing()) {
                            LogUtil.j("Suggestion_SportResultActivity", "getCourseById activity is finishing.");
                            return;
                        }
                        if (this.e) {
                            LogUtil.j("Suggestion_SportResultActivity", "getCourseById result is true");
                            return;
                        }
                        this.e = true;
                        SportResultActivity.this.a();
                        LogUtil.j("Suggestion_SportResultActivity", "getCourseById onFailure.");
                        SportResultActivity.a(SportResultActivity.this);
                    }

                    @Override // com.huawei.basefitnessadvice.callback.UiCallback
                    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                    public void onSuccess(Workout workout) {
                        if (SportResultActivity.this.isFinishing()) {
                            LogUtil.j("Suggestion_SportResultActivity", "getCourseById activity is finishing.");
                            return;
                        }
                        if (this.e) {
                            LogUtil.j("Suggestion_SportResultActivity", "getCourseById result is true");
                            return;
                        }
                        this.e = true;
                        SportResultActivity.this.ab.add(pea.d(workout));
                        LogUtil.j("Suggestion_SportResultActivity", "getCourseById onSuccess.");
                        SportResultActivity.this.a();
                    }
                });
            }
        }
    }

    static class b extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        WeakReference<SportResultActivity> f9866a;

        private b(SportResultActivity sportResultActivity) {
            super(Looper.getMainLooper());
            this.f9866a = new WeakReference<>(sportResultActivity);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message == null) {
                LogUtil.j("Suggestion_SportResultActivity", "RequestHandler handleMessage msg is null || msg.obj is null.");
                return;
            }
            super.handleMessage(message);
            SportResultActivity sportResultActivity = this.f9866a.get();
            if (sportResultActivity == null) {
                LogUtil.j("Suggestion_SportResultActivity", "RequestHandler handleMessage activity is finishing.");
                return;
            }
            if (message.what == 0 && njy.b(message.obj, HiHealthData.class)) {
                List list = (List) message.obj;
                if (njy.e(list)) {
                    return;
                }
                sportResultActivity.b((HiHealthData) list.get(0));
                return;
            }
            if (message.what == 1) {
                sportResultActivity.k();
            } else if (message.what == -1) {
                ddq.d().showMedalDialog(sportResultActivity, message.arg1);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        if (this.h == this.f.size()) {
            RecyclerView.Adapter adapter = this.n;
            if (adapter instanceof FitnessTopicRecyAdapter) {
                ((FitnessTopicRecyAdapter) adapter).b(false);
                return;
            }
        }
        RecyclerView.Adapter adapter2 = this.n;
        if (adapter2 instanceof FitnessTopicRecyAdapter) {
            ((FitnessTopicRecyAdapter) adapter2).d(this.g, false, this.ab);
        } else if (adapter2 instanceof FitnessCourseHorizontalAdapter) {
            ((FitnessCourseHorizontalAdapter) adapter2).c(this.ab);
        }
    }

    public void b(HiHealthData hiHealthData) {
        String strD;
        int i;
        int i2 = this.u;
        if (i2 != 283) {
            switch (i2) {
                case 257:
                    int i3 = hiHealthData.getInt("Track_Walk_Count_Sum");
                    int i4 = hiHealthData.getInt("Track_Walk_Abnormal_Count_Sum");
                    i = i3 > i4 ? i3 - i4 : 0;
                    strD = gzx.d(com.huawei.ui.commonui.R.plurals.IDS_hw_sport_result_walk_times, i, Integer.valueOf(i));
                    break;
                case 258:
                    int i5 = hiHealthData.getInt("Track_Run_Count_Sum");
                    int i6 = hiHealthData.getInt("Track_Run_Abnormal_Count_Sum");
                    i = i5 > i6 ? i5 - i6 : 0;
                    strD = gzx.d(com.huawei.ui.commonui.R.plurals.IDS_hw_sport_result_run_times, i, Integer.valueOf(i));
                    break;
                case 259:
                    int i7 = hiHealthData.getInt("Track_Ride_Count_Sum");
                    int i8 = hiHealthData.getInt("Track_Ride_Abnormal_Count_Sum");
                    i = i7 > i8 ? i7 - i8 : 0;
                    strD = gzx.d(com.huawei.ui.commonui.R.plurals.IDS_hw_sport_result_ride_times, i, Integer.valueOf(i));
                    break;
                default:
                    strD = "";
                    break;
            }
        } else {
            int i9 = hiHealthData.getInt("TIME");
            strD = gzx.d(com.huawei.ui.commonui.R.plurals.IDS_ai_skip_complete_num, i9, Integer.valueOf(i9));
        }
        a(strD);
    }

    private void a(String str) {
        SpannableString spannableStringC = gzx.c(getApplicationContext(), "\\d|[/]", str, R.style.completed_sport_times_number_style, R.style.completed_sport_times_content_style);
        if (spannableStringC != null) {
            this.f9861b.setText(spannableStringC);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        synchronized (this) {
            int i = this.ad - 1;
            this.ad = i;
            LogUtil.a("Suggestion_SportResultActivity", "mWaitCallbackCount", Integer.valueOf(i));
            if (this.ad == 0) {
                finishLoading();
                if (this.f.size() == 0) {
                    LogUtil.e("Suggestion_SportResultActivity", "course size is 0");
                } else {
                    Handler handler = this.m;
                    if (handler != null) {
                        handler.sendEmptyMessage(1);
                    }
                }
            }
        }
    }

    private void c() {
        Intent intent = getIntent();
        if (intent == null) {
            LogUtil.j("Suggestion_SportResultActivity", "doReportBi intent is null.");
            return;
        }
        HashMap map = new HashMap(6);
        map.put("rpe", Integer.valueOf(this.v));
        map.put(BleConstants.SPORT_TYPE, intent.getStringExtra(BleConstants.SPORT_TYPE));
        map.put("avgHeartRate", intent.getStringExtra("avgHeartRate"));
        map.put("avgPace", intent.getStringExtra("avgPace"));
        map.put("distances", intent.getStringExtra("distances"));
        map.put(ParsedFieldTag.NPES_SPORT_TIME, intent.getStringExtra(ParsedFieldTag.NPES_SPORT_TIME));
        map.put("calories", Integer.valueOf(intent.getIntExtra("calories", 0)));
        map.put("isAICourse", Constants.NULL);
        idy.b("1130010", map);
    }

    @Override // com.huawei.health.suggestion.ui.BaseStateActivity, com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        c();
        ObserverManagerUtil.a(this.d, "UPDATE_AI_PLAN_COURSE_RECORD");
        super.onDestroy();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
