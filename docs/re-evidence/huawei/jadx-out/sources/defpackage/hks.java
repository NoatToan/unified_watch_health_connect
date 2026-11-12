package defpackage;

import android.text.TextUtils;
import com.huawei.basefitnessadvice.model.Plan;
import com.huawei.health.plan.api.PlanApi;
import com.huawei.health.sport.model.WorkoutRecord;
import com.huawei.health.suggestion.R;
import com.huawei.health.userprofilemgr.api.UserProfileMgrApi;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.up.model.UserInfomation;
import health.compact.a.CommonUtil;
import health.compact.a.Services;
import health.compact.a.UnitUtil;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes9.dex */
public class hks {
    private static boolean c(String str) {
        return (TextUtils.isEmpty(str) || !str.contains("_") || str.startsWith("_")) ? false : true;
    }

    private static boolean e(String[] strArr) {
        String str;
        return strArr.length > 1 && (str = strArr[0]) != null && a(str);
    }

    private static boolean a(String str) {
        return Pattern.compile("[0-9]+").matcher(str).matches();
    }

    public static void a(WorkoutRecord workoutRecord, SimpleDateFormat simpleDateFormat, String[] strArr) {
        if (workoutRecord == null) {
            LogUtil.j("Suggestion_TrainEventHelper", "getExerciseTimeTemp itemData == null");
            return;
        }
        String strAcquireTrajectoryId = workoutRecord.acquireTrajectoryId();
        if (c(strAcquireTrajectoryId)) {
            String[] strArrSplit = strAcquireTrajectoryId.split("_");
            if (e(strArrSplit)) {
                try {
                    strArr[0] = simpleDateFormat.format(new Date(Long.parseLong(strArrSplit[0])));
                    strArr[1] = SimpleDateFormat.getDateInstance(3).format(new Date(Long.parseLong(strArrSplit[0])));
                } catch (NumberFormatException unused) {
                    LogUtil.e("Suggestion_TrainEventHelper", "getExerciseTimeTemp error trajectoryId:", strAcquireTrajectoryId);
                }
            }
        }
    }

    public static final String a(double d) {
        return String.format(Locale.ROOT, "%02d'%02d\"", Long.valueOf(Math.round(d) / 60), Long.valueOf(Math.round(d) % 60));
    }

    private static hmc e(Calendar calendar, SimpleDateFormat simpleDateFormat, int i) {
        if (calendar.get(5) == 1 || calendar.get(5) == 15) {
            return new hmc(0.0f, simpleDateFormat.format(Long.valueOf(calendar.getTimeInMillis())), i);
        }
        return new hmc(0.0f, "", i);
    }

    private static hmc c(int i) {
        if (i == 0 || i == 9 || i == 19) {
            return new hmc(0.0f, gzx.c(BaseApplication.getContext(), R.string.sug_unit_week, UnitUtil.e(i + 1, 1, 0)), i);
        }
        return new hmc(0.0f, "", i);
    }

    public static void c(List<hmc> list, List<hmc> list2, Plan plan) {
        if (plan == null || list == null || list2 == null) {
            LogUtil.j("Suggestion_TrainEventHelper", "getTotalExcelList joinedPlan == null || excelList == null || anotherExcelList == null");
            return;
        }
        if (plan.getWeekCount() <= 8) {
            int i = 0;
            while (i < plan.getWeekCount()) {
                int i2 = i + 1;
                hmc hmcVar = new hmc(0.0f, gzx.c(BaseApplication.getContext(), R.string.sug_unit_week, UnitUtil.e(i2, 1, 0)), i);
                list.add(hmcVar);
                if (hmcVar.clone() instanceof hmc) {
                    list2.add((hmc) hmcVar.clone());
                }
                i = i2;
            }
            return;
        }
        for (int i3 = 0; i3 < plan.getWeekCount(); i3++) {
            hmc hmcVarC = c(i3);
            list.add(hmcVarC);
            if (hmcVarC.clone() instanceof hmc) {
                list2.add((hmc) hmcVarC.clone());
            }
        }
    }

    public static void a(List<hmc> list, c cVar, DecimalFormat decimalFormat, boolean z) {
        UserProfileMgrApi userProfileMgrApi = (UserProfileMgrApi) Services.d("HWUserProfileMgr", UserProfileMgrApi.class);
        if (userProfileMgrApi == null) {
            LogUtil.j("Suggestion_TrainEventHelper", "diffRecordType : userProfileMgrApi is null.");
            return;
        }
        UserInfomation userInfo = userProfileMgrApi.getUserInfo();
        if (cVar == null) {
            LogUtil.j("Suggestion_TrainEventHelper", "eventData == null");
            return;
        }
        if (decimalFormat == null) {
            LogUtil.j("Suggestion_TrainEventHelper", "decimalFormat == null");
            return;
        }
        if (njy.c(list, cVar.f36851a)) {
            hmc hmcVar = list.get(cVar.f36851a);
            if (cVar.d == 0) {
                hmcVar.c(3);
                hmcVar.f((float) (((double) hmcVar.i()) + ped.h(cVar.f36852c.acquireDistance())));
                hmcVar.a(hmcVar.n() + CommonUtil.f(ped.e(ped.h(cVar.f36852c.acquireActualDistance()))));
                hmcVar.b(gzx.d(gzw.a(), (int) hmcVar.n(), decimalFormat.format(hmcVar.n())));
                return;
            }
            if (cVar.d == 1) {
                hmcVar.c(1);
                hmcVar.f(hmcVar.i() + cVar.f36852c.acquireCalorie());
                hmcVar.a(hmcVar.n() + cVar.f36852c.acquireActualCalorie());
                hmcVar.j(hmcVar.n());
                hmcVar.b(gzx.c(BaseApplication.getContext(), com.huawei.health.basefitnessadvice.R.string.sug_chart_kcal, new DecimalFormat("#").format(Math.round(hmcVar.n() / 1000.0f))));
                return;
            }
            if (cVar.d == 2) {
                b(cVar, hmcVar);
            } else if (cVar.d == 3) {
                e(cVar, userInfo, hmcVar, z);
            }
        }
    }

    private static void b(c cVar, hmc hmcVar) {
        hmcVar.f(hmcVar.i() + CommonUtil.f(ped.e(ped.h(cVar.f36852c.acquireActualDistance()))));
        hmcVar.a(hmcVar.n() + cVar.f36852c.getDuration());
        hmcVar.g(hmcVar.q() + cVar.f36852c.getDuration());
        hmcVar.j(hmcVar.i() == 0.0f ? 0.0f : hmcVar.q() / hmcVar.i());
        hmcVar.c(2);
        hmcVar.b(gzx.c(BaseApplication.getContext(), gzw.e(), a(cVar.f36852c.acquireActualDistance() == 0.0f ? 0.0d : ((double) cVar.f36852c.getDuration()) / ped.h(cVar.f36852c.acquireActualDistance()))));
    }

    private static void e(c cVar, UserInfomation userInfomation, hmc hmcVar, boolean z) {
        PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
        if (planApi == null) {
            LogUtil.j("Suggestion_TrainEventHelper", "setPercentExcel : planApi is null.");
            return;
        }
        hmcVar.g(hmcVar.q() + cVar.f36852c.acquireActualCalorie());
        if (cVar.e == null) {
            LogUtil.j("Suggestion_TrainEventHelper", "diffRecordType firstDay == null");
            hmcVar.i(planApi.getFitnessPlanShouldCompleteCalorie(1, cVar.f36852c, userInfomation));
        } else {
            hmcVar.i(planApi.getFitnessPlanShouldCompleteCalorie(0, cVar.f36852c, userInfomation));
        }
        if (Math.abs(hmcVar.s()) > 1.0E-6d) {
            hmcVar.a(ibl.b((hmcVar.q() / hmcVar.s()) * 100.0f));
        }
        hmcVar.c(0);
        hmcVar.b(UnitUtil.e((!z || hmcVar.n() <= 99.0f) ? hmcVar.n() : 100.0d, 2, 1));
    }

    public static void d(List<WorkoutRecord> list, List<Object> list2) {
        if (list != null) {
            for (WorkoutRecord workoutRecord : list) {
                if (e(workoutRecord)) {
                    list2.add(workoutRecord);
                }
            }
        }
    }

    private static boolean e(WorkoutRecord workoutRecord) {
        return workoutRecord.acquireActualCalorie() > 0.0f || workoutRecord.acquireActualDistance() > 0.0f;
    }

    public static hmc e(Calendar calendar, SimpleDateFormat simpleDateFormat, int i, int i2) {
        hmc hmcVar;
        if (i2 == 3) {
            hmcVar = e(calendar, simpleDateFormat, i);
        } else {
            hmcVar = new hmc(0.0f, simpleDateFormat.format(Long.valueOf(calendar.getTimeInMillis())), i);
        }
        calendar.add(6, 1);
        return hmcVar;
    }

    public static int a(Calendar calendar, SimpleDateFormat simpleDateFormat, WorkoutRecord workoutRecord, Date date) throws ParseException {
        if (workoutRecord == null) {
            return -1;
        }
        if (calendar == null) {
            int iE = ieg.e(date, simpleDateFormat.parse(workoutRecord.acquireWorkoutDate()));
            return iE >= 0 ? iE / 7 : iE;
        }
        return ieg.e(calendar.getTime(), simpleDateFormat.parse(workoutRecord.acquireWorkoutDate()));
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f36851a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private WorkoutRecord f36852c;
        private int d;
        private Calendar e;

        public c(Calendar calendar, int i, WorkoutRecord workoutRecord, int i2) {
            this.e = calendar;
            this.d = i;
            this.f36852c = workoutRecord;
            this.f36851a = i2;
        }
    }
}
