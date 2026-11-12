package defpackage;

import com.huawei.basefitnessadvice.model.DayInfo;
import com.huawei.basefitnessadvice.model.FitnessDayPlan;
import com.huawei.basefitnessadvice.model.PlanWorkout;
import com.huawei.basefitnessadvice.model.WeekInfo;
import com.huawei.health.courseplanservice.R;
import com.huawei.health.plan.model.UserFitnessPlanInfo;
import com.huawei.health.plan.model.model.RestDescConstructor;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.Calendar;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public class gnq {
    public static void b(List<gzh> list, int i) {
        Calendar calendar = Calendar.getInstance();
        RestDescConstructor restDescConstructor = new RestDescConstructor();
        restDescConstructor.init(BaseApplication.getContext());
        if (list == null) {
            LogUtil.j("Suggestion_ShowPlanAnotherHelper", "weekWorkouts == null");
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            gzh gzhVar = list.get(i2);
            for (int i3 = 0; i3 < 7; i3++) {
                if (gzhVar.a().get(i3) == null) {
                    gzhVar.a().set(i3, e(i, (i2 * 7) + i3, gzhVar.e(), calendar, restDescConstructor));
                }
            }
        }
    }

    public static void d(List<gzh> list, int i) {
        if (list == null) {
            LogUtil.j("Suggestion_ShowPlanAnotherHelper", "weekWorkouts == null");
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            gzh gzhVar = list.get(i2);
            for (int i3 = 0; i3 < 7; i3++) {
                if (gzhVar.a().get(i3) == null) {
                    gzhVar.a().set(i3, c(i, (i2 * 7) + i3, gzhVar.e()));
                }
            }
        }
    }

    private static gyx e(int i, int i2, WeekInfo weekInfo, Calendar calendar, RestDescConstructor restDescConstructor) {
        PlanWorkout planWorkout = new PlanWorkout();
        planWorkout.putWeekInfo(weekInfo);
        DayInfo dayInfoB = b(i, i2, calendar);
        planWorkout.putName(btx.c().getString(R.string.sug_rest_workout_name));
        planWorkout.putDescription(restDescConstructor.constructorDesc());
        planWorkout.putWorkoutId(null);
        planWorkout.putDayInfo(dayInfoB);
        gyx gyxVar = new gyx(i + i2, planWorkout.popDayInfo());
        gyxVar.d(true);
        gyxVar.d().add(planWorkout);
        return gyxVar;
    }

    private static gyx c(int i, int i2, WeekInfo weekInfo) {
        PlanWorkout planWorkout = new PlanWorkout();
        planWorkout.putWeekInfo(weekInfo);
        planWorkout.putDayInfo(d(i, i2));
        gyx gyxVar = new gyx(i + i2, planWorkout.popDayInfo());
        gyxVar.d(true);
        gyxVar.d().add(planWorkout);
        return gyxVar;
    }

    private static DayInfo d(int i, int i2) {
        DayInfo dayInfo = new DayInfo();
        dayInfo.saveOrder((i2 % 7) + 1);
        dayInfo.saveSinglesCount(1);
        UserFitnessPlanInfo userFitnessPlanInfoI = gme.c().i();
        Calendar calendar = Calendar.getInstance();
        calendar.clear();
        calendar.add(5, i + i2);
        if (userFitnessPlanInfoI == null) {
            LogUtil.j("Suggestion_ShowPlanAnotherHelper", "info == null");
            dayInfo.saveDate(ieg.d(calendar.getTime(), "yyyy-MM-dd"));
            return dayInfo;
        }
        for (int i3 = 0; i3 < userFitnessPlanInfoI.acquireWeekPlanList().size(); i3++) {
            for (FitnessDayPlan fitnessDayPlan : userFitnessPlanInfoI.acquireWeekPlanList().get(i3).acquireWeekList()) {
                if (fitnessDayPlan != null) {
                    long jA = ift.a(fitnessDayPlan.acquireDate());
                    if (jA == ift.a(calendar.getTimeInMillis())) {
                        LogUtil.d("Suggestion_ShowPlanAnotherHelper", Long.valueOf(jA));
                        dayInfo.saveDayDesc(fitnessDayPlan.acquireDescription());
                        dayInfo.saveDayTitle(btx.c().getString(R.string.sug_rest_workout_name));
                    }
                }
            }
        }
        dayInfo.saveDate(ieg.d(calendar.getTime(), "yyyy-MM-dd"));
        return dayInfo;
    }

    private static DayInfo b(int i, int i2, Calendar calendar) {
        DayInfo dayInfo = new DayInfo();
        dayInfo.saveOrder((i2 % 7) + 1);
        dayInfo.saveSinglesCount(1);
        calendar.clear();
        calendar.add(5, i + i2);
        dayInfo.saveDate(ieg.d(calendar.getTime(), "yyyy-MM-dd"));
        return dayInfo;
    }
}
