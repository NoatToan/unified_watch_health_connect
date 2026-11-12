package defpackage;

import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseConstants;
import health.compact.a.SharedPreferenceManager;

/* JADX INFO: loaded from: classes19.dex */
public class vbl {
    public static void d(long j) {
        SharedPreferenceManager.c(HwExerciseConstants.JSON_NAME_WORKOUT_TEMPERATURE, "data_read_times", j);
    }

    public static long e() {
        long jD = SharedPreferenceManager.d(HwExerciseConstants.JSON_NAME_WORKOUT_TEMPERATURE, "data_read_times", 0L);
        return jD == 0 ? BaseApplication.getContext().getSharedPreferences(HwExerciseConstants.JSON_NAME_WORKOUT_TEMPERATURE, 0).getLong("data_read_times", 0L) : jD;
    }

    public static void a(boolean z) {
        SharedPreferenceManager.a(HwExerciseConstants.JSON_NAME_WORKOUT_TEMPERATURE, "has_remind_data", z);
    }

    public static boolean a() {
        boolean zB = SharedPreferenceManager.b(HwExerciseConstants.JSON_NAME_WORKOUT_TEMPERATURE, "has_remind_data", false);
        return !zB ? BaseApplication.getContext().getSharedPreferences(HwExerciseConstants.JSON_NAME_WORKOUT_TEMPERATURE, 0).getBoolean("has_remind_data", false) : zB;
    }
}
