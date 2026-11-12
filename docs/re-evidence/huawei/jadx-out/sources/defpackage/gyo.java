package defpackage;

import android.os.Bundle;
import com.huawei.health.R;
import com.huawei.health.course.api.CourseApi;
import com.huawei.health.sport.model.WorkoutRecord;
import com.huawei.health.suggestion.PluginSuggestion;
import com.huawei.hwbasemgr.IBaseStatusCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwvoiceplaymodel.IVoiceHandler;
import health.compact.a.Services;
import health.compact.a.Utils;
import java.util.ArrayList;
import java.util.Date;

/* JADX INFO: loaded from: classes8.dex */
public class gyo implements IVoiceHandler {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f36235b = new Object();
    private static gyo d;
    private IBaseStatusCallback e = new IBaseStatusCallback() { // from class: gyo.2
        @Override // com.huawei.hwbasemgr.IBaseStatusCallback
        public void onAvailable() {
            LogUtil.a("Suggestion_PluginSuggestionVoiceHandler", "onAvailable invoke");
            gyw.c(0);
        }

        @Override // com.huawei.hwbasemgr.IBaseStatusCallback
        public void onOccupied() {
            LogUtil.a("Suggestion_PluginSuggestionVoiceHandler", "onOccupied invoke");
            gyw.c(2);
        }
    };

    private gyo() {
    }

    public static gyo e() {
        gyo gyoVar;
        synchronized (f36235b) {
            if (d == null) {
                d = new gyo();
            }
            gyoVar = d;
        }
        return gyoVar;
    }

    public void d() {
        CourseApi courseApi = (CourseApi) Services.d("CoursePlanService", CourseApi.class);
        if (courseApi == null) {
            LogUtil.j("Suggestion_PluginSuggestionVoiceHandler", "registerFitnessCourseListen : courseApi is null.");
        } else {
            courseApi.registerFitnessCourseStatusListen(this.e);
        }
    }

    @Override // com.huawei.hwvoiceplaymodel.IVoiceHandler
    public int handleVoiceEvent(Bundle bundle) {
        if (bundle == null) {
            LogUtil.j("Suggestion_PluginSuggestionVoiceHandler", "handleVoiceEvent voiceMsg is null");
            return -4;
        }
        String string = bundle.getString("voiceMessage");
        if (string == null) {
            LogUtil.j("Suggestion_PluginSuggestionVoiceHandler", "handleVoiceEvent message is null");
            return -4;
        }
        if (gyw.a() != 0) {
            LogUtil.a("Suggestion_PluginSuggestionVoiceHandler", "handleVoiceEvent status conflict");
            if (ive.c().g() == 2) {
                gyq.e().a(R.raw.girls_handle_failed_fitness_during_pause);
            }
            if (ive.c().g() != 1) {
                return -2;
            }
            gyq.e().a(R.raw.girls_handle_failed_fitness_during_sport);
            return -2;
        }
        int iD = d(string);
        LogUtil.a("Suggestion_PluginSuggestionVoiceHandler", "handleVoiceEvent message = ", string, ", result = ", Integer.valueOf(iD));
        return iD;
    }

    private int d(String str) {
        int i = -1;
        if (!str.endsWith("warmupCourse") && !str.endsWith("stretchCourse")) {
            LogUtil.j("Suggestion_PluginSuggestionVoiceHandler", "dispatchVoiceEvent message.endsWith not ACTION_WARM_UP_COURSE or ACTION_STRETCH_COURSE");
            return -1;
        }
        WorkoutRecord workoutRecord = new WorkoutRecord();
        workoutRecord.saveVersion(null);
        workoutRecord.saveExerciseTime(new Date().getTime());
        String str2 = "";
        workoutRecord.savePlanId("");
        if (str.endsWith("warmupCourse")) {
            gyw.d("warmupCourse");
            workoutRecord.saveWorkoutId("R001");
            workoutRecord.saveWorkoutName("跑前热身");
            i = 1;
        }
        if (str.endsWith("stretchCourse")) {
            gyw.d("stretchCourse");
            workoutRecord.saveWorkoutId("R002");
            workoutRecord.saveWorkoutName(BaseApplication.getContext().getString(com.huawei.ui.commonui.R.string.IDS_hwh_motiontrack_stretch_after_run));
            str2 = "FitnessCourse_stretch";
            i = 2;
        }
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(workoutRecord);
        PluginSuggestion pluginSuggestion = (PluginSuggestion) Services.d("PluginFitnessAdvice", PluginSuggestion.class);
        if (pluginSuggestion == null || !pluginSuggestion.isInitComplete() || !Utils.j()) {
            return -3;
        }
        pcd pcdVar = new pcd(workoutRecord.acquireWorkoutId());
        pcdVar.a(str2);
        pcdVar.c(i);
        pcdVar.d(true);
        pea.b(BaseApplication.getContext(), pcdVar, (ArrayList<WorkoutRecord>) arrayList);
        return 0;
    }
}
