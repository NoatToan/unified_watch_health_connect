package defpackage;

import android.graphics.drawable.Drawable;
import com.huawei.health.sport.model.WorkoutRecord;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.model.fitness.FitnessAchieveInfoUseCase;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class iet {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f37545a;
    private long e;

    public iet(long j) {
        this.f37545a = j;
    }

    public void b(long j) {
        this.e = j;
    }

    public int d(long j) {
        if (j - this.e < this.f37545a) {
            return 2;
        }
        this.e = j;
        return 1;
    }

    public static String b(int i) {
        long j = i;
        if (j == -4) {
            return "";
        }
        if (j == -2) {
            return btx.c().getString(R.string.IDS_fitness_advice_run_trained_never);
        }
        if (j == -3) {
            return btx.c().getString(R.string.IDS_fitness_advice_run_trained_long_ago);
        }
        if (i == 0) {
            return btx.c().getString(R.string.IDS_fitness_advice_run_trained_today);
        }
        return btx.c().getResources().getQuantityString(R.plurals.IDS_fitness_advice_run_trained_ago, i, Integer.valueOf(i));
    }

    public static FitnessAchieveInfoUseCase d(List<WorkoutRecord> list) {
        if (!njy.b(list)) {
            return null;
        }
        HashSet hashSet = new HashSet();
        int i = 0;
        double duration = 0.0d;
        double duration2 = 0.0d;
        for (WorkoutRecord workoutRecord : list) {
            duration += (double) workoutRecord.getDuration();
            duration2 += lsl.aa(workoutRecord.startTime()) ? workoutRecord.getDuration() : 0.0d;
            i++;
            hashSet.add(qrk.h(workoutRecord.startTime()));
        }
        FitnessAchieveInfoUseCase fitnessAchieveInfoUseCase = new FitnessAchieveInfoUseCase();
        fitnessAchieveInfoUseCase.setSumExerciseTime(c(duration));
        fitnessAchieveInfoUseCase.setSumDays(hashSet.size());
        fitnessAchieveInfoUseCase.setTodayTime(c(duration2));
        fitnessAchieveInfoUseCase.setSumExerciseCount(i);
        fitnessAchieveInfoUseCase.setTimeStamp(System.currentTimeMillis());
        return fitnessAchieveInfoUseCase;
    }

    private static int c(double d) {
        return (int) Math.ceil(d / 60000.0d);
    }

    public static void b(HealthTextView healthTextView) {
        int iD = qrs.d(BaseApplication.getContext(), 23.0f);
        int iD2 = qrs.d(BaseApplication.getContext(), 12.0f);
        Drawable drawable = BaseApplication.getContext().getResources().getDrawable(R.drawable.ai_movement_icon);
        drawable.setBounds(0, 0, iD, iD2);
        healthTextView.setCompoundDrawables(null, null, drawable, null);
    }
}
