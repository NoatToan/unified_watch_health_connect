package defpackage;

import android.text.TextUtils;
import android.util.SparseArray;
import com.huawei.basefitnessadvice.model.intplan.IntAction;
import com.huawei.basefitnessadvice.model.intplan.IntDayPlan;
import com.huawei.basefitnessadvice.model.intplan.IntPlan;
import com.huawei.basefitnessadvice.model.intplan.IntWeekPlan;
import com.huawei.basefitnessadvice.model.intplan.PlanMetaInfo;
import com.huawei.basefitnessadvice.model.intplan.PlanTimeInfo;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.utils.versioncontrol.VersionControlUtil;
import health.compact.a.CommonUtil;
import health.compact.a.HiDateUtil;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/* JADX INFO: loaded from: classes.dex */
public class hvu {
    public static boolean n(IntPlan intPlan) {
        if (intPlan == null) {
            ReleaseLogUtil.e("Suggestion_IntPlanDataUtil", "isInPlanRange plan == null");
            return false;
        }
        int iJ = ift.j(intPlan.getPlanTimeInfo().getBeginDate() * 1000);
        int iJ2 = ift.j(intPlan.getPlanTimeInfo().getEndDate() * 1000);
        int iJ3 = ift.j(ift.a(System.currentTimeMillis()));
        return iJ3 >= iJ && iJ3 <= iJ2;
    }

    public static boolean m(IntPlan intPlan) {
        if (intPlan == null) {
            ReleaseLogUtil.e("Suggestion_IntPlanDataUtil", "isInPlanCreatingDay plan == null");
            return false;
        }
        int iJ = ift.j(intPlan.getPlanTimeInfo().getCreateTime() * 1000);
        int iJ2 = ift.j(ift.a(System.currentTimeMillis()));
        LogUtil.a("Suggestion_IntPlanDataUtil", "isInPlanCreatingDay createDay", Integer.valueOf(iJ), " currentDay", Integer.valueOf(iJ2));
        return iJ2 == iJ;
    }

    public static boolean o(IntPlan intPlan) {
        if (intPlan != null) {
            return ift.j(ift.a(System.currentTimeMillis())) == ift.j(intPlan.getPlanTimeInfo().getEndDate() * 1000);
        }
        ReleaseLogUtil.e("Suggestion_IntPlanDataUtil", "isInPlanEndDay plan == null");
        return false;
    }

    public static boolean u(IntPlan intPlan) {
        if (intPlan == null) {
            ReleaseLogUtil.e("Suggestion_IntPlanDataUtil", "isPlanOverdue plan == null");
            return false;
        }
        int iJ = ift.j(intPlan.getPlanTimeInfo().getEndDate() * 1000);
        int iJ2 = ift.j(ift.a(System.currentTimeMillis()));
        LogUtil.a("Suggestion_IntPlanDataUtil", "isPlanOverdue currentDay:", Integer.valueOf(iJ2), " endDay", Integer.valueOf(iJ));
        return iJ2 > iJ;
    }

    public static boolean q(IntPlan intPlan) {
        if (intPlan != null) {
            return intPlan.getStat("progress") != null && ((Float) intPlan.getStat("progress").getValue()).floatValue() >= 60.0f;
        }
        ReleaseLogUtil.e("Suggestion_IntPlanDataUtil", "isPlanFinishEnough plan == null");
        return false;
    }

    public static int i(IntPlan intPlan) {
        int iH = btw.h(intPlan);
        int i = 0;
        for (int i2 = 0; i2 < intPlan.getMetaInfo().getWeekCount(); i2++) {
            IntWeekPlan weekInfoByIdx = intPlan.getWeekInfoByIdx(i2);
            if (weekInfoByIdx.getWeekOrder() < iH && !hvv.e(weekInfoByIdx, 0.2f)) {
                i++;
            }
        }
        LogUtil.a("Suggestion_IntPlanDataUtil", "getPlanAbsentWeekCount absentWeek:", Integer.valueOf(i));
        return i;
    }

    public static boolean t(IntPlan intPlan) {
        int iH = btw.h(intPlan) - 1;
        LogUtil.a("Suggestion_IntPlanDataUtil", "isLastWeekExerciseBad lastWeek:", Integer.valueOf(iH));
        for (int i = 0; i < intPlan.getMetaInfo().getWeekCount(); i++) {
            IntWeekPlan weekInfoByIdx = intPlan.getWeekInfoByIdx(i);
            if (weekInfoByIdx.getWeekOrder() == iH && !hvv.e(weekInfoByIdx, 0.2f)) {
                return true;
            }
        }
        return false;
    }

    public static boolean k(IntPlan intPlan) {
        int iG = g(intPlan);
        int weekCount = intPlan.getMetaInfo().getWeekCount();
        if (iG < weekCount) {
            return false;
        }
        IntWeekPlan weekInfoByIdx = intPlan.getWeekInfoByIdx(weekCount - 1);
        for (int i = 0; i < weekInfoByIdx.getDayCount(); i++) {
            IntDayPlan dayByIdx = weekInfoByIdx.getDayByIdx(i);
            if (dayByIdx != null) {
                for (int i2 = 0; i2 < dayByIdx.getInPlanActionCnt(); i2++) {
                    IntAction inPlanAction = dayByIdx.getInPlanAction(i2);
                    if (inPlanAction != null && inPlanAction.getActionId() != null && !inPlanAction.getActionId().equals("") && inPlanAction.getPunchFlag() == 0) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static boolean v(IntPlan intPlan) {
        int iH = btw.h(intPlan);
        for (int i = 0; i < intPlan.getMetaInfo().getWeekCount(); i++) {
            IntWeekPlan weekInfoByIdx = intPlan.getWeekInfoByIdx(i);
            if (weekInfoByIdx.getWeekOrder() == iH) {
                for (int i2 = 0; i2 < weekInfoByIdx.getDayCount(); i2++) {
                    IntDayPlan dayByIdx = weekInfoByIdx.getDayByIdx(i2);
                    if (dayByIdx != null) {
                        for (int i3 = 0; i3 < dayByIdx.getInPlanActionCnt(); i3++) {
                            IntAction inPlanAction = dayByIdx.getInPlanAction(i3);
                            if (inPlanAction != null && inPlanAction.getActionId() != null && !inPlanAction.getActionId().equals("") && inPlanAction.getPunchFlag() == 0) {
                                return false;
                            }
                        }
                    }
                }
            }
        }
        return true;
    }

    public static boolean d(IntPlan intPlan, int i) {
        IntWeekPlan weekInfoByOrder = intPlan.getWeekInfoByOrder(i);
        boolean z = false;
        if (weekInfoByOrder == null) {
            return false;
        }
        for (int i2 = 0; i2 < weekInfoByOrder.getDayCount(); i2++) {
            IntDayPlan dayByIdx = weekInfoByOrder.getDayByIdx(i2);
            if (dayByIdx != null && dayByIdx.getInPlanActionCnt() > 0) {
                z = true;
                break;
            }
        }
        return !z;
    }

    public static boolean s(IntPlan intPlan) {
        int iH = btw.h(intPlan);
        int i = 0;
        for (int i2 = 0; i2 < intPlan.getMetaInfo().getWeekCount(); i2++) {
            IntWeekPlan weekInfoByIdx = intPlan.getWeekInfoByIdx(i2);
            if ((weekInfoByIdx.getWeekOrder() == iH - 2 || weekInfoByIdx.getWeekOrder() == iH - 1) && !hvv.e(weekInfoByIdx, 0.2f)) {
                i++;
            }
        }
        return i == 2;
    }

    public static boolean d(IntDayPlan intDayPlan, boolean z) {
        if (intDayPlan == null) {
            return false;
        }
        if (z && intDayPlan.getPunchFlag() == 1) {
            return true;
        }
        for (int i = 0; i < intDayPlan.getInPlanActionCnt(); i++) {
            IntAction inPlanAction = intDayPlan.getInPlanAction(i);
            if (inPlanAction == null) {
                return false;
            }
            if ((inPlanAction.getActionType() == IntAction.ActionType.RUN || inPlanAction.getActionType() == IntAction.ActionType.WORKOUT) && inPlanAction.getPunchFlag() == 1) {
                return true;
            }
        }
        for (int i2 = 0; i2 < intDayPlan.getOutPlanActionCnt(); i2++) {
            IntAction outPlanAction = intDayPlan.getOutPlanAction(i2);
            if (outPlanAction != null) {
                if ((outPlanAction.getActionType() == IntAction.ActionType.RUN || outPlanAction.getActionType() == IntAction.ActionType.WORKOUT) && outPlanAction.getPunchFlag() == 1) {
                    return true;
                }
            } else {
                LogUtil.e("Suggestion_IntPlanDataUtil", "action is null.");
            }
        }
        return false;
    }

    private static IntDayPlan a(IntPlan intPlan, int i) {
        int iC = c(intPlan);
        if (iC <= 0 || iC <= i) {
            return null;
        }
        int i2 = iC - i;
        int i3 = 0;
        int i4 = 0;
        while (i3 < intPlan.getMetaInfo().getWeekCount()) {
            IntWeekPlan weekInfoByIdx = intPlan.getWeekInfoByIdx(i3);
            int dayCount = weekInfoByIdx.getDayCount() + i4;
            if (dayCount >= i2) {
                return weekInfoByIdx.getDayByIdx((i2 - i4) - 1);
            }
            i3++;
            i4 = dayCount;
        }
        return null;
    }

    public static boolean b(IntPlan intPlan, int i) {
        return e(intPlan, i) > 0;
    }

    private static int e(IntPlan intPlan, int i) {
        if (i < 1) {
            return -1;
        }
        if (i == 1) {
            return c(intPlan, 0);
        }
        return c(intPlan, e(intPlan, i - 1));
    }

    private static int c(IntPlan intPlan, int i) {
        if (i == -1) {
            return -1;
        }
        int i2 = i + 1;
        while (true) {
            IntDayPlan intDayPlanA = a(intPlan, i2);
            if (intDayPlanA == null) {
                return -1;
            }
            if (hvv.d(intDayPlanA, IntAction.ActionType.WORKOUT) || hvv.d(intDayPlanA, IntAction.ActionType.RUN)) {
                if (!d(intDayPlanA, true)) {
                    return i2;
                }
                LogUtil.a("Suggestion_IntPlanDataUtil", "check finish exercise lastDay:", Integer.valueOf(intDayPlanA.getDayOrder()));
                return -1;
            }
            i2++;
        }
    }

    public static int g(IntPlan intPlan) {
        return btw.h(intPlan);
    }

    public static int a(IntPlan intPlan, long j) {
        return btw.e(intPlan, j);
    }

    public static int c(IntPlan intPlan) {
        return (int) (((ift.a(System.currentTimeMillis()) - (intPlan.getPlanTimeInfo().getBeginDate() * 1000)) / 86400000) + 1);
    }

    public static boolean d(IntPlan intPlan) {
        IntWeekPlan weekInfoByIdx;
        if (intPlan == null) {
            return false;
        }
        for (int i = 0; i < intPlan.getMetaInfo().getWeekCount() && (weekInfoByIdx = intPlan.getWeekInfoByIdx(i)) != null; i++) {
            for (int i2 = 0; i2 < weekInfoByIdx.getDayCount(); i2++) {
                if (d(weekInfoByIdx.getDayByIdx(i2), false)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean j(IntPlan intPlan) {
        if (p(intPlan)) {
            return d(intPlan);
        }
        return false;
    }

    public static boolean p(IntPlan intPlan) {
        if (intPlan != null) {
            return (intPlan.getPlanType() == IntPlan.PlanType.FIT_PLAN && intPlan.getMetaInfo() != null && intPlan.getMetaInfo().getDisplayStyle() == 2) || intPlan.getPlanType() == IntPlan.PlanType.AI_FITNESS_PLAN || intPlan.getPlanType() == IntPlan.PlanType.AI_RUN_PLAN;
        }
        LogUtil.j("Suggestion_IntPlanDataUtil", "isIntPlan plan == null");
        return false;
    }

    public static boolean r(IntPlan intPlan) {
        return btw.k(intPlan);
    }

    public static boolean a(IntPlan intPlan) {
        IntWeekPlan weekInfoByOrder = intPlan.getWeekInfoByOrder(g(intPlan));
        if (weekInfoByOrder != null) {
            int iB = ift.b(Calendar.getInstance().get(7));
            for (int dayCount = weekInfoByOrder.getDayCount(); dayCount >= 0; dayCount--) {
                IntDayPlan dayByIdx = weekInfoByOrder.getDayByIdx(dayCount);
                if (dayByIdx != null && dayByIdx.getInPlanActionCnt() > 0) {
                    return dayByIdx.getDayOrder() <= iB;
                }
            }
        }
        return false;
    }

    public static boolean c(String str) {
        return str != null && new SimpleDateFormat("yyyy-MM-dd").format(Long.valueOf(System.currentTimeMillis())).compareToIgnoreCase(str) < 0;
    }

    public static boolean c() {
        String strE = buh.e("sync_cloud_data_status");
        if (TextUtils.isEmpty(strE)) {
            return false;
        }
        long jX = CommonUtil.x(strE);
        if (System.currentTimeMillis() - jX >= 60000) {
            return false;
        }
        LogUtil.a("Suggestion_IntPlanDataUtil", "sync data time mill:", Long.valueOf(jX));
        return true;
    }

    public static String c(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("Suggestion_IntPlanDataUtil", "subUTF8String input is null.");
            return "";
        }
        if (str.getBytes(StandardCharsets.UTF_8).length <= i) {
            return str;
        }
        int length = str.length();
        int i2 = 0;
        int i3 = 0;
        int length2 = 0;
        while (i2 < length) {
            int i4 = i2 + 1;
            length2 += str.substring(i2, i4).getBytes(StandardCharsets.UTF_8).length;
            if (length2 <= i - "...".getBytes(StandardCharsets.UTF_8).length) {
                i3++;
            }
            i2 = i4;
        }
        return str.substring(0, i3).concat("...");
    }

    public static boolean b(IntPlan intPlan, String str) {
        return String.valueOf(g(intPlan)).equals(buh.b(str, intPlan.getPlanId()));
    }

    public static boolean l(IntPlan intPlan) {
        IntDayPlan dayInfo = intPlan.getDayInfo(g(intPlan), ift.b(Calendar.getInstance().get(7)));
        return dayInfo != null && dayInfo.getPunchFlag() == 1;
    }

    public static boolean f(IntPlan intPlan) {
        for (IntAction intAction : hvv.a(intPlan, g(intPlan), ift.b(Calendar.getInstance().get(7)))) {
            if (intAction != null && intAction.getPunchFlag() == 1) {
                return true;
            }
        }
        return false;
    }

    public static SparseArray<IntDayPlan> h(IntPlan intPlan) {
        int iD;
        if (intPlan == null) {
            return new SparseArray<>();
        }
        PlanTimeInfo planTimeInfo = intPlan.getPlanTimeInfo();
        if (planTimeInfo == null) {
            return new SparseArray<>();
        }
        PlanMetaInfo metaInfo = intPlan.getMetaInfo();
        if (metaInfo == null) {
            return new SparseArray<>();
        }
        SparseArray<IntDayPlan> sparseArray = new SparseArray<>();
        long beginDate = planTimeInfo.getBeginDate() * 1000;
        int iD2 = HiDateUtil.d(beginDate);
        int iD3 = HiDateUtil.d(planTimeInfo.getEndDate() * 1000);
        int weekCount = metaInfo.getWeekCount();
        for (int i = 0; i < weekCount; i++) {
            IntWeekPlan weekInfoByIdx = intPlan.getWeekInfoByIdx(i);
            if (weekInfoByIdx != null) {
                int weekOrder = weekInfoByIdx.getWeekOrder();
                int dayCount = weekInfoByIdx.getDayCount();
                for (int i2 = 0; i2 < dayCount; i2++) {
                    IntDayPlan dayByIdx = weekInfoByIdx.getDayByIdx(i2);
                    if (dayByIdx != null && iD2 <= (iD = HiDateUtil.d(ift.b(beginDate, weekOrder, dayByIdx.getDayOrder()))) && iD <= iD3) {
                        sparseArray.append(iD, dayByIdx);
                    }
                }
            }
        }
        return sparseArray;
    }

    public static int a(SparseArray<IntDayPlan> sparseArray, int i) {
        if (sparseArray == null) {
            return 0;
        }
        int size = sparseArray.size();
        int iD = HiDateUtil.d(System.currentTimeMillis());
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            int iKeyAt = sparseArray.keyAt(i3);
            if (iKeyAt >= iD && btw.c(sparseArray.get(iKeyAt)) == i) {
                i2++;
            }
        }
        return i2;
    }

    public static boolean a(long j) {
        int iD;
        long[] jArrS = HiDateUtil.s(System.currentTimeMillis());
        return jArrS.length > 1 && HiDateUtil.d(jArrS[0]) <= (iD = HiDateUtil.d(j)) && iD <= HiDateUtil.d(jArrS[1]);
    }

    public static boolean w(IntPlan intPlan) {
        if (intPlan != null && IntPlan.PlanType.AI_FITNESS_PLAN.equals(intPlan.getPlanType())) {
            if (d(intPlan, btw.h(intPlan))) {
                ReleaseLogUtil.e("Suggestion_IntPlanDataUtil", "this week all rest.");
                return false;
            }
            if (v(intPlan) && a(intPlan)) {
                return true;
            }
        }
        return false;
    }

    public static boolean x(IntPlan intPlan) {
        if (intPlan != null && (IntPlan.PlanType.AI_FITNESS_PLAN.equals(intPlan.getPlanType()) || IntPlan.PlanType.AI_RUN_PLAN.equals(intPlan.getPlanType()))) {
            if (d(intPlan, btw.h(intPlan) - 1) && intPlan.getPlanType().equals(IntPlan.PlanType.AI_FITNESS_PLAN)) {
                ReleaseLogUtil.e("Suggestion_IntPlanDataUtil", "last week all rest.");
                return false;
            }
            if (ift.c(intPlan.getPlanTimeInfo().getBeginDate() * 1000, 0) < ift.c(System.currentTimeMillis(), 0)) {
                return true;
            }
        }
        return false;
    }

    public static boolean a() {
        return qrs.f(buh.e("showReportTime")) < ift.a(System.currentTimeMillis(), 0);
    }

    public static boolean e() {
        return qrs.f(buh.e("showReportTime")) < ift.c(System.currentTimeMillis(), 0);
    }

    public static boolean e(IntPlan intPlan) {
        return w(intPlan) && a();
    }

    public static boolean b(IntPlan intPlan) {
        return x(intPlan) && e();
    }

    public static boolean d() {
        return !Utils.o() && VersionControlUtil.isSupportOperationAccount();
    }
}
