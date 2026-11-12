package com.huawei.health.suggestion.ui.fitness.viewmodel;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.google.gson.Gson;
import com.huawei.basefitnessadvice.model.intplan.IntPlan;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.course.api.CourseApi;
import com.huawei.health.courseplanservice.api.DataPlatformApi;
import com.huawei.health.courseplanservice.api.RecordApi;
import com.huawei.health.device.model.RecordAction;
import com.huawei.health.plan.api.PlanApi;
import com.huawei.health.sport.model.WorkoutRecord;
import com.huawei.health.suggestion.CoachController;
import com.huawei.health.suggestion.FitnessExternalUtils;
import com.huawei.health.suggestion.ui.fitness.module.CoachData;
import com.huawei.health.suggestion.ui.fitness.module.Motion;
import com.huawei.hihealth.HiDataInsertOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.HiSyncOption;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiDataOperateListener;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.operation.OperationKey;
import com.huawei.operation.utils.Constants;
import defpackage.gzz;
import defpackage.hcb;
import defpackage.hdo;
import defpackage.hjx;
import defpackage.hkt;
import defpackage.hvp;
import defpackage.idy;
import defpackage.ieg;
import defpackage.iei;
import defpackage.pck;
import health.compact.a.CommonUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.Services;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class WorkoutRecordViewModel extends ViewModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f9520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ArrayList<RecordAction> f9521b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f9522c;
    private float d;
    private String i;
    private long f = 0;
    private long h = 0;
    public volatile boolean e = false;
    private MutableLiveData<WorkoutRecord> j = new MutableLiveData<>();

    public void b(WorkoutRecord workoutRecord) {
        this.j.setValue(workoutRecord);
    }

    public WorkoutRecord d() {
        return this.j.getValue();
    }

    public void c(LifecycleOwner lifecycleOwner) {
        this.j.removeObservers(lifecycleOwner);
    }

    public void e(List<Motion> list, CoachData coachData, long j, long j2, long j3) {
        this.f9522c = 0.0f;
        this.d = 0.0f;
        this.f9521b = new ArrayList<>(list.size());
        int i = 0;
        for (Motion motion : list) {
            if (motion != null) {
                int iAcquireActionTrainTime = motion.acquireActionTrainTime();
                this.f9521b.add(motion.getLongRecordAction());
                i += iAcquireActionTrainTime;
            }
        }
        if (coachData.acquireDuration() == 0) {
            LogUtil.j("Suggestion_WorkoutRecordViewModel", "calulateRecordData acquireDuration == 0");
            return;
        }
        this.f9522c = (i * 100.0f) / coachData.acquireDuration();
        if (CoachController.c().f()) {
            this.d = CoachController.c().d() * 1000.0f;
        } else {
            this.d = ((System.currentTimeMillis() - j) - j2) - j3;
            ReleaseLogUtil.d("Suggestion_WorkoutRecordViewModel", "now:", Long.valueOf(System.currentTimeMillis()), "startTrainTime:", Long.valueOf(j), "pauseDuration:", Long.valueOf(j2), "loadingDuration:", Long.valueOf(j3));
        }
    }

    public void e(float f, float f2, float f3, boolean z) {
        WorkoutRecord workoutRecordD = d();
        workoutRecordD.saveCalorie(f3);
        workoutRecordD.saveExerciseTime(Calendar.getInstance().getTimeInMillis());
        workoutRecordD.saveRecordType(!TextUtils.isEmpty(workoutRecordD.acquirePlanId()) ? 1 : 0);
        workoutRecordD.saveActualCalorie(f);
        workoutRecordD.setActiveCalorie(f2);
        LogUtil.a("Suggestion_WorkoutRecordViewModel", "saveDataToRecord actualCalories ：", Float.valueOf(f));
        if (z) {
            workoutRecordD.setSportRecordType(1);
        }
        workoutRecordD.saveFinishRate(this.f9522c);
        workoutRecordD.setDuration((int) this.d);
        String json = new Gson().toJson(this.f9521b);
        if (Constants.NULL.equals(json)) {
            json = "";
        }
        workoutRecordD.saveActionSummary(json);
    }

    public void b(final WorkoutRecord workoutRecord, ExecutorService executorService) {
        if (workoutRecord == null || executorService == null) {
            LogUtil.j("Suggestion_WorkoutRecordViewModel", "saveRecord() context or cachedThreadPool is null");
        } else {
            executorService.execute(new Runnable() { // from class: com.huawei.health.suggestion.ui.fitness.viewmodel.WorkoutRecordViewModel.4
                @Override // java.lang.Runnable
                public void run() {
                    PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
                    if (planApi == null) {
                        LogUtil.j("Suggestion_WorkoutRecordViewModel", "updatePlanProgress : planApiRun is null.");
                        return;
                    }
                    planApi.setPlanType(0);
                    planApi.updatePlanProgress(workoutRecord);
                    if (!TextUtils.isEmpty(workoutRecord.acquirePlanId()) && !FitnessExternalUtils.b()) {
                        LogUtil.a("Suggestion_WorkoutRecordViewModel", "saveAndFinish() planId:", workoutRecord.acquirePlanId());
                        PlanApi planApi2 = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
                        if (planApi2 == null) {
                            LogUtil.j("Suggestion_WorkoutRecordViewModel", "updatePlanProgress : planApiPkg is null.");
                            return;
                        } else {
                            planApi2.setPlanType(3);
                            planApi2.updatePlanProgress(workoutRecord);
                        }
                    }
                    hvp.d(0, hvp.d(workoutRecord.startTime()));
                }
            });
        }
    }

    public void c(String str, int i) {
        LogUtil.a("Suggestion_WorkoutRecordViewModel", "saveWorkoutCourseRecord");
        WorkoutRecord workoutRecordD = d();
        if (workoutRecordD == null) {
            LogUtil.j("Suggestion_WorkoutRecordViewModel", "workout record is null, return");
            return;
        }
        HiHealthData hiHealthData = new HiHealthData();
        hiHealthData.setDeviceUuid("-1");
        if (!this.e) {
            this.e = true;
            hiHealthData.setStartTime(workoutRecordD.startTime());
            hiHealthData.setEndTime(workoutRecordD.acquireExerciseTime());
            this.f = workoutRecordD.startTime();
            this.h = workoutRecordD.acquireExerciseTime();
            LogUtil.a("Suggestion_WorkoutRecordViewModel", "first sync, startTime: ", Long.valueOf(workoutRecordD.startTime()), " endTime: ", Long.valueOf(workoutRecordD.acquireExerciseTime()));
        } else {
            long j = this.f;
            if (j != 0 && this.h != 0) {
                hiHealthData.setStartTime(j);
                hiHealthData.setEndTime(this.h);
                LogUtil.a("Suggestion_WorkoutRecordViewModel", "update sync");
            }
        }
        hiHealthData.setType(DicDataTypeUtil.DataType.COURSE_RECORD.value());
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("trainTime", workoutRecordD.getDuration() / 1000);
            jSONObject.put("lessonID", String.valueOf(workoutRecordD.acquireWorkoutId()));
            jSONObject.put("lessonName", workoutRecordD.acquireWorkoutName());
            jSONObject.put("resourceType", str);
            jSONObject.put("lessonDuration", i);
            if (workoutRecordD.acquireCategory() == 137) {
                jSONObject.put("lessonType", 6);
            }
        } catch (JSONException e) {
            ReleaseLogUtil.a("Suggestion_WorkoutRecordViewModel", "value JSONException ", ExceptionUtils.c(e));
        }
        hiHealthData.setMetaData(jSONObject.toString());
        hiHealthData.setSequenceData("{}");
        HiDataInsertOption hiDataInsertOption = new HiDataInsertOption();
        hiDataInsertOption.addData(hiHealthData);
        HiHealthManager.d(BaseApplication.getContext()).insertHiHealthData(hiDataInsertOption, new HiDataOperateListener() { // from class: hnv
            @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
            public final void onResult(int i2, Object obj) {
                this.f36968b.c(i2, obj);
            }
        });
    }

    public /* synthetic */ void c(int i, Object obj) {
        ReleaseLogUtil.d("Suggestion_WorkoutRecordViewModel", "error code is ", Integer.valueOf(i), " object is ", obj);
        if (i == 0) {
            c();
        }
    }

    private void c() {
        ReleaseLogUtil.d("Suggestion_WorkoutRecordViewModel", "is network connected : ", Boolean.valueOf(CommonUtil.ab(BaseApplication.getContext())));
        HiSyncOption hiSyncOption = new HiSyncOption();
        hiSyncOption.setSyncModel(2);
        hiSyncOption.setSyncAction(0);
        hiSyncOption.setSyncDataType(DicDataTypeUtil.DataType.COURSE_RECORD.value());
        hiSyncOption.setSyncMethod(2);
        hiSyncOption.setForceSync(true);
        LogUtil.a("Suggestion_WorkoutRecordViewModel", "type is ", Integer.valueOf(DicDataTypeUtil.DataType.COURSE_RECORD.value()));
        hiSyncOption.setSyncId(System.currentTimeMillis());
        HiHealthNativeApi.a(BaseApplication.getContext()).synCloud(hiSyncOption, null);
    }

    public WorkoutRecord e(hdo hdoVar, long j, int i, long j2, int i2, int[] iArr) {
        WorkoutRecord workoutRecordD = d();
        pck pckVar = new pck();
        if (CoachController.c().f() && hdoVar != null) {
            workoutRecordD.saveHeartRateDataList(hdoVar.getHeartRateList());
            workoutRecordD.saveInvalidHeartRateList(hdoVar.getInvalidHeartRateList());
            pckVar.a(hdoVar.getAverageHeartRate());
            pckVar.c(j);
            pckVar.l(i);
            pckVar.n(i2);
            int[] iArrB = new int[5];
            if (!gzz.a(iArr)) {
                LogUtil.a("Suggestion_WorkoutRecordViewModel", "hrZoneConfig is valid");
                pckVar.c(Arrays.toString(iArr));
                iArrB = gzz.b(hdoVar.getHeartRateList(), iArr, workoutRecordD.getDuration(), workoutRecordD.acquireHeartRateConfig());
            }
            if (gzz.a(iArrB)) {
                LogUtil.a("Suggestion_WorkoutRecordViewModel", "timeArea invalid:", Arrays.toString(iArrB));
            } else {
                pckVar.h(iArrB[0]);
                pckVar.g(iArrB[1]);
                pckVar.f(iArrB[2]);
                pckVar.j(iArrB[3]);
                pckVar.i(iArrB[4]);
                LogUtil.a("Suggestion_WorkoutRecordViewModel", "save heartRate timeArea:", Arrays.toString(iArrB));
            }
        }
        if (!TextUtils.isEmpty(workoutRecordD.acquirePlanId())) {
            workoutRecordD.setPlanTrainDate(ieg.b(j2));
        }
        pckVar.b(workoutRecordD.acquireCategory());
        workoutRecordD.saveExtend(pckVar, false);
        workoutRecordD.setStartTime(j);
        workoutRecordD.saveWorkoutPackageId(this.i);
        workoutRecordD.saveCourseBelongType(this.f9520a);
        return workoutRecordD;
    }

    public void a(String str, int i) {
        this.i = str;
        this.f9520a = i;
    }

    public void b(final Context context, ExecutorService executorService) {
        if (context == null || executorService == null) {
            LogUtil.j("Suggestion_WorkoutRecordViewModel", "context == null || cachedThreadPool == null");
            return;
        }
        final WorkoutRecord workoutRecordD = d();
        if (TextUtils.isEmpty(workoutRecordD.acquireWorkoutId())) {
            return;
        }
        LogUtil.a("Suggestion_WorkoutRecordViewModel", "saveAndFinish() workoutId:", workoutRecordD.acquireWorkoutId());
        executorService.execute(new Runnable() { // from class: com.huawei.health.suggestion.ui.fitness.viewmodel.WorkoutRecordViewModel.5
            @Override // java.lang.Runnable
            public void run() {
                hjx.d(context, workoutRecordD);
            }
        });
    }

    public void d(final Map<Long, HiHealthData> map, ExecutorService executorService) {
        final Context context = BaseApplication.getContext();
        if (context == null || executorService == null) {
            LogUtil.j("Suggestion_WorkoutRecordViewModel", "insertCalories() context or cachedThreadPool is null");
        } else {
            final WorkoutRecord workoutRecordD = d();
            executorService.execute(new Runnable() { // from class: com.huawei.health.suggestion.ui.fitness.viewmodel.WorkoutRecordViewModel.1
                @Override // java.lang.Runnable
                public void run() {
                    DataPlatformApi dataPlatformApi = (DataPlatformApi) Services.d("CoursePlanService", DataPlatformApi.class);
                    if (dataPlatformApi == null) {
                        LogUtil.j("Suggestion_WorkoutRecordViewModel", "executeThread dataPlatformApi is null.");
                        return;
                    }
                    WorkoutRecord workoutRecord = workoutRecordD;
                    boolean zIsLinkWear = workoutRecord != null ? workoutRecord.isLinkWear() : false;
                    if (!zIsLinkWear) {
                        dataPlatformApi.insertCalorieData(context, workoutRecordD);
                        dataPlatformApi.insertCaloriePoints(context, map);
                    }
                    ReleaseLogUtil.d("Suggestion_WorkoutRecordViewModel", "insertCalories isFormWear:", Boolean.valueOf(zIsLinkWear));
                    CourseApi courseApi = (CourseApi) Services.d("CoursePlanService", CourseApi.class);
                    if (courseApi != null) {
                        courseApi.saveCourseTrainstatis(workoutRecordD);
                    }
                    LoginInit loginInit = LoginInit.getInstance(BaseApplication.getContext());
                    if (loginInit.getUsetId() != null) {
                        RecordApi recordApi = (RecordApi) Services.d("CoursePlanService", RecordApi.class);
                        if (recordApi == null) {
                            LogUtil.j("Suggestion_WorkoutRecordViewModel", "executeThread recordApi is null.");
                        } else {
                            recordApi.addRecordFor(loginInit.getUsetId(), workoutRecordD, true);
                            LogUtil.a("Suggestion_WorkoutRecordViewModel", "recordApi.addRecordFor");
                        }
                    }
                }
            });
        }
    }

    public void c(final Intent intent, final long j) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.health.suggestion.ui.fitness.viewmodel.WorkoutRecordViewModel.3
            @Override // java.lang.Runnable
            public void run() {
                OpAnalyticsUtil.getInstance().setEventWithActionType(5, OperationKey.HEALTH_APP_RUN_END_2050006.value());
                LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>(16);
                linkedHashMap.put("actiontype", String.valueOf(5));
                OpAnalyticsUtil.getInstance().setEvent2nd(OperationKey.HEALTH_APP_PVUV_85050001.value(), linkedHashMap);
                JSONObject jSONObject = new JSONObject();
                WorkoutRecord workoutRecordD = WorkoutRecordViewModel.this.d();
                if (workoutRecordD == null) {
                    LogUtil.j("Suggestion_WorkoutRecordViewModel", "doBi record == null");
                    return;
                }
                PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
                IntPlan currentIntPlan = planApi != null ? planApi.getCurrentIntPlan() : null;
                try {
                    if (hkt.c(currentIntPlan, workoutRecordD.acquirePlanId())) {
                        jSONObject.put("plan_name", currentIntPlan.getMetaInfo().getName());
                        jSONObject.put("type", iei.c(currentIntPlan));
                    }
                    if (idy.d()) {
                        jSONObject.put("start_time", j);
                    }
                    jSONObject.put("course_version", workoutRecordD.acquireVersion());
                    jSONObject.put("calories", (int) workoutRecordD.acquireActualCalorie());
                    jSONObject.put("duration", workoutRecordD.getDuration());
                    jSONObject.put("isAICourse", iei.d(workoutRecordD));
                    WorkoutRecordViewModel.e(intent, jSONObject);
                    workoutRecordD.getBiJson(jSONObject);
                    HashMap map = new HashMap(1);
                    map.put("data", jSONObject.toString());
                    idy.b("1120005", map);
                } catch (JSONException e) {
                    LogUtil.e("Suggestion_WorkoutRecordViewModel", "doBi()", LogAnonymous.b(e));
                }
            }
        });
    }

    public static void e(Intent intent, JSONObject jSONObject) {
        if (intent == null || jSONObject == null) {
            LogUtil.j("Suggestion_WorkoutRecordViewModel", "setBiMap getIntent() != null || object == null");
            return;
        }
        Map map = new HashMap();
        if (intent.getSerializableExtra("BI_INTENT_COURSE") instanceof Map) {
            map = (Map) intent.getSerializableExtra("BI_INTENT_COURSE");
        }
        if (map == null) {
            LogUtil.j("Suggestion_WorkoutRecordViewModel", "setBiMap biMap == null");
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (entry != null) {
                try {
                    jSONObject.put((String) entry.getKey(), entry.getValue());
                } catch (JSONException e) {
                    LogUtil.e("Suggestion_WorkoutRecordViewModel", "setBiMap jsonException ", LogAnonymous.b(e));
                }
            }
        }
    }

    public void a(final long j, final int i, final Intent intent, final long j2) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: hnu
            @Override // java.lang.Runnable
            public final void run() {
                this.f36965a.a(intent, j2, i, j);
            }
        });
    }

    public /* synthetic */ void a(Intent intent, long j, int i, long j2) {
        String stringExtra = intent != null ? intent.getStringExtra("entrance") : null;
        if (TextUtils.isEmpty(stringExtra)) {
            stringExtra = "otherModel";
        }
        HashMap map = new HashMap(10);
        PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
        IntPlan currentIntPlan = planApi != null ? planApi.getCurrentIntPlan() : null;
        WorkoutRecord workoutRecordD = d();
        if (hkt.c(currentIntPlan, workoutRecordD.acquirePlanId())) {
            map.put("type", Integer.valueOf(iei.c(currentIntPlan)));
        }
        map.put("start_time", Long.valueOf(j));
        map.put("end_time", Long.valueOf(System.currentTimeMillis()));
        if (i != 0) {
            map.put("finish_rate", idy.c((j2 / i) * 100.0f));
        }
        map.put("workout_name", workoutRecordD.acquireWorkoutName());
        map.put("entrance", stringExtra);
        map.put("course_version", workoutRecordD.acquireVersion());
        map.put("course_time", Integer.valueOf(i));
        map.put("duration", Long.valueOf(j2));
        idy.b("1130026", map);
    }

    public void b() {
        if (d() != null) {
            hcb.a().onChange(d().acquireWorkoutId(), 3, null);
        }
    }
}
