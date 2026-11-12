package defpackage;

import android.content.Intent;
import com.huawei.basefitnessadvice.model.Plan;
import com.huawei.basefitnessadvice.model.PlanWorkout;
import com.huawei.basefitnessadvice.model.intplan.IntPlan;
import com.huawei.health.plan.model.receiver.AlarmReceiver;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.openalliance.ad.constant.JsbMapKeyNames;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public class glq {
    private static int d(int i, int i2) {
        return (i * 10) + i2;
    }

    public static boolean b() {
        return c() != -1;
    }

    public static int c() {
        return ifp.d(buh.e("remindTime"), -1);
    }

    public static void b(int i) {
        buh.d("remindTime", String.valueOf(i));
    }

    public static boolean a() {
        return d() != -1;
    }

    public static int d() {
        return ifp.d(buh.e("intRemindTime"), -1);
    }

    public static void d(int i) {
        buh.d("intRemindTime", String.valueOf(i));
    }

    public static void c(Date date, int i, Intent intent) {
        LogUtil.a("Suggestion_DataImplRemindHelper", " registerRemind remindDate: " + date + "; requestCode:" + i);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        if (calendar.getTime().after(new Date())) {
            xjk.b(i, intent, 201326592, 0, calendar.getTimeInMillis());
        }
    }

    public static void a(Plan plan) {
        d(e(plan));
    }

    public static void d(ghf ghfVar) {
        String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011);
        if (ghfVar == null || accountInfo == null) {
            LogUtil.j("Suggestion_DataImplRemindHelper", " updatePlanRemind intPlan or userId is null");
            return;
        }
        if (ghfVar.getPlanType().equals(IntPlan.PlanType.RUN_PLAN)) {
            e(ghfVar);
            return;
        }
        if (ghfVar.getPlanType().equals(IntPlan.PlanType.AI_RUN_PLAN)) {
            b(ghfVar);
        } else if (!ghfVar.getPlanType().equals(IntPlan.PlanType.AI_FITNESS_PLAN) && !ghfVar.getPlanType().equals(IntPlan.PlanType.FIT_PLAN)) {
            LogUtil.j("Suggestion_DataImplRemindHelper", "cancelTodayPlanRemind planType error.");
        } else {
            a(ghfVar);
        }
    }

    public static void a(Plan plan, Boolean bool, int i) {
        e(e(plan), bool, i);
    }

    public static void c(ghf ghfVar, Boolean bool, long j) {
        e(ghfVar, bool, (int) j);
    }

    public static void e(ghf ghfVar, Boolean bool, int i) {
        int iC;
        String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011);
        if (ghfVar == null || accountInfo == null) {
            LogUtil.j("Suggestion_DataImplRemindHelper", " updatePlanRemind intPlan or userId is null");
            return;
        }
        if (bool == null || bool.booleanValue()) {
            bool = Boolean.valueOf(i >= 0);
        } else {
            i = -1;
        }
        LogUtil.a("Suggestion_DataImplRemindHelper", "isOpenRemind :" + bool + "remindTime :" + i);
        if (ghfVar.getPlanType() == IntPlan.PlanType.RUN_PLAN || ghfVar.getPlanType() == IntPlan.PlanType.AI_RUN_PLAN) {
            iC = c();
        } else {
            iC = d();
        }
        if (i == iC) {
            LogUtil.a("Suggestion_DataImplRemindHelper", "remindTime not change.");
            return;
        }
        if (ghfVar.getPlanType() == IntPlan.PlanType.RUN_PLAN || ghfVar.getPlanType() == IntPlan.PlanType.AI_RUN_PLAN) {
            b(i);
        } else {
            d(i);
        }
        if (IntPlan.PlanType.RUN_PLAN.equals(ghfVar.getPlanType())) {
            b(ghfVar, bool, i, accountInfo);
            return;
        }
        if (IntPlan.PlanType.AI_RUN_PLAN.equals(ghfVar.getPlanType())) {
            d(ghfVar, bool, i, accountInfo);
        } else if (!IntPlan.PlanType.AI_FITNESS_PLAN.equals(ghfVar.getPlanType()) && !IntPlan.PlanType.FIT_PLAN.equals(ghfVar.getPlanType())) {
            LogUtil.j("Suggestion_DataImplRemindHelper", "updatePlanRemind planType error.");
        } else {
            a(ghfVar, bool, i, accountInfo);
        }
    }

    private static void b(ghf ghfVar, Boolean bool, int i, String str) {
        Plan compatiblePlan = ghfVar.getCompatiblePlan();
        if (compatiblePlan == null || compatiblePlan.acquireWorkouts() == null) {
            LogUtil.j("Suggestion_DataImplRemindHelper", "updateRunAndFitnessRemind runPlan or mWorkouts is null");
            return;
        }
        List<PlanWorkout> listB = b(compatiblePlan.acquireWorkouts());
        for (int i2 = 0; i2 < listB.size(); i2++) {
            PlanWorkout planWorkout = listB.get(i2);
            if (planWorkout != null) {
                Intent intent = new Intent(btx.c(), (Class<?>) AlarmReceiver.class);
                if (bool.booleanValue()) {
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTime(ieg.b(planWorkout.popDayInfo().acquireDate(), "yyyy-MM-dd"));
                    calendar.set(11, ped.d(i));
                    calendar.set(12, ped.c(i));
                    intent.putExtra(JsbMapKeyNames.H5_USER_ID, str);
                    intent.putExtra("planType", compatiblePlan.acquireType());
                    c(calendar.getTime(), (ghfVar.getPlanType().getType() * 100) + i2, intent);
                } else {
                    xjk.d(i2, intent, 201326592);
                }
            }
        }
    }

    private static void e(ghf ghfVar) {
        Plan compatiblePlan = ghfVar.getCompatiblePlan();
        if (compatiblePlan == null || compatiblePlan.acquireWorkouts() == null) {
            LogUtil.j("Suggestion_DataImplRemindHelper", "cancelTodayRunAndFitnessRemind or mWorkouts is null");
            return;
        }
        List<PlanWorkout> listB = b(compatiblePlan.acquireWorkouts());
        for (int i = 0; i < listB.size(); i++) {
            PlanWorkout planWorkout = listB.get(i);
            if (planWorkout != null && b(ieg.b(planWorkout.popDayInfo().acquireDate(), "yyyy-MM-dd"), new Date())) {
                Intent intent = new Intent(btx.c(), (Class<?>) AlarmReceiver.class);
                int type = ghfVar.getPlanType().getType();
                LogUtil.a("Suggestion_DataImplRemindHelper", "cancel today runAndFitness planRemind");
                xjk.d((type * 100) + i, intent, 201326592);
            }
        }
    }

    private static void d(ghf ghfVar, Boolean bool, int i, String str) {
        Plan compatiblePlan = ghfVar.getCompatiblePlan();
        if (compatiblePlan == null || compatiblePlan.getPlanWeekDataList() == null) {
            LogUtil.j("Suggestion_DataImplRemindHelper", "updateAiRunPlanRemind aiRunPlan or planWeekDataList is null");
            return;
        }
        List<pdq> planWeekDataList = compatiblePlan.getPlanWeekDataList();
        Calendar calendar = Calendar.getInstance();
        if (njy.e(planWeekDataList)) {
            LogUtil.j("Suggestion_DataImplRemindHelper", "updateAiRunPlanRemind skipped by null weekData");
            return;
        }
        int iB = btw.b(compatiblePlan);
        for (pdq pdqVar : planWeekDataList) {
            if (pdqVar.j() == iB) {
                if (!njy.e(pdqVar.f())) {
                    for (pdt pdtVar : pdqVar.f()) {
                        int type = (ghfVar.getPlanType().getType() * 100) + d(pdqVar.j(), pdtVar.d());
                        Intent intent = new Intent(btx.c(), (Class<?>) AlarmReceiver.class);
                        if (!bool.booleanValue()) {
                            xjk.d(type, intent, 201326592);
                            LogUtil.a("Suggestion_DataImplRemindHelper", "updateAiRunPlanRemind cancelRemind: plan ", ghfVar.getPlanId());
                        } else {
                            long jC = btw.c(compatiblePlan, pdqVar.j(), pdtVar.d());
                            calendar.setTimeInMillis(jC);
                            calendar.set(11, ped.d(i));
                            calendar.set(12, ped.c(i));
                            intent.putExtra(JsbMapKeyNames.H5_USER_ID, str);
                            c(calendar.getTime(), type, intent);
                            LogUtil.a("Suggestion_DataImplRemindHelper", "updateAiRunPlanRemind registerRemind: plan ", ghfVar.getPlanId(), ", curTime=", Long.valueOf(jC), ", calTime=", Long.valueOf(calendar.getTimeInMillis()));
                        }
                    }
                }
            }
        }
    }

    private static void b(ghf ghfVar) {
        Plan compatiblePlan = ghfVar.getCompatiblePlan();
        if (compatiblePlan == null || compatiblePlan.getPlanWeekDataList() == null) {
            LogUtil.j("Suggestion_DataImplRemindHelper", "cancelTodayAiRunPlanRemind aiRunPlan or planWeekDataList is null");
            return;
        }
        List<pdq> planWeekDataList = compatiblePlan.getPlanWeekDataList();
        if (njy.b(planWeekDataList)) {
            int iB = btw.b(compatiblePlan);
            int iB2 = ift.b(Calendar.getInstance().get(7));
            for (pdq pdqVar : planWeekDataList) {
                if (pdqVar.j() == iB && njy.b(pdqVar.f())) {
                    Iterator<pdt> it = pdqVar.f().iterator();
                    while (it.hasNext()) {
                        if (it.next().d() == iB2) {
                            int type = ghfVar.getPlanType().getType();
                            int iD = d(iB, iB2);
                            Intent intent = new Intent(btx.c(), (Class<?>) AlarmReceiver.class);
                            LogUtil.a("Suggestion_DataImplRemindHelper", "cancel today aiRunPlan planRemind");
                            xjk.d((type * 100) + iD, intent, 201326592);
                        }
                    }
                }
            }
        }
    }

    private static void a(ghf ghfVar, Boolean bool, int i, String str) {
        if (ghfVar == null || ghfVar.b() == null) {
            LogUtil.j("Suggestion_DataImplRemindHelper", "updateIntPlanRemind intPlan weekInfoList is null");
            return;
        }
        long beginDate = ghfVar.getPlanTimeInfo().getBeginDate();
        int iH = btw.h(ghfVar);
        for (ghe gheVar : ghfVar.b()) {
            int weekOrder = gheVar.getWeekOrder();
            if (!IntPlan.PlanType.AI_FITNESS_PLAN.equals(ghfVar.getPlanType()) || weekOrder == iH) {
                if (njy.b(gheVar.e())) {
                    Iterator<ghi> it = gheVar.e().iterator();
                    while (it.hasNext()) {
                        int dayOrder = it.next().getDayOrder();
                        int type = (ghfVar.getPlanType().getType() * 100) + d(weekOrder, dayOrder);
                        Intent intent = new Intent(btx.c(), (Class<?>) AlarmReceiver.class);
                        if (!bool.booleanValue()) {
                            LogUtil.a("Suggestion_DataImplRemindHelper", " updateIntPlanRemind cancelRemind requestCode:" + type);
                            xjk.d(type, intent, 201326592);
                        } else {
                            Calendar calendar = Calendar.getInstance();
                            calendar.setTimeInMillis(ift.a(1000 * beginDate, weekOrder - 1, dayOrder));
                            calendar.set(11, ped.d(i));
                            calendar.set(12, ped.c(i));
                            LogUtil.a("Suggestion_DataImplRemindHelper", " updateIntPlanRemind registerRemind remindDate: " + calendar.getTime() + "; requestCode:" + type);
                            intent.putExtra(JsbMapKeyNames.H5_USER_ID, str);
                            c(calendar.getTime(), type, intent);
                        }
                    }
                }
            }
        }
    }

    private static void a(ghf ghfVar) {
        if (ghfVar == null || ghfVar.b() == null) {
            LogUtil.j("Suggestion_DataImplRemindHelper", "cancelTodayIntPlanRemind intPlan weekInfoList is null");
            return;
        }
        int iH = btw.h(ghfVar);
        int iB = ift.b(Calendar.getInstance().get(7));
        if (gnw.c(ghfVar, iH, iB) != null) {
            Intent intent = new Intent(btx.c(), (Class<?>) AlarmReceiver.class);
            int type = ghfVar.getPlanType().getType();
            int iD = d(iH, iB);
            LogUtil.a("Suggestion_DataImplRemindHelper", "cancel today intPlan planRemind");
            xjk.d((type * 100) + iD, intent, 201326592);
        }
    }

    public static ghf e(Plan plan) {
        IntPlan.PlanType planType;
        if (plan == null) {
            return null;
        }
        int iAcquireType = plan.acquireType();
        if (iAcquireType == 0) {
            if (plan.getPlanCategory() == 1) {
                planType = IntPlan.PlanType.AI_RUN_PLAN;
            } else if (plan.getPlanCategory() == 0) {
                planType = IntPlan.PlanType.RUN_PLAN;
            } else {
                LogUtil.j("Suggestion_DataImplRemindHelper", " run planCategory error");
            }
        } else {
            planType = iAcquireType != 3 ? null : IntPlan.PlanType.FIT_PLAN;
        }
        if (planType == null) {
            return null;
        }
        ghf ghfVarC = ghf.c();
        ghfVarC.b(plan);
        ghn ghnVar = new ghn();
        ghnVar.d(planType);
        ghfVarC.c(ghnVar);
        return ghfVarC;
    }

    private static List<PlanWorkout> b(List<PlanWorkout> list) {
        ArrayList arrayList = new ArrayList(10);
        if (list != null) {
            String strAcquireDate = "";
            for (int i = 0; i < list.size(); i++) {
                if (i == 0) {
                    strAcquireDate = list.get(i).popDayInfo().acquireDate();
                    arrayList.add(list.get(i));
                } else {
                    String strAcquireDate2 = list.get(i).popDayInfo().acquireDate();
                    if (!strAcquireDate2.equals(strAcquireDate)) {
                        arrayList.add(list.get(i));
                    }
                    strAcquireDate = strAcquireDate2;
                }
            }
        }
        return arrayList;
    }

    private static boolean b(Date date, Date date2) {
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        calendar.setTime(date);
        calendar2.setTime(date2);
        return calendar.get(1) == calendar2.get(1) && calendar.get(6) == calendar2.get(6);
    }
}
