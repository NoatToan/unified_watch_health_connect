package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.google.gson.Gson;
import com.huawei.basefitnessadvice.callback.DataCallback;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.basefitnessadvice.model.Plan;
import com.huawei.basefitnessadvice.model.intplan.IntAction;
import com.huawei.basefitnessadvice.model.intplan.IntPlan;
import com.huawei.basefitnessadvice.model.intplan.StatInfo;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.plan.model.UserFitnessPlanInfo;
import com.huawei.health.plan.model.intplan.IntPlanBean;
import com.huawei.health.plan.model.intplan.LeavePlanCalendarBean;
import com.huawei.health.plan.model.intplan.ReplacePlanBean;
import com.huawei.health.plan.model.intplan.UserProfileBean;
import com.huawei.health.plan.model.trainingplan.SmartPlanTypeEnum;
import com.huawei.health.sport.model.WorkoutRecord;
import com.huawei.health.sport.utils.ResultUtil;
import com.huawei.health.userprofilemgr.api.UserProfileMgrApi;
import com.huawei.health.userprofilemgr.model.BaseResponseCallback;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.operation.OperationKey;
import com.huawei.pluginfitnessadvice.FitnessPackageInfo;
import com.huawei.pluginfitnessadvice.plandata.CreateRunPlanParams;
import com.huawei.pluginfitnessadvice.plandata.UserInfoBean;
import com.huawei.taskplatform.api.TaskPlatformApi;
import com.huawei.up.model.UserInfomation;
import com.huawei.utils.RiskBiAnalytics;
import health.compact.a.CommonUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.Services;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import health.compact.a.utils.StringUtils;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes29.dex */
public class gmi {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile qey f35691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile ghf f35692c;
    private Handler e;

    static class e {
        static gmi e = new gmi();
    }

    private gmi() {
        this.e = new Handler(Looper.getMainLooper());
    }

    public static gmi b() {
        return e.e;
    }

    public void b(UiCallback<ghf> uiCallback) {
        if (!gnw.c() || Utils.o()) {
            String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011);
            if (accountInfo == null) {
                LogUtil.e("Suggestion_IntPlanManager", "getCurrentIntPlan createPlanFromDb userId == null");
                uiCallback.onFailure(20001, ResultUtil.c(20001));
                return;
            }
            Plan planCreatePlanFromDb = gls.b().createPlanFromDb(accountInfo);
            if ((planCreatePlanFromDb != null && planCreatePlanFromDb.getPlanCategory() == 0) || !gnw.c()) {
                a(planCreatePlanFromDb);
                uiCallback.onSuccess(this.f35692c);
                return;
            }
        }
        if (f() || glw.c().d()) {
            ReleaseLogUtil.d("Suggestion_IntPlanManager", "getDoingPlan plan from cloud begin");
            c(uiCallback);
        } else {
            uiCallback.onSuccess(this.f35692c);
        }
    }

    public ghf a() {
        if (f()) {
            return null;
        }
        return this.f35692c;
    }

    ghf a(UserFitnessPlanInfo userFitnessPlanInfo) {
        this.f35692c = gnw.e(userFitnessPlanInfo);
        return this.f35692c;
    }

    public void e(CreateRunPlanParams createRunPlanParams, final UiCallback<Plan> uiCallback) {
        if (uiCallback == null || createRunPlanParams == null) {
            LogUtil.e("Suggestion_IntPlanManager", "createPlan: callback or runPlanUserInfoBean is null.");
        } else {
            gls.b().createIntelligentRunPlan(createRunPlanParams, new UiCallback<Plan>() { // from class: gmi.1
                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                public void onFailure(int i, String str) {
                    ReleaseLogUtil.e("Suggestion_IntPlanManager", "createIntelligentRunPlan fail errorCode ", Integer.valueOf(i), "errorInfo ", str);
                    RiskBiAnalytics.e(RiskBiAnalytics.FitPLANRiskType.RISK_TYPE_CREATE_PLAN.value(), "createIntelligentRunPlan fail errorCode ", Integer.valueOf(i), "errorInfo ", str);
                    uiCallback.onFailure(i, str);
                }

                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
                public void onSuccess(Plan plan) {
                    LogUtil.e("Suggestion_IntPlanManager", "createIntelligentRunPlan success. ", plan);
                    gmi.this.f35692c = gnw.e(plan);
                    gmi.this.f35692c.f35106a.a(System.currentTimeMillis() / 1000);
                    uiCallback.onSuccess(plan);
                    btq.e().e("PLAN_CREATE");
                    btw.e(gmi.this.f35692c, "5", new int[0]);
                }
            });
        }
    }

    private void c(final UiCallback<ghf> uiCallback) {
        ghw.b().getDoingIntPlan(new DataCallback() { // from class: gmi.11
            @Override // com.huawei.basefitnessadvice.callback.DataCallback
            public void onFailure(int i, String str) {
                ReleaseLogUtil.a("Suggestion_IntPlanManager", "getDoingPlan fail with errorCode ", Integer.valueOf(i));
                uiCallback.onFailure(i, str);
            }

            @Override // com.huawei.basefitnessadvice.callback.DataCallback
            public void onSuccess(JSONObject jSONObject) {
                if (jSONObject == null) {
                    ReleaseLogUtil.d("Suggestion_IntPlanManager", "getDoingPlan from cloud is null");
                    gmi.this.h();
                    gmi.this.e();
                    gmi.this.b((Plan) null);
                    uiCallback.onSuccess(null);
                    return;
                }
                LogUtil.d("Suggestion_IntPlanManager", "getDoingPlan success with data", jSONObject);
                int iOptInt = jSONObject.optInt("planType", IntPlan.PlanType.NA_PLAN.getType());
                if (iOptInt != IntPlan.PlanType.NA_PLAN.getType()) {
                    gmi.this.b(iOptInt, jSONObject, (UiCallback<ghf>) uiCallback);
                    btw.t(gmi.this.f35692c);
                    if (gmi.this.f()) {
                        return;
                    }
                    glw.c().h();
                    if (gmi.this.f35692c.f35106a != null) {
                        glq.c(gmi.this.f35692c, (Boolean) true, gmi.this.f35692c.f35106a.getRemindTime());
                        return;
                    }
                    return;
                }
                ReleaseLogUtil.e("Suggestion_IntPlanManager", "getDoingPlan get empty planType");
                gmi.this.h();
                gmi.this.e();
                gmi.this.b((Plan) null);
                uiCallback.onSuccess(null);
            }
        });
    }

    public void e(UiCallback<qey> uiCallback) {
        a((Integer) null, (Integer) null, true, uiCallback);
    }

    public qey d() {
        return this.f35691b;
    }

    private qev e(Integer num, Integer num2) {
        qev qevVar = new qev();
        qevVar.d(1);
        qevVar.c(1);
        if (num != null && num2 != null) {
            qevVar.b(num.intValue());
            qevVar.a(num2.intValue());
        }
        return qevVar;
    }

    public void a(Integer num, Integer num2, boolean z, final UiCallback<qey> uiCallback) {
        if (LoginInit.getInstance(BaseApplication.getContext()).isBrowseMode()) {
            LogUtil.j("Suggestion_IntPlanManager", "getCurrentPlan user no login");
            uiCallback.onFailure(20001, ResultUtil.c(20001));
            return;
        }
        glw.c().i();
        TaskPlatformApi taskPlatformApi = (TaskPlatformApi) Services.d("TaskPlatform", TaskPlatformApi.class);
        if (taskPlatformApi == null) {
            return;
        }
        qev qevVarE = e(num, num2);
        qevVarE.b(z);
        taskPlatformApi.queryPlan(qevVarE, new ResponseCallback() { // from class: gml
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i, Object obj) {
                this.f35734a.b(uiCallback, i, (List) obj);
            }
        });
    }

    /* synthetic */ void b(UiCallback uiCallback, int i, List list) {
        if (i != 0) {
            ReleaseLogUtil.a("Suggestion_IntPlanManager", "queryPlan from cloud is fail status:", Integer.valueOf(i));
            uiCallback.onFailure(i, "");
            this.f35691b = null;
            RiskBiAnalytics.a(SmartPlanTypeEnum.SMART_NA_PLAN.getValue(), RiskBiAnalytics.SmartPlanRiskType.RISK_TYPE_QUERY_PLAN, String.valueOf(i), "query plan fail");
            return;
        }
        if (njy.e(list)) {
            LogUtil.a("Suggestion_IntPlanManager", "queryPlan from cloud is null");
            uiCallback.onSuccess(null);
            this.f35691b = null;
        } else {
            list.removeIf(new Predicate() { // from class: gmm
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return gmi.a((qey) obj);
                }
            });
            qey qeyVar = njy.e(list) ? null : (qey) list.get(0);
            uiCallback.onSuccess(qeyVar);
            this.f35691b = qeyVar;
            btw.a(qeyVar);
        }
    }

    static /* synthetic */ boolean a(qey qeyVar) {
        if (qeyVar.e() == 0) {
            return (qeyVar.k() == 0 || qeyVar.k() == 4 || qeyVar.k() == 5) ? false : true;
        }
        if (qeyVar.e() == 1) {
            return (qeyVar.k() == 0 || qeyVar.k() == 2 || qeyVar.k() == 3) ? false : true;
        }
        return true;
    }

    public void d(String str, final UiCallback<String> uiCallback) {
        TaskPlatformApi taskPlatformApi = (TaskPlatformApi) Services.d("TaskPlatform", TaskPlatformApi.class);
        if (taskPlatformApi == null) {
            ReleaseLogUtil.e("Suggestion_IntPlanManager", "stopSmartTrainPlan taskPlatformApi null");
            return;
        }
        qfb qfbVar = new qfb();
        qfbVar.d(1);
        qfbVar.c(str);
        qfbVar.a(3);
        taskPlatformApi.updatePlanStatus(qfbVar, new ResponseCallback() { // from class: gmn
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i, Object obj) {
                gmi.e(uiCallback, i, (String) obj);
            }
        });
    }

    static /* synthetic */ void e(UiCallback uiCallback, int i, String str) {
        if (i != 0) {
            ReleaseLogUtil.a("Suggestion_IntPlanManager", "stopSmartTrainPlan fail status:", Integer.valueOf(i));
            RiskBiAnalytics.a(SmartPlanTypeEnum.SMART_NA_PLAN.getValue(), RiskBiAnalytics.SmartPlanRiskType.RISK_TYPE_STOP_PLAN, String.valueOf(i), "stopSmartTrainPlan fail");
            uiCallback.onFailure(i, "");
            return;
        }
        ReleaseLogUtil.d("Suggestion_IntPlanManager", "stopSmartTrainPlan success ");
        uiCallback.onSuccess("");
    }

    public void d(final UiCallback<gnf> uiCallback) {
        if (LoginInit.getInstance(BaseApplication.getContext()).isBrowseMode()) {
            LogUtil.j("Suggestion_IntPlanManager", "getMyCompetitions user no login");
            uiCallback.onFailure(20001, ResultUtil.c(20001));
        } else {
            ghw.b().getMyCompetitions(new gjx(), new DataCallback() { // from class: gmi.18
                @Override // com.huawei.basefitnessadvice.callback.DataCallback
                public void onFailure(int i, String str) {
                    ReleaseLogUtil.a("Suggestion_IntPlanManager", "getMyCompetitions errorCode ", Integer.valueOf(i), " errorInfo ", str);
                    OpAnalyticsUtil.getInstance().setEventOneErrorCode(OperationKey.HEALTH_APP_GET_MY_COMPETITION_60010010.value(), i);
                    uiCallback.onFailure(i, str);
                }

                @Override // com.huawei.basefitnessadvice.callback.DataCallback
                public void onSuccess(JSONObject jSONObject) {
                    if (jSONObject == null) {
                        LogUtil.j("Suggestion_IntPlanManager", "getMyCompetitions from cloud is null");
                        uiCallback.onSuccess(null);
                    } else {
                        LogUtil.a("Suggestion_IntPlanManager", "getMyCompetitions success ");
                        uiCallback.onSuccess((gnf) HiJsonUtil.d(jSONObject.toString(), gnf.class));
                    }
                }
            });
        }
    }

    public void e(long j, long j2, final UiCallback<gnf> uiCallback) {
        if (LoginInit.getInstance(BaseApplication.getContext()).isBrowseMode()) {
            LogUtil.j("Suggestion_IntPlanManager", "getMyCompetitionsByTime user no login");
            uiCallback.onFailure(20001, ResultUtil.c(20001));
        } else {
            ghw.b().getMyCompetitionsByTime(new gjx(), j, j2, new DataCallback() { // from class: gmi.17
                @Override // com.huawei.basefitnessadvice.callback.DataCallback
                public void onFailure(int i, String str) {
                    ReleaseLogUtil.a("Suggestion_IntPlanManager", "getMyCompetitions errorCode ", Integer.valueOf(i), " errorInfo ", str);
                    OpAnalyticsUtil.getInstance().setEventOneErrorCode(OperationKey.HEALTH_APP_GET_MY_COMPETITION_60010010.value(), i);
                    uiCallback.onFailure(i, str);
                }

                @Override // com.huawei.basefitnessadvice.callback.DataCallback
                public void onSuccess(JSONObject jSONObject) {
                    if (jSONObject == null) {
                        LogUtil.j("Suggestion_IntPlanManager", "getMyCompetitions from cloud is null");
                        uiCallback.onSuccess(null);
                    } else {
                        LogUtil.a("Suggestion_IntPlanManager", "getMyCompetitions success ");
                        uiCallback.onSuccess((gnf) HiJsonUtil.d(jSONObject.toString(), gnf.class));
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        if (f()) {
            ReleaseLogUtil.e("Suggestion_IntPlanManager", "syncClodNoAiFitPlan mIntPlan null true");
        } else if (IntPlan.PlanType.AI_FITNESS_PLAN.equals(this.f35692c.getPlanType())) {
            ReleaseLogUtil.e("Suggestion_IntPlanManager", "syncClodNoAiFitPlan send finish plan");
            gmy.e(IntPlan.PlanType.AI_FITNESS_PLAN.getType());
            gmy.c(this.f35692c.getPlanId());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i, JSONObject jSONObject, UiCallback<ghf> uiCallback) {
        if (i == IntPlan.PlanType.FIT_PLAN.getType()) {
            String strOptString = jSONObject.optString("fitnessPlan");
            if (!StringUtils.g(strOptString)) {
                this.f35692c = gnw.e((UserFitnessPlanInfo) new Gson().fromJson(strOptString, UserFitnessPlanInfo.class));
                g();
            }
            uiCallback.onSuccess(this.f35692c);
            return;
        }
        if (i == IntPlan.PlanType.AI_FITNESS_PLAN.getType()) {
            b(jSONObject.optJSONObject("intReducingPlan"));
            uiCallback.onSuccess(this.f35692c);
        } else if (i == IntPlan.PlanType.AI_RUN_PLAN.getType()) {
            d(jSONObject.optJSONObject("smartRunningPlan"), uiCallback);
        } else if (i == IntPlan.PlanType.RUN_PLAN.getType()) {
            Plan planA = gzm.a(jSONObject.optJSONObject("generalRunningPlan"), "planInfo");
            a(planA);
            uiCallback.onSuccess(this.f35692c);
            b(planA);
        }
    }

    private void g() {
        String strI = ift.i(this.f35692c.f35106a.getBeginDate() * 1000);
        String strI2 = ift.i(this.f35692c.f35106a.getEndDate() * 1000);
        LogUtil.a("Suggestion_IntPlanManager", "getFitnessStatFromLocal startTime = ", strI, " endTime = ", strI2);
        List<WorkoutRecord> workoutRecords = gls.b().getWorkoutRecords(this.f35692c.getPlanId(), strI, strI2);
        LogUtil.a("Suggestion_IntPlanManager", "getFitnessStatFromLocal workoutRecords size = ", Integer.valueOf(workoutRecords.size()));
        HashSet hashSet = new HashSet(workoutRecords.size());
        float fAcquireActualDistance = 0.0f;
        float fAcquireActualCalorie = 0.0f;
        float duration = 0.0f;
        for (int i = 0; i < workoutRecords.size(); i++) {
            WorkoutRecord workoutRecord = workoutRecords.get(i);
            if (workoutRecord.acquireWorkoutDate() != null) {
                hashSet.add(workoutRecord.acquireWorkoutDate());
            }
            fAcquireActualDistance = (float) (((double) fAcquireActualDistance) + (((double) workoutRecord.acquireActualDistance()) * 1000.0d));
            duration += workoutRecord.getDuration();
            fAcquireActualCalorie += workoutRecord.acquireActualCalorie();
            LogUtil.a("Suggestion_IntPlanManager", "workoutRecord actualDistance = ", Float.valueOf(workoutRecord.acquireActualDistance()), " duration = ", Integer.valueOf(workoutRecord.getDuration()), " actualCalorie = ", Float.valueOf(workoutRecord.acquireActualCalorie()));
        }
        this.f35692c.e(new ghj(StatInfo.STAT_TYPE_PUNCH_DAY, Integer.valueOf(hashSet.size())));
        this.f35692c.e(new ghj("distance", Float.valueOf(fAcquireActualDistance)));
        this.f35692c.e(new ghj("duration", Float.valueOf(duration)));
        this.f35692c.e(new ghj("calorie", Float.valueOf(fAcquireActualCalorie)));
        LogUtil.a("Suggestion_IntPlanManager", "getFitnessStatFromLocal distance = ", Float.valueOf(fAcquireActualDistance), " duration = ", Float.valueOf(duration), " calorie = ", Float.valueOf(fAcquireActualCalorie));
    }

    private void d(JSONObject jSONObject, UiCallback<ghf> uiCallback) {
        if (jSONObject == null) {
            return;
        }
        Plan planA = gzm.a(jSONObject, "planInfo");
        this.f35692c = gnw.e(planA);
        e(planA, uiCallback);
        b(planA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        this.f35692c = ghf.c((IntPlanBean) new Gson().fromJson(jSONObject.toString(), IntPlanBean.class));
        j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(final Plan plan, final UiCallback<ghf> uiCallback) {
        if (plan == null) {
            LogUtil.j("Suggestion_IntPlanManager", "getRunStatFromLocal plan is null.");
            return;
        }
        long startTime = plan.getStartTime() * 1000;
        long endTime = plan.getEndTime() * 1000;
        LogUtil.a("Suggestion_IntPlanManager", "getRunStatFromLocal startTime = ", Long.valueOf(startTime), " endTime = ", Long.valueOf(endTime));
        bug.c().c(startTime, endTime, new DataCallback() { // from class: gmi.22
            @Override // com.huawei.basefitnessadvice.callback.DataCallback
            public void onFailure(int i, String str) {
                LogUtil.e("Suggestion_IntPlanManager", "getOutPlanRunData failure errorCode = ", Integer.valueOf(i), " errorInfo = ", str);
                gmi.this.d((JSONObject) null, plan, (UiCallback<ghf>) uiCallback);
            }

            @Override // com.huawei.basefitnessadvice.callback.DataCallback
            public void onSuccess(JSONObject jSONObject) {
                LogUtil.a("Suggestion_IntPlanManager", "getOutPlanRunData success data = ", jSONObject);
                gmi.this.d(jSONObject, plan, (UiCallback<ghf>) uiCallback);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(JSONObject jSONObject, Plan plan, UiCallback<ghf> uiCallback) {
        float fAcquireActualDistance;
        float duration;
        float fAcquireActualCalorie = 0.0f;
        if (jSONObject != null) {
            double d = 0.0f;
            fAcquireActualDistance = (float) (jSONObject.optDouble("distance") + d);
            duration = (float) (jSONObject.optDouble("duration") + d);
            fAcquireActualCalorie = (float) (d + jSONObject.optDouble("calorie"));
        } else {
            fAcquireActualDistance = 0.0f;
            duration = 0.0f;
        }
        String strE = ift.e(plan.getStartTime() * 1000, ift.b(plan.getTimeZone()));
        String strE2 = ift.e(plan.getEndTime() * 1000, ift.b(plan.getTimeZone()));
        LogUtil.a("Suggestion_IntPlanManager", "addPlanRunData startTime = ", strE, " endTime = ", strE2);
        List<WorkoutRecord> workoutRecords = gls.b().getWorkoutRecords(plan.acquireId(), strE, strE2);
        LogUtil.a("Suggestion_IntPlanManager", "addPlanRunData workoutRecords size = ", Integer.valueOf(workoutRecords.size()));
        for (int i = 0; i < workoutRecords.size(); i++) {
            WorkoutRecord workoutRecord = workoutRecords.get(i);
            if (workoutRecord.isRunWorkout()) {
                LogUtil.a("Suggestion_IntPlanManager", "is run workout.", workoutRecord.acquireWorkoutName(), workoutRecord.acquireWorkoutId());
            } else {
                fAcquireActualDistance = (float) (((double) fAcquireActualDistance) + (((double) workoutRecord.acquireActualDistance()) * 1000.0d));
                duration += workoutRecord.getDuration();
                fAcquireActualCalorie += workoutRecord.acquireActualCalorie();
                LogUtil.a("Suggestion_IntPlanManager", "workoutRecord actualDistance = ", Float.valueOf(workoutRecord.acquireActualDistance()), " duration = ", Integer.valueOf(workoutRecord.getDuration()), " actualCalorie = ", Float.valueOf(workoutRecord.acquireActualCalorie()));
            }
        }
        if (!f()) {
            this.f35692c.e(new ghj("distance", Float.valueOf(fAcquireActualDistance)));
            this.f35692c.e(new ghj("duration", Float.valueOf(duration)));
            this.f35692c.e(new ghj("calorie", Float.valueOf(fAcquireActualCalorie)));
            LogUtil.a("Suggestion_IntPlanManager", "addPlanRunData distance = ", Float.valueOf(fAcquireActualDistance), " duration = ", Float.valueOf(duration), " calorie = ", Float.valueOf(fAcquireActualCalorie));
        } else {
            LogUtil.e("Suggestion_IntPlanManager", "addPlanRunData mIntPlan == null");
        }
        uiCallback.onSuccess(this.f35692c);
    }

    private void a(Plan plan) {
        if (plan == null) {
            LogUtil.j("Suggestion_IntPlanManager", "convertOldRunningPlan plan is null.");
            return;
        }
        ghf ghfVarC = ghf.c();
        ghfVarC.b(plan);
        ghn ghnVar = new ghn();
        ghnVar.h(plan.acquireId());
        ghnVar.d(IntPlan.PlanType.RUN_PLAN);
        ghfVarC.c(ghnVar);
        ghm ghmVar = new ghm();
        ghmVar.b(plan.getStartTime());
        ghmVar.d(plan.getEndTime());
        ghfVarC.e(ghmVar);
        ghfVarC.e(new ghj("progress", Float.valueOf(0.0f)));
        this.f35692c = ghfVarC;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Plan plan) {
        String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011);
        if (accountInfo != null) {
            gls.b().syncLocalAndCloud(accountInfo, plan);
        } else {
            LogUtil.e("Suggestion_IntPlanManager", "syncLocalAndCloud userId == null");
        }
    }

    public void c(final IntPlanBean intPlanBean, final UiCallback<IntPlan> uiCallback) {
        if (!f()) {
            uiCallback.onFailure(this.e, -1, "createPlan error with a current plan");
            return;
        }
        if (intPlanBean.getMetaInfo() == null) {
            uiCallback.onFailure(this.e, -1, "INVALID META INFO");
        }
        List<FitnessPackageInfo> listB = gms.a().b(intPlanBean.getMetaInfo().getPlanType());
        if (listB != null && listB.size() > 0) {
            ghw.b().createIntPlan(intPlanBean, new DataCallback() { // from class: gmi.23
                @Override // com.huawei.basefitnessadvice.callback.DataCallback
                public void onFailure(int i, String str) {
                    ReleaseLogUtil.a("Suggestion_IntPlanManager", "createPlan fail with errorCode ", Integer.valueOf(i));
                    uiCallback.onFailure(gmi.this.e, i, str);
                }

                @Override // com.huawei.basefitnessadvice.callback.DataCallback
                public void onSuccess(JSONObject jSONObject) {
                    if (jSONObject == null) {
                        uiCallback.onFailure(gmi.this.e, -1, "create plan null");
                        return;
                    }
                    JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("intPlan");
                    if (jSONObjectOptJSONObject == null) {
                        uiCallback.onFailure(gmi.this.e, -1, "create plan null");
                        return;
                    }
                    IntPlanBean intPlanBean2 = (IntPlanBean) new Gson().fromJson(jSONObjectOptJSONObject.toString(), IntPlanBean.class);
                    ReleaseLogUtil.d("Suggestion_IntPlanManager", "createPlan success with data", jSONObject);
                    gmi.this.f35692c = ghf.c(intPlanBean2);
                    gmi.this.j();
                    if (gmi.this.f35692c.f35106a != null) {
                        glq.c(gmi.this.f35692c, (Boolean) true, gmi.this.f35692c.f35106a.getRemindTime());
                    }
                    uiCallback.onSuccess(gmi.this.e, gmi.this.f35692c);
                    btq.e().e("PLAN_CREATE");
                    btw.e(gmi.this.f35692c, "5", 0, 1, 0);
                    if (intPlanBean.getTemp() == 1) {
                        gmi.this.e();
                        ReleaseLogUtil.d("Suggestion_IntPlanManager", "intPlanBean getTemp null");
                    }
                }
            });
        } else {
            ReleaseLogUtil.a("Suggestion_IntPlanManager", "createPlan no plan in plan list");
            uiCallback.onFailure(this.e, -1, "no this planType in all package list");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        d(ped.a(c()));
        try {
            if (this.f35692c.getGoal("weight") != null) {
                ghd ghdVar = new ghd();
                ghdVar.e("weight");
                ghdVar.d(Float.valueOf(Float.parseFloat(this.f35692c.getGoal("weight").getGoalDst().toString())));
                this.f35692c.c(ghdVar);
            }
        } catch (NumberFormatException unused) {
            LogUtil.e("Suggestion_IntPlanManager", "initIntPlan get goal fail");
        }
        LogUtil.a("Suggestion_IntPlanManager", "initIntPlan success!!");
    }

    public void b(final peb pebVar, final UiCallback<String> uiCallback) {
        if (f() || pebVar.e() == null || !pebVar.e().equals(this.f35692c.getPlanId())) {
            return;
        }
        ghw.b().updateAction(pebVar, new DataCallback() { // from class: gmi.21
            @Override // com.huawei.basefitnessadvice.callback.DataCallback
            public void onFailure(int i, String str) {
                ReleaseLogUtil.a("Suggestion_IntPlanManager", "updateAction fail!!");
                uiCallback.onFailure(gmi.this.e, i, str);
            }

            @Override // com.huawei.basefitnessadvice.callback.DataCallback
            public void onSuccess(JSONObject jSONObject) {
                gmi.this.d(jSONObject, pebVar, (UiCallback<String>) uiCallback);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(JSONObject jSONObject, peb pebVar, UiCallback<String> uiCallback) {
        if (jSONObject == null) {
            uiCallback.onSuccess(this.e, "EMPTY_DATA");
            return;
        }
        int iD = pebVar.d();
        int iC = pebVar.c();
        for (ghe gheVar : this.f35692c.b()) {
            if (gheVar.getWeekOrder() == iD) {
                for (ghi ghiVar : gheVar.e()) {
                    if (ghiVar.getDayOrder() == iC) {
                        List<ghg> listA = ghiVar.a();
                        if (pebVar.a() == 0) {
                            for (pdm pdmVar : pebVar.b()) {
                                if (listA.size() < 3) {
                                    ghg ghgVar = new ghg();
                                    ghgVar.e(pdmVar.d());
                                    ghgVar.c(IntAction.ActionType.getActionType(pdmVar.c()));
                                    listA.add(ghgVar);
                                }
                            }
                        } else if (1 == pebVar.a()) {
                            ArrayList arrayList = new ArrayList();
                            for (pdm pdmVar2 : pebVar.b()) {
                                for (ghg ghgVar2 : listA) {
                                    if (pdmVar2.d().equals(ghgVar2.getActionId()) && pdmVar2.c() == ghgVar2.getActionType().getType()) {
                                        arrayList.add(ghgVar2);
                                    }
                                }
                            }
                            listA.removeAll(arrayList);
                        } else {
                            LogUtil.e("Suggestion_IntPlanManager", "PlanActionOpeType error");
                        }
                    }
                }
            }
        }
        btq.e().e("PLAN_UPDATE");
        LogUtil.a("Suggestion_IntPlanManager", "updateAction onSuccess", jSONObject.toString());
        uiCallback.onSuccess(this.e, jSONObject.toString());
    }

    public void e(int i, String str, int i2, UiCallback<String> uiCallback) {
        if (StringUtils.g(str) || uiCallback == null) {
            ReleaseLogUtil.a("Suggestion_IntPlanManager", "stopPlan invalid callback, planId is null or empty");
            return;
        }
        ReleaseLogUtil.d("Suggestion_IntPlanManager", "finish planId : " + str);
        glw.c().e();
        if (f() || !this.f35692c.getPlanId().equals(str) || IntPlan.PlanType.RUN_PLAN.equals(this.f35692c.getPlanType())) {
            if (i2 == 0) {
                gls.b().finishPlan(str, uiCallback);
                e();
                return;
            } else {
                ReleaseLogUtil.a("Suggestion_IntPlanManager", "stopPlan current plan is null or planId is not current plan");
                return;
            }
        }
        c cVar = new c(i, uiCallback);
        if (this.f35692c.getPlanType() == IntPlan.PlanType.AI_RUN_PLAN) {
            gls.b().finishPlan(str, cVar);
            return;
        }
        if (this.f35692c.getPlanType() == IntPlan.PlanType.FIT_PLAN && this.f35692c.getMetaInfo().getDisplayStyle() == 2) {
            e(str, cVar);
        } else if (this.f35692c.getPlanType() == IntPlan.PlanType.AI_FITNESS_PLAN || this.f35692c.getPlanType() == IntPlan.PlanType.FIT_PLAN) {
            d(new gki.a().a(str).b(this.f35692c.getPlanType().getType()).e(), cVar);
        } else {
            LogUtil.e("Suggestion_IntPlanManager", "current planType is not support");
        }
    }

    private void e(final String str, final UiCallback<String> uiCallback) {
        new gmz().d(str, new UiCallback<pdx>() { // from class: gmi.25
            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            public void onFailure(int i, String str2) {
                ReleaseLogUtil.e("Suggestion_IntPlanManager", "buildFinalPlanReport onFailure errorCode: ", Integer.valueOf(i), "errorInfo: ", str2);
                if (i == 20004 || i == 200019) {
                    uiCallback.onSuccess(gmi.this.e, "EMPTY_DATA");
                } else {
                    uiCallback.onFailure(gmi.this.e, i, str2);
                }
            }

            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public void onSuccess(pdx pdxVar) {
                gmi.this.d(new gki.a().a(str).b(gmi.this.f35692c.getPlanType().getType()).e(), (UiCallback<String>) uiCallback);
            }
        });
    }

    class c extends UiCallback<String> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final UiCallback<String> f35730c;
        private final int d;

        c(int i, UiCallback<String> uiCallback) {
            this.d = i;
            this.f35730c = uiCallback;
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public void onFailure(int i, String str) {
            LogUtil.e("Suggestion_IntPlanManager", "finishPlan fail errorInfo", str);
            this.f35730c.onFailure(i, str);
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(String str) {
            if (!gmi.this.f()) {
                StatInfo stat = gmi.this.f35692c.getStat("progress");
                float fFloatValue = stat == null ? 0.0f : ((Float) stat.getValue()).floatValue();
                if (gmi.this.f35692c.getPlanType() == IntPlan.PlanType.AI_RUN_PLAN) {
                    idy.c(gmi.this.f35692c.getMetaInfo().getName(), 0, String.valueOf(fFloatValue), gmi.this.f35692c.getPlanId());
                } else {
                    idy.c(gmi.this.f35692c.getMetaInfo().getName(), 1, String.valueOf(fFloatValue), gmi.this.f35692c.getPlanId());
                }
                HashMap map = new HashMap(3);
                map.put("click", 1);
                map.put("type", gmi.this.f35692c.getPlanType() == null ? IntPlan.PlanType.NA_PLAN : Integer.valueOf(gmi.this.f35692c.getPlanType().getType()));
                map.put("endType", Integer.valueOf(this.d));
                lmf.d().c(BaseApplication.getContext(), AnalyticsValue.INT_PLAN_2030078.value(), map, 0);
                gmi.this.e();
            }
            btq.e().e("PLAN_DELETE");
            LogUtil.a("Suggestion_IntPlanManager", "finishPlan success");
            this.f35730c.onSuccess(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(final gki gkiVar, final UiCallback<String> uiCallback) {
        ghw.b().stopIntPlan(gkiVar, new DataCallback() { // from class: gmi.24
            @Override // com.huawei.basefitnessadvice.callback.DataCallback
            public void onFailure(int i, String str) {
                ReleaseLogUtil.a("Suggestion_IntPlanManager", "stopIntPlan fail ", Integer.valueOf(i), " errorInfo", str);
                if (i == 20004 || i == 200019) {
                    uiCallback.onSuccess(gmi.this.e, "EMPTY_DATA");
                } else {
                    uiCallback.onFailure(gmi.this.e, i, str);
                }
            }

            @Override // com.huawei.basefitnessadvice.callback.DataCallback
            public void onSuccess(JSONObject jSONObject) {
                gmy.c(gkiVar.d());
                gmy.e(gkiVar.c());
                if (jSONObject == null) {
                    ReleaseLogUtil.a("Suggestion_IntPlanManager", "stopIntPlan data is null.");
                    uiCallback.onSuccess(gmi.this.e, "EMPTY_DATA");
                } else {
                    LogUtil.a("Suggestion_IntPlanManager", "stopIntPlan success ", jSONObject);
                    glq.e(gmi.this.f35692c, false, -1);
                    uiCallback.onSuccess(gmi.this.e, jSONObject.toString());
                }
            }
        });
    }

    public void c(UserInfoBean userInfoBean, final String str, final UiCallback<IntPlan> uiCallback) {
        if (f() || !this.f35692c.getPlanId().equals(str)) {
            uiCallback.onFailure(this.e, -1, "updatePlan plan is null or invalid planId");
            return;
        }
        if (this.f35692c.getPlanType() == IntPlan.PlanType.AI_FITNESS_PLAN) {
            UserProfileBean userProfileBean = new UserProfileBean();
            userProfileBean.setGender(userInfoBean.getSex());
            userProfileBean.setWeight(userInfoBean.getWeight());
            userProfileBean.setAge(userInfoBean.getAge());
            userProfileBean.setHeight(userInfoBean.getHeight());
            LogUtil.a("Suggestion_IntPlanManager", "updatePlan with data", new Gson().toJson(userProfileBean));
            e(str, userProfileBean, uiCallback);
            return;
        }
        gls.b().updatePlan(userInfoBean, btw.h(this.f35692c), new UiCallback<Plan>() { // from class: gmi.2
            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            public void onFailure(int i, String str2) {
                uiCallback.onFailure(gmi.this.e, i, str2);
            }

            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onSuccess(Plan plan) {
                if (plan != null) {
                    ReleaseLogUtil.d("Suggestion_IntPlanManager", "updateAIRunPlan success");
                    StatInfo stat = !gmi.this.f() ? gmi.this.f35692c.getStat("progress") : null;
                    gmi.this.f35692c = gnw.e(plan);
                    if (stat != null && (stat instanceof ghj)) {
                        gmi.this.f35692c.e((ghj) stat);
                    }
                    btw.t(gmi.this.f35692c);
                    glw.c().e(str);
                    gmi.this.e(plan, new UiCallback<ghf>() { // from class: gmi.2.2
                        @Override // com.huawei.basefitnessadvice.callback.UiCallback
                        public void onFailure(int i, String str2) {
                            btq.e().e("PLAN_SWITCH");
                            uiCallback.onSuccess(gmi.this.e, gmi.this.f35692c);
                        }

                        @Override // com.huawei.basefitnessadvice.callback.UiCallback
                        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                        public void onSuccess(ghf ghfVar) {
                            btq.e().e("PLAN_SWITCH");
                            uiCallback.onSuccess(gmi.this.e, gmi.this.f35692c);
                        }
                    });
                    return;
                }
                ReleaseLogUtil.e("Suggestion_IntPlanManager", "updateAIRunPlan data is null");
                uiCallback.onFailure(gmi.this.e, ResultUtil.ResultCode.PARAMETER_INVALID, "no plan exist");
            }
        });
    }

    private void e(String str, UserProfileBean userProfileBean, final UiCallback<IntPlan> uiCallback) {
        ghw.b().updateIntPlan(userProfileBean, str, this.f35692c.getPlanType().getType(), new DataCallback() { // from class: gmi.5
            @Override // com.huawei.basefitnessadvice.callback.DataCallback
            public void onFailure(int i, String str2) {
                ReleaseLogUtil.a("Suggestion_IntPlanManager", "updatePlan fail ", str2);
                uiCallback.onFailure(gmi.this.e, i, str2);
            }

            @Override // com.huawei.basefitnessadvice.callback.DataCallback
            public void onSuccess(JSONObject jSONObject) {
                if (jSONObject == null) {
                    uiCallback.onFailure(gmi.this.e, ResultUtil.ResultCode.PARAMETER_INVALID, "no plan exist");
                    return;
                }
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("intPlan");
                if (jSONObjectOptJSONObject == null) {
                    uiCallback.onFailure(gmi.this.e, ResultUtil.ResultCode.PARAMETER_INVALID, "no plan exist");
                    return;
                }
                IntPlanBean intPlanBean = (IntPlanBean) new Gson().fromJson(jSONObjectOptJSONObject.toString(), IntPlanBean.class);
                LogUtil.a("Suggestion_IntPlanManager", "updatePlan success with data", jSONObject);
                glq.e(gmi.this.f35692c, false, -1);
                gmi.this.f35692c = ghf.c(intPlanBean);
                gmi.this.j();
                btw.t(gmi.this.f35692c);
                if (gmi.this.f35692c.f35106a != null) {
                    glq.c(gmi.this.f35692c, (Boolean) true, gmi.this.f35692c.f35106a.getRemindTime());
                }
                glw.c().h();
                btq.e().e("PLAN_SWITCH");
                uiCallback.onSuccess(gmi.this.e, gmi.this.f35692c);
            }
        });
    }

    public void e(String str, int i, int i2, String str2, final long j, final UiCallback<String> uiCallback) {
        final String str3 = "planReport:" + str + i2;
        final String str4 = "planReportTime:" + str + i2;
        buh.d(str3, str2);
        buh.d(str4, String.valueOf(j));
        ghw.b().updateIntPlanReport(str, i, i2, str2, j, new DataCallback() { // from class: gmi.4
            @Override // com.huawei.basefitnessadvice.callback.DataCallback
            public void onFailure(int i3, String str5) {
                uiCallback.onFailure(gmi.this.e, i3, str5);
            }

            @Override // com.huawei.basefitnessadvice.callback.DataCallback
            public void onSuccess(JSONObject jSONObject) {
                buh.c(str3);
                buh.c(str4);
                if (jSONObject != null) {
                    uiCallback.onSuccess(gmi.this.e, jSONObject.toString());
                } else {
                    LogUtil.e("Suggestion_IntPlanManager", "updatePlanReport onSuccess data is null.");
                    uiCallback.onSuccess(gmi.this.e, "EMPTY_DATA");
                }
                if (gmi.this.f()) {
                    return;
                }
                gmi.this.f35692c.f35106a.g(j);
            }
        });
    }

    public void a(final String str, final int i, final int i2, final UiCallback<String> uiCallback) {
        ghw.b().getIntPlanReport(str, i, i2, new DataCallback() { // from class: gmi.3
            @Override // com.huawei.basefitnessadvice.callback.DataCallback
            public void onFailure(int i3, String str2) {
                uiCallback.onFailure(gmi.this.e, i3, str2);
            }

            @Override // com.huawei.basefitnessadvice.callback.DataCallback
            public void onSuccess(JSONObject jSONObject) {
                long j;
                if (jSONObject == null) {
                    ReleaseLogUtil.a("Suggestion_IntPlanManager", "getPlanReport onSuccess data is null.");
                    uiCallback.onSuccess(gmi.this.e, "EMPTY_DATA");
                    return;
                }
                LogUtil.a("Suggestion_IntPlanManager", "getPlanReport:", jSONObject.toString());
                String str2 = "planReport:" + str + i2;
                String str3 = "planReportTime:" + str + i2;
                String strE = buh.e(str3);
                try {
                    j = jSONObject.getLong("reportUpdateTime");
                } catch (JSONException e2) {
                    ReleaseLogUtil.a("Suggestion_IntPlanManager", "getPlanReport error", ExceptionUtils.c(e2));
                    j = 0;
                }
                if (StringUtils.a(strE) && CommonUtil.i(strE) > j) {
                    String strE2 = buh.e(str2);
                    gmi.this.e(str, i, i2, strE2, CommonUtil.i(strE), new UiCallback<String>() { // from class: gmi.3.1
                        @Override // com.huawei.basefitnessadvice.callback.UiCallback
                        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                        public void onSuccess(String str4) {
                        }

                        @Override // com.huawei.basefitnessadvice.callback.UiCallback
                        public void onFailure(int i3, String str4) {
                            ReleaseLogUtil.a("Suggestion_IntPlanManager", "updatePlanReport errorCode:", Integer.valueOf(i3), " errorInfo:", str4);
                        }
                    });
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        ReleaseLogUtil.d("Suggestion_IntPlanManager", "putPlanReport");
                        jSONObject2.put("report", strE2);
                    } catch (JSONException e3) {
                        ReleaseLogUtil.a("Suggestion_IntPlanManager", "putPlanReport error ", ExceptionUtils.c(e3));
                    }
                    uiCallback.onSuccess(gmi.this.e, jSONObject2.toString());
                    return;
                }
                buh.c(str2);
                buh.c(str3);
                uiCallback.onSuccess(gmi.this.e, jSONObject.toString());
            }
        });
    }

    public void b(String str, int i, final int i2, final String str2, final UiCallback<String> uiCallback) {
        ghw.b().updatePlanInfo(str, i, String.valueOf(i2), str2, new DataCallback() { // from class: gmi.9
            @Override // com.huawei.basefitnessadvice.callback.DataCallback
            public void onFailure(int i3, String str3) {
                uiCallback.onFailure(gmi.this.e, i3, str3);
            }

            @Override // com.huawei.basefitnessadvice.callback.DataCallback
            public void onSuccess(JSONObject jSONObject) {
                if (i2 == 2 && StringUtils.j(str2)) {
                    try {
                        glq.e(gmi.this.f35692c, null, Integer.parseInt(str2));
                    } catch (NumberFormatException e2) {
                        LogUtil.e("Suggestion_IntPlanManager", "updatePlanInfo() exception: ", LogAnonymous.b(e2));
                    }
                }
                if (jSONObject != null) {
                    uiCallback.onSuccess(gmi.this.e, jSONObject.toString());
                } else {
                    ReleaseLogUtil.a("Suggestion_IntPlanManager", "updatePlanInfo onSuccess data is null.");
                    uiCallback.onSuccess(gmi.this.e, "EMPTY_DATA");
                }
            }
        });
    }

    public void e(String str, int i, int i2) {
        if (f()) {
            return;
        }
        ghg ghgVarB = gnw.b(this.f35692c, str, i, i2);
        if (ghgVarB != null) {
            ghgVarB.a(1);
            e(i, i2);
        }
        d(c());
    }

    private void e(int i, int i2) {
        List<ghg> listE;
        if (f() || (listE = gnw.e(this.f35692c, i, i2)) == null) {
            return;
        }
        Iterator<ghg> it = listE.iterator();
        while (it.hasNext()) {
            if (it.next().getPunchFlag() == 0) {
                return;
            }
        }
        ghi ghiVarC = gnw.c(this.f35692c, i, i2);
        if (ghiVarC != null) {
            ghiVarC.c(1);
        }
    }

    public int c(int i) {
        if (f() || this.f35692c.getPlanId() == null) {
            if (i == 0) {
                return gls.b().getRemindTime();
            }
            LogUtil.e("Suggestion_IntPlanManager", "getRemindTime current plan is null");
            return 0;
        }
        if (this.f35692c.getPlanType().equals(IntPlan.PlanType.AI_RUN_PLAN)) {
            return gls.b().getRemindTime();
        }
        if (this.f35692c.getPlanType().equals(IntPlan.PlanType.AI_FITNESS_PLAN) || this.f35692c.getPlanType().equals(IntPlan.PlanType.FIT_PLAN)) {
            return glq.d();
        }
        LogUtil.j("Suggestion_IntPlanManager", "getRemindTime planType is not support");
        return 0;
    }

    public boolean e(int i) {
        if (f() || this.f35692c.getPlanId() == null) {
            if (i == 0) {
                return gls.b().isOpenRemind();
            }
            LogUtil.e("Suggestion_IntPlanManager", "getRemindTime current plan is null");
            return false;
        }
        if (this.f35692c.getPlanType().equals(IntPlan.PlanType.AI_RUN_PLAN)) {
            return gls.b().isOpenRemind();
        }
        if (this.f35692c.getPlanType().equals(IntPlan.PlanType.AI_FITNESS_PLAN) || this.f35692c.getPlanType().equals(IntPlan.PlanType.FIT_PLAN)) {
            return glq.a();
        }
        LogUtil.j("Suggestion_IntPlanManager", "getRemindTime planType is not support");
        return false;
    }

    public void d(final boolean z, final int i, int i2) {
        LogUtil.d("Suggestion_IntPlanManager", "remindTime:" + i + ";oldPlanType:" + i2);
        if (f() || this.f35692c.getPlanId() == null) {
            if (i2 == 0) {
                gls.b().setExerciseRemind(z, i);
                return;
            } else {
                LogUtil.e("Suggestion_IntPlanManager", "updateRemindTime mIntPlan is null");
                return;
            }
        }
        UiCallback<String> uiCallback = new UiCallback<String>() { // from class: gmi.7
            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            public void onFailure(int i3, String str) {
                LogUtil.e("Suggestion_IntPlanManager", "updateRemindTime fail errorInfo", str);
            }

            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public void onSuccess(String str) {
                if (gmi.this.f35692c.f35106a != null) {
                    gmi.this.f35692c.f35106a.e(z ? i : -1L);
                }
                LogUtil.d("Suggestion_IntPlanManager", "updateRemindTime success");
            }
        };
        if (this.f35692c.getPlanType() == IntPlan.PlanType.AI_RUN_PLAN) {
            gls.b().setExerciseRemind(z, i);
            uiCallback.onSuccess(null);
        } else if (this.f35692c.getPlanType() == IntPlan.PlanType.AI_FITNESS_PLAN || this.f35692c.getPlanType() == IntPlan.PlanType.FIT_PLAN) {
            b(this.f35692c.getPlanId(), this.f35692c.getPlanType().getType(), 2, z ? String.valueOf(i) : "-1", uiCallback);
        } else {
            LogUtil.j("Suggestion_IntPlanManager", "updateRemindTime remind planType not support");
        }
    }

    public void a(String str, List<Integer> list, final List<Integer> list2, final UiCallback<String> uiCallback) {
        if (f() || this.f35692c.getPlanId() == null || !this.f35692c.getPlanId().equals(str)) {
            LogUtil.e("Suggestion_IntPlanManager", "updatePlanDate current plan is null or planId is not current plan");
            uiCallback.onFailure(this.e, -1, "updatePlanDate error with plan is null or planId is not current plan");
            return;
        }
        UiCallback<String> uiCallback2 = new UiCallback<String>() { // from class: gmi.10
            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            public void onFailure(int i, String str2) {
                ReleaseLogUtil.a("Suggestion_IntPlanManager", "updatePlanDate fail errorInfo", str2);
                uiCallback.onFailure(i, str2);
            }

            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public void onSuccess(String str2) {
                if (gmi.this.f35692c.f35107b != null) {
                    gmi.this.f35692c.f35107b.d(gmi.this.b((List<Integer>) list2));
                    ghn ghnVar = gmi.this.f35692c.f35107b;
                    List list3 = list2;
                    ghnVar.c(list3 == null ? 0 : list3.size());
                }
                ReleaseLogUtil.d("Suggestion_IntPlanManager", "updatePlanDate success");
                uiCallback.onSuccess(str2);
            }
        };
        if (this.f35692c.getPlanType() == IntPlan.PlanType.AI_RUN_PLAN) {
            gmu.d().updatePlanDate(str, list, list2, uiCallback2);
        } else if (this.f35692c.getPlanType() == IntPlan.PlanType.AI_FITNESS_PLAN) {
            b(str, IntPlan.PlanType.AI_FITNESS_PLAN.getType(), 1, b(list2), uiCallback2);
        } else {
            LogUtil.j("Suggestion_IntPlanManager", "updatePlanDate planType not support");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String b(List<Integer> list) {
        if (list == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer(16);
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            stringBuffer.append(String.valueOf(it.next()));
            stringBuffer.append(",");
        }
        if (stringBuffer.toString().contains(",")) {
            stringBuffer.deleteCharAt(stringBuffer.lastIndexOf(","));
        }
        return stringBuffer.toString();
    }

    public void c(pec pecVar, UiCallback<String> uiCallback) {
        if (f() || this.f35692c.getPlanId() == null || !this.f35692c.getPlanId().equals(pecVar.c())) {
            LogUtil.e("Suggestion_IntPlanManager", "postFeedback current plan is null or planId is not current plan");
            uiCallback.onSuccess(this.e, null);
            return;
        }
        long jE = pecVar.e();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(jE);
        int iB = ift.b(calendar.get(7));
        int iE = btw.e(this.f35692c, jE);
        ReleaseLogUtil.d("Suggestion_IntPlanManager", "postFeedBack weekNumber:", Integer.valueOf(iE), "dayNumber:", Integer.valueOf(iB), " planTime:", Long.valueOf(jE));
        pecVar.e(iE);
        pecVar.c(iB);
        if (this.f35692c.getPlanType() == IntPlan.PlanType.AI_RUN_PLAN) {
            gmu.d().postFeedback(pecVar, uiCallback);
        } else if (this.f35692c.getPlanType() == IntPlan.PlanType.AI_FITNESS_PLAN) {
            d(pecVar, uiCallback);
        } else {
            uiCallback.onSuccess(this.e, null);
            LogUtil.j("Suggestion_IntPlanManager", "postFeedback planType not support");
        }
    }

    private void d(pec pecVar, final UiCallback<String> uiCallback) {
        ghw.b().postIntFeedback(pecVar, new DataCallback() { // from class: gmi.8
            @Override // com.huawei.basefitnessadvice.callback.DataCallback
            public void onFailure(int i, String str) {
                ReleaseLogUtil.a("Suggestion_IntPlanManager", "postIntFeedback fail ", Integer.valueOf(i), " errorInfo", str);
                uiCallback.onFailure(gmi.this.e, i, str);
            }

            @Override // com.huawei.basefitnessadvice.callback.DataCallback
            public void onSuccess(JSONObject jSONObject) {
                if (jSONObject == null) {
                    ReleaseLogUtil.a("Suggestion_IntPlanManager", "postIntFeedback onSuccess data is null.");
                    uiCallback.onSuccess(gmi.this.e, "EMPTY_DATA");
                } else {
                    LogUtil.a("Suggestion_IntPlanManager", "postIntFeedback success ", jSONObject);
                    uiCallback.onSuccess(gmi.this.e, jSONObject.toString());
                }
            }
        });
    }

    public void b(int i, IntPlanBean intPlanBean, final UiCallback<String> uiCallback) {
        ghw.b().generateReport(i, intPlanBean, new DataCallback() { // from class: gmi.6
            @Override // com.huawei.basefitnessadvice.callback.DataCallback
            public void onFailure(int i2, String str) {
                uiCallback.onFailure(gmi.this.e, i2, str);
            }

            @Override // com.huawei.basefitnessadvice.callback.DataCallback
            public void onSuccess(JSONObject jSONObject) {
                if (jSONObject == null) {
                    uiCallback.onSuccess(gmi.this.e, "EMPTY_DATA");
                } else {
                    uiCallback.onSuccess(gmi.this.e, jSONObject.optString("reviewResult"));
                }
            }
        });
    }

    public float c() {
        return gnw.b(this.f35692c);
    }

    public void d(float f) {
        if (f()) {
            return;
        }
        this.f35692c.e(new ghj("progress", Float.valueOf(f)));
    }

    public void b(boolean z) {
        if (!f() && z) {
            e();
        }
        btq.e().e("PLAN_SWITCH");
    }

    public void d(final String str, final pdr pdrVar) {
        b(new UiCallback<ghf>() { // from class: gmi.14
            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            public void onFailure(int i, String str2) {
                gmi.this.e(str, pdrVar);
            }

            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onSuccess(ghf ghfVar) {
                gmi.this.e(str, pdrVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(final String str, final pdr pdrVar) {
        if (f()) {
            LogUtil.j("Suggestion_IntPlanManager", "updateDayRecord plan not exist.");
        } else if (btw.n(this.f35692c)) {
            ((UserProfileMgrApi) Services.b("HWUserProfileMgr", UserProfileMgrApi.class)).getUserInfo(new BaseResponseCallback() { // from class: gmf
                @Override // com.huawei.health.userprofilemgr.model.BaseResponseCallback
                public final void onResponse(int i, Object obj) {
                    this.f35689a.e(pdrVar, str, i, (UserInfomation) obj);
                }
            });
        } else if (b(this.f35692c, pdrVar)) {
            gls.b().updateDayRecord(str, this.f35692c, pdrVar);
        }
    }

    /* synthetic */ void e(final pdr pdrVar, final String str, int i, UserInfomation userInfomation) {
        if (i != 0 || userInfomation == null) {
            LogUtil.j("Suggestion_IntPlanManager", "initUserInfo failed, errorCode = ", Integer.valueOf(i));
        } else {
            c(c(userInfomation), this.f35692c.getPlanId(), new UiCallback<IntPlan>() { // from class: gmi.15
                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                public void onFailure(int i2, String str2) {
                    LogUtil.e("Suggestion_IntPlanManager", "updateDayRecord updatePlan fail.");
                    gmi gmiVar = gmi.this;
                    if (gmiVar.b(gmiVar.f35692c, pdrVar)) {
                        gls.b().updateDayRecord(str, gmi.this.f35692c, pdrVar);
                    }
                }

                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
                public void onSuccess(IntPlan intPlan) {
                    gmi gmiVar = gmi.this;
                    if (gmiVar.b(gmiVar.f35692c, pdrVar)) {
                        gls.b().updateDayRecord(str, gmi.this.f35692c, pdrVar);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(IntPlan intPlan, pdr pdrVar) {
        if (intPlan == null) {
            LogUtil.e("Suggestion_IntPlanManager", "intPlan=null");
            return false;
        }
        if (IntPlan.PlanType.AI_RUN_PLAN.equals(intPlan.getPlanType())) {
            return pdrVar.g() == 280 || pdrVar.g() == 264 || pdrVar.g() == 258 || pdrVar.g() == 227;
        }
        return IntPlan.PlanType.AI_FITNESS_PLAN.equals(intPlan.getPlanType()) && btw.g();
    }

    private static UserInfoBean c(UserInfomation userInfomation) {
        UserInfoBean userInfoBean = new UserInfoBean();
        userInfoBean.setSex(userInfomation.getGenderOrDefaultValue());
        userInfoBean.setAge(userInfomation.getAgeOrDefaultValue());
        userInfoBean.setHeight(userInfomation.getHeightOrDefaultValue());
        userInfoBean.setWeight((int) userInfomation.getWeightOrDefaultValue());
        return userInfoBean;
    }

    public void e(String str) {
        if (f()) {
            LogUtil.e("Suggestion_IntPlanManager", "deletePlanExerciseRecord mIntPlan == null");
        } else {
            ghw.b().deletePlanExerciseRecord(this.f35692c.getPlanType().getType(), this.f35692c.getPlanId(), str, new DataCallback() { // from class: gmi.12
                @Override // com.huawei.basefitnessadvice.callback.DataCallback
                public void onFailure(int i, String str2) {
                    ReleaseLogUtil.a("Suggestion_IntPlanManager", "deletePlanExerciseRecord fail:", str2);
                }

                @Override // com.huawei.basefitnessadvice.callback.DataCallback
                public void onSuccess(JSONObject jSONObject) {
                    ReleaseLogUtil.d("Suggestion_IntPlanManager", "deletePlanExerciseRecord Success");
                    glw.c().e();
                    btq.e().e("PLAN_UPDATE");
                }
            });
        }
    }

    public void e(ReplacePlanBean replacePlanBean, final UiCallback<Boolean> uiCallback) {
        ghw.b().replacePlanSchedule(replacePlanBean, new DataCallback() { // from class: gmi.13
            @Override // com.huawei.basefitnessadvice.callback.DataCallback
            public void onFailure(int i, String str) {
                ReleaseLogUtil.a("Suggestion_IntPlanManager", "replacePlanSchedule fail:", str);
                uiCallback.onFailure(i, str);
            }

            @Override // com.huawei.basefitnessadvice.callback.DataCallback
            public void onSuccess(JSONObject jSONObject) {
                ReleaseLogUtil.d("Suggestion_IntPlanManager", "replacePlanSchedule success:", jSONObject);
                uiCallback.onSuccess(true);
                glw.c().e();
                btq.e().e("PLAN_ADJUST");
            }
        });
    }

    public void e(LeavePlanCalendarBean leavePlanCalendarBean, final UiCallback<IntPlan> uiCallback) {
        ghw.b().leavePlan(leavePlanCalendarBean, new DataCallback() { // from class: gmi.19
            @Override // com.huawei.basefitnessadvice.callback.DataCallback
            public void onFailure(int i, String str) {
                ReleaseLogUtil.a("Suggestion_IntPlanManager", "leavePlan fail:", str);
                uiCallback.onFailure(i, str);
            }

            @Override // com.huawei.basefitnessadvice.callback.DataCallback
            public void onSuccess(JSONObject jSONObject) {
                ReleaseLogUtil.d("Suggestion_IntPlanManager", "leavePlan success:", jSONObject);
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("intPlan");
                if (jSONObjectOptJSONObject != null) {
                    gmi.this.b(jSONObjectOptJSONObject);
                    uiCallback.onSuccess(gmi.this.f35692c);
                    glw.c().e();
                    btq.e().e("PLAN_ADJUST");
                    return;
                }
                uiCallback.onFailure(-1, "leavePlan success but return plan null");
            }
        });
    }

    public void c(LeavePlanCalendarBean leavePlanCalendarBean, final UiCallback<IntPlan> uiCallback) {
        ghw.b().cancelLeave(leavePlanCalendarBean, new DataCallback() { // from class: gmi.16
            @Override // com.huawei.basefitnessadvice.callback.DataCallback
            public void onFailure(int i, String str) {
                ReleaseLogUtil.a("Suggestion_IntPlanManager", "cancelLeave fail:", str);
                uiCallback.onFailure(i, str);
            }

            @Override // com.huawei.basefitnessadvice.callback.DataCallback
            public void onSuccess(JSONObject jSONObject) {
                ReleaseLogUtil.d("Suggestion_IntPlanManager", "cancelLeave success:", jSONObject);
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("intPlan");
                if (jSONObjectOptJSONObject != null) {
                    gmi.this.b(jSONObjectOptJSONObject);
                    uiCallback.onSuccess(gmi.this.f35692c);
                    glw.c().e();
                    btq.e().e("PLAN_ADJUST");
                    return;
                }
                uiCallback.onFailure(-1, "cancelLeave success but return plan null");
            }
        });
    }

    public void d(LeavePlanCalendarBean leavePlanCalendarBean, final UiCallback<IntPlan> uiCallback) {
        ghw.b().updatePlanCalendar(leavePlanCalendarBean, new DataCallback() { // from class: gmi.20
            @Override // com.huawei.basefitnessadvice.callback.DataCallback
            public void onFailure(int i, String str) {
                ReleaseLogUtil.a("Suggestion_IntPlanManager", "updatePlanCalendar fail:", str);
                uiCallback.onFailure(i, str);
            }

            @Override // com.huawei.basefitnessadvice.callback.DataCallback
            public void onSuccess(JSONObject jSONObject) {
                ReleaseLogUtil.d("Suggestion_IntPlanManager", "updatePlanCalendar success:", jSONObject);
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("intPlan");
                if (jSONObjectOptJSONObject != null) {
                    gmi.this.b(jSONObjectOptJSONObject);
                    uiCallback.onSuccess(gmi.this.f35692c);
                    glw.c().e();
                    btq.e().e("PLAN_ADJUST");
                    return;
                }
                uiCallback.onFailure(-1, "updatePlanCalendar success but return plan null");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean f() {
        return this.f35692c == null || this.f35692c.h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        if (this.f35692c != null) {
            this.f35692c.e();
        }
    }

    public void d(String str) {
        gmy.c(str);
    }
}
