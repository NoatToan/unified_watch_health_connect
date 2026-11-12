package com.huawei.health.suggestion.ui.run.activity;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.FragmentTransaction;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.RequestOptions;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.basefitnessadvice.model.Plan;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.plan.api.PlanApi;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.service.PlanReportNotificationService;
import com.huawei.health.suggestion.ui.BaseStateActivity;
import com.huawei.health.suggestion.ui.run.activity.fragment.runplan.ConfirmDistanceFragment;
import com.huawei.health.suggestion.ui.run.activity.fragment.runplan.PlanDurationFragment;
import com.huawei.health.suggestion.ui.run.activity.fragment.runplan.QuerySetCompeteDayFragment;
import com.huawei.health.suggestion.ui.run.activity.fragment.runplan.SetBestRecordFragment;
import com.huawei.health.suggestion.ui.run.activity.fragment.runplan.SetCompeteDateFragment;
import com.huawei.health.suggestion.ui.run.activity.fragment.runplan.StartTrainDateFragment;
import com.huawei.health.suggestion.ui.run.activity.fragment.runplan.TargetGoalFragment;
import com.huawei.health.suggestion.ui.run.activity.fragment.runplan.TrainDateFragment;
import com.huawei.health.suggestion.ui.run.activity.fragment.runplan.UserInfoFragment;
import com.huawei.health.suggestion.util.JumpUtil;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnessadvice.plandata.CreateRunPlanParams;
import com.huawei.pluginfitnessadvice.plandata.PlanInfoBean;
import com.huawei.pluginfitnessadvice.plandata.UserInfoBean;
import com.huawei.ui.commonui.base.BaseFragment;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import defpackage.btq;
import defpackage.btt;
import defpackage.hve;
import defpackage.ibl;
import defpackage.idy;
import defpackage.ieg;
import defpackage.iem;
import defpackage.ift;
import defpackage.ifz;
import defpackage.lmf;
import defpackage.lsl;
import defpackage.pdy;
import defpackage.qpx;
import defpackage.qqf;
import defpackage.qqs;
import defpackage.qre;
import health.compact.a.CommonUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.Services;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes9.dex */
public class RunPlanCreateActivity extends BaseStateActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f9852a = e(Locale.getDefault());
    private TrainDateFragment aa;
    private CustomTitleBar ab;
    private String ac;
    private UserInfoFragment ah;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f9853b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f9854c;
    private ConfirmDistanceFragment e;
    private int g;
    private List<Integer> h;
    private int i;
    private BaseFragment j;
    private BroadcastReceiver k;
    private HealthTextView l;
    private QuerySetCompeteDayFragment m;
    private ImageView n;
    private ImageView o;
    private PlanDurationFragment r;
    private String s;
    private SetBestRecordFragment u;
    private List<Integer> v;
    private StartTrainDateFragment w;
    private SetCompeteDateFragment x;
    private TargetGoalFragment y;
    private int z;
    private CreateRunPlanParams d = new CreateRunPlanParams();
    private PlanInfoBean t = new PlanInfoBean();
    private UserInfoBean ae = new UserInfoBean();
    private pdy ad = new pdy();
    private boolean f = false;
    private Handler p = new c();
    private OnNextPageListener q = new OnNextPageListener() { // from class: com.huawei.health.suggestion.ui.run.activity.RunPlanCreateActivity.1
        @Override // com.huawei.health.suggestion.ui.run.activity.RunPlanCreateActivity.OnNextPageListener
        public void backLock() {
            RunPlanCreateActivity.this.f = true;
        }

        @Override // com.huawei.health.suggestion.ui.run.activity.RunPlanCreateActivity.OnNextPageListener
        public void nextPage(boolean z) {
            RunPlanCreateActivity.this.d(1, z);
            RunPlanCreateActivity.this.f = false;
        }
    };

    public interface OnNextPageListener {
        void backLock();

        void nextPage(boolean z);
    }

    @Override // com.huawei.health.suggestion.ui.BaseStateActivity, com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        String string;
        String string2;
        super.onCreate(bundle);
        this.f9854c = this;
        this.f9853b = System.currentTimeMillis();
        Resources resources = this.f9854c.getResources();
        if (qqs.e(this.f9854c)) {
            string = resources.getString(R.string.run_make_plan_loading_dark_url);
        } else {
            string = resources.getString(R.string.run_make_plan_loading_url);
        }
        qqf.b(string, new RequestOptions().diskCacheStrategy(DiskCacheStrategy.RESOURCE), this.n);
        if (LanguageUtil.ba(this.f9854c)) {
            this.n.setScaleX(-1.0f);
        }
        if (qqs.e(this.f9854c)) {
            string2 = resources.getString(R.string.run_make_plan_bg_dark_url);
        } else {
            string2 = resources.getString(R.string.run_make_plan_bg_url);
        }
        qqf.e(string2, this.o);
        this.k = new BroadcastReceiver() { // from class: com.huawei.health.suggestion.ui.run.activity.RunPlanCreateActivity.4
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                if (intent != null && "android.intent.action.LOCALE_CHANGED".equals(intent.getAction()) && (context instanceof Activity) && RunPlanCreateActivity.g()) {
                    ((Activity) context).finish();
                    LogUtil.j("Suggestion_RunPlanCreateActivity", "onReceive ACTION_LOCALE_CHANGED finish");
                }
            }
        };
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.LOCALE_CHANGED");
        registerReceiver(this.k, intentFilter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean g() {
        String strE = e(Locale.getDefault());
        LogUtil.a("Suggestion_RunPlanCreateActivity", "isLanguageChanged lastLocalStr = ", f9852a, ", currentLocale = ", strE);
        if (strE.equals(f9852a)) {
            return false;
        }
        f9852a = strE;
        return true;
    }

    private static String e(Locale locale) {
        if (locale == null) {
            return "";
        }
        return locale.toString();
    }

    private void i() {
        int intExtra;
        Intent intent = getIntent();
        if (intent == null) {
            LogUtil.j("Suggestion_RunPlanCreateActivity", "intent is null");
            intExtra = -1;
        } else {
            this.ac = intent.getStringExtra("runPlanTitle");
            intExtra = intent.getIntExtra("runPlanType", -1);
            int intExtra2 = intent.getIntExtra("type", 0);
            this.i = intExtra2;
            if (intExtra2 == 1) {
                try {
                    this.s = intent.getStringExtra("planId");
                    this.ac = getResources().getString(R.string.IDS_sug_modify_train_date);
                    this.z = intent.getIntExtra("trainLevel", 1);
                    this.v = intent.getIntegerArrayListExtra("runDate");
                    this.h = intent.getIntegerArrayListExtra("exeDate");
                } catch (ArrayIndexOutOfBoundsException e) {
                    LogUtil.e("Suggestion_RunPlanCreateActivity", "initIntentData:", LogAnonymous.b(e));
                }
            }
        }
        if (intExtra == -1 && this.i != 1) {
            LogUtil.j("Suggestion_RunPlanCreateActivity", "PlanType or mPlanPbType is invalid.");
            finish();
        } else {
            this.t.setPlanType(intExtra);
        }
    }

    @Override // com.huawei.health.suggestion.ui.BaseStateActivity
    public void initData() {
        if (isDestroyed()) {
            LogUtil.e("Suggestion_RunPlanCreateActivity", "initData parameter has invalid.");
            return;
        }
        FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
        if (this.i == 1) {
            this.g = 8;
            TrainDateFragment trainDateFragment = this.aa;
            this.j = trainDateFragment;
            trainDateFragment.d(this.v, this.h, this.z);
        } else {
            this.g = 0;
            this.j = this.ah;
        }
        fragmentTransactionBeginTransaction.add(R.id.frag_create_plan_page, this.j).commit();
    }

    @Override // com.huawei.health.suggestion.ui.BaseStateActivity
    public void initLayout() {
        i();
        setContentView(R.layout.sug_activity_run_plan_create);
        CustomTitleBar customTitleBar = (CustomTitleBar) findViewById(R.id.sug_run_plan_title);
        this.ab = customTitleBar;
        customTitleBar.setTitleText(this.ac);
        this.ah = UserInfoFragment.e();
        this.e = ConfirmDistanceFragment.c();
        this.u = SetBestRecordFragment.e(this.t.getPlanType());
        this.w = StartTrainDateFragment.a();
        this.r = PlanDurationFragment.b();
        this.m = QuerySetCompeteDayFragment.b();
        this.x = SetCompeteDateFragment.b();
        this.y = TargetGoalFragment.c(this.t.getPlanType());
        this.aa = TrainDateFragment.e(this.i);
        this.mLoadingView = findViewById(R.id.layout_make_plan);
        this.o = (ImageView) findViewById(R.id.make_plan_back);
        this.l = (HealthTextView) findViewById(R.id.make_plan_text);
        this.n = (ImageView) findViewById(R.id.make_plan_image);
    }

    @Override // com.huawei.health.suggestion.ui.BaseStateActivity
    public void initViewController() {
        this.ab.setLeftButtonOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.run.activity.RunPlanCreateActivity.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (view == null) {
                    LogUtil.e("Suggestion_RunPlanCreateActivity", "mTitleBar LeftButton view is invalid.");
                } else {
                    RunPlanCreateActivity.this.onBackPressed();
                }
            }
        });
        this.ah.e(this.q);
        this.e.d(this.q);
        this.u.a(this.q);
        this.w.b(this.q);
        this.r.b(this.q);
        this.m.c(this.q);
        this.x.c(this.q);
        this.y.e(this.q);
        this.aa.a(this.q);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.f) {
            LogUtil.a("Suggestion_RunPlanCreateActivity", "onBackPressed playing motion effects.");
        } else {
            d(-1, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i, boolean z) {
        if (!CommonUtil.ab(this.f9854c) && i == 1) {
            LogUtil.e("Suggestion_RunPlanCreateActivity", "Network is not Connected ");
            qpx.b(this.f9854c, R.string.IDS_confirm_network_whether_connected);
            this.j.onHiddenChanged(false);
            return;
        }
        if (i == 0) {
            LogUtil.e("Suggestion_RunPlanCreateActivity", "updateDataAndResetCurrentPage arrow is invalid.");
            return;
        }
        int i2 = this.g;
        if ((i2 == 0 || this.i == 1) && i == -1) {
            finish();
            return;
        }
        if (i2 != 0) {
            if (i2 == 1) {
                this.ae.setMonthVolume(this.e.d());
            } else if (i2 != 2) {
                c(z, i);
            } else if (z) {
                this.ae.setPbTime(this.u.c());
                this.ae.setPbType(this.u.e());
                this.t.setWeekCount(0);
            } else {
                this.ae.setPbTime(0);
                this.ae.setPbType(0);
            }
        } else {
            if (this.ah.a() == null) {
                LogUtil.e("Suggestion_RunPlanCreateActivity", "updateDataAndResetCurrentPage mUserInfoFragment.getUserInfo() == null");
                return;
            }
            this.ae.setSex(ibl.b(this.ah.a().getGender()));
            this.ae.setAge(this.ah.a().getAge());
            this.ae.setHeight(this.ah.a().getHeight());
            this.ae.setWeight((int) this.ah.a().getWeight());
        }
        a(i, z);
    }

    private void c(boolean z, int i) {
        int i2 = this.g;
        if (i2 == 3) {
            this.t.setStartTime(this.w.d() / 1000);
            this.x.c(this.w.d());
            return;
        }
        if (i2 == 4) {
            this.t.setWeekCount(this.r.c());
            this.t.setEndTime(lsl.a(this.w.d(), this.t.getWeekCount() * 7) / 1000);
        } else {
            if (i2 == 5) {
                if (!z) {
                    this.t.setEndTime(0L);
                    b();
                }
                this.t.setIsForRace(z);
                return;
            }
            b(i);
        }
    }

    private void b(int i) {
        int i2 = this.g;
        if (i2 == 6) {
            if (i == 1) {
                this.t.setEndTime(this.x.e() / 1000);
                this.t.setWeekCount((int) Math.ceil((((long) ift.j(this.x.e())) - ift.j(this.w.d())) / 7.0f));
                b();
                return;
            }
            return;
        }
        if (i2 != 7) {
            if (i2 != 8) {
                return;
            }
            this.t.setRunDate(this.aa.d());
            this.t.setExeDate(this.aa.a());
            return;
        }
        if (this.y.b() == 0 && i == 1) {
            LogUtil.e("Suggestion_RunPlanCreateActivity", "updateDataAndResetCurrentPage getTargetTime() == 0");
        } else {
            this.t.setTrainLevel(this.y.a());
            this.t.setTargetTime(this.y.b());
        }
    }

    private void b() {
        PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
        if (planApi == null) {
            LogUtil.e("Suggestion_RunPlanCreateActivity", "getGoalForecast : planApi is null.");
            return;
        }
        LogUtil.a("Suggestion_RunPlanCreateActivity", "getGoalForecast pbType:", Integer.valueOf(this.ae.getPbType()), "pbTime:", Integer.valueOf(this.ae.getPbTime()), "planType:", Integer.valueOf(this.t.getPlanType()), "weekCount:", Integer.valueOf(this.t.getWeekCount()));
        planApi.getAchievementForecast(this.ae.getPbType(), this.ae.getPbTime(), this.t.getPlanType(), this.t.getWeekCount(), new UiCallback<pdy>() { // from class: com.huawei.health.suggestion.ui.run.activity.RunPlanCreateActivity.2
            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            public void onFailure(int i, String str) {
                if (i == -8) {
                    qpx.e(BaseApplication.getContext(), qre.f(R.string.sug_server_disconnect));
                }
                LogUtil.e("Suggestion_RunPlanCreateActivity", "getGoalForecast: ", str);
            }

            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public void onSuccess(pdy pdyVar) {
                if (pdyVar != null) {
                    RunPlanCreateActivity.this.ad = pdyVar;
                    RunPlanCreateActivity.this.ae.setPbBeforePlan(pdyVar.a());
                    if (RunPlanCreateActivity.this.j == RunPlanCreateActivity.this.y) {
                        RunPlanCreateActivity.this.y.a(RunPlanCreateActivity.this.ad);
                        return;
                    }
                    return;
                }
                LogUtil.e("Suggestion_RunPlanCreateActivity", "getGoalForecast onSuccess data is null.");
            }
        });
    }

    private void a(int i, boolean z) {
        int iE = e(i, z);
        if (iE == 0) {
            if (this.i == 1) {
                k();
                return;
            } else {
                c();
                return;
            }
        }
        int i2 = this.g + iE;
        this.g = i2;
        if (i2 == 0) {
            c(this.ah);
            return;
        }
        if (i2 == 1) {
            c(this.e);
            return;
        }
        if (i2 == 2) {
            c(this.u);
        } else if (i2 == 3) {
            c(this.w);
        } else {
            d();
        }
    }

    private void d() {
        switch (this.g) {
            case 4:
                c(this.r);
                break;
            case 5:
                c(this.m);
                break;
            case 6:
                c(this.x);
                this.x.a();
                break;
            case 7:
                c(this.y);
                this.y.a(this.ad);
                break;
            case 8:
                c(this.aa);
                this.aa.b(this.y.a());
                break;
        }
    }

    private void c() {
        this.t.setTimeZone(ieg.d());
        this.d.setPlanInfoBean(this.t);
        this.d.setUserInfoBean(this.ae);
        e(this.d);
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = this.f9853b;
        HashMap map = new HashMap(2);
        map.put("click", "1");
        map.put("useTime", Long.valueOf(jCurrentTimeMillis - j));
        idy.b("1120022", map);
    }

    private void e(final CreateRunPlanParams createRunPlanParams) {
        showLoading();
        this.ab.setBackgroundColor(this.f9854c.getColor(R.color.health_share_section_bg_color));
        btt.d().c(new Runnable() { // from class: com.huawei.health.suggestion.ui.run.activity.RunPlanCreateActivity.5
            @Override // java.lang.Runnable
            public void run() {
                PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
                if (planApi == null) {
                    LogUtil.e("Suggestion_RunPlanCreateActivity", "updatePlanDate : planApi is null.");
                } else {
                    planApi.createIntelligentRunPlan(createRunPlanParams, new b(RunPlanCreateActivity.this));
                }
            }
        });
    }

    static class c extends Handler {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        WeakReference<RunPlanCreateActivity> f9859c;

        private c(RunPlanCreateActivity runPlanCreateActivity) {
            this.f9859c = new WeakReference<>(runPlanCreateActivity);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            String string;
            if (message == null) {
                return;
            }
            super.handleMessage(message);
            RunPlanCreateActivity runPlanCreateActivity = this.f9859c.get();
            if (runPlanCreateActivity == null) {
                return;
            }
            Resources resources = runPlanCreateActivity.f9854c.getResources();
            switch (message.what) {
                case 100:
                    if (qqs.e(runPlanCreateActivity.f9854c)) {
                        string = resources.getString(R.string.run_make_plan_success_dark_url);
                    } else {
                        string = resources.getString(R.string.run_make_plan_success_url);
                    }
                    break;
                case 101:
                    if (qqs.e(runPlanCreateActivity.f9854c)) {
                        string = resources.getString(R.string.run_make_plan_fail_dark_url);
                    } else {
                        string = resources.getString(R.string.run_make_plan_fail_url);
                    }
                    break;
                case 102:
                default:
                    LogUtil.e("Suggestion_RunPlanCreateActivity", "msg.what wrong");
                    return;
                case 103:
                    runPlanCreateActivity.j();
                    runPlanCreateActivity.e(message.obj);
                    return;
                case 104:
                    runPlanCreateActivity.mLoadingView.setVisibility(8);
                    runPlanCreateActivity.getSupportFragmentManager().beginTransaction().hide(runPlanCreateActivity.j).show(runPlanCreateActivity.j).commitAllowingStateLoss();
                    return;
            }
            if (!(message.obj instanceof String)) {
                LogUtil.a("Suggestion_RunPlanCreateActivity", "msg.obj null or not List");
                return;
            }
            LogUtil.a("Suggestion_RunPlanCreateActivity", "update ui");
            if (LanguageUtil.ba(runPlanCreateActivity.f9854c)) {
                runPlanCreateActivity.n.setScaleX(1.0f);
            }
            qqf.b(string, new RequestOptions().diskCacheStrategy(DiskCacheStrategy.RESOURCE), runPlanCreateActivity.n);
            runPlanCreateActivity.l.setText((String) message.obj);
        }
    }

    static class b extends UiCallback<Plan> {
        WeakReference<RunPlanCreateActivity> d;

        b(RunPlanCreateActivity runPlanCreateActivity) {
            this.d = new WeakReference<>(runPlanCreateActivity);
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public void onFailure(int i, String str) {
            LogUtil.j("Suggestion_RunPlanCreateActivity", "gotoCreatePlan onFailure errorCode:", Integer.valueOf(i), "errorInfo:", str);
            RunPlanCreateActivity runPlanCreateActivity = this.d.get();
            if (runPlanCreateActivity != null && runPlanCreateActivity.p != null) {
                Message messageObtainMessage = runPlanCreateActivity.p.obtainMessage();
                messageObtainMessage.what = 101;
                if (i == -404) {
                    messageObtainMessage.obj = runPlanCreateActivity.f9854c.getString(R.string.sug_create_plan_no_network);
                } else {
                    if (i == 200010) {
                        messageObtainMessage.obj = runPlanCreateActivity.f9854c.getString(R.string.sug_plan_is_exist);
                        runPlanCreateActivity.p.sendMessage(messageObtainMessage);
                        runPlanCreateActivity.j();
                        return;
                    }
                    messageObtainMessage.obj = runPlanCreateActivity.f9854c.getString(R.string.sug_create_plan_failed);
                }
                runPlanCreateActivity.p.sendMessage(messageObtainMessage);
                runPlanCreateActivity.p.sendEmptyMessageDelayed(104, 1000L);
                return;
            }
            LogUtil.j("Suggestion_RunPlanCreateActivity", "CreateUiCallBack onFailure activity or mRequestHandler is null.");
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Plan plan) {
            RunPlanCreateActivity runPlanCreateActivity = this.d.get();
            if (runPlanCreateActivity != null && runPlanCreateActivity.p != null) {
                Message messageObtainMessage = runPlanCreateActivity.p.obtainMessage();
                messageObtainMessage.what = 100;
                messageObtainMessage.obj = runPlanCreateActivity.f9854c.getString(R.string.IDS_plan_customization_succeeded);
                runPlanCreateActivity.p.sendMessage(messageObtainMessage);
                Message messageObtainMessage2 = runPlanCreateActivity.p.obtainMessage();
                messageObtainMessage2.what = 103;
                messageObtainMessage2.obj = plan;
                runPlanCreateActivity.p.sendMessageDelayed(messageObtainMessage2, 1000L);
                return;
            }
            LogUtil.e("Suggestion_RunPlanCreateActivity", "CreateUiCallBack onSuccess activity or mRequestHandler is null.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        h();
        o();
        f();
        finishLoading();
        a();
    }

    private void a() {
        HashMap map = new HashMap(14);
        map.put("click", "1");
        map.put("plantype", 0);
        map.put("planName", this.ac);
        map.put("planUserCheck", true);
        map.put("recentPlanCheck", Integer.valueOf(this.ae.getMonthVolume()));
        map.put("bestRecordCheck", Integer.valueOf(this.ae.getPbType()));
        map.put("startPlanDate", Long.valueOf(this.t.getStartTime()));
        map.put("checkPrepareCheck", Boolean.valueOf(this.t.getIsForRace()));
        map.put("checkCompetitionDate", Long.valueOf(this.x.e()));
        map.put("checkPredictLevel", Integer.valueOf(this.ae.getPbBeforePlan()));
        map.put("checkContinueWeek", Integer.valueOf(this.t.getWeekCount()));
        map.put("checkRunningDay", this.t.getRunDate());
        map.put("checkTrainingDay", this.t.getExeDate());
        map.put("createPlanType", Integer.valueOf(this.t.getPlanType()));
        idy.b("1120021", map);
    }

    private void h() {
        PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
        if (planApi == null) {
            LogUtil.e("Suggestion_RunPlanCreateActivity", "createPlanSuccess, updateRemindTime : planApi is null.");
        } else {
            planApi.setPlanType(0);
            planApi.updateRemindTime(true, 1080);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Object obj) {
        if (!(obj instanceof Plan)) {
            LogUtil.e("Suggestion_RunPlanCreateActivity", "objPlan pushDataToDevice is wrong");
        } else if (iem.b() && hve.d() && ifz.d()) {
            LogUtil.j("Suggestion_RunPlanCreateActivity", "initPushToWatchView bluetooth is disable");
            hve.e(((PlanApi) Services.b("CoursePlanService", PlanApi.class)).convertRunPlan((Plan) obj), BaseApplication.getContext());
        }
    }

    private void o() {
        LogUtil.a("Suggestion_RunPlanCreateActivity", "startPlanReportRemindService.");
        this.f9854c.startService(new Intent(this.f9854c, (Class<?>) PlanReportNotificationService.class));
    }

    private void f() {
        btq.e().e("PLAN_UPDATE");
        JumpUtil.a(this);
        HashMap map = new HashMap(4);
        map.put("click", "1");
        map.put("planName", this.ac);
        map.put("planType", 0);
        map.put("enter", "5");
        idy.b("1120024", map);
        finish();
    }

    private void k() {
        PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
        if (planApi == null) {
            LogUtil.e("Suggestion_RunPlanCreateActivity", "updatePlanDate : planApi is null.");
            return;
        }
        planApi.updatePlanDate(this.s, this.t.getRunDate(), this.t.getExeDate(), new UiCallback<String>() { // from class: com.huawei.health.suggestion.ui.run.activity.RunPlanCreateActivity.9
            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            public void onFailure(int i, String str) {
                LogUtil.e("Suggestion_RunPlanCreateActivity", "updatePlanDate errorInfo:", str);
                qpx.e(RunPlanCreateActivity.this.f9854c, R.string.IDS_edit_fail);
                RunPlanCreateActivity.this.finish();
            }

            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public void onSuccess(String str) {
                LogUtil.a("Suggestion_RunPlanCreateActivity", "updatePlanDate onSuccess:", str);
                if ("0".equals(str)) {
                    qpx.e(RunPlanCreateActivity.this.f9854c, R.string.IDS_edit_train_date_success);
                    HashMap map = new HashMap(2);
                    map.put("click", 1);
                    map.put("type", 2);
                    lmf.d().c(RunPlanCreateActivity.this.f9854c, AnalyticsValue.INT_PLAN_1120045.value(), map, 0);
                } else {
                    qpx.e(RunPlanCreateActivity.this.f9854c, R.string.IDS_edit_fail);
                }
                RunPlanCreateActivity.this.finish();
            }
        });
        HashMap map = new HashMap(4);
        map.put("click", "1");
        map.put("planType", 0);
        map.put("createPlanType", Integer.valueOf(this.t.getPlanType()));
        map.put("checkRunningDay", this.t.getRunDate());
        map.put("checkTrainingDay", this.t.getExeDate());
        idy.b("1120026", map);
    }

    private void c(BaseFragment baseFragment) {
        if (baseFragment == null) {
            LogUtil.e("Suggestion_RunPlanCreateActivity", "switchFragment fragment is null.");
            return;
        }
        FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
        if (this.j != baseFragment) {
            if (!baseFragment.isAdded()) {
                fragmentTransactionBeginTransaction.hide(this.j).add(R.id.frag_create_plan_page, baseFragment).commit();
            } else {
                fragmentTransactionBeginTransaction.hide(this.j).show(baseFragment).commit();
            }
        }
        this.j = baseFragment;
    }

    private int e(int i, boolean z) {
        int i2 = this.g;
        if (i2 == 3 && i == 1) {
            int planType = this.t.getPlanType();
            if (planType == 2 || planType == 11) {
                return 5;
            }
            if (planType != 12) {
                return 2;
            }
            return i;
        }
        if (i2 == 4 && i == 1 && this.t.getPlanType() == 12) {
            return 4;
        }
        return b(i, z);
    }

    private int b(int i, boolean z) {
        int i2 = this.g;
        if (i2 == 5 && i == 1 && !z) {
            return 2;
        }
        if (i2 == 5 && i == -1) {
            return -2;
        }
        if (i2 == 7 && i == -1) {
            return -2;
        }
        return c(i);
    }

    private int c(int i) {
        int i2 = this.g;
        if (i2 == 8 && i == 1) {
            return 0;
        }
        if (i2 != 8 || i != -1) {
            return i;
        }
        int planType = this.t.getPlanType();
        if (planType == 2 || planType == 11) {
            return -5;
        }
        if (planType != 12) {
            return i;
        }
        return -4;
    }

    @Override // com.huawei.health.suggestion.ui.BaseStateActivity, com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        LogUtil.a("Suggestion_RunPlanCreateActivity", "onDestroy");
        BroadcastReceiver broadcastReceiver = this.k;
        if (broadcastReceiver != null) {
            unregisterReceiver(broadcastReceiver);
            this.k = null;
        }
        Handler handler = this.p;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.p = null;
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
