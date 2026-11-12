package com.huami.watch.companion.firstbeat;

import android.content.Context;
import com.huami.watch.companion.R;
import com.huami.watch.companion.account.UserInfoManager;
import com.huami.watch.util.Log;
import java.util.Arrays;

/* JADX INFO: loaded from: classes16.dex */
public class FirstBeatUtil {
    private static final String a = "FitnessLevelUtil";

    public static float calculateSportLoadPercent(int i, int i2, int i3, int i4) {
        if (i <= 0) {
            return 0.0f;
        }
        if (i > i4) {
            return 1.0f;
        }
        int i5 = 0;
        float[] fArr = {i2, i3, i4};
        while (i5 < 3) {
            float f = i;
            if (f <= fArr[i5]) {
                float f2 = 1.0f / 3;
                return (i5 > 0 ? i5 * f2 : 0.0f) + (f2 * ((f - (i5 > 0 ? fArr[i5 - 1] : 0.0f)) / (i5 > 0 ? fArr[i5] - fArr[i5 - 1] : fArr[i5])));
            }
            i5++;
        }
        return -1.0f;
    }

    public static int[] getFitnessBoundary() {
        int gender = UserInfoManager.get().getGender();
        int age = UserInfoManager.get().getBirthday().getAge();
        int[] iArrC = FitnessLevelHelper.c(gender, age >= 20 ? Math.min(age, 65) : 20);
        Log.d(a, "Fitness boundary:" + iArrC[0] + "--" + iArrC[1], new Object[0]);
        return iArrC;
    }

    public static int getFitnessLevelByVO2max(int i) {
        int gender = UserInfoManager.get().getGender();
        int age = UserInfoManager.get().getBirthday().getAge();
        if (age < 20) {
            age = 20;
        } else if (age > 65) {
            age = 65;
        }
        int iD = FitnessLevelHelper.d(gender, age, i);
        Log.d(a, "fitness level:" + iD + ",sex:" + gender + ",age:" + age + ",vo2maxValue:" + i, new Object[0]);
        return iD;
    }

    public static int[] getFitnessRange() {
        int gender = UserInfoManager.get().getGender();
        int age = UserInfoManager.get().getBirthday().getAge();
        int[] iArrE = FitnessLevelHelper.e(gender, age >= 20 ? Math.min(age, 65) : 20);
        Log.d(a, "Fitness range:" + Arrays.toString(iArrE), new Object[0]);
        return iArrE;
    }

    public static String getSuggestTextByCurrentLoad(Context context, int i, int i2, int i3, int i4) {
        if (i < 0) {
            return context.getResources().getString(R.string.watch_sports_load_suggest_status_no_record);
        }
        if (i <= i2) {
            return context.getResources().getString(R.string.watch_sports_load_suggest_status_less);
        }
        if (i <= i3) {
            return context.getResources().getString(R.string.watch_sports_load_suggest_status_good);
        }
        if (i < i4) {
            return context.getResources().getString(R.string.watch_sports_load_suggest_status_recovery);
        }
        return i > i4 ? context.getResources().getString(R.string.watch_sports_load_suggest_status_over) : "";
    }
}
