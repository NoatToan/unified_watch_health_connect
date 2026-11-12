package defpackage;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.text.format.DateUtils;
import android.util.SparseArray;
import android.view.View;
import com.google.gson.JsonIOException;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.basefitnessadvice.model.DayDataForDevice;
import com.huawei.basefitnessadvice.model.Plan;
import com.huawei.basefitnessadvice.model.WeekDataForDevice;
import com.huawei.basefitnessadvice.model.intplan.IntAction;
import com.huawei.basefitnessadvice.model.intplan.IntDayPlan;
import com.huawei.basefitnessadvice.model.intplan.IntPlan;
import com.huawei.basefitnessadvice.model.intplan.IntWeekPlan;
import com.huawei.basefitnessadvice.model.intplan.PlanMetaInfo;
import com.huawei.basefitnessadvice.model.intplan.PlanTimeInfo;
import com.huawei.basefitnessadvice.model.intplan.RecordData;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.course.api.CourseApi;
import com.huawei.health.devicemgr.api.constant.GetDeviceInfoMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.h5pro.core.H5ProLaunchOption;
import com.huawei.health.plan.aicoach.ControlTypeEnum;
import com.huawei.health.plan.api.PlanApi;
import com.huawei.health.plan.model.trainingplan.SmartPlanTypeEnum;
import com.huawei.health.servicesapi.R;
import com.huawei.health.sport.model.WorkoutRecord;
import com.huawei.health.weight.WeightApi;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseConstants;
import com.huawei.hwfoundationmodel.trackmodel.MotionPathSimplify;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.openalliance.ad.constant.ParamConstants;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.operation.OperationKey;
import com.huawei.operation.ble.BleConstants;
import com.huawei.operation.utils.WebViewHelp;
import com.huawei.pluginfitnessadvice.FitWorkout;
import com.huawei.pluginfitnessadvice.FitnessPackageInfo;
import com.huawei.pluginfitnessadvice.plandata.CourseDataBean;
import com.huawei.trade.PayApi;
import com.huawei.trade.datatype.FunctionAuthResult;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import health.compact.a.CommonUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.Utils;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import java.util.TreeSet;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class btw {
    static /* synthetic */ void a(View view) {
    }

    public static boolean f() {
        return true;
    }

    public static boolean g() {
        return irz.j();
    }

    public static boolean l(IntPlan intPlan) {
        return intPlan != null && IntPlan.PlanType.AI_FITNESS_PLAN.equals(intPlan.getPlanType()) && a();
    }

    public static boolean a() {
        return g() && Utils.o();
    }

    public static boolean i() {
        return (Utils.k() || LoginInit.getInstance(BaseApplication.getContext()).isCanadaCountry()) ? false : true;
    }

    public static boolean o() {
        if (!Utils.o()) {
            return true;
        }
        if (Utils.k()) {
            return false;
        }
        boolean zB = pjg.b("1");
        LogUtil.a("Suggestion_PlanUtil", "smart train plan is functionEntranceInfoEnable ", Boolean.valueOf(zB));
        boolean zD = d(true);
        LogUtil.a("Suggestion_PlanUtil", "smart train plan is functionAuth ", Boolean.valueOf(zD));
        return zB || zD;
    }

    public static boolean j() {
        return !LoginInit.getInstance(BaseApplication.getContext()).isCanadaCountry();
    }

    public static boolean c() {
        if (Utils.o()) {
            return iuo.d("RECOMMEND_DIET_TIME_MILLIS");
        }
        return true;
    }

    public static boolean h() {
        return !Utils.o();
    }

    public static boolean b() {
        if (Utils.o()) {
            return iuo.d("DIET_ANALYSIS_TIME_MILLIS");
        }
        return true;
    }

    public static int d(Plan plan) {
        if (plan == null) {
            LogUtil.j("Suggestion_PlanUtil", "getTrainingDays plan is null");
            return 0;
        }
        List<pdq> planWeekDataList = plan.getPlanWeekDataList();
        if (njy.e(planWeekDataList)) {
            LogUtil.j("Suggestion_PlanUtil", "getTrainingDays planWeekDataBeanList is empty");
            return 0;
        }
        int iC = 0;
        for (pdq pdqVar : planWeekDataList) {
            if (pdqVar != null) {
                iC += pdqVar.i();
            }
        }
        for (pdq pdqVar2 : planWeekDataList) {
            if (pdqVar2 != null) {
                Iterator<pdt> it = pdqVar2.f().iterator();
                while (it.hasNext()) {
                    iC = c(it.next(), iC);
                }
            }
        }
        if (iC < 0) {
            return 0;
        }
        return iC;
    }

    public static List<ntn> d(Context context, List<ntn> list) {
        if (njy.e(list)) {
            ReleaseLogUtil.b("Suggestion_PlanUtil", "times is empty");
            return new ArrayList();
        }
        List<ntn> listA = a(context);
        if (njy.e(listA)) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (ntn ntnVar : list) {
            if (!listA.contains(ntnVar)) {
                arrayList.add(ntnVar);
            }
        }
        return arrayList;
    }

    public static void b(Context context, List<ntn> list) {
        if (list == null || context == null) {
            ReleaseLogUtil.b("Suggestion_PlanUtil", "context is null, or showTimes is null");
            return;
        }
        List<ntn> listA = a(context);
        listA.addAll(list);
        Iterator<ntn> it = listA.iterator();
        while (it.hasNext()) {
            if (!DateUtils.isToday(it.next().b())) {
                it.remove();
            }
        }
        SharedPreferenceManager.c("ai_fitness_plan_module_id", c(context), HiJsonUtil.d(listA));
    }

    private static List<ntn> a(Context context) {
        ArrayList arrayList;
        String strB = SharedPreferenceManager.b("ai_fitness_plan_module_id", c(context), "");
        if (TextUtils.isEmpty(strB)) {
            return new ArrayList();
        }
        try {
            arrayList = (ArrayList) HiJsonUtil.d(strB, new TypeToken<List<ntn>>() { // from class: com.huawei.basefitnessadvice.utils.PlanUtils$1
            }.getType());
        } catch (JsonIOException | JsonSyntaxException | IllegalStateException | NumberFormatException e) {
            LogUtil.e("Suggestion_PlanUtil", "getCacheData catch all Exception ", LogAnonymous.b(e));
            arrayList = null;
        }
        return arrayList == null ? new ArrayList() : arrayList;
    }

    private static String c(Context context) {
        return LoginInit.getInstance(context).getAccountInfo(1011) + "_ai_fitness_energy_replacement_card_show_time";
    }

    public static int c(pdt pdtVar, int i) {
        if (pdtVar == null) {
            return i;
        }
        for (CourseDataBean courseDataBean : pdtVar.a()) {
            if (courseDataBean != null && "Race".equals(courseDataBean.e())) {
                i--;
            }
        }
        return i;
    }

    public static int c(Plan plan) {
        int i = 0;
        if (plan == null) {
            LogUtil.j("Suggestion_PlanUtil", "getClockTimes plan is null");
            return 0;
        }
        List<pdq> planWeekDataList = plan.getPlanWeekDataList();
        if (njy.e(planWeekDataList)) {
            LogUtil.j("Suggestion_PlanUtil", "getClockTimes planWeekDataBeanList is empty");
            return 0;
        }
        for (pdq pdqVar : planWeekDataList) {
            if (pdqVar != null) {
                for (pdt pdtVar : pdqVar.f()) {
                    if (pdtVar != null && pdtVar.c()) {
                        i++;
                    }
                }
            }
        }
        return i;
    }

    public static pdt b(Plan plan, int i, int i2) {
        List<pdt> listF = c(i2, plan).f();
        pdt pdtVar = new pdt();
        if (njy.e(listF)) {
            LogUtil.j("Suggestion_PlanUtil", "getPlanDayData planDayDataBeanList is empty");
            return pdtVar;
        }
        for (pdt pdtVar2 : listF) {
            if (pdtVar2 != null && pdtVar2.d() == i) {
                return pdtVar2;
            }
        }
        return pdtVar;
    }

    public static int b(Plan plan) {
        return a(plan, System.currentTimeMillis());
    }

    public static int h(IntPlan intPlan) {
        return e(intPlan, System.currentTimeMillis());
    }

    public static int e(IntPlan intPlan, long j) {
        long beginDate;
        long startTime;
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("reportType", "final");
        linkedHashMap.put("timestamp", String.valueOf(j));
        if (intPlan == null) {
            linkedHashMap.put("currentWeekNo", "0");
            OpAnalyticsUtil.getInstance().setEvent2nd(OperationKey.HEALTH_APP_INT_PLAN_WEEK_NO_2129048.value(), linkedHashMap);
            return 0;
        }
        long j2 = Long.MAX_VALUE;
        if (intPlan.getPlanTimeInfo() != null) {
            beginDate = intPlan.getPlanTimeInfo().getBeginDate();
            startTime = Long.MAX_VALUE;
            j2 = beginDate;
        } else if (intPlan.getCompatiblePlan() != null) {
            startTime = intPlan.getCompatiblePlan().getStartTime();
            beginDate = startTime;
        } else {
            beginDate = 0;
            startTime = Long.MAX_VALUE;
        }
        int iA = ift.a(TimeUnit.SECONDS.toMillis(beginDate), null, j, null) + 1;
        if (iA <= 0) {
            linkedHashMap.put("planId", intPlan.getPlanId());
            linkedHashMap.put("timeZone", intPlan.getTimeZone());
            linkedHashMap.put("currentWeekNo", String.valueOf(iA));
            linkedHashMap.put("beginTime", String.valueOf(beginDate));
            linkedHashMap.put("beginTime1", String.valueOf(j2));
            linkedHashMap.put("beginTime2", String.valueOf(startTime));
            ReleaseLogUtil.d("Suggestion_PlanUtil", "getPlanWeekNum:", linkedHashMap);
            OpAnalyticsUtil.getInstance().setEvent2nd(OperationKey.HEALTH_APP_INT_PLAN_WEEK_NO_2129048.value(), linkedHashMap);
        }
        return iA;
    }

    public static int a(Plan plan, long j) {
        if (plan == null) {
            return 0;
        }
        return ift.a(1000 * plan.getStartTime(), b(plan.getTimeZone()), j, null) + 1;
    }

    public static pdq a(Plan plan) {
        return c(b(plan), plan);
    }

    public static pdq c(int i, Plan plan) {
        pdq pdqVar = new pdq();
        if (plan == null) {
            LogUtil.j("Suggestion_PlanUtil", "getPlanWeekData plan is null");
            return pdqVar;
        }
        List<pdq> planWeekDataList = plan.getPlanWeekDataList();
        if (njy.e(planWeekDataList)) {
            LogUtil.j("Suggestion_PlanUtil", "getPlanWeekData planWeekDataBeanList is empty");
            return pdqVar;
        }
        for (pdq pdqVar2 : planWeekDataList) {
            if (pdqVar2 != null && pdqVar2.j() == i) {
                return pdqVar2;
            }
        }
        return pdqVar;
    }

    public static void d(Plan plan, int i, int i2, String str) {
        pdt pdtVarB = b(plan, i2, i);
        List<CourseDataBean> listA = pdtVarB.a();
        if (njy.e(listA)) {
            LogUtil.j("Suggestion_PlanUtil", "setClockTime courseDataBeanList is null");
            return;
        }
        for (CourseDataBean courseDataBean : listA) {
            if (courseDataBean != null && str.equals(courseDataBean.e())) {
                courseDataBean.d(true);
                break;
            }
        }
        b(pdtVarB, listA);
    }

    private static void b(pdt pdtVar, List<CourseDataBean> list) {
        boolean z;
        Iterator<CourseDataBean> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = true;
                break;
            }
            CourseDataBean next = it.next();
            if (next != null && !next.a()) {
                z = false;
                break;
            }
        }
        if (pdtVar.c()) {
            return;
        }
        pdtVar.a(z);
    }

    public static boolean a(Plan plan, int i) {
        List<pdt> listF = c(i, plan).f();
        if (njy.e(listF)) {
            LogUtil.j("Suggestion_PlanUtil", "isAllNoClockIn planDayDataBeanList is empty");
            return false;
        }
        for (pdt pdtVar : listF) {
            if (pdtVar != null && pdtVar.c()) {
                return false;
            }
        }
        return true;
    }

    public static int e(int i, String str, int i2) {
        return (int) TimeUnit.MILLISECONDS.toSeconds(ift.d(TimeUnit.SECONDS.toMillis(i), str, i2));
    }

    public static TimeZone b(String str) {
        return ift.b(str);
    }

    public static int b(String str, long j) {
        return (int) TimeUnit.MILLISECONDS.toSeconds(ift.e(str, TimeUnit.SECONDS.toMillis(j)));
    }

    public static final long b(long j) {
        return ift.f(j);
    }

    public static final long e(Plan plan, int i) {
        if (plan == null) {
            return 0L;
        }
        long millis = TimeUnit.SECONDS.toMillis(plan.getStartTime());
        return TimeUnit.MILLISECONDS.toSeconds(Math.max(millis, ift.a(millis, ift.b(plan.getTimeZone()), i - 1)));
    }

    public static final long e(IntPlan intPlan, int i) {
        if (intPlan == null) {
            return 0L;
        }
        long millis = TimeUnit.SECONDS.toMillis(intPlan.getPlanTimeInfo().getBeginDate());
        return TimeUnit.MILLISECONDS.toSeconds(Math.max(millis, ift.c(millis, i - 1)));
    }

    public static final long c(Plan plan, int i, int i2) {
        return ift.a(TimeUnit.SECONDS.toMillis(ieg.c(plan.acquireStartDate(), "yyyy-MM-dd")), i - 1, i2);
    }

    public static final String c(Context context, Plan plan) {
        if (context == null || plan == null) {
            return "";
        }
        return DateUtils.formatDateTime(context, TimeUnit.SECONDS.toMillis(ieg.c(plan.acquireStartDate(), "yyyy-MM-dd")), 24);
    }

    public static final long e(IntPlan intPlan, int i, int i2) {
        return ift.a(TimeUnit.SECONDS.toMillis(intPlan.getPlanTimeInfo().getBeginDate()), i - 1, i2);
    }

    public static final long d(Plan plan, int i) {
        if (plan == null) {
            return 0L;
        }
        return TimeUnit.MILLISECONDS.toSeconds(Math.min(TimeUnit.SECONDS.toMillis(plan.getEndTime()), ift.c(TimeUnit.SECONDS.toMillis(plan.getStartTime()), ift.b(plan.getTimeZone()), i - 1)));
    }

    public static final long d(IntPlan intPlan, int i) {
        long jC;
        if (intPlan == null || intPlan.getPlanTimeInfo() == null) {
            return 0L;
        }
        long millis = TimeUnit.SECONDS.toMillis(intPlan.getPlanTimeInfo().getBeginDate());
        long millis2 = TimeUnit.SECONDS.toMillis(intPlan.getPlanTimeInfo().getEndDate());
        if (IntPlan.PlanType.AI_RUN_PLAN.equals(intPlan.getPlanType())) {
            jC = ift.a(millis, i - 1);
        } else {
            jC = ift.c(millis, ift.b(intPlan.getTimeZone()), i - 1);
        }
        return TimeUnit.MILLISECONDS.toSeconds(Math.min(millis2, jC));
    }

    public static boolean e(Plan plan) {
        if (plan == null) {
            LogUtil.j("Suggestion_PlanUtil", "planNeedUpdate plan is null.");
            return true;
        }
        return e(b(plan), plan.acquireId());
    }

    public static boolean n(IntPlan intPlan) {
        if (intPlan == null) {
            LogUtil.j("Suggestion_PlanUtil", "planNeedUpdate intPlan is null.");
            return true;
        }
        if (intPlan.getSmartPlanType() != SmartPlanTypeEnum.SMART_NA_PLAN.getValue()) {
            LogUtil.a("Suggestion_PlanUtil", "smart train plan does not need to be updated");
            return false;
        }
        return e(h(intPlan), intPlan.getPlanId());
    }

    public static boolean e(int i, String str) {
        int iE = CommonUtil.e(buh.b("plan_update_week", str), 1);
        if (i > iE) {
            ReleaseLogUtil.d("Suggestion_PlanUtil", "plan need update, currentWeek is:", Integer.valueOf(i), " updatedWeek is:", Integer.valueOf(iE));
        }
        return i > iE;
    }

    public static TreeSet<String> a(int i, IntPlan intPlan) {
        if (intPlan == null) {
            LogUtil.j("Suggestion_PlanUtil", "getPlanWeekCourseIdSet failed plan is null.");
            return new TreeSet<>();
        }
        return e(intPlan.getWeekInfoByOrder(i));
    }

    public static TreeSet<String> e(IntWeekPlan intWeekPlan) {
        TreeSet<String> treeSet = new TreeSet<>();
        if (intWeekPlan == null) {
            LogUtil.j("Suggestion_PlanUtil", "getPlanWeekCourseIdSet failed planWeekDataBean is null.");
            return treeSet;
        }
        for (int i = 0; i < intWeekPlan.getDayCount(); i++) {
            IntDayPlan dayByIdx = intWeekPlan.getDayByIdx(i);
            if (dayByIdx != null) {
                for (int i2 = 0; i2 < dayByIdx.getInPlanActionCnt(); i2++) {
                    IntAction inPlanAction = dayByIdx.getInPlanAction(i2);
                    if (inPlanAction != null && !"Race".equals(inPlanAction.getActionId()) && inPlanAction.isCanQueryForCloud()) {
                        treeSet.add(inPlanAction.getActionId());
                    }
                }
            }
        }
        LogUtil.j("Suggestion_PlanUtil", "getFitWorkoutList currentWeek is ", Integer.valueOf(intWeekPlan.getWeekOrder()), " treeSet size is ", Integer.valueOf(treeSet.size()));
        return treeSet;
    }

    public static List<FitWorkout> c(IntWeekPlan intWeekPlan) {
        ArrayList arrayList = new ArrayList();
        if (intWeekPlan == null) {
            LogUtil.j("Suggestion_PlanUtil", "getCustomFitWorkout failed planWeekDataBean is null.");
            return arrayList;
        }
        for (int i = 0; i < intWeekPlan.getDayCount(); i++) {
            IntDayPlan dayByIdx = intWeekPlan.getDayByIdx(i);
            if (dayByIdx != null) {
                for (int i2 = 0; i2 < dayByIdx.getInPlanActionCnt(); i2++) {
                    IntAction inPlanAction = dayByIdx.getInPlanAction(i2);
                    if (inPlanAction != null && inPlanAction.getCustomFitWorkout() != null) {
                        arrayList.add(inPlanAction.getCustomFitWorkout());
                    }
                }
            }
        }
        LogUtil.j("Suggestion_PlanUtil", "getCustomFitWorkout currentWeek is ", Integer.valueOf(intWeekPlan.getWeekOrder()), " fitWorkoutList size is ", Integer.valueOf(arrayList.size()));
        return arrayList;
    }

    public static boolean d(qey qeyVar) {
        return i() && qeyVar != null && qeyVar.e() == 1 && qeyVar.k() == 0;
    }

    public static boolean e(qey qeyVar) {
        return f() && qeyVar != null && qeyVar.e() == 0 && qeyVar.k() == 0 && qeyVar.o() != 1;
    }

    public static boolean r(IntPlan intPlan) {
        if (intPlan == null || intPlan.getMetaInfo() == null) {
            return false;
        }
        return IntPlan.PlanType.AI_RUN_PLAN.equals(intPlan.getPlanType()) || IntPlan.PlanType.RUN_PLAN.equals(intPlan.getPlanType()) || (IntPlan.PlanType.FIT_PLAN.equals(intPlan.getPlanType()) && intPlan.getMetaInfo().getPlanCategory() == 1);
    }

    public static boolean e(FitnessPackageInfo fitnessPackageInfo) {
        if (fitnessPackageInfo == null) {
            return false;
        }
        return IntPlan.PlanType.AI_RUN_PLAN.getType() == fitnessPackageInfo.getPlanType() || IntPlan.PlanType.RUN_PLAN.getType() == fitnessPackageInfo.getPlanType() || (fitnessPackageInfo.getPlanType() == IntPlan.PlanType.FIT_PLAN.getType() && fitnessPackageInfo.acquirePlanCategory() == 1);
    }

    public static boolean j(IntPlan intPlan) {
        if (intPlan == null || intPlan.getMetaInfo() == null || !IntPlan.PlanType.FIT_PLAN.equals(intPlan.getPlanType())) {
            return false;
        }
        return intPlan.getMetaInfo().getPlanCategory() == 0 || intPlan.getMetaInfo().getPlanCategory() == 2;
    }

    public static boolean d(FitnessPackageInfo fitnessPackageInfo) {
        return fitnessPackageInfo != null && IntPlan.PlanType.FIT_PLAN.getType() == fitnessPackageInfo.getPlanType() && (fitnessPackageInfo.acquirePlanCategory() == 0 || fitnessPackageInfo.acquirePlanCategory() == 2);
    }

    public static void e(IntPlan intPlan, String str, int... iArr) {
        if (intPlan == null || intPlan.getMetaInfo() == null) {
            return;
        }
        HashMap map = new HashMap(6);
        map.put("click", "1");
        map.put("planName", intPlan.getMetaInfo().getName());
        map.put("planId", intPlan.getPlanId());
        if (r(intPlan)) {
            map.put("planType", 0);
        } else {
            map.put("planType", 1);
        }
        if (intPlan.getStat("progress") != null) {
            map.put("finishRate", intPlan.getStat("progress").getValue());
        } else {
            map.put("finishRate", 0);
        }
        map.put("enter", str);
        map.putAll(k());
        idy.b("1120024", map);
        if (iArr != null && iArr.length >= 3) {
            a(iArr[0], iArr[1], o(intPlan) ? 2 : 1, iArr[2]);
        } else {
            hbz.c().e();
        }
    }

    public static boolean o(IntPlan intPlan) {
        if (intPlan.getPlanTimeInfo() == null) {
            LogUtil.j("Suggestion_PlanUtil", "isPlanOverdue getPlanTimeInfo() == null.");
            return false;
        }
        int iJ = ift.j(intPlan.getPlanTimeInfo().getEndDate() * 1000);
        int iJ2 = ift.j(ift.a(System.currentTimeMillis()));
        LogUtil.a("Suggestion_PlanUtil", "isPlanOverdue currentDay:", Integer.valueOf(iJ2), " endDay", Integer.valueOf(iJ));
        return iJ2 > iJ;
    }

    public static boolean k(IntPlan intPlan) {
        if (intPlan == null) {
            return false;
        }
        if (intPlan.getWeekInfoByIdx(0) == null) {
            return true;
        }
        return (intPlan.getTransactionStatus() == 0 || intPlan.getTransactionStatus() == 1) ? false : true;
    }

    public static void a(final int i, final int i2, final int i3, final int i4) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: buf
            @Override // java.lang.Runnable
            public final void run() {
                btw.e(i, i2, i3, i4);
            }
        });
    }

    static /* synthetic */ void e(int i, int i2, int i3, int i4) {
        HashMap map = new HashMap();
        map.put("click", 1);
        if (i == 0) {
            map.put("type", "");
        } else {
            map.put("type", Integer.valueOf(i));
        }
        map.put(com.huawei.health.messagecenter.model.CommonUtil.PAGE_TYPE, Integer.valueOf(i2));
        map.put("enableStatus", Integer.valueOf(i3));
        map.put(ParamConstants.Param.VIEW_TYPE, Integer.valueOf(i4));
        map.putAll(k());
        hbz.c().e();
        idy.b(AnalyticsValue.INT_PLAN_2030074.value(), map);
    }

    private static Map<String, Object> k() {
        HashMap map = new HashMap();
        if (!TextUtils.isEmpty(hbz.c().a())) {
            map.put(WebViewHelp.BI_KEY_PULL_FROM, hbz.c().a());
        }
        if (!TextUtils.isEmpty(hbz.c().b())) {
            map.put("resourceId", hbz.c().b());
        }
        if (!TextUtils.isEmpty(hbz.c().d())) {
            map.put("pullOrder", hbz.c().d());
        }
        if (!TextUtils.isEmpty(hbz.c().j())) {
            map.put("resourceName", hbz.c().j());
        }
        return map;
    }

    public static int[] e(WorkoutRecord workoutRecord, IntPlan intPlan) {
        Calendar calendar = Calendar.getInstance();
        int[] iArr = new int[2];
        if (workoutRecord != null) {
            int planTrainDate = workoutRecord.getPlanTrainDate();
            ReleaseLogUtil.c("Suggestion_PlanUtil", "getClockParams trainPlanDate:", Integer.valueOf(planTrainDate));
            if (planTrainDate != 0) {
                long jE = ieg.e(planTrainDate);
                calendar.setTimeInMillis(jE);
                int iB = ift.b(calendar.get(7));
                int iE = e(intPlan, jE);
                if (iE < 1) {
                    ReleaseLogUtil.b("Suggestion_PlanUtil", "weekNo:", Integer.valueOf(iE), " coursePlanTime:", Long.valueOf(jE));
                    if ((intPlan.getPlanType().equals(IntPlan.PlanType.AI_RUN_PLAN) || intPlan.getPlanType().equals(IntPlan.PlanType.AI_FITNESS_PLAN)) && !workoutRecord.isFitnessRecordFromDevice()) {
                        iE = h(intPlan);
                        ReleaseLogUtil.c("Suggestion_PlanUtil", "new week num:", Integer.valueOf(iE));
                    }
                }
                iArr[0] = iE;
                iArr[1] = iB;
                return iArr;
            }
        }
        return iArr;
    }

    public static void t(IntPlan intPlan) {
        if (intPlan == null) {
            ReleaseLogUtil.d("Suggestion_PlanUtil", "int plan is null.");
            return;
        }
        StringBuilder sb = new StringBuilder("compatiblePlan exist:");
        sb.append(intPlan.getCompatiblePlan() != null);
        sb.append(" timeZone:");
        sb.append(intPlan.getTimeZone());
        sb.append(" transactionStatus:");
        sb.append(intPlan.getTransactionStatus());
        if (intPlan.getPlanTimeInfo() != null) {
            PlanTimeInfo planTimeInfo = intPlan.getPlanTimeInfo();
            sb.append(" createTime:");
            sb.append(planTimeInfo.getCreateTime());
            sb.append(" finishTime:");
            sb.append(planTimeInfo.getFinishTime());
            sb.append(" remindTime:");
            sb.append(planTimeInfo.getRemindTime());
            sb.append(" beginDate:");
            sb.append(planTimeInfo.getBeginDate());
            sb.append(" endDate:");
            sb.append(planTimeInfo.getEndDate());
            sb.append(" reportTime:");
            sb.append(planTimeInfo.getReportTime());
            sb.append(" modifyTime:");
            sb.append(planTimeInfo.getModifyTime());
        } else {
            sb.append(" int plan time info is null.");
        }
        if (intPlan.getMetaInfo() != null) {
            PlanMetaInfo metaInfo = intPlan.getMetaInfo();
            sb.append(" planType:");
            sb.append(metaInfo.getPlanType().getType());
            sb.append(" planId:");
            sb.append(metaInfo.getPlanId());
            sb.append(" name:");
            sb.append(metaInfo.getName());
            sb.append(" planTempId:");
            sb.append(metaInfo.getPlanTempId());
            sb.append(" planCategory:");
            sb.append(metaInfo.getPlanCategory());
            sb.append(" displayStyle");
            sb.append(metaInfo.getDisplayStyle());
            sb.append(" exeDayNum:");
            sb.append(metaInfo.getExeDayNum());
            sb.append(" exeDays:");
            sb.append(metaInfo.getExeDayNum());
            sb.append(" weekCount:");
            sb.append(metaInfo.getWeekCount());
            sb.append(" dayCount:");
            sb.append(metaInfo.getDayCount());
            for (int i = 0; i < intPlan.getMetaInfo().getWeekCount(); i++) {
                IntWeekPlan weekInfoByIdx = intPlan.getWeekInfoByIdx(i);
                if (weekInfoByIdx == null) {
                    sb.append(" week info null:");
                    sb.append(i);
                } else {
                    sb.append(" week info order:");
                    sb.append(weekInfoByIdx.getWeekOrder());
                    sb.append(" index:");
                    sb.append(i);
                    sb.append(b(weekInfoByIdx));
                }
            }
        } else {
            sb.append("int plan meta info is null.");
        }
        ReleaseLogUtil.c("Suggestion_PlanUtil", sb.toString());
    }

    public static void a(qey qeyVar) {
        if (qeyVar == null) {
            return;
        }
        StringBuilder sb = new StringBuilder("p***d:");
        sb.append(qeyVar.h());
        sb.append(" c***y:");
        sb.append(qeyVar.e());
        sb.append(" s***y:");
        sb.append(qeyVar.k());
        sb.append(" t**e:");
        sb.append(qeyVar.o());
        sb.append(" t***e:");
        sb.append(qeyVar.m());
        sb.append(" c***e:");
        sb.append(qeyVar.c());
        sb.append(" s***y:");
        sb.append(qeyVar.i());
        sb.append(" e***y:");
        sb.append(qeyVar.b());
        if (njy.e(qeyVar.n())) {
            ReleaseLogUtil.c("Suggestion_PlanUtil", sb.toString());
            return;
        }
        for (qfy qfyVar : qeyVar.n()) {
            if (!njy.e(qfyVar.n())) {
                for (qfk qfkVar : qfyVar.n()) {
                    sb.append(" d***y:");
                    sb.append(qfkVar.s());
                    List<qfg> listN = qfkVar.n();
                    if (njy.b(listN)) {
                        pce pceVar = (pce) HiJsonUtil.d(listN.get(0).d(), pce.class);
                        pce.d dVarD = pceVar != null ? pceVar.d() : null;
                        sb.append(",i***d:");
                        sb.append(dVarD != null ? dVarD.g() : "");
                    }
                    List<qfl> listY = qfkVar.y();
                    if (njy.b(listY)) {
                        sb.append(",s***e:");
                        sb.append(listY.get(0).d());
                    }
                }
            }
        }
        ReleaseLogUtil.c("Suggestion_PlanUtil", sb.toString());
    }

    private static String b(IntWeekPlan intWeekPlan) {
        StringBuilder sb = new StringBuilder();
        int inPlanActionCnt = 0;
        for (int i = 0; i < intWeekPlan.getDayCount(); i++) {
            IntDayPlan dayByIdx = intWeekPlan.getDayByIdx(i);
            if (dayByIdx != null) {
                for (int i2 = 0; i2 < dayByIdx.getInPlanActionCnt(); i2++) {
                    IntAction inPlanAction = dayByIdx.getInPlanAction(i2);
                    if (inPlanAction != null && (IntAction.ActionType.RUN.equals(inPlanAction.getActionType()) || IntAction.ActionType.WORKOUT.equals(inPlanAction.getActionType()))) {
                        sb.append(" id:");
                        sb.append(inPlanAction.getActionId());
                        sb.append(" flag:");
                        sb.append(inPlanAction.getPunchFlag());
                        sb.append(" order:");
                        sb.append(dayByIdx.getDayOrder());
                        sb.append(" time:");
                        sb.append(inPlanAction.getPunchTime());
                    }
                }
                inPlanActionCnt = inPlanActionCnt + dayByIdx.getInPlanActionCnt() + dayByIdx.getOutPlanActionCnt();
            }
        }
        sb.append(" course num:");
        sb.append(inPlanActionCnt);
        return sb.toString();
    }

    public static boolean e() {
        PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
        if (planApi == null) {
            LogUtil.e("Suggestion_PlanUtil", "planApi == null.");
            return false;
        }
        IntPlan currentIntPlan = planApi.getCurrentIntPlan();
        if (currentIntPlan == null) {
            return false;
        }
        if (!currentIntPlan.getPlanType().equals(IntPlan.PlanType.AI_FITNESS_PLAN) || o(currentIntPlan)) {
            return l();
        }
        return true;
    }

    private static boolean l() {
        WeightApi weightApi = (WeightApi) Services.d("Main", WeightApi.class);
        if (weightApi == null) {
            LogUtil.e("Suggestion_PlanUtil", "setTodayFastLiteTip weightApi == null.");
            return false;
        }
        String fastingLiteSetting = weightApi.getFastingLiteSetting();
        if (TextUtils.isEmpty(fastingLiteSetting)) {
            return false;
        }
        return e(fastingLiteSetting);
    }

    private static boolean e(String str) {
        try {
            JsonObject asJsonObject = JsonParser.parseString(str).getAsJsonObject();
            if (asJsonObject.get("isAppEnabled") == null) {
                LogUtil.e("Suggestion_PlanUtil", "json object not contain isAppEnabled.");
                return false;
            }
            boolean asBoolean = asJsonObject.get("isAppEnabled").getAsBoolean();
            LogUtil.a("Suggestion_PlanUtil", "FastingLiteSetting:", asJsonObject.toString(), " isAppEnabled:", Boolean.valueOf(asBoolean));
            if (asBoolean) {
                return e(asJsonObject);
            }
            return false;
        } catch (Exception e) {
            LogUtil.e("Suggestion_PlanUtil", "can not parse.", LogAnonymous.b(e));
            return false;
        }
    }

    private static boolean e(JsonObject jsonObject) {
        int asInt;
        JsonObject asJsonObject = jsonObject.getAsJsonObject("currentFastingLiteMode");
        return (asJsonObject == null || asJsonObject.get("id") == null || (asInt = asJsonObject.get("id").getAsInt()) == 0 || asInt == 1) ? false : true;
    }

    public static pdr e(MotionPathSimplify motionPathSimplify) {
        String strOptString;
        pdr pdrVar = new pdr();
        if (motionPathSimplify == null) {
            return pdrVar;
        }
        pdrVar.e(motionPathSimplify.requestStartTime() + "_" + motionPathSimplify.requestEndTime());
        pdrVar.a(String.valueOf(motionPathSimplify.requestTotalDistance()));
        pdrVar.e(motionPathSimplify.requestTotalTime() / 1000);
        pdrVar.c(motionPathSimplify.requestEndTime());
        if (TextUtils.isEmpty(motionPathSimplify.requestRunCourseId())) {
            pdrVar.c(motionPathSimplify.requestStartTime() + "_" + motionPathSimplify.requestEndTime());
        } else {
            pdrVar.c(motionPathSimplify.requestRunCourseId());
        }
        pdrVar.c(motionPathSimplify.requestSportType());
        pdrVar.b(motionPathSimplify.requestTotalCalories());
        pdrVar.a(motionPathSimplify.requestTotalDistance());
        pdrVar.d(motionPathSimplify.getExtendDataInt(HwExerciseConstants.JSON_NAME_TRAINING_POINTS, 0));
        float extendDataFloat = motionPathSimplify.getExtendDataFloat("completionRate", 0.0f);
        pdrVar.c(extendDataFloat >= 0.0f ? extendDataFloat : 0.0f);
        String extendDataString = motionPathSimplify.getExtendDataString("planInfo", "");
        String extendDataString2 = motionPathSimplify.getExtendDataString(HwExerciseConstants.JSON_NAME_PLAN_ID, "");
        if ("".equals(extendDataString)) {
            strOptString = "";
        } else {
            try {
                strOptString = new JSONObject(extendDataString).optString("planId");
            } catch (JSONException unused) {
                LogUtil.e("Suggestion_PlanUtil", "toJson error");
                strOptString = "";
            }
        }
        if ("".equals(extendDataString2)) {
            extendDataString2 = strOptString;
        }
        if (TextUtils.isEmpty(extendDataString2)) {
            pdrVar.e(0);
        } else {
            pdrVar.e(1);
        }
        pdrVar.d(iun.c());
        d(motionPathSimplify, pdrVar, extendDataString2);
        return pdrVar;
    }

    private static void d(MotionPathSimplify motionPathSimplify, pdr pdrVar, String str) {
        long jE = ieg.e(motionPathSimplify.getExtendDataInt(HwExerciseConstants.JSON_NAME_PLAN_COURSE_TIME));
        if (!TextUtils.isEmpty(str) && jE != 0) {
            pdrVar.a(jE);
        } else {
            pdrVar.a(motionPathSimplify.requestStartTime());
        }
    }

    public static pdr b(WorkoutRecord workoutRecord) {
        pdr pdrVar = new pdr();
        if (workoutRecord == null) {
            return pdrVar;
        }
        pdrVar.e(workoutRecord.getDuration() / 1000);
        pdrVar.a(workoutRecord.startTime());
        pdrVar.c(workoutRecord.acquireExerciseTime());
        pdrVar.c(workoutRecord.acquireWorkoutId());
        if (workoutRecord.isRunWorkout()) {
            pdrVar.e(workoutRecord.acquireTrajectoryId());
        } else {
            pdrVar.e(String.valueOf(workoutRecord.acquireExerciseTime()));
        }
        pdrVar.c(10001);
        if (TextUtils.isEmpty(workoutRecord.acquirePlanId())) {
            pdrVar.e(0);
        } else {
            pdrVar.e(1);
        }
        pdrVar.b(workoutRecord.acquireActualCalorie());
        pdrVar.a(ped.g(workoutRecord.acquireActualDistance()));
        pdrVar.d(workoutRecord.getTrainPoint());
        pdrVar.c(workoutRecord.acquireFinishRate());
        pdrVar.d(iun.c());
        HashMap map = new HashMap();
        map.put("name", workoutRecord.acquireWorkoutName());
        pdrVar.a(peh.c(map));
        return pdrVar;
    }

    public static void a(IntPlan intPlan, int i, int i2, IBaseResponseCallback iBaseResponseCallback) {
        if (iBaseResponseCallback == null) {
            return;
        }
        if (intPlan == null) {
            ReleaseLogUtil.d("Suggestion_PlanUtil", "getRecordDataList plan is null");
            iBaseResponseCallback.a(-1, Collections.EMPTY_LIST);
        } else if (!IntPlan.PlanType.AI_FITNESS_PLAN.equals(intPlan.getPlanType())) {
            iBaseResponseCallback.a(0, c(intPlan, i, i2));
        } else {
            Map<String, Long> mapB = b(intPlan, i, i2);
            a(mapB.get("START_TIME").longValue(), mapB.get("END_TIME").longValue(), iBaseResponseCallback);
        }
    }

    public static void a(final long j, final long j2, final IBaseResponseCallback iBaseResponseCallback) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: buc
            @Override // java.lang.Runnable
            public final void run() {
                btw.b(j, j2, iBaseResponseCallback);
            }
        });
    }

    static /* synthetic */ void b(long j, long j2, IBaseResponseCallback iBaseResponseCallback) {
        ArrayList arrayList = new ArrayList();
        List<RecordData> listD = d(j, j2);
        if (njy.b(listD)) {
            arrayList.addAll(listD);
            ReleaseLogUtil.c("Suggestion_PlanUtil", "getRecordListByTime workoutList.size", Integer.valueOf(listD.size()));
        }
        HiHealthNativeApi.a(btx.c()).fetchSequenceDataBySportType(e(j, j2), new c(arrayList, iBaseResponseCallback) { // from class: btw.2
        });
    }

    private static HiDataReadOption e(long j, long j2) {
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        ReleaseLogUtil.c("Suggestion_PlanUtil", "getHiDataReadOption weekOrder:", Long.valueOf(j), "dayOrder:", Long.valueOf(j2));
        hiDataReadOption.setTimeInterval(j, j2);
        hiDataReadOption.setSortOrder(1);
        return hiDataReadOption;
    }

    private static Map<String, Long> b(IntPlan intPlan, int i, int i2) {
        long jMax;
        long jD;
        HashMap map = new HashMap(2);
        long millis = TimeUnit.SECONDS.toMillis(intPlan.getPlanTimeInfo().getCreateTime());
        if (i2 != 0) {
            jMax = Math.max(e(intPlan, i, i2), millis);
            jD = ift.d(jMax);
        } else {
            long jMax2 = Math.max(e(intPlan, i) * 1000, millis);
            long jD2 = d(intPlan, i) * 1000;
            jMax = jMax2;
            jD = jD2;
        }
        ReleaseLogUtil.c("Suggestion_PlanUtil", "getRecordDataList startTime:", Long.valueOf(jMax), "endTime:", Long.valueOf(jD), "createTime:", Long.valueOf(millis));
        map.put("START_TIME", Long.valueOf(jMax));
        map.put("END_TIME", Long.valueOf(jD));
        return map;
    }

    public static List<RecordData> d(long j, long j2) {
        CourseApi courseApi = (CourseApi) Services.b("CoursePlanService", CourseApi.class);
        List<WorkoutRecord> workoutRecords = courseApi.getWorkoutRecords(j, j2);
        if (njy.e(workoutRecords)) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(workoutRecords.size());
        Iterator<WorkoutRecord> it = workoutRecords.iterator();
        while (it.hasNext()) {
            arrayList.add(courseApi.coverRecordData(b(it.next())));
        }
        return arrayList;
    }

    /* JADX INFO: loaded from: classes4.dex */
    static class c implements HiDataReadResultListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<RecordData> f1150a;
        private final IBaseResponseCallback e;

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResultIntent(int i, Object obj, int i2, int i3) {
        }

        public c(List<RecordData> list, IBaseResponseCallback iBaseResponseCallback) {
            this.e = iBaseResponseCallback;
            this.f1150a = list;
        }

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResult(Object obj, int i, int i2) {
            if (this.e == null || this.f1150a == null) {
                ReleaseLogUtil.d("Suggestion_PlanUtil", "getRecordDataList mCallback == null");
                return;
            }
            List<HiHealthData> listC = btw.c(obj, i);
            if (!njy.e(listC)) {
                List listC2 = btw.c(listC);
                if (njy.b(listC2)) {
                    ReleaseLogUtil.c("Suggestion_PlanUtil", "MyHiDataReadResultListener tempList.size", Integer.valueOf(listC2.size()));
                    this.f1150a.addAll(listC2);
                }
                this.e.a(0, this.f1150a);
                return;
            }
            LogUtil.a("Suggestion_PlanUtil", "MyHiDataReadResultListener isEmpty");
            this.e.a(0, this.f1150a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static List<RecordData> c(List<HiHealthData> list) {
        if (njy.e(list)) {
            LogUtil.j("Suggestion_PlanUtil", "handleTrackData data ");
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<HiHealthData> it = list.iterator();
        while (it.hasNext()) {
            MotionPathSimplify motionPathSimplifyD = ntv.d(it.next());
            if (motionPathSimplifyD == null) {
                ReleaseLogUtil.d("Suggestion_PlanUtil", "motionPathSimplify is null.");
            } else if (motionPathSimplifyD.requestSportDataSource() == 2) {
                ReleaseLogUtil.d("Suggestion_PlanUtil", "motionPathSimplify is user input.");
            } else if (motionPathSimplifyD.requestAbnormalTrack() != 0) {
                ReleaseLogUtil.d("Suggestion_PlanUtil", "motionPathSimplify is abnormal.");
            } else if (motionPathSimplifyD.requestDuplicated() != 0) {
                ReleaseLogUtil.d("Suggestion_PlanUtil", "motionPathSimplify is requestDuplicated.");
            } else if (TextUtils.isEmpty(motionPathSimplifyD.requestRunCourseId())) {
                RecordData recordDataCoverRecordData = ((CourseApi) Services.b("CoursePlanService", CourseApi.class)).coverRecordData(e(motionPathSimplifyD));
                if (recordDataCoverRecordData != null) {
                    arrayList.add(recordDataCoverRecordData);
                }
            }
        }
        return arrayList;
    }

    public static List<HiHealthData> c(Object obj, int i) {
        if (!(obj instanceof SparseArray)) {
            LogUtil.j("Suggestion_PlanUtil", "data error.");
            return Collections.EMPTY_LIST;
        }
        SparseArray sparseArray = (SparseArray) obj;
        if (!njy.b(sparseArray.get(i), HiHealthData.class)) {
            LogUtil.j("Suggestion_PlanUtil", "getTrackData onResult obj not instanceof List");
            return Collections.EMPTY_LIST;
        }
        List<HiHealthData> list = (List) sparseArray.get(i);
        if (!list.isEmpty() && list.get(0) != null) {
            return list;
        }
        LogUtil.j("Suggestion_PlanUtil", "getTrackData size 0");
        return Collections.EMPTY_LIST;
    }

    private static List<RecordData> c(IntPlan intPlan, int i, int i2) {
        IntDayPlan dayByOrder;
        if (intPlan == null) {
            ReleaseLogUtil.d("Suggestion_PlanUtil", "getRecordDataList plan is null");
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        IntWeekPlan weekInfoByOrder = intPlan.getWeekInfoByOrder(i);
        if (weekInfoByOrder != null && (dayByOrder = weekInfoByOrder.getDayByOrder(i2)) != null) {
            for (int i3 = 0; i3 < dayByOrder.getRecordDataCnt(); i3++) {
                RecordData recordData = dayByOrder.getRecordData(i3);
                if (recordData != null) {
                    arrayList.add(recordData);
                }
            }
        }
        return arrayList;
    }

    public static int c(IntDayPlan intDayPlan) {
        if (intDayPlan == null) {
            return -1;
        }
        int dayStatus = intDayPlan.getDayStatus();
        if (dayStatus <= 0) {
            return intDayPlan.getInPlanActionCnt() > 0 ? 0 : 1;
        }
        return dayStatus;
    }

    public static Map<String, Integer> i(IntPlan intPlan) {
        int iIntValue;
        HashMap map = new HashMap(2);
        int i = 0;
        if (intPlan != null) {
            iIntValue = 0;
            int iIntValue2 = 0;
            for (int i2 = 0; i2 < intPlan.getMetaInfo().getWeekCount(); i2++) {
                Map<String, Integer> mapB = b(intPlan, intPlan.getWeekInfoByIdx(i2).getWeekOrder());
                Integer num = mapB.get("totalDuration");
                Integer num2 = mapB.get(BleConstants.TOTAL_CALORIES);
                iIntValue2 += num == null ? 0 : num.intValue();
                iIntValue += num2 == null ? 0 : num2.intValue();
            }
            i = iIntValue2;
        } else {
            iIntValue = 0;
        }
        map.put("totalDuration", Integer.valueOf(i));
        map.put(BleConstants.TOTAL_CALORIES, Integer.valueOf(iIntValue));
        return map;
    }

    public static Map<String, Integer> b(IntPlan intPlan, int i) {
        IntWeekPlan weekInfoByOrder = intPlan.getWeekInfoByOrder(i);
        HashMap map = new HashMap(2);
        if (weekInfoByOrder == null) {
            map.put("totalDuration", 0);
            map.put(BleConstants.TOTAL_CALORIES, 0);
            return map;
        }
        List<RecordData> listD = d(intPlan, i, 0);
        float actualCalorie = 0.0f;
        long duration = 0;
        if (njy.b(listD)) {
            for (RecordData recordData : b(listD)) {
                LogUtil.a("Suggestion_PlanUtil", "recordData:", recordData.getRecordId(), " ", Integer.valueOf(recordData.getSportType()), " ", Float.valueOf(recordData.getActualCalorie()), " ", Long.valueOf(recordData.getDuration()));
                duration += recordData.getDuration();
                actualCalorie += recordData.getActualCalorie();
            }
        }
        d dVarA = a(intPlan.getPlanId(), e(intPlan, i) * 1000, d(intPlan, i) * 1000);
        float f = dVarA.e;
        map.put("totalDuration", Integer.valueOf(((int) (duration + ((long) dVarA.f1151c))) / 60));
        map.put(BleConstants.TOTAL_CALORIES, Integer.valueOf((int) ped.b(actualCalorie + f)));
        return map;
    }

    public static boolean a(IntPlan intPlan, int i, int i2) {
        ReleaseLogUtil.c("Suggestion_PlanUtil", "isPlanLastDay weekOrDer:", Integer.valueOf(i), "dayOrder:", Integer.valueOf(i2));
        if (intPlan == null) {
            LogUtil.j("Suggestion_PlanUtil", "isPlanLastDay planMetaInfo == null");
            return false;
        }
        PlanMetaInfo metaInfo = intPlan.getMetaInfo();
        if (metaInfo == null) {
            LogUtil.j("Suggestion_PlanUtil", "isPlanLastDay planMetaInfo == null");
            return false;
        }
        int weekCount = metaInfo.getWeekCount();
        ReleaseLogUtil.c("Suggestion_PlanUtil", "isPlanLastDay weekNumber:", Integer.valueOf(weekCount));
        if (weekCount != i) {
            LogUtil.a("Suggestion_PlanUtil", "isPlanLastDay weekNumber != weekOrDer");
            return false;
        }
        PlanTimeInfo planTimeInfo = intPlan.getPlanTimeInfo();
        if (planTimeInfo == null) {
            LogUtil.j("Suggestion_PlanUtil", "isPlanLastDay planTimeInfo == null");
            return false;
        }
        return d(i2, planTimeInfo.getEndDate());
    }

    private static boolean d(int i, long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j * 1000);
        int iB = ift.b(calendar.get(7));
        ReleaseLogUtil.c("Suggestion_PlanUtil", "isPlanLastDay endPlanOfDay:", Integer.valueOf(iB));
        return i == iB;
    }

    public static boolean a(Plan plan, int i, int i2) {
        ReleaseLogUtil.c("Suggestion_PlanUtil", "isPlanLastDay weekOrDer:", Integer.valueOf(i), "dayOrder:", Integer.valueOf(i2));
        if (plan == null) {
            LogUtil.j("Suggestion_PlanUtil", "isPlanLastDay planMetaInfo == null");
            return false;
        }
        if (a(plan, plan.getEndTime() * 1000) != i) {
            LogUtil.a("Suggestion_PlanUtil", "isPlanLastDay weekNumber != weekOrDer");
            return false;
        }
        return d(i2, plan.getEndTime());
    }

    public static float e(IntPlan intPlan, int i, int i2, long j) {
        float actualCalorie = 0.0f;
        for (RecordData recordData : b(d(intPlan, i, i2))) {
            LogUtil.a("Suggestion_PlanUtil", "recordData:", recordData.getRecordId(), " ", Integer.valueOf(recordData.getSportType()), " ", Float.valueOf(recordData.getActualCalorie()));
            actualCalorie += recordData.getActualCalorie();
        }
        LogUtil.a("Suggestion_PlanUtil", "getDayPlanConsumeCalories weekOrder:", Integer.valueOf(i), " dayOrder:", Integer.valueOf(i2), " totalCalories:", Float.valueOf(actualCalorie), " time:", Long.valueOf(j));
        return ped.b(actualCalorie + a(intPlan.getPlanId(), j, j).e);
    }

    private static d a(String str, long j, long j2) {
        CourseApi courseApi = (CourseApi) Services.b("CoursePlanService", CourseApi.class);
        LogUtil.a("Suggestion_PlanUtil", "getTotalCaloriesInWeekPlan:", Long.valueOf(j), "  endTime:", Long.valueOf(j2));
        List<WorkoutRecord> workoutRecords = courseApi.getWorkoutRecords(str, ift.i(j), ift.i(j2));
        d dVar = new d();
        if (njy.b(workoutRecords)) {
            LogUtil.a("Suggestion_PlanUtil", "workoutRecords size = ", Integer.valueOf(workoutRecords.size()));
            for (WorkoutRecord workoutRecord : workoutRecords) {
                LogUtil.a("Suggestion_PlanUtil", "workoutRecord:", workoutRecord.acquireWorkoutId(), " ", Float.valueOf(workoutRecord.acquireActualCalorie()), " ", Integer.valueOf(workoutRecord.getDuration() / 1000));
                d.d(dVar, workoutRecord.acquireActualCalorie());
                d.b(dVar, workoutRecord.getDuration() / 1000);
            }
            return dVar;
        }
        LogUtil.a("Suggestion_PlanUtil", "workoutRecords is empty.");
        return dVar;
    }

    private static List<RecordData> b(List<RecordData> list) {
        ArrayList arrayList = new ArrayList();
        if (!njy.e(list)) {
            for (RecordData recordData : list) {
                if (recordData != null && recordData.getSportType() > 0 && recordData.getIsInPlan() != 1) {
                    arrayList.add(recordData);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: loaded from: classes4.dex */
    static class d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f1151c;
        private int e;

        private d() {
        }

        static /* synthetic */ int b(d dVar, int i) {
            int i2 = dVar.f1151c + i;
            dVar.f1151c = i2;
            return i2;
        }

        static /* synthetic */ int d(d dVar, float f) {
            int i = (int) (dVar.e + f);
            dVar.e = i;
            return i;
        }
    }

    public static List<RecordData> d(IntPlan intPlan, int i, int i2) {
        Map<String, Long> mapB = b(intPlan, i, i2);
        long jLongValue = mapB.get("START_TIME").longValue();
        long jLongValue2 = mapB.get("END_TIME").longValue();
        final ArrayList arrayList = new ArrayList();
        List<RecordData> listD = d(jLongValue, jLongValue2);
        if (njy.b(listD)) {
            arrayList.addAll(listD);
        }
        HiDataReadOption hiDataReadOptionE = e(jLongValue, jLongValue2);
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        HiHealthNativeApi.a(btx.c()).fetchSequenceDataBySportType(hiDataReadOptionE, new HiDataReadResultListener() { // from class: btw.4
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i3, Object obj, int i4, int i5) {
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i3, int i4) {
                List<HiHealthData> listC = btw.c(obj, i3);
                if (!njy.e(listC)) {
                    List listC2 = btw.c(listC);
                    if (njy.b(listC2)) {
                        arrayList.addAll(listC2);
                    }
                    countDownLatch.countDown();
                    return;
                }
                countDownLatch.countDown();
            }
        });
        try {
            if (!countDownLatch.await(6000L, TimeUnit.MILLISECONDS)) {
                LogUtil.j("Suggestion_PlanUtil", "getWeekRecordList wait timeout");
                return arrayList;
            }
        } catch (InterruptedException unused) {
            LogUtil.e("Suggestion_PlanUtil", "interrupted while waiting for getWeekRecordList");
        }
        return arrayList;
    }

    public static boolean m(IntPlan intPlan) {
        String strB = SharedPreferenceManager.b("MMKV_SUGGEST_MODULE_TAG", "DISTRIBUTE_COURSE_DEVICE", "");
        if (TextUtils.isEmpty(strB)) {
            ReleaseLogUtil.c("Suggestion_PlanUtil", "isHasDistributeCourse distribute null");
            return false;
        }
        if (intPlan == null) {
            return false;
        }
        return strB.equals(peh.c(p(intPlan)));
    }

    public static void s(IntPlan intPlan) {
        if (intPlan == null || !IntPlan.PlanType.AI_FITNESS_PLAN.equals(intPlan.getPlanType())) {
            LogUtil.a("Suggestion_PlanUtil", "setDistributeCourseSp null");
        } else {
            SharedPreferenceManager.c("MMKV_SUGGEST_MODULE_TAG", "DISTRIBUTE_COURSE_DEVICE", peh.c(p(intPlan)));
        }
    }

    private static WeekDataForDevice p(IntPlan intPlan) {
        if (intPlan == null || intPlan.getMetaInfo() == null || !IntPlan.PlanType.AI_FITNESS_PLAN.equals(intPlan.getPlanType())) {
            LogUtil.j("Suggestion_PlanUtil", "getCurrentWeekForDeviceCourseList null");
            return null;
        }
        int iH = h(intPlan) - 1;
        IntWeekPlan weekInfoByIdx = intPlan.getWeekInfoByIdx(iH);
        if (weekInfoByIdx == null) {
            LogUtil.j("Suggestion_PlanUtil", "getCurrentWeekForDeviceCourseList intWeekPlan null currentWeekCount", Integer.valueOf(iH));
            return null;
        }
        ArrayList arrayList = new ArrayList(weekInfoByIdx.getDayCount());
        for (int i = 0; i < weekInfoByIdx.getDayCount(); i++) {
            IntDayPlan dayByIdx = weekInfoByIdx.getDayByIdx(i);
            if (dayByIdx != null) {
                DayDataForDevice dayDataForDevice = new DayDataForDevice();
                dayDataForDevice.setPunchFlag(dayByIdx.getPunchFlag());
                dayDataForDevice.setDayIndex(dayDataForDevice.getDayIndex());
                ArrayList arrayList2 = new ArrayList(dayByIdx.getInPlanActionCnt());
                for (int i2 = 0; i2 < dayByIdx.getInPlanActionCnt(); i2++) {
                    IntAction inPlanAction = dayByIdx.getInPlanAction(i2);
                    DayDataForDevice.IntCourseDayData intCourseDayData = new DayDataForDevice.IntCourseDayData();
                    intCourseDayData.setCourseId(inPlanAction.getActionId());
                    intCourseDayData.setPunchFlag(intCourseDayData.getPunchFlag());
                    arrayList2.add(intCourseDayData);
                }
                dayDataForDevice.setIntPlanDayDataList(arrayList2);
                arrayList.add(dayDataForDevice);
            }
        }
        WeekDataForDevice weekDataForDevice = new WeekDataForDevice();
        weekDataForDevice.setDayDataForDeviceList(arrayList);
        weekDataForDevice.setWeekIndex(weekInfoByIdx.getWeekOrder());
        DeviceInfo deviceInfo = ecu.d().getDeviceInfo(GetDeviceInfoMode.ACTIVE_MAIN_DEVICES_WITHOUT_AW70, null, "Suggestion_PlanUtil");
        if (deviceInfo != null) {
            weekDataForDevice.setDeviceUdId(deviceInfo.getDeviceUdid());
        }
        return weekDataForDevice;
    }

    private static PlanMetaInfo q(IntPlan intPlan) {
        if (intPlan == null) {
            ReleaseLogUtil.d("Suggestion_PlanUtil", "getPlanMetaInfo intPlan is null");
            return null;
        }
        return intPlan.getMetaInfo();
    }

    private static PlanTimeInfo u(IntPlan intPlan) {
        if (intPlan == null) {
            ReleaseLogUtil.d("Suggestion_PlanUtil", "getPlanTimeInfo intPlan is null");
            return null;
        }
        return intPlan.getPlanTimeInfo();
    }

    private static long d(long j) {
        return String.valueOf(j).matches("\\d{10}") ? j * 1000 : j;
    }

    public static int e(IntPlan intPlan) {
        PlanMetaInfo planMetaInfoQ = q(intPlan);
        if (planMetaInfoQ == null) {
            ReleaseLogUtil.d("Suggestion_PlanUtil", "getIntPlanDayCount planMetaInfo is null");
            return -1;
        }
        int dayCount = planMetaInfoQ.getDayCount();
        ReleaseLogUtil.c("Suggestion_PlanUtil", "getIntPlanDayCount dayCount ", Integer.valueOf(dayCount));
        return dayCount;
    }

    public static long a(IntPlan intPlan) {
        PlanTimeInfo planTimeInfoU = u(intPlan);
        if (planTimeInfoU == null) {
            ReleaseLogUtil.d("Suggestion_PlanUtil", "getIntPlanCreateTimeMillis planTimeInfo is null");
            return -1L;
        }
        long createTime = planTimeInfoU.getCreateTime();
        ReleaseLogUtil.c("Suggestion_PlanUtil", "getIntPlanCreateTimeMillis createTime ", Long.valueOf(createTime));
        return d(createTime);
    }

    public static int d(IntPlan intPlan) {
        long jA = a(intPlan);
        if (intPlan == null) {
            ReleaseLogUtil.d("Suggestion_PlanUtil", "getIntPlanCreateDate intPlan is null startTimeMillis ", Long.valueOf(jA));
            return DateFormatUtil.a(jA);
        }
        String timeZone = intPlan.getTimeZone();
        ReleaseLogUtil.c("Suggestion_PlanUtil", "getIntPlanCreateDate startTimeMillis ", Long.valueOf(jA), " timeZone ", timeZone);
        return DateFormatUtil.a(jA, lsl.a(timeZone));
    }

    public static long g(IntPlan intPlan) {
        PlanTimeInfo planTimeInfoU = u(intPlan);
        if (planTimeInfoU == null) {
            ReleaseLogUtil.d("Suggestion_PlanUtil", "getIntPlanStartTimeMillis planTimeInfo is null");
            return -1L;
        }
        long beginDate = planTimeInfoU.getBeginDate();
        ReleaseLogUtil.c("Suggestion_PlanUtil", "getIntPlanStartTimeMillis beginDate ", Long.valueOf(beginDate));
        return d(beginDate);
    }

    public static int f(IntPlan intPlan) {
        long jG = g(intPlan);
        if (intPlan == null) {
            ReleaseLogUtil.d("Suggestion_PlanUtil", "getIntPlanStartDate intPlan is null startTimeMillis ", Long.valueOf(jG));
            return DateFormatUtil.a(jG);
        }
        String timeZone = intPlan.getTimeZone();
        ReleaseLogUtil.c("Suggestion_PlanUtil", "getIntPlanStartDate startTimeMillis ", Long.valueOf(jG), " timeZone ", timeZone);
        return DateFormatUtil.a(jG, lsl.a(timeZone));
    }

    public static long c(IntPlan intPlan) {
        PlanTimeInfo planTimeInfoU = u(intPlan);
        if (planTimeInfoU == null) {
            ReleaseLogUtil.d("Suggestion_PlanUtil", "getIntPlanEndTimeMillis planTimeInfo is null");
            return -1L;
        }
        long endDate = planTimeInfoU.getEndDate();
        ReleaseLogUtil.c("Suggestion_PlanUtil", "getIntPlanEndTimeMillis endDate ", Long.valueOf(endDate));
        return d(endDate);
    }

    public static int b(IntPlan intPlan) {
        long jC = c(intPlan);
        if (intPlan == null) {
            ReleaseLogUtil.d("Suggestion_PlanUtil", "getIntPlanEndDate intPlan is null endTimeMillis ", Long.valueOf(jC));
            return DateFormatUtil.a(jC);
        }
        String timeZone = intPlan.getTimeZone();
        ReleaseLogUtil.c("Suggestion_PlanUtil", "getIntPlanEndDate endTimeMillis ", Long.valueOf(jC), " timeZone ", timeZone);
        return DateFormatUtil.a(jC, lsl.a(timeZone));
    }

    public static void d(Context context, String str, String str2, String str3) {
        if (context == null) {
            LogUtil.j("Suggestion_PlanUtil", "jumpToCompetition context is null");
            return;
        }
        LogUtil.a("Suggestion_PlanUtil", "jumpToCompetition");
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str.contains("?") ? "&" : "?");
        sb.append("entrance=");
        sb.append(str2);
        ddv.b().loadH5ProApp(context, str3, new H5ProLaunchOption.Builder().addPath(sb.toString()));
    }

    public static void d() {
        ((PayApi) Services.b("TradeService", PayApi.class)).functionAuth("9", new IBaseResponseCallback() { // from class: btu
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                btw.b(i, obj);
            }
        });
    }

    static /* synthetic */ void b(int i, Object obj) {
        if (i != 0) {
            LogUtil.j("Suggestion_PlanUtil", "functionAuth errorCode: ", Integer.valueOf(i));
            lua.e("intelligentTrainingPlan", "functionSmartTrainPlan");
        } else if (obj instanceof FunctionAuthResult) {
            lua.f("intelligentTrainingPlan", "functionSmartTrainPlan", HiJsonUtil.d(obj));
        } else {
            LogUtil.j("Suggestion_PlanUtil", "functionAuth data error ", obj);
        }
    }

    public static boolean d(final boolean z) {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        ((PayApi) Services.b("TradeService", PayApi.class)).functionAuth("9", new IBaseResponseCallback() { // from class: bty
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                btw.c(countDownLatch, z, atomicBoolean, i, obj);
            }
        });
        try {
            if (!countDownLatch.await(1000L, TimeUnit.MILLISECONDS)) {
                LogUtil.j("Suggestion_PlanUtil", "functionAuth: wait timeout 1000ms)");
                return false;
            }
            return atomicBoolean.get();
        } catch (InterruptedException e) {
            LogUtil.j("Suggestion_PlanUtil", "functionAuth: wait interrupted", ExceptionUtils.c(e));
            return false;
        }
    }

    static /* synthetic */ void c(CountDownLatch countDownLatch, boolean z, AtomicBoolean atomicBoolean, int i, Object obj) {
        if (i != 0) {
            ReleaseLogUtil.d("Suggestion_PlanUtil", "functionAuth errorCode: ", Integer.valueOf(i));
            countDownLatch.countDown();
            return;
        }
        if (!(obj instanceof FunctionAuthResult)) {
            ReleaseLogUtil.d("Suggestion_PlanUtil", "functionAuth data not FunctionAuthResult ", obj);
            countDownLatch.countDown();
            return;
        }
        int authResult = ((FunctionAuthResult) obj).getAuthResult();
        ReleaseLogUtil.c("Suggestion_PlanUtil", "getFunctionAuth result success, result is ", Integer.valueOf(authResult));
        if (!z && authResult == 2) {
            atomicBoolean.set(true);
        } else if (!z || authResult == 0) {
            ReleaseLogUtil.d("Suggestion_PlanUtil", "getFunctionAuth result error");
            atomicBoolean.set(false);
        } else {
            atomicBoolean.set(true);
        }
        countDownLatch.countDown();
    }

    public static List<gfo> b(LinkedHashMap<Integer, gfl> linkedHashMap) {
        if (linkedHashMap.isEmpty()) {
            LogUtil.j("Suggestion_PlanUtil", "getControlData error aiCoachData is empty");
            return null;
        }
        gfl gflVar = linkedHashMap.get(0);
        if (gflVar == null) {
            LogUtil.j("Suggestion_PlanUtil", "getControlData error AICoachResponse is empty");
            return null;
        }
        gfn gfnVarE = gflVar.e();
        if (gfnVarE == null) {
            LogUtil.j("Suggestion_PlanUtil", "getControlData error AICoachContent is empty");
            return null;
        }
        List<gfo> listC = gfnVarE.c();
        if (!njy.e(listC)) {
            return listC;
        }
        LogUtil.j("Suggestion_PlanUtil", "getControlData error controlDatas is empty");
        return null;
    }

    public static boolean a(LinkedHashMap<Integer, gfl> linkedHashMap) {
        if (linkedHashMap == null || linkedHashMap.isEmpty()) {
            LogUtil.j("Suggestion_PlanUtil", "getMaskCardVisibility error aiCoachData is empty");
            return false;
        }
        List<gfo> listB = b(linkedHashMap);
        if (listB == null) {
            LogUtil.j("Suggestion_PlanUtil", "getMaskCardVisibility error controlDatas is empty");
            return false;
        }
        Iterator<gfo> it = listB.iterator();
        while (it.hasNext()) {
            if (e(it.next())) {
                return true;
            }
        }
        return false;
    }

    private static boolean e(gfo gfoVar) {
        String strA = gfoVar.a();
        String strC = gfoVar.c();
        if (TextUtils.isEmpty(strC) || TextUtils.isEmpty(strA)) {
            LogUtil.j("Suggestion_PlanUtil", "parseMaskCardShowable error content or controlType is empty");
            return false;
        }
        if (ControlTypeEnum.CONTROL_RESULT.getControlType().equals(strA)) {
            try {
                return new JSONObject(strC).optInt("resultCode", -1) == 27001;
            } catch (JSONException e) {
                LogUtil.j("Suggestion_PlanUtil", "parseMaskCardShowable error: ", e);
            }
        }
        return false;
    }

    public static String c(long j, long j2, int i) {
        String strE;
        int iA = lsl.a(j, j2);
        int iE = lsl.e(j, j2);
        if (iA > 30) {
            strE = qre.e(R.plurals.IDS_smart_weight_plan_name_week, iE, Integer.valueOf(iE));
        } else {
            strE = qre.e(R.plurals.IDS_smart_weight_plan_name_day, iA, Integer.valueOf(iA));
        }
        if (i == 3) {
            return qre.a(R.string.IDS_smart_weight_plan_name_radical, strE);
        }
        if (i == 2) {
            return qre.a(R.string.IDS_smart_weight_plan_name_quick, strE);
        }
        return qre.a(R.string.IDS_smart_weight_plan_name_normal, strE);
    }

    public static boolean b(int i, TimeZone timeZone) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jC = DateFormatUtil.c(i, timeZone);
        return jC <= jCurrentTimeMillis || lsl.g(jC, jCurrentTimeMillis);
    }

    public static void e(final Context context, final qey qeyVar, final UiCallback<Object> uiCallback) {
        if (!HandlerExecutor.c()) {
            HandlerExecutor.b(new Runnable() { // from class: bua
                @Override // java.lang.Runnable
                public final void run() {
                    btw.e(context, qeyVar, (UiCallback<Object>) uiCallback);
                }
            });
            return;
        }
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity == null || activity.isFinishing() || activity.isDestroyed()) {
            LogUtil.j("Suggestion_PlanUtil", "showStopPlanDialog activity isFinishing or isDestroyed");
            return;
        }
        NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(activity);
        builder.b(R.string.IDS_train_plan_dialog_stop_content);
        builder.c(R.string.IDS_train_plan_dialog_stop_button, new View.OnClickListener() { // from class: btz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                btw.e(qeyVar, (UiCallback<Object>) uiCallback);
            }
        }).a(R.string.IDS_hw_common_ui_dialog_cancel, new View.OnClickListener() { // from class: bud
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                btw.a(view);
            }
        });
        builder.c().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(final qey qeyVar, final UiCallback<Object> uiCallback) {
        if (HandlerExecutor.c()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: bub
                @Override // java.lang.Runnable
                public final void run() {
                    btw.e(qeyVar, (UiCallback<Object>) uiCallback);
                }
            });
            return;
        }
        PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
        if (planApi == null) {
            LogUtil.j("Suggestion_PlanUtil", "stopSmartTrainPlan intPlanApi is null.");
            uiCallback.onFailure(-1, "");
        } else {
            planApi.stopSmartTrainPlan(qeyVar.h(), new UiCallback<String>() { // from class: btw.5
                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                public void onFailure(int i, String str) {
                    ReleaseLogUtil.c("Suggestion_PlanUtil", "stopSmartTrainPlan onFailure:", Integer.valueOf(i), " errorInfo:", str);
                    uiCallback.onFailure(i, str);
                }

                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
                public void onSuccess(String str) {
                    LogUtil.a("Suggestion_PlanUtil", "stopSmartTrainPlan onSuccess:", str);
                    uiCallback.onSuccess(str);
                    btq.e().e("PLAN_UPDATE");
                }
            });
        }
    }

    public static double b(double d2, double d3, double d4) {
        if (d2 <= 0.0d || d3 <= 0.0d || d4 <= 0.0d || d3 >= d2 || d4 >= d2) {
            return 0.0d;
        }
        return Math.min(((d2 - d3) * 100.0d) / (d2 - d4), 100.0d);
    }
}
