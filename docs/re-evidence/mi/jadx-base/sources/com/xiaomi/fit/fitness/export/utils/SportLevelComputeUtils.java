package com.xiaomi.fit.fitness.export.utils;

import com.xiaomi.fit.fitness.export.data.item.TrainingLoadItem;
import com.xiaomi.fitness.common.log.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\f\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nJ1\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0010J\u001e\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0005J\u0018\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0005H\u0002J\u0018\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0005H\u0002J@\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u0005H\u0002¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/fit/fitness/export/utils/SportLevelComputeUtils;", "", "<init>", "()V", "computeRunningAbilityIndexLevel", "", "value", "", "getTrainingLoadLevel", "item", "Lcom/xiaomi/fit/fitness/export/data/item/TrainingLoadItem;", "computeTrainingLoadLevel", "wtlSum", "wtlSumOptimalMin", "wtlSumOptimalMax", "wtlSumOverreaching", "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)I", "computeVo2MaxLevel", "isFemale", "", "age", "vo2Max", "getFemaleLevel", "getMaleLevel", "getLevelInner", "outstanding", "excellent", "good", "normal", "fair", "poor", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SportLevelComputeUtils {

    @NotNull
    public static final SportLevelComputeUtils INSTANCE = new SportLevelComputeUtils();

    private SportLevelComputeUtils() {
    }

    private final int getFemaleLevel(int value, int age) {
        if (age >= 60) {
            return getLevelInner(value, 30, 27, 24, 21, 18, 16);
        }
        if (age >= 55) {
            return getLevelInner(value, 33, 30, 27, 23, 20, 18);
        }
        if (age >= 50) {
            return getLevelInner(value, 36, 32, 29, 25, 22, 19);
        }
        if (age >= 45) {
            return getLevelInner(value, 38, 35, 31, 27, 23, 21);
        }
        if (age >= 40) {
            return getLevelInner(value, 41, 37, 33, 29, 25, 22);
        }
        if (age >= 35) {
            return getLevelInner(value, 44, 40, 35, 31, 27, 24);
        }
        if (age >= 30) {
            return getLevelInner(value, 46, 42, 37, 33, 29, 25);
        }
        return age >= 25 ? getLevelInner(value, 49, 44, 40, 35, 30, 26) : getLevelInner(value, 51, 46, 41, 36, 31, 27);
    }

    private final int getLevelInner(int value, int outstanding, int excellent, int good, int normal, int fair, int poor) {
        if (value > outstanding) {
            return 7;
        }
        if (value > excellent) {
            return 6;
        }
        if (value > good) {
            return 5;
        }
        if (value > normal) {
            return 4;
        }
        if (value > fair) {
            return 3;
        }
        return value > poor ? 2 : 1;
    }

    private final int getMaleLevel(int value, int age) {
        if (age >= 60) {
            return getLevelInner(value, 40, 36, 32, 28, 24, 21);
        }
        if (age >= 55) {
            return getLevelInner(value, 43, 39, 34, 30, 26, 22);
        }
        if (age >= 50) {
            return getLevelInner(value, 46, 41, 36, 32, 27, 24);
        }
        if (age >= 45) {
            return getLevelInner(value, 48, 43, 39, 34, 29, 25);
        }
        if (age >= 40) {
            return getLevelInner(value, 51, 46, 41, 35, 31, 26);
        }
        if (age >= 35) {
            return getLevelInner(value, 54, 48, 43, 38, 32, 28);
        }
        if (age >= 30) {
            return getLevelInner(value, 56, 51, 45, 40, 34, 29);
        }
        return age >= 25 ? getLevelInner(value, 59, 53, 48, 42, 35, 31) : getLevelInner(value, 62, 56, 50, 43, 37, 32);
    }

    public final int computeRunningAbilityIndexLevel(float value) {
        if (value < 20.0f) {
            return 1;
        }
        if (value < 30.0f) {
            return 2;
        }
        if (value < 40.0f) {
            return 3;
        }
        return value < 65.0f ? 4 : 5;
    }

    public final int computeTrainingLoadLevel(int wtlSum, @Nullable Integer wtlSumOptimalMin, @Nullable Integer wtlSumOptimalMax, @Nullable Integer wtlSumOverreaching) {
        if (wtlSum <= 0 || wtlSumOverreaching == null || wtlSumOptimalMax == null || wtlSumOptimalMin == null) {
            return 0;
        }
        if (1 <= wtlSum && wtlSum <= wtlSumOptimalMin.intValue()) {
            return 1;
        }
        int iIntValue = wtlSumOptimalMin.intValue() + 1;
        if (wtlSum > wtlSumOptimalMax.intValue() || iIntValue > wtlSum) {
            return (wtlSum > wtlSumOverreaching.intValue() || wtlSumOptimalMax.intValue() + 1 > wtlSum) ? 4 : 3;
        }
        return 2;
    }

    public final int computeVo2MaxLevel(boolean isFemale, int age, int vo2Max) {
        if (vo2Max <= 0) {
            return 0;
        }
        Logger.i("computeVo2MaxLevel", "age=" + age + ", isFemale= " + isFemale);
        return isFemale ? getFemaleLevel(vo2Max, age) : getMaleLevel(vo2Max, age);
    }

    public final int getTrainingLoadLevel(@NotNull TrainingLoadItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        Integer tlLevel = item.getTlLevel();
        return tlLevel != null ? tlLevel.intValue() : computeTrainingLoadLevel(item.getWtlSum(), item.getWtlSumOptimalMin(), item.getWtlSumOptimalMax(), item.getWtlSumOverreaching());
    }
}
