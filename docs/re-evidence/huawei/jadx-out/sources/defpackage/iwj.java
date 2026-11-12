package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.basefitnessadvice.model.intplan.IntPlan;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.device.model.RecordAction;
import com.huawei.health.fitnessadvice.api.FitnessAdviceApi;
import com.huawei.health.plan.api.PlanApi;
import com.huawei.health.sport.CourseUpdateListener;
import com.huawei.health.sport.ITargetUpdateListener;
import com.huawei.health.sport.model.CourseEnvParams;
import com.huawei.health.sport.model.WorkoutRecord;
import com.huawei.health.sport.model.data.RecordPlanInfo;
import com.huawei.health.suggestion.PluginSuggestion;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseConstants;
import com.huawei.hwfoundationmodel.trackmodel.ISportDataCallback;
import com.huawei.hwfoundationmodel.trackmodel.MotionPath;
import com.huawei.hwfoundationmodel.trackmodel.MotionPathSimplify;
import com.huawei.operation.utils.Constants;
import com.huawei.pluginfitnessadvice.ChoreographedSingleAction;
import com.huawei.pluginfitnessadvice.FitWorkout;
import health.compact.a.LogAnonymous;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import health.compact.a.util.LogUtil;
import health.compact.a.utils.StringUtils;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
public class iwj implements ITargetUpdateListener, ISportDataCallback {
    private static final Object d = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f38134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<ChoreographedSingleAction> f38135b;
    private CourseUpdateListener g;
    private List<RecordAction> h;
    private FitWorkout i;
    private RecordPlanInfo j;
    private String k;
    private WorkoutRecord m;
    private int f = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private dea f38136c = new dea();
    private int l = 0;
    private String n = Integer.toString(20002);
    private Map<String, Object> e = new HashMap();

    public void d(Bundle bundle) {
        if (bundle != null) {
            FitWorkout fitWorkout = (FitWorkout) bundle.getParcelable("runCourseDetail");
            RecordPlanInfo recordPlanInfo = (RecordPlanInfo) bundle.getParcelable("coursePlanInfo");
            this.l = bundle.getInt("runningCourse", 0);
            this.k = bundle.getString("workout_package_id");
            this.f38134a = bundle.getInt("course_belong_type");
            if (bundle.getSerializable("BI_INTENT_COURSE") instanceof Map) {
                this.e = (Map) bundle.getSerializable("BI_INTENT_COURSE");
            }
            this.e = Collections.synchronizedMap(this.e);
            e(fitWorkout, recordPlanInfo);
        }
    }

    public void e(FitWorkout fitWorkout, RecordPlanInfo recordPlanInfo) {
        if (fitWorkout == null) {
            return;
        }
        this.i = fitWorkout;
        this.j = recordPlanInfo;
        o();
        a(fitWorkout);
        f();
        c(true);
        l();
    }

    private void a(FitWorkout fitWorkout) {
        if (fitWorkout.isNewRunCourse()) {
            this.f38135b = ien.b(this.i);
            return;
        }
        this.f38135b = ien.c(ien.a(this.i));
        FitWorkout fitWorkout2 = this.i;
        fitWorkout2.saveMeasurementType(nuc.a(fitWorkout2.acquireMeasurementType()));
    }

    public int b() {
        return this.l;
    }

    public boolean c() {
        FitWorkout fitWorkout = this.i;
        if (fitWorkout != null) {
            return fitWorkout.isCustomCourse();
        }
        return false;
    }

    public boolean a() {
        FitWorkout fitWorkout = this.i;
        if (fitWorkout != null) {
            return fitWorkout.isMusicRun();
        }
        return false;
    }

    public Map<String, Object> e() {
        HashMap map;
        synchronized (this.e) {
            map = new HashMap(this.e);
        }
        return map;
    }

    private void f() {
        if (!i()) {
            LogUtil.d("Track_CourseManager", "initRecordData() failed with invalid course info.");
            return;
        }
        if (this.m != null) {
            LogUtil.d("Track_CourseManager", "initRecordData() success with mWorkoutRecord has init.");
            return;
        }
        WorkoutRecord workoutRecord = new WorkoutRecord();
        this.m = workoutRecord;
        workoutRecord.saveWorkoutId(this.i.acquireId());
        this.m.saveCalorie(this.i.acquireCalorie());
        this.m.saveCategory(this.i.getCategory());
        this.m.saveDistance((float) this.i.acquireDistance());
        this.m.saveWorkoutId(this.i.acquireId());
        this.m.saveWorkoutName(this.i.acquireName());
        this.m.saveWorkoutDate(DateFormatUtil.d(System.currentTimeMillis(), DateFormatUtil.DateFormatType.DATE_FORMAT_YYYY_MM_DD));
        if (TextUtils.isEmpty(this.i.accquireVersion())) {
            this.m.saveVersion("2.0");
        } else {
            this.m.saveVersion(this.i.accquireVersion());
        }
        RecordPlanInfo recordPlanInfo = this.j;
        if (recordPlanInfo != null) {
            a(this.m, recordPlanInfo);
        }
        this.m.setTargetType(this.i.acquireMeasurementType());
        this.m.setTargetValue((long) (this.i.acquireMeasurementType() == 1 ? this.i.acquireDuration() : this.i.acquireDistance()));
        this.m.setCourseDefineType(this.i.getCourseDefineType());
        this.m.setCourseSportType(iwy.a(BaseApplication.b()).k());
        this.m.setCourseModifiedTime(this.i.getModified() == 0 ? this.i.getPublishDate() : this.i.getModified());
        this.m.saveFinishRate(0.0f);
        this.m.setSportRecordType(1);
        this.m.saveWorkoutPackageId(this.k);
        this.m.saveCourseBelongType(this.f38134a);
    }

    private void a(WorkoutRecord workoutRecord, RecordPlanInfo recordPlanInfo) {
        workoutRecord.saveRecordType(1);
        workoutRecord.setPlanTrainDate(recordPlanInfo.getPlanTrainDate());
        workoutRecord.savePlanId(recordPlanInfo.getPlanId());
        workoutRecord.saveWorkoutOrder(recordPlanInfo.getWorkoutOrder());
    }

    private void c(final boolean z) {
        dea deaVar = new dea();
        this.f38136c = deaVar;
        deaVar.b(new CourseEnvParams.OnInitCompleteListener() { // from class: iwm
            @Override // com.huawei.health.sport.model.CourseEnvParams.OnInitCompleteListener
            public final void onInitComplete() {
                this.f38137b.a(z);
            }
        });
        this.f38136c.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(boolean z) {
        if (i()) {
            List<RecordAction> list = this.h;
            if ((list == null || list.size() != this.f38135b.size()) && this.f38136c.a() != null) {
                this.h = ien.d(this.f38135b, this.f38136c.a().getMaxThreshold());
            }
            if (z) {
                iwy.a(BaseApplication.b()).b(ifk.b(this.f38135b, this.f38136c));
            }
            iwy.a(BaseApplication.b()).d(this);
            iwy.a(BaseApplication.b()).e(this, 1L);
            this.f38136c.a(iwy.a(BaseApplication.b()).am());
            this.g = PluginSuggestion.getInstance().getRunCourseVoiceManager(this.f38135b, this.i, this.l == 2, this.f38136c);
            iwy.a(BaseApplication.b()).a("courseVoice", this.g);
            iwy.a(BaseApplication.b()).e("courseVoice", this.g);
            List<gze> listN = iwy.a(BaseApplication.b()).n();
            if (njy.b(listN)) {
                gze gzeVar = listN.get(0);
                if (z || gzeVar == null || gzeVar.c() < 1) {
                    return;
                }
                int iC = gzeVar.c() - 1;
                this.f = iC;
                this.g.seekToAction(iC);
            }
        }
    }

    public void e(MotionPathSimplify motionPathSimplify) {
        k();
        FitWorkout fitWorkout = this.i;
        if (fitWorkout == null) {
            LogUtil.d("Track_CourseManager", "restoreData with null workout");
            return;
        }
        if (motionPathSimplify != null) {
            this.l = motionPathSimplify.requestRunCourseType();
            String extendDataString = motionPathSimplify.getExtendDataString("planInfo");
            if (!TextUtils.isEmpty(extendDataString)) {
                this.j = (RecordPlanInfo) qqt.e(extendDataString, RecordPlanInfo.class);
            }
        } else {
            this.l = ien.d(fitWorkout) ? 2 : 1;
        }
        a(this.i);
        f();
        c(false);
    }

    public void c(MotionPathSimplify motionPathSimplify) {
        WorkoutRecord workoutRecord;
        if (!i() || motionPathSimplify == null || (workoutRecord = this.m) == null) {
            return;
        }
        motionPathSimplify.saveRunCourseId(workoutRecord.acquireWorkoutId());
        motionPathSimplify.saveRunCourseType(this.l);
        motionPathSimplify.addExtendDataMap("courseName", this.m.acquireWorkoutName());
        motionPathSimplify.addExtendDataMap("sportRecordType", String.valueOf(0));
        motionPathSimplify.addExtendDataMap("attachedRecordType", String.valueOf(1));
        RecordPlanInfo recordPlanInfo = this.j;
        if (recordPlanInfo != null) {
            motionPathSimplify.addExtendDataMap("planInfo", qqt.b(recordPlanInfo));
        }
        FitWorkout fitWorkout = this.i;
        if (fitWorkout != null) {
            motionPathSimplify.addExtendDataMap("calorie", String.valueOf(fitWorkout.acquireCalorie()));
            motionPathSimplify.addExtendDataMap("distance", String.valueOf(this.i.acquireDistance()));
            motionPathSimplify.addExtendDataMap("courseVersion", this.i.accquireVersion());
            motionPathSimplify.addExtendDataMap("wearType", String.valueOf(0));
        }
        n();
    }

    public boolean i() {
        return this.i != null && njy.b(this.f38135b);
    }

    @Override // com.huawei.health.sport.ITargetUpdateListener
    public void onTargetDataUpdate(gze gzeVar) {
        RecordAction recordAction;
        if (gzeVar == null || !njy.c(this.h, gzeVar.c() - 1) || (recordAction = this.h.get(gzeVar.c() - 1)) == null) {
            return;
        }
        c(recordAction, gzeVar);
        n();
    }

    private void c(RecordAction recordAction, gze gzeVar) {
        recordAction.setFinishRate(gzeVar.b() * 100.0f);
        int actionTargetType = recordAction.getActionTargetType();
        if (actionTargetType == 1) {
            recordAction.setFinishedAction((int) TimeUnit.MILLISECONDS.toSeconds((long) (gzeVar.g() - gzeVar.d())));
        } else if (actionTargetType == 255) {
            recordAction.setFinishedAction((int) TimeUnit.MILLISECONDS.toSeconds((long) (gzeVar.g() - gzeVar.d())));
            recordAction.setFinishRate(100.0f);
        } else if (actionTargetType == 3) {
            recordAction.setFinishedAction(Math.round((gzeVar.g() - gzeVar.d()) / 1000.0f));
        } else if (actionTargetType == 4 || actionTargetType == 5) {
            recordAction.setFinishedAction(Math.round(gzeVar.g()));
        } else {
            recordAction.setFinishedAction((int) (gzeVar.g() - gzeVar.d()));
        }
        int actionTargetType2 = recordAction.getActionTargetType();
        if ((actionTargetType2 == 0 || actionTargetType2 == 1 || actionTargetType2 == 3) && recordAction.getFinishedAction() > recordAction.getActionTargetValue()) {
            recordAction.setFinishedAction((int) recordAction.getActionTargetValue());
        }
    }

    @Override // com.huawei.health.sport.ITargetUpdateListener
    public void onStateUpdate(int i, String str) {
        LogUtil.a("Track_CourseManager", "change action", Integer.valueOf(i), str);
        int i2 = this.f + 1;
        this.f = i2;
        CourseUpdateListener courseUpdateListener = this.g;
        if (courseUpdateListener != null) {
            courseUpdateListener.switchAction(i2);
        }
    }

    @Override // com.huawei.hwfoundationmodel.trackmodel.ISportDataCallback
    public void getSportInfo(Bundle bundle) {
        if (bundle.getInt("sportState", 0) == 3) {
            LogUtil.a("Track_CourseManager", "sportState is stop.");
            return;
        }
        CourseUpdateListener courseUpdateListener = this.g;
        if (courseUpdateListener != null) {
            if (this.f == -1) {
                this.f = 0;
                courseUpdateListener.switchAction(0);
            }
            this.g.getSportInfo(bundle);
        }
    }

    @Override // com.huawei.hwfoundationmodel.trackmodel.ISportDataCallback
    public void onSummary(MotionPathSimplify motionPathSimplify) {
        j();
        CourseUpdateListener courseUpdateListener = this.g;
        if (courseUpdateListener != null) {
            courseUpdateListener.onSummary(motionPathSimplify);
        }
    }

    private float g() {
        float f = 0.0f;
        if (njy.e(this.h)) {
            LogUtil.d("Track_CourseManager", "getFinishRate isEmpty(mChoreographedMultiActionsAll) true");
            return 0.0f;
        }
        int size = this.h.size();
        for (RecordAction recordAction : this.h) {
            if (recordAction == null) {
                LogUtil.d("Track_CourseManager", "getFinishRate action == null");
            } else {
                float finishRate = recordAction.getFinishRate();
                LogUtil.a("Track_CourseManager", "actionFinish:", recordAction.getActionName(), " rate:", Float.valueOf(finishRate));
                f += finishRate;
            }
        }
        return ifk.a(f, size * 100);
    }

    private void o() {
        c("runCourseDetail", this.i);
        c("coursePlanInfo", this.j);
    }

    private void k() {
        this.i = (FitWorkout) e("runCourseDetail", FitWorkout.class);
        this.j = (RecordPlanInfo) e("coursePlanInfo", RecordPlanInfo.class);
        WorkoutRecord workoutRecord = (WorkoutRecord) e("runCourseRecordTmp", WorkoutRecord.class);
        this.m = workoutRecord;
        if (workoutRecord != null) {
            try {
                this.h = (List) qqt.c(workoutRecord.acquireActionSummary(), new TypeToken<List<RecordAction>>(this) { // from class: com.huawei.healthcloud.plugintrack.manager.CourseManager$1
                }.getType());
            } catch (JsonSyntaxException unused) {
                LogUtil.c("Track_CourseManager", "JsonSyntaxException");
            }
        }
    }

    private void n() {
        synchronized (d) {
            this.m.saveActionSummary(qqt.b(this.h));
            c("runCourseRecordTmp", this.m);
        }
    }

    private <T> void c(String str, T t) {
        if (t == null) {
            LogUtil.d("Track_CourseManager", "saveDataToSp object == null");
            return;
        }
        try {
            GsonBuilder gsonBuilder = new GsonBuilder();
            gsonBuilder.serializeSpecialFloatingPointValues();
            SharedPreferenceManager.e(com.huawei.hwcommonmodel.application.BaseApplication.getContext(), this.n, str, gsonBuilder.create().toJson(t), null);
        } catch (ConcurrentModificationException e) {
            ReleaseLogUtil.a("Track_CourseManager", "saveDataToSp ConcurrentModificationException:", LogAnonymous.b(e));
        }
    }

    private <T> T e(String str, Type type) {
        return (T) qqt.c(SharedPreferenceManager.e(com.huawei.hwcommonmodel.application.BaseApplication.getContext(), this.n, str), type);
    }

    public void d() {
        SharedPreferenceManager.b(BaseApplication.b(), this.n, "runCourseDetail");
        SharedPreferenceManager.b(BaseApplication.b(), this.n, "coursePlanInfo");
        SharedPreferenceManager.b(BaseApplication.b(), this.n, "runCourseRecordTmp");
    }

    public void b(MotionPathSimplify motionPathSimplify, MotionPath motionPath) {
        if (!i() || motionPathSimplify == null) {
            LogUtil.d("Track_CourseManager", "saveDataToDb failed isValid = false motionPathSimplify is null.");
            return;
        }
        d(motionPathSimplify, motionPath);
        FitnessAdviceApi fitnessAdviceApi = (FitnessAdviceApi) Services.d("PluginFitnessAdvice", FitnessAdviceApi.class);
        if (fitnessAdviceApi != null) {
            LogUtil.d("Track_CourseManager", "saveDataToDb is:", Boolean.valueOf(fitnessAdviceApi.uploadFitnessRecordData(this.m)));
        }
        d();
        h();
    }

    private void d(MotionPathSimplify motionPathSimplify, MotionPath motionPath) {
        dea deaVar;
        synchronized (d) {
            if (this.m != null && motionPathSimplify != null && i()) {
                this.m.saveActualDistance(ped.b(motionPathSimplify.requestTotalDistance()));
                this.m.saveActualCalorie(motionPathSimplify.requestTotalCalories());
                this.m.setDuration((int) motionPathSimplify.requestTotalTime());
                if (this.i.isNewRunCourse()) {
                    this.m.saveFinishRate(g());
                } else if (this.m.getTargetType() == 1) {
                    WorkoutRecord workoutRecord = this.m;
                    workoutRecord.saveFinishRate(ifk.a(workoutRecord.getDuration(), ped.e((int) this.m.getTargetValue())));
                } else {
                    WorkoutRecord workoutRecord2 = this.m;
                    workoutRecord2.saveFinishRate(ifk.a(workoutRecord2.acquireDistance(), (int) this.m.getTargetValue()));
                }
                if (motionPath != null && (deaVar = this.f38136c) != null) {
                    int iC = deu.c(motionPath, deaVar, this.m.startTime());
                    motionPathSimplify.addExtendDataMap(HwExerciseConstants.JSON_NAME_TRAINING_POINTS, String.valueOf(iC));
                    this.m.setTrainPoint(iC);
                }
                ReleaseLogUtil.d("Track_CourseManager", "updateRecordCourseSummary acquireFinishRate:", Float.valueOf(this.m.acquireFinishRate()));
                motionPathSimplify.addExtendDataMap("completionRate", String.valueOf(this.m.acquireFinishRate()));
                motionPathSimplify.addExtendDataMap(HwExerciseConstants.JSON_NAME_PLAN_COURSE_TIME, String.valueOf(this.m.getPlanTrainDate()));
                ReleaseLogUtil.d("Track_CourseManager", "updateRecordCourseSummary getPlanTrainDate:", Integer.valueOf(this.m.getPlanTrainDate()));
                this.m.setStartTime(motionPathSimplify.requestStartTime());
                this.m.saveExerciseTime(motionPathSimplify.requestEndTime());
                this.m.saveTrajectoryId(motionPathSimplify.requestStartTime() + "_" + motionPathSimplify.requestEndTime());
                motionPathSimplify.addExtendDataMap("courseExtend", this.m.acquireExtend());
                jaf.b(BaseApplication.b(), a(this.m.acquireActionSummary()), "motion_path2.txt");
                return;
            }
            LogUtil.d("Track_CourseManager", "updateRecordCourseSummary failed with workout is null or is invalid.");
        }
    }

    public static String a(String str) {
        List list;
        if (TextUtils.isEmpty(str)) {
            LogUtil.d("Track_CourseManager", "getActionSummary isEmpty");
            return str;
        }
        try {
            list = (List) qqt.c(str, new TypeToken<List<RecordAction>>() { // from class: com.huawei.healthcloud.plugintrack.manager.CourseManager$2
            }.getType());
        } catch (JsonSyntaxException unused) {
            LogUtil.c("Track_CourseManager", "JsonSyntaxException in getActionSummaryFileDetail");
            list = null;
        }
        if (njy.e(list)) {
            LogUtil.d("Track_CourseManager", "actionList isEmpty");
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            sb.append(((RecordAction) it.next()).getTrackFileString());
        }
        return sb.toString();
    }

    private void l() {
        WorkoutRecord workoutRecord = new WorkoutRecord();
        WorkoutRecord workoutRecord2 = this.m;
        if (workoutRecord2 != null) {
            workoutRecord.savePlanId(workoutRecord2.acquirePlanId());
            workoutRecord.saveWorkoutId(this.m.acquireWorkoutId());
            workoutRecord.saveExerciseTime(System.currentTimeMillis());
            if (StringUtils.g(workoutRecord.acquirePlanId())) {
                return;
            }
            LogUtil.a("Track_CourseManager", "setTrainingCourse:" + workoutRecord.acquireWorkoutId());
            buh.d("intPlanTrainingCourse", new Gson().toJson(workoutRecord));
        }
    }

    private void j() {
        LogUtil.a("Track_CourseManager", "removeTrainingCourse");
        buh.c("intPlanTrainingCourse");
    }

    private void h() {
        final PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
        if (planApi == null || this.m == null) {
            return;
        }
        ThreadPoolManager.c().execute(new Runnable() { // from class: iwk
            @Override // java.lang.Runnable
            public final void run() {
                this.e.b(planApi);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(PlanApi planApi) {
        planApi.e(new UiCallback<IntPlan>() { // from class: iwj.1
            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            public void onFailure(int i, String str) {
                iwj.this.m();
                HashMap map = new HashMap(1);
                map.put("data", qqt.b(iwj.this.e));
                idy.b("1120005", map);
            }

            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onSuccess(IntPlan intPlan) {
                iwj.this.m();
                if (intPlan != null && TextUtils.equals(intPlan.getPlanId(), iwj.this.m.acquirePlanId())) {
                    iwj.this.e.put("plan_name", intPlan.getMetaInfo().getName());
                    iwj.this.e.put("type", Integer.valueOf(iwj.this.c(intPlan)));
                }
                HashMap map = new HashMap(1);
                map.put("data", qqt.b(iwj.this.e));
                idy.b("1120005", map);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        this.e.put("start_time", Long.valueOf(this.m.startTime()));
        this.e.put("end_time", Long.valueOf(this.m.acquireExerciseTime()));
        this.e.put("course_version", this.m.acquireVersion());
        this.e.put("calories", Integer.valueOf((int) this.m.acquireActualCalorie()));
        this.e.put("distance", Float.valueOf(this.m.acquireActualDistance()));
        this.e.put("duration", Integer.valueOf(this.m.getDuration()));
        this.e.put("finish_rate", Float.valueOf(this.m.acquireFinishRate()));
        this.e.put("isAICourse", Constants.NULL);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int c(IntPlan intPlan) {
        if (intPlan.getPlanType().equals(IntPlan.PlanType.AI_RUN_PLAN)) {
            return 0;
        }
        return intPlan.getPlanType().equals(IntPlan.PlanType.AI_FITNESS_PLAN) ? 1 : 2;
    }
}
