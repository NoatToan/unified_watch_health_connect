package com.huawei.health.suggestion.ui.fitness.activity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.activity.OnBackPressedCallback;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.basefitnessadvice.model.TrainStatistics;
import com.huawei.basefitnessadvice.model.intplan.IntPlan;
import com.huawei.haf.design.pattern.Observer;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.course.api.CourseApi;
import com.huawei.health.courseplanservice.api.SportServiceApi;
import com.huawei.health.device.model.RecordAction;
import com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceCategoryFragment;
import com.huawei.health.h5pro.jsbridge.system.eventhub.H5ProEventHubManager;
import com.huawei.health.health.constants.ObserveLabels;
import com.huawei.health.marketing.api.MarketingApi;
import com.huawei.health.marketing.datatype.MarketingOption;
import com.huawei.health.marketing.datatype.ResourceResultInfo;
import com.huawei.health.motiontrack.api.ViewHolderBase;
import com.huawei.health.plan.aicoach.view.AiAnalysisView;
import com.huawei.health.plan.api.PlanApi;
import com.huawei.health.plan.model.trainingplan.SmartPlanTypeEnum;
import com.huawei.health.sport.model.CardGuideViewModel;
import com.huawei.health.sport.model.WorkoutRecord;
import com.huawei.health.sport.utils.SportSupportUtil;
import com.huawei.health.suggestion.FitnessExternalUtils;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.ui.BaseStateActivity;
import com.huawei.health.suggestion.ui.fitness.activity.FitnessResultActivity;
import com.huawei.health.suggestion.ui.fitness.activity.fragment.FitnessResultInteractor;
import com.huawei.health.suggestion.ui.fitness.helper.BaseRecyclerViewAdapter;
import com.huawei.health.suggestion.ui.fitness.helper.RecyclerHolder;
import com.huawei.health.suggestion.ui.fitness.module.HeartRateLineChartHolderImpl;
import com.huawei.health.suggestion.ui.run.adapter.FitnessCourseHorizontalAdapter;
import com.huawei.health.suggestion.ui.view.ActionRadarView;
import com.huawei.health.suggestion.ui.view.ActionRingChartView;
import com.huawei.health.suggestion.ui.view.AutoFillColorView;
import com.huawei.health.suggestion.ui.view.ScorePersentView;
import com.huawei.health.suggestion.ui.view.StrechMuscleView;
import com.huawei.health.userprofilemgr.api.UserProfileMgrApi;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hmf.tasks.OnFailureListener;
import com.huawei.hmf.tasks.OnSuccessListener;
import com.huawei.hmf.tasks.Task;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwfoundationmodel.trackmodel.HeartRateData;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.networkclient.ResultCallback;
import com.huawei.operation.ble.BleConstants;
import com.huawei.pluginfitnessadvice.Attribute;
import com.huawei.pluginfitnessadvice.ChoreographedMultiActions;
import com.huawei.pluginfitnessadvice.ChoreographedSingleAction;
import com.huawei.pluginfitnessadvice.FitWorkout;
import com.huawei.pluginfitnessadvice.Workout;
import com.huawei.pluginfitnessadvice.WorkoutAction;
import com.huawei.trade.PayApi;
import com.huawei.trade.datatype.PromotionPolicyInfo;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.chart.HealthRingChart;
import com.huawei.ui.commonui.chart.HealthRingChartAdapter;
import com.huawei.ui.commonui.dialog.CustomAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.linechart.combinedchart.HwHealthBaseCombinedChart;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.scrollview.HealthScrollView;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.commonui.utils.CustomPermissionAction;
import com.huawei.ui.commonui.view.trackview.TrackLineChartHolder;
import defpackage.btt;
import defpackage.btw;
import defpackage.btx;
import defpackage.ddq;
import defpackage.dem;
import defpackage.ezj;
import defpackage.fwv;
import defpackage.fxl;
import defpackage.gcn;
import defpackage.gfk;
import defpackage.gfl;
import defpackage.gfm;
import defpackage.gzx;
import defpackage.gzz;
import defpackage.hae;
import defpackage.hcb;
import defpackage.hcu;
import defpackage.hiv;
import defpackage.hkt;
import defpackage.hlh;
import defpackage.hlz;
import defpackage.hmb;
import defpackage.idy;
import defpackage.iec;
import defpackage.iei;
import defpackage.ieo;
import defpackage.ifp;
import defpackage.ipi;
import defpackage.iun;
import defpackage.lmf;
import defpackage.lsl;
import defpackage.lsy;
import defpackage.njy;
import defpackage.ntn;
import defpackage.pcd;
import defpackage.pea;
import defpackage.pec;
import defpackage.ped;
import defpackage.peh;
import defpackage.qjm;
import defpackage.qjp;
import defpackage.qpx;
import defpackage.qqf;
import defpackage.qqs;
import defpackage.qqz;
import defpackage.qre;
import defpackage.qrs;
import defpackage.qsp;
import health.compact.a.CommonUtil;
import health.compact.a.CommonUtils;
import health.compact.a.LanguageUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.Services;
import health.compact.a.UnitUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import health.compact.a.utils.StringUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class FitnessResultActivity extends BaseStateActivity implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<Integer, Integer> f9083a = new HashMap<Integer, Integer>() { // from class: com.huawei.health.suggestion.ui.fitness.activity.FitnessResultActivity.4
        {
            put(0, 33);
            put(137, 53);
            put(283, 54);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f9084b;
    private int aa;
    private CustomTitleBar ab;
    private CustomAlertDialog ac;
    private HealthRecycleView ad;
    private int ae;
    private String af;
    private LinearLayout ag;
    private HealthTextView ah;
    private List<HeartRateData> aj;
    private LinearLayout ak;
    private int al;
    private View am;
    private ImageView at;
    private ImageView av;
    private boolean ax;
    private int ay;
    private ImageView az;
    private ImageView ba;
    private long bb;
    private LinearLayout bc;
    private List<RecordAction> bd;
    private List<FitWorkout> bf;
    private WorkoutRecord bg;
    private int bh;
    private RelativeLayout bi;
    private LinearLayout bj;
    private LinearLayout bk;
    private LinearLayout bl;
    private LinearLayout bm;
    private int bo;
    private HealthTextView bp;
    private HealthTextView br;
    private float bs;
    private float bt;
    private float bu;
    private float bv;
    private HealthTextView bw;
    private HealthTextView by;
    private String bz;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private View f9085c;
    private HealthTextView ca;
    private long cb;
    private AiAnalysisView d;
    private LinearLayout e;
    private AutoFillColorView f;
    private HealthButton g;
    private HealthButton h;
    private Bundle i;
    private Observer j;
    private CardGuideViewModel k;
    private View l;
    private LinearLayout m;
    private HealthTextView n;
    private HealthRecycleView o;
    private HealthTextView p;
    private HealthTextView q;
    private HealthTextView r;
    private HealthTextView s;
    private HealthTextView t;
    private ImageView u;
    private Context v;
    private HealthTextView w;
    private HealthTextView x;
    private HealthTextView y;
    private LinearLayout z;
    private long bn = 0;
    private int be = 0;
    private boolean aw = false;
    private boolean as = true;
    private volatile boolean au = true;
    private FitnessResultInteractor aq = new FitnessResultInteractor(BaseApplication.getContext());
    private FitnessCourseHorizontalAdapter ar = new FitnessCourseHorizontalAdapter();
    private ViewHolderBase bx = null;
    private int bq = 100;
    private int ap = 0;
    private int an = 1;
    private boolean ao = false;
    private c ai = new c(this);

    @Override // com.huawei.health.suggestion.ui.BaseStateActivity
    public void initViewController() {
    }

    @Override // com.huawei.health.suggestion.ui.BaseStateActivity
    public void initLayout() {
        setContentView(R.layout.sug_fitness_coach_trainfinish);
    }

    @Override // com.huawei.health.suggestion.ui.BaseStateActivity
    public int getLoadingLayoutId() {
        return com.huawei.health.basefitnessadvice.R.layout.sug_loading_layout;
    }

    /* JADX INFO: loaded from: classes9.dex */
    static class c extends BaseHandler<FitnessResultActivity> {
        c(FitnessResultActivity fitnessResultActivity) {
            super(fitnessResultActivity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(FitnessResultActivity fitnessResultActivity, Message message) {
            if (message == null) {
                LogUtil.a("Suggestion_FitnessResultActivity", "message is null");
                return;
            }
            int i = message.what;
            if (i == -1) {
                ddq.d().showMedalDialog(fitnessResultActivity, 0);
            } else if (i != 106) {
                LogUtil.j("Suggestion_FitnessResultActivity", "FitnessResultHandler is wrong");
            } else if (message.obj instanceof int[]) {
                fitnessResultActivity.d((int[]) message.obj);
            }
        }
    }

    @Override // com.huawei.health.suggestion.ui.BaseStateActivity
    public void initData() {
        runOnUiThread(new Runnable() { // from class: com.huawei.health.suggestion.ui.fitness.activity.FitnessResultActivity.1
            @Override // java.lang.Runnable
            public void run() {
                FitnessResultActivity.this.updateViewController();
            }
        });
    }

    @Override // com.huawei.health.suggestion.ui.BaseStateActivity, com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ReleaseLogUtil.d("R_Suggestion_FitnessResultActivity", "onCreate");
        this.v = this;
        s();
        this.ab.setRightButtonOnClickListener(new View.OnClickListener() { // from class: hfj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.e(view);
            }
        });
        l();
        t();
        iun.b("Suggestion_FitnessResultActivity");
        this.k = (CardGuideViewModel) new ViewModelProvider(this).get(CardGuideViewModel.class);
        H5ProEventHubManager.trigger("aiCoach.01", "");
        LogUtil.a("Suggestion_FitnessResultActivity", "H5ProEventHubManager:", "aiCoach.01");
        u();
    }

    public /* synthetic */ void e(View view) {
        if (PermissionUtil.a()) {
            r();
        } else {
            PermissionUtil.d(this.v, PermissionUtil.PermissionType.MEDIA_VIDEO_IMAGES, new e());
        }
    }

    private void u() {
        LogUtil.j("Suggestion_FitnessResultActivity", "queryingPromotionAndShowDialog");
        if (this.bg == null) {
            LogUtil.e("Suggestion_FitnessResultActivity", "record is null");
            return;
        }
        CourseApi courseApi = (CourseApi) Services.d("CoursePlanService", CourseApi.class);
        if (courseApi == null) {
            LogUtil.j("Suggestion_FitnessResultActivity", "requestRelativeCourse : courseApi is null.");
        } else {
            courseApi.getCourseById(this.bg.acquireWorkoutId(), null, null, new UiCallback<Workout>() { // from class: com.huawei.health.suggestion.ui.fitness.activity.FitnessResultActivity.5
                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                public void onFailure(int i, String str) {
                    LogUtil.j("Suggestion_FitnessResultActivity", "getworkoutlist onFailure ", Integer.valueOf(i));
                }

                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
                public void onSuccess(Workout workout) {
                    LogUtil.a("Suggestion_FitnessResultActivity", "getworkoutlist onSuccess");
                    FitWorkout fitWorkoutD = pea.d(workout);
                    if (fitWorkoutD != null) {
                        int iB = hkt.b(fitWorkoutD);
                        LogUtil.j("Suggestion_FitnessResultActivity", "queryingPromotionAndShowDialog commodityFlag is ", Integer.valueOf(iB));
                        if (iB == 2) {
                            FitnessResultActivity.this.z();
                        }
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z() {
        ThreadPoolManager.c().execute(new Runnable() { // from class: hfw
            @Override // java.lang.Runnable
            public final void run() {
                this.f36712b.b();
            }
        });
    }

    public /* synthetic */ void b() {
        ((PayApi) Services.b("TradeService", PayApi.class)).getPromotionPolicy(new IBaseResponseCallback() { // from class: hfv
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.f36711a.c(i, obj);
            }
        }, "4");
    }

    public /* synthetic */ void c(int i, Object obj) {
        if (obj instanceof PromotionPolicyInfo) {
            final PromotionPolicyInfo promotionPolicyInfo = (PromotionPolicyInfo) obj;
            LogUtil.j("Suggestion_FitnessResultActivity", "queryingPromotionAndShowDialog promotionInfo is ", promotionPolicyInfo.toString());
            runOnUiThread(new Runnable() { // from class: hfy
                @Override // java.lang.Runnable
                public final void run() {
                    this.f36714c.a(promotionPolicyInfo);
                }
            });
        } else {
            LogUtil.j("Suggestion_FitnessResultActivity", "failed !! getPromotionPolicy errorCode = " + i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void a(final PromotionPolicyInfo promotionPolicyInfo) {
        getOnBackPressedDispatcher().addCallback(new OnBackPressedCallback(true) { // from class: com.huawei.health.suggestion.ui.fitness.activity.FitnessResultActivity.10
            @Override // androidx.activity.OnBackPressedCallback
            public void handleOnBackPressed() {
                LogUtil.j("Suggestion_FitnessResultActivity", "queryingPromotionAndShowDialog handleOnBackPressed ");
                if (ezj.d()) {
                    ezj.b(promotionPolicyInfo, FitnessResultActivity.this, "sport_course");
                } else {
                    FitnessResultActivity.this.finish();
                }
            }
        });
        this.ab.setLeftButtonOnClickListener(new View.OnClickListener() { // from class: hfr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f36707a.a(promotionPolicyInfo, view);
            }
        });
    }

    public /* synthetic */ void a(PromotionPolicyInfo promotionPolicyInfo, View view) {
        LogUtil.j("Suggestion_FitnessResultActivity", "queryingPromotionAndShowDialog setLeftButtonOnClickListener ");
        if (ezj.d()) {
            ezj.b(promotionPolicyInfo, this, "sport_course");
        } else {
            finish();
        }
    }

    private void t() {
        Observer observer = new Observer() { // from class: hfm
            @Override // com.huawei.haf.design.pattern.Observer
            public final void notify(String str, Object[] objArr) {
                this.f36705c.a(str, objArr);
            }
        };
        this.j = observer;
        ObserverManagerUtil.d(observer, "UPDATE_AI_PLAN_COURSE_RECORD");
    }

    public /* synthetic */ void a(String str, Object[] objArr) {
        if (objArr == null || objArr.length == 0) {
            LogUtil.e("Suggestion_FitnessResultActivity", "args is empty");
            return;
        }
        Object obj = objArr[0];
        if (!(obj instanceof Long)) {
            LogUtil.e("Suggestion_FitnessResultActivity", "args is not long");
        } else {
            if (this.bg == null) {
                LogUtil.e("Suggestion_FitnessResultActivity", "record is null");
                return;
            }
            Long l = (Long) obj;
            l.longValue();
            ReleaseLogUtil.d("Suggestion_FitnessResultActivity", "endTime is ", l, " & exerciseEndTime is ", Long.valueOf(this.bg.acquireExerciseTime()));
        }
    }

    private void l() {
        Intent intent = getIntent();
        if (intent == null) {
            return;
        }
        d(intent);
        WorkoutRecord workoutRecord = this.bg;
        if (workoutRecord != null) {
            this.ao = workoutRecord.isFitnessRecordFromDevice() || this.bg.isFitnessRecordFromTv();
            this.cb = this.bg.startTime();
            this.bd = b(this.bg.acquireActionSummary());
            this.aj = this.bg.acquireHeartRateDataList();
            this.aa = this.bg.acquireWearType();
            this.bz = this.bg.acquireWorkoutId();
            if (this.bg.isFitnessRecordFromTv()) {
                this.bh = this.bg.acquireProductId();
            }
            m();
            j(this.bg);
        }
        q();
        b(intent);
        o();
    }

    private void o() {
        gfm gfmVar = new gfm();
        gfmVar.a(3);
        gfmVar.c(fxl.d());
        gfmVar.c(v());
        gfmVar.a(LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1010));
        gfk.e().b(gfmVar, new ResultCallback<LinkedHashMap<Integer, gfl>>() { // from class: com.huawei.health.suggestion.ui.fitness.activity.FitnessResultActivity.9
            @Override // com.huawei.networkclient.ResultCallback
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public void onSuccess(LinkedHashMap<Integer, gfl> linkedHashMap) {
                FitnessResultActivity.this.c(linkedHashMap);
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                ReleaseLogUtil.e("Suggestion_FitnessResultActivity", "getAICoachInfo fail", th);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(final LinkedHashMap<Integer, gfl> linkedHashMap) {
        HandlerExecutor.c(new Runnable() { // from class: hfn
            @Override // java.lang.Runnable
            public final void run() {
                this.f36706b.a(linkedHashMap);
            }
        });
    }

    public /* synthetic */ void a(LinkedHashMap linkedHashMap) {
        AiAnalysisView aiAnalysisView = this.d;
        if (aiAnalysisView != null) {
            aiAnalysisView.e((LinkedHashMap<Integer, gfl>) linkedHashMap);
        }
    }

    private Map<String, Object> v() {
        HashMap map = new HashMap();
        WorkoutRecord workoutRecord = this.bg;
        if (workoutRecord == null) {
            return map;
        }
        long jStartTime = workoutRecord.startTime();
        long jAcquireExerciseTime = this.bg.acquireExerciseTime();
        map.put("startTime", Long.valueOf(jStartTime));
        map.put("endTime", Long.valueOf(jAcquireExerciseTime));
        map.put(BleConstants.SPORT_TYPE, String.valueOf(292));
        map.put("typeId", 32001);
        map.put("timeZone", lsl.q(System.currentTimeMillis()));
        return map;
    }

    private void g() {
        LogUtil.a("Suggestion_FitnessResultActivity", "do Bi From YOYO StartApp");
        HashMap map = new HashMap();
        map.put("click", 1);
        map.put("from", "yoyo_card");
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.HEALTH_LOGIN_APP_WHITE_2050007.value(), map, 0);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        WorkoutRecord workoutRecord;
        super.onWindowFocusChanged(z);
        ReleaseLogUtil.d("R_Suggestion_FitnessResultActivity", "onWindowFocusChanged isHasFocus:", Boolean.valueOf(z));
        if (z && this.as && (workoutRecord = this.bg) != null) {
            if (this.aw) {
                fwv.d().showMarketCommentDialog(this.v);
                m(this.bg);
                hcb.a().onChange(this.bg.acquireWorkoutId(), 1, null);
                c cVar = this.ai;
                if (cVar != null) {
                    cVar.sendEmptyMessageDelayed(-1, 300L);
                }
            } else {
                e(workoutRecord);
            }
            this.as = false;
        }
    }

    private void q() {
        CourseApi courseApi = (CourseApi) Services.d("CoursePlanService", CourseApi.class);
        if (courseApi != null) {
            courseApi.getCourseTrainStatistics(1, new d(this));
        }
    }

    private void m() {
        if (this.bd == null) {
            this.bd = Collections.EMPTY_LIST;
        }
        int i = 0;
        for (RecordAction recordAction : this.bd) {
            if (recordAction != null) {
                int finishedAction = recordAction.getFinishedAction();
                if (CommonUtil.b(finishedAction - recordAction.getActionTargetValue())) {
                    i++;
                }
                LogUtil.a("Suggestion_FitnessResultActivity", "finishAction:", Integer.valueOf(finishedAction), " TargetType:", Integer.valueOf(recordAction.getActionTargetType()), " TargetValue:", Float.valueOf(recordAction.getActionTargetValue()));
            }
        }
        this.ae = i;
        if (this.bd.size() == 1 && i == 0) {
            this.ae = 1;
        }
    }

    private void b(Intent intent) {
        if (intent.getIntExtra("entrance", 0) == 0) {
            MarketingApi marketingApi = (MarketingApi) Services.d("FeatureMarketing", MarketingApi.class);
            if (marketingApi == null) {
                LogUtil.a("Suggestion_FitnessResultActivity", "marketingApi is null");
                return;
            }
            b(marketingApi);
            b(marketingApi, n());
            b(marketingApi, 34);
            b(marketingApi, 61);
        }
        e();
    }

    private void d(Intent intent) {
        try {
            Bundle bundleExtra = intent.getBundleExtra("bundlekey");
            this.i = bundleExtra;
            if (bundleExtra != null) {
                this.ax = bundleExtra.getBoolean("isshowbutton");
                this.bo = this.i.getInt("track_type");
            }
            Bundle bundleB = ipi.b(intent.getStringExtra("fitness"));
            if (bundleB != null) {
                try {
                    this.bg = (WorkoutRecord) HiJsonUtil.d(bundleB.getString("workout_record"), WorkoutRecord.class);
                    ipi.a("fitness", this.v, -1L);
                    g();
                } catch (JsonSyntaxException unused) {
                    LogUtil.e("Suggestion_FitnessResultActivity", "parse WorkoutRecord error");
                }
            } else {
                this.bg = (WorkoutRecord) intent.getParcelableExtra("workout_record");
            }
            this.bb = intent.getLongExtra("plan_execute_time", 0L);
            this.aw = intent.getBooleanExtra("is_show_rpe", false);
        } catch (Exception e2) {
            LogUtil.j("Suggestion_FitnessResultActivity", LogAnonymous.b(e2));
        }
    }

    private void b(MarketingApi marketingApi, int i) {
        LogUtil.a("Suggestion_FitnessResultActivity", "triggerMarketingEvent: ", Integer.valueOf(i));
        MarketingOption.Builder builder = new MarketingOption.Builder();
        builder.setContext(this.v);
        if (i == 34 || i == 61) {
            HashMap map = new HashMap();
            map.put("fitness_finish_training", this.bz);
            builder.setTriggerEventParams(map);
            LogUtil.a("Suggestion_FitnessResultActivity", "marketingApi mWorkoutId: ", this.bz);
        }
        builder.setPageId(260);
        builder.setTypeId(i);
        marketingApi.triggerMarketingResourceEvent(builder.build());
    }

    private int n() {
        WorkoutRecord workoutRecord = this.bg;
        Integer num = f9083a.get(Integer.valueOf(workoutRecord != null ? workoutRecord.acquireCategory() : 0));
        if (num != null) {
            return num.intValue();
        }
        return 33;
    }

    private void b(MarketingApi marketingApi) {
        marketingApi.requestMarketingResource(new MarketingOption.Builder().setContext(this.v).setPageId(260).build());
    }

    protected void e() {
        MarketingApi marketingApi = (MarketingApi) Services.b("FeatureMarketing", MarketingApi.class);
        Task<Map<Integer, ResourceResultInfo>> resourceResultInfo = marketingApi.getResourceResultInfo(4158);
        resourceResultInfo.addOnSuccessListener(new b(this, marketingApi));
        resourceResultInfo.addOnFailureListener(new OnFailureListener() { // from class: hfq
            @Override // com.huawei.hmf.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                LogUtil.e("Suggestion_FitnessResultActivity", "initMarketing onFailure ", exc == null ? "" : exc.getMessage());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(MarketingApi marketingApi, Map<Integer, ResourceResultInfo> map) {
        HashMap map2 = new HashMap();
        map2.put("fitness_finish_training", this.bz);
        LogUtil.a("Suggestion_FitnessResultActivity", "marketingApi mWorkoutId: ", this.bz);
        MarketingOption marketingOptionBuild = new MarketingOption.Builder().setContext(com.huawei.haf.application.BaseApplication.b()).setTypeId(400).setResultInfoMap(map).setTriggerEventParams(map2).build();
        if (marketingApi == null) {
            LogUtil.j("Suggestion_FitnessResultActivity", "resourceInfo marketingApi == null");
            this.au = false;
            af();
            return;
        }
        List<View> marketingViewList = marketingApi.getMarketingViewList(this, marketingApi.filterMarketingRules(marketingOptionBuild));
        if (njy.e(marketingViewList)) {
            LogUtil.a("Suggestion_FitnessResultActivity", "market list is null");
            this.au = false;
            af();
            return;
        }
        this.au = true;
        LinearLayout linearLayout = this.z;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        for (View view : marketingViewList) {
            LinearLayout linearLayout2 = this.bc;
            if (linearLayout2 != null) {
                linearLayout2.addView(view);
            }
        }
        LogUtil.a("Suggestion_FitnessResultActivity", "mMarketingLayout == null", Boolean.valueOf(this.bc == null));
    }

    /* JADX INFO: loaded from: classes9.dex */
    static class b implements OnSuccessListener<Map<Integer, ResourceResultInfo>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<FitnessResultActivity> f9096a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final MarketingApi f9097b;

        b(FitnessResultActivity fitnessResultActivity, MarketingApi marketingApi) {
            this.f9096a = new WeakReference<>(fitnessResultActivity);
            this.f9097b = marketingApi;
        }

        @Override // com.huawei.hmf.tasks.OnSuccessListener
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Map<Integer, ResourceResultInfo> map) {
            FitnessResultActivity fitnessResultActivity = this.f9096a.get();
            if (fitnessResultActivity != null) {
                fitnessResultActivity.e(this.f9097b, map);
            } else {
                LogUtil.j("Suggestion_FitnessResultActivity", "TackOnSuccessListener activity == null");
            }
        }
    }

    private void b(Map<String, String> map) {
        WorkoutRecord workoutRecord = this.bg;
        if (workoutRecord == null) {
            return;
        }
        List<RecordAction> listB = b(workoutRecord.acquireActionSummary());
        this.bd = listB;
        for (RecordAction recordAction : listB) {
            if (recordAction != null && StringUtils.j(recordAction.getActionId()) && recordAction.getActionId().equals(recordAction.getActionName())) {
                recordAction.setActionName(map.get(recordAction.getActionId()));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(List<ChoreographedMultiActions> list) {
        if (isFinishing() || isDestroyed()) {
            return;
        }
        HashMap map = new HashMap();
        ArrayList<ChoreographedSingleAction> arrayList = new ArrayList();
        for (ChoreographedMultiActions choreographedMultiActions : list) {
            if (choreographedMultiActions != null && !njy.e(choreographedMultiActions.getActionList())) {
                arrayList.addAll(choreographedMultiActions.getActionList());
            }
        }
        for (ChoreographedSingleAction choreographedSingleAction : arrayList) {
            if (choreographedSingleAction != null && choreographedSingleAction.getAction() != null) {
                map.put(choreographedSingleAction.getAction().getId(), choreographedSingleAction.getAction().getName());
            }
        }
        b(map);
        ag();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(List<WorkoutAction> list) {
        if (isFinishing() || isDestroyed()) {
            return;
        }
        HashMap map = new HashMap();
        for (WorkoutAction workoutAction : list) {
            if (workoutAction != null && workoutAction.getAction() != null) {
                map.put(workoutAction.getAction().getId(), workoutAction.getAction().getName());
            }
        }
        b(map);
        m();
        ag();
    }

    private void y() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(btx.c());
        linearLayoutManager.setOrientation(0);
        this.ad.setLayoutManager(linearLayoutManager);
        this.ad.setAdapter(this.ar);
        setViewSafeRegion(false, this.ad);
    }

    private void s() {
        HealthScrollView healthScrollView = (HealthScrollView) findViewById(R.id.sug_fitness_scroll_view);
        cancelLayoutById(healthScrollView);
        healthScrollView.setScrollViewVerticalDirectionEvent(true);
        this.by = (HealthTextView) findViewById(R.id.sug_coachf_tv_congra);
        this.u = (ImageView) findViewById(R.id.sug_coachf_iv_close);
        this.x = (HealthTextView) findViewById(R.id.sug_coachf_tv_rate);
        this.w = (HealthTextView) findViewById(R.id.sug_coachf_tv_rate_title);
        this.r = (HealthTextView) findViewById(R.id.sug_coachf_tv_duration);
        this.s = (HealthTextView) findViewById(R.id.sug_coachf_tv_calorie);
        this.q = (HealthTextView) findViewById(R.id.sug_coach_calorie_unit);
        this.t = (HealthTextView) findViewById(R.id.sug_coach_calorie_unit2);
        this.n = (HealthTextView) findViewById(R.id.sug_coachf_tv_active_calorie);
        this.p = (HealthTextView) findViewById(R.id.sug_coach_active_calorie_unit);
        this.ah = (HealthTextView) findViewById(R.id.sug_coachf_tv_level);
        HealthRecycleView healthRecycleView = (HealthRecycleView) findViewById(R.id.sug_coachf_rcv_actions);
        this.o = healthRecycleView;
        healthRecycleView.setNestedScrollingEnabled(false);
        this.o.setLayoutManager(new LinearLayoutManager(this, 1, false));
        this.u.setOnClickListener(this);
        this.bi = (RelativeLayout) findViewById(R.id.sug_rl_startrunaftwarmup);
        this.bp = (HealthTextView) findViewById(R.id.sug_startrunaftwarmup);
        this.ab = (CustomTitleBar) findViewById(R.id.sug_fitness_title);
        this.f = (AutoFillColorView) findViewById(R.id.auto_fill_color_view);
        this.y = (HealthTextView) findViewById(R.id.sug_course_tv_duration);
        this.ca = (HealthTextView) findViewById(R.id.sug_coachf_train_time);
        this.m = (LinearLayout) findViewById(R.id.sug_coachf_calories_ll);
        this.l = findViewById(R.id.sug_coachf_space);
        this.e = (LinearLayout) findViewById(R.id.sug_coachf_active_calories_ll);
        this.f9085c = findViewById(R.id.sug_active_coachf_space);
        this.z = (LinearLayout) findViewById(R.id.sug_detail_info_re_course_layout);
        this.ad = (HealthRecycleView) findViewById(R.id.sug_recycleview_relative_course);
        this.bw = (HealthTextView) findViewById(R.id.sug_coach_train_times);
        this.ak = (LinearLayout) findViewById(R.id.sug_coachf_rate_ll);
        this.ag = (LinearLayout) findViewById(R.id.sug_fitness_tv_result_display);
        this.bc = (LinearLayout) findViewById(R.id.my_course_marketing_layout);
        this.d = (AiAnalysisView) findViewById(R.id.ai_analysis_view);
        if (LanguageUtil.ba(this)) {
            this.ab.setRightButtonDrawable(qqz.e(this, com.huawei.ui.commonui.R.drawable.ic_health_nav_share_black), qre.f(com.huawei.ui.commonui.R.string.accessibility_share));
        }
        setViewSafeRegion(true, this.ah, this.by, this.bw);
        setViewSafeRegion(true, findViewById(R.id.sug_coach_train_result_layout));
        setViewSafeRegion(true, findViewById(R.id.sug_fitness_result_action_completed_tv));
        setViewSafeRegion(false, this.ak);
        setViewSafeRegion(true, findViewById(R.id.sug_fitness_result_relative_course_header_tv));
        d(this.r, this.s, this.x, this.n);
        y();
    }

    @Override // com.huawei.health.suggestion.ui.BaseStateActivity, com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        FitnessResultInteractor fitnessResultInteractor = this.aq;
        if (fitnessResultInteractor != null) {
            fitnessResultInteractor.a();
            this.aq = null;
        }
        CardGuideViewModel cardGuideViewModel = this.k;
        if (cardGuideViewModel != null) {
            cardGuideViewModel.d(this);
        }
        ObserverManagerUtil.a(this.j, "UPDATE_AI_PLAN_COURSE_RECORD");
    }

    /* JADX INFO: loaded from: classes9.dex */
    static class d extends UiCallback<TrainStatistics> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private WeakReference<FitnessResultActivity> f9098c;

        d(FitnessResultActivity fitnessResultActivity) {
            this.f9098c = null;
            this.f9098c = new WeakReference<>(fitnessResultActivity);
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public void onFailure(int i, String str) {
            LogUtil.e("Suggestion_FitnessResultActivity", "getTotalTimeAndCalorie:", "errorCode=", Integer.valueOf(i), "   errorInfo=", str);
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(TrainStatistics trainStatistics) {
            FitnessResultActivity fitnessResultActivity = this.f9098c.get();
            if (fitnessResultActivity == null || trainStatistics == null) {
                LogUtil.j("Suggestion_FitnessResultActivity", "TrainStatisticsUiCallback onSuccess mTrainDetail is null");
                return;
            }
            LogUtil.d("Suggestion_FitnessResultActivity", "getTotalTimeAndCalorie success data = ", trainStatistics);
            fitnessResultActivity.bn = trainStatistics.acquireDuration();
            LogUtil.a("Suggestion_FitnessResultActivity", "getTotalTimeAndCalorie mTotalTime = ", Long.valueOf(fitnessResultActivity.bn));
        }
    }

    private void e(final WorkoutRecord workoutRecord) {
        if (workoutRecord == null) {
            return;
        }
        ThreadPoolManager.c().execute(new Runnable() { // from class: hfx
            @Override // java.lang.Runnable
            public final void run() {
                this.e.c(workoutRecord);
            }
        });
    }

    public /* synthetic */ void c(WorkoutRecord workoutRecord) {
        HashMap map = new HashMap(10);
        if (idy.d()) {
            map.put("date", Long.valueOf(workoutRecord.acquireExerciseTime()));
        }
        map.put("workout_name", workoutRecord.acquireWorkoutName());
        map.put("workout_id", workoutRecord.acquireWorkoutId());
        map.put("isAICourse", iei.d(workoutRecord));
        d((Map<String, Object>) map, true);
        idy.b("1130013", map);
        LogUtil.d("Suggestion_FitnessResultActivity", "Course history:", map.toString());
    }

    private void m(WorkoutRecord workoutRecord) {
        if (isFinishing() || isDestroyed()) {
            LogUtil.j("Suggestion_FitnessResultActivity", "this is Destroyed");
            return;
        }
        View viewInflate = View.inflate(getApplicationContext(), R.layout.sug_fitness_rpe_dialog, null);
        this.br = (HealthTextView) viewInflate.findViewById(R.id.sug_desc);
        this.bj = (LinearLayout) viewInflate.findViewById(R.id.sug_rpe_notgood);
        this.bm = (LinearLayout) viewInflate.findViewById(R.id.sug_rpe_ok);
        this.bl = (LinearLayout) viewInflate.findViewById(R.id.sug_rpe_good);
        this.bk = (LinearLayout) viewInflate.findViewById(R.id.sug_rpe_great);
        this.ba = (ImageView) viewInflate.findViewById(R.id.iv_not_good);
        this.az = (ImageView) viewInflate.findViewById(R.id.iv_ok);
        this.av = (ImageView) viewInflate.findViewById(R.id.iv_good);
        this.at = (ImageView) viewInflate.findViewById(R.id.iv_great);
        this.g = (HealthButton) viewInflate.findViewById(R.id.btn_ignore);
        this.h = (HealthButton) viewInflate.findViewById(R.id.btn_ok);
        this.g.setOnClickListener(this);
        this.h.setOnClickListener(this);
        this.bj.setOnClickListener(this);
        this.bm.setOnClickListener(this);
        this.bl.setOnClickListener(this);
        this.bk.setOnClickListener(this);
        CustomAlertDialog.Builder builder = new CustomAlertDialog.Builder(this.v);
        viewInflate.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        builder.e(0, 0);
        builder.a(viewInflate);
        builder.a(true);
        CustomAlertDialog customAlertDialogB = builder.b();
        this.ac = customAlertDialogB;
        customAlertDialogB.show();
        this.ac.setCancelable(false);
        this.ac.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.huawei.health.suggestion.ui.fitness.activity.FitnessResultActivity.8
            @Override // android.content.DialogInterface.OnDismissListener
            public void onDismiss(DialogInterface dialogInterface) {
                FitnessResultActivity fitnessResultActivity = FitnessResultActivity.this;
                fitnessResultActivity.d(fitnessResultActivity.bg);
            }
        });
        l(workoutRecord);
    }

    private void l(WorkoutRecord workoutRecord) {
        if (!btw.g()) {
            ReleaseLogUtil.d("Suggestion_FitnessResultActivity", "not support new ai fitness plan");
            return;
        }
        if (workoutRecord == null) {
            ReleaseLogUtil.a("Suggestion_FitnessResultActivity", "record is null, return");
            return;
        }
        final PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
        if (planApi == null) {
            ReleaseLogUtil.a("Suggestion_FitnessResultActivity", "getCoursePlanId, getCurrentPlan : planApi is null.");
        } else {
            ThreadPoolManager.c().a("Suggestion_FitnessResultActivity", new Runnable() { // from class: hfz
                @Override // java.lang.Runnable
                public final void run() {
                    this.f36715a.a(planApi);
                }
            });
        }
    }

    public /* synthetic */ void a(PlanApi planApi) {
        IntPlan currentAllPlan = planApi.getCurrentAllPlan();
        if (currentAllPlan != null && currentAllPlan.getSmartPlanType() == SmartPlanTypeEnum.SMART_WEIGHT_PLAN.getValue()) {
            ReleaseLogUtil.d("Suggestion_FitnessResultActivity", "is new weight plan");
            h(this.bg);
        } else {
            ReleaseLogUtil.d("Suggestion_FitnessResultActivity", "is not new weight plan, ", currentAllPlan == null ? "intPlan is null" : Integer.valueOf(currentAllPlan.getSmartPlanType()));
        }
    }

    private void h(final WorkoutRecord workoutRecord) {
        if (workoutRecord == null) {
            LogUtil.e("Suggestion_FitnessResultActivity", "record is null");
        } else if (this.br == null) {
            LogUtil.e("Suggestion_FitnessResultActivity", "mAiFitnessPlanEnergyReplacementCard is null");
        } else {
            HandlerExecutor.b(new Runnable() { // from class: hfs
                @Override // java.lang.Runnable
                public final void run() {
                    this.f36709b.a(workoutRecord);
                }
            });
        }
    }

    public /* synthetic */ void a(WorkoutRecord workoutRecord) {
        WorkoutRecord workoutRecord2 = this.bg;
        if (workoutRecord2 != null) {
            iei.d(workoutRecord2.acquireCategory(), 0);
        }
        this.br.setVisibility(0);
        this.br.setText(getString(R.string.IDS_hwh_fitness_rpe_feel_content, new Object[]{qre.e(R.plurals.IDS_kcalories_unit, Math.round(workoutRecord.acquireActualCalorie() / 1000.0f), UnitUtil.e(Math.round(workoutRecord.acquireActualCalorie() / 1000.0f), 1, 0))}));
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new ntn(workoutRecord.startTime(), workoutRecord.acquireExerciseTime()));
        btw.b(BaseApplication.getContext(), arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(WorkoutRecord workoutRecord) {
        if (workoutRecord == null) {
            return;
        }
        HashMap map = new HashMap(10);
        map.put("workout_id", workoutRecord.acquireWorkoutId());
        map.put("workout_name", workoutRecord.acquireWorkoutName());
        map.put("version", workoutRecord.acquireVersion());
        if (idy.d()) {
            map.put("finishRate", idy.c(workoutRecord.acquireFinishRate()));
        }
        map.put("rpe", Integer.valueOf(this.be));
        map.put("calories", Integer.valueOf((int) workoutRecord.acquireActualCalorie()));
        map.put("isAICourse", iei.d(workoutRecord));
        d((Map<String, Object>) map, false);
        idy.b("1130010", map);
        LogUtil.d("Suggestion_FitnessResultActivity", "BI_rpe：", map.toString());
    }

    private void d(Map<String, Object> map, boolean z) {
        SportServiceApi sportServiceApi = (SportServiceApi) Services.d("CoursePlanService", SportServiceApi.class);
        if (sportServiceApi == null) {
            return;
        }
        FitWorkout workout = sportServiceApi.getWorkout(this.bg.acquireWorkoutId());
        if (workout == null) {
            LogUtil.j("Suggestion_FitnessResultActivity", "getWorkout null.", this.bg.acquireWorkoutId());
            return;
        }
        String strE = gzx.e(workout.acquireClasses());
        if (TextUtils.isEmpty(strE)) {
            strE = gzx.c(workout.getPrimaryClassify());
        }
        map.put("type", strE);
        map.put("train_points", d(workout));
        map.put("difficulty", Integer.valueOf(workout.acquireDifficulty()));
        if (z) {
            map.put("duration", Integer.valueOf(workout.acquireDuration()));
        }
    }

    private String d(FitWorkout fitWorkout) {
        StringBuilder sb = new StringBuilder();
        if (njy.e(fitWorkout.acquireTrainingpoints())) {
            return sb.toString();
        }
        for (Attribute attribute : fitWorkout.acquireTrainingpoints()) {
            if (attribute != null) {
                sb.append(attribute.getName());
                sb.append(",");
            }
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R.id.sug_coachf_iv_close) {
            finish();
            return;
        }
        if (view.getId() == R.id.sug_startrunaftwarmup) {
            if (this.ax) {
                ai();
                return;
            } else {
                if (this.bg.isRunWorkout()) {
                    ab();
                    return;
                }
                return;
            }
        }
        if (view.getId() == R.id.sug_rpe_notgood) {
            c(view);
            this.be = 1;
            return;
        }
        if (view.getId() == R.id.sug_rpe_ok) {
            c(view);
            this.be = 2;
            return;
        }
        if (view.getId() == R.id.sug_rpe_good) {
            c(view);
            this.be = 3;
            return;
        }
        if (view.getId() == R.id.sug_rpe_great) {
            c(view);
            this.be = 4;
        } else if (view.getId() == R.id.btn_ignore) {
            this.ac.dismiss();
        } else if (view.getId() == R.id.btn_ok) {
            p();
            ae();
            this.ac.dismiss();
        }
    }

    private void ae() {
        int i = this.be;
        if (i == 0) {
            LogUtil.j("Suggestion_FitnessResultActivity", "updatePlanProgress FITNESS_REPORT_NOT_CHOOSE.");
            return;
        }
        this.bg.setFeedBack(i);
        LogUtil.a("Suggestion_FitnessResultActivity", "updatePlanProgress mReport = ", Integer.valueOf(this.be));
        ThreadPoolManager.c().execute(new Runnable() { // from class: hft
            @Override // java.lang.Runnable
            public final void run() {
                this.d.c();
            }
        });
    }

    public /* synthetic */ void c() {
        PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
        if (planApi == null) {
            LogUtil.j("Suggestion_FitnessResultActivity", "saveAndFinish, updatePlanProgress : planApi is null.");
            return;
        }
        planApi.setPlanType(0);
        planApi.updatePlanProgress(this.bg);
        if (TextUtils.isEmpty(this.bg.acquirePlanId()) || FitnessExternalUtils.b()) {
            return;
        }
        LogUtil.a("Suggestion_FitnessResultActivity", "planId:", this.bg.acquirePlanId());
        planApi.setPlanType(3);
        planApi.updatePlanProgress(this.bg);
    }

    private void c(View view) {
        this.h.setEnabled(true);
        this.h.setAlpha(1.0f);
        LinearLayout linearLayout = this.bj;
        if (linearLayout != null && linearLayout.getId() == view.getId()) {
            this.ba.setBackground(getResources().getDrawable(R.drawable.sug_rep_bg_checked));
        } else {
            this.ba.setBackground(getResources().getDrawable(R.drawable.sug_rep_bg_normal));
        }
        LinearLayout linearLayout2 = this.bm;
        if (linearLayout2 != null && linearLayout2.getId() == view.getId()) {
            this.az.setBackground(getResources().getDrawable(R.drawable.sug_rep_bg_checked));
        } else {
            this.az.setBackground(getResources().getDrawable(R.drawable.sug_rep_bg_normal));
        }
        LinearLayout linearLayout3 = this.bl;
        if (linearLayout3 != null && linearLayout3.getId() == view.getId()) {
            this.av.setBackground(getResources().getDrawable(R.drawable.sug_rep_bg_checked));
        } else {
            this.av.setBackground(getResources().getDrawable(R.drawable.sug_rep_bg_normal));
        }
        LinearLayout linearLayout4 = this.bk;
        if (linearLayout4 != null && linearLayout4.getId() == view.getId()) {
            this.at.setBackground(getResources().getDrawable(R.drawable.sug_rep_bg_checked));
        } else {
            this.at.setBackground(getResources().getDrawable(R.drawable.sug_rep_bg_normal));
        }
    }

    private void p() {
        WorkoutRecord workoutRecord = this.bg;
        if (workoutRecord == null || TextUtils.isEmpty(workoutRecord.acquirePlanId()) || TextUtils.isEmpty(this.bg.acquireWorkoutId()) || !FitnessExternalUtils.b()) {
            LogUtil.e("Suggestion_FitnessResultActivity", "postFeedback planId or courseId or mRecord null");
            return;
        }
        if (((PlanApi) Services.d("CoursePlanService", PlanApi.class)) == null) {
            LogUtil.e("Suggestion_FitnessResultActivity", "postFeedback : planApi is null.");
            return;
        }
        pec pecVar = new pec();
        pecVar.c(this.bg.acquirePlanId());
        pecVar.e(this.bg.acquireWorkoutId());
        pecVar.c(this.bg.acquireExerciseTime());
        pecVar.a(String.valueOf(this.be));
        pecVar.a(this.bb);
        LogUtil.a("Suggestion_FitnessResultActivity", "postFeedback planTime ", Long.valueOf(this.bb), " exTime ", Long.valueOf(this.bg.acquireExerciseTime()));
        LoginInit loginInit = LoginInit.getInstance(BaseApplication.getContext());
        if (loginInit == null) {
            LogUtil.e("Suggestion_FitnessResultActivity", "postFeedback() getAccountInfo == null");
            return;
        }
        SportServiceApi sportServiceApi = (SportServiceApi) Services.d("CoursePlanService", SportServiceApi.class);
        if (sportServiceApi != null) {
            sportServiceApi.addUpdateFeedback(loginInit.getUsetId(), pecVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        Bundle bundle = new Bundle();
        bundle.putLong("exercise_current_time", this.cb);
        bundle.putInt("levels_count", this.ay);
        bundle.putFloat("train_duration", this.bt);
        bundle.putFloat("calorie", this.bv);
        bundle.putFloat("active_calorie", this.bs);
        bundle.putInt("heart_rate", this.al);
        bundle.putFloat("percent", this.bu);
        bundle.putCharSequence("train_name", this.af);
        bundle.putLong("exercise_total_time", this.bn);
        bundle.putInt("action_count", this.ae);
        bundle.putInt("exercise_count", f9084b);
        bundle.putInt(DeviceCategoryFragment.DEVICE_TYPE, this.aa);
        if (getIntent() != null) {
            bundle.putInt("entrance", getIntent().getIntExtra("entrance", 0));
        }
        WorkoutRecord workoutRecord = this.bg;
        if (workoutRecord != null) {
            bundle.putString("workoutid", workoutRecord.acquireWorkoutId());
            if (this.bg.isFitnessRecordFromTv()) {
                bundle.putInt("product_id", this.bh);
            }
            bundle.putString("isAICourse", iei.d(this.bg));
        }
        this.aq.d(this, bundle);
    }

    private void ab() {
        String strAcquireRunWorkoutTrajectoryId = this.bg.acquireRunWorkoutTrajectoryId();
        LogUtil.a("Suggestion_FitnessResultActivity", "showTrainDetails :", strAcquireRunWorkoutTrajectoryId);
        if (strAcquireRunWorkoutTrajectoryId == null) {
            LogUtil.j("Suggestion_FitnessResultActivity", "button_show trajectoryId == null ");
        } else {
            hcu.b().c(strAcquireRunWorkoutTrajectoryId);
        }
    }

    private void ai() {
        Bundle bundle = this.i;
        if (bundle == null) {
            return;
        }
        int i = bundle.getInt("track_type");
        int i2 = this.i.getInt("track_target");
        float f = this.i.getFloat("track_targetvalue");
        if (i == 283) {
            hcu.b().b(this.v, i, i2, f);
            finish();
        } else {
            PermissionUtil.d(this.v, PermissionUtil.e(i), new g(this.v, i, i2, f));
        }
    }

    private void j(WorkoutRecord workoutRecord) {
        this.bv = ifp.c(Float.valueOf(workoutRecord.acquireActualCalorie())).floatValue();
        this.bs = ifp.c(Float.valueOf(workoutRecord.getActiveCalorie())).floatValue();
        this.bu = ifp.c(Float.valueOf(workoutRecord.acquireFinishRate())).floatValue();
        this.bt = ifp.c(Integer.valueOf(workoutRecord.getDuration())).floatValue();
        String strC = StringUtils.c((Object) workoutRecord.acquireWorkoutName());
        this.af = strC;
        this.by.setText(strC);
        if (!TextUtils.isEmpty(this.af) && !this.ao && !SportSupportUtil.h()) {
            i(workoutRecord);
        }
        g(workoutRecord);
        f(workoutRecord);
        aa();
        if (this.ao) {
            int iAcquireDifficulty = workoutRecord.acquireDifficulty();
            this.ay = iAcquireDifficulty;
            this.ah.setText(iec.c(iAcquireDifficulty));
            this.y.setText(gzx.d(R.plurals.IDS_plugin_fitnessadvice_min, (int) (workoutRecord.acquireCourseDuration() / 60.0f), UnitUtil.e(workoutRecord.acquireCourseDuration() / 60.0f, 1, 0)));
        }
        x();
        w();
        if (this.bg.isSpecialAiWorkout()) {
            j();
        }
        b(workoutRecord);
    }

    private void b(WorkoutRecord workoutRecord) {
        if (!this.bg.isBeitiOrYogaAiWorkout() || !this.ao) {
            ag();
        }
        boolean zIsSingle = workoutRecord.isSingle();
        String strAcquireWorkoutId = workoutRecord.acquireWorkoutId();
        if (zIsSingle) {
            showLoading();
            e(strAcquireWorkoutId);
        } else if (this.ao) {
            e(workoutRecord.acquireWorkoutId());
            LogUtil.j("Suggestion_FitnessResultActivity", "getWorkoutCount CountInfoByID");
        } else {
            CourseApi courseApi = (CourseApi) Services.d("CoursePlanService", CourseApi.class);
            if (courseApi != null) {
                courseApi.getWorkoutCount(strAcquireWorkoutId, workoutRecord.acquireVersion(), new a(this));
            }
        }
    }

    private void g(WorkoutRecord workoutRecord) {
        long j = this.cb;
        if (j > 0) {
            this.ca.setText(DateFormatUtil.a(j, DateFormatUtil.DateFormatType.DATE_FORMAT_YMD_HM));
        }
        this.r.setText(UnitUtil.e((int) TimeUnit.MILLISECONDS.toSeconds(workoutRecord.getDuration())));
        LogUtil.a("Suggestion_FitnessResultActivity", "is link wear:", Boolean.valueOf(workoutRecord.isLinkWear()));
        if (workoutRecord.isLinkWear()) {
            Drawable drawableK = k();
            if (drawableK != null) {
                drawableK.setBounds(0, 0, qrs.d(this.v, 12.0f), qrs.d(this.v, 12.0f));
                this.q.setCompoundDrawables(null, null, drawableK, null);
                this.p.setCompoundDrawables(null, null, drawableK, null);
            }
            this.m.setOnClickListener(new View.OnClickListener() { // from class: hfp
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.e.a(view);
                }
            });
            this.e.setOnClickListener(new View.OnClickListener() { // from class: hfu
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f36710a.d(view);
                }
            });
        }
        if (this.bg.isShowScores()) {
            this.w.setText(com.huawei.health.servicesui.R.string.IDS_fitness_score);
            this.x.setText(UnitUtil.e(workoutRecord.acquireFinishRate(), 1, 0));
        } else {
            this.w.setText(R.string.sug_coach_rate);
            this.x.setText(UnitUtil.e(workoutRecord.acquireFinishRate() <= 100.0f ? workoutRecord.acquireFinishRate() : 100.0f, 2, 0));
        }
    }

    public /* synthetic */ void a(View view) {
        qpx.e(this.v, qre.f(R.string.IDS_fitness_calories_from_wear));
    }

    public /* synthetic */ void d(View view) {
        qpx.e(this.v, qre.f(R.string.IDS_fitness_calories_from_wear));
    }

    private void f(WorkoutRecord workoutRecord) {
        String strF;
        String strE;
        float fAcquireActualCalorie = workoutRecord.acquireActualCalorie();
        this.s.setText(fAcquireActualCalorie < 0.5f ? qre.f(R.string.sug_string_default) : ped.e(fAcquireActualCalorie));
        float activeCalorie = workoutRecord.getActiveCalorie();
        boolean z = ((double) activeCalorie) > 1.0E-6d && activeCalorie < fAcquireActualCalorie;
        if (z) {
            HealthTextView healthTextView = this.n;
            if (activeCalorie < 0.5f) {
                strE = qre.f(R.string.sug_string_default);
            } else {
                strE = ped.e(activeCalorie);
            }
            healthTextView.setText(strE);
        }
        HealthTextView healthTextView2 = this.q;
        if (z) {
            strF = qre.f(R.string.IDS_track_total_calorie);
        } else {
            strF = qre.f(R.string.IDS_track_total_calorie_kcal);
        }
        healthTextView2.setText(strF);
        qsp.c((View) this.t, z ? 0 : 8);
        qsp.c((View) this.e, z ? 0 : 8);
        qsp.c(this.f9085c, z ? 0 : 8);
        c(z ? 20 : 24, this.r, this.s, this.x, this.n);
    }

    private Drawable k() {
        Drawable drawable = ContextCompat.getDrawable(this.v, R.drawable.ic_sporthistory_watch);
        return qqs.e(this.v) ? qqf.c(drawable, ContextCompat.getColor(this.v, R.color.colorPrimary)) : drawable;
    }

    private void ag() {
        List<RecordAction> list = this.bd;
        if (list == null || list.size() <= 0) {
            return;
        }
        findViewById(R.id.sug_coach_action_layout).setVisibility(0);
        e(this.bd);
        this.o.getAdapter().notifyDataSetChanged();
    }

    private void j() {
        this.ag.setVisibility(0);
        if (this.bg.acquireCourseType() == 222) {
            i();
            return;
        }
        if (this.bg.acquireCourseType() == 333) {
            d();
        } else if (this.bg.acquireCourseType() == 444) {
            h();
            d();
        } else {
            f();
        }
    }

    private void i() {
        try {
            hlz hlzVar = (hlz) peh.b(this.bg.acquireExtendString(WorkoutRecord.Extend.FIT_EXTEND_STRETCH_RESULT), hlz.class);
            if (hlzVar != null) {
                StrechMuscleView strechMuscleView = new StrechMuscleView(this.v);
                strechMuscleView.setData(hlzVar.e(), hlzVar.c(), (int) this.bg.acquireFinishRate());
                this.ag.addView(strechMuscleView);
            }
        } catch (JsonSyntaxException unused) {
            ReleaseLogUtil.a("Suggestion_FitnessResultActivity", "displayStretchMuscleView JsonSyntaxException.");
        }
    }

    private void h() {
        try {
            hlh hlhVar = (hlh) peh.b(this.bg.acquireExtendString(WorkoutRecord.Extend.FIT_EXTEND_SCORE_RADAR), hlh.class);
            if (hlhVar != null) {
                ActionRadarView actionRadarView = new ActionRadarView(this.v);
                actionRadarView.setData(new double[]{hlhVar.d(), hlhVar.h(), hlhVar.a(), hlhVar.c(), hlhVar.e(), hlhVar.b()}, this.bg.acquireFinishRate());
                this.ag.addView(actionRadarView);
            }
        } catch (JsonSyntaxException unused) {
            ReleaseLogUtil.a("Suggestion_FitnessResultActivity", "displayCompletedActionScoreView JsonSyntaxException.");
        }
    }

    private void d() {
        try {
            List<hmb> list = (List) peh.d(this.bg.acquireActionSummary(), new TypeToken<List<hmb>>() { // from class: com.huawei.health.suggestion.ui.fitness.activity.FitnessResultActivity.7
            }.getType());
            if (njy.b(list)) {
                ScorePersentView scorePersentView = new ScorePersentView(this.v);
                scorePersentView.setActionScoreAdapter(list);
                this.ag.addView(scorePersentView);
            }
        } catch (JsonSyntaxException unused) {
            ReleaseLogUtil.a("Suggestion_FitnessResultActivity", "displayActionSummaryListView JsonSyntaxException.");
        }
    }

    private void f() {
        try {
            hmb hmbVar = (hmb) peh.b(this.bg.acquireExtendString(WorkoutRecord.Extend.FIT_EXTEND_ACTION_COMPLETION_STATUS), hmb.class);
            if (hmbVar != null) {
                ActionRingChartView actionRingChartView = new ActionRingChartView(this.v);
                actionRingChartView.setData(new double[]{hmbVar.j(), hmbVar.c(), hmbVar.d(), hmbVar.b(), hmbVar.h()});
                this.ag.addView(actionRingChartView);
            }
        } catch (JsonSyntaxException unused) {
            ReleaseLogUtil.a("Suggestion_FitnessResultActivity", "displayActionSummaryView JsonSyntaxException.");
        }
    }

    private void i(final WorkoutRecord workoutRecord) {
        Drawable drawable;
        if (workoutRecord == null) {
            LogUtil.j("Suggestion_FitnessResultActivity", "setWorkoutNameClickListener, the workout is null, return");
            return;
        }
        if (!TextUtils.isEmpty(workoutRecord.acquirePlanId()) || workoutRecord.getCourseDefineType() == 1 || CommonUtil.ca()) {
            LogUtil.a("Suggestion_FitnessResultActivity", "workout.", workoutRecord.acquirePlanId(), " ", Integer.valueOf(workoutRecord.getCourseDefineType()));
            return;
        }
        if (LanguageUtil.ba(this)) {
            drawable = qqz.e(this, R.drawable.ic_next);
        } else {
            drawable = getResources().getDrawable(R.drawable.ic_next);
        }
        drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
        this.by.setCompoundDrawablesRelative(null, null, drawable, null);
        this.by.setOnClickListener(new View.OnClickListener() { // from class: hfo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FitnessResultActivity.c(workoutRecord, view);
            }
        });
    }

    public static /* synthetic */ void c(WorkoutRecord workoutRecord, View view) {
        WorkoutRecord workoutRecord2 = new WorkoutRecord();
        workoutRecord2.saveVersion(workoutRecord.acquireVersion());
        workoutRecord2.saveExerciseTime(workoutRecord.acquireExerciseTime());
        workoutRecord2.saveWorkoutId(workoutRecord.acquireWorkoutId());
        workoutRecord2.savePlanId("");
        workoutRecord2.saveWorkoutName(workoutRecord.acquireWorkoutName());
        workoutRecord2.saveCalorie(workoutRecord.acquireCalorie());
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(workoutRecord2);
        pcd pcdVar = new pcd(workoutRecord.acquireWorkoutId());
        pcdVar.a("FitnessResult");
        pea.b(btx.c(), pcdVar, (ArrayList<WorkoutRecord>) arrayList);
    }

    private void e(List<RecordAction> list) {
        this.o.setAdapter(new BaseRecyclerViewAdapter<RecordAction>(list, R.layout.sug_coach_item_fitness_finish_rcv) { // from class: com.huawei.health.suggestion.ui.fitness.activity.FitnessResultActivity.6
            @Override // com.huawei.health.suggestion.ui.fitness.helper.BaseRecyclerViewAdapter
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public void convert(RecyclerHolder recyclerHolder, int i, RecordAction recordAction) {
                hiv.c(recyclerHolder, recordAction);
            }
        });
    }

    private void x() {
        List<HeartRateData> list = this.aj;
        if (list == null || list.size() <= 0) {
            LogUtil.j("Suggestion_FitnessResultActivity", "setRateInfoData: The mHeartRateDataList is null or empty, return.");
            return;
        }
        this.ap = this.bg.acquireHeartRateZoneType();
        int iAcquireHeartRatePostureType = this.bg.acquireHeartRatePostureType();
        this.an = iAcquireHeartRatePostureType;
        LogUtil.a("Suggestion_FitnessResultActivity", " mHeartRatePostureType", Integer.valueOf(iAcquireHeartRatePostureType), " mHeartRateZoneType= ", Integer.valueOf(this.ap));
        int iD = gzz.d(d(this.aj));
        int iAcquireAvgHeartRate = this.bg.acquireAvgHeartRate();
        this.al = iAcquireAvgHeartRate;
        if (this.bx == null) {
            this.bq = qqs.e(this.v) ? 101 : 100;
            ViewHolderBase chartViewHolder = gcn.c().getChartViewHolder(this.v, this.bq);
            this.bx = chartViewHolder;
            if (chartViewHolder == null) {
                LogUtil.j("Suggestion_FitnessResultActivity", "setRateInfoData failed, mViewHolderBase is null");
                return;
            }
        }
        if (this.am == null) {
            View viewBuildView = this.bx.buildView(this.an, this.ap);
            this.am = viewBuildView;
            c((HealthTextView) viewBuildView.findViewById(com.huawei.health.servicesui.R.id.track_share_heart_title), getResources().getDimensionPixelSize(com.huawei.ui.commonui.R.dimen.textSizeSubTitle2));
            a((HealthTextView) this.am.findViewById(com.huawei.health.servicesui.R.id.track_share_heart_unit), Typeface.create(getResources().getString(com.huawei.ui.commonui.R.string.textFontFamilyRegular), 0));
        }
        c(this.am, iAcquireAvgHeartRate);
        a(this.am, iD);
        c((ImageView) this.am.findViewById(com.huawei.health.servicesui.R.id.heart_rate_information_icon));
        ad();
        gzz.a();
        HwHealthBaseCombinedChart hwHealthBaseCombinedChartAcquireHeartRateChart = this.bx.acquireHeartRateChart();
        if (hwHealthBaseCombinedChartAcquireHeartRateChart != null) {
            HeartRateLineChartHolderImpl heartRateLineChartHolderImpl = new HeartRateLineChartHolderImpl(this);
            new ieo(heartRateLineChartHolderImpl).b(this.bg);
            heartRateLineChartHolderImpl.addHeartRateDataLayer(hwHealthBaseCombinedChartAcquireHeartRateChart, new TrackLineChartHolder.c().d(this.bq == 100).e(true), iAcquireAvgHeartRate);
            hwHealthBaseCombinedChartAcquireHeartRateChart.setTouchEnabled(false);
            hwHealthBaseCombinedChartAcquireHeartRateChart.setTimeValueMode(HwHealthBaseCombinedChart.TimeValueMode.MINUTES);
            hwHealthBaseCombinedChartAcquireHeartRateChart.refresh();
        } else {
            LogUtil.j("Suggestion_FitnessResultActivity", "drawHeartRateDataView chart is null");
        }
        findViewById(R.id.sug_coach_heart_rate_layout).setVisibility(0);
        this.ak.addView(this.am);
    }

    private void c(ImageView imageView) {
        if (imageView == null) {
            LogUtil.e("Suggestion_FitnessResultActivity", "explainIcon is null");
            return;
        }
        imageView.setVisibility(0);
        imageView.setBackground(BaseApplication.getContext().getDrawable(R.drawable.ic_statistics_explain));
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.fitness.activity.FitnessResultActivity.13
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (qrs.r()) {
                    LogUtil.j("Suggestion_FitnessResultActivity", "downRemindClick is fast click");
                } else {
                    dem.b().a(ObserveLabels.HEART_RATE);
                }
            }
        });
    }

    private void c(View view, int i) {
        HealthTextView healthTextView = (HealthTextView) view.findViewById(com.huawei.health.servicesui.R.id.track_share_device_heart_avg_num);
        d(healthTextView, UnitUtil.e(i, 1, 0));
        d(healthTextView);
    }

    private void a(View view, int i) {
        HealthTextView healthTextView = (HealthTextView) view.findViewById(com.huawei.health.servicesui.R.id.track_share_device_heart_max_num);
        d(healthTextView, UnitUtil.e(i, 1, 0));
        d(healthTextView);
    }

    private void d(HealthTextView healthTextView, String str) {
        if (healthTextView != null) {
            healthTextView.setText(str);
        }
    }

    private void c(HealthTextView healthTextView, float f) {
        if (healthTextView != null) {
            healthTextView.setTextSize(0, f);
        }
    }

    private void a(HealthTextView healthTextView, Typeface typeface) {
        if (healthTextView != null) {
            healthTextView.setTypeface(typeface);
        }
    }

    private void ad() {
        final UserProfileMgrApi userProfileMgrApi = (UserProfileMgrApi) Services.d("HWUserProfileMgr", UserProfileMgrApi.class);
        if (userProfileMgrApi == null) {
            LogUtil.j("Suggestion_FitnessResultActivity", "getLocalUserInfo : userProfileMgrApi is null.");
        } else {
            lsy.a(new Runnable() { // from class: com.huawei.health.suggestion.ui.fitness.activity.FitnessResultActivity.3
                @Override // java.lang.Runnable
                public void run() {
                    int[] iArrAcquireHeartRateZoneStatistic = FitnessResultActivity.this.bg.acquireHeartRateZoneStatistic();
                    if (gzz.a(iArrAcquireHeartRateZoneStatistic)) {
                        LogUtil.a("Suggestion_FitnessResultActivity", "HeartRateZoneStatistic is invalid");
                        FitnessResultActivity fitnessResultActivity = FitnessResultActivity.this;
                        iArrAcquireHeartRateZoneStatistic = gzz.e(fitnessResultActivity.d((List<HeartRateData>) fitnessResultActivity.aj), FitnessResultActivity.this.ap, FitnessResultActivity.this.bg.getDuration(), FitnessResultActivity.this.bg.acquireHeartRateConfig(), userProfileMgrApi.getLocalUserInfo(), FitnessResultActivity.this.an);
                    }
                    LogUtil.a("Suggestion_FitnessResultActivity", "timeArea = ", Arrays.toString(iArrAcquireHeartRateZoneStatistic));
                    Message messageObtainMessage = FitnessResultActivity.this.ai.obtainMessage();
                    messageObtainMessage.what = 106;
                    messageObtainMessage.obj = iArrAcquireHeartRateZoneStatistic;
                    FitnessResultActivity.this.ai.sendMessage(messageObtainMessage);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int[] iArr) {
        int i = iArr[4];
        int i2 = iArr[3];
        int i3 = iArr[2];
        int i4 = iArr[1];
        int i5 = iArr[0];
        if (i5 + i4 + i3 + i + i2 == 0) {
            this.am.findViewById(com.huawei.health.servicesui.R.id.heart_rate_chart_show_layout).setVisibility(8);
            return;
        }
        ArrayList arrayList = new ArrayList(5);
        arrayList.add(Integer.valueOf(i5));
        arrayList.add(Integer.valueOf(i4));
        arrayList.add(Integer.valueOf(i3));
        arrayList.add(Integer.valueOf(i2));
        arrayList.add(Integer.valueOf(i));
        List<qjp> listA = a(arrayList);
        HealthRingChart healthRingChart = (HealthRingChart) this.am.findViewById(com.huawei.health.servicesui.R.id.sug_sc_j_heart_pie);
        HealthRingChartAdapter healthRingChartAdapter = new HealthRingChartAdapter(this.v, new qjm().b(false).c(true), listA);
        healthRingChartAdapter.d(new HealthRingChartAdapter.DataFormatter() { // from class: hfl
            @Override // com.huawei.ui.commonui.chart.HealthRingChartAdapter.DataFormatter
            public final String format(qjp qjpVar) {
                return this.e.e(qjpVar);
            }
        });
        healthRingChart.setAdapter(healthRingChartAdapter);
        if (LanguageUtil.o(this.v)) {
            healthRingChart.setDesc(this.v.getResources().getString(com.huawei.health.servicesui.R.string.IDS_main_watch_heart_rate_string), this.v.getResources().getString(com.huawei.health.servicesui.R.string.IDS_hwh_motiontrack_heart_rate_zone));
        }
    }

    public /* synthetic */ String e(qjp qjpVar) {
        return c((int) qjpVar.f());
    }

    private List<qjp> a(List<Integer> list) {
        int iD = this.ap;
        if (iD < 0 || iD > 3) {
            iD = gzz.d();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(ContextCompat.getColor(this.v, R.color.pie_sector_heart_rate_warmup_color_end)));
        arrayList.add(Integer.valueOf(ContextCompat.getColor(this.v, R.color.pie_sector_heart_rate_fatburn_color_end)));
        arrayList.add(Integer.valueOf(ContextCompat.getColor(this.v, R.color.pie_sector_heart_rate_aerobic_color_end)));
        arrayList.add(Integer.valueOf(ContextCompat.getColor(this.v, R.color.pie_sector_heart_rate_anaerobic_color_end)));
        arrayList.add(Integer.valueOf(ContextCompat.getColor(this.v, R.color.pie_sector_heart_rate_extreme_color_end)));
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(Integer.valueOf(ContextCompat.getColor(this.v, R.color.pie_sector_heart_rate_warmup_color_begin)));
        arrayList2.add(Integer.valueOf(ContextCompat.getColor(this.v, R.color.pie_sector_heart_rate_fatburn_color_begin)));
        arrayList2.add(Integer.valueOf(ContextCompat.getColor(this.v, R.color.pie_sector_heart_rate_aerobic_color_begin)));
        arrayList2.add(Integer.valueOf(ContextCompat.getColor(this.v, R.color.pie_sector_heart_rate_anaerobic_color_begin)));
        arrayList2.add(Integer.valueOf(ContextCompat.getColor(this.v, R.color.pie_sector_heart_rate_extreme_color_begin)));
        List<String> listC = hae.c(iD);
        int size = listC.size();
        ArrayList arrayList3 = new ArrayList(size);
        while (true) {
            size--;
            if (size < 0) {
                return arrayList3;
            }
            arrayList3.add(new qjp(size < listC.size() ? listC.get(size) : "", list.get(size).intValue(), size < arrayList.size() ? ((Integer) arrayList.get(size)).intValue() : 0, size < arrayList2.size() ? ((Integer) arrayList2.get(size)).intValue() : 0));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<HeartRateData> d(List<HeartRateData> list) {
        ArrayList arrayList = new ArrayList(list != null ? list.size() : 0);
        if (list != null) {
            for (HeartRateData heartRateData : list) {
                if (heartRateData != null) {
                    arrayList.add(new HeartRateData(heartRateData.acquireTime(), heartRateData.acquireHeartRate()));
                }
            }
        }
        return arrayList;
    }

    private String c(int i) {
        Context context = this.v;
        if (context == null) {
            return null;
        }
        if (i > 0 && i < 60) {
            return context.getString(com.huawei.health.servicesui.R.string.IDS_motiontrack_show_chart_less_than_one_minute, 1);
        }
        return qrs.a((int) TimeUnit.SECONDS.toMinutes(i), this.v);
    }

    private void aa() {
        if (this.ax) {
            int i = this.bo;
            if (i != 283) {
                switch (i) {
                    case 257:
                        this.bp.setText(com.huawei.ui.commonui.R.string.IDS_main_time_line_start_walking);
                        break;
                    case 258:
                        this.bp.setText(com.huawei.ui.commonui.R.string.IDS_main_time_line_start_running);
                        break;
                    case 259:
                        this.bp.setText(com.huawei.ui.commonui.R.string.IDS_main_time_line_start_cycling);
                        break;
                }
            } else {
                this.bp.setText(com.huawei.ui.commonui.R.string.IDS_indoor_start_skipping);
            }
            this.bi.setVisibility(0);
            this.bp.setOnClickListener(this);
            return;
        }
        if (this.bg.isRunWorkout()) {
            ac();
        }
    }

    private void w() {
        CourseApi courseApi = (CourseApi) Services.d("CoursePlanService", CourseApi.class);
        if (courseApi == null) {
            LogUtil.j("Suggestion_FitnessResultActivity", "refreshDifficulty : courseApi is null.");
        } else {
            courseApi.getCourseById(this.bg.acquireWorkoutId(), this.bg.acquireVersion(), null, new h(this));
        }
    }

    private void ac() {
        LogUtil.d("Suggestion_FitnessResultActivity", "showTrackButton:");
        this.bp.setText(R.string.IDS_fit_result_button_text);
        this.bi.setVisibility(0);
        this.bp.setOnClickListener(this);
    }

    /* JADX INFO: loaded from: classes9.dex */
    static class a extends UiCallback<Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        WeakReference<FitnessResultActivity> f9095a;

        a(FitnessResultActivity fitnessResultActivity) {
            this.f9095a = new WeakReference<>(fitnessResultActivity);
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public void onFailure(int i, String str) {
            LogUtil.j("Suggestion_FitnessResultActivity", "errorCode = ", Integer.valueOf(i), ".errorInfo = ", str);
            FitnessResultActivity fitnessResultActivity = this.f9095a.get();
            if (fitnessResultActivity != null) {
                if (fitnessResultActivity.mLoadingView != null) {
                    fitnessResultActivity.mLoadingView.setVisibility(8);
                }
                fitnessResultActivity.a(0);
            }
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Integer num) {
            FitnessResultActivity fitnessResultActivity = this.f9095a.get();
            if (fitnessResultActivity != null) {
                if (fitnessResultActivity.mLoadingView != null) {
                    fitnessResultActivity.mLoadingView.setVisibility(8);
                }
                if (num == null) {
                    int unused = FitnessResultActivity.f9084b = 0;
                    fitnessResultActivity.a(0);
                } else {
                    int unused2 = FitnessResultActivity.f9084b = num.intValue();
                    fitnessResultActivity.a(num.intValue());
                }
            }
        }
    }

    private void e(String str) {
        CourseApi courseApi = (CourseApi) Services.d("CoursePlanService", CourseApi.class);
        if (courseApi == null) {
            ReleaseLogUtil.d("R_Suggestion_FitnessResultActivity", "courseApi is null");
            a(0);
            f9084b = 0;
            finishLoading();
            return;
        }
        courseApi.queryTrainCountByCourseId(str, new UiCallback<Integer>() { // from class: com.huawei.health.suggestion.ui.fitness.activity.FitnessResultActivity.2
            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            public void onFailure(int i, String str2) {
                FitnessResultActivity.this.a(0);
                int unused = FitnessResultActivity.f9084b = 0;
                FitnessResultActivity.this.finishLoading();
            }

            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onSuccess(final Integer num) {
                FitnessResultActivity.this.runOnUiThread(new Runnable() { // from class: com.huawei.health.suggestion.ui.fitness.activity.FitnessResultActivity.2.3
                    @Override // java.lang.Runnable
                    public void run() {
                        int unused = FitnessResultActivity.f9084b = num.intValue();
                        FitnessResultActivity.this.a(num.intValue());
                        FitnessResultActivity.this.finishLoading();
                    }
                });
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        LogUtil.a("Suggestion_FitnessResultActivity", "Get times of train from db, trainTimes = ", Integer.valueOf(i));
        if (i == 0) {
            this.bw.setVisibility(8);
        } else {
            this.bw.setVisibility(0);
            this.bw.setText(gzx.d(R.plurals.sug_train_times, i, Integer.valueOf(i)));
        }
    }

    private void d(HealthTextView... healthTextViewArr) {
        if (healthTextViewArr == null) {
            return;
        }
        Typeface typefaceCreateFromAsset = Typeface.createFromAsset(getAssets(), "font/HarmonyOSCondensedClockProportional-Medium.ttf");
        for (HealthTextView healthTextView : healthTextViewArr) {
            if (healthTextView != null) {
                a(healthTextView, typefaceCreateFromAsset);
            }
        }
    }

    private void c(int i, HealthTextView... healthTextViewArr) {
        if (healthTextViewArr == null) {
            return;
        }
        for (HealthTextView healthTextView : healthTextViewArr) {
            qsp.b(healthTextView, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(boolean z) {
        this.m.setVisibility(z ? 0 : 8);
        this.l.setVisibility(z ? 0 : 8);
    }

    private List<RecordAction> b(String str) {
        if (str == null) {
            return Collections.EMPTY_LIST;
        }
        return peh.c(str, RecordAction[].class);
    }

    /* JADX INFO: loaded from: classes9.dex */
    public static class h extends UiCallback<Workout> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<FitnessResultActivity> f9103a;

        h(FitnessResultActivity fitnessResultActivity) {
            this.f9103a = new WeakReference<>(fitnessResultActivity);
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public void onFailure(int i, String str) {
            LogUtil.j("Suggestion_FitnessResultActivity", "WorkoutDifficultyUiCallback errorCode:", Integer.valueOf(i), "errorInfo:", str);
            d();
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Workout workout) {
            final FitnessResultActivity fitnessResultActivity = this.f9103a.get();
            if (fitnessResultActivity == null) {
                LogUtil.j("Suggestion_FitnessResultActivity", "WorkoutDifficultyUiCallback failed with activity is null");
                return;
            }
            final FitWorkout fitWorkoutD = pea.d(workout);
            if (fitWorkoutD == null) {
                LogUtil.j("Suggestion_FitnessResultActivity", "request workout result data is null");
                d();
                return;
            }
            d(fitnessResultActivity, fitWorkoutD);
            if (fitWorkoutD.getCourseDefineType() == 1) {
                fitnessResultActivity.ah.setText(fitnessResultActivity.v.getString(R.string.IDS_sug_custom_course_name));
                fitnessResultActivity.y.setVisibility(8);
            }
            String strAcquireMidPicture = fitWorkoutD.acquireMidPicture();
            String strAcquirePicture = fitWorkoutD.acquirePicture();
            if (!TextUtils.isEmpty(StringUtils.c((Object) strAcquireMidPicture)) || !TextUtils.isEmpty(StringUtils.c((Object) strAcquirePicture))) {
                d(strAcquireMidPicture, strAcquirePicture, fitnessResultActivity.f);
            } else {
                fitnessResultActivity.f.d(b(fitnessResultActivity, fitWorkoutD), true);
            }
            btt.d().c(new Runnable() { // from class: hgd
                @Override // java.lang.Runnable
                public final void run() {
                    this.f36721c.c(fitWorkoutD, fitnessResultActivity);
                }
            });
            a(fitWorkoutD, fitnessResultActivity);
        }

        private void a(FitWorkout fitWorkout, FitnessResultActivity fitnessResultActivity) {
            if (fitWorkout.getVideoProperty() != 3) {
                fitnessResultActivity.b(true);
                fitnessResultActivity.ab.setRightButtonVisibility(0);
            } else {
                fitnessResultActivity.ab.setRightButtonVisibility(8);
                fitnessResultActivity.b(false);
            }
        }

        private void d(FitnessResultActivity fitnessResultActivity, FitWorkout fitWorkout) {
            if (fitnessResultActivity.ao) {
                return;
            }
            fitnessResultActivity.ay = fitWorkout.acquireDifficulty();
            if (fitWorkout.isNewRunCourse()) {
                fitnessResultActivity.c(fitWorkout.getCourseActions());
            } else if (!fitWorkout.isEquipmentCourse()) {
                fitnessResultActivity.b(fitWorkout.acquireWorkoutActions());
            } else {
                LogUtil.a("Suggestion_FitnessResultActivity", "isEquipmentCourse");
            }
            fitnessResultActivity.ah.setText(iec.c(fitnessResultActivity.ay));
            if (fitWorkout.acquireMeasurementType() != 0) {
                if (fitWorkout.acquireDuration() / 60.0f < 1.0f) {
                    fitnessResultActivity.y.setVisibility(8);
                    return;
                } else {
                    LogUtil.d("Suggestion_FitnessResultActivity", "WorkoutAction.MEASUREMENTTYPE_TIME:", Integer.valueOf(fitWorkout.acquireMeasurementType()));
                    fitnessResultActivity.y.setText(gzx.d(R.plurals.IDS_plugin_fitnessadvice_min, (int) (fitWorkout.acquireDuration() / 60.0f), UnitUtil.e(fitWorkout.acquireDuration() / 60.0f, 1, 0)));
                    return;
                }
            }
            boolean zF = UnitUtil.f();
            double dAcquireDistance = fitWorkout.acquireDistance() / 1000.0d;
            double dE = UnitUtil.e(dAcquireDistance, 3);
            if (zF) {
                dAcquireDistance = dE;
            }
            fitnessResultActivity.y.setText(gzx.d(com.huawei.health.basefitnessadvice.R.plurals.sug_km, (int) dAcquireDistance, UnitUtil.e(dAcquireDistance, 1, 0)));
        }

        private void d() {
            FitnessResultActivity fitnessResultActivity = this.f9103a.get();
            int i = qrs.x(fitnessResultActivity) ? R.color.white : R.color.black;
            if (fitnessResultActivity != null) {
                a(fitnessResultActivity, i);
                if (fitnessResultActivity.f != null) {
                    fitnessResultActivity.f.d(b(fitnessResultActivity, (FitWorkout) null), true);
                }
                b(fitnessResultActivity, i);
                if (fitnessResultActivity.bw != null) {
                    fitnessResultActivity.bw.setTextColor(fitnessResultActivity.getResources().getColor(i));
                    fitnessResultActivity.bw.setAlpha(0.6f);
                }
            }
        }

        private void b(FitnessResultActivity fitnessResultActivity, int i) {
            if (fitnessResultActivity.by != null) {
                int color = fitnessResultActivity.getResources().getColor(i);
                fitnessResultActivity.by.setTextColor(color);
                Drawable[] compoundDrawablesRelative = fitnessResultActivity.by.getCompoundDrawablesRelative();
                Drawable drawable = compoundDrawablesRelative.length > 2 ? compoundDrawablesRelative[2] : null;
                Drawable drawableC = drawable != null ? qqf.c(drawable, color) : null;
                if (drawableC != null) {
                    drawableC.setBounds(0, 0, drawableC.getMinimumWidth(), drawableC.getMinimumHeight());
                    fitnessResultActivity.by.setCompoundDrawablesRelative(null, null, drawableC, null);
                }
                fitnessResultActivity.by.setAlpha(0.6f);
            }
        }

        private void a(FitnessResultActivity fitnessResultActivity, int i) {
            if (!fitnessResultActivity.ao) {
                fitnessResultActivity.ay = -1;
                if (fitnessResultActivity.ah != null) {
                    fitnessResultActivity.ah.setVisibility(4);
                }
                if (fitnessResultActivity.y != null) {
                    fitnessResultActivity.y.setVisibility(4);
                    return;
                }
                return;
            }
            fitnessResultActivity.c((List<ChoreographedMultiActions>) Collections.EMPTY_LIST);
            if (fitnessResultActivity.ah != null) {
                fitnessResultActivity.ah.setTextColor(fitnessResultActivity.getResources().getColor(i));
                fitnessResultActivity.ah.setAlpha(0.38f);
            }
            if (fitnessResultActivity.y != null) {
                fitnessResultActivity.y.setTextColor(fitnessResultActivity.getResources().getColor(i));
                fitnessResultActivity.y.setAlpha(0.38f);
            }
        }

        private Drawable b(FitnessResultActivity fitnessResultActivity, FitWorkout fitWorkout) {
            int i;
            WorkoutRecord workoutRecord = fitnessResultActivity.bg;
            if (workoutRecord != null && workoutRecord.isFitnessRecordFromTv()) {
                return b((Context) fitnessResultActivity, R.drawable.pic_fitness_result_header_tv_common);
            }
            if (fitWorkout != null && fitWorkout.getCourseDefineType() == 1) {
                long jI = CommonUtils.i(fitWorkout.acquireId()) % 3;
                if (jI == 0) {
                    i = R.drawable.pic_custom_yellow;
                } else if (jI == 1) {
                    i = R.drawable.pic_custom_red;
                } else {
                    i = R.drawable.pic_custom_blue;
                }
                return b((Context) fitnessResultActivity, i);
            }
            return b((Context) fitnessResultActivity, R.drawable.pic_fitness_result_header_default);
        }

        private Drawable b(Context context, int i) {
            if (LanguageUtil.ba(context)) {
                return qqz.e(context, i);
            }
            return ContextCompat.getDrawable(context, i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void c(FitWorkout fitWorkout, FitnessResultActivity fitnessResultActivity) {
            if (fitnessResultActivity == null) {
                LogUtil.j("Suggestion_FitnessResultActivity", "getRelativeCourses activity null");
                return;
            }
            List<String> listAcquireListRelativeWorkouts = fitWorkout.acquireListRelativeWorkouts();
            if (listAcquireListRelativeWorkouts == null || listAcquireListRelativeWorkouts.size() == 0) {
                listAcquireListRelativeWorkouts = new ArrayList<>();
                e(listAcquireListRelativeWorkouts, fitWorkout.acquireNarrowDesc());
            }
            if (listAcquireListRelativeWorkouts.size() != 0) {
                fitnessResultActivity.bf = new ArrayList(10);
                e(0, listAcquireListRelativeWorkouts);
            } else {
                LogUtil.j("Suggestion_FitnessResultActivity", "no relative courses");
            }
        }

        private void e(List<String> list, String str) {
            if (list == null || str == null) {
                LogUtil.j("Suggestion_FitnessResultActivity", "fillRelativeCourses, the relativeCourse or detail is null");
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("recommendCourses")) {
                    JSONArray jSONArray = new JSONArray(jSONObject.optString("recommendCourses"));
                    for (int i = 0; i < jSONArray.length(); i++) {
                        String strOptString = jSONArray.optString(i);
                        if (strOptString != null && strOptString.length() > 0) {
                            list.add(strOptString);
                        }
                    }
                }
            } catch (JSONException unused) {
                LogUtil.j("Suggestion_FitnessResultActivity", "fillRelativeCourses json has error");
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void e(final int i, final List<String> list) {
            final FitnessResultActivity fitnessResultActivity = this.f9103a.get();
            if (fitnessResultActivity == null) {
                LogUtil.j("Suggestion_FitnessResultActivity", "resetRelativeCourseAdapter, the activity is null");
                return;
            }
            if (njy.e(list)) {
                LogUtil.j("Suggestion_FitnessResultActivity", "requestRelativeCourse relativeCourses is null");
                return;
            }
            if (i >= list.size()) {
                e();
                return;
            }
            String str = list.get(i);
            CourseApi courseApi = (CourseApi) Services.d("CoursePlanService", CourseApi.class);
            if (courseApi == null) {
                LogUtil.j("Suggestion_FitnessResultActivity", "requestRelativeCourse : courseApi is null.");
            } else {
                courseApi.getCourseById(str, null, null, new UiCallback<Workout>() { // from class: com.huawei.health.suggestion.ui.fitness.activity.FitnessResultActivity.h.5
                    @Override // com.huawei.basefitnessadvice.callback.UiCallback
                    public void onFailure(int i2, String str2) {
                        LogUtil.j("Suggestion_FitnessResultActivity", "getworkoutlist onFailure ", Integer.valueOf(i2));
                        h.this.e(i + 1, (List<String>) list);
                    }

                    @Override // com.huawei.basefitnessadvice.callback.UiCallback
                    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
                    public void onSuccess(Workout workout) {
                        LogUtil.a("Suggestion_FitnessResultActivity", "getworkoutlist onSuccess");
                        FitWorkout fitWorkoutD = pea.d(workout);
                        if (fitWorkoutD != null) {
                            fitnessResultActivity.bf.add(fitWorkoutD);
                        }
                        h.this.e(i + 1, (List<String>) list);
                    }
                });
            }
        }

        private void e() {
            FitnessResultActivity fitnessResultActivity = this.f9103a.get();
            if (fitnessResultActivity != null) {
                fitnessResultActivity.af();
            } else {
                LogUtil.j("Suggestion_FitnessResultActivity", "resetRelativeCourseAdapter, the activity is null");
            }
        }

        private void d(String str, String str2, AutoFillColorView autoFillColorView) {
            if (TextUtils.isEmpty(str)) {
                str = str2;
            }
            String strC = StringUtils.c((Object) str);
            if (TextUtils.isEmpty(strC)) {
                return;
            }
            if (strC.startsWith("http")) {
                autoFillColorView.e(strC, true);
                return;
            }
            if (CommonUtil.ca()) {
                autoFillColorView.e("file:///android_asset/suggestion/img/" + strC, true);
            } else {
                autoFillColorView.e("file:///android_asset/img/" + strC, true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void af() {
        HandlerExecutor.b(new Runnable() { // from class: hfh
            @Override // java.lang.Runnable
            public final void run() {
                this.d.a();
            }
        });
    }

    public /* synthetic */ void a() {
        if (this.au) {
            LogUtil.a("Suggestion_FitnessResultActivity", "show marketing ,do not show relative course");
            return;
        }
        if (this.z == null || this.ar == null) {
            LogUtil.j("Suggestion_FitnessResultActivity", "updateUICourseView mCourseLayout == null || mHorizontalAdapter == null");
        } else if (njy.e(this.bf)) {
            LogUtil.a("Suggestion_FitnessResultActivity", "updateUICourseView mRelativeCourseList is null");
        } else {
            this.z.setVisibility(0);
            this.ar.c(this.bf);
        }
    }

    /* JADX INFO: loaded from: classes9.dex */
    static class e extends CustomPermissionAction {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<FitnessResultActivity> f9099a;

        private e(FitnessResultActivity fitnessResultActivity) {
            super(fitnessResultActivity);
            this.f9099a = new WeakReference<>(fitnessResultActivity);
        }

        @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
        public void onGranted() {
            FitnessResultActivity fitnessResultActivity = this.f9099a.get();
            if (fitnessResultActivity != null && !fitnessResultActivity.isDestroyed() && !fitnessResultActivity.isFinishing()) {
                fitnessResultActivity.r();
            } else {
                ReleaseLogUtil.e("R_Suggestion_FitnessResultActivity", "WeakShareAction onGranted activity ", fitnessResultActivity);
            }
        }
    }

    /* JADX INFO: loaded from: classes9.dex */
    static class g extends CustomPermissionAction {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f9100a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final float f9101b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final WeakReference<FitnessResultActivity> f9102c;
        private final Context d;
        private final int e;

        private g(FitnessResultActivity fitnessResultActivity, Context context, int i, int i2, float f) {
            super(fitnessResultActivity);
            this.f9102c = new WeakReference<>(fitnessResultActivity);
            this.d = context;
            this.e = i;
            this.f9100a = i2;
            this.f9101b = f;
        }

        @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
        public void onGranted() {
            FitnessResultActivity fitnessResultActivity = this.f9102c.get();
            if (fitnessResultActivity == null) {
                ReleaseLogUtil.e("Suggestion_FitnessResultActivity", "activity is null in WeakCustomPermissionAction");
            } else {
                hcu.b().b(this.d, this.e, this.f9100a, this.f9101b);
                fitnessResultActivity.finish();
            }
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
