package defpackage;

import com.huawei.basefitnessadvice.model.FitnessDayPlan;
import com.huawei.basefitnessadvice.model.FitnessPlanCourse;
import com.huawei.basefitnessadvice.model.FitnessWeekPlan;
import com.huawei.basefitnessadvice.model.Plan;
import com.huawei.basefitnessadvice.model.PlanWorkout;
import com.huawei.basefitnessadvice.model.intplan.IntAction;
import com.huawei.basefitnessadvice.model.intplan.IntDayPlan;
import com.huawei.basefitnessadvice.model.intplan.IntPlan;
import com.huawei.basefitnessadvice.model.intplan.IntWeekPlan;
import com.huawei.basefitnessadvice.model.intplan.RecordData;
import com.huawei.basefitnessadvice.model.intplan.StatInfo;
import com.huawei.health.plan.model.UserFitnessPlanInfo;
import com.huawei.health.plan.model.intplan.StatInfoBean;
import com.huawei.health.sport.model.WorkoutRecord;
import com.huawei.hms.network.embedded.k;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnessadvice.plandata.CourseDataBean;
import health.compact.a.CommonUtil;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public class gnw {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f35849b = !Utils.k();
    public static final boolean d = !Utils.k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String[] f35848a = {"calorie", "duration", StatInfo.STAT_TYPE_PUNCH_DAY};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String[] f35850c = {"distance", "duration", "calorie"};

    public static ghf c(UserFitnessPlanInfo userFitnessPlanInfo) {
        ghf ghfVarC = ghf.c();
        ghn ghnVar = new ghn();
        ghfVarC.d(ieg.d());
        ghfVarC.c(ghnVar);
        ghnVar.h(userFitnessPlanInfo.acquirePlanId());
        ghnVar.d(IntPlan.PlanType.FIT_PLAN);
        ghnVar.e(userFitnessPlanInfo.acquireDescription());
        ghnVar.g(userFitnessPlanInfo.acquirePicture());
        ghnVar.a(userFitnessPlanInfo.acquireCardPicture());
        ghnVar.f(userFitnessPlanInfo.acquirePlanTempId());
        ghm ghmVar = new ghm();
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jA = ift.a(jCurrentTimeMillis) / 1000;
        long j = jCurrentTimeMillis / 1000;
        ghmVar.a(j);
        ghfVarC.e(ghmVar);
        ghmVar.b(jA);
        ghmVar.c(j);
        ghnVar.c(userFitnessPlanInfo.acquireName());
        ghmVar.e(userFitnessPlanInfo.acquireRemindTime());
        e(ghfVarC, userFitnessPlanInfo);
        ghmVar.d((((long) (ghfVarC.a() - 1)) * k.b.m) + jA);
        ghfVarC.e(new ghj("progress", Float.valueOf(0.0f)));
        ghfVarC.d(userFitnessPlanInfo.acquireTransactionStatus());
        return ghfVarC;
    }

    public static ghf e(UserFitnessPlanInfo userFitnessPlanInfo) {
        ghf ghfVarC = ghf.c();
        ghfVarC.d(userFitnessPlanInfo);
        Plan planE = gmg.e(userFitnessPlanInfo);
        ghfVarC.b(planE);
        ghn ghnVar = new ghn();
        ghnVar.h(userFitnessPlanInfo.acquirePlanId());
        ghnVar.d(IntPlan.PlanType.FIT_PLAN);
        ghnVar.e(userFitnessPlanInfo.acquireDescription());
        ghnVar.g(userFitnessPlanInfo.acquirePicture());
        ghnVar.a(userFitnessPlanInfo.acquireCardPicture());
        ghnVar.f(userFitnessPlanInfo.acquirePlanTempId());
        ghnVar.d("");
        ghm ghmVar = new ghm();
        ghmVar.a(userFitnessPlanInfo.acquireCreateTime() / 1000);
        ghfVarC.d(userFitnessPlanInfo.acquireTimeZone());
        ghnVar.b(userFitnessPlanInfo.acquirePlanCategory());
        if (userFitnessPlanInfo.acquireDisplayStyle() == 0) {
            String strAcquireStartDate = planE.acquireStartDate();
            String endDate = planE.getEndDate();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            try {
                ghmVar.b(simpleDateFormat.parse(strAcquireStartDate).getTime() / 1000);
                ghmVar.d(simpleDateFormat.parse(endDate).getTime() / 1000);
                LogUtil.j("PlanService_IntPlanUtil", "convertIntPlan startDay : ", strAcquireStartDate, " startTime:", Long.valueOf(ghmVar.getBeginDate()), " endDay : ", endDate, " endTime:", Long.valueOf(ghmVar.getEndDate()));
            } catch (ParseException unused) {
                LogUtil.e("PlanService_IntPlanUtil", "convertFitnessPlan parse error");
            }
        } else {
            ghmVar.b(userFitnessPlanInfo.acquireBeginDate());
            ghmVar.d(userFitnessPlanInfo.acquireEndDate());
        }
        ghmVar.c(userFitnessPlanInfo.acquireModifyTime() / 1000);
        ghmVar.e(userFitnessPlanInfo.acquireRemindTime());
        ghnVar.c(userFitnessPlanInfo.acquireName());
        ghnVar.d(userFitnessPlanInfo.acquireDisplayStyle());
        ghfVarC.c(ghnVar);
        ghfVarC.e(ghmVar);
        ghfVarC.a(userFitnessPlanInfo.acquireIntroduction());
        e(ghfVarC, userFitnessPlanInfo);
        ghfVarC.e(new ghj("progress", Float.valueOf(b(ghfVarC))));
        c(userFitnessPlanInfo.acquireStatistics(), ghfVarC);
        ghfVarC.d(userFitnessPlanInfo.acquireTransactionStatus());
        return ghfVarC;
    }

    private static void e(ghf ghfVar, UserFitnessPlanInfo userFitnessPlanInfo) {
        List<FitnessDayPlan> listAcquireDailyPlanList;
        boolean z = userFitnessPlanInfo.acquireDisplayStyle() == 0;
        List<FitnessWeekPlan> listAcquireWeekPlanList = z ? userFitnessPlanInfo.acquireWeekPlanList() : userFitnessPlanInfo.acquireWeeklyPlanList();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(ghfVar.getPlanTimeInfo().getBeginDate() * 1000);
        int iB = ift.b(calendar.get(7));
        FitnessWeekPlan fitnessWeekPlan = listAcquireWeekPlanList.get(0);
        ghe gheVar = new ghe();
        ArrayList arrayList = new ArrayList();
        gheVar.e(arrayList);
        gheVar.a(1);
        gheVar.e(fitnessWeekPlan.acquireWeekDesc());
        gheVar.b(fitnessWeekPlan.acquireWeekPeriod());
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(gheVar);
        int i = 1;
        for (int i2 = 0; i2 < listAcquireWeekPlanList.size(); i2++) {
            FitnessWeekPlan fitnessWeekPlan2 = listAcquireWeekPlanList.get(i2);
            if (z) {
                listAcquireDailyPlanList = fitnessWeekPlan2.acquireWeekList();
            } else {
                listAcquireDailyPlanList = fitnessWeekPlan2.acquireDailyPlanList();
            }
            for (FitnessDayPlan fitnessDayPlan : listAcquireDailyPlanList) {
                arrayList.add(e(fitnessDayPlan, iB, z));
                LogUtil.a("PlanService_IntPlanUtil", "dayIndex: ", Integer.valueOf(iB), " week:", Integer.valueOf(i), "dayOrder: ", Integer.valueOf(fitnessDayPlan.acquireDayOrder()));
                if (iB == 7) {
                    arrayList = new ArrayList();
                    gheVar = new ghe();
                    gheVar.e(arrayList);
                    i++;
                    gheVar.a(i);
                    gheVar.e(fitnessWeekPlan2.acquireWeekDesc());
                    gheVar.b(fitnessWeekPlan2.acquireWeekPeriod());
                    arrayList2.add(gheVar);
                    iB = 1;
                } else {
                    iB++;
                }
            }
        }
        if (gheVar.getDayCount() == 0) {
            arrayList2.remove(gheVar);
            i--;
        }
        LogUtil.d("PlanService_IntPlanUtil", "convertWeekInfo weekOrder : ", Integer.valueOf(i));
        ghfVar.e(arrayList2);
        a(ghfVar);
    }

    private static ghi e(FitnessDayPlan fitnessDayPlan, int i, boolean z) {
        List<FitnessPlanCourse> listAcquireDayPlanCourses = z ? fitnessDayPlan.acquireDayPlanCourses() : fitnessDayPlan.acquireWorkoutList();
        ArrayList arrayList = new ArrayList();
        ghi ghiVar = new ghi();
        ghiVar.d(i);
        d(listAcquireDayPlanCourses, arrayList, ghiVar, z);
        ghiVar.a(arrayList);
        if (!z) {
            ghiVar.c(fitnessDayPlan.acquirePunchFlag());
            ghiVar.b(fitnessDayPlan.acquireSuggestedReading());
        }
        LogUtil.d("PlanService_IntPlanUtil", "convertDayInfo day order: ", Integer.valueOf(i), " actions:", Integer.valueOf(arrayList.size()));
        return ghiVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void d(List<FitnessPlanCourse> list, List<ghg> list2, ghi ghiVar, boolean z) {
        int iAcquirePunchFlag;
        if (njy.e(list)) {
            LogUtil.j("PlanService_IntPlanUtil", "convertInPlanAction fitnessPlanCourseList is null");
            return;
        }
        int iAcquireCalorie = 0;
        for (int i = 0; i < list.size(); i++) {
            ghg ghgVar = new ghg();
            FitnessPlanCourse fitnessPlanCourse = list.get(i);
            ghgVar.e(fitnessPlanCourse.acquireCourseId());
            if (z) {
                iAcquirePunchFlag = fitnessPlanCourse.acquireFinishStatus();
            } else {
                iAcquirePunchFlag = fitnessPlanCourse.acquirePunchFlag();
            }
            ghgVar.a(iAcquirePunchFlag);
            ghgVar.e(fitnessPlanCourse.acquireWorkoutTime());
            ghgVar.c(IntAction.ActionType.WORKOUT);
            ghgVar.b(fitnessPlanCourse.getActionInfo());
            list2.add(ghgVar);
            LogUtil.d("PlanService_IntPlanUtil", "convertInPlanAction in day : ", Integer.valueOf(ghiVar.getDayOrder()), " actionIdx:", Integer.valueOf(i));
            if (fitnessPlanCourse.acquireFinishStatus()) {
                iAcquireCalorie += fitnessPlanCourse.acquireCalorie();
            }
        }
        if (z) {
            ghiVar.c(1);
            for (int i2 = 0; i2 < list2.size(); i2++) {
                if (list2.get(i2).getPunchFlag() != 1) {
                    ghiVar.c(0);
                    break;
                }
            }
        }
        ghiVar.e(new ghj("calorie", Integer.valueOf(iAcquireCalorie)));
    }

    public static ghf e(Plan plan) {
        ghf ghfVarC = ghf.c();
        if (plan == null) {
            LogUtil.j("PlanService_IntPlanUtil", "convertRunPlan data is null.");
            return ghfVarC;
        }
        ghfVarC.b(plan);
        ghn ghnVarC = c(plan);
        ghm ghmVar = new ghm();
        ghmVar.a(plan.getStartTime());
        ghfVarC.d(plan.getTimeZone());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String strAcquireStartDate = plan.acquireStartDate();
        String endDate = plan.getEndDate();
        try {
            ghmVar.b(simpleDateFormat.parse(strAcquireStartDate).getTime() / 1000);
            ghmVar.d(simpleDateFormat.parse(endDate).getTime() / 1000);
            LogUtil.j("PlanService_IntPlanUtil", "convertIntPlan startDay : ", strAcquireStartDate, " startTime:", Long.valueOf(ghmVar.getBeginDate()), " endDay : ", endDate, "  endTime:", Long.valueOf(ghmVar.getEndDate()), " weekcount:" + plan.getWeekCount());
        } catch (ParseException unused) {
            LogUtil.e("PlanService_IntPlanUtil", "convertRunPlan parse error");
        }
        ghmVar.c(plan.getModified() / 1000);
        ghmVar.e(plan.getRemindTime());
        ghfVarC.d(plan.getTransactionStatus());
        ghfVarC.e(ghmVar);
        ghfVarC.c(ghnVarC);
        ghfVarC.a(plan.acquireIntroduction());
        List<pdq> planWeekDataList = plan.getPlanWeekDataList();
        if (planWeekDataList.size() == 0) {
            ArrayList arrayList = new ArrayList();
            c(ghfVarC, plan.acquireWorkouts(), arrayList, plan.getDays());
            ghfVarC.e(arrayList);
            ghfVarC.f35107b.i(arrayList.size());
        } else {
            ArrayList arrayList2 = new ArrayList();
            b(ghfVarC, planWeekDataList, arrayList2);
            ghfVarC.e(arrayList2);
            ghfVarC.f35107b.i(arrayList2.size());
        }
        ghfVarC.e(new ghj("progress", Float.valueOf(b(ghfVarC))));
        return ghfVarC;
    }

    private static ghn c(Plan plan) {
        ghn ghnVar = new ghn();
        if (plan == null) {
            LogUtil.j("PlanService_IntPlanUtil", "setMetaInfo data is null.");
            return ghnVar;
        }
        ghnVar.h(plan.acquireId());
        ghnVar.d(IntPlan.PlanType.AI_RUN_PLAN);
        ghnVar.e(plan.getDescription());
        ghnVar.g(plan.getPicture());
        ghnVar.f(Integer.toString(plan.acquireTempId()));
        ghnVar.c(plan.acquireName());
        ghnVar.a(plan.getDays());
        return ghnVar;
    }

    private static void b(ghf ghfVar, List<pdq> list, List<ghe> list2) {
        ghe gheVar = new ghe();
        ArrayList arrayList = new ArrayList();
        gheVar.e(arrayList);
        int i = 1;
        gheVar.a(1);
        list2.add(gheVar);
        for (int i2 = 0; i2 < list.size(); i2++) {
            pdq pdqVar = list.get(i2);
            gheVar.e(pdqVar.c());
            gheVar.b(pdqVar.d());
            for (pdt pdtVar : pdqVar.f()) {
                arrayList.add(a(ghfVar, pdtVar, pdtVar.d()));
                LogUtil.d("PlanService_IntPlanUtil", "convertAiRunWeekInfo new day : ", Integer.valueOf(pdtVar.d()), " week:", Integer.valueOf(pdtVar.d()));
                if (pdtVar.d() == 7) {
                    arrayList = new ArrayList();
                    gheVar = new ghe();
                    gheVar.e(arrayList);
                    i++;
                    gheVar.a(i);
                    list2.add(gheVar);
                }
            }
        }
        if (gheVar.getDayCount() == 0) {
            list2.remove(gheVar);
            i--;
        }
        LogUtil.d("PlanService_IntPlanUtil", "convertWeekInfo weekOrder : ", Integer.valueOf(i));
        ghfVar.f35107b.i(i);
    }

    private static void c(ghf ghfVar, List<PlanWorkout> list, List<ghe> list2, int i) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(ghfVar.f35106a.getBeginDate() * 1000);
        int iB = ift.b(calendar.get(7));
        ArrayList arrayList = new ArrayList();
        ghe gheVar = new ghe();
        gheVar.e(arrayList);
        gheVar.a(1);
        list2.add(gheVar);
        int i2 = 1;
        int i3 = 1;
        int i4 = 0;
        for (int i5 = iB; i5 < i + iB; i5++) {
            i4++;
            if (i4 > 7) {
                i2++;
                i4 = 1;
            }
            List<PlanWorkout> listC = c(ghfVar, list, i2, i4);
            if (!listC.isEmpty() && gheVar.getWeekDesc() == null) {
                gheVar.e(listC.get(0).popWeekInfo().getSentence());
                gheVar.b(listC.get(0).popWeekInfo().getWeekName());
            }
            ghi ghiVar = new ghi();
            ghiVar.d(((i5 - 1) % 7) + 1);
            ArrayList arrayList2 = new ArrayList();
            ghiVar.c(d(listC, arrayList2, 1));
            ghiVar.a(arrayList2);
            arrayList.add(ghiVar);
            if (i5 / 7 != i3 - 1) {
                ghe gheVar2 = new ghe();
                ArrayList arrayList3 = new ArrayList();
                gheVar2.e(arrayList3);
                i3++;
                gheVar2.a(i3);
                list2.add(gheVar2);
                gheVar = gheVar2;
                arrayList = arrayList3;
            }
        }
        if (gheVar.getDayCount() == 0) {
            list2.remove(gheVar);
        }
    }

    private static int d(List<PlanWorkout> list, List<ghg> list2, int i) {
        for (PlanWorkout planWorkout : list) {
            if (!planWorkout.isDayClockIn()) {
                i = 0;
            }
            ghg ghgVar = new ghg();
            ghgVar.e(planWorkout.popWorkoutId());
            ghgVar.c(IntAction.ActionType.RUN);
            ghgVar.a(planWorkout.isDayClockIn() ? 1 : 0);
            list2.add(ghgVar);
        }
        return i;
    }

    private static List<PlanWorkout> c(ghf ghfVar, List<PlanWorkout> list, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        for (PlanWorkout planWorkout : list) {
            int order = planWorkout.popDayInfo().getOrder();
            if (i == planWorkout.popWeekInfo().acquireOrder() && i2 == order) {
                arrayList.add(planWorkout);
            }
        }
        return arrayList;
    }

    private static ghi a(ghf ghfVar, pdt pdtVar, int i) {
        List<CourseDataBean> listA = pdtVar.a();
        ArrayList arrayList = new ArrayList();
        ghi ghiVar = new ghi();
        ghiVar.c(pdtVar.c() ? 1 : 0);
        ghiVar.d(i);
        c(listA, arrayList, ghiVar);
        ghiVar.a(arrayList);
        List<pdr> listE = pdtVar.e();
        ArrayList arrayList2 = new ArrayList();
        d(listE, arrayList2, ghiVar);
        ghiVar.e(arrayList2);
        LogUtil.d("PlanService_IntPlanUtil", "convertAiRunDayInfo day order: ", Integer.valueOf(i), " actions:", Integer.valueOf(arrayList.size()));
        return ghiVar;
    }

    private static void c(List<CourseDataBean> list, List<ghg> list2, ghi ghiVar) {
        for (int i = 0; i < list.size(); i++) {
            ghg ghgVar = new ghg();
            CourseDataBean courseDataBean = list.get(i);
            ghgVar.e(courseDataBean.e());
            ghgVar.a(courseDataBean.a() ? 1 : 0);
            if (courseDataBean.b() == 1) {
                ghgVar.c(IntAction.ActionType.RUN);
            } else {
                ghgVar.c(IntAction.ActionType.WORKOUT);
            }
            ghgVar.b(courseDataBean.d());
            list2.add(ghgVar);
            LogUtil.d("PlanService_IntPlanUtil", "convertAiRunInPlanAction in day : ", Integer.valueOf(ghiVar.getDayOrder()), " actionIdx:", Integer.valueOf(i));
        }
    }

    private static void d(List<pdr> list, List<ghl> list2, ghi ghiVar) {
        if (njy.e(list)) {
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            list2.add(new ghl().d(list.get(i)));
            LogUtil.d("PlanService_IntPlanUtil", "convertAiRunInPlanAction in day : ", Integer.valueOf(ghiVar.getDayOrder()), " recordIdx:", Integer.valueOf(i));
        }
    }

    public static ghi c(ghf ghfVar, int i, int i2) {
        if (ghfVar == null) {
            return null;
        }
        for (ghe gheVar : ghfVar.b()) {
            if (gheVar.getWeekOrder() == i) {
                for (ghi ghiVar : gheVar.e()) {
                    if (ghiVar.getDayOrder() == i2) {
                        return ghiVar;
                    }
                }
            }
        }
        return null;
    }

    public static ghg b(ghf ghfVar, String str, int i, int i2) {
        ghi ghiVarC = c(ghfVar, i, i2);
        if (ghiVarC == null) {
            return null;
        }
        List<ghg> listB = ghiVarC.b();
        if (listB != null) {
            for (ghg ghgVar : listB) {
                if (ghgVar.getActionId() != null && ghgVar.getActionId().equals(str)) {
                    return ghgVar;
                }
            }
        }
        List<ghg> listA = ghiVarC.a();
        if (listA == null) {
            return null;
        }
        for (ghg ghgVar2 : listA) {
            if (ghgVar2.getActionId().equals(str)) {
                return ghgVar2;
            }
        }
        return null;
    }

    public static List<ghg> e(ghf ghfVar, int i, int i2) {
        ghi ghiVarC = c(ghfVar, i, i2);
        if (ghiVarC == null) {
            return null;
        }
        return ghiVarC.b();
    }

    public static boolean e(IntPlan intPlan, WorkoutRecord workoutRecord) {
        if (intPlan == null) {
            ReleaseLogUtil.e("PlanService_IntPlanUtil", "intPlan == null");
            return false;
        }
        if (workoutRecord == null) {
            ReleaseLogUtil.e("PlanService_IntPlanUtil", "workoutRecord == null");
            return false;
        }
        long jA = ift.a(intPlan.getPlanTimeInfo().getEndDate() * 1000);
        long jA2 = ift.a(workoutRecord.acquireExerciseTime());
        ReleaseLogUtil.d("PlanService_IntPlanUtil", "endZeroTime:", Long.valueOf(jA), " currentRecordTime:", Long.valueOf(jA2));
        return jA2 > jA;
    }

    public static boolean b(String str, IntPlan intPlan, int i, int i2) {
        IntWeekPlan weekInfoByOrder = intPlan.getWeekInfoByOrder(i);
        if (weekInfoByOrder == null) {
            ReleaseLogUtil.a("PlanService_IntPlanUtil", "weekInfo not exist.", Integer.valueOf(i));
            return false;
        }
        IntDayPlan dayByOrder = weekInfoByOrder.getDayByOrder(i2);
        if (dayByOrder == null) {
            ReleaseLogUtil.a("PlanService_IntPlanUtil", "dayInfo not exist.", Integer.valueOf(i2));
            return false;
        }
        for (int i3 = 0; i3 < dayByOrder.getInPlanActionCnt(); i3++) {
            IntAction inPlanAction = dayByOrder.getInPlanAction(i3);
            if (inPlanAction != null) {
                ReleaseLogUtil.d("PlanService_IntPlanUtil", "courseId:", str, " day action id:", inPlanAction.getActionId());
                if (str.equals(inPlanAction.getActionId()) && (inPlanAction.getActionType() == IntAction.ActionType.RUN || inPlanAction.getActionType() == IntAction.ActionType.WORKOUT)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean c(String str, IntPlan intPlan, int i, int i2) {
        if (intPlan == null) {
            return false;
        }
        IntWeekPlan weekInfoByOrder = intPlan.getWeekInfoByOrder(i);
        if (weekInfoByOrder == null) {
            ReleaseLogUtil.a("PlanService_IntPlanUtil", "weekInfo not exist.", Integer.valueOf(i));
            return false;
        }
        IntDayPlan dayByOrder = weekInfoByOrder.getDayByOrder(i2);
        if (dayByOrder == null) {
            ReleaseLogUtil.a("PlanService_IntPlanUtil", "dayInfo not exist.", Integer.valueOf(i2));
            return false;
        }
        for (int i3 = 0; i3 < dayByOrder.getOutPlanActionCnt(); i3++) {
            IntAction outPlanAction = dayByOrder.getOutPlanAction(i3);
            if (outPlanAction != null) {
                ReleaseLogUtil.d("PlanService_IntPlanUtil", "isUserAddCourseInPlan courseId:", str, " day action id:", outPlanAction.getActionId());
                if (str.equals(outPlanAction.getActionId()) && (outPlanAction.getActionType() == IntAction.ActionType.RUN || outPlanAction.getActionType() == IntAction.ActionType.WORKOUT)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static float b(ghf ghfVar, long j) {
        float f = 0.0f;
        if (ghfVar == null) {
            return 0.0f;
        }
        int iE = btw.e(ghfVar, j);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        int iB = ift.b(calendar.get(7));
        int i = 0;
        for (ghe gheVar : ghfVar.b()) {
            for (ghi ghiVar : gheVar.e()) {
                boolean zC = c(ghiVar);
                if (zC) {
                    i++;
                    if (gheVar.getWeekOrder() <= iE) {
                        float fA = a(ghiVar);
                        f += fA;
                        LogUtil.a("PlanService_IntPlanUtil", "dayFinishRate:", Float.valueOf(fA), " weekNo:", Integer.valueOf(gheVar.getWeekOrder()), " dayNo:", Integer.valueOf(ghiVar.getDayOrder()), " isTrainingDay:", Boolean.valueOf(zC));
                    }
                } else {
                    LogUtil.a("PlanService_IntPlanUtil", "weekNo:", Integer.valueOf(gheVar.getWeekOrder()), " dayNo:", Integer.valueOf(ghiVar.getDayOrder()));
                }
            }
        }
        float fA2 = a(f, i);
        ReleaseLogUtil.d("PlanService_IntPlanUtil", "getFinishRate is ", Float.valueOf(fA2), " weekOrder:", Integer.valueOf(iE), " dayOrder:", Integer.valueOf(iB), " trainingDays:", Integer.valueOf(i));
        return fA2;
    }

    public static float b(ghf ghfVar) {
        return b(ghfVar, ghfVar.getPlanTimeInfo().getEndDate() * 1000);
    }

    private static float a(ghi ghiVar) {
        if (c(ghiVar)) {
            return b(ghiVar);
        }
        return 0.0f;
    }

    private static boolean c(ghi ghiVar) {
        List<ghg> listB = ghiVar.b();
        if (listB == null) {
            LogUtil.e("PlanService_IntPlanUtil", "actionList == null.");
            return false;
        }
        if (listB.size() == 0) {
            LogUtil.a("PlanService_IntPlanUtil", "rest day.");
            return false;
        }
        if (!b(listB)) {
            return true;
        }
        LogUtil.a("PlanService_IntPlanUtil", "race day.");
        return false;
    }

    private static boolean b(List<ghg> list) {
        boolean z = false;
        for (ghg ghgVar : list) {
            if (ghgVar != null) {
                if (!"Race".equals(ghgVar.getActionId())) {
                    return false;
                }
                LogUtil.a("PlanService_IntPlanUtil", "it is race day.");
                z = true;
            }
        }
        return z;
    }

    private static float b(ghi ghiVar) {
        if (ghiVar.getPunchFlag() == 1) {
            return 1.0f;
        }
        if (ghiVar.b().size() == 0) {
            return 0.0f;
        }
        Iterator<ghg> it = ghiVar.b().iterator();
        int i = 0;
        while (it.hasNext()) {
            if (it.next().getPunchFlag() == 1) {
                i++;
            }
        }
        return (i * 1.0f) / ghiVar.b().size();
    }

    private static float a(float f, int i) {
        float f2 = i == 0 ? 0.0f : (f / i) * 100.0f;
        return ped.a(((double) f2) <= 99.9d ? f2 : 100.0f);
    }

    public static boolean e(pdr pdrVar, IntPlan intPlan) {
        if (pdrVar == null || intPlan == null || pdrVar.b() < intPlan.getPlanTimeInfo().getCreateTime() * 1000) {
            return false;
        }
        for (int i = 0; i < intPlan.getMetaInfo().getWeekCount(); i++) {
            IntWeekPlan weekInfoByIdx = intPlan.getWeekInfoByIdx(i);
            if (weekInfoByIdx != null) {
                for (int i2 = 0; i2 < weekInfoByIdx.getDayCount(); i2++) {
                    IntDayPlan dayByIdx = weekInfoByIdx.getDayByIdx(i2);
                    if (dayByIdx != null) {
                        for (int i3 = 0; i3 < dayByIdx.getRecordDataCnt(); i3++) {
                            RecordData recordData = dayByIdx.getRecordData(i3);
                            if (recordData != null && recordData.getRecordId().equals(pdrVar.j())) {
                                return false;
                            }
                        }
                    }
                }
            }
        }
        return true;
    }

    public static void c(List<StatInfoBean> list, ghf ghfVar) {
        if (njy.e(list)) {
            ReleaseLogUtil.e("PlanService_IntPlanUtil", "the stats is empty.");
            return;
        }
        for (StatInfoBean statInfoBean : list) {
            ghfVar.e(new ghj(statInfoBean.getType(), statInfoBean.getValue()));
        }
        for (String str : d(ghfVar) ? f35850c : f35848a) {
            if (ghfVar.getStat(str) == null) {
                ReleaseLogUtil.e("PlanService_IntPlanUtil", str, "statistics is empty from cloud");
            }
        }
    }

    public static void a(ghf ghfVar) {
        List<ghe> listB = ghfVar.b();
        int size = listB.size();
        Iterator<ghe> it = listB.iterator();
        int endDate = 0;
        while (it.hasNext()) {
            endDate += it.next().getDayCount();
        }
        if (endDate == 0) {
            endDate = (int) ((ghfVar.getPlanTimeInfo().getEndDate() - ghfVar.getPlanTimeInfo().getBeginDate()) / k.b.m);
            size = ift.c(ghfVar.getPlanTimeInfo().getBeginDate() * 1000, ghfVar.getPlanTimeInfo().getEndDate() * 1000);
        }
        LogUtil.a("PlanService_IntPlanUtil", "intPlan planTempId: ", ghfVar.f35107b.getPlanTempId(), "totalWeek: ", Integer.valueOf(size), "totalDay: ", Integer.valueOf(endDate));
        ghfVar.f35107b.i(size);
        ghfVar.f35107b.a(endDate);
    }

    public static boolean d(ghf ghfVar) {
        if (ghfVar.getPlanType() == IntPlan.PlanType.AI_RUN_PLAN) {
            return true;
        }
        return ghfVar.getPlanType() == IntPlan.PlanType.FIT_PLAN && ghfVar.getMetaInfo().getPlanCategory() == 0;
    }

    public static List<pdq> c(List<ghe> list) {
        if (njy.e(list)) {
            LogUtil.j("PlanService_IntPlanUtil", "getPlanReportWeekList isEmpty");
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (ghe gheVar : list) {
            if (gheVar != null) {
                pdq pdqVar = new pdq();
                pdqVar.d(gheVar.getWeekOrder());
                List<ghi> listE = gheVar.e();
                if (!njy.e(listE)) {
                    c(pdqVar, listE);
                    arrayList.add(pdqVar);
                }
            }
        }
        return arrayList;
    }

    private static void c(pdq pdqVar, List<ghi> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (ghi ghiVar : list) {
            if (ghiVar != null) {
                pdt pdtVar = new pdt();
                pdtVar.d(ghiVar.getDayOrder());
                pdtVar.a(ghiVar.getPunchFlag() == 1);
                a(ghiVar, pdtVar);
                arrayList.add(pdtVar);
            }
        }
        pdqVar.d(arrayList);
    }

    private static void a(ghi ghiVar, pdt pdtVar) {
        if (njy.e(ghiVar.b())) {
            LogUtil.j("PlanService_IntPlanUtil", "setCourseData isEmpty");
            return;
        }
        ArrayList arrayList = new ArrayList(ghiVar.b().size());
        Iterator<ghg> it = ghiVar.b().iterator();
        while (it.hasNext()) {
            if (it.next() != null) {
                arrayList.add(new CourseDataBean());
            }
        }
        pdtVar.c(arrayList);
    }

    public static boolean c() {
        if (CommonUtil.ca()) {
            return false;
        }
        return !Utils.k();
    }
}
