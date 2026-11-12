package defpackage;

import com.huawei.basefitnessadvice.model.ExerciseProfile;
import com.huawei.basefitnessadvice.model.RunWorkout;
import com.huawei.health.courseplanservice.R;
import health.compact.a.CommonUtil;
import health.compact.a.UnitUtil;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes29.dex */
public class gnt {
    private static boolean a(String str) {
        return str != null && Pattern.compile("[0-9]+").matcher(str).matches();
    }

    private static String c(gzg gzgVar, int i, int i2, int i3) {
        String strD;
        String strD2;
        String strD3 = gzx.d(R.plurals.IDS_plugin_fitnessadvice_minute, i3, UnitUtil.e(i3, 1, 0));
        String strD4 = gzx.d(gzw.a(), i2, UnitUtil.e(d(i2), 1, 2));
        int i4 = i - 9;
        int iA = gzgVar.a(i4);
        int iC = gzgVar.c(i4);
        if (i >= 21) {
            strD = gzx.d(R.plurals.IDS_plugin_fitnessadvice_second, iA, UnitUtil.e(iA, 1, 0));
            strD2 = gzx.d(R.plurals.IDS_plugin_fitnessadvice_second, iC, UnitUtil.e(iC, 1, 0));
        } else {
            strD = gzx.d(R.plurals.IDS_plugin_fitnessadvice_minute, iA, UnitUtil.e(iA, 1, 0));
            strD2 = gzx.d(R.plurals.IDS_plugin_fitnessadvice_minute, iC, UnitUtil.e(iC, 1, 0));
        }
        return pei.e(gzgVar.d(i), strD3, strD4, strD, strD2);
    }

    private static double d(double d) {
        return UnitUtil.f() ? UnitUtil.e(d, 3) : d;
    }

    public static void e(RunWorkout[] runWorkoutArr) {
        if (runWorkoutArr == null || runWorkoutArr.length == 0) {
            return;
        }
        gzg gzgVar = new gzg(runWorkoutArr[0].getType());
        for (RunWorkout runWorkout : runWorkoutArr) {
            if (runWorkout != null) {
                b(runWorkout, gzgVar);
            }
        }
    }

    private static void b(RunWorkout runWorkout, gzg gzgVar) {
        ExerciseProfile warmup = runWorkout.getWarmup();
        ExerciseProfile rest = runWorkout.getRest();
        ExerciseProfile work = runWorkout.getWork();
        if (warmup != null) {
            warmup.setMessage(a(0, warmup.getDuration()));
        }
        if (rest != null) {
            rest.setMessage(a(1, rest.getDuration()));
        }
        if (work != null) {
            work.setMessage(a(2, work.getDuration()));
        }
        ExerciseProfile cooldown = runWorkout.getCooldown();
        if (cooldown != null) {
            cooldown.setMessage(a(3, cooldown.getDuration()));
        }
        if (a(runWorkout.acquireName())) {
            runWorkout.saveName(gzgVar.e(CommonUtil.j(runWorkout.acquireName())));
        }
        if (a(runWorkout.acquireDescription())) {
            runWorkout.saveDescription(c(gzgVar, CommonUtil.j(runWorkout.acquireDescription()), runWorkout.acquireDistance(), runWorkout.acquireDuration()));
        }
    }

    private static String a(int i, int i2) {
        if (i == 0) {
            return b(i2, R.plurals.sug_run_warmup_message, R.plurals.sug_run_warmup_message_min);
        }
        if (i == 1) {
            return b(i2, R.plurals.sug_run_rest_message, R.plurals.sug_run_rest_message_min);
        }
        if (i == 2) {
            return b(i2, R.plurals.sug_run_work_message, R.plurals.sug_run_work_message_min);
        }
        if (i == 3) {
            return b(i2, R.plurals.sug_run_cooldown_message, R.plurals.sug_run_cooldown_message_min);
        }
        return "";
    }

    private static String b(int i, int i2, int i3) {
        if (i < 60) {
            return gzx.d(i2, i, UnitUtil.e(i, 1, 0));
        }
        int i4 = i / 60;
        return gzx.d(i3, i4, UnitUtil.e(i4, 1, 0));
    }
}
