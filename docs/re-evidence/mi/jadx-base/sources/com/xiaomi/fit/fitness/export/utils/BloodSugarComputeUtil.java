package com.xiaomi.fit.fitness.export.utils;

import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt__MathJVMKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0004\u001a\u00020\u00052\u0017\u0010\u0006\u001a\u0013\u0012\t\u0012\u00070\b¢\u0006\u0002\b\t\u0012\u0004\u0012\u00020\b0\u0007J\u0006\u0010\n\u001a\u00020\u000b¨\u0006\f"}, d2 = {"Lcom/xiaomi/fit/fitness/export/utils/BloodSugarComputeUtil;", "", "<init>", "()V", "computeLevelDistPercent", "Lcom/xiaomi/fit/fitness/export/utils/DailyBloodSugarDistribute;", "levelMap", "", "", "Lcom/xiaomi/fit/fitness/export/data/annotation/BloodSugarLevel;", "getBloodSugarTargetRange", "Lcom/xiaomi/fit/fitness/export/utils/BloodSugarTargetRange;", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBloodSugarComputeUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BloodSugarComputeUtil.kt\ncom/xiaomi/fit/fitness/export/utils/BloodSugarComputeUtil\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,58:1\n216#2,2:59\n216#2,2:61\n*S KotlinDebug\n*F\n+ 1 BloodSugarComputeUtil.kt\ncom/xiaomi/fit/fitness/export/utils/BloodSugarComputeUtil\n*L\n12#1:59,2\n19#1:61,2\n*E\n"})
public final class BloodSugarComputeUtil {

    @NotNull
    public static final BloodSugarComputeUtil INSTANCE = new BloodSugarComputeUtil();

    private BloodSugarComputeUtil() {
    }

    @NotNull
    public final DailyBloodSugarDistribute computeLevelDistPercent(@NotNull Map<Integer, Integer> levelMap) {
        Intrinsics.checkNotNullParameter(levelMap, "levelMap");
        Iterator<Map.Entry<Integer, Integer>> it = levelMap.entrySet().iterator();
        int i = 0;
        int iIntValue = 0;
        while (it.hasNext()) {
            iIntValue += it.next().getValue().intValue();
        }
        int size = levelMap.size();
        DailyBloodSugarDistribute dailyBloodSugarDistribute = new DailyBloodSugarDistribute(0, 0, 0, 0, 0, 31, null);
        int i2 = 0;
        for (Map.Entry<Integer, Integer> entry : levelMap.entrySet()) {
            i++;
            int iRoundToInt = i == size ? 100 - i2 : MathKt__MathJVMKt.roundToInt((entry.getValue().intValue() * 100) / (iIntValue * 1.0f));
            i2 += iRoundToInt;
            int iIntValue2 = entry.getKey().intValue();
            if (iIntValue2 == 1) {
                dailyBloodSugarDistribute.setNormalPercent(iRoundToInt);
            } else if (iIntValue2 == 2) {
                dailyBloodSugarDistribute.setHighPercent(iRoundToInt);
            } else if (iIntValue2 == 3) {
                dailyBloodSugarDistribute.setLowPercent(iRoundToInt);
            } else if (iIntValue2 == 4) {
                dailyBloodSugarDistribute.setExtraHighPercent(iRoundToInt);
            } else if (iIntValue2 == 5) {
                dailyBloodSugarDistribute.setExtraLowPercent(iRoundToInt);
            }
        }
        return dailyBloodSugarDistribute;
    }

    @NotNull
    public final BloodSugarTargetRange getBloodSugarTargetRange() {
        return new BloodSugarTargetRange(3.9f, 10.0f);
    }
}
