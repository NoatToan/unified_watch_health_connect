package defpackage;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.huawei.basefitnessadvice.callback.DataCallback;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.basefitnessadvice.model.Plan;
import com.huawei.basefitnessadvice.model.intplan.IntPlan;
import com.huawei.health.course.api.CourseApi;
import com.huawei.health.courseplanservice.R;
import com.huawei.health.plan.api.PlanApi;
import com.huawei.health.sport.model.WorkoutRecord;
import com.huawei.health.sport.utils.ResultUtil;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcloudmodel.model.unite.GetRunLevelRsp;
import com.huawei.hwcloudmodel.model.unite.UserRunLevelData;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.AchieveDataApi;
import health.compact.a.Services;
import health.compact.a.UnitUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes29.dex */
public class gmz {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private pdx f35761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private PlanApi f35762c;
    private ghf d;
    private Plan e;

    private boolean b(int i, int i2) {
        if (i == 3) {
            return i2 < 1448;
        }
        if (i == 4) {
            return i2 < 3003;
        }
        if (i != 5) {
            return i == 6 && i2 < 13785;
        }
        return i2 < 6659;
    }

    public void a(final String str, final int i, final UiCallback<pdx> uiCallback) {
        if (uiCallback == null) {
            LogUtil.j("Suggestion_PlanReportManager", "getTrainReport callback is null");
            return;
        }
        PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
        this.f35762c = planApi;
        if (planApi == null) {
            LogUtil.e("Suggestion_PlanReportManager", "createFitnessPlan, createPlan : planApi is null.");
            d(str, i, uiCallback);
        } else {
            gmi.b().b(new UiCallback<ghf>() { // from class: gmz.5
                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                public void onFailure(int i2, String str2) {
                    LogUtil.j("Suggestion_PlanReportManager", "getDoingIntPlan fail errCode:", Integer.valueOf(i2), ",errInfo:", str2);
                    gmz.this.d(str, i, (UiCallback<pdx>) uiCallback);
                }

                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
                public void onSuccess(ghf ghfVar) {
                    if (gmz.this.a(ghfVar)) {
                        LogUtil.a("Suggestion_PlanReportManager", "getCurrentPlan onSuccess data:", gmz.this.d.getMetaInfo().getName(), gmz.this.d.getPlanId());
                        if (!gmz.this.d.getPlanId().equals(str)) {
                            gmz.this.d(str, i, (UiCallback<pdx>) uiCallback);
                            return;
                        }
                        gmz gmzVar = gmz.this;
                        gmzVar.e = gmzVar.d.getCompatiblePlan();
                        gmz.this.b();
                        gmz.this.b(str, i, (UiCallback<pdx>) uiCallback);
                        return;
                    }
                    LogUtil.j("Suggestion_PlanReportManager", "getTrainReport mCurrentPlan is null");
                    gmz.this.d(str, i, (UiCallback<pdx>) uiCallback);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        pdx pdxVar = new pdx();
        this.f35761b = pdxVar;
        Plan plan = this.e;
        if (plan != null) {
            pdxVar.i(plan.acquireName());
            this.f35761b.c(this.e.getPicture());
            this.f35761b.e(this.e.getPbBeforePlan());
            this.f35761b.b(this.e.getTargetTime());
            this.f35761b.c(this.e.acquireGoal());
            this.f35761b.j(UnitUtil.d("yyyy/MM/dd", ieg.c(this.e.acquireStartDate(), "yyyy-MM-dd") * 1000));
            this.f35761b.a(UnitUtil.d("yyyy/MM/dd", ieg.c(this.e.getEndDate(), "yyyy-MM-dd") * 1000));
        }
        ghf ghfVar = this.d;
        if (ghfVar == null) {
            LogUtil.j("Suggestion_PlanReportManager", "initTrainReport mIntPlan == null");
            return;
        }
        this.f35761b.f(ghfVar.getTimeZone());
        if (this.d.getPlanTimeInfo() != null) {
            long beginDate = this.d.getPlanTimeInfo().getBeginDate();
            long endDate = this.d.getPlanTimeInfo().getEndDate();
            LogUtil.a("Suggestion_PlanReportManager", "startTime - endTime:", Long.valueOf(beginDate), "--", Long.valueOf(endDate));
            this.f35761b.b(beginDate);
            this.f35761b.a(endDate);
        }
        if (this.d.getIntroduction() != null) {
            this.f35761b.b(this.d.getIntroduction().acquireReportPageUrl());
            this.f35761b.e(this.d.getIntroduction().acquireReportPageTahitiUrl());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String str, int i, final UiCallback<pdx> uiCallback) {
        LogUtil.a("Suggestion_PlanReportManager", "getReportFromCloud planType:", Integer.valueOf(i));
        if (i == IntPlan.PlanType.FIT_PLAN.getType()) {
            c(str, i, uiCallback);
        } else {
            ghw.b().getTrainingReport(str, new DataCallback() { // from class: gmz.2
                @Override // com.huawei.basefitnessadvice.callback.DataCallback
                public void onFailure(int i2, String str2) {
                    LogUtil.j("Suggestion_PlanReportManager", "getTrainingReport fail");
                    uiCallback.onFailure(i2, str2);
                }

                @Override // com.huawei.basefitnessadvice.callback.DataCallback
                public void onSuccess(JSONObject jSONObject) {
                    gmz.this.b(jSONObject, (UiCallback<pdx>) uiCallback);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(JSONObject jSONObject, UiCallback<pdx> uiCallback) {
        if (jSONObject == null) {
            LogUtil.e("Suggestion_PlanReportManager", "onSuccess return null.");
            return;
        }
        LogUtil.d("Suggestion_PlanReportManager", "getTrainingReport onSuccess data", jSONObject.toString());
        String strOptString = jSONObject.optString("report");
        if (TextUtils.isEmpty(strOptString)) {
            LogUtil.j("Suggestion_PlanReportManager", "report isEmpty");
            uiCallback.onFailure(9999, ResultUtil.c(9999));
        } else {
            uiCallback.onSuccess((pdx) new Gson().fromJson(strOptString, new TypeToken<pdx>() { // from class: com.huawei.health.plan.model.data.intelligentplan.PlanReportManager$3
            }.getType()));
        }
    }

    private void c(String str, int i, final UiCallback<pdx> uiCallback) {
        ghw.b().getIntPlanReport(str, i, 2, new DataCallback() { // from class: gmz.4
            @Override // com.huawei.basefitnessadvice.callback.DataCallback
            public void onFailure(int i2, String str2) {
                LogUtil.j("Suggestion_PlanReportManager", "getReportFromCloudToGeneral fail errorCode: ", Integer.valueOf(i2), str2);
                uiCallback.onFailure(i2, str2);
            }

            @Override // com.huawei.basefitnessadvice.callback.DataCallback
            public void onSuccess(JSONObject jSONObject) {
                gmz.this.b(jSONObject, (UiCallback<pdx>) uiCallback);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str, int i, final UiCallback<pdx> uiCallback) {
        LogUtil.a("Suggestion_PlanReportManager", "get current plan report.");
        final int iA = btw.a(this.e, System.currentTimeMillis()) - 1;
        LogUtil.a("Suggestion_PlanReportManager", "current plan weekNumber:", Integer.valueOf(iA), "planType:", Integer.valueOf(i));
        this.f35761b.a(iA);
        d(str, i, new UiCallback<pdx>() { // from class: gmz.9
            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            public void onFailure(int i2, String str2) {
                gmz.this.d(iA, (UiCallback<pdx>) uiCallback);
            }

            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onSuccess(pdx pdxVar) {
                if (pdxVar == null || (pdxVar.p() != iA && pdxVar.p() != 100)) {
                    gmz.this.d(iA, (UiCallback<pdx>) uiCallback);
                } else {
                    uiCallback.onSuccess(pdxVar);
                }
            }
        });
    }

    public void d(String str, UiCallback<pdx> uiCallback) {
        if (uiCallback == null) {
            LogUtil.j("Suggestion_PlanReportManager", "buildFinalPlanReport callback is null");
            return;
        }
        PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
        this.f35762c = planApi;
        if (planApi == null) {
            LogUtil.e("Suggestion_PlanReportManager", "buildFinalPlanReport, createPlan : planApi is null.");
            uiCallback.onFailure(9999, null);
        } else {
            a(str, uiCallback);
        }
    }

    private void a(final String str, final UiCallback<pdx> uiCallback) {
        gmi.b().b(new UiCallback<ghf>() { // from class: gmz.7
            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            public void onFailure(int i, String str2) {
                LogUtil.e("Suggestion_PlanReportManager", "buildFinalPlanReport fail with errorCode ", Integer.valueOf(i));
                uiCallback.onFailure(i, str2);
            }

            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onSuccess(ghf ghfVar) {
                if (!gmz.this.a(ghfVar)) {
                    uiCallback.onSuccess(null);
                    return;
                }
                LogUtil.a("Suggestion_PlanReportManager", "getCurrentPlan onSuccess data:", gmz.this.d.getMetaInfo().getName(), gmz.this.d.getPlanId());
                if (gmz.this.d.getPlanId().equals(str)) {
                    gmz.this.b();
                    gmz.this.f35761b.a(100);
                    List<pdq> planWeekDataList = gmz.this.e.getPlanWeekDataList();
                    List<ghe> listB = gmz.this.d.b();
                    if (njy.e(listB)) {
                        LogUtil.j("Suggestion_PlanReportManager", "weekInfoList empty.");
                        uiCallback.onSuccess(null);
                        return;
                    }
                    ArrayList arrayList = new ArrayList(listB.size());
                    ArrayList arrayList2 = new ArrayList(listB.size());
                    int iC = ift.c(gmz.this.e.getStartTime() * 1000, System.currentTimeMillis());
                    if (gmz.this.d.getPlanType().equals(IntPlan.PlanType.AI_RUN_PLAN)) {
                        gmz.this.a(planWeekDataList, arrayList, arrayList2);
                    } else {
                        planWeekDataList = gnw.c(listB);
                        gmz.this.d(listB, arrayList, arrayList2);
                    }
                    gmz.this.f35761b.e(planWeekDataList);
                    gmz.this.e(arrayList, arrayList2);
                    if (gmz.this.d.getPlanType().equals(IntPlan.PlanType.AI_RUN_PLAN)) {
                        gmz.this.d((UiCallback<pdx>) uiCallback, iC + 1);
                        return;
                    } else {
                        gmz.this.a((UiCallback<pdx>) uiCallback);
                        return;
                    }
                }
                uiCallback.onFailure(1001, "plan id different.");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(ghf ghfVar) {
        if (ghfVar == null) {
            LogUtil.j("Suggestion_PlanReportManager", "isValidInitPlanData from cloud is null");
            return false;
        }
        this.e = ghfVar.getCompatiblePlan();
        this.d = ghfVar;
        if (ghfVar.getCompatiblePlan() != null) {
            return true;
        }
        LogUtil.e("Suggestion_PlanReportManager", "mIntPlan.getCompatiblePlan() == null");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(List<ghe> list, List<Integer> list2, List<Integer> list3) {
        Iterator<ghe> it = list.iterator();
        while (it.hasNext()) {
            List<ghi> listE = it.next().e();
            if (njy.e(listE)) {
                list2.add(0);
                list3.add(0);
            } else {
                b(list2, list3, listE);
            }
        }
    }

    private void b(List<Integer> list, List<Integer> list2, List<ghi> list3) {
        int i = 0;
        int i2 = 0;
        for (ghi ghiVar : list3) {
            if (ghiVar != null && !njy.e(ghiVar.b())) {
                i++;
                if (ghiVar.getPunchFlag() == 1) {
                    i2++;
                }
            }
        }
        list.add(Integer.valueOf(i));
        list2.add(Integer.valueOf(i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(List<pdq> list, List<Integer> list2, List<Integer> list3) {
        for (pdq pdqVar : list) {
            int i = pdqVar.i();
            int i2 = 0;
            if (njy.e(pdqVar.f())) {
                list2.add(Integer.valueOf(i));
                list3.add(0);
            } else {
                for (pdt pdtVar : pdqVar.f()) {
                    i = btw.c(pdtVar, i);
                    if (pdtVar.c()) {
                        i2++;
                    }
                }
                list2.add(Integer.valueOf(i));
                list3.add(Integer.valueOf(i2));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(final UiCallback<pdx> uiCallback, final int i) {
        Date date = new Date(this.f35761b.n() * 1000);
        Date date2 = new Date(System.currentTimeMillis());
        ReleaseLogUtil.d("Suggestion_PlanReportManager", "start:", date.toString(), " today:", date2.toString());
        gcn.c().getUserRunLevelDataByRq(ieg.b(date), ieg.b(date2), 0, new IBaseResponseCallback() { // from class: gnb
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i2, Object obj) {
                this.f35787c.d(i, uiCallback, i2, obj);
            }
        });
    }

    /* synthetic */ void d(int i, UiCallback uiCallback, int i2, Object obj) {
        if (i2 == 200 && (obj instanceof GetRunLevelRsp)) {
            GetRunLevelRsp getRunLevelRsp = (GetRunLevelRsp) obj;
            if (c(getRunLevelRsp)) {
                c(getRunLevelRsp.getUserRunLevelData());
                this.e.setPbCurrent(this.f35761b.i());
                this.f35761b.d(b(i));
                a((UiCallback<pdx>) uiCallback);
                return;
            }
            a((UiCallback<pdx>) uiCallback, i);
            return;
        }
        LogUtil.j("Suggestion_PlanReportManager", "can not get rq data.", Integer.valueOf(i2));
        a((UiCallback<pdx>) uiCallback, i);
    }

    private void a(final UiCallback<pdx> uiCallback, final int i) {
        int iAcquireGoal = this.e.acquireGoal();
        if (iAcquireGoal > 0 && iAcquireGoal <= 6) {
            int[] iArrC = c(iAcquireGoal);
            int i2 = iArrC[0];
            int i3 = iArrC[1];
            ReleaseLogUtil.d("Suggestion_PlanReportManager", "pbType:", Integer.valueOf(i2), " pbTime:", Integer.valueOf(i3), "weekCount: ", Integer.valueOf(this.e.getWeekCount()));
            this.f35762c.getAchievementForecast(i2, i3, this.e.acquireGoal(), this.e.getWeekCount(), new UiCallback<pdy>() { // from class: gmz.6
                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                public void onFailure(int i4, String str) {
                    ReleaseLogUtil.a("Suggestion_PlanReportManager", "getGoalForecast: ", str);
                    gmz.this.f35761b.d(gmz.this.e.getPbCurrent());
                    gmz.this.f35761b.d(gmz.this.b(i));
                    gmz.this.a((UiCallback<pdx>) uiCallback);
                }

                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public void onSuccess(pdy pdyVar) {
                    if (pdyVar == null) {
                        LogUtil.e("Suggestion_PlanReportManager", "getGoalForecast onSuccess data is null.");
                        return;
                    }
                    ReleaseLogUtil.d("Suggestion_PlanReportManager", "predictFinalGrade forecastAchieve:", Integer.valueOf(pdyVar.a()));
                    gmz.this.f35761b.d(pdyVar.a());
                    gmz.this.e.setPbCurrent(pdyVar.a());
                    gmz.this.f35761b.d(gmz.this.b(i));
                    gmz.this.a((UiCallback<pdx>) uiCallback);
                }
            });
            return;
        }
        this.f35761b.d(b(i));
        a(uiCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String b(int i) {
        int pbBeforePlan = this.e.getPbBeforePlan();
        int pbCurrent = this.e.getPbCurrent();
        boolean z = ((double) pbCurrent) < ((double) pbBeforePlan) * 0.97d;
        LogUtil.a("Suggestion_PlanReportManager", "pbCurrent:", Integer.valueOf(pbCurrent), " pbBeforePlan:", Integer.valueOf(pbBeforePlan));
        int iC = btw.c(this.e);
        float f = i == 0 ? 0.0f : iC / i;
        LogUtil.a("Suggestion_PlanReportManager", "curWeekNo:", Integer.valueOf(i), "totalClocks:", Integer.valueOf(iC), "avgClock: ", Float.valueOf(f));
        double d = f;
        double d2 = (((((-0.0132d) * d) * d) + (d * 0.2635d)) - 0.0493d) * 100.0d;
        double d3 = d2 < 0.0d ? 0.0d : d2;
        String strB = b(i, d3, e(this.e.acquireGoal(), z, f, i, b(this.e.acquireGoal(), pbBeforePlan)));
        LogUtil.a("Suggestion_PlanReportManager", "percent =", Double.valueOf(d3), "final coach advice:", strB);
        return strB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i, final UiCallback<pdx> uiCallback) {
        LogUtil.a("Suggestion_PlanReportManager", "generatePlanReport:", Integer.valueOf(i));
        if (i < 1) {
            uiCallback.onFailure(1001, ResultUtil.c(1001));
            return;
        }
        List<pdq> planWeekDataList = this.e.getPlanWeekDataList();
        if (njy.e(planWeekDataList)) {
            LogUtil.j("Suggestion_PlanReportManager", "generatePlanReport weekDataBeans is empty");
            return;
        }
        ArrayList arrayList = new ArrayList(planWeekDataList.size());
        ArrayList arrayList2 = new ArrayList(planWeekDataList.size());
        final pdq pdqVarC = c(i, planWeekDataList, arrayList, arrayList2);
        if (pdqVarC == null) {
            LogUtil.j("Suggestion_PlanReportManager", "getLaseWeekDataBean return null.");
            return;
        }
        this.f35761b.e(planWeekDataList);
        final pdz pdzVar = new pdz();
        pdzVar.a(pdqVarC.e());
        long startTime = this.e.getStartTime();
        long jA = pdqVarC.a();
        b(startTime * 1000, jA * 1000, arrayList, arrayList2, new IBaseResponseCallback() { // from class: gnc
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i2, Object obj) {
                this.e.c(pdzVar, pdqVarC, uiCallback, i2, obj);
            }
        });
    }

    /* synthetic */ void c(pdz pdzVar, pdq pdqVar, final UiCallback uiCallback, int i, Object obj) {
        d(pdzVar, pdqVar.b(), pdqVar.a(), new IBaseResponseCallback() { // from class: gna
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i2, Object obj2) {
                this.e.b(uiCallback, i2, obj2);
            }
        });
    }

    /* synthetic */ void b(final UiCallback uiCallback, int i, Object obj) {
        b(new UiCallback<String>() { // from class: gmz.10
            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            public void onFailure(int i2, String str) {
                LogUtil.a("Suggestion_PlanReportManager", "getCoachAdvice:", Integer.valueOf(i2), str);
                gmz.this.f35761b.d("");
                gmz.this.e((UiCallback<pdx>) uiCallback);
            }

            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public void onSuccess(String str) {
                LogUtil.a("Suggestion_PlanReportManager", "getCoachAdvice:", str);
                gmz.this.f35761b.d(str);
                gmz.this.e((UiCallback<pdx>) uiCallback);
            }
        });
    }

    private pdq c(int i, List<pdq> list, List<Integer> list2, List<Integer> list3) {
        pdq pdqVar = null;
        for (pdq pdqVar2 : list) {
            if (pdqVar2.j() == i) {
                LogUtil.a("Suggestion_PlanReportManager", "weekDataBean:", pdqVar2.toString());
                pdqVar = pdqVar2;
            }
            int i2 = pdqVar2.i();
            int i3 = 0;
            if (njy.b(pdqVar2.f())) {
                for (pdt pdtVar : pdqVar2.f()) {
                    i2 = btw.c(pdtVar, i2);
                    if (pdqVar2.j() <= i && pdtVar.c()) {
                        i3++;
                    }
                }
            }
            list2.add(Integer.valueOf(i2));
            list3.add(Integer.valueOf(i3));
        }
        return pdqVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(List<Integer> list, List<Integer> list2) {
        pdw pdwVar = new pdw();
        LogUtil.a("Suggestion_PlanReportManager", "setTotalStatistics rate:", Float.valueOf(e("progress")));
        pdwVar.e(e("progress"));
        pdwVar.b(list);
        pdwVar.a(list2);
        LogUtil.a("Suggestion_PlanReportManager", "setTotalStatistics totalDuration: ", Float.valueOf(e("duration")), "totalActualDistance: ", Float.valueOf(e("distance")), "totalActualCalorie: ", Float.valueOf(e("calorie")));
        pdwVar.d(Math.round(e("duration") / 60000.0f));
        pdwVar.a(e("distance") / 1000.0f);
        pdwVar.b(e("calorie"));
        this.f35761b.c(pdwVar);
    }

    private void b(long j, long j2, List<Integer> list, List<Integer> list2, IBaseResponseCallback iBaseResponseCallback) {
        pdw pdwVar = new pdw();
        float fB = gnw.b(this.d, j2);
        LogUtil.a("Suggestion_PlanReportManager", "setTotalStatistics rate:", Float.valueOf(fB));
        pdwVar.e(fB);
        pdwVar.b(list);
        pdwVar.a(list2);
        this.f35761b.c(pdwVar);
        CourseApi courseApi = (CourseApi) Services.d("CoursePlanService", CourseApi.class);
        if (courseApi == null) {
            LogUtil.j("Suggestion_PlanReportManager", "lastWeekStatistics courseApi is null");
            return;
        }
        String strI = ift.i(j);
        String strI2 = ift.i(j2);
        LogUtil.a("Suggestion_PlanReportManager", "startDate:", strI, " endDate:", strI2);
        List<WorkoutRecord> workoutRecords = courseApi.getWorkoutRecords(this.e.acquireId(), strI, strI2);
        if (njy.e(workoutRecords)) {
            LogUtil.j("Suggestion_PlanReportManager", "workoutRecords is null");
            bug.c().c(j, j2, new c(this, iBaseResponseCallback, 101));
            return;
        }
        int duration = 0;
        float fAcquireActualCalorie = 0.0f;
        for (WorkoutRecord workoutRecord : workoutRecords) {
            if (!workoutRecord.isFitnessRecordFromDevice() && !workoutRecord.isRunWorkout()) {
                duration += workoutRecord.getDuration();
                fAcquireActualCalorie += workoutRecord.acquireActualCalorie();
            }
            LogUtil.a("Suggestion_PlanReportManager", "record:", workoutRecord.acquireWorkoutName(), " duration:", Integer.valueOf(workoutRecord.getDuration()), " calories:", Float.valueOf(workoutRecord.acquireActualCalorie()), " isFitnessRecordFromDevice:", Boolean.valueOf(workoutRecord.isFitnessRecordFromDevice()), " isRunWorkout:", Boolean.valueOf(workoutRecord.isRunWorkout()));
        }
        pdwVar.d(duration);
        pdwVar.b(fAcquireActualCalorie);
        bug.c().c(j, j2, new c(this, iBaseResponseCallback, 101));
    }

    private float e(String str) {
        ghf ghfVar = this.d;
        if (ghfVar == null || ghfVar.getStat(str) == null) {
            LogUtil.j("Suggestion_PlanReportManager", "getTargetValue null", str);
            return 0.0f;
        }
        return ((Float) this.d.getStat(str).getValue()).floatValue();
    }

    static class c extends DataCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35777a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        WeakReference<gmz> f35778b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        IBaseResponseCallback f35779c;

        c(gmz gmzVar, IBaseResponseCallback iBaseResponseCallback, int i) {
            this.f35778b = new WeakReference<>(gmzVar);
            this.f35779c = iBaseResponseCallback;
            this.f35777a = i;
        }

        @Override // com.huawei.basefitnessadvice.callback.DataCallback
        public void onFailure(int i, String str) {
            LogUtil.a("Suggestion_PlanReportManager", "RunDataCallback onFail,", Integer.valueOf(i), str);
            gmz gmzVar = this.f35778b.get();
            if (gmzVar == null) {
                this.f35779c.a(0, null);
                return;
            }
            if (this.f35777a == 102) {
                pdz pdzVarJ = gmzVar.f35761b.j();
                pdzVarJ.e(Math.round(pdzVarJ.a() / 60000.0f));
            }
            if (this.f35777a == 101) {
                pdw pdwVarR = gmzVar.f35761b.r();
                pdwVarR.d(Math.round(pdwVarR.e() / 60000.0f));
            }
            this.f35779c.a(i, null);
        }

        @Override // com.huawei.basefitnessadvice.callback.DataCallback
        public void onSuccess(JSONObject jSONObject) {
            LogUtil.a("Suggestion_PlanReportManager", "RunDataCallback onSuccess,", jSONObject.toString());
            gmz gmzVar = this.f35778b.get();
            if (gmzVar == null) {
                this.f35779c.a(0, null);
                return;
            }
            double dOptDouble = jSONObject.optDouble("distance");
            double dOptDouble2 = jSONObject.optDouble("duration");
            double dOptDouble3 = jSONObject.optDouble("calorie");
            if (this.f35777a == 102) {
                pdz pdzVarJ = gmzVar.f35761b.j();
                pdzVarJ.e(Math.round((pdzVarJ.a() + ((int) dOptDouble2)) / 60000.0f));
                pdzVarJ.e(pdzVarJ.c() + (dOptDouble / 1000.0d));
                pdzVarJ.c(pdzVarJ.d() + ((float) dOptDouble3));
            }
            if (this.f35777a == 101) {
                pdw pdwVarR = gmzVar.f35761b.r();
                pdwVarR.d(Math.round((pdwVarR.e() + ((int) dOptDouble2)) / 60000.0f));
                pdwVarR.a(pdwVarR.a() + ((float) (dOptDouble / 1000.0d)));
                pdwVarR.b(pdwVarR.b() + ((float) dOptDouble3));
            }
            this.f35779c.a(0, null);
        }
    }

    private void d(pdz pdzVar, long j, long j2, IBaseResponseCallback iBaseResponseCallback) {
        List<WorkoutRecord> listC = c(pdzVar, j, j2, iBaseResponseCallback);
        if (listC == null) {
            return;
        }
        float fAcquireActualCalorie = 0.0f;
        int iIntValue = 0;
        int iIntValue2 = 0;
        int iIntValue3 = 0;
        int iIntValue4 = 0;
        int iIntValue5 = 0;
        int duration = 0;
        for (WorkoutRecord workoutRecord : listC) {
            if (!workoutRecord.isFitnessRecordFromDevice() && !workoutRecord.isRunWorkout()) {
                duration += workoutRecord.getDuration();
                fAcquireActualCalorie += workoutRecord.acquireActualCalorie();
            }
            LogUtil.a("Suggestion_PlanReportManager", "record:", workoutRecord.acquireWorkoutName(), " duration:", Integer.valueOf(workoutRecord.getDuration()), " calories:", Float.valueOf(workoutRecord.acquireActualCalorie()), " distance:", Float.valueOf(workoutRecord.acquireActualDistance()));
            List<Integer> intensityZone = workoutRecord.getIntensityZone();
            if (intensityZone != null && intensityZone.size() == 5) {
                iIntValue += intensityZone.get(0).intValue();
                iIntValue2 += intensityZone.get(1).intValue();
                iIntValue3 += intensityZone.get(2).intValue();
                iIntValue4 += intensityZone.get(3).intValue();
                iIntValue5 += intensityZone.get(4).intValue();
            }
        }
        pdzVar.b(Arrays.asList(Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2), Integer.valueOf(iIntValue3), Integer.valueOf(iIntValue4), Integer.valueOf(iIntValue5)));
        pdzVar.e(duration);
        pdzVar.c(fAcquireActualCalorie);
        this.f35761b.c(pdzVar);
        bug.c().c(j * 1000, 1000 * j2, new c(this, iBaseResponseCallback, 102));
    }

    private List<WorkoutRecord> c(pdz pdzVar, long j, long j2, IBaseResponseCallback iBaseResponseCallback) {
        long j3 = j * 1000;
        String strI = ift.i(j3);
        long j4 = j2 * 1000;
        String strI2 = ift.i(j4);
        LogUtil.a("Suggestion_PlanReportManager", "startDate:", strI, " endDate:", strI2);
        CourseApi courseApi = (CourseApi) Services.d("CoursePlanService", CourseApi.class);
        if (courseApi == null) {
            LogUtil.j("Suggestion_PlanReportManager", "lastWeekStatistics courseApi is null");
            return null;
        }
        this.f35761b.c(pdzVar);
        List<WorkoutRecord> workoutRecords = courseApi.getWorkoutRecords(this.e.acquireId(), strI, strI2);
        if (!njy.e(workoutRecords)) {
            return workoutRecords;
        }
        LogUtil.j("Suggestion_PlanReportManager", "workoutRecords is null");
        bug.c().c(j3, j4, new c(this, iBaseResponseCallback, 102));
        return null;
    }

    private void b(UiCallback<String> uiCallback) {
        PlanApi planApi = this.f35762c;
        if (planApi == null) {
            LogUtil.e("Suggestion_PlanReportManager", "getCoachAdvice : planApi is null.");
        } else {
            planApi.setPlanType(0);
            this.f35762c.getCoachAdvice(1, this.e.acquireId(), null, true, uiCallback);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(UiCallback<pdx> uiCallback) {
        Date date = new Date(System.currentTimeMillis());
        int iB = ieg.b(date);
        LogUtil.a("Suggestion_PlanReportManager", "today:", date.toString());
        gcn.c().getUserRunLevelDataByRq(iB, iB, 0, new e(this, uiCallback));
    }

    static class e implements IBaseResponseCallback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private WeakReference<gmz> f35780b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private UiCallback<pdx> f35781c;

        e(gmz gmzVar, UiCallback<pdx> uiCallback) {
            this.f35780b = new WeakReference<>(gmzVar);
            this.f35781c = uiCallback;
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            gmz gmzVar = this.f35780b.get();
            if (gmzVar == null || this.f35781c == null) {
                LogUtil.j("Suggestion_PlanReportManager", "RqRunningData onResponse activity or mHandler is null");
                return;
            }
            if (i != 200 || !(obj instanceof GetRunLevelRsp)) {
                LogUtil.j("Suggestion_PlanReportManager", "can not get rq data.", Integer.valueOf(i));
                gmzVar.c(this.f35781c);
                return;
            }
            GetRunLevelRsp getRunLevelRsp = (GetRunLevelRsp) obj;
            if (gmzVar.c(getRunLevelRsp)) {
                gmzVar.c(getRunLevelRsp.getUserRunLevelData());
                gmzVar.a((UiCallback<pdx>) null);
                gmzVar.e(gmzVar.f35761b.i());
                this.f35781c.onSuccess(gmzVar.f35761b);
                return;
            }
            gmzVar.c(this.f35781c);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(UserRunLevelData userRunLevelData) {
        int iAcquireGoal = this.e.acquireGoal();
        LogUtil.a("Suggestion_PlanReportManager", "setPredictData:", Integer.valueOf(iAcquireGoal));
        if (iAcquireGoal == 3) {
            this.f35761b.d(userRunLevelData.getTimeForFiveKm());
            return;
        }
        if (iAcquireGoal == 4) {
            this.f35761b.d(userRunLevelData.getTimeForTenKm());
        } else if (iAcquireGoal == 5) {
            this.f35761b.d(userRunLevelData.getHalfMarathon());
        } else {
            if (iAcquireGoal != 6) {
                return;
            }
            this.f35761b.d(userRunLevelData.getMarathon());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c(GetRunLevelRsp getRunLevelRsp) {
        if (getRunLevelRsp == null || getRunLevelRsp.getUserRunLevelData() == null) {
            return false;
        }
        UserRunLevelData userRunLevelData = getRunLevelRsp.getUserRunLevelData();
        LogUtil.a("Suggestion_PlanReportManager", "FiveKm:", Integer.valueOf(userRunLevelData.getTimeForFiveKm()), " TenKm:", Integer.valueOf(userRunLevelData.getTimeForTenKm()), " HalfMarathon:", Integer.valueOf(userRunLevelData.getHalfMarathon()), " Marathon:", Integer.valueOf(userRunLevelData.getMarathon()));
        return userRunLevelData.getTimeForFiveKm() > 0 && userRunLevelData.getTimeForTenKm() > 0 && userRunLevelData.getHalfMarathon() > 0 && userRunLevelData.getMarathon() > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(final UiCallback<pdx> uiCallback) {
        if (this.f35762c == null) {
            LogUtil.e("Suggestion_PlanReportManager", "predictAchievement : planApi is null.");
            return;
        }
        int iAcquireGoal = this.e.acquireGoal();
        if (iAcquireGoal > 0 && iAcquireGoal <= 6) {
            int[] iArrC = c(iAcquireGoal);
            int i = iArrC[0];
            int i2 = iArrC[1];
            ReleaseLogUtil.d("Suggestion_PlanReportManager", "pbType:", Integer.valueOf(i), " pbTime:", Integer.valueOf(i2));
            this.f35762c.getAchievementForecast(i, i2, this.e.acquireGoal(), this.e.getWeekCount(), new UiCallback<pdy>() { // from class: gmz.8
                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                public void onFailure(int i3, String str) {
                    LogUtil.e("Suggestion_PlanReportManager", "getGoalForecast: ", str);
                    gmz.this.a((UiCallback<pdx>) null);
                    uiCallback.onSuccess(gmz.this.f35761b);
                }

                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
                public void onSuccess(pdy pdyVar) {
                    if (pdyVar == null) {
                        LogUtil.e("Suggestion_PlanReportManager", "getGoalForecast onSuccess data is null.");
                        return;
                    }
                    ReleaseLogUtil.d("Suggestion_PlanReportManager", "TrainingPredictionBean:", Integer.valueOf(pdyVar.a()));
                    gmz.this.f35761b.d(pdyVar.a());
                    gmz.this.a((UiCallback<pdx>) null);
                    gmz.this.e(pdyVar.a());
                    uiCallback.onSuccess(gmz.this.f35761b);
                }
            });
            return;
        }
        a((UiCallback<pdx>) null);
        uiCallback.onSuccess(this.f35761b);
    }

    private int[] c(int i) {
        LogUtil.a("Suggestion_PlanReportManager", "goal=", Integer.valueOf(i));
        int[] iArr = new int[2];
        int pbCurrent = this.e.getPbCurrent();
        if (pbCurrent == 0) {
            pbCurrent = this.e.getPbBeforePlan();
        }
        iArr[0] = i;
        iArr[1] = pbCurrent;
        AchieveDataApi achieveDataApi = (AchieveDataApi) Services.d("PluginAchievement", AchieveDataApi.class);
        if (achieveDataApi == null) {
            LogUtil.e("Suggestion_PlanReportManager", "can not get achieveDataApi.");
            return iArr;
        }
        osc singleDayData = achieveDataApi.getSingleDayData();
        if (singleDayData != null) {
            ose[] oseVarArrA = a(singleDayData);
            ose oseVar = null;
            int i2 = i;
            while (i > 1) {
                int i3 = i - 1;
                ose oseVar2 = oseVarArrA[i3];
                if (oseVar2 != null) {
                    if (oseVar == null) {
                        i2 = i;
                        oseVar = oseVar2;
                    } else if (oseVar.c() < oseVarArrA[i3].c()) {
                        oseVar = oseVarArrA[i3];
                        i2 = i;
                    }
                }
                i--;
            }
            if (oseVar != null && oseVar.c() > this.e.getStartTime() * 1000) {
                int iRound = (int) Math.round(oseVar.b());
                iArr[0] = i2;
                iArr[1] = iRound;
            }
        }
        return iArr;
    }

    private ose[] a(osc oscVar) {
        ose[] oseVarArr = new ose[6];
        oseVarArr[1] = oscVar.a();
        oseVarArr[2] = oscVar.c();
        oseVarArr[3] = oscVar.d();
        oseVarArr[4] = oscVar.e();
        oseVarArr[5] = oscVar.b();
        return oseVarArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i) {
        glw.c().e();
        Plan currentPlan = gls.b().getCurrentPlan();
        if (currentPlan == null) {
            LogUtil.e("Suggestion_PlanReportManager", "getAchievementForecast onSuccess plan is null.");
        } else {
            currentPlan.setPbCurrent(i);
            gmc.g().l().d(btx.b(), currentPlan, currentPlan.acquireVersion());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final UiCallback<pdx> uiCallback) {
        c();
        String json = new GsonBuilder().create().toJson(this.f35761b);
        pdx pdxVar = this.f35761b;
        if (pdxVar != null) {
            String strL = pdxVar.l();
            String strA = this.f35761b.a();
            long jN = this.f35761b.n();
            long jD = this.f35761b.d();
            int iP = this.f35761b.p();
            boolean zG = this.f35761b.g();
            ReleaseLogUtil.d("Suggestion_PlanReportManager", "uploadReport startDate:", strL, " endDate:", strA, " startTime:", Long.valueOf(jN), " endTime:", Long.valueOf(jD), " weekNum", Integer.valueOf(iP), " isRunReport", Boolean.valueOf(zG), " coachAdvice:", this.f35761b.b());
        }
        LogUtil.a("Suggestion_PlanReportManager", "uploadReport:", json, "planType:", Integer.valueOf(this.d.getPlanType().getType()));
        if (this.d.getPlanType() == IntPlan.PlanType.FIT_PLAN) {
            e(json, uiCallback);
        } else {
            this.f35762c.updatePlanReport(this.e.acquireId(), json, new UiCallback<String>() { // from class: gmz.3
                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                public void onFailure(int i, String str) {
                    UiCallback uiCallback2 = uiCallback;
                    if (uiCallback2 != null) {
                        uiCallback2.onSuccess(gmz.this.f35761b);
                    }
                    LogUtil.e("Suggestion_PlanReportManager", "updatePlanReport failed.", Integer.valueOf(i), str);
                }

                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
                public void onSuccess(String str) {
                    UiCallback uiCallback2 = uiCallback;
                    if (uiCallback2 != null) {
                        uiCallback2.onSuccess(gmz.this.f35761b);
                    }
                    LogUtil.e("Suggestion_PlanReportManager", "updatePlanReport success.");
                }
            });
        }
    }

    private void c() {
        pdx pdxVar;
        if (this.e == null || (pdxVar = this.f35761b) == null) {
            LogUtil.e("Suggestion_PlanReportManager", "setCurrentWeekEndTime bean null");
            return;
        }
        if (pdxVar.p() == 100) {
            this.f35761b.a(this.d.getPlanTimeInfo().getEndDate());
            return;
        }
        int iB = btw.b(this.e) - 1;
        LogUtil.a("Suggestion_PlanReportManager", "setCurrentWeekEndTime lastWeekNo", Integer.valueOf(iB));
        for (pdq pdqVar : this.e.getPlanWeekDataList()) {
            if (pdqVar != null && pdqVar.j() == iB) {
                LogUtil.a("Suggestion_PlanReportManager", "setCurrentWeekEndTime weekNum:", Integer.valueOf(pdqVar.j()));
                this.f35761b.a(pdqVar.a());
                return;
            }
        }
    }

    private void e(String str, final UiCallback<pdx> uiCallback) {
        LogUtil.a("Suggestion_PlanReportManager", "uploadReportToGeneral report size:", Integer.valueOf(str.length()));
        this.f35762c.updateIntPlanReport(this.d.getPlanId(), this.d.getPlanType().getType(), 2, str, System.currentTimeMillis(), new UiCallback<String>() { // from class: gmz.1
            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            public void onFailure(int i, String str2) {
                UiCallback uiCallback2 = uiCallback;
                if (uiCallback2 != null) {
                    uiCallback2.onFailure(i, str2);
                }
                LogUtil.e("Suggestion_PlanReportManager", "uploadReportToGeneral failed.", Integer.valueOf(i), str2);
            }

            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public void onSuccess(String str2) {
                UiCallback uiCallback2 = uiCallback;
                if (uiCallback2 != null) {
                    uiCallback2.onSuccess(gmz.this.f35761b);
                }
                LogUtil.a("Suggestion_PlanReportManager", "uploadReportToGeneral success.");
            }
        });
    }

    private String b(int i, double d, String str) {
        return gzx.d(R.plurals.IDS_sug_coach_all_advice, i, Integer.valueOf(i), UnitUtil.e(d, 2, 0), str);
    }

    private String e(int i, boolean z, float f, int i2, boolean z2) {
        if (i == 11) {
            return BaseApplication.getContext().getResources().getString(R.string.IDS_sug_coach_advice_one);
        }
        if (i == 12) {
            return BaseApplication.getContext().getResources().getString(R.string.IDS_sug_coach_advice_two);
        }
        if (z) {
            return BaseApplication.getContext().getResources().getString(R.string.IDS_sug_coach_advice_three);
        }
        if (f < 3.0f) {
            return BaseApplication.getContext().getResources().getString(R.string.IDS_sug_coach_advice_four);
        }
        if (i2 < 6) {
            return BaseApplication.getContext().getResources().getString(R.string.IDS_sug_coach_advice_five);
        }
        if (z2) {
            return BaseApplication.getContext().getResources().getString(R.string.IDS_sug_coach_advice_seven);
        }
        return BaseApplication.getContext().getResources().getString(R.string.IDS_sug_coach_advice_six);
    }
}
