package defpackage;

import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseLongArray;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.basefitnessadvice.model.intplan.DayInfo;
import com.huawei.basefitnessadvice.model.intplan.Goal;
import com.huawei.basefitnessadvice.model.intplan.IntAction;
import com.huawei.basefitnessadvice.model.intplan.IntDayPlan;
import com.huawei.basefitnessadvice.model.intplan.IntPlan;
import com.huawei.basefitnessadvice.model.intplan.IntWeekPlan;
import com.huawei.basefitnessadvice.model.intplan.LeaveInfo;
import com.huawei.basefitnessadvice.model.intplan.RecordData;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.course.api.CourseApi;
import com.huawei.health.plan.api.PlanApi;
import com.huawei.health.plan.model.intplan.LeavePlanCalendarBean;
import com.huawei.health.plan.model.intplan.ReplacePlanBean;
import com.huawei.health.sport.model.WorkoutRecord;
import com.huawei.health.weight.bean.WeightTargetDifferences;
import com.huawei.hihealth.HiDataFilter;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiDataReadProOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hihealth.data.type.HiHealthDataType;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import health.compact.a.CommonUtils;
import health.compact.a.HiDateUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.LogUtil;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.Services;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class hvv {
    public static List<IntAction> a(IntPlan intPlan, int i, int i2) {
        IntDayPlan dayByOrder;
        if (intPlan == null) {
            ReleaseLogUtil.d("R_IntPlanDetailCourseUtil", "getCourseList plan is null");
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        IntWeekPlan weekInfoByOrder = intPlan.getWeekInfoByOrder(i);
        if (weekInfoByOrder != null && (dayByOrder = weekInfoByOrder.getDayByOrder(i2)) != null) {
            for (int i3 = 0; i3 < dayByOrder.getInPlanActionCnt(); i3++) {
                IntAction inPlanAction = dayByOrder.getInPlanAction(i3);
                if (b(inPlanAction)) {
                    arrayList.add(inPlanAction);
                }
            }
        }
        return arrayList;
    }

    public static List<IntAction> e(IntPlan intPlan, int i, int i2) {
        IntDayPlan dayByOrder;
        if (intPlan == null) {
            ReleaseLogUtil.d("R_IntPlanDetailCourseUtil", "getOutPlanCourseList plan is null");
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        IntWeekPlan weekInfoByOrder = intPlan.getWeekInfoByOrder(i);
        if (weekInfoByOrder != null && (dayByOrder = weekInfoByOrder.getDayByOrder(i2)) != null) {
            for (int i3 = 0; i3 < dayByOrder.getOutPlanActionCnt(); i3++) {
                IntAction outPlanAction = dayByOrder.getOutPlanAction(i3);
                if (b(outPlanAction)) {
                    arrayList.add(outPlanAction);
                }
            }
        }
        return arrayList;
    }

    public static RecordData d(List<RecordData> list, String str) {
        if (list == null) {
            return null;
        }
        for (int i = 0; i < list.size(); i++) {
            if (str.equals(list.get(i).getWorkoutId())) {
                return list.get(i);
            }
        }
        return null;
    }

    public static boolean d(IntDayPlan intDayPlan, IntAction.ActionType actionType) {
        return !a(intDayPlan, actionType).isEmpty();
    }

    public static List<IntAction> a(IntDayPlan intDayPlan, IntAction.ActionType actionType) {
        ArrayList arrayList = new ArrayList();
        if (intDayPlan != null) {
            for (int i = 0; i < intDayPlan.getInPlanActionCnt(); i++) {
                IntAction inPlanAction = intDayPlan.getInPlanAction(i);
                if (inPlanAction != null && inPlanAction.getActionType() == actionType) {
                    arrayList.add(inPlanAction);
                }
            }
            for (int i2 = 0; i2 < intDayPlan.getOutPlanActionCnt(); i2++) {
                IntAction outPlanAction = intDayPlan.getOutPlanAction(i2);
                if (outPlanAction != null && outPlanAction.getActionType() == actionType) {
                    arrayList.add(outPlanAction);
                }
            }
        }
        return arrayList;
    }

    public static boolean c(IntPlan intPlan, int i, int i2) {
        return intPlan.getDayInfo(i, i2) != null;
    }

    public static boolean e(IntWeekPlan intWeekPlan, float f) {
        int inPlanActionCnt = 0;
        int inPlanActionCnt2 = 0;
        for (int i = 0; i < intWeekPlan.getDayCount(); i++) {
            IntDayPlan dayByIdx = intWeekPlan.getDayByIdx(i);
            if (dayByIdx != null) {
                if (dayByIdx.getPunchFlag() == 1) {
                    inPlanActionCnt2 += dayByIdx.getInPlanActionCnt();
                    inPlanActionCnt += dayByIdx.getInPlanActionCnt();
                } else {
                    for (int i2 = 0; i2 < dayByIdx.getInPlanActionCnt(); i2++) {
                        IntAction inPlanAction = dayByIdx.getInPlanAction(i2);
                        if (b(inPlanAction)) {
                            inPlanActionCnt++;
                            if (inPlanAction.getPunchFlag() == 1) {
                                inPlanActionCnt2++;
                            }
                        }
                    }
                }
            }
        }
        return inPlanActionCnt <= 0 || ((float) inPlanActionCnt2) / ((float) inPlanActionCnt) > f;
    }

    private static boolean b(IntAction intAction) {
        if (intAction != null) {
            return IntAction.ActionType.RUN.equals(intAction.getActionType()) || IntAction.ActionType.WORKOUT.equals(intAction.getActionType());
        }
        return false;
    }

    public static List<IntAction> a(IntPlan intPlan) {
        IntDayPlan dayByOrder;
        int iH = btw.h(intPlan);
        int iB = ift.b(Calendar.getInstance().get(7));
        ArrayList arrayList = new ArrayList();
        IntWeekPlan weekInfoByOrder = intPlan.getWeekInfoByOrder(iH);
        if (weekInfoByOrder != null && (dayByOrder = weekInfoByOrder.getDayByOrder(iB)) != null) {
            for (int i = 0; i < dayByOrder.getInPlanActionCnt(); i++) {
                IntAction inPlanAction = dayByOrder.getInPlanAction(i);
                if (inPlanAction != null && !"Race".equals(inPlanAction.getActionId()) && ((inPlanAction.getActionType() == IntAction.ActionType.RUN || inPlanAction.getActionType() == IntAction.ActionType.WORKOUT) && inPlanAction.getActionId() != null)) {
                    arrayList.add(inPlanAction);
                }
            }
        }
        return arrayList;
    }

    public static List<IntAction> b(IntPlan intPlan) {
        List<IntAction> listA = a(intPlan, btw.h(intPlan), ift.b(Calendar.getInstance().get(7)));
        ArrayList arrayList = new ArrayList();
        for (IntAction intAction : listA) {
            if (intAction != null && intAction.getPunchFlag() != 1 && !"Race".equals(intAction.getActionId())) {
                arrayList.add(intAction);
            }
        }
        return arrayList;
    }

    public static void a(IntPlan intPlan, int i, int i2, final IBaseResponseCallback iBaseResponseCallback) {
        btw.a(intPlan, i, i2, new IBaseResponseCallback() { // from class: hwc
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i3, Object obj) {
                hvv.b(iBaseResponseCallback, i3, obj);
            }
        });
    }

    static /* synthetic */ void b(IBaseResponseCallback iBaseResponseCallback, int i, Object obj) {
        if (njy.b(obj, RecordData.class)) {
            List list = (List) obj;
            if (njy.e(list)) {
                iBaseResponseCallback.a(0, false);
                return;
            }
            for (int i2 = 0; i2 < list.size(); i2++) {
                if (((RecordData) list.get(i2)).getIsInPlan() == 0) {
                    iBaseResponseCallback.a(0, true);
                    return;
                }
            }
            iBaseResponseCallback.a(0, false);
        }
    }

    public static boolean c(IntDayPlan intDayPlan) {
        if (intDayPlan == null) {
            ReleaseLogUtil.d("R_IntPlanDetailCourseUtil", "isDayAllClockIn intDayPlan is null");
            return false;
        }
        int inPlanActionCnt = intDayPlan.getInPlanActionCnt();
        for (int i = 0; i < inPlanActionCnt; i++) {
            IntAction inPlanAction = intDayPlan.getInPlanAction(i);
            if (inPlanAction != null && inPlanAction.getPunchFlag() <= 0) {
                return false;
            }
        }
        return true;
    }

    public static List<String> e(List<IntAction> list) {
        if (njy.e(list)) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        for (IntAction intAction : list) {
            if (intAction != null) {
                String actionId = intAction.getActionId();
                if (!TextUtils.isEmpty(actionId)) {
                    arrayList.add(actionId);
                }
            }
        }
        return arrayList;
    }

    public static WorkoutRecord b(List<WorkoutRecord> list, RecordData recordData) {
        if (njy.e(list) || recordData == null) {
            ReleaseLogUtil.d("R_IntPlanDetailCourseUtil", "getWorkoutRecord list ", list, " recordData ", recordData);
            return null;
        }
        String workoutId = recordData.getWorkoutId();
        if (TextUtils.isEmpty(workoutId)) {
            ReleaseLogUtil.d("R_IntPlanDetailCourseUtil", "getWorkoutRecord workoutId ", workoutId);
            return null;
        }
        for (WorkoutRecord workoutRecord : list) {
            if (workoutRecord != null && workoutId.equals(workoutRecord.acquireWorkoutId()) && workoutRecord.acquireExerciseTime() / 1000 == recordData.getEndTime() / 1000) {
                return workoutRecord;
            }
        }
        return null;
    }

    public static List<WorkoutRecord> e(String str) {
        CourseApi courseApi = (CourseApi) Services.d("CoursePlanService", CourseApi.class);
        if (courseApi == null) {
            ReleaseLogUtil.d("R_IntPlanDetailCourseUtil", "getWorkoutRecordList api is null");
            return Collections.EMPTY_LIST;
        }
        return courseApi.getWorkoutRecords(str, new UiCallback<List<WorkoutRecord>>() { // from class: hvv.5
            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            public void onFailure(int i, String str2) {
                ReleaseLogUtil.d("R_IntPlanDetailCourseUtil", "getWorkoutRecordList onFailure errorCode ", Integer.valueOf(i), " errorInfo ", str2);
            }

            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public void onSuccess(List<WorkoutRecord> list) {
                ReleaseLogUtil.c("R_IntPlanDetailCourseUtil", "getWorkoutRecordList onSuccess recordList ", list);
            }
        });
    }

    public static pdm b(String str) {
        pdm pdmVar = new pdm();
        pdmVar.d(str);
        pdmVar.b(IntAction.ActionType.WORKOUT.getType());
        return pdmVar;
    }

    public static peb b(List<pdm> list, String str, int i, int i2, int i3) {
        peb pebVar = new peb();
        pebVar.b(str);
        pebVar.d(i3);
        pebVar.c(i2);
        pebVar.e(i);
        pebVar.c(list);
        return pebVar;
    }

    public static void c() {
        PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
        if (planApi == null) {
            ReleaseLogUtil.d("R_IntPlanDetailCourseUtil", "setNeedUpdateCurrentPlan api is null");
        } else {
            planApi.setNeedUpdateCurrentPlan();
        }
    }

    public static void d(peb pebVar, final ResponseCallback<Object> responseCallback) {
        PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
        if (planApi == null) {
            ReleaseLogUtil.d("R_IntPlanDetailCourseUtil", "updateAction api is null");
            if (responseCallback == null) {
                ReleaseLogUtil.d("R_IntPlanDetailCourseUtil", "updateAction callback is null");
                return;
            } else {
                responseCallback.onResponse(-1, "");
                return;
            }
        }
        planApi.updateAction(pebVar, new UiCallback<String>() { // from class: hvv.1
            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            public void onFailure(int i, String str) {
                ReleaseLogUtil.d("R_IntPlanDetailCourseUtil", "updateAction onFailure errorCode ", Integer.valueOf(i), " errorInfo ", str);
                ResponseCallback responseCallback2 = responseCallback;
                if (responseCallback2 == null) {
                    ReleaseLogUtil.d("R_IntPlanDetailCourseUtil", "updateAction onFailure callback is null");
                } else {
                    responseCallback2.onResponse(i, str);
                }
            }

            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public void onSuccess(String str) {
                ResponseCallback responseCallback2 = responseCallback;
                if (responseCallback2 == null) {
                    ReleaseLogUtil.d("R_IntPlanDetailCourseUtil", "updateAction onSuccess callback is null data ", str);
                } else {
                    responseCallback2.onResponse(0, str);
                }
            }
        });
    }

    public static void c(ReplacePlanBean replacePlanBean, final ResponseCallback<Object> responseCallback) {
        PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
        if (planApi == null) {
            ReleaseLogUtil.d("R_IntPlanDetailCourseUtil", "replacePlanSchedule api is null");
            if (responseCallback == null) {
                ReleaseLogUtil.d("R_IntPlanDetailCourseUtil", "replacePlanSchedule callback is null");
                return;
            } else {
                responseCallback.onResponse(-1, "");
                return;
            }
        }
        planApi.replacePlanSchedule(replacePlanBean, new UiCallback<Boolean>() { // from class: hvv.3
            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            public void onFailure(int i, String str) {
                ReleaseLogUtil.d("R_IntPlanDetailCourseUtil", "replacePlanSchedule onFailure errorCode ", Integer.valueOf(i), " errorInfo ", str);
                ResponseCallback responseCallback2 = responseCallback;
                if (responseCallback2 == null) {
                    ReleaseLogUtil.d("R_IntPlanDetailCourseUtil", "replacePlanSchedule onFailure callback is null");
                } else {
                    responseCallback2.onResponse(i, str);
                }
            }

            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onSuccess(Boolean bool) {
                ResponseCallback responseCallback2 = responseCallback;
                if (responseCallback2 == null) {
                    ReleaseLogUtil.d("R_IntPlanDetailCourseUtil", "replacePlanSchedule onSuccess callback is null isSuccess ", bool);
                } else {
                    responseCallback2.onResponse(0, bool);
                }
            }
        });
    }

    public static void a(IntPlan intPlan, int i, int i2, final ResponseCallback<Object> responseCallback) {
        PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
        if (planApi == null || intPlan == null) {
            ReleaseLogUtil.d("R_IntPlanDetailCourseUtil", "leavePlan api ", planApi, " intPlan ", intPlan);
            if (responseCallback == null) {
                ReleaseLogUtil.d("R_IntPlanDetailCourseUtil", "leavePlan callback is null");
                return;
            } else {
                responseCallback.onResponse(-1, "");
                return;
            }
        }
        IntPlan.PlanType planType = intPlan.getPlanType();
        LeavePlanCalendarBean.Builder builderPlanId = new LeavePlanCalendarBean.Builder().planId(intPlan.getPlanId());
        if (planType == null) {
            planType = IntPlan.PlanType.AI_FITNESS_PLAN;
        }
        planApi.leavePlan(builderPlanId.category(Integer.valueOf(planType.getType())).leaveInfo(new LeaveInfo.Builder().startDate(String.valueOf(i)).dayNum(Integer.valueOf(i2)).build()).build(), new UiCallback<IntPlan>() { // from class: hvv.2
            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            public void onFailure(int i3, String str) {
                ReleaseLogUtil.d("R_IntPlanDetailCourseUtil", "leavePlan onFailure errorCode ", Integer.valueOf(i3), " errorInfo ", str);
                ResponseCallback responseCallback2 = responseCallback;
                if (responseCallback2 == null) {
                    ReleaseLogUtil.d("R_IntPlanDetailCourseUtil", "leavePlan onFailure callback is null");
                } else {
                    responseCallback2.onResponse(i3, str);
                }
            }

            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onSuccess(IntPlan intPlan2) {
                ResponseCallback responseCallback2 = responseCallback;
                if (responseCallback2 == null) {
                    ReleaseLogUtil.d("R_IntPlanDetailCourseUtil", "leavePlan onSuccess callback is null data ", intPlan2);
                } else {
                    responseCallback2.onResponse(0, intPlan2);
                }
            }
        });
    }

    public static void c(IntPlan intPlan, int i, final ResponseCallback<Object> responseCallback) {
        PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
        if (planApi == null || intPlan == null) {
            ReleaseLogUtil.d("R_IntPlanDetailCourseUtil", "cancelLeave api ", planApi, " intPlan ", intPlan);
            if (responseCallback == null) {
                ReleaseLogUtil.d("R_IntPlanDetailCourseUtil", "cancelLeave callback is null");
                return;
            } else {
                responseCallback.onResponse(-1, "");
                return;
            }
        }
        IntPlan.PlanType planType = intPlan.getPlanType();
        LeavePlanCalendarBean.Builder builderPlanId = new LeavePlanCalendarBean.Builder().planId(intPlan.getPlanId());
        if (planType == null) {
            planType = IntPlan.PlanType.AI_FITNESS_PLAN;
        }
        planApi.cancelLeave(builderPlanId.category(Integer.valueOf(planType.getType())).leaveInfo(new LeaveInfo.Builder().startDate(String.valueOf(i)).build()).build(), new UiCallback<IntPlan>() { // from class: hvv.4
            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            public void onFailure(int i2, String str) {
                ReleaseLogUtil.d("R_IntPlanDetailCourseUtil", "cancelLeave onFailure errorCode ", Integer.valueOf(i2), " errorInfo ", str);
                ResponseCallback responseCallback2 = responseCallback;
                if (responseCallback2 == null) {
                    ReleaseLogUtil.d("R_IntPlanDetailCourseUtil", "cancelLeave onFailure callback is null");
                } else {
                    responseCallback2.onResponse(i2, str);
                }
            }

            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onSuccess(IntPlan intPlan2) {
                ResponseCallback responseCallback2 = responseCallback;
                if (responseCallback2 == null) {
                    ReleaseLogUtil.d("R_IntPlanDetailCourseUtil", "cancelLeave onSuccess callback is null data ", intPlan2);
                } else {
                    responseCallback2.onResponse(0, intPlan2);
                }
            }
        });
    }

    public static void b(IntPlan intPlan, int i, int i2, final ResponseCallback<Object> responseCallback) {
        PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
        if (planApi == null || intPlan == null) {
            ReleaseLogUtil.d("R_IntPlanDetailCourseUtil", "updatePlanCalendar api ", planApi, " plan ", intPlan);
            if (responseCallback == null) {
                ReleaseLogUtil.d("R_IntPlanDetailCourseUtil", "updatePlanCalendar callback is null");
                return;
            } else {
                responseCallback.onResponse(-1, "");
                return;
            }
        }
        IntPlan.PlanType planType = intPlan.getPlanType();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new DayInfo.Builder().adjustDay(String.valueOf(i)).dayStatus(Integer.valueOf(i2)).build());
        planApi.updatePlanCalendar(new LeavePlanCalendarBean.Builder().planId(intPlan.getPlanId()).category(Integer.valueOf(planType == null ? IntPlan.PlanType.AI_FITNESS_PLAN.getType() : planType.getType())).days(arrayList).operationType(1).build(), new UiCallback<IntPlan>() { // from class: hvv.7
            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            public void onFailure(int i3, String str) {
                ReleaseLogUtil.d("R_IntPlanDetailCourseUtil", "updatePlanCalendar onFailure errorCode ", Integer.valueOf(i3), " errorInfo ", str);
                ResponseCallback responseCallback2 = responseCallback;
                if (responseCallback2 == null) {
                    ReleaseLogUtil.d("R_IntPlanDetailCourseUtil", "updatePlanCalendar onFailure callback is null");
                } else {
                    responseCallback2.onResponse(i3, str);
                }
            }

            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public void onSuccess(IntPlan intPlan2) {
                ResponseCallback responseCallback2 = responseCallback;
                if (responseCallback2 == null) {
                    ReleaseLogUtil.d("R_IntPlanDetailCourseUtil", "updatePlanCalendar onSuccess callback is null data ", intPlan2);
                } else {
                    responseCallback2.onResponse(0, intPlan2);
                }
            }
        });
    }

    public static void e(String str, int i, List<DayInfo> list, final UiCallback<IntPlan> uiCallback) {
        PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
        if (planApi == null || str == null) {
            ReleaseLogUtil.d("R_IntPlanDetailCourseUtil", "adjustPlanSchedule api ", planApi, " planId ", str);
            if (uiCallback == null) {
                ReleaseLogUtil.d("R_IntPlanDetailCourseUtil", "adjustPlanSchedule callback is null");
                return;
            } else {
                uiCallback.onFailure(-1, "");
                return;
            }
        }
        ReleaseLogUtil.c("R_IntPlanDetailCourseUtil", "adjustPlanSchedule:", ies.c(list));
        planApi.updatePlanCalendar(new LeavePlanCalendarBean.Builder().planId(str).category(Integer.valueOf(i)).operationType(2).days(list).build(), new UiCallback<IntPlan>() { // from class: hvv.10
            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            public void onFailure(int i2, String str2) {
                ReleaseLogUtil.d("R_IntPlanDetailCourseUtil", "adjustPlanSchedule onFailure errorCode ", Integer.valueOf(i2), " errorInfo ", str2);
                UiCallback uiCallback2 = uiCallback;
                if (uiCallback2 == null) {
                    ReleaseLogUtil.d("R_IntPlanDetailCourseUtil", "adjustPlanSchedule onFailure callback is null");
                } else {
                    uiCallback2.onFailure(i2, str2);
                }
            }

            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public void onSuccess(IntPlan intPlan) {
                UiCallback uiCallback2 = uiCallback;
                if (uiCallback2 == null) {
                    ReleaseLogUtil.d("R_IntPlanDetailCourseUtil", "adjustPlanSchedule onSuccess callback is null");
                } else {
                    uiCallback2.onSuccess(intPlan);
                }
            }
        });
    }

    private static HiDataReadProOption b(HiDataReadOption hiDataReadOption, double d) {
        return HiDataReadProOption.builder().e(hiDataReadOption).b(HiJsonUtil.d(new HiDataFilter(new HiDataFilter.DataFilterExpression(47401, "=", d)))).b();
    }

    private static int e(int i) {
        return CommonUtils.j(HiHealthDataType.b(i));
    }

    private static void c(SparseLongArray sparseLongArray, HiHealthData hiHealthData, int i) {
        if (Double.compare(hiHealthData.getValue(), e(i)) == 0) {
            sparseLongArray.append(i, hiHealthData.getStartTime());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(Object obj, int i, ResponseCallback<Object> responseCallback) {
        if (!(obj instanceof SparseArray)) {
            responseCallback.onResponse(i, new SparseLongArray());
            return;
        }
        List<HiHealthData> list = (List) ((SparseArray) obj).get(47401);
        if (njy.e(list)) {
            responseCallback.onResponse(i, new SparseLongArray());
            return;
        }
        SparseLongArray sparseLongArray = new SparseLongArray();
        for (HiHealthData hiHealthData : list) {
            if (hiHealthData != null) {
                c(sparseLongArray, hiHealthData, 10016);
                c(sparseLongArray, hiHealthData, 10017);
                c(sparseLongArray, hiHealthData, 10019);
                c(sparseLongArray, hiHealthData, 10020);
            }
        }
        responseCallback.onResponse(i, sparseLongArray);
    }

    public static void a(final ResponseCallback<Object> responseCallback) {
        if (responseCallback == null) {
            ReleaseLogUtil.d("R_IntPlanDetailCourseUtil", "getLastMenstrual callback is null");
            return;
        }
        if (hjg.e() != 1) {
            responseCallback.onResponse(-1, new SparseLongArray());
            return;
        }
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setTimeInterval(0L, HiDateUtil.g(HiDateUtil.a(HiDateUtil.e(System.currentTimeMillis(), -15))));
        hiDataReadOption.setType(new int[]{47401});
        hiDataReadOption.setSortOrder(1);
        hiDataReadOption.setCount(1);
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(b(hiDataReadOption, e(10016)));
        arrayList.add(b(hiDataReadOption, e(10017)));
        arrayList.add(b(hiDataReadOption, e(10019)));
        arrayList.add(b(hiDataReadOption, e(10020)));
        HiHealthNativeApi.a(BaseApplication.b()).readHiHealthDataEx(arrayList, new HiDataReadResultListener() { // from class: hvv.6
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i, Object obj, int i2, int i3) {
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i, int i2) {
                hvv.c(obj, i, (ResponseCallback<Object>) responseCallback);
            }
        });
    }

    public static int b(SparseLongArray sparseLongArray) {
        if (sparseLongArray == null) {
            ReleaseLogUtil.d("R_IntPlanDetailCourseUtil", "getMenstrualStatus array is null");
            return 0;
        }
        int iA = DateFormatUtil.a(sparseLongArray.get(10016));
        int iA2 = DateFormatUtil.a(sparseLongArray.get(10017));
        int iA3 = DateFormatUtil.a(System.currentTimeMillis());
        if (iA > 0 && iA2 > 0 && iA <= iA3 && iA3 <= iA2) {
            return 1;
        }
        int iA4 = DateFormatUtil.a(sparseLongArray.get(10019));
        int iA5 = DateFormatUtil.a(sparseLongArray.get(10020));
        return (iA4 <= 0 || iA5 <= 0 || iA4 > iA3 || iA3 > iA5) ? 0 : 2;
    }

    public static int c(SparseLongArray sparseLongArray) {
        if (sparseLongArray == null) {
            ReleaseLogUtil.d("R_IntPlanDetailCourseUtil", "getMenstrualLastDate array is null");
            return 0;
        }
        int iA = DateFormatUtil.a(sparseLongArray.get(10016));
        int iA2 = DateFormatUtil.a(sparseLongArray.get(10017));
        int iA3 = DateFormatUtil.a(System.currentTimeMillis());
        if (iA > 0 && iA2 > 0 && iA <= iA3 && iA3 <= iA2) {
            return iA2;
        }
        int iA4 = DateFormatUtil.a(sparseLongArray.get(10019));
        int iA5 = DateFormatUtil.a(sparseLongArray.get(10020));
        if (iA4 <= 0 || iA5 <= 0 || iA4 > iA3 || iA3 > iA5) {
            return 0;
        }
        return iA5;
    }

    public static boolean c(int i, SparseLongArray sparseLongArray) {
        int iA;
        if (sparseLongArray == null) {
            return false;
        }
        int iB = lua.b("intelligent_plan", "MENSTRUAL_SHOW_DIALOG_LAST_TIME", 0);
        if (i != 1) {
            return i == 2 && (iA = DateFormatUtil.a(sparseLongArray.get(10019))) > 0 && iB < iA;
        }
        int iA2 = DateFormatUtil.a(sparseLongArray.get(10016));
        return iA2 > 0 && iB < iA2;
    }

    public static void c(int i) {
        lua.c("intelligent_plan", "MENSTRUAL_SHOW_DIALOG_LAST_TIME", i);
    }

    public static float d(IntPlan intPlan) {
        if (intPlan == null) {
            ReleaseLogUtil.d("R_IntPlanDetailCourseUtil", "getWeightGoalForPlan intPlan is null");
            return 0.0f;
        }
        Goal goal = intPlan.getGoal("weight");
        if (goal == null) {
            ReleaseLogUtil.d("R_IntPlanDetailCourseUtil", "getWeightGoalForPlan goal is null");
            return 0.0f;
        }
        Object goalDst = goal.getGoalDst();
        if (!(goalDst instanceof Float)) {
            ReleaseLogUtil.d("R_IntPlanDetailCourseUtil", "getWeightGoalForPlan object ", goalDst);
            return 0.0f;
        }
        return ((Float) goalDst).floatValue();
    }

    public static void e(final IntPlan intPlan, final ResponseCallback<Boolean> responseCallback) {
        if (responseCallback == null) {
            ReleaseLogUtil.d("R_IntPlanDetailCourseUtil", "examineWeightManagerGoal callback is null");
            return;
        }
        if (intPlan == null) {
            ReleaseLogUtil.d("R_IntPlanDetailCourseUtil", "examineWeightManagerGoal intPlan is null");
            responseCallback.onResponse(-1, false);
            return;
        }
        if (intPlan.getMetaInfo() == null) {
            ReleaseLogUtil.d("R_IntPlanDetailCourseUtil", "examineWeightManagerGoal planMetaInfo is null");
            responseCallback.onResponse(-1, false);
            return;
        }
        final float fD = d(intPlan);
        ReleaseLogUtil.c("R_IntPlanDetailCourseUtil", "examineWeightManagerGoal goal ", Float.valueOf(fD));
        if (fD <= 0.0f) {
            responseCallback.onResponse(-1, false);
            return;
        }
        if (intPlan.getPlanTimeInfo() == null) {
            ReleaseLogUtil.d("R_IntPlanDetailCourseUtil", "examineWeightManagerGoal planTimeInfo is null");
            responseCallback.onResponse(-1, false);
            return;
        }
        if (!lua.e()) {
            ReleaseLogUtil.d("R_IntPlanDetailCourseUtil", "examineWeightManagerGoal isPullAllStatus false");
            responseCallback.onResponse(-1, false);
            return;
        }
        String planId = intPlan.getPlanId();
        String strE = lua.e("intelligent_plan", "STOP_PLAN_SHOW_DIALOG_LAST_PLAN_ID", "");
        LogUtil.b("R_IntPlanDetailCourseUtil", "examineWeightManagerGoal planId ", planId, " cachePlanId ", strE);
        if (!TextUtils.isEmpty(strE) && strE.equals(planId)) {
            responseCallback.onResponse(0, false);
            return;
        }
        if (!LanguageUtil.l(BaseApplication.b())) {
            responseCallback.onResponse(0, false);
        } else if (HandlerExecutor.d()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: hvy
                @Override // java.lang.Runnable
                public final void run() {
                    hvv.e(intPlan, (ResponseCallback<Boolean>) responseCallback);
                }
            });
        } else {
            iun.a((ResponseCallback<WeightTargetDifferences>) new ResponseCallback() { // from class: hvx
                @Override // com.huawei.hwbasemgr.ResponseCallback
                public final void onResponse(int i, Object obj) {
                    hvv.e(responseCallback, fD, i, (WeightTargetDifferences) obj);
                }
            });
        }
    }

    static /* synthetic */ void e(final ResponseCallback responseCallback, final float f, int i, WeightTargetDifferences weightTargetDifferences) {
        LogUtil.b("R_IntPlanDetailCourseUtil", "examineWeightManagerGoal differences ", weightTargetDifferences);
        if (weightTargetDifferences == null) {
            responseCallback.onResponse(-1, false);
            return;
        }
        WeightTargetDifferences.WeightTargetType weightTargetTypeE = weightTargetDifferences.e();
        ReleaseLogUtil.c("R_IntPlanDetailCourseUtil", "examineWeightManagerGoal weightTargetType ", weightTargetTypeE);
        if (WeightTargetDifferences.WeightTargetType.WEIGHT_LOSS != weightTargetTypeE) {
            responseCallback.onResponse(0, true);
        } else {
            ThreadPoolManager.c().execute(new Runnable() { // from class: hvw
                @Override // java.lang.Runnable
                public final void run() {
                    nkf.a().a(new ResponseCallback() { // from class: hwa
                        @Override // com.huawei.hwbasemgr.ResponseCallback
                        public final void onResponse(int i2, Object obj) {
                            hvv.e(f, responseCallback, i2, (Float) obj);
                        }
                    });
                }
            });
        }
    }

    static /* synthetic */ void e(float f, ResponseCallback responseCallback, int i, Float f2) {
        LogUtil.b("R_IntPlanDetailCourseUtil", "examineWeightManagerGoal floatData ", f2, " goal ", Float.valueOf(f));
        if (f2 == null) {
            responseCallback.onResponse(-1, false);
        } else {
            responseCallback.onResponse(0, Boolean.valueOf(f != f2.floatValue()));
        }
    }

    public static void c(IntPlan intPlan) {
        if (intPlan == null) {
            ReleaseLogUtil.d("R_IntPlanDetailCourseUtil", "setLastStopPlanShowDialog intPlan is null");
            return;
        }
        String planId = intPlan.getPlanId();
        LogUtil.b("R_IntPlanDetailCourseUtil", "setLastStopPlanShowDialog planId ", planId);
        lua.f("intelligent_plan", "STOP_PLAN_SHOW_DIALOG_LAST_PLAN_ID", planId);
    }

    public static boolean a() {
        boolean zE = lua.e();
        ReleaseLogUtil.c("R_IntPlanDetailCourseUtil", "isNeedRefreshPlan isPullAllStatus ", Boolean.valueOf(zE));
        if (!zE) {
            return false;
        }
        long jD = lua.d("intelligent_plan", "LAST_REFRESH_PLAN_TIME_MILLIS", 0L);
        ReleaseLogUtil.c("R_IntPlanDetailCourseUtil", "isNeedRefreshPlan timeMillis ", Long.valueOf(jD));
        return !lsl.aa(jD) || Math.abs(System.currentTimeMillis() - jD) >= 3600000;
    }

    public static void e() {
        lua.a("intelligent_plan", "LAST_REFRESH_PLAN_TIME_MILLIS", System.currentTimeMillis());
    }

    public static void c(final ResponseCallback<Pair<Long, String>> responseCallback) {
        xkb.c("900300069", new ResponseCallback() { // from class: hwd
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i, Object obj) {
                hvv.a(responseCallback, i, (Pair) obj);
            }
        });
    }

    static /* synthetic */ void a(ResponseCallback responseCallback, int i, Pair pair) {
        LogUtil.b("IntPlanDetailCourseUtil", "getNutritionManagement errorCode ", Integer.valueOf(i), " pair ", pair);
        if (pair != null) {
            lua.f("intelligent_plan", "RECIPE_NUTRIENT_GOAL", (String) pair.second);
        }
        if (responseCallback == null) {
            ReleaseLogUtil.d("R_IntPlanDetailCourseUtil", "getNutritionManagement callback is null");
        } else {
            responseCallback.onResponse(i, pair);
        }
    }

    public static List<Integer> b() {
        hdg hdgVarD = d();
        if (hdgVarD == null) {
            ReleaseLogUtil.d("R_IntPlanDetailCourseUtil", "getNutritionManagementList recipeNutrientGoal is null");
            return Collections.singletonList(1);
        }
        LogUtil.b("IntPlanDetailCourseUtil", "getNutritionManagementList recipeNutrientGoal ", HiJsonUtil.d(hdgVarD));
        List<Integer> listB = hdgVarD.b();
        return njy.e(listB) ? Collections.singletonList(1) : listB;
    }

    private static hdg d() {
        String strE = lua.e("intelligent_plan", "RECIPE_NUTRIENT_GOAL", "");
        LogUtil.b("IntPlanDetailCourseUtil", "getCustomRecipeNutrientGoal json ", strE);
        return (hdg) HiJsonUtil.d(strE, hdg.class);
    }
}
