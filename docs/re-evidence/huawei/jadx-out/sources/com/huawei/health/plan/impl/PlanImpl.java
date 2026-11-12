package com.huawei.health.plan.impl;

import android.os.Looper;
import com.google.gson.GsonBuilder;
import com.huawei.basefitnessadvice.callback.DataCallback;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.basefitnessadvice.model.Plan;
import com.huawei.basefitnessadvice.model.PlanInfo;
import com.huawei.basefitnessadvice.model.PlanRecord;
import com.huawei.basefitnessadvice.model.intplan.IntPlan;
import com.huawei.basefitnessadvice.model.intplan.RecordData;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.plan.api.PlanApi;
import com.huawei.health.plan.model.FitnessPlanParams;
import com.huawei.health.plan.model.PlanStat;
import com.huawei.health.plan.model.PlanStatistics;
import com.huawei.health.plan.model.UserFitnessPlanInfo;
import com.huawei.health.plan.model.intplan.IntPlanBean;
import com.huawei.health.plan.model.intplan.LeavePlanCalendarBean;
import com.huawei.health.plan.model.intplan.ReplacePlanBean;
import com.huawei.health.sport.model.WorkoutRecord;
import com.huawei.health.suggestion.ResultCallback;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hmf.annotation.ApiDefine;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.operation.OperationKey;
import com.huawei.pluginfitnessadvice.FitWorkout;
import com.huawei.pluginfitnessadvice.FitnessPackageInfo;
import com.huawei.pluginfitnessadvice.plandata.CourseDataBean;
import com.huawei.pluginfitnessadvice.plandata.CreateRunPlanParams;
import com.huawei.pluginfitnessadvice.plandata.UserInfoBean;
import com.huawei.up.model.UserInfomation;
import defpackage.btq;
import defpackage.btw;
import defpackage.ghf;
import defpackage.ghr;
import defpackage.ghw;
import defpackage.glq;
import defpackage.gls;
import defpackage.glw;
import defpackage.gme;
import defpackage.gmg;
import defpackage.gmi;
import defpackage.gmk;
import defpackage.gms;
import defpackage.gmu;
import defpackage.gmy;
import defpackage.gnf;
import defpackage.gnn;
import defpackage.gns;
import defpackage.gnw;
import defpackage.gzh;
import defpackage.gzl;
import defpackage.ieg;
import defpackage.ift;
import defpackage.ifw;
import defpackage.njy;
import defpackage.ntn;
import defpackage.pcp;
import defpackage.pdn;
import defpackage.pdr;
import defpackage.pdt;
import defpackage.pdx;
import defpackage.pdy;
import defpackage.peb;
import defpackage.pec;
import defpackage.qey;
import defpackage.qfl;
import health.compact.a.CommonUtil;
import health.compact.a.Services;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes29.dex */
@ApiDefine(uri = PlanApi.class)
public class PlanImpl implements PlanApi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AtomicReference<CountDownLatch> f8539a = new AtomicReference<>();
    private int d;

    static {
        if (gnw.f35849b) {
            gmk.d();
        }
    }

    @Override // com.huawei.health.plan.api.PlanApi
    public void setPlanType(int i) {
        this.d = i;
    }

    @Override // com.huawei.health.plan.api.PlanApi
    public void createPlan(ghr ghrVar, UiCallback<Plan> uiCallback) {
        if (ghrVar == null || uiCallback == null) {
            LogUtil.e("PlanDataImpl", "createPlan: createPlanParams or callcack is null.");
            return;
        }
        int i = this.d;
        if (i == 3) {
            e(ghrVar, uiCallback);
        } else if (i != 4) {
            LogUtil.e("PlanDataImpl", "createPlan: planType illegal.");
        } else {
            d(ghrVar, uiCallback);
        }
    }

    private void d(ghr ghrVar, UiCallback<Plan> uiCallback) {
        FitnessPlanParams fitnessPlanParamsB = ghrVar.b();
        gls.b().createFitPlan(fitnessPlanParamsB.acquireBeginDate(), fitnessPlanParamsB.acquireType(), fitnessPlanParamsB.acquireDifficulty(), fitnessPlanParamsB.acquireTimes(), fitnessPlanParamsB.acquireExcludedDate(), uiCallback);
    }

    private void e(ghr ghrVar, final UiCallback<Plan> uiCallback) {
        gme.c().e(ghrVar, new UiCallback<UserFitnessPlanInfo>() { // from class: com.huawei.health.plan.impl.PlanImpl.3
            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            public void onFailure(int i, String str) {
                uiCallback.onFailure(i, str);
            }

            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onSuccess(UserFitnessPlanInfo userFitnessPlanInfo) {
                uiCallback.onSuccess(gmg.e(userFitnessPlanInfo));
                btq.e().e("PLAN_UPDATE");
            }
        });
    }

    @Override // com.huawei.health.plan.api.PlanApi
    public void checkAllowCreateOldPlan(final UiCallback<Boolean> uiCallback) {
        if (uiCallback == null) {
            LogUtil.e("PlanDataImpl", "checkAllowCreateOldPlan() callback is null");
        } else {
            LogUtil.a("PlanDataImpl", "checkAllowCreateOldPlan()");
            gls.b().checkAllowCreateOldPlan(new UiCallback<Boolean>() { // from class: com.huawei.health.plan.impl.PlanImpl.9
                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                public void onFailure(int i, String str) {
                    ReleaseLogUtil.a("PlanDataImpl", "checkAllowCreateOldPlan()  failed errorCode=", Integer.valueOf(i));
                    uiCallback.onFailure(i, str);
                }

                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public void onSuccess(Boolean bool) {
                    uiCallback.onSuccess(bool);
                }
            });
        }
    }

    @Override // com.huawei.health.plan.api.PlanApi
    public boolean isOpenRemind() {
        boolean zIsOpenRemind;
        if (gnw.f35849b) {
            return gmi.b().e(this.d);
        }
        int i = this.d;
        if (i == 0) {
            zIsOpenRemind = gls.b().isOpenRemind();
        } else if (i == 3) {
            zIsOpenRemind = gme.c().b();
        } else {
            LogUtil.e("PlanDataImpl", "isOpenRemind planType illegal");
            zIsOpenRemind = false;
        }
        LogUtil.a("PlanDataImpl", "isOpenRemind mPlanType: ", Integer.valueOf(this.d), " isOpen: ", Boolean.valueOf(zIsOpenRemind));
        return zIsOpenRemind;
    }

    @Override // com.huawei.health.plan.api.PlanApi
    public void finishPlan(int i, String str, UiCallback<String> uiCallback) {
        if (uiCallback == null) {
            LogUtil.e("PlanDataImpl", "finishPlan: callback is null.");
            return;
        }
        if (gnw.f35849b) {
            gmi.b().e(i, str, this.d, uiCallback);
        } else if (this.d != 0) {
            LogUtil.e("PlanDataImpl", "finishPlan: planType illegal.");
        } else {
            gls.b().finishPlan(str, uiCallback);
        }
    }

    @Override // com.huawei.health.plan.api.PlanApi
    public void getPlanProgress(String str, UiCallback<PlanRecord> uiCallback) {
        gls.b().getPlanProgress(str, uiCallback);
    }

    @Override // com.huawei.health.plan.api.PlanApi
    public PlanRecord getPlanProgress(String str, boolean z) {
        int i = this.d;
        if (i == 0) {
            return gls.b().getPlanProgress(str);
        }
        if (i != 3) {
            LogUtil.e("PlanDataImpl", "getPlanProgress: planType illegal.");
            return null;
        }
        if (z) {
            return gme.c().c(str);
        }
        return gme.c().e(str);
    }

    @Override // com.huawei.health.plan.api.PlanApi
    public boolean updatePlanProgress(WorkoutRecord workoutRecord) {
        boolean zUpdatePlanProgress;
        workoutRecord.saveExerciseTime(ieg.f(ifw.a(workoutRecord.acquireExerciseTime())));
        if (gnw.f35849b) {
            boolean zUpdatePlanProgress2 = gls.b().updatePlanProgress(workoutRecord);
            if (zUpdatePlanProgress2) {
                HiHealthNativeApi.a(BaseApplication.getContext()).insertFitnessData(new GsonBuilder().serializeSpecialFloatingPointValues().create().toJson(workoutRecord).replaceAll("NaN", "0"));
                return zUpdatePlanProgress2;
            }
            LogUtil.j("PlanDataImpl", "insertWorkoutRecord error");
            return zUpdatePlanProgress2;
        }
        int i = this.d;
        if (i == 0) {
            zUpdatePlanProgress = gls.b().updatePlanProgress(workoutRecord);
        } else if (i == 3) {
            gme.c().c(workoutRecord);
            zUpdatePlanProgress = true;
        } else {
            LogUtil.e("PlanDataImpl", "updatePlanProgress: planType illegal.");
            zUpdatePlanProgress = false;
        }
        if (zUpdatePlanProgress) {
            HiHealthNativeApi.a(BaseApplication.getContext()).insertFitnessData(new GsonBuilder().serializeSpecialFloatingPointValues().create().toJson(workoutRecord).replaceAll("NaN", "0"));
            return zUpdatePlanProgress;
        }
        LogUtil.j("PlanDataImpl", "insertWorkoutRecord error");
        return zUpdatePlanProgress;
    }

    @Override // com.huawei.health.plan.api.PlanApi
    public void updatePlanName(String str, String str2) {
        int i = this.d;
        if (i == 0) {
            gls.b().updatePlanName(str, str2);
        } else if (i == 3) {
            gme.c().a(str2);
        } else {
            LogUtil.e("PlanDataImpl", "updatePlanName: planType illegal.");
        }
    }

    @Override // com.huawei.health.plan.api.PlanApi
    public void updateRemindTime(boolean z, int i) {
        if (gnw.f35849b) {
            gmi.b().d(z, i, this.d);
            return;
        }
        int i2 = this.d;
        if (i2 == 0) {
            gls.b().setExerciseRemind(z, i);
        } else {
            if (i2 == 3) {
                if (!z) {
                    i = -1;
                }
                gme.c().e(i);
                return;
            }
            LogUtil.e("PlanDataImpl", "updatePlanRemindTime: planType illegal.");
        }
    }

    @Override // com.huawei.health.plan.api.PlanApi
    public int getRemindTime() {
        if (gnw.f35849b) {
            return gmi.b().c(this.d);
        }
        int i = this.d;
        if (i == 0) {
            return gls.b().getRemindTime();
        }
        if (i == 3) {
            return gme.c().h();
        }
        LogUtil.e("PlanDataImpl", "getRemindTime: planType illegal.");
        return 0;
    }

    @Override // com.huawei.health.plan.api.PlanApi
    public void getPlanRecords(int i, int i2, UiCallback<List<PlanRecord>> uiCallback) {
        if (uiCallback == null) {
            LogUtil.e("PlanDataImpl", "getPlanRecords: callback is null.");
            return;
        }
        int i3 = this.d;
        if (i3 == 0) {
            gls.b().getJoinedPlans(i, i2, uiCallback);
            return;
        }
        if (i3 == 3) {
            gme.c().c(uiCallback);
        } else if (i3 != 6) {
            LogUtil.e("PlanDataImpl", "getPlanRecords: planType illegal.");
        } else {
            gls.b().getOldRunPlanLocalRecords(i, i2, uiCallback);
        }
    }

    @Override // com.huawei.health.plan.api.PlanApi
    public void getPlanStatistics(UiCallback<PlanStatistics> uiCallback) {
        if (uiCallback == null) {
            LogUtil.e("PlanDataImpl", "getPlanStatistics: callback is null.");
            return;
        }
        int i = this.d;
        if (i == -1) {
            gls.b().getPlanStatistics(4, uiCallback);
            return;
        }
        if (i == 0) {
            gls.b().getPlanStatistics(2, uiCallback);
        } else if (i != 3) {
            LogUtil.e("PlanDataImpl", "getPlanStatistics: planType illegal.");
        } else {
            gls.b().getPlanStatistics(3, uiCallback);
        }
    }

    @Override // com.huawei.health.plan.api.PlanApi
    public void getRecommedPlans(int i, final UiCallback<List<PlanInfo>> uiCallback) {
        if (uiCallback == null) {
            LogUtil.e("PlanDataImpl", "getRecommedPlans: callback is null.");
            return;
        }
        if (gnw.f35849b && this.d != 0) {
            gms.a().c(this.d, i, uiCallback);
            return;
        }
        final ArrayList arrayList = new ArrayList();
        int i2 = this.d;
        if (i2 == -1) {
            LogUtil.a("PlanDataImpl", "getRecommedPlans PACKAGE");
            gms.a().c(-1, i, uiCallback);
        } else if (i2 == 0) {
            gls.b().getRecommedPlans(new UiCallback<List<pcp>>() { // from class: com.huawei.health.plan.impl.PlanImpl.8
                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                public void onFailure(int i3, String str) {
                    uiCallback.onFailure(i3, str);
                }

                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
                public void onSuccess(List<pcp> list) {
                    LogUtil.a("PlanDataImpl", "getRecommedPlans RUN" + list.size());
                    arrayList.addAll(list);
                    uiCallback.onSuccess(arrayList);
                }
            });
        } else if (i2 != 3) {
            LogUtil.e("PlanDataImpl", "getRecommedPlans: planType illegal.");
        } else {
            d(i, arrayList, uiCallback);
        }
    }

    private void d(int i, final List<PlanInfo> list, final UiCallback<List<PlanInfo>> uiCallback) {
        gms.a().a(i, -1, new UiCallback<List<FitnessPackageInfo>>() { // from class: com.huawei.health.plan.impl.PlanImpl.10
            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            public void onFailure(int i2, String str) {
                uiCallback.onFailure(i2, str);
            }

            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onSuccess(List<FitnessPackageInfo> list2) {
                LogUtil.a("PlanDataImpl", "getRecommedPlans PACKAGE" + list2.size());
                list.addAll(list2);
                uiCallback.onSuccess(list);
            }
        });
    }

    @Override // com.huawei.health.plan.api.PlanApi
    public List<FitWorkout> getWorkoutListFromLocalByDifficulties(int i, int i2, int i3, Integer[] numArr) {
        return new ArrayList(0);
    }

    @Override // com.huawei.health.plan.api.PlanApi
    public List<gzh> getWeekWorkouts(Plan plan) {
        return gnn.e(plan);
    }

    @Override // com.huawei.health.plan.api.PlanApi
    public PlanStat getPlanBestRecord(String str, float f) {
        int i = this.d;
        if (i == 0) {
            return gls.b().getPlanStat(str);
        }
        if (i == 3) {
            return gmg.b(f, str);
        }
        LogUtil.e("PlanDataImpl", "getPlanBestRecord: planType illegal.");
        return null;
    }

    @Override // com.huawei.health.plan.api.PlanApi
    public void queryAllCompletedFitnessPlanFromCloud(ResultCallback resultCallback) {
        gme.c().d(resultCallback);
    }

    @Override // com.huawei.health.plan.api.PlanApi
    public Plan getjoinedPlanById(String str) {
        int i = this.d;
        if (i == 0) {
            return gls.b().getJoinedPlan(str);
        }
        if (i == 3) {
            return gmg.e(gme.c().d(str));
        }
        LogUtil.e("PlanDataImpl", "getjoinedPlanById: planType illegal.");
        return null;
    }

    @Override // com.huawei.health.plan.api.PlanApi
    public String getFitnessPlanTempId(String str) {
        UserFitnessPlanInfo userFitnessPlanInfoD = gme.c().d(str);
        if (userFitnessPlanInfoD != null) {
            return userFitnessPlanInfoD.acquirePlanTempId();
        }
        return null;
    }

    @Override // com.huawei.health.plan.api.PlanApi
    public FitnessPackageInfo getFitnessPkgInfoByTempId(String str) {
        return gms.a().b(str);
    }

    @Override // com.huawei.health.plan.api.PlanApi
    public float getFitnessPlanShouldCompleteCalorie(int i, WorkoutRecord workoutRecord, UserInfomation userInfomation) {
        if (i == 0) {
            return gme.c().b(workoutRecord, userInfomation);
        }
        if (i == 1) {
            return gme.c().e(workoutRecord, userInfomation);
        }
        LogUtil.e("PlanDataImpl", "getFitnessPlanShouldCompleteCalorie, period illegal.");
        return 0.0f;
    }

    @Override // com.huawei.health.plan.api.PlanApi
    public float getFitnessPlanPackageTotalCalorie(FitnessPackageInfo fitnessPackageInfo) {
        return gme.c().d(fitnessPackageInfo);
    }

    @Override // com.huawei.health.plan.api.PlanApi
    public void cancelTodayPlanRemind(Plan plan) {
        glq.a(plan);
    }

    @Override // com.huawei.health.plan.api.PlanApi
    public Map<String, Integer> getPlanWorkoutOrders(String str) {
        return gls.b().getWorkoutOrders(str);
    }

    @Override // com.huawei.health.plan.api.PlanApi
    public boolean updatePlanBestRecord(String str, int i, int i2) {
        return gls.b().updateBestRecord(str, i, i2);
    }

    @Override // com.huawei.health.plan.api.PlanApi
    public void getAllPlans(int i, UiCallback<pdn> uiCallback) {
        if (uiCallback == null) {
            LogUtil.e("PlanDataImpl", "getAllPlans: callback is null.");
        } else {
            gmu.d().getAllPlans(i, uiCallback);
        }
    }

    @Override // com.huawei.health.plan.api.PlanApi
    public void getAchievementForecast(int i, int i2, int i3, int i4, UiCallback<pdy> uiCallback) {
        if (uiCallback == null) {
            LogUtil.e("PlanDataImpl", "getAchievementForecast: callback is null.");
        } else {
            gmu.d().getAchievementForecast(i, i2, i3, i4, uiCallback);
        }
    }

    @Override // com.huawei.health.plan.api.PlanApi
    public void createIntelligentRunPlan(CreateRunPlanParams createRunPlanParams, UiCallback<Plan> uiCallback) {
        gmi.b().e(createRunPlanParams, uiCallback);
    }

    @Override // com.huawei.health.plan.api.PlanApi
    public void updatePlan(UserInfoBean userInfoBean, String str, UiCallback<IntPlan> uiCallback) {
        if (uiCallback == null || userInfoBean == null) {
            LogUtil.e("PlanDataImpl", "createPlan: callback or runPlanUserInfoBean is null.");
        } else {
            gmi.b().c(userInfoBean, str, uiCallback);
        }
    }

    @Override // com.huawei.health.plan.api.PlanApi
    public void getCurrentReportIndex(UiCallback<Integer> uiCallback) {
        if (uiCallback == null) {
            LogUtil.e("PlanDataImpl", "getAchievementForecast: callback is null.");
        } else {
            gmu.d().getCurrentReportIndex(uiCallback);
        }
    }

    @Override // com.huawei.health.plan.api.PlanApi
    public void postFeedback(pec pecVar, UiCallback<String> uiCallback) {
        if (uiCallback == null) {
            LogUtil.e("PlanDataImpl", "postFeedback: callback is null.");
        } else {
            gmi.b().c(pecVar, uiCallback);
        }
    }

    @Override // com.huawei.health.plan.api.PlanApi
    public void getTrainingReport(String str, int i, UiCallback<pdx> uiCallback) {
        if (uiCallback == null) {
            LogUtil.e("PlanDataImpl", "getTrainingReport: callback is null.");
        } else {
            gmu.d().getTrainingReport(str, i, uiCallback);
        }
    }

    @Override // com.huawei.health.plan.api.PlanApi
    public void getCoachAdvice(int i, String str, IntPlanBean intPlanBean, boolean z, UiCallback<String> uiCallback) {
        if (uiCallback == null) {
            LogUtil.e("PlanDataImpl", "getCoachAdvice: callback is null.");
        } else if (intPlanBean != null) {
            gmi.b().b(i, intPlanBean, uiCallback);
        } else {
            gmu.d().getCoachAdvice(str, z, uiCallback);
        }
    }

    @Override // com.huawei.health.plan.api.PlanApi
    public void updatePlanDate(String str, List<Integer> list, List<Integer> list2, UiCallback<String> uiCallback) {
        if (uiCallback == null) {
            LogUtil.e("PlanDataImpl", "updatePlanDate: callback is null.");
        } else {
            gmi.b().a(str, list, list2, uiCallback);
        }
    }

    @Override // com.huawei.health.plan.api.PlanApi
    @Deprecated
    public void getWorkoutById(String str, String str2, String str3, UiCallback<FitWorkout> uiCallback) {
        if (uiCallback == null) {
            LogUtil.e("PlanDataImpl", "getWorkoutById: callback is null.");
        } else {
            gls.b().getWorkout(new gzl.a(str).d(str2).a(str3).c(), uiCallback);
        }
    }

    @Override // com.huawei.health.plan.api.PlanApi
    public void updatePlanReport(String str, String str2, final UiCallback<String> uiCallback) {
        ghw.b().updatePlanReport(str, str2, new DataCallback() { // from class: com.huawei.health.plan.impl.PlanImpl.6
            @Override // com.huawei.basefitnessadvice.callback.DataCallback
            public void onFailure(int i, String str3) {
                LogUtil.e("PlanDataImpl", "updatePlanReport fail:", str3);
                uiCallback.onFailure(i, str3);
                OpAnalyticsUtil.getInstance().setEventOneErrorCode(OperationKey.HEALTH_APP_PUSH_PLAN_REPORT_60010009.value(), i);
            }

            @Override // com.huawei.basefitnessadvice.callback.DataCallback
            public void onSuccess(JSONObject jSONObject) {
                if (jSONObject == null) {
                    LogUtil.j("PlanDataImpl", "updatePlanReport onSuccess data is null.");
                    uiCallback.onSuccess(null);
                } else {
                    LogUtil.a("PlanDataImpl", "updatePlanReport success:", jSONObject.toString());
                    uiCallback.onSuccess(jSONObject.toString());
                }
            }
        });
    }

    @Override // com.huawei.health.plan.api.PlanApi
    public void getTodayRunPanCourse(Plan plan, UiCallback<FitWorkout> uiCallback) {
        if (plan == null) {
            LogUtil.e("PlanDataImpl", "getTodayRunPanCourseName currentPlan == null");
            uiCallback.onFailure(0, "currentPlan == null");
            return;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        pdt pdtVarB = btw.b(plan, ift.b(calendar.get(7)), btw.b(plan));
        if (njy.e(pdtVarB.a()) || pdtVarB.c()) {
            LogUtil.e("PlanDataImpl", "getTodayRunPanCourseName getCourseDataBeanList == null or getIsDayClockIn:", Boolean.valueOf(pdtVarB.c()));
            uiCallback.onFailure(0, "getCourseDataBeanList == null");
            return;
        }
        for (CourseDataBean courseDataBean : pdtVarB.a()) {
            if (courseDataBean != null && !courseDataBean.a()) {
                e(plan, courseDataBean.e(), uiCallback);
                return;
            }
        }
    }

    private void e(Plan plan, String str, final UiCallback<FitWorkout> uiCallback) {
        PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
        if (planApi == null) {
            LogUtil.e("PlanDataImpl", "getCourseCourse planApi : planApi is null.");
        } else {
            planApi.setPlanType(0);
            planApi.getWorkoutById(str, plan.acquireVersion(), CommonUtil.u(), new UiCallback<FitWorkout>() { // from class: com.huawei.health.plan.impl.PlanImpl.7
                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                public void onFailure(int i, String str2) {
                    LogUtil.j("PlanDataImpl", "getCourseCourse getCourseName errorInfo: ", str2);
                    uiCallback.onFailure(i, str2);
                }

                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public void onSuccess(FitWorkout fitWorkout) {
                    LogUtil.a("PlanDataImpl", "getCourseCourse getWorkoutById onSuccess");
                    if (fitWorkout == null) {
                        uiCallback.onSuccess(null);
                        LogUtil.e("PlanDataImpl", "getCourseCourse getWorkoutById onSuccess data == null");
                    } else {
                        uiCallback.onSuccess(fitWorkout);
                    }
                }
            });
        }
    }

    @Override // com.huawei.health.plan.api.PlanApi
    public void createFitnessPkg(String str, UiCallback<IntPlan> uiCallback) {
        if (str.isEmpty()) {
            LogUtil.e("PlanDataImpl", "createFitnessPkg: planTempId isEmpty.");
        } else {
            gme.c().e(new ghr(str), uiCallback);
        }
    }

    @Override // com.huawei.health.plan.api.PlanApi
    public void getAllFitnessPackage(int i, UiCallback<List<FitnessPackageInfo>> uiCallback) {
        gms.a().a(i, -1, uiCallback);
    }

    @Override // com.huawei.health.plan.api.PlanApi
    public void getAllFitnessPackage(int i, int i2, UiCallback<List<FitnessPackageInfo>> uiCallback) {
        gms.a().a(i, i2, uiCallback);
    }

    @Override // com.huawei.health.plan.api.PlanApi
    public IntPlan getCurrentIntPlan() {
        return gmi.b().a();
    }

    @Override // com.huawei.health.plan.api.PlanApi
    /* JADX INFO: renamed from: getCurrentIntPlan, reason: merged with bridge method [inline-methods] */
    public void e(final UiCallback<IntPlan> uiCallback) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: ggy
                @Override // java.lang.Runnable
                public final void run() {
                    this.f35096c.e(uiCallback);
                }
            });
            return;
        }
        CountDownLatch countDownLatch = f8539a.get();
        if (countDownLatch != null) {
            try {
                countDownLatch.await(200L, TimeUnit.MILLISECONDS);
            } catch (InterruptedException unused) {
                LogUtil.e("PlanDataImpl", "await InterruptedException");
            }
        }
        gmi.b().b(new UiCallback<ghf>() { // from class: com.huawei.health.plan.impl.PlanImpl.15
            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            public void onFailure(int i, String str) {
                uiCallback.onFailure(i, str);
            }

            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public void onSuccess(ghf ghfVar) {
                uiCallback.onSuccess(ghfVar);
            }
        });
    }

    @Override // com.huawei.health.plan.api.PlanApi
    public void preLoadPlan() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: ggw
                @Override // java.lang.Runnable
                public final void run() {
                    this.e.preLoadPlan();
                }
            });
        } else {
            f8539a.set(new CountDownLatch(1));
            gmi.b().b(new AnonymousClass12());
        }
    }

    /* JADX INFO: renamed from: com.huawei.health.plan.impl.PlanImpl$12, reason: invalid class name */
    public class AnonymousClass12 extends UiCallback<ghf> {
        AnonymousClass12() {
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public void onFailure(int i, String str) {
            PlanImpl.this.d();
            LogUtil.e("PlanDataImpl", "preLoadPlan errorCode is ", Integer.valueOf(i), " errorInfo is ", str);
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(ghf ghfVar) {
            PlanImpl.this.d();
            HandlerExecutor.b(new Runnable() { // from class: ghc
                @Override // java.lang.Runnable
                public final void run() {
                    btq.e().e("PLAN_PRE_LOAD");
                }
            });
            LogUtil.a("PlanDataImpl", "preLoadPlan onSuccess.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        CountDownLatch andSet = f8539a.getAndSet(null);
        if (andSet != null) {
            andSet.countDown();
        }
    }

    @Override // com.huawei.health.plan.api.PlanApi
    public void updateAction(peb pebVar, UiCallback<String> uiCallback) {
        gmi.b().b(pebVar, uiCallback);
    }

    @Override // com.huawei.health.plan.api.PlanApi
    public void updateIntPlanReport(String str, int i, int i2, String str2, long j, UiCallback<String> uiCallback) {
        gmi.b().e(str, i, i2, str2, j, uiCallback);
    }

    @Override // com.huawei.health.plan.api.PlanApi
    public void getIntPlanReport(String str, int i, int i2, UiCallback<String> uiCallback) {
        gmi.b().a(str, i, i2, uiCallback);
    }

    @Override // com.huawei.health.plan.api.PlanApi
    public void updateIntPlanInfo(String str, int i, int i2, String str2, UiCallback<String> uiCallback) {
        gmi.b().b(str, i, i2, str2, uiCallback);
    }

    @Override // com.huawei.health.plan.api.PlanApi
    public void createPlan(IntPlanBean intPlanBean, UiCallback<IntPlan> uiCallback) {
        gmi.b().c(intPlanBean, uiCallback);
    }

    @Override // com.huawei.health.plan.api.PlanApi
    public void setNeedUpdateCurrentPlan() {
        glw.c().e();
    }

    @Override // com.huawei.health.plan.api.PlanApi
    public boolean isNeedSendFinishPlanToDevice(String str) {
        return gmy.d(str);
    }

    @Override // com.huawei.health.plan.api.PlanApi
    public String getNeedSendFinishPlanId() {
        return gmy.c();
    }

    @Override // com.huawei.health.plan.api.PlanApi
    public void updateSendFinishPlanDevice(String str) {
        gmy.b(str);
    }

    @Override // com.huawei.health.plan.api.PlanApi
    public void updateDayRecord(String str, pdr pdrVar) {
        gmi.b().d(str, pdrVar);
    }

    @Override // com.huawei.health.plan.api.PlanApi
    public void updateDayRecord(IntPlan intPlan, WorkoutRecord workoutRecord, DataCallback dataCallback) {
        gls.b().updateDayRecord(intPlan, workoutRecord, dataCallback);
    }

    @Override // com.huawei.health.plan.api.PlanApi
    public void deletePlanExerciseRecord(String str) {
        gmi.b().e(str);
    }

    @Override // com.huawei.health.plan.api.PlanApi
    public void replacePlanSchedule(ReplacePlanBean replacePlanBean, UiCallback<Boolean> uiCallback) {
        gmi.b().e(replacePlanBean, uiCallback);
    }

    @Override // com.huawei.health.plan.api.PlanApi
    public void leavePlan(LeavePlanCalendarBean leavePlanCalendarBean, UiCallback<IntPlan> uiCallback) {
        gmi.b().e(leavePlanCalendarBean, uiCallback);
    }

    @Override // com.huawei.health.plan.api.PlanApi
    public void cancelLeave(LeavePlanCalendarBean leavePlanCalendarBean, UiCallback<IntPlan> uiCallback) {
        gmi.b().c(leavePlanCalendarBean, uiCallback);
    }

    @Override // com.huawei.health.plan.api.PlanApi
    public void updatePlanCalendar(LeavePlanCalendarBean leavePlanCalendarBean, UiCallback<IntPlan> uiCallback) {
        gmi.b().d(leavePlanCalendarBean, uiCallback);
    }

    @Override // com.huawei.health.plan.api.PlanApi
    public void checkSportRecordOutPlanPunch(UiCallback<List<ntn>> uiCallback, List<ntn> list) {
        if (uiCallback == null) {
            ReleaseLogUtil.a("PlanDataImpl", "callback is null, return");
        } else {
            gmi.b().b(new AnonymousClass13(uiCallback, list));
        }
    }

    /* JADX INFO: renamed from: com.huawei.health.plan.impl.PlanImpl$13, reason: invalid class name */
    public class AnonymousClass13 extends UiCallback<ghf> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f8543a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ UiCallback f8544b;

        AnonymousClass13(UiCallback uiCallback, List list) {
            this.f8544b = uiCallback;
            this.f8543a = list;
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public void onFailure(int i, String str) {
            ReleaseLogUtil.a("PlanDataImpl", "errorCode is ", Integer.valueOf(i), " errorInfo is ", str);
            this.f8544b.onFailure(i, str);
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void onSuccess(ghf ghfVar) {
            if (ghfVar == null) {
                ReleaseLogUtil.a("PlanDataImpl", "data is null, return ");
                this.f8544b.onSuccess(new ArrayList());
                return;
            }
            if (btw.k(ghfVar)) {
                ReleaseLogUtil.a("PlanDataImpl", "checkSportRecordOutPlanPunch intPlanVipExpired");
                return;
            }
            if (ghfVar.getPlanType() != IntPlan.PlanType.AI_FITNESS_PLAN) {
                ReleaseLogUtil.d("PlanDataImpl", "not ai fitness plan, not show energy replacement card");
                this.f8544b.onSuccess(new ArrayList());
                return;
            }
            final List<ntn> listD = btw.d(BaseApplication.getContext(), (List<ntn>) this.f8543a);
            if (njy.e(listD)) {
                this.f8544b.onSuccess(new ArrayList());
                return;
            }
            ntn ntnVar = listD.get(0);
            int iE = btw.e(ghfVar, ntnVar.b());
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(ntnVar.b());
            int iB = ift.b(calendar.get(7));
            if (btw.c(ghfVar.getDayInfo(iE, iB)) != 0) {
                ReleaseLogUtil.d("PlanDataImpl", "not training day, callback empty array");
                this.f8544b.onSuccess(new ArrayList());
            } else {
                final UiCallback uiCallback = this.f8544b;
                btw.a(ghfVar, iE, iB, new IBaseResponseCallback() { // from class: gha
                    @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                    /* JADX INFO: renamed from: onResponse */
                    public final void a(int i, Object obj) {
                        this.e.d(listD, uiCallback, i, obj);
                    }
                });
            }
        }

        public /* synthetic */ void d(List list, UiCallback uiCallback, int i, Object obj) {
            if (!njy.b(obj, RecordData.class)) {
                LogUtil.j("PlanDataImpl", "getTrackData onResult obj not instanceof List");
                uiCallback.onSuccess(PlanImpl.this.d((List<ntn>) list, new ArrayList()));
            } else {
                uiCallback.onSuccess(PlanImpl.this.d((List<ntn>) list, (List<RecordData>) obj));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ArrayList<ntn> d(List<ntn> list, List<RecordData> list2) {
        ArrayList<ntn> arrayList = new ArrayList<>();
        for (ntn ntnVar : list) {
            for (RecordData recordData : list2) {
                if (recordData.getIsInPlan() == 0 && ntnVar.b(recordData.getStartTime(), recordData.getEndTime())) {
                    arrayList.add(ntnVar);
                    break;
                }
            }
        }
        return arrayList;
    }

    @Override // com.huawei.health.plan.api.PlanApi
    public int getNeedFinishPlanType() {
        return gmy.a();
    }

    @Override // com.huawei.health.plan.api.PlanApi
    public IntPlan convertRunPlan(Plan plan) {
        return gnw.e(plan);
    }

    @Override // com.huawei.health.plan.api.PlanApi
    public void setNeedFinishPlanType(int i) {
        gmy.e(i);
    }

    @Override // com.huawei.health.plan.api.PlanApi
    public qey getPlanDetail() {
        return gmi.b().d();
    }

    @Override // com.huawei.health.plan.api.PlanApi
    public void getCurrentPlan(int i, int i2, boolean z, UiCallback<qey> uiCallback) {
        gmi.b().a(Integer.valueOf(i), Integer.valueOf(i2), z, uiCallback);
    }

    @Override // com.huawei.health.plan.api.PlanApi
    public void getCurrentPlan(UiCallback<qey> uiCallback) {
        gmi.b().e(uiCallback);
    }

    @Override // com.huawei.health.plan.api.PlanApi
    public IntPlan getCurrentAllPlan() {
        final CountDownLatch countDownLatch = new CountDownLatch(2);
        final IntPlan[] intPlanArr = {null};
        final qey[] qeyVarArr = {null};
        ThreadPoolManager.c().execute(new Runnable() { // from class: ggv
            @Override // java.lang.Runnable
            public final void run() {
                this.f35093b.a(countDownLatch, qeyVarArr);
            }
        });
        ThreadPoolManager.c().execute(new Runnable() { // from class: ggu
            @Override // java.lang.Runnable
            public final void run() {
                this.f35091b.a(countDownLatch, intPlanArr);
            }
        });
        try {
            countDownLatch.await(2000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            LogUtil.e("PlanDataImpl", "await InterruptedException:", ExceptionUtils.c(e));
        }
        if (btw.d(qeyVarArr[0]) || btw.e(qeyVarArr[0])) {
            intPlanArr[0] = convertRunPlan(qeyVarArr[0]);
        }
        return intPlanArr[0];
    }

    public /* synthetic */ void a(final CountDownLatch countDownLatch, final qey[] qeyVarArr) {
        getCurrentPlan(new UiCallback<qey>() { // from class: com.huawei.health.plan.impl.PlanImpl.1
            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            public void onFailure(int i, String str) {
                LogUtil.e("PlanDataImpl", "getCurrentPlan errorCode:", Integer.valueOf(i), ",errorInfo:", str);
                countDownLatch.countDown();
            }

            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public void onSuccess(qey qeyVar) {
                qeyVarArr[0] = qeyVar;
                countDownLatch.countDown();
            }
        });
    }

    public /* synthetic */ void a(final CountDownLatch countDownLatch, final IntPlan[] intPlanArr) {
        e(new UiCallback<IntPlan>() { // from class: com.huawei.health.plan.impl.PlanImpl.2
            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            public void onFailure(int i, String str) {
                LogUtil.e("PlanDataImpl", "getCurrentIntPlan errorCode:", Integer.valueOf(i), ",errorInfo:", str);
                countDownLatch.countDown();
            }

            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public void onSuccess(IntPlan intPlan) {
                intPlanArr[0] = intPlan;
                countDownLatch.countDown();
            }
        });
    }

    @Override // com.huawei.health.plan.api.PlanApi
    public void stopSmartTrainPlan(String str, UiCallback<String> uiCallback) {
        gmi.b().d(str, uiCallback);
    }

    @Override // com.huawei.health.plan.api.PlanApi
    /* JADX INFO: renamed from: getMyCompetitions, reason: merged with bridge method [inline-methods] */
    public void c(final UiCallback<gnf> uiCallback) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: ggp
                @Override // java.lang.Runnable
                public final void run() {
                    this.f35085a.c(uiCallback);
                }
            });
        } else {
            gmi.b().d(new UiCallback<gnf>() { // from class: com.huawei.health.plan.impl.PlanImpl.4
                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                public void onFailure(int i, String str) {
                    uiCallback.onFailure(i, str);
                }

                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public void onSuccess(gnf gnfVar) {
                    uiCallback.onSuccess(gnfVar);
                }
            });
        }
    }

    @Override // com.huawei.health.plan.api.PlanApi
    /* JADX INFO: renamed from: getMyCompetitionsByTime, reason: merged with bridge method [inline-methods] */
    public void e(final long j, final long j2, final UiCallback<gnf> uiCallback) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: ggx
                @Override // java.lang.Runnable
                public final void run() {
                    this.d.e(j, j2, uiCallback);
                }
            });
        } else {
            gmi.b().e(j, j2, new UiCallback<gnf>() { // from class: com.huawei.health.plan.impl.PlanImpl.5
                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                public void onFailure(int i, String str) {
                    uiCallback.onFailure(i, str);
                }

                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
                public void onSuccess(gnf gnfVar) {
                    uiCallback.onSuccess(gnfVar);
                }
            });
        }
    }

    @Override // com.huawei.health.plan.api.PlanApi
    public IntPlan convertRunPlan(qey qeyVar) {
        return gns.a(qeyVar);
    }

    @Override // com.huawei.health.plan.api.PlanApi
    public void setNeedSendFinishPlan(String str) {
        gmi.b().d(str);
    }

    @Override // com.huawei.health.plan.api.PlanApi
    public int getCompletionStatus(List<qfl> list) {
        return gns.a(list);
    }
}
