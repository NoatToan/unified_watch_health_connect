package defpackage;

import android.text.TextUtils;
import com.huawei.basefitnessadvice.model.Plan;
import com.huawei.health.courseplanservice.R;
import com.huawei.health.sport.model.WorkoutRecord;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.UnitUtil;

/* JADX INFO: loaded from: classes8.dex */
public class gnu {
    public static int e(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        return str.contains("_") ? 3 : 0;
    }

    public static pcp e(int i) {
        boolean zF = UnitUtil.f();
        pcp pcpVar = new pcp();
        pcpVar.b(c(i));
        pcpVar.a(R.drawable.old_plan_bg);
        if (i == 0) {
            if (zF) {
                pcpVar.d(btx.c().getString(R.string.IDS_run_plantype_5km_to_mile, UnitUtil.e(UnitUtil.e(5.0d, 3), 1, 1)));
            } else {
                pcpVar.d(btx.c().getString(R.string.IDS_run_plantype_5km, 5));
            }
            pcpVar.b(0);
            return pcpVar;
        }
        if (i == 1) {
            if (zF) {
                pcpVar.d(btx.c().getString(R.string.IDS_run_plantype_10km_to_mile, UnitUtil.e(UnitUtil.e(10.0d, 3), 1, 1)));
            } else {
                pcpVar.d(btx.c().getString(R.string.IDS_run_plantype_10km, 10));
            }
            pcpVar.b(1);
            return pcpVar;
        }
        if (i == 2) {
            pcpVar.d(btx.c().getString(R.string.IDS_run_plantype_half));
            pcpVar.b(2);
            return pcpVar;
        }
        if (i == 3) {
            pcpVar.d(btx.c().getString(R.string.IDS_run_plantype_full));
            pcpVar.b(3);
            return pcpVar;
        }
        LogUtil.j("PlanService_PlanServiceUtil", "getRunPlanInfo default branch.");
        return pcpVar;
    }

    public static float b(float f) {
        if (f <= 100.0f) {
            return f;
        }
        LogUtil.e("PlanService_PlanServiceUtil", "truncateOverOneHundred target = ", Float.valueOf(f));
        return 100.0f;
    }

    public static int c(String str) {
        if (str == null || str.length() < 5) {
            return -1;
        }
        char cCharAt = str.charAt(2);
        if (str.length() == 5 || cCharAt == '3') {
            return 3;
        }
        if (cCharAt == '0') {
            return 0;
        }
        return cCharAt == '1' ? 1 : -1;
    }

    public static boolean c(String str, int i) {
        int iC = c(str);
        if (i == 0 && iC == 1) {
            return false;
        }
        return (iC == 0 && i == 1) ? false : true;
    }

    public static String c(int i) {
        String strC = pei.c(btx.c(), R.string.sug_defalut_5km_plan_name, new Object[0]);
        if (i == 0) {
            return b(5);
        }
        if (i == 1) {
            return b(10);
        }
        if (i == 2) {
            if (UnitUtil.f()) {
                return pei.c(btx.c(), R.string.sug_run_trainplan, gzx.d(R.plurals.sug_mile, 13, UnitUtil.e(13.1d, 1, 1)));
            }
            return pei.c(btx.c(), R.string.sug_defalut_half_marathon_plan_name, new Object[0]);
        }
        if (i != 3) {
            return strC;
        }
        if (UnitUtil.f()) {
            return pei.c(btx.c(), R.string.sug_run_trainplan, gzx.d(R.plurals.sug_mile, 26, UnitUtil.e(26.2d, 1, 1)));
        }
        return pei.c(btx.c(), R.string.sug_defalut_marathon_plan_name, new Object[0]);
    }

    private static String b(int i) {
        if (UnitUtil.f()) {
            double d = ltc.d((int) (((double) i) * 1000.0d));
            return pei.c(btx.c(), R.string.sug_run_trainplan, gzx.d(R.plurals.sug_mile, (int) d, UnitUtil.e(d, 1, 1)));
        }
        return gzx.c(btx.c(), R.string.sug_run_trainplan, gzx.d(R.plurals.sug_km, i, UnitUtil.e(i, 1, 0)));
    }

    public static boolean c(WorkoutRecord workoutRecord) {
        if (workoutRecord != null && !TextUtils.isEmpty(workoutRecord.acquirePlanId())) {
            String strAcquirePlanId = workoutRecord.acquirePlanId();
            Plan currentPlan = gls.b().getCurrentPlan();
            if (currentPlan != null && strAcquirePlanId.equals(currentPlan.acquireId())) {
                return currentPlan.getPlanCategory() == 0 && currentPlan.acquireType() == 0;
            }
            String strAcquireWorkoutId = workoutRecord.acquireWorkoutId();
            if (!TextUtils.isEmpty(strAcquireWorkoutId)) {
                try {
                    return Integer.parseInt(strAcquireWorkoutId) < 500;
                } catch (NumberFormatException unused) {
                    LogUtil.j("PlanService_PlanServiceUtil", "not number workout id.");
                }
            }
        }
        return false;
    }
}
