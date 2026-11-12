package defpackage;

import android.content.BroadcastReceiver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.huawei.basefitnessadvice.callback.DataCallback;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.basefitnessadvice.model.LangFile;
import com.huawei.basefitnessadvice.model.Media;
import com.huawei.basefitnessadvice.model.NavigationFilter;
import com.huawei.basefitnessadvice.model.Plan;
import com.huawei.basefitnessadvice.model.PlanRecord;
import com.huawei.basefitnessadvice.model.PlanWorkout;
import com.huawei.basefitnessadvice.model.RunWorkout;
import com.huawei.basefitnessadvice.model.Topic;
import com.huawei.basefitnessadvice.model.TrainStatistics;
import com.huawei.basefitnessadvice.model.WorkoutListBean;
import com.huawei.basefitnessadvice.model.intplan.IntDayPlan;
import com.huawei.basefitnessadvice.model.intplan.IntPlan;
import com.huawei.basefitnessadvice.model.intplan.IntWeekPlan;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.haf.handler.HandlerCenter;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.localbroadcastmanager.LocalBroadcastManager;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.course.api.CourseApi;
import com.huawei.health.courseplanservice.api.OnStateListener;
import com.huawei.health.plan.api.PlanApi;
import com.huawei.health.plan.model.PlanStat;
import com.huawei.health.plan.model.PlanStatistics;
import com.huawei.health.plan.model.data.DataApi;
import com.huawei.health.plan.model.data.DataSyncService;
import com.huawei.health.plan.model.model.BestRecordFitStat;
import com.huawei.health.plan.model.model.CreatePlanBean;
import com.huawei.health.plan.model.model.DataSync;
import com.huawei.health.plan.model.model.FinishPlanBean;
import com.huawei.health.plan.model.model.fitness.FitnessHistoryModel;
import com.huawei.health.sport.model.WorkoutRecord;
import com.huawei.health.sport.utils.ResultUtil;
import com.huawei.health.suggestion.PluginSuggestion;
import com.huawei.health.suggestion.config.MoveService;
import com.huawei.health.userprofilemgr.api.UserProfileMgrApi;
import com.huawei.health.userprofilemgr.model.BaseResponseCallback;
import com.huawei.hihealth.HiDataInsertOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.HiSyncOption;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiDataOperateListener;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseConstants;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.openalliance.ad.constant.JsbMapKeyNames;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.operation.OperationKey;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import com.huawei.pluginfitnessadvice.AtomicAction;
import com.huawei.pluginfitnessadvice.FitWorkout;
import com.huawei.pluginfitnessadvice.HealthWorkout;
import com.huawei.pluginfitnessadvice.LongVideoInfo;
import com.huawei.pluginfitnessadvice.TrainAction;
import com.huawei.pluginfitnessadvice.Workout;
import com.huawei.pluginfitnessadvice.WorkoutPackageInfo;
import com.huawei.pluginfitnessadvice.audio.SleepAudioPackage;
import com.huawei.pluginfitnessadvice.audio.SleepAudioSeries;
import com.huawei.pluginfitnessadvice.course.EssenceVideoInfo;
import com.huawei.pluginfitnessadvice.plandata.CreateRunPlanParams;
import com.huawei.pluginfitnessadvice.plandata.UserInfoBean;
import com.huawei.up.model.UserInfomation;
import com.huawei.utils.FoundationCommonUtil;
import health.compact.a.CommonUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.Services;
import health.compact.a.SportIntensityUtil;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import health.compact.a.utils.StringUtils;
import java.io.File;
import java.lang.ref.SoftReference;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes29.dex */
public class glb implements DataApi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HashMap<String, SoftReference<Object>> f35463a = new HashMap<>(10);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Handler f35464c = new Handler(Looper.getMainLooper());
    private int e = -1;

    @Override // com.huawei.health.plan.model.data.DataApi
    public List<PlanRecord> getJoinedPlans(final int i, final int i2, final UiCallback<List<PlanRecord>> uiCallback) {
        if (uiCallback == null) {
            ReleaseLogUtil.a("Suggestion_DataImpl", "getJoinedPlans callback == null");
            return null;
        }
        if (i < 0 || i2 < 0) {
            uiCallback.onFailure(this.f35464c, -1, "pageStart or pageSize illegal");
            return null;
        }
        final String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011);
        if (TextUtils.isEmpty(accountInfo)) {
            ReleaseLogUtil.a("Suggestion_DataImpl", "getJoinedPlans() getAccountInfo == null");
            uiCallback.onFailure(this.f35464c, 20001, ResultUtil.c(20001));
            return null;
        }
        final List<PlanRecord> listC = gmc.g().s().c(i, i2, accountInfo);
        if (gnw.c() && glw.c().b(i, i2)) {
            ghw.b().getFinishedPlans(i, i2, new DataCallback() { // from class: glb.5
                @Override // com.huawei.basefitnessadvice.callback.DataCallback
                public void onFailure(int i3, String str) {
                    ReleaseLogUtil.a("Suggestion_DataImpl", "getJoinedPlans errorCode=", Integer.valueOf(i3));
                    uiCallback.onSuccess(glb.this.f35464c, listC);
                }

                @Override // com.huawei.basefitnessadvice.callback.DataCallback
                public void onSuccess(JSONObject jSONObject) {
                    if (jSONObject == null) {
                        uiCallback.onFailure(glb.this.f35464c, -1, "data == null");
                        return;
                    }
                    glw.c().a(i, i2);
                    glr.d(jSONObject.optInt("total"), jSONObject.optInt("totalCalorie"), jSONObject.optInt("totalTrainingDays"));
                    gmc.g().s().c(accountInfo, gzm.b(jSONObject.optJSONArray("planRecords")));
                    uiCallback.onSuccess(glb.this.f35464c, gmc.g().s().c(i, i2, accountInfo));
                }
            });
            return listC;
        }
        uiCallback.onSuccess(this.f35464c, listC);
        return listC;
    }

    @Override // com.huawei.health.plan.model.data.DataApi
    public void getOldRunPlanLocalRecords(int i, int i2, UiCallback<List<PlanRecord>> uiCallback) {
        if (uiCallback == null) {
            ReleaseLogUtil.a("Suggestion_DataImpl", "getJoinedPlans callback == null");
            return;
        }
        if (i < 0 || i2 < 0) {
            uiCallback.onFailure(this.f35464c, -1, "pageStart or pageSize illegal");
            return;
        }
        String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011);
        if (TextUtils.isEmpty(accountInfo)) {
            ReleaseLogUtil.a("Suggestion_DataImpl", "getJoinedPlans() getAccountInfo == null");
            uiCallback.onFailure(this.f35464c, 20001, ResultUtil.c(20001));
        } else {
            List<PlanRecord> listC = gmv.c(i, i2, accountInfo);
            LogUtil.a("Suggestion_DataImpl", "getOldRunPlanLocalRecords size:", Integer.valueOf(listC.size()));
            uiCallback.onSuccess(this.f35464c, listC);
        }
    }

    @Override // com.huawei.health.plan.model.data.DataApi
    public Plan getJoinedPlan(String str) {
        String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011);
        if (TextUtils.isEmpty(accountInfo)) {
            ReleaseLogUtil.a("Suggestion_DataImpl", "getJoinedPlan(String planId) getAccountInfo == null");
            return null;
        }
        return gmc.g().s().b(accountInfo, str);
    }

    @Override // com.huawei.health.plan.model.data.DataApi
    public Plan getCurrentPlan() {
        return getCurrentRunPlan();
    }

    @Override // com.huawei.health.plan.model.data.DataApi
    public void checkAllowCreateOldPlan(final UiCallback<Boolean> uiCallback) {
        if (uiCallback == null) {
            LogUtil.e("Suggestion_DataImpl", "checkAllowCreateOldPlan callback == null");
            return;
        }
        final String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011);
        if (TextUtils.isEmpty(accountInfo)) {
            LogUtil.e("Suggestion_DataImpl", "checkAllowCreateOldPlan() getAccountInfo == null");
            uiCallback.onFailure(this.f35464c, 20001, ResultUtil.c(20001));
        } else {
            ghw.b().checkAllowCreateOldPlan(new DataCallback() { // from class: glb.13
                @Override // com.huawei.basefitnessadvice.callback.DataCallback
                public void onFailure(int i, String str) {
                    ReleaseLogUtil.a("Suggestion_DataImpl", "checkAllowCreateOldPlan() errorCode=", Integer.valueOf(i));
                    uiCallback.onFailure(glb.this.f35464c, i, str);
                }

                @Override // com.huawei.basefitnessadvice.callback.DataCallback
                public void onSuccess(JSONObject jSONObject) {
                    glb.this.b(jSONObject, accountInfo, (UiCallback<Boolean>) uiCallback);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(JSONObject jSONObject, String str, UiCallback<Boolean> uiCallback) {
        if (jSONObject == null || TextUtils.isEmpty(str) || uiCallback == null) {
            ReleaseLogUtil.a("Suggestion_DataImpl", "checkAllowCreateOldPlan() data == null || accountInfo == null || callback == null");
        } else {
            uiCallback.onSuccess(this.f35464c, gzm.b(jSONObject));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(JSONObject jSONObject, String str, boolean z, UiCallback<Plan> uiCallback) throws Throwable {
        String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011);
        if (jSONObject == null || TextUtils.isEmpty(accountInfo) || uiCallback == null) {
            LogUtil.e("Suggestion_DataImpl", "doGetCurrentPlan() data == null || accountInfo == null || callback == null");
            return;
        }
        LogUtil.d("Suggestion_DataImpl", "doGetCurrentPlan success with data:", jSONObject);
        Plan planA = gzm.a(jSONObject, str);
        LogUtil.a("Suggestion_DataImpl", "executor doGetCurrentPlan callback");
        if (z) {
            uiCallback.onSuccess(this.f35464c, planA);
        } else {
            uiCallback.onSuccess(planA);
        }
        syncLocalAndCloud(accountInfo, planA);
    }

    @Override // com.huawei.health.plan.model.data.DataApi
    public void syncLocalAndCloud(String str, Plan plan) throws Throwable {
        Plan planCreatePlanFromDb = createPlanFromDb(str);
        if (plan != null) {
            this.f35463a.put(d("plan", str), new SoftReference<>(plan));
            c(str, plan, planCreatePlanFromDb);
        } else {
            LogUtil.a("Suggestion_DataImpl", "doGetCurrentPlan from cloud is null");
            if (planCreatePlanFromDb != null) {
                LogUtil.j("Suggestion_DataImpl", "cloud plan is null.need to finish local plan.");
                c(planCreatePlanFromDb.acquireId(), 0L);
                this.f35463a.remove(d("plan", str));
            }
        }
        LogUtil.a("Suggestion_DataImpl", "deal local and cloud plan finish");
    }

    private void c(String str, Plan plan, Plan plan2) {
        if (plan2 == null || ((plan.acquireId() != null && !plan.acquireId().equals(plan2.acquireId())) || !gmc.g().l().d(plan.acquireId(), btx.b(), plan.acquireVersion()))) {
            if (plan2 != null && !plan.acquireId().equals(plan2.acquireId())) {
                LogUtil.a("Suggestion_DataImpl", "cloud plan is different from local plan.");
                c(plan2.acquireId(), 0L);
                a(str, plan);
            } else if (plan2 == null) {
                LogUtil.a("Suggestion_DataImpl", "local plan not exist.");
                a(str, plan);
            }
            gmc.g().l().a(plan.acquireId(), btx.b(), plan.acquireVersion(), plan.toString());
        }
        if (plan2 != null) {
            if (!plan.acquireName().equals(plan2.acquireName())) {
                LogUtil.a("Suggestion_DataImpl", "plan name is changed.");
                gmc.g().s().e(str, plan2.acquireId(), plan.acquireName());
            }
            LogUtil.a("Suggestion_DataImpl", "update cloud plan to local.");
            if (plan.getPlanCategory() == 1) {
                gmc.g().l().d(btx.b(), plan, plan.acquireVersion());
            }
        }
        e(plan.getRemindTime() >= 0, plan.getRemindTime());
    }

    private Plan b(String str) {
        SoftReference<Object> softReference = this.f35463a.get(d("plan", str));
        if (softReference == null || !(softReference.get() instanceof Plan)) {
            return null;
        }
        return (Plan) softReference.get();
    }

    @Override // com.huawei.health.plan.model.data.DataApi
    public Plan getCurrentRunPlan() {
        String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011);
        if (TextUtils.isEmpty(accountInfo)) {
            ReleaseLogUtil.a("Suggestion_DataImpl", "getCurrentPlan() getAccountInfo == null");
            return null;
        }
        Plan planB = b(accountInfo);
        return planB == null ? createPlanFromDb(accountInfo) : planB;
    }

    @Override // com.huawei.health.plan.model.data.DataApi
    public Plan createPlanFromDb(String str) throws Throwable {
        LogUtil.a("Suggestion_DataImpl", "enter createPlanFromDb");
        if (TextUtils.isEmpty(str)) {
            LogUtil.e("Suggestion_DataImpl", "createPlan() getAccountInfo == null");
            return null;
        }
        Plan planB = gmc.g().s().b(str);
        if (planB != null && !TextUtils.isEmpty(planB.acquireId())) {
            Plan planE = gmc.g().l().e(planB.acquireId(), btx.b(), planB.acquireVersion());
            if (planE != null && !TextUtils.isEmpty(planB.acquireName())) {
                planE.putName(planB.acquireName());
            }
            this.f35463a.put(d("plan", str), new SoftReference<>(planE));
            LogUtil.a("Suggestion_DataImpl", "exit createPlanFromDb");
            return planE;
        }
        LogUtil.a("Suggestion_DataImpl", "exit createPlanFromDb");
        return null;
    }

    @Override // com.huawei.health.plan.model.data.DataApi
    public void updatePlanName(String str, String str2) {
        String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011);
        if (TextUtils.isEmpty(accountInfo)) {
            ReleaseLogUtil.a("Suggestion_DataImpl", "updatePlanName(String planId, String name) getAccountInfo == null");
            return;
        }
        gmc.g().s().e(accountInfo, str, str2);
        Plan currentPlan = getCurrentPlan();
        if (currentPlan != null) {
            currentPlan.putName(str2);
            this.f35463a.put(d("plan", accountInfo), new SoftReference<>(currentPlan));
        }
        gmc.g().n().a(accountInfo, str, str2);
        btq.e().e("PLAN_UPDATE");
    }

    @Override // com.huawei.health.plan.model.data.DataApi
    public void updateDayRecord(String str, final IntPlan intPlan, final pdr pdrVar) {
        if (!gnw.e(pdrVar, intPlan)) {
            ReleaseLogUtil.e("Suggestion_DataImpl", "record has exist");
            return;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(pdrVar.f());
        final int iB = ift.b(calendar.get(7));
        final int iC = ift.c(intPlan.getPlanTimeInfo().getBeginDate() * 1000, pdrVar.f()) + 1;
        ReleaseLogUtil.d("Suggestion_DataImpl", "updateDayRecord:", Integer.valueOf(iC), " day:", Integer.valueOf(iB));
        final int i = !TextUtils.isEmpty(str) ? 1 : 0;
        ReleaseLogUtil.d("Suggestion_DataImpl", "isInPlan:", Integer.valueOf(i), " completionRate:", Float.valueOf(pdrVar.c()));
        if (b(str, intPlan, iC, iB, pdrVar)) {
            return;
        }
        pdrVar.e(i);
        ghw.b().updateDayRecord(intPlan.getPlanType().getType(), intPlan.getPlanId(), iC, iB, pdrVar, new DataCallback() { // from class: glb.25
            @Override // com.huawei.basefitnessadvice.callback.DataCallback
            public void onFailure(int i2, String str2) {
                ReleaseLogUtil.a("Suggestion_DataImpl", "updateDayRecord fail errorCode:", Integer.valueOf(i2), " info:", str2, " ", pdrVar.l());
            }

            @Override // com.huawei.basefitnessadvice.callback.DataCallback
            public void onSuccess(JSONObject jSONObject) {
                ReleaseLogUtil.d("Suggestion_DataImpl", "updateDayRecord success:", pdrVar.l());
                glw.c().e();
                btq.e().e("PLAN_UPDATE");
                btq.e().e("PLAN_CLOCK");
                if (btw.c(intPlan.getDayInfo(iC, iB)) == 0) {
                    ReleaseLogUtil.d("Suggestion_DataImpl", "not training day");
                    ObserverManagerUtil.e("UPDATE_AI_PLAN_COURSE_RECORD", Long.valueOf(pdrVar.b()));
                }
                if (i == 0) {
                    idy.b(2);
                } else {
                    idy.b(1);
                }
            }
        });
    }

    private boolean b(String str, IntPlan intPlan, int i, int i2, pdr pdrVar) {
        if (!Utils.o() && intPlan.getPlanType().equals(IntPlan.PlanType.AI_FITNESS_PLAN) && d(i, i2, intPlan)) {
            ReleaseLogUtil.d("Suggestion_DataImpl", "ai fitness today has achieve goal.");
            return true;
        }
        if (TextUtils.isEmpty(str)) {
            ReleaseLogUtil.d("Suggestion_DataImpl", "plan id is empty.");
            return false;
        }
        if (str.equals(intPlan.getPlanId())) {
            return CommonUtil.b((double) pdrVar.c());
        }
        ReleaseLogUtil.a("Suggestion_DataImpl", "updateDayRecord fail planId", str);
        return true;
    }

    private boolean d(int i, int i2, IntPlan intPlan) {
        IntWeekPlan weekInfoByOrder = intPlan.getWeekInfoByOrder(i);
        if (weekInfoByOrder == null) {
            ReleaseLogUtil.a("Suggestion_DataImpl", "weekInfo not exist.", Integer.valueOf(i));
            return false;
        }
        IntDayPlan dayByOrder = weekInfoByOrder.getDayByOrder(i2);
        if (dayByOrder != null) {
            return dayByOrder.getPunchFlag() == 1;
        }
        ReleaseLogUtil.a("Suggestion_DataImpl", "dayInfo not exist.", Integer.valueOf(i2));
        return false;
    }

    @Override // com.huawei.health.plan.model.data.DataApi
    public void updateDayRecord(final IntPlan intPlan, final WorkoutRecord workoutRecord, final DataCallback dataCallback) {
        int iB;
        int iC;
        if (intPlan == null || workoutRecord == null) {
            ReleaseLogUtil.a("Suggestion_DataImpl", "updateDayRecord plan == null or record == null");
            dataCallback.onSuccess(new JSONObject());
            return;
        }
        if (a(intPlan, workoutRecord, dataCallback)) {
            return;
        }
        if (TextUtils.isEmpty(workoutRecord.acquirePlanId())) {
            iC = ift.c(intPlan.getPlanTimeInfo().getBeginDate() * 1000, workoutRecord.acquireExerciseTime()) + 1;
            iB = b(workoutRecord);
        } else {
            int[] iArrE = btw.e(workoutRecord, intPlan);
            int i = iArrE[0];
            iB = iArrE[1];
            iC = i;
        }
        boolean zB = gnw.b(workoutRecord.acquireWorkoutId(), intPlan, iC, iB);
        if (intPlan.getPlanType().equals(IntPlan.PlanType.AI_RUN_PLAN) && !zB) {
            ReleaseLogUtil.d("Suggestion_DataImpl", "course is not in plan.", workoutRecord.acquireWorkoutId());
            dataCallback.onSuccess(new JSONObject());
            return;
        }
        ReleaseLogUtil.d("Suggestion_DataImpl", "updateClockTimes courseId:", workoutRecord.acquireWorkoutId(), " weekNumber:", Integer.valueOf(iC), " planDayIndex:", Integer.valueOf(iB), " finishRate:", Float.valueOf(workoutRecord.acquireFinishRate()));
        final int i2 = iC;
        final int i3 = iB;
        ghw.b().updateDayRecord(intPlan.getPlanType().getType(), intPlan.getPlanId(), iC, iB, a(workoutRecord, zB), new DataCallback() { // from class: glb.31
            @Override // com.huawei.basefitnessadvice.callback.DataCallback
            public void onFailure(int i4, String str) {
                ReleaseLogUtil.a("Suggestion_DataImpl", "updateDayRecord fail:", workoutRecord.acquireWorkoutId(), " errorInfo:", str);
                dataCallback.onFailure(i4, str);
            }

            @Override // com.huawei.basefitnessadvice.callback.DataCallback
            public void onSuccess(JSONObject jSONObject) {
                ReleaseLogUtil.d("Suggestion_DataImpl", "updateClockTimes success.", workoutRecord.acquireWorkoutId());
                glb.this.d(intPlan, workoutRecord.acquireWorkoutId(), i2, i3, workoutRecord.acquireFinishRate());
                dataCallback.onSuccess(jSONObject);
                glb.this.a((PlanApi) Services.d("CoursePlanService", PlanApi.class));
                idy.b(1);
            }
        });
        b(intPlan, workoutRecord);
    }

    private void b(IntPlan intPlan, final WorkoutRecord workoutRecord) {
        if (intPlan.getPlanType().equals(IntPlan.PlanType.AI_FITNESS_PLAN)) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: gll
                @Override // java.lang.Runnable
                public final void run() {
                    glb.a(workoutRecord);
                }
            });
        }
    }

    static /* synthetic */ void a(WorkoutRecord workoutRecord) {
        HashMap map = new HashMap(10);
        map.put("isAICourse", Boolean.valueOf(workoutRecord.isAiWorkout()));
        map.put("completeMode", workoutRecord.getRecordModeType() == 1 ? "AIMode" : "commonMode");
        idy.b("1120050", map);
    }

    private int b(WorkoutRecord workoutRecord) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(workoutRecord.acquireExerciseTime());
        return ift.b(calendar.get(7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(PlanApi planApi) {
        if (planApi != null) {
            planApi.setNeedUpdateCurrentPlan();
            btq.e().e("PLAN_UPDATE");
            btq.e().e("PLAN_CLOCK");
        }
    }

    private boolean a(IntPlan intPlan, WorkoutRecord workoutRecord, DataCallback dataCallback) {
        if (!intPlan.getPlanType().equals(IntPlan.PlanType.AI_FITNESS_PLAN) && !intPlan.getPlanType().equals(IntPlan.PlanType.AI_RUN_PLAN) && !intPlan.getPlanType().equals(IntPlan.PlanType.FIT_PLAN)) {
            LogUtil.e("Suggestion_DataImpl", "no need to update record.", workoutRecord.acquireWorkoutId(), " planType:", Integer.valueOf(intPlan.getPlanType().getType()));
            dataCallback.onSuccess(new JSONObject());
            return true;
        }
        if (intPlan.getPlanId().equals(workoutRecord.acquirePlanId())) {
            return false;
        }
        LogUtil.e("Suggestion_DataImpl", "plan id is different. current plan id:", intPlan.getPlanId(), " record plan id:", workoutRecord.acquirePlanId());
        dataCallback.onSuccess(new JSONObject());
        return true;
    }

    private pdr a(WorkoutRecord workoutRecord, boolean z) {
        pdr pdrVar = new pdr();
        pdrVar.c(workoutRecord.acquireWorkoutId());
        if (workoutRecord.isRunWorkout()) {
            pdrVar.e(workoutRecord.acquireTrajectoryId());
        } else {
            pdrVar.e(String.valueOf(workoutRecord.acquireExerciseTime()));
        }
        pdrVar.c(workoutRecord.getCourseSportType());
        pdrVar.e(workoutRecord.getDuration() / 1000);
        pdrVar.a(workoutRecord.acquireExerciseTime() - ((long) workoutRecord.getDuration()));
        pdrVar.c(workoutRecord.acquireExerciseTime());
        pdrVar.b(workoutRecord.acquireActualCalorie());
        pdrVar.a(ped.g(workoutRecord.acquireActualDistance()));
        pdrVar.d(workoutRecord.getTrainPoint());
        pdrVar.c(workoutRecord.acquireFinishRate());
        pdrVar.d(iun.c());
        if (z) {
            pdrVar.e(1);
        } else {
            pdrVar.e(0);
        }
        pdrVar.a("");
        return pdrVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(IntPlan intPlan, String str, int i, int i2, float f) {
        if (!intPlan.getPlanType().equals(IntPlan.PlanType.AI_FITNESS_PLAN) && !intPlan.getPlanType().equals(IntPlan.PlanType.AI_RUN_PLAN) && !intPlan.getPlanType().equals(IntPlan.PlanType.FIT_PLAN)) {
            LogUtil.e("Suggestion_DataImpl", "no need to update clock.", " planType:", Integer.valueOf(intPlan.getPlanType().getType()));
            return;
        }
        if (f < 60.0f && (intPlan.getPlanType().equals(IntPlan.PlanType.AI_RUN_PLAN) || intPlan.getPlanType().equals(IntPlan.PlanType.AI_FITNESS_PLAN) || intPlan.getPlanType().equals(IntPlan.PlanType.FIT_PLAN))) {
            LogUtil.e("Suggestion_DataImpl", "finish rate is to low.", Float.valueOf(f));
            return;
        }
        LogUtil.a("Suggestion_DataImpl", "updateClockTimeInLocal:", intPlan.getPlanType(), " courseId:", str, " weekNumber:", Integer.valueOf(i), " planDayIndex:", Integer.valueOf(i2));
        if (intPlan.getPlanType().equals(IntPlan.PlanType.AI_RUN_PLAN)) {
            Plan compatiblePlan = intPlan.getCompatiblePlan();
            compatiblePlan.setLatestClockInTime(System.currentTimeMillis());
            btw.d(compatiblePlan, i, i2, str);
            gmc.g().l().d(btx.b(), compatiblePlan, compatiblePlan.acquireVersion());
            String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011);
            if (accountInfo != null) {
                this.f35463a.put(d("plan", accountInfo), new SoftReference<>(compatiblePlan));
            } else {
                ReleaseLogUtil.a("Suggestion_DataImpl", "updateClockTimeInLocal(String planId, String name) getAccountInfo == null");
            }
        }
        gmi.b().e(str, i, i2);
        PluginSuggestion.getInstance().startSendIntelligentPlan();
        btq.e().e("PLAN_UPDATE");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, Plan plan) {
        gmc.g().s().c(str, plan);
        glw.c().b();
        glw.c().h();
    }

    @Override // com.huawei.health.plan.model.data.DataApi
    public void postPlanName(String str, String str2, final UiCallback<String> uiCallback) {
        if (uiCallback == null) {
            ReleaseLogUtil.a("Suggestion_DataImpl", "postPlanName() callback == null");
        } else {
            ghw.b().updatePlanName(str, str2, new DataCallback() { // from class: glb.44
                @Override // com.huawei.basefitnessadvice.callback.DataCallback
                public void onFailure(int i, String str3) {
                    ReleaseLogUtil.a("Suggestion_DataImpl", "postPlanName() errorCode=", Integer.valueOf(i));
                    uiCallback.onFailure(glb.this.f35464c, i, str3);
                }

                @Override // com.huawei.basefitnessadvice.callback.DataCallback
                public void onSuccess(JSONObject jSONObject) {
                    uiCallback.onSuccess(glb.this.f35464c, null);
                }
            });
        }
    }

    @Override // com.huawei.health.plan.model.data.DataApi
    public void deleteWorkoutRecords(int i, int i2, IBaseResponseCallback iBaseResponseCallback) {
        String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011);
        if (TextUtils.isEmpty(accountInfo)) {
            ReleaseLogUtil.a("Suggestion_DataImpl", "deleteWorkoutRecords accountInfo == null");
            return;
        }
        LogUtil.a("Suggestion_DataImpl", "deleteWorkoutRecords ids = ", Integer.valueOf(i));
        gmc.g().n().b(accountInfo, "", 9, String.valueOf(i));
        btq.e().e("WORKOUT_DELETE");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Plan plan) {
        if (plan == null) {
            LogUtil.e("Suggestion_DataImpl", "createJoinRunPlan(), plan == null");
            return;
        }
        String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011);
        if (TextUtils.isEmpty(accountInfo)) {
            LogUtil.e("Suggestion_DataImpl", "createJoinRunPlan(Plan plan) getAccountInfo == null");
            return;
        }
        a(accountInfo, plan);
        gmc.g().l().a(plan.acquireId(), btx.b(), plan.acquireVersion(), plan.toString());
        this.f35463a.put(d("plan", accountInfo), new SoftReference<>(plan));
    }

    @Override // com.huawei.health.plan.model.data.DataApi
    public void createFitPlan(long j, int i, int i2, int i3, TreeSet<Integer> treeSet, UiCallback<Plan> uiCallback) {
        if (uiCallback == null) {
            ReleaseLogUtil.a("Suggestion_DataImpl", "createFitPlan() callback == null");
            return;
        }
        String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011);
        UserProfileMgrApi userProfileMgrApiA = a("createFitPlan : userProfileMgrApi is null.");
        if (userProfileMgrApiA == null) {
            return;
        }
        UserInfomation userInfo = userProfileMgrApiA.getUserInfo();
        if (TextUtils.isEmpty(accountInfo) || userInfo == null) {
            ReleaseLogUtil.a("Suggestion_DataImpl", "createFitPlan() getAccountInfo == null");
            uiCallback.onFailure(this.f35464c, 20001, ResultUtil.c(20001));
        } else if (!gnw.c()) {
            uiCallback.onFailure(this.f35464c, -4, ResultUtil.c(-4));
        } else {
            d(accountInfo, new CreatePlanBean(userInfo.getWeightOrDefaultValue(), j, i, i2, i3, gzm.d(treeSet)), uiCallback);
        }
    }

    private void d(final String str, CreatePlanBean createPlanBean, final UiCallback<Plan> uiCallback) {
        ghw.b().createPlan(createPlanBean, new DataCallback() { // from class: glb.56
            @Override // com.huawei.basefitnessadvice.callback.DataCallback
            public void onFailure(int i, String str2) {
                ReleaseLogUtil.a("Suggestion_DataImpl", "createFitPlan() errorCode=", Integer.valueOf(i));
                uiCallback.onFailure(glb.this.f35464c, i, str2);
            }

            @Override // com.huawei.basefitnessadvice.callback.DataCallback
            public void onSuccess(JSONObject jSONObject) {
                if (jSONObject == null) {
                    uiCallback.onFailure(glb.this.f35464c, -1, "data == null");
                    return;
                }
                Plan planA = gzm.a(jSONObject, "planInfo");
                if (planA != null) {
                    glb.this.a(str, planA);
                    gmc.g().l().a(planA.acquireId(), btx.b(), planA.acquireVersion(), planA.toString());
                    glb.this.f35463a.put(glb.this.d("plan", str), new SoftReference(planA));
                    uiCallback.onSuccess(glb.this.f35464c, planA);
                    return;
                }
                uiCallback.onSuccess(glb.this.f35464c, null);
            }
        });
    }

    @Override // com.huawei.health.plan.model.data.DataApi
    public List<RunWorkout> getRunWorkouts() {
        Plan currentPlan = getCurrentPlan();
        if (currentPlan == null) {
            return null;
        }
        List<PlanWorkout> listAcquireWorkouts = currentPlan.acquireWorkouts();
        ArrayList arrayList = new ArrayList(listAcquireWorkouts.size());
        for (PlanWorkout planWorkout : listAcquireWorkouts) {
            if (planWorkout != null) {
                RunWorkout runWorkoutC = gzm.c(planWorkout);
                runWorkoutC.putWorkoutDate(planWorkout.popDayInfo().acquireDate());
                arrayList.add(runWorkoutC);
            }
        }
        return arrayList;
    }

    @Override // com.huawei.health.plan.model.data.DataApi
    public RunWorkout getRunWorkout(String str) {
        Plan currentPlan = getCurrentPlan();
        if (currentPlan == null) {
            return null;
        }
        for (PlanWorkout planWorkout : currentPlan.acquireWorkouts()) {
            if (planWorkout != null && str != null && str.equals(planWorkout.popWorkoutId())) {
                RunWorkout runWorkoutC = gzm.c(planWorkout);
                runWorkoutC.putWorkoutDate(planWorkout.popDayInfo().acquireDate());
                return runWorkoutC;
            }
        }
        return null;
    }

    @Override // com.huawei.health.plan.model.data.DataApi
    public Map<String, Integer> getWorkoutOrders(String str) {
        String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011);
        if (TextUtils.isEmpty(accountInfo)) {
            ReleaseLogUtil.a("Suggestion_DataImpl", "getWorkoutOrders() getAccountInfo == null");
            return new HashMap(0);
        }
        return gmv.b(accountInfo, str);
    }

    @Override // com.huawei.health.plan.model.data.DataApi
    public boolean updatePlanProgress(WorkoutRecord workoutRecord) throws Throwable {
        LogUtil.a("Suggestion_DataImpl", "updatePlanProgress begin...");
        LoginInit loginInit = LoginInit.getInstance(BaseApplication.getContext());
        String accountInfo = loginInit.getAccountInfo(1011);
        if (TextUtils.isEmpty(accountInfo) || workoutRecord == null) {
            ReleaseLogUtil.a("Suggestion_DataImpl", "updatePlanProgress() getAccountInfo == null");
            return false;
        }
        workoutRecord.saveFinishRate(a(workoutRecord.acquireFinishRate()));
        if (workoutRecord.getFeedBack() <= 0) {
            LogUtil.a("Suggestion_DataImpl", "updatePlanProgress updateWorkoutCompleteTimes");
            gmc.g().o().e(accountInfo, workoutRecord.acquireWorkoutId(), workoutRecord.acquireVersion());
        }
        IntPlan intPlanC = c(workoutRecord);
        boolean zC = gmw.c(accountInfo, workoutRecord);
        if (zC && workoutRecord.getFeedBack() <= 0) {
            LogUtil.a("Suggestion_DataImpl", "updatePlanProgress postExerciseBehavior");
            postExerciseBehavior(workoutRecord, 1);
        }
        b(workoutRecord, accountInfo);
        if (gnw.f35849b) {
            PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
            boolean zC2 = gnu.c(workoutRecord);
            ReleaseLogUtil.d("Suggestion_DataImpl", "is old plan record:", Boolean.valueOf(zC2), workoutRecord.acquirePlanId(), " finishRate:", Float.valueOf(workoutRecord.acquireFinishRate()));
            if (!zC2 && !TextUtils.isEmpty(workoutRecord.acquirePlanId()) && !CommonUtil.b(workoutRecord.acquireFinishRate()) && zC) {
                gmc.g().n().c(accountInfo, workoutRecord.acquirePlanId(), workoutRecord.acquireExerciseTime());
                if (intPlanC != null && workoutRecord.acquirePlanId().equals(intPlanC.getPlanId())) {
                    int[] iArrE = btw.e(workoutRecord, intPlanC);
                    d(intPlanC, workoutRecord.acquireWorkoutId(), iArrE[0], iArrE[1], workoutRecord.acquireFinishRate());
                }
            }
            a(workoutRecord, loginInit, zC, planApi);
            return zC;
        }
        return a(zC, workoutRecord, loginInit);
    }

    private IntPlan c(WorkoutRecord workoutRecord) {
        ghf ghfVarA = gmi.b().a();
        if (!TextUtils.isEmpty(workoutRecord.acquireWorkoutId()) && TextUtils.isEmpty(workoutRecord.acquirePlanId()) && ghfVarA != null) {
            long beginDate = ghfVarA.getPlanTimeInfo().getBeginDate() * 1000;
            int iC = ift.c(beginDate, workoutRecord.acquireExerciseTime()) + 1;
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(workoutRecord.acquireExerciseTime());
            int iB = ift.b(calendar.get(7));
            boolean zB = gnw.b(workoutRecord.acquireWorkoutId(), ghfVarA, iC, iB);
            boolean zC = gnw.c(workoutRecord.acquireWorkoutId(), ghfVarA, iC, iB);
            ReleaseLogUtil.d("Suggestion_DataImpl", "startTime:", Long.valueOf(beginDate), " weekOrder:", Integer.valueOf(iC), " dayOrder:", Integer.valueOf(iB), " isInPlan:", Boolean.valueOf(zB), "isUserAdd:", Boolean.valueOf(zC));
            if (zB || zC) {
                workoutRecord.savePlanId(ghfVarA.getPlanId());
                workoutRecord.setPlanTrainDate(ieg.b(workoutRecord.acquireExerciseTime()));
                workoutRecord.saveRecordType(1);
            }
        }
        return ghfVarA;
    }

    private void b(WorkoutRecord workoutRecord, String str) throws Throwable {
        gmc.g().n().a(str, workoutRecord.acquirePlanId(), workoutRecord.acquireExerciseTime());
        d(workoutRecord, str);
        if (workoutRecord.isSingle()) {
            gmc.g().m().a(str, workoutRecord.acquireWorkoutId(), workoutRecord);
            if (gmc.g().m().d(str, workoutRecord.acquireWorkoutId())) {
                gmc.g().n().e(str, workoutRecord.acquireWorkoutId());
            }
        }
    }

    private void a(final WorkoutRecord workoutRecord, final LoginInit loginInit, final boolean z, PlanApi planApi) {
        planApi.e(new UiCallback<IntPlan>() { // from class: glb.69
            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            public void onFailure(int i, String str) {
            }

            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public void onSuccess(IntPlan intPlan) throws Throwable {
                if (intPlan == null) {
                    LogUtil.e("Suggestion_DataImpl", "updatePlanProgress() currentPlan == null");
                    glb.this.a(z, workoutRecord, loginInit);
                    return;
                }
                if (gnu.e(workoutRecord.acquirePlanId()) == 0 && intPlan.getPlanType() != IntPlan.PlanType.AI_RUN_PLAN) {
                    glb.this.a(z, workoutRecord, loginInit);
                    return;
                }
                if (intPlan.getPlanId() == null || !intPlan.getPlanId().equals(workoutRecord.acquirePlanId())) {
                    LogUtil.e("Suggestion_DataImpl", "updatePlanProgress() not current plan");
                    return;
                }
                if (TextUtils.isEmpty(workoutRecord.acquirePlanId())) {
                    return;
                }
                float fE = glb.this.e(workoutRecord, loginInit, intPlan);
                if (intPlan.getPlanType().equals(IntPlan.PlanType.FIT_PLAN)) {
                    fE = gme.c().c(workoutRecord);
                }
                gmi.b().d(fE);
                float fAcquireFinishRate = workoutRecord.acquireFinishRate();
                LogUtil.a("Suggestion_DataImpl", "saveRecord acquireFinishRate: ", Float.valueOf(fAcquireFinishRate), workoutRecord.acquirePlanId(), "  planRate:", Float.valueOf(fE));
                glw.c().e();
                btq.e().e("PLAN_UPDATE");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(boolean z, WorkoutRecord workoutRecord, LoginInit loginInit) throws Throwable {
        Plan currentPlan = getCurrentPlan();
        if (currentPlan == null) {
            ReleaseLogUtil.a("Suggestion_DataImpl", "updatePlanProgress() currentPlan == null");
            return z;
        }
        if (currentPlan.acquireId() == null || !currentPlan.acquireId().equals(workoutRecord.acquirePlanId())) {
            ReleaseLogUtil.a("Suggestion_DataImpl", "updatePlanProgress() not current plan");
            return z;
        }
        if (!TextUtils.isEmpty(workoutRecord.acquirePlanId()) && currentPlan.acquireId().equals(workoutRecord.acquirePlanId())) {
            a(workoutRecord, loginInit, currentPlan);
            btq.e().e("PLAN_UPDATE");
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float e(WorkoutRecord workoutRecord, LoginInit loginInit, IntPlan intPlan) {
        if (intPlan.getPlanType().equals(IntPlan.PlanType.AI_FITNESS_PLAN)) {
            return ped.a(gmi.b().c());
        }
        return a(workoutRecord, loginInit, intPlan.getCompatiblePlan());
    }

    private float a(WorkoutRecord workoutRecord, LoginInit loginInit, Plan plan) throws Throwable {
        PlanRecord planRecordD;
        if (plan == null) {
            return 0.0f;
        }
        String accountInfo = loginInit.getAccountInfo(1011);
        gmc.g().j().a(accountInfo, workoutRecord.acquirePlanId(), gmv.d(accountInfo, workoutRecord.acquirePlanId(), plan.acquireType()));
        if (gmc.g().j().a(accountInfo, workoutRecord.acquirePlanId())) {
            gmc.g().n().b(accountInfo, workoutRecord.acquirePlanId());
        }
        if (plan.acquireType() == 0 && plan.getPlanCategory() != 0) {
            planRecordD = gmv.c(accountInfo, workoutRecord.acquirePlanId());
        } else {
            planRecordD = gmv.d(accountInfo, workoutRecord.acquirePlanId());
        }
        gmc.g().s().e(accountInfo, planRecordD);
        return planRecordD.acquireFinishRate();
    }

    private void d(WorkoutRecord workoutRecord, String str) {
        JSONObject jSONObject;
        int i = 1;
        if (workoutRecord.acquireRecordType() == 1) {
            buh.d("planStatistics_need_refresh", "true");
            int iE = gnu.e(workoutRecord.acquirePlanId());
            if (iE == 0) {
                i = 0;
            } else if (iE != 3) {
                return;
            }
            try {
                jSONObject = new JSONObject(buh.e("planStatistics_" + str + "_type_" + i));
            } catch (JSONException e2) {
                LogUtil.e("Suggestion_DataImpl", LogAnonymous.b(e2));
                jSONObject = null;
            }
            PlanStatistics planStatisticsA = gzq.a(jSONObject);
            long jAcquireDuration = planStatisticsA.acquireDuration();
            long jAcquireCalorie = planStatisticsA.acquireCalorie();
            if (i == 0) {
                planStatisticsA.saveDuration(jAcquireDuration + (((long) workoutRecord.getDuration()) * 1000));
            } else {
                planStatisticsA.saveDuration(jAcquireDuration + ((long) workoutRecord.getDuration()));
            }
            planStatisticsA.saveCalorie(jAcquireCalorie + ((long) ((int) workoutRecord.acquireActualCalorie())));
            buh.d("planStatistics_" + str + "_type_" + i, gzq.a(planStatisticsA));
        }
    }

    @Override // com.huawei.health.plan.model.data.DataApi
    public void getRecommendWorkouts(int i, int i2, Integer[] numArr, Integer[] numArr2, Integer[] numArr3, int i3, Integer[] numArr4, int i4, UiCallback<List<FitWorkout>> uiCallback) {
        if (uiCallback == null) {
            ReleaseLogUtil.a("Suggestion_DataImpl", "getRecommendWorkouts(), callback == null");
            return;
        }
        String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011);
        if (TextUtils.isEmpty(accountInfo)) {
            ReleaseLogUtil.a("Suggestion_DataImpl", "getRecommendWorkouts() getAccountInfo()==null");
            uiCallback.onFailure(this.f35464c, 20001, ResultUtil.c(20001));
        } else if (!CommonUtil.ab(btx.c())) {
            uiCallback.onFailure(this.f35464c, ResultUtil.ResultCode.NO_NET, ResultUtil.c(ResultUtil.ResultCode.NO_NET));
        } else {
            a(false, i, i2, numArr, numArr2, numArr3, i3, numArr4, accountInfo, 0, i4, uiCallback);
        }
    }

    @Override // com.huawei.health.plan.model.data.DataApi
    public void getFilterFitnessCourses(WorkoutListBean workoutListBean, final UiCallback<List<Workout>> uiCallback) {
        if (uiCallback == null) {
            LogUtil.e("Suggestion_DataImpl", "getFilterFitnessCourses(), callback == null");
            return;
        }
        if (c(uiCallback) && d(uiCallback)) {
            if (WorkoutListBean.isFitWorkoutType(workoutListBean)) {
                final ArrayList arrayList = new ArrayList(10);
                b(workoutListBean, LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011), arrayList, new DataCallback() { // from class: glb.79
                    @Override // com.huawei.basefitnessadvice.callback.DataCallback
                    public void onFailure(int i, String str) {
                        LogUtil.j("Suggestion_DataImpl", "getWorkoutsFromCloud errorCode=", Integer.valueOf(i));
                        uiCallback.onFailure(i, str);
                    }

                    @Override // com.huawei.basefitnessadvice.callback.DataCallback
                    public void onSuccess(JSONObject jSONObject) {
                        uiCallback.onSuccess(pea.f(arrayList));
                    }
                });
            } else {
                e(workoutListBean, uiCallback);
            }
        }
    }

    @Override // com.huawei.health.plan.model.data.DataApi
    public void searchWorkoutList(int i, int i2, String str, List<Integer> list, final UiCallback<List<FitWorkout>> uiCallback) {
        if (uiCallback == null) {
            ReleaseLogUtil.a("Suggestion_DataImpl", "searchWorkoutList(), callback == null");
            return;
        }
        if (d(uiCallback) && e(uiCallback)) {
            String[] strArrSplit = str.trim().split("\\s+");
            if (strArrSplit.length > 3) {
                LogUtil.a("Suggestion_DataImpl", "searchWorkoutList searchText = ", str);
                str = strArrSplit[0] + " " + strArrSplit[1] + " " + strArrSplit[2];
                LogUtil.a("Suggestion_DataImpl", "searchWorkoutList change searchText = ", str);
            }
            ghw.b().searchWorkoutList(i, i2, str, list, new DataCallback() { // from class: glb.76
                @Override // com.huawei.basefitnessadvice.callback.DataCallback
                public void onFailure(int i3, String str2) {
                    ReleaseLogUtil.a("Suggestion_DataImpl", "searchWorkoutList onFailure() errorCode=", Integer.valueOf(i3));
                    uiCallback.onFailure(glb.this.f35464c, -1, "data == null");
                }

                @Override // com.huawei.basefitnessadvice.callback.DataCallback
                public void onSuccess(JSONObject jSONObject) {
                    if (jSONObject == null) {
                        uiCallback.onFailure(glb.this.f35464c, -1, "data == null");
                    } else {
                        uiCallback.onSuccess(glb.this.f35464c, pda.a(jSONObject));
                    }
                }
            });
        }
    }

    @Override // com.huawei.health.plan.model.data.DataApi
    public void getJoinedWorkouts(int i, int i2, Integer[] numArr, Integer[] numArr2, Integer[] numArr3, int i3, Integer[] numArr4, int i4, UiCallback<List<FitWorkout>> uiCallback) {
        if (uiCallback == null) {
            ReleaseLogUtil.a("Suggestion_DataImpl", "getJoinedWorkouts(), callback == null");
            return;
        }
        String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011);
        if (TextUtils.isEmpty(accountInfo)) {
            ReleaseLogUtil.a("Suggestion_DataImpl", "getJoinedWorkouts() getAccountInfo()==null");
            uiCallback.onFailure(this.f35464c, 20001, ResultUtil.c(20001));
        } else if (!CommonUtil.ab(btx.c())) {
            uiCallback.onFailure(this.f35464c, ResultUtil.ResultCode.NO_NET, ResultUtil.c(ResultUtil.ResultCode.NO_NET));
        } else {
            a(false, i, i2, numArr, numArr2, numArr3, i3, numArr4, accountInfo, 1, i4, uiCallback);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final WorkoutListBean workoutListBean, final String str, final List<FitWorkout> list, final DataCallback dataCallback) {
        if (dataCallback == null || list == null) {
            ReleaseLogUtil.a("Suggestion_DataImpl", "getWorkoutsFromCloud(), callback == null || fitWorkouts == null");
            return;
        }
        final int pageStart = workoutListBean.getPageStart();
        final int pageSize = workoutListBean.getPageSize();
        final int iMin = Math.min(pageSize, 50);
        workoutListBean.setPageSize(iMin);
        LogUtil.d("Suggestion_DataImpl", "getWorkoutsFromCloud pageStart = ", Integer.valueOf(pageStart), " ,adjustPageSize = ", Integer.valueOf(iMin), ", userId = ", str);
        ghw.b().getWorkoutList(workoutListBean, new DataCallback() { // from class: glb.2
            @Override // com.huawei.basefitnessadvice.callback.DataCallback
            public void onFailure(int i, String str2) {
                ReleaseLogUtil.a("Suggestion_DataImpl", "getWorkouts errorCode=", Integer.valueOf(i));
                dataCallback.onFailure(i, str2);
            }

            @Override // com.huawei.basefitnessadvice.callback.DataCallback
            public void onSuccess(JSONObject jSONObject) {
                if (jSONObject == null) {
                    dataCallback.onFailure(-1, "data == null");
                    return;
                }
                List<FitWorkout> listA = pda.a(jSONObject);
                LogUtil.a("Suggestion_DataImpl", "getJoinedworkout getWorkoutsFromCloud :", Integer.valueOf(listA.size()));
                list.clear();
                list.addAll(listA);
                int iOptInt = jSONObject.optInt("total", -1);
                boolean z = (iOptInt >= 0 && pageStart + listA.size() >= iOptInt) || listA.size() < iMin;
                if (pageSize > 50 && !z) {
                    LogUtil.a("Suggestion_DataImpl", "start to executor getWorkoutsFromCloud again");
                    workoutListBean.setPageStart(pageStart + 50);
                    workoutListBean.setPageSize(pageSize - 50);
                    glb.this.b(workoutListBean, str, (List<FitWorkout>) list, dataCallback);
                    return;
                }
                LogUtil.a("Suggestion_DataImpl", "getWorkoutsFromCloud executor success callback");
                dataCallback.onSuccess(jSONObject);
            }
        });
    }

    private void e(WorkoutListBean workoutListBean, final UiCallback<List<Workout>> uiCallback) {
        ghw.b().getNavigationCourseList(workoutListBean, new DataCallback() { // from class: glb.3
            @Override // com.huawei.basefitnessadvice.callback.DataCallback
            public void onFailure(int i, String str) {
                LogUtil.j("Suggestion_DataImpl", "getWorkoutsFromCloud errorCode=", Integer.valueOf(i));
                uiCallback.onFailure(i, str);
            }

            @Override // com.huawei.basefitnessadvice.callback.DataCallback
            public void onSuccess(JSONObject jSONObject) {
                if (jSONObject == null) {
                    uiCallback.onFailure(-1, "data == null");
                    return;
                }
                String strOptString = jSONObject.optString("navigationCourseInfos");
                if (TextUtils.isEmpty(strOptString)) {
                    LogUtil.j("Suggestion_DataImpl", "getNavigationCourseList packageList == null");
                    uiCallback.onFailure(ResultUtil.ResultCode.PARAMETER_INVALID, "getNavigationCourseList packageList == null");
                    return;
                }
                try {
                    List list = (List) new Gson().fromJson(strOptString, new TypeToken<List<HealthWorkout>>() { // from class: com.huawei.health.plan.model.data.DataImpl$11$1
                    }.getType());
                    if (list == null) {
                        LogUtil.j("Suggestion_DataImpl", "healthWorkouts == null");
                        uiCallback.onFailure(ResultUtil.ResultCode.PARAMETER_INVALID, "healthWorkouts == null");
                    } else {
                        LogUtil.a("Suggestion_DataImpl", "sleepAudioPackageListSize = ", Integer.valueOf(list.size()));
                        uiCallback.onSuccess(new ArrayList(list));
                    }
                } catch (JsonSyntaxException unused) {
                    LogUtil.e("Suggestion_DataImpl", "parse List<HealthWorkout> , jsonSyntaxException");
                    uiCallback.onFailure(ResultUtil.ResultCode.PARAMETER_INVALID, "parse List<HealthWorkout> , jsonSyntaxException");
                }
            }
        });
    }

    private void a(boolean z, int i, int i2, Integer[] numArr, Integer[] numArr2, Integer[] numArr3, int i3, Integer[] numArr4, final String str, final int i4, int i5, final UiCallback<List<FitWorkout>> uiCallback) {
        if (uiCallback == null) {
            ReleaseLogUtil.a("Suggestion_DataImpl", "getWorkouts(), callback == null");
        } else if (!e()) {
            uiCallback.onFailure(this.f35464c, -4, ResultUtil.c(-4));
        } else {
            final ArrayList arrayList = new ArrayList(10);
            b(new WorkoutListBean(i, i2, i3, numArr, numArr3, numArr2, numArr4, i4), str, arrayList, new DataCallback() { // from class: glb.1
                @Override // com.huawei.basefitnessadvice.callback.DataCallback
                public void onFailure(int i6, String str2) {
                    ReleaseLogUtil.e("Suggestion_DataImpl", "getWorkoutsFromCloud errorCode=", Integer.valueOf(i6));
                    uiCallback.onFailure(glb.this.f35464c, i6, str2);
                }

                @Override // com.huawei.basefitnessadvice.callback.DataCallback
                public void onSuccess(JSONObject jSONObject) {
                    if (TextUtils.isEmpty(str) && jSONObject != null) {
                        buh.d("total", StringUtils.c(Integer.valueOf(jSONObject.optInt("total", arrayList.size()))));
                    }
                    if (i4 == 1 && !njy.e(arrayList)) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            if (((FitWorkout) it.next()).getIntervals() == -2) {
                                it.remove();
                            }
                        }
                    }
                    LogUtil.a("Suggestion_DataImpl", "getWorkouts executor success callback");
                    uiCallback.onSuccess(glb.this.f35464c, arrayList);
                }
            });
        }
    }

    @Override // com.huawei.health.plan.model.data.DataApi
    public void getWorkout(final gzl gzlVar, final UiCallback<FitWorkout> uiCallback) {
        if (uiCallback == null) {
            ReleaseLogUtil.a("Suggestion_DataImpl", "getWorkout(), callback == null");
        } else {
            LogUtil.a("Suggestion_DataImpl", "workoutId = ", gzlVar.g(), " version ", gzlVar.i(), " language ", gzlVar.d(), "planId: ", gzlVar.a());
            btt.d().c(new Runnable() { // from class: glk
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    this.e.a(uiCallback, gzlVar);
                }
            });
        }
    }

    /* synthetic */ void a(UiCallback uiCallback, gzl gzlVar) throws Throwable {
        UserInfomation userInfo;
        if (LoginInit.getInstance(BaseApplication.getContext()).isBrowseMode()) {
            userInfo = new UserInfomation(UnitUtil.f() ? 1 : 0);
        } else {
            UserProfileMgrApi userProfileMgrApiA = a("getWorkout : userProfileMgrApi is null.");
            if (userProfileMgrApiA == null || c(userProfileMgrApiA, (UiCallback<FitWorkout>) uiCallback)) {
                return;
            } else {
                userInfo = userProfileMgrApiA.getUserInfo();
            }
        }
        String huidOrDefault = LoginInit.getInstance(BaseApplication.getContext()).getHuidOrDefault();
        if (e(userInfo, huidOrDefault, (UiCallback<FitWorkout>) uiCallback)) {
            return;
        }
        FitWorkout fitWorkoutA = gmc.g().o().a(huidOrDefault, gzlVar.g(), gzlVar.i(), gzlVar.d());
        if (CommonUtil.ca()) {
            uiCallback.onSuccess(this.f35464c, fitWorkoutA);
            return;
        }
        if (!e()) {
            uiCallback.onSuccess(this.f35464c, fitWorkoutA);
        } else if (((CourseApi) Services.b("CoursePlanService", CourseApi.class)).isNeedGetFromCloud(fitWorkoutA, gzlVar, userInfo)) {
            ReleaseLogUtil.e("Suggestion_DataImpl", "getWorkout() from cloud ", Boolean.valueOf(fitWorkoutA == null));
            b(gzlVar, userInfo, fitWorkoutA, (UiCallback<FitWorkout>) uiCallback);
        } else {
            uiCallback.onSuccess(this.f35464c, fitWorkoutA);
        }
    }

    private UserProfileMgrApi a(String str) {
        UserProfileMgrApi userProfileMgrApi = (UserProfileMgrApi) Services.d("HWUserProfileMgr", UserProfileMgrApi.class);
        if (userProfileMgrApi != null) {
            return userProfileMgrApi;
        }
        LogUtil.j("Suggestion_DataImpl", str);
        return null;
    }

    private boolean c(UserProfileMgrApi userProfileMgrApi, UiCallback<FitWorkout> uiCallback) {
        if (userProfileMgrApi.waitInit()) {
            return false;
        }
        ReleaseLogUtil.a("Suggestion_DataImpl", "getWorkout waitInit fail");
        uiCallback.onFailure(this.f35464c, 20001, ResultUtil.c(20001));
        return true;
    }

    private boolean e(UserInfomation userInfomation, String str, UiCallback<FitWorkout> uiCallback) {
        if (userInfomation != null && (!TextUtils.isEmpty(str) || LoginInit.getInstance(BaseApplication.getContext()).isBrowseMode())) {
            return false;
        }
        ReleaseLogUtil.a("Suggestion_DataImpl", "getWorkout() userInfo == null ||TextUtils.isEmpty(userId)");
        uiCallback.onFailure(this.f35464c, 20001, ResultUtil.c(20001));
        return true;
    }

    private void b(final gzl gzlVar, final UserInfomation userInfomation, final FitWorkout fitWorkout, final UiCallback<FitWorkout> uiCallback) {
        ReleaseLogUtil.d("Suggestion_DataImpl", "getWorkoutFromCloud() ", gzlVar.g(), " ", gzlVar.i(), " ", gzlVar.d(), " ", gzlVar.g(), " ", Boolean.valueOf(gzlVar.e()));
        if (uiCallback == null) {
            ReleaseLogUtil.a("Suggestion_DataImpl", "getWorkoutFromCloud(), callback == null");
        } else {
            ghw.b().getWorkoutInfo(new gzl.a(gzlVar.g()).d(Integer.valueOf(userInfomation.getGenderOrDefaultValue())).d(gzlVar.i()).a(gzlVar.d()).b(gzlVar.a()).d(gzlVar.f()).a(gzlVar.e()).c(), new DataCallback() { // from class: glb.4
                @Override // com.huawei.basefitnessadvice.callback.DataCallback
                public void onFailure(int i, String str) {
                    OpAnalyticsUtil.getInstance().setEventOneErrorCode(OperationKey.HEALTH_APP_GET_WORKOUT_DETAIL_60010008.value(), i);
                    ReleaseLogUtil.a("Suggestion_DataImpl", "getWorkoutFromCloud() errorCode=", Integer.valueOf(i));
                    if (fitWorkout == null) {
                        uiCallback.onFailure(glb.this.f35464c, i, str);
                    } else {
                        LogUtil.a("Suggestion_DataImpl", "getWorkout workout from db is not null");
                        uiCallback.onSuccess(glb.this.f35464c, fitWorkout);
                    }
                }

                @Override // com.huawei.basefitnessadvice.callback.DataCallback
                public void onSuccess(JSONObject jSONObject) throws Throwable {
                    glb.this.d(jSONObject, gzlVar, userInfomation, fitWorkout, (UiCallback<FitWorkout>) uiCallback);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(JSONObject jSONObject, gzl gzlVar, UserInfomation userInfomation, FitWorkout fitWorkout, UiCallback<FitWorkout> uiCallback) throws Throwable {
        ReleaseLogUtil.d("Suggestion_DataImpl", "getWorkout() is data null ", Boolean.valueOf(jSONObject == null));
        FitWorkout fitWorkoutC = pda.c(btx.b(), jSONObject);
        if (fitWorkoutC != null) {
            if (gld.d() != null && gld.d().equals(gzlVar.d())) {
                glw.c().e(gzlVar.g(), glr.d(userInfomation.getGenderOrDefaultValue()), gzlVar.i(), gzlVar.d());
                gmc.g().o().c(LoginInit.getInstance(BaseApplication.getContext()).getHuidOrDefault(), fitWorkoutC);
            }
            uiCallback.onSuccess(this.f35464c, fitWorkoutC);
            return;
        }
        if (fitWorkout != null) {
            LogUtil.a("Suggestion_DataImpl", "onSuccess, workout from db is not null");
            uiCallback.onSuccess(this.f35464c, fitWorkout);
        } else {
            uiCallback.onFailure(this.f35464c, 9999, ResultUtil.c(9999));
            OpAnalyticsUtil.getInstance().setEventOneErrorCode(OperationKey.HEALTH_APP_GET_WORKOUT_DETAIL_60010008.value(), 9999);
        }
    }

    @Override // com.huawei.health.plan.model.data.DataApi
    public void getWorkoutsInfo(List<gzl> list, boolean z, final UiCallback<List<FitWorkout>> uiCallback) {
        ghw.b().getWorkoutsInfo(list, z, new DataCallback() { // from class: glb.9
            @Override // com.huawei.basefitnessadvice.callback.DataCallback
            public void onFailure(int i, String str) {
                OpAnalyticsUtil.getInstance().setEventOneErrorCode(OperationKey.HEALTH_APP_GET_WORKOUT_DETAIL_60010008.value(), i);
                ReleaseLogUtil.a("Suggestion_DataImpl", "getWorkoutsInfoFromCloud() errorCode=", Integer.valueOf(i));
                uiCallback.onFailure(glb.this.f35464c, i, str);
            }

            @Override // com.huawei.basefitnessadvice.callback.DataCallback
            public void onSuccess(JSONObject jSONObject) {
                List<FitWorkout> listB = pda.b(btx.b(), jSONObject);
                if (listB != null) {
                    LogUtil.a("Suggestion_DataImpl", "getFitWorkout size: ", Integer.valueOf(listB.size()));
                    uiCallback.onSuccess(glb.this.f35464c, listB);
                } else {
                    uiCallback.onFailure(glb.this.f35464c, 9999, ResultUtil.c(9999));
                    OpAnalyticsUtil.getInstance().setEventOneErrorCode(OperationKey.HEALTH_APP_GET_WORKOUT_DETAIL_60010008.value(), 9999);
                }
            }
        });
    }

    @Override // com.huawei.health.plan.model.data.DataApi
    public void postPlanProgress(final String str, final UiCallback<String> uiCallback) {
        final PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
        if (planApi == null || !btw.i()) {
            LogUtil.a("Suggestion_DataImpl", "postPlanProgress intPlan");
            b(str, false, "", (qey) null, uiCallback);
        } else {
            ThreadPoolManager.c().execute(new Runnable() { // from class: glg
                @Override // java.lang.Runnable
                public final void run() {
                    this.f35622c.b(planApi, str, uiCallback);
                }
            });
        }
    }

    /* JADX INFO: renamed from: glb$6, reason: invalid class name */
    class AnonymousClass6 extends UiCallback<qey> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f35571b;
        final /* synthetic */ PlanApi d;
        final /* synthetic */ UiCallback e;

        AnonymousClass6(String str, UiCallback uiCallback, PlanApi planApi) {
            this.f35571b = str;
            this.e = uiCallback;
            this.d = planApi;
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public void onFailure(int i, String str) {
            ReleaseLogUtil.a("Suggestion_DataImpl", "postPlanProgress errorCode:", Integer.valueOf(i), ",errorInfo:", str);
            final String str2 = this.f35571b;
            final UiCallback uiCallback = this.e;
            HandlerExecutor.b(new Runnable() { // from class: glm
                @Override // java.lang.Runnable
                public final void run() {
                    this.f35627a.a(str2, uiCallback);
                }
            });
        }

        /* synthetic */ void a(String str, UiCallback uiCallback) {
            glb.this.b(str, false, "", (qey) null, (UiCallback<String>) uiCallback);
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(final qey qeyVar) {
            LogUtil.a("Suggestion_DataImpl", "postPlanProgress smart train plan");
            final boolean z = this.d.getCurrentIntPlan() == null && (btw.d(qeyVar) || btw.e(qeyVar));
            final String strH = btw.d(qeyVar) ? qeyVar.h() : "";
            final String str = this.f35571b;
            final UiCallback uiCallback = this.e;
            HandlerExecutor.b(new Runnable() { // from class: glo
                @Override // java.lang.Runnable
                public final void run() {
                    this.f35632c.d(str, z, strH, qeyVar, uiCallback);
                }
            });
        }

        /* synthetic */ void d(String str, boolean z, String str2, qey qeyVar, UiCallback uiCallback) {
            glb.this.b(str, z, str2, qeyVar, (UiCallback<String>) uiCallback);
        }
    }

    /* synthetic */ void b(PlanApi planApi, String str, UiCallback uiCallback) {
        planApi.getCurrentPlan(new AnonymousClass6(str, uiCallback, planApi));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str, boolean z, String str2, qey qeyVar, UiCallback<String> uiCallback) {
        if (uiCallback == null) {
            ReleaseLogUtil.a("Suggestion_DataImpl", "postPlanProgress(), callback == null");
            return;
        }
        String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011);
        if (TextUtils.isEmpty(accountInfo)) {
            ReleaseLogUtil.a("Suggestion_DataImpl", "postPlanProgress() getAccountInfo == null");
            uiCallback.onFailure(this.f35464c, 20001, ResultUtil.c(20001));
            return;
        }
        WorkoutRecord workoutRecordE = gmv.e(accountInfo, str);
        if (workoutRecordE != null) {
            LogUtil.a("Suggestion_DataImpl", "postPlanProgress feedBack:", Integer.valueOf(workoutRecordE.getFeedBack()));
            int i = (z || (workoutRecordE.acquireRecordType() == 0) || (!TextUtils.isEmpty(str2) && Objects.equals(str2, workoutRecordE.acquirePlanId()))) ? 0 : 1;
            ReleaseLogUtil.d("Suggestion_DataImpl", "postPlanProgress isSmartTrainPlan:", Boolean.valueOf(z), " type:", Integer.valueOf(workoutRecordE.acquireRecordType()), " id:", str2);
            ghw.b().finishExercise(i, workoutRecordE, new AnonymousClass10(uiCallback, workoutRecordE, z, qeyVar));
            e(workoutRecordE);
        } else {
            uiCallback.onSuccess(this.f35464c, null);
        }
        btq.e().e("WORKOUT_FINISHED");
    }

    /* JADX INFO: renamed from: glb$10, reason: invalid class name */
    class AnonymousClass10 extends DataCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ UiCallback f35468a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f35470c;
        final /* synthetic */ qey d;
        final /* synthetic */ WorkoutRecord e;

        AnonymousClass10(UiCallback uiCallback, WorkoutRecord workoutRecord, boolean z, qey qeyVar) {
            this.f35468a = uiCallback;
            this.e = workoutRecord;
            this.f35470c = z;
            this.d = qeyVar;
        }

        @Override // com.huawei.basefitnessadvice.callback.DataCallback
        public void onFailure(int i, String str) {
            ReleaseLogUtil.a("Suggestion_DataImpl", "postPlanProgress() errorCode=", Integer.valueOf(i));
            this.f35468a.onFailure(glb.this.f35464c, i, str);
        }

        @Override // com.huawei.basefitnessadvice.callback.DataCallback
        public void onSuccess(JSONObject jSONObject) {
            ReleaseLogUtil.d("Suggestion_DataImpl", "finishExercise data:", jSONObject);
            this.f35468a.onSuccess(glb.this.f35464c, null);
            long jAcquireExerciseTime = this.e.acquireExerciseTime() / 1000;
            FitnessHistoryModel.getInstance().postFitnessHistoryRequest(jAcquireExerciseTime - 1, jAcquireExerciseTime + 1, 0);
            if (this.f35470c) {
                ReleaseLogUtil.d("Suggestion_DataImpl", "syncSmartTrainPlan");
                HandlerCenter.a().d(new Runnable() { // from class: gln
                    @Override // java.lang.Runnable
                    public final void run() {
                        PluginSuggestion.getInstance().sendIntelligentPlan();
                    }
                }, 5000L);
            }
            HandlerCenter handlerCenterA = HandlerCenter.a();
            final qey qeyVar = this.d;
            final WorkoutRecord workoutRecord = this.e;
            handlerCenterA.c(new Runnable() { // from class: glt
                @Override // java.lang.Runnable
                public final void run() {
                    idy.b(qeyVar, workoutRecord.acquireWorkoutId());
                }
            });
        }
    }

    private void e(final WorkoutRecord workoutRecord) {
        gmi.b().b(new UiCallback<ghf>() { // from class: glb.8
            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            public void onFailure(int i, String str) {
                LogUtil.a("Suggestion_DataImpl", "no plan, no need updateFitnessDayRecord");
            }

            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public void onSuccess(ghf ghfVar) {
                if (ghfVar != null && ghfVar.getPlanType().equals(IntPlan.PlanType.AI_FITNESS_PLAN) && TextUtils.isEmpty(workoutRecord.acquirePlanId())) {
                    gmi.b().d("", btw.b(workoutRecord));
                }
            }
        });
    }

    @Override // com.huawei.health.plan.model.data.DataApi
    public PlanRecord getPlanProgress(String str) {
        String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011);
        if (TextUtils.isEmpty(accountInfo)) {
            ReleaseLogUtil.e("Suggestion_DataImpl", "getPlanProgress(String planId) getAccountInfo == null");
            return null;
        }
        Plan currentRunPlan = getCurrentRunPlan();
        if (str == null || currentRunPlan == null || !str.equals(currentRunPlan.acquireId())) {
            if (str != null) {
                return gmc.g().s().c(accountInfo, str);
            }
            return null;
        }
        if (currentRunPlan.getPlanCategory() == 1) {
            PlanRecord planRecordC = gmv.c(accountInfo, str);
            LogUtil.a("Suggestion_DataImpl", "getPlanProgress getIntelligentPlanProgress", planRecordC);
            return planRecordC;
        }
        LogUtil.a("Suggestion_DataImpl", "getPlanProgress getPlanProgress", gmv.d(accountInfo, str));
        return gmv.d(accountInfo, str);
    }

    @Override // com.huawei.health.plan.model.data.DataApi
    public void getPlanProgress(final String str, final UiCallback<PlanRecord> uiCallback) {
        if (uiCallback == null) {
            ReleaseLogUtil.a("Suggestion_DataImpl", "postPlanProgress(), callback == null");
            return;
        }
        LogUtil.a("Suggestion_DataImpl", "planId = ", str);
        if (gnu.e(str) == 3) {
            LogUtil.d("Suggestion_DataImpl", "fitnessPlan ");
            uiCallback.onSuccess(this.f35464c, gme.c().c(str));
        } else if (gnw.c() && glw.c().d(str)) {
            e(str, new UiCallback<String>() { // from class: glb.7
                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                public void onFailure(int i, String str2) {
                    ReleaseLogUtil.a("Suggestion_DataImpl", "getPlanProgress errorCode=", Integer.valueOf(i));
                    uiCallback.onSuccess(glb.this.f35464c, glb.this.getPlanProgress(str));
                }

                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public void onSuccess(String str2) {
                    glw.c().b(str);
                    uiCallback.onSuccess(glb.this.f35464c, glb.this.getPlanProgress(str));
                }
            });
        } else {
            uiCallback.onSuccess(this.f35464c, getPlanProgress(str));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str, long j) {
        LogUtil.a("Suggestion_DataImpl", "enter finishPlan");
        String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011);
        if (TextUtils.isEmpty(accountInfo)) {
            ReleaseLogUtil.a("Suggestion_DataImpl", "finishPlan() getAccountInfo == null");
            return;
        }
        PlanRecord planProgress = getPlanProgress(str);
        gmc.g().s().e(accountInfo, planProgress);
        d();
        if (j != 0) {
            gmc.g().s().a(accountInfo, str, j);
        } else {
            gmc.g().s().e(accountInfo, str);
        }
        glw.c().b();
        glw.c().h();
        if (gnw.c() && !c(str)) {
            gmc.g().n().d(str);
            gmw.a(str);
            gmc.g().j().c(accountInfo, str);
        }
        this.f35463a.remove(d("plan", accountInfo));
        if (planProgress != null && planProgress.getPlanCategory() == 1) {
            gmy.c(str);
            gmy.e(IntPlan.PlanType.AI_RUN_PLAN.getType());
        }
        if (!gnw.c()) {
            gmi.b().b(true);
            btq.e().e("PLAN_UPDATE");
        }
        LogUtil.a("Suggestion_DataImpl", "exit finishPlan");
    }

    @Override // com.huawei.health.plan.model.data.DataApi
    public void finishPlan(final String str, final UiCallback<String> uiCallback) {
        if (uiCallback == null) {
            ReleaseLogUtil.a("Suggestion_DataImpl", "finishPlan(), callback == null");
            return;
        }
        String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011);
        if (TextUtils.isEmpty(accountInfo)) {
            ReleaseLogUtil.a("Suggestion_DataImpl", "finishPlan() getAccountInfo == null");
            uiCallback.onFailure(this.f35464c, 20001, ResultUtil.c(20001));
            return;
        }
        if (gnw.c() && !CommonUtil.ca() && !c(str)) {
            if (!CommonUtil.ab(btx.c())) {
                uiCallback.onFailure(this.f35464c, ResultUtil.ResultCode.NO_NET, ResultUtil.c(ResultUtil.ResultCode.NO_NET));
                return;
            } else if (gmc.g().n().b(accountInfo) > 0) {
                glr.a(new OnStateListener() { // from class: glb.11
                    @Override // com.huawei.health.courseplanservice.api.OnStateListener
                    public void onFailure(int i, String str2) {
                        ReleaseLogUtil.a("Suggestion_DataImpl", "finishPlan errorCode=", Integer.valueOf(i));
                        glb.this.d(str, (UiCallback<String>) uiCallback);
                    }

                    @Override // com.huawei.health.courseplanservice.api.OnStateListener
                    public void onFinish() {
                        ReleaseLogUtil.e("Suggestion_DataImpl", "finishPlan: data sync completed");
                        glb.this.d(str, (UiCallback<String>) uiCallback);
                    }
                });
            } else {
                d(str, uiCallback);
            }
        } else {
            c(str, System.currentTimeMillis());
            uiCallback.onSuccess(this.f35464c, null);
        }
        if (gnw.f35849b) {
            return;
        }
        btq.e().e("PLAN_UPDATE");
        btq.e().e("PLAN_DELETE");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(final String str, final UiCallback<String> uiCallback) {
        if (uiCallback == null) {
            ReleaseLogUtil.a("Suggestion_DataImpl", "postFinishPlan(), callback == null");
            return;
        }
        String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011);
        if (TextUtils.isEmpty(accountInfo)) {
            ReleaseLogUtil.a("Suggestion_DataImpl", "postFinishPlan() getAccountInfo == null");
            uiCallback.onFailure(this.f35464c, 20001, ResultUtil.c(20001));
            return;
        }
        final long jCurrentTimeMillis = System.currentTimeMillis();
        final PlanRecord planRecordC = gmc.g().s().c(accountInfo, str);
        if (planRecordC == null) {
            uiCallback.onFailure(this.f35464c, 20009, ResultUtil.c(20009));
        } else if (planRecordC.getPlanCategory() == 1) {
            new gmz().d(str, new UiCallback<pdx>() { // from class: glb.15
                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                public void onFailure(int i, String str2) {
                    glb.this.e(planRecordC.acquirePlanId(), planRecordC.acquireFinishRate(), planRecordC.acquireActualDistance(), planRecordC.acquireActualCalorie(), 0.0f, jCurrentTimeMillis, uiCallback);
                }

                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public void onSuccess(pdx pdxVar) {
                    if (pdxVar == null) {
                        glb.this.e(planRecordC.acquirePlanId(), planRecordC.acquireFinishRate(), planRecordC.acquireActualDistance(), planRecordC.acquireActualCalorie(), 0.0f, jCurrentTimeMillis, uiCallback);
                        return;
                    }
                    pdw pdwVarR = pdxVar.r();
                    glb.this.e(str, pdwVarR.j(), pdwVarR.a(), pdwVarR.b(), 60000.0f * pdwVarR.e(), jCurrentTimeMillis, uiCallback);
                }
            });
        } else {
            e(planRecordC.acquirePlanId(), planRecordC.acquireFinishRate(), planRecordC.acquireActualDistance(), planRecordC.acquireActualCalorie(), 0.0f, jCurrentTimeMillis, uiCallback);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(final String str, float f, float f2, float f3, float f4, final long j, final UiCallback<String> uiCallback) {
        ghw.b().finishPlan(new FinishPlanBean(str, f, f2, f3, f4, j), new DataCallback() { // from class: glb.14
            @Override // com.huawei.basefitnessadvice.callback.DataCallback
            public void onFailure(int i, String str2) {
                ReleaseLogUtil.a("Suggestion_DataImpl", "postFinishPlan errorCode=", Integer.valueOf(i));
                if (i != 200019) {
                    uiCallback.onFailure(glb.this.f35464c, i, str2);
                } else {
                    onSuccess(null);
                }
            }

            @Override // com.huawei.basefitnessadvice.callback.DataCallback
            public void onSuccess(JSONObject jSONObject) {
                glb.this.c(str, j);
                uiCallback.onSuccess(glb.this.f35464c, jSONObject == null ? null : jSONObject.toString());
            }
        });
    }

    @Override // com.huawei.health.plan.model.data.DataApi
    public void postExerciseBehavior(WorkoutRecord workoutRecord, int i) {
        if (!DataSyncService.d(workoutRecord.acquireCourseBelongType(), i)) {
            LogUtil.j("Suggestion_DataImpl", "postExerciseBehavior skipped by belongType=", Integer.valueOf(workoutRecord.acquireCourseBelongType()), ", operaType=", Integer.valueOf(i));
            return;
        }
        LogUtil.a("Suggestion_DataImpl", "postExerciseBehavior workoutId=", workoutRecord.acquireWorkoutId(), ",version = ", workoutRecord.acquireVersion(), ",workoutPackageId = ", workoutRecord.acquireWorkoutPackageId(), ",courseBelongType = ", Integer.valueOf(workoutRecord.acquireCourseBelongType()), ",operationType=", Integer.valueOf(i));
        String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011);
        if (TextUtils.isEmpty(accountInfo)) {
            ReleaseLogUtil.a("Suggestion_DataImpl", "postExerciseBehavior() getAccountInfo == null");
        } else {
            gmc.g().n().b(accountInfo, workoutRecord, String.valueOf(i));
        }
    }

    @Override // com.huawei.health.plan.model.data.DataApi
    public void postExerciseBehavior(WorkoutRecord workoutRecord, int i, final UiCallback<String> uiCallback) {
        if (uiCallback == null) {
            ReleaseLogUtil.a("Suggestion_DataImpl", "postExerciseBehavior(), callback == null");
        } else {
            ghw.b().postBehavior(workoutRecord, i, new DataCallback() { // from class: glb.12
                @Override // com.huawei.basefitnessadvice.callback.DataCallback
                public void onFailure(int i2, String str) {
                    ReleaseLogUtil.a("Suggestion_DataImpl", "postExerciseBehavior: errorCode= ", Integer.valueOf(i2));
                    uiCallback.onFailure(glb.this.f35464c, i2, str);
                }

                @Override // com.huawei.basefitnessadvice.callback.DataCallback
                public void onSuccess(JSONObject jSONObject) {
                    uiCallback.onSuccess(glb.this.f35464c, null);
                }
            });
        }
    }

    @Override // com.huawei.health.plan.model.data.DataApi
    public void collectBehavior(String str, String str2) {
        LogUtil.a("Suggestion_DataImpl", "collectBehavior workoutId=", str);
        String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011);
        if (TextUtils.isEmpty(accountInfo)) {
            ReleaseLogUtil.a("Suggestion_DataImpl", "collectBehavior(String workoutId): getAccountInfo == null");
        } else {
            btq.e().e("COLLECTION_ADD");
            gmc.g().n().a(accountInfo, str);
        }
    }

    @Override // com.huawei.health.plan.model.data.DataApi
    public void collectBehavior(String str, final UiCallback<String> uiCallback) {
        if (uiCallback == null) {
            ReleaseLogUtil.a("Suggestion_DataImpl", "collectBehavior(), callback == null");
        } else {
            ghw.b().collectBehavior(str, new DataCallback() { // from class: glb.17
                @Override // com.huawei.basefitnessadvice.callback.DataCallback
                public void onFailure(int i, String str2) {
                    ReleaseLogUtil.a("Suggestion_DataImpl", "collectBehavior errorCode=", Integer.valueOf(i));
                    uiCallback.onFailure(glb.this.f35464c, i, str2);
                }

                @Override // com.huawei.basefitnessadvice.callback.DataCallback
                public void onSuccess(JSONObject jSONObject) {
                    uiCallback.onSuccess(glb.this.f35464c, null);
                }
            });
        }
    }

    @Override // com.huawei.health.plan.model.data.DataApi
    public void collectBehavior(String str, int i, final UiCallback<Boolean> uiCallback) {
        ghw.b().collectBehavior(str, i, new DataCallback() { // from class: glb.16
            @Override // com.huawei.basefitnessadvice.callback.DataCallback
            public void onFailure(int i2, String str2) {
                ReleaseLogUtil.a("Suggestion_DataImpl", "collectBehavior errorCode=", Integer.valueOf(i2));
                UiCallback uiCallback2 = uiCallback;
                if (uiCallback2 != null) {
                    uiCallback2.onFailure(glb.this.f35464c, i2, str2);
                }
            }

            @Override // com.huawei.basefitnessadvice.callback.DataCallback
            public void onSuccess(JSONObject jSONObject) {
                LogUtil.a("Suggestion_DataImpl", "collectBehavior success");
                UiCallback uiCallback2 = uiCallback;
                if (uiCallback2 != null) {
                    uiCallback2.onSuccess(glb.this.f35464c, null);
                }
            }
        });
    }

    @Override // com.huawei.health.plan.model.data.DataApi
    public void getCollectBehavior(final String str, final UiCallback<Boolean> uiCallback) {
        getBehaviorList(0, Integer.MAX_VALUE, 2, new UiCallback<List<FitWorkout>>() { // from class: glb.19
            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            public void onFailure(int i, String str2) {
                ReleaseLogUtil.a("Suggestion_DataImpl", "getCollectBehavior errorCode=", Integer.valueOf(i));
                uiCallback.onFailure(glb.this.f35464c, i, str2);
            }

            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public void onSuccess(List<FitWorkout> list) {
                boolean z;
                Iterator<FitWorkout> it = list.iterator();
                while (it.hasNext()) {
                    if (it.next().acquireId().equals(str)) {
                        z = true;
                        uiCallback.onSuccess(glb.this.f35464c, Boolean.valueOf(z));
                    }
                }
                z = false;
                uiCallback.onSuccess(glb.this.f35464c, Boolean.valueOf(z));
            }
        });
    }

    @Override // com.huawei.health.plan.model.data.DataApi
    public void deleteBehavior(String str, int i) {
        LogUtil.a("Suggestion_DataImpl", "deleteBehavior workoutId=", str);
        String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011);
        if (TextUtils.isEmpty(accountInfo)) {
            ReleaseLogUtil.a("Suggestion_DataImpl", "deleteBehavior(String workoutId): getAccountInfo == null");
        } else {
            btq.e().e("COLLECTION_DELETE");
            gmc.g().n().d(accountInfo, i, str);
        }
    }

    @Override // com.huawei.health.plan.model.data.DataApi
    public void deleteBehavior(String str, int i, final UiCallback<String> uiCallback) {
        if (uiCallback == null) {
            ReleaseLogUtil.a("Suggestion_DataImpl", "deleteBehavior(), callback == null");
        } else {
            ghw.b().deleteBehavior(str, i, new DataCallback() { // from class: glb.18
                @Override // com.huawei.basefitnessadvice.callback.DataCallback
                public void onFailure(int i2, String str2) {
                    ReleaseLogUtil.a("Suggestion_DataImpl", "deleteBehavior errorCode=", Integer.valueOf(i2));
                    uiCallback.onFailure(glb.this.f35464c, i2, str2);
                }

                @Override // com.huawei.basefitnessadvice.callback.DataCallback
                public void onSuccess(JSONObject jSONObject) {
                    uiCallback.onSuccess(glb.this.f35464c, null);
                }
            });
        }
    }

    @Override // com.huawei.health.plan.model.data.DataApi
    public void getBehaviorList(int i, int i2, int i3, String str, UiCallback<List<Workout>> uiCallback) {
        if (uiCallback == null) {
            LogUtil.e("Suggestion_DataImpl", "getBehaviorList(), callback == null");
            return;
        }
        if (i2 > 50) {
            LogUtil.e("Suggestion_DataImpl", "getBehaviorList(), pageSize > 50");
            uiCallback.onFailure(this.f35464c, -5, ResultUtil.c(-5));
            return;
        }
        if (TextUtils.isEmpty(LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011))) {
            LogUtil.e("Suggestion_DataImpl", "getBehaviorList(): getAccountInfo()==null");
            uiCallback.onFailure(this.f35464c, 20001, ResultUtil.c(20001));
        } else if (!gnw.c()) {
            uiCallback.onFailure(this.f35464c, -4, ResultUtil.c(-4));
        } else {
            if (!CommonUtil.ab(btx.c())) {
                uiCallback.onFailure(this.f35464c, ResultUtil.ResultCode.NO_NET, ResultUtil.c(ResultUtil.ResultCode.NO_NET));
                return;
            }
            int iMin = Math.min(i2, 50);
            LogUtil.a("Suggestion_DataImpl", "getBehaviorList pageStart = ", Integer.valueOf(i), " ,adjustPageSize = ", Integer.valueOf(iMin), " operationType:", Integer.valueOf(i3), " workoutType:", str);
            d(i, i3, str, iMin, uiCallback);
        }
    }

    private void d(int i, int i2, String str, int i3, final UiCallback<List<Workout>> uiCallback) {
        ghw.b().getBehaviorList(i, i3, i2, str, new DataCallback() { // from class: glb.20
            @Override // com.huawei.basefitnessadvice.callback.DataCallback
            public void onFailure(int i4, String str2) {
                LogUtil.e("Suggestion_DataImpl", "getBehaviorList getWorkouts: errorCode=", Integer.valueOf(i4));
                uiCallback.onFailure(i4, str2);
            }

            @Override // com.huawei.basefitnessadvice.callback.DataCallback
            public void onSuccess(JSONObject jSONObject) {
                if (jSONObject == null) {
                    uiCallback.onFailure(-1, "data == null");
                    return;
                }
                List<Workout> listB = pda.b(jSONObject);
                if (listB == null) {
                    uiCallback.onFailure(-1, "workouts == null");
                } else {
                    LogUtil.d("Suggestion_DataImpl", "getBehaviorList onSuccess :", Integer.valueOf(listB.size()));
                    uiCallback.onSuccess(glb.this.f35464c, listB);
                }
            }
        });
    }

    @Override // com.huawei.health.plan.model.data.DataApi
    public void getActionList(int i, int i2, final int i3, int i4, final UiCallback<List<AtomicAction>> uiCallback) {
        if (uiCallback == null) {
            LogUtil.e("Suggestion_DataImpl", "getActionList(), callback == null");
        } else if (!e() || !CommonUtil.ab(btx.c())) {
            uiCallback.onFailure(this.f35464c, ResultUtil.ResultCode.NO_NET, ResultUtil.c(ResultUtil.ResultCode.NO_NET));
        } else {
            ghw.b().getActionList(i, i2, i3, i4, new DataCallback() { // from class: glb.21
                @Override // com.huawei.basefitnessadvice.callback.DataCallback
                public void onFailure(int i5, String str) {
                    LogUtil.e("Suggestion_DataImpl", "getActionList(): errorCode=", Integer.valueOf(i5));
                    uiCallback.onFailure(glb.this.f35464c, i5, str);
                }

                @Override // com.huawei.basefitnessadvice.callback.DataCallback
                public void onSuccess(JSONObject jSONObject) {
                    if (jSONObject == null) {
                        uiCallback.onSuccess(glb.this.f35464c, null);
                    } else if (i3 == 1) {
                        uiCallback.onSuccess(glb.this.f35464c, gzq.a(jSONObject.optJSONArray("actionList")));
                    } else {
                        uiCallback.onSuccess(glb.this.f35464c, gzq.c(jSONObject.optJSONArray("actionList")));
                    }
                }
            });
        }
    }

    @Override // com.huawei.health.plan.model.data.DataApi
    public void searchActionList(int i, int i2, int i3, String str, final UiCallback<List<AtomicAction>> uiCallback) {
        if (uiCallback == null) {
            LogUtil.e("Suggestion_DataImpl", "searchActionList(), callback == null");
        } else if (!e() || !CommonUtil.ab(btx.c())) {
            uiCallback.onFailure(this.f35464c, ResultUtil.ResultCode.NO_NET, ResultUtil.c(ResultUtil.ResultCode.NO_NET));
        } else {
            ghw.b().searchActionList(i, i2, i3, str, new DataCallback() { // from class: glb.22
                @Override // com.huawei.basefitnessadvice.callback.DataCallback
                public void onFailure(int i4, String str2) {
                    LogUtil.e("Suggestion_DataImpl", "searchActionList(): errorCode=", Integer.valueOf(i4));
                    uiCallback.onFailure(glb.this.f35464c, i4, str2);
                }

                @Override // com.huawei.basefitnessadvice.callback.DataCallback
                public void onSuccess(JSONObject jSONObject) {
                    if (jSONObject == null) {
                        uiCallback.onSuccess(glb.this.f35464c, null);
                    } else {
                        uiCallback.onSuccess(glb.this.f35464c, gzq.c(jSONObject.optJSONArray("actionList")));
                    }
                }
            });
        }
    }

    @Override // com.huawei.health.plan.model.data.DataApi
    public void getFitnessActionInfo(String str, String str2, final UiCallback<AtomicAction> uiCallback) {
        if (uiCallback == null) {
            LogUtil.e("Suggestion_DataImpl", "getFitnessActionInfo(), callback == null");
        } else if (!e() || !CommonUtil.ab(btx.c())) {
            uiCallback.onFailure(this.f35464c, ResultUtil.ResultCode.NO_NET, ResultUtil.c(ResultUtil.ResultCode.NO_NET));
        } else {
            ghw.b().getFitnessActionInfo(str, str2, new DataCallback() { // from class: glb.24
                @Override // com.huawei.basefitnessadvice.callback.DataCallback
                public void onFailure(int i, String str3) {
                    LogUtil.e("Suggestion_DataImpl", "getFitnessActionInfo(): errorCode=", Integer.valueOf(i));
                    uiCallback.onFailure(glb.this.f35464c, i, str3);
                }

                @Override // com.huawei.basefitnessadvice.callback.DataCallback
                public void onSuccess(JSONObject jSONObject) {
                    if (jSONObject == null) {
                        LogUtil.e("Suggestion_DataImpl", "getFitnessActionInfo onSuccess data is null.");
                        uiCallback.onSuccess(glb.this.f35464c, null);
                    } else {
                        uiCallback.onSuccess(glb.this.f35464c, gzq.d(jSONObject.optJSONObject("actionWorkoutInfo")));
                    }
                }
            });
        }
    }

    @Override // com.huawei.health.plan.model.data.DataApi
    public void getBehaviorList(int i, int i2, int i3, final UiCallback<List<FitWorkout>> uiCallback) {
        if (uiCallback == null) {
            ReleaseLogUtil.a("Suggestion_DataImpl", "getBehaviorList(), callback == null");
            return;
        }
        if (TextUtils.isEmpty(LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011))) {
            ReleaseLogUtil.a("Suggestion_DataImpl", "getBehaviorList(): getAccountInfo()==null");
            uiCallback.onFailure(this.f35464c, 20001, ResultUtil.c(20001));
        } else if (!gnw.c()) {
            uiCallback.onFailure(this.f35464c, -4, ResultUtil.c(-4));
        } else if (!CommonUtil.ab(btx.c())) {
            uiCallback.onFailure(this.f35464c, ResultUtil.ResultCode.NO_NET, ResultUtil.c(ResultUtil.ResultCode.NO_NET));
        } else {
            final ArrayList arrayList = new ArrayList(10);
            e(i, i2, i3, arrayList, new DataCallback() { // from class: glb.23
                @Override // com.huawei.basefitnessadvice.callback.DataCallback
                public void onFailure(int i4, String str) {
                    ReleaseLogUtil.a("Suggestion_DataImpl", "getBehaviorListCloud: errorCode= ", Integer.valueOf(i4));
                    uiCallback.onFailure(glb.this.f35464c, i4, str);
                }

                @Override // com.huawei.basefitnessadvice.callback.DataCallback
                public void onSuccess(JSONObject jSONObject) {
                    Collections.reverse(arrayList);
                    uiCallback.onSuccess(glb.this.f35464c, arrayList);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(final int i, final int i2, final int i3, final List<FitWorkout> list, final DataCallback dataCallback) {
        if (dataCallback == null || list == null) {
            ReleaseLogUtil.a("Suggestion_DataImpl", "getBehaviorListCloud(), callback == null || fitWorkouts == null");
            return;
        }
        final int iMin = Math.min(i2, 50);
        LogUtil.d("Suggestion_DataImpl", "getBehaviorListCloud pageStart = ", Integer.valueOf(i), " ,adjustPageSize = ", Integer.valueOf(iMin));
        ghw.b().getBehaviorList(i, iMin, i3, new DataCallback() { // from class: glb.28
            @Override // com.huawei.basefitnessadvice.callback.DataCallback
            public void onFailure(int i4, String str) {
                ReleaseLogUtil.a("Suggestion_DataImpl", "getBehaviorListCloud getWorkouts: errorCode=", Integer.valueOf(i4));
                dataCallback.onFailure(i4, str);
            }

            @Override // com.huawei.basefitnessadvice.callback.DataCallback
            public void onSuccess(JSONObject jSONObject) {
                if (jSONObject == null) {
                    dataCallback.onFailure(-1, "data == null");
                    return;
                }
                List<FitWorkout> listA = pda.a(jSONObject);
                list.addAll(listA);
                int iOptInt = jSONObject.optInt("total", -1);
                LogUtil.d("Suggestion_DataImpl", "getBehaviorListCloud onSuccess :", Integer.valueOf(listA.size()), "TotalSize:", Integer.valueOf(iOptInt));
                int i4 = i;
                int i5 = iMin;
                int i6 = i4 + i5;
                boolean z = i6 >= iOptInt;
                int i7 = i2;
                if (i7 > 50 && !z) {
                    glb.this.e(i6, i7 - i5, i3, (List<FitWorkout>) list, dataCallback);
                } else {
                    dataCallback.onSuccess(jSONObject);
                }
            }
        });
    }

    @Override // com.huawei.health.plan.model.data.DataApi
    public List<WorkoutRecord> getWorkoutRecords(String str) {
        String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011);
        if (TextUtils.isEmpty(accountInfo)) {
            LogUtil.e("Suggestion_DataImpl", "getWorkoutRecords(): getAccountInfo == null");
            return new ArrayList(0);
        }
        return gmv.a(accountInfo, str);
    }

    @Override // com.huawei.health.plan.model.data.DataApi
    public List<WorkoutRecord> getWorkoutRecords(final String str, final UiCallback<List<WorkoutRecord>> uiCallback) {
        if (uiCallback == null) {
            ReleaseLogUtil.a("Suggestion_DataImpl", "getWorkoutRecords(), callback == null");
            return null;
        }
        final String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011);
        if (TextUtils.isEmpty(accountInfo)) {
            ReleaseLogUtil.a("Suggestion_DataImpl", "getWorkoutRecords() getAccountInfo == null");
            uiCallback.onFailure(this.f35464c, 20001, ResultUtil.c(20001));
            return null;
        }
        List<WorkoutRecord> listA = gmv.a(accountInfo, str);
        if (CommonUtil.ca()) {
            uiCallback.onSuccess(this.f35464c, listA);
            return listA;
        }
        if (glw.c().d(str)) {
            if (!glr.e(str) && gmc.g().s().d(accountInfo, str)) {
                uiCallback.onSuccess(this.f35464c, listA);
                return listA;
            }
            e(str, new UiCallback<String>() { // from class: glb.26
                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                public void onFailure(int i, String str2) {
                    ReleaseLogUtil.a("Suggestion_DataImpl", "getWorkoutRecords: errorCode=", Integer.valueOf(i));
                    uiCallback.onFailure(glb.this.f35464c, i, str2);
                }

                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
                public void onSuccess(String str2) {
                    glw.c().b(str);
                    uiCallback.onSuccess(glb.this.f35464c, gmv.a(accountInfo, str));
                }
            });
            return listA;
        }
        uiCallback.onSuccess(this.f35464c, listA);
        return listA;
    }

    @Override // com.huawei.health.plan.model.data.DataApi
    public List<WorkoutRecord> getWorkoutRecords(String str, String str2, String str3) {
        String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011);
        if (TextUtils.isEmpty(accountInfo)) {
            ReleaseLogUtil.a("Suggestion_DataImpl", "getWorkoutRecords() getAccountInfo == null");
            return new ArrayList();
        }
        return gmv.b(accountInfo, str, str2, str3);
    }

    private void e(final String str, final UiCallback<String> uiCallback) {
        if (uiCallback == null) {
            LogUtil.e("Suggestion_DataImpl", "updateWorkoutRecords(), callback == null");
            return;
        }
        final String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011);
        if (TextUtils.isEmpty(accountInfo)) {
            LogUtil.e("Suggestion_DataImpl", "updateWorkoutRecords(): getAccountInfo == null");
            uiCallback.onFailure(this.f35464c, 20001, ResultUtil.c(20001));
        } else {
            ghw.b().getPlanProgress(str, new DataCallback() { // from class: glb.27
                @Override // com.huawei.basefitnessadvice.callback.DataCallback
                public void onFailure(int i, String str2) {
                    ReleaseLogUtil.a("Suggestion_DataImpl", "updateWorkoutRecords() errorCode=", Integer.valueOf(i));
                    uiCallback.onFailure(i, str2);
                }

                @Override // com.huawei.basefitnessadvice.callback.DataCallback
                public void onSuccess(JSONObject jSONObject) throws Throwable {
                    glb.this.d(jSONObject, str, accountInfo, (UiCallback<String>) uiCallback);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(JSONObject jSONObject, String str, String str2, UiCallback<String> uiCallback) throws Throwable {
        if (jSONObject == null) {
            LogUtil.e("Suggestion_DataImpl", "updateWorkoutRecords(), data == null");
        } else {
            int iOptInt = jSONObject.optInt("planType");
            LogUtil.a("Suggestion_DataImpl", "getPlanProgress:", Integer.valueOf(iOptInt));
            if (iOptInt == IntPlan.PlanType.AI_FITNESS_PLAN.getType() || iOptInt == IntPlan.PlanType.AI_RUN_PLAN.getType()) {
                gmw.a(str, str2, gzm.d(str, jSONObject.optJSONArray("progress")));
            } else {
                gmw.b(str2, gzm.d(str, jSONObject.optJSONArray("progress")));
            }
            gmc.g().j().d(str2, str, gly.d(jSONObject.optJSONObject("bestRecords")));
        }
        if (glr.e(str)) {
            Plan currentPlan = gls.b().getCurrentPlan();
            if (currentPlan != null && currentPlan.getPlanCategory() == 1) {
                gmc.g().s().e(str2, gmv.c(str2, str));
            } else {
                gmc.g().s().e(str2, gmv.d(str2, str));
            }
        } else {
            gmc.g().s().a(str2, str);
        }
        uiCallback.onSuccess(null);
    }

    @Override // com.huawei.health.plan.model.data.DataApi
    public boolean updateBestRecord(String str, int i, int i2) {
        String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011);
        if (TextUtils.isEmpty(accountInfo)) {
            LogUtil.e("Suggestion_DataImpl", "updateBestRecord getAccountInfo == null");
            return false;
        }
        if (i2 < 0) {
            LogUtil.j("Suggestion_DataImpl", "updateBestRecord value < 0");
            return false;
        }
        return gmc.g().j().d(accountInfo, str, i, i2);
    }

    @Override // com.huawei.health.plan.model.data.DataApi
    public int getWorkoutCount(String str, String str2) {
        String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011);
        if (TextUtils.isEmpty(accountInfo)) {
            LogUtil.e("Suggestion_DataImpl", "getWorkoutCount() getAccountInfo == null");
            return 0;
        }
        if (gnw.c()) {
            return gmc.g().o().d(accountInfo, str, str2);
        }
        return gmv.a(accountInfo, str, str2);
    }

    @Override // com.huawei.health.plan.model.data.DataApi
    public void getWorkoutCount(final gzl gzlVar, final UiCallback<Integer> uiCallback) {
        if (uiCallback == null) {
            ReleaseLogUtil.a("Suggestion_DataImpl", "getWorkoutCount(), callback == null");
            return;
        }
        UserProfileMgrApi userProfileMgrApiA = a("getWorkoutCount : userProfileMgrApi is null.");
        if (userProfileMgrApiA == null) {
            return;
        }
        final UserInfomation userInfo = userProfileMgrApiA.getUserInfo();
        final String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011);
        if (userInfo == null || TextUtils.isEmpty(accountInfo)) {
            ReleaseLogUtil.a("Suggestion_DataImpl", "getWorkoutCount(): userInfo == null || accountInfo == null");
            uiCallback.onFailure(this.f35464c, 20001, ResultUtil.c(20001));
        } else {
            uiCallback.onSuccess(this.f35464c, Integer.valueOf(getWorkoutCount(gzlVar.g(), gzlVar.i())));
            if (glw.c().b(gzlVar.g(), glr.d(userInfo.getGenderOrDefaultValue()), gzlVar.i())) {
                ghw.b().getWorkoutInfo(gzlVar, new DataCallback() { // from class: glb.29
                    @Override // com.huawei.basefitnessadvice.callback.DataCallback
                    public void onFailure(int i, String str) {
                        ReleaseLogUtil.a("Suggestion_DataImpl", "getWorkoutCount() errorCode=", Integer.valueOf(i));
                    }

                    @Override // com.huawei.basefitnessadvice.callback.DataCallback
                    public void onSuccess(JSONObject jSONObject) throws Throwable {
                        FitWorkout fitWorkoutC = pda.c(btx.b(), jSONObject);
                        if (fitWorkoutC != null) {
                            glw.c().a(gzlVar.g(), glr.d(userInfo.getGenderOrDefaultValue()), gzlVar.i());
                            gmc.g().o().c(accountInfo, fitWorkoutC);
                            uiCallback.onSuccess(glb.this.f35464c, Integer.valueOf(glb.this.getWorkoutCount(gzlVar.g(), gzlVar.i())));
                            return;
                        }
                        uiCallback.onFailure(glb.this.f35464c, 9999, ResultUtil.c(9999));
                    }
                });
            }
        }
    }

    @Override // com.huawei.health.plan.model.data.DataApi
    public int getWorkoutMediaFilesLength(String str, String str2) throws Throwable {
        LoginInit loginInit = LoginInit.getInstance(BaseApplication.getContext());
        if (loginInit.getHuidOrDefault() == null) {
            ReleaseLogUtil.a("Suggestion_DataImpl", "getWorkoutMediaFilesLength accountInfo == null");
            return 0;
        }
        if (CommonUtil.ca()) {
            return 0;
        }
        FitWorkout fitWorkoutB = gmc.g().o().b(loginInit.getHuidOrDefault(), str, str2);
        if (fitWorkoutB != null) {
            xkf.r(fitWorkoutB.getTimbre());
        }
        return glu.e(fitWorkoutB);
    }

    @Override // com.huawei.health.plan.model.data.DataApi
    public boolean isWorkoutMediaFileHasDownloaded(String str, String str2, int i) {
        if (LoginInit.getInstance(BaseApplication.getContext()).getHuidOrDefault() == null) {
            LogUtil.e("Suggestion_DataImpl", "getWorkoutMediaFilesLength accountInfo == null");
            return false;
        }
        int iAcquireWorkoutMediaFileSize = acquireWorkoutMediaFileSize(str, str2, i);
        LogUtil.a("Suggestion_DataImpl", "mediaFilesLength:", Integer.valueOf(iAcquireWorkoutMediaFileSize));
        return iAcquireWorkoutMediaFileSize == 0;
    }

    @Override // com.huawei.health.plan.model.data.DataApi
    public int acquireWorkoutMediaFileSize(String str, String str2, int i) {
        LoginInit loginInit = LoginInit.getInstance(BaseApplication.getContext());
        if (loginInit.getHuidOrDefault() == null) {
            LogUtil.e("Suggestion_DataImpl", "acquireWorkoutMediaFileSize accountInfo == null");
            return 0;
        }
        int iD = glu.d(gmc.g().o().b(loginInit.getHuidOrDefault(), str, str2), i);
        LogUtil.a("Suggestion_DataImpl", "acquireWorkoutMediaFileSize:", Integer.valueOf(iD));
        return iD;
    }

    private String e(gzd gzdVar) {
        return gzdVar.c() == 1 ? "R" : FitWorkout.acquireComeFrom(gzdVar.d());
    }

    @Override // com.huawei.health.plan.model.data.DataApi
    public void downloadWorkoutMediaFiles(final gzd gzdVar, final UiCallback<String> uiCallback) {
        if (uiCallback == null) {
            ReleaseLogUtil.a("Suggestion_DataImpl", "downloadWorkoutMediaFiles(), callback == null");
            return;
        }
        if (!CommonUtil.ab(btx.c())) {
            uiCallback.onFailure(this.f35464c, ResultUtil.ResultCode.NO_NET, ResultUtil.c(ResultUtil.ResultCode.NO_NET));
            return;
        }
        final String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011);
        if (TextUtils.isEmpty(accountInfo)) {
            ReleaseLogUtil.a("Suggestion_DataImpl", "downloadWorkoutMediaFiles(): userid is empty");
            uiCallback.onFailure(this.f35464c, 20001, ResultUtil.c(20001));
        } else {
            xkf.r(gzdVar.b());
            final String strE = e(gzdVar);
            b(0L, strE, gzdVar.b(), new UiCallback<Boolean>() { // from class: glb.30
                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                public void onFailure(int i, String str) throws Throwable {
                    if (glu.d(strE)) {
                        glb.this.d(gzdVar.d(), gzdVar.e(), (UiCallback<String>) uiCallback, accountInfo);
                    } else {
                        uiCallback.onFailure(glb.this.f35464c, i, str);
                    }
                }

                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public void onSuccess(Boolean bool) throws Throwable {
                    glb.this.d(gzdVar.d(), gzdVar.e(), (UiCallback<String>) uiCallback, accountInfo);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String str, String str2, UiCallback<String> uiCallback, String str3) throws Throwable {
        if (uiCallback == null) {
            LogUtil.e("Suggestion_DataImpl", "downloadWorkoutMediaFiles(), callback == null");
            return;
        }
        FitWorkout fitWorkoutB = gmc.g().o().b(str3, str, str2);
        ArrayList arrayList = new ArrayList();
        long jA = glu.a(fitWorkoutB, arrayList, false);
        if (jA > xkf.b() - 100000000) {
            uiCallback.onFailure(this.f35464c, -7, ResultUtil.c(-7));
        } else {
            downloadWorkoutMediaFile(arrayList, jA, uiCallback);
        }
    }

    @Override // com.huawei.health.plan.model.data.DataApi
    public void downloadWorkoutMediaFileByPosition(String str, String str2, UiCallback<String> uiCallback, int i) throws Throwable {
        if (uiCallback == null) {
            ReleaseLogUtil.a("Suggestion_DataImpl", "downloadWorkoutMediaFileByPosition(), callback == null");
            return;
        }
        LoginInit loginInit = LoginInit.getInstance(BaseApplication.getContext());
        if (loginInit.getHuidOrDefault() == null) {
            ReleaseLogUtil.a("Suggestion_DataImpl", "downloadWorkoutMediaFiles(): accountInfo == null");
            uiCallback.onFailure(this.f35464c, 20001, ResultUtil.c(20001));
            return;
        }
        FitWorkout fitWorkoutB = gmc.g().o().b(loginInit.getHuidOrDefault(), str, str2);
        ArrayList arrayList = new ArrayList();
        long jD = glu.d(fitWorkoutB, arrayList, i);
        LogUtil.a("Suggestion_DataImpl", "mediaFileLength:", Long.valueOf(jD));
        if (jD > xkf.b() - 100000000) {
            uiCallback.onFailure(this.f35464c, -7, ResultUtil.c(-7));
        } else {
            downloadWorkoutMediaFile(arrayList, jD, uiCallback);
        }
    }

    @Override // com.huawei.health.plan.model.data.DataApi
    public void downloadWorkoutMediaFile(List<Media> list, long j, UiCallback<String> uiCallback) {
        if (uiCallback == null) {
            ReleaseLogUtil.a("Suggestion_DataImpl", "downloadWorkoutMediaFile(), callback == null");
        } else if (glr.c(list) == null) {
            uiCallback.onSuccess(this.f35464c, null);
        } else {
            new gmb(list, j, uiCallback).d();
        }
    }

    @Override // com.huawei.health.plan.model.data.DataApi
    public void cancelDownloadWorkoutMediaFiles(gzd gzdVar) {
        if (gzdVar == null) {
            LogUtil.e("Suggestion_DataImpl", "cancelDownloadWorkoutMediaFiles() param is null!");
        } else {
            ghw.b().cancelDownloadFile(xkf.h(xkf.f(e(gzdVar))));
        }
    }

    @Override // com.huawei.health.plan.model.data.DataApi
    public void downloadSubtitles(String str, final UiCallback<String> uiCallback) {
        if (!CommonUtil.ab(btx.c())) {
            uiCallback.onFailure(this.f35464c, ResultUtil.ResultCode.NO_NET, ResultUtil.c(ResultUtil.ResultCode.NO_NET));
            return;
        }
        if (TextUtils.isEmpty(LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011))) {
            ReleaseLogUtil.a("Suggestion_DataImpl", "downloadSubtitles(): userid is empty");
            uiCallback.onFailure(this.f35464c, 20001, ResultUtil.c(20001));
            return;
        }
        final String strN = xkf.n(str);
        File file = new File(strN);
        if (file.exists()) {
            LogUtil.a("Suggestion_DataImpl", "downloadSubtitles file delete: ", Boolean.valueOf(file.delete()));
        }
        ghw.b().downloadFile(str, strN, new DataCallback() { // from class: glb.33
            @Override // com.huawei.basefitnessadvice.callback.DataCallback
            public void onFailure(int i, String str2) {
                ReleaseLogUtil.a("Suggestion_DataImpl", "downloadSubtitles onFailure: errorCode=", Integer.valueOf(i));
                uiCallback.onFailure(i, str2);
            }

            @Override // com.huawei.basefitnessadvice.callback.DataCallback
            public void onSuccess(JSONObject jSONObject) {
                LogUtil.a("Suggestion_DataImpl", "downloadSubtitles success");
                uiCallback.onSuccess(strN);
            }
        });
    }

    @Override // com.huawei.health.plan.model.data.DataApi
    public void downloadFile(String str, final String str2, final UiCallback<String> uiCallback, boolean z) {
        if (d(uiCallback) && e(uiCallback)) {
            ghw.b().downloadFile(str, str2, new DataCallback() { // from class: glb.35
                @Override // com.huawei.basefitnessadvice.callback.DataCallback
                public void onFailure(int i, String str3) {
                    ReleaseLogUtil.a("Suggestion_DataImpl", "downloadSubtitles onFailure: errorCode=", Integer.valueOf(i));
                    uiCallback.onFailure(i, str3);
                }

                @Override // com.huawei.basefitnessadvice.callback.DataCallback
                public void onSuccess(JSONObject jSONObject) {
                    LogUtil.a("Suggestion_DataImpl", "downloadSubtitles success");
                    uiCallback.onSuccess(str2);
                }

                @Override // com.huawei.basefitnessadvice.callback.DataCallback
                public void onProgress(long j, long j2, boolean z2) {
                    super.onProgress(j, j2, z2);
                    uiCallback.onProgress(j, j2);
                }
            }, z);
        }
    }

    @Override // com.huawei.health.plan.model.data.DataApi
    public void setExerciseRemind(boolean z, int i) {
        String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011);
        if (TextUtils.isEmpty(accountInfo)) {
            ReleaseLogUtil.a("Suggestion_DataImpl", "setExerciseRemind getAccountInfo == null");
            return;
        }
        if (isOpenRemind() || z) {
            if (isOpenRemind() && z && i == getRemindTime()) {
                return;
            }
            e(z, i);
            Plan currentPlan = getCurrentPlan();
            if (currentPlan != null) {
                gmc.g().n().d(accountInfo, currentPlan.acquireId(), String.valueOf(i));
                HashMap map = new HashMap(3);
                map.put("plan_name", currentPlan.acquireName());
                map.put("type", Integer.valueOf(currentPlan.acquireType()));
                map.put("state", Integer.valueOf(z ? 1 : 0));
                idy.b("1130004", map);
            }
        }
    }

    private void e(boolean z, int i) {
        Plan currentRunPlan;
        if ((isOpenRemind() || z) && (currentRunPlan = getCurrentRunPlan()) != null) {
            LogUtil.a("Suggestion_DataImpl", "isOpenRemind = ", Boolean.valueOf(z), " remindTime = ", Integer.valueOf(i));
            if (z == isOpenRemind() && i == getRemindTime()) {
                return;
            }
            glq.a(currentRunPlan, Boolean.valueOf(z), i);
        }
    }

    private void d() {
        Plan currentRunPlan;
        if (isOpenRemind() && (currentRunPlan = getCurrentRunPlan()) != null) {
            glq.a(currentRunPlan, false, -1);
        }
    }

    @Override // com.huawei.health.plan.model.data.DataApi
    public void postPlanRemind(String str, int i, final UiCallback<String> uiCallback) {
        if (uiCallback == null) {
            ReleaseLogUtil.a("Suggestion_DataImpl", "postPlanRemind(), callback == null");
        } else {
            ghw.b().postPlanRemind(str, i, new DataCallback() { // from class: glb.34
                @Override // com.huawei.basefitnessadvice.callback.DataCallback
                public void onFailure(int i2, String str2) {
                    ReleaseLogUtil.a("Suggestion_DataImpl", "postPlanRemind errorCode=", Integer.valueOf(i2));
                    uiCallback.onFailure(glb.this.f35464c, i2, str2);
                }

                @Override // com.huawei.basefitnessadvice.callback.DataCallback
                public void onSuccess(JSONObject jSONObject) {
                    uiCallback.onSuccess(glb.this.f35464c, null);
                }
            });
        }
    }

    @Override // com.huawei.health.plan.model.data.DataApi
    public void postBestRecord(final String str, final UiCallback<String> uiCallback) throws Throwable {
        if (uiCallback == null) {
            ReleaseLogUtil.a("Suggestion_DataImpl", "postBestRecord(), callback == null");
            return;
        }
        final String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011);
        if (TextUtils.isEmpty(accountInfo)) {
            ReleaseLogUtil.a("Suggestion_DataImpl", "postBestRecord(): getAccountInfo = null");
            uiCallback.onFailure(this.f35464c, 20001, ResultUtil.c(20001));
            return;
        }
        PlanStat planStatE = gmc.g().j().e(accountInfo, str);
        if (planStatE == null) {
            uiCallback.onSuccess(null);
        } else {
            ghw.b().postBestRecord(str, planStatE, new DataCallback() { // from class: glb.32
                @Override // com.huawei.basefitnessadvice.callback.DataCallback
                public void onFailure(int i, String str2) {
                    ReleaseLogUtil.a("Suggestion_DataImpl", "postBestRecord errorCode=", Integer.valueOf(i));
                    uiCallback.onFailure(glb.this.f35464c, i, str2);
                }

                @Override // com.huawei.basefitnessadvice.callback.DataCallback
                public void onSuccess(JSONObject jSONObject) {
                    gmc.g().j().b(accountInfo, str);
                    uiCallback.onSuccess(glb.this.f35464c, null);
                }
            });
        }
    }

    @Override // com.huawei.health.plan.model.data.DataApi
    public void postBestRecordFit(final String str, final UiCallback<String> uiCallback) throws Throwable {
        if (uiCallback == null) {
            ReleaseLogUtil.a("Suggestion_DataImpl", "postBestRecordFit(), callback == null");
            return;
        }
        final String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011);
        if (TextUtils.isEmpty(accountInfo)) {
            ReleaseLogUtil.a("Suggestion_DataImpl", "postBestRecordFit(): getAccountInfo == null");
            uiCallback.onFailure(this.f35464c, 20001, ResultUtil.c(20001));
            return;
        }
        BestRecordFitStat bestRecordFitStatC = gmc.g().m().c(accountInfo, str);
        if (bestRecordFitStatC == null) {
            uiCallback.onSuccess(null);
        } else {
            ghw.b().postTrainBestRecords(bestRecordFitStatC, new DataCallback() { // from class: glb.38
                @Override // com.huawei.basefitnessadvice.callback.DataCallback
                public void onFailure(int i, String str2) {
                    ReleaseLogUtil.a("Suggestion_DataImpl", "postBestRecordFit errorCode=", Integer.valueOf(i));
                    uiCallback.onFailure(glb.this.f35464c, i, str2);
                }

                @Override // com.huawei.basefitnessadvice.callback.DataCallback
                public void onSuccess(JSONObject jSONObject) {
                    gmc.g().m().b(accountInfo, str);
                    uiCallback.onSuccess(glb.this.f35464c, null);
                }
            });
        }
    }

    @Override // com.huawei.health.plan.model.data.DataApi
    public void queryTrainCountByWorkoutId(final String str, final UiCallback<Integer> uiCallback) {
        if (uiCallback == null) {
            ReleaseLogUtil.a("Suggestion_DataImpl", "queryTrainCountByWorkoutId(), callback == null");
            return;
        }
        final String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011);
        if (TextUtils.isEmpty(accountInfo)) {
            ReleaseLogUtil.a("Suggestion_DataImpl", "queryTrainCountByWorkoutId(): getAccountInfo == null");
            uiCallback.onFailure(this.f35464c, 20001, ResultUtil.c(20001));
        } else if (glw.c().a(str)) {
            ghw.b().queryTrainCountByWorkoutId(str, new DataCallback() { // from class: glb.40
                @Override // com.huawei.basefitnessadvice.callback.DataCallback
                public void onFailure(int i, String str2) {
                    ReleaseLogUtil.a("Suggestion_DataImpl", "queryTrainCountByWorkoutId errorCode=", Integer.valueOf(i));
                    uiCallback.onSuccess(glb.this.f35464c, Integer.valueOf(gmc.g().q().a(accountInfo, str)));
                }

                @Override // com.huawei.basefitnessadvice.callback.DataCallback
                public void onSuccess(JSONObject jSONObject) {
                    if (jSONObject == null) {
                        LogUtil.e("Suggestion_DataImpl", "queryTrainCountByWorkoutId(), data == null");
                        uiCallback.onFailure(-1, "data == null");
                    } else {
                        int iOptInt = jSONObject.optInt("count");
                        gmc.g().q().a(accountInfo, str, iOptInt);
                        uiCallback.onSuccess(glb.this.f35464c, Integer.valueOf(iOptInt));
                    }
                }
            });
        } else {
            uiCallback.onSuccess(this.f35464c, Integer.valueOf(gmc.g().q().a(accountInfo, str)));
        }
    }

    @Override // com.huawei.health.plan.model.data.DataApi
    public void postDeleteUserWorkout(List<Workout> list, final UiCallback<String> uiCallback) {
        if (uiCallback == null) {
            ReleaseLogUtil.a("Suggestion_DataImpl", "postDeleteUserWorkout(), callback == null");
        } else if (TextUtils.isEmpty(LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011))) {
            ReleaseLogUtil.a("Suggestion_DataImpl", "postDeleteUserWorkout(): getAccountInfo == null");
            uiCallback.onFailure(this.f35464c, 20001, ResultUtil.c(20001));
        } else {
            ghw.b().postDeleteUserWorkout(list, new DataCallback() { // from class: glb.37
                @Override // com.huawei.basefitnessadvice.callback.DataCallback
                public void onFailure(int i, String str) {
                    ReleaseLogUtil.a("Suggestion_DataImpl", "postPlanRemind errorCode=", Integer.valueOf(i));
                    uiCallback.onFailure(glb.this.f35464c, i, str);
                }

                @Override // com.huawei.basefitnessadvice.callback.DataCallback
                public void onSuccess(JSONObject jSONObject) {
                    uiCallback.onSuccess(glb.this.f35464c, null);
                }
            });
        }
    }

    @Override // com.huawei.health.plan.model.data.DataApi
    public boolean isOpenRemind() {
        return glq.b();
    }

    @Override // com.huawei.health.plan.model.data.DataApi
    public PlanStat getPlanStat(String str) {
        String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011);
        if (TextUtils.isEmpty(accountInfo)) {
            ReleaseLogUtil.a("Suggestion_DataImpl", "getPlanStat getAccountInfo == null");
            return new PlanStat();
        }
        return gmc.g().j().d(accountInfo, str);
    }

    @Override // com.huawei.health.plan.model.data.DataApi
    public int getRemindTime() {
        return glq.c();
    }

    @Override // com.huawei.health.plan.model.data.DataApi
    public void getWorkoutFilters(final List<Integer> list, final UiCallback<String> uiCallback) {
        d(uiCallback);
        ghw.b().getWorkoutFilters(list, new DataCallback() { // from class: glb.39
            @Override // com.huawei.basefitnessadvice.callback.DataCallback
            public void onFailure(int i, String str) {
                LogUtil.e("Suggestion_DataImpl", "getWorkoutFilters errorCode=", Integer.valueOf(i));
                uiCallback.onFailure(glb.this.f35464c, i, str);
            }

            @Override // com.huawei.basefitnessadvice.callback.DataCallback
            public void onSuccess(JSONObject jSONObject) {
                glw.c().c(String.valueOf(list));
                glr.d(jSONObject);
                uiCallback.onSuccess(glb.this.f35464c, jSONObject.toString());
            }
        });
    }

    @Override // com.huawei.health.plan.model.data.DataApi
    public void getAggregatePageByType(int i, final UiCallback<NavigationFilter> uiCallback) {
        if (uiCallback == null) {
            LogUtil.e("Suggestion_DataImpl", "getAggregatePageByType(), callback == null");
        } else if (c(uiCallback) && d(uiCallback)) {
            ghw.b().getAggregatePageByType(i, new DataCallback() { // from class: glb.36
                @Override // com.huawei.basefitnessadvice.callback.DataCallback
                public void onFailure(int i2, String str) {
                    LogUtil.e("Suggestion_DataImpl", "getAggregatePageByType errorCode=", Integer.valueOf(i2));
                    uiCallback.onFailure(i2, str);
                }

                @Override // com.huawei.basefitnessadvice.callback.DataCallback
                public void onSuccess(JSONObject jSONObject) {
                    if (jSONObject == null) {
                        uiCallback.onFailure(-1, "data == null");
                        return;
                    }
                    try {
                        uiCallback.onSuccess((NavigationFilter) new Gson().fromJson(jSONObject.getString("aggregatePage"), NavigationFilter.class));
                    } catch (JsonSyntaxException | JSONException unused) {
                        LogUtil.e("Suggestion_DataImpl", "NavigationFilter Json Exception");
                        uiCallback.onFailure(-1, "NavigationFilter Json Exception");
                    }
                }
            });
        }
    }

    @Override // com.huawei.health.plan.model.data.DataApi
    public DataSync getSyncRecord(long j) {
        String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011);
        if (TextUtils.isEmpty(accountInfo)) {
            ReleaseLogUtil.a("Suggestion_DataImpl", "getSyncRecord getAccountInfo == null");
            return null;
        }
        return gmc.g().n().a(accountInfo, j);
    }

    @Override // com.huawei.health.plan.model.data.DataApi
    public void delSyncRecord(DataSync dataSync) {
        gmc.g().n().b(dataSync);
    }

    @Override // com.huawei.health.plan.model.data.DataApi
    public boolean isBeyondSyncTimes(DataSync dataSync) {
        return LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011) != null && gmc.g().n().a(dataSync);
    }

    @Override // com.huawei.health.plan.model.data.DataApi
    public void syncData() {
        LogUtil.a("Suggestion_DataImpl", "syncData()");
        String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011);
        if (accountInfo != null && gmc.g().n().b(accountInfo) > 0) {
            glr.d();
        }
        LogUtil.a("Suggestion_DataImpl", "syncData() end");
    }

    @Override // com.huawei.health.plan.model.data.DataApi
    public void getFitnessCourseTopicList(int i, final UiCallback<List<Topic>> uiCallback) throws Throwable {
        if (uiCallback == null) {
            ReleaseLogUtil.a("Suggestion_DataImpl", "getFitnessCourseTopicList(), callback == null");
            return;
        }
        LogUtil.a("Suggestion_DataImpl", "getFitnessCourseTopicList pageNum = ", Integer.valueOf(i));
        String huidOrDefault = LoginInit.getInstance(BaseApplication.getContext()).getHuidOrDefault();
        if (huidOrDefault == null) {
            ReleaseLogUtil.a("Suggestion_DataImpl", "huid == null");
            uiCallback.onFailure(this.f35464c, 20001, ResultUtil.c(20001));
        } else if (CommonUtil.ca()) {
            a(i, uiCallback, huidOrDefault);
        } else if (e()) {
            ghw.b().queryTopicList(i, new DataCallback() { // from class: glb.41
                @Override // com.huawei.basefitnessadvice.callback.DataCallback
                public void onFailure(int i2, String str) {
                    ReleaseLogUtil.a("Suggestion_DataImpl", "getFitnessCourseTopicList: errorCode=", Integer.valueOf(i2));
                    uiCallback.onFailure(glb.this.f35464c, i2, str);
                }

                @Override // com.huawei.basefitnessadvice.callback.DataCallback
                public void onSuccess(JSONObject jSONObject) {
                    List<Topic> listC = pda.c(jSONObject);
                    ReleaseLogUtil.d("Suggestion_DataImpl", "topicList num:", Integer.valueOf(listC.size()));
                    uiCallback.onSuccess(glb.this.f35464c, listC);
                }
            });
        } else {
            uiCallback.onFailure(this.f35464c, 20001, ResultUtil.c(20001));
        }
    }

    @Override // com.huawei.health.plan.model.data.DataApi
    public void getFitnessCourseTopicList(int i, int i2, UiCallback<List<Topic>> uiCallback) throws Throwable {
        if (uiCallback == null) {
            ReleaseLogUtil.a("Suggestion_DataImpl", "getFitnessCourseTopicList(), callback == null");
            return;
        }
        LogUtil.d("Suggestion_DataImpl", "getFitnessCourseTopicList pageNum = ", Integer.valueOf(i2));
        LogUtil.a("Suggestion_DataImpl", "getFitnessCourseTopicList courseCategory = ", Integer.valueOf(i));
        String huidOrDefault = LoginInit.getInstance(BaseApplication.getContext()).getHuidOrDefault();
        if (huidOrDefault == null) {
            ReleaseLogUtil.a("Suggestion_DataImpl", "huid == null");
            uiCallback.onFailure(this.f35464c, 20001, ResultUtil.c(20001));
        } else if (CommonUtil.ca()) {
            a(i2, uiCallback, huidOrDefault);
        } else if (e()) {
            c(i, i2, uiCallback, huidOrDefault);
        } else {
            uiCallback.onFailure(this.f35464c, 20001, ResultUtil.c(20001));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(final int i, final int i2, final UiCallback<List<Topic>> uiCallback, final String str) {
        ghw.b().queryTopicList(i, i2, new DataCallback() { // from class: glb.43
            @Override // com.huawei.basefitnessadvice.callback.DataCallback
            public void onFailure(int i3, String str2) {
                ReleaseLogUtil.a("Suggestion_DataImpl", "getFitnessCourseTopicList: errorCode=", Integer.valueOf(i3));
                uiCallback.onFailure(glb.this.f35464c, i3, str2);
            }

            @Override // com.huawei.basefitnessadvice.callback.DataCallback
            public void onSuccess(JSONObject jSONObject) {
                LogUtil.d("Suggestion_DataImpl", "queryTopicList():", jSONObject);
                List<Topic> listC = pda.c(jSONObject);
                ReleaseLogUtil.d("Suggestion_DataImpl", "topicList num:", Integer.valueOf(listC.size()));
                if (njy.e(listC)) {
                    uiCallback.onSuccess(glb.this.f35464c, listC);
                    return;
                }
                ArrayList arrayList = new ArrayList();
                for (Topic topic : listC) {
                    if (topic != null && topic.getCourseCategory() == i) {
                        arrayList.add(topic);
                    }
                }
                if (njy.e(arrayList)) {
                    glb.this.c(i, i2 + 1, (UiCallback<List<Topic>>) uiCallback, str);
                } else {
                    uiCallback.onSuccess(glb.this.f35464c, arrayList);
                }
            }
        });
    }

    private void a(int i, UiCallback<List<Topic>> uiCallback, String str) throws Throwable {
        if (uiCallback == null) {
            LogUtil.e("Suggestion_DataImpl", "getFitnessCourseTopicListForStoreDemoVersion(), callback == null");
            return;
        }
        List<Topic> arrayList = new ArrayList<>();
        if (arrayList.size() == 0) {
            String strE = pee.e(pee.e("suggestion", "recommend_three_course.txt"));
            LogUtil.a("Suggestion_DataImpl", "recommendThreeCourse = ", strE);
            try {
                arrayList = pda.c(new JSONObject(strE));
            } catch (JSONException e2) {
                LogUtil.e("Suggestion_DataImpl", "parse fileUrlJson exception, ", LogAnonymous.b(e2));
            }
            String strE2 = pee.e(pee.e("suggestion", "fitworkouts.txt"));
            LogUtil.a("Suggestion_DataImpl", "workoutStr = ", strE2);
            Iterator it = new ArrayList(peh.c(strE2, FitWorkout[].class)).iterator();
            while (it.hasNext()) {
                gmc.g().o().c(str, (FitWorkout) it.next());
            }
        }
        uiCallback.onSuccess(this.f35464c, arrayList);
    }

    @Override // com.huawei.health.plan.model.data.DataApi
    public void getWorkoutsByTopicId(int i, int i2, final UiCallback<List<FitWorkout>> uiCallback) {
        if (uiCallback == null) {
            ReleaseLogUtil.a("Suggestion_DataImpl", "getWorkoutsByTopicId(), callback == null");
            return;
        }
        LogUtil.d("Suggestion_DataImpl", "getWorkoutsByTopicId pageNum = ", Integer.valueOf(i), " , topicId = ", Integer.valueOf(i2));
        if (LoginInit.getInstance(BaseApplication.getContext()).getHuidOrDefault() == null) {
            ReleaseLogUtil.a("Suggestion_DataImpl", "huid == null");
            uiCallback.onFailure(this.f35464c, 20001, ResultUtil.c(20001));
        } else if (e()) {
            ReleaseLogUtil.d("Suggestion_DataImpl", "getWorkoutsByTopicId from cloud");
            ghw.b().getWorkOutsByTopicId(i, i2, new DataCallback() { // from class: glb.42
                @Override // com.huawei.basefitnessadvice.callback.DataCallback
                public void onFailure(int i3, String str) {
                    ReleaseLogUtil.a("Suggestion_DataImpl", "getWorkoutsByTopicId: errorCode=", Integer.valueOf(i3));
                    uiCallback.onFailure(glb.this.f35464c, i3, str);
                }

                @Override // com.huawei.basefitnessadvice.callback.DataCallback
                public void onSuccess(JSONObject jSONObject) {
                    LogUtil.d("Suggestion_DataImpl", "getWorkoutsByTopicId(): ", jSONObject);
                    List<FitWorkout> listA = pda.a(jSONObject);
                    LogUtil.a("Suggestion_DataImpl", "getWorkoutsByTopicId workouts size:", Integer.valueOf(listA.size()));
                    uiCallback.onSuccess(glb.this.f35464c, listA);
                }
            });
        } else {
            uiCallback.onFailure(this.f35464c, 20001, ResultUtil.c(20001));
        }
    }

    @Override // com.huawei.health.plan.model.data.DataApi
    public void getWorkoutsByType(int i, int i2, int i3, final UiCallback<List<FitWorkout>> uiCallback) {
        if (uiCallback == null) {
            ReleaseLogUtil.a("Suggestion_DataImpl", "getWorkoutsByType(), callback == null");
            return;
        }
        LogUtil.d("Suggestion_DataImpl", "getWorkoutsByType, topicId = ", Integer.valueOf(i), " , workoutType = ", Integer.valueOf(i2));
        if (TextUtils.isEmpty(LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011))) {
            ReleaseLogUtil.a("Suggestion_DataImpl", "getWorkoutsByType： getAccountInfo == null");
            uiCallback.onFailure(this.f35464c, 20001, ResultUtil.c(20001));
        } else if (e()) {
            ghw.b().getWorkoutsByType(i, i2, new DataCallback() { // from class: glb.45
                @Override // com.huawei.basefitnessadvice.callback.DataCallback
                public void onFailure(int i4, String str) {
                    ReleaseLogUtil.a("Suggestion_DataImpl", "getWorkoutsByType: errorCode=", Integer.valueOf(i4));
                    uiCallback.onFailure(glb.this.f35464c, i4, str);
                }

                @Override // com.huawei.basefitnessadvice.callback.DataCallback
                public void onSuccess(JSONObject jSONObject) {
                    uiCallback.onSuccess(glb.this.f35464c, pda.a(jSONObject));
                }
            });
        } else {
            uiCallback.onFailure(this.f35464c, 20001, ResultUtil.c(20001));
        }
    }

    @Override // com.huawei.health.plan.model.data.DataApi
    public void getTrainStatistics(int i, final UiCallback<TrainStatistics> uiCallback) {
        LogUtil.d("Suggestion_DataImpl", "getTrainStatistics type = ", Integer.valueOf(i));
        if (uiCallback == null) {
            ReleaseLogUtil.a("Suggestion_DataImpl", "getTrainStatistics() callback == null");
            return;
        }
        if (CommonUtil.ca()) {
            a(i, uiCallback);
        }
        final String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011);
        if (TextUtils.isEmpty(accountInfo)) {
            ReleaseLogUtil.a("Suggestion_DataImpl", "getOperationPageLocal(): getAccountInfo == null");
            uiCallback.onFailure(20001, ResultUtil.c(20001));
        } else {
            ghw.b().queryTrainStatistics(i, new DataCallback() { // from class: glb.47
                @Override // com.huawei.basefitnessadvice.callback.DataCallback
                public void onFailure(int i2, String str) {
                    JSONObject jSONObjectPut;
                    try {
                        jSONObjectPut = new JSONObject().put("userTrainStatisticsBean", new JSONObject(buh.e("trainStatistics_" + accountInfo)));
                    } catch (JSONException e2) {
                        LogUtil.e("Suggestion_DataImpl", LogAnonymous.b(e2));
                        jSONObjectPut = null;
                    }
                    uiCallback.onSuccess(glb.this.f35464c, gzq.f(jSONObjectPut));
                }

                @Override // com.huawei.basefitnessadvice.callback.DataCallback
                public void onSuccess(JSONObject jSONObject) {
                    glb.this.c(jSONObject, accountInfo, (UiCallback<TrainStatistics>) uiCallback);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(JSONObject jSONObject, String str, UiCallback<TrainStatistics> uiCallback) {
        if (uiCallback == null || TextUtils.isEmpty(str)) {
            LogUtil.e("Suggestion_DataImpl", "doGetTrainStatistics() callback == null || accountInfo == null");
            return;
        }
        TrainStatistics trainStatisticsF = gzq.f(jSONObject);
        TrainStatistics trainStatisticsD = gzq.d(buh.e("trainStatistics_" + str));
        if (trainStatisticsD.acquireDuration() > trainStatisticsF.acquireDuration()) {
            trainStatisticsF.saveDuration(trainStatisticsD.acquireDuration());
        }
        if (trainStatisticsD.acquireCalorie() > trainStatisticsF.acquireCalorie()) {
            trainStatisticsF.saveCalorie(trainStatisticsD.acquireCalorie());
        }
        if (trainStatisticsD.acquireTotalTimes() > trainStatisticsF.acquireTotalTimes()) {
            trainStatisticsF.saveTotalTimes(trainStatisticsD.acquireTotalTimes());
        }
        buh.d("trainStatistics_" + str, gzq.c(trainStatisticsF));
        uiCallback.onSuccess(this.f35464c, trainStatisticsF);
    }

    @Override // com.huawei.health.plan.model.data.DataApi
    public void getPlanStatistics(final int i, final UiCallback<PlanStatistics> uiCallback) {
        LogUtil.a("Suggestion_DataImpl", "getPlanStatistics type = ", Integer.valueOf(i));
        if (uiCallback == null) {
            ReleaseLogUtil.a("Suggestion_DataImpl", "getPlanStatistics() callback == null");
            return;
        }
        final String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011);
        if (TextUtils.isEmpty(accountInfo)) {
            ReleaseLogUtil.a("Suggestion_DataImpl", "getOperationPageLocal(): getAccountInfo == null");
            uiCallback.onFailure(20001, ResultUtil.c(20001));
        } else {
            if (!gnw.c()) {
                ReleaseLogUtil.a("Suggestion_DataImpl", "getPlanStatistics is oversea");
                if (CommonUtil.ca()) {
                    uiCallback.onSuccess(this.f35464c, d(accountInfo, i));
                    return;
                } else {
                    uiCallback.onFailure(99, "this version is oversea version");
                    return;
                }
            }
            ghw.b().queryPlanStatistics(i, new DataCallback() { // from class: glb.46
                @Override // com.huawei.basefitnessadvice.callback.DataCallback
                public void onFailure(int i2, String str) {
                    ReleaseLogUtil.a("Suggestion_DataImpl", "queryPlanStatistics fail errorCode = ", Integer.valueOf(i2));
                    uiCallback.onSuccess(glb.this.f35464c, glb.this.d(accountInfo, i));
                }

                @Override // com.huawei.basefitnessadvice.callback.DataCallback
                public void onSuccess(JSONObject jSONObject) {
                    LogUtil.a("Suggestion_DataImpl", "queryPlanStatistics success");
                    uiCallback.onSuccess(glb.this.f35464c, glb.this.c(jSONObject, accountInfo, i));
                }
            });
        }
    }

    public void a(int i, final UiCallback<TrainStatistics> uiCallback) {
        if (uiCallback == null) {
            ReleaseLogUtil.a("Suggestion_DataImpl", "getTrainStatisticsLocalForStoreDemo() callback == null");
        } else if (TextUtils.isEmpty(LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011))) {
            ReleaseLogUtil.a("Suggestion_DataImpl", "getTrainStatisticsLocalForStoreDemo getAccountInfo is null");
            uiCallback.onFailure(20001, ResultUtil.c(20001));
        } else {
            FitnessHistoryModel.getInstance().acquireDetailFitnessRecord(new ntx.d().b(0L).d(System.currentTimeMillis()).a(), new IBaseResponseCallback() { // from class: glj
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i2, Object obj) {
                    this.f35624c.b(uiCallback, i2, obj);
                }
            });
        }
    }

    /* synthetic */ void b(UiCallback uiCallback, int i, Object obj) {
        List<WorkoutRecord> list = njy.b(obj, WorkoutRecord.class) ? (List) obj : null;
        TrainStatistics trainStatistics = new TrainStatistics();
        if (njy.e(list)) {
            LogUtil.a("Suggestion_DataImpl", "fitnessHistory is null");
        } else {
            long j = 0;
            long jE = 0;
            long duration = 0;
            for (WorkoutRecord workoutRecord : list) {
                if (workoutRecord != null) {
                    jE += (long) ifp.e((Object) ped.f(ped.b(workoutRecord.acquireActualCalorie())));
                    duration += (long) workoutRecord.getDuration();
                    j++;
                }
            }
            trainStatistics.saveTotalTimes(j);
            trainStatistics.saveCalorie(jE);
            trainStatistics.saveDuration(duration);
        }
        uiCallback.onSuccess(this.f35464c, trainStatistics);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public PlanStatistics d(String str, int i) {
        JSONObject jSONObject;
        String strC = c(str, 0);
        String strC2 = c(str, 1);
        JSONObject jSONObject2 = null;
        try {
            jSONObject = new JSONObject(strC);
            try {
                jSONObject2 = new JSONObject(strC2);
            } catch (JSONException e2) {
                e = e2;
                LogUtil.e("Suggestion_DataImpl", LogAnonymous.b(e));
            }
        } catch (JSONException e3) {
            e = e3;
            jSONObject = null;
        }
        PlanStatistics planStatisticsA = gzq.a(jSONObject);
        PlanStatistics planStatisticsA2 = gzq.a(jSONObject2);
        PlanStatistics planStatistics = new PlanStatistics();
        if (i == 4) {
            planStatistics.saveDuration(planStatisticsA.acquireDuration() + planStatisticsA2.acquireDuration());
            planStatistics.saveCalorie(planStatisticsA.acquireCalorie() + planStatisticsA2.acquireCalorie());
            planStatistics.saveTotalPlan(planStatisticsA.acquireTotalPlan() + planStatisticsA2.acquireTotalPlan());
        } else {
            if (i == 2) {
                return planStatisticsA;
            }
            if (i == 3) {
                return planStatisticsA2;
            }
        }
        return planStatistics;
    }

    private String c(String str, int i) {
        return buh.e("planStatistics_" + str + "_type_" + i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public PlanStatistics c(JSONObject jSONObject, String str, int i) {
        PlanStatistics planStatistics = new PlanStatistics();
        if (jSONObject == null) {
            return planStatistics;
        }
        double totalDistance = 0.0d;
        int iAcquireTotalPlan = 0;
        long jAcquireDuration = 0;
        long jAcquireCalorie = 0;
        for (PlanStatistics planStatistics2 : gzq.e(jSONObject)) {
            if (planStatistics2 == null) {
                LogUtil.j("Suggestion_DataImpl", "planStat == null");
            } else {
                if (i == 4) {
                    jAcquireCalorie += planStatistics2.acquireCalorie();
                    jAcquireDuration += planStatistics2.acquireDuration();
                    totalDistance += planStatistics2.getTotalDistance();
                    iAcquireTotalPlan += planStatistics2.acquireTotalPlan();
                } else {
                    if (i == 2 && planStatistics2.acquireType() == 0) {
                        long jAcquireCalorie2 = planStatistics2.acquireCalorie();
                        long jAcquireDuration2 = planStatistics2.acquireDuration();
                        double totalDistance2 = planStatistics2.getTotalDistance();
                        iAcquireTotalPlan = planStatistics2.acquireTotalPlan();
                        totalDistance = totalDistance2;
                        jAcquireCalorie = jAcquireCalorie2;
                        jAcquireDuration = jAcquireDuration2;
                    } else if (i == 3 && planStatistics2.acquireType() == 1) {
                        long jAcquireCalorie3 = planStatistics2.acquireCalorie();
                        long jAcquireDuration3 = planStatistics2.acquireDuration();
                        iAcquireTotalPlan = planStatistics2.acquireTotalPlan();
                        jAcquireDuration = jAcquireDuration3;
                        jAcquireCalorie = jAcquireCalorie3;
                    }
                    a(str, planStatistics2, i);
                }
                a(str, planStatistics2, i);
            }
        }
        planStatistics.saveDuration(jAcquireDuration);
        planStatistics.saveCalorie(jAcquireCalorie);
        planStatistics.saveTotalPlan(iAcquireTotalPlan);
        planStatistics.setTotalDistance(totalDistance);
        LogUtil.a("Suggestion_DataImpl", "totalDuration = ", Long.valueOf(jAcquireDuration), " totalCalorie = ", Long.valueOf(jAcquireCalorie), " totalPlan = ", Integer.valueOf(iAcquireTotalPlan));
        return planStatistics;
    }

    private void a(String str, PlanStatistics planStatistics, int i) {
        buh.d("planStatistics_" + str + "_type_" + planStatistics.acquireType(), gzq.a(planStatistics));
    }

    @Override // com.huawei.health.plan.model.data.DataApi
    public void savetrainstatis(WorkoutRecord workoutRecord) {
        String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011);
        if (TextUtils.isEmpty(accountInfo) || workoutRecord == null) {
            ReleaseLogUtil.a("Suggestion_DataImpl", "savetrainstatis(): getAccountInfo == null");
            return;
        }
        if (TextUtils.isEmpty(workoutRecord.acquireWorkoutId()) || TextUtils.isEmpty(workoutRecord.acquireWorkoutName())) {
            LogUtil.j("Suggestion_DataImpl", "savetrainstatis, record.acquireWorkoutId = ", workoutRecord.acquireWorkoutId(), ", record.acquireWorkoutName = ", workoutRecord.acquireWorkoutName());
            return;
        }
        TrainStatistics trainStatisticsD = gzq.d(buh.e("trainStatistics_" + accountInfo));
        trainStatisticsD.saveDuration(trainStatisticsD.acquireDuration() + ((long) workoutRecord.getDuration()));
        trainStatisticsD.saveTotalTimes(trainStatisticsD.acquireTotalTimes() + 1);
        trainStatisticsD.saveCalorie(trainStatisticsD.acquireCalorie() + ((long) workoutRecord.acquireActualCalorie()));
        buh.d("trainStatistics_" + accountInfo, gzq.c(trainStatisticsD));
    }

    @Override // com.huawei.health.plan.model.data.DataApi
    public List<Map<String, Object>> getRecordsByDateRange(Date date, Date date2) {
        String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011);
        if (TextUtils.isEmpty(accountInfo)) {
            return null;
        }
        int iB = ieg.b(date);
        int iB2 = ieg.b(date2);
        LogUtil.a("Suggestion_DataImpl", "getRecordsByDateRange", Integer.valueOf(iB), Integer.valueOf(iB2));
        return gmc.g().k().d(accountInfo, iB, iB2);
    }

    @Override // com.huawei.health.plan.model.data.DataApi
    public void insertCalorieData(Context context, WorkoutRecord workoutRecord) {
        if (workoutRecord == null || context == null) {
            ReleaseLogUtil.a("Suggestion_DataImpl", "insertCalorieData(), record == null");
            return;
        }
        HiHealthData hiHealthData = new HiHealthData(40054);
        hiHealthData.setDeviceUuid(FoundationCommonUtil.getAndroidId(context));
        hiHealthData.setEndTime(workoutRecord.acquireExerciseTime());
        hiHealthData.setStartTime(workoutRecord.acquireExerciseTime());
        float activeCalorie = workoutRecord.getActiveCalorie();
        float fAcquireActualCalorie = workoutRecord.acquireActualCalorie();
        if (activeCalorie <= 0.0f || activeCalorie >= fAcquireActualCalorie) {
            activeCalorie = fAcquireActualCalorie;
        }
        hiHealthData.setValue(activeCalorie);
        HiDataInsertOption hiDataInsertOption = new HiDataInsertOption();
        hiDataInsertOption.addData(hiHealthData);
        HiHealthManager.d(context).insertHiHealthData(hiDataInsertOption, new HiDataOperateListener() { // from class: glb.49
            @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
            public void onResult(int i, Object obj) {
                LogUtil.a("Suggestion_DataImpl", "insertCalorieDate errorCode:", Integer.valueOf(i));
            }
        });
    }

    @Override // com.huawei.health.plan.model.data.DataApi
    public void insertCaloriePoints(Context context, Map<Long, HiHealthData> map) {
        if (map == null || map.isEmpty()) {
            LogUtil.e("Suggestion_DataImpl", "points are empty");
            return;
        }
        HiDataInsertOption hiDataInsertOption = new HiDataInsertOption();
        for (Map.Entry<Long, HiHealthData> entry : map.entrySet()) {
            if (entry != null && entry.getValue() != null) {
                HiHealthData value = entry.getValue();
                HiHealthData hiHealthData = new HiHealthData(20010);
                hiHealthData.setStartTime(value.getStartTime());
                hiHealthData.setEndTime(value.getEndTime());
                hiHealthData.setValue(0);
                hiHealthData.setDeviceUuid(value.getDeviceUuid());
                hiDataInsertOption.addData(value);
                hiDataInsertOption.addData(hiHealthData);
            }
        }
        HiHealthManager.d(context).insertHiHealthData(hiDataInsertOption, new HiDataOperateListener() { // from class: glb.50
            @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
            public void onResult(int i, Object obj) {
                LogUtil.a("Suggestion_DataImpl", "insertCalorieData errorCode:", Integer.valueOf(i));
                if (i == 0) {
                    HiHealthNativeApi.a(BaseApplication.getContext()).synCloud(glb.this.b(), null);
                    LogUtil.a("Suggestion_DataImpl", "save fitness calorie point success syncCloud begin...");
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public HiSyncOption b() {
        HiSyncOption hiSyncOption = new HiSyncOption();
        hiSyncOption.setSyncModel(2);
        hiSyncOption.setSyncAction(0);
        hiSyncOption.setSyncDataType(20000);
        hiSyncOption.setSyncMethod(2);
        return hiSyncOption;
    }

    @Override // com.huawei.health.plan.model.data.DataApi
    public void insertFitnessIntensityData(Context context, List<Long> list) {
        if (this.e == -1) {
            this.e = SportIntensityUtil.b().i();
        }
        if (list == null || list.size() < this.e || context == null) {
            return;
        }
        StringBuilder sb = new StringBuilder(10);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm''ss\"");
        for (Long l : list) {
            String str = simpleDateFormat.format(l);
            sb.append("-time:");
            sb.append(l);
            sb.append("-formatTime:");
            sb.append(str);
        }
        LogUtil.a("Suggestion_DataImpl", "insertFitnessIntensityData:", sb);
        String androidId = FoundationCommonUtil.getAndroidId(context);
        ArrayList arrayList = new ArrayList(list.size());
        for (Long l2 : list) {
            HiHealthData hiHealthData = new HiHealthData();
            hiHealthData.setDeviceUuid(androidId);
            hiHealthData.setTimeInterval(l2.longValue(), l2.longValue() + 60000);
            hiHealthData.setType(7);
            hiHealthData.setValue(4);
            arrayList.add(hiHealthData);
        }
        HiDataInsertOption hiDataInsertOption = new HiDataInsertOption();
        hiDataInsertOption.setDatas(arrayList);
        HiHealthNativeApi.a(context).insertHiHealthData(hiDataInsertOption, new HiDataOperateListener() { // from class: glb.48
            @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
            public void onResult(int i, Object obj) {
                LogUtil.a("Suggestion_DataImpl", "insertFitnessIntensityData, onResult(), errorCode = ", Integer.valueOf(i), " obj = ", obj);
            }
        });
    }

    private void b(long j, String str, String str2, UiCallback<Boolean> uiCallback) {
        if (uiCallback == null) {
            LogUtil.e("Suggestion_DataImpl", "downloadFitnessAudioXml(), callback == null");
        } else {
            ghw.b().getMultiLanguage(j, str2, new e(str, uiCallback));
        }
    }

    class e extends DataCallback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f35614b;
        private final UiCallback<Boolean> e;

        e(String str, UiCallback<Boolean> uiCallback) {
            this.f35614b = str;
            this.e = uiCallback;
        }

        @Override // com.huawei.basefitnessadvice.callback.DataCallback
        public void onFailure(int i, String str) {
            ReleaseLogUtil.a("Suggestion_DataImpl", "downloadFitnessAudioXml onFailure: errorCode=", Integer.valueOf(i));
            String strH = xkf.h(xkf.f(this.f35614b));
            if (strH != null) {
                glb.this.e(strH, this.f35614b, this.e);
            } else {
                this.e.onFailure(i, str);
            }
        }

        @Override // com.huawei.basefitnessadvice.callback.DataCallback
        public void onSuccess(JSONObject jSONObject) {
            LogUtil.d("Suggestion_DataImpl", "downloadFitnessAudioXml onSuccess data = ", jSONObject);
            List<LangFile> listC = gzq.c(jSONObject);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            long j = 0;
            boolean z = false;
            for (LangFile langFile : listC) {
                long jAcquireVersion = langFile.acquireVersion();
                if (j < jAcquireVersion) {
                    j = jAcquireVersion;
                }
                String strAcquireLangName = langFile.acquireLangName();
                if (langFile.acquireLangUrl() != null && strAcquireLangName != null) {
                    if (strAcquireLangName.startsWith("BPF001_EN")) {
                        arrayList.add(langFile);
                    }
                    if (strAcquireLangName.startsWith("BPF001_CN")) {
                        arrayList2.add(langFile);
                    }
                    String strC = xkf.c();
                    if (strAcquireLangName.startsWith(strC)) {
                        ReleaseLogUtil.d("Suggestion_DataImpl", "downloadFitnessAudioXml acquireLangName:", strAcquireLangName, "acquireLocaleAudioTag:", strC);
                        xkf.q(strC);
                        glb.this.d(langFile);
                        z = true;
                    }
                }
            }
            if (Utils.o()) {
                glb.this.d(arrayList, z);
            } else {
                glb.this.e(arrayList2, z);
            }
            if (j > xkf.k(xkf.d())) {
                xkf.a(xkf.d(), j);
            }
            String str = this.f35614b;
            ReleaseLogUtil.d("Suggestion_DataImpl", "come from = ", str, " getFileNameXml = ", xkf.f(str));
            String strH = xkf.h(xkf.f(this.f35614b));
            LogUtil.a("Suggestion_DataImpl", "multiLanguageUrl = ", strH);
            glb.this.e(strH, this.f35614b, this.e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(List<LangFile> list, boolean z) {
        if (z) {
            return;
        }
        ReleaseLogUtil.d("Suggestion_DataImpl", "downloadFitnessAudioXml isMatchLang false");
        xkf.q("BPF001_EN");
        for (LangFile langFile : list) {
            if (langFile != null) {
                d(langFile);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(List<LangFile> list, boolean z) {
        if (z) {
            return;
        }
        ReleaseLogUtil.d("Suggestion_DataImpl", "downloadFitnessAudioXml isMatchChineseLang false");
        xkf.q("BPF001_CN");
        for (LangFile langFile : list) {
            if (langFile != null) {
                d(langFile);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(LangFile langFile) {
        xkf.d(langFile.acquireLangName(), langFile.getTimbre(), langFile.acquireLangUrl());
        xkf.c(langFile.acquireLangUrl(), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(final String str, String str2, final UiCallback<Boolean> uiCallback) {
        if (uiCallback == null) {
            LogUtil.e("Suggestion_DataImpl", "downloadFitnessAudioXml(), callback == null");
            return;
        }
        if (str != null) {
            if (xkf.j(str)) {
                String strI = xkf.i(str2);
                File file = new File(strI);
                if (file.exists()) {
                    LogUtil.a("Suggestion_DataImpl", "downloadFitnessAudioXml file delete: ", Boolean.valueOf(file.delete()));
                }
                ghw.b().downloadFile(str, strI, new DataCallback() { // from class: glb.55
                    @Override // com.huawei.basefitnessadvice.callback.DataCallback
                    public void onFailure(int i, String str3) {
                        ReleaseLogUtil.a("Suggestion_DataImpl", "downloadFitnessAudioXml downloadFile onFailure: errorCode=", Integer.valueOf(i));
                        uiCallback.onFailure(i, str3);
                    }

                    @Override // com.huawei.basefitnessadvice.callback.DataCallback
                    public void onSuccess(JSONObject jSONObject) {
                        LogUtil.a("Suggestion_DataImpl", "downloadFitnessAudioXml downloadFile success");
                        xkf.c(str, false);
                        uiCallback.onSuccess(true);
                    }
                });
                return;
            }
            uiCallback.onSuccess(true);
            return;
        }
        uiCallback.onSuccess(true);
    }

    @Override // com.huawei.health.plan.model.data.DataApi
    public long getUseCacheSize() {
        return xkf.j();
    }

    @Override // com.huawei.health.plan.model.data.DataApi
    public void delUseCache(final UiCallback<Boolean> uiCallback) {
        LocalBroadcastManager.getInstance().registerReceiver(new BroadcastReceiver() { // from class: glb.54
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                if (context == null) {
                    UiCallback uiCallback2 = uiCallback;
                    if (uiCallback2 != null) {
                        uiCallback2.onFailure(glb.this.f35464c, -1, "context == null");
                    }
                    btx.c();
                }
                LogUtil.j("Suggestion_DataImpl", "delUseCache onReceive Action");
                LocalBroadcastManager.getInstance().unregisterReceiver(this);
                UiCallback uiCallback3 = uiCallback;
                if (uiCallback3 != null) {
                    uiCallback3.onSuccess(glb.this.f35464c, true);
                }
            }
        }, new IntentFilter("com.huawei.health.suggestion.config.MoveService.DEL_ACTION"));
        MoveService.a(btx.c(), 2);
    }

    private boolean c(String str) {
        PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
        if (planApi != null) {
            LogUtil.e("Suggestion_DataImpl", "switchToRunPlanReport, getPlanProgress : planApi is null.");
            planApi.setPlanType(0);
            Plan plan = planApi.getjoinedPlanById(str);
            if (plan != null && plan.getPlanCategory() == 0 && Utils.o()) {
                return true;
            }
        }
        return false;
    }

    private boolean e() {
        return Utils.h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String d(String str, String str2) {
        return str + "_" + str2;
    }

    @Override // com.huawei.health.plan.model.data.DataApi
    public void getActions(final List<String> list, final UiCallback<List<TrainAction>> uiCallback) {
        LogUtil.a("Suggestion_DataImpl", "getActions actionIds = ", list);
        if (uiCallback == null) {
            ReleaseLogUtil.a("Suggestion_DataImpl", "getActions(), callback == null");
            return;
        }
        UserProfileMgrApi userProfileMgrApiA = a("getActions : userProfileMgrApi is null.");
        if (userProfileMgrApiA == null) {
            return;
        }
        userProfileMgrApiA.getUserInfo(new BaseResponseCallback() { // from class: glf
            @Override // com.huawei.health.userprofilemgr.model.BaseResponseCallback
            public final void onResponse(int i, Object obj) {
                this.f35619b.c(uiCallback, list, i, (UserInfomation) obj);
            }
        });
    }

    /* synthetic */ void c(UiCallback uiCallback, List list, int i, UserInfomation userInfomation) {
        if (userInfomation == null) {
            LogUtil.j("Suggestion_DataImpl", "requestDailyData getUserInfo failed");
            uiCallback.onFailure(this.f35464c, 20001, ResultUtil.c(20001));
            return;
        }
        String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011);
        if (TextUtils.isEmpty(accountInfo)) {
            ReleaseLogUtil.a("Suggestion_DataImpl", "getActions(): userInfo == null ||TextUtils.isEmpty(userId)");
            uiCallback.onFailure(this.f35464c, 20001, ResultUtil.c(20001));
        } else {
            int gender = userInfomation.getGender() == 0 ? userInfomation.getGender() : 1;
            if (ied.c()) {
                gender = 0;
            }
            b((List<String>) list, (UiCallback<List<TrainAction>>) uiCallback, accountInfo, gender);
        }
    }

    private void b(List<String> list, final UiCallback<List<TrainAction>> uiCallback, final String str, int i) {
        if (!e() || !CommonUtil.ab(btx.c())) {
            uiCallback.onFailure(this.f35464c, ResultUtil.ResultCode.NO_NET, ResultUtil.c(ResultUtil.ResultCode.NO_NET));
        } else {
            ghw.b().getTrainActions(list, i, new DataCallback() { // from class: glb.53
                @Override // com.huawei.basefitnessadvice.callback.DataCallback
                public void onFailure(int i2, String str2) {
                    ReleaseLogUtil.a("Suggestion_DataImpl", "getTrainActions(): errorCode=", Integer.valueOf(i2));
                    uiCallback.onFailure(glb.this.f35464c, i2, str2);
                }

                @Override // com.huawei.basefitnessadvice.callback.DataCallback
                public void onSuccess(JSONObject jSONObject) {
                    if (jSONObject == null) {
                        LogUtil.e("Suggestion_DataImpl", "getTrainActions onSuccess data is null.");
                        uiCallback.onSuccess(glb.this.f35464c, null);
                    } else {
                        LogUtil.j("Suggestion_DataImpl", "getTrainActions onSuccess");
                        uiCallback.onSuccess(glb.this.f35464c, gzq.d(str, jSONObject.optJSONArray("actionInfoList")));
                    }
                }
            });
        }
    }

    @Override // com.huawei.health.plan.model.data.DataApi
    public void deleteAllPlanRecords() {
        gmc.g().s().d();
        String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011);
        if (TextUtils.isEmpty(accountInfo)) {
            ReleaseLogUtil.e("Suggestion_DataImpl", "deleteAllPlanRecords getAccountInfo is null.");
            return;
        }
        buh.c("planStatistics_" + accountInfo + "_type_0");
        this.f35463a.remove(d("plan", accountInfo));
    }

    @Override // com.huawei.health.plan.model.data.DataApi
    public void getWorkoutList(int i, int i2, int i3, int i4, final UiCallback<List<FitWorkout>> uiCallback) {
        if (uiCallback == null) {
            LogUtil.e("Suggestion_DataImpl", "getWorkoutList(), callback == null");
        } else if (!e()) {
            uiCallback.onFailure(this.f35464c, -4, ResultUtil.c(-4));
        } else {
            final ArrayList arrayList = new ArrayList(10);
            ghw.b().getWorkoutList(i, i2, i3, i4, new DataCallback() { // from class: glb.51
                @Override // com.huawei.basefitnessadvice.callback.DataCallback
                public void onFailure(int i5, String str) {
                    LogUtil.e("Suggestion_DataImpl", "getWorkoutList errorCode=", Integer.valueOf(i5));
                    uiCallback.onFailure(i5, str);
                }

                @Override // com.huawei.basefitnessadvice.callback.DataCallback
                public void onSuccess(JSONObject jSONObject) {
                    if (jSONObject == null) {
                        uiCallback.onFailure(-1, "data == null");
                        return;
                    }
                    List<FitWorkout> listA = pda.a(jSONObject);
                    if (njy.e(listA)) {
                        uiCallback.onFailure(-1, "workouts == null");
                        return;
                    }
                    LogUtil.a("Suggestion_DataImpl", "getWorkoutList From Cloud :", Integer.valueOf(listA.size()));
                    arrayList.clear();
                    arrayList.addAll(listA);
                    uiCallback.onSuccess(glb.this.f35464c, arrayList);
                }
            });
        }
    }

    @Override // com.huawei.health.plan.model.data.DataApi
    public void getWorkoutRecommendList(final UiCallback<List<FitWorkout>> uiCallback) {
        if (uiCallback == null) {
            LogUtil.e("Suggestion_DataImpl", "getWorkoutRecommendList(), callback == null");
            return;
        }
        final ArrayList arrayList = new ArrayList();
        List<FitWorkout> listE = gmr.e();
        if (listE != null && listE.size() > 0) {
            uiCallback.onSuccess(listE);
            return;
        }
        String strA = gmr.a();
        if (CommonUtil.ab(btx.c())) {
            ghw.b().getFitnessWorkoutRecommendList(strA, new DataCallback() { // from class: glb.52
                @Override // com.huawei.basefitnessadvice.callback.DataCallback
                public void onFailure(int i, String str) {
                    LogUtil.e("Suggestion_DataImpl", "getFitnessWorkoutRecommendList errorCode=", Integer.valueOf(i));
                    uiCallback.onFailure(i, str);
                }

                @Override // com.huawei.basefitnessadvice.callback.DataCallback
                public void onSuccess(JSONObject jSONObject) {
                    if (jSONObject == null) {
                        LogUtil.e("Suggestion_DataImpl", "recommend data is null");
                        uiCallback.onFailure(-1, "Recommend data == null");
                    }
                    List<FitWorkout> listA = pda.a(jSONObject);
                    if (njy.e(listA)) {
                        LogUtil.e("Suggestion_DataImpl", "parse recommend data is null");
                        uiCallback.onFailure(-1, "RecommendWorkouts == null");
                    }
                    gmr.e(listA);
                    arrayList.addAll(listA);
                    uiCallback.onSuccess(arrayList);
                }
            });
        } else {
            uiCallback.onSuccess(listE);
        }
    }

    @Override // com.huawei.health.plan.model.data.DataApi
    public void getRecWorkoutByCourseTypeList(final int i, final UiCallback<List<FitWorkout>> uiCallback) {
        if (uiCallback == null) {
            LogUtil.e("Suggestion_DataImpl", "getWorkoutRecommendList(), callback == null");
            return;
        }
        if (CommonUtil.ca()) {
            uiCallback.onSuccess(a());
            return;
        }
        final ArrayList arrayList = new ArrayList();
        List<FitWorkout> listE = gmr.e(i);
        if (listE != null && listE.size() > 0) {
            uiCallback.onSuccess(listE);
        } else if (CommonUtil.ab(btx.c())) {
            ghw.b().getFitnessRecWorkoutByCourseTypeList(i, new DataCallback() { // from class: glb.58
                @Override // com.huawei.basefitnessadvice.callback.DataCallback
                public void onFailure(int i2, String str) {
                    LogUtil.e("Suggestion_DataImpl", "getFitnessWorkoutRecommendList errorCode=", Integer.valueOf(i2));
                    uiCallback.onFailure(i2, str);
                }

                @Override // com.huawei.basefitnessadvice.callback.DataCallback
                public void onSuccess(JSONObject jSONObject) {
                    if (jSONObject == null) {
                        LogUtil.e("Suggestion_DataImpl", "recommend data is null");
                        uiCallback.onFailure(-1, "Recommend data == null");
                    }
                    List<FitWorkout> listA = pda.a(jSONObject);
                    if (njy.e(listA)) {
                        LogUtil.e("Suggestion_DataImpl", "parse recommend data is null");
                        uiCallback.onFailure(-1, "RecommendWorkouts == null");
                    }
                    gmr.b(listA, i);
                    arrayList.clear();
                    arrayList.addAll(listA);
                    uiCallback.onSuccess(arrayList);
                }
            });
        } else {
            uiCallback.onSuccess(listE);
        }
    }

    private List<FitWorkout> a() throws Throwable {
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(pee.e(pee.e("suggestion", "recommend_courses.txt")));
            for (int i = 0; i < jSONArray.length(); i++) {
                FitWorkout fitWorkoutC = pda.c(btx.b(), jSONArray.getJSONObject(i));
                if (fitWorkoutC != null) {
                    LogUtil.a("Suggestion_DataImpl", "parse fitworkouts id:", fitWorkoutC.acquireName(), fitWorkoutC.acquireId());
                    arrayList.add(fitWorkoutC);
                }
            }
        } catch (JSONException e2) {
            LogUtil.e("Suggestion_DataImpl", "parse fitworkouts exception, ", LogAnonymous.b(e2));
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            gmc.g().o().c(LoginInit.getInstance(BaseApplication.getContext()).getHuidOrDefault(), (FitWorkout) it.next());
        }
        return arrayList;
    }

    @Override // com.huawei.health.plan.model.data.DataApi
    public List<WorkoutRecord> getWorkoutRecords(long j, long j2) {
        String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011);
        if (TextUtils.isEmpty(accountInfo)) {
            LogUtil.e("Suggestion_DataImpl", "getWorkoutRecords(), accountInfo == null");
            return new ArrayList();
        }
        return gmv.a(accountInfo, j, j2);
    }

    @Override // com.huawei.health.plan.model.data.DataApi
    public void getLongVideoInfo(gzl gzlVar, final UiCallback<LongVideoInfo> uiCallback) {
        if (uiCallback == null) {
            LogUtil.e("Suggestion_DataImpl", "getLongVideoInfo(), callback == null");
        } else {
            ghw.b().getLongVideoInfo(gzlVar, new DataCallback() { // from class: glb.60
                @Override // com.huawei.basefitnessadvice.callback.DataCallback
                public void onFailure(int i, String str) {
                    LogUtil.e("Suggestion_DataImpl", "getLongVideoInfo() errorCode=", Integer.valueOf(i));
                    uiCallback.onFailure(glb.this.f35464c, i, str);
                }

                @Override // com.huawei.basefitnessadvice.callback.DataCallback
                public void onSuccess(JSONObject jSONObject) {
                    LogUtil.d("Suggestion_DataImpl", "getLongVideoInfo success");
                    LongVideoInfo longVideoInfoB = gzq.b(jSONObject);
                    if (longVideoInfoB != null) {
                        LogUtil.a("Suggestion_DataImpl", "onSuccess, workout from cloud is not null");
                        uiCallback.onSuccess(glb.this.f35464c, longVideoInfoB);
                    } else {
                        uiCallback.onFailure(glb.this.f35464c, 9999, ResultUtil.c(9999));
                    }
                }
            });
        }
    }

    @Override // com.huawei.health.plan.model.data.DataApi
    public void queryEssenceVideos(String str, final UiCallback<List<EssenceVideoInfo>> uiCallback) {
        if (uiCallback == null) {
            LogUtil.e("Suggestion_DataImpl", "queryEssenceVideos(), callback == null");
        } else {
            ghw.b().queryEssenceVideos(str, new DataCallback() { // from class: glb.57
                @Override // com.huawei.basefitnessadvice.callback.DataCallback
                public void onFailure(int i, String str2) {
                    LogUtil.e("Suggestion_DataImpl", "queryEssenceVideos() errorCode=", Integer.valueOf(i), "errorInfo：", str2);
                    uiCallback.onFailure(glb.this.f35464c, i, str2);
                }

                @Override // com.huawei.basefitnessadvice.callback.DataCallback
                public void onSuccess(JSONObject jSONObject) {
                    LogUtil.a("Suggestion_DataImpl", "queryEssenceVideos success");
                    List list = (List) peh.d(jSONObject.optString("essenceVideos"), new TypeToken<List<EssenceVideoInfo>>() { // from class: com.huawei.health.plan.model.data.DataImpl$62$1
                    }.getType());
                    if (!njy.e(list)) {
                        LogUtil.a("Suggestion_DataImpl", "onSuccess, essenceVideoInfos from cloud is not null");
                        uiCallback.onSuccess(glb.this.f35464c, list);
                    } else {
                        LogUtil.e("Suggestion_DataImpl", "essenceVideoInfos isEmpty onFailure error");
                        uiCallback.onFailure(glb.this.f35464c, 9999, ResultUtil.c(9999));
                    }
                }
            });
        }
    }

    @Override // com.huawei.health.plan.model.data.DataApi
    public void uploadBehavior(pdh pdhVar, final UiCallback<Boolean> uiCallback) {
        if (uiCallback == null) {
            LogUtil.e("Suggestion_DataImpl", "uploadBehavior(), callback == null");
        } else {
            ghw.b().uploadBehavior(pdhVar, new DataCallback() { // from class: glb.59
                @Override // com.huawei.basefitnessadvice.callback.DataCallback
                public void onFailure(int i, String str) {
                    LogUtil.e("Suggestion_DataImpl", "uploadBehavior() errorCode=", Integer.valueOf(i), "errorInfo=", str);
                    uiCallback.onFailure(glb.this.f35464c, i, str);
                }

                @Override // com.huawei.basefitnessadvice.callback.DataCallback
                public void onSuccess(JSONObject jSONObject) {
                    LogUtil.a("Suggestion_DataImpl", "uploadBehavior success");
                    uiCallback.onSuccess(glb.this.f35464c, true);
                }
            });
        }
    }

    @Override // com.huawei.health.plan.model.data.DataApi
    public void getRecommedPlans(final UiCallback<List<pcp>> uiCallback) {
        if (uiCallback == null) {
            LogUtil.e("Suggestion_DataImpl", "getRecommedPlans callback == null");
        } else {
            btt.d().c(new Runnable() { // from class: gli
                @Override // java.lang.Runnable
                public final void run() {
                    this.e.b(uiCallback);
                }
            });
        }
    }

    /* synthetic */ void b(UiCallback uiCallback) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i <= 3; i++) {
            pcp pcpVarE = gnu.e(i);
            if (pcpVarE != null) {
                arrayList.add(pcpVarE);
            }
        }
        uiCallback.onSuccess(this.f35464c, arrayList);
    }

    @Override // com.huawei.health.plan.model.data.DataApi
    public void updatePlan(UserInfoBean userInfoBean, final int i, final UiCallback<Plan> uiCallback) {
        if (uiCallback == null) {
            ReleaseLogUtil.a("Suggestion_DataImpl", "updatePlan() callback == null");
        } else {
            if (b(uiCallback, "createIntelligentRunPlan")) {
                return;
            }
            LogUtil.a("Suggestion_DataImpl", "updatePlan runPlanUserInfoBean:", new Gson().toJson(userInfoBean));
            ghw.b().updatePlan(userInfoBean, i, new DataCallback() { // from class: glb.62
                @Override // com.huawei.basefitnessadvice.callback.DataCallback
                public void onFailure(int i2, String str) {
                    ReleaseLogUtil.a("Suggestion_DataImpl", "createIntelligentRunPlan fail errorCode = ", Integer.valueOf(i2));
                    uiCallback.onFailure(glb.this.f35464c, i2, str);
                    OpAnalyticsUtil.getInstance().setEventOneErrorCode(OperationKey.HEALTH_APP_UPDATE_PLAN_60010006.value(), i2);
                }

                @Override // com.huawei.basefitnessadvice.callback.DataCallback
                public void onSuccess(JSONObject jSONObject) throws Throwable {
                    LogUtil.a("Suggestion_DataImpl", "updatePlan success week:", Integer.valueOf(i));
                    String strOptString = jSONObject.optString("intPlanParam");
                    if (!TextUtils.isEmpty(strOptString)) {
                        LogUtil.a("Suggestion_DataImpl", "AlgorithmInfos : intPlanParam = ", strOptString);
                    }
                    glq.a(gls.b().getCurrentPlan(), false, -1);
                    glw.c().h();
                    glb.this.b(jSONObject, "planDetail", true, (UiCallback<Plan>) uiCallback);
                }
            });
        }
    }

    @Override // com.huawei.health.plan.model.data.DataApi
    public void createIntelligentRunPlan(CreateRunPlanParams createRunPlanParams, final UiCallback<Plan> uiCallback) {
        if (uiCallback == null) {
            ReleaseLogUtil.a("Suggestion_DataImpl", "createIntelligentRunPlan() callback == null");
        } else {
            if (b(uiCallback, "createIntelligentRunPlan")) {
                return;
            }
            LogUtil.a("Suggestion_DataImpl", "createIntelligentRunPlan runPlanUserInfoBean:", new Gson().toJson(createRunPlanParams));
            ghw.b().createPlan(createRunPlanParams, new DataCallback() { // from class: glb.65
                @Override // com.huawei.basefitnessadvice.callback.DataCallback
                public void onFailure(int i, String str) {
                    ReleaseLogUtil.a("Suggestion_DataImpl", "createIntelligentRunPlan fail errorCode = ", Integer.valueOf(i), "errorInfo:", str);
                    if (i == 200010) {
                        glw.c().e();
                    }
                    uiCallback.onFailure(glb.this.f35464c, i, str);
                }

                @Override // com.huawei.basefitnessadvice.callback.DataCallback
                public void onSuccess(JSONObject jSONObject) {
                    if (jSONObject == null) {
                        LogUtil.e("Suggestion_DataImpl", "createIntelligentRunPlan onSuccess data is null.");
                        uiCallback.onSuccess(glb.this.f35464c, null);
                        return;
                    }
                    LogUtil.a("Suggestion_DataImpl", "createIntelligentRunPlan success");
                    Plan planA = gzm.a(jSONObject, "planDetail");
                    if (StringUtils.g(planA.getTimeZone())) {
                        planA.setTimeZone(ieg.d());
                    }
                    planA.setPlanCategory(1);
                    glb.this.e(planA);
                    uiCallback.onSuccess(glb.this.f35464c, planA);
                    btq.e().e("PLAN_UPDATE");
                }
            });
            e(createRunPlanParams);
        }
    }

    private boolean b(UiCallback<Plan> uiCallback, String str) {
        if (LoginInit.getInstance(BaseApplication.getContext()) == null) {
            ReleaseLogUtil.a("Suggestion_DataImpl", str, ": loginInfo == null");
            uiCallback.onFailure(20001, ResultUtil.c(20001));
            return true;
        }
        if (gnw.c()) {
            return false;
        }
        ReleaseLogUtil.a("Suggestion_DataImpl", str, " is oversea");
        uiCallback.onFailure(99, "this version is oversea version");
        return true;
    }

    private void e(CreateRunPlanParams createRunPlanParams) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("create_time", System.currentTimeMillis());
            jSONObject.put("movementTimes", d(createRunPlanParams));
            jSONObject.put("matchDate", d(createRunPlanParams.getPlanInfoBean().getEndTime()));
            jSONObject.put("type", 2);
            jSONObject.put(ParsedFieldTag.GOAL, createRunPlanParams.getPlanInfoBean().getPlanType());
            jSONObject.put("excludedDate", c(createRunPlanParams));
            HashMap map = new HashMap(1);
            map.put("data", jSONObject.toString());
            idy.b("1120008", map);
        } catch (JSONException e2) {
            LogUtil.e("Suggestion_DataImpl", "exception = ", LogAnonymous.b(e2));
        }
    }

    private String d(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        return ieg.d(calendar.getTime(), "yyyy-MM-dd");
    }

    private int d(CreateRunPlanParams createRunPlanParams) {
        TreeSet treeSet = new TreeSet();
        List<Integer> runDate = createRunPlanParams.getPlanInfoBean().getRunDate();
        List<Integer> exeDate = createRunPlanParams.getPlanInfoBean().getExeDate();
        treeSet.addAll(runDate);
        treeSet.addAll(exeDate);
        return treeSet.size();
    }

    private List<Integer> c(CreateRunPlanParams createRunPlanParams) {
        ArrayList arrayList = new ArrayList(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        List<Integer> runDate = createRunPlanParams.getPlanInfoBean().getRunDate();
        List<Integer> exeDate = createRunPlanParams.getPlanInfoBean().getExeDate();
        arrayList.removeAll(runDate);
        arrayList.removeAll(exeDate);
        return arrayList;
    }

    @Override // com.huawei.health.plan.model.data.DataApi
    public void addUserDefinedWorkout(final FitWorkout fitWorkout, final UiCallback<FitWorkout> uiCallback) {
        if (uiCallback == null) {
            LogUtil.e("Suggestion_DataImpl", "addUserDefinedWorkout(), callback == null");
            return;
        }
        final LoginInit loginInit = LoginInit.getInstance(BaseApplication.getContext());
        if (loginInit.getUsetId() == null) {
            LogUtil.e("Suggestion_DataImpl", "addUserDefinedWorkout() getAccountInfo == null");
            uiCallback.onFailure(20001, ResultUtil.c(20001));
        } else if (CommonUtil.ab(btx.c())) {
            ghw.b().addUserDefinedWorkout(fitWorkout.acquireName(), fitWorkout.acquireDescription(), fitWorkout.getCourseDefineType(), fitWorkout.getCourseActions(), new DataCallback() { // from class: glb.61
                @Override // com.huawei.basefitnessadvice.callback.DataCallback
                public void onFailure(int i, String str) {
                    ReleaseLogUtil.a("Suggestion_DataImpl", "addUserDefinedWorkout() errorCode=", Integer.valueOf(i));
                    uiCallback.onFailure(i, str);
                }

                @Override // com.huawei.basefitnessadvice.callback.DataCallback
                public void onSuccess(JSONObject jSONObject) throws Throwable {
                    if (jSONObject != null) {
                        LogUtil.a("Suggestion_DataImpl", "addUserDefinedWorkout success.", jSONObject.toString());
                        String strOptString = jSONObject.optString(HwExerciseConstants.METHOD_PARAM_WORKOUT_ID);
                        long jOptLong = jSONObject.optLong("createTime");
                        fitWorkout.saveId(strOptString);
                        fitWorkout.savePublishDate(jOptLong);
                        fitWorkout.saveModified(jOptLong);
                        gmc.g().o().c(loginInit.getUsetId(), fitWorkout);
                        uiCallback.onSuccess(fitWorkout);
                        btq.e().e("CUSTOM_COURSE_UPDATE");
                        return;
                    }
                    LogUtil.e("Suggestion_DataImpl", "addUserDefinedWorkout(), data == null");
                    uiCallback.onFailure(9999, ResultUtil.c(9999));
                }
            });
        } else {
            uiCallback.onFailure(ResultUtil.ResultCode.NO_NET, ResultUtil.c(ResultUtil.ResultCode.NO_NET));
        }
    }

    @Override // com.huawei.health.plan.model.data.DataApi
    public void modifyUserDefinedWorkout(final FitWorkout fitWorkout, final UiCallback<FitWorkout> uiCallback) {
        if (uiCallback == null) {
            LogUtil.e("Suggestion_DataImpl", "modifyUserDefinedWorkout(), callback == null");
            return;
        }
        final LoginInit loginInit = LoginInit.getInstance(BaseApplication.getContext());
        if (loginInit.getUsetId() == null) {
            LogUtil.e("Suggestion_DataImpl", "modifyUserDefinedWorkout() getAccountInfo == null");
            uiCallback.onFailure(20001, ResultUtil.c(20001));
        } else if (CommonUtil.ab(btx.c())) {
            ghw.b().modifyUserDefinedWorkout(fitWorkout, new DataCallback() { // from class: glb.64
                @Override // com.huawei.basefitnessadvice.callback.DataCallback
                public void onFailure(int i, String str) {
                    ReleaseLogUtil.a("Suggestion_DataImpl", "modifyUserDefinedWorkout() errorCode=", Integer.valueOf(i));
                    uiCallback.onFailure(i, str);
                }

                @Override // com.huawei.basefitnessadvice.callback.DataCallback
                public void onSuccess(JSONObject jSONObject) throws Throwable {
                    if (jSONObject != null) {
                        LogUtil.a("Suggestion_DataImpl", "modifyUserDefinedWorkout success.", jSONObject.toString());
                        long jOptLong = jSONObject.optLong(ParsedFieldTag.TASK_MODIFY_TIME);
                        if (jOptLong != 0) {
                            fitWorkout.saveModified(jOptLong);
                        }
                        gmc.g().o().c(loginInit.getUsetId(), fitWorkout);
                        uiCallback.onSuccess(fitWorkout);
                        btq.e().e("CUSTOM_COURSE_UPDATE");
                        return;
                    }
                    LogUtil.e("Suggestion_DataImpl", "modifyUserDefinedWorkout(), data == null");
                    uiCallback.onFailure(9999, ResultUtil.c(9999));
                }
            });
        } else {
            uiCallback.onFailure(ResultUtil.ResultCode.NO_NET, ResultUtil.c(ResultUtil.ResultCode.NO_NET));
        }
    }

    @Override // com.huawei.health.plan.model.data.DataApi
    public void deleteUserDefinedWorkout(final String str, int i, final UiCallback<String> uiCallback) {
        if (uiCallback == null) {
            LogUtil.e("Suggestion_DataImpl", "deleteUserDefinedWorkout(), callback == null");
            return;
        }
        final LoginInit loginInit = LoginInit.getInstance(BaseApplication.getContext());
        if (loginInit.getUsetId() == null) {
            LogUtil.e("Suggestion_DataImpl", "deleteUserDefinedWorkout() getAccountInfo == null");
            uiCallback.onFailure(20001, ResultUtil.c(20001));
        } else if (CommonUtil.ab(btx.c())) {
            ghw.b().deleteUserDefinedWorkout(str, i, new DataCallback() { // from class: glb.63
                @Override // com.huawei.basefitnessadvice.callback.DataCallback
                public void onFailure(int i2, String str2) {
                    ReleaseLogUtil.a("Suggestion_DataImpl", "deleteUserDefinedWorkout errorCode=", Integer.valueOf(i2));
                    if (!TextUtils.isEmpty(ResultUtil.c(i2))) {
                        uiCallback.onFailure(i2, ResultUtil.c(i2));
                    } else {
                        uiCallback.onFailure(i2, str2);
                    }
                }

                @Override // com.huawei.basefitnessadvice.callback.DataCallback
                public void onSuccess(JSONObject jSONObject) {
                    if (jSONObject != null) {
                        LogUtil.a("Suggestion_DataImpl", "deleteUserDefinedWorkout success.", jSONObject.toString());
                        gmc.g().o().d(loginInit.getUsetId(), str);
                        uiCallback.onSuccess(null);
                        btq.e().e("CUSTOM_COURSE_UPDATE");
                        return;
                    }
                    LogUtil.e("Suggestion_DataImpl", "modifyUserDefinedWorkout(), data == null");
                    uiCallback.onFailure(9999, ResultUtil.c(9999));
                }
            });
        } else {
            uiCallback.onFailure(ResultUtil.ResultCode.NO_NET, ResultUtil.c(ResultUtil.ResultCode.NO_NET));
        }
    }

    @Override // com.huawei.health.plan.model.data.DataApi
    public void getFilterTab(String str, final UiCallback<Boolean> uiCallback) {
        if (TextUtils.isEmpty(LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011))) {
            LogUtil.e("Suggestion_DataImpl", "getFilterTab(): getAccountInfo()==null");
            uiCallback.onFailure(this.f35464c, 20001, ResultUtil.c(20001));
        } else if (!gnw.c()) {
            uiCallback.onFailure(this.f35464c, -4, ResultUtil.c(-4));
        } else if (!CommonUtil.ab(btx.c())) {
            uiCallback.onFailure(this.f35464c, ResultUtil.ResultCode.NO_NET, ResultUtil.c(ResultUtil.ResultCode.NO_NET));
        } else {
            ghw.b().getFilterTab(str, new DataCallback() { // from class: glb.70
                @Override // com.huawei.basefitnessadvice.callback.DataCallback
                public void onFailure(int i, String str2) {
                    LogUtil.e("Suggestion_DataImpl", "getFilterTab: errorCode = ", Integer.valueOf(i), "errorInfo = ", str2);
                    uiCallback.onFailure(glb.this.f35464c, i, str2);
                }

                @Override // com.huawei.basefitnessadvice.callback.DataCallback
                public void onSuccess(JSONObject jSONObject) {
                    JSONObject jSONObjectOptJSONObject;
                    LogUtil.a("Suggestion_DataImpl", "getFilterTab: onSuccess , data = ", jSONObject.toString());
                    JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("dictionaryLists");
                    uiCallback.onSuccess(glb.this.f35464c, Boolean.valueOf(((jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0 || (jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(0)) == null) ? 0 : jSONObjectOptJSONObject.optInt("display", 0)) == 1));
                }
            });
        }
    }

    @Override // com.huawei.health.plan.model.data.DataApi
    public void queryAudiosPackageBySeriesId(String str, final UiCallback<List<SleepAudioPackage>> uiCallback) {
        if (d(uiCallback)) {
            ghw.b().queryAudiosPackageBySeriesId(str, new DataCallback() { // from class: glb.66
                @Override // com.huawei.basefitnessadvice.callback.DataCallback
                public void onFailure(int i, String str2) {
                    LogUtil.e("Suggestion_DataImpl", "onFailure , errorCode = ", Integer.valueOf(i), " errorInfo = ", str2);
                    uiCallback.onFailure(glb.this.f35464c, i, str2);
                }

                @Override // com.huawei.basefitnessadvice.callback.DataCallback
                public void onSuccess(JSONObject jSONObject) {
                    String strOptString = jSONObject.optString("packageList");
                    if (TextUtils.isEmpty(strOptString)) {
                        LogUtil.j("Suggestion_DataImpl", "queryAudiosPackageBySeriesId packageList == null");
                        uiCallback.onFailure(glb.this.f35464c, ResultUtil.ResultCode.PARAMETER_INVALID, "queryAudiosPackageBySeriesId packageList == null");
                        return;
                    }
                    LogUtil.a("Suggestion_DataImpl", "queryAudiosPackageBySeriesId packageList = ", strOptString);
                    try {
                        List list = (List) new Gson().fromJson(strOptString, new TypeToken<List<SleepAudioPackage>>() { // from class: com.huawei.health.plan.model.data.DataImpl$70$1
                        }.getType());
                        if (list != null) {
                            LogUtil.a("Suggestion_DataImpl", "sleepAudioPackageListSize = ", Integer.valueOf(list.size()));
                            uiCallback.onSuccess(glb.this.f35464c, list);
                        } else {
                            LogUtil.j("Suggestion_DataImpl", "sleepAudioPackageList == null");
                            uiCallback.onFailure(glb.this.f35464c, ResultUtil.ResultCode.PARAMETER_INVALID, "sleepAudioPackageList == null");
                        }
                    } catch (JsonSyntaxException unused) {
                        LogUtil.e("Suggestion_DataImpl", "parse sleepAudioPackageList , jsonSyntaxException");
                        uiCallback.onFailure(glb.this.f35464c, ResultUtil.ResultCode.PARAMETER_INVALID, "parse sleepAudioPackageList , jsonSyntaxException");
                    }
                }
            });
        }
    }

    @Override // com.huawei.health.plan.model.data.DataApi
    public void getAudioBehaviorList(int i, int i2, int i3, int i4, final UiCallback<List<SleepAudioSeries>> uiCallback) {
        if (d(uiCallback) && e(uiCallback)) {
            ghw.b().getAudioBehaviorList(i, i2, i3, i4, new DataCallback() { // from class: glb.68
                @Override // com.huawei.basefitnessadvice.callback.DataCallback
                public void onFailure(int i5, String str) {
                    LogUtil.e("Suggestion_DataImpl", "onFailure , errorCode = ", Integer.valueOf(i5), " errorInfo = ", str);
                    uiCallback.onFailure(glb.this.f35464c, i5, str);
                }

                @Override // com.huawei.basefitnessadvice.callback.DataCallback
                public void onSuccess(JSONObject jSONObject) {
                    String strOptString = jSONObject.optString("sleepAudios");
                    if (TextUtils.isEmpty(strOptString)) {
                        LogUtil.j("Suggestion_DataImpl", "getAudioBehaviorList packageList == null");
                        uiCallback.onFailure(glb.this.f35464c, ResultUtil.ResultCode.PARAMETER_INVALID, "getAudioBehaviorList packageList == null");
                        return;
                    }
                    LogUtil.a("Suggestion_DataImpl", "getAudioBehaviorList sleepAudios = ", strOptString);
                    try {
                        List list = (List) new Gson().fromJson(strOptString, new TypeToken<List<SleepAudioSeries>>() { // from class: com.huawei.health.plan.model.data.DataImpl$71$1
                        }.getType());
                        if (list != null) {
                            LogUtil.a("Suggestion_DataImpl", "sleepAudiosListSize = ", Integer.valueOf(list.size()));
                            uiCallback.onSuccess(glb.this.f35464c, list);
                        } else {
                            LogUtil.j("Suggestion_DataImpl", "sleepAudiosList == null");
                            uiCallback.onFailure(glb.this.f35464c, ResultUtil.ResultCode.PARAMETER_INVALID, "sleepAudiosList == null");
                        }
                    } catch (JsonSyntaxException unused) {
                        LogUtil.e("Suggestion_DataImpl", "parse sleepAudiosList , jsonSyntaxException");
                        uiCallback.onFailure(glb.this.f35464c, ResultUtil.ResultCode.PARAMETER_INVALID, "parse sleepAudiosList , jsonSyntaxException");
                    }
                }
            });
        }
    }

    @Override // com.huawei.health.plan.model.data.DataApi
    public void getAudioBehaviorList(gzc gzcVar, final UiCallback<List<SleepAudioSeries>> uiCallback) {
        if (d(uiCallback) && e(uiCallback)) {
            ghw.b().getAudioBehaviorList(gzcVar, new DataCallback() { // from class: glb.67
                @Override // com.huawei.basefitnessadvice.callback.DataCallback
                public void onFailure(int i, String str) {
                    LogUtil.e("Suggestion_DataImpl", "onFailure , errorCode = ", Integer.valueOf(i), " errorInfo = ", str);
                    uiCallback.onFailure(glb.this.f35464c, i, str);
                }

                @Override // com.huawei.basefitnessadvice.callback.DataCallback
                public void onSuccess(JSONObject jSONObject) {
                    String strOptString = jSONObject.optString("sleepAudios");
                    if (TextUtils.isEmpty(strOptString)) {
                        LogUtil.j("Suggestion_DataImpl", "getAudioBehaviorList packageList == null");
                        uiCallback.onFailure(glb.this.f35464c, ResultUtil.ResultCode.PARAMETER_INVALID, "getAudioBehaviorList packageList == null");
                        return;
                    }
                    LogUtil.a("Suggestion_DataImpl", "getAudioBehaviorList sleepAudios = ", strOptString);
                    try {
                        List list = (List) new Gson().fromJson(strOptString, new TypeToken<List<SleepAudioSeries>>() { // from class: com.huawei.health.plan.model.data.DataImpl$72$1
                        }.getType());
                        if (list != null) {
                            LogUtil.a("Suggestion_DataImpl", "sleepAudiosListSize = ", Integer.valueOf(list.size()));
                            uiCallback.onSuccess(glb.this.f35464c, list);
                        } else {
                            LogUtil.j("Suggestion_DataImpl", "sleepAudiosList == null");
                            uiCallback.onFailure(glb.this.f35464c, ResultUtil.ResultCode.PARAMETER_INVALID, "sleepAudiosList == null");
                        }
                    } catch (JsonSyntaxException unused) {
                        LogUtil.e("Suggestion_DataImpl", "parse sleepAudiosList , jsonSyntaxException");
                        uiCallback.onFailure(glb.this.f35464c, ResultUtil.ResultCode.PARAMETER_INVALID, "parse sleepAudiosList , jsonSyntaxException");
                    }
                }
            });
        }
    }

    @Override // com.huawei.health.plan.model.data.DataApi
    public void getRecommendResource(List<String> list, final UiCallback<pcn> uiCallback) {
        ghw.b().getRecommendResource(list, new DataCallback() { // from class: glb.74
            @Override // com.huawei.basefitnessadvice.callback.DataCallback
            public void onFailure(int i, String str) {
                ReleaseLogUtil.a("Suggestion_DataImpl", "getRecommendResource errorCode:", Integer.valueOf(i), ",errorInfo:", str);
                uiCallback.onFailure(glb.this.f35464c, i, str);
            }

            @Override // com.huawei.basefitnessadvice.callback.DataCallback
            public void onSuccess(JSONObject jSONObject) {
                if (jSONObject == null) {
                    LogUtil.j("Suggestion_DataImpl", "getRecommendResource from cloud is null");
                    uiCallback.onSuccess(glb.this.f35464c, null);
                } else {
                    LogUtil.a("Suggestion_DataImpl", "getRecommendResource success");
                    uiCallback.onSuccess(glb.this.f35464c, (pcn) HiJsonUtil.d(jSONObject.toString(), pcn.class));
                }
            }
        });
    }

    @Override // com.huawei.health.plan.model.data.DataApi
    public void operateFavoriteAudio(int i, int i2, final UiCallback<Boolean> uiCallback) {
        if (d(uiCallback) && e(uiCallback)) {
            ghw.b().operateFavoriteAudio(i, i2, new DataCallback() { // from class: glb.73
                @Override // com.huawei.basefitnessadvice.callback.DataCallback
                public void onFailure(int i3, String str) {
                    LogUtil.e("Suggestion_DataImpl", "onFailure , errorCode = ", Integer.valueOf(i3), " errorInfo = ", str);
                    uiCallback.onFailure(glb.this.f35464c, i3, str);
                }

                @Override // com.huawei.basefitnessadvice.callback.DataCallback
                public void onSuccess(JSONObject jSONObject) {
                    LogUtil.a("Suggestion_DataImpl", "operateFavoriteAudio onSuccess , data = ", jSONObject);
                    uiCallback.onSuccess(glb.this.f35464c, true);
                }
            });
        }
    }

    @Override // com.huawei.health.plan.model.data.DataApi
    public void deletePlayRecord(List<Integer> list, final UiCallback<Boolean> uiCallback) {
        if (d(uiCallback) && e(uiCallback)) {
            if (njy.e(list)) {
                LogUtil.j("Suggestion_DataImpl", "deletePlayRecord idList is empty");
                uiCallback.onFailure(this.f35464c, ResultUtil.ResultCode.PARAMETER_INVALID, "deletePlayRecord idList is empty");
            }
            ghw.b().deletePlayRecord(list, new DataCallback() { // from class: glb.72
                @Override // com.huawei.basefitnessadvice.callback.DataCallback
                public void onFailure(int i, String str) {
                    LogUtil.e("Suggestion_DataImpl", "onFailure , errorCode = ", Integer.valueOf(i), " errorInfo = ", str);
                    uiCallback.onFailure(glb.this.f35464c, i, str);
                }

                @Override // com.huawei.basefitnessadvice.callback.DataCallback
                public void onSuccess(JSONObject jSONObject) {
                    LogUtil.a("Suggestion_DataImpl", "deletePlayRecord onSuccess , data = ", jSONObject);
                    uiCallback.onSuccess(glb.this.f35464c, true);
                }
            });
        }
    }

    @Override // com.huawei.health.plan.model.data.DataApi
    public void getWorkoutPackageById(gzj gzjVar, final UiCallback<WorkoutPackageInfo> uiCallback) {
        ReleaseLogUtil.d("Suggestion_DataImpl", "getWorkoutPackageById ", gzjVar.e(), " ", gzjVar.d());
        if (uiCallback == null) {
            ReleaseLogUtil.a("Suggestion_DataImpl", "getWorkoutPackageById, callback == null");
        } else {
            ghw.b().getWorkoutPackage(gzjVar, new DataCallback() { // from class: glb.71
                @Override // com.huawei.basefitnessadvice.callback.DataCallback
                public void onFailure(int i, String str) {
                    ReleaseLogUtil.a("Suggestion_DataImpl", "getWorkoutPackage errorCode=", Integer.valueOf(i));
                    uiCallback.onFailure(i, str);
                }

                @Override // com.huawei.basefitnessadvice.callback.DataCallback
                public void onSuccess(JSONObject jSONObject) {
                    ReleaseLogUtil.d("Suggestion_DataImpl", "getWorkoutPackage is data null ", Boolean.valueOf(jSONObject == null));
                    uiCallback.onSuccess(pcr.b().parse(CommonUtil.u(), jSONObject));
                }
            });
        }
    }

    @Override // com.huawei.health.plan.model.data.DataApi
    public FitWorkout getFitWorkout(String str, String str2) {
        LoginInit loginInit = LoginInit.getInstance(BaseApplication.getContext());
        if (loginInit.getHuidOrDefault() == null) {
            LogUtil.e("Suggestion_DataImpl", "ifFitWorkoutExists accountInfo == null");
            return null;
        }
        return gmc.g().o().b(loginInit.getHuidOrDefault(), str, str2);
    }

    @Override // com.huawei.health.plan.model.data.DataApi
    public List<Media> getMediaFiles(FitWorkout fitWorkout) {
        if (fitWorkout == null) {
            return new ArrayList();
        }
        return glu.c(fitWorkout, true);
    }

    @Override // com.huawei.health.plan.model.data.DataApi
    public void getFitnessActionTemplate(String str, final UiCallback<pch> uiCallback) {
        if (uiCallback == null) {
            ReleaseLogUtil.e("Suggestion_DataImpl", "getFitnessActionTemplate(), callback == null");
        } else if (!e() || !CommonUtil.ab(btx.c())) {
            uiCallback.onFailure(this.f35464c, ResultUtil.ResultCode.NO_NET, ResultUtil.c(ResultUtil.ResultCode.NO_NET));
        } else {
            ghw.b().getFitnessActionTemplate(str, new DataCallback() { // from class: glb.75
                @Override // com.huawei.basefitnessadvice.callback.DataCallback
                public void onFailure(int i, String str2) {
                    ReleaseLogUtil.e("Suggestion_DataImpl", "getFitnessActionTemplate(): errorCode=", Integer.valueOf(i));
                    uiCallback.onFailure(glb.this.f35464c, i, str2);
                }

                @Override // com.huawei.basefitnessadvice.callback.DataCallback
                public void onSuccess(JSONObject jSONObject) {
                    if (jSONObject == null) {
                        ReleaseLogUtil.e("Suggestion_DataImpl", "getFitnessActionTemplate onSuccess data is null.");
                        uiCallback.onSuccess(glb.this.f35464c, null);
                    } else {
                        uiCallback.onSuccess(glb.this.f35464c, (pch) peh.b(jSONObject.toString(), pch.class));
                    }
                }
            });
        }
    }

    @Override // com.huawei.health.plan.model.data.DataApi
    public void getFitnessMaxScore(String str, int i, final UiCallback<pcl> uiCallback) {
        if (uiCallback == null) {
            ReleaseLogUtil.e("Suggestion_DataImpl", "getFitnessMaxScore(), callback == null");
        } else if (!e() || !CommonUtil.ab(btx.c())) {
            uiCallback.onFailure(this.f35464c, ResultUtil.ResultCode.NO_NET, ResultUtil.c(ResultUtil.ResultCode.NO_NET));
        } else {
            ghw.b().getFitnessMaxScore(str, i, new DataCallback() { // from class: glb.77
                @Override // com.huawei.basefitnessadvice.callback.DataCallback
                public void onFailure(int i2, String str2) {
                    ReleaseLogUtil.e("Suggestion_DataImpl", "getFitnessMaxScore(): errorCode=", Integer.valueOf(i2));
                    uiCallback.onFailure(glb.this.f35464c, i2, str2);
                }

                @Override // com.huawei.basefitnessadvice.callback.DataCallback
                public void onSuccess(JSONObject jSONObject) {
                    if (jSONObject == null) {
                        ReleaseLogUtil.e("Suggestion_DataImpl", "getFitnessMaxScore onSuccess data is null.");
                        uiCallback.onSuccess(glb.this.f35464c, null);
                    } else {
                        uiCallback.onSuccess(glb.this.f35464c, (pcl) peh.b(jSONObject.toString(), pcl.class));
                    }
                }
            });
        }
    }

    @Override // com.huawei.health.plan.model.data.DataApi
    public void getUserRank(git gitVar, final UiCallback<pcq> uiCallback) {
        if (uiCallback == null) {
            ReleaseLogUtil.e("Suggestion_DataImpl", "getUserRank(), callback == null");
        } else if (!e() || !CommonUtil.ab(btx.c())) {
            uiCallback.onFailure(this.f35464c, ResultUtil.ResultCode.NO_NET, ResultUtil.c(ResultUtil.ResultCode.NO_NET));
        } else {
            ghw.b().getUserRank(gitVar, new DataCallback() { // from class: glb.80
                @Override // com.huawei.basefitnessadvice.callback.DataCallback
                public void onFailure(int i, String str) {
                    ReleaseLogUtil.e("Suggestion_DataImpl", "getFitnessMaxScore(): errorCode=", Integer.valueOf(i));
                    uiCallback.onFailure(glb.this.f35464c, i, str);
                }

                @Override // com.huawei.basefitnessadvice.callback.DataCallback
                public void onSuccess(JSONObject jSONObject) {
                    if (jSONObject == null) {
                        ReleaseLogUtil.e("Suggestion_DataImpl", "getFitnessMaxScore onSuccess data is null.");
                        uiCallback.onSuccess(glb.this.f35464c, null);
                    } else {
                        uiCallback.onSuccess(glb.this.f35464c, (pcq) peh.b(jSONObject.toString(), pcq.class));
                    }
                }
            });
        }
    }

    private boolean e(UiCallback uiCallback) {
        if (!TextUtils.isEmpty(LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011))) {
            return true;
        }
        LogUtil.j("Suggestion_DataImpl", "checkLogin false");
        uiCallback.onFailure(this.f35464c, 20001, ResultUtil.c(20001));
        return false;
    }

    private boolean d(UiCallback uiCallback) {
        if (CommonUtil.ab(btx.c())) {
            return true;
        }
        LogUtil.j("Suggestion_DataImpl", "checkNetwork false");
        uiCallback.onFailure(this.f35464c, ResultUtil.ResultCode.NO_NET, ResultUtil.c(ResultUtil.ResultCode.NO_NET));
        return false;
    }

    private boolean c(UiCallback uiCallback) {
        if (e()) {
            return true;
        }
        LogUtil.j("Suggestion_DataImpl", "checkAllowLogin false");
        uiCallback.onFailure(this.f35464c, ResultUtil.ResultCode.NO_NET, ResultUtil.c(ResultUtil.ResultCode.NO_NET));
        return false;
    }

    private float a(float f) {
        ReleaseLogUtil.d("Suggestion_DataImpl", "handleFinishRate finishRate", Float.valueOf(f));
        if (f > 100.0f) {
            return 100.0f;
        }
        if (CommonUtil.b(f)) {
            return 0.0f;
        }
        return f;
    }

    @Override // com.huawei.health.plan.model.data.DataApi
    public boolean homeCountryFitnessDataMigrate(String str) {
        if (!e(str)) {
            return false;
        }
        LogUtil.a("Suggestion_DataImpl", "workoutRecordDataMigrate start");
        return d(str);
    }

    private boolean e(final String str) {
        if (str == null) {
            LogUtil.e("Suggestion_DataImpl", "userId is null");
            return false;
        }
        List list = (List) Arrays.asList("fit_workouts_info", "fitness_total_record", "best_record", "best_record_fit", "data_sync", "plan_records", "train_count").stream().map(new Function() { // from class: gle
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.e.b(str, (String) obj);
            }
        }).collect(Collectors.toList());
        LogUtil.a("Suggestion_DataImpl", "deleteFitnessData:deleteResults=" + list);
        return list.stream().allMatch(new Predicate() { // from class: glh
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return glb.a((Integer) obj);
            }
        });
    }

    /* synthetic */ Integer b(String str, String str2) {
        return Integer.valueOf(e(str2, str));
    }

    static /* synthetic */ boolean a(Integer num) {
        return num.intValue() == 0;
    }

    private int e(String str, String str2) {
        return gmc.g().deleteStorageData(str, 1, "userId=?", new String[]{StringUtils.c((Object) str2)});
    }

    private boolean d(String str) {
        List<Long> listD = gmv.d(str);
        if (njy.e(listD)) {
            LogUtil.a("Suggestion_DataImpl", "allExerciseTime is empty");
            return true;
        }
        LogUtil.a("Suggestion_DataImpl", "allExerciseTime size: ", Integer.valueOf(listD.size()));
        Iterator<Long> it = listD.iterator();
        while (true) {
            boolean z = true;
            while (true) {
                if (it.hasNext()) {
                    Long next = it.next();
                    if (!z || !c(str, String.valueOf(next))) {
                        z = false;
                    }
                } else {
                    glr.d();
                    return z;
                }
            }
        }
    }

    private boolean c(String str, String str2) {
        LogUtil.a("Suggestion_DataImpl", "addSyncRecord() enter");
        ContentValues contentValues = new ContentValues();
        contentValues.put("planId", "");
        contentValues.put(JsbMapKeyNames.H5_USER_ID, str);
        contentValues.put("type", (Integer) 2);
        contentValues.put("value", str2);
        if (gmc.g().insertStorageData("data_sync", 1, contentValues) > 0) {
            return true;
        }
        ReleaseLogUtil.a("Suggestion_DataImpl", "migrateAddSyncRecord() failed exerciseTime = ", str2);
        return false;
    }
}
