package defpackage;

import com.huawei.basefitnessadvice.model.DayInfo;
import com.huawei.basefitnessadvice.model.FitnessDayPlan;
import com.huawei.basefitnessadvice.model.FitnessPlanCourse;
import com.huawei.basefitnessadvice.model.FitnessWeekPlan;
import com.huawei.basefitnessadvice.model.Plan;
import com.huawei.basefitnessadvice.model.PlanRecord;
import com.huawei.basefitnessadvice.model.PlanWorkout;
import com.huawei.basefitnessadvice.model.WeekInfo;
import com.huawei.health.plan.model.PlanStat;
import com.huawei.health.plan.model.UserFitnessPlanInfo;
import com.huawei.health.sport.model.WorkoutRecord;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public class gmg {
    public static Plan e(UserFitnessPlanInfo userFitnessPlanInfo) {
        if (userFitnessPlanInfo == null) {
            return null;
        }
        Plan plan = new Plan();
        ArrayList arrayList = new ArrayList(16);
        int iAcquireDisplayStyle = userFitnessPlanInfo.acquireDisplayStyle();
        List<FitnessWeekPlan> listAcquireWeekPlanList = iAcquireDisplayStyle == 0 ? userFitnessPlanInfo.acquireWeekPlanList() : userFitnessPlanInfo.acquireWeeklyPlanList();
        if (listAcquireWeekPlanList == null) {
            LogUtil.j("Suggestion_FitnessPackagePlanDataConverter", "get weekPlanList from userFitnessPlanInfo is null");
            return plan;
        }
        int size = listAcquireWeekPlanList.size();
        a(userFitnessPlanInfo, plan, size);
        if (njy.e(listAcquireWeekPlanList)) {
            LogUtil.j("Suggestion_FitnessPackagePlanDataConverter", "get weekPlanList from userFitnessPlanInfo is empty");
            return plan;
        }
        return c(size, listAcquireWeekPlanList, iAcquireDisplayStyle, plan, arrayList);
    }

    private static Plan c(int i, List<FitnessWeekPlan> list, int i2, Plan plan, List<PlanWorkout> list2) {
        long jAcquireDate = 0;
        long j = 0;
        int iC = 0;
        for (int i3 = 0; i3 < i; i3++) {
            FitnessWeekPlan fitnessWeekPlan = list.get(i3);
            List<FitnessDayPlan> listAcquireWeekList = i2 == 0 ? fitnessWeekPlan.acquireWeekList() : fitnessWeekPlan.acquireDailyPlanList();
            if (!njy.e(listAcquireWeekList)) {
                int size = listAcquireWeekList.size();
                int i4 = 0;
                while (i4 < size) {
                    FitnessDayPlan fitnessDayPlan = listAcquireWeekList.get(i4);
                    if (i3 == 0 && i4 == 0) {
                        if (fitnessDayPlan != null) {
                            long jAcquireDate2 = fitnessDayPlan.acquireDate();
                            long j2 = jAcquireDate2 / 1000;
                            plan.saveStartDate(ifw.d(j2, "yyyy-MM-dd"));
                            plan.setStartTime(j2);
                            j = jAcquireDate2;
                        }
                    }
                    if (i3 != i - 1 || i4 != size - 1) {
                        jAcquireDate = jAcquireDate;
                    } else if (fitnessDayPlan != null) {
                        jAcquireDate = fitnessDayPlan.acquireDate();
                        long j3 = jAcquireDate / 1000;
                        plan.saveEndDate(ifw.d(j3, "yyyy-MM-dd"));
                        plan.setEndTime(j3);
                    }
                    iC = c(list2, iC, fitnessWeekPlan, fitnessDayPlan, i2);
                    i4++;
                    j = j;
                }
            }
            return plan;
        }
        plan.saveDays((int) (((jAcquireDate - j) / 86400000) + 1));
        plan.saveWorkoutCount(iC);
        plan.saveWorkouts(list2);
        return plan;
    }

    private static int c(List<PlanWorkout> list, int i, FitnessWeekPlan fitnessWeekPlan, FitnessDayPlan fitnessDayPlan, int i2) {
        List<FitnessPlanCourse> listAcquireDayPlanCourses = i2 == 0 ? fitnessDayPlan.acquireDayPlanCourses() : fitnessDayPlan.acquireWorkoutList();
        if (listAcquireDayPlanCourses != null) {
            int size = listAcquireDayPlanCourses.size();
            i += size;
            for (int i3 = 0; i3 < size; i3++) {
                PlanWorkout planWorkout = new PlanWorkout();
                if (njy.c(listAcquireDayPlanCourses, i3) && listAcquireDayPlanCourses.get(i3) != null) {
                    planWorkout.putName(listAcquireDayPlanCourses.get(i3).acquireName());
                    planWorkout.putWorkoutId(listAcquireDayPlanCourses.get(i3).acquireCourseId());
                }
                d(fitnessWeekPlan, planWorkout, new WeekInfo());
                planWorkout.putDayInfo(b(fitnessDayPlan, i3));
                list.add(planWorkout);
            }
        }
        return i;
    }

    private static DayInfo b(FitnessDayPlan fitnessDayPlan, int i) {
        DayInfo dayInfo = new DayInfo();
        long jAcquireDate = fitnessDayPlan.acquireDate();
        dayInfo.saveOrder(ieg.j(jAcquireDate));
        dayInfo.saveDate(ifw.d(jAcquireDate / 1000, "yyyy-MM-dd"));
        dayInfo.saveSinglesCount(i + 1);
        dayInfo.saveDayTitle(fitnessDayPlan.acquireName());
        dayInfo.saveDayDesc(fitnessDayPlan.acquireDescription());
        return dayInfo;
    }

    private static void d(FitnessWeekPlan fitnessWeekPlan, PlanWorkout planWorkout, WeekInfo weekInfo) {
        weekInfo.saveWeekName(fitnessWeekPlan.acquireWeekPeriod());
        weekInfo.saveSentence(fitnessWeekPlan.acquireWeekDesc());
        weekInfo.saveOrder(fitnessWeekPlan.acquireWeekOrder());
        planWorkout.putWeekInfo(weekInfo);
    }

    private static void a(UserFitnessPlanInfo userFitnessPlanInfo, Plan plan, int i) {
        plan.saveCreateTime(userFitnessPlanInfo.acquireCreateTime());
        plan.setRemindTime(userFitnessPlanInfo.acquireRemindTime());
        plan.saveId(userFitnessPlanInfo.acquirePlanId());
        plan.putName(userFitnessPlanInfo.acquireName());
        plan.saveType(3);
        plan.savePicture(userFitnessPlanInfo.acquirePicture());
        plan.saveWeekCount(i);
        if (userFitnessPlanInfo.acquireDisplayStyle() == 0) {
            plan.saveCalorie(gme.c().d(userFitnessPlanInfo));
        }
    }

    public static PlanStat b(float f, String str) {
        if (str == null) {
            return null;
        }
        PlanStat planStat = new PlanStat();
        UserFitnessPlanInfo userFitnessPlanInfoD = gme.c().d(str);
        planStat.saveMostCaloriePerWeek(d(userFitnessPlanInfoD));
        planStat.saveMostWorkoutTimes(g(userFitnessPlanInfoD));
        planStat.saveLongestTimePerWeek(a(userFitnessPlanInfoD));
        planStat.saveHighestCompleteRate(gnu.b(e(f, userFitnessPlanInfoD) * 100.0f));
        return planStat;
    }

    private static float e(float f, UserFitnessPlanInfo userFitnessPlanInfo) {
        LogUtil.a("Suggestion_FitnessPackagePlanDataConverter", "getMostCompleteRateByWeek enter");
        if (userFitnessPlanInfo == null) {
            return 0.0f;
        }
        float f2 = 0.0f;
        for (FitnessWeekPlan fitnessWeekPlan : userFitnessPlanInfo.acquireWeekPlanList()) {
            if (fitnessWeekPlan != null) {
                List<FitnessDayPlan> listAcquireWeekList = fitnessWeekPlan.acquireWeekList();
                if (!njy.e(listAcquireWeekList)) {
                    FitnessDayPlan fitnessDayPlan = listAcquireWeekList.get(0);
                    FitnessDayPlan fitnessDayPlan2 = listAcquireWeekList.get(listAcquireWeekList.size() - 1);
                    if (fitnessDayPlan != null && fitnessDayPlan2 != null) {
                        long jAcquireDate = fitnessDayPlan.acquireDate();
                        long jAcquireDate2 = fitnessDayPlan2.acquireDate();
                        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
                        String str = simpleDateFormat.format(Long.valueOf(jAcquireDate));
                        LogUtil.a("Suggestion_FitnessPackagePlanDataConverter", "getMostCompleteRateByWeek strStartDate = ", str);
                        String str2 = simpleDateFormat.format(Long.valueOf(jAcquireDate2));
                        LogUtil.a("Suggestion_FitnessPackagePlanDataConverter", "getMostCompleteRateByWeek strEndDate = ", str2);
                        float fC = c(userFitnessPlanInfo, str, str2);
                        float fC2 = 0.0f;
                        for (FitnessDayPlan fitnessDayPlan3 : fitnessWeekPlan.acquireWeekList()) {
                            if (fitnessDayPlan3 != null) {
                                fC2 = c(f, fC2, fitnessDayPlan3);
                            }
                        }
                        if (CommonUtil.b(fC2)) {
                            ReleaseLogUtil.e("Suggestion_FitnessPackagePlanDataConverter", "getMostCompleteRateByWeek initWeekShouldTotal <= 0f");
                            return 0.0f;
                        }
                        float f3 = fC / fC2;
                        LogUtil.d("Suggestion_FitnessPackagePlanDataConverter", "getMostCompleteRateByWeek completeRate = ", Float.valueOf(f3));
                        if (f3 > f2) {
                            f2 = f3;
                        }
                    }
                }
            }
            return f2;
        }
        LogUtil.a("Suggestion_FitnessPackagePlanDataConverter", "getMostCompleteRateByWeek initValue = ", Float.valueOf(f2));
        return f2;
    }

    private static float c(float f, float f2, FitnessDayPlan fitnessDayPlan) {
        List<FitnessPlanCourse> listAcquireDayPlanCourses = fitnessDayPlan.acquireDayPlanCourses();
        if (listAcquireDayPlanCourses != null) {
            Iterator<FitnessPlanCourse> it = listAcquireDayPlanCourses.iterator();
            while (it.hasNext()) {
                FitnessPlanCourse next = it.next();
                f2 = (float) (((double) f2) + (next != null ? gme.c().b(next.acquireCourseId()) * ((double) f) : 0.0d));
            }
        }
        return f2;
    }

    private static float c(UserFitnessPlanInfo userFitnessPlanInfo, String str, String str2) {
        List<WorkoutRecord> workoutRecords = gls.b().getWorkoutRecords(userFitnessPlanInfo.acquirePlanId(), str, str2);
        if (workoutRecords == null) {
            return 0.0f;
        }
        Iterator<WorkoutRecord> it = workoutRecords.iterator();
        float fAcquireActualCalorie = 0.0f;
        while (it.hasNext()) {
            WorkoutRecord next = it.next();
            fAcquireActualCalorie += next != null ? next.acquireActualCalorie() : 0.0f;
        }
        return fAcquireActualCalorie;
    }

    private static int a(UserFitnessPlanInfo userFitnessPlanInfo) {
        int duration;
        LogUtil.a("Suggestion_FitnessPackagePlanDataConverter", "getLongestWorkoutPeriodByWeek enter");
        if (userFitnessPlanInfo == null) {
            return 0;
        }
        Iterator<FitnessWeekPlan> it = userFitnessPlanInfo.acquireWeekPlanList().iterator();
        int i = 0;
        while (it.hasNext()) {
            List<FitnessDayPlan> listAcquireWeekList = it.next().acquireWeekList();
            if (!njy.e(listAcquireWeekList)) {
                FitnessDayPlan fitnessDayPlan = listAcquireWeekList.get(0);
                FitnessDayPlan fitnessDayPlan2 = listAcquireWeekList.get(listAcquireWeekList.size() - 1);
                if (fitnessDayPlan != null && fitnessDayPlan2 != null) {
                    long jAcquireDate = fitnessDayPlan.acquireDate();
                    long jAcquireDate2 = fitnessDayPlan2.acquireDate();
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
                    String str = simpleDateFormat.format(Long.valueOf(jAcquireDate));
                    LogUtil.a("Suggestion_FitnessPackagePlanDataConverter", "getLongestWorkoutPeriodByWeek strStartDate = ", str);
                    String str2 = simpleDateFormat.format(Long.valueOf(jAcquireDate2));
                    LogUtil.a("Suggestion_FitnessPackagePlanDataConverter", "getLongestWorkoutPeriodByWeek strEndDate = ", str2);
                    List<WorkoutRecord> workoutRecords = gls.b().getWorkoutRecords(userFitnessPlanInfo.acquirePlanId(), str, str2);
                    if (workoutRecords != null) {
                        Iterator<WorkoutRecord> it2 = workoutRecords.iterator();
                        duration = 0;
                        while (it2.hasNext()) {
                            WorkoutRecord next = it2.next();
                            duration += next != null ? next.getDuration() : 0;
                        }
                    } else {
                        duration = 0;
                    }
                    if (duration > i) {
                        i = duration;
                    }
                }
            }
            return i;
        }
        LogUtil.a("Suggestion_FitnessPackagePlanDataConverter", "workoutPeriod = ", Integer.valueOf(i));
        return i;
    }

    private static int g(UserFitnessPlanInfo userFitnessPlanInfo) {
        if (userFitnessPlanInfo == null) {
            return 0;
        }
        Iterator<FitnessWeekPlan> it = userFitnessPlanInfo.acquireWeekPlanList().iterator();
        int i = 0;
        while (it.hasNext()) {
            List<FitnessDayPlan> listAcquireWeekList = it.next().acquireWeekList();
            if (njy.e(listAcquireWeekList)) {
                return 0;
            }
            FitnessDayPlan fitnessDayPlan = listAcquireWeekList.get(0);
            FitnessDayPlan fitnessDayPlan2 = listAcquireWeekList.get(listAcquireWeekList.size() - 1);
            if (fitnessDayPlan == null || fitnessDayPlan2 == null) {
                return 0;
            }
            long jAcquireDate = fitnessDayPlan.acquireDate();
            long jAcquireDate2 = fitnessDayPlan2.acquireDate();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String str = simpleDateFormat.format(Long.valueOf(jAcquireDate));
            LogUtil.a("Suggestion_FitnessPackagePlanDataConverter", "getMostWorkoutTimes strStartDate = ", str);
            String str2 = simpleDateFormat.format(Long.valueOf(jAcquireDate2));
            LogUtil.a("Suggestion_FitnessPackagePlanDataConverter", "getMostWorkoutTimes strEndDate = ", str2);
            List<WorkoutRecord> workoutRecords = gls.b().getWorkoutRecords(userFitnessPlanInfo.acquirePlanId(), str, str2);
            int size = workoutRecords != null ? workoutRecords.size() : 0;
            if (size > i) {
                i = size;
            }
        }
        LogUtil.a("Suggestion_FitnessPackagePlanDataConverter", "workoutTimes = ", Integer.valueOf(i));
        return i;
    }

    private static float d(UserFitnessPlanInfo userFitnessPlanInfo) {
        float fAcquireActualCalorie;
        LogUtil.a("Suggestion_FitnessPackagePlanDataConverter", "getMostConsumerCalorieByWeek enter");
        if (userFitnessPlanInfo == null) {
            return 0.0f;
        }
        float f = 0.0f;
        for (FitnessWeekPlan fitnessWeekPlan : userFitnessPlanInfo.acquireWeekPlanList()) {
            if (fitnessWeekPlan != null) {
                List<FitnessDayPlan> listAcquireWeekList = fitnessWeekPlan.acquireWeekList();
                if (!njy.e(listAcquireWeekList)) {
                    FitnessDayPlan fitnessDayPlan = listAcquireWeekList.get(0);
                    FitnessDayPlan fitnessDayPlan2 = listAcquireWeekList.get(listAcquireWeekList.size() - 1);
                    if (fitnessDayPlan != null && fitnessDayPlan2 != null) {
                        long jAcquireDate = fitnessDayPlan.acquireDate();
                        long jAcquireDate2 = fitnessDayPlan2.acquireDate();
                        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
                        String str = simpleDateFormat.format(Long.valueOf(jAcquireDate));
                        LogUtil.a("Suggestion_FitnessPackagePlanDataConverter", "getMostConsumerCalorieByWeek strStartDate = ", str);
                        String str2 = simpleDateFormat.format(Long.valueOf(jAcquireDate2));
                        LogUtil.a("Suggestion_FitnessPackagePlanDataConverter", "getMostConsumerCalorieByWeek strEndDate = ", str2);
                        List<WorkoutRecord> workoutRecords = gls.b().getWorkoutRecords(userFitnessPlanInfo.acquirePlanId(), str, str2);
                        if (workoutRecords != null) {
                            Iterator<WorkoutRecord> it = workoutRecords.iterator();
                            fAcquireActualCalorie = 0.0f;
                            while (it.hasNext()) {
                                WorkoutRecord next = it.next();
                                fAcquireActualCalorie += next != null ? next.acquireActualCalorie() : 0.0f;
                            }
                        } else {
                            fAcquireActualCalorie = 0.0f;
                        }
                        if (fAcquireActualCalorie > f) {
                            f = fAcquireActualCalorie;
                        }
                    }
                }
            }
            return f;
        }
        LogUtil.a("Suggestion_FitnessPackagePlanDataConverter", "max_Cal = ", Float.valueOf(f));
        return f;
    }

    public static PlanRecord b(UserFitnessPlanInfo userFitnessPlanInfo) {
        LogUtil.a("Suggestion_FitnessPackagePlanDataConverter", "toPlanRecord enter");
        if (userFitnessPlanInfo == null) {
            ReleaseLogUtil.e("Suggestion_FitnessPackagePlanDataConverter", "userFitnessPlan info is null");
            return null;
        }
        PlanRecord planRecord = new PlanRecord();
        float fD = gme.c().d(userFitnessPlanInfo);
        LogUtil.a("Suggestion_FitnessPackagePlanDataConverter", "planShouldTotal = ", Float.valueOf(fD));
        planRecord.saveCalorie(fD);
        List<WorkoutRecord> listC = c(userFitnessPlanInfo);
        float fA = a(listC);
        LogUtil.a("Suggestion_FitnessPackagePlanDataConverter", "planBurnedTotal = ", Float.valueOf(fA));
        planRecord.saveActualCalorie(fA);
        planRecord.savePlanId(userFitnessPlanInfo.acquirePlanId());
        ghf ghfVarE = gnw.e(userFitnessPlanInfo);
        LogUtil.a("Suggestion_FitnessPackagePlanDataConverter", "toPlanRecord finishRate = ", Float.valueOf(gnw.b(ghfVarE)));
        if (!CommonUtil.b(gnw.b(ghfVarE))) {
            planRecord.saveFinishRate(gnw.b(ghfVarE));
        }
        planRecord.saveWeekCount(userFitnessPlanInfo.acquireWeekPlanList().size());
        planRecord.saveWorkoutDays(c(listC));
        planRecord.saveWorkoutTimes(d(listC));
        planRecord.savePlanName(userFitnessPlanInfo.acquireName());
        planRecord.savePlanType(3);
        planRecord.savePlanTempId(userFitnessPlanInfo.acquirePlanTempId());
        planRecord.saveFinishDate(userFitnessPlanInfo.acquireModifyTime());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        planRecord.saveStartDate(simpleDateFormat.format(Long.valueOf(userFitnessPlanInfo.acquireCreateTime())));
        planRecord.saveEndDate(simpleDateFormat.format(Long.valueOf(userFitnessPlanInfo.acquireCreateTime() + (((long) ((userFitnessPlanInfo.acquireWeekPlanList().size() * 7) - 1)) * 86400000))));
        return planRecord;
    }

    public static float a(List<WorkoutRecord> list) {
        LogUtil.a("Suggestion_FitnessPackagePlanDataConverter", "getPlanSumBurnedCalorie enter");
        float fAcquireActualCalorie = 0.0f;
        if (njy.e(list)) {
            return 0.0f;
        }
        if (list != null && list.size() > 0) {
            for (WorkoutRecord workoutRecord : list) {
                if (workoutRecord != null) {
                    fAcquireActualCalorie += workoutRecord.acquireActualCalorie();
                }
            }
        }
        LogUtil.a("Suggestion_FitnessPackagePlanDataConverter", "maxCalorie = ", Float.valueOf(fAcquireActualCalorie));
        return fAcquireActualCalorie / 1000.0f;
    }

    public static List<WorkoutRecord> c(UserFitnessPlanInfo userFitnessPlanInfo) {
        if (userFitnessPlanInfo == null) {
            LogUtil.e("Suggestion_FitnessPackagePlanDataConverter", "plan info is empty");
            return Collections.EMPTY_LIST;
        }
        if (njy.e(userFitnessPlanInfo.acquireWeekPlanList())) {
            LogUtil.e("Suggestion_FitnessPackagePlanDataConverter", "plan week plan list is empty", userFitnessPlanInfo.acquireDescription());
            return Collections.EMPTY_LIST;
        }
        List<FitnessDayPlan> listAcquireWeekList = userFitnessPlanInfo.acquireWeekPlanList().get(0).acquireWeekList();
        if (njy.e(listAcquireWeekList)) {
            LogUtil.e("Suggestion_FitnessPackagePlanDataConverter", "day plan list is empty", userFitnessPlanInfo.acquireDescription());
            return Collections.EMPTY_LIST;
        }
        FitnessDayPlan fitnessDayPlan = listAcquireWeekList.get(0);
        if (fitnessDayPlan == null) {
            LogUtil.e("Suggestion_FitnessPackagePlanDataConverter", "day plan list first is empty", userFitnessPlanInfo.acquireDescription());
            return Collections.EMPTY_LIST;
        }
        long jAcquireDate = fitnessDayPlan.acquireDate();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String str = simpleDateFormat.format(Long.valueOf(jAcquireDate));
        List<FitnessDayPlan> listAcquireWeekList2 = userFitnessPlanInfo.acquireWeekPlanList().get(userFitnessPlanInfo.acquireWeekPlanList().size() - 1).acquireWeekList();
        FitnessDayPlan fitnessDayPlan2 = njy.b(listAcquireWeekList2) ? listAcquireWeekList2.get(listAcquireWeekList2.size() - 1) : null;
        if (fitnessDayPlan2 == null) {
            LogUtil.e("Suggestion_FitnessPackagePlanDataConverter", "day plan list last is empty", userFitnessPlanInfo.acquireDescription());
            return Collections.EMPTY_LIST;
        }
        String str2 = simpleDateFormat.format(Long.valueOf(fitnessDayPlan2.acquireDate()));
        LogUtil.a("Suggestion_FitnessPackagePlanDataConverter", "getPlanRecord strStartDate = " + str + " strEndDate = ", str2);
        List<WorkoutRecord> workoutRecords = gls.b().getWorkoutRecords(userFitnessPlanInfo.acquirePlanId(), str, str2);
        LogUtil.a("Suggestion_FitnessPackagePlanDataConverter", "getPlanRecords num is ", Integer.valueOf(workoutRecords != null ? workoutRecords.size() : 0));
        return njy.e(workoutRecords) ? Collections.EMPTY_LIST : workoutRecords;
    }

    private static int c(List<WorkoutRecord> list) {
        if (njy.e(list)) {
            return 0;
        }
        int iD = d(0, list);
        LogUtil.a("Suggestion_FitnessPackagePlanDataConverter", "getWorkoutDays = ", Integer.valueOf(iD));
        return iD;
    }

    private static int d(int i, List<WorkoutRecord> list) {
        int i2 = 0;
        while (i2 < list.size()) {
            if (i2 == 0) {
                i = 1;
            }
            String strAcquireWorkoutDate = list.get(i2).acquireWorkoutDate();
            LogUtil.d("Suggestion_FitnessPackagePlanDataConverter", "getWorkoutDays init = ", strAcquireWorkoutDate);
            i2++;
            if (i2 < list.size() && !b(strAcquireWorkoutDate, list.get(i2).acquireWorkoutDate())) {
                i++;
            }
        }
        return i;
    }

    private static boolean b(String str, String str2) {
        return ifw.e(str, "yyyy-MM-dd") == ifw.e(str2, "yyyy-MM-dd");
    }

    private static int d(List<WorkoutRecord> list) {
        if (njy.e(list)) {
            return 0;
        }
        int size = list.size();
        LogUtil.a("Suggestion_FitnessPackagePlanDataConverter", "getWorkoutTimes workoutTimes = ", Integer.valueOf(size));
        return size;
    }
}
