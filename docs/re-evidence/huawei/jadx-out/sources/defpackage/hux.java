package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.huawei.basefitnessadvice.callback.DataCallback;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.basefitnessadvice.model.intplan.IntPlan;
import com.huawei.basefitnessadvice.model.intplan.StatInfo;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.router.AppRouter;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.course.api.CourseApi;
import com.huawei.health.courseplanservice.api.RecordApi;
import com.huawei.health.sport.model.WorkoutRecord;
import com.huawei.health.suggestion.R;
import com.huawei.hihealth.HiUserPreference;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.Services;
import health.compact.a.UnitUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class hux {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f37184c;
    private IntPlan e;
    private CountDownLatch l;
    private HashMap<String, String> n = new HashMap<>();
    private long j = 0;
    private float h = 0.0f;
    private float i = 0.0f;
    private float f = 0.0f;
    private float g = 0.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f37183b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f37182a = 0;
    private List<WorkoutRecord> d = new ArrayList();

    static /* synthetic */ float c(hux huxVar, double d) {
        float f = (float) (((double) huxVar.i) + d);
        huxVar.i = f;
        return f;
    }

    static /* synthetic */ float e(hux huxVar, float f) {
        float f2 = huxVar.g + f;
        huxVar.g = f2;
        return f2;
    }

    public hux(IntPlan intPlan, Context context) {
        this.e = intPlan;
        this.f37184c = context;
    }

    public void b(final UiCallback<HashMap<String, String>> uiCallback) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: hvb
            @Override // java.lang.Runnable
            public final void run() {
                this.f37195c.d(uiCallback);
            }
        });
    }

    /* synthetic */ void d(UiCallback uiCallback) {
        c();
        b();
        uiCallback.onSuccess(this.n);
    }

    private void c() {
        long jA;
        long jG;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jA2 = ift.a(jCurrentTimeMillis);
        long jD = ift.d(jCurrentTimeMillis);
        IntPlan.PlanType planType = this.e.getPlanType();
        if (IntPlan.PlanType.AI_FITNESS_PLAN.equals(planType)) {
            jA = DateFormatUtil.d(btw.d(this.e));
        } else {
            jA = btw.a(this.e);
        }
        long j = jA;
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        e(jA2, jD, 1);
        if (IntPlan.PlanType.AI_FITNESS_PLAN.equals(planType) || IntPlan.PlanType.FIT_PLAN.equals(planType)) {
            a(jA2, jD, 1);
            e(j, jCurrentTimeMillis2, 0);
            if (IntPlan.PlanType.AI_FITNESS_PLAN.equals(planType)) {
                jG = DateFormatUtil.d(btw.f(this.e));
                c(j);
            } else {
                jG = btw.g(this.e);
            }
            a(jG, lsl.c(jCurrentTimeMillis2), 0);
            a();
            return;
        }
        if (IntPlan.PlanType.AI_RUN_PLAN.equals(planType) || IntPlan.PlanType.RUN_PLAN.equals(planType)) {
            d(jA2, jD);
            b(jA2, jD);
            h();
            i();
            g();
            return;
        }
        LogUtil.a("Suggestion_PlanShareManager", "plan type is NA_PLAN");
    }

    private void b() {
        if (this.e.getPlanType() == IntPlan.PlanType.AI_FITNESS_PLAN || this.e.getPlanType() == IntPlan.PlanType.FIT_PLAN) {
            if (njy.e(this.d)) {
                return;
            }
            d();
            int size = this.d.size();
            if (size == 1) {
                d(this.d);
                return;
            } else if (size == 2) {
                c(this.d);
                return;
            } else {
                e(this.d);
                return;
            }
        }
        if (this.e.getPlanType() == IntPlan.PlanType.AI_RUN_PLAN || this.e.getPlanType() == IntPlan.PlanType.RUN_PLAN) {
            if (njy.e(this.d)) {
                return;
            }
            if (this.d.size() == 1) {
                b(this.d);
                return;
            } else {
                a(this.d);
                return;
            }
        }
        LogUtil.a("Suggestion_PlanShareManager", "plan type is NA_PLAN");
    }

    public void a(HashMap<String, String> map) {
        LogUtil.a("Suggestion_PlanShareManager", "handleSharePlanData...");
        Bundle bundle = new Bundle();
        ArrayList arrayList = new ArrayList(1);
        gxz gxzVar = new gxz();
        if (this.e.getPlanType().equals(IntPlan.PlanType.AI_FITNESS_PLAN) || this.e.getPlanType().equals(IntPlan.PlanType.FIT_PLAN)) {
            gxzVar.a(1157);
            gxzVar.b(R.drawable.fitness_plan_default_water_mark);
            bundle.putInt("downLoadId", 401);
        } else if (this.e.getPlanType().equals(IntPlan.PlanType.AI_RUN_PLAN) || this.e.getPlanType().equals(IntPlan.PlanType.RUN_PLAN)) {
            bundle.putInt("downLoadId", 400);
            gxzVar.a(1153);
            gxzVar.b(R.drawable.run_plan_default_water_mark);
        } else {
            LogUtil.a("Suggestion_PlanShareManager", "plan type is NA_PLAN");
        }
        arrayList.add(gxzVar);
        gyd gydVar = new gyd();
        gydVar.e(map);
        bundle.putSerializable("shareWaterMarkData", gydVar);
        bundle.putSerializable("waterMarkIds", arrayList);
        bundle.putBoolean("isDownloadMarkFromCloud", true);
        bundle.putString("shareSource", "plan");
        AppRouter.c("/PluginSocialShare/CustomizeShareActivity").d(bundle).b(this.f37184c);
    }

    private void e() {
        int iA = (int) (((ift.a(System.currentTimeMillis()) / 86400000) - ((this.e.getPlanTimeInfo().getBeginDate() * 1000) / 86400000)) + 1);
        if (IntPlan.PlanType.AI_FITNESS_PLAN.equals(this.e.getPlanType())) {
            iA = lsl.b(btw.f(this.e), DateFormatUtil.a(System.currentTimeMillis()));
        }
        int iE = btw.e(this.e);
        if (iA > iE) {
            iA = iE;
        }
        String strE = UnitUtil.e(iA, 1, 0);
        String strE2 = UnitUtil.e(iE, 1, 0);
        String strA = qre.a(R.string.IDS_current_total_time, strE, strE2);
        String strReplace = qre.e(R.plurals.IDS_plan_complete_day, iE, strE, strE2).replace(strA, "");
        if (this.e.getPlanType() == IntPlan.PlanType.AI_FITNESS_PLAN || this.e.getPlanType() == IntPlan.PlanType.FIT_PLAN) {
            this.n.put("reduce_fat_complete_day", strA);
            this.n.put("reduce_fat_point_day", strE);
            this.n.put("reduce_fat_unit", strReplace);
        } else {
            this.n.put("running_complete_day", strA);
            this.n.put("running_point_day", strE);
            this.n.put("running_unit", strReplace);
        }
    }

    private void a(List<WorkoutRecord> list) {
        b(list);
        if (!njy.e(list) && list.size() >= 2) {
            this.n.put("running_second_name", list.get(1).acquireWorkoutName());
            this.n.put("running_second_value", Integer.toString(Math.round(list.get(1).getDuration() / 60000.0f)));
        } else {
            LogUtil.a("Suggestion_PlanShareManager", "twoRunCourseTemplate: workoutRecords is empty");
        }
        this.n.put("running_second_unit", this.f37184c.getResources().getString(R.string.sug_unit_MIN));
    }

    private void b(List<WorkoutRecord> list) {
        if (!njy.e(list)) {
            this.n.put("running_first_name", list.get(0).acquireWorkoutName());
            this.n.put("running_first_value", Integer.toString(Math.round(list.get(0).getDuration() / 60000.0f)));
        } else {
            LogUtil.a("Suggestion_PlanShareManager", "oneRunCourseTemplate: workoutRecords is empty");
        }
        this.n.put("running_first_unit", this.f37184c.getResources().getString(R.string.sug_unit_MIN));
    }

    private void g() {
        String strE = qre.e(R.plurals.IDS_hwh_motiontrack_show_use_time_km, (int) this.i, "");
        this.n.put("running_sport_name", UnitUtil.e(this.i, 1, 2));
        this.n.put("running_sport_name_unit", strE);
        this.n.put("running_sport_name_title", this.f37184c.getResources().getString(R.string.IDS_run_today));
        this.n.put("running_calorie_name_unit", this.f37184c.getResources().getString(R.string.sug_finess_kcal1));
        this.n.put("running_calorie_name_title", this.f37184c.getResources().getString(R.string.IDS_track_total_calorie));
        this.n.put("running_calorie_name", Integer.toString(Math.round(this.g)));
    }

    private void i() {
        e();
        this.n.put("running_name", this.e.getMetaInfo().getName());
        this.n.put("running_distance_unit", this.f37184c.getResources().getString(R.string.IDS_unit_distance));
        this.n.put("running_calorie_unit", this.f37184c.getResources().getString(R.string.IDS_track_total_calorie_kcal));
        this.n.put("running_duration_unit", this.f37184c.getResources().getString(R.string.IDS_unit_duration));
        String string = this.f37184c.getResources().getString(R.string.IDS_motiontrack_show_invalid_data);
        this.n.put("running_first_value", string);
        this.n.put("running_second_value", string);
        this.n.put("running_sport_name", string);
        this.n.put("running_calorie_value", Integer.toString(Math.round(this.f)));
        this.n.put("running_duration_value", Integer.toString(Math.round(this.j / 60000.0f)));
        this.n.put("running_distance_value", UnitUtil.e(this.h, 1, 2));
    }

    private void e(List<WorkoutRecord> list) {
        c(list);
        if (!njy.e(list) && list.size() >= 3) {
            this.n.put("reduce_fat_third_name", list.get(2).acquireWorkoutName());
            this.n.put("reduce_fat_third_value", Integer.toString(Math.round(list.get(2).getDuration() / 60000.0f)));
        } else {
            LogUtil.j("Suggestion_PlanShareManager", "threeFitnessCourseTemplate: workoutRecords is empty");
        }
        this.n.put("reduce_fat_third_unit", this.f37184c.getResources().getString(R.string.sug_unit_MIN));
    }

    private void c(List<WorkoutRecord> list) {
        d(list);
        if (!njy.e(list) && list.size() >= 2) {
            this.n.put("reduce_fat_second_name", list.get(1).acquireWorkoutName());
            this.n.put("reduce_fat_second_value", Integer.toString(Math.round(list.get(1).getDuration() / 60000.0f)));
        } else {
            LogUtil.j("Suggestion_PlanShareManager", "twoFitnessCourseTemplate: workoutRecords is empty");
        }
        this.n.put("reduce_fat_second_unit", this.f37184c.getResources().getString(R.string.sug_unit_MIN));
    }

    private void d(List<WorkoutRecord> list) {
        if (!njy.e(list)) {
            this.n.put("reduce_fat_first_name", list.get(0).acquireWorkoutName());
            this.n.put("reduce_fat_first_value", Integer.toString(Math.round(list.get(0).getDuration() / 60000.0f)));
        } else {
            LogUtil.j("Suggestion_PlanShareManager", "oneFitnessCourseTemplate: workoutRecords is empty");
        }
        this.n.put("reduce_fat_first_unit", this.f37184c.getResources().getString(R.string.sug_unit_MIN));
    }

    private void d() {
        this.n.put("reduce_fat_train", Integer.toString(Math.round(this.f37183b / 60000.0f)));
        this.n.put("reduce_fat_train_unit", this.f37184c.getResources().getString(R.string.sug_unit_MIN));
        this.n.put("reduce_fat_train_title", this.f37184c.getResources().getString(R.string.IDS_train_today));
        this.n.put("reduce_fat_calorie_value_unit", this.f37184c.getResources().getString(R.string.sug_finess_kcal1));
        this.n.put("reduce_fat_calorie_value_title", this.f37184c.getResources().getString(R.string.IDS_track_total_calorie));
    }

    private void a() {
        e();
        this.n.put("reduce_fat_name", this.e.getMetaInfo().getName());
        this.n.put("reduce_fat_calorie_unit", this.f37184c.getResources().getString(R.string.IDS_track_total_calorie_kcal));
        this.n.put("reduce_fat_duration_unit", this.f37184c.getResources().getString(R.string.IDS_unit_duration));
        String string = this.f37184c.getResources().getString(R.string.IDS_motiontrack_show_invalid_data);
        this.n.put("reduce_fat_first_value", string);
        this.n.put("reduce_fat_second_value", string);
        this.n.put("reduce_fat_third_value", string);
        this.n.put("reduce_fat_train", string);
        this.n.put("lose_weight_value", string);
        this.n.put("reduce_fat_duration_value", Integer.toString(Math.round(this.f37182a / 60000.0f)));
    }

    private void a(long j, long j2, int i) {
        LogUtil.a("Suggestion_PlanShareManager", "getFitnessConsumption:", Long.valueOf(j), " ", Long.valueOf(j2));
        List<vgo> listA = a(j, j2);
        float fA = 0.0f;
        while (j <= j2) {
            vgo vgoVarA = a(listA, j);
            if (vgoVarA != null) {
                fA += vgoVarA.d().a();
            }
            j = lsl.w(j);
        }
        if (i == 0) {
            this.n.put("reduce_fat_calorie_value", Integer.toString(Math.round(fA)));
        } else {
            this.n.put("reduce_fat_day_calorie_value", Integer.toString(Math.round(fA)));
        }
    }

    private vgo a(List<vgo> list, long j) {
        int iA = DateFormatUtil.a(j);
        for (vgo vgoVar : list) {
            if (vgoVar != null && vgoVar.c() == iA) {
                return vgoVar;
            }
        }
        return null;
    }

    private List<vgo> a(long j, long j2) {
        int iA = DateFormatUtil.a(j);
        int iA2 = DateFormatUtil.a(j2);
        final ArrayList arrayList = new ArrayList();
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        ReleaseLogUtil.c("Suggestion_PlanShareManager", "getDietRecordList startTime ", Long.valueOf(j), " endTime ", Long.valueOf(j2), " startDate ", Integer.valueOf(iA), " endDate ", Integer.valueOf(iA2));
        iun.c(iA, iA2, new ResponseCallback() { // from class: hvd
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i, Object obj) {
                hux.a(arrayList, countDownLatch, i, (List) obj);
            }
        });
        try {
            if (!countDownLatch.await(6000L, TimeUnit.MILLISECONDS)) {
                LogUtil.j("Suggestion_PlanShareManager", "getDietRecordList wait timeout");
                return arrayList;
            }
        } catch (InterruptedException unused) {
            LogUtil.e("Suggestion_PlanShareManager", "interrupted while waiting for getDietRecordList");
        }
        return arrayList;
    }

    static /* synthetic */ void a(List list, CountDownLatch countDownLatch, int i, List list2) {
        LogUtil.a("Suggestion_PlanShareManager", "getDietRecordList errorCode ", Integer.valueOf(i), " list ", list2);
        if (njy.b(list2) && ((vgo) list2.get(0)) != null) {
            list.addAll(list2);
        }
        countDownLatch.countDown();
    }

    private void c(long j) {
        float fC = iun.c();
        LogUtil.a("Suggestion_PlanShareManager", "current weight is ", Float.valueOf(fC));
        float fD = d(j);
        LogUtil.a("Suggestion_PlanShareManager", "origin weight is ", Float.valueOf(fD));
        double d = fD - fC;
        if (d > 0.1d) {
            this.n.put("lose_weight_title", this.f37184c.getResources().getString(R.string.IDS_weight_loss));
            if (UnitUtil.f()) {
                this.n.put("lose_weight_value", UnitUtil.e(UnitUtil.h(d), 1, 1));
                this.n.put("lose_weight_unit", this.f37184c.getResources().getString(R.string.IDS_weight_target_lbs));
                this.n.put("lose_weight_title_and_unit", this.f37184c.getResources().getString(R.string.IDS_weight_loss_imperial_unit));
            } else {
                this.n.put("lose_weight_value", UnitUtil.e(d, 1, 1));
                this.n.put("lose_weight_unit", this.f37184c.getResources().getString(R.string.IDS_weight_unit_kg));
                this.n.put("lose_weight_title_and_unit", this.f37184c.getResources().getString(R.string.IDS_weight_loss_unit));
            }
        }
    }

    private float d(long j) {
        HiUserPreference userPreference = HiHealthManager.d(BaseApplication.b()).getUserPreference("custom.start_weight_base");
        float f = userPreference != null ? CommonUtil.f(userPreference.getValue()) : 0.0f;
        return f < 1.0f ? iun.a(ift.a(j), ift.d(j)) : f;
    }

    private void h() {
        StatInfo stat = this.e.getStat("distance");
        if (stat != null) {
            LogUtil.a("Suggestion_PlanShareManager", "ai run plan distance:", stat.getValue());
            this.h = ((Float) stat.getValue()).floatValue() / 1000.0f;
        }
        StatInfo stat2 = this.e.getStat("duration");
        if (stat2 != null) {
            LogUtil.a("Suggestion_PlanShareManager", "plan duration:", stat2.getValue());
            this.j = Math.round(((Float) stat2.getValue()).floatValue());
        }
        StatInfo stat3 = this.e.getStat("calorie");
        if (stat3 != null) {
            LogUtil.a("Suggestion_PlanShareManager", "plan calories:", stat3.getValue());
            this.f = ped.b(((Float) stat3.getValue()).floatValue());
        }
    }

    private void d(long j, long j2) {
        this.l = new CountDownLatch(1);
        bug.c().c(j, j2, new e());
        try {
            if (this.l.await(6000L, TimeUnit.MILLISECONDS)) {
                return;
            }
            LogUtil.j("Suggestion_PlanShareManager", "getHealthTrackData wait timeout");
        } catch (InterruptedException unused) {
            LogUtil.e("Suggestion_PlanShareManager", "interrupted while waiting for getHealthTrackData");
        }
    }

    private void b(long j, long j2) {
        CourseApi courseApi = (CourseApi) Services.d("CoursePlanService", CourseApi.class);
        if (courseApi == null) {
            LogUtil.j("Suggestion_PlanShareManager", "courseApi is null");
            return;
        }
        String strI = ift.i(j);
        String strI2 = ift.i(j2);
        LogUtil.a("Suggestion_PlanShareManager", "startDate:", strI, " endDate:", strI2);
        for (WorkoutRecord workoutRecord : courseApi.getWorkoutRecords(this.e.getPlanId(), strI, strI2)) {
            if (!workoutRecord.isFitnessRecordFromDevice() && !workoutRecord.isRunWorkout()) {
                this.g += ped.b(workoutRecord.acquireActualCalorie());
            }
        }
    }

    private void e(long j, long j2, int i) {
        RecordApi recordApi = (RecordApi) Services.d("CoursePlanService", RecordApi.class);
        if (recordApi == null) {
            LogUtil.j("Suggestion_PlanShareManager", "recordApi is null");
            return;
        }
        final ArrayList<WorkoutRecord> arrayList = new ArrayList();
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        recordApi.acquireDetailFitnessRecords(new ntx.d().b(j).d(j2).a(), new IBaseResponseCallback() { // from class: hux.3
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i2, Object obj) {
                List arrayList2 = new ArrayList();
                if (obj != null) {
                    try {
                        if (njy.b(obj, WorkoutRecord.class)) {
                            arrayList2 = (List) obj;
                        }
                    } catch (ClassCastException e2) {
                        LogUtil.j("Suggestion_PlanShareManager", "getFitnessWorkoutData ", e2.getMessage());
                    }
                }
                arrayList.addAll(arrayList2);
                countDownLatch.countDown();
            }
        });
        try {
            if (!countDownLatch.await(6000L, TimeUnit.MILLISECONDS)) {
                LogUtil.j("Suggestion_PlanShareManager", "acquireDetailFitnessRecord wait timeout");
            }
        } catch (InterruptedException unused) {
            LogUtil.e("Suggestion_PlanShareManager", "interrupted while waiting for acquireDetailFitnessRecord");
        }
        if (i == 1) {
            this.d = arrayList;
        }
        for (WorkoutRecord workoutRecord : arrayList) {
            if (!workoutRecord.isFitnessRecordFromDevice()) {
                if (i == 1) {
                    this.f37183b += (long) workoutRecord.getDuration();
                } else {
                    this.f37182a += (long) workoutRecord.getDuration();
                }
            }
        }
    }

    class e extends DataCallback {
        private e() {
        }

        @Override // com.huawei.basefitnessadvice.callback.DataCallback
        public void onFailure(int i, String str) {
            LogUtil.a("Suggestion_PlanShareManager", "RunDataCallback onFail,", Integer.valueOf(i), str);
            hux.this.l.countDown();
        }

        @Override // com.huawei.basefitnessadvice.callback.DataCallback
        public void onSuccess(JSONObject jSONObject) {
            if (jSONObject == null) {
                LogUtil.e("Suggestion_PlanShareManager", "RunDataCallback null.");
                hux.this.l.countDown();
                return;
            }
            LogUtil.a("Suggestion_PlanShareManager", "RunDataCallback onSuccess,", jSONObject.toString());
            double dOptDouble = jSONObject.optDouble("distance");
            double dOptDouble2 = jSONObject.optDouble("calorie");
            hux.c(hux.this, dOptDouble / 1000.0d);
            hux.e(hux.this, ped.b((float) dOptDouble2));
            hux.this.l.countDown();
        }
    }
}
