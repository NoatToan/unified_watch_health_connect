package defpackage;

import com.xiaomi.fit.data.common.log.FitnessLogUtils;

/* JADX INFO: loaded from: classes9.dex */
public final class bh8 {
    public static int a(String str) {
        str.hashCode();
        switch (str) {
            case "RUNNING":
                return 2;
            case "RIDING":
                return 1;
            case "STAIR_CLIMBING":
                return 4;
            case "WALKING":
                return 3;
            default:
                FitnessLogUtils.e("ExerciseType", "convertToNewTypeAuto error : " + str);
                return 0;
        }
    }

    public static int b(String str) {
        str.hashCode();
        switch (str) {
            case "RUNNING":
            case "OUTDOOR_RUNNING":
                return 1;
            case "RIDING":
            case "OUTDOOR_RIDING":
                return 6;
            case "STAIR_CLIMBING":
                return 301;
            case "TREADMILL":
                break;
            case "FREE_TRAINING":
            case "COURSE":
                return 8;
            case "SWIMMING":
                return 9;
            case "WALKING":
                return 2;
            default:
                FitnessLogUtils.e("ExerciseType", "convertToNewTypeManual error : " + str);
                break;
        }
        return 0;
    }
}
