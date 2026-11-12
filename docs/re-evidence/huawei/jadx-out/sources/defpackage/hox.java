package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.huawei.basefitnessadvice.model.Plan;
import com.huawei.basefitnessadvice.model.RunWorkout;
import com.huawei.basefitnessadvice.model.Summary;
import com.huawei.health.course.api.CourseApi;
import com.huawei.health.device.api.IndoorEquipManagerApi;
import com.huawei.health.plan.api.PlanApi;
import com.huawei.health.sport.model.WorkoutRecord;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.RunCallback;
import com.huawei.health.suggestion.model.SportInfo;
import com.huawei.health.suggestion.ui.voice.IVoiceContentConstructor;
import com.huawei.hms.mlsdk.asr.MLAsrConstants;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnessadvice.Workout;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import health.compact.a.Services;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes31.dex */
public class hox implements RunCallback {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile hox f36998c;
    private static final Object e = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f36999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f37000b;
    private long d;
    private int f;
    private int g;
    private float h;
    private List<Float> i;
    private float j;
    private float l;
    private int m;
    private String o;

    @Override // com.huawei.health.suggestion.RunCallback
    public void onConnectStatus(int i) {
    }

    private hox() {
        a();
    }

    private void a() {
        this.i = new ArrayList();
    }

    public static hox d() {
        if (f36998c == null) {
            synchronized (e) {
                if (f36998c == null) {
                    f36998c = new hox();
                }
            }
        }
        return f36998c;
    }

    private void a(int i) {
        LogUtil.a("Suggestion_RunManager", "play stateSound-", Integer.valueOf(i));
        Object objConstructContent = b().constructContent(1, Integer.valueOf(i));
        if (objConstructContent instanceof Integer) {
            hdt.e(btx.c()).d(((Integer) objConstructContent).intValue());
        } else {
            LogUtil.j("Suggestion_RunManager", "playStateSound else");
        }
    }

    private IVoiceContentConstructor b() {
        if (e()) {
            return idk.e();
        }
        return idn.b();
    }

    private boolean e() {
        return MLAsrConstants.LAN_ZH.equalsIgnoreCase(btx.c().getResources().getConfiguration().locale.getLanguage());
    }

    private void e(SportInfo sportInfo) {
        int i;
        int i2;
        int i3;
        float fAcquireDistance = sportInfo.acquireDistance();
        int iAcquireTime = sportInfo.acquireTime();
        if (fAcquireDistance >= 4.99f && (iAcquireTime < (i3 = this.f37000b) || i3 <= 0)) {
            this.f37000b = iAcquireTime;
        }
        if (fAcquireDistance >= 9.99f && (iAcquireTime < (i2 = this.m) || i2 <= 0)) {
            this.m = iAcquireTime;
        }
        if (fAcquireDistance >= 21.087f && (iAcquireTime < (i = this.f36999a) || i <= 0)) {
            this.f36999a = iAcquireTime;
        }
        if (fAcquireDistance >= 42.183002f) {
            int i4 = this.f;
            if (iAcquireTime < i4 || i4 <= 0) {
                this.f = iAcquireTime;
            }
        }
    }

    private WorkoutRecord d(Summary summary) {
        WorkoutRecord workoutRecord = new WorkoutRecord();
        b(summary, workoutRecord);
        String strAcquireId = this.o;
        if (strAcquireId == null) {
            Plan planE = ibl.e();
            strAcquireId = planE == null ? null : planE.acquireId();
        }
        if (strAcquireId == null || !strAcquireId.equals(summary.acquirePlanId())) {
            LogUtil.j("Suggestion_RunManager", "getRecord summary.acquirePlanId():", summary.acquirePlanId(), ",currPlanId：", strAcquireId);
            return null;
        }
        CourseApi courseApi = (CourseApi) Services.d("CoursePlanService", CourseApi.class);
        if (courseApi == null) {
            LogUtil.j("Suggestion_RunManager", "getRecord, getCouseWithinCurrentPlanById: courseApi is null.");
            return null;
        }
        Workout courseWithinCurrentPlanById = courseApi.getCourseWithinCurrentPlanById(0, summary.acquireWorkoutId());
        if (courseWithinCurrentPlanById == null) {
            LogUtil.j("Suggestion_RunManager", "getRecord getCouseWithinCurrentPlanById workout == null");
            return null;
        }
        if (!(courseWithinCurrentPlanById instanceof RunWorkout)) {
            LogUtil.j("Suggestion_RunManager", "getRecord, getCouseWithinCurrentPlanById: workout real type not RunWorkout.");
            return null;
        }
        return e(courseWithinCurrentPlanById, summary, workoutRecord);
    }

    private void b(Summary summary, WorkoutRecord workoutRecord) {
        workoutRecord.saveActualDistance(summary.acquireDistance());
        workoutRecord.saveActualCalorie(summary.acquireCalorie());
        workoutRecord.setDuration(summary.acquireDuring());
        workoutRecord.saveExerciseTime(summary.acquireExerciseTime());
        workoutRecord.saveTrajectoryId(summary.acquireSportId());
        workoutRecord.saveCalorie(summary.acquireCalorie());
        workoutRecord.saveWorkoutOrder(1);
        workoutRecord.saveRecordType(1);
        workoutRecord.saveOxygen(ped.a(summary.acquireMaxMet()));
        if (summary.acquireBestPace() != 0) {
            workoutRecord.saveBestPace(summary.acquireBestPace());
        } else {
            workoutRecord.saveBestPace((int) (summary.acquireDuring() / summary.acquireDistance()));
        }
    }

    private WorkoutRecord e(Workout workout, Summary summary, WorkoutRecord workoutRecord) {
        RunWorkout runWorkout = (RunWorkout) workout;
        LogUtil.d("Suggestion_RunManager", String.valueOf(runWorkout));
        float fA = ibl.a(summary.acquireDistance(), runWorkout.acquireDistance());
        workoutRecord.saveDistance(runWorkout.acquireDistance());
        workoutRecord.saveFinishRate(fA);
        workoutRecord.saveWorkoutId(runWorkout.acquireId());
        workoutRecord.saveWorkoutName(runWorkout.acquireName());
        workoutRecord.saveWorkoutDate(runWorkout.acquireWorkoutDate());
        workoutRecord.savePlanId(summary.acquirePlanId());
        workoutRecord.saveVersion(runWorkout.accquireVersion());
        return workoutRecord;
    }

    private void c(WorkoutRecord workoutRecord) {
        int iAcquireBestPace = workoutRecord.acquireBestPace();
        PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
        if (planApi == null) {
            LogUtil.j("Suggestion_RunManager", "saveRecord : planApi is null.");
            return;
        }
        if (workoutRecord.acquireActualDistance() >= 1.0f) {
            planApi.updatePlanBestRecord(workoutRecord.acquirePlanId(), 4, iAcquireBestPace);
        }
        planApi.setPlanType(0);
        planApi.updatePlanProgress(workoutRecord);
        hvp.d(0, hvp.d(workoutRecord.startTime()));
    }

    private SportInfo d(Bundle bundle) {
        SportInfo sportInfo = new SportInfo();
        if (bundle != null) {
            int i = bundle.getInt("distance", 0);
            int i2 = bundle.getInt("duration", 0);
            int i3 = bundle.getInt(IndoorEquipManagerApi.KEY_HEART_RATE, 0);
            int i4 = bundle.getInt("calorie", 0);
            String string = bundle.getString("sportId", "");
            sportInfo.saveTime(i2);
            sportInfo.saveHeartRate(i3);
            sportInfo.savePace(ped.d(c()));
            sportInfo.saveCalorie(i4);
            sportInfo.saveSportId(string);
            sportInfo.saveDistance(ped.b(i));
        }
        return sportInfo;
    }

    private void a(SportInfo sportInfo) {
        if (((long) sportInfo.acquireTime()) - this.d >= 1800) {
            this.d = sportInfo.acquireTime();
        }
        float fAcquireDistance = sportInfo.acquireDistance();
        float f = this.h;
        if (fAcquireDistance >= f && fAcquireDistance <= f + 0.1f && ((int) Math.floor(10.0f * fAcquireDistance)) % 10 == 5) {
            LogUtil.a("Suggestion_RunManager", "play half");
            this.h = 0.0f;
        }
        e(sportInfo);
        sportInfo.acquireTime();
        if (fAcquireDistance >= this.j) {
            int i = (int) (fAcquireDistance / 0.5f);
            if (fAcquireDistance - (i * 0.5f) > 0.4f) {
                this.j = (i + 2) * 0.5f;
            } else {
                this.j = (i + 1) * 0.5f;
            }
        }
        if (((int) fAcquireDistance) > ((int) this.l)) {
            this.l = fAcquireDistance;
        }
    }

    private void c(int i) {
        if (i != this.g) {
            this.g = i;
        }
    }

    private void a(Bundle bundle) {
        float f = bundle.getFloat("speed", 0.0f);
        if (this.i.size() >= 10) {
            this.i.remove(0);
        }
        this.i.add(Float.valueOf(f));
    }

    private float c() {
        Float[] fArr;
        float fFloatValue = 0.0f;
        if (!njy.b(this.i)) {
            return 0.0f;
        }
        synchronized (e) {
            List<Float> list = this.i;
            fArr = (Float[]) list.toArray(new Float[list.size()]);
        }
        for (Float f : fArr) {
            fFloatValue += f.floatValue();
        }
        return fFloatValue / fArr.length;
    }

    private void h() {
        PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
        if (planApi == null) {
            LogUtil.j("Suggestion_RunManager", "updateBestRecord : planApi is null.");
            return;
        }
        int i = this.f37000b;
        if (i > 0) {
            planApi.updatePlanBestRecord(this.o, 0, i);
        }
        int i2 = this.m;
        if (i2 > 0) {
            planApi.updatePlanBestRecord(this.o, 1, i2);
        }
        int i3 = this.f36999a;
        if (i3 > 0) {
            planApi.updatePlanBestRecord(this.o, 2, i3);
        }
        int i4 = this.f;
        if (i4 > 0) {
            planApi.updatePlanBestRecord(this.o, 3, i4);
        }
    }

    public void e(Summary summary, boolean z) {
        LogUtil.a("Suggestion_RunManager", "summary", summary, " isFormRunCallback:", Boolean.valueOf(z));
        if (summary != null) {
            if (z) {
                h();
            }
            WorkoutRecord workoutRecordD = d(summary);
            if (workoutRecordD != null && workoutRecordD.acquireActualDistance() > 0.1d) {
                if (((PlanApi) Services.d("CoursePlanService", PlanApi.class)) == null) {
                    LogUtil.e("Suggestion_RunManager", "onSummary, getCurrentPlan : planApi is null.");
                    return;
                }
                Plan planE = ibl.e();
                if (planE == null || planE.acquireType() != 0 || !planE.acquireId().equals(summary.acquirePlanId())) {
                    LogUtil.a("Suggestion_RunManager", "planId is null or is not currentPlan or planType not run, not save record");
                    return;
                }
                c(workoutRecordD);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("plan_name", planE.acquireName());
                    jSONObject.put("type", 0);
                    if (idy.d()) {
                        jSONObject.put("start_time", summary.acquiretStartTime());
                        jSONObject.put("end_time", summary.acquireEndTime());
                        jSONObject.put("finish_rate", idy.c(workoutRecordD.acquireFinishRate()));
                    }
                    jSONObject.put("workout_name", summary.acquireWorkoutName());
                    HashMap map = new HashMap(1);
                    map.put("data", jSONObject.toString());
                    idy.b("1120005", map);
                } catch (JSONException e2) {
                    LogUtil.e("Suggestion_RunManager", "e = ", e2.getMessage());
                }
            }
        }
        if (z) {
            this.o = null;
            this.f37000b = 0;
            this.m = 0;
            this.f36999a = 0;
            this.f = 0;
        }
    }

    @Override // com.huawei.health.suggestion.RunCallback
    public void onSummary(Summary summary) {
        e(summary, true);
    }

    @Override // com.huawei.health.suggestion.RunCallback
    public void onUpdate(Bundle bundle) {
        LogUtil.d("SportCallback", "onUpdate-", bundle);
        if (bundle == null) {
            return;
        }
        int i = bundle.getInt("sportState", 0);
        c(i);
        if (i == 1) {
            a(bundle);
            a(d(bundle));
        }
    }

    @Override // com.huawei.health.suggestion.RunCallback
    public void realTimeGuidance(int i, List<Integer> list) {
        LogUtil.a("Suggestion_RunManager", "phraseId:", Integer.valueOf(i), ",integerList:", Arrays.toString(list.toArray()));
        if (i != 1 && i != 2) {
            if (i != 3) {
                if (i != 6) {
                    if (i != 7) {
                        if (i != 10) {
                            if (i != 11) {
                                if (i != 14 && i != 29) {
                                    switch (i) {
                                        case 21:
                                        case 22:
                                        case 23:
                                        case 24:
                                            break;
                                        case 25:
                                        case 26:
                                            break;
                                        default:
                                            switch (i) {
                                                case 33:
                                                case 34:
                                                case 35:
                                                    a(1);
                                                    break;
                                            }
                                            break;
                                    }
                                    return;
                                }
                            }
                        }
                    }
                }
            }
            a(5);
            return;
        }
        a(3);
    }

    @Override // com.huawei.health.suggestion.RunCallback
    public void dialog(int i, final View.OnClickListener onClickListener, final View.OnClickListener onClickListener2, Context context) {
        if (i != 1) {
            LogUtil.e("RunCallback", "unknow dialog type");
        } else if (context != null) {
            new CustomTextAlertDialog.Builder(context).e(pei.c(context, R.string.sug_notify, new Object[0])).a(pei.c(context, R.string.sug_runcallback_dialog_ete, pei.c(context, com.huawei.ui.commonui.R.string.IDS_scan_device, new Object[0]))).a(R.string.sug_coach_dialog_yes, new View.OnClickListener() { // from class: hox.4
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    View.OnClickListener onClickListener3 = onClickListener;
                    if (onClickListener3 != null) {
                        onClickListener3.onClick(view);
                    }
                }
            }).e(com.huawei.health.servicesui.R.string.IDS_plugin_fitnessadvice_cancal, new View.OnClickListener() { // from class: hox.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    View.OnClickListener onClickListener3 = onClickListener2;
                    if (onClickListener3 != null) {
                        onClickListener3.onClick(view);
                    }
                }
            }).b().show();
        }
    }
}
