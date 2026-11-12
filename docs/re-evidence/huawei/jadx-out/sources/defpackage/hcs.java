package defpackage;

import android.text.format.DateUtils;
import com.huawei.health.courseplanservice.api.RecordApi;
import com.huawei.health.plan.api.PlanApi;
import com.huawei.health.sport.model.WorkoutRecord;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes9.dex */
public class hcs {
    public static boolean c(WorkoutRecord workoutRecord) {
        if (workoutRecord == null) {
            ReleaseLogUtil.a("Suggestion_SuggestionBinder", "postFitnessRecord record == null.");
            return false;
        }
        String strAcquireWorkoutId = workoutRecord.acquireWorkoutId();
        float fAcquireFinishRate = workoutRecord.acquireFinishRate();
        ReleaseLogUtil.d("Suggestion_SuggestionBinder", "postFitnessRecord w***d:", strAcquireWorkoutId, " r***e:", Float.valueOf(fAcquireFinishRate), " p***d:", workoutRecord.acquirePlanId(), " d***e:", workoutRecord.acquireWorkoutDate(), " t***e:", Long.valueOf(workoutRecord.acquireExerciseTime()), " t**e:", Integer.valueOf(workoutRecord.getPlanTrainDate()));
        PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
        if (planApi == null) {
            LogUtil.e("Suggestion_SuggestionBinder", "uploadFitnessRecordData, getCurrentPlan : planApi is null.");
            return false;
        }
        planApi.setPlanType(0);
        boolean zUpdatePlanProgress = planApi.updatePlanProgress(workoutRecord);
        if (zUpdatePlanProgress) {
            a(workoutRecord);
            hvp.d(0, hvp.d(workoutRecord.startTime()));
            LoginInit loginInit = LoginInit.getInstance(BaseApplication.getContext());
            if (DateUtils.isToday(workoutRecord.acquireExerciseTime()) && loginInit.getUsetId() != null) {
                RecordApi recordApi = (RecordApi) Services.d("CoursePlanService", RecordApi.class);
                if (recordApi == null) {
                    LogUtil.j("Suggestion_SuggestionBinder", "uploadFitnessRecordData recordApi is null.");
                    return zUpdatePlanProgress;
                }
                recordApi.addRecordFor(loginInit.getUsetId(), workoutRecord, true);
            }
        }
        return zUpdatePlanProgress;
    }

    private static void a(WorkoutRecord workoutRecord) {
        LogUtil.a("Suggestion_SuggestionBinder", "setRefreshRedDotAndUpdateFitnessRecord");
        if (workoutRecord == null) {
            return;
        }
        if (workoutRecord.getSportRecordType() != 0) {
            ReleaseLogUtil.e("Suggestion_SuggestionBinder", "record is not main record.", workoutRecord.acquireWorkoutId(), " endTime:", Long.valueOf(workoutRecord.acquireExerciseTime()));
            return;
        }
        if (workoutRecord.isFitnessRecordFromDevice() || workoutRecord.isFitnessRecordFromTv()) {
            SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10000), "HOME_HEALTH_SHOW_FITNESS_DOT", String.valueOf(true), new StorageParams());
        }
        btq.e().e("WORKOUT_FINISHED");
    }
}
