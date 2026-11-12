package defpackage;

import android.content.Context;
import com.huawei.health.basefitnessadvice.R;
import com.huawei.health.sport.model.WorkoutRecord;
import com.huawei.health.suggestion.PluginSuggestion;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.Services;
import health.compact.a.Utils;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/* JADX INFO: loaded from: classes31.dex */
public class ify {
    public static void a(Context context, int i, int i2, float f) {
        LogUtil.a("Track_WarmUpCourseUtils", "gotoWarmUp, sportType = ", Integer.valueOf(i));
        PluginSuggestion pluginSuggestion = (PluginSuggestion) Services.d("PluginFitnessAdvice", PluginSuggestion.class);
        if (pluginSuggestion != null && pluginSuggestion.isInitComplete() && Utils.j()) {
            if (context == null) {
                LogUtil.j("Track_WarmUpCourseUtils", "gotoWarmUp context is null");
                return;
            }
            pcd pcdVar = new pcd(c(i));
            pcdVar.d(false);
            pcdVar.c(1);
            pcdVar.f(i);
            pcdVar.a(i2);
            pcdVar.b(f);
            pcdVar.b(0);
            pcdVar.d(R.anim.activity_no_animation_short);
            pcdVar.f(true);
            pea.b(context, pcdVar, b(i));
            HashMap map = new HashMap(2);
            map.put("click", 1);
            map.put("type", 0);
            lmf.d().c(BaseApplication.getContext(), AnalyticsValue.MOTION_TRACK_1040021.value(), map, 0);
        }
    }

    private static ArrayList<WorkoutRecord> b(int i) {
        WorkoutRecord workoutRecord = new WorkoutRecord();
        workoutRecord.saveVersion(null);
        workoutRecord.saveExerciseTime(new Date().getTime());
        workoutRecord.saveWorkoutId(c(i));
        workoutRecord.savePlanId("");
        ArrayList<WorkoutRecord> arrayList = new ArrayList<>(1);
        arrayList.add(workoutRecord);
        return arrayList;
    }

    private static String c(int i) {
        if (i == 264) {
            return "R001";
        }
        if (i == 283) {
            return "Y044";
        }
        switch (i) {
            case 257:
                return "R010";
            case 258:
                return "R001";
            case 259:
                return "R011";
            default:
                return "";
        }
    }
}
