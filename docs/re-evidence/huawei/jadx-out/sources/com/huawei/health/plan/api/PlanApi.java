package com.huawei.health.plan.api;

import com.huawei.basefitnessadvice.callback.DataCallback;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.basefitnessadvice.model.Plan;
import com.huawei.basefitnessadvice.model.PlanInfo;
import com.huawei.basefitnessadvice.model.PlanRecord;
import com.huawei.basefitnessadvice.model.intplan.IntPlan;
import com.huawei.health.plan.model.PlanStat;
import com.huawei.health.plan.model.PlanStatistics;
import com.huawei.health.plan.model.intplan.IntPlanBean;
import com.huawei.health.plan.model.intplan.LeavePlanCalendarBean;
import com.huawei.health.plan.model.intplan.ReplacePlanBean;
import com.huawei.health.sport.model.WorkoutRecord;
import com.huawei.health.suggestion.ResultCallback;
import com.huawei.pluginfitnessadvice.FitWorkout;
import com.huawei.pluginfitnessadvice.FitnessPackageInfo;
import com.huawei.pluginfitnessadvice.plandata.CreateRunPlanParams;
import com.huawei.pluginfitnessadvice.plandata.UserInfoBean;
import com.huawei.up.model.UserInfomation;
import defpackage.ghr;
import defpackage.gnf;
import defpackage.gzh;
import defpackage.ntn;
import defpackage.pdn;
import defpackage.pdr;
import defpackage.pdx;
import defpackage.pdy;
import defpackage.peb;
import defpackage.pec;
import defpackage.qey;
import defpackage.qfl;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public interface PlanApi {
    void cancelLeave(LeavePlanCalendarBean leavePlanCalendarBean, UiCallback<IntPlan> uiCallback);

    void cancelTodayPlanRemind(Plan plan);

    void checkAllowCreateOldPlan(UiCallback<Boolean> uiCallback);

    void checkSportRecordOutPlanPunch(UiCallback<List<ntn>> uiCallback, List<ntn> list);

    IntPlan convertRunPlan(Plan plan);

    IntPlan convertRunPlan(qey qeyVar);

    void createFitnessPkg(String str, UiCallback<IntPlan> uiCallback);

    void createIntelligentRunPlan(CreateRunPlanParams createRunPlanParams, UiCallback<Plan> uiCallback);

    void createPlan(IntPlanBean intPlanBean, UiCallback<IntPlan> uiCallback);

    void createPlan(ghr ghrVar, UiCallback<Plan> uiCallback);

    void deletePlanExerciseRecord(String str);

    void finishPlan(int i, String str, UiCallback<String> uiCallback);

    void getAchievementForecast(int i, int i2, int i3, int i4, UiCallback<pdy> uiCallback);

    void getAllFitnessPackage(int i, int i2, UiCallback<List<FitnessPackageInfo>> uiCallback);

    void getAllFitnessPackage(int i, UiCallback<List<FitnessPackageInfo>> uiCallback);

    void getAllPlans(int i, UiCallback<pdn> uiCallback);

    void getCoachAdvice(int i, String str, IntPlanBean intPlanBean, boolean z, UiCallback<String> uiCallback);

    int getCompletionStatus(List<qfl> list);

    IntPlan getCurrentAllPlan();

    IntPlan getCurrentIntPlan();

    void getCurrentIntPlan(UiCallback<IntPlan> uiCallback);

    void getCurrentPlan(int i, int i2, boolean z, UiCallback<qey> uiCallback);

    void getCurrentPlan(UiCallback<qey> uiCallback);

    void getCurrentReportIndex(UiCallback<Integer> uiCallback);

    FitnessPackageInfo getFitnessPkgInfoByTempId(String str);

    float getFitnessPlanPackageTotalCalorie(FitnessPackageInfo fitnessPackageInfo);

    float getFitnessPlanShouldCompleteCalorie(int i, WorkoutRecord workoutRecord, UserInfomation userInfomation);

    String getFitnessPlanTempId(String str);

    void getIntPlanReport(String str, int i, int i2, UiCallback<String> uiCallback);

    void getMyCompetitions(UiCallback<gnf> uiCallback);

    void getMyCompetitionsByTime(long j, long j2, UiCallback<gnf> uiCallback);

    int getNeedFinishPlanType();

    String getNeedSendFinishPlanId();

    PlanStat getPlanBestRecord(String str, float f);

    qey getPlanDetail();

    PlanRecord getPlanProgress(String str, boolean z);

    void getPlanProgress(String str, UiCallback<PlanRecord> uiCallback);

    void getPlanRecords(int i, int i2, UiCallback<List<PlanRecord>> uiCallback);

    void getPlanStatistics(UiCallback<PlanStatistics> uiCallback);

    Map<String, Integer> getPlanWorkoutOrders(String str);

    void getRecommedPlans(int i, UiCallback<List<PlanInfo>> uiCallback);

    int getRemindTime();

    void getTodayRunPanCourse(Plan plan, UiCallback<FitWorkout> uiCallback);

    void getTrainingReport(String str, int i, UiCallback<pdx> uiCallback);

    List<gzh> getWeekWorkouts(Plan plan);

    @Deprecated
    void getWorkoutById(String str, String str2, String str3, UiCallback<FitWorkout> uiCallback);

    List<FitWorkout> getWorkoutListFromLocalByDifficulties(int i, int i2, int i3, Integer[] numArr);

    Plan getjoinedPlanById(String str);

    boolean isNeedSendFinishPlanToDevice(String str);

    boolean isOpenRemind();

    void leavePlan(LeavePlanCalendarBean leavePlanCalendarBean, UiCallback<IntPlan> uiCallback);

    void postFeedback(pec pecVar, UiCallback<String> uiCallback);

    void preLoadPlan();

    void queryAllCompletedFitnessPlanFromCloud(ResultCallback resultCallback);

    void replacePlanSchedule(ReplacePlanBean replacePlanBean, UiCallback<Boolean> uiCallback);

    void setNeedFinishPlanType(int i);

    void setNeedSendFinishPlan(String str);

    void setNeedUpdateCurrentPlan();

    void setPlanType(int i);

    void stopSmartTrainPlan(String str, UiCallback<String> uiCallback);

    void updateAction(peb pebVar, UiCallback<String> uiCallback);

    void updateDayRecord(IntPlan intPlan, WorkoutRecord workoutRecord, DataCallback dataCallback);

    void updateDayRecord(String str, pdr pdrVar);

    void updateIntPlanInfo(String str, int i, int i2, String str2, UiCallback<String> uiCallback);

    void updateIntPlanReport(String str, int i, int i2, String str2, long j, UiCallback<String> uiCallback);

    void updatePlan(UserInfoBean userInfoBean, String str, UiCallback<IntPlan> uiCallback);

    boolean updatePlanBestRecord(String str, int i, int i2);

    void updatePlanCalendar(LeavePlanCalendarBean leavePlanCalendarBean, UiCallback<IntPlan> uiCallback);

    void updatePlanDate(String str, List<Integer> list, List<Integer> list2, UiCallback<String> uiCallback);

    void updatePlanName(String str, String str2);

    boolean updatePlanProgress(WorkoutRecord workoutRecord);

    void updatePlanReport(String str, String str2, UiCallback<String> uiCallback);

    void updateRemindTime(boolean z, int i);

    void updateSendFinishPlanDevice(String str);
}
