package com.xiaomi.hm.health.training.utils;

import com.xiaomi.hm.health.traininglib.model.TrainerInfo;

/* JADX INFO: loaded from: classes22.dex */
public class HeartRateIntervalUtils {
    public static final int ANAEROBIC_LIMIT_HR = 5;
    public static int ANAEROBIC_LIMIT_HR_THRESHOLD = 0;
    public static final int FAT_BURN_HR = 2;
    public static int FAT_BURN_HR_THRESHOLD = 0;
    public static final int LUNG_STRENGTH_HR = 3;
    public static int LUNG_STRENGTH_HR_THRESHOLD = 0;
    public static int MAX_HR_THRESHOLD = 0;
    public static final int MAX_HR_VALUE = 221;
    public static final int MIN_HR_VALUE = 39;
    public static final int REST_HR = 0;
    public static final int STAMINA_STRENGTH_HR = 4;
    public static int STAMINA_STRENGTH_HR_THRESHOLD = 0;
    public static final int WARM_UP_HR = 1;
    public static int WARM_UP_HR_THRESHOLD;

    static {
        int i = 220 - TrainerInfo.get().age;
        MAX_HR_THRESHOLD = i;
        ANAEROBIC_LIMIT_HR_THRESHOLD = (int) (((double) i) * 0.9d);
        STAMINA_STRENGTH_HR_THRESHOLD = (int) (((double) i) * 0.8d);
        LUNG_STRENGTH_HR_THRESHOLD = (int) (((double) i) * 0.7d);
        FAT_BURN_HR_THRESHOLD = (int) (((double) i) * 0.6d);
        WARM_UP_HR_THRESHOLD = (int) (((double) i) * 0.5d);
        System.out.println("MAX_HR_THRESHOLD" + MAX_HR_THRESHOLD);
        System.out.println("WARM_UP_HR_THRESHOLD" + WARM_UP_HR_THRESHOLD);
        System.out.println("FAT_BURN_HR_THRESHOLD" + FAT_BURN_HR_THRESHOLD);
        System.out.println("LUNG_STRENGTH_HR_THRESHOLD" + LUNG_STRENGTH_HR_THRESHOLD);
        System.out.println("STAMINA_STRENGTH_HR_THRESHOLD" + STAMINA_STRENGTH_HR_THRESHOLD);
        System.out.println("ANAEROBIC_LIMIT_HR_THRESHOLD" + ANAEROBIC_LIMIT_HR_THRESHOLD);
    }

    public static int getHrInterval(int i) {
        int i2 = WARM_UP_HR_THRESHOLD;
        if (i <= i2) {
            return 0;
        }
        if (i > i2 && i <= FAT_BURN_HR_THRESHOLD) {
            return 1;
        }
        if (i > FAT_BURN_HR_THRESHOLD && i <= LUNG_STRENGTH_HR_THRESHOLD) {
            return 2;
        }
        if (i <= LUNG_STRENGTH_HR_THRESHOLD || i > STAMINA_STRENGTH_HR_THRESHOLD) {
            return (i <= STAMINA_STRENGTH_HR_THRESHOLD || i > ANAEROBIC_LIMIT_HR_THRESHOLD) ? 5 : 4;
        }
        return 3;
    }

    public static boolean isHRValueValid(int i) {
        return i < 221 && i > 39;
    }
}
