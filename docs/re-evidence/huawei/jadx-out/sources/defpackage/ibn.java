package defpackage;

import android.content.Context;
import com.braintreepayments.api.PayPalPaymentIntent;
import com.huawei.basefitnessadvice.model.intplan.IntPlan;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnessadvice.FitWorkout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class ibn {
    public static boolean e(FitWorkout fitWorkout) {
        if (fitWorkout != null) {
            return fitWorkout.isRunModelCourse();
        }
        return false;
    }

    public static void d(Context context, FitWorkout fitWorkout, IntPlan intPlan, long j, int i) {
        if (context == null || fitWorkout == null || intPlan == null) {
            LogUtil.j("Suggestion_WorkoutUtil", "context == null || fitWorkout == null || currentRunPlan == null");
            return;
        }
        int iB = b(intPlan, j);
        if (intPlan.getCompatiblePlan() != null) {
            ien.b(context, fitWorkout, intPlan.getCompatiblePlan(), j, i);
        } else {
            b(context, fitWorkout, c(intPlan.getPlanId(), j, i, iB));
        }
    }

    public static Map<String, Object> c(String str, long j, int i, int i2) {
        HashMap map = new HashMap(4);
        map.put("planId", str);
        map.put("plan_execute_time", Long.valueOf(j));
        map.put(PayPalPaymentIntent.ORDER, Integer.valueOf(i));
        map.put("weekNum", Integer.valueOf(i2));
        return map;
    }

    public static void d(Context context, FitWorkout fitWorkout, IntPlan intPlan, long j) {
        d(context, fitWorkout, intPlan, j, 1);
    }

    public static void b(Context context, FitWorkout fitWorkout, Map<String, Object> map) {
        pcd pcdVar = new pcd(fitWorkout.acquireId());
        if (map != null) {
            Object obj = map.get("planId");
            if (obj instanceof String) {
                pcdVar.g((String) obj);
            }
            pcdVar.g((String) map.get("planId"));
            Object obj2 = map.get(PayPalPaymentIntent.ORDER);
            if (obj2 instanceof Integer) {
                pcdVar.g(((Integer) obj2).intValue());
            }
            Object obj3 = map.get("plan_execute_time");
            if (obj3 instanceof Long) {
                pcdVar.e(((Long) obj3).longValue());
            }
            Object obj4 = map.get("weekNum");
            if (obj4 instanceof Integer) {
                pcdVar.j(((Integer) obj4).intValue());
            }
        }
        pea.a(context, fitWorkout, pcdVar);
    }

    public static void c(Context context, FitWorkout fitWorkout, IntPlan intPlan, long j) {
        if (context == null || fitWorkout == null || intPlan == null) {
            LogUtil.j("Suggestion_WorkoutUtil", "context == null || fitWorkout == null || currentRunPlan == null");
        } else {
            a(context, fitWorkout, intPlan, 1, j);
        }
    }

    public static void a(Context context, FitWorkout fitWorkout, IntPlan intPlan, int i, long j) {
        if (context == null || fitWorkout == null || intPlan == null) {
            LogUtil.j("Suggestion_WorkoutUtil", "context == null || fitWorkout == null || currentRunPlan == null");
        } else {
            ien.b(context, fitWorkout, intPlan.getPlanId(), b(intPlan, j), i, j);
        }
    }

    private static int b(IntPlan intPlan, long j) {
        if (IntPlan.PlanType.FIT_PLAN.equals(intPlan.getPlanType())) {
            return ien.e(TimeUnit.SECONDS.toMillis(intPlan.getPlanTimeInfo().getBeginDate()), j);
        }
        return hvu.g(intPlan);
    }

    public static List<FitWorkout> c(List<FitWorkout> list) {
        ArrayList arrayList = new ArrayList(10);
        if (njy.e(list)) {
            LogUtil.j("Suggestion_WorkoutUtil", "removeDupWorkouts() workouts is null");
            return arrayList;
        }
        for (FitWorkout fitWorkout : list) {
            if (!arrayList.contains(fitWorkout)) {
                arrayList.add(fitWorkout);
            }
        }
        return arrayList;
    }
}
