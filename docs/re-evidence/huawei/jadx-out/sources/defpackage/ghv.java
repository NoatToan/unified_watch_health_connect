package defpackage;

import android.os.SystemClock;
import android.text.TextUtils;
import com.huawei.basefitnessadvice.callback.DataCallback;
import com.huawei.basefitnessadvice.model.Plan;
import com.huawei.basefitnessadvice.model.PlanWorkout;
import com.huawei.basefitnessadvice.model.WorkoutListBean;
import com.huawei.health.plan.model.PlanStat;
import com.huawei.health.plan.model.UserFitnessPlanInfo;
import com.huawei.health.plan.model.cloud.CloudApi;
import com.huawei.health.plan.model.intplan.IntPlanBean;
import com.huawei.health.plan.model.intplan.LeavePlanCalendarBean;
import com.huawei.health.plan.model.intplan.ReplacePlanBean;
import com.huawei.health.plan.model.intplan.UserProfileBean;
import com.huawei.health.plan.model.model.BestRecordFitStat;
import com.huawei.health.plan.model.model.CreatePlanBean;
import com.huawei.health.plan.model.model.FinishPlanBean;
import com.huawei.health.sport.model.WorkoutRecord;
import com.huawei.health.sport.utils.ResultUtil;
import com.huawei.hwcloudmodel.healthdatacloud.HealthDataCloudFactory;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwfoundationmodel.trackmodel.HeartRateData;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.networkclient.IRequest;
import com.huawei.networkclient.ResultCallback;
import com.huawei.pluginachievement.manager.model.MedalConstants;
import com.huawei.pluginfitnessadvice.ChoreographedMultiActions;
import com.huawei.pluginfitnessadvice.ChoreographedSingleAction;
import com.huawei.pluginfitnessadvice.FitWorkout;
import com.huawei.pluginfitnessadvice.Workout;
import com.huawei.pluginfitnessadvice.plandata.CreateRunPlanParams;
import com.huawei.pluginfitnessadvice.plandata.UserInfoBean;
import health.compact.a.CommonUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes29.dex */
public class ghv implements CloudApi {
    @Override // com.huawei.health.plan.model.cloud.CloudApi
    public void getWorkoutList(WorkoutListBean workoutListBean, DataCallback dataCallback) {
        gjj.e eVarB = new gjj.e().c(Integer.valueOf(workoutListBean.getPageStart())).e(Integer.valueOf(workoutListBean.getPageSize())).b(gld.d());
        int supportWear = workoutListBean.getSupportWear();
        if (supportWear == 0 || supportWear == 1) {
            eVarB.i(Integer.valueOf(supportWear));
        }
        Integer primaryClassifyId = workoutListBean.getPrimaryClassifyId();
        if (primaryClassifyId != null && primaryClassifyId.intValue() > 0) {
            eVarB.h(primaryClassifyId);
        }
        Integer secondClassifyId = workoutListBean.getSecondClassifyId();
        if (secondClassifyId != null && secondClassifyId.intValue() > 0) {
            eVarB.f(secondClassifyId);
        }
        Integer userDefinedType = workoutListBean.getUserDefinedType();
        if (userDefinedType != null) {
            eVarB.g(userDefinedType);
        }
        Integer[] classList = workoutListBean.getClassList();
        if (classList != null && classList.length > 0) {
            eVarB.a(Arrays.asList(classList));
        }
        Integer[] secondClassifyList = workoutListBean.getSecondClassifyList();
        if (secondClassifyList != null && secondClassifyList.length > 0) {
            eVarB.d(Arrays.asList(secondClassifyList));
        }
        if (ied.e() == 0) {
            eVarB.b((Integer) 1);
        } else {
            eVarB.b((Integer) 0);
        }
        Integer[] trainingPoints = workoutListBean.getTrainingPoints();
        if (trainingPoints != null && trainingPoints.length > 0) {
            eVarB.b(Arrays.asList(trainingPoints));
        }
        d(workoutListBean, eVarB);
        eVarB.d(workoutListBean.getSearchCondition());
        gky.c().c(eVarB.d(), workoutListBean.getUseCache(), dataCallback);
    }

    private void d(WorkoutListBean workoutListBean, gjj.e eVar) {
        Integer[] difficulty = workoutListBean.getDifficulty();
        if (difficulty != null && difficulty.length > 0) {
            eVar.e(Arrays.asList(difficulty));
        }
        Integer[] equipments = workoutListBean.getEquipments();
        if (equipments != null && equipments.length > 0) {
            eVar.c(Arrays.asList(equipments));
        }
        int my = workoutListBean.getMy();
        if (my == 1) {
            eVar.d(Integer.valueOf(my));
        }
        Integer workoutRank = workoutListBean.getWorkoutRank();
        if (workoutRank != null && workoutRank.intValue() != 0) {
            eVar.j(workoutRank);
        }
        Integer[] workoutType = workoutListBean.getWorkoutType();
        if (workoutType != null && workoutType.length > 0) {
            eVar.i(Arrays.asList(workoutType));
        }
        if (workoutListBean.getCommodityFlag() != -1) {
            eVar.a(Integer.valueOf(workoutListBean.getCommodityFlag()));
        }
        String replacedWorkoutId = workoutListBean.getReplacedWorkoutId();
        if (TextUtils.isEmpty(replacedWorkoutId)) {
            return;
        }
        eVar.c(replacedWorkoutId);
    }

    @Override // com.huawei.health.plan.model.cloud.CloudApi
    public void searchWorkoutList(int i, int i2, String str, List<Integer> list, DataCallback dataCallback) {
        gjj.e eVarE = new gjj.e().c(Integer.valueOf(i)).e(Integer.valueOf(i2));
        if (njy.b(list)) {
            eVarE.i(list);
        }
        eVarE.a(str);
        gky.c().a(eVarE.d(), dataCallback);
    }

    @Override // com.huawei.health.plan.model.cloud.CloudApi
    public void getNavigationCourseList(WorkoutListBean workoutListBean, DataCallback dataCallback) {
        gjb.e eVarC = new gjb.e().e((workoutListBean.getPageStart() / workoutListBean.getPageSize()) + 1).d(workoutListBean.getPageSize()).a(workoutListBean.getCourseType()).c(workoutListBean.getSearchCondition());
        Integer workoutRank = workoutListBean.getWorkoutRank();
        if (workoutRank != null && workoutRank.intValue() != 0) {
            eVarC.c(workoutRank);
        }
        gky.c().a(eVarC.d(), dataCallback);
    }

    @Override // com.huawei.health.plan.model.cloud.CloudApi
    public void getWorkoutInfo(gzl gzlVar, DataCallback dataCallback) {
        gjc.d dVarD = new gjc.d().c(gzlVar.g()).b(gzlVar.a()).d(gzlVar.d()).d(Integer.valueOf(gzlVar.f()));
        if (!TextUtils.isEmpty(gzlVar.i())) {
            dVarD.a(gzlVar.i());
        }
        gky.c().c(dVarD.e(), gzlVar.e(), dataCallback);
    }

    @Override // com.huawei.health.plan.model.cloud.CloudApi
    public void getWorkoutsInfo(List<gzl> list, boolean z, DataCallback dataCallback) {
        gky.c().c((IRequest) new gjn.d().c(list).e(Boolean.valueOf(z)).d(), false, dataCallback);
    }

    @Override // com.huawei.health.plan.model.cloud.CloudApi
    public void createPlan(CreatePlanBean createPlanBean, DataCallback dataCallback) {
        int goal = createPlanBean.getGoal();
        int difficulty = createPlanBean.getDifficulty();
        int movementTimes = createPlanBean.getMovementTimes();
        String excludedDate = createPlanBean.getExcludedDate();
        gky.c().a(new ghz.a().a(Long.valueOf(ifw.a(createPlanBean.getBeginDate()))).d(Integer.valueOf(goal)).c(Integer.valueOf(difficulty)).b(Integer.valueOf(movementTimes)).c(excludedDate).c(Float.valueOf(createPlanBean.getWeight())).a(), dataCallback);
        if (goal == 1) {
            idy.e(difficulty, movementTimes, excludedDate);
        } else {
            idy.d(difficulty, movementTimes, excludedDate);
        }
    }

    @Override // com.huawei.health.plan.model.cloud.CloudApi
    public void postRunPlan(Plan plan, DataCallback dataCallback) {
        gjv.e eVarC = new gjv.e().e(plan.acquireId()).a(plan.acquireName()).g(Integer.valueOf(plan.acquireType())).a(Integer.valueOf(plan.getDifficulty())).f(Integer.valueOf(plan.getWeekCount())).a(Float.valueOf(plan.getCalorie())).b(Integer.valueOf(ped.h(plan.getDistance()))).b(plan.getPicture()).d(plan.acquireVersion()).d(Long.valueOf(ifw.e(plan.acquireStartDate(), "yyyy-MM-dd"))).c(Long.valueOf(ifw.e(plan.getEndDate(), "yyyy-MM-dd"))).c(gzm.d(plan.acquireExcludedDates())).e(Integer.valueOf(plan.acquireWeekTimes())).d(Integer.valueOf(plan.acquireGoal())).c(Integer.valueOf(plan.getRemindTime()));
        ArrayList arrayList = new ArrayList();
        int i = -1;
        ArrayList arrayList2 = null;
        for (PlanWorkout planWorkout : plan.acquireWorkouts()) {
            int iAcquireOrder = planWorkout.popWeekInfo().acquireOrder();
            if (i != iAcquireOrder) {
                ArrayList arrayList3 = new ArrayList();
                arrayList.add(new gjv.a.c().c(Integer.valueOf(iAcquireOrder)).e(planWorkout.popWeekInfo().getStage() + "").a(planWorkout.popWeekInfo().getSentence()).b(planWorkout.popWeekInfo().getWeekName()).c(arrayList3).b());
                arrayList2 = arrayList3;
                i = iAcquireOrder;
            }
            if (arrayList2 != null) {
                arrayList2.add(new gjv.c.d().a(Long.valueOf(ifw.e(planWorkout.popDayInfo().acquireDate(), "yyyy-MM-dd"))).b(planWorkout.popWorkoutId()).d(planWorkout.popName()).c(planWorkout.popDescription()).e(Integer.valueOf(planWorkout.popDayInfo().getSinglesCount())).e(planWorkout.popExtendParams()).a(planWorkout.popVersion()).b(Integer.valueOf(planWorkout.popWeekInfo().getDuration())).c(Integer.valueOf(planWorkout.popWeekInfo().getDuration() == 0 ? 0 : 1)).c());
            }
        }
        eVarC.e(arrayList);
        gky.c().a(eVarC.b(), dataCallback);
    }

    @Override // com.huawei.health.plan.model.cloud.CloudApi
    public void finishExercise(int i, WorkoutRecord workoutRecord, DataCallback dataCallback) {
        if (!d()) {
            ReleaseLogUtil.e("Suggestion_CloudImpl", "finishExercise failed since switch-off");
            dataCallback.onFailure(ResultUtil.ResultCode.PRIVACY_POST_OFF, "post switch-off");
            return;
        }
        if (TextUtils.isEmpty(workoutRecord.acquireVersion())) {
            workoutRecord.saveVersion("1.0");
        }
        gif.b bVarA = a(i, workoutRecord);
        List<HeartRateData> listAcquireHeartRateDataList = workoutRecord.acquireHeartRateDataList();
        if (njy.b(listAcquireHeartRateDataList)) {
            ArrayList arrayList = new ArrayList();
            for (HeartRateData heartRateData : listAcquireHeartRateDataList) {
                arrayList.add(new gif.e.b().c(Integer.valueOf(heartRateData.acquireHeartRate())).c(Long.valueOf(heartRateData.acquireTime())).a());
            }
            bVarA.b(arrayList);
        }
        List<HeartRateData> listAcquireInvalidHeartRateList = workoutRecord.acquireInvalidHeartRateList();
        if (njy.b(listAcquireInvalidHeartRateList)) {
            ArrayList arrayList2 = new ArrayList();
            for (HeartRateData heartRateData2 : listAcquireInvalidHeartRateList) {
                arrayList2.add(new gif.e.b().c(Integer.valueOf(heartRateData2.acquireHeartRate())).c(Long.valueOf(heartRateData2.acquireTime())).a());
            }
            bVarA.c(arrayList2);
        }
        gky.c().a(bVarA.b(), dataCallback);
    }

    private gif.b a(int i, WorkoutRecord workoutRecord) {
        ReleaseLogUtil.d("Suggestion_CloudImpl", "finishExercise b***y:", Integer.valueOf(i), " r***e:", Float.valueOf(workoutRecord.acquireFinishRate()), " p***d:", workoutRecord.acquirePlanId(), " w***d:", workoutRecord.acquireWorkoutId(), " d***e:", workoutRecord.acquireWorkoutDate(), " t***e:", Long.valueOf(workoutRecord.acquireExerciseTime()), " t**e:", Integer.valueOf(workoutRecord.getPlanTrainDate()));
        return new gif.b().f(Integer.valueOf(workoutRecord.acquireId())).a(Integer.valueOf(i)).e(workoutRecord.acquirePlanId()).n(Integer.valueOf(workoutRecord.acquireWeekNum())).c(Long.valueOf(ifw.e(workoutRecord.acquireWorkoutDate(), "yyyy-MM-dd"))).j(workoutRecord.acquireWorkoutId()).b(workoutRecord.acquireWorkoutName()).d(Integer.valueOf(workoutRecord.acquireWorkoutOrder())).e(Integer.valueOf(ped.g(workoutRecord.acquireDistance()))).c(Float.valueOf(workoutRecord.acquireCalorie())).b(Integer.valueOf(workoutRecord.acquireActualDistance() > 0.0f ? ped.g(workoutRecord.acquireActualDistance()) : ped.g(workoutRecord.acquireDistance()))).a(Float.valueOf(workoutRecord.acquireActualCalorie())).b(Float.valueOf(ped.a(workoutRecord.acquireFinishRate()))).i(Integer.valueOf(workoutRecord.getDuration())).g(Integer.valueOf(workoutRecord.acquireUpperHeartRate())).j(Integer.valueOf(workoutRecord.acquireLowerHeartRate())).c(Integer.valueOf(workoutRecord.acquireBestPace())).e(Long.valueOf(ifw.a(workoutRecord.acquireExerciseTime()))).d(Double.valueOf(workoutRecord.acquireOxygen())).l(Integer.valueOf(workoutRecord.acquireTrainingLoadPeak())).a(workoutRecord.acquireTrajectoryId()).d(workoutRecord.acquireActionSummary()).i(workoutRecord.acquireVersion()).m(Integer.valueOf(workoutRecord.acquireWearType())).d(Long.valueOf(workoutRecord.getTotalScore())).h(Integer.valueOf(workoutRecord.getRecordModeType())).c(workoutRecord.acquireExtend()).c(Boolean.valueOf(workoutRecord.getFeedBack() > 0));
    }

    @Override // com.huawei.health.plan.model.cloud.CloudApi
    public void getPlanProgress(String str, DataCallback dataCallback) {
        gky.c().a(new giz.b().b(str).b(), dataCallback);
    }

    @Override // com.huawei.health.plan.model.cloud.CloudApi
    public void finishPlan(FinishPlanBean finishPlanBean, DataCallback dataCallback) {
        LogUtil.a("Suggestion_CloudImpl", "actualDistance:", Integer.valueOf(ped.h(finishPlanBean.getActualDistance())), "actualDuration:", Long.valueOf((long) finishPlanBean.getActualDuration()), "actualCalorie:", Float.valueOf(finishPlanBean.getActualCalorie()));
        gky.c().a(new gil.e().b(finishPlanBean.getPlanId()).b(Float.valueOf(ped.a(finishPlanBean.getCompletionRate()))).c(Integer.valueOf(ped.h(finishPlanBean.getActualDistance()))).c(Float.valueOf(Math.max(finishPlanBean.getActualCalorie(), 0.0f))).a(Long.valueOf((long) finishPlanBean.getActualDuration())).d(Long.valueOf(ifw.a(finishPlanBean.getFinishTime()))).b(), dataCallback);
    }

    @Override // com.huawei.health.plan.model.cloud.CloudApi
    public void getFinishedPlans(int i, int i2, DataCallback dataCallback) {
        gky.c().a(new gjm.c().e(Integer.valueOf(i)).b(Integer.valueOf(i2)).c(), dataCallback);
    }

    @Override // com.huawei.health.plan.model.cloud.CloudApi
    public void postBehavior(WorkoutRecord workoutRecord, int i, DataCallback dataCallback) {
        gky.c().a(new gjt.e().b(workoutRecord.acquireWorkoutId()).e(workoutRecord.acquireVersion()).a(workoutRecord.acquireWorkoutPackageId()).b(Integer.valueOf(workoutRecord.acquireCourseBelongType())).d(Integer.valueOf(i)).d(), dataCallback);
    }

    @Override // com.huawei.health.plan.model.cloud.CloudApi
    public void checkAllowCreateOldPlan(DataCallback dataCallback) {
        gky.c().b(null, gkv.b(), dataCallback);
    }

    @Override // com.huawei.health.plan.model.cloud.CloudApi
    public void getCurrentPlan(DataCallback dataCallback) {
        gky.c().a(null, gkv.ai(), false, dataCallback);
    }

    @Override // com.huawei.health.plan.model.cloud.CloudApi
    public void updatePlanName(String str, String str2, DataCallback dataCallback) {
        gky.c().a(new gjp.d().c(str).b(str2).c(), dataCallback);
    }

    @Override // com.huawei.health.plan.model.cloud.CloudApi
    public void postPlanRemind(String str, int i, DataCallback dataCallback) {
        gky.c().a(new gjs.e().a(str).b(Integer.valueOf(i)).e(), dataCallback);
    }

    @Override // com.huawei.health.plan.model.cloud.CloudApi
    public void postBestRecord(String str, PlanStat planStat, DataCallback dataCallback) {
        if (!d()) {
            ReleaseLogUtil.e("Suggestion_CloudImpl", "postBestRecord failed since switch-off");
            return;
        }
        gjr.a aVarE = new gjr.a().e(str);
        gjr.d dVarE = new gjr.d.e().c(Integer.valueOf(planStat.getBestRecordForFirstOneKm())).g(Integer.valueOf(ped.g(planStat.getFarthestRunning()))).h(Integer.valueOf(planStat.getLongestRunning())).a(Integer.valueOf(planStat.getBestRecordForOneKm())).e(Integer.valueOf(planStat.getBestRecordForFiveKm())).i(Integer.valueOf(planStat.getBestRecordForTenKm())).d(Integer.valueOf(planStat.getBestRecordForHalfMarathon())).b(Integer.valueOf(planStat.getBestRecordForMarathon())).j(Integer.valueOf(planStat.getLongestTimePerWeek())).d(Float.valueOf(planStat.getMostCaloriePerWeek())).f(Integer.valueOf(planStat.getMostWorkoutTimes())).a(planStat.getMostWorkoutName()).b(Float.valueOf(planStat.getHighestCompleteRate())).e();
        aVarE.a(dVarE).c(new gjr.c.C0321c().c(Integer.valueOf(planStat.getBestRecordForAllFiveKm())).e(Integer.valueOf(planStat.getBestRecordForAllTenKm())).a(Integer.valueOf(planStat.getBestRecordForAllHalfMarathon())).b(Integer.valueOf(planStat.getBestRecordForAllMarathon())).b());
        gky.c().a(aVarE.d(), dataCallback);
    }

    @Override // com.huawei.health.plan.model.cloud.CloudApi
    public void postTrainBestRecords(BestRecordFitStat bestRecordFitStat, DataCallback dataCallback) {
        if (!d()) {
            ReleaseLogUtil.e("Suggestion_CloudImpl", "postTrainBestRecords failed since switch-off");
        } else {
            gky.c().a(new gju.d().a(bestRecordFitStat.acquireBestRecords()).e(bestRecordFitStat.acquireId()).d(Long.valueOf(bestRecordFitStat.acquireCompleteTime())).d(), dataCallback);
        }
    }

    private boolean d() {
        return "true".equals(ioi.d().c(3));
    }

    @Override // com.huawei.health.plan.model.cloud.CloudApi
    public void getUserBestRecords(DataCallback dataCallback) {
        gky.c().b(null, gkv.ak(), dataCallback);
    }

    @Override // com.huawei.health.plan.model.cloud.CloudApi
    public void queryTrainCountByWorkoutId(String str, DataCallback dataCallback) {
        gky.c().c((IRequest) new gke.d().d(str).d(), true, dataCallback);
    }

    @Override // com.huawei.health.plan.model.cloud.CloudApi
    public void queryTopicList(int i, DataCallback dataCallback) {
        queryTopicList(i, gld.d(), dataCallback);
    }

    @Override // com.huawei.health.plan.model.cloud.CloudApi
    public void queryTopicList(int i, String str, DataCallback dataCallback) {
        queryTopicList(0, i, str, dataCallback);
    }

    @Override // com.huawei.health.plan.model.cloud.CloudApi
    public void queryTopicList(int i, int i2, DataCallback dataCallback) {
        queryTopicList(i, i2, gld.d(), dataCallback);
    }

    @Override // com.huawei.health.plan.model.cloud.CloudApi
    public void queryTopicList(int i, int i2, String str, DataCallback dataCallback) {
        gky.c().c((IRequest) new gkd.b().c(Integer.valueOf(i)).e(Integer.valueOf(i2)).b(str).d(), true, dataCallback);
    }

    @Override // com.huawei.health.plan.model.cloud.CloudApi
    public void getMultiLanguage(long j, String str, DataCallback dataCallback) {
        gja.b bVarC = new gja.b().c(Long.valueOf(j));
        if (!TextUtils.isEmpty(str)) {
            bVarC.e(str);
        }
        gky.c().a(bVarC.b(), dataCallback);
    }

    @Override // com.huawei.health.plan.model.cloud.CloudApi
    public void getFitnessPkgInfo(int i, int i2, int i3, DataCallback dataCallback) {
        giw.a aVarC = new giw.a().a(0).e((Integer) 50).c(Integer.valueOf(i3));
        if (gnw.f35849b) {
            aVarC.d((Integer) 1);
        }
        gky.c().c((IRequest) aVarC.e(), true, dataCallback);
    }

    @Override // com.huawei.health.plan.model.cloud.CloudApi
    public void createFitnessPackagePlan(UserFitnessPlanInfo userFitnessPlanInfo, DataCallback dataCallback) {
        gky.c().a(new ghz.a().c(userFitnessPlanInfo).a(), dataCallback);
    }

    @Override // com.huawei.health.plan.model.cloud.CloudApi
    public void updateFitnessPackagePlan(UserFitnessPlanInfo userFitnessPlanInfo, DataCallback dataCallback) {
        gky.c().a(new gkj.d().e(userFitnessPlanInfo).e(), dataCallback);
    }

    @Override // com.huawei.health.plan.model.cloud.CloudApi
    public void queryFitnessPlanSummary(DataCallback dataCallback) {
        gky.c().a(null, gkv.bk(), true, dataCallback);
    }

    @Override // com.huawei.health.plan.model.cloud.CloudApi
    public void queryFitnessPkgPlan(String str, DataCallback dataCallback) {
        gky.c().c((IRequest) new gjz.a().b(str).c(), true, dataCallback);
    }

    @Override // com.huawei.health.plan.model.cloud.CloudApi
    public void queryMyDoingFitnessPlan(DataCallback dataCallback) {
        gky.c().a(null, gkv.br(), false, dataCallback);
    }

    @Override // com.huawei.health.plan.model.cloud.CloudApi
    public void queryOperationPage(int i, DataCallback dataCallback) {
        gky.c().a(new gjy.e().b(Integer.valueOf(i)).a(), dataCallback);
    }

    @Override // com.huawei.health.plan.model.cloud.CloudApi
    public void getWorkOutsByTopicId(int i, int i2, DataCallback dataCallback) {
        getWorkOutsByTopicId(i, i2, gld.d(), dataCallback);
    }

    @Override // com.huawei.health.plan.model.cloud.CloudApi
    public void getWorkOutsByTopicId(int i, int i2, String str, DataCallback dataCallback) {
        gky.c().c((IRequest) new gjh.d().e(Integer.valueOf(i)).a(Integer.valueOf(i2)).a(str).d(), true, dataCallback);
    }

    @Override // com.huawei.health.plan.model.cloud.CloudApi
    public void getWorkoutsByType(int i, int i2, DataCallback dataCallback) {
        getWorkoutsByType(i, i2, gld.d(), dataCallback);
    }

    @Override // com.huawei.health.plan.model.cloud.CloudApi
    public void getWorkoutsByType(int i, int i2, String str, DataCallback dataCallback) {
        gky.c().c((IRequest) new gjk.c().c(Integer.valueOf(i)).a(Integer.valueOf(i2)).e(str).d(), true, dataCallback);
    }

    @Override // com.huawei.health.plan.model.cloud.CloudApi
    public void setEvent(float f, int i, long j, DataCallback dataCallback) {
        if (!d()) {
            ReleaseLogUtil.e("Suggestion_CloudImpl", "setEvent failed since switch-off");
            dataCallback.onFailure(ResultUtil.ResultCode.PRIVACY_POST_OFF, "post switch-off");
        } else {
            gky.c().a(new gkh.c().c("EXERCISE_FINISH").e(MedalConstants.COMPLEX).e(Long.valueOf(j)).a(new gkh.d.a().d(Float.valueOf(f)).b(Integer.valueOf(i)).c()).b(), dataCallback);
        }
    }

    @Override // com.huawei.health.plan.model.cloud.CloudApi
    public void postDeleteUserWorkout(List<Workout> list, DataCallback dataCallback) {
        ArrayList arrayList = new ArrayList();
        for (Workout workout : list) {
            arrayList.add(new gih.a.d().b(workout.acquireId()).d(workout.accquireVersion()).a(Integer.valueOf(workout.getCourseBelongType())).b());
        }
        gky.c().a(new gih.b().b(arrayList).e(), dataCallback);
    }

    @Override // com.huawei.health.plan.model.cloud.CloudApi
    public void queryTrainStatistics(int i, DataCallback dataCallback) {
        gky.c().a(new gkb.d().d(Integer.valueOf(i)).e(), dataCallback);
    }

    @Override // com.huawei.health.plan.model.cloud.CloudApi
    public void queryPlanStatistics(int i, DataCallback dataCallback) {
        gky.c().a(new gkc.c().a(Integer.valueOf(i)).e(), dataCallback);
    }

    @Override // com.huawei.health.plan.model.cloud.CloudApi
    public void collectBehavior(String str, DataCallback dataCallback) {
        gky.c().a(new gic.a().a(str).d(), dataCallback);
    }

    @Override // com.huawei.health.plan.model.cloud.CloudApi
    public void collectBehavior(String str, int i, DataCallback dataCallback) {
        gky.c().a(new gic.a().a(str).d(i).d(str).d(), dataCallback);
    }

    @Override // com.huawei.health.plan.model.cloud.CloudApi
    public void deleteBehavior(String str, int i, DataCallback dataCallback) {
        gky.c().a(new ghy.b().e(str).d((Integer) 2).c(Integer.valueOf(i)).e(), dataCallback);
    }

    @Override // com.huawei.health.plan.model.cloud.CloudApi
    public void getBehaviorList(int i, int i2, int i3, DataCallback dataCallback) {
        gky.c().a(new gip.e().b(Integer.valueOf(i)).d(Integer.valueOf(i2)).a(Integer.valueOf(i3)).e(), dataCallback);
    }

    @Override // com.huawei.health.plan.model.cloud.CloudApi
    public void deleteUserWorkoutRecords(int i, int i2, DataCallback dataCallback) {
        gky.c().a(new gib.d().d(Integer.valueOf(i)).c(Integer.valueOf(i2)).d(), dataCallback);
    }

    @Override // com.huawei.health.plan.model.cloud.CloudApi
    public void downloadFile(String str, String str2, DataCallback dataCallback) {
        downloadFile(str, str2, dataCallback, false);
    }

    @Override // com.huawei.health.plan.model.cloud.CloudApi
    public void downloadFile(String str, String str2, DataCallback dataCallback, boolean z) {
        File file = new File(str2);
        if (!file.exists() || z) {
            ghu.d(str, str2, dataCallback);
            return;
        }
        dataCallback.onSuccess(new JSONObject());
        if (file.isDirectory()) {
            LogUtil.j("Suggestion_CloudImpl", "downloadFile as directory, url=", str, ", path=", str2, ", override=", Boolean.valueOf(z));
        }
    }

    @Override // com.huawei.health.plan.model.cloud.CloudApi
    public void cancelDownloadFile(String str) {
        oet.d().b(str);
    }

    @Override // com.huawei.health.plan.model.cloud.CloudApi
    public void getTrainActions(List<String> list, int i, DataCallback dataCallback) {
        gky.c().c((IRequest) new gii.e().d(list).d(i).e(), true, dataCallback);
    }

    @Override // com.huawei.health.plan.model.cloud.CloudApi
    public void queryTrainCount(DataCallback dataCallback) {
        gky.c().b(null, gkv.bw(), dataCallback);
    }

    @Override // com.huawei.health.plan.model.cloud.CloudApi
    public void getWorkoutFilters(List<Integer> list, DataCallback dataCallback) {
        gjf.b bVarB = new gjf.b().b(gld.d());
        if (njy.b(list)) {
            bVarB.b(list);
        }
        gky.c().c((IRequest) bVarB.b(), true, dataCallback);
    }

    @Override // com.huawei.health.plan.model.cloud.CloudApi
    public void getAggregatePageByType(int i, DataCallback dataCallback) {
        gky.c().c((IRequest) new gix.d().b(i).e(), true, dataCallback);
    }

    @Override // com.huawei.health.plan.model.cloud.CloudApi
    public void getWorkoutList(int i, int i2, int i3, int i4, DataCallback dataCallback) {
        gjj.e eVarB = new gjj.e().c(Integer.valueOf(i)).e(Integer.valueOf(i2)).g(Integer.valueOf(i4)).b(gld.d());
        if (i3 != 0) {
            eVarB.f(Integer.valueOf(i3));
        }
        gky.c().c((IRequest) eVarB.d(), true, dataCallback);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:23:0x0063  */
    @Override // com.huawei.health.plan.model.cloud.CloudApi
    public void getBehaviorList(int i, int i2, int i3, String str, DataCallback dataCallback) {
        byte b2;
        gip.e eVarA = new gip.e().b(Integer.valueOf(i)).d(Integer.valueOf(i2)).a(Integer.valueOf(i3));
        if (!TextUtils.isEmpty(str)) {
            ArrayList arrayList = new ArrayList(1);
            str.hashCode();
            switch (str) {
                case "YOGA_COURSE":
                    b2 = 0;
                    break;
                case "WALKING_COURSE":
                    b2 = 1;
                    break;
                case "RUNNING_COURSE":
                    b2 = 2;
                    break;
                case "FITNESS_COURSE":
                    b2 = 3;
                    break;
                default:
                    b2 = -1;
                    break;
            }
            if (b2 == 0) {
                arrayList.add(1);
                eVarA.d(arrayList).c((Integer) 137);
            } else if (b2 == 1) {
                arrayList.add(1);
                eVarA.d(arrayList).c((Integer) 257);
            } else if (b2 == 2) {
                arrayList.add(2);
                eVarA.d(arrayList);
            } else if (b2 == 3) {
                arrayList.add(1);
                eVarA.d(arrayList).c((Integer) 0);
            } else {
                dataCallback.onFailure(-5, ResultUtil.c(-5));
                return;
            }
        }
        gky.c().a(eVarA.e(), dataCallback);
    }

    @Override // com.huawei.health.plan.model.cloud.CloudApi
    public void getFitnessWorkoutRecommendList(String str, DataCallback dataCallback) {
        gky.c().c((IRequest) new gje.b().b(str).a(), true, dataCallback);
    }

    @Override // com.huawei.health.plan.model.cloud.CloudApi
    public void getFitnessRecWorkoutByCourseTypeList(int i, DataCallback dataCallback) {
        gky.c().c((IRequest) new gjg.d().d(Integer.valueOf(i)).b(), true, dataCallback);
    }

    @Override // com.huawei.health.plan.model.cloud.CloudApi
    public void getActionList(int i, int i2, int i3, int i4, DataCallback dataCallback) {
        gky.c().c((IRequest) new gij.d().e(Integer.valueOf(i)).d(Integer.valueOf(i2)).c(Integer.valueOf(i3)).a(Integer.valueOf(i4)).e(), true, dataCallback);
    }

    @Override // com.huawei.health.plan.model.cloud.CloudApi
    public void searchActionList(int i, int i2, int i3, String str, DataCallback dataCallback) {
        gij.d dVarD = new gij.d().e(Integer.valueOf(i)).d(Integer.valueOf(i2)).d(str);
        if (i3 > 0) {
            dVarD.a(Integer.valueOf(i3));
        }
        gky.c().a(dVarD.e(), dataCallback);
    }

    @Override // com.huawei.health.plan.model.cloud.CloudApi
    public void getFitnessActionInfo(String str, String str2, DataCallback dataCallback) {
        gky.c().c((IRequest) new giq.e().a(str).b(str2).b(), true, dataCallback);
    }

    @Override // com.huawei.health.plan.model.cloud.CloudApi
    public void getLongVideoInfo(gzl gzlVar, DataCallback dataCallback) throws Throwable {
        String strG = gzlVar.g();
        FitWorkout fitWorkoutA = gmc.g().o().a(strG);
        gky.c().a(new gjl.d().d(strG).e(fitWorkoutA == null ? "" : fitWorkoutA.accquireVersion()).c(gzlVar.a()).b(Integer.valueOf(gzlVar.c())).b(), dataCallback);
    }

    @Override // com.huawei.health.plan.model.cloud.CloudApi
    public void queryEssenceVideos(String str, DataCallback dataCallback) {
        gjw gjwVar = new gjw();
        gjwVar.d(str);
        gky.c().a(gjwVar, dataCallback);
    }

    @Override // com.huawei.health.plan.model.cloud.CloudApi
    public void uploadBehavior(pdh pdhVar, DataCallback dataCallback) {
        gkt gktVar = new gkt();
        gktVar.e(Collections.singletonList(pdhVar));
        gky.c().a(gktVar, dataCallback);
    }

    @Override // com.huawei.health.plan.model.cloud.CloudApi
    public void getRunRecommendCourse(DataCallback dataCallback) {
        gky.c().a(null, gkv.aj(), true, dataCallback);
    }

    @Override // com.huawei.health.plan.model.cloud.CloudApi
    public void queryTrainList(long j, long j2, int i, DataCallback dataCallback) {
        gky.c().a(new gkf.e().b(Long.valueOf(j)).d(Long.valueOf(j2)).e(Integer.valueOf(i)).a((Integer) 1).d(), dataCallback);
    }

    @Override // com.huawei.health.plan.model.cloud.CloudApi
    public void getAllPlans(int i, DataCallback dataCallback) {
        gky.c().c((IRequest) new gik.d().d(Integer.valueOf(i)).a(gld.d()).d(), true, dataCallback);
    }

    @Override // com.huawei.health.plan.model.cloud.CloudApi
    public void getAchievementForecast(int i, int i2, int i3, int i4, DataCallback dataCallback) {
        gky.c().a(new ght.d().d(Integer.valueOf(i)).e(Integer.valueOf(i2)).b(Integer.valueOf(i3)).c(Integer.valueOf(i4)).a(), dataCallback);
    }

    @Override // com.huawei.health.plan.model.cloud.CloudApi
    public void createPlan(CreateRunPlanParams createRunPlanParams, DataCallback dataCallback) {
        createRunPlanParams.getPlanInfoBean().setLanguage(gld.d());
        gky.c().b(createRunPlanParams, gkv.j(), dataCallback);
    }

    @Override // com.huawei.health.plan.model.cloud.CloudApi
    public void postFeedback(pec pecVar, DataCallback dataCallback) {
        gky.c().b(pecVar, gkv.be(), dataCallback);
    }

    @Override // com.huawei.health.plan.model.cloud.CloudApi
    public void getTrainingReport(String str, DataCallback dataCallback) {
        gky.c().a(new giy.e().d(str).c(gld.d()).d(), dataCallback);
    }

    @Override // com.huawei.health.plan.model.cloud.CloudApi
    public void getCoachAdvice(String str, int i, DataCallback dataCallback) {
        gky.c().a(new gir.d().d(str).b(Integer.valueOf(i)).d(Boolean.valueOf(CommonUtil.ap())).b(), dataCallback);
    }

    @Override // com.huawei.health.plan.model.cloud.CloudApi
    public void getCurrentReportIndex(DataCallback dataCallback) {
        gky.c().b(null, gkv.u(), dataCallback);
    }

    @Override // com.huawei.health.plan.model.cloud.CloudApi
    public void updatePlan(UserInfoBean userInfoBean, int i, DataCallback dataCallback) {
        gky.c().a(new gks.d().b(userInfoBean).c(Integer.valueOf(i)).d(Boolean.valueOf(CommonUtil.ap())).d(), dataCallback);
    }

    @Override // com.huawei.health.plan.model.cloud.CloudApi
    public void updatePlanDate(String str, List<Integer> list, List<Integer> list2, DataCallback dataCallback) {
        gky.c().a(new gkp.b().b(str).e(list).c(list2).c(), dataCallback);
    }

    @Override // com.huawei.health.plan.model.cloud.CloudApi
    public void updatePlanReport(String str, String str2, DataCallback dataCallback) {
        gky.c().a(new gku.e().c(str).d(str2).b(), dataCallback);
    }

    @Override // com.huawei.health.plan.model.cloud.CloudApi
    public void updateClockTimes(int i, String str, int i2, int i3, String str2, DataCallback dataCallback) {
        gky.c().a(new gkq.d().b(Integer.valueOf(i)).b(str).e(Integer.valueOf(i2)).d(Integer.valueOf(i3)).c(str2).a(), dataCallback);
    }

    @Override // com.huawei.health.plan.model.cloud.CloudApi
    public void getDoingIntPlan(DataCallback dataCallback) {
        gky.c().a(null, gkv.w(), false, dataCallback);
    }

    @Override // com.huawei.health.plan.model.cloud.CloudApi
    public void createIntPlan(IntPlanBean intPlanBean, DataCallback dataCallback) {
        gky.c().a(new gia.a().a(intPlanBean).e(), dataCallback);
    }

    @Override // com.huawei.health.plan.model.cloud.CloudApi
    public void updateAction(peb pebVar, DataCallback dataCallback) {
        gky.c().b(pebVar, gkv.au(), dataCallback);
    }

    @Override // com.huawei.health.plan.model.cloud.CloudApi
    public void stopIntPlan(gki gkiVar, DataCallback dataCallback) {
        gky.c().a(gkiVar, dataCallback);
    }

    @Override // com.huawei.health.plan.model.cloud.CloudApi
    public void updateIntPlan(UserProfileBean userProfileBean, String str, int i, DataCallback dataCallback) {
        gky.c().a(new gkn.e().a(userProfileBean).c(str).a(i).e(0).b(), dataCallback);
    }

    @Override // com.huawei.health.plan.model.cloud.CloudApi
    public void updateIntPlanReport(String str, int i, int i2, String str2, long j, DataCallback dataCallback) {
        gky.c().a(new gko.d().a(str).e(i).d(i2).b(str2).a(j).e(), dataCallback);
    }

    @Override // com.huawei.health.plan.model.cloud.CloudApi
    public void getIntPlanReport(String str, int i, int i2, DataCallback dataCallback) {
        gky.c().a(new giv.a().e(str).a(i).e(i2).b(), dataCallback);
    }

    @Override // com.huawei.health.plan.model.cloud.CloudApi
    public void updatePlanInfo(String str, int i, String str2, String str3, DataCallback dataCallback) {
        gky.c().a(new gkl.c().c(str).a(i).d(str2).a(str3).c(), dataCallback);
    }

    @Override // com.huawei.health.plan.model.cloud.CloudApi
    public void addUserDefinedWorkout(String str, String str2, int i, List<ChoreographedMultiActions> list, DataCallback dataCallback) {
        gky.c().b(new gkr.c().b(str).a(str2).c(i).b(e(list)).e(), gkv.d(), dataCallback);
    }

    private List<gkr.e> e(List<ChoreographedMultiActions> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null && list.size() > 0) {
            for (ChoreographedMultiActions choreographedMultiActions : list) {
                gkr.e.c cVar = new gkr.e.c();
                cVar.c(choreographedMultiActions.getRepeatTimes());
                if (choreographedMultiActions.getActionList() != null && choreographedMultiActions.getActionList().size() > 0) {
                    ArrayList arrayList2 = new ArrayList();
                    for (ChoreographedSingleAction choreographedSingleAction : choreographedMultiActions.getActionList()) {
                        gkr.b.a aVar = new gkr.b.a();
                        if (choreographedSingleAction.getAction() != null) {
                            aVar.c(choreographedSingleAction.getAction().getId()).e(choreographedSingleAction.getAction().getName());
                        }
                        aVar.a(choreographedSingleAction.getTargetConfig()).b(choreographedSingleAction.getIntensityConfig());
                        arrayList2.add(aVar.d());
                    }
                    cVar.a(arrayList2);
                }
                arrayList.add(cVar.e());
            }
        }
        return arrayList;
    }

    @Override // com.huawei.health.plan.model.cloud.CloudApi
    public void modifyUserDefinedWorkout(FitWorkout fitWorkout, DataCallback dataCallback) {
        gky.c().b(new gkr.c().d(fitWorkout.acquireId()).b(fitWorkout.acquireName()).a(fitWorkout.acquireDescription()).c(fitWorkout.getCourseDefineType()).b(e(fitWorkout.getCourseActions())).e(), gkv.az(), dataCallback);
    }

    @Override // com.huawei.health.plan.model.cloud.CloudApi
    public void deleteUserDefinedWorkout(String str, int i, DataCallback dataCallback) {
        gky.c().a(new gie.a().c(str).d(i).b(), dataCallback);
    }

    @Override // com.huawei.health.plan.model.cloud.CloudApi
    public void postIntFeedback(pec pecVar, DataCallback dataCallback) {
        gky.c().b(pecVar, gkv.av(), dataCallback);
    }

    @Override // com.huawei.health.plan.model.cloud.CloudApi
    public void generateReport(int i, IntPlanBean intPlanBean, DataCallback dataCallback) {
        gky.c().a(new gim.c().b(i).c(intPlanBean).b(), dataCallback);
    }

    @Override // com.huawei.health.plan.model.cloud.CloudApi
    public void updateDayRecord(int i, String str, int i2, int i3, pdr pdrVar, DataCallback dataCallback) {
        if (pdrVar.k() < 0) {
            ReleaseLogUtil.e("Suggestion_CloudImpl", "updateDayRecord() Bean TrainPoint lower than 0, reset to 0");
            pdrVar.d(0);
        }
        gky.c().a(new gkk.b().c(Integer.valueOf(i)).d(str).e(Integer.valueOf(i2)).a(Integer.valueOf(i3)).b(pdrVar).b(), dataCallback);
    }

    @Override // com.huawei.health.plan.model.cloud.CloudApi
    public void deletePlanExerciseRecord(int i, String str, String str2, DataCallback dataCallback) {
        gky.c().a(new gig.b().c(Integer.valueOf(i)).c(str).e(str2).c(), dataCallback);
    }

    @Override // com.huawei.health.plan.model.cloud.CloudApi
    public void replacePlanSchedule(ReplacePlanBean replacePlanBean, DataCallback dataCallback) {
        gky.c().a(new gkg.d().e(replacePlanBean.getPlanId()).c(Integer.valueOf(replacePlanBean.getPlanType())).b(Integer.valueOf(replacePlanBean.getWeekNo())).d(Integer.valueOf(replacePlanBean.getDayNo())).c(replacePlanBean.getPropensityWorkoutId()).d(replacePlanBean.getReplacedWorkoutId()).b(), dataCallback);
    }

    @Override // com.huawei.health.plan.model.cloud.CloudApi
    public void leavePlan(LeavePlanCalendarBean leavePlanCalendarBean, DataCallback dataCallback) {
        gky.c().a(new gjo.c().c(leavePlanCalendarBean.getPlanId()).c(leavePlanCalendarBean.getCategory()).a(leavePlanCalendarBean.getSubCategory()).e(leavePlanCalendarBean.getLeaveInfo()).a(), dataCallback);
    }

    @Override // com.huawei.health.plan.model.cloud.CloudApi
    public void cancelLeave(LeavePlanCalendarBean leavePlanCalendarBean, DataCallback dataCallback) {
        gky.c().a(new ghx.c().b(leavePlanCalendarBean.getPlanId()).a(leavePlanCalendarBean.getCategory()).e(leavePlanCalendarBean.getSubCategory()).c(leavePlanCalendarBean.getLeaveInfo()).a(), dataCallback);
    }

    @Override // com.huawei.health.plan.model.cloud.CloudApi
    public void updatePlanCalendar(LeavePlanCalendarBean leavePlanCalendarBean, DataCallback dataCallback) {
        gky.c().a(new gkm.a().e(leavePlanCalendarBean.getPlanId()).b(leavePlanCalendarBean.getCategory()).d(leavePlanCalendarBean.getSubCategory()).c(leavePlanCalendarBean.getOperationType()).d(leavePlanCalendarBean.getDays()).b(leavePlanCalendarBean.getExercisePlan()).e(), dataCallback);
    }

    @Override // com.huawei.health.plan.model.cloud.CloudApi
    public void getFilterTab(String str, DataCallback dataCallback) {
        gky.c().a(new gio.d().b(str).a(), dataCallback);
    }

    @Override // com.huawei.health.plan.model.cloud.CloudApi
    public void queryAudiosPackageBySeriesId(String str, DataCallback dataCallback) {
        gky.c().a(new gka.e().c(str).e(), dataCallback);
    }

    @Override // com.huawei.health.plan.model.cloud.CloudApi
    public void getAudioBehaviorList(int i, int i2, int i3, int i4, DataCallback dataCallback) {
        gky.c().a(new gin.e().d(Integer.valueOf(i)).a(Integer.valueOf(i2)).c(Integer.valueOf(i3)).b(Integer.valueOf(i4)).e(), dataCallback);
    }

    @Override // com.huawei.health.plan.model.cloud.CloudApi
    public void getAudioBehaviorList(gzc gzcVar, DataCallback dataCallback) {
        gky.c().b(gzcVar, gkv.v(), dataCallback);
    }

    @Override // com.huawei.health.plan.model.cloud.CloudApi
    public void operateFavoriteAudio(int i, int i2, DataCallback dataCallback) {
        gky.c().a(new gjq.c().b(Integer.valueOf(i)).a(Integer.valueOf(i2)).c(), dataCallback);
    }

    @Override // com.huawei.health.plan.model.cloud.CloudApi
    public void deletePlayRecord(List<Integer> list, DataCallback dataCallback) {
        gky.c().a(new gid.b().a(list).a(), dataCallback);
    }

    @Override // com.huawei.health.plan.model.cloud.CloudApi
    public void getWorkoutPackage(gzj gzjVar, DataCallback dataCallback) {
        gky.c().c((IRequest) new gji.b().e(gzjVar.d()).b(gzjVar.e()).b(), true, dataCallback);
    }

    @Override // com.huawei.health.plan.model.cloud.CloudApi
    public void getFitnessActionTemplate(String str, DataCallback dataCallback) {
        gky.c().c((IRequest) new giu(str), true, dataCallback);
    }

    @Override // com.huawei.health.plan.model.cloud.CloudApi
    public void getFitnessMaxScore(String str, int i, DataCallback dataCallback) {
        gky.c().c((IRequest) new gis(str, i), false, dataCallback);
    }

    @Override // com.huawei.health.plan.model.cloud.CloudApi
    public void getUserRank(git gitVar, final DataCallback dataCallback) {
        HealthDataCloudFactory healthDataCloudFactory = new HealthDataCloudFactory(BaseApplication.getContext());
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        oet.d().c(gitVar.getUrl(), healthDataCloudFactory.getHeaders(), ofe.c(healthDataCloudFactory.getBody(gitVar)), String.class, new ResultCallback<String>() { // from class: ghv.5
            @Override // com.huawei.networkclient.ResultCallback
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onSuccess(String str) {
                gky.c().a(str, dataCallback, jElapsedRealtime);
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                gky.c().d(th, dataCallback, jElapsedRealtime);
            }
        });
    }

    @Override // com.huawei.health.plan.model.cloud.CloudApi
    public void getMyCompetitions(gjx gjxVar, DataCallback dataCallback) {
        gky.c().c(gjxVar.a(), gjxVar.getUrl(), dataCallback);
    }

    @Override // com.huawei.health.plan.model.cloud.CloudApi
    public void getMyCompetitionsByTime(gjx gjxVar, long j, long j2, DataCallback dataCallback) {
        gky.c().c(gjxVar.c(j, j2), gjxVar.getUrl(), dataCallback);
    }

    @Override // com.huawei.health.plan.model.cloud.CloudApi
    public void getRecommendResource(List<String> list, DataCallback dataCallback) {
        gky.c().c((IRequest) new gjd(list), false, dataCallback);
    }
}
