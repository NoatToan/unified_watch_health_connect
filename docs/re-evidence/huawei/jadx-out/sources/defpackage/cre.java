package defpackage;

import com.google.gson.Gson;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.basefitnessadvice.model.ExerciseProfile;
import com.huawei.basefitnessadvice.model.Plan;
import com.huawei.basefitnessadvice.model.PlanWorkout;
import com.huawei.basefitnessadvice.model.RunWorkout;
import com.huawei.basefitnessadvice.model.intplan.IntPlan;
import com.huawei.exercise.modle.IExerciseAdviceCallback;
import com.huawei.exercise.modle.RunPlanInfo;
import com.huawei.exercise.modle.RunPlanParameter;
import com.huawei.exercise.modle.RunPlanRecordInfo;
import com.huawei.exercise.modle.RunPlanReminder;
import com.huawei.exercise.modle.RunPlanStruct;
import com.huawei.exercise.modle.RunWorkoutPlanStruct;
import com.huawei.exercise.modle.TrainingStruct;
import com.huawei.exercise.modle.WorkoutRecordStatistic;
import com.huawei.health.course.api.CourseApi;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.plan.api.PlanApi;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwfoundationmodel.trackmodel.ISportDataCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnessadvice.Workout;
import health.compact.a.CommonUtil;
import health.compact.a.HEXUtils;
import health.compact.a.Services;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class cre {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f31278a = "yyyy-MM-dd";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile cre f31279b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f31280c = -1;
    private static long e = 86400000;
    private boolean f;
    private Plan i;
    private String m;
    private List<PlanWorkout> p;
    private List<RunWorkout> t;
    private boolean g = false;
    private boolean n = false;
    private String k = "";
    private boolean o = false;
    private RunPlanRecordInfo v = null;
    private boolean q = false;
    private IExerciseAdviceCallback w = null;
    private IBaseResponseCallback r = null;
    private boolean l = false;
    private boolean h = false;
    private int s = 0;
    private IBaseResponseCallback u = new IBaseResponseCallback() { // from class: cre.2
        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            LogUtil.d("Track_HealthAdapter_HWExerciseAdviceManager", "mServiceConnectedListener objData: " + obj);
            if (100000 != i || cre.this.w == null) {
                return;
            }
            LogUtil.a("Track_HealthAdapter_HWExerciseAdviceManager", "ServiceConnected");
            cre creVar = cre.this;
            creVar.a(creVar.w.getDeviceCapability());
            cre.this.f();
            if (cre.this.f) {
                return;
            }
            cre.this.w.registerConnectionStatusChangeNotification(cre.this.j);
            cre.this.f = true;
        }
    };
    private IBaseResponseCallback j = new IBaseResponseCallback() { // from class: cre.3
        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            LogUtil.d("Track_HealthAdapter_HWExerciseAdviceManager", "registerConnectionStatusChangeNotification objData: " + obj);
            try {
                JSONObject jSONObject = new JSONObject(String.valueOf(obj));
                if ("deviceInstantConnected".equals(jSONObject.get("state")) || "health_deviceInstantConnected".equals(jSONObject.get("state"))) {
                    if (cre.this.w != null) {
                        cre creVar = cre.this;
                        creVar.a(creVar.w.getDeviceCapability());
                    }
                    cre.this.f();
                }
            } catch (JSONException e2) {
                LogUtil.e("Track_HealthAdapter_HWExerciseAdviceManager", "mConnectStateChangedCallback error=" + e2.getMessage());
            }
        }
    };
    private IBaseResponseCallback d = new IBaseResponseCallback() { // from class: cre.4
        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            if (100000 == i) {
                LogUtil.d("Track_HealthAdapter_HWExerciseAdviceManager", String.valueOf(obj));
                RunPlanParameter runPlanParameter = (RunPlanParameter) peh.b((String) obj, RunPlanParameter.class);
                LogUtil.a("Track_HealthAdapter_HWExerciseAdviceManager", "runplanlog Run_plan_sync_size_pre=" + runPlanParameter.getRun_plan_sync_size_pre() + ",Run_plan_sync_size_sub=" + runPlanParameter.getRun_plan_sync_size_sub() + ",deviceSHAValue=" + runPlanParameter.getRun_plan_sign());
                StringBuilder sb = new StringBuilder("runplanlog getAdviceParamCallback mDeviceSupportCapacity");
                sb.append(cre.this.g);
                LogUtil.a("Track_HealthAdapter_HWExerciseAdviceManager", sb.toString());
                cre.this.e(runPlanParameter);
                return;
            }
            LogUtil.e("Track_HealthAdapter_HWExerciseAdviceManager", "runplanlog getAdviceParam fail err=" + i);
        }
    };
    private IBaseResponseCallback x = new IBaseResponseCallback() { // from class: cre.10
        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            if (100000 == i) {
                LogUtil.a("Track_HealthAdapter_HWExerciseAdviceManager", "pushNewPlanCallback response success");
            } else {
                LogUtil.e("Track_HealthAdapter_HWExerciseAdviceManager", "pushNewPlanCallback return fail: " + i);
            }
            cre.this.i();
        }
    };
    private IBaseResponseCallback y = new IBaseResponseCallback() { // from class: cre.7
        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            if (100000 == i) {
                LogUtil.a("Track_HealthAdapter_HWExerciseAdviceManager", "SetExercisePlanReminderCallback success");
                return;
            }
            LogUtil.e("Track_HealthAdapter_HWExerciseAdviceManager", "SetExercisePlanReminderCallback fail err=" + i);
        }
    };

    public static cre a() {
        if (f31279b == null) {
            synchronized (cre.class) {
                if (f31279b == null) {
                    f31279b = new cre();
                }
            }
        }
        return f31279b;
    }

    public void d(IExerciseAdviceCallback iExerciseAdviceCallback) {
        LogUtil.a("Track_HealthAdapter_HWExerciseAdviceManager", "registerExerciseAdviceCallback enter");
        this.w = iExerciseAdviceCallback;
        c();
    }

    public void c(Object obj) {
        if (obj == null) {
            LogUtil.e("Track_HealthAdapter_HWExerciseAdviceManager", "setRunPlanETEReport() recordInfo == null");
            return;
        }
        LogUtil.d("Track_HealthAdapter_HWExerciseAdviceManager", "setRunPlanETEReport=" + String.valueOf(obj));
        try {
            this.v = (RunPlanRecordInfo) peh.b(new JSONArray(obj.toString()).get(0).toString(), RunPlanRecordInfo.class);
            this.q = true;
            if (!this.g || this.n || this.s == 3) {
                return;
            }
            ive.c().b((ISportDataCallback) null);
            this.h = true;
        } catch (JSONException e2) {
            LogUtil.e("Track_HealthAdapter_HWExerciseAdviceManager", "setETERport error=" + e2.getMessage());
        }
    }

    public void e(Object obj) {
        LogUtil.d("Track_HealthAdapter_HWExerciseAdviceManager", "setWorkoutETEReport=" + String.valueOf(obj));
        if (obj == null) {
            LogUtil.e("Track_HealthAdapter_HWExerciseAdviceManager", "setWorkoutETEReport() recordInfo == null");
            return;
        }
        try {
            this.v = new RunPlanRecordInfo();
            WorkoutRecordStatistic workoutRecordStatistic = (WorkoutRecordStatistic) peh.b(new JSONObject(obj.toString()).toString(), WorkoutRecordStatistic.class);
            this.v.setRun_plan_record_info_id(workoutRecordStatistic.getWorkout_record_id());
            this.v.setRun_plan_record_info_status(workoutRecordStatistic.getWorkout_record_status());
            this.v.setRun_plan_record_info_load_peak(workoutRecordStatistic.getWorkout_load_peak());
            this.v.setRunPlanRecordInfoAerobicLoadPeak(workoutRecordStatistic.getWorkoutAerobicLoadPeak());
            this.v.setRunPlanRecordInfoAnaerobicLoadPeak(workoutRecordStatistic.getWorkoutAnaerobicLoadPeak());
            this.v.setRunPlanRecordInfoLoadPeakLevel(workoutRecordStatistic.getWorkoutLoadPeakLevel());
            this.v.setRun_plan_record_info_etraining_effect(workoutRecordStatistic.getWorkout_etraining_effect());
            this.v.setRun_plan_record_info_anaerobic_exercise_etraining_effect(workoutRecordStatistic.getWorkout_anaerobic_exercise_etraining_effect());
            this.v.setRun_plan_record_info_Epoc(workoutRecordStatistic.getWorkout_Epoc());
            this.v.setRun_plan_record_info_maxMET(workoutRecordStatistic.getWorkout_maxMET());
            this.v.setRun_plan_record_info_recovery_time(workoutRecordStatistic.getWorkout_recovery_time());
            this.v.setRun_plan_record_info_achieve_percent(0);
            this.v.setRunPlanAlgoType(workoutRecordStatistic.getmAlgoType());
            this.v.setRunPlanRecordInfoRunningAbility(workoutRecordStatistic.getWorkoutRunningAbility());
            this.v.setRunPlanRecordInfoRunningAbilityDiff(workoutRecordStatistic.getWorkoutRunningAbilityDiff());
            this.q = true;
        } catch (JSONException e2) {
            LogUtil.e("Track_HealthAdapter_HWExerciseAdviceManager", "setETERport error=" + e2.getMessage());
        }
    }

    public boolean h() {
        return this.h;
    }

    public void c(boolean z) {
        ReleaseLogUtil.d("Track_HealthAdapter_HWExerciseAdviceManager", "setLinkStatus = " + z);
        this.l = z;
        if (z) {
            this.o = true;
        } else {
            this.o = false;
        }
    }

    private cre() {
        LogUtil.a("Track_HealthAdapter_HWExerciseAdviceManager", "new HWExerciseAdviceManager");
    }

    public void c() {
        IExerciseAdviceCallback iExerciseAdviceCallback = this.w;
        if (iExerciseAdviceCallback != null) {
            iExerciseAdviceCallback.registerServiceConnectedListener(this.u);
        }
    }

    public void f() {
        IExerciseAdviceCallback iExerciseAdviceCallback;
        if (!this.g || (iExerciseAdviceCallback = this.w) == null) {
            return;
        }
        iExerciseAdviceCallback.getDeviceFitnessPlanParamter(this.d);
        LogUtil.a("Track_HealthAdapter_HWExerciseAdviceManager", "getRunPlanParameter");
    }

    public void b() {
        this.q = false;
        this.h = false;
        this.v = null;
    }

    public RunPlanRecordInfo e() {
        LogUtil.a("Track_HealthAdapter_HWExerciseAdviceManager", "getDeviceRunPlanETEResult capacity=" + this.g + ", ETEUSing state=" + this.o);
        if (this.g && 2 == g() && this.o) {
            for (int i = 0; i < 3000; i += 500) {
                LogUtil.d("Track_HealthAdapter_HWExerciseAdviceManager", "getDeviceRunPlanETEResult checktime=" + i);
                if (this.q) {
                    LogUtil.a("Track_HealthAdapter_HWExerciseAdviceManager", "getDeviceRunPlanETEResult return runplan record");
                    IBaseResponseCallback iBaseResponseCallback = this.r;
                    if (iBaseResponseCallback != null) {
                        iBaseResponseCallback.a(0, this.v);
                    }
                    return this.v;
                }
                try {
                    Thread.sleep(500L);
                } catch (InterruptedException e2) {
                    LogUtil.e("Track_HealthAdapter_HWExerciseAdviceManager", "getDeviceRunPlanETEResult exception e=" + e2.getMessage());
                    if (this.r != null) {
                        this.r.a(100001, null);
                    }
                    return null;
                }
            }
            this.o = false;
        }
        IBaseResponseCallback iBaseResponseCallback2 = this.r;
        if (iBaseResponseCallback2 != null) {
            iBaseResponseCallback2.a(100001, null);
        }
        return null;
    }

    public void j() {
        f();
    }

    public void e(final RunPlanParameter runPlanParameter) {
        LogUtil.a("Track_HealthAdapter_HWExerciseAdviceManager", "runplanlog newExercisePlan mDeviceSupportCapacity:" + this.g);
        if (this.g) {
            PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
            if (planApi == null) {
                LogUtil.j("Track_HealthAdapter_HWExerciseAdviceManager", "getCurrentPlan planApi is null.");
            } else {
                planApi.e(new UiCallback<IntPlan>() { // from class: cre.5
                    @Override // com.huawei.basefitnessadvice.callback.UiCallback
                    public void onFailure(int i, String str) {
                        LogUtil.e("Track_HealthAdapter_HWExerciseAdviceManager", "runplanlog getCurrentPlan fail, errorcode=" + i + ",errorinfo=" + str);
                    }

                    @Override // com.huawei.basefitnessadvice.callback.UiCallback
                    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                    public void onSuccess(IntPlan intPlan) {
                        if (intPlan == null || ((!intPlan.getPlanType().equals(IntPlan.PlanType.AI_RUN_PLAN) && !intPlan.getPlanType().equals(IntPlan.PlanType.RUN_PLAN)) || intPlan.getCompatiblePlan() == null)) {
                            cre.this.d();
                            return;
                        }
                        cre.this.i = intPlan.getCompatiblePlan();
                        cre creVar = cre.this;
                        creVar.p = creVar.i.acquireWorkouts();
                        if (cre.this.i.acquireType() != 0) {
                            LogUtil.a("Track_HealthAdapter_HWExerciseAdviceManager", "runplanlog plan is not run plan!");
                            return;
                        }
                        CourseApi courseApi = (CourseApi) Services.d("CoursePlanService", CourseApi.class);
                        if (courseApi != null) {
                            cre.this.c(courseApi, runPlanParameter);
                        } else {
                            LogUtil.j("Track_HealthAdapter_HWExerciseAdviceManager", "newExercisePlan, onSuccess: courseApi is null.");
                        }
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(CourseApi courseApi, final RunPlanParameter runPlanParameter) {
        courseApi.getCoursesWithinCurrentPlan(0, new UiCallback<List<Workout>>() { // from class: cre.1
            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            public void onFailure(int i, String str) {
                LogUtil.e("Track_HealthAdapter_HWExerciseAdviceManager", "runplanlog getRunWorkout list fail errorcode=" + i + ",errorInfo=" + str);
            }

            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onSuccess(List<Workout> list) {
                List<RunWorkout> listD = pea.d(list);
                cre.this.t = listD;
                List listA = cre.this.a(listD);
                if (listA != null) {
                    RunPlanInfo runPlanInfoA = cre.this.a((List<RunWorkoutPlanStruct>) listA, runPlanParameter);
                    cre.this.m = runPlanInfoA.getRun_plan_total_sign();
                    if (cre.this.k.equals(runPlanParameter.getRun_plan_sign())) {
                        LogUtil.a("Track_HealthAdapter_HWExerciseAdviceManager", "runplanlog SHA value is same");
                        cre.this.i();
                    } else {
                        LogUtil.a("Track_HealthAdapter_HWExerciseAdviceManager", "runplanlog SHA value is diffirent");
                        cre creVar = cre.this;
                        creVar.c(runPlanInfoA, creVar.x);
                    }
                }
            }
        });
    }

    public void d() {
        RunPlanInfo runPlanInfo = new RunPlanInfo();
        this.k = "00000000000000000000000000000000";
        runPlanInfo.setRun_plan_total_sign("00000000000000000000000000000000");
        runPlanInfo.setRun_plan_sign(HEXUtils.c(this.k));
        runPlanInfo.setRun_plan_start_date(System.currentTimeMillis());
        ArrayList arrayList = new ArrayList();
        RunPlanStruct runPlanStruct = new RunPlanStruct();
        runPlanStruct.setRun_plan_name("finish");
        runPlanStruct.setRun_plan_date(System.currentTimeMillis());
        arrayList.add(runPlanStruct);
        runPlanInfo.setRunPlanStructList(arrayList);
        this.i = null;
        this.t = null;
        LogUtil.a("Track_HealthAdapter_HWExerciseAdviceManager", "SHA value is not same");
        c(runPlanInfo, this.x);
    }

    public void i() {
        IExerciseAdviceCallback iExerciseAdviceCallback;
        IExerciseAdviceCallback iExerciseAdviceCallback2;
        LogUtil.a("Track_HealthAdapter_HWExerciseAdviceManager", "setRunPlanReminder");
        int iM = m();
        if (iM == f31280c) {
            LogUtil.d("Track_HealthAdapter_HWExerciseAdviceManager", "getRemindTime time is -1 error");
            RunPlanReminder runPlanReminder = new RunPlanReminder();
            runPlanReminder.setRun_plan_reminder_switch(0);
            runPlanReminder.setRun_plan_reminder_time_hour(0);
            runPlanReminder.setRun_plan_reminder_time_minute(0);
            JSONObject jSONObjectC = c("runPlanReminder", runPlanReminder);
            if (jSONObjectC == null || (iExerciseAdviceCallback2 = this.w) == null) {
                return;
            }
            iExerciseAdviceCallback2.setRunPlanReminderSwitch(jSONObjectC, this.y);
            return;
        }
        LogUtil.d("Track_HealthAdapter_HWExerciseAdviceManager", "setRunPlanReminder reminderTime=" + iM);
        RunPlanReminder runPlanReminder2 = new RunPlanReminder();
        runPlanReminder2.setRun_plan_reminder_switch(1);
        runPlanReminder2.setRun_plan_reminder_time_hour(iM / 60);
        runPlanReminder2.setRun_plan_reminder_time_minute(iM % 60);
        JSONObject jSONObjectC2 = c("runPlanReminder", runPlanReminder2);
        if (jSONObjectC2 == null || (iExerciseAdviceCallback = this.w) == null) {
            return;
        }
        iExerciseAdviceCallback.setRunPlanReminderSwitch(jSONObjectC2, this.y);
    }

    private int m() {
        PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
        if (planApi == null) {
            LogUtil.e("Track_HealthAdapter_HWExerciseAdviceManager", "setRunPlanReminder planApi is null.");
            return f31280c;
        }
        planApi.setPlanType(0);
        if (planApi.isOpenRemind()) {
            return planApi.getRemindTime();
        }
        return f31280c;
    }

    private int g() {
        IExerciseAdviceCallback iExerciseAdviceCallback = this.w;
        DeviceInfo currentDeviceInfo = iExerciseAdviceCallback != null ? iExerciseAdviceCallback.getCurrentDeviceInfo() : null;
        if (currentDeviceInfo != null) {
            return currentDeviceInfo.getDeviceConnectState();
        }
        return 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(RunPlanInfo runPlanInfo, IBaseResponseCallback iBaseResponseCallback) {
        IExerciseAdviceCallback iExerciseAdviceCallback;
        LogUtil.a("Track_HealthAdapter_HWExerciseAdviceManager", "setRunPlan");
        JSONObject jSONObjectC = c("runPlanInfo", runPlanInfo);
        if (jSONObjectC == null || (iExerciseAdviceCallback = this.w) == null) {
            return;
        }
        iExerciseAdviceCallback.pushFitnessPlan(jSONObjectC, iBaseResponseCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<RunWorkoutPlanStruct> a(List<RunWorkout> list) {
        ArrayList arrayList = new ArrayList();
        Plan plan = this.i;
        if (plan == null) {
            return null;
        }
        long jC = c(plan.acquireStartDate(), f31278a);
        long jC2 = c(this.i.getEndDate(), f31278a);
        int size = this.p.size();
        LogUtil.d("Track_HealthAdapter_HWExerciseAdviceManager", "starttime=" + jC + ",endtime=" + jC2 + ",workoutcount=" + size);
        for (int i = 0; i < size; i++) {
            PlanWorkout planWorkout = this.p.get(i);
            RunWorkoutPlanStruct runWorkoutPlanStruct = new RunWorkoutPlanStruct();
            if (planWorkout.popWorkoutId() == null) {
                LogUtil.d("Track_HealthAdapter_HWExerciseAdviceManager", "planworkout get workoutid = null, workout name=" + planWorkout.popName());
                runWorkoutPlanStruct.setDate(jC);
                runWorkoutPlanStruct.setRunWorkout(null);
                runWorkoutPlanStruct.setWorkoutName(planWorkout.popName());
                arrayList.add(runWorkoutPlanStruct);
            } else {
                if (list == null) {
                    LogUtil.j("Track_HealthAdapter_HWExerciseAdviceManager", "insertRestDayDate runWorkouts == null");
                    return null;
                }
                for (int i2 = 0; i2 < list.size(); i2++) {
                    RunWorkout runWorkout = list.get(i2);
                    if (runWorkout.acquireId().equalsIgnoreCase(planWorkout.popWorkoutId())) {
                        runWorkoutPlanStruct.setDate(jC);
                        runWorkoutPlanStruct.setRunWorkout(runWorkout);
                        runWorkoutPlanStruct.setWorkoutName(planWorkout.popName());
                        arrayList.add(runWorkoutPlanStruct);
                    }
                }
            }
            jC += e;
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public RunPlanInfo a(List<RunWorkoutPlanStruct> list, RunPlanParameter runPlanParameter) {
        RunPlanInfo runPlanInfo = new RunPlanInfo();
        runPlanInfo.setRun_plan_total_sign(this.i.acquireId());
        ArrayList arrayList = new ArrayList();
        runPlanInfo.setRun_plan_start_date(c(this.i.acquireStartDate(), f31278a));
        for (int i = 0; i < list.size(); i++) {
            if (c(list.get(i).getDate(), runPlanParameter)) {
                RunPlanStruct runPlanStruct = new RunPlanStruct();
                if (list.get(i).getRunWorkout() != null) {
                    RunWorkout runWorkout = list.get(i).getRunWorkout();
                    LogUtil.d("Track_HealthAdapter_HWExerciseAdviceManager", "workout name =" + list.get(i).getWorkoutName() + ",workout id=" + runWorkout.acquireId());
                    runPlanStruct.setRun_plan_name(list.get(i).getWorkoutName());
                    runPlanStruct.setRun_plan_workout_id(CommonUtil.n(BaseApplication.getContext(), runWorkout.acquireId()));
                    runPlanStruct.setRun_plan_train_effect(runWorkout.getTrainingEffect());
                    runPlanStruct.setRun_plan_repeats(runWorkout.getRepeats());
                    runPlanStruct.setRun_plan_distance(runWorkout.acquireDistance() * 1000);
                    runPlanStruct.setRun_plan_date(c(runWorkout.acquireWorkoutDate(), f31278a));
                    a(runWorkout, runPlanStruct);
                } else {
                    runPlanStruct.setRun_plan_name(list.get(i).getWorkoutName());
                    runPlanStruct.setRun_plan_date(list.get(i).getDate());
                }
                arrayList.add(runPlanStruct);
            }
        }
        this.k = e((List<RunPlanStruct>) arrayList);
        LogUtil.a("Track_HealthAdapter_HWExerciseAdviceManager", "======advice======plan sha==" + this.k);
        runPlanInfo.setRun_plan_sign(this.k);
        runPlanInfo.setRunPlanStructList(arrayList);
        return runPlanInfo;
    }

    private void a(RunWorkout runWorkout, RunPlanStruct runPlanStruct) {
        ArrayList arrayList = new ArrayList();
        if (runWorkout.getWarmup() != null) {
            ExerciseProfile warmup = runWorkout.getWarmup();
            TrainingStruct trainingStruct = new TrainingStruct();
            trainingStruct.setTraining_duration(warmup.getDuration());
            trainingStruct.setTraining_hr_limit_high(warmup.getHeartRate().getMax());
            trainingStruct.setTraining_hr_limit_low(warmup.getHeartRate().getMin());
            trainingStruct.setTraining_intensity_limit_high(warmup.getIntensity().getMax());
            trainingStruct.setTraining_intensity_limit_low(warmup.getIntensity().getMin());
            trainingStruct.setTraining_speed_limit_high(warmup.getRunningSpeed().getMax());
            trainingStruct.setTraining_speed_limit_low(warmup.getRunningSpeed().getMin());
            trainingStruct.setTraining_type(1);
            arrayList.add(trainingStruct);
        }
        if (runWorkout.getWork() != null) {
            ExerciseProfile work = runWorkout.getWork();
            TrainingStruct trainingStruct2 = new TrainingStruct();
            trainingStruct2.setTraining_duration(work.getDuration());
            trainingStruct2.setTraining_hr_limit_high(work.getHeartRate().getMax());
            trainingStruct2.setTraining_hr_limit_low(work.getHeartRate().getMin());
            trainingStruct2.setTraining_intensity_limit_high(work.getIntensity().getMax());
            trainingStruct2.setTraining_intensity_limit_low(work.getIntensity().getMin());
            trainingStruct2.setTraining_speed_limit_high(work.getRunningSpeed().getMax());
            trainingStruct2.setTraining_speed_limit_low(work.getRunningSpeed().getMin());
            trainingStruct2.setTraining_type(2);
            arrayList.add(trainingStruct2);
        }
        a(runWorkout, arrayList);
        c(runWorkout, arrayList);
        runPlanStruct.setTrainingStructList(arrayList);
    }

    private void a(RunWorkout runWorkout, List<TrainingStruct> list) {
        if (runWorkout.getRest() != null) {
            ExerciseProfile rest = runWorkout.getRest();
            TrainingStruct trainingStruct = new TrainingStruct();
            trainingStruct.setTraining_duration(rest.getDuration());
            trainingStruct.setTraining_hr_limit_high(rest.getHeartRate().getMax());
            trainingStruct.setTraining_hr_limit_low(rest.getHeartRate().getMin());
            trainingStruct.setTraining_intensity_limit_high(rest.getIntensity().getMax());
            trainingStruct.setTraining_intensity_limit_low(rest.getIntensity().getMin());
            trainingStruct.setTraining_speed_limit_high(rest.getRunningSpeed().getMax());
            trainingStruct.setTraining_speed_limit_low(rest.getRunningSpeed().getMin());
            trainingStruct.setTraining_type(3);
            list.add(trainingStruct);
        }
    }

    private void c(RunWorkout runWorkout, List<TrainingStruct> list) {
        if (runWorkout.getCooldown() != null) {
            ExerciseProfile cooldown = runWorkout.getCooldown();
            TrainingStruct trainingStruct = new TrainingStruct();
            trainingStruct.setTraining_duration(cooldown.getDuration());
            trainingStruct.setTraining_hr_limit_high(cooldown.getHeartRate().getMax());
            trainingStruct.setTraining_hr_limit_low(cooldown.getHeartRate().getMin());
            trainingStruct.setTraining_intensity_limit_high(cooldown.getIntensity().getMax());
            trainingStruct.setTraining_intensity_limit_low(cooldown.getIntensity().getMin());
            trainingStruct.setTraining_speed_limit_high(cooldown.getRunningSpeed().getMax());
            trainingStruct.setTraining_speed_limit_low(cooldown.getRunningSpeed().getMin());
            trainingStruct.setTraining_type(4);
            list.add(trainingStruct);
        }
    }

    private long c(String str, String str2) {
        if (str == null) {
            return 0L;
        }
        try {
            if ("".equals(str)) {
                return 0L;
            }
            return new SimpleDateFormat(str2).parse(str).getTime();
        } catch (ParseException e2) {
            LogUtil.e("Track_HealthAdapter_HWExerciseAdviceManager", "SimpleDateFormat parse error: e= " + e2.getMessage());
            return 0L;
        }
    }

    private boolean c(long j, RunPlanParameter runPlanParameter) {
        long jC = c(new SimpleDateFormat(f31278a).format(new Date(System.currentTimeMillis())), f31278a);
        LogUtil.d("Track_HealthAdapter_HWExerciseAdviceManager", "check time today=" + jC + ",checktime=" + j);
        if (runPlanParameter == null) {
            return false;
        }
        int run_plan_sync_size_pre = runPlanParameter.getRun_plan_sync_size_pre();
        int run_plan_sync_size_sub = runPlanParameter.getRun_plan_sync_size_sub();
        long j2 = e;
        return jC - (((long) run_plan_sync_size_pre) * j2) <= j && jC + (j2 * ((long) run_plan_sync_size_sub)) > j;
    }

    private String e(List<RunPlanStruct> list) {
        StringBuffer stringBuffer = new StringBuffer();
        Iterator<RunPlanStruct> it = list.iterator();
        while (it.hasNext()) {
            stringBuffer.append(it.next().toString());
        }
        return niv.e(stringBuffer.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                if (jSONObject.has("isSupportExerciseAdvice")) {
                    this.g = jSONObject.getBoolean("isSupportExerciseAdvice");
                }
                if (jSONObject.has("isSupportWorkoutExerciseDisplayLink")) {
                    this.n = jSONObject.getBoolean("isSupportWorkoutExerciseDisplayLink");
                }
            } catch (JSONException unused) {
                LogUtil.e("Track_HealthAdapter_HWExerciseAdviceManager", "capability ");
            }
        } else {
            LogUtil.a("Track_HealthAdapter_HWExerciseAdviceManager", "DeviceCapability is null");
        }
        LogUtil.a("Track_HealthAdapter_HWExerciseAdviceManager", "get Device Support runplan Capacity, capacity=" + this.g + ", mIsSupportDisplayLink=" + this.n);
    }

    private JSONObject c(String str, Object obj) {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject();
            try {
                jSONObject.put(str, new Gson().toJson(obj));
                return jSONObject;
            } catch (JSONException e2) {
                e = e2;
                LogUtil.e("Track_HealthAdapter_HWExerciseAdviceManager", "toJsonObject error=" + e.getMessage());
                return jSONObject;
            }
        } catch (JSONException e3) {
            e = e3;
            jSONObject = null;
        }
    }
}
