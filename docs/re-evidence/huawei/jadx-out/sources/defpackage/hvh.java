package defpackage;

import android.text.TextUtils;
import com.amap.api.maps.model.MyLocationStyle;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.basefitnessadvice.model.intplan.Goal;
import com.huawei.basefitnessadvice.model.intplan.IntAction;
import com.huawei.basefitnessadvice.model.intplan.IntDayPlan;
import com.huawei.basefitnessadvice.model.intplan.IntPlan;
import com.huawei.basefitnessadvice.model.intplan.IntWeekPlan;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.course.api.CourseApi;
import com.huawei.health.courseplanservice.api.RecordApi;
import com.huawei.health.plan.api.PlanApi;
import com.huawei.health.plan.model.intplan.DayPlanBean;
import com.huawei.health.plan.model.intplan.GoalBean;
import com.huawei.health.plan.model.intplan.IntActionBean;
import com.huawei.health.plan.model.intplan.IntPlanBean;
import com.huawei.health.plan.model.intplan.IntWeekPlanBean;
import com.huawei.health.plan.model.intplan.PlanInputInfoBean;
import com.huawei.health.plan.model.intplan.PlanMetaInfoBean;
import com.huawei.health.plan.model.intplan.StatInfoBean;
import com.huawei.health.plan.model.intplan.UserProfileBean;
import com.huawei.health.userprofilemgr.api.UserProfileMgrApi;
import com.huawei.health.weight.WeightApi;
import com.huawei.hihealth.HiAggregateOption;
import com.huawei.hihealth.HiUserPreference;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hms.support.feature.result.CommonConstant;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.operation.OperationKey;
import com.huawei.operation.ble.BleConstants;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import com.huawei.pluginfitnessadvice.FitWorkout;
import com.huawei.ui.main.stories.health.weight.callback.WeightCallback;
import com.huawei.up.model.UserInfomation;
import com.huawei.utils.RiskBiAnalytics;
import health.compact.a.CommonUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.Services;
import health.compact.a.Utils;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class hvh {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Double f37203b = Double.valueOf(0.012d);
    private IntPlan d;
    private IntPlanBean e;

    public void a(IntPlan intPlan) {
        this.d = intPlan;
    }

    public boolean d(final JSONObject jSONObject, int i, long j) {
        if (this.d == null) {
            return false;
        }
        final boolean[] zArr = new boolean[1];
        PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
        if (planApi == null) {
            return false;
        }
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        planApi.updateIntPlanReport(this.d.getPlanId(), this.d.getPlanType().getType(), i, jSONObject.toString(), j, new UiCallback<String>() { // from class: hvh.4
            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            public void onFailure(int i2, String str) {
                ReleaseLogUtil.d("Suggestion_WeekReportManager", "updateIntPlanReport fail ", str);
                zArr[0] = false;
                RiskBiAnalytics.e(RiskBiAnalytics.FitPLANRiskType.RISK_TYPE_FINISH_PLAN.value(), "updateIntPlanReport fail plan id is : ", hvh.this.d.getPlanId(), "report is empty: ", Boolean.valueOf(TextUtils.isEmpty(jSONObject.toString())), "errorCode: ", Integer.valueOf(i2), "errorInfo is: ", str);
                countDownLatch.countDown();
            }

            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public void onSuccess(String str) {
                ReleaseLogUtil.c("Suggestion_WeekReportManager", "updateIntPlanReport success", str);
                zArr[0] = true;
                countDownLatch.countDown();
            }
        });
        try {
            countDownLatch.await(6000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            LogUtil.e("Suggestion_WeekReportManager", "updateIntPlanReport timeout ");
        }
        return zArr[0];
    }

    private String b(int i) {
        final String[] strArr = {""};
        PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
        if (planApi == null) {
            return "";
        }
        LogUtil.a("Suggestion_WeekReportManager", "getCoachAdvice reportType: " + i + " mIntPlanBean:" + this.e);
        IntPlanBean intPlanBean = this.e;
        if (intPlanBean != null && intPlanBean.getWeekPlans() != null) {
            Iterator<IntWeekPlanBean> it = this.e.getWeekPlans().iterator();
            while (it.hasNext()) {
                if (it.next().getWeekOrder() <= 0) {
                    ReleaseLogUtil.b("Suggestion_WeekReportManager", "getCoachAdvice weekOrder must be greater than or equal to 1");
                    return "";
                }
            }
        }
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        planApi.getCoachAdvice(i, "", this.e, false, new UiCallback<String>() { // from class: hvh.3
            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            public void onFailure(int i2, String str) {
                long beginDate;
                long endDate;
                ReleaseLogUtil.d("Suggestion_WeekReportManager", "getCoachAdvice fail ", str);
                if (hvh.this.e == null || hvh.this.e.getTimeInfo() == null) {
                    beginDate = 0;
                    endDate = 0;
                } else {
                    beginDate = hvh.this.e.getTimeInfo().getBeginDate();
                    endDate = hvh.this.e.getTimeInfo().getEndDate();
                }
                RiskBiAnalytics.e(RiskBiAnalytics.FitPLANRiskType.RISK_TYPE_COACH_ADVICE_EMPTY.value(), "getCoachAdvice fail beginDate: ", Long.valueOf(beginDate), "endDate: ", Long.valueOf(endDate), "errorCode is :", Integer.valueOf(i2), "errorInfo is :", str);
                countDownLatch.countDown();
            }

            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onSuccess(String str) {
                if (!TextUtils.isEmpty(str)) {
                    strArr[0] = str;
                }
                countDownLatch.countDown();
            }
        });
        try {
            if (!countDownLatch.await(6000L, TimeUnit.MILLISECONDS)) {
                LogUtil.j("Suggestion_WeekReportManager", "getCoachAdvice wait timeout");
            }
        } catch (InterruptedException unused) {
            LogUtil.e("Suggestion_WeekReportManager", "interrupted while waiting for getCoachAdvice");
        }
        return strArr[0];
    }

    public boolean b() {
        IntPlan intPlan = this.d;
        return intPlan != null && intPlan.getPlanTimeInfo().getReportTime() < ift.a(System.currentTimeMillis(), 0) && hvu.v(this.d) && hvu.a(this.d);
    }

    public boolean c() {
        IntPlan intPlan = this.d;
        return intPlan != null && intPlan.getPlanTimeInfo().getReportTime() < ift.c(System.currentTimeMillis(), 0);
    }

    public JSONObject b(int i, boolean z) {
        String str;
        if (this.d == null) {
            return new JSONObject();
        }
        this.e = new IntPlanBean();
        long jCurrentTimeMillis = System.currentTimeMillis();
        int iF = btw.f(this.d);
        long jD = DateFormatUtil.d(iF);
        int iB = btw.b(this.d);
        long jD2 = DateFormatUtil.d(iB);
        long jB = b(z, jCurrentTimeMillis, jD, i);
        long jD3 = d(z, jCurrentTimeMillis, jD2, i);
        int iA = lsl.a(jB, jD3);
        int iA2 = lsl.a(jD, jCurrentTimeMillis);
        ReleaseLogUtil.c("Suggestion_WeekReportManager", "getReport startDate ", Integer.valueOf(iF), " planStartTime ", Long.valueOf(jD), " endDate ", Integer.valueOf(iB), " planEndTime ", Long.valueOf(jD2), " startTime ", Long.valueOf(jB), " endTime ", Long.valueOf(jD3), " dayCount ", Integer.valueOf(iA));
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("startTime", ift.i(jB));
            jSONObject.put("endTime", ift.i(jD3));
            try {
                IntPlan intPlan = this.d;
                jSONObject.put("overview", d(intPlan, iA2, btw.e(intPlan) - iA2, jB));
                jSONObject.put("train", d(i, this.d, z, jD3));
                List<vgo> listA = a(jB, jD3);
                if (i == 1) {
                    str = "Suggestion_WeekReportManager";
                    try {
                        jSONObject.put("summary", b(this.d, jB, jD3, z));
                        jSONObject.put("heatAnalysis", c(this.d, listA, jB, jD3));
                        jSONObject.put("dietSummary", c(this.d, listA, iA));
                        jSONObject.put("nutrientAnalysis", e(this.d, listA, iA));
                    } catch (JSONException e) {
                        e = e;
                        ReleaseLogUtil.b(str, "getReport error:", LogAnonymous.b(e));
                        return jSONObject;
                    }
                } else {
                    str = "Suggestion_WeekReportManager";
                }
                jSONObject.put("weightTrend", c(jB, jD3));
                e(i, this.d, listA, jB, jD3);
                jSONObject.put("content", b(i));
                return jSONObject;
            } catch (JSONException e2) {
                e = e2;
                str = "Suggestion_WeekReportManager";
                ReleaseLogUtil.b(str, "getReport error:", LogAnonymous.b(e));
                return jSONObject;
            }
        } catch (JSONException e3) {
            e = e3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001f  */
    private long b(boolean z, long j, long j2, int i) {
        long jC;
        if (z) {
            jC = ift.c(j, -1);
            if (hvu.g(this.d) == 2) {
                jC = j2;
            }
        } else {
            jC = ift.c(j, 0);
            if (hvu.g(this.d) == 1) {
                jC = j2;
            }
        }
        return i == 2 ? j2 : jC;
    }

    private long d(boolean z, long j, long j2, int i) {
        long jC;
        if (z) {
            jC = ift.a(j, -1);
        } else {
            jC = ift.c(j);
        }
        if (i == 2) {
            return j2 < j ? j2 : j;
        }
        return jC;
    }

    private JSONObject d(IntPlan intPlan, int i, int i2, long j) {
        ReleaseLogUtil.c("Suggestion_WeekReportManager", "getOverview");
        JSONObject jSONObject = new JSONObject();
        UserProfileMgrApi userProfileMgrApi = (UserProfileMgrApi) Services.d("HWUserProfileMgr", UserProfileMgrApi.class);
        UserProfileBean userProfileBean = new UserProfileBean();
        float fB = b(userProfileMgrApi, userProfileBean);
        float fB2 = b(j);
        Goal goal = intPlan.getGoal("weight");
        if (goal != null) {
            Float f = (Float) goal.getGoalDst();
            float fFloatValue = f.floatValue();
            e(fFloatValue, fB);
            try {
                jSONObject.put("origin", String.valueOf(fB2));
                jSONObject.put("current", String.valueOf(fB));
                jSONObject.put(ParsedFieldTag.GOAL, String.valueOf(fFloatValue));
                jSONObject.put("expected", String.valueOf(d(fB2, fB, i, i2)));
                ArrayList arrayList = new ArrayList();
                arrayList.add(new GoalBean("currentWeight", Float.valueOf(fB)));
                arrayList.add(new GoalBean("weightLoss", Float.valueOf(fB2 - fFloatValue)));
                arrayList.add(new GoalBean("weight", f));
                userProfileBean.setWeight(Math.max(30.0f, fB2));
                PlanInputInfoBean planInputInfoBean = new PlanInputInfoBean();
                planInputInfoBean.setUserInfo(userProfileBean);
                this.e.setPlanInput(planInputInfoBean);
                this.e.setGoals(arrayList);
                return jSONObject;
            } catch (JSONException e) {
                ReleaseLogUtil.b("Suggestion_WeekReportManager", "getOverview error:", LogAnonymous.b(e));
            }
        }
        return jSONObject;
    }

    private float b(long j) {
        HiUserPreference userPreference = HiHealthManager.d(BaseApplication.b()).getUserPreference("custom.start_weight_base");
        float f = userPreference != null ? CommonUtil.f(userPreference.getValue()) : 0.0f;
        return f < 1.0f ? iun.a(ift.a(j), ift.d(j)) : f;
    }

    private float b(UserProfileMgrApi userProfileMgrApi, UserProfileBean userProfileBean) {
        float fC;
        UserInfomation userInfo;
        if (userProfileMgrApi == null || (userInfo = userProfileMgrApi.getUserInfo()) == null) {
            fC = 0.0f;
        } else {
            JSONObject jSONObject = new JSONObject();
            fC = iun.c();
            try {
                jSONObject.put("height", userInfo.getHeight());
                jSONObject.put(CommonConstant.KEY_GENDER, userInfo.getGender());
                jSONObject.put("age", userInfo.getAge());
                jSONObject.put("weight", userInfo.getWeight());
                int iMin = 65;
                if (userInfo.getAge() <= 65) {
                    iMin = Math.min(userInfo.getAge(), 18);
                }
                userProfileBean.setAge(iMin);
                userProfileBean.setHeight(Math.max(50, userInfo.getHeight()));
                userProfileBean.setGender(userInfo.getGender());
                userProfileBean.setWeight(fC);
            } catch (JSONException unused) {
                LogUtil.e("Suggestion_WeekReportManager", "get userInfo error");
            }
        }
        return Math.max(0.0f, fC);
    }

    private static void e(float f, float f2) {
        int i = f2 <= f ? 1 : 0;
        HashMap map = new HashMap(1);
        map.put(ParsedFieldTag.GOAL, Integer.valueOf(i));
        lmf.d().c(com.huawei.hwcommonmodel.application.BaseApplication.getContext(), AnalyticsValue.INT_PLAN_1120048.value(), map, 0);
    }

    private float d(float f, float f2, int i, int i2) {
        float f3 = i2;
        float f4 = (((f2 - f) * f3) / i) + f2;
        double d = f;
        float fDoubleValue = (float) (d - ((((double) (f3 / 7.0f)) * f37203b.doubleValue()) * d));
        if (fDoubleValue > f2 || f4 > f2) {
            return f2;
        }
        return fDoubleValue < f4 ? fDoubleValue : f4;
    }

    private JSONObject d(int i, IntPlan intPlan, boolean z, long j) {
        ReleaseLogUtil.c("Suggestion_WeekReportManager", "getTrain");
        JSONObject jSONObject = new JSONObject();
        int iE = e(z, intPlan, i);
        try {
            JSONArray jSONArray = new JSONArray();
            for (int i2 = 1; i2 < iE; i2++) {
                d(intPlan, jSONArray, i2);
            }
            jSONObject.put("list", jSONArray);
            jSONObject.put("complete", intPlan.getStat("progress").getValue());
            if (((RecordApi) Services.d("CoursePlanService", RecordApi.class)) == null) {
                LogUtil.j("Suggestion_WeekReportManager", "recordApi is null.");
                return jSONObject;
            }
            Map<String, Integer> mapI = btw.i(intPlan);
            jSONObject.put(ParsedFieldTag.NPES_SPORT_TIME, mapI.get("totalDuration"));
            jSONObject.put("consumes", mapI.get(BleConstants.TOTAL_CALORIES));
            return jSONObject;
        } catch (JSONException e) {
            ReleaseLogUtil.b("Suggestion_WeekReportManager", "getTrain error:", LogAnonymous.b(e));
            return jSONObject;
        }
    }

    private void d(IntPlan intPlan, JSONArray jSONArray, int i) throws JSONException {
        int i2;
        IntWeekPlan weekInfoByOrder = intPlan.getWeekInfoByOrder(i);
        int i3 = 0;
        if (weekInfoByOrder != null) {
            int i4 = 0;
            i2 = 0;
            for (int i5 = 0; i5 < weekInfoByOrder.getDayCount(); i5++) {
                IntDayPlan dayByIdx = weekInfoByOrder.getDayByIdx(i5);
                if (dayByIdx != null && dayByIdx.getInPlanActionCnt() > 0) {
                    i2 += dayByIdx.getPunchFlag() != 1 ? 0 : 1;
                    i4++;
                }
            }
            i3 = i4;
        } else {
            i2 = 0;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("total", i3);
        jSONObject.put("complete", i2);
        jSONArray.put(jSONObject);
    }

    private int e(boolean z, IntPlan intPlan, int i) {
        int iG;
        if (z) {
            iG = hvu.g(intPlan);
        } else {
            iG = hvu.g(intPlan) + 1;
        }
        return i == 2 ? intPlan.getMetaInfo().getWeekCount() + 1 : iG;
    }

    private List<vgo> a(long j, long j2) {
        int iA = DateFormatUtil.a(j);
        int iA2 = DateFormatUtil.a(j2);
        final ArrayList arrayList = new ArrayList();
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        ReleaseLogUtil.c("Suggestion_WeekReportManager", "getDietRecordList startTime ", Long.valueOf(j), " endTime ", Long.valueOf(j2), " startDate ", Integer.valueOf(iA), " endDate ", Integer.valueOf(iA2));
        iun.c(iA, iA2, new ResponseCallback() { // from class: hvf
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i, Object obj) {
                hvh.c(arrayList, countDownLatch, i, (List) obj);
            }
        });
        try {
            if (!countDownLatch.await(6000L, TimeUnit.MILLISECONDS)) {
                ReleaseLogUtil.d("Suggestion_WeekReportManager", "getDietRecordList wait timeout");
                return arrayList;
            }
        } catch (InterruptedException e) {
            ReleaseLogUtil.b("Suggestion_WeekReportManager", "getDietRecordList exception ", ExceptionUtils.c(e));
        }
        return arrayList;
    }

    static /* synthetic */ void c(List list, CountDownLatch countDownLatch, int i, List list2) {
        LogUtil.a("Suggestion_WeekReportManager", "getDietRecordList errorCode ", Integer.valueOf(i), " list ", list2);
        if (njy.b(list2) && ((vgo) list2.get(0)) != null) {
            list.addAll(list2);
        }
        countDownLatch.countDown();
    }

    private JSONObject b(IntPlan intPlan, long j, long j2, boolean z) {
        ReleaseLogUtil.c("Suggestion_WeekReportManager", "getSummary");
        CourseApi courseApi = (CourseApi) Services.d("CoursePlanService", CourseApi.class);
        if (courseApi == null) {
            ReleaseLogUtil.d("Suggestion_WeekReportManager", "courseApi is null");
            return new JSONObject();
        }
        int[] iArr = {0};
        ArrayList arrayList = new ArrayList();
        while (j <= j2) {
            IntDayPlan intDayPlanB = b(intPlan, j);
            if (intDayPlanB != null && intDayPlanB.getInPlanActionCnt() > 0) {
                a(intDayPlanB, arrayList);
            }
            j = lsl.w(j);
        }
        ReleaseLogUtil.c("Suggestion_WeekReportManager", "begin to query summary");
        CountDownLatch countDownLatch = new CountDownLatch(1);
        e(courseApi, arrayList, countDownLatch, iArr);
        b(countDownLatch);
        ReleaseLogUtil.c("Suggestion_WeekReportManager", "end to query summary");
        RecordApi recordApi = (RecordApi) Services.d("CoursePlanService", RecordApi.class);
        JSONObject jSONObject = new JSONObject();
        if (recordApi == null) {
            ReleaseLogUtil.d("Suggestion_WeekReportManager", "recordApi is null.");
            return jSONObject;
        }
        c(jSONObject, intPlan, iArr, z);
        return jSONObject;
    }

    private void a(IntDayPlan intDayPlan, List<gzl> list) {
        for (int i = 0; i < intDayPlan.getInPlanActionCnt(); i++) {
            IntAction inPlanAction = intDayPlan.getInPlanAction(i);
            if (inPlanAction != null && !TextUtils.isEmpty(inPlanAction.getActionId())) {
                list.add(new gzl.a(inPlanAction.getActionId()).c());
            }
        }
    }

    private void b(CountDownLatch countDownLatch) {
        try {
            if (countDownLatch.await(6000L, TimeUnit.MILLISECONDS)) {
                return;
            }
            LogUtil.j("Suggestion_WeekReportManager", "getSummary wait timeout");
        } catch (InterruptedException unused) {
            LogUtil.e("Suggestion_WeekReportManager", "interrupted while waiting for getCourseById");
        }
    }

    private void e(CourseApi courseApi, List<gzl> list, final CountDownLatch countDownLatch, final int[] iArr) {
        courseApi.getCourseByIds(list, false, new UiCallback<List<FitWorkout>>() { // from class: hvh.2
            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            public void onFailure(int i, String str) {
                LogUtil.j("Suggestion_WeekReportManager", "getCourseByIds fail,", str);
                countDownLatch.countDown();
            }

            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onSuccess(List<FitWorkout> list2) {
                if (njy.e(list2)) {
                    LogUtil.a("Suggestion_WeekReportManager", "data is empty");
                    countDownLatch.countDown();
                    return;
                }
                LogUtil.a("Suggestion_WeekReportManager", "data is ", list2);
                for (FitWorkout fitWorkout : list2) {
                    int[] iArr2 = iArr;
                    iArr2[0] = iArr2[0] + fitWorkout.acquireDuration();
                }
                LogUtil.a("Suggestion_WeekReportManager", "total duration is ", Integer.valueOf(iArr[0]));
                countDownLatch.countDown();
            }
        });
    }

    private void c(JSONObject jSONObject, IntPlan intPlan, int[] iArr, boolean z) {
        int iH;
        if (z) {
            iH = btw.h(intPlan) - 1;
        } else {
            iH = btw.h(intPlan);
        }
        Map<String, Integer> mapB = btw.b(intPlan, iH);
        try {
            jSONObject.put(ParsedFieldTag.NPES_SPORT_TIME, mapB.get("totalDuration"));
            jSONObject.put("consumes", mapB.get(BleConstants.TOTAL_CALORIES));
            jSONObject.put(ParsedFieldTag.GOAL, iArr[0] / 60);
        } catch (JSONException e) {
            ReleaseLogUtil.b("Suggestion_WeekReportManager", "getSummary error:", LogAnonymous.b(e));
        }
    }

    private JSONObject c(IntPlan intPlan, List<vgo> list, long j, long j2) {
        ReleaseLogUtil.c("Suggestion_WeekReportManager", "getHeatAnalysis");
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (long jW = j; jW <= j2; jW = lsl.w(jW)) {
            try {
                IntDayPlan intDayPlanB = b(intPlan, jW);
                vgo vgoVarC = c(list, jW);
                if (intDayPlanB != null && vgoVarC != null) {
                    vfy vfyVarD = vgoVarC.d();
                    int iH = (int) (i2 + vfyVarD.h());
                    int iE = ezn.e(vfyVarD);
                    int i4 = i3 + iE;
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("time", DateFormatUtil.d(vgoVarC.c()));
                    jSONObject3.put("inTake", vfyVarD.h());
                    jSONObject3.put("consumes", iE);
                    jSONObject3.put("total", Math.abs(iE - vfyVarD.h()));
                    jSONObject3.put("rest", intDayPlanB.getInPlanActionCnt() == 0 ? 1 : 0);
                    jSONArray.put(jSONObject3);
                    i++;
                    i3 = i4;
                    i2 = iH;
                }
            } catch (JSONException e) {
                StringBuilder sb = new StringBuilder("getHeatAnalysis error:");
                sb.append(LogAnonymous.b(e));
                sb.append(" heatAnalysis:");
                sb.append(jSONObject);
                LogUtil.e("Suggestion_WeekReportManager", sb.toString());
                RiskBiAnalytics.e(RiskBiAnalytics.FitPLANRiskType.RISK_TYPE_HEAT_ANALYSIS.value(), sb.toString());
                ReleaseLogUtil.b("Suggestion_WeekReportManager", "getHeatAnalysis error:", LogAnonymous.b(e));
                return jSONObject;
            }
        }
        int iMax = Math.max(1, i);
        jSONObject2.put("inTake", i2 / iMax);
        jSONObject2.put("consumes", i3 / iMax);
        jSONObject2.put("total", Math.abs(i2 - i3) / iMax);
        jSONObject.put("overview", jSONObject2);
        jSONObject.put("list", jSONArray);
        return jSONObject;
    }

    private JSONObject c(IntPlan intPlan, List<vgo> list, int i) {
        JSONObject jSONObject = new JSONObject();
        ReleaseLogUtil.c("Suggestion_WeekReportManager", "getDietSummary dayCount : ", Integer.valueOf(i));
        if (intPlan == null || i == 0) {
            ReleaseLogUtil.b("Suggestion_WeekReportManager", "getDietSummary currentPlan null or dayCount is 0");
            return jSONObject;
        }
        b(list, intPlan, jSONObject, i);
        return jSONObject;
    }

    private void b(List<vgo> list, IntPlan intPlan, JSONObject jSONObject, int i) {
        try {
            double dE = 0.0d;
            int iE = 0;
            int iE2 = 0;
            int iE3 = 0;
            double dH = 0.0d;
            for (vgo vgoVar : list) {
                if (b(intPlan, DateFormatUtil.d(vgoVar.c())) != null) {
                    vfy vfyVarD = vgoVar.d();
                    dE += (double) vfyVarD.e();
                    dH += (double) vfyVarD.h();
                    vfyVarD.d();
                    for (vgw vgwVar : vgoVar.a()) {
                        int i2 = vgwVar.i();
                        if (i2 == 10 || i2 == 11) {
                            iE = (int) (iE + vgwVar.e());
                        } else if (i2 == 20 || i2 == 21) {
                            iE2 = (int) (iE2 + vgwVar.e());
                        } else if (i2 == 30 || i2 == 31) {
                            iE3 = (int) (iE3 + vgwVar.e());
                        }
                    }
                }
            }
            double d = i;
            double d2 = dE / d;
            jSONObject.put(ParsedFieldTag.GOAL, d2);
            jSONObject.put("type", 1);
            c(i, iE, iE2, iE3, jSONObject);
            jSONObject.put("content", c(d2, dH / d));
        } catch (JSONException e) {
            ReleaseLogUtil.b("Suggestion_WeekReportManager", "getDietSummary error:", LogAnonymous.b(e));
        }
    }

    private void c(int i, int i2, int i3, int i4, JSONObject jSONObject) throws JSONException {
        JSONObject jSONObjectA = a(10, i2 / i);
        JSONObject jSONObjectA2 = a(20, i3 / i);
        JSONObject jSONObjectA3 = a(30, i4 / i);
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(jSONObjectA);
        jSONArray.put(jSONObjectA2);
        jSONArray.put(jSONObjectA3);
        jSONObject.put("list", jSONArray);
    }

    private JSONObject a(int i, int i2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("whichMeal", i);
        jSONObject.put("kiloCalorie", i2);
        return jSONObject;
    }

    private String c(double d, double d2) {
        final String[] strArr = {""};
        IntPlanBean intPlanBean = this.e;
        if (intPlanBean != null && intPlanBean.getPlanInput() != null && this.e.getPlanInput().getUserInfo() != null) {
            double weight = this.e.getPlanInput().getUserInfo().getWeight();
            double height = ((double) this.e.getPlanInput().getUserInfo().getHeight()) / 100.0d;
            if (weight > 0.0d && height > 0.0d && d > 0.0d && d2 > 0.0d) {
                final CountDownLatch countDownLatch = new CountDownLatch(1);
                hdn.c().getDietSummaryCloud(weight, height, (int) d, (int) d2, new UiCallback<JSONObject>() { // from class: hvh.5
                    @Override // com.huawei.basefitnessadvice.callback.UiCallback
                    public void onFailure(int i, String str) {
                        LogUtil.j("Suggestion_WeekReportManager", "errorCode:", Integer.valueOf(i), MyLocationStyle.ERROR_INFO, str);
                        countDownLatch.countDown();
                    }

                    @Override // com.huawei.basefitnessadvice.callback.UiCallback
                    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
                    public void onSuccess(JSONObject jSONObject) {
                        if (jSONObject != null) {
                            String strOptString = jSONObject.optString("dietSummary");
                            if (!TextUtils.isEmpty(strOptString)) {
                                strArr[0] = strOptString;
                            }
                        }
                        countDownLatch.countDown();
                    }
                });
                try {
                    if (!countDownLatch.await(6000L, TimeUnit.MILLISECONDS)) {
                        LogUtil.j("Suggestion_WeekReportManager", "getDietSummaryCloud wait timeout");
                    }
                } catch (InterruptedException unused) {
                    LogUtil.e("Suggestion_WeekReportManager", "interrupted while waiting for getDietSummaryCloud");
                }
            } else {
                LogUtil.j("Suggestion_WeekReportManager", "getDietSummaryCloud :", Double.valueOf(weight), ",", Double.valueOf(height), ",", Double.valueOf(d), ",", Double.valueOf(d2));
            }
        }
        return strArr[0];
    }

    private JSONObject e(IntPlan intPlan, List<vgo> list, int i) {
        String str;
        JSONObject jSONObject;
        ReleaseLogUtil.c("Suggestion_WeekReportManager", "getNutrientAnalysis");
        JSONObject jSONObject2 = new JSONObject();
        int iA = DateFormatUtil.a(0L);
        try {
            float f = 0.0f;
            float f2 = 0.0f;
            float f3 = 0.0f;
            float f4 = 0.0f;
            float f5 = 0.0f;
            int i2 = 0;
            int i3 = 0;
            float f6 = 0.0f;
            for (vgo vgoVar : list) {
                int i4 = iA;
                try {
                    IntDayPlan intDayPlanB = b(intPlan, DateFormatUtil.d(vgoVar.c()));
                    if (intDayPlanB == null) {
                        iA = i4;
                    } else {
                        Iterator<vgw> it = vgoVar.a().iterator();
                        int i5 = i3;
                        int i6 = i2;
                        float fB = f5;
                        float fB2 = f4;
                        float fI = f3;
                        float fC = f2;
                        float fI2 = f6;
                        float fC2 = f;
                        int iC = i4;
                        while (it.hasNext()) {
                            for (vgu vguVar : it.next().c()) {
                                if (intDayPlanB.getInPlanActionCnt() == 0) {
                                    if (iC != vgoVar.c()) {
                                        i5++;
                                        iC = vgoVar.c();
                                    }
                                    fB += vguVar.b();
                                    fI += vguVar.i();
                                    fC += vguVar.c();
                                } else {
                                    if (iC != vgoVar.c()) {
                                        i6++;
                                        iC = vgoVar.c();
                                    }
                                    fB2 += vguVar.b();
                                    fI2 += vguVar.i();
                                    fC2 += vguVar.c();
                                }
                            }
                        }
                        iA = iC;
                        f = fC2;
                        f6 = fI2;
                        f2 = fC;
                        f3 = fI;
                        f4 = fB2;
                        f5 = fB;
                        i2 = i6;
                        i3 = i5;
                    }
                } catch (JSONException e) {
                    e = e;
                    str = "Suggestion_WeekReportManager";
                    ReleaseLogUtil.b(str, "getNutrientAnalysis error:", LogAnonymous.b(e));
                    return jSONObject2;
                }
            }
            JSONObject jSONObject3 = new JSONObject();
            JSONObject jSONObject4 = new JSONObject();
            if (i2 != 0) {
                float f7 = i2;
                str = "Suggestion_WeekReportManager";
                jSONObject = jSONObject2;
                try {
                    jSONObject3.put("carbohydrate", f / f7);
                    jSONObject3.put("protein", f6 / f7);
                    jSONObject3.put("fat", f4 / f7);
                } catch (JSONException e2) {
                    e = e2;
                    jSONObject2 = jSONObject;
                    ReleaseLogUtil.b(str, "getNutrientAnalysis error:", LogAnonymous.b(e));
                    return jSONObject2;
                }
            } else {
                str = "Suggestion_WeekReportManager";
                jSONObject = jSONObject2;
            }
            if (i3 != 0) {
                float f8 = i3;
                jSONObject4.put("carbohydrate", f2 / f8);
                jSONObject4.put("protein", f3 / f8);
                jSONObject4.put("fat", f5 / f8);
            }
            jSONObject2 = jSONObject;
            try {
                jSONObject2.put("trainingDay", jSONObject3);
                jSONObject2.put("restDay", jSONObject4);
                return jSONObject2;
            } catch (JSONException e3) {
                e = e3;
                ReleaseLogUtil.b(str, "getNutrientAnalysis error:", LogAnonymous.b(e));
                return jSONObject2;
            }
        } catch (JSONException e4) {
            e = e4;
        }
    }

    private JSONArray c(long j, long j2) {
        ReleaseLogUtil.c("Suggestion_WeekReportManager", "getWeightTrend");
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        hiAggregateOption.setTimeRange(ift.a(j), ift.d(j2));
        hiAggregateOption.setAggregateType(4);
        hiAggregateOption.setGroupUnitType(0);
        WeightApi weightApi = (WeightApi) Services.d("Main", WeightApi.class);
        JSONArray jSONArray = new JSONArray();
        long[] jArr = {0};
        if (weightApi != null) {
            e(jArr, weightApi, hiAggregateOption, jSONArray);
        }
        return jSONArray;
    }

    private void e(final long[] jArr, WeightApi weightApi, HiAggregateOption hiAggregateOption, final JSONArray jSONArray) {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        weightApi.getWeightData(hiAggregateOption, new WeightCallback() { // from class: hvh.1
            @Override // com.huawei.ui.main.stories.health.weight.callback.WeightCallback
            public void getWeight(ArrayList<vfv> arrayList) {
                hvh.this.d(arrayList, jSONArray, jArr);
                countDownLatch.countDown();
            }
        });
        try {
            if (countDownLatch.await(6000L, TimeUnit.MILLISECONDS)) {
                return;
            }
            LogUtil.j("Suggestion_WeekReportManager", "getWeightData wait timeout");
        } catch (InterruptedException unused) {
            LogUtil.e("Suggestion_WeekReportManager", "interrupted while waiting for getWeightTrend");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(ArrayList<vfv> arrayList, JSONArray jSONArray, long[] jArr) {
        IntPlanBean intPlanBean;
        if (arrayList != null && arrayList.size() > 0) {
            e(arrayList, jArr, jSONArray);
        }
        if (jSONArray.length() > 0) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(jSONArray.length() - 1);
                if (jSONObject == null || (intPlanBean = this.e) == null || intPlanBean.getPlanInput() == null || this.e.getPlanInput().getUserInfo() == null) {
                    return;
                }
                this.e.getPlanInput().getUserInfo().setBfr(jSONObject.getLong("fatRate"));
            } catch (JSONException unused) {
                LogUtil.e("Suggestion_WeekReportManager", "getWeight and bfr error");
            }
        }
    }

    private void e(ArrayList<vfv> arrayList, long[] jArr, JSONArray jSONArray) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            vfv vfvVar = arrayList.get(size);
            if (ift.a(jArr[0]) != ift.a(vfvVar.b())) {
                try {
                    jArr[0] = vfvVar.b();
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("time", vfvVar.b());
                    jSONObject.put("weight", vfvVar.d());
                    jSONObject.put("fatRate", vfvVar.c());
                    jSONArray.put(jSONObject);
                } catch (JSONException unused) {
                    LogUtil.e("Suggestion_WeekReportManager", "getWeightData error");
                }
            }
        }
    }

    private IntDayPlan b(IntPlan intPlan, long j) {
        if (intPlan == null) {
            return null;
        }
        int iE = lsl.e(DateFormatUtil.d(btw.f(intPlan)), j);
        int iO = lsl.o(j);
        IntWeekPlan weekInfoByOrder = intPlan.getWeekInfoByOrder(iE);
        if (weekInfoByOrder != null) {
            return weekInfoByOrder.getDayByOrder(iO);
        }
        return null;
    }

    private List<IntActionBean> d(IntPlan intPlan, final vgo vgoVar, long j) {
        final ArrayList arrayList = new ArrayList();
        if (Utils.o()) {
            b(arrayList, vgoVar);
            return arrayList;
        }
        hcz hczVar = new hcz();
        String strValueOf = String.valueOf(1000);
        vfy vfyVarD = vgoVar.d();
        if (vfyVarD != null) {
            strValueOf = String.valueOf(Math.min(Math.max(1000, Math.round(vfyVarD.e())), 10000));
        }
        hczVar.c(strValueOf);
        hczVar.a(vfyVarD);
        String str = new SimpleDateFormat("yyyy-MM-dd").format(Long.valueOf(j));
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        hdn.c().getFoodRecommendDetail(intPlan.getPlanId(), str, hczVar, new UiCallback<hdh>() { // from class: hvh.10
            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            public void onFailure(int i, String str2) {
                LogUtil.j("Suggestion_WeekReportManager", "errorCode:", Integer.valueOf(i), MyLocationStyle.ERROR_INFO, str2);
                countDownLatch.countDown();
            }

            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onSuccess(hdh hdhVar) {
                LogUtil.a("Suggestion_WeekReportManager", "getScheduleAction response ", HiJsonUtil.d(hdhVar));
                if (hdhVar != null) {
                    hvh.this.c(hdhVar.d(), (List<IntActionBean>) arrayList, vgoVar);
                }
                countDownLatch.countDown();
            }
        });
        try {
            if (!countDownLatch.await(6000L, TimeUnit.MILLISECONDS)) {
                LogUtil.j("Suggestion_WeekReportManager", "getFoodRecommendDetail wait timeout");
                return arrayList;
            }
        } catch (InterruptedException unused) {
            LogUtil.e("Suggestion_WeekReportManager", "interrupted while waiting for getScheduleAction");
        }
        return arrayList;
    }

    private void b(List<IntActionBean> list, vgo vgoVar) {
        List<vgw> listA = vgoVar.a();
        if (njy.e(listA)) {
            LogUtil.j("Suggestion_WeekReportManager", "handleFoodAction() meals is empty");
            return;
        }
        for (vgw vgwVar : listA) {
            IntActionBean intActionBeanE = e(vgwVar);
            int i = vgwVar.i();
            if (i == 10 || i == 11) {
                intActionBeanE.setPunchTime(0L);
            } else if (i == 20 || i == 21) {
                intActionBeanE.setPunchTime(1L);
            } else if (i == 30 || i == 31) {
                intActionBeanE.setPunchTime(2L);
            } else {
                intActionBeanE.setPunchTime(0L);
                LogUtil.j("Suggestion_WeekReportManager", "handleFoodAction WhichMeal = ", Integer.valueOf(vgwVar.i()));
            }
            list.add(intActionBeanE);
        }
    }

    private IntActionBean e(vgw vgwVar) {
        IntActionBean intActionBean = new IntActionBean();
        intActionBean.setActionId(Integer.toString(vgwVar.i()));
        intActionBean.setActionType(2);
        intActionBean.setPunchFlag(1);
        return intActionBean;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(hdf hdfVar, List<IntActionBean> list, vgo vgoVar) {
        if (hdfVar != null) {
            if (hdfVar.c() != null && hdfVar.c().size() > 0) {
                for (hdc hdcVar : hdfVar.c()) {
                    IntActionBean intActionBean = new IntActionBean();
                    intActionBean.setActionId(hdcVar.c());
                    intActionBean.setActionType(2);
                    intActionBean.setPunchFlag(e(vgoVar, hdcVar, 10));
                    intActionBean.setPunchTime(0L);
                    list.add(intActionBean);
                }
            }
            if (hdfVar.a() != null && hdfVar.a().size() > 0) {
                for (hdc hdcVar2 : hdfVar.a()) {
                    IntActionBean intActionBean2 = new IntActionBean();
                    intActionBean2.setActionId(hdcVar2.c());
                    intActionBean2.setActionType(2);
                    intActionBean2.setPunchFlag(e(vgoVar, hdcVar2, 20));
                    intActionBean2.setPunchTime(1L);
                    list.add(intActionBean2);
                }
            }
            if (hdfVar.b() == null || hdfVar.b().size() <= 0) {
                return;
            }
            for (hdc hdcVar3 : hdfVar.b()) {
                IntActionBean intActionBean3 = new IntActionBean();
                intActionBean3.setActionId(hdcVar3.c());
                intActionBean3.setActionType(2);
                intActionBean3.setPunchFlag(e(vgoVar, hdcVar3, 30));
                intActionBean3.setPunchTime(2L);
                list.add(intActionBean3);
            }
        }
    }

    private vgo c(List<vgo> list, long j) {
        int iA = DateFormatUtil.a(j);
        for (vgo vgoVar : list) {
            if (vgoVar != null && vgoVar.c() == iA) {
                return vgoVar;
            }
        }
        return null;
    }

    private int e(vgo vgoVar, hdc hdcVar, int i) {
        if (vgoVar == null) {
            return 0;
        }
        for (vgw vgwVar : vgoVar.a()) {
            for (vgu vguVar : vgwVar.c()) {
                if (vgwVar.i() == i && vguVar.e().equals(hdcVar.c())) {
                    return 1;
                }
            }
        }
        return 0;
    }

    private List<StatInfoBean> a(vgo vgoVar, long j) {
        ArrayList arrayList = new ArrayList();
        float fA = iun.a(ift.a(j), ift.d(j));
        if (fA > 0.0f) {
            arrayList.add(new StatInfoBean("currentWeight", Float.valueOf(fA)));
        }
        vfy vfyVarD = vgoVar.d();
        if (vfyVarD != null) {
            arrayList.add(new StatInfoBean("inTakeCalorie", Float.valueOf(vfyVarD.h())));
            arrayList.add(new StatInfoBean("sportConsumeCalorie", Float.valueOf(vfyVarD.a())));
            arrayList.add(new StatInfoBean("restingCalorie", Float.valueOf(0.0f)));
        }
        return arrayList;
    }

    private List<DayPlanBean> d(IntPlan intPlan, List<vgo> list, long j, long j2) {
        ArrayList arrayList = new ArrayList();
        while (j <= j2) {
            IntDayPlan intDayPlanB = b(intPlan, j);
            vgo vgoVarC = c(list, j);
            if (intDayPlanB != null && vgoVarC != null) {
                DayPlanBean dayPlanBean = new DayPlanBean();
                dayPlanBean.setDayOrder(intDayPlanB.getDayOrder());
                dayPlanBean.setScheduledAction(d(intPlan, vgoVarC, j));
                dayPlanBean.setStatistics(a(vgoVarC, j));
                arrayList.add(dayPlanBean);
            }
            LogUtil.a("Suggestion_WeekReportManager", "getDayPlans time:", Long.valueOf(j));
            j = lsl.w(j);
        }
        return arrayList;
    }

    private void e(int i, IntPlan intPlan, List<vgo> list, long j, long j2) {
        long jE = j;
        ReleaseLogUtil.c("Suggestion_WeekReportManager", "setWeekPlans startTime:", Long.valueOf(j), " endTime:", Long.valueOf(j2));
        ArrayList arrayList = new ArrayList();
        if (i == 2) {
            while (jE <= j2) {
                long jE2 = lsl.e(jE, 2, 0);
                long jB = lsl.b(jE, 2, 0);
                List<DayPlanBean> listD = d(intPlan, list, jE2, jB);
                IntWeekPlanBean intWeekPlanBean = new IntWeekPlanBean();
                intWeekPlanBean.setWeekOrder(hvu.a(intPlan, jE));
                intWeekPlanBean.setDayPlans(listD);
                arrayList.add(intWeekPlanBean);
                LogUtil.a("Suggestion_WeekReportManager", "setWeekPlans time:", Long.valueOf(jE), " finalStartTime:", Long.valueOf(jE2), " finalEndTime:", Long.valueOf(jB));
                jE = lsl.e(jE, 2, 1);
            }
            this.e.setWeekPlans(arrayList);
            PlanMetaInfoBean planMetaInfoBean = new PlanMetaInfoBean();
            planMetaInfoBean.setPlanId(intPlan.getPlanId());
            this.e.setMetaInfo(planMetaInfoBean);
            return;
        }
        long jD = DateFormatUtil.d(btw.f(intPlan));
        int iE = lsl.e(jD, jE);
        int i2 = iE + 1;
        if (i2 > 1) {
            long jC = i2 == 2 ? jD : ift.c(jE, -1);
            long jA = ift.a(jC, 0);
            ReleaseLogUtil.c("Suggestion_WeekReportManager", "weekOrder:", Integer.valueOf(i2), " lastStartTime:", Long.valueOf(jC), " lastEndTime:", Long.valueOf(jA));
            List<DayPlanBean> listD2 = d(intPlan, a(jC, jA), jC, jA);
            IntWeekPlanBean intWeekPlanBean2 = new IntWeekPlanBean();
            intWeekPlanBean2.setWeekOrder(iE);
            intWeekPlanBean2.setDayPlans(listD2);
            arrayList.add(intWeekPlanBean2);
        }
        d(intPlan, i2, jD, j);
        List<DayPlanBean> listD3 = d(intPlan, list, j, j2);
        IntWeekPlanBean intWeekPlanBean3 = new IntWeekPlanBean();
        intWeekPlanBean3.setWeekOrder(i2);
        intWeekPlanBean3.setDayPlans(listD3);
        arrayList.add(intWeekPlanBean3);
        this.e.setWeekPlans(arrayList);
        PlanMetaInfoBean planMetaInfoBean2 = new PlanMetaInfoBean();
        planMetaInfoBean2.setPlanId(intPlan.getPlanId());
        this.e.setMetaInfo(planMetaInfoBean2);
    }

    private static void d(IntPlan intPlan, int i, long j, long j2) {
        if (i <= 0) {
            LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
            linkedHashMap.put("reportType", "week");
            linkedHashMap.put("planId", intPlan.getPlanId());
            linkedHashMap.put("timeZone", intPlan.getTimeZone());
            linkedHashMap.put("weekOrder", String.valueOf(i));
            linkedHashMap.put("planStartTime", String.valueOf(j));
            linkedHashMap.put("startTime", String.valueOf(j2));
            OpAnalyticsUtil.getInstance().setEvent2nd(OperationKey.HEALTH_APP_INT_PLAN_WEEK_NO_2129048.value(), linkedHashMap);
        }
    }
}
