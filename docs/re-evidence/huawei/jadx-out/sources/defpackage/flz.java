package defpackage;

import android.content.Context;
import com.huawei.health.courseplanservice.api.RecordApi;
import com.huawei.health.plan.api.PlanApi;
import com.huawei.health.sport.model.WorkoutRecord;
import com.huawei.health.userlabelmgr.model.UpdateUserLabel;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.pluginfitnessadvice.FitWorkout;
import health.compact.a.Services;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes29.dex */
public class flz {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static flz f34227c;
    private static final Object d = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f34228a = BaseApplication.getContext();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<WorkoutRecord> f34229b;
    private UpdateUserLabel e;

    private flz() {
    }

    public static flz b() {
        flz flzVar;
        synchronized (d) {
            if (f34227c == null) {
                f34227c = new flz();
            }
            flzVar = f34227c;
        }
        return flzVar;
    }

    public void d() {
        LogUtil.a("Fitness_FitnessUserLabelHelper", "enter registerCallback()");
        if (this.e != null) {
            LogUtil.a("Fitness_FitnessUserLabelHelper", "registerCallback(), mUpdateUserLabel != null");
        } else {
            this.e = new UpdateUserLabel() { // from class: flz.5
                @Override // com.huawei.health.userlabelmgr.model.UpdateUserLabel
                public void onUpdate() {
                    LogUtil.a("Fitness_FitnessUserLabelHelper", "registerCallback(), onUpdate()");
                    flz.this.c();
                }
            };
            fmc.a(this.f34228a).e(this.e);
        }
    }

    public void e() {
        LogUtil.a("Fitness_FitnessUserLabelHelper", "enter unregisterCallback()");
        if (this.e != null) {
            fmc.a(this.f34228a).d(this.e);
            this.e = null;
        }
    }

    public void c() {
        RecordApi recordApi = (RecordApi) Services.d("CoursePlanService", RecordApi.class);
        if (recordApi == null) {
            LogUtil.j("Fitness_FitnessUserLabelHelper", "generateLabels recordApi is null.");
        } else {
            recordApi.acquireDetailFitnessRecords(new ntx.d().b(0L).d(System.currentTimeMillis()).a(), new IBaseResponseCallback() { // from class: flz.1
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    if (njy.b(obj, WorkoutRecord.class)) {
                        if (flz.this.f34229b == null) {
                            flz.this.f34229b = new CopyOnWriteArrayList();
                        }
                        flz.this.f34229b.addAll((List) obj);
                        flz flzVar = flz.this;
                        flzVar.a((List<WorkoutRecord>) flzVar.f34229b);
                        flz flzVar2 = flz.this;
                        flzVar2.d(flzVar2.f34229b);
                        flz flzVar3 = flz.this;
                        flzVar3.c((List<WorkoutRecord>) flzVar3.f34229b);
                        flz flzVar4 = flz.this;
                        flzVar4.e((List<WorkoutRecord>) flzVar4.f34229b);
                        flz flzVar5 = flz.this;
                        flzVar5.b((List<WorkoutRecord>) flzVar5.f34229b);
                        flz.this.a();
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(List<WorkoutRecord> list) {
        WorkoutRecord workoutRecord;
        if (njy.e(list)) {
            LogUtil.a("Fitness_FitnessUserLabelHelper", "generateNewUserLabels, records are empty");
            c("health_sport_fitness_newuser", "");
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        int size = list.size() - 1;
        while (true) {
            if (size < 0) {
                workoutRecord = null;
                break;
            } else {
                if (list.get(size) != null) {
                    workoutRecord = list.get(size);
                    break;
                }
                size--;
            }
        }
        if (workoutRecord == null) {
            LogUtil.j("Fitness_FitnessUserLabelHelper", "generateNewUserLabels, earliestRecord == null");
            c("health_sport_fitness_newuser", "");
        } else {
            c("health_sport_fitness_newuser", jCurrentTimeMillis - workoutRecord.acquireExerciseTime() < TimeUnit.DAYS.toMillis(30L) ? "SportFinessNewUser" : "");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(List<WorkoutRecord> list) {
        WorkoutRecord next;
        if (njy.e(list)) {
            LogUtil.a("Fitness_FitnessUserLabelHelper", "generateSilenceUserLabels, records are empty");
            c("health_sport_fitness_silence", "");
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        Iterator<WorkoutRecord> it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (next == null);
        if (next == null) {
            LogUtil.j("Fitness_FitnessUserLabelHelper", "generateNewUserLabels, latestRecord == null");
            c("health_sport_fitness_silence", "");
        } else {
            c("health_sport_fitness_silence", jCurrentTimeMillis - next.acquireExerciseTime() > TimeUnit.DAYS.toMillis(30L) ? "SportFinessSilence" : "");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(List<WorkoutRecord> list) {
        if (njy.e(list)) {
            LogUtil.a("Fitness_FitnessUserLabelHelper", "generateFrequencyLabel, records are empty");
            c("health_sport_fitness_frequency", "SportFitness_0");
            return;
        }
        HashSet hashSet = new HashSet(10);
        for (WorkoutRecord workoutRecord : list) {
            if (c(workoutRecord)) {
                hashSet.add(workoutRecord.acquireWorkoutDate());
            }
        }
        String strE = e(hashSet.size());
        if (strE == null) {
            strE = "";
        }
        c("health_sport_fitness_frequency", strE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(List<WorkoutRecord> list) {
        WorkoutRecord next;
        String str = "";
        if (njy.e(list)) {
            LogUtil.a("Fitness_FitnessUserLabelHelper", "generateLatestWorkoutLabels, records are empty");
            c("health_sport_last_fitness", "");
            return;
        }
        Iterator<WorkoutRecord> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (next != null && !a(next)) {
                break;
            }
        }
        if (next == null) {
            LogUtil.a("Fitness_FitnessUserLabelHelper", "generateNewUserLabels, latestRecord == null");
            c("health_sport_last_fitness", "");
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - next.acquireExerciseTime();
        if (jCurrentTimeMillis <= b(7L)) {
            str = "SportLastFitness_0";
        } else if (jCurrentTimeMillis > b(7L) && jCurrentTimeMillis <= b(30L)) {
            str = "SportLastFitness_1";
        } else if (jCurrentTimeMillis > b(30L) && jCurrentTimeMillis <= b(60L)) {
            str = "SportLastFitness_2";
        } else if (jCurrentTimeMillis > b(60L) && jCurrentTimeMillis <= b(90L)) {
            str = "SportLastFitness_3";
        } else if (jCurrentTimeMillis > b(90L)) {
            str = "SportLastFitness_4";
        } else {
            LogUtil.j("Fitness_FitnessUserLabelHelper", "generateLatestWorkoutLabels label is empty");
        }
        c("health_sport_last_fitness", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(List<WorkoutRecord> list) {
        if (njy.e(list)) {
            LogUtil.a("Fitness_FitnessUserLabelHelper", "generateIntensityLabels, records are empty");
            c("health_sport_fitness_intensity", "");
            return;
        }
        Integer[] numArr = {1, 2};
        PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
        if (planApi == null) {
            LogUtil.j("Fitness_FitnessUserLabelHelper", "generateIntensityLabels planApi == null");
            return;
        }
        List<FitWorkout> workoutListFromLocalByDifficulties = planApi.getWorkoutListFromLocalByDifficulties(1, 0, 50, numArr);
        if (njy.e(workoutListFromLocalByDifficulties)) {
            LogUtil.a("Fitness_FitnessUserLabelHelper", "generateIntensityLabels, workouts are empty");
            c("health_sport_fitness_intensity", "");
        } else {
            String strC = c(list, workoutListFromLocalByDifficulties);
            c("health_sport_fitness_intensity", strC != null ? strC : "");
        }
    }

    private long b(long j) {
        if (j < 0) {
            return 0L;
        }
        return TimeUnit.DAYS.toMillis(j);
    }

    private void c(String str, String str2) {
        if (str == null || str2 == null) {
            LogUtil.j("Fitness_FitnessUserLabelHelper", "insertLabel, key == null || value == null");
        } else {
            fmc.a(this.f34228a).e(str, str2, LoginInit.getInstance(this.f34228a).getAccountInfo(1011));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        this.f34229b = null;
    }

    private boolean a(WorkoutRecord workoutRecord) {
        if (workoutRecord == null) {
            LogUtil.j("Fitness_FitnessUserLabelHelper", "isOptOutRecord record == null");
            return false;
        }
        String strAcquireWorkoutId = workoutRecord.acquireWorkoutId();
        strAcquireWorkoutId.hashCode();
        return strAcquireWorkoutId.equals("R001") || strAcquireWorkoutId.equals("R002");
    }

    private boolean c(WorkoutRecord workoutRecord) {
        return (workoutRecord == null || a(workoutRecord) || System.currentTimeMillis() - workoutRecord.acquireExerciseTime() > b(365L)) ? false : true;
    }

    private String e(int i) {
        if (i == 0) {
            return "SportFitness_0";
        }
        if (i >= 1 && i < 8) {
            return "SportFitness_1";
        }
        if (i >= 8 && i < 12) {
            return "SportFitness_2";
        }
        if (i >= 12) {
            return "SportFitness_3";
        }
        return null;
    }

    private String c(List<WorkoutRecord> list, List<FitWorkout> list2) {
        if (njy.e(list) || njy.e(list2)) {
            LogUtil.a("Fitness_FitnessUserLabelHelper", "getIntensityLabelValue, records or workouts is empty");
            return null;
        }
        HashSet hashSet = new HashSet(10);
        for (FitWorkout fitWorkout : list2) {
            if (fitWorkout != null && fitWorkout.acquireId() != null) {
                hashSet.add(fitWorkout.acquireId());
            }
        }
        int i = 0;
        for (WorkoutRecord workoutRecord : list) {
            if (workoutRecord != null && hashSet.contains(workoutRecord.acquireWorkoutId())) {
                i++;
            }
        }
        if (i >= 1 && i <= 2) {
            return "SportIntensity_0";
        }
        if (i > 2 && i <= 5) {
            return "SportIntensity_1";
        }
        if (i > 5) {
            return "SportIntensity_2";
        }
        return null;
    }
}
