package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.text.format.DateUtils;
import android.util.Pair;
import android.view.View;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.basefitnessadvice.model.intplan.IntAction;
import com.huawei.basefitnessadvice.model.intplan.IntDayPlan;
import com.huawei.basefitnessadvice.model.intplan.IntPlan;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.router.AppRouter;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.course.api.CourseApi;
import com.huawei.health.fitnessadvice.api.FitnessAdviceApi;
import com.huawei.health.h5pro.H5ProClient;
import com.huawei.health.h5pro.core.H5ProLaunchOption;
import com.huawei.health.plan.api.PlanApi;
import com.huawei.health.plan.model.trainingplan.PlanTypeEnum;
import com.huawei.health.plan.model.trainingplan.SmartPlanTypeEnum;
import com.huawei.health.sport.model.WorkoutRecord;
import com.huawei.health.suggestion.PluginSuggestion;
import com.huawei.hms.kit.awareness.barrier.internal.e.a;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnessadvice.FitWorkout;
import com.huawei.pluginfitnessadvice.Workout;
import com.huawei.pluginfitnessadvice.WorkoutPackageInfo;
import com.huawei.pluginfitnessadvice.audio.SleepAudioGroup;
import com.huawei.pluginfitnessadvice.audio.SleepAudioInfo;
import com.huawei.pluginfitnessadvice.audio.SleepAudioPackage;
import com.huawei.pluginfitnessadvice.audio.SleepAudioSeries;
import com.huawei.pluginfitnessadvice.h5pro.SeriesCourseH5Repository;
import com.huawei.trade.PayApi;
import com.huawei.ui.main.R;
import health.compact.a.CommonUtil;
import health.compact.a.CommonUtils;
import health.compact.a.Services;
import health.compact.a.UnitUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes19.dex */
public class wtb {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f52450b = AnalyticsValue.REMIND_PLAN_AND_COURSE_EVENT.value();
    protected Context d = BaseApplication.b();

    public void b(final Handler handler) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: wtl
            @Override // java.lang.Runnable
            public final void run() {
                this.f52468b.e(handler);
            }
        });
    }

    /* synthetic */ void e(Handler handler) {
        LogUtil.j("PlanDataManager", "getAllData start");
        HashMap map = new HashMap(3);
        CountDownLatch countDownLatch = new CountDownLatch(3);
        b(countDownLatch, map);
        e(countDownLatch, map);
        a(countDownLatch, map);
        try {
            LogUtil.a("PlanDataManager", "getAllData isReached = ", Boolean.valueOf(countDownLatch.await(5L, TimeUnit.SECONDS)));
        } catch (InterruptedException unused) {
            LogUtil.e("PlanDataManager", "thread interrupted");
        }
        LogUtil.j("PlanDataManager", "getAllData finish");
        if (handler != null) {
            Message messageObtainMessage = handler.obtainMessage(a.N);
            messageObtainMessage.obj = map;
            handler.sendMessage(messageObtainMessage);
        }
    }

    private void b(final CountDownLatch countDownLatch, final Map<Integer, List<wtv>> map) {
        final IntPlan currentAllPlan = ((PlanApi) Services.b("CoursePlanService", PlanApi.class)).getCurrentAllPlan();
        if (currentAllPlan != null && currentAllPlan.getSmartPlanType() == SmartPlanTypeEnum.SMART_WEIGHT_PLAN.getValue()) {
            nkf.a().d(new ResponseCallback() { // from class: wtm
                @Override // com.huawei.hwbasemgr.ResponseCallback
                public final void onResponse(int i, Object obj) {
                    this.e.b(currentAllPlan, map, countDownLatch, i, (Pair) obj);
                }
            });
        } else {
            d(currentAllPlan, map, (ivd) null, countDownLatch);
        }
    }

    /* synthetic */ void b(IntPlan intPlan, Map map, CountDownLatch countDownLatch, int i, Pair pair) {
        d(intPlan, (Map<Integer, List<wtv>>) map, pair != null ? (ivd) pair.second : null, countDownLatch);
    }

    private void d(final IntPlan intPlan, final Map<Integer, List<wtv>> map, final ivd ivdVar, final CountDownLatch countDownLatch) {
        if (intPlan == null) {
            LogUtil.j("PlanDataManager", "resourceAuth mCurrentIntPlan is null");
            countDownLatch.countDown();
            return;
        }
        if (intPlan.getSmartPlanType() == SmartPlanTypeEnum.SMART_WEIGHT_PLAN.getValue() && intPlan.isTempTrainPlan()) {
            LogUtil.j("PlanDataManager", "resourceAuth smart weight plan is temp.");
            countDownLatch.countDown();
            return;
        }
        int i = (intPlan.getPlanType() == IntPlan.PlanType.AI_FITNESS_PLAN || intPlan.getPlanType() == IntPlan.PlanType.FIT_PLAN) ? 2 : 4;
        if (intPlan.getPlanType() == IntPlan.PlanType.AI_RUN_PLAN) {
            i = 5;
        }
        PayApi payApi = (PayApi) Services.b("TradeService", PayApi.class);
        LogUtil.a("PlanDataManager", "resType:", Integer.valueOf(i), "PlanTempId:", intPlan.getPlanTempId());
        payApi.resourceAuth(i, intPlan.getPlanTempId(), new IBaseResponseCallback() { // from class: wtg
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i2, Object obj) {
                this.f52462c.c(intPlan, map, ivdVar, countDownLatch, i2, obj);
            }
        });
    }

    /* synthetic */ void c(IntPlan intPlan, Map map, ivd ivdVar, CountDownLatch countDownLatch, int i, Object obj) {
        LogUtil.a("PlanDataManager", "resourceAuth errorCode: ", Integer.valueOf(i));
        LogUtil.a("PlanDataManager", "resourceAuth objData: ", obj);
        a((i == 0 && (obj instanceof Integer)) ? b(intPlan, ((Integer) obj).intValue()) : false, intPlan, map, ivdVar, countDownLatch);
    }

    private void a(boolean z, IntPlan intPlan, Map<Integer, List<wtv>> map, ivd ivdVar, CountDownLatch countDownLatch) {
        wtv wtvVar = new wtv();
        if (SmartPlanTypeEnum.SMART_TRAINING_PLAN.getValue() == intPlan.getSmartPlanType()) {
            wtvVar.e(Integer.valueOf(b(intPlan.getSmartTrainPlanType())));
        } else if (SmartPlanTypeEnum.SMART_WEIGHT_PLAN.getValue() == intPlan.getSmartPlanType()) {
            wtvVar.e(Integer.valueOf(R.drawable.ic_smart_weight_plan));
        } else {
            wtvVar.e(intPlan.getMetaInfo().getPicture());
        }
        long createTime = intPlan.getPlanTimeInfo().getCreateTime() * 1000;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jC = lsl.c(System.currentTimeMillis());
        if (jCurrentTimeMillis <= createTime && createTime <= jC) {
            createTime = lsl.r(System.currentTimeMillis());
        }
        wtvVar.a(createTime);
        if (intPlan.getSmartPlanType() == SmartPlanTypeEnum.SMART_WEIGHT_PLAN.getValue()) {
            wtvVar.c(a(intPlan, ivdVar));
        } else {
            wtvVar.c(intPlan.getMetaInfo().getName());
        }
        wtvVar.d(new View.OnClickListener() { // from class: wtj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f52465a.a(view);
            }
        });
        ArrayList arrayList = new ArrayList(10);
        if (z) {
            LogUtil.a("PlanDataManager", "isIntPlanVipExpired true");
            StringBuilder sb = new StringBuilder();
            String string = this.d.getString(R.string.IDS_plan_run_renew_now);
            sb.append(this.d.getString(R.string.IDS_plan_run_renewal_continuation));
            sb.append(" ");
            sb.append(string);
            arrayList.add(sb.toString());
            wtvVar.a(new View.OnClickListener() { // from class: wtn
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f52472b.e(view);
                }
            });
        } else {
            arrayList.add(b(intPlan));
        }
        wtvVar.e((List<String>) arrayList);
        ArrayList arrayList2 = new ArrayList(10);
        arrayList2.add(wtvVar);
        map.put(0, arrayList2);
        e(wtvVar, intPlan.getPlanId(), countDownLatch);
    }

    /* synthetic */ void a(View view) {
        a();
    }

    /* synthetic */ void e(View view) {
        HashMap map = new HashMap();
        map.put("click", 1);
        lmf.d().c(this.d, AnalyticsValue.VIP_CENTER_RENEW_BTN_CLICK_EVENT.value(), map, 0);
        LogUtil.a("PlanDataManager", "goto vip renew page");
        AppRouter.c("/OperationBundle/MemberTypeSelectActivity").i();
    }

    private String a(IntPlan intPlan, ivd ivdVar) {
        if (intPlan == null) {
            return "";
        }
        return btw.c(intPlan.getPlanTimeInfo() == null ? 0L : intPlan.getPlanTimeInfo().getBeginDate() * 1000, intPlan.getPlanTimeInfo() != null ? intPlan.getPlanTimeInfo().getEndDate() * 1000 : 0L, (ivdVar == null || ivdVar.d() == null) ? 0 : ivdVar.d().d());
    }

    public static int b(int i) {
        if (i == PlanTypeEnum.TRAINING_PLAN_3_KILOMETERS.getValue()) {
            return R.drawable.ic_training_plan_3;
        }
        if (i == PlanTypeEnum.TRAINING_PLAN_5_KILOMETERS.getValue()) {
            return R.drawable.ic_training_plan_5;
        }
        if (i == PlanTypeEnum.TRAINING_PLAN_10_KILOMETERS.getValue()) {
            return R.drawable.ic_training_plan_10;
        }
        if (i == PlanTypeEnum.TRAINING_PLAN_HALF.getValue() || i == PlanTypeEnum.TRAINING_PLAN_FULL.getValue() || i == PlanTypeEnum.TRAINING_PLAN_MINI.getValue()) {
            return R.drawable.ic_training_plan_marathon;
        }
        if (i == PlanTypeEnum.TRAINING_PLAN_HEALTH.getValue()) {
            return R.drawable.ic_training_plan_health;
        }
        return R.drawable.ic_training_plan_custom;
    }

    private void e(final wtv wtvVar, String str, final CountDownLatch countDownLatch) {
        LogUtil.a("PlanDataManager", "getPlanRecordInfo");
        CourseApi courseApi = (CourseApi) Services.d("CoursePlanService", CourseApi.class);
        if (courseApi != null) {
            courseApi.getWorkoutRecords(str, new UiCallback<List<WorkoutRecord>>() { // from class: wtb.1
                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                public void onFailure(int i, String str2) {
                    LogUtil.e("PlanDataManager", "getPlanRecordInfo getWorkoutRecords error");
                    countDownLatch.countDown();
                }

                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public void onSuccess(List<WorkoutRecord> list) {
                    if (njy.e(list)) {
                        LogUtil.a("PlanDataManager", "getPlanRecordInfo data is empty");
                        countDownLatch.countDown();
                        return;
                    }
                    LogUtil.a("PlanDataManager", "getPlanRecordInfo success:", Integer.valueOf(list.size()));
                    for (int size = list.size() - 1; size >= 0; size--) {
                        WorkoutRecord workoutRecord = list.get(size);
                        if (workoutRecord.acquireId() != 0) {
                            wtvVar.a(workoutRecord.acquireExerciseTime());
                            break;
                        }
                    }
                    countDownLatch.countDown();
                }
            });
        }
    }

    private void a() {
        if (qrs.r()) {
            LogUtil.a("PlanDataManager", "onClick, isFastClick");
        } else {
            c(2, 0);
            ((FitnessAdviceApi) Services.b("PluginFitnessAdvice", FitnessAdviceApi.class)).launchPlanTab();
        }
    }

    private boolean b(IntPlan intPlan, int i) {
        if (intPlan == null) {
            return false;
        }
        if (intPlan.getWeekInfoByIdx(0) == null) {
            return true;
        }
        return (i == 0 || i == 1) ? false : true;
    }

    private String b(IntPlan intPlan) {
        float fFloatValue;
        LogUtil.a("PlanDataManager", "getPlanDescription");
        int iA = lsl.a(intPlan.getPlanTimeInfo().getBeginDate() * 1000, System.currentTimeMillis());
        LogUtil.a("PlanDataManager", "getTodayActions current day = ", Integer.valueOf(iA));
        if (iA > intPlan.getMetaInfo().getDayCount()) {
            return this.d.getString(R.string.sug_home_overdueplan);
        }
        if (iA <= 0) {
            String dateTime = DateUtils.formatDateTime(this.d, intPlan.getPlanTimeInfo().getBeginDate() * 1000, 24);
            LogUtil.a("PlanDataManager", "getTodayActions startDates = ", dateTime);
            return this.d.getResources().getString(R.string.IDS_fitness_plan_start_date, dateTime);
        }
        IntDayPlan dayInfo = intPlan.getDayInfo(btw.h(intPlan), lsl.o(System.currentTimeMillis()));
        if (dayInfo == null) {
            return this.d.getResources().getString(R.string.IDS_suggest_you_rest_today);
        }
        if (njy.e(c(dayInfo))) {
            return this.d.getResources().getString(R.string.IDS_suggest_you_rest_today);
        }
        if (intPlan.getSmartPlanType() == SmartPlanTypeEnum.SMART_WEIGHT_PLAN.getValue()) {
            fFloatValue = (float) btw.b(intPlan.getInitialWeight(), iun.c(), intPlan.getTargetWeight());
        } else {
            fFloatValue = ((Float) intPlan.getStat("progress").getValue()).floatValue();
        }
        String str = gzx.b(this.d, iA, intPlan.getMetaInfo().getDayCount(), 0) + " " + gzx.c(this.d, R.string.IDS_plan_finish_percent, UnitUtil.e(fFloatValue, 2, 1));
        LogUtil.a("PlanDataManager", "getPlanDescription:", str, " language:", CommonUtil.u());
        return str;
    }

    private List<IntAction> c(IntDayPlan intDayPlan) {
        ArrayList arrayList = new ArrayList(10);
        if (intDayPlan == null) {
            LogUtil.j("PlanDataManager", "getTodayActions dayInfo is null ");
            return arrayList;
        }
        for (int i = 0; i < intDayPlan.getInPlanActionCnt(); i++) {
            IntAction inPlanAction = intDayPlan.getInPlanAction(i);
            if (inPlanAction != null && inPlanAction.getActionId() != null && (inPlanAction.getActionType() == IntAction.ActionType.RUN || inPlanAction.getActionType() == IntAction.ActionType.WORKOUT)) {
                arrayList.add(inPlanAction);
            }
        }
        return arrayList;
    }

    private void e(final CountDownLatch countDownLatch, final Map<Integer, List<wtv>> map) {
        LogUtil.a("PlanDataManager", "getSportCoursesData");
        ((CourseApi) Services.b("CoursePlanService", CourseApi.class)).getUserCourseList(0, 2, 1, "", new UiCallback<List<Workout>>() { // from class: wtb.4
            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            public void onFailure(int i, String str) {
                LogUtil.j("PlanDataManager", "UiCallback onFailure errorInfo = ", str);
                countDownLatch.countDown();
            }

            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onSuccess(List<Workout> list) {
                LogUtil.a("PlanDataManager", "MyUiCallbackFitnessCourse(", Integer.valueOf(hashCode()), ") onSuccess()");
                wtb.this.d(list, (Map<Integer, List<wtv>>) map);
                countDownLatch.countDown();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(List<Workout> list, Map<Integer, List<wtv>> map) {
        if (njy.e(list)) {
            LogUtil.j("PlanDataManager", "reorderList is empty!");
            return;
        }
        LogUtil.a("PlanDataManager", "reorderList size = ", Integer.valueOf(list.size()));
        ArrayList arrayList = new ArrayList(list.size());
        for (Workout workout : list) {
            if (workout != null) {
                wtv wtvVar = new wtv();
                wtvVar.a(workout.getNewUseWorkoutTime() * 1000);
                FitWorkout fitWorkoutD = pea.d(workout);
                if (fitWorkoutD != null) {
                    c(fitWorkoutD, wtvVar);
                } else {
                    d(workout, wtvVar);
                }
                arrayList.add(wtvVar);
            }
        }
        map.put(1, arrayList);
    }

    private void c(final FitWorkout fitWorkout, wtv wtvVar) {
        int i;
        LogUtil.a("PlanDataManager", "processFitWorkoutData course type = ", Integer.valueOf(fitWorkout.getCourseDefineType()));
        wtvVar.c(fitWorkout.acquireName());
        wtvVar.d(new View.OnClickListener() { // from class: wti
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f52464b.a(fitWorkout, view);
            }
        });
        ArrayList arrayList = new ArrayList(10);
        arrayList.add(b(fitWorkout));
        if (fitWorkout.getCourseDefineType() == 1) {
            long jI = CommonUtils.i(fitWorkout.acquireId()) % 3;
            if (jI == 0) {
                i = R.drawable.pic_custom_yellow_small;
            } else if (jI == 1) {
                i = R.drawable.pic_custom_red_small;
            } else {
                i = R.drawable.pic_custom_blue_small;
            }
            wtvVar.e(Integer.valueOf(i));
            arrayList.add(gzx.c(this.d, R.string.IDS_hwh_motiontrack_sport_data_share_date, UnitUtil.d("yyyy/MM/dd", fitWorkout.getPublishDate()), this.d.getString(R.string.sug_plan_create)));
        } else {
            String topicPreviewPicUrl = fitWorkout.getTopicPreviewPicUrl();
            if (TextUtils.isEmpty(topicPreviewPicUrl)) {
                topicPreviewPicUrl = fitWorkout.acquireMidPicture();
            }
            wtvVar.e(topicPreviewPicUrl);
            arrayList.add(iec.c(fitWorkout.acquireDifficulty()));
            if (fitWorkout.acquireDuration() != 0) {
                arrayList.add(this.d.getResources().getQuantityString(R.plurals.IDS_plugin_fitnessadvice_min, fitWorkout.acquireDuration() / 60, ped.m(fitWorkout.acquireDuration())));
            }
        }
        wtvVar.e((List<String>) arrayList);
    }

    /* synthetic */ void a(FitWorkout fitWorkout, View view) {
        e(fitWorkout);
    }

    private void d(Workout workout, wtv wtvVar) {
        LogUtil.a("PlanDataManager", "processWorkoutPackageData");
        final WorkoutPackageInfo workoutPackageInfoA = pea.a(workout);
        if (workoutPackageInfoA == null) {
            LogUtil.j("PlanDataManager", "setWorkoutPackageInfo workout is null");
            return;
        }
        wtvVar.c(workoutPackageInfoA.getWorkoutPackageName());
        workoutPackageInfoA.saveId(workoutPackageInfoA.getWorkoutPackageId());
        String squarePicture = workoutPackageInfoA.getSquarePicture();
        if (TextUtils.isEmpty(squarePicture)) {
            squarePicture = workoutPackageInfoA.getTopicPreviewPicUrl();
        }
        wtvVar.e(squarePicture);
        List<String> arrayList = new ArrayList<>(10);
        arrayList.add(this.d.getResources().getQuantityString(R.plurals.IDS_sug_series_course_exercised, workoutPackageInfoA.getWorkoutFinishCount().intValue(), workoutPackageInfoA.getWorkoutFinishCount(), workoutPackageInfoA.getWorkoutTotalCount()));
        int enableNewUrl = workoutPackageInfoA.getEnableNewUrl();
        LogUtil.a("PlanDataManager", "packageInfo isEnableNewUrl ", Integer.valueOf(enableNewUrl));
        if (enableNewUrl == 1) {
            wtvVar.d(new View.OnClickListener() { // from class: wtd
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.e.e(workoutPackageInfoA, view);
                }
            });
        } else {
            wtvVar.d(new View.OnClickListener() { // from class: wte
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.d.d(workoutPackageInfoA, view);
                }
            });
        }
        wtvVar.e(arrayList);
    }

    /* synthetic */ void e(WorkoutPackageInfo workoutPackageInfo, View view) {
        b(workoutPackageInfo.getWorkoutPackageId(), 1);
    }

    /* synthetic */ void d(WorkoutPackageInfo workoutPackageInfo, View view) {
        a(workoutPackageInfo.getWorkoutPackageId());
    }

    private void e(FitWorkout fitWorkout) {
        if (qrs.r()) {
            LogUtil.a("PlanDataManager", "onClick, isFastClick");
            return;
        }
        PluginSuggestion pluginSuggestion = (PluginSuggestion) Services.d("PluginFitnessAdvice", PluginSuggestion.class);
        if (pluginSuggestion == null || !pluginSuggestion.isInitComplete()) {
            return;
        }
        if (fitWorkout == null) {
            LogUtil.j("PlanDataManager", "start fitness failed with the null fitWorkout");
            return;
        }
        c(2, 1);
        pcd pcdVar = new pcd(fitWorkout.acquireId());
        pcdVar.b(R.anim.left_enter_short);
        pcdVar.d(R.anim.activity_no_animation_short);
        if (fitWorkout.getCourseDefineType() == 1) {
            pcdVar.i(1);
        }
        pea.a(this.d, fitWorkout, pcdVar);
    }

    private void a(String str) {
        c(2, 1);
        ddv.b().initH5Pro();
        H5ProLaunchOption h5ProLaunchOptionBuild = new H5ProLaunchOption.Builder().addCustomizeJsModule("innerapi", ddv.b().getCommonJsModule("innerapi")).addCustomizeJsModule("tradeApi", ddv.b().getCommonJsModule("tradeApi")).addCustomizeJsModule("mediaCenter", ddv.b().getCommonJsModule("mediaCenter")).enableOnPauseCallback().setImmerse().showStatusBar().setStatusBarTextBlack(true).addCustomizeArg("workoutPackageId", str).setForceDarkMode(0).build();
        SeriesCourseH5Repository.registerService();
        H5ProClient.startH5MiniProgram(this.d, "com.huawei.health.h5.course", h5ProLaunchOptionBuild);
        btq.e().e("COLLECTION_ADD");
    }

    private String b(FitWorkout fitWorkout) {
        if (fitWorkout.isLongExplainVideoCourse()) {
            return this.d.getString(R.string.IDS_fitness_advice_explain_courses);
        }
        if (fitWorkout.getIntervals() == -2) {
            return this.d.getString(R.string.IDS_fitness_advice_run_trained_never);
        }
        if (fitWorkout.getIntervals() == -3) {
            return this.d.getString(R.string.IDS_fitness_advice_run_trained_long_ago);
        }
        if (fitWorkout.getIntervals() == 0) {
            return this.d.getString(R.string.IDS_fitness_advice_run_trained_today);
        }
        int intervals = fitWorkout.getIntervals();
        return this.d.getResources().getQuantityString(R.plurals.IDS_fitness_advice_run_trained_ago, intervals, Integer.valueOf(intervals));
    }

    private void a(CountDownLatch countDownLatch, Map<Integer, List<wtv>> map) {
        ((CourseApi) Services.b("CoursePlanService", CourseApi.class)).getAudioBehaviorList(new gzc.b().c(1).e(2).a(0).d(2).b(1).c(), new AnonymousClass3(countDownLatch, map));
    }

    /* JADX INFO: renamed from: wtb$3, reason: invalid class name */
    class AnonymousClass3 extends UiCallback<List<SleepAudioSeries>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CountDownLatch f52455a;
        final /* synthetic */ Map d;

        AnonymousClass3(CountDownLatch countDownLatch, Map map) {
            this.f52455a = countDownLatch;
            this.d = map;
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public void onFailure(int i, String str) {
            LogUtil.e("PlanDataManager", "onFailure errorCode =", Integer.valueOf(i), " errorInfo =", str);
            this.f52455a.countDown();
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onSuccess(final List<SleepAudioSeries> list) {
            LogUtil.a("PlanDataManager", "onSuccess data = ", list.toString());
            ThreadPoolManager threadPoolManagerC = ThreadPoolManager.c();
            final Map map = this.d;
            final CountDownLatch countDownLatch = this.f52455a;
            threadPoolManagerC.execute(new Runnable() { // from class: wtq
                @Override // java.lang.Runnable
                public final void run() {
                    this.d.e(list, map, countDownLatch);
                }
            });
        }

        /* synthetic */ void e(List list, Map map, CountDownLatch countDownLatch) {
            wtb.this.c((List<SleepAudioSeries>) list, (Map<Integer, List<wtv>>) map, countDownLatch);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(List<SleepAudioSeries> list, Map<Integer, List<wtv>> map, CountDownLatch countDownLatch) {
        if (njy.e(list)) {
            LogUtil.j("PlanDataManager", "handleSuccessData data is empty ");
            countDownLatch.countDown();
            return;
        }
        ArrayList arrayList = new ArrayList(list.size());
        CountDownLatch countDownLatch2 = new CountDownLatch(list.size());
        HashMap map2 = new HashMap(list.size());
        String string = "";
        for (final SleepAudioSeries sleepAudioSeries : list) {
            if (sleepAudioSeries == null) {
                countDownLatch2.countDown();
            } else {
                wtv wtvVar = new wtv();
                wtvVar.c(sleepAudioSeries.getName());
                wtvVar.e(sleepAudioSeries.getSmallImage());
                wtvVar.d(new View.OnClickListener() { // from class: wta
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.d.a(sleepAudioSeries, view);
                    }
                });
                int infoType = sleepAudioSeries.getInfoType();
                LogUtil.a("PlanDataManager", "getHealthCourseProgress type = ", Integer.valueOf(infoType));
                if (infoType == 1) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(string);
                    sb.append(TextUtils.isEmpty(string) ? Integer.toString(sleepAudioSeries.getId()) : "," + sleepAudioSeries.getId());
                    string = sb.toString();
                    map2.put(Integer.valueOf(sleepAudioSeries.getId()), wtvVar);
                    int enableNewUrl = sleepAudioSeries.getEnableNewUrl();
                    LogUtil.a("PlanDataManager", "sleepAudioSeries isEnableNewUrl ", Integer.valueOf(enableNewUrl));
                    if (enableNewUrl == 1) {
                        wtvVar.d(new View.OnClickListener() { // from class: wth
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                this.d.c(sleepAudioSeries, view);
                            }
                        });
                    } else {
                        wtvVar.d(new View.OnClickListener() { // from class: wtf
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                this.d.d(sleepAudioSeries, view);
                            }
                        });
                    }
                } else {
                    ArrayList arrayList2 = new ArrayList(10);
                    arrayList2.add(a(wtvVar, sleepAudioSeries));
                    wtvVar.e((List<String>) arrayList2);
                    wtvVar.d(new View.OnClickListener() { // from class: wtk
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            this.d.b(sleepAudioSeries, view);
                        }
                    });
                    countDownLatch2.countDown();
                }
                arrayList.add(wtvVar);
            }
        }
        c(string, map2, countDownLatch2);
        try {
            LogUtil.a("PlanDataManager", "handleSuccessData isReached = ", Boolean.valueOf(countDownLatch2.await(3L, TimeUnit.SECONDS)));
        } catch (InterruptedException unused) {
            LogUtil.e("PlanDataManager", "thread interrupted");
        }
        map.put(2, arrayList);
        countDownLatch.countDown();
    }

    /* synthetic */ void a(SleepAudioSeries sleepAudioSeries, View view) {
        a(sleepAudioSeries);
    }

    /* synthetic */ void c(SleepAudioSeries sleepAudioSeries, View view) {
        b(String.valueOf(sleepAudioSeries.getId()), 2);
    }

    /* synthetic */ void d(SleepAudioSeries sleepAudioSeries, View view) {
        e(sleepAudioSeries);
    }

    /* synthetic */ void b(SleepAudioSeries sleepAudioSeries, View view) {
        a(sleepAudioSeries);
    }

    public void b(String str, int i) {
        LogUtil.a("PlanDataManager", "gotoSeriesCourseH5 seriesCourseId ", str, " type ", Integer.valueOf(i));
        ddv.b().initH5Pro();
        H5ProLaunchOption h5ProLaunchOptionBuild = new H5ProLaunchOption.Builder().addCustomizeJsModule("innerapi", ddv.b().getCommonJsModule("innerapi")).addCustomizeJsModule("tradeApi", ddv.b().getCommonJsModule("tradeApi")).addCustomizeJsModule("mediaCenter", ddv.b().getCommonJsModule("mediaCenter")).addCustomizeJsModule("course", ((FitnessAdviceApi) Services.b("PluginFitnessAdvice", FitnessAdviceApi.class)).getCourseDetailH5Bridge()).enableOnPauseCallback().setImmerse().showStatusBar().setStatusBarTextBlack(true).addPath("#/seriesCourse?id=" + str + "&type=" + i).setForceDarkMode(1).build();
        SeriesCourseH5Repository.registerService();
        H5ProClient.startH5MiniProgram(BaseApplication.b(), "com.huawei.health.h5.sleeping-music", h5ProLaunchOptionBuild);
        btq.e().e("COLLECTION_ADD");
    }

    private void e(SleepAudioSeries sleepAudioSeries) {
        c(2, 2);
        Intent intent = new Intent();
        intent.setClassName(this.d, "com.huawei.ui.main.stories.fitness.activity.coresleep.SeriesCourseListActivity");
        intent.addFlags(268435456);
        intent.putExtra("id", Integer.toString(sleepAudioSeries.getId()));
        intent.putExtra("from", 1);
        iov.d(this.d, intent);
    }

    private void c(String str, Map<Integer, wtv> map, CountDownLatch countDownLatch) {
        if (map == null || map.size() == 0) {
            LogUtil.j("PlanDataManager", "healthMap is empty");
        } else if (TextUtils.isEmpty(str)) {
            LogUtil.j("PlanDataManager", "no course need get percent");
            a(map, countDownLatch);
        } else {
            ((CourseApi) Services.b("CoursePlanService", CourseApi.class)).queryAudiosPackageBySeriesId(str, new AnonymousClass2(map, countDownLatch));
        }
    }

    /* JADX INFO: renamed from: wtb$2, reason: invalid class name */
    class AnonymousClass2 extends UiCallback<List<SleepAudioPackage>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Map f52454c;
        final /* synthetic */ CountDownLatch e;

        AnonymousClass2(Map map, CountDownLatch countDownLatch) {
            this.f52454c = map;
            this.e = countDownLatch;
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public void onFailure(int i, String str) {
            LogUtil.j("PlanDataManager", "errcode = ", Integer.valueOf(i), ", errorInfo = ", str);
            wtb.this.a((Map<Integer, wtv>) this.f52454c, this.e);
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(final List<SleepAudioPackage> list) {
            if (njy.e(list)) {
                LogUtil.j("PlanDataManager", "onSuccess data is null");
                wtb.this.a((Map<Integer, wtv>) this.f52454c, this.e);
            } else {
                ThreadPoolManager threadPoolManagerC = ThreadPoolManager.c();
                final Map map = this.f52454c;
                final CountDownLatch countDownLatch = this.e;
                threadPoolManagerC.execute(new Runnable() { // from class: wts
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.d.a(list, map, countDownLatch);
                    }
                });
            }
        }

        /* synthetic */ void a(List list, Map map, CountDownLatch countDownLatch) {
            wtb.this.d((List<SleepAudioPackage>) list, (Map<Integer, wtv>) map, countDownLatch);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(List<SleepAudioPackage> list, Map<Integer, wtv> map, CountDownLatch countDownLatch) {
        LogUtil.a("PlanDataManager", "dealDataWhenSuccess:");
        for (SleepAudioPackage sleepAudioPackage : list) {
            if (sleepAudioPackage.getSleepAudioSeries() == null) {
                LogUtil.j("PlanDataManager", "sleepAudioSeries is null");
            } else {
                wtv wtvVar = map.get(Integer.valueOf(sleepAudioPackage.getSleepAudioSeries().getId()));
                if (wtvVar == null) {
                    LogUtil.j("PlanDataManager", "dealDataWhenSuccess no course need get percent");
                    return;
                }
                int displayStyle = sleepAudioPackage.getSleepAudioSeries().getDisplayStyle();
                if (displayStyle == 1) {
                    if (njy.e(sleepAudioPackage.getSleepAudioInfoList())) {
                        LogUtil.j("PlanDataManager", "sleepAudioInfoList is null");
                    } else {
                        a(sleepAudioPackage, b(sleepAudioPackage.getSleepAudioInfoList(), wtvVar), wtvVar);
                    }
                } else if (displayStyle == 2) {
                    if (njy.e(sleepAudioPackage.getSleepAudioGroupList())) {
                        LogUtil.j("PlanDataManager", "sleepAudioGroupList is null");
                    } else {
                        a(sleepAudioPackage, e(sleepAudioPackage.getSleepAudioGroupList(), wtvVar), wtvVar);
                    }
                } else {
                    LogUtil.j("PlanDataManager", "wrong style:", Integer.valueOf(displayStyle));
                }
            }
        }
        a(map, countDownLatch);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Map<Integer, wtv> map, CountDownLatch countDownLatch) {
        for (int size = map.size(); size > 0; size--) {
            countDownLatch.countDown();
        }
    }

    private String b(List<SleepAudioInfo> list, wtv wtvVar) {
        long duration;
        long jMax = 0;
        long j = 0;
        long audioDuration = 0;
        for (SleepAudioInfo sleepAudioInfo : list) {
            audioDuration += sleepAudioInfo.getAudioDuration();
            if (sleepAudioInfo.getPlayRecord() != null) {
                jMax = Math.max(jMax, sleepAudioInfo.getPlayRecord().getModifyTime());
                if (sleepAudioInfo.getPlayRecord().getCompleteCount() > 0) {
                    duration = sleepAudioInfo.getAudioDuration();
                } else {
                    duration = sleepAudioInfo.getPlayRecord().getDuration();
                }
                j += duration;
            }
        }
        wtvVar.a(jMax);
        return haa.e(j, audioDuration, true);
    }

    private String e(List<SleepAudioGroup> list, wtv wtvVar) {
        long duration;
        Iterator<SleepAudioGroup> it = list.iterator();
        long jMax = 0;
        long j = 0;
        long audioDuration = 0;
        while (it.hasNext()) {
            List<SleepAudioInfo> sleepAudioInfoList = it.next().getSleepAudioInfoList();
            if (njy.e(sleepAudioInfoList)) {
                LogUtil.e("PlanDataManager", "sleepAudioInfoList is null");
            } else {
                for (SleepAudioInfo sleepAudioInfo : sleepAudioInfoList) {
                    audioDuration += sleepAudioInfo.getAudioDuration();
                    if (sleepAudioInfo.getPlayRecord() != null) {
                        jMax = Math.max(jMax, sleepAudioInfo.getPlayRecord().getModifyTime());
                        if (sleepAudioInfo.getPlayRecord().getCompleteCount() > 0) {
                            duration = sleepAudioInfo.getAudioDuration();
                        } else {
                            duration = sleepAudioInfo.getPlayRecord().getDuration();
                        }
                        j += duration;
                    }
                }
            }
        }
        wtvVar.a(jMax);
        return haa.e(j, audioDuration, true);
    }

    private void a(SleepAudioPackage sleepAudioPackage, String str, wtv wtvVar) {
        String string = this.d.getResources().getString(R.string.IDS_sleep_decompression_not_played);
        ArrayList arrayList = new ArrayList(10);
        if (str.equals(string)) {
            LogUtil.a("PlanDataManager", "AudioDescription = ", sleepAudioPackage.getSleepAudioSeries().getAudioDescription());
            arrayList.add(sleepAudioPackage.getSleepAudioSeries().getAudioDescription());
        } else {
            arrayList.add(str);
            LogUtil.a("PlanDataManager", "setCourseTrainedText courseTrainedText = ", str);
        }
        wtvVar.e((List<String>) arrayList);
    }

    private void a(SleepAudioSeries sleepAudioSeries) {
        if (qrs.r()) {
            LogUtil.a("PlanDataManager", "onClick, isFastClick");
            return;
        }
        int id = sleepAudioSeries.getId();
        String str = "com.huawei.health.h5.sleeping-music?h5pro=true&urlType=4&pName=com.huawei.health&path=audioDetail&statusBarTextBlack&isImmerse&id=" + id;
        if (sleepAudioSeries.getAudioType() != 0) {
            str = "com.huawei.health.h5.sleeping-music?h5pro=true&urlType=4&pName=com.huawei.health&path=audioDetail&statusBarTextBlack&isImmerse&id=" + id + "&type=sleepAudio";
        }
        if (sleepAudioSeries.getDecompressType() != 0) {
            str = "com.huawei.health.h5.sleeping-music?h5pro=true&urlType=4&pName=com.huawei.health&path=audioDetail&statusBarTextBlack&isImmerse&id=" + id + "&type=decompressAudio";
        }
        LogUtil.a("PlanDataManager", "gotoAudioCourseH5 url = ", str);
        c(2, 2);
        ddv.b().startOperationWebPage(this.d, str);
    }

    private String a(wtv wtvVar, SleepAudioSeries sleepAudioSeries) {
        if (sleepAudioSeries.getPlayRecord() == null) {
            return this.d.getString(R.string.IDS_fitness_advice_run_trained_never);
        }
        long modifyTime = sleepAudioSeries.getPlayRecord().getModifyTime();
        wtvVar.a(modifyTime);
        int iC = fxl.c(modifyTime, System.currentTimeMillis());
        if (iC == 0) {
            return this.d.getString(R.string.IDS_fitness_advice_run_trained_today);
        }
        return this.d.getResources().getQuantityString(R.plurals.IDS_fitness_advice_run_trained_ago, iC, Integer.valueOf(iC));
    }

    public static void c(int i, int i2) {
        HashMap map = new HashMap();
        map.put("click", 1);
        map.put("event", Integer.valueOf(i));
        if (i == 0) {
            map.put("default", Integer.valueOf(i2));
        } else {
            map.put("tabType", Integer.valueOf(i2));
        }
        lmf.d().c(BaseApplication.b(), f52450b, map, 0);
    }
}
