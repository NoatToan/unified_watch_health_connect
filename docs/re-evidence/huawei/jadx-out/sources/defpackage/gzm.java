package defpackage;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.huawei.basefitnessadvice.model.DayInfo;
import com.huawei.basefitnessadvice.model.Introduction;
import com.huawei.basefitnessadvice.model.Plan;
import com.huawei.basefitnessadvice.model.PlanRecord;
import com.huawei.basefitnessadvice.model.PlanWorkout;
import com.huawei.basefitnessadvice.model.RunWorkout;
import com.huawei.basefitnessadvice.model.WeekInfo;
import com.huawei.health.device.api.IndoorEquipManagerApi;
import com.huawei.health.sport.model.WorkoutRecord;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseConstants;
import com.huawei.hwfoundationmodel.trackmodel.HeartRateData;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import com.huawei.pluginfitnessadvice.pricetagbean.PriceTagBean;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public class gzm {
    public static Plan a(JSONObject jSONObject, String str) {
        JSONObject jSONObjectOptJSONObject;
        if (jSONObject == null || (jSONObjectOptJSONObject = jSONObject.optJSONObject(str)) == null) {
            return null;
        }
        Plan plan = new Plan();
        b(jSONObjectOptJSONObject, plan);
        List<Integer> list = (List) new Gson().fromJson(jSONObjectOptJSONObject.optString("runDate"), new TypeToken<List<Integer>>() { // from class: com.huawei.health.sport.model.data.DataRunPlanConvert$1
        }.getType());
        List<Integer> list2 = (List) new Gson().fromJson(jSONObjectOptJSONObject.optString("exeDate"), new TypeToken<List<Integer>>() { // from class: com.huawei.health.sport.model.data.DataRunPlanConvert$2
        }.getType());
        List<pdq> list3 = (List) new Gson().fromJson(jSONObjectOptJSONObject.optString("weeklyPlans"), new TypeToken<List<pdq>>() { // from class: com.huawei.health.sport.model.data.DataRunPlanConvert$3
        }.getType());
        plan.setRunDate(list);
        plan.setExeDate(list2);
        plan.setPlanWeekDataList(list3);
        plan.setTransactionStatus(jSONObjectOptJSONObject.optInt("transactionStatus", 0));
        plan.setCommodityFlag(jSONObjectOptJSONObject.optInt("commodityFlag"));
        plan.setCornerImgDisplay(jSONObjectOptJSONObject.optInt("cornerImgDisplay"));
        plan.setPriceTagBeanList((List) new Gson().fromJson(jSONObjectOptJSONObject.optString("cornerList"), new TypeToken<List<PriceTagBean>>() { // from class: com.huawei.health.sport.model.data.DataRunPlanConvert$4
        }.getType()));
        plan.setVersion(jSONObjectOptJSONObject.optString("version"));
        plan.setRemindTime(jSONObjectOptJSONObject.optInt("remindTime"));
        plan.setWeekTrainingDays(jSONObjectOptJSONObject.optInt("totalDay"));
        LogUtil.a("Suggestion_DataRunPlanConvert", "setWeekTrainingDays:", Integer.valueOf(plan.getWeekTrainingDays()));
        b(plan);
        plan.setLatestClockInTime(System.currentTimeMillis());
        plan.saveIntroduction((Introduction) new Gson().fromJson(jSONObjectOptJSONObject.optString("introduction"), Introduction.class));
        plan.setPlanCategory(jSONObject.optInt("intPlanCategory"));
        LogUtil.a("Suggestion_DataRunPlanConvert", "doGetCurrentPlan:", Integer.valueOf(plan.getPlanCategory()));
        if ("planDetail".equals(str)) {
            plan.setPlanCategory(1);
            return plan;
        }
        plan.saveWorkouts(d(jSONObject.optJSONArray("weekInfos")));
        plan.saveWorkoutCount(plan.acquireWorkouts().size());
        return plan;
    }

    private static void b(JSONObject jSONObject, Plan plan) {
        plan.saveId(jSONObject.optString("planId"));
        plan.putName(jSONObject.optString("name"));
        plan.saveType(jSONObject.optInt("type"));
        plan.saveTempId(jSONObject.optInt("planType"));
        plan.setGroupType(jSONObject.optInt("group_type"));
        plan.setDifficulty(jSONObject.optInt("difficulty"));
        plan.setTimeZone(jSONObject.optString("timeZone"));
        plan.saveWeekCount(jSONObject.optInt("weekCount"));
        plan.saveCalorie(jSONObject.optInt("calorie"));
        plan.setDistance(ped.b(jSONObject.optInt("distance")));
        plan.savePicture(jSONObject.optString("picture"));
        plan.setExcludedDates(ifp.g(jSONObject.optString("excludedDate")));
        plan.setWeekTimes(jSONObject.optInt("movementTimes"));
        plan.setGoal(jSONObject.optInt(ParsedFieldTag.GOAL));
        d(jSONObject, plan);
        plan.setTrainLevel(jSONObject.optInt("trainLevel"));
        plan.setTargetTime(jSONObject.optInt("targetTime"));
        plan.setPbBeforePlan(jSONObject.optInt("pbBeforePlan"));
        plan.setPbCurrent(jSONObject.optInt("pbCurrent"));
        plan.setDescription(jSONObject.optString("description"));
    }

    private static void d(JSONObject jSONObject, Plan plan) {
        plan.saveEndDate(ifw.a(jSONObject.optLong("endDate"), ift.b(plan.getTimeZone()), "yyyy-MM-dd"));
        plan.saveStartDate(ifw.a(jSONObject.optLong(ParsedFieldTag.BEGIN_DATE), ift.b(plan.getTimeZone()), "yyyy-MM-dd"));
        plan.setStartTime(jSONObject.optLong(ParsedFieldTag.BEGIN_DATE));
        plan.setEndTime(jSONObject.optLong("endDate"));
        plan.saveDays(lsl.d(plan.acquireStartDate(), plan.getEndDate(), DateFormatUtil.DateFormatType.DATE_FORMAT_YYYY_MM_DD));
    }

    private static void b(Plan plan) {
        if (plan.acquireType() == 0) {
            for (pdq pdqVar : plan.getPlanWeekDataList()) {
                if (pdqVar != null) {
                    int iJ = pdqVar.j();
                    pdqVar.a(btw.e(plan, iJ));
                    pdqVar.b(btw.d(plan, iJ));
                }
            }
        }
    }

    public static Boolean b(JSONObject jSONObject) {
        if (jSONObject != null) {
            return Boolean.valueOf(jSONObject.optBoolean("allowCreateOldPlan"));
        }
        LogUtil.e("Suggestion_DataRunPlanConvert", "toAllowCreateOldPlan() isAllowCreateOldPlan is null");
        return true;
    }

    public static List<PlanWorkout> d(JSONArray jSONArray) {
        JSONObject jSONObjectOptJSONObject;
        JSONArray jSONArrayOptJSONArray;
        ArrayList arrayList = new ArrayList(16);
        if (jSONArray != null) {
            loop0: for (int i = 0; i < jSONArray.length() && (jSONObjectOptJSONObject = jSONArray.optJSONObject(i)) != null && (jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("courses")) != null; i++) {
                for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                    JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i2);
                    if (jSONObjectOptJSONObject2 == null) {
                        break loop0;
                    }
                    PlanWorkout planWorkout = new PlanWorkout();
                    planWorkout.putName(jSONObjectOptJSONObject2.optString("name"));
                    planWorkout.putDescription(jSONObjectOptJSONObject2.optString("description"));
                    planWorkout.putWorkoutId(jSONObjectOptJSONObject2.optString(HwExerciseConstants.METHOD_PARAM_WORKOUT_ID));
                    planWorkout.putExtendParams(jSONObjectOptJSONObject2.optString("runningParas"));
                    planWorkout.putVersion(jSONObjectOptJSONObject2.optString("version"));
                    planWorkout.putWeekInfo(a(jSONObjectOptJSONObject, jSONObjectOptJSONObject2));
                    planWorkout.putDayInfo(a(jSONObjectOptJSONObject2));
                    arrayList.add(planWorkout);
                }
            }
        }
        return arrayList;
    }

    private static DayInfo a(JSONObject jSONObject) {
        DayInfo dayInfo = new DayInfo();
        dayInfo.saveSinglesCount(jSONObject.optInt("displayorder"));
        long jOptLong = jSONObject.optLong("trainingDate");
        dayInfo.saveOrder(ieg.j(ifw.e(jOptLong)));
        dayInfo.saveDate(ifw.d(jOptLong, "yyyy-MM-dd"));
        return dayInfo;
    }

    private static WeekInfo a(JSONObject jSONObject, JSONObject jSONObject2) {
        WeekInfo weekInfo = new WeekInfo();
        weekInfo.setDuration(jSONObject2.optInt("duration"));
        weekInfo.saveOrder(jSONObject.optInt("displayorder"));
        weekInfo.saveSentence(jSONObject.optString("sentence"));
        weekInfo.saveWeekName(jSONObject.optString("stage"));
        weekInfo.setStage(jSONObject.optInt("stage"));
        return weekInfo;
    }

    public static List<PlanRecord> b(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList(16);
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    PlanRecord planRecord = new PlanRecord();
                    planRecord.savePlanId(jSONObjectOptJSONObject.optString("planId"));
                    planRecord.savePlanName(jSONObjectOptJSONObject.optString("name"));
                    planRecord.savePlanType(jSONObjectOptJSONObject.optInt("type"));
                    planRecord.saveStartDate(ifw.d(jSONObjectOptJSONObject.optLong(ParsedFieldTag.BEGIN_DATE), "yyyy-MM-dd"));
                    planRecord.saveEndDate(ifw.d(jSONObjectOptJSONObject.optLong("endDate"), "yyyy-MM-dd"));
                    planRecord.saveCalorie(jSONObjectOptJSONObject.optInt("calorie"));
                    planRecord.saveDistance(ped.b(jSONObjectOptJSONObject.optInt("distance")));
                    planRecord.saveActualCalorie(jSONObjectOptJSONObject.optInt("actualCalorie"));
                    planRecord.saveActualDistance(ped.b(jSONObjectOptJSONObject.optInt("actualDistance")));
                    planRecord.saveWorkoutDays(jSONObjectOptJSONObject.optInt("trainingDays"));
                    planRecord.saveWeekCount(jSONObjectOptJSONObject.optInt("weekCount"));
                    planRecord.saveFinishRate((float) jSONObjectOptJSONObject.optDouble("completionRate"));
                    planRecord.saveFinishDate(ifw.d(jSONObjectOptJSONObject.optLong("finishTime")));
                    planRecord.saveExcludedDates(ifp.g(jSONObjectOptJSONObject.optString("excludedDate")));
                    planRecord.saveWeekTimes(jSONObjectOptJSONObject.optInt("movementTimes"));
                    planRecord.saveGoal(jSONObjectOptJSONObject.optInt(ParsedFieldTag.GOAL));
                    planRecord.saveWorkoutTimes(jSONObjectOptJSONObject.optInt("trainingDays"));
                    planRecord.saveDifficulty(jSONObjectOptJSONObject.optInt("difficulty"));
                    planRecord.saveVersion("version");
                    planRecord.setPlanCategory(jSONObjectOptJSONObject.optInt("intPlanCategory"));
                    arrayList.add(planRecord);
                }
            }
        }
        return arrayList;
    }

    public static List<WorkoutRecord> d(String str, JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList(16);
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    WorkoutRecord workoutRecord = new WorkoutRecord();
                    d(str, jSONObjectOptJSONObject, workoutRecord);
                    String strOptString = jSONObjectOptJSONObject.optString(WorkoutRecord.Extend.RunWorkout.RUN_WORKOUT_TRAJECTORY_ID);
                    LogUtil.d("Suggestion_DataRunPlanConvert", "acquireTrajectoryId:", strOptString);
                    workoutRecord.saveTrajectoryId(c(workoutRecord, strOptString));
                    workoutRecord.saveActionSummary(jSONObjectOptJSONObject.optString("actionSummary"));
                    workoutRecord.saveVersion(jSONObjectOptJSONObject.optString("version"));
                    workoutRecord.saveWearType(jSONObjectOptJSONObject.optInt("wearType"));
                    workoutRecord.saveExtend(jSONObjectOptJSONObject.optString("extend"));
                    workoutRecord.saveHeartRateDataList(a(jSONObjectOptJSONObject.optJSONArray("heartRateList")));
                    workoutRecord.saveInvalidHeartRateList(a(jSONObjectOptJSONObject.optJSONArray("invalidHeartRateList")));
                    workoutRecord.saveCategory(workoutRecord.acquireCategoryFromExtend());
                    arrayList.add(workoutRecord);
                }
            }
        }
        return arrayList;
    }

    private static void d(String str, JSONObject jSONObject, WorkoutRecord workoutRecord) {
        workoutRecord.saveId(jSONObject.optInt("id"));
        workoutRecord.savePlanId(str);
        workoutRecord.saveWorkoutOrder(jSONObject.optInt("displayorder"));
        workoutRecord.saveWorkoutName(jSONObject.optString("name"));
        workoutRecord.saveWorkoutId(jSONObject.optString(HwExerciseConstants.METHOD_PARAM_WORKOUT_ID));
        workoutRecord.saveWorkoutDate(ifw.d(jSONObject.optLong("trainingDate"), "yyyy-MM-dd"));
        workoutRecord.saveActualCalorie(jSONObject.optInt("actualCalorie"));
        workoutRecord.saveActualDistance(ped.b(jSONObject.optInt("actualDistance")));
        workoutRecord.saveRecordType(jSONObject.optInt("by"));
        workoutRecord.saveCalorie(jSONObject.optInt("calorie"));
        workoutRecord.saveDistance(ped.b(jSONObject.optInt("distance")));
        workoutRecord.saveExerciseTime(ieg.f(jSONObject.optLong(ParsedFieldTag.TASK_COMPLETE_TIME)));
        workoutRecord.saveOxygen(jSONObject.optDouble("oxygen"));
        workoutRecord.saveTrainingLoadPeak(jSONObject.optInt("trainingLoadPeak"));
        workoutRecord.saveFinishRate((float) jSONObject.optDouble("completionRate"));
        workoutRecord.setDuration(jSONObject.optInt("duration"));
        workoutRecord.saveUpperHeartRate(jSONObject.optInt("heartRateUp"));
        workoutRecord.saveLowerHeartRate(jSONObject.optInt("heartRateDown"));
        workoutRecord.saveBestPace(jSONObject.optInt("bestPace"));
        workoutRecord.saveWeekNum(jSONObject.optInt("weekSequence"));
        workoutRecord.saveTotalScore(jSONObject.optLong(ParsedFieldTag.NPES_TOTAL_SCORE));
        workoutRecord.saveRecordModeType(jSONObject.optInt("recordModeType"));
    }

    private static List<HeartRateData> a(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList(10);
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    int iOptInt = jSONObjectOptJSONObject.optInt(IndoorEquipManagerApi.KEY_HEART_RATE);
                    long jOptLong = jSONObjectOptJSONObject.optLong("time");
                    HeartRateData heartRateData = new HeartRateData();
                    heartRateData.saveTime(jOptLong);
                    heartRateData.saveHeartRate(iOptInt);
                    arrayList.add(heartRateData);
                }
            }
        }
        return arrayList;
    }

    public static List<WorkoutRecord> e(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList(16);
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    WorkoutRecord workoutRecord = new WorkoutRecord();
                    d(jSONObjectOptJSONObject.optString("planId"), jSONObjectOptJSONObject, workoutRecord);
                    String strOptString = jSONObjectOptJSONObject.optString(WorkoutRecord.Extend.RunWorkout.RUN_WORKOUT_TRAJECTORY_ID);
                    LogUtil.d("Suggestion_DataRunPlanConvert", "acquireTrajectoryId:", strOptString);
                    c(workoutRecord, strOptString);
                    workoutRecord.saveTrajectoryId(strOptString);
                    workoutRecord.saveActionSummary(jSONObjectOptJSONObject.optString("actionSummary"));
                    workoutRecord.saveVersion(jSONObjectOptJSONObject.optString("version"));
                    workoutRecord.saveWearType(jSONObjectOptJSONObject.optInt("wearType"));
                    workoutRecord.saveExtend(jSONObjectOptJSONObject.optString("extend"));
                    workoutRecord.saveHeartRateDataList(a(jSONObjectOptJSONObject.optJSONArray("heartRateList")));
                    workoutRecord.saveInvalidHeartRateList(a(jSONObjectOptJSONObject.optJSONArray("invalidHeartRateList")));
                    workoutRecord.saveCategory(workoutRecord.acquireCategoryFromExtend());
                    arrayList.add(workoutRecord);
                }
            }
        }
        return arrayList;
    }

    private static String c(WorkoutRecord workoutRecord, String str) {
        Date dateB;
        if (str == null || !str.startsWith("gps_maptracking_") || (dateB = ieg.b(str.substring(16), "yyyyMMddHHmmssSSS")) == null) {
            return str;
        }
        String str2 = dateB.getTime() + "_" + workoutRecord.acquireExerciseTime();
        LogUtil.d("Suggestion_DataRunPlanConvert", "replaceTrajectoryId:", str2);
        return str2;
    }

    public static String d(TreeSet<Integer> treeSet) {
        if (treeSet == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder(16);
        Iterator<Integer> it = treeSet.iterator();
        while (it.hasNext()) {
            sb.append(it.next().intValue() + 1);
            sb.append(",");
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }

    public static RunWorkout c(PlanWorkout planWorkout) {
        RunWorkout runWorkout = new RunWorkout();
        if (planWorkout == null) {
            return runWorkout;
        }
        RunWorkout runWorkout2 = (RunWorkout) peh.b(planWorkout.popExtendParams(), RunWorkout.class);
        runWorkout2.saveId(planWorkout.popWorkoutId());
        runWorkout2.saveName(planWorkout.popName());
        runWorkout2.putWorkoutDate(planWorkout.popDayInfo().acquireDate());
        runWorkout2.saveDescription(planWorkout.popDescription());
        runWorkout2.saveVersion(planWorkout.popVersion());
        return runWorkout2;
    }
}
