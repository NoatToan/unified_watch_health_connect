package com.xiaomi.fit.fitness.export.data.extentions;

import com.xiaomi.fit.fitness.export.data.annotation.BloodSugarAbnormalLevel;
import com.xiaomi.fit.fitness.export.data.annotation.BloodSugarLevel;
import com.xiaomi.fit.fitness.export.data.annotation.BloodSugarTrend;
import com.xiaomi.fit.fitness.export.data.item.BloodSugarItem;
import com.xiaomi.fit.fitness.export.utils.BloodSugarComputeUtil;
import com.xiaomi.fit.fitness.export.utils.BloodSugarTargetRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002\u001a\u0012\u0010\u0004\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002\u001a\u0012\u0010\u0005\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002\u001a\n\u0010\u0007\u001a\u00020\u0001*\u00020\u0002\u001a\u0016\u0010\b\u001a\u00020\t*\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007\u001a\u0016\u0010\f\u001a\u00020\t*\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007\u001a\u0016\u0010\r\u001a\u00020\t*\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u0007\u001a\b\u0010\u000f\u001a\u00020\u000bH\u0002¨\u0006\u0010"}, d2 = {"moreThan", "", "Lcom/xiaomi/fit/fitness/export/data/item/BloodSugarItem;", "item", "lessThan", "diff", "", "isAbnormal", "computeTargetLevel", "", "targetRange", "Lcom/xiaomi/fit/fitness/export/utils/BloodSugarTargetRange;", "getAbnormalLevel", "computeTrend", "lastItem", "getBloodSugarTargetRange", "fitness-data-export_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class BloodSugarItemExtKt {
    @BloodSugarLevel
    public static final int computeTargetLevel(@NotNull BloodSugarItem bloodSugarItem, @Nullable BloodSugarTargetRange bloodSugarTargetRange) {
        Intrinsics.checkNotNullParameter(bloodSugarItem, "<this>");
        if (bloodSugarTargetRange == null) {
            bloodSugarTargetRange = getBloodSugarTargetRange();
        }
        float fBloodSugar = bloodSugarItem.bloodSugar();
        if (fBloodSugar >= bloodSugarTargetRange.getLowValue() && fBloodSugar <= bloodSugarTargetRange.getHighValue()) {
            return 1;
        }
        if (fBloodSugar < bloodSugarTargetRange.getLowValue()) {
            return fBloodSugar < 3.0f ? 5 : 3;
        }
        return fBloodSugar > 13.9f ? 4 : 2;
    }

    @BloodSugarTrend
    public static final int computeTrend(@NotNull BloodSugarItem bloodSugarItem, @Nullable BloodSugarItem bloodSugarItem2) {
        Intrinsics.checkNotNullParameter(bloodSugarItem, "<this>");
        if (bloodSugarItem2 == null) {
            return 0;
        }
        double dBloodSugar = bloodSugarItem.bloodSugar() - bloodSugarItem2.bloodSugar();
        if (dBloodSugar > 0.11d) {
            return 1;
        }
        if (dBloodSugar >= 0.06d) {
            return 2;
        }
        if (dBloodSugar > -0.06d) {
            return 3;
        }
        return dBloodSugar >= -0.11d ? 4 : 5;
    }

    public static final float diff(@NotNull BloodSugarItem bloodSugarItem, @NotNull BloodSugarItem item) {
        Intrinsics.checkNotNullParameter(bloodSugarItem, "<this>");
        Intrinsics.checkNotNullParameter(item, "item");
        return bloodSugarItem.bloodSugar() - item.bloodSugar();
    }

    @BloodSugarAbnormalLevel
    public static final int getAbnormalLevel(@NotNull BloodSugarItem bloodSugarItem, @NotNull BloodSugarTargetRange targetRange) {
        Intrinsics.checkNotNullParameter(bloodSugarItem, "<this>");
        Intrinsics.checkNotNullParameter(targetRange, "targetRange");
        float fBloodSugar = bloodSugarItem.bloodSugar();
        if (isAbnormal(bloodSugarItem)) {
            return 4;
        }
        if (fBloodSugar < targetRange.getLowValue()) {
            return 3;
        }
        return fBloodSugar > targetRange.getHighValue() ? 2 : 1;
    }

    public static /* synthetic */ int getAbnormalLevel$default(BloodSugarItem bloodSugarItem, BloodSugarTargetRange bloodSugarTargetRange, int i, Object obj) {
        if ((i & 1) != 0) {
            bloodSugarTargetRange = getBloodSugarTargetRange();
        }
        return getAbnormalLevel(bloodSugarItem, bloodSugarTargetRange);
    }

    private static final BloodSugarTargetRange getBloodSugarTargetRange() {
        return BloodSugarComputeUtil.INSTANCE.getBloodSugarTargetRange();
    }

    public static final boolean isAbnormal(@NotNull BloodSugarItem bloodSugarItem) {
        Intrinsics.checkNotNullParameter(bloodSugarItem, "<this>");
        float fBloodSugar = bloodSugarItem.bloodSugar();
        return fBloodSugar <= 2.0f || fBloodSugar >= 25.0f;
    }

    public static final boolean lessThan(@NotNull BloodSugarItem bloodSugarItem, @NotNull BloodSugarItem item) {
        Intrinsics.checkNotNullParameter(bloodSugarItem, "<this>");
        Intrinsics.checkNotNullParameter(item, "item");
        return bloodSugarItem.bloodSugar() < item.bloodSugar();
    }

    public static final boolean moreThan(@NotNull BloodSugarItem bloodSugarItem, @NotNull BloodSugarItem item) {
        Intrinsics.checkNotNullParameter(bloodSugarItem, "<this>");
        Intrinsics.checkNotNullParameter(item, "item");
        return bloodSugarItem.bloodSugar() > item.bloodSugar();
    }
}
